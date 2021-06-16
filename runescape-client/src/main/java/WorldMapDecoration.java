import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("j")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	static GameBuild field2084;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2029148241
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 968273187
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -576802065
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1240184930"
	)
	static final void method3710(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 5322
		boolean var4 = false; // L: 5323
		int var5 = -1; // L: 5324
		int var6 = -1; // L: 5325
		int var7 = Players.Players_count; // L: 5326
		int[] var8 = Players.Players_indices; // L: 5327

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5328
			Object var20;
			if (var9 < var7) { // L: 5330
				var20 = Client.players[var8[var9]]; // L: 5331
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5332
					var4 = true; // L: 5333
					var5 = var9; // L: 5334
					continue;
				}

				if (var20 == class262.localPlayer) { // L: 5337
					var6 = var9; // L: 5338
					continue; // L: 5339
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5342
			}

			UserComparator4.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 5343
		}

		if (Client.renderSelf && var6 != -1) { // L: 5345
			UserComparator4.drawActor2d(class262.localPlayer, var6, var0, var1, var2, var3); // L: 5346
		}

		if (var4) { // L: 5348
			UserComparator4.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5349
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 5351
			int var10 = Client.overheadTextXs[var9]; // L: 5352
			int var11 = Client.overheadTextYs[var9]; // L: 5353
			int var12 = Client.overheadTextXOffsets[var9]; // L: 5354
			int var13 = Client.overheadTextAscents[var9]; // L: 5355
			boolean var14 = true; // L: 5356

			while (var14) {
				var14 = false; // L: 5358

				for (int var19 = 0; var19 < var9; ++var19) { // L: 5359
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 5360 5361
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 5362
						var14 = true; // L: 5363
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 5368
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 5369
			String var15 = Client.overheadText[var9]; // L: 5370
			if (Client.chatEffects == 0) { // L: 5371
				int var16 = 16776960; // L: 5372
				if (Client.overheadTextColors[var9] < 6) { // L: 5373
					var16 = Client.field725[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 5374
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 5375
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 5376
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 5377
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5378
					if (var17 < 50) { // L: 5379
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5380
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5381
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 5383
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5384
					if (var17 < 50) { // L: 5385
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5386
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5387
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 5389
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5390
					if (var17 < 50) { // L: 5391
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5392
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5393
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 5395
					class309.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 5396
					class309.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 5397
					class309.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 5398
					class309.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 5399
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class309.fontBold12.stringWidth(var15) + 100) / 150; // L: 5400
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5401
					class309.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 5402
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5403
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 5405
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5406
					int var18 = 0; // L: 5407
					if (var17 < 25) { // L: 5408
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5409
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class309.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5410
					class309.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 5411
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5412
				}
			} else {
				class309.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5416
			}
		}

	} // L: 5419
}
