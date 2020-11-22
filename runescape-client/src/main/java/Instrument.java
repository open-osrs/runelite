import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("Instrument")
public class Instrument {
	@ObfuscatedName("s")
	@Export("Instrument_samples")
	static int[] Instrument_samples;
	@ObfuscatedName("j")
	@Export("Instrument_noise")
	static int[] Instrument_noise;
	@ObfuscatedName("w")
	@Export("Instrument_sine")
	static int[] Instrument_sine;
	@ObfuscatedName("d")
	@Export("Instrument_phases")
	static int[] Instrument_phases;
	@ObfuscatedName("a")
	@Export("Instrument_delays")
	static int[] Instrument_delays;
	@ObfuscatedName("g")
	@Export("Instrument_volumeSteps")
	static int[] Instrument_volumeSteps;
	@ObfuscatedName("h")
	@Export("Instrument_pitchSteps")
	static int[] Instrument_pitchSteps;
	@ObfuscatedName("i")
	@Export("Instrument_pitchBaseSteps")
	static int[] Instrument_pitchBaseSteps;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("pitch")
	SoundEnvelope pitch;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("volume")
	SoundEnvelope volume;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("pitchModifier")
	SoundEnvelope pitchModifier;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("pitchModifierAmplitude")
	SoundEnvelope pitchModifierAmplitude;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("volumeMultiplier")
	SoundEnvelope volumeMultiplier;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("volumeMultiplierAmplitude")
	SoundEnvelope volumeMultiplierAmplitude;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("release")
	SoundEnvelope release;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("attack")
	SoundEnvelope attack;
	@ObfuscatedName("u")
	@Export("oscillatorVolume")
	int[] oscillatorVolume;
	@ObfuscatedName("t")
	@Export("oscillatorPitch")
	int[] oscillatorPitch;
	@ObfuscatedName("e")
	@Export("oscillatorDelays")
	int[] oscillatorDelays;
	@ObfuscatedName("o")
	@Export("delayTime")
	int delayTime;
	@ObfuscatedName("n")
	@Export("delayDecay")
	int delayDecay;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("filter")
	AudioFilter filter;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("filterEnvelope")
	SoundEnvelope filterEnvelope;
	@ObfuscatedName("r")
	@Export("duration")
	int duration;
	@ObfuscatedName("y")
	@Export("offset")
	int offset;

	static {
		Instrument_noise = new int[32768]; // L: 31
		Random var0 = new Random(0L); // L: 32

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) { // L: 33
			Instrument_noise[var1] = (var0.nextInt() & 2) - 1; // L: 34
		}

		Instrument_sine = new int[32768]; // L: 36

		for (var1 = 0; var1 < 32768; ++var1) { // L: 37
			Instrument_sine[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D); // L: 38
		}

		Instrument_samples = new int[220500]; // L: 40
		Instrument_phases = new int[5]; // L: 44
		Instrument_delays = new int[5]; // L: 45
		Instrument_volumeSteps = new int[5]; // L: 46
		Instrument_pitchSteps = new int[5]; // L: 47
		Instrument_pitchBaseSteps = new int[5]; // L: 48
	}

	Instrument() {
		this.oscillatorVolume = new int[]{0, 0, 0, 0, 0}; // L: 17
		this.oscillatorPitch = new int[]{0, 0, 0, 0, 0}; // L: 18
		this.oscillatorDelays = new int[]{0, 0, 0, 0, 0}; // L: 19
		this.delayTime = 0; // L: 20
		this.delayDecay = 100; // L: 21
		this.duration = 500; // L: 24
		this.offset = 0; // L: 25
	} // L: 50

	@ObfuscatedName("f")
	@Export("synthesize")
	final int[] synthesize(int var1, int var2) {
		class311.clearIntArray(Instrument_samples, 0, var1); // L: 53
		if (var2 < 10) { // L: 54
			return Instrument_samples;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D); // L: 55
			this.pitch.reset(); // L: 56
			this.volume.reset(); // L: 57
			int var5 = 0; // L: 58
			int var6 = 0; // L: 59
			int var7 = 0; // L: 60
			if (this.pitchModifier != null) { // L: 61
				this.pitchModifier.reset(); // L: 62
				this.pitchModifierAmplitude.reset(); // L: 63
				var5 = (int)((double)(this.pitchModifier.end - this.pitchModifier.start) * 32.768D / var3); // L: 64
				var6 = (int)((double)this.pitchModifier.start * 32.768D / var3); // L: 65
			}

			int var8 = 0; // L: 67
			int var9 = 0; // L: 68
			int var10 = 0; // L: 69
			if (this.volumeMultiplier != null) { // L: 70
				this.volumeMultiplier.reset(); // L: 71
				this.volumeMultiplierAmplitude.reset(); // L: 72
				var8 = (int)((double)(this.volumeMultiplier.end - this.volumeMultiplier.start) * 32.768D / var3); // L: 73
				var9 = (int)((double)this.volumeMultiplier.start * 32.768D / var3); // L: 74
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) { // L: 76
				if (this.oscillatorVolume[var11] != 0) { // L: 77
					Instrument_phases[var11] = 0; // L: 78
					Instrument_delays[var11] = (int)((double)this.oscillatorDelays[var11] * var3); // L: 79
					Instrument_volumeSteps[var11] = (this.oscillatorVolume[var11] << 14) / 100; // L: 80
					Instrument_pitchSteps[var11] = (int)((double)(this.pitch.end - this.pitch.start) * 32.768D * Math.pow(1.0057929410678534D, (double)this.oscillatorPitch[var11]) / var3); // L: 81
					Instrument_pitchBaseSteps[var11] = (int)((double)this.pitch.start * 32.768D / var3); // L: 82
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) { // L: 84
				var12 = this.pitch.doStep(var1); // L: 85
				var13 = this.volume.doStep(var1); // L: 86
				if (this.pitchModifier != null) { // L: 87
					var14 = this.pitchModifier.doStep(var1); // L: 88
					var15 = this.pitchModifierAmplitude.doStep(var1); // L: 89
					var12 += this.evaluateWave(var7, var15, this.pitchModifier.form) >> 1; // L: 90
					var7 = var7 + var6 + (var14 * var5 >> 16); // L: 91
				}

				if (this.volumeMultiplier != null) { // L: 93
					var14 = this.volumeMultiplier.doStep(var1); // L: 94
					var15 = this.volumeMultiplierAmplitude.doStep(var1); // L: 95
					var13 = var13 * ((this.evaluateWave(var10, var15, this.volumeMultiplier.form) >> 1) + 32768) >> 15; // L: 96
					var10 = var10 + var9 + (var14 * var8 >> 16); // L: 97
				}

				for (var14 = 0; var14 < 5; ++var14) { // L: 99
					if (this.oscillatorVolume[var14] != 0) { // L: 100
						var15 = Instrument_delays[var14] + var11; // L: 101
						if (var15 < var1) { // L: 102
							var10000 = Instrument_samples; // L: 103
							var10000[var15] += this.evaluateWave(Instrument_phases[var14], var13 * Instrument_volumeSteps[var14] >> 15, this.pitch.form);
							var10000 = Instrument_phases; // L: 104
							var10000[var14] += (var12 * Instrument_pitchSteps[var14] >> 16) + Instrument_pitchBaseSteps[var14];
						}
					}
				}
			}

			int var16;
			if (this.release != null) { // L: 108
				this.release.reset(); // L: 109
				this.attack.reset(); // L: 110
				var11 = 0; // L: 111
				boolean var19 = false; // L: 112
				boolean var20 = true; // L: 113

				for (var14 = 0; var14 < var1; ++var14) { // L: 114
					var15 = this.release.doStep(var1); // L: 115
					var16 = this.attack.doStep(var1); // L: 116
					if (var20) { // L: 117
						var12 = (var15 * (this.release.end - this.release.start) >> 8) + this.release.start;
					} else {
						var12 = (var16 * (this.release.end - this.release.start) >> 8) + this.release.start; // L: 118
					}

					var11 += 256; // L: 119
					if (var11 >= var12) {
						var11 = 0; // L: 120
						var20 = !var20; // L: 121
					}

					if (var20) { // L: 123
						Instrument_samples[var14] = 0;
					}
				}
			}

			if (this.delayTime > 0 && this.delayDecay > 0) { // L: 126
				var11 = (int)((double)this.delayTime * var3); // L: 127

				for (var12 = var11; var12 < var1; ++var12) { // L: 128
					var10000 = Instrument_samples;
					var10000[var12] += Instrument_samples[var12 - var11] * this.delayDecay / 100;
				}
			}

			if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) { // L: 130
				this.filterEnvelope.reset(); // L: 131
				var11 = this.filterEnvelope.doStep(var1 + 1); // L: 132
				var12 = this.filter.compute(0, (float)var11 / 65536.0F); // L: 133
				var13 = this.filter.compute(1, (float)var11 / 65536.0F); // L: 134
				if (var1 >= var12 + var13) { // L: 135
					var14 = 0; // L: 136
					var15 = var13; // L: 137
					if (var13 > var1 - var12) { // L: 138
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)Instrument_samples[var14 + var12] * (long)AudioFilter.forwardMultiplier >> 16); // L: 140

						for (var17 = 0; var17 < var12; ++var17) { // L: 141
							var16 += (int)((long)Instrument_samples[var14 + var12 - 1 - var17] * (long)AudioFilter.coefficients[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) { // L: 142
							var16 -= (int)((long)Instrument_samples[var14 - 1 - var17] * (long)AudioFilter.coefficients[1][var17] >> 16);
						}

						Instrument_samples[var14] = var16; // L: 143
						var11 = this.filterEnvelope.doStep(var1 + 1); // L: 144
						++var14; // L: 139
					}

					var15 = 128; // L: 147

					while (true) {
						if (var15 > var1 - var12) { // L: 149
							var15 = var1 - var12;
						}

						int var18;
						while (var14 < var15) {
							var17 = (int)((long)Instrument_samples[var14 + var12] * (long)AudioFilter.forwardMultiplier >> 16); // L: 151

							for (var18 = 0; var18 < var12; ++var18) { // L: 152
								var17 += (int)((long)Instrument_samples[var14 + var12 - 1 - var18] * (long)AudioFilter.coefficients[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) { // L: 153
								var17 -= (int)((long)Instrument_samples[var14 - 1 - var18] * (long)AudioFilter.coefficients[1][var18] >> 16);
							}

							Instrument_samples[var14] = var17; // L: 154
							var11 = this.filterEnvelope.doStep(var1 + 1); // L: 155
							++var14; // L: 150
						}

						if (var14 >= var1 - var12) { // L: 157
							while (var14 < var1) {
								var17 = 0; // L: 163

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) { // L: 164
									var17 += (int)((long)Instrument_samples[var14 + var12 - 1 - var18] * (long)AudioFilter.coefficients[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) { // L: 165
									var17 -= (int)((long)Instrument_samples[var14 - 1 - var18] * (long)AudioFilter.coefficients[1][var18] >> 16);
								}

								Instrument_samples[var14] = var17; // L: 166
								this.filterEnvelope.doStep(var1 + 1); // L: 167
								++var14; // L: 162
							}
							break;
						}

						var12 = this.filter.compute(0, (float)var11 / 65536.0F); // L: 158
						var13 = this.filter.compute(1, (float)var11 / 65536.0F); // L: 159
						var15 += 128; // L: 160
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) { // L: 171
				if (Instrument_samples[var11] < -32768) { // L: 172
					Instrument_samples[var11] = -32768;
				}

				if (Instrument_samples[var11] > 32767) { // L: 173
					Instrument_samples[var11] = 32767;
				}
			}

			return Instrument_samples; // L: 175
		}
	}

	@ObfuscatedName("b")
	@Export("evaluateWave")
	final int evaluateWave(int var1, int var2, int var3) {
		if (var3 == 1) { // L: 179
			return (var1 & 32767) < 16384 ? var2 : -var2; // L: 180 181
		} else if (var3 == 2) { // L: 183
			return Instrument_sine[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) { // L: 184
			return (var2 * (var1 & 32767) >> 14) - var2;
		} else {
			return var3 == 4 ? var2 * Instrument_noise[var1 / 2607 & 32767] : 0; // L: 185 186
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;)V"
	)
	@Export("decode")
	final void decode(Buffer var1) {
		this.pitch = new SoundEnvelope(); // L: 190
		this.pitch.decode(var1); // L: 191
		this.volume = new SoundEnvelope(); // L: 192
		this.volume.decode(var1); // L: 193
		int var2 = var1.readUnsignedByte(); // L: 194
		if (var2 != 0) { // L: 195
			--var1.offset; // L: 196
			this.pitchModifier = new SoundEnvelope(); // L: 197
			this.pitchModifier.decode(var1); // L: 198
			this.pitchModifierAmplitude = new SoundEnvelope(); // L: 199
			this.pitchModifierAmplitude.decode(var1); // L: 200
		}

		var2 = var1.readUnsignedByte(); // L: 202
		if (var2 != 0) { // L: 203
			--var1.offset; // L: 204
			this.volumeMultiplier = new SoundEnvelope(); // L: 205
			this.volumeMultiplier.decode(var1); // L: 206
			this.volumeMultiplierAmplitude = new SoundEnvelope(); // L: 207
			this.volumeMultiplierAmplitude.decode(var1); // L: 208
		}

		var2 = var1.readUnsignedByte(); // L: 210
		if (var2 != 0) { // L: 211
			--var1.offset; // L: 212
			this.release = new SoundEnvelope(); // L: 213
			this.release.decode(var1); // L: 214
			this.attack = new SoundEnvelope(); // L: 215
			this.attack.decode(var1); // L: 216
		}

		for (int var3 = 0; var3 < 10; ++var3) { // L: 218
			int var4 = var1.readUShortSmart(); // L: 219
			if (var4 == 0) { // L: 220
				break;
			}

			this.oscillatorVolume[var3] = var4; // L: 221
			this.oscillatorPitch[var3] = var1.readShortSmart(); // L: 222
			this.oscillatorDelays[var3] = var1.readUShortSmart(); // L: 223
		}

		this.delayTime = var1.readUShortSmart(); // L: 225
		this.delayDecay = var1.readUShortSmart(); // L: 226
		this.duration = var1.readUnsignedShort(); // L: 227
		this.offset = var1.readUnsignedShort(); // L: 228
		this.filter = new AudioFilter(); // L: 229
		this.filterEnvelope = new SoundEnvelope(); // L: 230
		this.filter.method2844(var1, this.filterEnvelope); // L: 231
	} // L: 232
}
