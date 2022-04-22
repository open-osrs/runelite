import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("v")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("c")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1996311103
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("f")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("s")
	static byte[][][] field983;
	@ObfuscatedName("q")
	static int[][] field998;
	@ObfuscatedName("p")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("g")
	static final int[] field990;
	@ObfuscatedName("x")
	static final int[] field989;
	@ObfuscatedName("a")
	static final int[] field992;
	@ObfuscatedName("y")
	static final int[] field993;
	@ObfuscatedName("j")
	static final int[] field997;
	@ObfuscatedName("e")
	static final int[] field995;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1326469755
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1535844851
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field990 = new int[]{1, 2, 4, 8}; // L: 34
		field989 = new int[]{16, 32, 64, 128}; // L: 35
		field992 = new int[]{1, 0, -1, 0}; // L: 36
		field993 = new int[]{0, -1, 0, 1}; // L: 37
		field997 = new int[]{1, -1, -1, 1}; // L: 38
		field995 = new int[]{-1, -1, 1, 1}; // L: 39
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 40
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILhv;[Lgv;)V"
	)
	static final void method2015(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 298
		int var11 = -1; // L: 299

		while (true) {
			int var12 = var10.method7743(); // L: 301
			if (var12 == 0) { // L: 302
				return; // L: 329
			}

			var11 += var12; // L: 303
			int var13 = 0; // L: 304

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 306
				if (var14 == 0) { // L: 307
					break;
				}

				var13 += var14 - 1; // L: 308
				int var15 = var13 & 63; // L: 309
				int var16 = var13 >> 6 & 63; // L: 310
				int var17 = var13 >> 12; // L: 311
				int var18 = var10.readUnsignedByte(); // L: 312
				int var19 = var18 >> 2; // L: 313
				int var20 = var18 & 3; // L: 314
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 315
					ObjectComposition var21 = class146.getObjectDefinition(var11); // L: 316
					int var22 = var2 + StructComposition.method3611(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 317
					int var23 = var3 + class394.method7141(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 318
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) { // L: 319
						int var24 = var1; // L: 320
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) { // L: 321
							var24 = var1 - 1;
						}

						CollisionMap var25 = null; // L: 322
						if (var24 >= 0) { // L: 323
							var25 = var9[var24];
						}

						WorldMapElement.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25); // L: 324
					}
				}
			}
		}
	}
}
