import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ck")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("l")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;I)I",
		garbageValue = "-1295595902"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "754804678"
	)
	public static final synchronized long method2406() {
		long var0 = System.currentTimeMillis();
		if (var0 < class397.field4283) {
			class247.field2919 += class397.field4283 - var0;
		}

		class397.field4283 = var0;
		return var0 + class247.field2919;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	public static void method2395() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(CLkn;B)I",
		garbageValue = "-97"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1403185658"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + MilliClock.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "5"
	)
	static int method2399(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = class87.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = class87.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = class87.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class87.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class87.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					var7 = class87.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					var7 = class87.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class87.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					var7 = class87.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					var7 = class87.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					WorldMapScaleHandler.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = WorldMapAreaData.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						GraphicsObject.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = class87.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if (ObjectComposition.foundItemIds != null && GraphicsObject.foundItemIndex < WorldMapAreaData.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ObjectComposition.foundItemIds[++GraphicsObject.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
