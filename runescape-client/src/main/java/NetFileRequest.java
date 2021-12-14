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
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-77"
	)
	static int method5588(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Ljava/lang/String;I)V",
		garbageValue = "-1653414496"
	)
	static void method5587(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field753 += var2.groupCount;
	}
}
