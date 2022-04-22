import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1242230189
	)
	int field3228;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lat;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("i")
	short[] field3227;
	@ObfuscatedName("f")
	byte[] field3223;
	@ObfuscatedName("b")
	byte[] field3222;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Ljy;"
	)
	MusicPatchNode2[] field3224;
	@ObfuscatedName("s")
	byte[] field3220;
	@ObfuscatedName("l")
	int[] field3226;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128]; // L: 21
		this.field3227 = new short[128]; // L: 22
		this.field3223 = new byte[128]; // L: 23
		this.field3222 = new byte[128]; // L: 24
		this.field3224 = new MusicPatchNode2[128]; // L: 25
		this.field3220 = new byte[128]; // L: 26
		this.field3226 = new int[128]; // L: 27
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
				var15.field3160 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte(); // L: 73
			if (var40 > 0) { // L: 74
				var15.field3165 = new byte[var40 * 2 + 2]; // L: 75
				var15.field3165[1] = 64; // L: 76
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
			this.field3227[var20] = (short)var19; // L: 92
		}

		var19 = 0; // L: 94

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) { // L: 95
			var19 += var2.readUnsignedByte(); // L: 96
			var48 = this.field3227; // L: 97
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

			var48 = this.field3227; // L: 108
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3226[var23] = var22; // L: 109
			--var20; // L: 110
		}

		var20 = 0; // L: 112
		var21 = 0; // L: 113
		var23 = 0; // L: 114

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 115
			if (this.field3226[var24] != 0) { // L: 116
				if (var20 == 0) { // L: 117
					if (var21 < var4.length) { // L: 118
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 119
					}

					var23 = var2.array[var5++] - 1; // L: 120
				}

				this.field3220[var24] = (byte)var23; // L: 122
				--var20; // L: 123
			}
		}

		var20 = 0; // L: 125
		var21 = 0; // L: 126
		var24 = 0; // L: 127

		for (int var25 = 0; var25 < 128; ++var25) { // L: 128
			if (this.field3226[var25] != 0) { // L: 129
				if (var20 == 0) { // L: 130
					if (var21 < var7.length) { // L: 131
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 132
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 133
				}

				this.field3222[var25] = (byte)var24; // L: 135
				--var20; // L: 136
			}
		}

		var20 = 0; // L: 138
		var21 = 0; // L: 139
		MusicPatchNode2 var38 = null; // L: 140

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 141
			if (this.field3226[var26] != 0) { // L: 142
				if (var20 == 0) { // L: 143
					var38 = var37[var36[var21]]; // L: 144
					if (var21 < var10.length) { // L: 145
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 146
					}
				}

				this.field3224[var26] = var38; // L: 148
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

				if (this.field3226[var27] > 0) { // L: 158
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3223[var27] = (byte)var26; // L: 160
			--var20; // L: 161
		}

		this.field3228 = var2.readUnsignedByte() + 1; // L: 163

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) { // L: 164
			var39 = var37[var27]; // L: 165
			if (var39.field3160 != null) { // L: 166
				for (var29 = 1; var29 < var39.field3160.length; var29 += 2) { // L: 167
					var39.field3160[var29] = var2.readByte();
				}
			}

			if (var39.field3165 != null) { // L: 169
				for (var29 = 3; var29 < var39.field3165.length - 2; var29 += 2) { // L: 170
					var39.field3165[var29] = var2.readByte();
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
			if (var39.field3165 != null) { // L: 181
				var19 = 0; // L: 182

				for (var29 = 2; var29 < var39.field3165.length; var29 += 2) { // L: 183
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 184
					var39.field3165[var29] = (byte)var19; // L: 185
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 189
			var39 = var37[var27]; // L: 190
			if (var39.field3160 != null) { // L: 191
				var19 = 0; // L: 192

				for (var29 = 2; var29 < var39.field3160.length; var29 += 2) { // L: 193
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 194
					var39.field3160[var29] = (byte)var19; // L: 195
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
				this.field3223[var29] = (byte)(var28 * this.field3223[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) { // L: 209 210 221
				var30 = var42[var29]; // L: 211
				byte var31 = var42[var29 + 1]; // L: 212
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2; // L: 213

				for (var33 = var47; var33 < var30; ++var33) { // L: 214
					var34 = class82.method2102(var32, var30 - var47); // L: 215
					this.field3223[var33] = (byte)(var34 * this.field3223[var33] + 32 >> 6); // L: 216
					var32 += var31 - var28; // L: 217
				}

				var47 = var30; // L: 219
				var28 = var31; // L: 220
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 223
				this.field3223[var45] = (byte)(var28 * this.field3223[var45] + 32 >> 6);
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
				var45 = var44 + (this.field3222[var29] & 255); // L: 236
				if (var45 < 0) { // L: 237
					var45 = 0;
				}

				if (var45 > 128) { // L: 238
					var45 = 128;
				}

				this.field3222[var29] = (byte)var45; // L: 239
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 241 242 256
				var30 = var16[var29]; // L: 243
				var46 = var16[var29 + 1] << 1; // L: 244
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2; // L: 245

				for (var33 = var47; var33 < var30; ++var33) { // L: 246
					var34 = class82.method2102(var32, var30 - var47); // L: 247
					int var35 = var34 + (this.field3222[var33] & 255); // L: 248
					if (var35 < 0) { // L: 249
						var35 = 0;
					}

					if (var35 > 128) { // L: 250
						var35 = 128;
					}

					this.field3222[var33] = (byte)var35; // L: 251
					var32 += var46 - var44; // L: 252
				}

				var47 = var30; // L: 254
				var44 = var46; // L: 255
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 258
				var46 = var44 + (this.field3222[var45] & 255); // L: 259
				if (var46 < 0) { // L: 260
					var46 = 0;
				}

				if (var46 > 128) { // L: 261
					var46 = 128;
				}

				this.field3222[var45] = (byte)var46; // L: 262
			}

			Object var43 = null; // L: 264
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 266
			var37[var27].field3162 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 267
			var39 = var37[var27]; // L: 268
			if (var39.field3160 != null) { // L: 269
				var39.field3159 = var2.readUnsignedByte();
			}

			if (var39.field3165 != null) { // L: 270
				var39.field3163 = var2.readUnsignedByte();
			}

			if (var39.field3162 > 0) { // L: 271
				var39.field3164 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 273
			var37[var27].field3166 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 274
			var39 = var37[var27]; // L: 275
			if (var39.field3166 > 0) { // L: 276
				var39.field3161 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 278
			var39 = var37[var27]; // L: 279
			if (var39.field3161 > 0) { // L: 280
				var39.field3167 = var2.readUnsignedByte();
			}
		}

	} // L: 282

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lac;[B[IB)Z",
		garbageValue = "-3"
	)
	boolean method5427(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true; // L: 285
		int var5 = 0; // L: 286
		RawSound var6 = null; // L: 287

		for (int var7 = 0; var7 < 128; ++var7) { // L: 288
			if (var2 == null || var2[var7] != 0) { // L: 289
				int var8 = this.field3226[var7]; // L: 290
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
						this.field3226[var7] = 0; // L: 301
					}
				}
			}
		}

		return var4; // L: 305
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1421286153"
	)
	@Export("clear")
	void clear() {
		this.field3226 = null; // L: 309
	} // L: 310

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "2078599773"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4411
			byte var2 = 4; // L: 4412
			int var3 = var2 + 6; // L: 4413
			int var4 = var2 + 6; // L: 4414
			int var5 = class13.fontPlain12.lineWidth(var0, 250); // L: 4415
			int var6 = class13.fontPlain12.lineCount(var0, 250) * 13; // L: 4416
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0); // L: 4417
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215); // L: 4418
			class13.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4419
			HealthBar.method2330(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2); // L: 4420
			if (var1) { // L: 4421
				FontName.rasterProvider.drawFull(0, 0); // L: 4422
			} else {
				ScriptEvent.method2092(var3, var4, var5, var6); // L: 4425
			}

		}
	} // L: 4427

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1118853304"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4811
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4812
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4813
				int var3 = var2.x >> 7; // L: 4814
				int var4 = var2.y >> 7; // L: 4815
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4816
					if (var2.field1150 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4817
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4818
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4819
					}

					long var5 = GameObject.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4821
					var2.playerCycle = Client.cycle; // L: 4822
					ArchiveLoader.scene.drawEntity(class18.Client_plane, var2.x, var2.y, WorldMapLabel.getTileHeight(var2.field1150 * 64 - 64 + var2.x, var2.field1150 * 64 - 64 + var2.y, class18.Client_plane), var2.field1150 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4823
				}
			}
		}

	} // L: 4827
}
