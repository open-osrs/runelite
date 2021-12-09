import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kl")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bq")
	public static String field3523;
	@ObfuscatedName("cz")
	public static String field3562;
	@ObfuscatedName("jb")
	public static String field3747;
	@ObfuscatedName("jm")
	public static String field3551;
	@ObfuscatedName("je")
	public static String field3749;

	static {
		field3523 = "Please visit the support page for assistance."; // L: 60
		field3562 = "Please visit the support page for assistance."; // L: 99
		field3747 = ""; // L: 284
		field3551 = "Page has opened in a new window."; // L: 285
		field3749 = "(Please check your popup blocker.)"; // L: 286
	} // L: 324

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnt;",
		garbageValue = "82"
	)
	static class369[] method5508() {
		return new class369[]{class369.field4220, class369.field4216, class369.field4215, class369.field4214}; // L: 16
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "504993723"
	)
	static int method5510(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1221
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1238
				var7 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1239
				var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1240
				if (var4 >= 1 && var4 <= 10) { // L: 1241
					class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId); // L: 1244
					Interpreter.field817.add(var8); // L: 1245
					return 1; // L: 1246
				} else {
					throw new RuntimeException(); // L: 1242
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1248
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 1249
				int var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 1250
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1251
				int var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 1252
				if (var5 >= 1 && var5 <= 10) { // L: 1253
					class92 var6 = new class92(var5, var3, var4, ChatChannel.getWidget(var3).itemId); // L: 1256
					Interpreter.field817.add(var6); // L: 1257
					return 1; // L: 1258
				} else {
					throw new RuntimeException(); // L: 1254
				}
			} else {
				return 2; // L: 1260
			}
		} else if (Interpreter.field815 >= 10) { // L: 1222
			throw new RuntimeException(); // L: 1223
		} else {
			if (var0 >= 2000) { // L: 1226
				var7 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1227
			} else {
				var7 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1229
			}

			if (var7.onResize == null) { // L: 1230
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1231
				var9.widget = var7; // L: 1232
				var9.args = var7.onResize; // L: 1233
				var9.field1018 = Interpreter.field815 + 1; // L: 1234
				Client.scriptEvents.addFirst(var9); // L: 1235
				return 1; // L: 1236
			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-151275200"
	)
	static final void method5509() {
		Client.field673 = Client.cycleCntr; // L: 12481
		class121.field1470 = true; // L: 12482
	} // L: 12483
}
