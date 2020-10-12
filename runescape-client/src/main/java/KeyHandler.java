import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cu")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cc")
	public static int[] field409;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1174776797
	)
	public static int field417;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1365142337
	)
	public static int field418;
	@ObfuscatedName("cd")
	static char[] field419;
	@ObfuscatedName("cx")
	static int[] field420;
	@ObfuscatedName("cp")
	public static int[] field421;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 371324485
	)
	public static int field422;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1473086325
	)
	public static int field423;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 2078161479
	)
	public static int field424;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1475693687
	)
	public static int field399;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -2101231775
	)
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("cy")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = -5651230833669824683L
	)
	static long field428;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 13
		KeyHandler_pressedKeys = new boolean[112]; // L: 100
		field409 = new int[128]; // L: 103
		field417 = 0; // L: 104
		field418 = 0; // L: 105
		field419 = new char[128]; // L: 106
		field420 = new int[128]; // L: 107
		field421 = new int[128]; // L: 108
		field422 = 0; // L: 109
		field423 = 0; // L: 110
		field424 = 0; // L: 111
		field399 = 0; // L: 112
		KeyHandler_idleCycles = 0; // L: 113
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 114
	}

	KeyHandler() {
	} // L: 116

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 178
			int var2 = var1.getKeyCode(); // L: 179
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 180
				var2 = KeyHandler_keyCodes[var2]; // L: 181
				if ((var2 & 128) != 0) { // L: 182
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 184
			}

			if (field418 >= 0 && var2 >= 0) { // L: 185
				field409[field418] = var2; // L: 186
				field418 = field418 + 1 & 127; // L: 187
				if (field418 == field417) { // L: 188
					field418 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 190
				var3 = field424 + 1 & 127; // L: 191
				if (var3 != field423) { // L: 192
					field420[field424] = var2; // L: 193
					field419[field424] = 0; // L: 194
					field424 = var3; // L: 195
				}
			}

			var3 = var1.getModifiers(); // L: 198
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 199
				var1.consume(); // L: 200
			}
		}

	} // L: 203

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 206
			int var2 = var1.getKeyCode(); // L: 207
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 208
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 209
			}

			if (field418 >= 0 && var2 >= 0) { // L: 210
				field409[field418] = ~var2; // L: 211
				field418 = field418 + 1 & 127; // L: 212
				if (field417 == field418) { // L: 213
					field418 = -1;
				}
			}
		}

		var1.consume(); // L: 216
	} // L: 217

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 220
			char var2 = var1.getKeyChar(); // L: 221
			if (var2 != 0 && var2 != '\uffff' && ClanMate.method5146(var2)) { // L: 222
				int var3 = field424 + 1 & 127; // L: 223
				if (var3 != field423) { // L: 224
					field420[field424] = -1; // L: 225
					field419[field424] = var2; // L: 226
					field424 = var3; // L: 227
				}
			}
		}

		var1.consume(); // L: 231
	} // L: 232

	public final void focusGained(FocusEvent var1) {
	} // L: 234

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 237
			field418 = -1; // L: 238
		}

	} // L: 240

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZS)I",
		garbageValue = "20933"
	)
	static int method888(int var0, Script var1, boolean var2) {
		Widget var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1165
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1166
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1167
			return 1; // L: 1168
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1170
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1171
			return 1; // L: 1172
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1174
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1175
			return 1; // L: 1176
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1178
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1179
			return 1; // L: 1180
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1182
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1183
			return 1; // L: 1184
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1186
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1187
			return 1; // L: 1188
		} else {
			return 2; // L: 1190
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-2116995396"
	)
	static int method890(int var0, Script var1, boolean var2) {
		Widget var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1194
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1195
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1196
			return 1; // L: 1197
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1199
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1200
			return 1; // L: 1201
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1203
			Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.text; // L: 1204
			return 1; // L: 1205
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1207
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1208
			return 1; // L: 1209
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1211
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1212
			return 1; // L: 1213
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1215
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1216
			return 1; // L: 1217
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1219
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1220
			return 1; // L: 1221
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1223
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1224
			return 1; // L: 1225
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1227
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1228
			return 1; // L: 1229
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) { // L: 1231
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1232
			return 1; // L: 1233
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) { // L: 1235
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1236
			return 1; // L: 1237
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1239
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1240
			return 1; // L: 1241
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1243
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1244
			return 1; // L: 1245
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) { // L: 1247
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1248
			return 1; // L: 1249
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1251
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1252
			return 1; // L: 1253
		} else {
			return 2; // L: 1255
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "([Lhq;IIIZI)V",
		garbageValue = "102322570"
	)
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 9227
			Widget var6 = var0[var5]; // L: 9228
			if (var6 != null && var6.parentId == var1) { // L: 9229 9230
				MouseRecorder.alignWidgetSize(var6, var2, var3, var4); // L: 9231
				DirectByteArrayCopier.alignWidgetPosition(var6, var2, var3); // L: 9232
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 9233
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 9234
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 9235
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 9236
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 9237
					class4.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 9239
}
