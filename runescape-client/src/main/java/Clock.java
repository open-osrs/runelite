import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "208275261"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-16016139"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "24"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		GrandExchangeEvent.scrollBarSprites[0].drawAt(var0, var1); // L: 9309
		GrandExchangeEvent.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 9310
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field739); // L: 9311
		int var5 = var3 * (var3 - 32) / var4; // L: 9312
		if (var5 < 8) { // L: 9313
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 9314
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field670); // L: 9315
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field742); // L: 9316
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field742); // L: 9317
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field742); // L: 9318
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field742); // L: 9319
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field741); // L: 9320
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field741); // L: 9321
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field741); // L: 9322
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field741); // L: 9323
	} // L: 9324

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "59"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		DevicePcmPlayerProvider.method897(); // L: 10348

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 10350
			if (var1.obj != null) { // L: 10351
				var1.set();
			}
		}

		int var4 = class195.VarpDefinition_get(var0).type; // L: 10354
		if (var4 != 0) { // L: 10355
			int var2 = Varps.Varps_main[var0]; // L: 10356
			if (var4 == 1) { // L: 10357
				if (var2 == 1) { // L: 10358
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 10359
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 10360
				}

				if (var2 == 2) { // L: 10362
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 10363
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 10364
				}

				if (var2 == 3) { // L: 10366
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 10367
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 10368
				}

				if (var2 == 4) { // L: 10370
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 10371
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 10372
				}

				ItemDefinition.ItemDefinition_cachedSprites.clear(); // L: 10375
			}

			if (var4 == 3) { // L: 10378
				short var3 = 0; // L: 10379
				if (var2 == 0) { // L: 10380
					var3 = 255;
				}

				if (var2 == 1) { // L: 10381
					var3 = 192;
				}

				if (var2 == 2) { // L: 10382
					var3 = 128;
				}

				if (var2 == 3) { // L: 10383
					var3 = 64;
				}

				if (var2 == 4) { // L: 10384
					var3 = 0;
				}

				if (var3 != Client.musicVolume) { // L: 10385
					if (Client.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 10386
						Script.method2322(CollisionMap.archive6, Client.currentTrackGroupId, 0, var3, false); // L: 10387
						Client.field704 = false; // L: 10388
					} else if (var3 == 0) { // L: 10390
						class206.midiPcmStream.clear(); // L: 10392
						class206.musicPlayerStatus = 1; // L: 10393
						class204.musicTrackArchive = null; // L: 10394
						Client.field704 = false; // L: 10396
					} else {
						GrandExchangeEvents.method150(var3); // L: 10398
					}

					Client.musicVolume = var3; // L: 10399
				}
			}

			if (var4 == 4) { // L: 10402
				if (var2 == 0) { // L: 10403
					Client.soundEffectVolume = 127;
				}

				if (var2 == 1) { // L: 10404
					Client.soundEffectVolume = 96;
				}

				if (var2 == 2) { // L: 10405
					Client.soundEffectVolume = 64;
				}

				if (var2 == 3) { // L: 10406
					Client.soundEffectVolume = 32;
				}

				if (var2 == 4) { // L: 10407
					Client.soundEffectVolume = 0;
				}
			}

			if (var4 == 5) { // L: 10409
				Client.leftClickOpensMenu = var2;
			}

			if (var4 == 6) { // L: 10410
				Client.chatEffects = var2;
			}

			if (var4 == 9) { // L: 10411
				Client.field707 = var2;
			}

			if (var4 == 10) { // L: 10412
				if (var2 == 0) { // L: 10413
					Client.areaSoundEffectVolume = 127;
				}

				if (var2 == 1) { // L: 10414
					Client.areaSoundEffectVolume = 96;
				}

				if (var2 == 2) { // L: 10415
					Client.areaSoundEffectVolume = 64;
				}

				if (var2 == 3) { // L: 10416
					Client.areaSoundEffectVolume = 32;
				}

				if (var2 == 4) { // L: 10417
					Client.areaSoundEffectVolume = 0;
				}
			}

			if (var4 == 17) { // L: 10419
				Client.followerIndex = var2 & 65535; // L: 10420
			}

			if (var4 == 18) { // L: 10422
				Client.playerAttackOption = (AttackOption)TextureProvider.findEnumerated(AbstractWorldMapIcon.method679(), var2); // L: 10423
				if (Client.playerAttackOption == null) { // L: 10424
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 10426
				if (var2 == -1) { // L: 10427
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 10428
				}
			}

			if (var4 == 22) { // L: 10430
				Client.npcAttackOption = (AttackOption)TextureProvider.findEnumerated(AbstractWorldMapIcon.method679(), var2); // L: 10431
				if (Client.npcAttackOption == null) { // L: 10432
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 10434
}
