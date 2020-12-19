import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dm")
@Implements("VorbisFloor")
public class VorbisFloor {
	@ObfuscatedName("h")
	static final int[] field1413;
	@ObfuscatedName("v")
	@Export("VorbisFloor_decibelStatics")
	static final float[] VorbisFloor_decibelStatics;
	@ObfuscatedName("z")
	static int[] field1418;
	@ObfuscatedName("u")
	static int[] field1419;
	@ObfuscatedName("e")
	static boolean[] field1409;
	@ObfuscatedName("x")
	int[] field1411;
	@ObfuscatedName("w")
	@Export("multiplier")
	int multiplier;
	@ObfuscatedName("t")
	@Export("partitionClassList")
	int[] partitionClassList;
	@ObfuscatedName("j")
	@Export("classDimensions")
	int[] classDimensions;
	@ObfuscatedName("n")
	@Export("classSubClasses")
	int[] classSubClasses;
	@ObfuscatedName("p")
	@Export("classMasterbooks")
	int[] classMasterbooks;
	@ObfuscatedName("l")
	@Export("subclassBooks")
	int[][] subclassBooks;

	static {
		field1413 = new int[]{256, 128, 86, 64}; // L: 8
		VorbisFloor_decibelStatics = new float[]{1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F}; // L: 9
	}

	VorbisFloor() {
		int var1 = VorbisSample.readBits(16); // L: 108
		if (var1 != 1) { // L: 109
			throw new RuntimeException(); // L: 110
		} else {
			int var2 = VorbisSample.readBits(5); // L: 112
			int var3 = 0; // L: 113
			this.partitionClassList = new int[var2]; // L: 114

			int var4;
			int var5;
			for (var4 = 0; var4 < var2; ++var4) { // L: 115
				var5 = VorbisSample.readBits(4); // L: 116
				this.partitionClassList[var4] = var5; // L: 117
				if (var5 >= var3) { // L: 118
					var3 = var5 + 1;
				}
			}

			this.classDimensions = new int[var3]; // L: 120
			this.classSubClasses = new int[var3]; // L: 121
			this.classMasterbooks = new int[var3]; // L: 122
			this.subclassBooks = new int[var3][]; // L: 123

			int var7;
			for (var4 = 0; var4 < var3; ++var4) { // L: 124
				this.classDimensions[var4] = VorbisSample.readBits(3) + 1; // L: 125
				var5 = this.classSubClasses[var4] = VorbisSample.readBits(2); // L: 126
				if (var5 != 0) { // L: 127
					this.classMasterbooks[var4] = VorbisSample.readBits(8);
				}

				var5 = 1 << var5; // L: 128
				int[] var9 = new int[var5]; // L: 129
				this.subclassBooks[var4] = var9; // L: 130

				for (var7 = 0; var7 < var5; ++var7) { // L: 131
					var9[var7] = VorbisSample.readBits(8) - 1;
				}
			}

			this.multiplier = VorbisSample.readBits(2) + 1; // L: 133
			var4 = VorbisSample.readBits(4); // L: 134
			var5 = 2; // L: 135

			int var6;
			for (var6 = 0; var6 < var2; ++var6) { // L: 136
				var5 += this.classDimensions[this.partitionClassList[var6]];
			}

			this.field1411 = new int[var5]; // L: 137
			this.field1411[0] = 0; // L: 138
			this.field1411[1] = 1 << var4; // L: 139
			var5 = 2; // L: 140

			for (var6 = 0; var6 < var2; ++var6) { // L: 141
				var7 = this.partitionClassList[var6]; // L: 142

				for (int var8 = 0; var8 < this.classDimensions[var7]; ++var8) { // L: 143
					this.field1411[var5++] = VorbisSample.readBits(var4);
				}
			}

			if (field1418 == null || field1418.length < var5) { // L: 145
				field1418 = new int[var5]; // L: 146
				field1419 = new int[var5]; // L: 147
				field1409 = new boolean[var5]; // L: 148
			}

		}
	} // L: 150

	@ObfuscatedName("x")
	int method2476(int var1, int var2, int var3, int var4, int var5) {
		int var6 = var4 - var2; // L: 50
		int var7 = var3 - var1; // L: 51
		int var8 = var6 < 0 ? -var6 : var6; // L: 52
		int var9 = (var5 - var1) * var8; // L: 53
		int var10 = var9 / var7; // L: 54
		return var6 < 0 ? var2 - var10 : var10 + var2; // L: 55
	}

	@ObfuscatedName("w")
	void method2469(int var1, int var2, int var3, int var4, float[] var5, int var6) {
		int var7 = var4 - var2; // L: 59
		int var8 = var3 - var1; // L: 60
		int var9 = var7 < 0 ? -var7 : var7; // L: 61
		int var10 = var7 / var8; // L: 62
		int var11 = var2; // L: 63
		int var12 = 0; // L: 64
		int var13 = var7 < 0 ? var10 - 1 : var10 + 1; // L: 65
		var9 -= (var10 < 0 ? -var10 : var10) * var8; // L: 66
		var5[var1] *= VorbisFloor_decibelStatics[var2]; // L: 67
		if (var3 > var6) { // L: 68
			var3 = var6;
		}

		for (int var14 = var1 + 1; var14 < var3; ++var14) { // L: 69
			var12 += var9; // L: 70
			if (var12 >= var8) { // L: 71
				var12 -= var8; // L: 72
				var11 += var13; // L: 73
			} else {
				var11 += var10; // L: 76
			}

			var5[var14] *= VorbisFloor_decibelStatics[var11]; // L: 78
		}

	} // L: 80

	@ObfuscatedName("t")
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 83
			int var3 = var1; // L: 84
			int var4 = field1418[var1]; // L: 85
			int var5 = field1419[var1]; // L: 86
			boolean var6 = field1409[var1]; // L: 87

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 88
				int var8 = field1418[var7]; // L: 89
				if (var8 < var4) { // L: 90
					field1418[var3] = var8; // L: 91
					field1419[var3] = field1419[var7]; // L: 92
					field1409[var3] = field1409[var7]; // L: 93
					++var3; // L: 94
					field1418[var7] = field1418[var3]; // L: 95
					field1419[var7] = field1419[var3]; // L: 96
					field1409[var7] = field1409[var3]; // L: 97
				}
			}

			field1418[var3] = var4; // L: 100
			field1419[var3] = var5; // L: 101
			field1409[var3] = var6; // L: 102
			this.VarbisFloor_sort(var1, var3 - 1); // L: 103
			this.VarbisFloor_sort(var3 + 1, var2); // L: 104
		}
	} // L: 105

	@ObfuscatedName("j")
	@Export("readSubmapFloor")
	boolean readSubmapFloor() {
		boolean var1 = VorbisSample.readBit() != 0; // L: 153
		if (!var1) { // L: 154
			return false;
		} else {
			int var2 = this.field1411.length; // L: 155

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 156
				field1418[var3] = this.field1411[var3];
			}

			var3 = field1413[this.multiplier - 1]; // L: 157
			int var4 = IgnoreList.iLog(var3 - 1); // L: 158
			field1419[0] = VorbisSample.readBits(var4); // L: 159
			field1419[1] = VorbisSample.readBits(var4); // L: 160
			int var5 = 2; // L: 161

			for (int var6 = 0; var6 < this.partitionClassList.length; ++var6) { // L: 162
				int var7 = this.partitionClassList[var6]; // L: 163
				int var8 = this.classDimensions[var7]; // L: 164
				int var9 = this.classSubClasses[var7]; // L: 165
				int var10 = (1 << var9) - 1; // L: 166
				int var11 = 0; // L: 167
				if (var9 > 0) { // L: 168
					var11 = VorbisSample.VorbisSample_codebooks[this.classMasterbooks[var7]].method2402();
				}

				for (int var12 = 0; var12 < var8; ++var12) { // L: 169
					int var13 = this.subclassBooks[var7][var11 & var10]; // L: 170
					var11 >>>= var9; // L: 171
					field1419[var5++] = var13 >= 0 ? VorbisSample.VorbisSample_codebooks[var13].method2402() : 0; // L: 172
				}
			}

			return true; // L: 175
		}
	}

	@ObfuscatedName("n")
	void method2465(float[] var1, int var2) {
		int var3 = this.field1411.length; // L: 179
		int var4 = field1413[this.multiplier - 1]; // L: 180
		boolean[] var5 = field1409; // L: 181
		field1409[1] = true; // L: 182
		var5[0] = true; // L: 183

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 184
			var7 = method2466(field1418, var6); // L: 185
			var8 = method2460(field1418, var6); // L: 186
			var9 = this.method2476(field1418[var7], field1419[var7], field1418[var8], field1419[var8], field1418[var6]); // L: 187
			var10 = field1419[var6]; // L: 188
			int var11 = var4 - var9; // L: 189
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 191
			if (var10 != 0) { // L: 192
				boolean[] var14 = field1409; // L: 193
				field1409[var8] = true; // L: 195
				var14[var7] = true; // L: 196
				field1409[var6] = true; // L: 197
				if (var10 >= var13) { // L: 198
					field1419[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 199
				} else {
					field1419[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 202
				}
			} else {
				field1409[var6] = false; // L: 206
				field1419[var6] = var9; // L: 207
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 210
		var6 = 0; // L: 211
		var7 = field1419[0] * this.multiplier; // L: 212

		for (var8 = 1; var8 < var3; ++var8) { // L: 213
			if (field1409[var8]) { // L: 214
				var9 = field1418[var8]; // L: 215
				var10 = field1419[var8] * this.multiplier; // L: 216
				this.method2469(var6, var7, var9, var10, var1, var2); // L: 217
				if (var9 >= var2) { // L: 218
					return;
				}

				var6 = var9; // L: 219
				var7 = var10; // L: 220
			}
		}

		float var16 = VorbisFloor_decibelStatics[var7]; // L: 223

		for (var9 = var6; var9 < var2; ++var9) { // L: 224
			var1[var9] *= var16;
		}

	} // L: 225

	@ObfuscatedName("h")
	static int method2466(int[] var0, int var1) {
		int var2 = var0[var1]; // L: 22
		int var3 = -1; // L: 23
		int var4 = Integer.MIN_VALUE; // L: 24

		for (int var5 = 0; var5 < var1; ++var5) { // L: 25
			int var6 = var0[var5]; // L: 26
			if (var6 < var2 && var6 > var4) { // L: 27
				var3 = var5; // L: 28
				var4 = var6; // L: 29
			}
		}

		return var3; // L: 32
	}

	@ObfuscatedName("v")
	static int method2460(int[] var0, int var1) {
		int var2 = var0[var1]; // L: 36
		int var3 = -1; // L: 37
		int var4 = Integer.MAX_VALUE; // L: 38

		for (int var5 = 0; var5 < var1; ++var5) { // L: 39
			int var6 = var0[var5]; // L: 40
			if (var6 > var2 && var6 < var4) { // L: 41
				var3 = var5; // L: 42
				var4 = var6; // L: 43
			}
		}

		return var3; // L: 46
	}
}
