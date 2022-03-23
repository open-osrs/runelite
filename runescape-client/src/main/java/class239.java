import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class239 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class239 field2823;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class239 field2819;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1289934013
	)
	@Export("value")
	final int value;

	static {
		field2823 = new class239(0); // L: 4
		field2819 = new class239(1); // L: 5
	}

	class239(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1230087081"
	)
	public static boolean method4998(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 33
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1849384967"
	)
	static int method4999(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4592
			++class295.Interpreter_intStackSize; // L: 4593
			return 1; // L: 4594
		} else if (var0 == 7101) { // L: 4596
			ChatChannel.Interpreter_stringStackSize += 2; // L: 4597
			return 1; // L: 4598
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4600
			if (var0 == 7106) { // L: 4604
				++class295.Interpreter_intStackSize; // L: 4605
				return 1; // L: 4606
			} else if (var0 == 7107) { // L: 4608
				++class295.Interpreter_intStackSize; // L: 4609
				return 1; // L: 4610
			} else if (var0 == 7108) { // L: 4612
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class230.method4890() ? 1 : 0; // L: 4613
				return 1; // L: 4614
			} else if (var0 == 7110) { // L: 4616
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4617
				return 1; // L: 4618
			} else if (var0 == 7120) { // L: 4620
				--class295.Interpreter_intStackSize; // L: 4621
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4622
				return 1; // L: 4623
			} else if (var0 == 7121) { // L: 4625
				class295.Interpreter_intStackSize -= 2; // L: 4626
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4627
				return 1; // L: 4628
			} else if (var0 == 7122) { // L: 4630
				class295.Interpreter_intStackSize -= 2; // L: 4631
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4632
				return 1; // L: 4633
			} else {
				return 2; // L: 4635
			}
		} else {
			++class295.Interpreter_intStackSize; // L: 4601
			return 1; // L: 4602
		}
	}
}
