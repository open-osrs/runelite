import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("World")
public class World {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 424514993
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1627138945
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("w")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("v")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1204793871
	)
	@Export("id")
	int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1353463065
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1508326675
	)
	@Export("population")
	int population;
	@ObfuscatedName("q")
	@Export("host")
	String host;
	@ObfuscatedName("x")
	@Export("activity")
	String activity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -828676327
	)
	@Export("location")
	int location;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -190751717
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-406459188"
	)
	boolean method1649() {
		return (2 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "20"
	)
	boolean method1662() {
		return (8 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-305789619"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-786125281"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "63"
	)
	boolean method1640() {
		return (1073741824 & this.properties) != 0; // L: 281
	}
}
