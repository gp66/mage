package mage.cards.c;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.SacrificeSourceUnlessPaysEffect;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.Game;
import mage.game.permanent.Permanent;

/**
 *
 * @author LevelX2
 */
public final class Conversion extends CardImpl {

    public Conversion(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{W}{W}");

        // At the beginning of your upkeep, sacrifice Conversion unless you pay {W}{W}.
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(
                new SacrificeSourceUnlessPaysEffect(
                        new ManaCostsImpl("{W}{W}")),
                TargetController.YOU,
                false));

        // All Mountains are Plains.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new ConversionEffect()));

    }

    public Conversion(final Conversion card) {
        super(card);
    }

    @Override
    public Conversion copy() {
        return new Conversion(this);
    }

    static class ConversionEffect extends ContinuousEffectImpl {

        ConversionEffect() {
            super(Duration.WhileOnBattlefield, Outcome.Detriment);
            this.staticText = "All Mountains are Plains";
        }

        ConversionEffect(final ConversionEffect effect) {
            super(effect);
        }

        @Override
        public boolean apply(Game game, Ability source) {
            return false;
        }

        @Override
        public ConversionEffect copy() {
            return new ConversionEffect(this);
        }

        @Override
        public boolean apply(Layer layer, SubLayer sublayer, Ability source, Game game) {
            for (Permanent land : game.getBattlefield().getAllActivePermanents(CardType.LAND)) {
                switch (layer) {
                    case TypeChangingEffects_4:
                        if (land.getSubtype(game).contains(SubType.MOUNTAIN)) {
                            land.getSubtype(game).removeAll(SubType.getLandTypes());
                            land.addSubType(game, SubType.PLAINS);
                            land.removeAllAbilities(source.getSourceId(), game);
                            land.addAbility(new WhiteManaAbility(), source.getSourceId(), game);
                            break;
                        }
                }
            }
            return true;
        }

        @Override
        public boolean hasLayer(Layer layer) {
            return layer == Layer.TypeChangingEffects_4;
        }

        @Override
        public Set<UUID> isDependentTo(List<ContinuousEffect> allEffectsInLayer) {
            return allEffectsInLayer
                    .stream()
                    .filter(effect -> effect.getDependencyTypes().contains(DependencyType.BecomeMountain))
                    .map(Effect::getId)
                    .collect(Collectors.toSet());
        }
    }
}
