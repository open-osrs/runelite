import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class20 extends class16 {
	@ObfuscatedName("k")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = 165647913
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -614436395
	)
	int field171;
	@ObfuscatedName("c")
	byte field168;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -869213719
	)
	int field169;
	@ObfuscatedName("g")
	String field167;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class20(class19 var1) {
		this.this$0 = var1;
		this.field171 = -1; // L: 100
	} // L: 105

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		this.field171 = var1.readUnsignedShort(); // L: 108
		this.field168 = var1.readByte(); // L: 109
		this.field169 = var1.readUnsignedShort(); // L: 110
		var1.readLong(); // L: 111
		this.field167 = var1.readStringCp1252NullTerminated(); // L: 112
	} // L: 113

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		class9 var2 = (class9)var1.field32.get(this.field171); // L: 116
		var2.field76 = this.field168; // L: 117
		var2.field80 = this.field169; // L: 118
		var2.field73 = this.field167; // L: 119
	} // L: 120

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lot;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 57
			var2 = (RunException)var0; // L: 58
			var2.message = var2.message + ' ' + var1; // L: 59
		} else {
			var2 = new RunException(var0, var1); // L: 61
		}

		return var2; // L: 62
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "975727232"
	)
	static final void method272(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 5301
		boolean var4 = false; // L: 5302
		int var5 = -1; // L: 5303
		int var6 = -1; // L: 5304
		int var7 = Players.Players_count; // L: 5305
		int[] var8 = Players.Players_indices; // L: 5306

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5307
			Object var20;
			if (var9 < var7) { // L: 5309
				var20 = Client.players[var8[var9]]; // L: 5310
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5311
					var4 = true; // L: 5312
					var5 = var9; // L: 5313
					continue;
				}

				if (var20 == class35.localPlayer) { // L: 5316
					var6 = var9; // L: 5317
					continue; // L: 5318
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5321
			}

			AbstractWorldMapIcon.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 5322
		}

		if (Client.renderSelf && var6 != -1) { // L: 5324
			AbstractWorldMapIcon.drawActor2d(class35.localPlayer, var6, var0, var1, var2, var3); // L: 5325
		}

		if (var4) { // L: 5327
			AbstractWorldMapIcon.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5328
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 5330
			int var10 = Client.overheadTextXs[var9]; // L: 5331
			int var11 = Client.overheadTextYs[var9]; // L: 5332
			int var12 = Client.overheadTextXOffsets[var9]; // L: 5333
			int var13 = Client.overheadTextAscents[var9]; // L: 5334
			boolean var14 = true; // L: 5335

			while (var14) {
				var14 = false; // L: 5337

				for (int var19 = 0; var19 < var9; ++var19) { // L: 5338
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXOffsets[var19] + Client.overheadTextXs[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 5339 5340
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 5341
						var14 = true; // L: 5342
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 5347
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 5348
			String var15 = Client.overheadText[var9]; // L: 5349
			if (Client.chatEffects == 0) { // L: 5350
				int var16 = 16776960; // L: 5351
				if (Client.overheadTextColors[var9] < 6) { // L: 5352
					var16 = Client.field651[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 5353
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 5354
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 5355
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 5356
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5357
					if (var17 < 50) { // L: 5358
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5359
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5360
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 5362
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5363
					if (var17 < 50) { // L: 5364
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5365
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5366
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 5368
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5369
					if (var17 < 50) { // L: 5370
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5371
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5372
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 5374
					WorldMapArea.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 5375
					WorldMapArea.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 5376
					WorldMapArea.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 5377
					WorldMapArea.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 5378
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (WorldMapArea.fontBold12.stringWidth(var15) + 100) / 150; // L: 5379
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5380
					WorldMapArea.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 5381
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5382
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 5384
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5385
					int var18 = 0; // L: 5386
					if (var17 < 25) { // L: 5387
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5388
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - WorldMapArea.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5389
					WorldMapArea.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 5390
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5391
				}
			} else {
				WorldMapArea.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5395
			}
		}

	} // L: 5398

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11203
		class12.clientPreferences.soundEffectsVolume = var0; // L: 11204
		KeyHandler.savePreferences(); // L: 11205
	} // L: 11206

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIILow;Lil;I)V",
		garbageValue = "541660614"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11472
		if (var6 > 4225 && var6 < 90000) { // L: 11473
			int var7 = Client.camAngleY & 2047; // L: 11474
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11475
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11476
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11477
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11478
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11479
			int var14 = var5.width / 2 - 25; // L: 11480
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11481
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11482
			byte var17 = 20; // L: 11483
			GrandExchangeOfferOwnWorldComparator.redHintArrowSprite.method6900(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11484
		} else {
			class10.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11486
		}

	} // L: 11487
}
