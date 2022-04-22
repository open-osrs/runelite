import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kw")
public enum class296 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3493(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3491(1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3490(2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3492(3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3494(4);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	static IndexedSprite field3496;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1277728875
	)
	final int field3495;

	class296(int var3) {
		this.field3495 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3495; // L: 18
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1938318651"
	)
	static int method5749(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1101
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1102
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1103
			return 1; // L: 1104
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1106
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1107
			return 1; // L: 1108
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1110
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1111
			return 1; // L: 1112
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1114
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1115
			return 1; // L: 1116
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1118
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1119
			return 1; // L: 1120
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1122
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1123
			return 1; // L: 1124
		} else {
			return 2; // L: 1126
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Laf;I)V",
		garbageValue = "1364149382"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 268
		}

	} // L: 269
}
