import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kh")
public class class290 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1384321322"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-1624974891"
	)
	static int method5389(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3821
			Client.logoutTimer = 250; // L: 3822
			return 1; // L: 3823
		} else if (var0 != 5631 && var0 != 5633) { // L: 3825
			if (var0 == 5632) { // L: 3829
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 26; // L: 3830
				return 1; // L: 3831
			} else {
				return 2; // L: 3833
			}
		} else {
			class9.Interpreter_stringStackSize -= 2; // L: 3826
			return 1; // L: 3827
		}
	}
}
