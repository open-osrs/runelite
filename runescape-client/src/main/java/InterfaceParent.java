import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1985635931
	)
	static int field1043;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -1949636447
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 315980607
	)
	@Export("group")
	int group;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1762148949
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	boolean field1040;

	InterfaceParent() {
		this.field1040 = false; // L: 8
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "896944894"
	)
	public static int method2095(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 65
		int var1 = (int)(var2 >>> 7 & 127L); // L: 67
		return var1; // L: 69
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "1938605488"
	)
	static int method2097(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2332
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2333
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = SoundCache.method764(var3) ? 1 : 0; // L: 2334
			return 1; // L: 2335
		} else if (var0 == 3501) { // L: 2337
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2338
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = VertexNormal.method4528(var3) ? 1 : 0; // L: 2339
			return 1; // L: 2340
		} else if (var0 == 3502) { // L: 2342
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2343
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = SoundCache.method753(var3) ? 1 : 0; // L: 2344
			return 1; // L: 2345
		} else {
			return 2; // L: 2347
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class125.method2824(); // L: 8428
		Client.menuActions[0] = "Cancel"; // L: 8429
		Client.menuTargets[0] = ""; // L: 8430
		Client.menuOpcodes[0] = 1006; // L: 8431
		Client.menuShiftClick[0] = false; // L: 8432
		Client.menuOptionsCount = 1; // L: 8433
	} // L: 8434
}
