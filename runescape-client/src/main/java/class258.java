import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class258 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "862328928"
	)
	static void method4608(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 53
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 54
				int var5 = 0; // L: 55
				if (var1 > var4.field916) { // L: 56
					var5 += var1 - var4.field916;
				} else if (var1 < var4.x) { // L: 57
					var5 += var4.x - var1;
				}

				if (var2 > var4.field917) { // L: 58
					var5 += var2 - var4.field917;
				} else if (var2 < var4.y) { // L: 59
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field918 && Login.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 60
					var5 -= 64; // L: 71
					if (var5 < 0) { // L: 72
						var5 = 0;
					}

					int var6 = (var4.field918 - var5) * Login.clientPreferences.areaSoundEffectsVolume / var4.field918; // L: 73
					if (var4.stream1 == null) { // L: 74
						if (var4.soundEffectId >= 0) { // L: 75
							SoundEffect var7 = SoundEffect.readSoundEffect(ItemContainer.archive4, var4.soundEffectId, 0); // L: 76
							if (var7 != null) { // L: 77
								RawSound var8 = var7.toRawSound().resample(class34.decimator); // L: 78
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 79
								var9.setNumLoops(-1); // L: 80
								Huffman.pcmStreamMixer.addSubStream(var9); // L: 81
								var4.stream1 = var9; // L: 82
							}
						}
					} else {
						var4.stream1.method901(var6); // L: 86
					}

					if (var4.stream2 == null) { // L: 87
						if (var4.soundEffectIds != null && (var4.field924 -= var3) <= 0) { // L: 88
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 89
							SoundEffect var12 = SoundEffect.readSoundEffect(ItemContainer.archive4, var4.soundEffectIds[var11], 0); // L: 90
							if (var12 != null) { // L: 91
								RawSound var13 = var12.toRawSound().resample(class34.decimator); // L: 92
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 93
								var10.setNumLoops(0); // L: 94
								Huffman.pcmStreamMixer.addSubStream(var10); // L: 95
								var4.stream2 = var10; // L: 96
								var4.field924 = var4.field921 + (int)(Math.random() * (double)(var4.field922 - var4.field921)); // L: 97
							}
						}
					} else {
						var4.stream2.method901(var6); // L: 102
						if (!var4.stream2.hasNext()) { // L: 103
							var4.stream2 = null; // L: 104
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 61
						Huffman.pcmStreamMixer.removeSubStream(var4.stream1); // L: 62
						var4.stream1 = null; // L: 63
					}

					if (var4.stream2 != null) { // L: 65
						Huffman.pcmStreamMixer.removeSubStream(var4.stream2); // L: 66
						var4.stream2 = null; // L: 67
					}
				}
			}
		}

	} // L: 108
}
