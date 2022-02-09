import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ax")
@Implements("VorbisCodebook")
public class VorbisCodebook {
	@ObfuscatedName("c")
	@Export("dimensions")
	int dimensions;
	@ObfuscatedName("l")
	@Export("entries")
	int entries;
	@ObfuscatedName("s")
	@Export("lengthMap")
	int[] lengthMap;
	@ObfuscatedName("e")
	int[] field371;
	@ObfuscatedName("r")
	float[][] field369;
	@ObfuscatedName("o")
	@Export("keys")
	int[] keys;

	VorbisCodebook() {
		VorbisSample.readBits(24); // L: 41
		this.dimensions = VorbisSample.readBits(16); // L: 42
		this.entries = VorbisSample.readBits(24); // L: 43
		this.lengthMap = new int[this.entries]; // L: 44
		boolean var1 = VorbisSample.readBit() != 0; // L: 45
		int var2;
		int var3;
		int var5;
		if (var1) { // L: 46
			var2 = 0; // L: 47

			for (var3 = VorbisSample.readBits(5) + 1; var2 < this.entries; ++var3) { // L: 48 49 52
				int var4 = VorbisSample.readBits(class111.iLog(this.entries - var2)); // L: 50

				for (var5 = 0; var5 < var4; ++var5) { // L: 51
					this.lengthMap[var2++] = var3;
				}
			}
		} else {
			boolean var14 = VorbisSample.readBit() != 0; // L: 56

			for (var3 = 0; var3 < this.entries; ++var3) { // L: 57
				if (var14 && VorbisSample.readBit() == 0) { // L: 58
					this.lengthMap[var3] = 0;
				} else {
					this.lengthMap[var3] = VorbisSample.readBits(5) + 1; // L: 59
				}
			}
		}

		this.method994(); // L: 62
		var2 = VorbisSample.readBits(4); // L: 63
		if (var2 > 0) { // L: 64
			float var15 = VorbisSample.float32Unpack(VorbisSample.readBits(32)); // L: 65
			float var16 = VorbisSample.float32Unpack(VorbisSample.readBits(32)); // L: 66
			var5 = VorbisSample.readBits(4) + 1; // L: 67
			boolean var6 = VorbisSample.readBit() != 0; // L: 68
			int var7;
			if (var2 == 1) { // L: 70
				var7 = mapType1QuantValues(this.entries, this.dimensions);
			} else {
				var7 = this.entries * this.dimensions; // L: 71
			}

			this.field371 = new int[var7]; // L: 72

			int var8;
			for (var8 = 0; var8 < var7; ++var8) { // L: 73
				this.field371[var8] = VorbisSample.readBits(var5);
			}

			this.field369 = new float[this.entries][this.dimensions]; // L: 74
			float var9;
			int var10;
			int var11;
			if (var2 == 1) { // L: 75
				for (var8 = 0; var8 < this.entries; ++var8) { // L: 76
					var9 = 0.0F; // L: 77
					var10 = 1; // L: 78

					for (var11 = 0; var11 < this.dimensions; ++var11) { // L: 79
						int var12 = var8 / var10 % var7; // L: 80
						float var13 = (float)this.field371[var12] * var16 + var15 + var9; // L: 81
						this.field369[var8][var11] = var13; // L: 82
						if (var6) { // L: 83
							var9 = var13;
						}

						var10 *= var7; // L: 84
					}
				}
			} else {
				for (var8 = 0; var8 < this.entries; ++var8) { // L: 89
					var9 = 0.0F; // L: 90
					var10 = var8 * this.dimensions; // L: 91

					for (var11 = 0; var11 < this.dimensions; ++var11) { // L: 92
						float var17 = (float)this.field371[var10] * var16 + var15 + var9; // L: 93
						this.field369[var8][var11] = var17; // L: 94
						if (var6) { // L: 95
							var9 = var17;
						}

						++var10; // L: 96
					}
				}
			}
		}

	} // L: 101

	@ObfuscatedName("l")
	void method994() {
		int[] var1 = new int[this.entries]; // L: 104
		int[] var2 = new int[33]; // L: 106

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.entries; ++var3) { // L: 107
			var4 = this.lengthMap[var3]; // L: 108
			if (var4 != 0) { // L: 109
				var5 = 1 << 32 - var4; // L: 110
				var6 = var2[var4]; // L: 111
				var1[var3] = var6; // L: 112
				int var12;
				if ((var6 & var5) != 0) { // L: 114
					var7 = var2[var4 - 1]; // L: 115
				} else {
					var7 = var6 | var5; // L: 118

					for (var8 = var4 - 1; var8 >= 1; --var8) { // L: 119
						var12 = var2[var8]; // L: 120
						if (var12 != var6) { // L: 121
							break;
						}

						var10 = 1 << 32 - var8; // L: 122
						if ((var12 & var10) != 0) { // L: 123
							var2[var8] = var2[var8 - 1]; // L: 124
							break; // L: 125
						}

						var2[var8] = var12 | var10; // L: 128
					}
				}

				var2[var4] = var7; // L: 134

				for (var8 = var4 + 1; var8 <= 32; ++var8) { // L: 135
					var12 = var2[var8]; // L: 136
					if (var12 == var6) { // L: 137
						var2[var8] = var7;
					}
				}
			}
		}

		this.keys = new int[8]; // L: 141
		int var11 = 0; // L: 142

		for (var3 = 0; var3 < this.entries; ++var3) { // L: 143
			var4 = this.lengthMap[var3]; // L: 144
			if (var4 != 0) { // L: 145
				var5 = var1[var3]; // L: 146
				var6 = 0; // L: 147

				for (var7 = 0; var7 < var4; ++var7) { // L: 148
					var8 = Integer.MIN_VALUE >>> var7; // L: 149
					if ((var5 & var8) != 0) { // L: 150
						if (this.keys[var6] == 0) { // L: 151
							this.keys[var6] = var11;
						}

						var6 = this.keys[var6]; // L: 152
					} else {
						++var6; // L: 155
					}

					if (var6 >= this.keys.length) { // L: 157
						int[] var9 = new int[this.keys.length * 2]; // L: 158

						for (var10 = 0; var10 < this.keys.length; ++var10) { // L: 159
							var9[var10] = this.keys[var10];
						}

						this.keys = var9; // L: 160
					}

					var8 >>>= 1; // L: 162
				}

				this.keys[var6] = ~var3; // L: 164
				if (var6 >= var11) { // L: 165
					var11 = var6 + 1;
				}
			}
		}

	} // L: 167

	@ObfuscatedName("s")
	int method988() {
		int var1;
		for (var1 = 0; this.keys[var1] >= 0; var1 = VorbisSample.readBit() != 0 ? this.keys[var1] : var1 + 1) { // L: 170 171
		}

		return ~this.keys[var1]; // L: 172
	}

	@ObfuscatedName("e")
	float[] method990() {
		return this.field369[this.method988()]; // L: 176
	}

	@ObfuscatedName("c")
	@Export("mapType1QuantValues")
	static int mapType1QuantValues(int var0, int var1) {
		int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; // L: 16

		while (true) {
			int var4 = var2; // L: 19
			int var5 = var1; // L: 20

			int var6;
			for (var6 = 1; var5 > 1; var5 >>= 1) { // L: 22 23 26
				if ((var5 & 1) != 0) { // L: 24
					var6 *= var4;
				}

				var4 *= var4; // L: 25
			}

			int var3;
			if (var5 == 1) { // L: 28
				var3 = var6 * var4; // L: 29
			} else {
				var3 = var6; // L: 32
			}

			if (var3 <= var0) { // L: 34
				return var2; // L: 37
			}

			--var2; // L: 35
		}
	}
}
