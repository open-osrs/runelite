import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("gp")
public class class197 {
	@ObfuscatedName("z")
	static int[] field2380;

	static {
		new Object();
		field2380 = new int[33]; // L: 8
		field2380[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2380[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static void method3743(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 93
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 94
				int var5 = 0; // L: 95
				if (var1 > var4.field1106) { // L: 96
					var5 += var1 - var4.field1106;
				} else if (var1 < var4.x) { // L: 97
					var5 += var4.x - var1;
				}

				if (var2 > var4.field1117) { // L: 98
					var5 += var2 - var4.field1117;
				} else if (var2 < var4.y) { // L: 99
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field1108 && Client.areaSoundEffectVolume != 0 && var0 == var4.plane) { // L: 100
					var5 -= 64; // L: 111
					if (var5 < 0) { // L: 112
						var5 = 0;
					}

					int var6 = (var4.field1108 - var5) * Client.areaSoundEffectVolume / var4.field1108; // L: 113
					if (var4.stream1 == null) { // L: 114
						if (var4.soundEffectId >= 0) { // L: 115
							SoundEffect var7 = SoundEffect.readSoundEffect(GrandExchangeOfferUnitPriceComparator.archive4, var4.soundEffectId, 0); // L: 116
							if (var7 != null) { // L: 117
								RawSound var8 = var7.toRawSound().resample(class9.decimator); // L: 118
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 119
								var9.setNumLoops(-1); // L: 120
								Players.pcmStreamMixer.addSubStream(var9); // L: 121
								var4.stream1 = var9; // L: 122
							}
						}
					} else {
						var4.stream1.method2641(var6); // L: 126
					}

					if (var4.stream2 == null) { // L: 127
						if (var4.soundEffectIds != null && (var4.field1118 -= var3) <= 0) { // L: 128
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 129
							SoundEffect var12 = SoundEffect.readSoundEffect(GrandExchangeOfferUnitPriceComparator.archive4, var4.soundEffectIds[var11], 0); // L: 130
							if (var12 != null) { // L: 131
								RawSound var13 = var12.toRawSound().resample(class9.decimator); // L: 132
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 133
								var10.setNumLoops(0); // L: 134
								Players.pcmStreamMixer.addSubStream(var10); // L: 135
								var4.stream2 = var10; // L: 136
								var4.field1118 = var4.field1109 + (int)(Math.random() * (double)(var4.field1115 - var4.field1109)); // L: 137
							}
						}
					} else {
						var4.stream2.method2641(var6); // L: 142
						if (!var4.stream2.hasNext()) { // L: 143
							var4.stream2 = null; // L: 144
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 101
						Players.pcmStreamMixer.removeSubStream(var4.stream1); // L: 102
						var4.stream1 = null; // L: 103
					}

					if (var4.stream2 != null) { // L: 105
						Players.pcmStreamMixer.removeSubStream(var4.stream2); // L: 106
						var4.stream2 = null; // L: 107
					}
				}
			}
		}

	} // L: 148

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "432871093"
	)
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 216
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 217
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 218
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 219
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 220
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 221
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lic;IB)Z",
		garbageValue = "1"
	)
	public static boolean method3742(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 222
		if (var2 == null) { // L: 223
			return false;
		} else {
			Occluder.SpriteBuffer_decode(var2); // L: 224
			return true; // L: 225
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-822542722"
	)
	static int method3741(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 3193
	}
}
