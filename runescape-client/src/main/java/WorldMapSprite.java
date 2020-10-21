import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1577465281
	)
	static int field256;
	@ObfuscatedName("b")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "38290774"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64]; // L: 24
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lcf;Lcf;IZI)I",
		garbageValue = "-1899610512"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1888() ? (var1.method1888() ? 0 : 1) : (var1.method1888() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1901() ? (var1.method1901() ? 0 : 1) : (var1.method1901() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "1481006152"
	)
	static int method518(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 2822
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 2823
			return 1; // L: 2824
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 2826
			MilliClock.Interpreter_intStackSize -= 3; // L: 2827
			Client.publicChatMode = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2828
			class39.privateChatMode = MouseRecorder.method1287(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 2829
			if (class39.privateChatMode == null) { // L: 2830
				class39.privateChatMode = PrivateChatMode.field3824;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 2831
			PacketBufferNode var18 = class4.getPacketBufferNode(ClientPacket.field2245, Client.packetWriter.isaacCipher); // L: 2833
			var18.packetBuffer.writeByte(Client.publicChatMode); // L: 2834
			var18.packetBuffer.writeByte(class39.privateChatMode.field3825); // L: 2835
			var18.packetBuffer.writeByte(Client.tradeChatMode); // L: 2836
			Client.packetWriter.addNode(var18); // L: 2837
			return 1; // L: 2838
		} else {
			String var3;
			int var11;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 2840
				var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2841
				MilliClock.Interpreter_intStackSize -= 2; // L: 2842
				var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2843
				int var12 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2844
				PacketBufferNode var13 = class4.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher); // L: 2846
				var13.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var3) + 2); // L: 2847
				var13.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 2848
				var13.packetBuffer.writeByte(var11 - 1); // L: 2849
				var13.packetBuffer.writeByte(var12); // L: 2850
				Client.packetWriter.addNode(var13); // L: 2851
				return 1; // L: 2852
			} else {
				int var10;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 2854
					MilliClock.Interpreter_intStackSize -= 2; // L: 2855
					var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2856
					var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2857
					Message var16 = class4.Messages_getByChannelAndID(var10, var11); // L: 2858
					if (var16 != null) { // L: 2859
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var16.count; // L: 2860
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var16.cycle; // L: 2861
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var16.sender != null ? var16.sender : ""; // L: 2862
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var16.prefix != null ? var16.prefix : ""; // L: 2863
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var16.text != null ? var16.text : ""; // L: 2864
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var16.isFromFriend() ? 1 : (var16.isFromIgnored() ? 2 : 0); // L: 2865
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 2868
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2869
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2870
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2871
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2872
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2873
					}

					return 1; // L: 2875
				} else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 2877
					var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2878
					Message var14 = class89.Messages_getMessage(var10); // L: 2879
					if (var14 != null) { // L: 2880
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14.type; // L: 2881
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14.cycle; // L: 2882
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var14.sender != null ? var14.sender : ""; // L: 2883
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var14.prefix != null ? var14.prefix : ""; // L: 2884
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var14.text != null ? var14.text : ""; // L: 2885
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14.isFromFriend() ? 1 : (var14.isFromIgnored() ? 2 : 0); // L: 2886
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 2889
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2890
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2891
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2892
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2893
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2894
					}

					return 1; // L: 2896
				} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 2898
					if (class39.privateChatMode == null) { // L: 2899
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = class39.privateChatMode.field3825; // L: 2900
					}

					return 1; // L: 2901
				} else if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 2903
					var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2904
					var11 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2905
					String var15 = var3.toLowerCase(); // L: 2906
					byte var17 = 0; // L: 2907
					if (var15.startsWith("yellow:")) { // L: 2908
						var17 = 0; // L: 2909
						var3 = var3.substring("yellow:".length()); // L: 2910
					} else if (var15.startsWith("red:")) { // L: 2912
						var17 = 1; // L: 2913
						var3 = var3.substring("red:".length()); // L: 2914
					} else if (var15.startsWith("green:")) { // L: 2916
						var17 = 2; // L: 2917
						var3 = var3.substring("green:".length()); // L: 2918
					} else if (var15.startsWith("cyan:")) { // L: 2920
						var17 = 3; // L: 2921
						var3 = var3.substring("cyan:".length()); // L: 2922
					} else if (var15.startsWith("purple:")) { // L: 2924
						var17 = 4; // L: 2925
						var3 = var3.substring("purple:".length()); // L: 2926
					} else if (var15.startsWith("white:")) { // L: 2928
						var17 = 5; // L: 2929
						var3 = var3.substring("white:".length()); // L: 2930
					} else if (var15.startsWith("flash1:")) { // L: 2932
						var17 = 6; // L: 2933
						var3 = var3.substring("flash1:".length()); // L: 2934
					} else if (var15.startsWith("flash2:")) { // L: 2936
						var17 = 7; // L: 2937
						var3 = var3.substring("flash2:".length()); // L: 2938
					} else if (var15.startsWith("flash3:")) { // L: 2940
						var17 = 8; // L: 2941
						var3 = var3.substring("flash3:".length()); // L: 2942
					} else if (var15.startsWith("glow1:")) { // L: 2944
						var17 = 9; // L: 2945
						var3 = var3.substring("glow1:".length()); // L: 2946
					} else if (var15.startsWith("glow2:")) { // L: 2948
						var17 = 10; // L: 2949
						var3 = var3.substring("glow2:".length()); // L: 2950
					} else if (var15.startsWith("glow3:")) { // L: 2952
						var17 = 11; // L: 2953
						var3 = var3.substring("glow3:".length()); // L: 2954
					} else if (FontName.clientLanguage != Language.Language_EN) { // L: 2956
						if (var15.startsWith("yellow:")) { // L: 2957
							var17 = 0; // L: 2958
							var3 = var3.substring("yellow:".length()); // L: 2959
						} else if (var15.startsWith("red:")) { // L: 2961
							var17 = 1; // L: 2962
							var3 = var3.substring("red:".length()); // L: 2963
						} else if (var15.startsWith("green:")) { // L: 2965
							var17 = 2; // L: 2966
							var3 = var3.substring("green:".length()); // L: 2967
						} else if (var15.startsWith("cyan:")) { // L: 2969
							var17 = 3; // L: 2970
							var3 = var3.substring("cyan:".length()); // L: 2971
						} else if (var15.startsWith("purple:")) { // L: 2973
							var17 = 4; // L: 2974
							var3 = var3.substring("purple:".length()); // L: 2975
						} else if (var15.startsWith("white:")) { // L: 2977
							var17 = 5; // L: 2978
							var3 = var3.substring("white:".length()); // L: 2979
						} else if (var15.startsWith("flash1:")) { // L: 2981
							var17 = 6; // L: 2982
							var3 = var3.substring("flash1:".length()); // L: 2983
						} else if (var15.startsWith("flash2:")) { // L: 2985
							var17 = 7; // L: 2986
							var3 = var3.substring("flash2:".length()); // L: 2987
						} else if (var15.startsWith("flash3:")) { // L: 2989
							var17 = 8; // L: 2990
							var3 = var3.substring("flash3:".length()); // L: 2991
						} else if (var15.startsWith("glow1:")) { // L: 2993
							var17 = 9; // L: 2994
							var3 = var3.substring("glow1:".length()); // L: 2995
						} else if (var15.startsWith("glow2:")) { // L: 2997
							var17 = 10; // L: 2998
							var3 = var3.substring("glow2:".length()); // L: 2999
						} else if (var15.startsWith("glow3:")) { // L: 3001
							var17 = 11; // L: 3002
							var3 = var3.substring("glow3:".length()); // L: 3003
						}
					}

					var15 = var3.toLowerCase(); // L: 3006
					byte var7 = 0; // L: 3007
					if (var15.startsWith("wave:")) { // L: 3008
						var7 = 1; // L: 3009
						var3 = var3.substring("wave:".length()); // L: 3010
					} else if (var15.startsWith("wave2:")) { // L: 3012
						var7 = 2; // L: 3013
						var3 = var3.substring("wave2:".length()); // L: 3014
					} else if (var15.startsWith("shake:")) { // L: 3016
						var7 = 3; // L: 3017
						var3 = var3.substring("shake:".length()); // L: 3018
					} else if (var15.startsWith("scroll:")) { // L: 3020
						var7 = 4; // L: 3021
						var3 = var3.substring("scroll:".length()); // L: 3022
					} else if (var15.startsWith("slide:")) { // L: 3024
						var7 = 5; // L: 3025
						var3 = var3.substring("slide:".length()); // L: 3026
					} else if (Language.Language_EN != FontName.clientLanguage) { // L: 3028
						if (var15.startsWith("wave:")) { // L: 3029
							var7 = 1; // L: 3030
							var3 = var3.substring("wave:".length()); // L: 3031
						} else if (var15.startsWith("wave2:")) { // L: 3033
							var7 = 2; // L: 3034
							var3 = var3.substring("wave2:".length()); // L: 3035
						} else if (var15.startsWith("shake:")) { // L: 3037
							var7 = 3; // L: 3038
							var3 = var3.substring("shake:".length()); // L: 3039
						} else if (var15.startsWith("scroll:")) { // L: 3041
							var7 = 4; // L: 3042
							var3 = var3.substring("scroll:".length()); // L: 3043
						} else if (var15.startsWith("slide:")) { // L: 3045
							var7 = 5; // L: 3046
							var3 = var3.substring("slide:".length()); // L: 3047
						}
					}

					PacketBufferNode var8 = class4.getPacketBufferNode(ClientPacket.field2269, Client.packetWriter.isaacCipher); // L: 3051
					var8.packetBuffer.writeByte(0); // L: 3052
					int var9 = var8.packetBuffer.offset; // L: 3053
					var8.packetBuffer.writeByte(var11); // L: 3054
					var8.packetBuffer.writeByte(var17); // L: 3055
					var8.packetBuffer.writeByte(var7); // L: 3056
					WorldMapData_0.method269(var8.packetBuffer, var3); // L: 3057
					var8.packetBuffer.writeLengthByte(var8.packetBuffer.offset - var9); // L: 3058
					Client.packetWriter.addNode(var8); // L: 3059
					return 1; // L: 3060
				} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3062
					UrlRequester.Interpreter_stringStackSize -= 2; // L: 3063
					var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize]; // L: 3064
					String var4 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1]; // L: 3065
					PacketBufferNode var5 = class4.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher); // L: 3067
					var5.packetBuffer.writeShort(0); // L: 3068
					int var6 = var5.packetBuffer.offset; // L: 3069
					var5.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 3070
					WorldMapData_0.method269(var5.packetBuffer, var4); // L: 3071
					var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6); // L: 3072
					Client.packetWriter.addNode(var5); // L: 3073
					return 1; // L: 3074
				} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3076
					if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3083
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3084
						return 1; // L: 3085
					} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3087
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3088
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = class2.Messages_getHistorySize(var10); // L: 3089
						return 1; // L: 3090
					} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3092
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3093
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = SoundSystem.Messages_getNextChatID(var10); // L: 3094
						return 1; // L: 3095
					} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3097
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3098
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = class90.Messages_getLastChatID(var10); // L: 3099
						return 1; // L: 3100
					} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3102
						var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 3103
						class308.doCheat(var3); // L: 3104
						return 1; // L: 3105
					} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3107
						Client.field710 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3108
						return 1; // L: 3109
					} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3111
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = Client.field710; // L: 3112
						return 1; // L: 3113
					} else if (var0 == ScriptOpcodes.DEBUGMES) { // L: 3115
						var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 3116
						System.out.println(var3); // L: 3117
						return 1; // L: 3118
					} else {
						return 2; // L: 3120
					}
				} else {
					if (PlayerType.localPlayer != null && PlayerType.localPlayer.username != null) { // L: 3078
						var3 = PlayerType.localPlayer.username.getName();
					} else {
						var3 = ""; // L: 3079
					}

					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3; // L: 3080
					return 1; // L: 3081
				}
			}
		}
	}
}
