import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ci")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1548569011
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1470200335
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 706964479
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 307238289
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -360543025
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 265612905
	)
	int field1131;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -539992975
	)
	int field1129;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -420912825
	)
	@Export("id")
	int id;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1623947917
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1200611791
	)
	int field1126;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -997627389
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1963124653
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;IZI)Lds;",
		garbageValue = "1523171392"
	)
	public static class122 method2161(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 23
		byte[] var5 = var0.takeFile(var2 >> 16 & 65535, var2 & 65535); // L: 24
		if (var5 == null) { // L: 25
			var4 = false; // L: 26
			return null; // L: 27
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 29
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6); // L: 31
			} else {
				var7 = var1.getFile(var6, 0); // L: 32
			}

			if (var7 == null) { // L: 33
				var4 = false;
			}

			if (!var4) { // L: 34
				return null;
			} else {
				try {
					return new class122(var0, var1, var2, var3); // L: 36
				} catch (Exception var9) { // L: 38
					return null; // L: 39
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "373101383"
	)
	public static void method2160(String var0, String var1, int var2, int var3) throws IOException {
		UserComparator6.idxCount = var3; // L: 40
		class11.cacheGamebuild = var2; // L: 41

		try {
			JagexCache.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var18) { // L: 45
			JagexCache.operatingSystemName = "Unknown"; // L: 46
		}

		WorldMapArea.formattedOperatingSystemName = JagexCache.operatingSystemName.toLowerCase(); // L: 48

		try {
			BufferedSource.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (BufferedSource.userHomeDirectory != null) { // L: 51
				BufferedSource.userHomeDirectory = BufferedSource.userHomeDirectory + "/";
			}
		} catch (Exception var17) { // L: 53
		}

		try {
			if (WorldMapArea.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (BufferedSource.userHomeDirectory == null) { // L: 56
					BufferedSource.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (BufferedSource.userHomeDirectory == null) {
				BufferedSource.userHomeDirectory = System.getenv("HOME");
			}

			if (BufferedSource.userHomeDirectory != null) { // L: 61
				BufferedSource.userHomeDirectory = BufferedSource.userHomeDirectory + "/";
			}
		} catch (Exception var16) { // L: 63
		}

		if (BufferedSource.userHomeDirectory == null) { // L: 64
			BufferedSource.userHomeDirectory = "~/";
		}

		SecureRandomCallable.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", BufferedSource.userHomeDirectory, "/tmp/", ""}; // L: 65
		class83.cacheSubPaths = new String[]{".jagex_cache_" + class11.cacheGamebuild, ".file_store_" + class11.cacheGamebuild}; // L: 66
		int var12 = 0;

		int var7;
		File var8;
		label141:
		while (var12 < 4) {
			JagexCache.cacheDir = SequenceDefinition.method3717(var0, var1, var12); // L: 68
			if (!JagexCache.cacheDir.exists()) { // L: 69
				JagexCache.cacheDir.mkdirs();
			}

			File[] var5 = JagexCache.cacheDir.listFiles(); // L: 70
			if (var5 == null) { // L: 71
				break;
			}

			File[] var6 = var5; // L: 73
			var7 = 0;

			while (true) {
				if (var7 >= var6.length) {
					break label141;
				}

				var8 = var6[var7]; // L: 75

				boolean var9;
				try {
					RandomAccessFile var10 = new RandomAccessFile(var8, "rw"); // L: 80
					int var11 = var10.read(); // L: 81
					var10.seek(0L); // L: 82
					var10.write(var11); // L: 83
					var10.seek(0L); // L: 84
					var10.close(); // L: 85
					var9 = true; // L: 87
				} catch (Exception var15) { // L: 89
					var9 = false; // L: 90
				}

				if (!var9) { // L: 93
					++var12; // L: 67
					break;
				}

				++var7; // L: 74
			}
		}

		File var4 = JagexCache.cacheDir; // L: 100
		FileSystem.FileSystem_cacheDir = var4; // L: 102
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 103
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 104

			try {
				File var20 = new File(BufferedSource.userHomeDirectory, "random.dat"); // L: 108
				if (var20.exists()) { // L: 109
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var20, "rw", 25L), 24, 0); // L: 110
				} else {
					label120:
					for (int var13 = 0; var13 < class83.cacheSubPaths.length; ++var13) { // L: 113
						for (var7 = 0; var7 < SecureRandomCallable.cacheParentPaths.length; ++var7) { // L: 114
							var8 = new File(SecureRandomCallable.cacheParentPaths[var7] + class83.cacheSubPaths[var13] + File.separatorChar + "random.dat"); // L: 115
							if (var8.exists()) { // L: 116
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var8, "rw", 25L), 24, 0); // L: 117
								break label120; // L: 118
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) {
					RandomAccessFile var21 = new RandomAccessFile(var20, "rw");
					var7 = var21.read();
					var21.seek(0L);
					var21.write(var7);
					var21.seek(0L);
					var21.close();
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var20, "rw", 25L), 24, 0);
				}
			} catch (IOException var19) { // L: 133
			}

			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			JagexCache.JagexCache_idxFiles = new BufferedFile[UserComparator6.idxCount];

			for (int var14 = 0; var14 < UserComparator6.idxCount; ++var14) {
				JagexCache.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(VarpDefinition.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1995968561"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 123
		var2.size = var0.readUnsignedByte(); // L: 124
		var2.id = var0.readInt(); // L: 125
		var2.operations = new int[var2.size]; // L: 126
		var2.creationErrors = new int[var2.size]; // L: 127
		var2.fields = new Field[var2.size]; // L: 128
		var2.intReplaceValues = new int[var2.size]; // L: 129
		var2.methods = new Method[var2.size]; // L: 130
		var2.arguments = new byte[var2.size][][]; // L: 131

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 132
			try {
				int var4 = var0.readUnsignedByte(); // L: 134
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 135
					if (var4 == 3 || var4 == 4) { // L: 145
						var5 = var0.readStringCp1252NullTerminated(); // L: 146
						var6 = var0.readStringCp1252NullTerminated(); // L: 147
						var7 = var0.readUnsignedByte(); // L: 148
						String[] var8 = new String[var7]; // L: 149

						for (int var9 = 0; var9 < var7; ++var9) { // L: 150
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 151
						byte[][] var10 = new byte[var7][]; // L: 152
						int var12;
						if (var4 == 3) { // L: 153
							for (int var11 = 0; var11 < var7; ++var11) { // L: 154
								var12 = var0.readInt(); // L: 155
								var10[var11] = new byte[var12]; // L: 156
								var0.readBytes(var10[var11], 0, var12); // L: 157
							}
						}

						var2.operations[var3] = var4; // L: 160
						Class[] var21 = new Class[var7]; // L: 161

						for (var12 = 0; var12 < var7; ++var12) { // L: 162
							var21[var12] = WorldMapSection1.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = WorldMapSection1.loadClassFromDescriptor(var20); // L: 163
						if (WorldMapSection1.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 164
							throw new SecurityException();
						}

						Method[] var13 = WorldMapSection1.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 165
						Method[] var14 = var13; // L: 167

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 168
							Method var16 = var14[var15]; // L: 169
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 171
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 172
								if (var21.length == var17.length) { // L: 173
									boolean var18 = true; // L: 174

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 175
										if (var17[var19] != var21[var19]) { // L: 176
											var18 = false; // L: 177
											break; // L: 178
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 181
										var2.methods[var3] = var16; // L: 182
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 189
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 136
					var6 = var0.readStringCp1252NullTerminated(); // L: 137
					var7 = 0; // L: 138
					if (var4 == 1) { // L: 139
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 140
					var2.intReplaceValues[var3] = var7; // L: 141
					if (WorldMapSection1.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 142
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(WorldMapSection1.loadClassFromDescriptor(var5), var6); // L: 143
				}
			} catch (ClassNotFoundException var24) { // L: 192
				var2.creationErrors[var3] = -1; // L: 193
			} catch (SecurityException var25) { // L: 195
				var2.creationErrors[var3] = -2; // L: 196
			} catch (NullPointerException var26) { // L: 198
				var2.creationErrors[var3] = -3; // L: 199
			} catch (Exception var27) { // L: 201
				var2.creationErrors[var3] = -4; // L: 202
			} catch (Throwable var28) { // L: 204
				var2.creationErrors[var3] = -5; // L: 205
			}
		}

		class33.reflectionChecks.addFirst(var2); // L: 208
	} // L: 209

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	public static boolean method2164(int var0) {
		return var0 >= WorldMapDecorationType.field3571.id && var0 <= WorldMapDecorationType.field3559.id || var0 == WorldMapDecorationType.field3560.id; // L: 43
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "191115673"
	)
	static int method2163(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 57
		if (var1 == null) { // L: 58
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 59 60
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1563631744"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1144
			if (Client.gameState == 0) { // L: 1145
				class82.client.method438();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1146
				Canvas.method347(0); // L: 1147
				Client.field626 = 0; // L: 1148
				Client.field514 = 0; // L: 1149
				Client.timer.method6369(var0); // L: 1150
				if (var0 != 20) { // L: 1151
					ObjectSound.method1730(false);
				}
			}

			if (var0 != 20 && var0 != 40 && DirectByteArrayCopier.field3337 != null) { // L: 1153 1154
				DirectByteArrayCopier.field3337.close(); // L: 1155
				DirectByteArrayCopier.field3337 = null; // L: 1156
			}

			if (Client.gameState == 25) { // L: 1159
				Client.field597 = 0; // L: 1160
				Client.field545 = 0; // L: 1161
				Client.field546 = 1; // L: 1162
				Client.field570 = 0; // L: 1163
				Client.field548 = 1; // L: 1164
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1166
				if (var0 == 20) { // L: 1170
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1171
					AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, false, var1); // L: 1172
				} else if (var0 == 11) { // L: 1174
					AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, false, 4); // L: 1175
				} else if (var0 == 50) { // L: 1177
					class345.setLoginResponseString("", "Updating date of birth...", ""); // L: 1178
					AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, false, 7); // L: 1179
				} else if (Login.clearLoginScreen) { // L: 1182
					Login.titleboxSprite = null; // L: 1183
					Login.titlebuttonSprite = null; // L: 1184
					Login.runesSprite = null; // L: 1185
					UserComparator6.leftTitleSprite = null; // L: 1186
					SecureRandomCallable.rightTitleSprite = null; // L: 1187
					Clock.logoSprite = null; // L: 1188
					class358.title_muteSprite = null; // L: 1189
					class67.options_buttons_0Sprite = null; // L: 1190
					class101.options_buttons_2Sprite = null; // L: 1191
					GameEngine.worldSelectBackSprites = null; // L: 1192
					class260.worldSelectFlagSprites = null; // L: 1193
					class114.worldSelectArrows = null; // L: 1194
					class267.worldSelectStars = null; // L: 1195
					ArchiveDiskAction.field3997 = null; // L: 1196
					class193.loginScreenRunesAnimation.method2214(); // L: 1197
					UrlRequester.method2538(2); // L: 1198
					MouseRecorder.method2088(true); // L: 1199
					Login.clearLoginScreen = false; // L: 1200
				}
			} else {
				var1 = class118.method2721() ? 0 : 12; // L: 1167
				AbstractWorldMapData.method4800(ObjectSound.archive10, class305.archive8, true, var1); // L: 1168
			}

			Client.gameState = var0; // L: 1202
		}
	} // L: 1203
}
