import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ip")
public class class239 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class239 field2869;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class239 field2867;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -424452145
	)
	final int field2868;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -814810489
	)
	final int field2870;

	static {
		field2869 = new class239(51, 27, 800, 0, 16, 16); // L: 33
		field2867 = new class239(25, 28, 800, 656, 40, 40); // L: 34
	}

	class239(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2868 = var5; // L: 39
		this.field2870 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1990766165"
	)
	public static String method4384(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = Messages.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 25
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-1329941723"
	)
	static int method4385(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3070
			var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3071
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class23.ItemDefinition_get(var6).name; // L: 3072
			return 1; // L: 3073
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3075
				class16.Interpreter_intStackSize -= 2; // L: 3076
				var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3077
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3078
				var5 = class23.ItemDefinition_get(var6); // L: 3079
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) { // L: 3080
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3081
				}

				return 1; // L: 3082
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3084
				class16.Interpreter_intStackSize -= 2; // L: 3085
				var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3086
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3087
				var5 = class23.ItemDefinition_get(var6); // L: 3088
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3089
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3090
				}

				return 1; // L: 3091
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3093
				var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3094
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var6).price; // L: 3095
				return 1; // L: 3096
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3098
				var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3099
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0; // L: 3100
				return 1; // L: 3101
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3103
					var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3104
					var7 = class23.ItemDefinition_get(var6); // L: 3105
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3106
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6; // L: 3107
					}

					return 1; // L: 3108
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3110
					var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3111
					var7 = class23.ItemDefinition_get(var6); // L: 3112
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3113
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6; // L: 3114
					}

					return 1; // L: 3115
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3117
					var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3118
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var6).isMembersOnly ? 1 : 0; // L: 3119
					return 1; // L: 3120
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3122
					var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3123
					var7 = class23.ItemDefinition_get(var6); // L: 3124
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3125
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6; // L: 3126
					}

					return 1; // L: 3127
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3129
					var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3130
					var7 = class23.ItemDefinition_get(var6); // L: 3131
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3132
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6; // L: 3133
					}

					return 1; // L: 3134
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3136
					String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3137
					var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3138
					WorldMapAreaData.findItemDefinitions(var3, var4 == 1); // L: 3139
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ItemLayer.foundItemIdCount; // L: 3140
					return 1; // L: 3141
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3143
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3148
						class203.foundItemIndex = 0; // L: 3149
						return 1; // L: 3150
					} else {
						return 2; // L: 3152
					}
				} else {
					if (class19.foundItemIds != null && class203.foundItemIndex < ItemLayer.foundItemIdCount) { // L: 3144
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.foundItemIds[++class203.foundItemIndex - 1] & '\uffff'; // L: 3145
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3146
				}
			}
		}
	}
}
