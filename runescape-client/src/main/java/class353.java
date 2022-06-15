import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mc")
public class class353 {
	@ObfuscatedName("ay")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "-221200866"
	)
	public static void method6507(String[] var0, int[] var1) {
		method6505(var0, var1, 0, var0.length - 1); // L: 39
	} // L: 40

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "81"
	)
	static void method6505(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 43
			int var4 = (var3 + var2) / 2; // L: 44
			int var5 = var2; // L: 45
			String var6 = var0[var4]; // L: 46
			var0[var4] = var0[var3]; // L: 47
			var0[var3] = var6; // L: 48
			int var7 = var1[var4]; // L: 49
			var1[var4] = var1[var3]; // L: 50
			var1[var3] = var7; // L: 51

			for (int var8 = var2; var8 < var3; ++var8) { // L: 52
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 53
					String var9 = var0[var8]; // L: 54
					var0[var8] = var0[var5]; // L: 55
					var0[var5] = var9; // L: 56
					int var10 = var1[var8]; // L: 57
					var1[var8] = var1[var5]; // L: 58
					var1[var5++] = var10; // L: 59
				}
			}

			var0[var3] = var0[var5]; // L: 63
			var0[var5] = var6; // L: 64
			var1[var3] = var1[var5]; // L: 65
			var1[var5] = var7; // L: 66
			method6505(var0, var1, var2, var5 - 1); // L: 67
			method6505(var0, var1, var5 + 1, var3); // L: 68
		}

	} // L: 70

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-2096074968"
	)
	static int method6506(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1420
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1421
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.itemId; // L: 1422
			return 1; // L: 1423
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1425
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1426
			if (var3.itemId != -1) { // L: 1427
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1428
			}

			return 1; // L: 1429
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1431
			int var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1432
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1433
			if (var4 != null) { // L: 1434
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1435
			}

			return 1; // L: 1436
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1438
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1439
			return 1; // L: 1440
		} else if (var0 == 2707) { // L: 1442
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1443
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.method5680() ? 1 : 0; // L: 1444
			return 1; // L: 1445
		} else if (var0 == 2708) { // L: 1447
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1448
			return class29.method363(var3); // L: 1449
		} else if (var0 == 2709) { // L: 1451
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1452
			return WorldMapSection0.method4947(var3); // L: 1453
		} else {
			return 2; // L: 1455
		}
	}
}
