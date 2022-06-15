import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ie")
public class class238 {
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final class238 field2837;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final class238 field2836;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 406167623
	)
	@Export("value")
	final int value;

	static {
		field2837 = new class238(0); // L: 4
		field2836 = new class238(1); // L: 5
	}

	class238(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-43"
	)
	static int method5001(int var0, Script var1, boolean var2) {
		Widget var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1459
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1460
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var3)); // L: 1461
			return 1; // L: 1462
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1464
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1471
				if (var3.dataText == null) { // L: 1472
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1473
				}

				return 1; // L: 1474
			} else {
				return 2; // L: 1476
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1465
			--var4; // L: 1466
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1467
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1468
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1469
		}
	}
}
