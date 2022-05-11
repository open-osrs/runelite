import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ec")
public class class138 extends class128 {
	@ObfuscatedName("hs")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1158452921
	)
	int field1629;
	@ObfuscatedName("q")
	String field1627;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class138(class131 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1629 = var1.readInt(); // L: 326
		this.field1627 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2900(this.field1629, this.field1627); // L: 331
	} // L: 332

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1258686923"
	)
	static int method2880(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1130
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1131
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1132
			return 1; // L: 1133
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1135
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1136
			return 1; // L: 1137
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1139
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.text; // L: 1140
			return 1; // L: 1141
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1143
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1144
			return 1; // L: 1145
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1147
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1148
			return 1; // L: 1149
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1151
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1152
			return 1; // L: 1153
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1155
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1156
			return 1; // L: 1157
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1159
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1160
			return 1; // L: 1161
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1163
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1164
			return 1; // L: 1165
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1167
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1168
			return 1; // L: 1169
		} else if (var0 == 1610) { // L: 1171
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1172
			return 1; // L: 1173
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1175
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.color; // L: 1176
			return 1; // L: 1177
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1179
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.color2; // L: 1180
			return 1; // L: 1181
		} else if (var0 == 1613) { // L: 1183
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1184
			return 1; // L: 1185
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1187
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1188
			return 1; // L: 1189
		} else if (var0 != 1615 && var0 != 1616) { // L: 1191
			return 2; // L: 1195
		} else {
			++class12.Interpreter_intStackSize; // L: 1192
			return 1; // L: 1193
		}
	}
}
