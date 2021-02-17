/*
 * Copyright (c) 2018, Eadgars Ruse <https://github.com/Eadgars-Ruse>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2019, Jordan Atwood <nightfirecat@protonmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.cluescrolls.clues.hotcold;

import java.awt.Rectangle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.cluescrolls.clues.Enemy;
import static net.runelite.client.plugins.cluescrolls.clues.Enemy.*;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.ASGARNIA;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.DESERT;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.FELDIP_HILLS;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.FREMENNIK_PROVINCE;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.KANDARIN;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.KARAMJA;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.MISTHALIN;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.MORYTANIA;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.WESTERN_PROVINCE;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.WILDERNESS;
import static net.runelite.client.plugins.cluescrolls.clues.hotcold.HotColdArea.ZEAH;

// The locations contains all hot/cold points and their descriptions according to the wiki
// these central points were obtained by checking wiki location pictures against a coordinate map
// some central points points may be slightly off-center
// calculations are done considering the 9x9 grid around the central point where the strange device shakes
// because the calculations consider the 9x9 grid, slightly off-center points should still be found by the calculations
@AllArgsConstructor
@Getter
public enum HotColdLocation
{
	ASGARNIA_WARRIORS(new WorldPoint(2860, 3562, 0), ASGARNIA, "North of the Warriors' Guild in Burthorpe.", BRASSICAN_MAGE),
	ASGARNIA_JATIX(new WorldPoint(2915, 3425, 0), ASGARNIA, "East of Jatix's Herblore Shop in Taverley.", BRASSICAN_MAGE),
	ASGARNIA_BARB(new WorldPoint(3033, 3438, 0), ASGARNIA, "West of Barbarian Village.", BRASSICAN_MAGE),
	ASGARNIA_MIAZRQA(new WorldPoint(2972, 3486, 0), ASGARNIA, "North of Miazrqa's tower, outside Goblin Village.", BRASSICAN_MAGE),
	ASGARNIA_COW(new WorldPoint(3031, 3304, 0), ASGARNIA, "In the cow pen north of Sarah's Farming Shop.", ANCIENT_WIZARDS),
	ASGARNIA_PARTY_ROOM(new WorldPoint(3030, 3364, 0), ASGARNIA, "Outside the Falador Party Room.", BRASSICAN_MAGE),
	ASGARNIA_CRAFT_GUILD(new WorldPoint(2917, 3295, 0), ASGARNIA, "Outside the Crafting Guild cow pen.", BRASSICAN_MAGE),
	ASGARNIA_RIMMINGTON(new WorldPoint(2976, 3239, 0), ASGARNIA, "In the centre of the Rimmington mine.", BRASSICAN_MAGE),
	ASGARNIA_MUDSKIPPER(new WorldPoint(2987, 3110, 0), ASGARNIA, "Mudskipper Point, near the starfish in the south-west corner.", BRASSICAN_MAGE),
	ASGARNIA_TROLL(new WorldPoint(2910, 3616, 0), ASGARNIA, "The Troll arena, where the player fights Dad during the Troll Stronghold quest. Bring climbing boots if travelling from Burthorpe.", BRASSICAN_MAGE),
	DESERT_GENIE(new WorldPoint(3359, 2912, 0), DESERT, "West of Nardah genie cave.", BRASSICAN_MAGE),
	DESERT_ALKHARID_MINE(new WorldPoint(3279, 3263, 0), DESERT, "West of Al Kharid mine.", BRASSICAN_MAGE),
	DESERT_MENAPHOS_GATE(new WorldPoint(3223, 2820, 0), DESERT, "North of Menaphos gate.", BRASSICAN_MAGE),
	DESERT_BEDABIN_CAMP(new WorldPoint(3161, 3047, 0), DESERT, "Bedabin Camp, near the north tent.", BRASSICAN_MAGE),
	DESERT_UZER(new WorldPoint(3432, 3105, 0), DESERT, "West of Uzer.", BRASSICAN_MAGE),
	DESERT_POLLNIVNEACH(new WorldPoint(3288, 2976, 0), DESERT, "West of Pollnivneach.", BRASSICAN_MAGE),
	DESERT_MTA(new WorldPoint(3347, 3295, 0), DESERT, "Next to Mage Training Arena.", BRASSICAN_MAGE),
	DESERT_SHANTY(new WorldPoint(3292, 3107, 0), DESERT, "South-west of Shantay Pass.", BRASSICAN_MAGE),
	DRAYNOR_MANOR_MUSHROOMS(new WorldPoint(3096, 3379, 0), MISTHALIN, "Patch of mushrooms just northwest of Draynor Manor"),
	DRAYNOR_WHEAT_FIELD(new WorldPoint(3120, 3282, 0), MISTHALIN, "Inside the wheat field next to Draynor Village"),
	FELDIP_HILLS_JIGGIG(new WorldPoint(2409, 3053, 0), FELDIP_HILLS, "West of Jiggig, east of the fairy ring bkp.", BRASSICAN_MAGE),
	FELDIP_HILLS_SW(new WorldPoint(2586, 2897, 0), FELDIP_HILLS, "West of the southeasternmost lake in Feldip Hills.", BRASSICAN_MAGE),
	FELDIP_HILLS_GNOME_GLITER(new WorldPoint(2555, 2972, 0), FELDIP_HILLS, "East of the gnome glider (Lemantolly Undri).", BRASSICAN_MAGE),
	FELDIP_HILLS_RANTZ(new WorldPoint(2611, 2950, 0), FELDIP_HILLS, "South of Rantz, west of the empty glass bottles.", BRASSICAN_MAGE),
	FELDIP_HILLS_SOUTH(new WorldPoint(2486, 3007, 0), FELDIP_HILLS, "South of Jiggig.", BRASSICAN_MAGE),
	FELDIP_HILLS_RED_CHIN(new WorldPoint(2530, 2901, 0), FELDIP_HILLS, "Outside the red chinchompa hunting ground entrance, south of the Hunting expert's hut.", BRASSICAN_MAGE),
	FELDIP_HILLS_SE(new WorldPoint(2569, 2918, 0), FELDIP_HILLS, "South-east of the ∩-shaped lake, near the Hunter icon.", BRASSICAN_MAGE),
	FELDIP_HILLS_CW_BALLOON(new WorldPoint(2451, 3112, 0), FELDIP_HILLS, "Directly west of the Castle Wars balloon.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_MTN_CAMP(new WorldPoint(2800, 3669, 0), FREMENNIK_PROVINCE, "At the Mountain Camp.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_RELLEKKA_HUNTER(new WorldPoint(2720, 3784, 0), FREMENNIK_PROVINCE, "At the Rellekka Hunter area, near the Hunter icon.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_KELGADRIM_ENTRANCE(new WorldPoint(2711, 3689, 0), FREMENNIK_PROVINCE, "West of the Keldagrim entrance mine.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_SW(new WorldPoint(2604, 3648, 0), FREMENNIK_PROVINCE, "Outside the fence in the south-western corner of Rellekka.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_LIGHTHOUSE(new WorldPoint(2585, 3601, 0), FREMENNIK_PROVINCE, "South-east of the Lighthouse.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_ETCETERIA_CASTLE(new WorldPoint(2617, 3862, 0), FREMENNIK_PROVINCE, "South-east of Etceteria's castle.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_MISC_COURTYARD(new WorldPoint(2527, 3868, 0), FREMENNIK_PROVINCE, "Outside Miscellania's courtyard.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_FREMMY_ISLES_MINE(new WorldPoint(2374, 3850, 0), FREMENNIK_PROVINCE, "Central Fremennik Isles mine.", ANCIENT_WIZARDS),
	FREMENNIK_PROVINCE_WEST_ISLES_MINE(new WorldPoint(2313, 3850, 0), FREMENNIK_PROVINCE, "West Fremennik Isles mine.", ANCIENT_WIZARDS),
	FREMENNIK_PROVINCE_WEST_JATIZSO_ENTRANCE(new WorldPoint(2393, 3812, 0), FREMENNIK_PROVINCE, "West of the Jatizso mine entrance.", BRASSICAN_MAGE),
	FREMENNIK_PROVINCE_PIRATES_COVE(new WorldPoint(2211, 3817, 0), FREMENNIK_PROVINCE, "Pirates' Cove", ANCIENT_WIZARDS),
	FREMENNIK_PROVINCE_ASTRAL_ALTER(new WorldPoint(2149, 3865, 0), FREMENNIK_PROVINCE, "Astral altar", ANCIENT_WIZARDS),
	FREMENNIK_PROVINCE_LUNAR_VILLAGE(new WorldPoint(2084, 3916, 0), FREMENNIK_PROVINCE, "Lunar Isle, inside the village.", ANCIENT_WIZARDS),
	FREMENNIK_PROVINCE_LUNAR_NORTH(new WorldPoint(2106, 3949, 0), FREMENNIK_PROVINCE, "Lunar Isle, north of the village.", ANCIENT_WIZARDS),
	ICE_MOUNTAIN(new WorldPoint(3007, 3475, 0), MISTHALIN, "Atop Ice Mountain"),
	ISLE_OF_SOULS_MINE(new WorldPoint(2189, 2794, 0), KANDARIN, "Isle of Souls Mine, south of the Soul Wars lobby"),
	KANDARIN_SINCLAR_MANSION(new WorldPoint(2730, 3588, 0), KANDARIN, "North-west of the Sinclair Mansion, near the log balance shortcut.", BRASSICAN_MAGE),
	KANDARIN_CATHERBY(new WorldPoint(2774, 3436, 0), KANDARIN, "Catherby, between the bank and the beehives, near small rock formation.", BRASSICAN_MAGE),
	KANDARIN_GRAND_TREE(new WorldPoint(2448, 3503, 0), KANDARIN, "Grand Tree, just east of the terrorchick gnome enclosure.", BRASSICAN_MAGE),
	KANDARIN_SEERS(new WorldPoint(2735, 3486, 0), KANDARIN, "Between the Seers' Village bank and Camelot.", BRASSICAN_MAGE),
	KANDARIN_MCGRUBORS_WOOD(new WorldPoint(2653, 3485, 0), KANDARIN, "McGrubor's Wood", BRASSICAN_MAGE),
	KANDARIN_FISHING_BUILD(new WorldPoint(2590, 3369, 0), KANDARIN, "South of Fishing Guild", BRASSICAN_MAGE),
	KANDARIN_WITCHHAVEN(new WorldPoint(2707, 3306, 0), KANDARIN, "Outside Witchaven, west of Jeb, Holgart, and Caroline.", BRASSICAN_MAGE),
	KANDARIN_NECRO_TOWER(new WorldPoint(2667, 3241, 0), KANDARIN, "Ground floor inside the Necromancer Tower. Easily accessed by using fairy ring code djp.", ANCIENT_WIZARDS),
	KANDARIN_FIGHT_ARENA(new WorldPoint(2587, 3135, 0), KANDARIN, "South of the Fight Arena, north-west of the Nightmare Zone.", BRASSICAN_MAGE),
	KANDARIN_TREE_GNOME_VILLAGE(new WorldPoint(2530, 3164, 0), KANDARIN, "Tree Gnome Village, near the general store icon.", BRASSICAN_MAGE),
	KANDARIN_GRAVE_OF_SCORPIUS(new WorldPoint(2467, 3227, 0), KANDARIN, "Grave of Scorpius", BRASSICAN_MAGE),
	KANDARIN_KHAZARD_BATTLEFIELD(new WorldPoint(2522, 3252, 0), KANDARIN, "Khazard Battlefield, south of Tracker gnome 2.", BRASSICAN_MAGE),
	KANDARIN_WEST_ARDY(new WorldPoint(2535, 3322, 0), KANDARIN, "West Ardougne, near the staircase outside the Civic Office.", BRASSICAN_MAGE),
	KANDARIN_SW_TREE_GNOME_STRONGHOLD(new WorldPoint(2411, 3429, 0), KANDARIN, "South-west Tree Gnome Stronghold", BRASSICAN_MAGE),
	KANDARIN_OUTPOST(new WorldPoint(2457, 3362, 0), KANDARIN, "South of the Tree Gnome Stronghold, north-east of the Outpost.", BRASSICAN_MAGE),
	KANDARIN_BAXTORIAN_FALLS(new WorldPoint(2530, 3477, 0), KANDARIN, "South-east of Almera's house on Baxtorian Falls.", BRASSICAN_MAGE),
	KANDARIN_BA_AGILITY_COURSE(new WorldPoint(2540, 3548, 0), KANDARIN, "Inside the Barbarian Agility Course. Completion of Alfred Grimhand's Barcrawl is required.", BRASSICAN_MAGE),
	KARAMJA_MUSA_POINT(new WorldPoint(2913, 3169, 0), KARAMJA, "Musa Point, banana plantation.", BRASSICAN_MAGE),
	KARAMJA_BRIMHAVEN_FRUIT_TREE(new WorldPoint(2782, 3215, 0), KARAMJA, "Brimhaven, east of the fruit tree patch.", BRASSICAN_MAGE),
	KARAMJA_WEST_BRIMHAVEN(new WorldPoint(2718, 3167, 0), KARAMJA, "West of Brimhaven.", BRASSICAN_MAGE),
	KARAMJA_GLIDER(new WorldPoint(2966, 2975, 0), KARAMJA, "West of the gnome glider.", BRASSICAN_MAGE),
	KARAMJA_KHARAZI_NE(new WorldPoint(2904, 2925, 0), KARAMJA, "North-eastern part of Kharazi Jungle.", BRASSICAN_MAGE),
	KARAMJA_KHARAZI_SW(new WorldPoint(2786, 2899, 0), KARAMJA, "South-western part of Kharazi Jungle.", BRASSICAN_MAGE),
	KARAMJA_CRASH_ISLAND(new WorldPoint(2909, 2737, 0), KARAMJA, "Northern part of Crash Island.", BRASSICAN_MAGE),
	LUMBRIDGE_COW_FIELD( new WorldPoint(3174, 3336, 0), MISTHALIN, "Cow field north of Lumbridge"),
	MISTHALIN_VARROCK_STONE_CIRCLE(new WorldPoint(3225, 3356, 0), MISTHALIN, "South of the stone circle near Varrock's entrance.", BRASSICAN_MAGE),
	MISTHALIN_LUMBRIDGE(new WorldPoint(3234, 3169, 0), MISTHALIN, "Just north-west of the Lumbridge Fishing tutor.", BRASSICAN_MAGE),
	MISTHALIN_LUMBRIDGE_2(new WorldPoint(3169, 3279, 0), MISTHALIN, "North of the pond between Lumbridge and Draynor Village.", BRASSICAN_MAGE),
	MISTHALIN_GERTUDES(new WorldPoint(3154, 3421, 0), MISTHALIN, "North-east of Gertrude's house west of Varrock.", BRASSICAN_MAGE),
	MISTHALIN_DRAYNOR_BANK(new WorldPoint(3098, 3234, 0), MISTHALIN, "South of Draynor Village bank.", BRASSICAN_MAGE),
	MISTHALIN_LUMBER_YARD(new WorldPoint(3301, 3484, 0), MISTHALIN, "South of Lumber Yard, east of Assistant Serf.", BRASSICAN_MAGE),
	MORYTANIA_BURGH_DE_ROTT(new WorldPoint(3546, 3252, 0), MORYTANIA, "In the north-east area of Burgh de Rott, by the reverse-L-shaped ruins.", BRASSICAN_MAGE),
	MORYTANIA_DARKMEYER(new WorldPoint(3604, 3326, 0), MORYTANIA, "Southwestern part of Darkmeyer.", BRASSICAN_MAGE),
	MORYTANIA_PORT_PHASMATYS(new WorldPoint(3611, 3485, 0), MORYTANIA, "West of Port Phasmatys, south-east of fairy ring.", BRASSICAN_MAGE),
	MORYTANIA_HOLLOWS(new WorldPoint(3499, 3421, 0), MORYTANIA, "Inside The Hollows, south of the bridge which was repaired in a quest.", BRASSICAN_MAGE),
	MORYTANIA_SWAMP(new WorldPoint(3418, 3372, 0), MORYTANIA, "Inside the Mort Myre Swamp, north-west of the Nature Grotto.", BRASSICAN_MAGE),
	MORYTANIA_HAUNTED_MINE(new WorldPoint(3444, 3255, 0), MORYTANIA, "At Haunted Mine quest start.", BRASSICAN_MAGE),
	MORYTANIA_MAUSOLEUM(new WorldPoint(3499, 3539, 0), MORYTANIA, "South of the Mausoleum.", BRASSICAN_MAGE),
	MORYTANIA_MOS_LES_HARMLESS(new WorldPoint(3740, 3041, 0), MORYTANIA, "Northern area of Mos Le'Harmless, between the lakes.", BRASSICAN_MAGE),
	MORYTANIA_MOS_LES_HARMLESS_BAR(new WorldPoint(3666, 2972, 0), MORYTANIA, "Near Mos Le'Harmless southern bar.", BRASSICAN_MAGE),
	MORYTANIA_DRAGONTOOTH_NORTH(new WorldPoint(3811, 3569, 0), MORYTANIA, "Northern part of Dragontooth Island.", BRASSICAN_MAGE),
	MORYTANIA_DRAGONTOOTH_SOUTH(new WorldPoint(3803, 3532, 0), MORYTANIA, "Southern part of Dragontooth Island.", BRASSICAN_MAGE),
	MORYTANIA_SLEPE_TENTS(new WorldPoint(3769, 3383, 0), MORYTANIA, "North-east of Slepe, near the tents.", BRASSICAN_MAGE),
	NORTHEAST_OF_AL_KHARID_MINE(new WorldPoint(3332, 3313, 0), MISTHALIN, "Northeast of Al Kharid Mine"),
	WESTERN_PROVINCE_EAGLES_PEAK(new WorldPoint(2297, 3529, 0), WESTERN_PROVINCE, "North-west of Eagles' Peak.", BRASSICAN_MAGE),
	WESTERN_PROVINCE_PISCATORIS(new WorldPoint(2334, 3685, 0), WESTERN_PROVINCE, "Piscatoris Fishing Colony", ANCIENT_WIZARDS),
	WESTERN_PROVINCE_PISCATORIS_HUNTER_AREA(new WorldPoint(2359, 3564, 0), WESTERN_PROVINCE, "Eastern part of Piscatoris Hunter area, south-west of the Falconry.", BRASSICAN_MAGE),
	WESTERN_PROVINCE_ARANDAR(new WorldPoint(2370, 3319, 0), WESTERN_PROVINCE, "South-west of the crystal gate to Arandar.", ANCIENT_WIZARDS),
	WESTERN_PROVINCE_ELF_CAMP_EAST(new WorldPoint(2268, 3242, 0), WESTERN_PROVINCE, "East of Iorwerth Camp.", BRASSICAN_MAGE),
	WESTERN_PROVINCE_ELF_CAMP_NW(new WorldPoint(2174, 3280, 0), WESTERN_PROVINCE, "North-west of Iorwerth Camp.", BRASSICAN_MAGE),
	WESTERN_PROVINCE_LLETYA(new WorldPoint(2337, 3166, 0), WESTERN_PROVINCE, "In Lletya.", BRASSICAN_MAGE),
	WESTERN_PROVINCE_TYRAS(new WorldPoint(2206, 3158, 0), WESTERN_PROVINCE, "Near Tyras Camp.", BRASSICAN_MAGE),
	WESTERN_PROVINCE_ZULANDRA(new WorldPoint(2196, 3057, 0), WESTERN_PROVINCE, "The northern house at Zul-Andra.", BRASSICAN_MAGE),
	WILDERNESS_5(new WorldPoint(3173, 3556, 0), WILDERNESS, "North of the Grand Exchange, level 5 Wilderness.", ANCIENT_WIZARDS),
	WILDERNESS_12(new WorldPoint(3036, 3612, 0), WILDERNESS, "South-east of the Dark Warriors' Fortress, level 12 Wilderness.", ANCIENT_WIZARDS),
	WILDERNESS_20(new WorldPoint(3222, 3679, 0), WILDERNESS, "East of the Corporeal Beast's lair, level 20 Wilderness.", ANCIENT_WIZARDS),
	WILDERNESS_27(new WorldPoint(3174, 3736, 0), WILDERNESS, "Inside the Ruins north of the Graveyard of Shadows, level 27 Wilderness.", BRASSICAN_MAGE),
	WILDERNESS_28(new WorldPoint(3377, 3737, 0), WILDERNESS, "East of Venenatis' nest, level 28 Wilderness.", BRASSICAN_MAGE),
	WILDERNESS_32(new WorldPoint(3311, 3773, 0), WILDERNESS, "North of Venenatis' nest, level 32 Wilderness.", ANCIENT_WIZARDS),
	WILDERNESS_35(new WorldPoint(3152, 3796, 0), WILDERNESS, "East of the Wilderness canoe exit, level 35 Wilderness.", BRASSICAN_OR_WIZARDS),
	WILDERNESS_37(new WorldPoint(2974, 3814, 0), WILDERNESS, "South-east of the Chaos Temple, level 37 Wilderness.", BRASSICAN_MAGE),
	WILDERNESS_38(new WorldPoint(3293, 3813, 0), WILDERNESS, "South of Callisto, level 38 Wilderness.", ANCIENT_WIZARDS),
	WILDERNESS_49(new WorldPoint(3136, 3914, 0), WILDERNESS, "South-west of the Deserted Keep, level 49 Wilderness.", BRASSICAN_MAGE),
	WILDERNESS_54(new WorldPoint(2981, 3944, 0), WILDERNESS, "West of the Wilderness Agility Course, level 54 Wilderness.", BRASSICAN_MAGE),
	ZEAH_BLASTMINE_BANK(new WorldPoint(1504, 3859, 0), ZEAH, "Next to the bank in the Lovakengj blast mine.", BRASSICAN_MAGE),
	ZEAH_BLASTMINE_NORTH(new WorldPoint(1488, 3881, 0), ZEAH, "Northern part of the Lovakengj blast mine.", BRASSICAN_MAGE),
	ZEAH_LOVAKITE_FURNACE(new WorldPoint(1507, 3819, 0), ZEAH, "Next to the lovakite furnace in Lovakengj.", ANCIENT_WIZARDS),
	ZEAH_LOVAKENGJ_MINE(new WorldPoint(1477, 3778, 0), ZEAH, "Next to mithril rock in the Lovakengj mine.", ANCIENT_WIZARDS),
	ZEAH_SULPHR_MINE(new WorldPoint(1428, 3869, 0), ZEAH, "Western entrance in the Lovakengj sulphur mine. Facemask or Slayer Helmet recommended.", BRASSICAN_MAGE),
	ZEAH_SHAYZIEN_BANK(new WorldPoint(1517, 3603, 0), ZEAH, "South-east of the bank in Shayzien.", ANCIENT_WIZARDS),
	ZEAH_OVERPASS(new WorldPoint(1467, 3714, 0), ZEAH, "Overpass between Lovakengj and Shayzien.", BRASSICAN_MAGE),
	ZEAH_LIZARDMAN(new WorldPoint(1490, 3698, 0), ZEAH, "Within Lizardman Canyon, east of the ladder. Requires 5% favour with Shayzien.", ANCIENT_WIZARDS),
	ZEAH_COMBAT_RING(new WorldPoint(1559, 3582, 0), ZEAH, "Shayzien, south-east of the Combat Ring.", BRASSICAN_MAGE),
	ZEAH_SHAYZIEN_BANK_2(new WorldPoint(1491, 3623, 0), ZEAH, "North-west of the bank in Shayzien.", ANCIENT_WIZARDS),
	ZEAH_LIBRARY(new WorldPoint(1603, 3843, 0), ZEAH, "North-west of the Arceuus Library.", BRASSICAN_MAGE),
	ZEAH_HOUSECHURCH(new WorldPoint(1682, 3792, 0), ZEAH, "By the entrance to the Arceuus church.", ANCIENT_WIZARDS),
	ZEAH_DARK_ALTAR(new WorldPoint(1698, 3881, 0), ZEAH, "West of the Dark Altar.", BRASSICAN_MAGE),
	ZEAH_ARCEUUS_HOUSE(new WorldPoint(1710, 3700, 0), ZEAH, "By the southern entrance to Arceuus.", ANCIENT_WIZARDS),
	ZEAH_ESSENCE_MINE(new WorldPoint(1762, 3852, 0), ZEAH, "By the Arceuus essence mine.", BRASSICAN_MAGE),
	ZEAH_ESSENCE_MINE_NE(new WorldPoint(1773, 3867, 0), ZEAH, "North-east of the Arceuus essence mine.", BRASSICAN_MAGE),
	ZEAH_PISCARILUS_MINE(new WorldPoint(1768, 3705, 0), ZEAH, "South of the Piscarilius mine.", ANCIENT_WIZARDS),
	ZEAH_GOLDEN_FIELD_TAVERN(new WorldPoint(1718, 3643, 0), ZEAH, "South of the gravestone in Kingstown.", BRASSICAN_MAGE),
	ZEAH_MESS_HALL(new WorldPoint(1656, 3621, 0), ZEAH, "East of the Mess hall.", ANCIENT_WIZARDS),
	ZEAH_WATSONS_HOUSE(new WorldPoint(1653, 3573, 0), ZEAH, "East of Watson's house.", ANCIENT_WIZARDS),
	ZEAH_VANNAHS_FARM_STORE(new WorldPoint(1807, 3523, 0), ZEAH, "North of Tithe Farm, next to the pond.", BRASSICAN_MAGE),
	ZEAH_FARMING_GUILD_W(new WorldPoint(1208, 3736, 0), ZEAH, "West of the Farming Guild.", BRASSICAN_MAGE),
	ZEAH_DAIRY_COW(new WorldPoint(1324, 3722, 0), ZEAH, "North-east of the Kebos Lowlands, east of the dairy cow.", BRASSICAN_MAGE),
	ZEAH_CRIMSON_SWIFTS(new WorldPoint(1187, 3580, 0), ZEAH, "South-west of the Kebos Swamp, below the crimson swifts.", BRASSICAN_MAGE);

	private final boolean beginnerClue;
	private final WorldPoint worldPoint;
	private final HotColdArea hotColdArea;
	private final String area;
	private final Enemy enemy;

	HotColdLocation(WorldPoint worldPoint, HotColdArea hotColdArea, String areaDescription, Enemy enemy)
	{
		this(false, worldPoint, hotColdArea, areaDescription, enemy);
	}

	HotColdLocation(WorldPoint worldPoint, HotColdArea hotColdArea, String areaDescription)
	{
		//only master clues have enemies, so if no enemy it is a beginner clue
		this(true, worldPoint, hotColdArea, areaDescription, null);
	}

	public Rectangle getRect()
	{
		final int digRadius = beginnerClue ? HotColdTemperature.BEGINNER_VISIBLY_SHAKING.getMaxDistance() :
			HotColdTemperature.MASTER_VISIBLY_SHAKING.getMaxDistance();
		return new Rectangle(worldPoint.getX() - digRadius, worldPoint.getY() - digRadius, digRadius * 2 + 1, digRadius * 2 + 1);
	}
}
