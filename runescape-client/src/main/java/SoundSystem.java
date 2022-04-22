import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ah")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ry")
	static boolean field309;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			Widget.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-862016780"
	)
	static byte[] method764(byte[] var0) {
		int var1 = var0.length; // L: 35
		byte[] var2 = new byte[var1]; // L: 36
		System.arraycopy(var0, 0, var2, 0, var1); // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1307267367"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 138
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "1"
	)
	static int method761(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1130
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1131
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1132
			return 1; // L: 1133
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1135
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1136
			return 1; // L: 1137
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1139
			Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.text; // L: 1140
			return 1; // L: 1141
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1143
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1144
			return 1; // L: 1145
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1147
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1148
			return 1; // L: 1149
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1151
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1152
			return 1; // L: 1153
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1155
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1156
			return 1; // L: 1157
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1159
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1160
			return 1; // L: 1161
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1163
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1164
			return 1; // L: 1165
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1167
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1168
			return 1; // L: 1169
		} else if (var0 == 1610) { // L: 1171
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1172
			return 1; // L: 1173
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1175
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1176
			return 1; // L: 1177
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1179
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1180
			return 1; // L: 1181
		} else if (var0 == 1613) { // L: 1183
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1184
			return 1; // L: 1185
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1187
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1188
			return 1; // L: 1189
		} else if (var0 != 1615 && var0 != 1616) { // L: 1191
			return 2; // L: 1195
		} else {
			++Interpreter.Interpreter_intStackSize; // L: 1192
			return 1; // L: 1193
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1540502347"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class29.scrollBarSprites[0].drawAt(var0, var1); // L: 10887
		class29.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10888
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field566); // L: 10889
		int var5 = var3 * (var3 - 32) / var4; // L: 10890
		if (var5 < 8) { // L: 10891
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10892
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field670); // L: 10893
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field740); // L: 10894
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field740); // L: 10895
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field740); // L: 10896
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field740); // L: 10897
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field694); // L: 10898
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field694); // L: 10899
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field694); // L: 10900
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field694); // L: 10901
	} // L: 10902
}
