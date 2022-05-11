import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class182 extends DualNode {
	@ObfuscatedName("ud")
	@Export("foundItemIds")
	static short[] foundItemIds;

	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1933917063"
	)
	static int method3473(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2697
			if (var0 == 3702) { // L: 2702
				++class12.Interpreter_intStackSize; // L: 2703
				return 1; // L: 2704
			} else {
				return 2; // L: 2706
			}
		} else {
			--class12.Interpreter_intStackSize; // L: 2698
			--class9.Interpreter_stringStackSize; // L: 2699
			return 1; // L: 2700
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1317447781"
	)
	static int method3472(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4639
			class12.Interpreter_intStackSize -= 5; // L: 4640
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4641
			return 1; // L: 4642
		} else if (var0 == 7204) { // L: 4644
			class12.Interpreter_intStackSize -= 6; // L: 4645
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4646
			return 1; // L: 4647
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4649
			Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = -1; // L: 4650
			return 1; // L: 4651
		} else if (var0 == 7209) { // L: 4653
			class12.Interpreter_intStackSize -= 2; // L: 4654
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4655
			return 1; // L: 4656
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4658
			--class12.Interpreter_intStackSize; // L: 4659
			return 1; // L: 4660
		} else if (var0 == 7214) { // L: 4662
			class12.Interpreter_intStackSize -= 2; // L: 4663
			return 1; // L: 4664
		} else {
			return 2; // L: 4666
		}
	}
}
