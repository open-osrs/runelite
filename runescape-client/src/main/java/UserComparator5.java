import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "2087209771"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnj;B)I",
		garbageValue = "67"
	)
	public static final int method2463(LoginType var0) {
		if (var0 == null) { // L: 16
			return 12; // L: 17
		} else {
			switch(var0.field4097) { // L: 19
			case 4:
				return 20; // L: 23
			default:
				return 12; // L: 21
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-2108211230"
	)
	@Export("findAndLoadCache")
	public static void findAndLoadCache(String var0, String var1, int var2, int var3) throws IOException {
		class124.idxCount = var3; // L: 40
		class310.cacheGamebuild = var2; // L: 41

		try {
			class35.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var31) { // L: 45
			class35.operatingSystemName = "Unknown"; // L: 46
		}

		EnumComposition.formattedOperatingSystemName = class35.operatingSystemName.toLowerCase(); // L: 48

		try {
			AccessFile.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (AccessFile.userHomeDirectory != null) { // L: 51
				AccessFile.userHomeDirectory = AccessFile.userHomeDirectory + "/";
			}
		} catch (Exception var30) { // L: 53
		}

		try {
			if (EnumComposition.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (AccessFile.userHomeDirectory == null) { // L: 56
					AccessFile.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (AccessFile.userHomeDirectory == null) { // L: 59
				AccessFile.userHomeDirectory = System.getenv("HOME");
			}

			if (AccessFile.userHomeDirectory != null) { // L: 61
				AccessFile.userHomeDirectory = AccessFile.userHomeDirectory + "/";
			}
		} catch (Exception var29) { // L: 63
		}

		if (AccessFile.userHomeDirectory == null) { // L: 64
			AccessFile.userHomeDirectory = "~/";
		}

		class243.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", AccessFile.userHomeDirectory, "/tmp/", ""}; // L: 65
		Script.cacheSubPaths = new String[]{".jagex_cache_" + class310.cacheGamebuild, ".file_store_" + class310.cacheGamebuild}; // L: 66
		int var18 = 0;

		File var5;
		label298:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			JagexCache.JagexCache_locationFile = new File(AccessFile.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			Buffer var11;
			File var39;
			if (JagexCache.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 78

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
				} catch (IOException var34) { // L: 100
					var34.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var39 = new File(var7); // L: 104
					if (!var39.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var39 = new File(var7, "test.dat"); // L: 110
					if (!User.isWriteable(var39, true)) { // L: 111
						var7 = null; // L: 112
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 116
				label273:
				for (int var19 = 0; var19 < Script.cacheSubPaths.length; ++var19) { // L: 117
					for (int var20 = 0; var20 < class243.cacheParentPaths.length; ++var20) { // L: 118
						File var21 = new File(class243.cacheParentPaths[var20] + Script.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar); // L: 119
						if (var21.exists() && User.isWriteable(new File(var21, "test.dat"), true)) { // L: 120 121
							var7 = var21.toString(); // L: 122
							var9 = true; // L: 123
							break label273; // L: 124
						}
					}
				}
			}

			if (var7 == null) { // L: 130
				var7 = AccessFile.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 131
				var9 = true; // L: 132
			}

			File var38;
			if (var8 != null) { // L: 134
				var38 = new File(var8); // L: 135
				var39 = new File(var7); // L: 136

				try {
					File[] var41 = var38.listFiles(); // L: 138
					File[] var22 = var41; // L: 140

					for (int var14 = 0; var14 < var22.length; ++var14) { // L: 141
						File var15 = var22[var14]; // L: 142
						File var16 = new File(var39, var15.getName()); // L: 144
						boolean var17 = var15.renameTo(var16); // L: 145
						if (!var17) { // L: 146
							throw new IOException();
						}
					}
				} catch (Exception var33) { // L: 151
					var33.printStackTrace(); // L: 152
				}

				var9 = true; // L: 154
			}

			if (var9) { // L: 156
				var38 = new File(var7); // L: 157
				var11 = null; // L: 158

				try {
					AccessFile var42 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 162
					Buffer var43 = new Buffer(500); // L: 163
					var43.writeByte(3); // L: 164
					var43.writeByte(var11 != null ? 1 : 0); // L: 165
					var43.writeCESU8(var38.getPath()); // L: 166
					if (var11 != null) { // L: 167
						var43.writeCESU8("");
					}

					var42.write(var43.array, 0, var43.offset); // L: 168
					var42.close(); // L: 169
				} catch (IOException var28) { // L: 171
					var28.printStackTrace(); // L: 172
				}
			}

			var5 = new File(var7); // L: 176
			JagexCache.cacheDir = var5; // L: 178
			if (!JagexCache.cacheDir.exists()) { // L: 179
				JagexCache.cacheDir.mkdirs();
			}

			File[] var35 = JagexCache.cacheDir.listFiles(); // L: 180
			if (var35 != null) { // L: 181
				File[] var40 = var35; // L: 183

				for (int var23 = 0; var23 < var40.length; ++var23) { // L: 184
					File var24 = var40[var23]; // L: 185
					if (!User.isWriteable(var24, false)) { // L: 187
						++var18; // L: 67
						continue label298;
					}
				}
			}
			break;
		}

		File var4 = JagexCache.cacheDir;
		FileSystem.FileSystem_cacheDir = var4;
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 197
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 198

			try {
				var5 = new File(AccessFile.userHomeDirectory, "random.dat"); // L: 202
				int var26;
				if (var5.exists()) { // L: 203
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 204
				} else {
					label224:
					for (int var25 = 0; var25 < Script.cacheSubPaths.length; ++var25) { // L: 207
						for (var26 = 0; var26 < class243.cacheParentPaths.length; ++var26) { // L: 208
							File var37 = new File(class243.cacheParentPaths[var26] + Script.cacheSubPaths[var25] + File.separatorChar + "random.dat"); // L: 209
							if (var37.exists()) { // L: 210
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var37, "rw", 25L), 24, 0); // L: 211
								break label224; // L: 212
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) { // L: 217
					RandomAccessFile var36 = new RandomAccessFile(var5, "rw"); // L: 218
					var26 = var36.read(); // L: 219
					var36.seek(0L); // L: 220
					var36.write(var26); // L: 221
					var36.seek(0L); // L: 222
					var36.close(); // L: 223
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 224
				}
			} catch (IOException var32) { // L: 227
			}

			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(NPC.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 229
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(NPC.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 230
			class21.JagexCache_idxFiles = new BufferedFile[class124.idxCount]; // L: 231

			for (int var27 = 0; var27 < class124.idxCount; ++var27) { // L: 232
				class21.JagexCache_idxFiles[var27] = new BufferedFile(new AccessFile(NPC.getFile("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0); // L: 233
			}

		}
	} // L: 235

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IB)Z",
		garbageValue = "-11"
	)
	static boolean method2465(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 193
		if (var2 == null) { // L: 194
			return false;
		} else {
			class303.SpriteBuffer_decode(var2); // L: 195
			return true; // L: 196
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "([Liv;II)V",
		garbageValue = "-1244597022"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10947
			Widget var3 = var0[var2]; // L: 10948
			if (var3 != null) { // L: 10949
				if (var3.type == 0) { // L: 10950
					if (var3.children != null) { // L: 10951
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10952
					if (var4 != null) { // L: 10953
						LoginType.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10955
					var5 = new ScriptEvent(); // L: 10956
					var5.widget = var3; // L: 10957
					var5.args = var3.onDialogAbort; // L: 10958
					class259.runScriptEvent(var5); // L: 10959
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10961
					if (var3.childIndex >= 0) { // L: 10962
						Widget var6 = DevicePcmPlayerProvider.getWidget(var3.id); // L: 10963
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10964
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10968
					var5.widget = var3; // L: 10969
					var5.args = var3.onSubChange; // L: 10970
					class259.runScriptEvent(var5); // L: 10971
				}
			}
		}

	} // L: 10974
}
