import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
public class class58 {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 1420275067
	)
	static int field433;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-276534150"
	)
	public static File method917(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		JagexCache.JagexCache_locationFile = new File(TileItemPile.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		Buffer var8;
		int var11;
		File var27;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 45
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 48

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 49 50 53
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 51
					if (var9 == -1) { // L: 52
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 55
				var9 = var8.readUnsignedByte(); // L: 56
				if (var9 < 1 || var9 > 3) { // L: 57
					throw new IOException("" + var9);
				}

				int var10 = 0; // L: 58
				if (var9 > 1) { // L: 59
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 60
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 61
					if (var10 == 1) { // L: 62
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 65
					if (var10 == 1) { // L: 66
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 68
			} catch (IOException var25) { // L: 70
				var25.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var27 = new File(var4); // L: 74
				if (!var27.exists()) { // L: 75
					var4 = null; // L: 76
				}
			}

			if (var4 != null) { // L: 79
				var27 = new File(var4, "test.dat"); // L: 80

				boolean var28;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var27, "rw"); // L: 84
					var11 = var15.read(); // L: 85
					var15.seek(0L); // L: 86
					var15.write(var11); // L: 87
					var15.seek(0L); // L: 88
					var15.close(); // L: 89
					var27.delete(); // L: 90
					var28 = true; // L: 91
				} catch (Exception var23) { // L: 93
					var28 = false; // L: 94
				}

				if (!var28) { // L: 97
					var4 = null; // L: 98
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 102
			label159:
			for (int var16 = 0; var16 < DynamicObject.field1318.length; ++var16) { // L: 103
				for (int var17 = 0; var17 < GraphicsObject.field1117.length; ++var17) { // L: 104
					File var18 = new File(GraphicsObject.field1117[var17] + DynamicObject.field1318[var16] + File.separatorChar + var0 + File.separatorChar); // L: 105
					if (var18.exists()) { // L: 106
						File var19 = new File(var18, "test.dat"); // L: 108

						boolean var29;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw"); // L: 111
							int var13 = var12.read(); // L: 112
							var12.seek(0L); // L: 113
							var12.write(var13); // L: 114
							var12.seek(0L); // L: 115
							var12.close(); // L: 116
							var19.delete(); // L: 117
							var29 = true; // L: 118
						} catch (Exception var22) { // L: 120
							var29 = false; // L: 121
						}

						if (var29) { // L: 124
							var4 = var18.toString(); // L: 125
							var6 = true; // L: 126
							break label159; // L: 127
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 133
			var4 = TileItemPile.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 134
			var6 = true; // L: 135
		}

		File var26;
		if (var5 != null) { // L: 137
			var26 = new File(var5); // L: 138
			var27 = new File(var4); // L: 139

			try {
				File[] var33 = var26.listFiles(); // L: 141
				File[] var31 = var33; // L: 143

				for (var11 = 0; var11 < var31.length; ++var11) { // L: 144
					File var30 = var31[var11]; // L: 145
					File var20 = new File(var27, var30.getName()); // L: 147
					boolean var14 = var30.renameTo(var20); // L: 148
					if (!var14) { // L: 149
						throw new IOException();
					}
				}
			} catch (Exception var24) { // L: 154
				var24.printStackTrace(); // L: 155
			}

			var6 = true; // L: 157
		}

		if (var6) { // L: 159
			var26 = new File(var4); // L: 160
			var8 = null; // L: 161

			try {
				AccessFile var34 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 165
				Buffer var32 = new Buffer(500); // L: 166
				var32.writeByte(3); // L: 167
				var32.writeByte(var8 != null ? 1 : 0); // L: 168
				var32.writeCESU8(var26.getPath()); // L: 169
				if (var8 != null) { // L: 170
					var32.writeCESU8("");
				}

				var34.write(var32.array, 0, var32.offset); // L: 171
				var34.close(); // L: 172
			} catch (IOException var21) { // L: 174
				var21.printStackTrace(); // L: 175
			}
		}

		return new File(var4); // L: 179
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-591482656"
	)
	static int method916(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3182
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SoundSystem.getWindowedMode(); // L: 3183
			return 1; // L: 3184
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3186
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3187
				if (var3 == 1 || var3 == 2) { // L: 3188
					class13.setWindowedMode(var3);
				}

				return 1; // L: 3189
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3191
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Timer.clientPreferences.windowMode; // L: 3192
				return 1; // L: 3193
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3195
				if (var0 == 5310) { // L: 3203
					--VarcInt.Interpreter_intStackSize; // L: 3204
					return 1; // L: 3205
				} else {
					return 2; // L: 3207
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3196
				if (var3 == 1 || var3 == 2) { // L: 3197
					Timer.clientPreferences.windowMode = var3; // L: 3198
					GrandExchangeOffer.savePreferences(); // L: 3199
				}

				return 1; // L: 3201
			}
		}
	}
}
