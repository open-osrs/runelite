import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class118 implements class110 {
	@ObfuscatedName("b")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = 11763445
	)
	@Export("baseY")
	static int baseY;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1768325568"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 152
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "5311"
	)
	static final void method2657() {
		if (SoundSystem.Client_plane != Client.field735) { // L: 3487
			Client.field735 = SoundSystem.Client_plane; // L: 3488
			int var0 = SoundSystem.Client_plane; // L: 3489
			int[] var1 = class414.sceneMinimapSprite.pixels; // L: 3491
			int var2 = var1.length; // L: 3492

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 3493
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 3494
				var4 = (103 - var3) * 2048 + 24628; // L: 3495

				for (var5 = 1; var5 < 103; ++var5) { // L: 3496
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 3497
						Decimator.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						Decimator.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3); // L: 3498
					}

					var4 += 4; // L: 3499
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3502
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3503
			class414.sceneMinimapSprite.setRaster(); // L: 3504

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 3505
				for (var6 = 1; var6 < 103; ++var6) { // L: 3506
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 3507
						class7.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 3508
						class7.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 3511

			for (var5 = 0; var5 < 104; ++var5) { // L: 3512
				for (var6 = 0; var6 < 104; ++var6) { // L: 3513
					long var7 = Decimator.scene.getFloorDecorationTag(SoundSystem.Client_plane, var5, var6); // L: 3514
					if (var7 != 0L) { // L: 3515
						int var9 = Skeleton.Entity_unpackID(var7); // L: 3516
						int var10 = ParamComposition.getObjectDefinition(var9).mapIconId; // L: 3517
						if (var10 >= 0 && class126.WorldMapElement_get(var10).field1773) { // L: 3518 3519
							Client.mapIcons[Client.mapIconCount] = class126.WorldMapElement_get(var10).getSpriteBool(false); // L: 3522
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 3523
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 3524
							++Client.mapIconCount; // L: 3525
						}
					}
				}
			}

			PcmPlayer.rasterProvider.apply(); // L: 3530
		}

	} // L: 3533
}
