import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kx")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -341474055
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("p")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-77"
	)
	static int method5588(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1084
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1085
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.x; // L: 1086
			return 1; // L: 1087
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1089
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.y; // L: 1090
			return 1; // L: 1091
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1093
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.width; // L: 1094
			return 1; // L: 1095
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1097
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.height; // L: 1098
			return 1; // L: 1099
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1101
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1102
			return 1; // L: 1103
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1105
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.parentId; // L: 1106
			return 1; // L: 1107
		} else {
			return 2; // L: 1109
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Ljava/lang/String;I)V",
		garbageValue = "-1653414496"
	)
	static void method5587(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 2153
		Client.archiveLoaders.add(var2); // L: 2154
		Client.field753 += var2.groupCount; // L: 2155
	} // L: 2156
}
