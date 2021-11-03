import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -323406049
	)
	@Export("group")
	int group;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -951908341
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	boolean field1011;

	InterfaceParent() {
		this.field1011 = false; // L: 8
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZS)I",
		garbageValue = "16109"
	)
	static int method2079(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1224
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1241
				var7 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 1242
				var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1243
				if (var4 >= 1 && var4 <= 10) { // L: 1244
					class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId); // L: 1247
					Interpreter.field797.add(var8); // L: 1248
					return 1; // L: 1249
				} else {
					throw new RuntimeException(); // L: 1245
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1251
				class14.Interpreter_intStackSize -= 3; // L: 1252
				int var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 1253
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1254
				int var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 1255
				if (var5 >= 1 && var5 <= 10) { // L: 1256
					class92 var6 = new class92(var5, var3, var4, UserComparator9.getWidget(var3).itemId); // L: 1259
					Interpreter.field797.add(var6); // L: 1260
					return 1; // L: 1261
				} else {
					throw new RuntimeException(); // L: 1257
				}
			} else {
				return 2; // L: 1263
			}
		} else if (Interpreter.field798 >= 10) { // L: 1225
			throw new RuntimeException(); // L: 1226
		} else {
			if (var0 >= 2000) { // L: 1229
				var7 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 1230
			} else {
				var7 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 1232
			}

			if (var7.onResize == null) { // L: 1233
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1234
				var9.widget = var7; // L: 1235
				var9.args = var7.onResize; // L: 1236
				var9.field1024 = Interpreter.field798 + 1; // L: 1237
				Client.scriptEvents.addFirst(var9); // L: 1238
				return 1; // L: 1239
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1428422935"
	)
	static boolean method2080(int var0) {
		for (int var1 = 0; var1 < Client.field695; ++var1) { // L: 11114
			if (Client.field697[var1] == var0) { // L: 11115
				return true;
			}
		}

		return false; // L: 11117
	}
}
