import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fq")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 391726433
	)
	@Export("xInset")
	public int xInset;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2116687229
	)
	@Export("yInset")
	public int yInset;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1517170261
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1280119157
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ak")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0; // L: 44
		this.yInset = 0; // L: 45
		this.xSize = var1; // L: 46
		this.ySize = var2; // L: 47
		this.flags = new int[this.xSize][this.ySize]; // L: 48
		this.clear(); // L: 49
	} // L: 50

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "981190902"
	)
	@Export("clear")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-696909470"
	)
	public void method3465(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 62
		var2 -= this.yInset; // L: 63
		if (var3 == 0) { // L: 64
			if (var4 == 0) { // L: 65
				this.setFlag(var1, var2, 128); // L: 66
				this.setFlag(var1 - 1, var2, 8); // L: 67
			}

			if (var4 == 1) { // L: 69
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

				if (var4 == 1) {
					this.setFlag(var1, var2, 1024);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384); // L: 137
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512);
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048);
					this.setFlag(var1 + 1, var2 + 1, 32768); // L: 148
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768);
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096); // L: 162
					this.setFlag(var1, var2 + 1, 16384); // L: 163
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) { // L: 170
					this.setFlag(var1, var2, 20480);
					this.setFlag(var1 + 1, var2, 65536);
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-507434937"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
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

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1882493146"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1]; // L: 201
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "71"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1]; // L: 207
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1002118940"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 211
		var10000[var2] |= var3;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "569667708"
	)
	public void method3470(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "230890481"
	)
	@Export("setFlagOffNonSquare")
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "265042064"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1834026790"
	)
	public void method3479(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "696499017"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 127
		var2.size = var0.readUnsignedByte(); // L: 128
		var2.id = var0.readInt(); // L: 129
		var2.operations = new int[var2.size]; // L: 130
		var2.creationErrors = new int[var2.size]; // L: 131
		var2.fields = new Field[var2.size]; // L: 132
		var2.intReplaceValues = new int[var2.size]; // L: 133
		var2.methods = new Method[var2.size]; // L: 134
		var2.arguments = new byte[var2.size][][]; // L: 135

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 136
			try {
				int var4 = var0.readUnsignedByte(); // L: 138
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 139
					if (var4 == 3 || var4 == 4) { // L: 149
						var5 = var0.readStringCp1252NullTerminated(); // L: 150
						var6 = var0.readStringCp1252NullTerminated(); // L: 151
						var7 = var0.readUnsignedByte(); // L: 152
						String[] var8 = new String[var7]; // L: 153

						for (int var9 = 0; var9 < var7; ++var9) { // L: 154
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 155
						byte[][] var10 = new byte[var7][]; // L: 156
						int var12;
						if (var4 == 3) { // L: 157
							for (int var11 = 0; var11 < var7; ++var11) { // L: 158
								var12 = var0.readInt(); // L: 159
								var10[var11] = new byte[var12]; // L: 160
								var0.readBytes(var10[var11], 0, var12); // L: 161
							}
						}

						var2.operations[var3] = var4; // L: 164
						Class[] var21 = new Class[var7]; // L: 165

						for (var12 = 0; var12 < var7; ++var12) { // L: 166
							var21[var12] = WorldMapLabelSize.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = WorldMapLabelSize.loadClassFromDescriptor(var20); // L: 167
						if (WorldMapLabelSize.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 168
							throw new SecurityException();
						}

						Method[] var13 = WorldMapLabelSize.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 169
						Method[] var14 = var13; // L: 171

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 172
							Method var16 = var14[var15]; // L: 173
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 175
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 176
								if (var17.length == var21.length) { // L: 177
									boolean var18 = true; // L: 178

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 179
										if (var21[var19] != var17[var19]) { // L: 180
											var18 = false; // L: 181
											break; // L: 182
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 185
										var2.methods[var3] = var16; // L: 186
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 193
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 140
					var6 = var0.readStringCp1252NullTerminated(); // L: 141
					var7 = 0; // L: 142
					if (var4 == 1) { // L: 143
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 144
					var2.intReplaceValues[var3] = var7; // L: 145
					if (WorldMapLabelSize.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 146
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(WorldMapLabelSize.loadClassFromDescriptor(var5), var6); // L: 147
				}
			} catch (ClassNotFoundException var24) { // L: 196
				var2.creationErrors[var3] = -1; // L: 197
			} catch (SecurityException var25) { // L: 199
				var2.creationErrors[var3] = -2; // L: 200
			} catch (NullPointerException var26) { // L: 202
				var2.creationErrors[var3] = -3; // L: 203
			} catch (Exception var27) { // L: 205
				var2.creationErrors[var3] = -4; // L: 206
			} catch (Throwable var28) { // L: 208
				var2.creationErrors[var3] = -5; // L: 209
			}
		}

		class54.reflectionChecks.addFirst(var2); // L: 212
	} // L: 213

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	public static void method3492() {
		ItemComposition.ItemDefinition_cached.clear(); // L: 548
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 549
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 550
	} // L: 551

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "121"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		SequenceDefinition.logOut(); // L: 3194
		switch(var0) { // L: 3195
		case 1:
			class275.method5201(24); // L: 3199
			class1.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 3200
			break;
		case 2:
			class275.method5201(24); // L: 3207
			class1.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 3208
		}

	} // L: 3213
}
