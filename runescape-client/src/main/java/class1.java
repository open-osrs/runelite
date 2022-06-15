import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("v")
public class class1 implements Callable {
	@ObfuscatedName("u")
	static int[][][] field2;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static Widget field4;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	final Buffer field1;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class3 field3;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lw;Lqt;Lf;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field1 = var2; // L: 48
		this.field3 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field3.vmethod10(this.field1); // L: 54
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZS)I",
		garbageValue = "-15642"
	)
	static int method7(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 1140
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1141
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1142
			return 1; // L: 1143
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1145
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1146
			return 1; // L: 1147
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1149
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1150
			return 1; // L: 1151
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1153
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1154
			return 1; // L: 1155
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1157
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1158
			return 1; // L: 1159
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1161
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1162
			return 1; // L: 1163
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1165
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1166
			return 1; // L: 1167
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1169
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1170
			return 1; // L: 1171
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1173
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1174
			return 1; // L: 1175
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1177
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1178
			return 1; // L: 1179
		} else if (var0 == 1610) { // L: 1181
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1182
			return 1; // L: 1183
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1185
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.color; // L: 1186
			return 1; // L: 1187
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1189
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.color2; // L: 1190
			return 1; // L: 1191
		} else if (var0 == 1613) { // L: 1193
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1194
			return 1; // L: 1195
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1197
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1198
			return 1; // L: 1199
		} else if (var0 != 1615 && var0 != 1616) { // L: 1201
			return 2; // L: 1205
		} else {
			++class446.Interpreter_intStackSize; // L: 1202
			return 1; // L: 1203
		}
	}
}
