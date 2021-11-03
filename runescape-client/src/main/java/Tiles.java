import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("i")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("w")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -543574297
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("a")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("o")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("g")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("e")
	static byte[][][] field969;
	@ObfuscatedName("y")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("l")
	static int[][][] field962;
	@ObfuscatedName("q")
	static final int[] field964;
	@ObfuscatedName("d")
	static final int[] field967;
	@ObfuscatedName("r")
	static final int[] field966;
	@ObfuscatedName("m")
	static final int[] field960;
	@ObfuscatedName("c")
	static final int[] field957;
	@ObfuscatedName("f")
	static final int[] field970;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 172929931
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1118962133
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("bv")
	@Export("otp")
	static String otp;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field964 = new int[]{1, 2, 4, 8}; // L: 34
		field967 = new int[]{16, 32, 64, 128}; // L: 35
		field966 = new int[]{1, 0, -1, 0}; // L: 36
		field960 = new int[]{0, -1, 0, 1}; // L: 37
		field957 = new int[]{1, -1, -1, 1}; // L: 38
		field970 = new int[]{-1, -1, 1, 1}; // L: 39
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 40
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "151"
	)
	public static boolean method2045(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 33
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-98"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10199

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10200
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10201
		}

		if (var1.length() > 9) { // L: 10203
			return " " + MouseHandler.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + MouseHandler.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + MouseHandler.colorStartTag(16776960) + var1 + "</col>"; // L: 10204 10205
		}
	}
}
