import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public class class90 {
	@ObfuscatedName("gh")
	static int[] regions;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "4"
	)
	public static void method2138(String var0, String var1, int var2, int var3) throws IOException {
		GZipDecompressor.idxCount = var3; // L: 40
		SoundSystem.cacheGamebuild = var2; // L: 41

		try {
			WorldMapRegion.field277 = System.getProperty("os.name"); // L: 43
		} catch (Exception var33) { // L: 45
			WorldMapRegion.field277 = "Unknown"; // L: 46
		}

		JagexCache.field2094 = WorldMapRegion.field277.toLowerCase(); // L: 48

		try {
			UserComparator2.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (UserComparator2.userHomeDirectory != null) { // L: 51
				UserComparator2.userHomeDirectory = UserComparator2.userHomeDirectory + "/";
			}
		} catch (Exception var32) { // L: 53
		}

		try {
			if (JagexCache.field2094.startsWith("win")) { // L: 55
				if (UserComparator2.userHomeDirectory == null) { // L: 56
					UserComparator2.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (UserComparator2.userHomeDirectory == null) { // L: 59
				UserComparator2.userHomeDirectory = System.getenv("HOME");
			}

			if (UserComparator2.userHomeDirectory != null) { // L: 61
				UserComparator2.userHomeDirectory = UserComparator2.userHomeDirectory + "/";
			}
		} catch (Exception var31) { // L: 63
		}

		if (UserComparator2.userHomeDirectory == null) { // L: 64
			UserComparator2.userHomeDirectory = "~/";
		}

		UserComparator4.field2005 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", UserComparator2.userHomeDirectory, "/tmp/", ""}; // L: 65
		class69.field570 = new String[]{".jagex_cache_" + SoundSystem.cacheGamebuild, ".file_store_" + SoundSystem.cacheGamebuild}; // L: 66
		int var18 = 0;

		label272:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			JagexCache.JagexCache_locationFile = new File(UserComparator2.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			Buffer var11;
			int var12;
			int var14;
			File var38;
			if (JagexCache.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 78

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
				} catch (IOException var35) { // L: 100
					var35.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var38 = new File(var7); // L: 104
					if (!var38.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var38 = new File(var7, "test.dat"); // L: 110

					boolean var40;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var38, "rw"); // L: 114
						var14 = var19.read(); // L: 115
						var19.seek(0L); // L: 116
						var19.write(var14); // L: 117
						var19.seek(0L); // L: 118
						var19.close(); // L: 119
						var38.delete(); // L: 120
						var40 = true; // L: 121
					} catch (Exception var30) { // L: 123
						var40 = false; // L: 124
					}

					if (!var40) { // L: 127
						var7 = null; // L: 128
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 132
				label246:
				for (int var20 = 0; var20 < class69.field570.length; ++var20) { // L: 133
					for (int var21 = 0; var21 < UserComparator4.field2005.length; ++var21) { // L: 134
						File var22 = new File(UserComparator4.field2005[var21] + class69.field570[var20] + File.separatorChar + var0 + File.separatorChar); // L: 135
						if (var22.exists()) { // L: 136
							File var23 = new File(var22, "test.dat"); // L: 138

							boolean var42;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw"); // L: 141
								int var16 = var15.read(); // L: 142
								var15.seek(0L); // L: 143
								var15.write(var16); // L: 144
								var15.seek(0L); // L: 145
								var15.close(); // L: 146
								var23.delete(); // L: 147
								var42 = true; // L: 148
							} catch (Exception var29) { // L: 150
								var42 = false; // L: 151
							}

							if (var42) { // L: 154
								var7 = var22.toString(); // L: 155
								var9 = true; // L: 156
								break label246; // L: 157
							}
						}
					}
				}
			}

			if (var7 == null) { // L: 163
				var7 = UserComparator2.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 164
				var9 = true; // L: 165
			}

			File var37;
			if (var8 != null) { // L: 167
				var37 = new File(var8); // L: 168
				var38 = new File(var7); // L: 169

				try {
					File[] var47 = var37.listFiles(); // L: 171
					File[] var44 = var47; // L: 173

					for (var14 = 0; var14 < var44.length; ++var14) { // L: 174
						File var43 = var44[var14]; // L: 175
						File var24 = new File(var38, var43.getName()); // L: 177
						boolean var17 = var43.renameTo(var24); // L: 178
						if (!var17) { // L: 179
							throw new IOException();
						}
					}
				} catch (Exception var34) { // L: 184
					var34.printStackTrace(); // L: 185
				}

				var9 = true; // L: 187
			}

			if (var9) { // L: 189
				var37 = new File(var7); // L: 190
				var11 = null; // L: 191

				try {
					AccessFile var48 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 195
					Buffer var45 = new Buffer(500); // L: 196
					var45.writeByte(3); // L: 197
					var45.writeByte(var11 != null ? 1 : 0); // L: 198
					var45.writeCESU8(var37.getPath()); // L: 199
					if (var11 != null) { // L: 200
						var45.writeCESU8("");
					}

					var48.write(var45.array, 0, var45.offset); // L: 201
					var48.close(); // L: 202
				} catch (IOException var28) { // L: 204
					var28.printStackTrace(); // L: 205
				}
			}

			File var5 = new File(var7); // L: 209
			JagexCache.cacheDir = var5; // L: 211
			if (!JagexCache.cacheDir.exists()) { // L: 212
				JagexCache.cacheDir.mkdirs();
			}

			File[] var36 = JagexCache.cacheDir.listFiles(); // L: 213
			if (var36 != null) { // L: 214
				File[] var39 = var36; // L: 216

				for (int var25 = 0; var25 < var39.length; ++var25) { // L: 217
					File var26 = var39[var25]; // L: 218

					boolean var46;
					try {
						RandomAccessFile var41 = new RandomAccessFile(var26, "rw"); // L: 223
						var12 = var41.read(); // L: 224
						var41.seek(0L); // L: 225
						var41.write(var12); // L: 226
						var41.seek(0L); // L: 227
						var41.close(); // L: 228
						var46 = true; // L: 230
					} catch (Exception var27) { // L: 232
						var46 = false; // L: 233
					}

					if (!var46) { // L: 236
						++var18; // L: 67
						continue label272;
					}
				}
			}
			break;
		}

		WorldMapDecoration.method406(JagexCache.cacheDir); // L: 243
		GraphicsObject.method2091(); // L: 244
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(AbstractWorldMapIcon.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 245
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(AbstractWorldMapIcon.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 246
		JagexCache.JagexCache_idxFiles = new BufferedFile[GZipDecompressor.idxCount]; // L: 247

		for (var18 = 0; var18 < GZipDecompressor.idxCount; ++var18) { // L: 248
			JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(AbstractWorldMapIcon.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 249
		}

	} // L: 251
}
