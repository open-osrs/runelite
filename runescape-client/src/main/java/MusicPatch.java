import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("y")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -690673201
	)
	int field3288;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lak;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("l")
	short[] field3287;
	@ObfuscatedName("k")
	byte[] field3290;
	@ObfuscatedName("a")
	byte[] field3289;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Ljp;"
	)
	MusicPatchNode2[] field3291;
	@ObfuscatedName("p")
	byte[] field3285;
	@ObfuscatedName("s")
	int[] field3292;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128]; // L: 21
		this.field3287 = new short[128]; // L: 22
		this.field3290 = new byte[128]; // L: 23
		this.field3289 = new byte[128]; // L: 24
		this.field3291 = new MusicPatchNode2[128]; // L: 25
		this.field3285 = new byte[128]; // L: 26
		this.field3292 = new int[128]; // L: 27
		Buffer var2 = new Buffer(var1); // L: 28

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) { // L: 29 30
		}

		byte[] var4 = new byte[var3]; // L: 31

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 32
			var4[var5] = var2.readByte();
		}

		++var2.offset; // L: 33
		++var3; // L: 34
		var5 = var2.offset; // L: 35
		var2.offset += var3; // L: 36

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) { // L: 37 38
		}

		byte[] var7 = new byte[var6]; // L: 39

		int var8;
		for (var8 = 0; var8 < var6; ++var8) { // L: 40
			var7[var8] = var2.readByte();
		}

		++var2.offset; // L: 41
		++var6; // L: 42
		var8 = var2.offset; // L: 43
		var2.offset += var6; // L: 44

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) { // L: 45 46
		}

		byte[] var10 = new byte[var9]; // L: 47

		for (int var11 = 0; var11 < var9; ++var11) { // L: 48
			var10[var11] = var2.readByte();
		}

		++var2.offset; // L: 49
		++var9; // L: 50
		byte[] var36 = new byte[var9]; // L: 51
		int var12;
		int var14;
		if (var9 > 1) { // L: 53
			var36[1] = 1; // L: 54
			int var13 = 1; // L: 55
			var12 = 2; // L: 56

			for (var14 = 2; var14 < var9; ++var14) { // L: 57
				int var41 = var2.readUnsignedByte(); // L: 58
				if (var41 == 0) { // L: 59
					var13 = var12++;
				} else {
					if (var41 <= var13) { // L: 61
						--var41;
					}

					var13 = var41; // L: 62
				}

				var36[var14] = (byte)var13; // L: 64
			}
		} else {
			var12 = var9; // L: 67
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12]; // L: 68

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) { // L: 69
			var15 = var37[var14] = new MusicPatchNode2(); // L: 70
			int var40 = var2.readUnsignedByte(); // L: 71
			if (var40 > 0) { // L: 72
				var15.field3232 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte(); // L: 73
			if (var40 > 0) { // L: 74
				var15.field3223 = new byte[var40 * 2 + 2]; // L: 75
				var15.field3223[1] = 64; // L: 76
			}
		}

		var14 = var2.readUnsignedByte(); // L: 79
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null; // L: 80
		var14 = var2.readUnsignedByte(); // L: 81
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null; // L: 82

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) { // L: 83 84
		}

		byte[] var18 = new byte[var17]; // L: 85

		int var19;
		for (var19 = 0; var19 < var17; ++var19) { // L: 86
			var18[var19] = var2.readByte();
		}

		++var2.offset; // L: 87
		++var17; // L: 88
		var19 = 0; // L: 89

		int var20;
		for (var20 = 0; var20 < 128; ++var20) { // L: 90
			var19 += var2.readUnsignedByte(); // L: 91
			this.field3287[var20] = (short)var19; // L: 92
		}

		var19 = 0; // L: 94

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) { // L: 95
			var19 += var2.readUnsignedByte(); // L: 96
			var48 = this.field3287; // L: 97
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0; // L: 99
		int var21 = 0; // L: 100
		int var22 = 0; // L: 101

		int var23;
		for (var23 = 0; var23 < 128; ++var23) { // L: 102
			if (var20 == 0) { // L: 103
				if (var21 < var18.length) { // L: 104
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 105
				}

				var22 = var2.readVarInt(); // L: 106
			}

			var48 = this.field3287; // L: 108
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3292[var23] = var22; // L: 109
			--var20; // L: 110
		}

		var20 = 0; // L: 112
		var21 = 0; // L: 113
		var23 = 0; // L: 114

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 115
			if (this.field3292[var24] != 0) { // L: 116
				if (var20 == 0) { // L: 117
					if (var21 < var4.length) { // L: 118
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 119
					}

					var23 = var2.array[var5++] - 1; // L: 120
				}

				this.field3285[var24] = (byte)var23; // L: 122
				--var20; // L: 123
			}
		}

		var20 = 0; // L: 125
		var21 = 0; // L: 126
		var24 = 0; // L: 127

		for (int var25 = 0; var25 < 128; ++var25) { // L: 128
			if (this.field3292[var25] != 0) { // L: 129
				if (var20 == 0) { // L: 130
					if (var21 < var7.length) { // L: 131
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 132
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 133
				}

				this.field3289[var25] = (byte)var24; // L: 135
				--var20; // L: 136
			}
		}

		var20 = 0; // L: 138
		var21 = 0; // L: 139
		MusicPatchNode2 var38 = null; // L: 140

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 141
			if (this.field3292[var26] != 0) { // L: 142
				if (var20 == 0) { // L: 143
					var38 = var37[var36[var21]]; // L: 144
					if (var21 < var10.length) { // L: 145
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 146
					}
				}

				this.field3291[var26] = var38; // L: 148
				--var20; // L: 149
			}
		}

		var20 = 0; // L: 151
		var21 = 0; // L: 152
		var26 = 0; // L: 153

		int var27;
		for (var27 = 0; var27 < 128; ++var27) { // L: 154
			if (var20 == 0) { // L: 155
				if (var21 < var18.length) { // L: 156
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 157
				}

				if (this.field3292[var27] > 0) { // L: 158
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3290[var27] = (byte)var26; // L: 160
			--var20; // L: 161
		}

		this.field3288 = var2.readUnsignedByte() + 1; // L: 163

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) { // L: 164
			var39 = var37[var27]; // L: 165
			if (var39.field3232 != null) { // L: 166
				for (var29 = 1; var29 < var39.field3232.length; var29 += 2) { // L: 167
					var39.field3232[var29] = var2.readByte();
				}
			}

			if (var39.field3223 != null) { // L: 169
				for (var29 = 3; var29 < var39.field3223.length - 2; var29 += 2) { // L: 170
					var39.field3223[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) { // L: 173
			for (var27 = 1; var27 < var42.length; var27 += 2) { // L: 174
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 176
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 177
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 179
			var39 = var37[var27]; // L: 180
			if (var39.field3223 != null) { // L: 181
				var19 = 0; // L: 182

				for (var29 = 2; var29 < var39.field3223.length; var29 += 2) { // L: 183
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 184
					var39.field3223[var29] = (byte)var19; // L: 185
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 189
			var39 = var37[var27]; // L: 190
			if (var39.field3232 != null) { // L: 191
				var19 = 0; // L: 192

				for (var29 = 2; var29 < var39.field3232.length; var29 += 2) { // L: 193
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 194
					var39.field3232[var29] = (byte)var19; // L: 195
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) { // L: 199
			var19 = var2.readUnsignedByte(); // L: 200
			var42[0] = (byte)var19; // L: 201

			for (var27 = 2; var27 < var42.length; var27 += 2) { // L: 202
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 203
				var42[var27] = (byte)var19; // L: 204
			}

			var47 = var42[0]; // L: 206
			byte var28 = var42[1]; // L: 207

			for (var29 = 0; var29 < var47; ++var29) { // L: 208
				this.field3290[var29] = (byte)(var28 * this.field3290[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) { // L: 209 210 221
				var30 = var42[var29]; // L: 211
				byte var31 = var42[var29 + 1]; // L: 212
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2; // L: 213

				for (var33 = var47; var33 < var30; ++var33) { // L: 214
					var34 = class134.method2841(var32, var30 - var47); // L: 215
					this.field3290[var33] = (byte)(var34 * this.field3290[var33] + 32 >> 6); // L: 216
					var32 += var31 - var28; // L: 217
				}

				var47 = var30; // L: 219
				var28 = var31; // L: 220
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 223
				this.field3290[var45] = (byte)(var28 * this.field3290[var45] + 32 >> 6);
			}

			var15 = null; // L: 224
		}

		if (var16 != null) { // L: 226
			var19 = var2.readUnsignedByte(); // L: 227
			var16[0] = (byte)var19; // L: 228

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 229
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 230
				var16[var27] = (byte)var19; // L: 231
			}

			var47 = var16[0]; // L: 233
			int var44 = var16[1] << 1; // L: 234

			for (var29 = 0; var29 < var47; ++var29) { // L: 235
				var45 = var44 + (this.field3289[var29] & 255); // L: 236
				if (var45 < 0) { // L: 237
					var45 = 0;
				}

				if (var45 > 128) { // L: 238
					var45 = 128;
				}

				this.field3289[var29] = (byte)var45; // L: 239
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 241 242 256
				var30 = var16[var29]; // L: 243
				var46 = var16[var29 + 1] << 1; // L: 244
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2; // L: 245

				for (var33 = var47; var33 < var30; ++var33) { // L: 246
					var34 = class134.method2841(var32, var30 - var47); // L: 247
					int var35 = var34 + (this.field3289[var33] & 255); // L: 248
					if (var35 < 0) { // L: 249
						var35 = 0;
					}

					if (var35 > 128) { // L: 250
						var35 = 128;
					}

					this.field3289[var33] = (byte)var35; // L: 251
					var32 += var46 - var44; // L: 252
				}

				var47 = var30; // L: 254
				var44 = var46; // L: 255
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 258
				var46 = var44 + (this.field3289[var45] & 255); // L: 259
				if (var46 < 0) { // L: 260
					var46 = 0;
				}

				if (var46 > 128) { // L: 261
					var46 = 128;
				}

				this.field3289[var45] = (byte)var46; // L: 262
			}

			Object var43 = null; // L: 264
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 266
			var37[var27].field3226 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 267
			var39 = var37[var27]; // L: 268
			if (var39.field3232 != null) { // L: 269
				var39.field3225 = var2.readUnsignedByte();
			}

			if (var39.field3223 != null) { // L: 270
				var39.field3224 = var2.readUnsignedByte();
			}

			if (var39.field3226 > 0) { // L: 271
				var39.field3227 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 273
			var37[var27].field3229 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 274
			var39 = var37[var27]; // L: 275
			if (var39.field3229 > 0) { // L: 276
				var39.field3228 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 278
			var39 = var37[var27]; // L: 279
			if (var39.field3228 > 0) { // L: 280
				var39.field3222 = var2.readUnsignedByte();
			}
		}

	} // L: 282

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lan;[B[II)Z",
		garbageValue = "-489821860"
	)
	boolean method5272(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true; // L: 285
		int var5 = 0; // L: 286
		RawSound var6 = null; // L: 287

		for (int var7 = 0; var7 < 128; ++var7) { // L: 288
			if (var2 == null || var2[var7] != 0) { // L: 289
				int var8 = this.field3292[var7]; // L: 290
				if (var8 != 0) { // L: 291
					if (var8 != var5) { // L: 292
						var5 = var8--; // L: 293 294
						if ((var8 & 1) == 0) { // L: 295
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3); // L: 296
						}

						if (var6 == null) { // L: 297
							var4 = false;
						}
					}

					if (var6 != null) { // L: 299
						this.rawSounds[var7] = var6; // L: 300
						this.field3292[var7] = 0; // L: 301
					}
				}
			}
		}

		return var4; // L: 305
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("clear")
	void clear() {
		this.field3292 = null; // L: 309
	} // L: 310

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-879482214"
	)
	static int method5277(int var0, Script var1, boolean var2) {
		if (var0 == 7400) { // L: 4670
			--class12.Interpreter_intStackSize; // L: 4671
			--class9.Interpreter_stringStackSize; // L: 4672
			return 1; // L: 4673
		} else if (var0 == 7401) { // L: 4675
			--class12.Interpreter_intStackSize; // L: 4676
			--class9.Interpreter_stringStackSize; // L: 4677
			return 1; // L: 4678
		} else if (var0 == 7402) { // L: 4680
			class12.Interpreter_intStackSize -= 2; // L: 4681
			--class9.Interpreter_stringStackSize; // L: 4682
			return 1; // L: 4683
		} else if (var0 == 7403) { // L: 4685
			class12.Interpreter_intStackSize -= 2; // L: 4686
			--class9.Interpreter_stringStackSize; // L: 4687
			return 1; // L: 4688
		} else if (var0 == 7404) { // L: 4690
			--class12.Interpreter_intStackSize; // L: 4691
			--class9.Interpreter_stringStackSize; // L: 4692
			return 1; // L: 4693
		} else if (var0 == 7405) { // L: 4695
			class12.Interpreter_intStackSize -= 2; // L: 4696
			return 1; // L: 4697
		} else if (var0 == 7406) { // L: 4699
			--class12.Interpreter_intStackSize; // L: 4700
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4701
			return 1; // L: 4702
		} else if (var0 == 7407) { // L: 4704
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4705
			return 1; // L: 4706
		} else if (var0 == 7408) { // L: 4708
			class12.Interpreter_intStackSize -= 2; // L: 4709
			--class9.Interpreter_stringStackSize; // L: 4710
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4711
			return 1; // L: 4712
		} else if (var0 == 7409) { // L: 4714
			--class12.Interpreter_intStackSize; // L: 4715
			return 1; // L: 4716
		} else {
			return 2; // L: 4718
		}
	}
}
