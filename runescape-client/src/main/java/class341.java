import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mf")
public class class341 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "6"
	)
	static int method6258(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				IsaacCipher.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				IsaacCipher.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = Language.method5825(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				IsaacCipher.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FloorOverlayDefinition.method3636(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				IsaacCipher.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class123.method2737(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				IsaacCipher.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				IsaacCipher.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3];
				var3 = class123.method2737(var3, var5, var6);
				var7 = WorldMapEvent.method4942(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = SoundCache.method833(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = GrandExchangeOfferNameComparator.method5727(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = class123.method2744(var3, var4);
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1492532048"
	)
	static final void method6257() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				ItemLayer.updateActorSequence(var3, 1);
			}
		}

	}
}
