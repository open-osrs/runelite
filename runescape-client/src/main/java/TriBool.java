import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mu")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1397883931"
	)
	static int method6472(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = UserComparator6.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = UserComparator6.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var5 = UserComparator6.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = UserComparator6.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = UserComparator6.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					var7 = UserComparator6.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					var7 = UserComparator6.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = UserComparator6.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					var7 = UserComparator6.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					var7 = UserComparator6.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					StructComposition.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GraphicsDefaults.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class336.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var4 = UserComparator6.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if (class113.foundItemIds != null && class336.foundItemIndex < GraphicsDefaults.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class113.foundItemIds[++class336.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
