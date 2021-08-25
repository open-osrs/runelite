import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aa")
public class class29 {
	@ObfuscatedName("n")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("c")
	public static String field172;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 1537440429
	)
	static int field177;

	static {
		applet = null;
		field172 = "";
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "924328645"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "18508"
	)
	static final int method422(int var0, int var1) {
		int var2 = Player.method2115(var0 - 1, var1 - 1) + Player.method2115(1 + var0, var1 - 1) + Player.method2115(var0 - 1, var1 + 1) + Player.method2115(1 + var0, var1 + 1);
		int var3 = Player.method2115(var0 - 1, var1) + Player.method2115(1 + var0, var1) + Player.method2115(var0, var1 - 1) + Player.method2115(var0, 1 + var1);
		int var4 = Player.method2115(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "1751539696"
	)
	static int method421(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			class240.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			EnumComposition var10 = KitDefinition.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				EnumComposition var4 = KitDefinition.getEnum(var3);
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			class240.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
			EnumComposition var7 = KitDefinition.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-1590607779"
	)
	static int method423(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						NPCComposition var4 = ScriptEvent.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
					return 1;
				}
			} else {
				--class240.Interpreter_intStackSize;
				return 1;
			}
		} else {
			class240.Interpreter_intStackSize -= 2;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}
}
