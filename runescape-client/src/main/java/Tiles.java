import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("c")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("b")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -197978705
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("m")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("t")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("s")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("r")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("v")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("k")
	static final int[] field969;
	@ObfuscatedName("f")
	static final int[] field970;
	@ObfuscatedName("l")
	static final int[] field976;
	@ObfuscatedName("q")
	static final int[] field966;
	@ObfuscatedName("x")
	static final int[] field973;
	@ObfuscatedName("z")
	static final int[] field974;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -870044793
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1761339733
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("ho")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field969 = new int[]{1, 2, 4, 8}; // L: 34
		field970 = new int[]{16, 32, 64, 128}; // L: 35
		field976 = new int[]{1, 0, -1, 0}; // L: 36
		field966 = new int[]{0, -1, 0, 1}; // L: 37
		field973 = new int[]{1, -1, -1, 1}; // L: 38
		field974 = new int[]{-1, -1, 1, 1}; // L: 39
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 40
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "1455768075"
	)
	static final String method2108(int var0, int var1) {
		int var2 = var1 - var0; // L: 10359
		if (var2 < -9) { // L: 10360
			return UserComparator5.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10361
			return UserComparator5.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10362
			return UserComparator5.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 10363
			return UserComparator5.colorStartTag(16756736);
		} else if (var2 > 9) { // L: 10364
			return UserComparator5.colorStartTag(65280);
		} else if (var2 > 6) { // L: 10365
			return UserComparator5.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10366
			return UserComparator5.colorStartTag(8453888);
		} else {
			return var2 > 0 ? UserComparator5.colorStartTag(12648192) : UserComparator5.colorStartTag(16776960); // L: 10367 10368
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1582084757"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11372
	}
}
