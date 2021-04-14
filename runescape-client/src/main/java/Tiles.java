import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("f")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("o")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -725804883
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("b")
	static byte[][][] field1092;
	@ObfuscatedName("e")
	static byte[][][] field1091;
	@ObfuscatedName("n")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("l")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("m")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("v")
	static final int[] field1094;
	@ObfuscatedName("x")
	static final int[] field1098;
	@ObfuscatedName("z")
	static final int[] field1097;
	@ObfuscatedName("i")
	static final int[] field1100;
	@ObfuscatedName("a")
	static final int[] field1101;
	@ObfuscatedName("w")
	static final int[] field1099;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1418652947
	)
	static int field1103;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 4127251
	)
	static int field1104;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field1094 = new int[]{1, 2, 4, 8}; // L: 34
		field1098 = new int[]{16, 32, 64, 128}; // L: 35
		field1097 = new int[]{1, 0, -1, 0}; // L: 36
		field1100 = new int[]{0, -1, 0, 1}; // L: 37
		field1101 = new int[]{1, -1, -1, 1};
		field1099 = new int[]{-1, -1, 1, 1};
		field1103 = (int)(Math.random() * 17.0D) - 8;
		field1104 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcc;",
		garbageValue = "-560076270"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class137.method2654(var1, var0); // L: 38
		Script var4 = Widget.method4292(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = class124.method2489(var2, var0); // L: 43
			var4 = Widget.method4292(var3, var0); // L: 44
			return var4 != null ? var4 : null; // L: 45 48
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "-2019872849"
	)
	public static FloorUnderlayDefinition method2035(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 25
			var1 = new FloorUnderlayDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 28
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
