import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gp")
public class class200 {
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	static Widget[] field2390;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	static final class200 field2387;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	static final class200 field2388;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	static final class200 field2389;

	static {
		field2387 = new class200(); // L: 4
		field2388 = new class200(); // L: 5
		field2389 = new class200(); // L: 6
	}

	class200() {
	} // L: 8

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V",
		garbageValue = "101"
	)
	public static void method3712(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZS)I",
		garbageValue = "768"
	)
	static int method3711(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 499
		Widget var4;
		if (var0 >= 2000) { // L: 501
			var0 -= 1000; // L: 502
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 503
			var4 = CollisionMap.getWidget(var3); // L: 504
		} else {
			var4 = var2 ? PlayerComposition.field2561 : VarcInt.field3264; // L: 506
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 507
			VarcInt.Interpreter_intStackSize -= 4; // L: 508
			var4.rawX = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 509
			var4.rawY = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 510
			var4.xAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 511
			var4.yAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3]; // L: 512
			CollisionMap.invalidateWidget(var4); // L: 513
			WorldMapIcon_0.client.alignWidget(var4); // L: 514
			if (var3 != -1 && var4.type == 0) { // L: 515
				PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 516
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 518
			VarcInt.Interpreter_intStackSize -= 4; // L: 519
			var4.rawWidth = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 520
			var4.rawHeight = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 521
			var4.widthAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 522
			var4.heightAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3]; // L: 523
			CollisionMap.invalidateWidget(var4); // L: 524
			WorldMapIcon_0.client.alignWidget(var4); // L: 525
			if (var3 != -1 && var4.type == 0) { // L: 526
				PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 527
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 529
			boolean var5 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 530
			if (var5 != var4.isHidden) { // L: 531
				var4.isHidden = var5; // L: 532
				CollisionMap.invalidateWidget(var4); // L: 533
			}

			return 1; // L: 535
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 537
			var4.noClickThrough = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 538
			return 1; // L: 539
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 541
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 542
			return 1; // L: 543
		} else {
			return 2; // L: 545
		}
	}
}
