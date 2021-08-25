import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gc")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1475776637
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 840191733
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 856286721
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;B)V",
		garbageValue = "57"
	)
	public static void method3802(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-2119354055"
	)
	static int method3801(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			class240.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class240.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class240.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class240.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class240.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class240.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = HealthBar.method2205(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class240.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ObjectSound.method1731(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class240.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class10.method98(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class240.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				class240.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
				var3 = class10.method98(var3, var5, var6);
				var7 = class120.method2512(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1] = class262.method5001(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1] = class229.method4497(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = TriBool.method6080(var3, var4);
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}
}
