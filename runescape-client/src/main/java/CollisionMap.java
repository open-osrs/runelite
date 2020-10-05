import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive6;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 232599941
	)
	int xInset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2100158867
	)
	int yInset;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -393101507
	)
	int xSize;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2096335191
	)
	int ySize;
	@ObfuscatedName("aq")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0; // L: 44
		this.yInset = 0; // L: 45
		this.xSize = var1; // L: 46
		this.ySize = var2; // L: 47
		this.flags = new int[this.xSize][this.ySize]; // L: 48
		this.clear(); // L: 49
	} // L: 50

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1749898511"
	)
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) { // L: 53
			for (int var2 = 0; var2 < this.ySize; ++var2) { // L: 54
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) { // L: 55
					this.flags[var1][var2] = 16777216; // L: 56
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	} // L: 59

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "580618753"
	)
	public void method3630(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 62
		var2 -= this.yInset; // L: 63
		if (var3 == 0) { // L: 64
			if (var4 == 0) { // L: 65
				this.setFlag(var1, var2, 128); // L: 66
				this.setFlag(var1 - 1, var2, 8); // L: 67
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2); // L: 70
				this.setFlag(var1, var2 + 1, 32); // L: 71
			}

			if (var4 == 2) { // L: 73
				this.setFlag(var1, var2, 8); // L: 74
				this.setFlag(var1 + 1, var2, 128); // L: 75
			}

			if (var4 == 3) { // L: 77
				this.setFlag(var1, var2, 32); // L: 78
				this.setFlag(var1, var2 - 1, 2); // L: 79
			}
		}

		if (var3 == 1 || var3 == 3) { // L: 82
			if (var4 == 0) { // L: 83
				this.setFlag(var1, var2, 1); // L: 84
				this.setFlag(var1 - 1, var2 + 1, 16); // L: 85
			}

			if (var4 == 1) { // L: 87
				this.setFlag(var1, var2, 4); // L: 88
				this.setFlag(var1 + 1, var2 + 1, 64); // L: 89
			}

			if (var4 == 2) { // L: 91
				this.setFlag(var1, var2, 16); // L: 92
				this.setFlag(var1 + 1, var2 - 1, 1); // L: 93
			}

			if (var4 == 3) { // L: 95
				this.setFlag(var1, var2, 64); // L: 96
				this.setFlag(var1 - 1, var2 - 1, 4); // L: 97
			}
		}

		if (var3 == 2) { // L: 100
			if (var4 == 0) { // L: 101
				this.setFlag(var1, var2, 130); // L: 102
				this.setFlag(var1 - 1, var2, 8); // L: 103
				this.setFlag(var1, var2 + 1, 32); // L: 104
			}

			if (var4 == 1) { // L: 106
				this.setFlag(var1, var2, 10); // L: 107
				this.setFlag(var1, var2 + 1, 32); // L: 108
				this.setFlag(var1 + 1, var2, 128); // L: 109
			}

			if (var4 == 2) { // L: 111
				this.setFlag(var1, var2, 40); // L: 112
				this.setFlag(var1 + 1, var2, 128); // L: 113
				this.setFlag(var1, var2 - 1, 2); // L: 114
			}

			if (var4 == 3) { // L: 116
				this.setFlag(var1, var2, 160); // L: 117
				this.setFlag(var1, var2 - 1, 2); // L: 118
				this.setFlag(var1 - 1, var2, 8); // L: 119
			}
		}

		if (var5) { // L: 122
			if (var3 == 0) { // L: 123
				if (var4 == 0) { // L: 124
					this.setFlag(var1, var2, 65536); // L: 125
					this.setFlag(var1 - 1, var2, 4096); // L: 126
				}

				if (var4 == 1) { // L: 128
					this.setFlag(var1, var2, 1024); // L: 129
					this.setFlag(var1, var2 + 1, 16384); // L: 130
				}

				if (var4 == 2) { // L: 132
					this.setFlag(var1, var2, 4096); // L: 133
					this.setFlag(var1 + 1, var2, 65536); // L: 134
				}

				if (var4 == 3) { // L: 136
					this.setFlag(var1, var2, 16384); // L: 137
					this.setFlag(var1, var2 - 1, 1024); // L: 138
				}
			}

			if (var3 == 1 || var3 == 3) { // L: 141
				if (var4 == 0) { // L: 142
					this.setFlag(var1, var2, 512); // L: 143
					this.setFlag(var1 - 1, var2 + 1, 8192); // L: 144
				}

				if (var4 == 1) { // L: 146
					this.setFlag(var1, var2, 2048); // L: 147
					this.setFlag(var1 + 1, var2 + 1, 32768); // L: 148
				}

				if (var4 == 2) { // L: 150
					this.setFlag(var1, var2, 8192); // L: 151
					this.setFlag(var1 + 1, var2 - 1, 512); // L: 152
				}

				if (var4 == 3) { // L: 154
					this.setFlag(var1, var2, 32768); // L: 155
					this.setFlag(var1 - 1, var2 - 1, 2048); // L: 156
				}
			}

			if (var3 == 2) { // L: 159
				if (var4 == 0) { // L: 160
					this.setFlag(var1, var2, 66560); // L: 161
					this.setFlag(var1 - 1, var2, 4096); // L: 162
					this.setFlag(var1, var2 + 1, 16384); // L: 163
				}

				if (var4 == 1) { // L: 165
					this.setFlag(var1, var2, 5120); // L: 166
					this.setFlag(var1, var2 + 1, 16384); // L: 167
					this.setFlag(var1 + 1, var2, 65536); // L: 168
				}

				if (var4 == 2) { // L: 170
					this.setFlag(var1, var2, 20480); // L: 171
					this.setFlag(var1 + 1, var2, 65536); // L: 172
					this.setFlag(var1, var2 - 1, 1024); // L: 173
				}

				if (var4 == 3) { // L: 175
					this.setFlag(var1, var2, 81920); // L: 176
					this.setFlag(var1, var2 - 1, 1024); // L: 177
					this.setFlag(var1 - 1, var2, 4096); // L: 178
				}
			}
		}

	} // L: 182

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1934730516"
	)
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256; // L: 185
		if (var5) { // L: 186
			var6 += 131072;
		}

		var1 -= this.xInset; // L: 187
		var2 -= this.yInset; // L: 188

		for (int var7 = var1; var7 < var3 + var1; ++var7) { // L: 189
			if (var7 >= 0 && var7 < this.xSize) { // L: 190
				for (int var8 = var2; var8 < var2 + var4; ++var8) { // L: 191
					if (var8 >= 0 && var8 < this.ySize) { // L: 192
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	} // L: 196

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1924690823"
	)
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset; // L: 199
		var2 -= this.yInset; // L: 200
		int[] var10000 = this.flags[var1]; // L: 201
		var10000[var2] |= 2097152;
	} // L: 202

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1474053794"
	)
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset; // L: 205
		var2 -= this.yInset; // L: 206
		int[] var10000 = this.flags[var1]; // L: 207
		var10000[var2] |= 262144;
	} // L: 208

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "88"
	)
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 211
		var10000[var2] |= var3;
	} // L: 212

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1610140342"
	)
	public void method3635(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 215
		var2 -= this.yInset; // L: 216
		if (var3 == 0) { // L: 217
			if (var4 == 0) { // L: 218
				this.setFlagOff(var1, var2, 128); // L: 219
				this.setFlagOff(var1 - 1, var2, 8); // L: 220
			}

			if (var4 == 1) { // L: 222
				this.setFlagOff(var1, var2, 2); // L: 223
				this.setFlagOff(var1, var2 + 1, 32); // L: 224
			}

			if (var4 == 2) { // L: 226
				this.setFlagOff(var1, var2, 8); // L: 227
				this.setFlagOff(var1 + 1, var2, 128); // L: 228
			}

			if (var4 == 3) { // L: 230
				this.setFlagOff(var1, var2, 32); // L: 231
				this.setFlagOff(var1, var2 - 1, 2); // L: 232
			}
		}

		if (var3 == 1 || var3 == 3) { // L: 235
			if (var4 == 0) { // L: 236
				this.setFlagOff(var1, var2, 1); // L: 237
				this.setFlagOff(var1 - 1, var2 + 1, 16); // L: 238
			}

			if (var4 == 1) { // L: 240
				this.setFlagOff(var1, var2, 4); // L: 241
				this.setFlagOff(var1 + 1, var2 + 1, 64); // L: 242
			}

			if (var4 == 2) { // L: 244
				this.setFlagOff(var1, var2, 16); // L: 245
				this.setFlagOff(var1 + 1, var2 - 1, 1); // L: 246
			}

			if (var4 == 3) { // L: 248
				this.setFlagOff(var1, var2, 64); // L: 249
				this.setFlagOff(var1 - 1, var2 - 1, 4); // L: 250
			}
		}

		if (var3 == 2) { // L: 253
			if (var4 == 0) { // L: 254
				this.setFlagOff(var1, var2, 130); // L: 255
				this.setFlagOff(var1 - 1, var2, 8); // L: 256
				this.setFlagOff(var1, var2 + 1, 32); // L: 257
			}

			if (var4 == 1) { // L: 259
				this.setFlagOff(var1, var2, 10); // L: 260
				this.setFlagOff(var1, var2 + 1, 32); // L: 261
				this.setFlagOff(var1 + 1, var2, 128); // L: 262
			}

			if (var4 == 2) { // L: 264
				this.setFlagOff(var1, var2, 40); // L: 265
				this.setFlagOff(var1 + 1, var2, 128); // L: 266
				this.setFlagOff(var1, var2 - 1, 2); // L: 267
			}

			if (var4 == 3) { // L: 269
				this.setFlagOff(var1, var2, 160); // L: 270
				this.setFlagOff(var1, var2 - 1, 2); // L: 271
				this.setFlagOff(var1 - 1, var2, 8); // L: 272
			}
		}

		if (var5) { // L: 275
			if (var3 == 0) { // L: 276
				if (var4 == 0) { // L: 277
					this.setFlagOff(var1, var2, 65536); // L: 278
					this.setFlagOff(var1 - 1, var2, 4096); // L: 279
				}

				if (var4 == 1) { // L: 281
					this.setFlagOff(var1, var2, 1024); // L: 282
					this.setFlagOff(var1, var2 + 1, 16384); // L: 283
				}

				if (var4 == 2) { // L: 285
					this.setFlagOff(var1, var2, 4096); // L: 286
					this.setFlagOff(var1 + 1, var2, 65536); // L: 287
				}

				if (var4 == 3) { // L: 289
					this.setFlagOff(var1, var2, 16384); // L: 290
					this.setFlagOff(var1, var2 - 1, 1024); // L: 291
				}
			}

			if (var3 == 1 || var3 == 3) { // L: 294
				if (var4 == 0) { // L: 295
					this.setFlagOff(var1, var2, 512); // L: 296
					this.setFlagOff(var1 - 1, var2 + 1, 8192); // L: 297
				}

				if (var4 == 1) { // L: 299
					this.setFlagOff(var1, var2, 2048); // L: 300
					this.setFlagOff(var1 + 1, var2 + 1, 32768); // L: 301
				}

				if (var4 == 2) { // L: 303
					this.setFlagOff(var1, var2, 8192); // L: 304
					this.setFlagOff(var1 + 1, var2 - 1, 512); // L: 305
				}

				if (var4 == 3) { // L: 307
					this.setFlagOff(var1, var2, 32768); // L: 308
					this.setFlagOff(var1 - 1, var2 - 1, 2048); // L: 309
				}
			}

			if (var3 == 2) { // L: 312
				if (var4 == 0) { // L: 313
					this.setFlagOff(var1, var2, 66560); // L: 314
					this.setFlagOff(var1 - 1, var2, 4096); // L: 315
					this.setFlagOff(var1, var2 + 1, 16384); // L: 316
				}

				if (var4 == 1) { // L: 318
					this.setFlagOff(var1, var2, 5120); // L: 319
					this.setFlagOff(var1, var2 + 1, 16384); // L: 320
					this.setFlagOff(var1 + 1, var2, 65536); // L: 321
				}

				if (var4 == 2) { // L: 323
					this.setFlagOff(var1, var2, 20480); // L: 324
					this.setFlagOff(var1 + 1, var2, 65536); // L: 325
					this.setFlagOff(var1, var2 - 1, 1024); // L: 326
				}

				if (var4 == 3) { // L: 328
					this.setFlagOff(var1, var2, 81920); // L: 329
					this.setFlagOff(var1, var2 - 1, 1024); // L: 330
					this.setFlagOff(var1 - 1, var2, 4096); // L: 331
				}
			}
		}

	} // L: 335

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "65280"
	)
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256; // L: 338
		if (var6) { // L: 339
			var7 += 131072;
		}

		var1 -= this.xInset; // L: 340
		var2 -= this.yInset; // L: 341
		int var8;
		if (var5 == 1 || var5 == 3) { // L: 342
			var8 = var3; // L: 343
			var3 = var4; // L: 344
			var4 = var8; // L: 345
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) { // L: 347
			if (var8 >= 0 && var8 < this.xSize) { // L: 348
				for (int var9 = var2; var9 < var2 + var4; ++var9) { // L: 349
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7); // L: 350
					}
				}
			}
		}

	} // L: 354

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1445892610"
	)
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "794579216"
	)
	public void method3638(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1810709507"
	)
	public static void method3653() {
		ParamDefinition.ParamDefinition_cached.clear(); // L: 68
	} // L: 69

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1831550493"
	)
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1279
			if (Client.gameState == 0) { // L: 1280
				class2.client.method1002();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1281
				Client.loginState = 0; // L: 1282
				Client.field822 = 0; // L: 1283
				Client.field708 = 0; // L: 1284
				Client.timer.method5110(var0); // L: 1285
				if (var0 != 20) { // L: 1286
					class22.method245(false);
				}
			}

			if (var0 != 20 && var0 != 40 && MouseHandler.field508 != null) { // L: 1288 1289
				MouseHandler.field508.close(); // L: 1290
				MouseHandler.field508 = null; // L: 1291
			}

			if (Client.gameState == 25) { // L: 1294
				Client.field732 = 0; // L: 1295
				Client.field728 = 0; // L: 1296
				Client.field711 = 1; // L: 1297
				Client.field895 = 0; // L: 1298
				Client.field791 = 1; // L: 1299
			}

			if (var0 != 5 && var0 != 10) { // L: 1301
				if (var0 == 20) { // L: 1304
					UserComparator1.method6041(Occluder.archive10, Huffman.archive8, true, Client.gameState == 11 ? 4 : 0); // L: 1305
				} else if (var0 == 11) { // L: 1307
					UserComparator1.method6041(Occluder.archive10, Huffman.archive8, false, 4); // L: 1308
				} else {
					Strings.method4202(); // L: 1310
				}
			} else {
				UserComparator1.method6041(Occluder.archive10, Huffman.archive8, true, 0); // L: 1302
			}

			Client.gameState = var0; // L: 1311
		}
	} // L: 1312

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lcg;II)V",
		garbageValue = "1018652463"
	)
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var11;
		if (var0.field1026 >= Client.cycle) { // L: 3570
			Coord.method4084(var0);
		} else {
			int var5;
			int var7;
			if (var0.field1019 >= Client.cycle) { // L: 3571
				if (var0.field1019 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > WorldMapRegion.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3572
					var11 = var0.field1019 - var0.field1026; // L: 3573
					var3 = Client.cycle - var0.field1026; // L: 3574
					var4 = var0.field1014 * 64 + var0.field997 * 128; // L: 3575
					var5 = var0.field1014 * 64 + var0.field1016 * 128; // L: 3576
					int var6 = var0.field1014 * 64 + var0.field1015 * 128; // L: 3577
					var7 = var0.field1014 * 64 + var0.field1017 * 128; // L: 3578
					var0.x = (var3 * var6 + var4 * (var11 - var3)) / var11; // L: 3579
					var0.y = (var3 * var7 + var5 * (var11 - var3)) / var11; // L: 3580
				}

				var0.field1032 = 0; // L: 3582
				var0.orientation = var0.field1027; // L: 3583
				var0.rotation = var0.orientation; // L: 3584
			} else {
				var0.movementSequence = var0.idleSequence; // L: 3587
				if (var0.pathLength == 0) { // L: 3588
					var0.field1032 = 0; // L: 3589
				} else {
					label540: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3592
							var2 = WorldMapRegion.SequenceDefinition_get(var0.sequence); // L: 3593
							if (var0.field973 > 0 && var2.field3549 == 0) { // L: 3594
								++var0.field1032; // L: 3595
								break label540; // L: 3596
							}

							if (var0.field973 <= 0 && var2.field3541 == 0) { // L: 3598
								++var0.field1032; // L: 3599
								break label540; // L: 3600
							}
						}

						var11 = var0.x; // L: 3603
						var3 = var0.y; // L: 3604
						var4 = var0.field1014 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3605
						var5 = var0.field1014 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3606
						if (var11 < var4) { // L: 3607
							if (var3 < var5) { // L: 3608
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 3609
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 3610
							}
						} else if (var11 > var4) { // L: 3612
							if (var3 < var5) { // L: 3613
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 3614
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 3615
							}
						} else if (var3 < var5) { // L: 3617
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 3618
							var0.orientation = 0;
						}

						byte var15 = var0.pathTraversed[var0.pathLength - 1]; // L: 3619
						if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3620
							var7 = var0.orientation - var0.rotation & 2047; // L: 3627
							if (var7 > 1024) { // L: 3628
								var7 -= 2048;
							}

							int var8 = var0.walkBackSequence; // L: 3629
							if (var7 >= -256 && var7 <= 256) { // L: 3630
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 3631
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 3632
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 3633
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 3634
							int var9 = 4; // L: 3635
							boolean var10 = true; // L: 3636
							if (var0 instanceof NPC) { // L: 3637
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 3638
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1025 != 0) { // L: 3639
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 3640
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 3641
									var9 = 8;
								}

								if (var0.field1032 > 0 && var0.pathLength > 1) { // L: 3642
									var9 = 8; // L: 3643
									--var0.field1032; // L: 3644
								}
							} else {
								if (var0.pathLength > 1) { // L: 3648
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 3649
									var9 = 8;
								}

								if (var0.field1032 > 0 && var0.pathLength > 1) { // L: 3650
									var9 = 8; // L: 3651
									--var0.field1032; // L: 3652
								}
							}

							if (var15 == 2) { // L: 3655
								var9 <<= 1;
							}

							if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 3656
								var0.movementSequence = var0.runSequence;
							}

							if (var4 != var11 || var5 != var3) { // L: 3657
								if (var11 < var4) { // L: 3658
									var0.x += var9; // L: 3659
									if (var0.x > var4) { // L: 3660
										var0.x = var4;
									}
								} else if (var11 > var4) { // L: 3662
									var0.x -= var9; // L: 3663
									if (var0.x < var4) { // L: 3664
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 3666
									var0.y += var9; // L: 3667
									if (var0.y > var5) { // L: 3668
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 3670
									var0.y -= var9; // L: 3671
									if (var0.y < var5) { // L: 3672
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 3675
								--var0.pathLength; // L: 3676
								if (var0.field973 > 0) { // L: 3677
									--var0.field973;
								}
							}
						} else {
							var0.x = var4; // L: 3621
							var0.y = var5; // L: 3622
							--var0.pathLength; // L: 3623
							if (var0.field973 > 0) { // L: 3624
								--var0.field973;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3680
			var0.sequence = -1; // L: 3681
			var0.spotAnimation = -1; // L: 3682
			var0.field1026 = 0; // L: 3683
			var0.field1019 = 0; // L: 3684
			var0.x = var0.pathX[0] * 128 + var0.field1014 * 64; // L: 3685
			var0.y = var0.field1014 * 64 + var0.pathY[0] * 128; // L: 3686
			var0.method1797(); // L: 3687
		}

		if (WorldMapLabelSize.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3689 3690
			var0.sequence = -1; // L: 3691
			var0.spotAnimation = -1; // L: 3692
			var0.field1026 = 0; // L: 3693
			var0.field1019 = 0; // L: 3694
			var0.x = var0.pathX[0] * 128 + var0.field1014 * 64; // L: 3695
			var0.y = var0.field1014 * 64 + var0.pathY[0] * 128; // L: 3696
			var0.method1797(); // L: 3697
		}

		if (var0.field1025 != 0) { // L: 3701
			if (var0.targetIndex != -1) { // L: 3702
				Object var13 = null; // L: 3703
				if (var0.targetIndex < 32768) { // L: 3704
					var13 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3705
					var13 = Client.players[var0.targetIndex - 32768];
				}

				if (var13 != null) { // L: 3706
					var3 = var0.x - ((Actor)var13).x; // L: 3707
					var4 = var0.y - ((Actor)var13).y; // L: 3708
					if (var3 != 0 || var4 != 0) { // L: 3709
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3711
					var0.targetIndex = -1; // L: 3712
					var0.false0 = false; // L: 3713
				}
			}

			if (var0.field1000 != -1 && (var0.pathLength == 0 || var0.field1032 > 0)) { // L: 3716
				var0.orientation = var0.field1000; // L: 3717
				var0.field1000 = -1; // L: 3718
			}

			var11 = var0.orientation - var0.rotation & 2047; // L: 3720
			if (var11 == 0 && var0.false0) { // L: 3721
				var0.targetIndex = -1; // L: 3722
				var0.false0 = false; // L: 3723
			}

			if (var11 != 0) { // L: 3725
				++var0.field1024; // L: 3726
				boolean var14;
				if (var11 > 1024) { // L: 3727
					var0.rotation -= var0.field1025; // L: 3728
					var14 = true; // L: 3729
					if (var11 < var0.field1025 || var11 > 2048 - var0.field1025) { // L: 3730
						var0.rotation = var0.orientation; // L: 3731
						var14 = false; // L: 3732
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1024 > 25 || var14)) { // L: 3734
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence; // L: 3735
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3736
						}
					}
				} else {
					var0.rotation += var0.field1025; // L: 3740
					var14 = true; // L: 3741
					if (var11 < var0.field1025 || var11 > 2048 - var0.field1025) { // L: 3742
						var0.rotation = var0.orientation; // L: 3743
						var14 = false; // L: 3744
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1024 > 25 || var14)) { // L: 3746
						if (var0.turnRightSequence != -1) { // L: 3747
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3748
						}
					}
				}

				var0.rotation &= 2047; // L: 3752
			} else {
				var0.field1024 = 0; // L: 3754
			}
		}

		var0.isWalking = false; // L: 3757
		if (var0.movementSequence != -1) { // L: 3758
			var2 = WorldMapRegion.SequenceDefinition_get(var0.movementSequence); // L: 3759
			if (var2 != null && var2.frameIds != null) { // L: 3760
				++var0.movementFrameCycle; // L: 3761
				if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) { // L: 3762
					var0.movementFrameCycle = 1; // L: 3763
					++var0.movementFrame; // L: 3764
					GrandExchangeEvent.addSequenceSoundEffect(var2, var0.movementFrame, var0.x, var0.y); // L: 3765
				}

				if (var0.movementFrame >= var2.frameIds.length) { // L: 3767
					var0.movementFrameCycle = 0; // L: 3768
					var0.movementFrame = 0; // L: 3769
					GrandExchangeEvent.addSequenceSoundEffect(var2, var0.movementFrame, var0.x, var0.y); // L: 3770
				}
			} else {
				var0.movementSequence = -1; // L: 3773
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1013) { // L: 3775
			if (var0.spotAnimationFrame < 0) { // L: 3776
				var0.spotAnimationFrame = 0;
			}

			var11 = Tiles.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 3777
			if (var11 != -1) { // L: 3778
				SequenceDefinition var12 = WorldMapRegion.SequenceDefinition_get(var11); // L: 3779
				if (var12 != null && var12.frameIds != null) { // L: 3780
					++var0.spotAnimationFrameCycle; // L: 3781
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) { // L: 3782
						var0.spotAnimationFrameCycle = 1; // L: 3783
						++var0.spotAnimationFrame; // L: 3784
						GrandExchangeEvent.addSequenceSoundEffect(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 3785
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) { // L: 3787 3788
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 3791
				}
			} else {
				var0.spotAnimation = -1; // L: 3793
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 3795
			var2 = WorldMapRegion.SequenceDefinition_get(var0.sequence); // L: 3796
			if (var2.field3549 == 1 && var0.field973 > 0 && var0.field1026 <= Client.cycle && var0.field1019 < Client.cycle) { // L: 3797 3798
				var0.sequenceDelay = 1; // L: 3799
				return; // L: 3826
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3804
			var2 = WorldMapRegion.SequenceDefinition_get(var0.sequence); // L: 3805
			if (var2 != null && var2.frameIds != null) { // L: 3806
				++var0.sequenceFrameCycle; // L: 3807
				if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) { // L: 3808
					var0.sequenceFrameCycle = 1; // L: 3809
					++var0.sequenceFrame; // L: 3810
					GrandExchangeEvent.addSequenceSoundEffect(var2, var0.sequenceFrame, var0.x, var0.y); // L: 3811
				}

				if (var0.sequenceFrame >= var2.frameIds.length) { // L: 3813
					var0.sequenceFrame -= var2.frameCount; // L: 3814
					++var0.field1009; // L: 3815
					if (var0.field1009 >= var2.field3548) { // L: 3816
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) { // L: 3817
						GrandExchangeEvent.addSequenceSoundEffect(var2, var0.sequenceFrame, var0.x, var0.y); // L: 3818
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var2.field3544; // L: 3820
			} else {
				var0.sequence = -1; // L: 3822
			}
		}

		if (var0.sequenceDelay > 0) { // L: 3824
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1510761090"
	)
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4289
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4290
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4291
				int var3 = var2.x >> 7; // L: 4292
				int var4 = var2.y >> 7; // L: 4293
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4294
					if (var2.field1014 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4295
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4296
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4297
					}

					long var5 = class227.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4299
					var2.playerCycle = Client.cycle; // L: 4300
					ScriptEvent.scene.drawEntity(Huffman.Client_plane, var2.x, var2.y, ArchiveLoader.getTileHeight(var2.field1014 * 64 - 64 + var2.x, var2.field1014 * 64 - 64 + var2.y, Huffman.Client_plane), var2.field1014 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4301
				}
			}
		}

	} // L: 4305
}
