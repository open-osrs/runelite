import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("n")
public class class9 {
	@ObfuscatedName("p")
	static byte[][][] field69;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 2080333627
	)
	static int field63;
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("f")
	public byte field66;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -580001667
	)
	public int field64;
	@ObfuscatedName("u")
	public String field65;

	class9() {
	} // L: 8

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public static int method125() {
		return KeyHandler.KeyHandler_idleCycles; // L: 187
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "-17407"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1256
		Login.Login_response2 = var1; // L: 1257
		Login.Login_response3 = var2; // L: 1258
	} // L: 1259

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1816679495"
	)
	static int method120(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 2909
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2910
			var9 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2911
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9; // L: 2912
			return 1; // L: 2913
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 2915
				Interpreter.Interpreter_stringStackSize -= 2; // L: 2916
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2917
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2918
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4; // L: 2919
				return 1; // L: 2920
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 2922
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2923
				var9 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2924
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + WallDecoration.intToString(var9, true); // L: 2925
				return 1; // L: 2926
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 2928
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2929
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 2930
				return 1; // L: 2931
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 2933
					var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2934
					long var13 = 86400000L * ((long)var10 + 11745L); // L: 2935
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 2936
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 2937
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 2938
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 2939
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 2940
					return 1; // L: 2941
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 2943
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 2951
						var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2952
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 2953
						return 1; // L: 2954
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 2956
						Interpreter.Interpreter_stringStackSize -= 2; // L: 2957
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = NetSocket.method2587(DirectByteArrayCopier.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class35.clientLanguage)); // L: 2958
						return 1; // L: 2959
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 2961
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2962
							class16.Interpreter_intStackSize -= 2; // L: 2963
							var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2964
							var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2965
							var11 = MilliClock.archive13.takeFile(var5, 0); // L: 2966
							var12 = new Font(var11); // L: 2967
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 2968
							return 1; // L: 2969
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 2971
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2972
							class16.Interpreter_intStackSize -= 2; // L: 2973
							var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2974
							var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2975
							var11 = MilliClock.archive13.takeFile(var5, 0); // L: 2976
							var12 = new Font(var11); // L: 2977
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 2978
							return 1; // L: 2979
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 2981
							Interpreter.Interpreter_stringStackSize -= 2; // L: 2982
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2983
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2984
							if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) { // L: 2985
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 2986
							}

							return 1; // L: 2987
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 2989
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2990
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 2991
							return 1; // L: 2992
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 2994
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2995
							var9 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2996
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 2997
							return 1; // L: 2998
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3000
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3001
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = LoginScreenAnimation.isCharPrintable((char)var10) ? 1 : 0; // L: 3002
							return 1; // L: 3003
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3005
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3006
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class238.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3007
							return 1; // L: 3008
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3010
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3011
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class69.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3012
							return 1; // L: 3013
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3015
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3016
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = UserComparator4.isDigit((char)var10) ? 1 : 0; // L: 3017
							return 1; // L: 3018
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3020
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3021
							if (var3 != null) { // L: 3022
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3023
							}

							return 1; // L: 3024
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3026
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3027
							class16.Interpreter_intStackSize -= 2; // L: 3028
							var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3029
							var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3030
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3031
							return 1; // L: 3032
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3034
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3035
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3036
							boolean var16 = false; // L: 3037

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3038
								char var7 = var3.charAt(var6); // L: 3039
								if (var7 == '<') { // L: 3040
									var16 = true;
								} else if (var7 == '>') { // L: 3041
									var16 = false;
								} else if (!var16) { // L: 3042
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3044
							return 1; // L: 3045
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3047
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3048
							var9 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3049
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3050
							return 1; // L: 3051
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3053
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3054
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3055
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3056
							var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3057
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3058
							return 1; // L: 3059
						} else if (var0 == ScriptOpcodes.UPPERCASE) { // L: 3061
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3062
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3063
							return 1; // L: 3064
						} else {
							return 2; // L: 3066
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2; // L: 2944
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2945
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2946
					if (Varcs.localPlayer.appearance != null && Varcs.localPlayer.appearance.isFemale) { // L: 2947
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 2948
					}

					return 1; // L: 2949
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "2074876999"
	)
	static int method122(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3541
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = WorldMapAreaData.loadWorlds() ? 1 : 0; // L: 3542
			return 1; // L: 3543
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3545
				var9 = NPCComposition.worldListStart(); // L: 3546
				if (var9 != null) { // L: 3547
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.id; // L: 3548
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.properties; // L: 3549
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3550
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.location; // L: 3551
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.population; // L: 3552
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3553
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3556
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3557
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3558
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3559
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3560
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3561
				}

				return 1; // L: 3563
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3565
				var9 = ScriptFrame.getNextWorldListWorld(); // L: 3566
				if (var9 != null) { // L: 3567
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.id; // L: 3568
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.properties; // L: 3569
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3570
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.location; // L: 3571
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.population; // L: 3572
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3573
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3576
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3577
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3578
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3579
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3580
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3581
				}

				return 1; // L: 3583
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3585
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3586
					var7 = null; // L: 3587

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3588
						if (var3 == World_worlds[var8].id) { // L: 3589
							var7 = World_worlds[var8]; // L: 3590
							break;
						}
					}

					if (var7 != null) { // L: 3594
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.id; // L: 3595
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.properties; // L: 3596
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3597
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.location; // L: 3598
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.population; // L: 3599
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3600
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3603
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3604
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3605
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3606
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3607
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3608
					}

					return 1; // L: 3610
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3612
					class16.Interpreter_intStackSize -= 4; // L: 3613
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3614
					boolean var10 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1; // L: 3615
					var8 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 3616
					boolean var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3] == 1; // L: 3617
					WorldMapSectionType.sortWorldList(var3, var10, var8, var6); // L: 3618
					return 1; // L: 3619
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) { // L: 3621
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3642
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 3643
						return 1; // L: 3644
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3646
							class16.Interpreter_intStackSize -= 2; // L: 3647
							var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3648
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3649
							var5 = UserComparator3.getParamDefinition(var4); // L: 3650
							if (var5.isString()) { // L: 3651
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = GraphicsObject.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3652
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GraphicsObject.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3655
							}

							return 1; // L: 3657
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3659
							class16.Interpreter_intStackSize -= 2; // L: 3660
							var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3661
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3662
							var5 = UserComparator3.getParamDefinition(var4); // L: 3663
							if (var5.isString()) { // L: 3664
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3665
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3668
							}

							return 1; // L: 3670
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3672
							class16.Interpreter_intStackSize -= 2; // L: 3673
							var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3674
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3675
							var5 = UserComparator3.getParamDefinition(var4); // L: 3676
							if (var5.isString()) { // L: 3677
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class23.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3678
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3681
							}

							return 1; // L: 3683
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3685
							class16.Interpreter_intStackSize -= 2; // L: 3686
							var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3687
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3688
							var5 = UserComparator3.getParamDefinition(var4); // L: 3689
							if (var5.isString()) { // L: 3690
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = LoginPacket.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3691
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = LoginPacket.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3694
							}

							return 1; // L: 3696
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3698
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3699
							return 1; // L: 3700
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3702
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3703
							return 1; // L: 3704
						} else if (var0 == 6520) { // L: 3706
							return 1; // L: 3707
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3709
							return 1; // L: 3710
						} else if (var0 == 6522) { // L: 3712
							--Interpreter.Interpreter_stringStackSize; // L: 3713
							--class16.Interpreter_intStackSize; // L: 3714
							return 1; // L: 3715
						} else if (var0 == 6523) { // L: 3717
							--Interpreter.Interpreter_stringStackSize; // L: 3718
							--class16.Interpreter_intStackSize; // L: 3719
							return 1; // L: 3720
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) { // L: 3722
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3723
							return 1; // L: 3724
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) { // L: 3726
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 3727
							return 1; // L: 3728
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) { // L: 3730
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 3731
							return 1; // L: 3732
						} else if (var0 == 6527) { // L: 3734
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.field605; // L: 3735
							return 1; // L: 3736
						} else {
							return 2; // L: 3738
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3622
					if (var3 >= 0 && var3 < World.World_count) { // L: 3623
						var7 = World_worlds[var3]; // L: 3624
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.id; // L: 3625
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.properties; // L: 3626
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3627
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.location; // L: 3628
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.population; // L: 3629
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3630
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3633
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3634
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3635
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3636
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3637
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3638
					}

					return 1; // L: 3640
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "616435049"
	)
	static int method121(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4135
			++Interpreter.Interpreter_stringStackSize; // L: 4136
			return 1; // L: 4137
		} else if (var0 != 6801 && var0 != 6802) { // L: 4139
			if (var0 == 6850) { // L: 4143
				++Interpreter.Interpreter_stringStackSize; // L: 4144
				return 1; // L: 4145
			} else if (var0 != 6851 && var0 != 6852) { // L: 4147
				return 2; // L: 4151
			} else {
				++class16.Interpreter_intStackSize; // L: 4148
				return 1; // L: 4149
			}
		} else {
			++class16.Interpreter_intStackSize; // L: 4140
			return 1; // L: 4141
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "785264167"
	)
	static void method118(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 11581
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 11582
				var1.remove(); // L: 11583
			}
		}

	} // L: 11586

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1685412004"
	)
	public static void method123(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher); // L: 11687
		var4.packetBuffer.writeShortLE(var2); // L: 11688
		var4.packetBuffer.writeShort(var1); // L: 11689
		var4.packetBuffer.writeInt(var3 ? Client.field684 * -320583695 * 17549585 : 0); // L: 11690
		var4.packetBuffer.method6771(var0); // L: 11691
		Client.packetWriter.addNode(var4); // L: 11692
	} // L: 11693

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	static void method119() {
		if (Client.oculusOrbState == 1) { // L: 11700
			Client.field685 = true; // L: 11701
		}

	} // L: 11703
}
