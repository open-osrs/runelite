import java.math.BigInteger;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
public class class80 {
	@ObfuscatedName("p")
	static final BigInteger field1006;
	@ObfuscatedName("j")
	static final BigInteger field1007;
	@ObfuscatedName("er")
	@Export("worldHost")
	static String worldHost;

	static {
		field1006 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field1007 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZS)Ljava/lang/String;",
		garbageValue = "7104"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? Script.method1998(var0, 10, var1) : Integer.toString(var0); // L: 101 102
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1650201726"
	)
	public static final void method1906() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 103
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 104
	} // L: 105

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1607858695"
	)
	static int method1902(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 2959
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2960
			var9 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2961
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9; // L: 2962
			return 1; // L: 2963
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 2965
				Interpreter.Interpreter_stringStackSize -= 2; // L: 2966
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2967
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2968
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4; // L: 2969
				return 1; // L: 2970
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 2972
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2973
				var9 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2974
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + intToString(var9, true); // L: 2975
				return 1; // L: 2976
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 2978
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2979
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 2980
				return 1; // L: 2981
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 2983
					var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2984
					long var13 = 86400000L * ((long)var10 + 11745L); // L: 2985
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 2986
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 2987
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 2988
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 2989
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 2990
					return 1; // L: 2991
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 2993
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3001
						var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3002
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3003
						return 1; // L: 3004
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3006
						Interpreter.Interpreter_stringStackSize -= 2; // L: 3007
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = UserComparator10.method2474(Calendar.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class378.clientLanguage)); // L: 3008
						return 1; // L: 3009
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3011
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3012
							class44.Interpreter_intStackSize -= 2; // L: 3013
							var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3014
							var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3015
							var11 = Decimator.archive13.takeFile(var5, 0); // L: 3016
							var12 = new Font(var11); // L: 3017
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3018
							return 1; // L: 3019
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3021
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3022
							class44.Interpreter_intStackSize -= 2; // L: 3023
							var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3024
							var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3025
							var11 = Decimator.archive13.takeFile(var5, 0); // L: 3026
							var12 = new Font(var11); // L: 3027
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3028
							return 1; // L: 3029
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3031
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3032
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3033
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3034
							if (Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1) { // L: 3035
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 3036
							}

							return 1; // L: 3037
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3039
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3040
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3041
							return 1; // L: 3042
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3044
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3045
							var9 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3046
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3047
							return 1; // L: 3048
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3050
							var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3051
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class245.isCharPrintable((char)var10) ? 1 : 0; // L: 3052
							return 1; // L: 3053
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3055
							var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3056
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Login.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3057
							return 1; // L: 3058
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3060
							var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3061
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapElement.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3062
							return 1; // L: 3063
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3065
							var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3066
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = UserComparator10.isDigit((char)var10) ? 1 : 0; // L: 3067
							return 1; // L: 3068
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3070
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3071
							if (var3 != null) { // L: 3072
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3073
							}

							return 1; // L: 3074
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3076
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3077
							class44.Interpreter_intStackSize -= 2; // L: 3078
							var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3079
							var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3080
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3081
							return 1; // L: 3082
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3084
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3085
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3086
							boolean var16 = false; // L: 3087

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3088
								char var7 = var3.charAt(var6); // L: 3089
								if (var7 == '<') { // L: 3090
									var16 = true;
								} else if (var7 == '>') { // L: 3091
									var16 = false;
								} else if (!var16) { // L: 3092
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3094
							return 1; // L: 3095
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3097
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3098
							var9 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3099
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3100
							return 1; // L: 3101
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3103
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3104
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3105
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3106
							var5 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3107
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3108
							return 1; // L: 3109
						} else if (var0 == ScriptOpcodes.UPPERCASE) { // L: 3111
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3112
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3113
							return 1; // L: 3114
						} else {
							return 2; // L: 3116
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2; // L: 2994
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2995
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2996
					if (class93.localPlayer.appearance != null && class93.localPlayer.appearance.isFemale) { // L: 2997
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 2998
					}

					return 1; // L: 2999
				}
			}
		}
	}
}
