import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gr")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1816711147
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("bh")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1767289693"
	)
	public static File method4244(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		SecureRandomCallable.JagexCache_locationFile = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		Buffer var8;
		int var11;
		File var27;
		if (SecureRandomCallable.JagexCache_locationFile.exists()) { // L: 45
			try {
				AccessFile var7 = new AccessFile(SecureRandomCallable.JagexCache_locationFile, "rw", 10000L); // L: 48

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
			label153:
			for (int var16 = 0; var16 < JagexCache.cacheSubPaths.length; ++var16) { // L: 103
				for (int var17 = 0; var17 < ArchiveLoader.cacheParentPaths.length; ++var17) { // L: 104
					File var18 = new File(ArchiveLoader.cacheParentPaths[var17] + JagexCache.cacheSubPaths[var16] + File.separatorChar + var0 + File.separatorChar); // L: 105
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
							break label153; // L: 127
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 133
			var4 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 134
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
				AccessFile var34 = new AccessFile(SecureRandomCallable.JagexCache_locationFile, "rw", 10000L); // L: 165
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-768574216"
	)
	public static String method4251(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class125.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-2101430297"
	)
	static int method4250(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1017
			var0 -= 1000; // L: 1018
			var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1019
		} else {
			var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1021
		}

		String var4 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 1022
		int[] var5 = null; // L: 1023
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1024
			int var6 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1025
			if (var6 > 0) { // L: 1026
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]) { // L: 1027 1028
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1030
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1032

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1033
			if (var4.charAt(var7 - 1) == 's') { // L: 1034
				var8[var7] = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1035
			}
		}

		var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1037
		if (var7 != -1) { // L: 1038
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1039
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1040
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1041
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1042
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1043
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1044
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1045
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1046
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1047
			var3.onVarTransmit = var8; // L: 1048
			var3.varTransmitTriggers = var5; // L: 1049
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1051
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1052
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1053
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1054
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1055
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1056
			var3.onInvTransmit = var8; // L: 1057
			var3.invTransmitTriggers = var5; // L: 1058
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1060
			var3.onStatTransmit = var8; // L: 1061
			var3.statTransmitTriggers = var5; // L: 1062
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1064
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1065
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1066
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1067
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1068
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1069
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1070
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1071
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1072
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1073
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1074
			var3.field3082 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1075
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1076
			var3.field3075 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1077
			var3.field3076 = var8;
		} else if (var0 == 1430) {
			var3.field3071 = var8; // L: 1078
		} else {
			if (var0 != 1431) { // L: 1079
				return 2; // L: 1080
			}

			var3.field3000 = var8;
		}

		var3.hasListener = true; // L: 1081
		return 1; // L: 1082
	}
}
