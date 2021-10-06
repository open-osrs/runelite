import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class114 extends class116 {
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -7893519352844407853L
	)
	long field1371;
	@ObfuscatedName("q")
	String field1370;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class114(class119 var1) {
		this.this$0 = var1;
		this.field1371 = -1L;
		this.field1370 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1371 = var1.readLong();
		}

		this.field1370 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2646(this.field1371, this.field1370, 0);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-769236648"
	)
	public static void method2485(String var0, String var1, int var2, int var3) throws IOException {
		Bounds.idxCount = var3;
		UserComparator10.cacheGamebuild = var2;

		try {
			Messages.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var35) {
			Messages.operatingSystemName = "Unknown";
		}

		class13.formattedOperatingSystemName = Messages.operatingSystemName.toLowerCase();

		try {
			class272.userHomeDirectory = System.getProperty("user.home");
			if (class272.userHomeDirectory != null) {
				class272.userHomeDirectory = class272.userHomeDirectory + "/";
			}
		} catch (Exception var34) {
		}

		try {
			if (class13.formattedOperatingSystemName.startsWith("win")) {
				if (class272.userHomeDirectory == null) {
					class272.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class272.userHomeDirectory == null) {
				class272.userHomeDirectory = System.getenv("HOME");
			}

			if (class272.userHomeDirectory != null) {
				class272.userHomeDirectory = class272.userHomeDirectory + "/";
			}
		} catch (Exception var33) {
		}

		if (class272.userHomeDirectory == null) {
			class272.userHomeDirectory = "~/";
		}

		class396.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class272.userHomeDirectory, "/tmp/", ""};
		class92.cacheSubPaths = new String[]{".jagex_cache_" + UserComparator10.cacheGamebuild, ".file_store_" + UserComparator10.cacheGamebuild};
		int var18 = 0;

		File var5;
		label308:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			JagexCache.JagexCache_locationFile = new File(class272.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			int var12;
			int var14;
			File var43;
			if (JagexCache.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

					Buffer var11;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) {
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
						if (var12 == -1) {
							throw new IOException();
						}
					}

					var11.offset = 0;
					var12 = var11.readUnsignedByte();
					if (var12 < 1 || var12 > 3) {
						throw new IOException("" + var12);
					}

					int var13 = 0;
					if (var12 > 1) {
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) {
						var7 = var11.readStringCp1252NullCircumfixed();
						if (var13 == 1) {
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8();
						if (var13 == 1) {
							var8 = var11.readCESU8();
						}
					}

					var10.close();
				} catch (IOException var38) {
					var38.printStackTrace();
				}

				if (var7 != null) {
					var43 = new File(var7);
					if (!var43.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var43 = new File(var7, "test.dat");

					boolean var46;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var43, "rw");
						var14 = var19.read();
						var19.seek(0L);
						var19.write(var14);
						var19.seek(0L);
						var19.close();
						var43.delete();
						var46 = true;
					} catch (Exception var32) {
						var46 = false;
					}

					if (!var46) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label282:
				for (int var20 = 0; var20 < class92.cacheSubPaths.length; ++var20) {
					for (int var21 = 0; var21 < class396.cacheParentPaths.length; ++var21) {
						File var22 = new File(class396.cacheParentPaths[var21] + class92.cacheSubPaths[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists()) {
							File var23 = new File(var22, "test.dat");

							boolean var47;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw");
								int var16 = var15.read();
								var15.seek(0L);
								var15.write(var16);
								var15.seek(0L);
								var15.close();
								var23.delete();
								var47 = true;
							} catch (Exception var31) {
								var47 = false;
							}

							if (var47) {
								var7 = var22.toString();
								var9 = true;
								break label282;
							}
						}
					}
				}
			}

			if (var7 == null) {
				var7 = class272.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			if (var8 != null) {
				File var42 = new File(var8);
				var43 = new File(var7);

				try {
					File[] var51 = var42.listFiles();
					File[] var49 = var51;

					for (var14 = 0; var14 < var49.length; ++var14) {
						File var48 = var49[var14];
						File var24 = new File(var43, var48.getName());
						boolean var17 = var48.renameTo(var24);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var37) {
					var37.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				EnumComposition.method3007(new File(var7), (File)null);
			}

			var5 = new File(var7);
			JagexCache.cacheDir = var5;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var39 = JagexCache.cacheDir.listFiles();
			if (var39 != null) {
				File[] var44 = var39;

				for (int var25 = 0; var25 < var44.length; ++var25) {
					File var26 = var44[var25];

					boolean var50;
					try {
						RandomAccessFile var45 = new RandomAccessFile(var26, "rw");
						var12 = var45.read();
						var45.seek(0L);
						var45.write(var12);
						var45.seek(0L);
						var45.close();
						var50 = true;
					} catch (Exception var30) {
						var50 = false;
					}

					if (!var50) {
						++var18;
						continue label308;
					}
				}
			}
			break;
		}

		File var4 = JagexCache.cacheDir;
		FileSystem.FileSystem_cacheDir = var4;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;

			try {
				var5 = new File(class272.userHomeDirectory, "random.dat");
				int var28;
				if (var5.exists()) {
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
				} else {
					label231:
					for (int var27 = 0; var27 < class92.cacheSubPaths.length; ++var27) {
						for (var28 = 0; var28 < class396.cacheParentPaths.length; ++var28) {
							File var41 = new File(class396.cacheParentPaths[var28] + class92.cacheSubPaths[var27] + File.separatorChar + "random.dat");
							if (var41.exists()) {
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var41, "rw", 25L), 24, 0);
								break label231;
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) {
					RandomAccessFile var40 = new RandomAccessFile(var5, "rw");
					var28 = var40.read();
					var40.seek(0L);
					var40.write(var28);
					var40.seek(0L);
					var40.close();
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
				}
			} catch (IOException var36) {
			}

			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class134.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class134.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			JagexCache.JagexCache_idxFiles = new BufferedFile[Bounds.idxCount];

			for (int var29 = 0; var29 < Bounds.idxCount; ++var29) {
				JagexCache.JagexCache_idxFiles[var29] = new BufferedFile(new AccessFile(class134.getFile("main_file_cache.idx" + var29), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;ZI)V",
		garbageValue = "-2136687604"
	)
	public static void method2490(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lji;",
		garbageValue = "-1874338745"
	)
	public static GameBuild method2494(int var0) {
		GameBuild[] var1 = class78.method2060();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "108"
	)
	public static boolean method2493(int var0) {
		return (var0 >> 29 & 1) != 0;
	}
}
