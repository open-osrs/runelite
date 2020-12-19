import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ic")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1725294085
	)
	public static int field3135;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1088922919
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5; // L: 18
	} // L: 19

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1020902177"
	)
	public static void method4185() {
		ParamDefinition.ParamDefinition_cached.clear(); // L: 72
	} // L: 73

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "211481230"
	)
	static int method4186(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 2794
			var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2795
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var6).name; // L: 2796
			return 1; // L: 2797
		} else {
			int var4;
			ItemDefinition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 2799
				VarcInt.Interpreter_intStackSize -= 2; // L: 2800
				var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2801
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2802
				var5 = SecureRandomCallable.ItemDefinition_get(var6); // L: 2803
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) { // L: 2804
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2805
				}

				return 1; // L: 2806
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 2808
				VarcInt.Interpreter_intStackSize -= 2; // L: 2809
				var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2810
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2811
				var5 = SecureRandomCallable.ItemDefinition_get(var6); // L: 2812
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 2813
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2814
				}

				return 1; // L: 2815
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 2817
				var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2818
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var6).price; // L: 2819
				return 1; // L: 2820
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 2822
				var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2823
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0; // L: 2824
				return 1; // L: 2825
			} else {
				ItemDefinition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 2827
					var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2828
					var7 = SecureRandomCallable.ItemDefinition_get(var6); // L: 2829
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 2830
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6; // L: 2831
					}

					return 1; // L: 2832
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 2834
					var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2835
					var7 = SecureRandomCallable.ItemDefinition_get(var6); // L: 2836
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 2837
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6; // L: 2838
					}

					return 1; // L: 2839
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 2841
					var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2842
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var6).isMembersOnly ? 1 : 0; // L: 2843
					return 1; // L: 2844
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 2846
					var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2847
					var7 = SecureRandomCallable.ItemDefinition_get(var6); // L: 2848
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 2849
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6; // L: 2850
					}

					return 1; // L: 2851
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 2853
					var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2854
					var7 = SecureRandomCallable.ItemDefinition_get(var6); // L: 2855
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 2856
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6; // L: 2857
					}

					return 1; // L: 2858
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 2860
					String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2861
					var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2862
					WorldMapSection1.findItemDefinitions(var3, var4 == 1); // L: 2863
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = PacketBufferNode.foundItemIdCount; // L: 2864
					return 1; // L: 2865
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 2867
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 2872
						NetCache.foundItemIndex = 0; // L: 2873
						return 1; // L: 2874
					} else {
						return 2; // L: 2876
					}
				} else {
					if (UrlRequest.foundItemIds != null && NetCache.foundItemIndex < PacketBufferNode.foundItemIdCount) { // L: 2868
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = UrlRequest.foundItemIds[++NetCache.foundItemIndex - 1] & '\uffff'; // L: 2869
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 2870
				}
			}
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lhe;B)Ljava/lang/String;",
		garbageValue = "-113"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var0)) == 0) { // L: 11063
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11064 11065 11067
		}
	}
}
