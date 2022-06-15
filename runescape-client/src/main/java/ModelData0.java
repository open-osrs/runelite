import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2071887987
	)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("pcmPlayerProvider")
	static class47 pcmPlayerProvider;
	@ObfuscatedName("az")
	@Export("hasFocus")
	protected static boolean hasFocus;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpq;II)Z",
		garbageValue = "215126751"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 589
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 590
			if (var0.readBits(1) != 0) { // L: 591
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 592
			var4 = var0.readBits(13); // L: 593
			boolean var12 = var0.readBits(1) == 1; // L: 594
			if (var12) { // L: 595
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 596
				throw new RuntimeException(); // L: 597
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 599
				var11.index = var1; // L: 600
				if (Players.field1307[var1] != null) { // L: 601
					var11.read(Players.field1307[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 602
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 603
				var7 = Players.Players_regions[var1]; // L: 604
				var8 = var7 >> 28; // L: 605
				var9 = var7 >> 14 & 255; // L: 606
				var10 = var7 & 255; // L: 607
				var11.pathTraversed[0] = Players.field1304[var1]; // L: 608
				var11.plane = (byte)var8; // L: 609
				var11.resetPath((var9 << 13) + var3 - class28.baseX, (var10 << 13) + var4 - WorldMapLabelSize.baseY); // L: 610
				var11.field1088 = false; // L: 611
				return true; // L: 612
			}
		} else if (var2 == 1) { // L: 614
			var3 = var0.readBits(2); // L: 615
			var4 = Players.Players_regions[var1]; // L: 616
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 617
			return false; // L: 618
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 620
				var3 = var0.readBits(5); // L: 621
				var4 = var3 >> 3; // L: 622
				var5 = var3 & 7; // L: 623
				var6 = Players.Players_regions[var1]; // L: 624
				var7 = (var6 >> 28) + var4 & 3; // L: 625
				var8 = var6 >> 14 & 255; // L: 626
				var9 = var6 & 255; // L: 627
				if (var5 == 0) { // L: 628
					--var8; // L: 629
					--var9; // L: 630
				}

				if (var5 == 1) { // L: 632
					--var9;
				}

				if (var5 == 2) { // L: 633
					++var8; // L: 634
					--var9; // L: 635
				}

				if (var5 == 3) { // L: 637
					--var8;
				}

				if (var5 == 4) { // L: 638
					++var8;
				}

				if (var5 == 5) { // L: 639
					--var8; // L: 640
					++var9; // L: 641
				}

				if (var5 == 6) { // L: 643
					++var9;
				}

				if (var5 == 7) { // L: 644
					++var8; // L: 645
					++var9; // L: 646
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 648
				return false; // L: 649
			} else {
				var3 = var0.readBits(18); // L: 651
				var4 = var3 >> 16; // L: 652
				var5 = var3 >> 8 & 255; // L: 653
				var6 = var3 & 255; // L: 654
				var7 = Players.Players_regions[var1]; // L: 655
				var8 = (var7 >> 28) + var4 & 3; // L: 656
				var9 = var5 + (var7 >> 14) & 255; // L: 657
				var10 = var6 + var7 & 255; // L: 658
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 659
				return false; // L: 660
			}
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method4532() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3633
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3634
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3635
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3647
				if (var1 == null) { // L: 3648
					Object var10000 = null; // L: 3649
					var1 = SoundEffect.readSoundEffect(Client.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3650
						continue;
					}

					int[] var13 = Client.queuedSoundEffectDelays; // L: 3651
					var13[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3652
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3658
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3660
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3661
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3662
						int var5 = var4 * 128 + 64 - class101.localPlayer.x; // L: 3663
						if (var5 < 0) { // L: 3664
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3665
						int var7 = var6 * 128 + 64 - class101.localPlayer.y; // L: 3666
						if (var7 < 0) { // L: 3667
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128; // L: 3668
						if (var8 > var3) { // L: 3669
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3670
							continue; // L: 3671
						}

						if (var8 < 0) { // L: 3673
							var8 = 0;
						}

						var2 = (var3 - var8) * class19.clientPreferences.method2262() / var3; // L: 3674
					} else {
						var2 = class19.clientPreferences.method2241(); // L: 3676
					}

					if (var2 > 0) { // L: 3677
						RawSound var9 = var1.toRawSound().resample(WorldMapRegion.decimator); // L: 3678
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3679
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3680
						class21.pcmStreamMixer.addSubStream(var10); // L: 3681
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3683
				}
			} else {
				--Client.soundEffectCount; // L: 3636

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3637
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3638
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3639
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3640
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3641
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3642
				}

				--var0; // L: 3644
			}
		}

		if (Client.playingJingle) { // L: 3686
			boolean var12;
			if (class272.musicPlayerStatus != 0) { // L: 3689
				var12 = true; // L: 3690
			} else {
				var12 = class272.midiPcmStream.isReady(); // L: 3693
			}

			if (!var12) { // L: 3695
				if (class19.clientPreferences.method2258() != 0 && Client.currentTrackGroupId != -1) { // L: 3696
					AttackOption.method2410(class121.archive6, Client.currentTrackGroupId, 0, class19.clientPreferences.method2258(), false);
				}

				Client.playingJingle = false; // L: 3697
			}
		}

	} // L: 3700
}
