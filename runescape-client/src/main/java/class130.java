import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class130 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -766044217
	)
	int field1481;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class130(class119 var1) {
		this.this$0 = var1;
		this.field1481 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1481 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2687(this.field1481); // L: 222
	} // L: 223

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lii;",
		garbageValue = "1725898697"
	)
	public static class240[] method2748() {
		return new class240[]{class240.field2782, class240.field2773, class240.field2774, class240.field2775, class240.field2777, class240.field2779, class240.field2778, class240.field2772, class240.field2780, class240.field2781}; // L: 17
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static void method2746(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 85
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 86
				int var5 = 0; // L: 87
				if (var1 > var4.maxX) { // L: 88
					var5 += var1 - var4.maxX;
				} else if (var1 < var4.x) { // L: 89
					var5 += var4.x - var1;
				}

				if (var2 > var4.maxY) { // L: 90
					var5 += var2 - var4.maxY;
				} else if (var2 < var4.y) { // L: 91
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field773 && class408.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 92
					var5 -= 64; // L: 103
					if (var5 < 0) { // L: 104
						var5 = 0;
					}

					int var6 = (var4.field773 - var5) * class408.clientPreferences.areaSoundEffectsVolume / var4.field773; // L: 105
					if (var4.stream1 == null) { // L: 106
						if (var4.soundEffectId >= 0) { // L: 107
							SoundEffect var7 = SoundEffect.readSoundEffect(class12.archive4, var4.soundEffectId, 0); // L: 108
							if (var7 != null) { // L: 109
								RawSound var8 = var7.toRawSound().resample(FontName.decimator); // L: 110
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 111
								var9.setNumLoops(-1); // L: 112
								BuddyRankComparator.pcmStreamMixer.addSubStream(var9); // L: 113
								var4.stream1 = var9; // L: 114
							}
						}
					} else {
						var4.stream1.method821(var6); // L: 118
					}

					if (var4.stream2 == null) { // L: 119
						if (var4.soundEffectIds != null && (var4.field779 -= var3) <= 0) { // L: 120
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 121
							SoundEffect var12 = SoundEffect.readSoundEffect(class12.archive4, var4.soundEffectIds[var11], 0); // L: 122
							if (var12 != null) { // L: 123
								RawSound var13 = var12.toRawSound().resample(FontName.decimator); // L: 124
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 125
								var10.setNumLoops(0); // L: 126
								BuddyRankComparator.pcmStreamMixer.addSubStream(var10); // L: 127
								var4.stream2 = var10; // L: 128
								var4.field779 = var4.field767 + (int)(Math.random() * (double)(var4.field776 - var4.field767)); // L: 129
							}
						}
					} else {
						var4.stream2.method821(var6); // L: 134
						if (!var4.stream2.hasNext()) { // L: 135
							var4.stream2 = null; // L: 136
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 93
						BuddyRankComparator.pcmStreamMixer.removeSubStream(var4.stream1); // L: 94
						var4.stream1 = null; // L: 95
					}

					if (var4.stream2 != null) { // L: 97
						BuddyRankComparator.pcmStreamMixer.removeSubStream(var4.stream2); // L: 98
						var4.stream2 = null; // L: 99
					}
				}
			}
		}

	} // L: 140
}
