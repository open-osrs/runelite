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
		field2387 = new class200();
		field2388 = new class200();
		field2389 = new class200();
	}

	class200() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V",
		garbageValue = "101"
	)
	public static void method3712(AbstractArchive var0) {
		VarbitDefinition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZS)I",
		garbageValue = "768"
	)
	static int method3711(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
			var4 = CollisionMap.getWidget(var3);
		} else {
			var4 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			VarcInt.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3];
			CollisionMap.invalidateWidget(var4);
			WorldMapIcon_0.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			VarcInt.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3];
			CollisionMap.invalidateWidget(var4);
			WorldMapIcon_0.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				CollisionMap.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
