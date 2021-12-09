import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mf")
public class class341 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "6"
	)
	static int method6258(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 2828
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 2829
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2830
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2831
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4 + var3; // L: 2832
			return 1; // L: 2833
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2835
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 2836
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2837
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2838
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 - var4; // L: 2839
			return 1; // L: 2840
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2842
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 2843
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2844
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2845
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 * var4; // L: 2846
			return 1; // L: 2847
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2849
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 2850
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2851
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2852
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 / var4; // L: 2853
			return 1; // L: 2854
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2856
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2857
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 2858
			return 1; // L: 2859
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2861
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2862
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 2863
			return 1; // L: 2864
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2866
				IsaacCipher.Interpreter_intStackSize -= 5; // L: 2867
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2868
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2869
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 2870
				var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3]; // L: 2871
				var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 4]; // L: 2872
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 2873
				return 1; // L: 2874
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2876
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2877
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2878
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2879
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 2880
				return 1; // L: 2881
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2883
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2884
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2885
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2886
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 2887
				return 1; // L: 2888
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2890
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2891
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2892
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2893
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 2894
				return 1; // L: 2895
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2897
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2898
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2899
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2900
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 2901
				return 1; // L: 2902
			} else if (var0 == ScriptOpcodes.MOD) { // L: 2904
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2905
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2906
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2907
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 % var4; // L: 2908
				return 1; // L: 2909
			} else if (var0 == ScriptOpcodes.POW) { // L: 2911
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2912
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2913
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2914
				if (var3 == 0) { // L: 2915
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 2916
				}

				return 1; // L: 2917
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2919
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2920
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2921
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2922
				if (var3 == 0) { // L: 2923
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2924
					return 1; // L: 2925
				} else {
					switch(var4) { // L: 2927
					case 0:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2935
						break; // L: 2936
					case 1:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3; // L: 2950
						break; // L: 2951
					case 2:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 2945
						break; // L: 2946
					case 3:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 2930
						break;
					case 4:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 2955
						break;
					default:
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 2940
					}

					return 1; // L: 2959
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 2961
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2962
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2963
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2964
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 & var4; // L: 2965
				return 1; // L: 2966
			} else if (var0 == ScriptOpcodes.OR) { // L: 2968
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2969
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2970
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2971
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 | var4; // L: 2972
				return 1; // L: 2973
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 2975
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 2976
				long var9 = (long)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2977
				long var11 = (long)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2978
				long var13 = (long)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 2979
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 2980
				return 1; // L: 2981
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 2983
				var3 = Language.method5825(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 2984
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3; // L: 2985
				return 1; // L: 2986
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 2988
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 2989
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2990
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2991
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 2992
				return 1; // L: 2993
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 2995
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 2996
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2997
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2998
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 2999
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FloorOverlayDefinition.method3636(var3, var4, var5); // L: 3000
				return 1; // L: 3001
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3003
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 3004
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3005
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3006
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 3007
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class123.method2737(var3, var4, var5); // L: 3008
				return 1; // L: 3009
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3011
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 3012
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3013
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3014
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 3015
				var6 = 31 - var5; // L: 3016
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 3017
				return 1; // L: 3018
			} else if (var0 == 4030) { // L: 3020
				IsaacCipher.Interpreter_intStackSize -= 4; // L: 3021
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3022
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3023
				var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 3024
				var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3]; // L: 3025
				var3 = class123.method2737(var3, var5, var6); // L: 3026
				var7 = WorldMapEvent.method4942(var6 - var5 + 1); // L: 3027
				if (var4 > var7) { // L: 3028
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3029
				return 1; // L: 3030
			} else if (var0 == 4032) { // L: 3032
				Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = SoundCache.method833(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]); // L: 3033
				return 1; // L: 3034
			} else if (var0 == 4033) { // L: 3036
				Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = GrandExchangeOfferNameComparator.method5727(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]); // L: 3037
				return 1; // L: 3038
			} else if (var0 == 4034) { // L: 3040
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 3041
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3042
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3043
				var5 = class123.method2744(var3, var4); // L: 3044
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5; // L: 3045
				return 1; // L: 3046
			} else if (var0 == 4035) { // L: 3048
				Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]); // L: 3049
				return 1; // L: 3050
			} else {
				return 2; // L: 3052
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1492532048"
	)
	static final void method6257() {
		int var0 = Players.Players_count; // L: 4603
		int[] var1 = Players.Players_indices; // L: 4604

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4605
			Player var3 = Client.players[var1[var2]]; // L: 4606
			if (var3 != null) { // L: 4607
				ItemLayer.updateActorSequence(var3, 1); // L: 4608
			}
		}

	} // L: 4611
}
