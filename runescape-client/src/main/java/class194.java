import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class194 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	static final class194 field2189;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	static final class194 field2184;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -2080703643
	)
	static int field2186;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -814877491
	)
	@Export("value")
	final int value;

	static {
		field2189 = new class194(0);
		field2184 = new class194(1);
	}

	class194(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "28"
	)
	static void method3875(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field807) {
					var5 += var1 - var4.field807;
				} else if (var1 < var4.x) {
					var5 += var4.x - var1;
				}

				if (var2 > var4.field803) {
					var5 += var2 - var4.field803;
				} else if (var2 < var4.y) {
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field804 && WorldMapDecorationType.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field804 - var5) * WorldMapDecorationType.clientPreferences.areaSoundEffectsVolume / var4.field804;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(class260.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(RouteStrategy.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method891(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field811 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(class260.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(RouteStrategy.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field811 = var4.field808 + (int)(Math.random() * (double)(var4.field809 - var4.field808));
							}
						}
					} else {
						var4.stream2.method891(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-709809423"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}
