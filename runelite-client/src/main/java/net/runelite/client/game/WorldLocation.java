/*******************************************************************************
 * Copyright (c) 2019 RuneLitePlus
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 * RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 * RuneLitePlus website: https://runelitepl.us
 ******************************************************************************/

package net.runelite.client.game;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.Getter;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.util.PvPUtil;

public enum WorldLocation
{
	// Non-Wilderness Locations
	AGILITY_PYRAMID("Agility Pyramid", new Location(3386, 2864, 3334, 2819), 0),
	AL_KHARID_BANK("Al Kharid Bank", new Location(3272, 3173, 3265, 3161), 0),
	AL_KHARID_GLIDER("Al Kharid_Glider", new Location(3283, 3214, 3276, 3209), 0),
	AL_KHARID_PALACE("Al Kharid Palace", new Location(3304, 3177, 3281, 3158), 0),
	ZUL_ANDRA("Zul-Andra", new Location(2214, 3070, 2182, 3042), 0),
	APE_ATOLL_TEMPLE("Ape Atoll Temple", new Location(2810, 2802, 2784, 2770), 0),
	ARDY_CASTLE("Ardy Castle", new Location(2591, 3311, 2567, 3283), 0),
	ARDY_DOCKS("Ardy Docks", new Location(2689, 3284, 2660, 3264), 0),
	ARDY_NORTH_BANK("Ardy North Bank", new Location(2622, 3336, 2611, 3329), 0),
	ARDY_SOUTH_BANK("Ardy South Bank", new Location(2659, 3288, 2645, 3279), 0),
	ARDY_STALLS("Ardy Stalls", new Location(2673, 3318, 2651, 3293), 0),
	ARDY_ZOO("Ardy Zoo", new Location(2640, 3288, 2598, 3261), 0),
	BARB_VILLAGE("Barb Village", new Location(3092, 3448, 3071, 3405), 0),
	BARROWS("Barrows", new Location(3583, 3314, 3546, 3268), 0),
	BEDABIN_CAMP("Bedabin Camp", new Location(3188, 3052, 3157, 3019), 0),
	CAMELOT_CASTLE("Camelot Castle", new Location(2775, 3481, 2743, 3468), 0),
	CASTLE_WARS("Castle Wars", new Location(2474, 3127, 2435, 3074), 0),
	CATHERBY("Catherby", new Location(2833, 3457, 2791, 3436), 0),
	CATHERBY_DOCKS("Catherby Docks", new Location(2808, 3432, 2790, 3409), 0),
	CATHERBY_EAST("Catherby East", new Location(2862, 3441, 2834, 3425), 0),
	CATHERBY_NORTH("Catherby North", new Location(2833, 3472, 2791, 3458), 0),
	CLAN_WARS("Clan Wars", new Location(3391, 3176, 3344, 3142), 0),
	COOKS_GUILD("Cooks Guild", new Location(3155, 3455, 3135, 3427), 0),
	COX("CoX", new Location(1270, 3574, 1226, 3559), 0),
	CRAB_CLAW_ISLE("Crab Claw Isle", new Location(1795, 3449, 1745, 3399), 0),
	DESERT_BANDIT_CAMP("Desert Bandit Camp", new Location(3189, 2993, 3154, 2963), 0),
	DIGSITE_NORTHWEST("Digsite NorthWest", new Location(3353, 3445, 3325, 3420), 0),
	DIGSITE_NORTHEAST("Digsite NorthEast", new Location(3382, 3445, 3354, 3420), 0),
	DIGSITE_SOUTHEAST("Digsite SouthEast", new Location(3382, 3419, 3354, 3393), 0),
	DIGSITE_SOUTHWEST("Digsite SouthWest", new Location(3353, 3419, 3325, 3393), 0),
	DRYANOR_VILLAGE("Dryanor Village", new Location(3112, 3283, 3074, 3241), 0),
	DUEL_ARENA_ENTRANCE("Duel Arena Entrance", new Location(3328, 3247, 3311, 3223), 0),
	DUEL_ARENA_NORTH("Duel Arena North", new Location(3388, 3266, 3329, 3264), 0),
	DUEL_ARENA_NORTH_WEST("Duel Arena North West", new Location(3328, 3266, 3322, 3248), 0),
	EDGE_BANK("Edge Bank", new Location(3099, 3499, 3090, 3487), 0),
	FALADOR_PARTYROOM("Falador Partyroom", new Location(3056, 3386, 3035, 3370), 0),
	FALLY_BANK("Fally Bank", new Location(2949, 3372, 2943, 3358), 0),
	FALLY_CENTER("Fally Center", new Location(2972, 3385, 2959, 3374), 0),
	FALLY_EAST_BANK("Fally East Bank", new Location(3021, 3358, 3008, 3353), 0),
	FALLY_PARK("Fally Park", new Location(3025, 3390, 2982, 3368), 0),
	FALLY_RESPAWN("Fally Respawn", new Location(2998, 3355, 2957, 3325), 0),
	GNOME_AGILITY("Gnome Agility", new Location(2489, 3441, 2469, 3412), 0),
	GNOME_BALL("Gnome Ball", new Location(2408, 3495, 2384, 3479), 0),
	GRAND_EXCHANGE_NORTHEAST("Grand Exchange NorthEast", new Location(3197, 3516, 3165, 3490), 0),
	GRAND_EXCHANGE_NORTHWEST("Grand Exchange NorthWest", new Location(3164, 3516, 3139, 3490), 0),
	GRAND_EXCHANGE_SOUTHEAST("Grand Exchange SouthEast", new Location(3189, 3489, 3165, 3468), 0),
	GRAND_EXCHANGE_SOUTHWEST("Grand Exchange SouthWest", new Location(3164, 3489, 3139, 3467), 0),
	GRAND_TREE("Grand Tree", new Location(2490, 3515, 2442, 3478), 0),
	ICE_MOUNTAIN("Ice Mountain", new Location(3024, 3508, 3001, 3463), 0),
	TRAINING_GROUND("Training Ground", new Location(2534, 3387, 2501, 3358), 0),
	LUMBRIDGE_CASTLE("Lumbridge Castle", new Location(3225, 3235, 3201, 3201), 0),
	LUMBY_SWAMP("Lumby Swamp", new Location(3245, 3203, 3135, 3140), 0),
	LUNAR_ISLE_CENTRAL("Lunar Isle Central", new Location(2112, 3933, 2055, 3888), 0),
	LUNAR_ISLE_EAST("Lunar Isle East", new Location(2185, 3921, 2113, 3888), 0),
	LUNAR_ISLE_NORTH("Lunar Isle North", new Location(2112, 3958, 2063, 3934), 0),
	LUNAR_ISLE_NORTH_EAST("Lunar Isle North East", new Location(2185, 3958, 2113, 3922), 0),
	LUNAR_ISLE_SOUTH("Lunar Isle South", new Location(2112, 3887, 2057, 3843), 0),
	LUNAR_ISLE_SOUTHEAST("Lunar Isle SouthEast", new Location(2185, 3887, 2113, 3843), 0),
	MONASTERY("Monastery", new Location(3060, 3507, 3044, 3471), 0),
	NARDAH_NORTH("Nardah North", new Location(3453, 2942, 3397, 2915), 0),
	NARDAH_SOUTH("Nardah South", new Location(3453, 2914, 3397, 2882), 0),
	NIEVE("Nieve", new Location(2435, 3425, 2430, 3419), 0),
	NIGHTMARE_ZONE("Nightmare Zone", new Location(2614, 3119, 2599, 3111), 0),
	NORTH_MARIM("North Marim", new Location(2783, 2804, 2731, 2786), 0),
	PEST_CONTROL("Pest Control", new Location(2682, 2679, 2630, 2627), 0),
	POLLNIVNEACH_NORTH("Pollnivneach North", new Location(3379, 3004, 3331, 2974), 0),
	POLLNIVNEACH_SOUTH("Pollnivneach South", new Location(3379, 2973, 3331, 2941), 0),
	PORT_KHAZARD("Port Khazard", new Location(2680, 3182, 2624, 3143), 0),
	PORT_SARIM("Port Sarim", new Location(3060, 3261, 3009, 3194), 0),
	RELLEKA_SOUTH_WEST("Relleka South West", new Location(2649, 3678, 2609, 3644), 0),
	RELLEKKA_NORTH_EAST("Rellekka North East", new Location(2690, 3712, 2650, 3679), 0),
	RELLEKKA_NORTH_WEST("Rellekka North West", new Location(2649, 3712, 2609, 3679), 0),
	RELLEKKA_SOUTH_EAST("Rellekka South East", new Location(2690, 3678, 2650, 3644), 0),
	RIMMINGTON_PORTAL("Rimmington Portal", new Location(2960, 3228, 2946, 3218), 0),
	ROCK_CRABS_EAST("Rock Crabs East", new Location(2730, 3738, 2691, 3713), 0),
	ROCK_CRABS_WEST("Rock Crabs West", new Location(2690, 3738, 2650, 3713), 0),
	SANDCRABS_CENTRAL("SandCrabs Central", new Location(1884, 3529, 1850, 3465), 0),
	SANDCRABS_NORTH("SandCrabs North", new Location(1884, 3572, 1848, 3532), 0),
	SANDCRABS_SOUTH("SandCrabs South", new Location(1849, 3468, 1796, 3436), 0),
	SEERS_VILLAGE("Seers Village", new Location(2742, 3498, 2688, 3468), 0),
	SHANTAY_PASS("Shantay Pass", new Location(3312, 3137, 3293, 3116), 0),
	SHILO_VILLAGE_NORTH("Shilo Village North", new Location(2878, 3006, 2817, 2973), 0),
	SHILO_VILLAGE_SOUTH("Shilo Village South", new Location(2879, 2972, 2816, 2944), 0),
	SOUTH_MARIM("South Marim", new Location(2783, 2785, 2731, 2762), 0),
	SOUTH_OF_GRAND_EXCHANGE("South of Grand Exchange", new Location(3190, 3466, 3156, 3448), 0),
	TREEGOME_VILLAGE("TreeGome Village", new Location(2547, 3175, 2514, 3158), 0),
	VARROCK_CENTRE("Varrock Centre", new Location(3229, 3444, 3201, 3412), 0),
	VARROCK_EAST("Varrock East", new Location(3241, 3450, 3228, 3438), 0),
	VARROCK_WEST("Varrock West", new Location(3200, 3447, 3172, 3427), 0),
	WATERBIRTH_ISLAND("Waterbirth Island", new Location(2562, 3774, 2494, 3710), 0),
	WEST_ARDY("West Ardy", new Location(2557, 3336, 2452, 3265), 0),
	WINDERTODT_SOUTH_EAST("Windertodt South East", new Location(1651, 4007, 1630, 3987), 0),
	WINTERTODT_CAMP("Wintertodt Camp", new Location(1645, 3963, 1616, 3932), 0),
	WINTERTODT_ENTRANCE("Wintertodt Entrance", new Location(1641, 3986, 1617, 3964), 0),
	WINTERTODT_NORTHEAST("Wintertodt NorthEast", new Location(1651, 4027, 1630, 4008), 0),
	WINTERTODT_NORTHWEST("Wintertodt NorthWest", new Location(1629, 4028, 1608, 4008), 0),
	WINTERTODT_SOUTHWEST("Wintertodt SouthWest", new Location(1629, 4007, 1608, 3987), 0),
	WIZARDS_GUILD("Wizards Guild", new Location(2596, 3092, 2585, 3082), 0),
	WIZARDS_TOWER("Wizards Tower", new Location(3121, 3171, 3093, 3146), 0),
	YANILE_BANK("Yanile Bank", new Location(2616, 3097, 2608, 3087), 0),
	YANILLE_EAST("Yanille East", new Location(2621, 3110, 2576, 3071), 0),
	YANILLE_PORTAL("Yanille Portal", new Location(2551, 3108, 2537, 3091), 0),
	YANILLE_WEST("Yanille West", new Location(2575, 3110, 2532, 3071), 0),


	// Wilderness Locations
	AXE_HUT("Axe Hut", new Location(3194, 3962, 3187, 3957), 0),
	BANDIT_CAMP("Bandit Camp", new Location(3059, 3712, 3017, 3681), 0),
	CALLISTO("Callisto", new Location(3315, 3863, 3266, 3827), 0),
	CEMETERY("Cemetery", new Location(2996, 3767, 2956, 3736), 0),
	CHAOS_FANATIC("Chaos Fanatic", new Location(2992, 3854, 2971, 3834), 0),
	CHAOS_TEMPLE("Chaos Temple", new Location(3255, 3632, 3220, 3593), 0),
	CHINS("Chins", new Location(3160, 3792, 3128, 3754), 0),
	CORP_CAVE("Corp Cave", new Location(3219, 3684, 3201, 3672), 0),
	CRAZY_ARCHAEOLOGIST("Crazy Archaeologist", new Location(2985, 3709, 2952, 3678), 0),
	DARK_WARRIORS("Dark Warriors", new Location(3046, 3648, 3014, 3616), 0),
	DWARVES("Dwarves", new Location(3264, 3805, 3230, 3779), 0),
	EAST_DRAGS("East Drags", new Location(3365, 3704, 3326, 3671), 0),
	ENTS("Ents", new Location(3320, 3627, 3300, 3584), 0),
	FIFTY_PORTS("50 ports", new Location(3315, 3923, 3301, 3909), 0),
	FIRE_GIANT_ENTRANCE("Fire Giant Entrance", new Location(3051, 3929, 3042, 3920), 0),
	GAP("Gap", new Location(3258, 3855, 3238, 3841), 0),
	GDZ("Gdz", new Location(3296, 3895, 3279, 3875), 0),
	GHORROCK("44s", new Location(2987, 3870, 2973, 3859), 0),
	GLORY_HILL("Glory Hill", new Location(3348, 3890, 3331, 3866), 0),
	GLORY_HOLE("Glory Hole", new Location(3386, 3897, 3352, 3869), 0),
	GRAVES("Graves", new Location(3181, 3686, 3128, 3658), 0),
	GRAVEYARD_DRAGS("Graveyard Drags", new Location(3172, 3717, 3129, 3691), 0),
	GOD_WARS_DUNGEON("God Wars Dungeon", new Location(3027, 3745, 3010, 3727), 0),
	HIGH_ALTAR("High Altar", new Location(2970, 3826, 2945, 3813), 0),
	HILL_GIANTS("Hill Giants", new Location(3300, 3687, 3282, 3674), 0),
	HOB_OBELISK("35 Obelisk", new Location(3115, 3804, 3097, 3785), 0),
	HOBGOBLINS("Hobgoblins", new Location(3104, 3775, 3073, 3745), 0),
	ICE_GATE("Ice Gate", new Location(2978, 3913, 2945, 3878), 0),
	ICE_ROCK("Ice Rock", new Location(2984, 3942, 2957, 3929), 0),
	KBD_CAGE("KBD CAGE", new Location(3021, 3855, 3007, 3839), 0),
	LAVA_DRAGS("Lava Drags", new Location(3221, 3857, 3175, 3805), 0),
	LAVA_MAZE_TELE("Lava Maze Tele", new Location(3044, 3842, 3019, 3812), 0),
	LEVER("Lever", new Location(3162, 3933, 3149, 3917), 0),
	MAGE_ARENA("Mage Arena", new Location(3123, 3949, 3088, 3919), 0),
	MAGE_BANK("Mage Bank", new Location(3103, 3960, 3082, 3952), 0),
	NEW_GATE("New Gate", new Location(3390, 3957, 3345, 3916), 0),
	PORTS_19("19s", new Location(3234, 3672, 3220, 3660), 0),
	OLD_GATE("Old Gate", new Location(3238, 3906, 3211, 3882), 0),
	PIRATE_HUT("Pirate Hut", new Location(3045, 3959, 3037, 3948), 0),
	RESOURCE_ARENA("Resource Arena", new Location(3195, 3946, 3174, 3923), 0),
	REV_BLACK_DRAGS("Rev Black Drags", new Location(3254, 10216, 3223, 10190), 0),
	REV_CAVE("Rev Cave", new Location(3225, 10232, 3128, 10059), 0),
	REV_DARK_BEAST("Rev Dark Beast", new Location(3264, 10154, 3243, 10136), 0),
	REV_ENTRANCE("Rev Entrance", new Location(3142, 3837, 3118, 3818), 0),
	INSIDE_REV_ENT("Inside Rev Ent.", new Location(3243, 10236, 3238, 10231), 0),
	MAIN_REV_CHAMBER("Main Rev Chamber", new Location(3261, 10187, 3227, 10157), 0),
	ROGUE_CASTLE("Rogue Castle", new Location(3299, 3947, 3275, 3920), 0),
	RUNE_ROCKS("Rune Rocks", new Location(3072, 3890, 3055, 3876), 0),
	SCORPIA("Scorpia", new Location(3248, 3949, 3216, 3935), 0),
	SINGLE_STRIP("Single Strip", new Location(3348, 3842, 3333, 3774), 0),
	LVL_18_REV_ENT("Lvl 18 Rev Ent", new Location(3092, 3660, 3071, 3645), 0),
	SPIDER_HILL("Spider Hill", new Location(3182, 3896, 3156, 3871), 0),
	PORTAL_13s("13s", new Location(3168, 3628, 3145, 3609), 0),
	VENENATIS("Venenatis", new Location(3353, 3759, 3298, 3722), 0),
	VETTION("Vet'tion", new Location(3227, 3796, 3183, 3765), 0),
	VOLCANO("Volcano", new Location(3390, 3957, 3345, 3916), 0),
	WEB("Web", new Location(3163, 3961, 3153, 3948), 0),
	WEST_DRAGS("West Drags", new Location(2992, 3627, 2960, 3598), 0),
	WILDY_AGILITY_COURSE("Wildy Agility Course", new Location(3008, 3967, 2988, 3906), 0);



	@Getter
	private final String name;
	@Getter
	private final WorldArea worldArea;

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
		this.worldArea = new WorldArea(location.x, location.y, location.width, location.height, plane);
	}

	/**
	 * Returns all locations that aren't in the wild
	 * @return - A Collection of non-wilderness WorldLocations
	 */
	public static Collection<WorldLocation> getNonWildernessLocations()
	{
		return Arrays.stream(WorldLocation.values()).filter(loc ->
			PvPUtil.getWildernessLevelFrom(loc.worldArea.toWorldPoint()) < 0).collect(Collectors.toList());
	}

	/**
	 * Returns only the WorldLocations that are in the wilderness
	 * @return - A Collection of WorldLocations in the wilderness
	 */
	public static Collection<WorldLocation> getWildernessLocations()
	{
		return Arrays.stream(WorldLocation.values()).filter(loc ->
			PvPUtil.getWildernessLevelFrom(loc.worldArea.toWorldPoint()) > 0).collect(Collectors.toList());
	}

	public static Map<WorldArea, String> getLocationMap()
	{
		Map<WorldArea, String> hashMap = new HashMap<>();
		Arrays.stream(values()).forEach(worldLocation ->
			hashMap.put(worldLocation.getWorldArea(), worldLocation.getName()));
		return hashMap;
	}

	/**
	 * Returns the WorldLocation that a WorldPoint is in, or the closest WorldLocation to the point
	 * @param worldPoint - the WorldPoint to find the WorldLocation of
	 * @return - Containing location or closest location if it isn't in any
	 */
	public static String location(WorldPoint worldPoint)
	{
		final Map<WorldArea, String> locationMap = getLocationMap();
		int dist = 10000;
		String s = "";
		WorldArea closestArea = null;
		for (Map.Entry<WorldArea, String> entry : locationMap.entrySet())
		{
			WorldArea worldArea = entry.getKey();

			if (worldArea.toWorldPointList().contains(worldPoint))
			{
				s = entry.getValue();
				return s;
			}
			int distTo = worldArea.distanceTo(worldArea);
			if (distTo < dist)
			{
				dist = distTo;
				closestArea = worldArea;
			}
		}
		if (worldPoint.getY() > (Objects.requireNonNull(closestArea).toWorldPoint().getY() + closestArea.getHeight()))
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
		s = s + locationMap.get(closestArea);
		if (s.startsWith(" of "))
		{
			s = s.substring(3);
		}
		return s;
	}


	public static class Location
	{
		final int x;
		final int y;
		final int width;
		final int height;

		Location(int x, int y, int x1, int y1)
		{
			this.x = x;
			this.y = y;
			this.width = x1 - x;
			this.height = y1 - y;
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
