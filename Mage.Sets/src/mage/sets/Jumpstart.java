package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class Jumpstart extends ExpansionSet {

    private static final Jumpstart instance = new Jumpstart();

    public static Jumpstart getInstance() {
        return instance;
    }

    private Jumpstart() {
        super("Jumpstart", "JMP", ExpansionSet.buildDate(2020, 7, 17), SetType.SUPPLEMENTAL);
        this.blockName = "Jumpstart";
        this.hasBasicLands = true;

        cards.add(new SetCardInfo("Aether Spellbomb", 456, Rarity.COMMON, mage.cards.a.AetherSpellbomb.class));
        cards.add(new SetCardInfo("Affa Guard Hound", 81, Rarity.UNCOMMON, mage.cards.a.AffaGuardHound.class));
        cards.add(new SetCardInfo("Affectionate Indrik", 373, Rarity.UNCOMMON, mage.cards.a.AffectionateIndrik.class));
        cards.add(new SetCardInfo("Aggressive Urge", 374, Rarity.COMMON, mage.cards.a.AggressiveUrge.class));
        cards.add(new SetCardInfo("Agonizing Syphon", 199, Rarity.COMMON, mage.cards.a.AgonizingSyphon.class));
        cards.add(new SetCardInfo("Alloy Myr", 457, Rarity.COMMON, mage.cards.a.AlloyMyr.class));
        cards.add(new SetCardInfo("Ambassador Oak", 375, Rarity.COMMON, mage.cards.a.AmbassadorOak.class));
        cards.add(new SetCardInfo("Ancestral Statue", 458, Rarity.COMMON, mage.cards.a.AncestralStatue.class));
        cards.add(new SetCardInfo("Arcane Encyclopedia", 459, Rarity.UNCOMMON, mage.cards.a.ArcaneEncyclopedia.class));
        cards.add(new SetCardInfo("Ashmouth Hound", 290, Rarity.COMMON, mage.cards.a.AshmouthHound.class));
        cards.add(new SetCardInfo("Assassin's Strike", 200, Rarity.UNCOMMON, mage.cards.a.AssassinsStrike.class));
        cards.add(new SetCardInfo("Assault Formation", 378, Rarity.RARE, mage.cards.a.AssaultFormation.class));
        cards.add(new SetCardInfo("Auger Spree", 449, Rarity.COMMON, mage.cards.a.AugerSpree.class));
        cards.add(new SetCardInfo("Awakener Druid", 379, Rarity.UNCOMMON, mage.cards.a.AwakenerDruid.class));
        cards.add(new SetCardInfo("Bake into a Pie", 201, Rarity.COMMON, mage.cards.b.BakeIntoAPie.class));
        cards.add(new SetCardInfo("Befuddle", 140, Rarity.COMMON, mage.cards.b.Befuddle.class));
        cards.add(new SetCardInfo("Black Cat", 203, Rarity.COMMON, mage.cards.b.BlackCat.class));
        cards.add(new SetCardInfo("Blighted Bat", 205, Rarity.COMMON, mage.cards.b.BlightedBat.class));
        cards.add(new SetCardInfo("Blood Artist", 206, Rarity.UNCOMMON, mage.cards.b.BloodArtist.class));
        cards.add(new SetCardInfo("Blood Divination", 207, Rarity.UNCOMMON, mage.cards.b.BloodDivination.class));
        cards.add(new SetCardInfo("Blood Host", 208, Rarity.UNCOMMON, mage.cards.b.BloodHost.class));
        cards.add(new SetCardInfo("Bloodbond Vampire", 209, Rarity.UNCOMMON, mage.cards.b.BloodbondVampire.class));
        cards.add(new SetCardInfo("Bloodhunter Bat", 210, Rarity.COMMON, mage.cards.b.BloodhunterBat.class));
        cards.add(new SetCardInfo("Bloodrock Cyclops", 297, Rarity.COMMON, mage.cards.b.BloodrockCyclops.class));
        cards.add(new SetCardInfo("Bogbrew Witch", 211, Rarity.RARE, mage.cards.b.BogbrewWitch.class));
        cards.add(new SetCardInfo("Bone Picker", 212, Rarity.UNCOMMON, mage.cards.b.BonePicker.class));
        cards.add(new SetCardInfo("Bone Splinters", 213, Rarity.COMMON, mage.cards.b.BoneSplinters.class));
        cards.add(new SetCardInfo("Brindle Shoat", 380, Rarity.UNCOMMON, mage.cards.b.BrindleShoat.class));
        cards.add(new SetCardInfo("Brushstrider", 381, Rarity.UNCOMMON, mage.cards.b.Brushstrider.class));
        cards.add(new SetCardInfo("Bubbling Cauldron", 460, Rarity.UNCOMMON, mage.cards.b.BubblingCauldron.class));
        cards.add(new SetCardInfo("Burglar Rat", 214, Rarity.COMMON, mage.cards.b.BurglarRat.class));
        cards.add(new SetCardInfo("Buried Ruin", 491, Rarity.UNCOMMON, mage.cards.b.BuriedRuin.class));
        cards.add(new SetCardInfo("Cadaver Imp", 215, Rarity.COMMON, mage.cards.c.CadaverImp.class));
        cards.add(new SetCardInfo("Carven Caryatid", 382, Rarity.UNCOMMON, mage.cards.c.CarvenCaryatid.class));
        cards.add(new SetCardInfo("Cathar's Companion", 94, Rarity.COMMON, mage.cards.c.CatharsCompanion.class));
        cards.add(new SetCardInfo("Cauldron Familiar", 216, Rarity.COMMON, mage.cards.c.CauldronFamiliar.class));
        cards.add(new SetCardInfo("Cemetery Recruitment", 217, Rarity.COMMON, mage.cards.c.CemeteryRecruitment.class));
        cards.add(new SetCardInfo("Chamber Sentry", 461, Rarity.RARE, mage.cards.c.ChamberSentry.class));
        cards.add(new SetCardInfo("Child of Night", 218, Rarity.COMMON, mage.cards.c.ChildOfNight.class));
        cards.add(new SetCardInfo("Chromatic Sphere", 462, Rarity.COMMON, mage.cards.c.ChromaticSphere.class));
        cards.add(new SetCardInfo("Cinder Elemental", 304, Rarity.UNCOMMON, mage.cards.c.CinderElemental.class));
        cards.add(new SetCardInfo("Cloudreader Sphinx", 143, Rarity.COMMON, mage.cards.c.CloudreaderSphinx.class));
        cards.add(new SetCardInfo("Commune with Dinosaurs", 384, Rarity.COMMON, mage.cards.c.CommuneWithDinosaurs.class));
        cards.add(new SetCardInfo("Craterhoof Behemoth", 385, Rarity.MYTHIC, mage.cards.c.CraterhoofBehemoth.class));
        cards.add(new SetCardInfo("Crookclaw Transmuter", 145, Rarity.COMMON, mage.cards.c.CrookclawTransmuter.class));
        cards.add(new SetCardInfo("Crow of Dark Tidings", 221, Rarity.COMMON, mage.cards.c.CrowOfDarkTidings.class));
        cards.add(new SetCardInfo("Crushing Canopy", 386, Rarity.COMMON, mage.cards.c.CrushingCanopy.class));
        cards.add(new SetCardInfo("Curiosity", 147, Rarity.UNCOMMON, mage.cards.c.Curiosity.class));
        cards.add(new SetCardInfo("Dawntreader Elk", 387, Rarity.COMMON, mage.cards.d.DawntreaderElk.class));
        cards.add(new SetCardInfo("Death's Approach", 222, Rarity.COMMON, mage.cards.d.DeathsApproach.class));
        cards.add(new SetCardInfo("Dinrova Horror", 450, Rarity.UNCOMMON, mage.cards.d.DinrovaHorror.class));
        cards.add(new SetCardInfo("Drainpipe Vermin", 224, Rarity.COMMON, mage.cards.d.DrainpipeVermin.class));
        cards.add(new SetCardInfo("Drana, Liberator of Malakir", 225, Rarity.MYTHIC, mage.cards.d.DranaLiberatorOfMalakir.class));
        cards.add(new SetCardInfo("Dreamstone Hedron", 464, Rarity.UNCOMMON, mage.cards.d.DreamstoneHedron.class));
        cards.add(new SetCardInfo("Drover of the Mighty", 388, Rarity.UNCOMMON, mage.cards.d.DroverOfTheMighty.class));
        cards.add(new SetCardInfo("Dutiful Attendant", 226, Rarity.COMMON, mage.cards.d.DutifulAttendant.class));
        cards.add(new SetCardInfo("Dwynen's Elite", 389, Rarity.UNCOMMON, mage.cards.d.DwynensElite.class));
        cards.add(new SetCardInfo("Elemental Uprising", 390, Rarity.COMMON, mage.cards.e.ElementalUprising.class));
        cards.add(new SetCardInfo("Elvish Archdruid", 391, Rarity.RARE, mage.cards.e.ElvishArchdruid.class));
        cards.add(new SetCardInfo("Enlarge", 392, Rarity.UNCOMMON, mage.cards.e.Enlarge.class));
        cards.add(new SetCardInfo("Entomber Exarch", 227, Rarity.UNCOMMON, mage.cards.e.EntomberExarch.class));
        cards.add(new SetCardInfo("Erratic Visionary", 150, Rarity.COMMON, mage.cards.e.ErraticVisionary.class));
        cards.add(new SetCardInfo("Eternal Taskmaster", 228, Rarity.UNCOMMON, mage.cards.e.EternalTaskmaster.class));
        cards.add(new SetCardInfo("Eternal Thirst", 229, Rarity.COMMON, mage.cards.e.EternalThirst.class));
        cards.add(new SetCardInfo("Exclude", 152, Rarity.UNCOMMON, mage.cards.e.Exclude.class));
        cards.add(new SetCardInfo("Exclusion Mage", 153, Rarity.UNCOMMON, mage.cards.e.ExclusionMage.class));
        cards.add(new SetCardInfo("Exhume", 230, Rarity.COMMON, mage.cards.e.Exhume.class));
        cards.add(new SetCardInfo("Explore", 393, Rarity.COMMON, mage.cards.e.Explore.class));
        cards.add(new SetCardInfo("Exquisite Blood", 231, Rarity.RARE, mage.cards.e.ExquisiteBlood.class));
        cards.add(new SetCardInfo("Fa'adiyah Seer", 394, Rarity.COMMON, mage.cards.f.FaadiyahSeer.class));
        cards.add(new SetCardInfo("Falkenrath Noble", 232, Rarity.UNCOMMON, mage.cards.f.FalkenrathNoble.class));
        cards.add(new SetCardInfo("Fanatical Firebrand", 315, Rarity.COMMON, mage.cards.f.FanaticalFirebrand.class));
        cards.add(new SetCardInfo("Fell Specter", 233, Rarity.UNCOMMON, mage.cards.f.FellSpecter.class));
        cards.add(new SetCardInfo("Feral Hydra", 395, Rarity.UNCOMMON, mage.cards.f.FeralHydra.class));
        cards.add(new SetCardInfo("Fertilid", 398, Rarity.COMMON, mage.cards.f.Fertilid.class));
        cards.add(new SetCardInfo("Festering Newt", 234, Rarity.COMMON, mage.cards.f.FesteringNewt.class));
        cards.add(new SetCardInfo("Flames of the Firebrand", 317, Rarity.UNCOMMON, mage.cards.f.FlamesOfTheFirebrand.class));
        cards.add(new SetCardInfo("Forest", 70, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Funeral Rites", 235, Rarity.COMMON, mage.cards.f.FuneralRites.class));
        cards.add(new SetCardInfo("Fusion Elemental", 451, Rarity.UNCOMMON, mage.cards.f.FusionElemental.class));
        cards.add(new SetCardInfo("Gargoyle Sentinel", 465, Rarity.UNCOMMON, mage.cards.g.GargoyleSentinel.class));
        cards.add(new SetCardInfo("Ghalta, Primal Hunger", 399, Rarity.RARE, mage.cards.g.GhaltaPrimalHunger.class));
        cards.add(new SetCardInfo("Ghirapur Guide", 400, Rarity.UNCOMMON, mage.cards.g.GhirapurGuide.class));
        cards.add(new SetCardInfo("Ghoulcaller Gisa", 236, Rarity.MYTHIC, mage.cards.g.GhoulcallerGisa.class));
        cards.add(new SetCardInfo("Ghoulcaller's Accomplice", 237, Rarity.COMMON, mage.cards.g.GhoulcallersAccomplice.class));
        cards.add(new SetCardInfo("Ghoulraiser", 238, Rarity.COMMON, mage.cards.g.Ghoulraiser.class));
        cards.add(new SetCardInfo("Gingerbrute", 466, Rarity.COMMON, mage.cards.g.Gingerbrute.class));
        cards.add(new SetCardInfo("Grave Bramble", 401, Rarity.COMMON, mage.cards.g.GraveBramble.class));
        cards.add(new SetCardInfo("Gravewaker", 241, Rarity.RARE, mage.cards.g.Gravewaker.class));
        cards.add(new SetCardInfo("Grim Lavamancer", 331, Rarity.RARE, mage.cards.g.GrimLavamancer.class));
        cards.add(new SetCardInfo("Hedron Archive", 468, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Hungry Flames", 336, Rarity.COMMON, mage.cards.h.HungryFlames.class));
        cards.add(new SetCardInfo("Hunter's Insight", 402, Rarity.UNCOMMON, mage.cards.h.HuntersInsight.class));
        cards.add(new SetCardInfo("Innocent Blood", 244, Rarity.COMMON, mage.cards.i.InnocentBlood.class));
        cards.add(new SetCardInfo("Ironroot Warlord", 452, Rarity.UNCOMMON, mage.cards.i.IronrootWarlord.class));
        cards.add(new SetCardInfo("Irresistible Prey", 406, Rarity.UNCOMMON, mage.cards.i.IrresistiblePrey.class));
        cards.add(new SetCardInfo("Isamaru, Hound of Konda", 113, Rarity.RARE, mage.cards.i.IsamaruHoundOfKonda.class));
        cards.add(new SetCardInfo("Island", 49, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jousting Dummy", 470, Rarity.COMMON, mage.cards.j.JoustingDummy.class));
        cards.add(new SetCardInfo("Juggernaut", 471, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Kalastria Nightwatch", 245, Rarity.COMMON, mage.cards.k.KalastriaNightwatch.class));
        cards.add(new SetCardInfo("Kels, Fight Fixer", 15, Rarity.RARE, mage.cards.k.KelsFightFixer.class));
        cards.add(new SetCardInfo("Knight of the Tusk", 114, Rarity.COMMON, mage.cards.k.KnightOfTheTusk.class));
        cards.add(new SetCardInfo("Last Gasp", 247, Rarity.COMMON, mage.cards.l.LastGasp.class));
        cards.add(new SetCardInfo("Lawmage's Binding", 453, Rarity.COMMON, mage.cards.l.LawmagesBinding.class));
        cards.add(new SetCardInfo("Leaf Gilder", 408, Rarity.COMMON, mage.cards.l.LeafGilder.class));
        cards.add(new SetCardInfo("Leave in the Dust", 156, Rarity.COMMON, mage.cards.l.LeaveInTheDust.class));
        cards.add(new SetCardInfo("Lightning Visionary", 22, Rarity.COMMON, mage.cards.l.LightningVisionary.class));
        cards.add(new SetCardInfo("Lightning-Core Excavator", 32, Rarity.COMMON, mage.cards.l.LightningCoreExcavator.class));
        cards.add(new SetCardInfo("Liliana's Elite", 250, Rarity.UNCOMMON, mage.cards.l.LilianasElite.class));
        cards.add(new SetCardInfo("Living Lightning", 23, Rarity.UNCOMMON, mage.cards.l.LivingLightning.class));
        cards.add(new SetCardInfo("Lurking Predators", 410, Rarity.RARE, mage.cards.l.LurkingPredators.class));
        cards.add(new SetCardInfo("Macabre Waltz", 252, Rarity.COMMON, mage.cards.m.MacabreWaltz.class));
        cards.add(new SetCardInfo("Maelstrom Archangel", 454, Rarity.MYTHIC, mage.cards.m.MaelstromArchangel.class));
        cards.add(new SetCardInfo("Magma Jet", 346, Rarity.UNCOMMON, mage.cards.m.MagmaJet.class));
        cards.add(new SetCardInfo("Magmaquake", 347, Rarity.RARE, mage.cards.m.Magmaquake.class));
        cards.add(new SetCardInfo("Malakir Familiar", 253, Rarity.UNCOMMON, mage.cards.m.MalakirFamiliar.class));
        cards.add(new SetCardInfo("Marauder's Axe", 473, Rarity.COMMON, mage.cards.m.MaraudersAxe.class));
        cards.add(new SetCardInfo("Mark of the Vampire", 254, Rarity.COMMON, mage.cards.m.MarkOfTheVampire.class));
        cards.add(new SetCardInfo("Meteor Golem", 474, Rarity.UNCOMMON, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Miasmic Mummy", 256, Rarity.COMMON, mage.cards.m.MiasmicMummy.class));
        cards.add(new SetCardInfo("Mire Triton", 257, Rarity.UNCOMMON, mage.cards.m.MireTriton.class));
        cards.add(new SetCardInfo("Mirrodin's Core", 492, Rarity.UNCOMMON, mage.cards.m.MirrodinsCore.class));
        cards.add(new SetCardInfo("Molten Ravager", 351, Rarity.COMMON, mage.cards.m.MoltenRavager.class));
        cards.add(new SetCardInfo("Momentous Fall", 411, Rarity.RARE, mage.cards.m.MomentousFall.class));
        cards.add(new SetCardInfo("Mountain", 64, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Narcolepsy", 159, Rarity.COMMON, mage.cards.n.Narcolepsy.class));
        cards.add(new SetCardInfo("Nature's Way", 412, Rarity.UNCOMMON, mage.cards.n.NaturesWay.class));
        cards.add(new SetCardInfo("New Horizons", 414, Rarity.COMMON, mage.cards.n.NewHorizons.class));
        cards.add(new SetCardInfo("Nocturnal Feeder", 16, Rarity.COMMON, mage.cards.n.NocturnalFeeder.class));
        cards.add(new SetCardInfo("Nyxathid", 259, Rarity.RARE, mage.cards.n.Nyxathid.class));
        cards.add(new SetCardInfo("Oneirophage", 162, Rarity.UNCOMMON, mage.cards.o.Oneirophage.class));
        cards.add(new SetCardInfo("Oracle of Mul Daya", 415, Rarity.RARE, mage.cards.o.OracleOfMulDaya.class));
        cards.add(new SetCardInfo("Orazca Frillback", 416, Rarity.COMMON, mage.cards.o.OrazcaFrillback.class));
        cards.add(new SetCardInfo("Overgrown Battlement", 417, Rarity.UNCOMMON, mage.cards.o.OvergrownBattlement.class));
        cards.add(new SetCardInfo("Pacifism", 125, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Peel from Reality", 163, Rarity.COMMON, mage.cards.p.PeelFromReality.class));
        cards.add(new SetCardInfo("Penumbra Bobcat", 418, Rarity.COMMON, mage.cards.p.PenumbraBobcat.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 266, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Phyrexian Tower", 493, Rarity.RARE, mage.cards.p.PhyrexianTower.class));
        cards.add(new SetCardInfo("Pillar of Flame", 355, Rarity.COMMON, mage.cards.p.PillarOfFlame.class));
        cards.add(new SetCardInfo("Plains", 41, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Prescient Chimera", 164, Rarity.COMMON, mage.cards.p.PrescientChimera.class));
        cards.add(new SetCardInfo("Presence of Gond", 420, Rarity.COMMON, mage.cards.p.PresenceOfGond.class));
        cards.add(new SetCardInfo("Primordial Sage", 422, Rarity.RARE, mage.cards.p.PrimordialSage.class));
        cards.add(new SetCardInfo("Prophetic Prism", 478, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Pyroclastic Elemental", 356, Rarity.UNCOMMON, mage.cards.p.PyroclasticElemental.class));
        cards.add(new SetCardInfo("Raging Regisaur", 455, Rarity.UNCOMMON, mage.cards.r.RagingRegisaur.class));
        cards.add(new SetCardInfo("Rampaging Brontodon", 423, Rarity.RARE, mage.cards.r.RampagingBrontodon.class));
        cards.add(new SetCardInfo("Ravenous Baloth", 424, Rarity.RARE, mage.cards.r.RavenousBaloth.class));
        cards.add(new SetCardInfo("Ravenous Chupacabra", 269, Rarity.UNCOMMON, mage.cards.r.RavenousChupacabra.class));
        cards.add(new SetCardInfo("Reanimate", 270, Rarity.RARE, mage.cards.r.Reanimate.class));
        cards.add(new SetCardInfo("Release the Dogs", 4, Rarity.UNCOMMON, mage.cards.r.ReleaseTheDogs.class));
        cards.add(new SetCardInfo("Rhystic Study", 169, Rarity.RARE, mage.cards.r.RhysticStudy.class));
        cards.add(new SetCardInfo("Riptide Laboratory", 494, Rarity.RARE, mage.cards.r.RiptideLaboratory.class));
        cards.add(new SetCardInfo("Rise of the Dark Realms", 271, Rarity.MYTHIC, mage.cards.r.RiseOfTheDarkRealms.class));
        cards.add(new SetCardInfo("Roving Keep", 480, Rarity.COMMON, mage.cards.r.RovingKeep.class));
        cards.add(new SetCardInfo("Rumbling Baloth", 426, Rarity.COMMON, mage.cards.r.RumblingBaloth.class));
        cards.add(new SetCardInfo("Runed Servitor", 481, Rarity.COMMON, mage.cards.r.RunedServitor.class));
        cards.add(new SetCardInfo("Rupture Spire", 495, Rarity.COMMON, mage.cards.r.RuptureSpire.class));
        cards.add(new SetCardInfo("Sage's Row Savant", 171, Rarity.COMMON, mage.cards.s.SagesRowSavant.class));
        cards.add(new SetCardInfo("Sangromancer", 272, Rarity.RARE, mage.cards.s.Sangromancer.class));
        cards.add(new SetCardInfo("Savage Stomp", 427, Rarity.UNCOMMON, mage.cards.s.SavageStomp.class));
        cards.add(new SetCardInfo("Scarecrone", 482, Rarity.RARE, mage.cards.s.Scarecrone.class));
        cards.add(new SetCardInfo("Scourge of Nel Toth", 274, Rarity.RARE, mage.cards.s.ScourgeOfNelToth.class));
        cards.add(new SetCardInfo("Scuttlemutt", 484, Rarity.UNCOMMON, mage.cards.s.Scuttlemutt.class));
        cards.add(new SetCardInfo("Sea Gate Oracle", 173, Rarity.COMMON, mage.cards.s.SeaGateOracle.class));
        cards.add(new SetCardInfo("Seismic Elemental", 362, Rarity.UNCOMMON, mage.cards.s.SeismicElemental.class));
        cards.add(new SetCardInfo("Selvala, Heart of the Wilds", 429, Rarity.MYTHIC, mage.cards.s.SelvalaHeartOfTheWilds.class));
        cards.add(new SetCardInfo("Sengir Vampire", 275, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Settle the Score", 276, Rarity.UNCOMMON, mage.cards.s.SettleTheScore.class));
        cards.add(new SetCardInfo("Shambling Goblin", 277, Rarity.COMMON, mage.cards.s.ShamblingGoblin.class));
        cards.add(new SetCardInfo("Sharding Sphinx", 176, Rarity.RARE, mage.cards.s.ShardingSphinx.class));
        cards.add(new SetCardInfo("Sheoldred, Whispering One", 278, Rarity.MYTHIC, mage.cards.s.SheoldredWhisperingOne.class));
        cards.add(new SetCardInfo("Signpost Scarecrow", 485, Rarity.COMMON, mage.cards.s.SignpostScarecrow.class));
        cards.add(new SetCardInfo("Silhana Wayfinder", 430, Rarity.UNCOMMON, mage.cards.s.SilhanaWayfinder.class));
        cards.add(new SetCardInfo("Skittering Surveyor", 486, Rarity.COMMON, mage.cards.s.SkitteringSurveyor.class));
        cards.add(new SetCardInfo("Somberwald Stag", 431, Rarity.UNCOMMON, mage.cards.s.SomberwaldStag.class));
        cards.add(new SetCardInfo("Soul of the Harvest", 432, Rarity.RARE, mage.cards.s.SoulOfTheHarvest.class));
        cards.add(new SetCardInfo("Spitting Earth", 364, Rarity.COMMON, mage.cards.s.SpittingEarth.class));
        cards.add(new SetCardInfo("Sporemound", 433, Rarity.COMMON, mage.cards.s.Sporemound.class));
        cards.add(new SetCardInfo("Storm Sculptor", 179, Rarity.COMMON, mage.cards.s.StormSculptor.class));
        cards.add(new SetCardInfo("Supply Runners", 7, Rarity.UNCOMMON, mage.cards.s.SupplyRunners.class));
        cards.add(new SetCardInfo("Suspicious Bookcase", 487, Rarity.UNCOMMON, mage.cards.s.SuspiciousBookcase.class));
        cards.add(new SetCardInfo("Swamp", 54, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swarm of Bloodflies", 282, Rarity.UNCOMMON, mage.cards.s.SwarmOfBloodflies.class));
        cards.add(new SetCardInfo("Sylvan Brushstrider", 434, Rarity.COMMON, mage.cards.s.SylvanBrushstrider.class));
        cards.add(new SetCardInfo("Sylvan Ranger", 435, Rarity.COMMON, mage.cards.s.SylvanRanger.class));
        cards.add(new SetCardInfo("Talrand's Invocation", 182, Rarity.UNCOMMON, mage.cards.t.TalrandsInvocation.class));
        cards.add(new SetCardInfo("Talrand, Sky Summoner", 181, Rarity.RARE, mage.cards.t.TalrandSkySummoner.class));
        cards.add(new SetCardInfo("Tempting Witch", 283, Rarity.UNCOMMON, mage.cards.t.TemptingWitch.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 78, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Terrarion", 488, Rarity.COMMON, mage.cards.t.Terrarion.class));
        cards.add(new SetCardInfo("Thirst for Knowledge", 183, Rarity.UNCOMMON, mage.cards.t.ThirstForKnowledge.class));
        cards.add(new SetCardInfo("Thragtusk", 436, Rarity.RARE, mage.cards.t.Thragtusk.class));
        cards.add(new SetCardInfo("Thriving Bluff", 33, Rarity.COMMON, mage.cards.t.ThrivingBluff.class));
        cards.add(new SetCardInfo("Thriving Grove", 34, Rarity.COMMON, mage.cards.t.ThrivingGrove.class));
        cards.add(new SetCardInfo("Thriving Heath", 35, Rarity.COMMON, mage.cards.t.ThrivingHeath.class));
        cards.add(new SetCardInfo("Thriving Isle", 36, Rarity.COMMON, mage.cards.t.ThrivingIsle.class));
        cards.add(new SetCardInfo("Thriving Moor", 37, Rarity.COMMON, mage.cards.t.ThrivingMoor.class));
        cards.add(new SetCardInfo("Thundering Spineback", 437, Rarity.UNCOMMON, mage.cards.t.ThunderingSpineback.class));
        cards.add(new SetCardInfo("Tithebearer Giant", 284, Rarity.COMMON, mage.cards.t.TithebearerGiant.class));
        cards.add(new SetCardInfo("Towering Titan", 31, Rarity.MYTHIC, mage.cards.t.ToweringTitan.class));
        cards.add(new SetCardInfo("Trusty Retriever", 8, Rarity.COMMON, mage.cards.t.TrustyRetriever.class));
        cards.add(new SetCardInfo("Ulvenwald Hydra", 439, Rarity.MYTHIC, mage.cards.u.UlvenwaldHydra.class));
        cards.add(new SetCardInfo("Vampire Neonate", 285, Rarity.COMMON, mage.cards.v.VampireNeonate.class));
        cards.add(new SetCardInfo("Vastwood Zendikon", 440, Rarity.COMMON, mage.cards.v.VastwoodZendikon.class));
        cards.add(new SetCardInfo("Vedalken Archmage", 187, Rarity.RARE, mage.cards.v.VedalkenArchmage.class));
        cards.add(new SetCardInfo("Verdant Embrace", 441, Rarity.RARE, mage.cards.v.VerdantEmbrace.class));
        cards.add(new SetCardInfo("Volcanic Fallout", 368, Rarity.UNCOMMON, mage.cards.v.VolcanicFallout.class));
        cards.add(new SetCardInfo("Wailing Ghoul", 286, Rarity.COMMON, mage.cards.w.WailingGhoul.class));
        cards.add(new SetCardInfo("Wall of Blossoms", 442, Rarity.UNCOMMON, mage.cards.w.WallOfBlossoms.class));
        cards.add(new SetCardInfo("Wall of Vines", 443, Rarity.COMMON, mage.cards.w.WallOfVines.class));
        cards.add(new SetCardInfo("Warmonger's Chariot", 490, Rarity.UNCOMMON, mage.cards.w.WarmongersChariot.class));
        cards.add(new SetCardInfo("Wight of Precinct Six", 287, Rarity.COMMON, mage.cards.w.WightOfPrecinctSix.class));
        cards.add(new SetCardInfo("Wildheart Invoker", 444, Rarity.COMMON, mage.cards.w.WildheartInvoker.class));
        cards.add(new SetCardInfo("Winged Words", 196, Rarity.COMMON, mage.cards.w.WingedWords.class));
        cards.add(new SetCardInfo("Wizard's Retort", 198, Rarity.UNCOMMON, mage.cards.w.WizardsRetort.class));
        cards.add(new SetCardInfo("Woodborn Behemoth", 446, Rarity.UNCOMMON, mage.cards.w.WoodbornBehemoth.class));
        cards.add(new SetCardInfo("Wren's Run Vanquisher", 447, Rarity.UNCOMMON, mage.cards.w.WrensRunVanquisher.class));
        cards.add(new SetCardInfo("Young Pyromancer", 372, Rarity.UNCOMMON, mage.cards.y.YoungPyromancer.class));
        cards.add(new SetCardInfo("Zendikar's Roil", 448, Rarity.UNCOMMON, mage.cards.z.ZendikarsRoil.class));
        cards.add(new SetCardInfo("Zombie Infestation", 288, Rarity.UNCOMMON, mage.cards.z.ZombieInfestation.class));
    }
}
