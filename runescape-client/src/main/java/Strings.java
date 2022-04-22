import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kv")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bo")
	public static String field3645;
	@ObfuscatedName("cn")
	public static String field3684;
	@ObfuscatedName("ky")
	public static String field3628;
	@ObfuscatedName("kc")
	public static String field3870;
	@ObfuscatedName("kw")
	public static String field3646;

	static {
		field3645 = "Please visit the support page for assistance."; // L: 60
		field3684 = "Please visit the support page for assistance."; // L: 99
		field3628 = ""; // L: 299
		field3870 = "Page has opened in a new window."; // L: 300
		field3646 = "(Please check your popup blocker.)"; // L: 301
	} // L: 339

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-698381371"
	)
	static int method5790(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3039
			Interpreter.Interpreter_intStackSize -= 2; // L: 3040
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3041
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3042
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + var4; // L: 3043
			return 1; // L: 3044
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3046
			Interpreter.Interpreter_intStackSize -= 2; // L: 3047
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3048
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3049
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 - var4; // L: 3050
			return 1; // L: 3051
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3053
			Interpreter.Interpreter_intStackSize -= 2; // L: 3054
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3055
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3056
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 * var4; // L: 3057
			return 1; // L: 3058
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3060
			Interpreter.Interpreter_intStackSize -= 2; // L: 3061
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3062
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3063
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 / var4; // L: 3064
			return 1; // L: 3065
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3067
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3068
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3069
			return 1; // L: 3070
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3072
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3073
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3074
			return 1; // L: 3075
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3077
				Interpreter.Interpreter_intStackSize -= 5; // L: 3078
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3079
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3080
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3081
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3082
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3083
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 3084
				return 1; // L: 3085
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3087
				Interpreter.Interpreter_intStackSize -= 2; // L: 3088
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3089
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3090
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 3091
				return 1; // L: 3092
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3094
				Interpreter.Interpreter_intStackSize -= 2; // L: 3095
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3096
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3097
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3098
				return 1; // L: 3099
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3101
				Interpreter.Interpreter_intStackSize -= 2; // L: 3102
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3103
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3104
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3105
				return 1; // L: 3106
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3108
				Interpreter.Interpreter_intStackSize -= 2; // L: 3109
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3110
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3111
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3112
				return 1; // L: 3113
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3115
				Interpreter.Interpreter_intStackSize -= 2; // L: 3116
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3117
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3118
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 % var4; // L: 3119
				return 1; // L: 3120
			} else if (var0 == ScriptOpcodes.POW) { // L: 3122
				Interpreter.Interpreter_intStackSize -= 2; // L: 3123
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3124
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3125
				if (var3 == 0) { // L: 3126
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3127
				}

				return 1; // L: 3128
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3130
				Interpreter.Interpreter_intStackSize -= 2; // L: 3131
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3132
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3133
				if (var3 == 0) { // L: 3134
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3135
					return 1; // L: 3136
				} else {
					switch(var4) { // L: 3138
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3161
						break; // L: 3162
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3156
						break; // L: 3157
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3141
						break;
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3151
						break; // L: 3152
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3146
						break; // L: 3147
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3166
					}

					return 1; // L: 3170
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3172
				Interpreter.Interpreter_intStackSize -= 2; // L: 3173
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3174
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3175
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & var4; // L: 3176
				return 1; // L: 3177
			} else if (var0 == ScriptOpcodes.OR) { // L: 3179
				Interpreter.Interpreter_intStackSize -= 2; // L: 3180
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3181
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3182
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4; // L: 3183
				return 1; // L: 3184
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3186
				Interpreter.Interpreter_intStackSize -= 3; // L: 3187
				long var9 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3188
				long var11 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3189
				long var13 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3190
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 3191
				return 1; // L: 3192
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3194
				var3 = class150.method3150(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3195
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3196
				return 1; // L: 3197
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3199
				Interpreter.Interpreter_intStackSize -= 2; // L: 3200
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3201
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3202
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3203
				return 1; // L: 3204
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3206
				Interpreter.Interpreter_intStackSize -= 3; // L: 3207
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3208
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3209
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3210
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ModelData0.method5091(var3, var4, var5); // L: 3211
				return 1; // L: 3212
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3214
				Interpreter.Interpreter_intStackSize -= 3; // L: 3215
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3216
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3217
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3218
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.method1679(var3, var4, var5); // L: 3219
				return 1; // L: 3220
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3222
				Interpreter.Interpreter_intStackSize -= 3; // L: 3223
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3224
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3225
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3226
				var6 = 31 - var5; // L: 3227
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 3228
				return 1; // L: 3229
			} else if (var0 == 4030) { // L: 3231
				Interpreter.Interpreter_intStackSize -= 4; // L: 3232
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3233
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3234
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3235
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3236
				var3 = World.method1679(var3, var5, var6); // L: 3237
				var7 = class54.method1078(var6 - var5 + 1); // L: 3238
				if (var4 > var7) { // L: 3239
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3240
				return 1; // L: 3241
			} else if (var0 == 4032) { // L: 3243
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = HealthBar.method2344(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3244
				return 1; // L: 3245
			} else if (var0 == 4033) { // L: 3247
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class144.method3081(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3248
				return 1; // L: 3249
			} else if (var0 == 4034) { // L: 3251
				Interpreter.Interpreter_intStackSize -= 2; // L: 3252
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3253
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3254
				var5 = class194.method3890(var3, var4); // L: 3255
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3256
				return 1; // L: 3257
			} else if (var0 == 4035) { // L: 3259
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3260
				return 1; // L: 3261
			} else {
				return 2; // L: 3263
			}
		}
	}
}
