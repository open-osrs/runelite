/*
 * Copyright (c) 2019, ST0NEWALL
 * Copyright (c) 2020, Macweese <Macweese#1169 159941566994186240, macweese@pm.me>
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
package com.openosrs.client.game;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Getter;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.util.PvPUtil;

/*
	 * Enums sorted alphabetically by main regions (Kingdoms) and then their sub-regions or notable features
	 * Example:
	 * 	Wilderness
	 * 		Mage Bank
	 */
public enum WorldLocation
{

	/*-
	 *	Ape Atoll
	 * 		Crash Island
	 *		Marim
	 */
	APE_ATOLL_TEMPLE("Ape Atoll Temple", new Location(2784, 2802, 2810, 2770), 0),
	APE_ATOLL_GATE("Ape Atoll Gate", new Location(2712, 2761, 2730, 2749), 0),
	APE_ATOLL_GLIDER("Ape Atoll Glider", new Location(2707, 2808, 2719, 2797), 0),
	APE_ATOLL_TEAKS("Ape Atoll Teak Trees", new Location(2756, 2708, 2791, 2689), 0),
	CRASH_ISLAND("Crash Island", new Location(2881, 2749, 2943, 2691), 0),
	KRUK_DUNGEON_1("Monkey Madness 2 Dungeon", new Location(2689, 9150, 2815, 9088), 0),
	KRUK_DUNGEON_2("Monkey Madness 2 Dungeon", new Location(2689, 9150, 2815, 9088), 1),
	KRUK_DUNGEON_3("Monkey Madness 2 Dungeon", new Location(2309, 9277, 2454, 9131), 1),
	MARIM_NORTH("North Marim", new Location(2731, 2804, 2783, 2786), 0),
	MARIM_SOUTH("South Marim", new Location(2731, 2785, 2783, 2762), 0),
	MONKEY_MADNESS_DUNGEON("Monkey Madness 1 Dungeon", new Location(2689, 9150, 2815, 9088), 0),

	/*-
	 *	Asgarnia
	 *		Faldor
	 *		Burthorpe
	 *		Edgeville
	 *		Entrana
	 *		Port Sarim
	 *		Rimmington
	 *		Taverly
	 */
	ASGARNIAN_ICE_DUNGEON_WYVERNS("Asgarnian Ice Dungeon - Skeletal Wyverns", new Location(3022, 9559, 3070, 9537), 0),
	ASGARNIAN_ICE_DUNGEON_ICE_MONSTERS("Asgarnian Ice Dungeon - Ice Warriors & Ice Giants", new Location(3043, 9587, 3065, 9570), 0),
	ASGARNIAN_ICE_DUNGEON_PIRATES("Asgarnian Ice Dungeon - Pirates", new Location(2986, 9568, 2999, 9585), 0),
	BURTHOPRE_GAMES_TELEPORT("Burthorpe Games Tele", new Location(2890, 3557, 2907, 3549), 0),
	CRAFTING_GUILD("Crafting Guild", new Location(2921, 3292, 2944, 3275), 0),
	EDGEVILLE_MONASTERY("Edgeville Monastery", new Location(3044, 3507, 3060, 3471), 0),
	FALADOR_BANK("Fally Bank", new Location(2943, 3372, 2949, 3358), 0),
	FALADOR_CENTER("Fally Center", new Location(2959, 3385, 2972, 3374), 0),
	FALADOR_EAST_BANK("Fally East Bank", new Location(3008, 3358, 3021, 3353), 0),
	FALADOR_FARM("Falador Farm", new Location(3014, 3314, 3067, 3283), 0),
	FALADOR_PARK("Fally Park", new Location(2982, 3390, 3025, 3368), 0),
	FALADOR_PARTYROOM("Falador Partyroom", new Location(3035, 3386, 3056, 3370), 0),
	FALADOR_RESPAWN("Fally Respawn", new Location(2957, 3355, 2998, 3325), 0),
	GOBLIN_VILLAGE("Goblin Village", new Location(2948, 3516, 2963, 3493), 0),
	HEROES_GUILD("Heroes' Guild", new Location(2881, 3517, 2902, 3504), 0),
	HEROES_GUILD_DUNGEON("Heroes' Guild Dungeon", new Location(2885, 9918, 2945, 9882), 0),
	ICE_MOUNTAIN("Ice Mountain", new Location(3001, 3508, 3024, 3463), 0),
	MIND_ATLAR("Mind Altar", new Location(2970, 3520, 2990, 3509), 0),
	MUDSKIPPER_POINT("Mudskipper point", new Location(2980, 3145, 3011, 3104), 0),
	PORT_SARIM("Port Sarim", new Location(3024, 3250, 3055, 3192), 0),
	PORT_SARIM_JAIL("Port Sarim Jail", new Location(3009, 3193, 3021, 3178), 0),
	RIMMINGTON("Rimmington", new Location(2946, 3213, 2970, 3188), 0),
	RIMMINGTON_DOCKS("Rimmington Docks", new Location(2905, 3228, 2922, 3222), 0),
	RIMMINGTON_MINE("Rimmington Mine", new Location(2968, 3252, 2991, 3230), 0),
	RIMMINGTON_PORTAL("Rimmington Portal", new Location(2946, 3228, 2960, 3218), 0),
	ROGUES_DEN("Rogue's Den", new Location(3036, 4957, 3067, 4986), 1),
	TAVERLY("Taverly", new Location(2880, 3442, 2917, 3409), 0),
	TAVERLY_DUNGEON_BLACK_KNGIHTS("Taverly Dungeon - Black Knights", new Location(2883, 9717, 2939, 9667), 0),
	TAVERLY_DUNGEON_HILL_GIANTS("Taverly Dungeon - Hill Giants", new Location(2895, 9743, 2920, 9718), 0),
	TAVERLY_DUNGEON_BLACK_DRAGONS("Taverly Dungeon - Black Dragons", new Location(2812, 9836, 2846, 9822), 0),
	TAVERLY_DUNGEON_HELLHOUNDS("Taverly Dungeon - Hell Hounds", new Location(2847, 9854, 2873, 9822), 0),
	TAVERLY_DUNGEON_BLUE_DRAGONS("Taverly Dungeon - Blue Dragons", new Location(2890, 9778, 2923, 9813), 0),
	TAVERLY_DUNGEON_BLACK_DEMONS("Taverly Dungeon - Black Demons", new Location(2844, 9800, 2873, 9773), 0),
	TAVERLY_DUNGEON_POISON_SPIDERS("Taverly Dungeon - Poison Spiders", new Location(3010, 4756, 3068, 4803), 0),
	TAVERLY_DUNGEON_CHAOS_DRUIDS("Taverly Dungeon - Chaos Druids", new Location(2915, 9856, 2944, 9833), 0),
	TAVERLY_DUNGEON_LESSER_DEMONS("Taverly Dungeon - Lesser Demons", new Location(2924, 9813, 2946, 9777), 0),
	TAVERLY_DUNGEON_MAGIC_AXES("Taverly Dungeon - Magic Axes", new Location(2947, 9798, 2971, 9769), 0),
	TAVERLY_DUNGEON_CHAOS_DWARVES("Taverly Dungeon - Chaos Dwarves", new Location(2920, 9776, 2938, 9745), 0),
	TAVERLY_DUNGEON_MAIN_CORRIDOR("Taverly Dungeon - Main Corridor", new Location(2880, 9793, 2889, 9850), 0),
	TAVERLY_GATE("Taverly Gate", new Location(2931, 3456, 2944, 3444), 0),
	TAVERLY_POH_PORTAL("Taverly POH Portal", new Location(2885, 3471, 2899, 3458), 0),
	WARRIORS_GUILD("Warriors' Guild", new Location(2838, 3536, 2876, 3555), 0),
	WARRIORS_GUILD_BASEMENT("Warriors' Guild Basement (Dragon Defender)", new Location(2904, 9974, 2941, 9956), 0),

	/*-
	 *	Entrana
	 */
	ENTRANA_BALLOON("Entrana Balloon", new Location(2803, 3359, 2815, 3347), 0),
	ENTRANA_CHURCH("Entrana Church", new Location(2840, 3356, 2858, 3341), 0),
	ENTRANA_DOCKS("Entrana Docks", new Location(2825, 3338, 2847, 3328), 0),
	ENTRANA_NORTH("Entrana (North Portion)", new Location(2541, 2875, 2595, 2837), 0),

	/*-
	 *	Feldip Hills
	 *		Corsair Cove
	 * 		Gu'Tanoth
	 */
	CORSAIR_COVE("Corsair Cove", new Location(2541, 2875, 2595, 2837), 0),
	CORSAIR_RESOURCE_AREA("Corsair Resource Area", new Location(2453, 2905, 2488, 2883), 0),
	FELDIP_HILLS_GLIDER("Feldip Hills Glider", new Location(2536, 2975, 2546, 2965), 0),
	FELDIP_HILLS_RED_CHINS("Feldip Hills Red Chins", new Location(2525, 2935, 2561, 2902), 0),
	GU_TANOTH("Gu'Tanoth", new Location(2497, 3060, 2558, 3008), 0),
	MYTHS_GUILD("Myth's Guild", new Location(2470, 2872, 2442, 2834), 0),

	/*
	 * Fossil Island
	 */
	MUSEUM_CAMP("Fossil Island Museum Camp", new Location(3708, 3797, 3751, 3833), 0),
	FOSSIL_ISLAND_HOUSE_ON_THE_HILL("House on the Hill (Fossil Island)", new Location(3747, 3891, 3795, 3855), 0),
	FOSSIL_ISLAND_MUSHROOM_FOREST("Fossil Island Mushroom Forest (Herbiboar)", new Location(3670, 3894, 3707, 3814), 0),
	FOSSIL_ISLAND_SWAMP_NORTH("Fossil Island Swamp (North half)", new Location(3707, 3758, 3643, 3696), 0),
	FOSSIL_ISLAND_SWAMP_SOUTH("Fossil Island Swamp (South half)", new Location(3707, 3813, 3643, 3759), 0),
	FOSSIL_ISLAND_VERDANT_VALLEY("Fossil Island Verdant Valley (South East Island)", new Location(3670, 3894, 3707, 3814), 0),
	FOSSIL_ISLAND_VOLCANO_BANK("Fossil Island Volcano Bank", new Location(3807, 3818, 3825, 3800), 0),

	/*-
	 *	Fremennik Province
	 * 		Fremennik Isles (Neitiznot & Jatizo)
	 * 		Fremennik Slayer Dungeon
	 * 		Lunar Isle
	 * 		Miscellania and Etceteria
	 * 		Rellekka
	 * 		Waterbirth Island
	 */
	ETCETERIA("Etceteria", new Location(2626, 3904, 2571, 3861), 0),
	ETCETERIA_DOCKS("Etceteria Docks", new Location(2571, 3904, 2626, 3861), 0),
	FREMENNIK_BASILISK_KNIGHT_DUNGEON("Fremennik Basilisk Knight Dungeon", new Location(2398, 10468, 2496, 10370), 0),
	FREMENNIK_SLAYER_DUNGEON("Fremennik Slayer Dungeon", new Location(2771, 10023, 2811, 9989), 0),
	FREMENNIK_SLAYER_DUNGEON_BASILISKS("Fremennik Slayer Dungeon - Baslisks", new Location(2734, 10015, 2751, 9988), 0),
	FREMENNIK_SLAYER_DUNGEON_ENTRANCE("Fremennik Slayer Dungeon Entrance", new Location(2776, 3604, 2801, 3626), 0),
	FREMENNIK_SLAYER_DUNGEON_JELLIES("Fremennik Slayer Dungeon - Jellies", new Location(2694, 10035, 2733, 10016), 0),
	FREMENNIK_SLAYER_DUNGEON_KURASKS("Fremennik Slayer Dungeon - Kurasks", new Location(2708, 10007, 2690, 9988), 0),
	FREMENNIK_SLAYER_DUNGEON_PYREFIENDS("Fremennik Slayer Dungeon - Pyrefiends", new Location(2752, 10015, 2770, 9988), 0),
	FREMENNIK_SLAYER_DUNGEON_TUROTHS("Fremennik Slayer Dungeon - Turoths", new Location(2709, 10015, 2733, 9988), 0),
	JATIZSO("Jatizso", new Location(2369, 3826, 2428, 3776), 0),
	KELDAGRIM_EAST("Eastern Keldagrim", new Location(2884, 10236, 2943, 10181), 0),
	KELDAGRIM_ENTRANCE("Keldagrim Entrance", new Location(2722, 3720, 2738, 3703), 0),
	KELDAGRIM_WEST("Western Keldagrim", new Location(2819, 10236, 2875, 10182), 0),
	LUNAR_ISLE_CENTRAL("Lunar Isle Central", new Location(2055, 3933, 2112, 3888), 0),
	LUNAR_ISLE_EAST("Lunar Isle East", new Location(2113, 3921, 2185, 3888), 0),
	LUNAR_ISLE_NORTH("Lunar Isle North", new Location(2063, 3958, 2112, 3934), 0),
	LUNAR_ISLE_NORTH_EAST("Lunar Isle North East", new Location(2113, 3958, 2185, 3922), 0),
	LUNAR_ISLE_SOUTH("Lunar Isle South", new Location(2057, 3887, 2112, 3843), 0),
	LUNAR_ISLE_SOUTHEAST("Lunar Isle SouthEast", new Location(2113, 3887, 2185, 3843), 0),
	MISCELLANIA("Miscellania", new Location(2492, 3904, 2570, 3836), 0),
	MISCELLANIA_DOCKS("Miscellania Docks", new Location(2623, 3851, 2603, 3840), 0),
	MOUNTAIN_CAMP("Mountain Camp", new Location(2789, 3682, 2813, 3658), 0),
	NEITIZNOT("Neitiznot", new Location(2300, 3826, 2368, 3776), 0),
	PIRATES_COVE("Pirate's Cove", new Location(2186, 3842, 2228, 3785), 0),
	RELLEKKA_MAIN_HALL("Rellekka Main Hall", new Location(2652, 3685, 2670, 3658), 0),
	RELLEKKA_MARKET("Rellekka Market", new Location(2629, 3682, 2651, 3654), 0),
	RELLEKKA_NORTH_DOCKS("Rellekka North Docks", new Location(2640, 3712, 2651, 3706), 0),
	RELLEKKA_NORTH_EAST("Rellekka North East", new Location(2652, 3712, 2690, 3686), 0),
	RELLEKKA_POH_PORTAL("Rellekka POH Portal", new Location(2662, 3635, 2676, 3624), 0),
	RELLEKKA_SOUTH_DOCKS("Rellekka South Docks", new Location(2619, 3699, 2641, 3681), 0),
	RELLEKKA_ZONE("Rellekka", new Location(2600, 3708, 2690, 3645), 0),
	ROCK_CRABS_EAST("Rock Crabs East (Near Keldagrim)", new Location(2691, 3738, 2730, 3713), 0),
	ROCK_CRABS_WEST("Rock Crabs West (North of Rellekka)", new Location(2650, 3738, 2690, 3713), 0),
	VORKATH("Vorkath", new Location(2237, 4096, 2301, 4031), 0),
	WATERBIRTH_DUNGEON_ROCK_LOBSTERS("Waterbirth Dungeon - Rock Lobsters", new Location(1875, 4380, 1919, 4412), 0),
	WATERBIRTH_DUNGEON_DKS_1("DKS", new Location(2886, 4473, 2941, 4424), 0), // One of these is private, not sure which
	WATERBIRTH_DUNGEON_DKS_2("DKS", new Location(2886, 4409, 2941, 4361), 0), // One of these is private, not sure which
	WATERBIRTH_DUNGEON_ZONE_1("Waterbirth Dungeon", new Location(2435, 10176, 2558, 10112), 0),
	WATERBIRTH_DUNGEON_ZONE_2("Waterbirth Dungeon", new Location(1788, 4413, 1966, 4352), 1),
	WATERBIRTH_ISLAND("Waterbirth Island", new Location(2494, 3774, 2562, 3710), 0),

	/*-
	 *	Great Kourend
	 *		Arceuus
	 * 		Battlefront
	 * 		Catacombs of Kourend
	 * 		Crabclaw Caves
	 * 		Forthos Dungeon
	 * 		Hosidius
	 * 		Kebos Lowlands
	 * 		Kingstown
	 * 		Kourend Woodland
	 * 		Lake Molch
	 * 		Lizardman Settlement
	 * 		Lovakengj
	 * 		Mount Karuulm
	 * 		Mount Quidamortem
	 * 		Northern Tundras
	 * 		Port Piscarilius
	 * 		Shayzien
	 * 		Wintertodt
	 */
	ARCEUUS("Arceuus", new Location(1620, 3780, 1739, 3708), 0),
	ARCEUUS_BANK("Arceuus Bank", new Location(1620, 3754, 1639, 3735), 0),
	ARCEUUS_DENSE_ESSENCE_MINE("Arceuus Dense Essence Mine", new Location(1741, 3880, 1786, 3831), 0),
	ARCEUUS_LIBRARY("Arceuus Library", new Location(1605, 3833, 1662, 3781), 0),
	BATTLEFRONT("Battlefront Teleport", new Location(1344, 3745, 1362, 3726), 0),
	BLAST_MINE("Lovakengj Blast Mine", new Location(1467, 3888, 1513, 3840), 0),
	BLOOD_ALTAR("Blood Altar", new Location(1710, 3835, 1737, 3822), 0),
	CHASM_OF_FIRE("Chasm of Fire", new Location(1411, 10108, 1468, 10050), 1),
	COX("CoX", new Location(1226, 3574, 1270, 3559), 0),
	CRAB_CLAW_ISLE("Crab Claw Isle", new Location(1745, 3449, 1795, 3399), 0),
	DARK_ALTAR("Arceuus Dark Altar", new Location(1699, 3895, 1734, 3869), 0),
	FARMING_GUILD("Farming Guild", new Location(1223, 3718, 1273, 3765), 0),
	FISHING_HAMLET("Fishing Hamlet (East of Wintertodt Camp)", new Location(1683, 3969, 1720, 3917), 0),
	FOODHALL("Piscarilius Foodhall", new Location(1830, 3762, 1854, 3734), 0),
	FORTHOS_RUINS("Forthos Ruins", new Location(1666, 3590, 1684, 3561), 0),
	FORTHOS_DUNGEON_ALTAR("Forthos Dungeon - Altar", new Location(1794, 9954, 1804, 9946), 0),
	FORTHOS_DUNGEON_GRUBBY_CHEST("Forthos Dungeon - Grubby Chest", new Location(1793, 9928, 1799, 9922), 0),
	FORTHOS_DUNGEON_LADDER_EAST("Forthos Dungeon - East Ladder", new Location(1825, 9978, 1835, 9969), 0),
	FORTHOS_DUNGEON_LADDER_WEST("Forthos Dungeon - West Ladder", new Location(1795, 9972, 1805, 9958), 0),
	FORTHOS_DUNGEON_RED_DRAGONS("Forthos Dungeon - Red Dragons", new Location(1807, 9944, 1828, 9933), 0),
	FORTHOS_DUNGEON_SARACHNIS("Forthos Dungeon - Sarachnis", new Location(1829, 9890, 1854, 9913), 0),
	FORTHOS_DUNGEON_SPIDERS("Forthos Dungeon - Red Spiders", new Location(1830, 9968, 1848, 9947), 0),
	FORTHOS_DUNGEON_UNDEAD_DRUIDS_1("Forthos Dungeon - Undead Druids", new Location(1795, 9944, 1806, 9933), 0),
	FORTHOS_DUNGEON_UNDEAD_DRUIDS_2("Forthos Dungeon - Undead Druids", new Location(1806, 9973, 1814, 9958), 0),
	FORTHOS_DUNGEON_ZONE("Forthos Dungeon", new Location(1789, 9985, 1858, 9914), 0),
	HOSIDIUS_BANK("Hosidius Bank", new Location(1743, 3603, 1753, 3594), 0),
	HOSIDIUS_FRUIT_STALLS("Hosidius Fruit Stalls", new Location(1790, 3614, 1806, 3603), 0),
	HOSIDIUS_KITCHEN("Hosidius Kitchen (Bank)", new Location(1671, 3625, 1687, 3610), 0),
	HOSIDIUS_PLOW_FIELD("Hosidius Plow Fields", new Location(1761, 3558, 1781, 3519), 0),
	HOSIDIUS_POH_PORTAL("Hosidius POH Portal", new Location(1735, 3522, 1747, 3511), 0),
	HOSIDIUS_SQUARE("Hosidius Square", new Location(1754, 3607, 1772, 3589), 0),
	HOSIDIUS_VINERY("Hosidius Vinery", new Location(1799, 3573, 1816, 3537), 0),
	HOSIDIUS_ZONE("Hosidius", new Location(1737, 3627, 1789, 3582), 0),
	KOUREND_CASTLE("Kourend Castle", new Location(1592, 3700, 1692, 3646), 0),
	KOUREND_CATACOMBS_ABYSSAL_DEMONS("Kourend Catacombs - Abyssal Demons", new Location(1667, 10101, 1683, 10082), 0),
	KOUREND_CATACOMBS_BLACK_DEMONS("Kourend Catacombs - Black Demons", new Location(1713, 10073, 1724, 10086), 0),
	KOUREND_CATACOMBS_BRUTAL_BLACK_DRAGONS("Kourend Catacombs - Brutal Black Dragons", new Location(1604, 10105, 1635, 10068), 0),
	KOUREND_CATACOMBS_CENTER("Kourend Catacombs Center", new Location(1655, 10055, 1670, 10038), 0),
	KOUREND_CATACOMBS_DUST_DEVILS("Kourend Catacombs - Dust Devils", new Location(1704, 10037, 1734, 9985), 0),
	KOUREND_CATACOMBS_GREATER_DEMONS("Kourend Catacombs - Greater Demons", new Location(1684, 10105, 1724, 10087), 0),
	KOUREND_CATACOMBS_NECHRYAELS("Kourend Catacombs - Nechryaels", new Location(1684, 10086, 1712, 10073), 0),
	KOUREND_CATACOMBS_SOUTH("Kourend Catacombs - South", new Location(1639, 10014, 1702, 9985), 0),
	KOUREND_CATACOMBS_SOUTH_WEST("Kourend Catacombs South-West Corner", new Location(1596, 10028, 1634, 9984), 0),
	KOUREND_CATACOMBS_STEEL_DRAGONS("Kourend Catacombs - Steel Dragons", new Location(1599, 10066, 1630, 10029), 0),
	KOUREND_CATACOMBS_ZONE("Kourend Catacombs", new Location(1595, 10106, 1735, 9984), 0),
	LANDS_END("Land's End", new Location(1481, 3448, 1527, 3396), 0),
	LAKE_MOLCH("Lake Molch", new Location(1357, 3643, 1377, 3624), 0),
	LIZARDMAN_SHAMANS("Lizardman Shamans", new Location(1414, 3726, 1461, 3688), 0),
	LOVAKENGJ("Lovakengj", new Location(1425, 3810, 1520, 3730), 0),
	MOUNT_KARUULM("Mount Karuulm", new Location(1287, 3829, 1331, 3787), 0),
	PISCARILIUS_ANGLERFISH("Piscarilius Angler Fishing Spot", new Location(1807, 3779, 1842, 3766), 0),
	PISCARILIUS_BANK("Piscarilius Bank", new Location(1793, 3794, 1812, 3782), 0),
	PISCARILIUS_PORT("Port Piscarilius", new Location(1788, 3712, 1849, 3673), 0),
	PISCARILIUS_ZONE("Piscarilius", new Location(1740, 3814, 1854, 3713), 0),
	SANDCRABS_BANK("Sandcrabs Bank", new Location(1706, 3475, 1730, 3455), 0),
	SANDCRABS_NORTH("Sandcrabs (East of Vinery)", new Location(1848, 3572, 1884, 3532), 0),
	SANDCRABS_SOUTH_1("Sandcrabs (South of Tithe Farm)", new Location(1796, 3468, 1849, 3436), 0),
	SANDCRABS_SOUTH_2("Sandcrabs (South Coast)", new Location(1745, 3474, 1795, 3450), 0),
	SANDCRABS_SOUTH_EAST("Sandcrabs (East of Tithe Farm)", new Location(1850, 3529, 1884, 3465), 0),
	SHAYZIEN_BANK("Shayzien Bank", new Location(1494, 3622, 1515, 3611), 0),
	SHAYZIEN_CRYPTS_ENTRANCE("Shayzien Crypts Entrance", new Location(1474, 3570, 1502, 3535), 0),
	SHAYZIEN_INFIRMARY("Shayzien Infirmary", new Location(1565, 3574, 1590, 3604), 0),
	SHAYZIEN_ZONE("Shayzien", new Location(1472, 3644, 1591, 3521), 0),
	SOUL_ALTAR("Soul Altar", new Location(1804, 3869, 1834, 3841), 0),
	SULPHUR_MINE("Lovakengj Sulphur Mine", new Location(1415, 3888, 1466, 3840), 0),
	SULPHUR_MINE_BANK("Lovakengj Sulphur Mine Bank", new Location(1430, 3838, 1443, 3817), 0),
	TITHE_FARM("Tithe Farm", new Location(1794, 3480, 1841, 3517), 0),
	WINTERTODT_CAMP("Wintertodt Camp", new Location(1616, 3963, 1645, 3932), 0),
	WINTERTODT_ENTRANCE("Wintertodt Entrance", new Location(1617, 3986, 1641, 3964), 0),
	WINTERTODT_NORTHEAST("Wintertodt NorthEast", new Location(1630, 4027, 1651, 4008), 0),
	WINTERTODT_NORTHWEST("Wintertodt NorthWest", new Location(1608, 4028, 1629, 4008), 0),
	WINDERTODT_SOUTH_EAST("Windertodt South East", new Location(1630, 4007, 1651, 3987), 0),
	WINTERTODT_SOUTHWEST("Wintertodt SouthWest", new Location(1608, 4007, 1629, 3987), 0),
	WOODCUTTING_GUILD_BANK("Woodcutting Guild Bank", new Location(1588, 3481, 1594, 3473), 0),
	WOODCUTTING_GUILD_EAST("Woodcutting Guild (East Portion)", new Location(1623, 3519, 1657, 3488), 0),
	WOODCUTTING_GUILD_WEST("Woodcutting Guild (Redwoods)", new Location(1562, 3503, 1586, 3476), 0),
	WOODCUTTING_GUILD_ZONE("Woodcutting Guild", new Location(1560, 3520, 1659, 3471), 0),

	/*-
	 *	Kandarin
	 * 		Ardougne
	 * 		Battlefield
	 * 		Camelot
	 * 		Catherby
	 * 		Fishing Guild & McGrubor's Woods
	 * 		Observatory
	 * 		Ourania
	 * 		Piscatoris Fishing Colony
	 * 		Port Khazard
	 * 		Seers' Village
	 * 		Tree Gnome Stronghold
	 * 		Tree Gnome Village
	 * 		Witchaven
	 * 		Yanille
	 */
	ARDOUGNE_CASTLE("Ardy Castle", new Location(2567, 3311, 2591, 3283), 0),
	ARDOUGNE_DOCKS("Ardy Docks", new Location(2660, 3284, 2689, 3264), 0),
	ARDOUGNE_MONASTERY("Ardougne Monastery", new Location(2587, 3227, 2623, 3202), 0),
	ARDOUGNE_NORTH_BANK("Ardy North Bank", new Location(2611, 3336, 2622, 3329), 0),
	ARDOUGNE_SOUTH_BANK("Ardy South Bank", new Location(2645, 3288, 2659, 3279), 0),
	ARDOUGNE_STALLS("Ardy Stalls", new Location(2651, 3318, 2673, 3293), 0),
	ARDOUGNE_ZOO("Ardy Zoo", new Location(2598, 3288, 2636, 3265), 0),
	BARBARIAN_OUTPOST("Barbarian Outpost", new Location(2517, 3580, 2557, 3540), 0),
	BAXTORIAN_WATERFALL_DUNGEON("Waterfall Dungeon (Baxtorian Falls)", new Location(2556, 9861, 2594, 9918), 0),
	CAMELOT_CASTLE("Camelot Castle", new Location(2743, 3481, 2775, 3468), 0),
	CASTLE_WARS_BANK("Castle Wars Bank", new Location(2435, 3100, 2448, 3078), 0),
	CASTLE_WARS_ZONE("Castle Wars", new Location(2435, 3127, 2474, 3074), 0),
	CATHERBY("Catherby", new Location(2791, 3457, 2833, 3436), 0),
	CATHERBY_DOCKS("Catherby Docks", new Location(2790, 3432, 2808, 3409), 0),
	CATHERBY_FISHING_SPOTS("Catherby Fishing Spots", new Location(2834, 3441, 2862, 3425), 0),
	CATHERBY_FARMING_PATCH("Catherby Farming Patch", new Location(2791, 3472, 2833, 3458), 0),
	EAGLES_PEAK("Eagles' Peak", new Location(2308, 3495, 2350, 3479), 0),
	FALCONRY_HUNTING_AREA("Falconry Hunting Area", new Location(2365, 3621, 2390, 3572), 0),
	FISHING_GUILD("Fishing Guild", new Location(2627, 3426, 2579, 3391), 0),
	FISHING_PLATFORM("Fishing Platform", new Location(2763, 3290, 2792, 3273), 0),
	GNOME_AGILITY("Gnome Agility", new Location(2469, 3441, 2489, 3412), 0),
	GNOME_BALL("Gnome Ball", new Location(2384, 3495, 2408, 3479), 0),
	GRAND_TREE("Grand Tree", new Location(2442, 3515, 2490, 3478), 0),
	KRAKEN_COVE_DUNGEON("Kraken Dungeon", new Location(2303, 10047, 2240, 9983), 0),
	KRAKEN_COVE_ENTRANCE("Kraken Cove Entrance", new Location(2262, 3623, 2295, 3596), 0),
	LEGENDS_GUILD("Legends' Guild", new Location(2716, 3388, 2741, 3346), 0),
	LEGENDS_GUILD_DUNGEON("Legends' Guild Dungeon", new Location(2690, 9784, 2740, 9730), 0),
	LIGHTHOUSE("Lighthouse", new Location(2494, 3649, 2524, 3616), 0),
	MCGRUBORS_WOODS("McGrubor's Woods", new Location(2624, 3501, 2647, 3481), 0),
	NIEVE("Nieve", new Location(2430, 3425, 2435, 3419), 0),
	NIGHTMARE_ZONE("Nightmare Zone", new Location(2599, 3119, 2614, 3111), 0),
	OBSERVATORY("Observatory", new Location(2429, 3198, 2452, 3149), 0),
	OBSERVATORY_DUNGEON("Obsvervatory Dungeon", new Location(2305, 9406, 2366, 9344), 0),
	OTTOS_GROTTO("Barbarian Fishing", new Location(2491, 3519, 2527, 3488), 0),
	OURANIA_CAVE("ZMI", new Location(3006, 5567, 3072, 5634), 0),
	THE_OUTPOST("The Outpost", new Location(2428, 3356, 2443, 3338), 0),
	PISCATORIS_FISHING_COLONY("Piscatoris Fishing Colony", new Location(2302, 3708, 2364, 3653), 0),
	PORT_KHAZARD("Port Khazard", new Location(2624, 3182, 2680, 3143), 0),
	RANGING_GUILD("Ranging Guild", new Location(2650, 3445, 2685, 3411), 0),
	RED_SALAMANDERS("Red Salamanders", new Location(2441, 3229, 2464, 3204), 0),
	SEERS_VILLAGE("Seers Village", new Location(2688, 3498, 2742, 3468), 0),
	SINCLAIR_MANSION("Sinclair Mansion", new Location(2723, 3584, 2756, 3552), 0),
	SMOKE_DEVIL_DUNGEON("CW Smoke Devil Dungeon", new Location(2379, 9467, 2427, 9415), 0),
	SMOKE_DEVIL_DUNGEON_BOSS("CW Smoke Dungeon (Boss Room)", new Location(2347, 9462, 2377, 9438), 0),
	SMOKE_DEVIL_DUNGEON_ENTRANCE("Smoke Devil Dungeon Entrance", new Location(2430, 3425, 2435, 3419), 0),
	TRAINING_GROUND("Training Ground (Caged Ogres)", new Location(2501, 3387, 2534, 3358), 0),
	TREE_GNOME_VILLAGE("Tree Gnome Village", new Location(2514, 3175, 2547, 3158), 0),
	WEST_ARDOUGNE("West Ardy", new Location(2452, 3336, 2557, 3265), 0),
	WITCHAVEN("Witchaven", new Location(2704, 3267, 2741, 3295), 0),
	WITCHAVEN_DUNGEON("Witchaven Dungeon", new Location(2750, 9665, 2690, 9719), 0),
	WIZARDS_GUILD("Wizards Guild", new Location(2585, 3092, 2596, 3082), 0),
	WHITE_WOLF_MOUNTAIN_GNOME_GLIDER("White Wolf Mountain Gnome Glider", new Location(2838, 3509, 2852, 3496), 0),
	YANILLE_AGILITY_DUNGEON("Yanille Agilty Dungeon", new Location(2559, 9536, 2624, 9475), 0),
	YANILE_BANK("Yanile Bank", new Location(2608, 3097, 2616, 3087), 0),
	YANILLE_EAST("Yanille East", new Location(2576, 3110, 2621, 3071), 0),
	YANILLE_POH_PORTAL("Yanille POH Portal", new Location(2537, 3108, 2551, 3091), 0),
	YANILLE_WEST("Yanille West", new Location(2532, 3110, 2575, 3071), 0),

	/*-
	 *	Karamja
	 *		Brimhaven
	 * 		Cairn Isle
	 * 		Crandor & Karamja Dungeon
	 * 		Kharazi Jungle
	 * 		Mor Ul Rel (TzHaar City)
	 * 		Musa Point
	 * 		Shilo Village
	 * 		Ship Yard
	 * 		Tai Bwo Wannai
	 */
	BRIMHAVEN_AGILITY_ARENA("Brimhaven Agility Arena", new Location(2757, 9594, 2809, 9541), 3),
	BRIMHAVEN_DOCKS("Brimhaven Docks", new Location(2758, 3241, 2777, 3220), 0),
	BRIMHAVEN_DUNGEON("Brimhaven Dungeon - Main Corridor", new Location(2690, 9572, 2714, 9556), 0),
	BRIMHAVEN_DUNGEON_BLACK_DEMONS("Brimhaven Dungeon - Black Demons", new Location(2694, 9495, 2726, 9475), 0),
	BRIMHAVEN_DUNGEON_BRONZE_DRAGONS("Brimhaven Dungeon - Bronze Dragons", new Location(2727, 9504, 2750, 9475), 0),
	BRIMHAVEN_DUNGEON_DOGS("Brimhaven Dungeon - Dogs", new Location(2653, 9530, 2675, 9509), 0),
	BRIMHAVEN_DUNGEON_FIRE_GIANTS("Brimhaven Dungeon - Fire Giants", new Location(2638, 9506, 2673, 9476), 0),
	BRIMHAVEN_DUNGEON_METAL_DRAGONS_SLAYER("Brimhaven Dungeon - Metal Dragons (Slayer Only)", new Location(2626, 9469, 2685, 9409), 0),
	BRIMHAVEN_DUNGEON_METAL_DRAGONS("Brimhaven Dungeon - Metal Dragons", new Location(2693, 9469, 2748, 9412), 0),
	BRIMHAVEN_DUNGEON_MOSS_GIANTS("Brimhaven Dungeon - Moss Giants", new Location(2630, 9575, 2670, 9531), 0),
	BRIMHAVEN_DUNGEON_RED_DRAGONS("Brimhaven Dungeon - Red Dragons", new Location(2686, 9553, 2726, 9496), 0),
	BRIMHAVEN_POH_PORTAL("Brimhaven POH Portal", new Location(2749, 3184, 2765, 3170), 0),
	CAIRN_ISLE("Cairn Isle", new Location(2752, 2993, 2775, 2963), 0),
	CRANDOR("Crandor", new Location(2813, 3310, 2864, 3231), 0),
	HARDWOOD_GROVE("Hardwood Grove", new Location(2815, 3092, 2830, 3073), 0),
	KARAMBWAN_FISHING_SPOT("Karambwan Fishing Spot", new Location(2896, 3116, 2920, 3104), 0),
	KARAMJA_DOCKS("Karamja Docks", new Location(2813, 3310, 2864, 3231), 0),
	KARAMJA_GLORY_TELEPORT("Karamja Glory Tele", new Location(2910, 3177, 2934, 3156), 0),
	KARAMJA_GNOME_GLIDER("Karamja Gnome Glider", new Location(2961, 2960, 2984, 2983), 0),
	KARAMJA_SHIP_YARD("Karamja Ship Yard", new Location(2949, 3066, 3004, 3016), 0),
	KARAMJA_VOLCANO("Karamja Volcano", new Location(2828, 3194, 2866, 3157), 0),
	KARAMJA_VOLCANO_DUNGEON("Karamja Dungeon", new Location(2827, 9589, 2866, 9549), 0),
	KARAMJA_VOLCANO_DUNGEON_ELVARG("Karamja Dungeon (Elvarg)", new Location(2826, 9661, 2868, 9603), 0),
	KHARAZI_JUNGLE_EAST("Kharazi Jungle (Eastern Section)", new Location(2905, 2930, 2976, 2883), 0),
	KHARAZI_JUNGLE_CENTER("Kharazi Jungle (Middle Section)", new Location(2816, 2930, 2905, 2883), 0),
	KHARAZI_JUNGLE_WEST("Kharazi Jungle (Western Section)", new Location(2756, 2930, 2816, 2883), 0),
	MOR_UL_REK_BANK("TzHaar Bank (Inferno)", new Location(2534, 5146, 2547, 5133), 0),
	NATURE_ALTAR("Nature Altar", new Location(2841, 3025, 2846, 3020), 0),
	SHILO_VILLAGE_NORTH("Shilo Village North", new Location(2817, 3006, 2878, 2973), 0),
	SHILO_VILLAGE_SOUTH("Shilo Village South", new Location(2816, 2972, 2879, 2944), 0),
	TAI_BWO_WANNAI("Tai Bwo Wannai", new Location(2770, 3105, 2830, 3050), 0),
	TZHAAR_BANK("TzHaar Bank (Jad)", new Location(2437, 5184, 2452, 5172), 0),
	TZHAAR_EXIT("Tzhaar City Exit", new Location(2471, 5179, 2490, 5162), 0),
	TZHAAR_FIGHT_PITS("TzHaar Fight Pit", new Location(2396, 5183, 2403, 5174), 0),
	TZHAAR_INNER_SOUTH_EAST("Tzhaar Inner City South-East", new Location(2499, 5112, 2559, 5057), 0),
	TZHAAR_INNER_SOUTH_WEST("Tzhaar Inner City South-West", new Location(2444, 5112, 2499, 5058), 0),

	/*-
	 *	Kharidian Desert
	 * 		Agility Pyramid
	 *		Al Kharid
	 * 		Bandit Camp (Desert)
	 * 		Bedabin Camp
	 * 		Citharede Abbey
	 * 		Duel Arena
	 * 		Nardah
	 * 		Pollnivneach
	 * 		Smoke Dungeon
	 * 		Sophanem
	 * 		Uzer
	 */
	AGILITY_PYRAMID("Agility Pyramid", new Location(3334, 2864, 3386, 2819), 0),
	AL_KHARID_BANK("Al Kharid Bank", new Location(3265, 3173, 3272, 3161), 0),
	AL_KHARID_GATE("Al Kharid Gate", new Location(3263, 3232, 3271, 3223), 0),
	AL_KHARID_GLIDER("Al Kharid_Glider", new Location(3276, 3214, 3283, 3209), 0),
	AL_KHARID_MINE("Al Kharid Mine", new Location(3295, 3316, 3303, 3278), 0),
	AL_KHARID_PALACE("Al Kharid Palace", new Location(3281, 3178, 3304, 3158), 0),
	BEDABIN_CAMP("Bedabin Camp", new Location(3157, 3052, 3188, 3019), 0),
	CITHAREDE_ABBEY("Citharede Abbey", new Location(3355, 3190, 3425, 3150), 0),
	DESERT_BANDIT_CAMP("Desert Bandit Camp", new Location(3154, 2993, 3189, 2963), 0),
	DESERT_QUARRY("Desert Granite Quarry", new Location(3156, 2928, 3184, 2897), 0),
	DUEL_ARENA("Duel Arena", new Location(3338, 3252, 3391, 3204), 0), // This polygon is deliberately offset
	DUEL_ARENA_BANK("Duel Arena Bank", new Location(3379, 3274, 3386, 3265), 0),
	DUEL_ARENA_PALM_TREES("Duel Arena Palm Trees", new Location(3340, 3280, 3354, 3264), 0),
	DUEL_ARENA_TELEPORT("Duel Arena Tele", new Location(3308, 3246, 3326, 3225), 0),
	FIRE_ALTAR("Fire Altar", new Location(3301, 3256, 3307, 3250), 0),
	KALPHITE_LAIR("Kalphite Lair Entrance", new Location(3205, 3124, 3253, 3082), 0),
	NARDAH_BANK("Nardah Bank", new Location(3417, 2902, 3437, 2883), 0),
	NARDAH_ZONE("Nardah", new Location(3397, 2942, 3453, 2882), 0),
	POLLNIVNEACH("Pollnivneach", new Location(3331, 2990, 3379, 2945), 0),
	POLLNIVNEACH_POH_PORTAL("Pollnivneach POH Portal", new Location(3333, 3008, 3346, 2995), 0),
	POLLNIVNEACH_SMOKE_DUNGEON("Pollnivneach Smoke Dungeon", new Location(3199, 9404, 3327, 9345), 0),
	POLLNIVNEACH_SMOKE_DUNGEON_ENTRANCE("Pollnivneach Smoke Dungeon Entrance", new Location(3303, 2967, 3314, 2955), 0),
	RUINS_OF_UZER("Uzer", new Location(3463, 3114, 3506, 3075), 0),
	SHANTAY_PASS("Shantay Pass", new Location(3293, 3137, 3312, 3116), 0),
	SOPHANEM("Sophanem", new Location(3272, 2811, 3324, 2751), 0),

	/*-
	 *	Misthalin
	 *		Barbarian Village
	 * 		Digsite
	 * 		Draynor Village
	 * 		Edgeville
	 * 		Grand Exchange
	 * 		Lumbridge
	 * 		Lumbridge Swamp
	 * 		Paterdomus
	 * 		Silvarea
	 * 		Varrock
	 * 		Wizards' Tower
	 */
	BARB_VILLAGE("Barb Village", new Location(3071, 3448, 3092, 3405), 0),
	COOKS_GUILD("Cooks Guild", new Location(3135, 3455, 3155, 3427), 0),
	CHAMPIONS_GUILD("Champoins' Guild", new Location(3184, 3364, 3199, 3348), 0),
	DARK_WIZARDS("Varrock Dark Wizards", new Location(3220, 3377, 3235, 3361), 0),
	DIGSITE("Digsite", new Location(3340, 3435, 3380, 3390), 0),
	DIGSITE_EXAM_CENTER("Digsite Exam Center", new Location(3357, 3339, 3367, 3331), 0),
	DRAYNOR_MANOR("Draynor Manor", new Location(3089, 3375, 3127, 3350), 0),
	DRAYNOR_SEWERS("Draynor Sewers", new Location(3077, 9699, 3135, 9642), 0),
	DRYANOR_VILLAGE("Dryanor Village", new Location(3074, 3283, 3112, 3241), 0),
	EDGEVILLE_BANK("Edge Bank", new Location(3090, 3499, 3099, 3487), 0),
	EDGEVILLE_DUNGEON("Edgeville Dungeon - Main Corridor (Paddewwa Tele)", new Location(3091, 9890, 3105, 9866), 0),
	EDGEVILLE_DUNGEON_HILLGIANTS("Varrock Underground - Hill Giants", new Location(3095, 9854, 3125, 9821), 0),
	EDGEVILLE_DUNGEON_HOB_GOBLINS("Edgeville Dungeon - Hob Goblins", new Location(3115, 9880, 3143, 9857), 0),
	EDGEVILLE_DUNGEON_SLAYER_MASTER("Edgeville Dungeon - Slayer Master", new Location(3128, 9917, 3151, 9881), 0),
	GRAND_EXCHANGE("Grand Exchange", new Location(3155, 3499, 3174, 3480), 0),
	GRAND_EXCHANGE_AGILITY_SHORTCUT("GE Agility Shortcut", new Location(3136, 3518, 3143, 3511), 0),
	GRAND_EXCHANGE_ENTRANCE("GE Entrance", new Location(3159, 3472, 3170, 3460), 0),
	HAM_DUNGEON("H.A.M. Dungeon", new Location(3138, 9660, 3191, 9604), 0),
	HAM_ENTRANCE("H.A.M. Hideout", new Location(3159, 3254, 3172, 3243), 0),
	LUMBERYARD("Lumberyard", new Location(3289, 3520, 3327, 3488), 0),
	LUMBRIDGE_BASEMENT("Lumbridge Basement", new Location(3206, 9626, 3221, 9613), 0),
	LUMBRIDGE_CASTLE("Lumbridge Castle", new Location(3201, 3235, 3225, 3201), 0),
	LUMBRIDGE_CASTLE_BANK("Lumbridge Castle Bank", new Location(3201, 3235, 3225, 3201), 2),
	LUMBRIDGE_SWAMP("Lumby Swamp", new Location(3135, 3203, 3245, 3140), 0),
	LUMBRIDGE_SWAMP_CAVES("Lumbridge Swamp Caves", new Location(3142, 9598, 3260, 9537), 0),
	PATERDOMUS("Priest in Peril Temple", new Location(3404, 3495, 3419, 3481), 0),
	SENNTISTEN_TELEPORT("Senntisten Tele", new Location(3305, 3342, 3319, 3328), 0),
	SILVAREA("Rag and Bone Man", new Location(3350, 3505, 3378, 3492), 0),
	STRONGHOLD_OF_SECURITY_FLOOR_1("Stronghold of Security - Floor 1 (Minatours)", new Location(1855, 5246, 1917, 5183), 0),
	STRONGHOLD_OF_SECURITY_FLOOR_2("Stronghold of Security - Floor 2 (Flesh Crawlers)", new Location(1983, 5246, 2049, 5183), 0),
	STRONGHOLD_OF_SECURITY_FLOOR_3("Stronghold of Security - Floor 3 (Catablepons)", new Location(2113, 5310, 2178, 5248), 0),
	STRONGHOLD_OF_SECURITY_FLOOR_4("Stronghold of Security - Floor 4 (Ankous)", new Location(2302, 5249, 2367, 5185), 0),
	VARROCK_CHURCH("Varrock Church", new Location(3249, 3488, 3259, 3471), 0),
	VARROCK_BANK_EAST("Varrock East Bank", new Location(3246, 3428, 3261, 3412), 0),
	VARROCK_BANK_WEST("Varrock West Bank", new Location(3172, 3450, 3197, 3425), 0),
	VARROCK_MAGIC_SHOP("Varrock Magic Shop", new Location(3249, 3405, 3256, 3398), 0),
	VARROCK_MINE("Varrock Mine", new Location(3278, 3372, 3294, 3355), 0),
	VARROCK_MOSS_GIANTS("Varrock Sewers - Moss Giants", new Location(3190, 9910, 3153, 9876), 0),
	VARROCK_MUSEUM("Varrock Museum", new Location(3249, 3455, 3267, 3442), 0),
	VARROCK_PALACE("Varrock Palace", new Location(3198, 3502, 3228, 3455), 0),
	VARROCK_SEWERS("Varrock Sewers", new Location(3200, 9918, 3285, 9857), 0),
	VARROCK_SQUARE("Varrock Square", new Location(3201, 3444, 3229, 3412), 0),
	WIZARDS_TOWER("Wizards Tower", new Location(3093, 3171, 3121, 3146), 0),

	/*-
	 *	Morytania
	 * 		Abandoned Mine
	 * 		Barrows
	 * 		Burgh de Rott
	 *		Canifis
	 * 		Darkmeyer
	 * 		Fenkenstrain's Castle
	 * 		Hallowvale
	 * 		Haunted Woods
	 * 		Meiyerditch
	 * 		Mort'ton
	 * 		Mort Myre Swamp
	 * 		Port Phasmatys
	 * 		Slepe
	 * 		The Sisterhood Sanctuary (Nightmare Dungeon)
	 */
	ABANDONED_MINE("Haunted Mine", new Location(3426, 3260, 3459, 3205), 0),
	BARROWS("Barrows", new Location(3546, 3314, 3583, 3268), 0),
	BARROWS_CRYPT("Barrows Crypt", new Location(3523, 9723, 3580, 9666), 0),
	BURGH_DE_ROTT("Burgh de Rott", new Location(3474, 3247, 3535, 3189), 0),
	CANIFIS_BANK("Canifis Bank", new Location(3508, 3483, 3516, 3474), 0),
	CANIFIS_ZONE("Canifis", new Location(3472, 3506, 3519, 3467), 0),
	CROMBWICK_MANOR("Crombwick Manor in Slepe", new Location(3710, 3377, 3742, 3341), 0),
	DARKMEYER_BANK("Darkmeyer Bank", new Location(3600, 3370, 3610, 3364), 0),
	DARKMEYER_ZONE("Darkmeyer", new Location(3592, 3392, 3662, 3331), 0),
	FENKENSTRAINS_CASTLE("Fenkenstrain's Castle", new Location(3533, 3568, 3564, 3534), 0),
	ECTOFUNTUS("Ectofuntus", new Location(3651, 3528, 3668, 3510), 0),
	HALLOWED_SEPULCHER_ENTRANCE("Hallowed Sepulcher Entrance", new Location(3649, 3389, 3659, 3379), 0),
	HALLOWED_SEPULCHER_LOBBY("Hallowed Sepulcher Lobby", new Location(2383, 5996, 2417, 5963), 0),
	MORT_TON("Mort'ton", new Location(3473, 3301, 3504, 3271), 0),
	MORYTANIA_FARM_PATCH("Morytania Farming Patch", new Location(3596, 3531, 3607, 3520), 0),
	MORYTANIA_SWAMP_NORTH("Northern half of Morytania Swamp", new Location(3412, 3450, 3481, 3410), 0),
	MORYTANIA_SWAMP_SOUTH("Southern half of Morytania Swamp", new Location(3412, 3410, 3481, 3370), 0),
	NATURE_GROTTO("Nature Grotto", new Location(3410, 3356, 3461, 3322), 0),
	NIGHTMARE_BOSS("The Nightmare", new Location(3798, 9769, 3818, 9749), 1),
	PORT_PHASMATYS_BANK("Port Phasmatys Bank", new Location(3686, 3471, 3699, 3461), 0),
	PORT_PHASMATYS_DOCKS("Port Phasmatys Docks", new Location(3689, 3512, 3711, 3481), 0),
	PORT_PHASMATYS_PUB("Port Phasmatys Pub", new Location(3671, 3499, 3681, 3489), 0),
	PORT_PHASMATYS_SOUTH_GATE("Port Phasmatys South Gate", new Location(3663, 3455, 3674, 3445), 0),
	SALVE_GRAVEYARD("Salve Graveyard", new Location(3425, 3468, 3438, 3457), 0),
	SISTERHOOD_SANCTUARY("Sisterhood Sanctuary (Slepe Dungeon)", new Location(3720, 9832, 3898, 9690), 1),
	SLAYER_TOWER("Slayer Tower", new Location(3403, 3579, 3454, 3530), 0),
	SLEPE("Slepe", new Location(3692, 3381, 3750, 3293), 0),
	SWAMP_LIZARDS("Swamp Lizards", new Location(3521, 3451, 3568, 3426), 0),
	VER_SINHAZA("ToB", new Location(3640, 3236, 3685, 3202), 0),

	/*-
	 *	Tirannwn
	 * 		Arandar
	 * 		Gwenith
	 *		Iowerth Dungeon
	 * 		Isafdar
	 * 		Lletya
	 * 		Mynydd
	 * 		Poison Waste
	 * 		Port Tyras
	 * 		Prifddinas
	 * 		Tyras Camp
	 * 		Zul-Andra
	 */
	LLETYA("Lletya", new Location(2312, 3196, 2362, 3145), 0),
	ELF_CAMP("Elf Camp", new Location(2212, 3265, 2182, 3237), 0),
	GWENTIH("Gwenith", new Location(2187, 3425, 2220, 3393), 0),
	PRIFDDINAS("Prifddinas", new Location(3221, 6056, 3241, 6039), 0), // Fallback if there are gaps
	PRIFDDINAS_BANK_NORTH("Prifddinas North Bank", new Location(3254, 6113, 3260, 6101), 0),
	PRIFDDINAS_BANK_SOUTH("Prifddinas South Bank", new Location(3288, 6067, 3304, 6052), 0),
	PRIFDDINAS_CITY_CENTER("Prifddinas Center", new Location(3246, 6100, 3281, 6065), 0),
	PRIFDDINAS_CITY_E("Eastern Part of Prifddinas", new Location(3282, 6100, 3305, 6065), 0),
	PRIFDDINAS_CITY_N("Northern Part of Prifddinas", new Location(3246, 6124, 3281, 6101), 0),
	PRIFDDINAS_CITY_NE("North-Eastern Prifddinas", new Location(3282, 6136, 3319, 6101), 0),
	PRIFDDINAS_CITY_NW("North-Western Prifddinas", new Location(3208, 6135, 3245, 6101), 0),
	PRIFDDINAS_CITY_S("Southern Part of Prifddinas", new Location(3246, 6064, 3281, 6040), 0),
	PRIFDDINAS_CITY_SE("South-Eastern Prifddinas", new Location(3282, 6039, 3321, 6023), 0),
	PRIFDDINAS_CITY_SW("South-Western Prifddinas", new Location(3207, 6064, 3245, 6023), 0),
	PRIFDDINAS_CITY_W("Western Part of Prifddinas", new Location(3222, 6100, 3245, 6065), 0),
	PRIFDDINAS_GATE_EAST("Prifddinas East Gate (Arandar / Elven Pass)", new Location(2297, 3334, 2323, 3305), 0),
	PRIFDDINAS_GATE_EAST_INSIDE("Prifddinas East Gate", new Location(3306, 6100, 3319, 6064), 0),
	PRIFDDINAS_GATE_NORTH("Prifddinas North Gate", new Location(2230, 3387, 2249, 3384), 0),
	PRIFDDINAS_GATE_NORTH_INSIDE("Prifddinas North Gate", new Location(3246, 6136, 3281, 6125), 0),
	PRIFDDINAS_GATE_SOUTH("Prifddinas South Gate", new Location(2229, 3270, 2252, 3251), 0),
	PRIFDDINAS_GATE_SOUTH_INSIDE("Prifddinas South Gate", new Location(3246, 6039, 3281, 6024), 0),
	PRIFDDINAS_GATE_WEST("Prifddinas West Gate (Docks)", new Location(2154, 3338, 2182, 3317), 0),
	PRIFDDINAS_GATE_WEST_INSIDE("Prifddinas West Gate", new Location(3207, 6100, 3221, 6065), 0),
	PRIFDDINAS_GAUNTLET_PORTAL("Prifddinas Gauntlet Portal", new Location(3224, 6112, 3243, 6087), 0),
	PRIFDDINAS_POH_PORTAL("Prifddinas POH Portal", new Location(3230, 6081, 3247, 6067), 0),
	PRIFDDINAS_RED_CHINS("Prifddinas Red Chins", new Location(2255, 3418, 2283, 3397), 0),
	PRIFDDINAS_SLAYER_CAVE_ENTRANCE("Prifddinas Slayer Cave Entrance", new Location(3221, 6056, 3241, 6039), 0),
	PRIFDDINAS_ZALCANO_ENTRANCE("Prifddinas Zalcano Entrance", new Location(3277, 6065, 3287, 6053), 0),
	TYRAS_CAMP("Tyras Camp", new Location(2168, 3163, 2201, 3134), 0),
	TYRAS_DOCKS("Port Tyras", new Location(2135, 3133, 2167, 3110), 0),
	ZALCANO("Zalcano", new Location(3019, 6074, 3048, 6035), 0),
	GAUNTLET_LOBBY("Gauntlet Lobby", new Location(3025, 6130, 3040, 6115), 1),
	ZUL_ANDRA("Zul-Andra", new Location(2182, 3070, 2214, 3042), 0),

	/*-
	 *	Troll Country
	 * 		Death Plateau
	 * 		God Wars Dungeon
	 * 		Ice Path
	 *		Troll Stronghold
	 * 		Trollheim
	 * 		Trollweiss Mountain
	 * 		Weiss
	 */
	DEATH_PLATEAU("Death Plateau", new Location(2838, 3610, 2880, 3580), 0),
	GOD_WARS_DUNGEON("GWD", new Location(2820, 5375, 2944, 5253), 2),
	GOD_WARS_DUNGEON_ENTRANCE("GWD Entrance", new Location(2904, 3756, 2921, 3742), 0),
	TROLL_STRONGHOLD("Troll Stronghold", new Location(2836, 3698, 2862, 3659), 0),
	TROLLHEIM_TELEPORT("Trollheim Tele", new Location(2882, 3685, 2899, 3669), 0),
	WEISS("Weiss", new Location(2837, 3967, 2890, 3914), 0),

	/*
	 * Dungeons, Caves, Islands and other miscellaneous areas
	 */
	ABYSS("Abyss", new Location(3010, 4862, 3068, 4804), 0),
	ABYSSAL_AREA("Abyssal Area", new Location(3008, 4926, 3071, 4864), 0),
	ABYSSAL_NEXUS("Abyssal Nexus", new Location(3010, 4803, 3068, 4756), 0),
	BLAST_FURNACE("Blast Furnace", new Location(1934, 4974, 1958, 4955), 0),
	CAVE_HORROR_ENTRANCE("Mos Le'Harmless Cave Entrance (Cave Horrors)", new Location(3737, 2986, 3759, 2961), 0),
	COSMIC_ALTAR("Zanaris Cosmic Altar", new Location(2400, 4387, 2425, 4367), 0),
	DWARVEN_MINE_CAMP("Dwarven Mine - North Exit", new Location(3013, 9854, 3033, 9820), 0),
	DWARVEN_MINE_CART("Dwarven Mine - Cart Transport", new Location(2988, 9849, 3006, 9821), 0),
	DWARVEN_MINE_FALADOR("Dwarven Mine - Falador Exit", new Location(3030, 9788, 3062, 9758), 0),
	GORAK_PLANE("Gorak Plane", new Location(3006, 5377, 3070, 5313), 0),
	FISHER_REALM("Fisher Realm (Fairy Ring BJR)", new Location(2622, 4738, 2688, 4667), 0),
	HARMONY("Harmony Island", new Location(3778, 2879, 3835, 2816), 0),
	MINING_GUILD("Mining Guild", new Location(3008, 9756, 3061, 9698), 0),
	MOLE_LAIR("Mole Lair", new Location(1730, 5246, 1787, 5131), 0),
	MOS_LE_HARMLESS("Mos Le'Harmless", new Location(3649, 3005, 3709, 2958), 0),
	MOS_LE_HARMLESS_DOCKS("Mos Le'Harmless Docks", new Location(3664, 2957, 3692, 2929), 0),
	MOTHERLODE_MINE("Motherlode Mine", new Location(3713, 5695, 3777, 5632), 0),
	PEST_CONTROL("Pest Control", new Location(2630, 2679, 2682, 2627), 0),
	PURO_PURO("Puro-Puro", new Location(2561, 4349, 2622, 4289), 0),
	SORCERESS_GARDEN("Sorceress's Garden", new Location(2884, 5499, 2938, 5444), 0),
	TROUBLE_BREWING("Trouble Brewing", new Location(3774, 3024, 3843, 2942), 0),
	ZANARIS_BANK("Zanaris Bank", new Location(2374, 4468, 2390, 4451), 0),
	ZANARIS("Zanaris", new Location(2398, 4478, 2460, 4419), 0),

	/*
	 * Wilderness Locations
	 */
	ANNAKARL_TELEPORT("GDZ", new Location(3279, 3895, 3296, 3875), 0),
	AXE_HUT("Axe Hut", new Location(3187, 3962, 3194, 3957), 0),
	BANDIT_CAMP("Bandit Camp", new Location(3017, 3712, 3059, 3681), 0),
	BLACK_SALAMANDERS("Black Salamanders", new Location(3291, 3677, 3301, 3664), 0),
	CALLISTO("Callisto", new Location(3266, 3863, 3315, 3827), 0),
	CEMETERY("Cemetery", new Location(2956, 3767, 2996, 3736), 0),
	CHAOS_ALTAR_PRAYER("Chaos Altar", new Location(2945, 3826, 2970, 3813), 0),
	CHAOS_ALTAR_RUNECRAFT("Chaos Runecrafting Altar", new Location(3055, 3596, 3067, 3585), 0),
	CHAOS_FANATIC("Chaos Fanatic", new Location(2971, 3854, 2992, 3834), 0),
	CHAOS_TEMPLE("Chaos Temple", new Location(3220, 3632, 3255, 3593), 0),
	BLACK_CHINCHOMPAS("Chins", new Location(3128, 3792, 3160, 3754), 0),
	CORP_CAVE("Corp Cave", new Location(3201, 3684, 3219, 3672), 0),
	CRAZY_ARCHAEOLOGIST("Crazy Archaeologist", new Location(2952, 3709, 2985, 3678), 0),
	DARK_CRAB_TELEPORT("Dark Crab Tele", new Location(3343, 3800, 3355, 3780), 0),
	DARK_WARRIORS("Dark Warriors", new Location(3014, 3648, 3046, 3616), 0),
	DEEP_WILDERNESS_DUNGEON("Deep Wilderness Dungeon", new Location(3038, 10330, 3053, 10305), 0),
	DEEP_WILDERNESS_DUNGEON_ENTRANCE("Deep Wild Dungeon", new Location(3042, 3929, 3051, 3920), 0),
	DEEP_WILDERNESS_DUNGEON_FIRE_GIANTS("Deep Wilderness Dungeon Fire Giants", new Location(3035, 10349, 3060, 10331), 0),
	DEEP_WILDERNESS_DUNGEON_WINES("Deep Wilderness Dungeon Wines", new Location(3013, 10365, 3060, 10350), 0),
	DWARVES("Dwarves", new Location(3230, 3805, 3264, 3779), 0),
	EDGEVILLE_DUNGEON_EARTH_WARRIORS("Edgeville Dungeon - Earth Warriors", new Location(3114, 9999, 3129, 9960), 0),
	EDGEVILLE_DUNGEON_CHAOS_DRUIDS("Edgeville Dungeon - Chaos Druids", new Location(3104, 9944, 3135, 9923), 0),
	EDGEVILLE_DUNGEON_SPIDERS("Edgeville Dungeon - Spiders", new Location(3104, 9959, 3135, 9945), 0),
	EDGEVILLE_DUNGEON_BLACK_DEMONS("Edgeville Dungeon - Black Demons", new Location(3077, 9966, 3103, 9941), 0),
	// is this label description intuitive?
	ENTS("Ents", new Location(3300, 3627, 3320, 3584), 0),
	FEROX_ENCLAVE("Ferox Enclave", new Location(3119, 3646, 3160, 3616), 0),
	GLORY_HILL("Glory Hill", new Location(3331, 3890, 3348, 3866), 0),
	GLORY_HOLE("Glory Hole", new Location(3352, 3897, 3386, 3869), 0),
	CARRALLANGAR_GRAVES("Graves", new Location(3128, 3686, 3181, 3658), 0),
	GREEN_DRAGONS_EAST("East Drags", new Location(3326, 3704, 3365, 3671), 0),
	GREEN_DRAGONS_GRAVEYARD("Graveyard Drags", new Location(3129, 3717, 3172, 3691), 0),
	GREEN_DRAGONS_WEST("West Drags", new Location(2960, 3627, 2992, 3598), 0),
	HOBGOBLINS("Hobgoblins", new Location(3073, 3775, 3104, 3745), 0),
	ICE_GATE("Ice Gate", new Location(2945, 3913, 2978, 3878), 0),
	ICE_ROCK("Ice Rock", new Location(2957, 3942, 2984, 3929), 0),
	KBD_CAGE("KBD CAGE", new Location(3007, 3855, 3021, 3839), 0),
	LAVA_DRAGON_GAP("Gap", new Location(3238, 3855, 3258, 3841), 0),
	LAVA_DRAGON_ISLE("Lava Drags", new Location(3175, 3857, 3221, 3805), 0),
	LAVA_MAZE_DUNGEON("Lava Maze Dungeon", new Location(3075, 10239, 3008, 10291), 0),
	LAVA_MAZE_TELE("Lava Maze Tele", new Location(3019, 3842, 3044, 3812), 0),
	MAGE_ARENA("Mage Arena", new Location(3088, 3949, 3123, 3919), 0),
	MAGE_BANK("Mage Bank", new Location(3082, 3960, 3103, 3952), 0),
	MAGE_BANK_SAFE_ZONE("Mage Bank Safe Zone", new Location(2526, 4727, 2550, 4707), 0),
	NEW_GATE("New Gate", new Location(3348, 3890, 3325, 3911), 0),
	OBELISK_13("13s Port", new Location(3152, 3624, 3160, 3616), 0),
	OBELISK_19("19s", new Location(3220, 3672, 3234, 3660), 0),
//	OBELISK_27("27 GWDs Portal", new Location(3031, 3736, 3039, 3728), 0),
	OBELISK_35("36 Port", new Location(3097, 3804, 3115, 3785), 0),
	OBELISK_44("44s", new Location(2973, 3870, 2987, 3859), 0),
	OBELISK_50("50 ports", new Location(3301, 3923, 3315, 3909), 0),
	OLD_GATE("Old Gate", new Location(3211, 3906, 3238, 3882), 0),
	PIRATE_HUT("Pirate Hut", new Location(3037, 3959, 3045, 3948), 0),
	POISON_SPIDERS("Poison Spiders", new Location(3282, 3803, 3302, 3785), 0),
	REV_CAVE_AGILITY_65("Rev Cave Green Dragon Agility Jump", new Location(3216, 10090, 3226, 10080), 0),
	REV_CAVE_AGILITY_75_1("Rev Cave 75 Agility Jump", new Location(3195, 10200, 3212, 10190), 0),
	REV_CAVE_AGILITY_75_2("Rev Cave 75 Agility Jump (North of Ankous)", new Location(3173, 10214, 3186, 10205), 0),
	REV_CAVE_AGILITY_89("Rev Cave 89 Agility Jump", new Location(3233, 10148, 3244, 10140), 0),
	REV_CAVE_ANKOUS("Rev Cave Ankous", new Location(3160, 10204, 3191, 10177), 0),
	REV_CAVE_BLACK_DEMONS("Rev Cave Black Demons", new Location(3158, 10171, 3187, 10145), 0),
	REV_CAVE_BLACK_DRAGS("Rev Cave Black Drags", new Location(3223, 10216, 3254, 10190), 0),
	REV_CAVE_CORRIDOR_NORTH("Revenant Cave Corridor", new Location(3255, 10213, 3263, 10191), 0),
	REV_CAVE_CORRIDOR_SOUTH("Rev Cave Green Dragon Corridor", new Location(3238, 10106, 3252, 10077), 0),
	REV_CAVE_ENTRANCE_NORTH("Rev Entrance", new Location(3118, 3837, 3142, 3818), 0),
	REV_CAVE_ENTRANCE_SOUTH("South Rev Entrance", new Location(3071, 3660, 3092, 3645), 0),
	REV_CAVE_EXIT_NORTH("Rev Cave North Exit", new Location(3238, 10236, 3243, 10231), 0),
	REV_CAVE_EXIT_SOUTH("Rev Cave South Exit", new Location(3190, 10062, 3215, 10052), 0),
	REV_CAVE_GREATER_DEMONS("Rev Cave Greater Demons", new Location(3210, 10140, 3240, 10115), 0),
	REV_CAVE_GREEN_DRAGONS_1("Rev Cave Green Dragons", new Location(3215, 10078, 3234, 10052), 0),
	REV_CAVE_GREEN_DRAGONS_2("Rev Cave Green Dragons", new Location(3200, 10106, 3231, 10091), 0),
	REV_CAVE_HELL_HOUNDS("Rev Cave Hell Hounds", new Location(3190, 10078, 3210, 10063), 0),
	REV_CAVE_ICE_GIANTS("Rev Cave Ice Giants", new Location(3200, 10173, 3221, 10155), 0),
	REV_CAVE_LESSER_DEMONS("Rev Cave Lesser Demons", new Location(3143, 10125, 3176, 10104), 0),
	REVENANT_DARK_BEAST("Revenant Dark Beast", new Location(3244, 10154, 3260, 10136), 0),
	REVENANT_MAIN_CHAMBER("Main Rev Chamber", new Location(3227, 10187, 3261, 10157), 0),
	ROGUE_CASTLE("Rogue Castle", new Location(3275, 3947, 3299, 3920), 0),
	RUNE_ROCKS("Rune Rocks", new Location(3055, 3890, 3072, 3876), 0),
	SCORPIA("Scorpia", new Location(3216, 3949, 3248, 3935), 0),
	SPERM_HILL("Sperm Hill", new Location(3282, 3687, 3300, 3677), 0),
	SPIDER_HILL("Spider Hill", new Location(3156, 3896, 3182, 3871), 0),
	VENENATIS("Venenatis", new Location(3298, 3759, 3353, 3722), 0),
	VETTION("Vet'tion", new Location(3183, 3796, 3227, 3765), 0),
	VOLCANO("Volcano", new Location(3345, 3957, 3390, 3916), 0),
	WEB("Web", new Location(3153, 3961, 3163, 3948), 0),
	WILDY_AGILITY_COURSE("Wildy Agility Course", new Location(2988, 3967, 3008, 3906), 0),
	WILDERNESS_GOD_WARS_DUNGEON("God Wars Dungeon", new Location(3010, 3745, 3027, 3727), 0),
	WILDERNESS_GOD_WARS("Wildy GWD Chamber", new Location(3012, 10168, 3068, 10113), 0),
	WILDERNESS_LEVER("Lever", new Location(3149, 3933, 3162, 3917), 0),
	WILDERNESS_RESOURCE_AREA("Resource Area", new Location(3174, 3946, 3195, 3923), 0),
	ZAMORAK_MAGE("Zammy Mage", new Location(3099, 3561, 3107, 3553), 0);

	@Getter
	private final String name;
	@Getter
	private final WorldArea worldArea;
	@Getter
	private final Location location;
	@Getter
	private static final Map<WorldArea, String> LOCATION_MAP;

	static
	{
		ImmutableMap.Builder<WorldArea, String> builder = ImmutableMap.builder();

		for (WorldLocation value : values())
		{
			builder.put(value.getWorldArea(), value.getName());
		}

		LOCATION_MAP = builder.build();
	}

	/**
	 * Creates a location used to get the name of a location by a WorldPoint
	 *
	 * @param name     - The name that is used to represent the area in overlays etc
	 * @param location - A Location made out of 4 points on the world map
	 * @param plane    - The plane of the World Area
	 */
	WorldLocation(String name, Location location, int plane)
	{
		this.name = name;
		this.location = location;
		this.worldArea = new WorldArea(location.x, location.y, location.width, location.height, plane);
	}

	/**
	 * Returns all locations that aren't in the wild
	 *
	 * @return - A Collection of non-wilderness WorldLocations
	 */
	public static Collection<WorldLocation> getNonWildernessLocations()
	{
		return Arrays.stream(WorldLocation.values()).filter(loc ->
			PvPUtil.getWildernessLevelFrom(loc.worldArea.toWorldPoint()) < 0).collect(Collectors.toList());
	}

	/**
	 * Returns only the WorldLocations that are in the wilderness
	 *
	 * @return - A Collection of WorldLocations in the wilderness
	 */
	public static Collection<WorldLocation> getWildernessLocations()
	{
		return Arrays.stream(WorldLocation.values()).filter(loc ->
			PvPUtil.getWildernessLevelFrom(loc.worldArea.toWorldPoint()) > 0).collect(Collectors.toList());
	}

	/**
	 * Returns the WorldLocation that a WorldPoint is in, or the closest WorldLocation to the point
	 *
	 * @param worldPoint - the WorldPoint to find the WorldLocation of
	 * @return - Containing location or closest location if it isn't in any
	 */
	public static String location(WorldPoint worldPoint)
	{
		int dist = 128; // x2 Region lengths
		String s = "";
		WorldArea closestArea = null;

		for (Map.Entry<WorldArea, String> entry : LOCATION_MAP.entrySet())
		{
			final WorldArea worldArea = entry.getKey();

			if (worldArea.toWorldPointList().contains(worldPoint))
			{
				s = entry.getValue();
				return s;
			}

			final int distTo = worldArea.distanceTo(worldPoint);

			if (distTo < dist)
			{
				dist = distTo;
				closestArea = worldArea;
			}
		}

		if (closestArea == null)
		{
			return s;
		}

		if (worldPoint.getY() > closestArea.toWorldPoint().getY() + closestArea.getHeight())
		{
			s = s + "N";
		}

		if (worldPoint.getY() < closestArea.toWorldPoint().getY())
		{
			s = s + "S";
		}

		if (worldPoint.getX() < closestArea.toWorldPoint().getX())
		{
			s = s + "W";
		}

		if (worldPoint.getX() > (closestArea.toWorldPoint().getX() + closestArea.getWidth()))
		{
			s = s + "E";
		}

		s = s + " of ";
		s = s + LOCATION_MAP.get(closestArea);

		if (s.startsWith(" of "))
		{
			s = s.substring(3);
		}

		return s;
	}


	public static class Location
	{
		@Getter
		private final int x;
		@Getter
		private final int y;
		@Getter
		private final int x1;
		@Getter
		private final int y1;
		final int width;
		final int height;

		Location(int x, int y, int x1, int y1)
		{
			this.x = Math.min(x, x1);
			this.y = Math.min(y, y1);
			this.x1 = Math.max(x, x1);
			this.y1 = Math.max(y, y1);
			this.width = Math.abs(x1 - x);
			this.height = Math.abs(y1 - y);
		}

		@Override
		public String toString()
		{
			return "Location{" +
				"x=" + x +
				", y=" + y +
				", width=" + width +
				", height=" + height +
				'}';
		}
	}

	@Override
	public String toString()
	{
		return "WorldLocation{" +
			"name='" + name + '\'' +
			", worldArea=" + worldArea +
			'}';
	}
}
