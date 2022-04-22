import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public class class356 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -29527757
	)
	static int field4185;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1300878569"
	)
	static int method6582(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2322
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2323
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.method5187(var3) ? 1 : 0; // L: 2324
			return 1; // L: 2325
		} else if (var0 == 3501) { // L: 2327
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2328
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1130(var3) ? 1 : 0; // L: 2329
			return 1; // L: 2330
		} else if (var0 == 3502) { // L: 2332
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2333
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1138(var3) ? 1 : 0; // L: 2334
			return 1; // L: 2335
		} else {
			return 2; // L: 2337
		}
	}
}
