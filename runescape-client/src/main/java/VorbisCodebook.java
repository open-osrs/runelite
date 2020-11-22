import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dl")
@Implements("VorbisCodebook")
public class VorbisCodebook {
	@ObfuscatedName("f")
	@Export("dimensions")
	int dimensions;
	@ObfuscatedName("b")
	@Export("entries")
	int entries;
	@ObfuscatedName("l")
	@Export("lengthMap")
	int[] lengthMap;
	@ObfuscatedName("m")
	int[] field1374;
	@ObfuscatedName("z")
	float[][] field1375;
	@ObfuscatedName("q")
	@Export("keys")
	int[] keys;

	VorbisCodebook() {
		VorbisSample.readBits(24); // L: 22
		this.dimensions = VorbisSample.readBits(16); // L: 23
		this.entries = VorbisSample.readBits(24); // L: 24
		this.lengthMap = new int[this.entries]; // L: 25
		boolean var1 = VorbisSample.readBit() != 0; // L: 26
		int var2;
		int var3;
		int var5;
		if (var1) { // L: 27
			var2 = 0; // L: 28

			for (var3 = VorbisSample.readBits(5) + 1; var2 < this.entries; ++var3) { // L: 29 30 33
				int var4 = VorbisSample.readBits(JagexCache.iLog(this.entries - var2)); // L: 31

				for (var5 = 0; var5 < var4; ++var5) { // L: 32
					this.lengthMap[var2++] = var3;
				}
			}
		} else {
			boolean var14 = VorbisSample.readBit() != 0; // L: 37

			for (var3 = 0; var3 < this.entries; ++var3) { // L: 38
				if (var14 && VorbisSample.readBit() == 0) { // L: 39
					this.lengthMap[var3] = 0;
				} else {
					this.lengthMap[var3] = VorbisSample.readBits(5) + 1; // L: 40
				}
			}
		}

		this.method2475(); // L: 43
		var2 = VorbisSample.readBits(4); // L: 44
		if (var2 > 0) { // L: 45
			float var15 = VorbisSample.float32Unpack(VorbisSample.readBits(32)); // L: 46
			float var16 = VorbisSample.float32Unpack(VorbisSample.readBits(32)); // L: 47
			var5 = VorbisSample.readBits(4) + 1; // L: 48
			boolean var6 = VorbisSample.readBit() != 0; // L: 49
			int var7;
			if (var2 == 1) { // L: 51
				var7 = mapType1QuantValues(this.entries, this.dimensions);
			} else {
				var7 = this.entries * this.dimensions; // L: 52
			}

			this.field1374 = new int[var7]; // L: 53

			int var8;
			for (var8 = 0; var8 < var7; ++var8) { // L: 54
				this.field1374[var8] = VorbisSample.readBits(var5);
			}

			this.field1375 = new float[this.entries][this.dimensions]; // L: 55
			float var9;
			int var10;
			int var11;
			if (var2 == 1) { // L: 56
				for (var8 = 0; var8 < this.entries; ++var8) { // L: 57
					var9 = 0.0F; // L: 58
					var10 = 1; // L: 59

					for (var11 = 0; var11 < this.dimensions; ++var11) { // L: 60
						int var12 = var8 / var10 % var7; // L: 61
						float var13 = (float)this.field1374[var12] * var16 + var15 + var9; // L: 62
						this.field1375[var8][var11] = var13; // L: 63
						if (var6) { // L: 64
							var9 = var13;
						}

						var10 *= var7; // L: 65
					}
				}
			} else {
				for (var8 = 0; var8 < this.entries; ++var8) { // L: 70
					var9 = 0.0F; // L: 71
					var10 = var8 * this.dimensions; // L: 72

					for (var11 = 0; var11 < this.dimensions; ++var11) { // L: 73
						float var17 = (float)this.field1374[var10] * var16 + var15 + var9; // L: 74
						this.field1375[var8][var11] = var17; // L: 75
						if (var6) { // L: 76
							var9 = var17;
						}

						++var10; // L: 77
					}
				}
			}
		}

	} // L: 82

	@ObfuscatedName("b")
	void method2475() {
		int[] var1 = new int[this.entries]; // L: 85
		int[] var2 = new int[33]; // L: 87

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.entries; ++var3) { // L: 88
			var4 = this.lengthMap[var3]; // L: 89
			if (var4 != 0) { // L: 90
				var5 = 1 << 32 - var4; // L: 91
				var6 = var2[var4]; // L: 92
				var1[var3] = var6; // L: 93
				int var12;
				if ((var6 & var5) != 0) { // L: 95
					var7 = var2[var4 - 1]; // L: 96
				} else {
					var7 = var6 | var5; // L: 99

					for (var8 = var4 - 1; var8 >= 1; --var8) { // L: 100
						var12 = var2[var8]; // L: 101
						if (var12 != var6) { // L: 102
							break;
						}

						var10 = 1 << 32 - var8; // L: 103
						if ((var12 & var10) != 0) { // L: 104
							var2[var8] = var2[var8 - 1]; // L: 105
							break; // L: 106
						}

						var2[var8] = var12 | var10; // L: 109
					}
				}

				var2[var4] = var7; // L: 115

				for (var8 = var4 + 1; var8 <= 32; ++var8) { // L: 116
					var12 = var2[var8]; // L: 117
					if (var12 == var6) { // L: 118
						var2[var8] = var7;
					}
				}
			}
		}

		this.keys = new int[8]; // L: 122
		int var11 = 0; // L: 123

		for (var3 = 0; var3 < this.entries; ++var3) { // L: 124
			var4 = this.lengthMap[var3]; // L: 125
			if (var4 != 0) { // L: 126
				var5 = var1[var3]; // L: 127
				var6 = 0; // L: 128

				for (var7 = 0; var7 < var4; ++var7) { // L: 129
					var8 = Integer.MIN_VALUE >>> var7; // L: 130
					if ((var5 & var8) != 0) { // L: 131
						if (this.keys[var6] == 0) { // L: 132
							this.keys[var6] = var11;
						}

						var6 = this.keys[var6]; // L: 133
					} else {
						++var6; // L: 136
					}

					if (var6 >= this.keys.length) { // L: 138
						int[] var9 = new int[this.keys.length * 2]; // L: 139

						for (var10 = 0; var10 < this.keys.length; ++var10) { // L: 140
							var9[var10] = this.keys[var10];
						}

						this.keys = var9; // L: 141
					}

					var8 >>>= 1; // L: 143
				}

				this.keys[var6] = ~var3; // L: 145
				if (var6 >= var11) { // L: 146
					var11 = var6 + 1;
				}
			}
		}

	} // L: 148

	@ObfuscatedName("l")
	int method2472() {
		int var1;
		for (var1 = 0; this.keys[var1] >= 0; var1 = VorbisSample.readBit() != 0 ? this.keys[var1] : var1 + 1) { // L: 151 152
		}

		return ~this.keys[var1]; // L: 153
	}

	@ObfuscatedName("m")
	float[] method2473() {
		return this.field1375[this.method2472()]; // L: 157
	}

	@ObfuscatedName("f")
	@Export("mapType1QuantValues")
	static int mapType1QuantValues(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class194.method3753(var2, var1) > var0; --var2) { // L: 16 17
		}

		return var2; // L: 18
	}
}
