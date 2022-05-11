import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fk")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field2001(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1994(2, 2);

	@ObfuscatedName("t")
	static int[][][] field1993;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1914691403
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -156992359
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1009266230"
	)
	public static void method3446() {
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 547
	} // L: 548

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-27"
	)
	static int method3447(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1410
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1411
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.itemId; // L: 1412
			return 1; // L: 1413
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1415
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1416
			if (var3.itemId != -1) { // L: 1417
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1418
			}

			return 1; // L: 1419
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1421
			int var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1422
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1423
			if (var4 != null) { // L: 1424
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1425
			}

			return 1; // L: 1426
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1428
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1429
			return 1; // L: 1430
		} else if (var0 == 1707) { // L: 1432
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1433
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.method5498() ? 1 : 0; // L: 1434
			return 1; // L: 1435
		} else if (var0 == 1708) { // L: 1437
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1438
			return class293.method5430(var3); // L: 1439
		} else if (var0 == 1708) { // L: 1441
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1442
			return class20.method269(var3); // L: 1443
		} else {
			return 2; // L: 1445
		}
	}
}
