import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("n")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("c")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1850190327
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("o")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("g")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("z")
	static byte[][][] field977;
	@ObfuscatedName("y")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("v")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("j")
	static final int[] field980;
	@ObfuscatedName("x")
	static final int[] field982;
	@ObfuscatedName("b")
	static final int[] field972;
	@ObfuscatedName("t")
	static final int[] field984;
	@ObfuscatedName("r")
	static final int[] field985;
	@ObfuscatedName("p")
	static final int[] field973;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -416490741
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2134339611
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1521226335
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field980 = new int[]{1, 2, 4, 8};
		field982 = new int[]{16, 32, 64, 128};
		field972 = new int[]{1, 0, -1, 0};
		field984 = new int[]{0, -1, 0, 1};
		field985 = new int[]{1, -1, -1, 1};
		field973 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1608755247"
	)
	static void method2005() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}
}
