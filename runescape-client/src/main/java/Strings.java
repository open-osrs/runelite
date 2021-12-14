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
		field3523 = "Please visit the support page for assistance.";
		field3562 = "Please visit the support page for assistance.";
		field3747 = "";
		field3551 = "Page has opened in a new window.";
		field3749 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnt;",
		garbageValue = "82"
	)
	static class369[] method5508() {
		return new class369[]{class369.field4220, class369.field4216, class369.field4215, class369.field4214};
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "504993723"
	)
	static int method5510(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field817.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				IsaacCipher.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class92 var6 = new class92(var5, var3, var4, ChatChannel.getWidget(var3).itemId);
					Interpreter.field817.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field815 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1018 = Interpreter.field815 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-151275200"
	)
	static final void method5509() {
		Client.field673 = Client.cycleCntr;
		class121.field1470 = true;
	}
}
