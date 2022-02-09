import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("z")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		longValue = -228960610816436577L
	)
	static long field159;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -729054449
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 547455067
	)
	static int field157;
	@ObfuscatedName("c")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-41"
	)
	static int method371(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2124496518"
	)
	static final void method370(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 154
			for (int var4 = 0; var4 < 8; ++var4) { // L: 155
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 157
			for (var3 = 1; var3 < 8; ++var3) { // L: 158
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 160
			for (var3 = 1; var3 < 8; ++var3) { // L: 161
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 165
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 166

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1618787427"
	)
	public static void method365() {
		class434.SpriteBuffer_xOffsets = null; // L: 196
		class434.SpriteBuffer_yOffsets = null; // L: 197
		class434.SpriteBuffer_spriteWidths = null; // L: 198
		Fonts.SpriteBuffer_spriteHeights = null; // L: 199
		HealthBarUpdate.SpriteBuffer_spritePalette = null; // L: 200
		WorldMapLabelSize.SpriteBuffer_pixels = null; // L: 201
	} // L: 202

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "998938485"
	)
	static int method364(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1113
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1114
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1115
			return 1; // L: 1116
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1118
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1119
			return 1; // L: 1120
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1122
			Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.text; // L: 1123
			return 1; // L: 1124
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1126
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1127
			return 1; // L: 1128
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1130
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1131
			return 1; // L: 1132
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1134
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1135
			return 1; // L: 1136
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1138
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1139
			return 1; // L: 1140
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1142
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1143
			return 1; // L: 1144
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1146
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1147
			return 1; // L: 1148
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1150
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1151
			return 1; // L: 1152
		} else if (var0 == 1610) { // L: 1154
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1155
			return 1; // L: 1156
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1158
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1159
			return 1; // L: 1160
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1162
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1163
			return 1; // L: 1164
		} else if (var0 == 1613) { // L: 1166
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1167
			return 1; // L: 1168
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1170
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1171
			return 1; // L: 1172
		} else if (var0 != 1615 && var0 != 1616) { // L: 1174
			return 2; // L: 1178
		} else {
			++Interpreter.Interpreter_intStackSize; // L: 1175
			return 1; // L: 1176
		}
	}
}
