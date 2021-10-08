/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.external.adonai;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.widgets.WidgetInfo;

import javax.annotation.Nullable;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum MagicMap
{
	/* STANDARD SPELL BOOK WIDGETS*/
	WIND_STRIKE("Wind Strike", WidgetInfo.SPELL_WIND_STRIKE),
	CONFUSE( "Confuse", WidgetInfo.SPELL_CONFUSE),
	ENCHANT_CROSSBOW_BOLT(   "Enchant Crossbow Bolt", WidgetInfo.SPELL_ENCHANT_CROSSBOW_BOLT),
	WATER_STRIKE(  "Water Strike", WidgetInfo.SPELL_WATER_STRIKE),
	LVL_1_ENCHANT(   "Lvl 1 Enchant", WidgetInfo.SPELL_LVL_1_ENCHANT),
	EARTH_STRIKE(  "Earth Strike", WidgetInfo.SPELL_EARTH_STRIKE),
	WEAKEN( "Weaken", WidgetInfo.SPELL_WEAKEN),
	FIRE_STRIKE(  "Fire Strike", WidgetInfo.SPELL_FIRE_STRIKE),
	BONES_TO_BANANAS(   "Bones To Bananas", WidgetInfo.SPELL_BONES_TO_BANANAS),
	WIND_BOLT(  "Wind Bolt", WidgetInfo.SPELL_WIND_BOLT),
	CURSE( "Curse", WidgetInfo.SPELL_CURSE),
	BIND( "Bind", WidgetInfo.SPELL_BIND),
	LOW_LEVEL_ALCHEMY(   "Low Level Alchemy", WidgetInfo.SPELL_LOW_LEVEL_ALCHEMY),
	WATER_BOLT(  "Water Bolt", WidgetInfo.SPELL_WATER_BOLT),
	VARROCK_TELEPORT(  "Varrock Teleport", WidgetInfo.SPELL_VARROCK_TELEPORT),
	LVL_2_ENCHANT(   "Lvl 2 Enchant", WidgetInfo.SPELL_LVL_2_ENCHANT),
	EARTH_BOLT(  "Earth Bolt", WidgetInfo.SPELL_EARTH_BOLT),
	LUMBRIDGE_TELEPORT(  "Lumbridge Teleport", WidgetInfo.SPELL_LUMBRIDGE_TELEPORT),
	TELEKINETIC_GRAB(  "Telekinetic Grab", WidgetInfo.SPELL_TELEKINETIC_GRAB),
	FIRE_BOLT(  "Fire Bolt", WidgetInfo.SPELL_FIRE_BOLT),
	FALADOR_TELEPORT(  "Falador Teleport", WidgetInfo.SPELL_FALADOR_TELEPORT),
	CRUMBLE_UNDEAD(  "Crumble Undead", WidgetInfo.SPELL_CRUMBLE_UNDEAD),
	TELEPORT_TO_HOUSE(   "Teleport To House", WidgetInfo.SPELL_TELEPORT_TO_HOUSE),
	WIND_BLAST(  "Wind Blast", WidgetInfo.SPELL_WIND_BLAST),
	SUPERHEAT_ITEM(  "Superheat Item", WidgetInfo.SPELL_SUPERHEAT_ITEM),
	CAMELOT_TELEPORT(  "Camelot Teleport", WidgetInfo.SPELL_CAMELOT_TELEPORT),
	WATER_BLAST(  "Water Blast", WidgetInfo.SPELL_WATER_BLAST),
	LVL_3_ENCHANT(   "Lvl 3 Enchant", WidgetInfo.SPELL_LVL_3_ENCHANT),
	IBAN_BLAST(  "Iban Blast", WidgetInfo.SPELL_IBAN_BLAST),
	SNARE( "Snare", WidgetInfo.SPELL_SNARE),
	MAGIC_DART(  "Magic Dart", WidgetInfo.SPELL_MAGIC_DART),
	ARDOUGNE_TELEPORT(  "Ardougne Teleport", WidgetInfo.SPELL_ARDOUGNE_TELEPORT),
	EARTH_BLAST(  "Earth Blast", WidgetInfo.SPELL_EARTH_BLAST),
	HIGH_LEVEL_ALCHEMY(   "High Level Alchemy", WidgetInfo.SPELL_HIGH_LEVEL_ALCHEMY),
	CHARGE_WATER_ORB(   "Charge Water Orb", WidgetInfo.SPELL_CHARGE_WATER_ORB),
	LVL_4_ENCHANT(   "Lvl 4 Enchant", WidgetInfo.SPELL_LVL_4_ENCHANT),
	WATCHTOWER_TELEPORT(  "Watchtower Teleport", WidgetInfo.SPELL_WATCHTOWER_TELEPORT),
	FIRE_BLAST(  "Fire Blast", WidgetInfo.SPELL_FIRE_BLAST),
	CHARGE_EARTH_ORB(   "Charge Earth Orb", WidgetInfo.SPELL_CHARGE_EARTH_ORB),
	BONES_TO_PEACHES(   "Bones To Peaches", WidgetInfo.SPELL_BONES_TO_PEACHES),
	SARADOMIN_STRIKE(  "Saradomin Strike", WidgetInfo.SPELL_SARADOMIN_STRIKE),
	CLAWS_OF_GUTHIX(   "Claws Of Guthix", WidgetInfo.SPELL_CLAWS_OF_GUTHIX),
	FLAMES_OF_ZAMORAK(   "Flames Of Zamorak", WidgetInfo.SPELL_FLAMES_OF_ZAMORAK),
	TROLLHEIM_TELEPORT(  "Trollheim Teleport", WidgetInfo.SPELL_TROLLHEIM_TELEPORT),
	WIND_WAVE(  "Wind Wave", WidgetInfo.SPELL_WIND_WAVE),
	CHARGE_FIRE_ORB(   "Charge Fire Orb", WidgetInfo.SPELL_CHARGE_FIRE_ORB),
	TELEPORT_TO_APE_ATOLL(    "Teleport To Ape Atoll", WidgetInfo.SPELL_TELEPORT_TO_APE_ATOLL),
	WATER_WAVE(  "Water Wave", WidgetInfo.SPELL_WATER_WAVE),
	CHARGE_AIR_ORB(   "Charge Air Orb", WidgetInfo.SPELL_CHARGE_AIR_ORB),
	VULNERABILITY( "Vulnerability", WidgetInfo.SPELL_VULNERABILITY),
	LVL_5_ENCHANT(   "Lvl 5 Enchant", WidgetInfo.SPELL_LVL_5_ENCHANT),
	TELEPORT_TO_KOUREND(   "Teleport To Kourend", WidgetInfo.SPELL_TELEPORT_TO_KOUREND),
	EARTH_WAVE(  "Earth Wave", WidgetInfo.SPELL_EARTH_WAVE),
	ENFEEBLE( "Enfeeble", WidgetInfo.SPELL_ENFEEBLE),
	FIRE_WAVE(  "Fire Wave", WidgetInfo.SPELL_FIRE_WAVE),
	ENTANGLE( "Entangle", WidgetInfo.SPELL_ENTANGLE),
	TELEOTHER_LUMBRIDGE(  "Teleother Lumbridge", WidgetInfo.SPELL_TELEOTHER_LUMBRIDGE),
	STUN( "Stun", WidgetInfo.SPELL_STUN),
	CHARGE( "Charge", WidgetInfo.SPELL_CHARGE),
	WIND_SURGE(  "Wind Surge", WidgetInfo.SPELL_WIND_SURGE),
	TELEOTHER_FALADOR(  "Teleother Falador", WidgetInfo.SPELL_TELEOTHER_FALADOR),
	WATER_SURGE(  "Water Surge", WidgetInfo.SPELL_WATER_SURGE),
	TELE_BLOCK(  "Tele Block", WidgetInfo.SPELL_TELE_BLOCK),
	LVL_6_ENCHANT(   "Lvl 6 Enchant", WidgetInfo.SPELL_LVL_6_ENCHANT),
	TELEOTHER_CAMELOT(  "Teleother Camelot", WidgetInfo.SPELL_TELEOTHER_CAMELOT),
	EARTH_SURGE(  "Earth Surge", WidgetInfo.SPELL_EARTH_SURGE),
	LVL_7_ENCHANT(   "Lvl 7 Enchant", WidgetInfo.SPELL_LVL_7_ENCHANT),
	FIRE_SURGE(  "Fire Surge", WidgetInfo.SPELL_FIRE_SURGE),
	BOUNTY_TARGET_TELEPORT2(   "Bounty Target Teleport2", WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT2),
	/* END OF STANDARD SPELL BOOK WIDGETS*/

	/* ANCIENT SPELL BOOK WIDGETS*/
	ICE_RUSH(  "Ice Rush", WidgetInfo.SPELL_ICE_RUSH),
	ICE_BLITZ(  "Ice Blitz", WidgetInfo.SPELL_ICE_BLITZ),
	ICE_BURST(  "Ice Burst", WidgetInfo.SPELL_ICE_BURST),
	ICE_BARRAGE(  "Ice Barrage", WidgetInfo.SPELL_ICE_BARRAGE),
	BLOOD_RUSH(  "Blood Rush", WidgetInfo.SPELL_BLOOD_RUSH),
	BLOOD_BLITZ(  "Blood Blitz", WidgetInfo.SPELL_BLOOD_BLITZ),
	BLOOD_BURST(  "Blood Burst", WidgetInfo.SPELL_BLOOD_BURST),
	BLOOD_BARRAGE(  "Blood Barrage", WidgetInfo.SPELL_BLOOD_BARRAGE),
	SMOKE_RUSH(  "Smoke Rush", WidgetInfo.SPELL_SMOKE_RUSH),
	SMOKE_BLITZ(  "Smoke Blitz", WidgetInfo.SPELL_SMOKE_BLITZ),
	SMOKE_BURST(  "Smoke Burst", WidgetInfo.SPELL_SMOKE_BURST),
	SMOKE_BARRAGE(  "Smoke Barrage", WidgetInfo.SPELL_SMOKE_BARRAGE),
	SHADOW_RUSH(  "Shadow Rush", WidgetInfo.SPELL_SHADOW_RUSH),
	SHADOW_BLITZ(  "Shadow Blitz", WidgetInfo.SPELL_SHADOW_BLITZ),
	SHADOW_BURST(  "Shadow Burst", WidgetInfo.SPELL_SHADOW_BURST),
	SHADOW_BARRAGE(  "Shadow Barrage", WidgetInfo.SPELL_SHADOW_BARRAGE),
	PADDEWWA_TELEPORT(  "Paddewwa Teleport", WidgetInfo.SPELL_PADDEWWA_TELEPORT),
	SENNTISTEN_TELEPORT(  "Senntisten Teleport", WidgetInfo.SPELL_SENNTISTEN_TELEPORT),
	KHARYRLL_TELEPORT(  "Kharyrll Teleport", WidgetInfo.SPELL_KHARYRLL_TELEPORT),
	LASSAR_TELEPORT(  "Lassar Teleport", WidgetInfo.SPELL_LASSAR_TELEPORT),
	DAREEYAK_TELEPORT(  "Dareeyak Teleport", WidgetInfo.SPELL_DAREEYAK_TELEPORT),
	CARRALLANGER_TELEPORT(  "Carrallanger Teleport", WidgetInfo.SPELL_CARRALLANGER_TELEPORT),
	ANNAKARL_TELEPORT(  "Annakarl Teleport", WidgetInfo.SPELL_ANNAKARL_TELEPORT),
	GHORROCK_TELEPORT(  "Ghorrock Teleport", WidgetInfo.SPELL_GHORROCK_TELEPORT),
	BOUNTY_TARGET_TELEPORT(   "Bounty Target Teleport", WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT),
	/* END OF ANCIENT SPELL BOOK WIDGETS*/

	/* LUNAR SPELL BOOK WIDGETS*/
	VENGEANCE_OTHER(  "Vengeance Other", WidgetInfo.SPELL_VENGEANCE_OTHER),
	VENGEANCE( "Vengeance", WidgetInfo.SPELL_VENGEANCE),
	BOUNTY_TARGET_TELEPORT3(   "Bounty Target Teleport3", WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT3),
	BAKE_PIE(  "Bake Pie", WidgetInfo.SPELL_BAKE_PIE),
	CURE_PLANT(  "Cure Plant", WidgetInfo.SPELL_CURE_PLANT),
	MONSTER_EXAMINE(  "Monster Examine", WidgetInfo.SPELL_MONSTER_EXAMINE),
	NPC_CONTACT(  "Npc Contact", WidgetInfo.SPELL_NPC_CONTACT),
	CURE_OTHER(  "Cure Other", WidgetInfo.SPELL_CURE_OTHER),
	HUMIDIFY( "Humidify", WidgetInfo.SPELL_HUMIDIFY),
	MOONCLAN_TELEPORT(  "Moonclan Teleport", WidgetInfo.SPELL_MOONCLAN_TELEPORT),
	TELE_GROUP_MOONCLAN(   "Tele Group Moonclan", WidgetInfo.SPELL_TELE_GROUP_MOONCLAN),
	CURE_ME(  "Cure Me", WidgetInfo.SPELL_CURE_ME),
	HUNTER_KIT(  "Hunter Kit", WidgetInfo.SPELL_HUNTER_KIT),
	WATERBIRTH_TELEPORT(  "Waterbirth Teleport", WidgetInfo.SPELL_WATERBIRTH_TELEPORT),
	TELE_GROUP_WATERBIRTH(   "Tele Group Waterbirth", WidgetInfo.SPELL_TELE_GROUP_WATERBIRTH),
	CURE_GROUP(  "Cure Group", WidgetInfo.SPELL_CURE_GROUP),
	STAT_SPY(  "Stat Spy", WidgetInfo.SPELL_STAT_SPY),
	BARBARIAN_TELEPORT(  "Barbarian Teleport", WidgetInfo.SPELL_BARBARIAN_TELEPORT),
	TELE_GROUP_BARBARIAN(   "Tele Group Barbarian", WidgetInfo.SPELL_TELE_GROUP_BARBARIAN),
	SUPERGLASS_MAKE(  "Superglass Make", WidgetInfo.SPELL_SUPERGLASS_MAKE),
	TAN_LEATHER(  "Tan Leather", WidgetInfo.SPELL_TAN_LEATHER),
	KHAZARD_TELEPORT(  "Khazard Teleport", WidgetInfo.SPELL_KHAZARD_TELEPORT),
	TELE_GROUP_KHAZARD(   "Tele Group Khazard", WidgetInfo.SPELL_TELE_GROUP_KHAZARD),
	DREAM( "Dream", WidgetInfo.SPELL_DREAM),
	STRING_JEWELLERY(  "String Jewellery", WidgetInfo.SPELL_STRING_JEWELLERY),
	STAT_RESTORE_POT_SHARE(    "Stat Restore Pot Share", WidgetInfo.SPELL_STAT_RESTORE_POT_SHARE),
	MAGIC_IMBUE(  "Magic Imbue", WidgetInfo.SPELL_MAGIC_IMBUE),
	FERTILE_SOIL(  "Fertile Soil", WidgetInfo.SPELL_FERTILE_SOIL),
	BOOST_POTION_SHARE(   "Boost Potion Share", WidgetInfo.SPELL_BOOST_POTION_SHARE),
	FISHING_GUILD_TELEPORT(   "Fishing Guild Teleport", WidgetInfo.SPELL_FISHING_GUILD_TELEPORT),
	TELE_GROUP_FISHING_GUILD(    "Tele Group Fishing Guild", WidgetInfo.SPELL_TELE_GROUP_FISHING_GUILD),
	PLANK_MAKE(  "Plank Make", WidgetInfo.SPELL_PLANK_MAKE),
	CATHERBY_TELEPORT(  "Catherby Teleport", WidgetInfo.SPELL_CATHERBY_TELEPORT),
	TELE_GROUP_CATHERBY(   "Tele Group Catherby", WidgetInfo.SPELL_TELE_GROUP_CATHERBY),
	RECHARGE_DRAGONSTONE(  "Recharge Dragonstone", WidgetInfo.SPELL_RECHARGE_DRAGONSTONE),
	ICE_PLATEAU_TELEPORT(   "Ice Plateau Teleport", WidgetInfo.SPELL_ICE_PLATEAU_TELEPORT),
	TELE_GROUP_ICE_PLATEAU(    "Tele Group Ice Plateau", WidgetInfo.SPELL_TELE_GROUP_ICE_PLATEAU),
	ENERGY_TRANSFER(  "Energy Transfer", WidgetInfo.SPELL_ENERGY_TRANSFER),
	HEAL_OTHER(  "Heal Other", WidgetInfo.SPELL_HEAL_OTHER),
	HEAL_GROUP(  "Heal Group", WidgetInfo.SPELL_HEAL_GROUP),
	SPELLBOOK_SWAP(  "Spellbook Swap", WidgetInfo.SPELL_SPELLBOOK_SWAP),
	GEOMANCY( "Geomancy", WidgetInfo.SPELL_GEOMANCY),
	SPIN_FLAX(  "Spin Flax", WidgetInfo.SPELL_SPIN_FLAX),
	OURANIA_TELEPORT(  "Ourania Teleport", WidgetInfo.SPELL_OURANIA_TELEPORT),
	/* END OF LUNAR SPELL BOOK WIDGETS*/
	TOOLTIP( "Tooltip", WidgetInfo.SPELL_TOOLTIP),
	/* ARCEUUS SPELL BOOK WIDGETS*/
	BASIC_REANIMATION(  "Basic Reanimation", WidgetInfo.SPELL_BASIC_REANIMATION),
	ARCEUUS_LIBRARY_TELEPORT(   "Arceuus Library Teleport", WidgetInfo.SPELL_ARCEUUS_LIBRARY_TELEPORT),
	ADEPT_REANIMATION(  "Adept Reanimation", WidgetInfo.SPELL_ADEPT_REANIMATION),
	EXPERT_REANIMATION(  "Expert Reanimation", WidgetInfo.SPELL_EXPERT_REANIMATION),
	MASTER_REANIMATION(  "Master Reanimation", WidgetInfo.SPELL_MASTER_REANIMATION),
	DRAYNOR_MANOR_TELEPORT(   "Draynor Manor Teleport", WidgetInfo.SPELL_DRAYNOR_MANOR_TELEPORT),
	MIND_ALTAR_TELEPORT(   "Mind Altar Teleport", WidgetInfo.SPELL_MIND_ALTAR_TELEPORT),
	RESPAWN_TELEPORT(  "Respawn Teleport", WidgetInfo.SPELL_RESPAWN_TELEPORT),
	SALVE_GRAVEYARD_TELEPORT(   "Salve Graveyard Teleport", WidgetInfo.SPELL_SALVE_GRAVEYARD_TELEPORT),
	FENKENSTRAINS_CASTLE_TELEPORT(   "Fenkenstrains Castle Teleport", WidgetInfo.SPELL_FENKENSTRAINS_CASTLE_TELEPORT),
	WEST_ARDOUGNE_TELEPORT(   "West Ardougne Teleport", WidgetInfo.SPELL_WEST_ARDOUGNE_TELEPORT),
	HARMONY_ISLAND_TELEPORT(   "Harmony Island Teleport", WidgetInfo.SPELL_HARMONY_ISLAND_TELEPORT),
	CEMETERY_TELEPORT(  "Cemetery Teleport", WidgetInfo.SPELL_CEMETERY_TELEPORT),
	RESURRECT_CROPS(  "Resurrect Crops", WidgetInfo.SPELL_RESURRECT_CROPS),
	BARROWS_TELEPORT(  "Barrows Teleport", WidgetInfo.SPELL_BARROWS_TELEPORT),
	APE_ATOLL_TELEPORT(   "Ape Atoll Teleport", WidgetInfo.SPELL_APE_ATOLL_TELEPORT),
	BATTLEFRONT_TELEPORT(  "Battlefront Teleport", WidgetInfo.SPELL_BATTLEFRONT_TELEPORT),
	INFERIOR_DEMONBANE(  "Inferior Demonbane", WidgetInfo.SPELL_INFERIOR_DEMONBANE),
	SUPERIOR_DEMONBANE(  "Superior Demonbane", WidgetInfo.SPELL_SUPERIOR_DEMONBANE),
	DARK_DEMONBANE(  "Dark Demonbane", WidgetInfo.SPELL_DARK_DEMONBANE),
	MARK_OF_DARKNESS(   "Mark Of Darkness", WidgetInfo.SPELL_MARK_OF_DARKNESS),
	GHOSTLY_GRASP(  "Ghostly Grasp", WidgetInfo.SPELL_GHOSTLY_GRASP),
	SKELETAL_GRASP(  "Skeletal Grasp", WidgetInfo.SPELL_SKELETAL_GRASP),
	UNDEAD_GRASP(  "Undead Grasp", WidgetInfo.SPELL_UNDEAD_GRASP),
	WARD_OF_ARCEUUS(   "Ward Of Arceuus", WidgetInfo.SPELL_WARD_OF_ARCEUUS),
	LESSER_CORRUPTION(  "Lesser Corruption", WidgetInfo.SPELL_LESSER_CORRUPTION),
	GREATER_CORRUPTION(  "Greater Corruption", WidgetInfo.SPELL_GREATER_CORRUPTION),
	DEMONIC_OFFERING(  "Demonic Offering", WidgetInfo.SPELL_DEMONIC_OFFERING),
	SINISTER_OFFERING(  "Sinister Offering", WidgetInfo.SPELL_SINISTER_OFFERING),
	DEGRIME( "Degrime", WidgetInfo.SPELL_DEGRIME),
	SHADOW_VEIL(  "Shadow Veil", WidgetInfo.SPELL_SHADOW_VEIL),
	VILE_VIGOUR(  "Vile Vigour", WidgetInfo.SPELL_VILE_VIGOUR),
	DARK_LURE(  "Dark Lure", WidgetInfo.SPELL_DARK_LURE),
	DEATH_CHARGE(  "Death Charge", WidgetInfo.SPELL_DEATH_CHARGE),
	RESURRECT_LESSER_GHOST(   "Resurrect Lesser Ghost", WidgetInfo.SPELL_RESURRECT_LESSER_GHOST),
	RESURRECT_LESSER_SKELETON(   "Resurrect Lesser Skeleton", WidgetInfo.SPELL_RESURRECT_LESSER_SKELETON),
	RESURRECT_LESSER_ZOMBIE(   "Resurrect Lesser Zombie", WidgetInfo.SPELL_RESURRECT_LESSER_ZOMBIE),
	RESURRECT_SUPERIOR_GHOST(   "Resurrect Superior Ghost", WidgetInfo.SPELL_RESURRECT_SUPERIOR_GHOST),
	RESURRECT_SUPERIOR_SKELETON(   "Resurrect Superior Skeleton", WidgetInfo.SPELL_RESURRECT_SUPERIOR_SKELETON),
	RESURRECT_SUPERIOR_ZOMBIE(   "Resurrect Superior Zombie", WidgetInfo.SPELL_RESURRECT_SUPERIOR_ZOMBIE),
	RESURRECT_GREATER_GHOST(   "Resurrect Greater Ghost", WidgetInfo.SPELL_RESURRECT_GREATER_GHOST),
	RESURRECT_GREATER_SKELETON(   "Resurrect Greater Skeleton", WidgetInfo.SPELL_RESURRECT_GREATER_SKELETON),
	RESURRECT_GREATER_ZOMBIE(   "Resurrect Greater Zombie", WidgetInfo.SPELL_RESURRECT_GREATER_ZOMBIE);

	private final String name;
	private final WidgetInfo info;
	private static final Map<String, WidgetInfo> map;

	static
	{
		ImmutableMap.Builder<String, WidgetInfo> builder = ImmutableMap.builder();

		for (MagicMap spells : values())
		{
			builder.put(spells.getName(), spells.getInfo());
		}

		map = builder.build();
	}

	@Nullable
	public static WidgetInfo getWidget(String spell)
	{
		return map.getOrDefault(spell, null);
	}
}
