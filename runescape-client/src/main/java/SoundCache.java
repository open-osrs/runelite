import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lab;",
		garbageValue = "-12"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null; // L: 23
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) { // L: 28
					var3[0] -= var7.samples.length;
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lab;",
		garbageValue = "-33"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lab;",
		garbageValue = "8"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lab;",
		garbageValue = "1424152379"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-501729153"
	)
	static void method800(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 93
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 94
				int var5 = 0; // L: 95
				if (var1 > var4.maxX) { // L: 96
					var5 += var1 - var4.maxX;
				} else if (var1 < var4.x) { // L: 97
					var5 += var4.x - var1;
				}

				if (var2 > var4.maxY) { // L: 98
					var5 += var2 - var4.maxY;
				} else if (var2 < var4.y) { // L: 99
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field822 && class424.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 100
					var5 -= 64; // L: 111
					if (var5 < 0) { // L: 112
						var5 = 0;
					}

					int var6 = (var4.field822 - var5) * class424.clientPreferences.areaSoundEffectsVolume / var4.field822; // L: 113
					if (var4.stream1 == null) { // L: 114
						if (var4.soundEffectId >= 0) { // L: 115
							SoundEffect var7 = SoundEffect.readSoundEffect(class403.archive4, var4.soundEffectId, 0); // L: 116
							if (var7 != null) { // L: 117
								RawSound var8 = var7.toRawSound().resample(class131.decimator); // L: 118
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 119
								var9.setNumLoops(-1); // L: 120
								class123.pcmStreamMixer.addSubStream(var9); // L: 121
								var4.stream1 = var9; // L: 122
							}
						}
					} else {
						var4.stream1.method813(var6); // L: 126
					}

					if (var4.stream2 == null) { // L: 127
						if (var4.soundEffectIds != null && (var4.field826 -= var3) <= 0) { // L: 128
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 129
							SoundEffect var12 = SoundEffect.readSoundEffect(class403.archive4, var4.soundEffectIds[var11], 0); // L: 130
							if (var12 != null) { // L: 131
								RawSound var13 = var12.toRawSound().resample(class131.decimator); // L: 132
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 133
								var10.setNumLoops(0); // L: 134
								class123.pcmStreamMixer.addSubStream(var10); // L: 135
								var4.stream2 = var10; // L: 136
								var4.field826 = var4.field820 + (int)(Math.random() * (double)(var4.field830 - var4.field820)); // L: 137
							}
						}
					} else {
						var4.stream2.method813(var6); // L: 142
						if (!var4.stream2.hasNext()) { // L: 143
							var4.stream2 = null; // L: 144
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 101
						class123.pcmStreamMixer.removeSubStream(var4.stream1); // L: 102
						var4.stream1 = null; // L: 103
					}

					if (var4.stream2 != null) { // L: 105
						class123.pcmStreamMixer.removeSubStream(var4.stream2); // L: 106
						var4.stream2 = null; // L: 107
					}
				}
			}
		}

	} // L: 148

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)[Ldo;",
		garbageValue = "-23360"
	)
	static class117[] method792() {
		return new class117[]{class117.field1457, class117.field1445, class117.field1444, class117.field1446, class117.field1448, class117.field1449, class117.field1450, class117.field1452, class117.field1447, class117.field1453, class117.field1454, class117.field1455, class117.field1456, class117.field1462, class117.field1458, class117.field1451, class117.field1460}; // L: 74
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1792385733"
	)
	static final void method785() {
		Client.field658 = 0; // L: 5167
		int var0 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX; // L: 5168
		int var1 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY; // L: 5169
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5170
			Client.field658 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5171
			Client.field658 = 1;
		}

		if (Client.field658 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5172
			Client.field658 = 0;
		}

	} // L: 5173
}
