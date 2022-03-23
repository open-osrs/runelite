import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1959822029
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1499561111
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1918110489
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 276484209
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1138782971"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5829(var1) || this.archive.method5828(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkh;",
		garbageValue = "77"
	)
	public static StudioGame[] method2076() {
		return new StudioGame[]{StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game4, StudioGame.runescape, StudioGame.game3, StudioGame.game5}; // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILge;Lgf;Z[I[II)I",
		garbageValue = "34153163"
	)
	public static int method2075(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) { // L: 19
			for (var9 = 0; var9 < 128; ++var9) { // L: 20
				class194.directions[var8][var9] = 0; // L: 21
				class194.distances[var8][var9] = 99999999; // L: 22
			}
		}

		int var10;
		int var11;
		byte var13;
		int var14;
		int var15;
		int var17;
		int var19;
		int var20;
		int var21;
		boolean var28;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) { // L: 26
			var10 = var0; // L: 29
			var11 = var1; // L: 30
			byte var12 = 64; // L: 31
			var13 = 64; // L: 32
			var14 = var0 - var12; // L: 33
			var15 = var1 - var13; // L: 34
			class194.directions[var12][var13] = 99; // L: 35
			class194.distances[var12][var13] = 0; // L: 36
			byte var16 = 0; // L: 37
			var17 = 0; // L: 38
			class194.bufferX[var16] = var0; // L: 39
			var33 = var16 + 1;
			class194.bufferY[var16] = var1; // L: 40
			int[][] var18 = var4.flags; // L: 41

			boolean var29;
			while (true) {
				if (var17 == var33) { // L: 44
					VarpDefinition.field1819 = var10; // L: 116
					class194.field2202 = var11; // L: 117
					var29 = false; // L: 118
					break;
				}

				var10 = class194.bufferX[var17]; // L: 45
				var11 = class194.bufferY[var17]; // L: 46
				var17 = var17 + 1 & 4095; // L: 47
				var30 = var10 - var14; // L: 48
				var31 = var11 - var15; // L: 49
				var19 = var10 - var4.xInset; // L: 50
				var20 = var11 - var4.yInset; // L: 51
				if (var3.hasArrived(1, var10, var11, var4)) { // L: 52
					VarpDefinition.field1819 = var10; // L: 53
					class194.field2202 = var11; // L: 54
					var29 = true; // L: 55
					break;
				}

				var21 = class194.distances[var30][var31] + 1; // L: 58
				if (var30 > 0 && class194.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) { // L: 59
					class194.bufferX[var33] = var10 - 1; // L: 60
					class194.bufferY[var33] = var11; // L: 61
					var33 = var33 + 1 & 4095; // L: 62
					class194.directions[var30 - 1][var31] = 2; // L: 63
					class194.distances[var30 - 1][var31] = var21; // L: 64
				}

				if (var30 < 127 && class194.directions[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) { // L: 66
					class194.bufferX[var33] = var10 + 1; // L: 67
					class194.bufferY[var33] = var11; // L: 68
					var33 = var33 + 1 & 4095; // L: 69
					class194.directions[var30 + 1][var31] = 8; // L: 70
					class194.distances[var30 + 1][var31] = var21; // L: 71
				}

				if (var31 > 0 && class194.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 73
					class194.bufferX[var33] = var10; // L: 74
					class194.bufferY[var33] = var11 - 1; // L: 75
					var33 = var33 + 1 & 4095; // L: 76
					class194.directions[var30][var31 - 1] = 1; // L: 77
					class194.distances[var30][var31 - 1] = var21; // L: 78
				}

				if (var31 < 127 && class194.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 80
					class194.bufferX[var33] = var10; // L: 81
					class194.bufferY[var33] = var11 + 1; // L: 82
					var33 = var33 + 1 & 4095; // L: 83
					class194.directions[var30][var31 + 1] = 4; // L: 84
					class194.distances[var30][var31 + 1] = var21; // L: 85
				}

				if (var30 > 0 && var31 > 0 && class194.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 87
					class194.bufferX[var33] = var10 - 1; // L: 88
					class194.bufferY[var33] = var11 - 1; // L: 89
					var33 = var33 + 1 & 4095; // L: 90
					class194.directions[var30 - 1][var31 - 1] = 3; // L: 91
					class194.distances[var30 - 1][var31 - 1] = var21; // L: 92
				}

				if (var30 < 127 && var31 > 0 && class194.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 94
					class194.bufferX[var33] = var10 + 1; // L: 95
					class194.bufferY[var33] = var11 - 1; // L: 96
					var33 = var33 + 1 & 4095; // L: 97
					class194.directions[var30 + 1][var31 - 1] = 9; // L: 98
					class194.distances[var30 + 1][var31 - 1] = var21; // L: 99
				}

				if (var30 > 0 && var31 < 127 && class194.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 101
					class194.bufferX[var33] = var10 - 1; // L: 102
					class194.bufferY[var33] = var11 + 1; // L: 103
					var33 = var33 + 1 & 4095; // L: 104
					class194.directions[var30 - 1][var31 + 1] = 6; // L: 105
					class194.distances[var30 - 1][var31 + 1] = var21; // L: 106
				}

				if (var30 < 127 && var31 < 127 && class194.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 108
					class194.bufferX[var33] = var10 + 1; // L: 109
					class194.bufferY[var33] = var11 + 1; // L: 110
					var33 = var33 + 1 & 4095; // L: 111
					class194.directions[var30 + 1][var31 + 1] = 12; // L: 112
					class194.distances[var30 + 1][var31 + 1] = var21; // L: 113
				}
			}

			var28 = var29; // L: 120
		} else if (var2 == 2) { // L: 122
			var28 = class146.method3041(var0, var1, var3, var4);
		} else {
			var28 = class290.method5577(var0, var1, var2, var3, var4); // L: 123
		}

		var9 = var0 - 64; // L: 124
		var10 = var1 - 64; // L: 125
		var11 = VarpDefinition.field1819; // L: 126
		var30 = class194.field2202; // L: 127
		if (!var28) { // L: 128
			var31 = Integer.MAX_VALUE; // L: 130
			var14 = Integer.MAX_VALUE; // L: 131
			byte var32 = 10; // L: 132
			var33 = var3.approxDestinationX; // L: 133
			var17 = var3.approxDestinationY; // L: 134
			int var27 = var3.approxDestinationSizeX; // L: 135
			var19 = var3.approxDestinationSizeY; // L: 136

			for (var20 = var33 - var32; var20 <= var33 + var32; ++var20) { // L: 137
				for (var21 = var17 - var32; var21 <= var17 + var32; ++var21) { // L: 138
					int var22 = var20 - var9; // L: 139
					int var23 = var21 - var10; // L: 140
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class194.distances[var22][var23] < 100) { // L: 141 142
						int var24 = 0; // L: 143
						if (var20 < var33) { // L: 144
							var24 = var33 - var20;
						} else if (var20 > var33 + var27 - 1) { // L: 145
							var24 = var20 - (var33 + var27 - 1);
						}

						int var25 = 0; // L: 146
						if (var21 < var17) { // L: 147
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) { // L: 148
							var25 = var21 - (var19 + var17 - 1);
						}

						int var26 = var24 * var24 + var25 * var25; // L: 149
						if (var26 < var31 || var26 == var31 && class194.distances[var22][var23] < var14) { // L: 150
							var31 = var26; // L: 151
							var14 = class194.distances[var22][var23]; // L: 152
							var11 = var20; // L: 153
							var30 = var21; // L: 154
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) { // L: 160
				return -1;
			}
		}

		if (var0 == var11 && var30 == var1) { // L: 164
			var6[0] = var11; // L: 165
			var7[0] = var30; // L: 166
			return 0; // L: 167
		} else {
			var13 = 0; // L: 169
			class194.bufferX[var13] = var11; // L: 172
			var31 = var13 + 1;
			class194.bufferY[var13] = var30; // L: 173

			for (var14 = var15 = class194.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class194.directions[var11 - var9][var30 - var10]) { // L: 174 175 185
				if (var14 != var15) { // L: 176
					var15 = var14; // L: 177
					class194.bufferX[var31] = var11; // L: 178
					class194.bufferY[var31++] = var30; // L: 179
				}

				if ((var14 & 2) != 0) { // L: 181
					++var11;
				} else if ((var14 & 8) != 0) { // L: 182
					--var11;
				}

				if ((var14 & 1) != 0) { // L: 183
					++var30;
				} else if ((var14 & 4) != 0) { // L: 184
					--var30;
				}
			}

			var33 = 0; // L: 187

			while (var31-- > 0) { // L: 188
				var6[var33] = class194.bufferX[var31]; // L: 189
				var7[var33++] = class194.bufferY[var31]; // L: 190
				if (var33 >= var6.length) { // L: 191
					break;
				}
			}

			return var33; // L: 193
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-59"
	)
	static final boolean method2071(int var0) {
		if (var0 < 0) { // L: 8184
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8185
			if (var1 >= 2000) { // L: 8186
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8187
		}
	}
}
