import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("k")
	static float[][] field397;
	@ObfuscatedName("t")
	@Export("coefficients")
	static int[][] coefficients;
	@ObfuscatedName("a")
	static float field399;
	@ObfuscatedName("e")
	@Export("forwardMultiplier")
	static int forwardMultiplier;
	@ObfuscatedName("l")
	@Export("pairs")
	int[] pairs;
	@ObfuscatedName("f")
	int[][][] field394;
	@ObfuscatedName("j")
	int[][][] field395;
	@ObfuscatedName("m")
	int[] field401;

	static {
		field397 = new float[2][8];
		coefficients = new int[2][8];
	}

	AudioFilter() {
		this.pairs = new int[2];
		this.field394 = new int[2][2][4];
		this.field395 = new int[2][2][4];
		this.field401 = new int[2];
	}

	@ObfuscatedName("l")
	float method1026(int var1, int var2, float var3) {
		float var4 = (float)this.field395[var1][0][var2] + var3 * (float)(this.field395[var1][1][var2] - this.field395[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfuscatedName("f")
	float method1028(int var1, int var2, float var3) {
		float var4 = (float)this.field394[var1][0][var2] + var3 * (float)(this.field394[var1][1][var2] - this.field394[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return normalize(var4);
	}

	@ObfuscatedName("j")
	@Export("compute")
	int compute(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field401[0] + (float)(this.field401[1] - this.field401[0]) * var2;
			var3 *= 0.0030517578F;
			field399 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			forwardMultiplier = (int)(field399 * 65536.0F);
		}

		if (this.pairs[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1026(var1, 0, var2);
			field397[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1028(var1, 0, var2));
			field397[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.pairs[var1]; ++var4) {
				var3 = this.method1026(var1, var4, var2);
				float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1028(var1, var4, var2));
				float var6 = var3 * var3;
				field397[var1][var4 * 2 + 1] = field397[var1][var4 * 2 - 1] * var6;
				field397[var1][var4 * 2] = field397[var1][var4 * 2 - 1] * var5 + field397[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field397[var1];
					var10000[var7] += field397[var1][var7 - 1] * var5 + field397[var1][var7 - 2] * var6;
				}

				var10000 = field397[var1];
				var10000[1] += field397[var1][0] * var5 + var6;
				var10000 = field397[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
					var10000 = field397[0];
					var10000[var4] *= field399;
				}
			}

			for (var4 = 0; var4 < this.pairs[var1] * 2; ++var4) {
				coefficients[var1][var4] = (int)(field397[var1][var4] * 65536.0F);
			}

			return this.pairs[var1] * 2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;Lar;)V"
	)
	final void method1029(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte();
		this.pairs[0] = var3 >> 4;
		this.pairs[1] = var3 & 15;
		if (var3 != 0) {
			this.field401[0] = var1.readUnsignedShort();
			this.field401[1] = var1.readUnsignedShort();
			int var7 = var1.readUnsignedByte();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					this.field394[var5][0][var6] = var1.readUnsignedShort();
					this.field395[var5][0][var6] = var1.readUnsignedShort();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					if ((var7 & 1 << var5 * 4 << var6) != 0) {
						this.field394[var5][1][var6] = var1.readUnsignedShort();
						this.field395[var5][1][var6] = var1.readUnsignedShort();
					} else {
						this.field394[var5][1][var6] = this.field394[var5][0][var6];
						this.field395[var5][1][var6] = this.field395[var5][0][var6];
					}
				}
			}

			if (var7 != 0 || this.field401[1] != this.field401[0]) {
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field401;
			this.field401[1] = 0;
			var4[0] = 0;
		}

	}

	@ObfuscatedName("q")
	@Export("normalize")
	static float normalize(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
