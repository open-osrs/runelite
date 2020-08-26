import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ig")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1337486671
	)
	@Export("type")
	int type;
	@ObfuscatedName("k")
	@Export("data")
	byte[] data;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1294779949"
	)
	public static void method4233() {
		StructDefinition.StructDefinition_cached.clear(); // L: 71
	} // L: 72

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1420745273"
	)
	static int method4231(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 2736
			var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2737
			Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6).name; // L: 2738
			return 1; // L: 2739
		} else {
			int var4;
			ItemDefinition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 2741
				Interpreter.Interpreter_intStackSize -= 2; // L: 2742
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2743
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2744
				var5 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6); // L: 2745
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) { // L: 2746
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2747
				}

				return 1; // L: 2748
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 2750
				Interpreter.Interpreter_intStackSize -= 2; // L: 2751
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2752
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2753
				var5 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6); // L: 2754
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 2755
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2756
				}

				return 1; // L: 2757
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 2759
				var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2760
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6).price; // L: 2761
				return 1; // L: 2762
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 2764
				var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2765
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0; // L: 2766
				return 1; // L: 2767
			} else {
				ItemDefinition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 2769
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2770
					var7 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6); // L: 2771
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 2772
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2773
					}

					return 1; // L: 2774
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 2776
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2777
					var7 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6); // L: 2778
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 2779
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2780
					}

					return 1; // L: 2781
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 2783
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2784
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6).isMembersOnly ? 1 : 0; // L: 2785
					return 1; // L: 2786
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 2788
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2789
					var7 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6); // L: 2790
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 2791
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2792
					}

					return 1; // L: 2793
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 2795
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2796
					var7 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6); // L: 2797
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 2798
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2799
					}

					return 1; // L: 2800
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 2802
					String var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2803
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2804
					findItemDefinitions(var3, var4 == 1); // L: 2805
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class204.foundItemIdCount; // L: 2806
					return 1; // L: 2807
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 2809
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 2814
						ScriptEvent.foundItemIndex = 0; // L: 2815
						return 1; // L: 2816
					} else {
						return 2; // L: 2818
					}
				} else {
					if (Messages.foundItemIds != null && ScriptEvent.foundItemIndex < class204.foundItemIdCount) { // L: 2810
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Messages.foundItemIds[++ScriptEvent.foundItemIndex - 1] & '\uffff'; // L: 2811
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 2812
				}
			}
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1075762777"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 10783
		short[] var2 = new short[16]; // L: 10784
		int var3 = 0; // L: 10785

		for (int var4 = 0; var4 < class227.ItemDefinition_fileCount; ++var4) { // L: 10786
			ItemDefinition var9 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var4); // L: 10787
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 10788 10789 10790
				if (var3 >= 250) { // L: 10791
					class204.foundItemIdCount = -1; // L: 10792
					Messages.foundItemIds = null; // L: 10793
					return; // L: 10794
				}

				if (var3 >= var2.length) { // L: 10796
					short[] var6 = new short[var2.length * 2]; // L: 10797

					for (int var7 = 0; var7 < var3; ++var7) { // L: 10798
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 10799
				}

				var2[var3++] = (short)var4; // L: 10801
			}
		}

		Messages.foundItemIds = var2; // L: 10803
		ScriptEvent.foundItemIndex = 0; // L: 10804
		class204.foundItemIdCount = var3; // L: 10805
		String[] var8 = new String[class204.foundItemIdCount]; // L: 10806

		for (int var5 = 0; var5 < class204.foundItemIdCount; ++var5) { // L: 10807
			var8[var5] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = Messages.foundItemIds; // L: 10808
		class69.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 10810
	} // L: 10812
}
