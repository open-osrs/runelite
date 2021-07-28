import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		longValue = 6362986280713500467L
	)
	static long field2066;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1221403027
	)
	@Export("width")
	int width;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1042567567
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1743568477
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 737503149
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfx;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1440200962"
	)
	public static int method3644(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1249174439"
	)
	static boolean method3643(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1409868397"
	)
	static int method3645(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++Interpreter.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			class1.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++Interpreter.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++Interpreter.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ModeWhere.method5252() ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--Interpreter.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				Interpreter.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				Interpreter.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++Interpreter.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1832697259"
	)
	static void method3646(int var0) {
		Client.oculusOrbState = var0;
	}
}
