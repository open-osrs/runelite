import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gg")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1186041129
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1839266109
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 475209611
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1225057041
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-1800924378"
	)
	static int method4212(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1269
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1286
				var7 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1287
				var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1288
				if (var4 >= 1 && var4 <= 10) { // L: 1289
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId); // L: 1292
					Interpreter.field821.add(var8); // L: 1293
					return 1; // L: 1294
				} else {
					throw new RuntimeException(); // L: 1290
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1296
				class12.Interpreter_intStackSize -= 3; // L: 1297
				int var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 1298
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 1299
				int var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 1300
				if (var5 >= 1 && var5 <= 10) { // L: 1301
					class93 var6 = new class93(var5, var3, var4, class92.getWidget(var3).itemId); // L: 1304
					Interpreter.field821.add(var6); // L: 1305
					return 1; // L: 1306
				} else {
					throw new RuntimeException(); // L: 1302
				}
			} else {
				return 2; // L: 1308
			}
		} else if (Interpreter.field823 >= 10) { // L: 1270
			throw new RuntimeException(); // L: 1271
		} else {
			if (var0 >= 2000) { // L: 1274
				var7 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1275
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1277
			}

			if (var7.onResize == null) { // L: 1278
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1279
				var9.widget = var7; // L: 1280
				var9.args = var7.onResize; // L: 1281
				var9.field1054 = Interpreter.field823 + 1; // L: 1282
				Client.scriptEvents.addFirst(var9); // L: 1283
				return 1; // L: 1284
			}
		}
	}
}
