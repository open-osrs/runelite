import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lb")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Llb;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static Archive field4098;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1785071379
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("w")
	final String field4099;
	@ObfuscatedName("y")
	@Export("language")
	final String language;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2039584121
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4106, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4106, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4106, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4106, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4105, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4105, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4106, 6, "MX"); // L: 18
		Language[] var0 = method6069(); // L: 25
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3; // L: 35
		}

	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llz;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4099 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2051641160"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbi;",
		garbageValue = "32"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class267.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class344.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Llb;",
		garbageValue = "65"
	)
	static Language[] method6069() {
		return new Language[]{Language_NL, Language_ES, Language_ES_MX, Language_DE, Language_FR, Language_EN, Language_PT}; // L: 42
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Laz;B)V",
		garbageValue = "3"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 270
		if (var0.sound != null) { // L: 271
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 272
		}

	} // L: 273

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-364353679"
	)
	static int method6068(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3049
			class446.Interpreter_intStackSize -= 2; // L: 3050
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3051
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3052
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 + var4; // L: 3053
			return 1; // L: 3054
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3056
			class446.Interpreter_intStackSize -= 2; // L: 3057
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3058
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3059
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 - var4; // L: 3060
			return 1; // L: 3061
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3063
			class446.Interpreter_intStackSize -= 2; // L: 3064
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3065
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3066
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4 * var3; // L: 3067
			return 1; // L: 3068
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3070
			class446.Interpreter_intStackSize -= 2; // L: 3071
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3072
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3073
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 / var4; // L: 3074
			return 1; // L: 3075
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3077
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3078
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3079
			return 1; // L: 3080
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3082
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3083
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3084
			return 1; // L: 3085
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3087
				class446.Interpreter_intStackSize -= 5; // L: 3088
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3089
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3090
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3091
				var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3]; // L: 3092
				var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 4]; // L: 3093
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5); // L: 3094
				return 1; // L: 3095
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3097
				class446.Interpreter_intStackSize -= 2; // L: 3098
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3099
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3100
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100; // L: 3101
				return 1; // L: 3102
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3104
				class446.Interpreter_intStackSize -= 2; // L: 3105
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3106
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3107
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3108
				return 1; // L: 3109
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3111
				class446.Interpreter_intStackSize -= 2; // L: 3112
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3113
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3114
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3115
				return 1; // L: 3116
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3118
				class446.Interpreter_intStackSize -= 2; // L: 3119
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3120
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3121
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3122
				return 1; // L: 3123
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3125
				class446.Interpreter_intStackSize -= 2; // L: 3126
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3127
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3128
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 % var4; // L: 3129
				return 1; // L: 3130
			} else if (var0 == ScriptOpcodes.POW) { // L: 3132
				class446.Interpreter_intStackSize -= 2; // L: 3133
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3134
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3135
				if (var3 == 0) { // L: 3136
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3137
				}

				return 1; // L: 3138
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3140
				class446.Interpreter_intStackSize -= 2; // L: 3141
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3142
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3143
				if (var3 == 0) { // L: 3144
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3145
					return 1; // L: 3146
				} else {
					switch(var4) { // L: 3148
					case 0:
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3161
						break; // L: 3162
					case 1:
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3; // L: 3151
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3156
						break; // L: 3157
					case 3:
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3176
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3166
						break; // L: 3167
					default:
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3171
					}

					return 1; // L: 3180
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3182
				class446.Interpreter_intStackSize -= 2; // L: 3183
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3184
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3185
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 & var4; // L: 3186
				return 1; // L: 3187
			} else if (var0 == ScriptOpcodes.OR) { // L: 3189
				class446.Interpreter_intStackSize -= 2; // L: 3190
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3191
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3192
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 | var4; // L: 3193
				return 1; // L: 3194
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3196
				class446.Interpreter_intStackSize -= 3; // L: 3197
				long var9 = (long)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3198
				long var11 = (long)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3199
				long var13 = (long)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3200
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11); // L: 3201
				return 1; // L: 3202
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3204
				var3 = class269.method5223(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 3205
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3; // L: 3206
				return 1; // L: 3207
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3209
				class446.Interpreter_intStackSize -= 2; // L: 3210
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3211
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3212
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3213
				return 1; // L: 3214
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3216
				class446.Interpreter_intStackSize -= 3; // L: 3217
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3218
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3219
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3220
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class17.method232(var3, var4, var5); // L: 3221
				return 1; // L: 3222
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3224
				class446.Interpreter_intStackSize -= 3; // L: 3225
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3226
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3227
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3228
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class137.method2931(var3, var4, var5); // L: 3229
				return 1; // L: 3230
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3232
				class446.Interpreter_intStackSize -= 3; // L: 3233
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3234
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3235
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3236
				var6 = 31 - var5; // L: 3237
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 3238
				return 1; // L: 3239
			} else if (var0 == 4030) { // L: 3241
				class446.Interpreter_intStackSize -= 4; // L: 3242
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3243
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3244
				var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3245
				var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3]; // L: 3246
				var3 = class137.method2931(var3, var5, var6); // L: 3247
				var7 = VarpDefinition.method3374(var6 - var5 + 1); // L: 3248
				if (var4 > var7) { // L: 3249
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3250
				return 1; // L: 3251
			} else if (var0 == 4032) { // L: 3253
				Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = ClanMate.method6650(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]); // L: 3254
				return 1; // L: 3255
			} else if (var0 == 4033) { // L: 3257
				Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = class155.method3194(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]); // L: 3258
				return 1; // L: 3259
			} else if (var0 == 4034) { // L: 3261
				class446.Interpreter_intStackSize -= 2; // L: 3262
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3263
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3264
				var5 = class136.method2923(var3, var4); // L: 3265
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5; // L: 3266
				return 1; // L: 3267
			} else if (var0 == 4035) { // L: 3269
				Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]); // L: 3270
				return 1; // L: 3271
			} else {
				return 2; // L: 3273
			}
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1931091160"
	)
	static boolean method6070() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4949
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcq;",
		garbageValue = "-781279476"
	)
	static final InterfaceParent method6063(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11994
		var3.group = var1; // L: 11995
		var3.type = var2; // L: 11996
		Client.interfaceParents.put(var3, (long)var0); // L: 11997
		class17.Widget_resetModelFrames(var1); // L: 11998
		Widget var4 = class140.getWidget(var0); // L: 11999
		ChatChannel.invalidateWidget(var4); // L: 12000
		if (Client.meslayerContinueWidget != null) { // L: 12001
			ChatChannel.invalidateWidget(Client.meslayerContinueWidget); // L: 12002
			Client.meslayerContinueWidget = null; // L: 12003
		}

		BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12005
		WorldMapLabelSize.runWidgetOnLoadListener(var1); // L: 12006
		if (Client.rootInterface != -1) { // L: 12007
			class7.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12008
	}
}
