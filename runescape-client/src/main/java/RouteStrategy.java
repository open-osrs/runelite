import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -708053839
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 796824927
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 942230725
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2021281887
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILgf;I)Z",
		garbageValue = "-2070013036"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V",
		garbageValue = "-1568372514"
	)
	static void method3873(Archive var0, int var1) {
		if (class122.NetCache_reference != null) { // L: 211
			class122.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = class122.NetCache_reference.readInt();
			int var3 = class122.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			TriBool.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0; // L: 219
		}
	} // L: 220

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2126759813"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 176
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 177
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 178
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-55125804"
	)
	static void method3872() {
		class451.SpriteBuffer_xOffsets = null; // L: 212
		class451.SpriteBuffer_yOffsets = null; // L: 213
		class451.SpriteBuffer_spriteWidths = null; // L: 214
		class451.SpriteBuffer_spriteHeights = null; // L: 215
		GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette = null; // L: 216
		class460.SpriteBuffer_pixels = null; // L: 217
	} // L: 218

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "160319401"
	)
	static final int method3869() {
		if (Interpreter.clientPreferences.method2255()) { // L: 4364
			return class160.Client_plane;
		} else {
			int var0 = 3; // L: 4365
			if (Language.cameraPitch < 310) { // L: 4366
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 4369
					var1 = Messages.oculusOrbFocalPointX >> 7; // L: 4370
					var2 = class115.oculusOrbFocalPointY >> 7; // L: 4371
				} else {
					var1 = class19.localPlayer.x >> 7; // L: 4374
					var2 = class19.localPlayer.y >> 7; // L: 4375
				}

				int var3 = EnumComposition.cameraX >> 7; // L: 4377
				int var4 = CollisionMap.cameraZ >> 7; // L: 4378
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 4379
					return class160.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 4380
					return class160.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class160.Client_plane][var3][var4] & 4) != 0) { // L: 4381
					var0 = class160.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 4383
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 4384
				}

				int var6;
				if (var2 > var4) { // L: 4386
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 4387
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 4388
					var7 = var6 * 65536 / var5; // L: 4389
					var8 = 32768; // L: 4390

					while (var3 != var1) { // L: 4391
						if (var3 < var1) { // L: 4392
							++var3;
						} else if (var3 > var1) { // L: 4393
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class160.Client_plane][var3][var4] & 4) != 0) { // L: 4394
							var0 = class160.Client_plane;
						}

						var8 += var7; // L: 4395
						if (var8 >= 65536) { // L: 4396
							var8 -= 65536; // L: 4397
							if (var4 < var2) { // L: 4398
								++var4;
							} else if (var4 > var2) { // L: 4399
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class160.Client_plane][var3][var4] & 4) != 0) { // L: 4400
								var0 = class160.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 4404
					var7 = var5 * 65536 / var6; // L: 4405
					var8 = 32768; // L: 4406

					while (var2 != var4) { // L: 4407
						if (var4 < var2) { // L: 4408
							++var4;
						} else if (var4 > var2) { // L: 4409
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class160.Client_plane][var3][var4] & 4) != 0) { // L: 4410
							var0 = class160.Client_plane;
						}

						var8 += var7; // L: 4411
						if (var8 >= 65536) { // L: 4412
							var8 -= 65536; // L: 4413
							if (var3 < var1) { // L: 4414
								++var3;
							} else if (var3 > var1) { // L: 4415
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class160.Client_plane][var3][var4] & 4) != 0) { // L: 4416
								var0 = class160.Client_plane;
							}
						}
					}
				}
			}

			if (class19.localPlayer.x >= 0 && class19.localPlayer.y >= 0 && class19.localPlayer.x < 13312 && class19.localPlayer.y < 13312) { // L: 4421
				if ((Tiles.Tiles_renderFlags[class160.Client_plane][class19.localPlayer.x >> 7][class19.localPlayer.y >> 7] & 4) != 0) { // L: 4422
					var0 = class160.Client_plane;
				}

				return var0; // L: 4423
			} else {
				return class160.Client_plane;
			}
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-655837204"
	)
	static final void method3875() {
		Client.field687 = Client.cycleCntr; // L: 11710
		class82.field1070 = true; // L: 11711
	} // L: 11712
}
