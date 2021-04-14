import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1593965705
	)
	public static int field1535;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1207023295
	)
	@Export("xInset")
	public int xInset;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1514809971
	)
	@Export("yInset")
	public int yInset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1497188267
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 703180001
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ad")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0; // L: 44
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2; // L: 47
		this.flags = new int[this.xSize][this.ySize];
		this.clear(); // L: 49
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "147847129"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) { // L: 54
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1236206296"
	)
	public void method2613(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 62
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128);
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) { // L: 69
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) { // L: 77
				this.setFlag(var1, var2, 32);
				this.setFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 1); // L: 84
				this.setFlag(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 4);
				this.setFlag(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 16);
				this.setFlag(var1 + 1, var2 - 1, 1); // L: 93
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 64);
				this.setFlag(var1 - 1, var2 - 1, 4); // L: 97
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 130); // L: 102
				this.setFlag(var1 - 1, var2, 8);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 10); // L: 107
				this.setFlag(var1, var2 + 1, 32); // L: 108
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 40);
				this.setFlag(var1 + 1, var2, 128); // L: 113
				this.setFlag(var1, var2 - 1, 2); // L: 114
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 160);
				this.setFlag(var1, var2 - 1, 2);
				this.setFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 65536); // L: 125
					this.setFlag(var1 - 1, var2, 4096); // L: 126
				}

				if (var4 == 1) { // L: 128
					this.setFlag(var1, var2, 1024); // L: 129
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096); // L: 133
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384); // L: 137
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512); // L: 143
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048); // L: 147
					this.setFlag(var1 + 1, var2 + 1, 32768); // L: 148
				}

				if (var4 == 2) { // L: 150
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768); // L: 155
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096);
					this.setFlag(var1, var2 + 1, 16384); // L: 163
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384); // L: 167
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) { // L: 170
					this.setFlag(var1, var2, 20480); // L: 171
					this.setFlag(var1 + 1, var2, 65536); // L: 172
					this.setFlag(var1, var2 - 1, 1024); // L: 173
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920); // L: 176
					this.setFlag(var1, var2 - 1, 1024); // L: 177
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	} // L: 182

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1542434714"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;

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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1]; // L: 201
		var10000[var2] |= 2097152;
	} // L: 202

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1437580764"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1947097076"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1853032959"
	)
	public void method2616(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) { // L: 217
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "792603684"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "7"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 357
		var10000[var2] &= ~var3;
	} // L: 358

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1556531543"
	)
	public void method2621(int var1, int var2) {
		var1 -= this.xInset; // L: 361
		var2 -= this.yInset; // L: 362
		int[] var10000 = this.flags[var1]; // L: 363
		var10000[var2] &= -262145;
	} // L: 364

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1545015307"
	)
	@Export("findAndLoadCache")
	public static void findAndLoadCache(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3; // L: 40
		class20.cacheGamebuild = var2; // L: 41

		try {
			Varps.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var29) { // L: 45
			Varps.operatingSystemName = "Unknown"; // L: 46
		}

		Decimator.formattedOperatingSystemName = Varps.operatingSystemName.toLowerCase(); // L: 48

		try {
			Canvas.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (Canvas.userHomeDirectory != null) { // L: 51
				Canvas.userHomeDirectory = Canvas.userHomeDirectory + "/";
			}
		} catch (Exception var28) { // L: 53
		}

		try {
			if (Decimator.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (Canvas.userHomeDirectory == null) { // L: 56
					Canvas.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (Canvas.userHomeDirectory == null) { // L: 59
				Canvas.userHomeDirectory = System.getenv("HOME");
			}

			if (Canvas.userHomeDirectory != null) { // L: 61
				Canvas.userHomeDirectory = Canvas.userHomeDirectory + "/";
			}
		} catch (Exception var27) { // L: 63
		}

		if (Canvas.userHomeDirectory == null) { // L: 64
			Canvas.userHomeDirectory = "~/";
		}

		IntHashTable.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Canvas.userHomeDirectory, "/tmp/", ""}; // L: 65
		class311.cacheSubPaths = new String[]{".jagex_cache_" + class20.cacheGamebuild, ".file_store_" + class20.cacheGamebuild}; // L: 66
		int var18 = 0;

		label277:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			JagexCache.JagexCache_locationFile = new File(Canvas.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			File var36;
			if (JagexCache.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 78

					Buffer var11;
					int var12;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) { // L: 79 80 83
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset); // L: 81
						if (var12 == -1) { // L: 82
							throw new IOException();
						}
					}

					var11.offset = 0; // L: 85
					var12 = var11.readUnsignedByte(); // L: 86
					if (var12 < 1 || var12 > 3) { // L: 87
						throw new IOException("" + var12);
					}

					int var13 = 0; // L: 88
					if (var12 > 1) { // L: 89
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) { // L: 90
						var7 = var11.readStringCp1252NullCircumfixed(); // L: 91
						if (var13 == 1) { // L: 92
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8(); // L: 95
						if (var13 == 1) { // L: 96
							var8 = var11.readCESU8();
						}
					}

					var10.close(); // L: 98
				} catch (IOException var32) { // L: 100
					var32.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var36 = new File(var7); // L: 104
					if (!var36.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var36 = new File(var7, "test.dat"); // L: 110
					if (!MouseHandler.isWriteable(var36, true)) { // L: 111
						var7 = null; // L: 112
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 116
				label252:
				for (int var19 = 0; var19 < class311.cacheSubPaths.length; ++var19) { // L: 117
					for (int var20 = 0; var20 < IntHashTable.cacheParentPaths.length; ++var20) { // L: 118
						File var21 = new File(IntHashTable.cacheParentPaths[var20] + class311.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar); // L: 119
						if (var21.exists() && MouseHandler.isWriteable(new File(var21, "test.dat"), true)) { // L: 120 121
							var7 = var21.toString(); // L: 122
							var9 = true; // L: 123
							break label252; // L: 124
						}
					}
				}
			}

			if (var7 == null) { // L: 130
				var7 = Canvas.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 131
				var9 = true; // L: 132
			}

			if (var8 != null) { // L: 134
				File var35 = new File(var8); // L: 135
				var36 = new File(var7); // L: 136

				try {
					File[] var39 = var35.listFiles(); // L: 138
					File[] var22 = var39; // L: 140

					for (int var14 = 0; var14 < var22.length; ++var14) { // L: 141
						File var15 = var22[var14]; // L: 142
						File var16 = new File(var36, var15.getName()); // L: 144
						boolean var17 = var15.renameTo(var16); // L: 145
						if (!var17) { // L: 146
							throw new IOException();
						}
					}
				} catch (Exception var31) { // L: 151
					var31.printStackTrace(); // L: 152
				}

				var9 = true; // L: 154
			}

			if (var9) { // L: 156
				BuddyRankComparator.method2475(new File(var7), (File)null);
			}

			File var5 = new File(var7); // L: 157
			JagexCache.cacheDir = var5; // L: 159
			if (!JagexCache.cacheDir.exists()) { // L: 160
				JagexCache.cacheDir.mkdirs();
			}

			File[] var34 = JagexCache.cacheDir.listFiles(); // L: 161
			if (var34 != null) { // L: 162
				File[] var37 = var34; // L: 164

				for (int var23 = 0; var23 < var37.length; ++var23) { // L: 165
					File var24 = var37[var23]; // L: 166
					if (!MouseHandler.isWriteable(var24, false)) { // L: 168
						++var18; // L: 67
						continue label277;
					}
				}
			}
			break;
		}

		InvDefinition.assertCacheDirExists(JagexCache.cacheDir); // L: 175

		try {
			File var4 = new File(Canvas.userHomeDirectory, "random.dat"); // L: 178
			int var26;
			if (var4.exists()) { // L: 179
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 180
			} else {
				label205:
				for (int var25 = 0; var25 < class311.cacheSubPaths.length; ++var25) { // L: 183
					for (var26 = 0; var26 < IntHashTable.cacheParentPaths.length; ++var26) { // L: 184
						File var38 = new File(IntHashTable.cacheParentPaths[var26] + class311.cacheSubPaths[var25] + File.separatorChar + "random.dat"); // L: 185
						if (var38.exists()) { // L: 186
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var38, "rw", 25L), 24, 0); // L: 187
							break label205; // L: 188
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 193
				RandomAccessFile var33 = new RandomAccessFile(var4, "rw"); // L: 194
				var26 = var33.read(); // L: 195
				var33.seek(0L); // L: 196
				var33.write(var26); // L: 197
				var33.seek(0L); // L: 198
				var33.close(); // L: 199
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 200
			}
		} catch (IOException var30) { // L: 203
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class18.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 205
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class18.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 206
		PendingSpawn.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 207

		for (var18 = 0; var18 < JagexCache.idxCount; ++var18) { // L: 208
			PendingSpawn.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(class18.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 209
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lig;IB)V",
		garbageValue = "-121"
	)
	static void method2622(Archive var0, int var1) {
		if (BuddyRankComparator.NetCache_reference != null) { // L: 211
			BuddyRankComparator.NetCache_reference.offset = var1 * 8 + 5; // L: 212
			int var2 = BuddyRankComparator.NetCache_reference.readInt(); // L: 213
			int var3 = BuddyRankComparator.NetCache_reference.readInt(); // L: 214
			var0.loadIndex(var2, var3); // L: 215
		} else {
			Canvas.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 218
			NetCache.NetCache_archives[var1] = var0; // L: 219
		}
	} // L: 216 220
}
