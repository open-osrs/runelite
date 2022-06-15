import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("c")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("v")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1266793715
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("f")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("j")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("e")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("g")
	static byte[][][] field996;
	@ObfuscatedName("s")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("l")
	static final int[] field1007;
	@ObfuscatedName("a")
	static final int[] field1011;
	@ObfuscatedName("p")
	static final int[] field1003;
	@ObfuscatedName("b")
	static final int[] field1005;
	@ObfuscatedName("n")
	static final int[] field1006;
	@ObfuscatedName("o")
	static final int[] field1002;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1814148363
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1220296573
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field1007 = new int[]{1, 2, 4, 8}; // L: 34
		field1011 = new int[]{16, 32, 64, 128}; // L: 35
		field1003 = new int[]{1, 0, -1, 0}; // L: 36
		field1005 = new int[]{0, -1, 0, 1}; // L: 37
		field1006 = new int[]{1, -1, -1, 1}; // L: 38
		field1002 = new int[]{-1, -1, 1, 1}; // L: 39
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 40
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2041916936"
	)
	static void method2065() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 60
			if (ArchiveDiskActionHandler.field3971 == 0) { // L: 61
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 62
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 63
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 64
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 65
			}

			ArchiveDiskActionHandler.field3971 = 600; // L: 67
		}
	} // L: 69

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgg;[Lgv;)V"
	)
	static final void method2007(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 260
		int var11 = -1; // L: 261

		while (true) {
			int var12 = var10.method7770(); // L: 263
			if (var12 == 0) { // L: 264
				return; // L: 291
			}

			var11 += var12; // L: 265
			int var13 = 0; // L: 266

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 268
				if (var14 == 0) { // L: 269
					break;
				}

				var13 += var14 - 1; // L: 270
				int var15 = var13 & 63; // L: 271
				int var16 = var13 >> 6 & 63; // L: 272
				int var17 = var13 >> 12; // L: 273
				int var18 = var10.readUnsignedByte(); // L: 274
				int var19 = var18 >> 2; // L: 275
				int var20 = var18 & 3; // L: 276
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 277
					ObjectComposition var21 = class162.getObjectDefinition(var11); // L: 278
					int var22 = var2 + FloorOverlayDefinition.method3810(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 279
					int var23 = var3 + class141.method3044(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 280
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) { // L: 281
						int var24 = var1; // L: 282
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) { // L: 283
							var24 = var1 - 1;
						}

						CollisionMap var25 = null; // L: 284
						if (var24 >= 0) { // L: 285
							var25 = var9[var24];
						}

						class268.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25); // L: 286
					}
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-21"
	)
	static void method2021() {
		Login.worldSelectOpen = false; // L: 1932
		class16.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1933
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1934
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1935
	} // L: 1936
}
