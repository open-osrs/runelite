import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
public class class93 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lnf;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("localPlayer")
	static Player localPlayer;

	@ObfuscatedName("d")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 85
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "992004750"
	)
	static int method2080(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1350
			var5 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1351
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.itemId; // L: 1352
			return 1; // L: 1353
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1355
			var5 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1356
			if (var5.itemId != -1) { // L: 1357
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1358
			}

			return 1; // L: 1359
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1361
			int var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1362
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1363
			if (var4 != null) { // L: 1364
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1365
			}

			return 1; // L: 1366
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1368
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1369
			return 1; // L: 1370
		} else {
			return 2; // L: 1372
		}
	}
}
