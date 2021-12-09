import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("av")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 928910033
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2055812563
	)
	@Export("size")
	int size;
	@ObfuscatedName("p")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("t")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("s")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("j")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("w")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "12877661"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1748869629"
	)
	static void method662(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lbw;Lbw;IZB)I",
		garbageValue = "-31"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1676() ? (var1.method1676() ? 0 : 1) : (var1.method1676() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1696() ? (var1.method1696() ? 0 : 1) : (var1.method1696() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "23177696"
	)
	static int method663(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2059
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 2060
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2061
			var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2062
			EnumComposition var10 = class119.getEnum(var3); // L: 2063
			if (var10.outputType != 's') { // L: 2064
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2065
				if (var9 == var10.keys[var6]) { // L: 2066
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2067
					var10 = null; // L: 2068
					break;
				}
			}

			if (var10 != null) { // L: 2072
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2073
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2075
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2101
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2102
				EnumComposition var4 = class119.getEnum(var3); // L: 2103
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.size(); // L: 2104
				return 1; // L: 2105
			} else {
				return 2; // L: 2107
			}
		} else {
			IsaacCipher.Interpreter_intStackSize -= 4; // L: 2076
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2077
			var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2078
			int var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 2079
			var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3]; // L: 2080
			EnumComposition var7 = class119.getEnum(var5); // L: 2081
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2082
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2087
					if (var6 == var7.keys[var8]) { // L: 2088
						if (var9 == 115) { // L: 2089
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2090
						}

						var7 = null; // L: 2091
						break;
					}
				}

				if (var7 != null) { // L: 2095
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.defaultStr; // L: 2096
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2097
					}
				}

				return 1; // L: 2099
			} else {
				if (var9 == 115) { // L: 2083
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2084
				}

				return 1; // L: 2085
			}
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "682246596"
	)
	static void method664() {
		if (class340.localPlayer.x >> 7 == Client.destinationX && class340.localPlayer.y >> 7 == Client.destinationY) { // L: 5435
			Client.destinationX = 0; // L: 5436
		}

	} // L: 5438
}
