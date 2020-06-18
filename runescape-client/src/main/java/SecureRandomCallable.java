import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bm")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	static Widget field544;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1382936715
	)
	public static int field546;
	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	static Widget field542;

	SecureRandomCallable() {
	}

	public Object call() {
		return WorldMapIcon_1.method348();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1445802198"
	)
	static int method1203(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else if (var0 == ScriptOpcodes.INTERPOLATE) {
			UrlRequester.Interpreter_intStackSize -= 5;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 3];
			int var7 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 4];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
			return 1;
		} else if (var0 == ScriptOpcodes.ADDPERCENT) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
			return 1;
		} else if (var0 == ScriptOpcodes.SETBIT) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 | 1 << var4;
			return 1;
		} else if (var0 == ScriptOpcodes.CLEARBIT) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
			return 1;
		} else if (var0 == ScriptOpcodes.TESTBIT) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.MOD) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 % var4;
			return 1;
		} else if (var0 == ScriptOpcodes.POW) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.INVPOW) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				switch(var4) {
				case 0:
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
					break;
				case 1:
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3;
					break;
				case 2:
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
					break;
				case 3:
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
					break;
				case 4:
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
					break;
				default:
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
				}

				return 1;
			}
		} else if (var0 == ScriptOpcodes.AND) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 & var4;
			return 1;
		} else if (var0 == ScriptOpcodes.OR) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3 | var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SCALE) {
			UrlRequester.Interpreter_intStackSize -= 3;
			long var9 = (long)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			long var11 = (long)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			long var13 = (long)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		signature = "(Lby;IIB)V",
		garbageValue = "72"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = NetSocket.SequenceDefinition_get(var1).field3561;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1000 = 0;
			}

			if (var3 == 2) {
				var0.field1000 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || NetSocket.SequenceDefinition_get(var1).field3543 >= NetSocket.SequenceDefinition_get(var0.sequence).field3543) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1000 = 0;
			var0.field1023 = var0.pathLength;
		}

	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		signature = "(Lcu;III)V",
		garbageValue = "9999999"
	)
	static final void method1205(MenuAction var0, int var1, int var2) {
		WorldMapSection0.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2);
	}
}
