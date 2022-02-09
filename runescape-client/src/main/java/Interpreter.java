import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 1620756847
	)
	static int field854;
	@ObfuscatedName("o")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("i")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("w")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("v")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("a")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1726545229
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("u")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2049233165
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("f")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("g")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("k")
	static boolean field846;
	@ObfuscatedName("b")
	static boolean field848;
	@ObfuscatedName("z")
	static ArrayList field832;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1404435583
	)
	static int field849;
	@ObfuscatedName("ar")
	static final double field850;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 77
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50]; // L: 84
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 93
		field846 = false;
		field848 = false; // L: 97
		field832 = new ArrayList();
		field849 = 0; // L: 99
		field850 = Math.log(2.0D);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "62"
	)
	public static void method1876(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3; // L: 40
		WorldMapSectionType.cacheGamebuild = var2; // L: 41

		try {
			Messages.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var34) { // L: 45
			Messages.operatingSystemName = "Unknown"; // L: 46
		}

		ArchiveLoader.formattedOperatingSystemName = Messages.operatingSystemName.toLowerCase(); // L: 48

		try {
			TileItem.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (TileItem.userHomeDirectory != null) { // L: 51
				TileItem.userHomeDirectory = TileItem.userHomeDirectory + "/";
			}
		} catch (Exception var33) { // L: 53
		}

		try {
			if (ArchiveLoader.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (TileItem.userHomeDirectory == null) { // L: 56
					TileItem.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (TileItem.userHomeDirectory == null) { // L: 59
				TileItem.userHomeDirectory = System.getenv("HOME");
			}

			if (TileItem.userHomeDirectory != null) { // L: 61
				TileItem.userHomeDirectory = TileItem.userHomeDirectory + "/";
			}
		} catch (Exception var32) { // L: 63
		}

		if (TileItem.userHomeDirectory == null) { // L: 64
			TileItem.userHomeDirectory = "~/";
		}

		class320.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", TileItem.userHomeDirectory, "/tmp/", ""}; // L: 65
		class121.cacheSubPaths = new String[]{".jagex_cache_" + WorldMapSectionType.cacheGamebuild, ".file_store_" + WorldMapSectionType.cacheGamebuild}; // L: 66
		int var18 = 0;

		label296:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			JagexCache.JagexCache_locationFile = new File(TileItem.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			int var12;
			int var14;
			File var41;
			if (JagexCache.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 78

					Buffer var11;
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
				} catch (IOException var37) {
					var37.printStackTrace();
				}

				if (var7 != null) {
					var41 = new File(var7);
					if (!var41.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var41 = new File(var7, "test.dat"); // L: 110

					boolean var45;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var41, "rw"); // L: 114
						var14 = var19.read();
						var19.seek(0L); // L: 116
						var19.write(var14);
						var19.seek(0L);
						var19.close(); // L: 119
						var41.delete(); // L: 120
						var45 = true; // L: 121
					} catch (Exception var31) { // L: 123
						var45 = false; // L: 124
					}

					if (!var45) { // L: 127
						var7 = null; // L: 128
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 132
				label271:
				for (int var20 = 0; var20 < class121.cacheSubPaths.length; ++var20) { // L: 133
					for (int var21 = 0; var21 < class320.cacheParentPaths.length; ++var21) { // L: 134
						File var22 = new File(class320.cacheParentPaths[var21] + class121.cacheSubPaths[var20] + File.separatorChar + var0 + File.separatorChar); // L: 135
						if (var22.exists()) { // L: 136
							File var23 = new File(var22, "test.dat"); // L: 138

							boolean var46;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw"); // L: 141
								int var16 = var15.read(); // L: 142
								var15.seek(0L); // L: 143
								var15.write(var16); // L: 144
								var15.seek(0L); // L: 145
								var15.close(); // L: 146
								var23.delete(); // L: 147
								var46 = true; // L: 148
							} catch (Exception var30) { // L: 150
								var46 = false; // L: 151
							}

							if (var46) { // L: 154
								var7 = var22.toString(); // L: 155
								var9 = true; // L: 156
								break label271; // L: 157
							}
						}
					}
				}
			}

			if (var7 == null) { // L: 163
				var7 = TileItem.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 164
				var9 = true; // L: 165
			}

			if (var8 != null) { // L: 167
				File var40 = new File(var8); // L: 168
				var41 = new File(var7); // L: 169

				try {
					File[] var50 = var40.listFiles(); // L: 171
					File[] var48 = var50; // L: 173

					for (var14 = 0; var14 < var48.length; ++var14) { // L: 174
						File var47 = var48[var14]; // L: 175
						File var24 = new File(var41, var47.getName()); // L: 177
						boolean var17 = var47.renameTo(var24); // L: 178
						if (!var17) { // L: 179
							throw new IOException();
						}
					}
				} catch (Exception var36) { // L: 184
					var36.printStackTrace(); // L: 185
				}

				var9 = true; // L: 187
			}

			if (var9) { // L: 189
				BoundaryObject.method4277(new File(var7), (File)null);
			}

			File var5 = new File(var7); // L: 190
			UrlRequest.cacheDir = var5; // L: 192
			if (!UrlRequest.cacheDir.exists()) { // L: 193
				UrlRequest.cacheDir.mkdirs();
			}

			File[] var39 = UrlRequest.cacheDir.listFiles(); // L: 194
			if (var39 != null) { // L: 195
				File[] var42 = var39; // L: 197

				for (int var25 = 0; var25 < var42.length; ++var25) { // L: 198
					File var26 = var42[var25]; // L: 199

					boolean var49;
					try {
						RandomAccessFile var44 = new RandomAccessFile(var26, "rw"); // L: 204
						var12 = var44.read(); // L: 205
						var44.seek(0L); // L: 206
						var44.write(var12); // L: 207
						var44.seek(0L); // L: 208
						var44.close(); // L: 209
						var49 = true; // L: 211
					} catch (Exception var29) { // L: 213
						var49 = false; // L: 214
					}

					if (!var49) { // L: 217
						++var18; // L: 67
						continue label296;
					}
				}
			}
			break;
		}

		FriendsList.method6282(UrlRequest.cacheDir); // L: 224

		try {
			File var4 = new File(TileItem.userHomeDirectory, "random.dat"); // L: 227
			int var28;
			if (var4.exists()) { // L: 228
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 229
			} else {
				label222:
				for (int var27 = 0; var27 < class121.cacheSubPaths.length; ++var27) { // L: 232
					for (var28 = 0; var28 < class320.cacheParentPaths.length; ++var28) { // L: 233
						File var43 = new File(class320.cacheParentPaths[var28] + class121.cacheSubPaths[var27] + File.separatorChar + "random.dat"); // L: 234
						if (var43.exists()) { // L: 235
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var43, "rw", 25L), 24, 0); // L: 236
							break label222; // L: 237
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 242
				RandomAccessFile var38 = new RandomAccessFile(var4, "rw"); // L: 243
				var28 = var38.read(); // L: 244
				var38.seek(0L); // L: 245
				var38.write(var28); // L: 246
				var38.seek(0L); // L: 247
				var38.close(); // L: 248
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 249
			}
		} catch (IOException var35) { // L: 252
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class374.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 254
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class374.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 255
		VerticalAlignment.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 256

		for (var18 = 0; var18 < JagexCache.idxCount; ++var18) { // L: 257
			VerticalAlignment.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(class374.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 258
		}

	} // L: 260

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lcl;",
		garbageValue = "53"
	)
	static ClientPreferences method1877() {
		AccessFile var0 = null; // L: 100
		ClientPreferences var1 = new ClientPreferences(); // L: 101

		try {
			var0 = VarbitComposition.getPreferencesFile("", HorizontalAlignment.field1846.name, false); // L: 103
			byte[] var2 = new byte[(int)var0.length()]; // L: 104

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 105 106 109
				var4 = var0.read(var2, var3, var2.length - var3); // L: 107
				if (var4 == -1) {
					throw new IOException(); // L: 108
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 111
		} catch (Exception var6) { // L: 113
		}

		try {
			if (var0 != null) { // L: 115
				var0.close();
			}
		} catch (Exception var5) { // L: 117
		}

		return var1; // L: 118
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "570577906"
	)
	static void method1875(int var0, int var1) {
		int var2 = class408.fontBold12.stringWidth("Choose Option"); // L: 8301

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8302
			var4 = class408.fontBold12.stringWidth(class144.method2969(var3)); // L: 8303
			if (var4 > var2) { // L: 8304
				var2 = var4;
			}
		}

		var2 += 8; // L: 8306
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8307
		var4 = var0 - var2 / 2; // L: 8308
		if (var4 + var2 > DirectByteArrayCopier.canvasWidth) { // L: 8309
			var4 = DirectByteArrayCopier.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8310
			var4 = 0;
		}

		int var5 = var1; // L: 8311
		if (var1 + var3 > NPC.canvasHeight) { // L: 8312
			var5 = NPC.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8313
			var5 = 0;
		}

		Projectile.menuX = var4; // L: 8314
		ReflectionCheck.menuY = var5; // L: 8315
		Calendar.menuWidth = var2; // L: 8316
		ScriptFrame.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 8317
	} // L: 8318

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "2054568175"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class144.scrollBarSprites[0].drawAt(var0, var1); // L: 10398
		class144.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10399
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field720); // L: 10400
		int var5 = var3 * (var3 - 32) / var4; // L: 10401
		if (var5 < 8) { // L: 10402
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10403
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field568); // L: 10404
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field562); // L: 10405
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field562); // L: 10406
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field562); // L: 10407
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field562); // L: 10408
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field569); // L: 10409
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field569); // L: 10410
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field569); // L: 10411
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field569); // L: 10412
	} // L: 10413

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIILpt;Ljq;I)V",
		garbageValue = "-344569961"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11860
			int var6 = Client.camAngleY & 2047; // L: 11861
			int var7 = var3 * var3 + var2 * var2; // L: 11862
			if (var7 <= 6400) { // L: 11863
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11864
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11865
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11866
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11867
				if (var7 > 2500) {
					var4.method7807(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11868
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11869
				}

			}
		}
	} // L: 11870
}
