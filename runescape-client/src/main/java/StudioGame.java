import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ko")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static GameBuild field3456;
	@ObfuscatedName("j")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2093064869
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1621243431"
	)
	static int method5500(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3056
			var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3057
			var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3058
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3059
			return 1; // L: 3060
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3062
				class13.Interpreter_stringStackSize -= 2; // L: 3063
				var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 3064
				var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 3065
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3066
				return 1; // L: 3067
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3069
				var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3070
				var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3071
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + ByteArrayPool.intToString(var9, true); // L: 3072
				return 1; // L: 3073
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3075
				var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3076
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3077
				return 1; // L: 3078
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3080
					var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3081
					long var13 = 86400000L * (11745L + (long)var10); // L: 3082
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3083
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3084
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3085
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3086
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3087
					return 1; // L: 3088
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3090
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3098
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3099
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3100
						return 1; // L: 3101
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3103
						class13.Interpreter_stringStackSize -= 2; // L: 3104
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class194.method3926(class144.compareStrings(Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1], ScriptFrame.clientLanguage)); // L: 3105
						return 1; // L: 3106
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3108
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3109
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3110
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3111
							var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3112
							var11 = class1.archive13.takeFile(var5, 0); // L: 3113
							var12 = new Font(var11); // L: 3114
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3115
							return 1; // L: 3116
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3118
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3119
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3120
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3121
							var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3122
							var11 = class1.archive13.takeFile(var5, 0); // L: 3123
							var12 = new Font(var11); // L: 3124
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3125
							return 1; // L: 3126
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3128
							class13.Interpreter_stringStackSize -= 2; // L: 3129
							var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 3130
							var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 3131
							if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) { // L: 3132
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4; // L: 3133
							}

							return 1; // L: 3134
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3136
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3137
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3138
							return 1; // L: 3139
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3141
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3142
							var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3143
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3144
							return 1; // L: 3145
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3147
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3148
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = AbstractWorldMapData.isCharPrintable((char)var10) ? 1 : 0; // L: 3149
							return 1; // L: 3150
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3152
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3153
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapIcon_0.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3154
							return 1; // L: 3155
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3157
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3158
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = HealthBarDefinition.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3159
							return 1; // L: 3160
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3162
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3163
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class277.isDigit((char)var10) ? 1 : 0; // L: 3164
							return 1; // L: 3165
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3167
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3168
							if (var3 != null) { // L: 3169
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3170
							}

							return 1; // L: 3171
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3173
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3174
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3175
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3176
							var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3177
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3178
							return 1; // L: 3179
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3181
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3182
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3183
							boolean var16 = false; // L: 3184

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3185
								char var7 = var3.charAt(var6); // L: 3186
								if (var7 == '<') { // L: 3187
									var16 = true;
								} else if (var7 == '>') { // L: 3188
									var16 = false;
								} else if (!var16) { // L: 3189
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3191
							return 1; // L: 3192
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3194
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3195
							var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3196
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3197
							return 1; // L: 3198
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3200
							class13.Interpreter_stringStackSize -= 2; // L: 3201
							var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 3202
							var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 3203
							var5 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3204
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3205
							return 1; // L: 3206
						} else if (var0 == 4122) { // L: 3208
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3209
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3210
							return 1; // L: 3211
						} else {
							return 2; // L: 3213
						}
					}
				} else {
					class13.Interpreter_stringStackSize -= 2; // L: 3091
					var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 3092
					var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 3093
					if (class340.localPlayer.appearance != null && class340.localPlayer.appearance.isFemale) { // L: 3094
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3; // L: 3095
					}

					return 1; // L: 3096
				}
			}
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)Z",
		garbageValue = "1540402679"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12577
	}
}
