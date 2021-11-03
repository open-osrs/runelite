import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class300 {
	@ObfuscatedName("j")
	static int[] field3765;
	@ObfuscatedName("h")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("i")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("s")
	int[] field3761;
	@ObfuscatedName("a")
	int[] field3760;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -204507217
	)
	int field3762;

	public class300() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3761 = new int[2048]; // L: 12
		this.field3760 = new int[2048]; // L: 13
		this.field3762 = 0; // L: 14
		UserComparator6.method2513(); // L: 21
	} // L: 22

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1928494539"
	)
	void method5487(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = PacketWriter.method2425((double)var8, 0.0D, var4);
			++var8; // L: 52
		}

		double[] var14 = var7; // L: 57
		double var15 = var7[var1] * var7[var1]; // L: 58
		int[] var17 = new int[var2 * var2];
		boolean var10 = false; // L: 60

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) { // L: 62
				int var13 = var17[var12 + var2 * var11] = (int)(var14[var12] * var14[var11] / var15 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 69
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-975153988"
	)
	SpritePixels method5488(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5487(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 77
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "262729"
	)
	public final void method5498(int var1, int var2) {
		if (this.field3762 < this.field3761.length) {
			this.field3761[this.field3762] = var1;
			this.field3760[this.field3762] = var2;
			++this.field3762; // L: 84
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1224368993"
	)
	public final void method5490() {
		this.field3762 = 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILow;FB)V",
		garbageValue = "-58"
	)
	public final void method5491(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5488(var5); // L: 93
		int var7 = var5 * 2 + 1; // L: 94
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7); // L: 97
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3762; ++var10) { // L: 99
			var11 = this.field3761[var10];
			var12 = this.field3760[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 102
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6353(var8, var9);
			this.method5494(var6, var3, var9);
		}

		System.nanoTime(); // L: 108
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 115
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > field3765.length) {
						var11 = field3765.length;
					}

					var12 = field3765[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	} // L: 125

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Lmo;B)V",
		garbageValue = "-61"
	)
	void method5494(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 128
			int var4 = 0; // L: 129
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 133
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels; // L: 137
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 139
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-2012491010"
	)
	public static void method5507(String var0, String var1, int var2, int var3) throws IOException {
		ItemContainer.idxCount = var3; // L: 40
		JagexCache.cacheGamebuild = var2; // L: 41

		try {
			JagexCache.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var27) { // L: 45
			JagexCache.operatingSystemName = "Unknown"; // L: 46
		}

		class176.formattedOperatingSystemName = JagexCache.operatingSystemName.toLowerCase(); // L: 48

		try {
			TriBool.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (TriBool.userHomeDirectory != null) { // L: 51
				TriBool.userHomeDirectory = TriBool.userHomeDirectory + "/";
			}
		} catch (Exception var26) { // L: 53
		}

		try {
			if (class176.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (TriBool.userHomeDirectory == null) { // L: 56
					TriBool.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (TriBool.userHomeDirectory == null) { // L: 59
				TriBool.userHomeDirectory = System.getenv("HOME");
			}

			if (TriBool.userHomeDirectory != null) { // L: 61
				TriBool.userHomeDirectory = TriBool.userHomeDirectory + "/";
			}
		} catch (Exception var25) { // L: 63
		}

		if (TriBool.userHomeDirectory == null) { // L: 64
			TriBool.userHomeDirectory = "~/";
		}

		NPC.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", TriBool.userHomeDirectory, "/tmp/", ""}; // L: 65
		AbstractRasterProvider.cacheSubPaths = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 66
		int var18 = 0;

		label232:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			class351.JagexCache_locationFile = new File(TriBool.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			File var32;
			if (class351.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(class351.JagexCache_locationFile, "rw", 10000L); // L: 78

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
				} catch (IOException var29) { // L: 100
					var29.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var32 = new File(var7); // L: 104
					if (!var32.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var32 = new File(var7, "test.dat"); // L: 110
					if (!Varcs.method2359(var32, true)) { // L: 111
						var7 = null; // L: 112
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 116
				label207:
				for (int var19 = 0; var19 < AbstractRasterProvider.cacheSubPaths.length; ++var19) { // L: 117
					for (int var20 = 0; var20 < NPC.cacheParentPaths.length; ++var20) { // L: 118
						File var21 = new File(NPC.cacheParentPaths[var20] + AbstractRasterProvider.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar); // L: 119
						if (var21.exists() && Varcs.method2359(new File(var21, "test.dat"), true)) { // L: 120 121
							var7 = var21.toString(); // L: 122
							var9 = true; // L: 123
							break label207; // L: 124
						}
					}
				}
			}

			if (var7 == null) { // L: 130
				var7 = TriBool.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 131
				var9 = true; // L: 132
			}

			if (var8 != null) { // L: 134
				File var31 = new File(var8); // L: 135
				var32 = new File(var7); // L: 136

				try {
					File[] var34 = var31.listFiles(); // L: 138
					File[] var22 = var34; // L: 140

					for (int var14 = 0; var14 < var22.length; ++var14) { // L: 141
						File var15 = var22[var14]; // L: 142
						File var16 = new File(var32, var15.getName()); // L: 144
						boolean var17 = var15.renameTo(var16); // L: 145
						if (!var17) { // L: 146
							throw new IOException();
						}
					}
				} catch (Exception var28) { // L: 151
					var28.printStackTrace(); // L: 152
				}

				var9 = true; // L: 154
			}

			if (var9) { // L: 156
				UserComparator7.method2470(new File(var7), (File)null);
			}

			File var5 = new File(var7); // L: 157
			JagexCache.cacheDir = var5; // L: 159
			if (!JagexCache.cacheDir.exists()) { // L: 160
				JagexCache.cacheDir.mkdirs();
			}

			File[] var30 = JagexCache.cacheDir.listFiles(); // L: 161
			if (var30 != null) { // L: 162
				File[] var33 = var30; // L: 164

				for (int var23 = 0; var23 < var33.length; ++var23) { // L: 165
					File var24 = var33[var23]; // L: 166
					if (!Varcs.method2359(var24, false)) { // L: 168
						++var18; // L: 67
						continue label232;
					}
				}
			}
			break;
		}

		UserComparator6.method2508(JagexCache.cacheDir); // L: 175
		WorldMapData_1.method3844(); // L: 176
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(TriBool.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 177
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(TriBool.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 178
		WorldMapID.JagexCache_idxFiles = new BufferedFile[ItemContainer.idxCount]; // L: 179

		for (var18 = 0; var18 < ItemContainer.idxCount; ++var18) { // L: 180
			WorldMapID.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(TriBool.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 181
		}

	} // L: 183
}
