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
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "12877661"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1748869629"
	)
	static void method662(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lbw;Lbw;IZB)I",
		garbageValue = "-31"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1676() ? (var1.method1676() ? 0 : 1) : (var1.method1676() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1696() ? (var1.method1696() ? 0 : 1) : (var1.method1696() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
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
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			EnumComposition var10 = class119.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				EnumComposition var4 = class119.getEnum(var3);
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			IsaacCipher.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3];
			EnumComposition var7 = class119.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "682246596"
	)
	static void method664() {
		if (class340.localPlayer.x >> 7 == Client.destinationX && class340.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}
}
