import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dk")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ap")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I",
		garbageValue = "-86339846"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "311319485"
	)
	public static int method2615(int var0) {
		return class121.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 77
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "64"
	)
	static int method2614(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 1101
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1102
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.x; // L: 1103
			return 1; // L: 1104
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1106
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.y; // L: 1107
			return 1; // L: 1108
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1110
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.width; // L: 1111
			return 1; // L: 1112
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1114
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.height; // L: 1115
			return 1; // L: 1116
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1118
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1119
			return 1; // L: 1120
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1122
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.parentId; // L: 1123
			return 1; // L: 1124
		} else {
			return 2; // L: 1126
		}
	}
}
