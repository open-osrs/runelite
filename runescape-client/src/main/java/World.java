import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("World")
public class World {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1210898659
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1957007005
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("c")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("u")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "[Llc;"
	)
	@Export("headIconPkSprites")
	static Sprite[] headIconPkSprites;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = 1159940701
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2091631839
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1024222647
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 407096125
	)
	@Export("population")
	int population;
	@ObfuscatedName("x")
	@Export("host")
	String host;
	@ObfuscatedName("p")
	@Export("activity")
	String activity;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 362603231
	)
	@Export("location")
	int location;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 271602597
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-5354489"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-677783544"
	)
	boolean method1901() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1450485210"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-920722517"
	)
	boolean method1888() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "233132577"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "50"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method1880() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-738767899"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (DefaultsGroup.World_worlds != null) { // L: 171
			class1.doWorldSorting(0, DefaultsGroup.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174
}
