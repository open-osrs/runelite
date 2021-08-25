import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ml")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -831715971
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)I",
		garbageValue = "-1906046091"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lle;I)I",
		garbageValue = "-1041307648"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "117"
	)
	static int method6061(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class65.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = class65.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var5 = class65.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class65.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class65.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					var7 = class65.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					var7 = class65.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class65.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					var7 = class65.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					var7 = class65.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					UserComparator3.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = HealthBarUpdate.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						KeyHandler.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var4 = class65.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if (class7.foundItemIds != null && KeyHandler.foundItemIndex < HealthBarUpdate.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class7.foundItemIds[++KeyHandler.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "148563653"
	)
	public static int method6065(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lco;B)Z",
		garbageValue = "8"
	)
	static boolean method6063(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (class129.localPlayer == var0) {
			return class1.method9();
		} else {
			boolean var1 = ObjectSound.method1734();
			boolean var2;
			if (!var1) {
				var2 = (Client.drawPlayerNames & 1) != 0;
				var1 = var2 && var0.isFriend();
			}

			var2 = var1;
			if (!var1) {
				boolean var3 = (Client.drawPlayerNames & 2) != 0;
				var2 = var3 && var0.isFriendsChatMember();
			}

			return var2;
		}
	}
}
