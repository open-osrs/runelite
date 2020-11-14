import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1306227375
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1308325501
	)
	int field2507;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Ldo;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("l")
	short[] field2504;
	@ObfuscatedName("m")
	byte[] field2502;
	@ObfuscatedName("z")
	byte[] field2505;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	MusicPatchNode2[] field2506;
	@ObfuscatedName("k")
	byte[] field2509;
	@ObfuscatedName("c")
	int[] field2508;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128]; // L: 27
		this.field2504 = new short[128]; // L: 28
		this.field2502 = new byte[128]; // L: 29
		this.field2505 = new byte[128]; // L: 30
		this.field2506 = new MusicPatchNode2[128]; // L: 31
		this.field2509 = new byte[128]; // L: 32
		this.field2508 = new int[128]; // L: 33
		Buffer var2 = new Buffer(var1); // L: 34

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) { // L: 35 36
		}

		byte[] var4 = new byte[var3]; // L: 37

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 38
			var4[var5] = var2.readByte();
		}

		++var2.offset; // L: 39
		++var3; // L: 40
		var5 = var2.offset; // L: 41
		var2.offset += var3; // L: 42

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) { // L: 43 44
		}

		byte[] var7 = new byte[var6]; // L: 45

		int var8;
		for (var8 = 0; var8 < var6; ++var8) { // L: 46
			var7[var8] = var2.readByte();
		}

		++var2.offset; // L: 47
		++var6; // L: 48
		var8 = var2.offset; // L: 49
		var2.offset += var6; // L: 50

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) { // L: 51 52
		}

		byte[] var10 = new byte[var9]; // L: 53

		for (int var11 = 0; var11 < var9; ++var11) { // L: 54
			var10[var11] = var2.readByte();
		}

		++var2.offset; // L: 55
		++var9; // L: 56
		byte[] var36 = new byte[var9]; // L: 57
		int var12;
		int var14;
		if (var9 > 1) { // L: 59
			var36[1] = 1; // L: 60
			int var13 = 1; // L: 61
			var12 = 2; // L: 62

			for (var14 = 2; var14 < var9; ++var14) { // L: 63
				int var41 = var2.readUnsignedByte(); // L: 64
				if (var41 == 0) { // L: 65
					var13 = var12++;
				} else {
					if (var41 <= var13) { // L: 67
						--var41;
					}

					var13 = var41; // L: 68
				}

				var36[var14] = (byte)var13; // L: 70
			}
		} else {
			var12 = var9; // L: 73
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12]; // L: 74

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) { // L: 75
			var15 = var37[var14] = new MusicPatchNode2(); // L: 76
			int var40 = var2.readUnsignedByte(); // L: 77
			if (var40 > 0) { // L: 78
				var15.field2423 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte(); // L: 79
			if (var40 > 0) { // L: 80
				var15.field2426 = new byte[var40 * 2 + 2]; // L: 81
				var15.field2426[1] = 64; // L: 82
			}
		}

		var14 = var2.readUnsignedByte(); // L: 85
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null; // L: 86
		var14 = var2.readUnsignedByte(); // L: 87
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null; // L: 88

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) { // L: 89 90
		}

		byte[] var18 = new byte[var17]; // L: 91

		int var19;
		for (var19 = 0; var19 < var17; ++var19) { // L: 92
			var18[var19] = var2.readByte();
		}

		++var2.offset; // L: 93
		++var17; // L: 94
		var19 = 0; // L: 95

		int var20;
		for (var20 = 0; var20 < 128; ++var20) { // L: 96
			var19 += var2.readUnsignedByte(); // L: 97
			this.field2504[var20] = (short)var19; // L: 98
		}

		var19 = 0; // L: 100

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) { // L: 101
			var19 += var2.readUnsignedByte(); // L: 102
			var48 = this.field2504; // L: 103
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0; // L: 105
		int var21 = 0; // L: 106
		int var22 = 0; // L: 107

		int var23;
		for (var23 = 0; var23 < 128; ++var23) { // L: 108
			if (var20 == 0) { // L: 109
				if (var21 < var18.length) { // L: 110
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 111
				}

				var22 = var2.readVarInt(); // L: 112
			}

			var48 = this.field2504; // L: 114
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field2508[var23] = var22; // L: 115
			--var20; // L: 116
		}

		var20 = 0; // L: 118
		var21 = 0; // L: 119
		var23 = 0; // L: 120

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 121
			if (this.field2508[var24] != 0) { // L: 122
				if (var20 == 0) { // L: 123
					if (var21 < var4.length) { // L: 124
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 125
					}

					var23 = var2.array[var5++] - 1; // L: 126
				}

				this.field2509[var24] = (byte)var23; // L: 128
				--var20; // L: 129
			}
		}

		var20 = 0; // L: 131
		var21 = 0; // L: 132
		var24 = 0; // L: 133

		for (int var25 = 0; var25 < 128; ++var25) { // L: 134
			if (this.field2508[var25] != 0) { // L: 135
				if (var20 == 0) { // L: 136
					if (var21 < var7.length) { // L: 137
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 138
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 139
				}

				this.field2505[var25] = (byte)var24; // L: 141
				--var20; // L: 142
			}
		}

		var20 = 0; // L: 144
		var21 = 0; // L: 145
		MusicPatchNode2 var38 = null; // L: 146

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 147
			if (this.field2508[var26] != 0) { // L: 148
				if (var20 == 0) { // L: 149
					var38 = var37[var36[var21]]; // L: 150
					if (var21 < var10.length) { // L: 151
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 152
					}
				}

				this.field2506[var26] = var38; // L: 154
				--var20; // L: 155
			}
		}

		var20 = 0; // L: 157
		var21 = 0; // L: 158
		var26 = 0; // L: 159

		int var27;
		for (var27 = 0; var27 < 128; ++var27) { // L: 160
			if (var20 == 0) { // L: 161
				if (var21 < var18.length) { // L: 162
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 163
				}

				if (this.field2508[var27] > 0) { // L: 164
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field2502[var27] = (byte)var26; // L: 166
			--var20; // L: 167
		}

		this.field2507 = var2.readUnsignedByte() + 1; // L: 169

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) { // L: 170
			var39 = var37[var27]; // L: 171
			if (var39.field2423 != null) { // L: 172
				for (var29 = 1; var29 < var39.field2423.length; var29 += 2) { // L: 173
					var39.field2423[var29] = var2.readByte();
				}
			}

			if (var39.field2426 != null) { // L: 175
				for (var29 = 3; var29 < var39.field2426.length - 2; var29 += 2) { // L: 176
					var39.field2426[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) { // L: 179
			for (var27 = 1; var27 < var42.length; var27 += 2) { // L: 180
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 182
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 183
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 185
			var39 = var37[var27]; // L: 186
			if (var39.field2426 != null) { // L: 187
				var19 = 0; // L: 188

				for (var29 = 2; var29 < var39.field2426.length; var29 += 2) { // L: 189
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 190
					var39.field2426[var29] = (byte)var19; // L: 191
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 195
			var39 = var37[var27]; // L: 196
			if (var39.field2423 != null) { // L: 197
				var19 = 0; // L: 198

				for (var29 = 2; var29 < var39.field2423.length; var29 += 2) { // L: 199
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 200
					var39.field2423[var29] = (byte)var19; // L: 201
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) {
			var19 = var2.readUnsignedByte();
			var42[0] = (byte)var19; // L: 207

			for (var27 = 2; var27 < var42.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var42[var27] = (byte)var19; // L: 210
			}

			var47 = var42[0]; // L: 212
			byte var28 = var42[1]; // L: 213

			for (var29 = 0; var29 < var47; ++var29) { // L: 214
				this.field2502[var29] = (byte)(var28 * this.field2502[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) { // L: 215 216 227
				var30 = var42[var29]; // L: 217
				byte var31 = var42[var29 + 1]; // L: 218
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2; // L: 219

				for (var33 = var47; var33 < var30; ++var33) { // L: 220
					var34 = SecureRandomCallable.method1238(var32, var30 - var47); // L: 221
					this.field2502[var33] = (byte)(var34 * this.field2502[var33] + 32 >> 6); // L: 222
					var32 += var31 - var28; // L: 223
				}

				var47 = var30; // L: 225
				var28 = var31; // L: 226
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 229
				this.field2502[var45] = (byte)(var28 * this.field2502[var45] + 32 >> 6);
			}

			var15 = null; // L: 230
		}

		if (var16 != null) { // L: 232
			var19 = var2.readUnsignedByte(); // L: 233
			var16[0] = (byte)var19; // L: 234

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 235
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 236
				var16[var27] = (byte)var19; // L: 237
			}

			var47 = var16[0]; // L: 239
			int var44 = var16[1] << 1; // L: 240

			for (var29 = 0; var29 < var47; ++var29) { // L: 241
				var45 = var44 + (this.field2505[var29] & 255); // L: 242
				if (var45 < 0) { // L: 243
					var45 = 0;
				}

				if (var45 > 128) { // L: 244
					var45 = 128;
				}

				this.field2505[var29] = (byte)var45; // L: 245
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 247 248 262
				var30 = var16[var29]; // L: 249
				var46 = var16[var29 + 1] << 1; // L: 250
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2; // L: 251

				for (var33 = var47; var33 < var30; ++var33) { // L: 252
					var34 = SecureRandomCallable.method1238(var32, var30 - var47); // L: 253
					int var35 = var34 + (this.field2505[var33] & 255); // L: 254
					if (var35 < 0) { // L: 255
						var35 = 0;
					}

					if (var35 > 128) { // L: 256
						var35 = 128;
					}

					this.field2505[var33] = (byte)var35; // L: 257
					var32 += var46 - var44; // L: 258
				}

				var47 = var30; // L: 260
				var44 = var46; // L: 261
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 264
				var46 = var44 + (this.field2505[var45] & 255); // L: 265
				if (var46 < 0) { // L: 266
					var46 = 0;
				}

				if (var46 > 128) { // L: 267
					var46 = 128;
				}

				this.field2505[var45] = (byte)var46; // L: 268
			}

			Object var43 = null; // L: 270
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 272
			var37[var27].field2419 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 273
			var39 = var37[var27]; // L: 274
			if (var39.field2423 != null) { // L: 275
				var39.field2420 = var2.readUnsignedByte();
			}

			if (var39.field2426 != null) { // L: 276
				var39.field2421 = var2.readUnsignedByte();
			}

			if (var39.field2419 > 0) { // L: 277
				var39.field2422 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 279
			var37[var27].field2424 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 280
			var39 = var37[var27]; // L: 281
			if (var39.field2424 > 0) { // L: 282
				var39.field2418 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 284
			var39 = var37[var27]; // L: 285
			if (var39.field2418 > 0) { // L: 286
				var39.field2425 = var2.readUnsignedByte();
			}
		}

	} // L: 288

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lds;[B[IB)Z",
		garbageValue = "-125"
	)
	boolean method4026(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true; // L: 291
		int var5 = 0; // L: 292
		RawSound var6 = null; // L: 293

		for (int var7 = 0; var7 < 128; ++var7) { // L: 294
			if (var2 == null || var2[var7] != 0) { // L: 295
				int var8 = this.field2508[var7]; // L: 296
				if (var8 != 0) { // L: 297
					if (var8 != var5) { // L: 298
						var5 = var8--; // L: 299 300
						if ((var8 & 1) == 0) { // L: 301
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3); // L: 302
						}

						if (var6 == null) { // L: 303
							var4 = false;
						}
					}

					if (var6 != null) { // L: 305
						this.rawSounds[var7] = var6; // L: 306
						this.field2508[var7] = 0; // L: 307
					}
				}
			}
		}

		return var4; // L: 311
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "793986731"
	)
	@Export("clear")
	void clear() {
		this.field2508 = null; // L: 315
	} // L: 316

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "87"
	)
	public static boolean method4039(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1645227256"
	)
	static void method4038() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 203
			if (GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername != null) { // L: 204
				Login.Login_username = GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername; // L: 205
				Client.Login_isUsernameRemembered = true; // L: 206
			} else {
				Client.Login_isUsernameRemembered = false; // L: 208
			}

		}
	} // L: 209

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "733181439"
	)
	static int method4036(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3470
			var3 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 3471
			int var15 = (PlayerType.localPlayer.x >> 7) + FloorDecoration.baseX; // L: 3472
			int var8 = (PlayerType.localPlayer.y >> 7) + WorldMapData_0.baseY; // L: 3473
			Canvas.getWorldMap().method6464(var3, var15, var8, true); // L: 3474
			return 1; // L: 3475
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3477
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3478
				String var16 = ""; // L: 3479
				var9 = Canvas.getWorldMap().getMapArea(var3); // L: 3480
				if (var9 != null) { // L: 3481
					var16 = var9.getExternalName(); // L: 3482
				}

				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var16; // L: 3484
				return 1; // L: 3485
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3487
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3488
				Canvas.getWorldMap().setCurrentMapAreaId(var3); // L: 3489
				return 1; // L: 3490
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3492
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getZoomLevel(); // L: 3493
				return 1; // L: 3494
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3496
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3497
				Canvas.getWorldMap().setZoomPercentage(var3); // L: 3498
				return 1; // L: 3499
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3501
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3502
				return 1; // L: 3503
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3505
					var14 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3506
					Canvas.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3507
					return 1; // L: 3508
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3510
					var14 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3511
					Canvas.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3512
					return 1; // L: 3513
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3515
					var14 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3516
					Canvas.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3517
					return 1; // L: 3518
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3520
					var14 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3521
					Canvas.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3522
					return 1; // L: 3523
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3525
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayX(); // L: 3526
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayY(); // L: 3527
					return 1; // L: 3528
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3530
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3531
						var11 = Canvas.getWorldMap().getMapArea(var3); // L: 3532
						if (var11 == null) { // L: 3533
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3534
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3537
						}

						return 1; // L: 3539
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3541
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3542
						var11 = Canvas.getWorldMap().getMapArea(var3); // L: 3543
						if (var11 == null) { // L: 3544
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3545
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3546
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3549
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3550
						}

						return 1; // L: 3552
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3554
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3555
						var11 = Canvas.getWorldMap().getMapArea(var3); // L: 3556
						if (var11 == null) { // L: 3557
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3558
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3559
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3560
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3561
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 3564
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 3565
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 3566
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 3567
						}

						return 1; // L: 3569
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 3571
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3572
						var11 = Canvas.getWorldMap().getMapArea(var3); // L: 3573
						if (var11 == null) { // L: 3574
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3575
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 3578
						}

						return 1; // L: 3580
					} else if (var0 == 6615) { // L: 3582
						var14 = Canvas.getWorldMap().getDisplayCoord(); // L: 3583
						if (var14 == null) { // L: 3584
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3585
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3586
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14.x; // L: 3589
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14.y; // L: 3590
						}

						return 1; // L: 3592
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 3594
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().currentMapAreaId(); // L: 3595
						return 1; // L: 3596
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 3598
						var14 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3599
						var11 = Canvas.getWorldMap().getCurrentMapArea(); // L: 3600
						if (var11 == null) { // L: 3601
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3602
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3603
							return 1; // L: 3604
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 3606
							if (var12 == null) { // L: 3607
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3608
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3609
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12[0]; // L: 3612
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12[1]; // L: 3613
							}

							return 1; // L: 3615
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 3617
							var14 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3618
							var11 = Canvas.getWorldMap().getCurrentMapArea(); // L: 3619
							if (var11 == null) { // L: 3620
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3621
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3622
								return 1; // L: 3623
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 3625
								if (var5 == null) { // L: 3626
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3627
								} else {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var5.packed(); // L: 3630
								}

								return 1; // L: 3632
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 3634
								MilliClock.Interpreter_intStackSize -= 2; // L: 3635
								var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3636
								var10 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 3637
								WorldMapData_1.method796(var3, var10, false); // L: 3638
								return 1; // L: 3639
							} else if (var0 == 6620) { // L: 3641
								MilliClock.Interpreter_intStackSize -= 2; // L: 3642
								var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3643
								var10 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 3644
								WorldMapData_1.method796(var3, var10, true); // L: 3645
								return 1; // L: 3646
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 3648
								MilliClock.Interpreter_intStackSize -= 2; // L: 3649
								var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3650
								var10 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 3651
								var9 = Canvas.getWorldMap().getMapArea(var3); // L: 3652
								if (var9 == null) { // L: 3653
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3654
									return 1; // L: 3655
								} else {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 3657
									return 1; // L: 3658
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 3660
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayWith(); // L: 3661
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayHeight(); // L: 3662
								return 1; // L: 3663
							} else if (var0 == 6623) { // L: 3665
								var14 = new Coord(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3666
								var11 = Canvas.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 3667
								if (var11 == null) { // L: 3668
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3669
								} else {
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.getId(); // L: 3672
								}

								return 1; // L: 3674
							} else if (var0 == 6624) { // L: 3676
								Canvas.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3677
								return 1; // L: 3678
							} else if (var0 == 6625) { // L: 3680
								Canvas.getWorldMap().resetMaxFlashCount(); // L: 3681
								return 1; // L: 3682
							} else if (var0 == 6626) { // L: 3684
								Canvas.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 3685
								return 1; // L: 3686
							} else if (var0 == 6627) { // L: 3688
								Canvas.getWorldMap().resetCyclesPerFlash(); // L: 3689
								return 1; // L: 3690
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 3692
									var13 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 3693
									Canvas.getWorldMap().setPerpetualFlash(var13); // L: 3694
									return 1; // L: 3695
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 3697
									var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3698
									Canvas.getWorldMap().flashElement(var3); // L: 3699
									return 1; // L: 3700
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 3702
									var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3703
									Canvas.getWorldMap().flashCategory(var3); // L: 3704
									return 1; // L: 3705
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 3707
									Canvas.getWorldMap().stopCurrentFlashes(); // L: 3708
									return 1; // L: 3709
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 3711
									var13 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 3712
									Canvas.getWorldMap().setElementsDisabled(var13); // L: 3713
									return 1; // L: 3714
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 3716
										MilliClock.Interpreter_intStackSize -= 2; // L: 3717
										var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3718
										var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1; // L: 3719
										Canvas.getWorldMap().disableElement(var3, var7); // L: 3720
										return 1; // L: 3721
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 3723
										MilliClock.Interpreter_intStackSize -= 2; // L: 3724
										var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3725
										var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1; // L: 3726
										Canvas.getWorldMap().setCategoryDisabled(var3, var7); // L: 3727
										return 1; // L: 3728
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 3730
										Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 3731
										return 1; // L: 3732
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 3734
										var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3735
										Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 3736
										return 1; // L: 3737
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 3739
										var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3740
										Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 3741
										return 1; // L: 3742
									} else if (var0 == 6638) { // L: 3744
										MilliClock.Interpreter_intStackSize -= 2; // L: 3745
										var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3746
										var10 = new Coord(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 3747
										var5 = Canvas.getWorldMap().method6481(var3, var10); // L: 3748
										if (var5 == null) { // L: 3749
											Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3750
										} else {
											Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var5.packed(); // L: 3753
										}

										return 1; // L: 3755
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 3757
											var6 = Canvas.getWorldMap().iconStart(); // L: 3758
											if (var6 == null) { // L: 3759
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3760
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3761
											} else {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3764
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3765
											}

											return 1; // L: 3767
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 3769
											var6 = Canvas.getWorldMap().iconNext(); // L: 3770
											if (var6 == null) { // L: 3771
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3772
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3773
											} else {
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3776
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3777
											}

											return 1; // L: 3779
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 3781
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3782
												var4 = class194.WorldMapElement_get(var3); // L: 3783
												if (var4.name == null) { // L: 3784
													Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3785
												} else {
													Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.name; // L: 3788
												}

												return 1; // L: 3790
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 3792
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3793
												var4 = class194.WorldMapElement_get(var3); // L: 3794
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.textSize; // L: 3795
												return 1; // L: 3796
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 3798
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3799
												var4 = class194.WorldMapElement_get(var3); // L: 3800
												if (var4 == null) { // L: 3801
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3802
												} else {
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.category; // L: 3805
												}

												return 1; // L: 3807
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 3809
												var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3810
												var4 = class194.WorldMapElement_get(var3); // L: 3811
												if (var4 == null) { // L: 3812
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3813
												} else {
													Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.sprite1; // L: 3816
												}

												return 1; // L: 3818
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 3820
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection0.worldMapEvent.mapElement; // L: 3821
												return 1; // L: 3822
											} else if (var0 == 6698) { // L: 3824
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection0.worldMapEvent.coord1.packed(); // L: 3825
												return 1; // L: 3826
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 3828
												Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection0.worldMapEvent.coord2.packed(); // L: 3829
												return 1; // L: 3830
											} else {
												return 2; // L: 3832
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZLks;B)V",
		garbageValue = "44"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field802 = 0; // L: 7460
		Client.field726 = 0; // L: 7461
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 7463
		var2.importIndex(); // L: 7464
		int var3 = var2.readBits(8); // L: 7465
		int var4;
		if (var3 < Client.npcCount) { // L: 7466
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 7467
				Client.field803[++Client.field802 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 7469
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7470

			for (var4 = 0; var4 < var3; ++var4) { // L: 7471
				int var5 = Client.npcIndices[var4]; // L: 7472
				NPC var6 = Client.npcs[var5]; // L: 7473
				int var7 = var2.readBits(1); // L: 7474
				if (var7 == 0) { // L: 7475
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7476
					var6.npcCycle = Client.cycle; // L: 7477
				} else {
					int var8 = var2.readBits(2); // L: 7480
					if (var8 == 0) { // L: 7481
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7482
						var6.npcCycle = Client.cycle; // L: 7483
						Client.field727[++Client.field726 - 1] = var5; // L: 7484
					} else {
						int var9;
						int var10;
						if (var8 == 1) { // L: 7487
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7488
							var6.npcCycle = Client.cycle; // L: 7489
							var9 = var2.readBits(3); // L: 7490
							var6.method2150(var9, (byte)1); // L: 7491
							var10 = var2.readBits(1); // L: 7492
							if (var10 == 1) { // L: 7493
								Client.field727[++Client.field726 - 1] = var5;
							}
						} else if (var8 == 2) { // L: 7496
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7497
							var6.npcCycle = Client.cycle; // L: 7498
							var9 = var2.readBits(3); // L: 7499
							var6.method2150(var9, (byte)2); // L: 7500
							var10 = var2.readBits(3); // L: 7501
							var6.method2150(var10, (byte)2); // L: 7502
							int var11 = var2.readBits(1); // L: 7503
							if (var11 == 1) { // L: 7504
								Client.field727[++Client.field726 - 1] = var5;
							}
						} else if (var8 == 3) { // L: 7507
							Client.field803[++Client.field802 - 1] = var5; // L: 7508
						}
					}
				}
			}

			WorldMapCacheName.method724(var0, var1); // L: 7513
			SoundSystem.method2632(var1); // L: 7514

			int var12;
			for (var12 = 0; var12 < Client.field802; ++var12) { // L: 7515
				var3 = Client.field803[var12]; // L: 7516
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 7517
					Client.npcs[var3].definition = null; // L: 7518
					Client.npcs[var3] = null; // L: 7519
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7522
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var12 = 0; var12 < Client.npcCount; ++var12) { // L: 7523
					if (Client.npcs[Client.npcIndices[var12]] == null) { // L: 7524
						throw new RuntimeException(var12 + "," + Client.npcCount); // L: 7525
					}
				}

			}
		}
	} // L: 7528
}
