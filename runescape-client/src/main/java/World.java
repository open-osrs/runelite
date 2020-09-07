import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("World")
public class World {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1992113923
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1564802557
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("w")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("g")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1790821377
	)
	@Export("id")
	int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -370098411
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1089553333
	)
	@Export("population")
	int population;
	@ObfuscatedName("a")
	@Export("host")
	String host;
	@ObfuscatedName("q")
	@Export("activity")
	String activity;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -82869953
	)
	@Export("location")
	int location;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1577335433
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "17"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2022198526"
	)
	boolean method1821() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1058529393"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-973887328"
	)
	boolean method1823() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-101"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-249036975"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1700714003"
	)
	boolean method1826() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1732366534"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class92.method2141(var0, 10, true); // L: 34
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "500"
	)
	static int method1845(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 313
		return TilePaint.NetCache_currentResponse != null && var2 == TilePaint.NetCache_currentResponse.key ? class224.NetCache_responseArchiveBuffer.offset * 99 / (class224.NetCache_responseArchiveBuffer.array.length - TilePaint.NetCache_currentResponse.padding) + 1 : 0; // L: 314 315
	}
}
