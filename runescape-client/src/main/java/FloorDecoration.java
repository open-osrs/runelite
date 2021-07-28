import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1065761401
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -612034411
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -768005843
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -8544200535771831587L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -871159579
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1217280037"
	)
	static final void method3877() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(InvDefinition.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) {
						continue;
					}

					int[] var13 = Client.queuedSoundEffectDelays;
					var13[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - MouseHandler.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - MouseHandler.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var2 = (var3 - var8) * Decimator.clientPreferences.areaSoundEffectsVolume / var3;
					} else {
						var2 = Decimator.clientPreferences.soundEffectsVolume;
					}

					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(FloorOverlayDefinition.decimator);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						TileItem.pcmStreamMixer.addSubStream(var10);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) {
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1];
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1];
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1];
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1];
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1];
				}

				--var0;
			}
		}

		if (Client.field647) {
			boolean var12;
			if (class234.musicPlayerStatus != 0) {
				var12 = true;
			} else {
				var12 = class234.midiPcmStream.isReady();
			}

			if (!var12) {
				if (Decimator.clientPreferences.musicVolume != 0 && Client.currentTrackGroupId != -1) {
					Players.method2022(class108.archive6, Client.currentTrackGroupId, 0, Decimator.clientPreferences.musicVolume, false);
				}

				Client.field647 = false;
			}
		}

	}
}
