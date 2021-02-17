import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iu")
public class class258 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-756933524"
	)
	static int method4516(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 2880
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 2881
			return 1; // L: 2882
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 2884
			VarcInt.Interpreter_intStackSize -= 3; // L: 2885
			Client.publicChatMode = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2886
			Client.privateChatMode = class52.method840(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 2887
			if (Client.privateChatMode == null) { // L: 2888
				Client.privateChatMode = PrivateChatMode.field3832;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 2889
			PacketBufferNode var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher); // L: 2891
			var18.packetBuffer.writeByte(Client.publicChatMode); // L: 2892
			var18.packetBuffer.writeByte(Client.privateChatMode.field3835); // L: 2893
			var18.packetBuffer.writeByte(Client.tradeChatMode); // L: 2894
			Client.packetWriter.addNode(var18); // L: 2895
			return 1; // L: 2896
		} else {
			String var3;
			int var11;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 2898
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2899
				VarcInt.Interpreter_intStackSize -= 2; // L: 2900
				var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2901
				int var12 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2902
				PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher); // L: 2904
				var13.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var3) + 2); // L: 2905
				var13.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 2906
				var13.packetBuffer.writeByte(var11 - 1); // L: 2907
				var13.packetBuffer.writeByte(var12); // L: 2908
				Client.packetWriter.addNode(var13); // L: 2909
				return 1; // L: 2910
			} else {
				int var10;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 2912
					VarcInt.Interpreter_intStackSize -= 2; // L: 2913
					var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2914
					var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2915
					Message var16 = WallDecoration.Messages_getByChannelAndID(var10, var11); // L: 2916
					if (var16 != null) { // L: 2917
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var16.count; // L: 2918
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var16.cycle; // L: 2919
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.sender != null ? var16.sender : ""; // L: 2920
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.prefix != null ? var16.prefix : ""; // L: 2921
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.text != null ? var16.text : ""; // L: 2922
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var16.isFromFriend() ? 1 : (var16.isFromIgnored() ? 2 : 0); // L: 2923
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 2926
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2927
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2928
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2929
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2930
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2931
					}

					return 1; // L: 2933
				} else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 2935
					var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2936
					Message var14 = class195.Messages_getMessage(var10); // L: 2937
					if (var14 != null) { // L: 2938
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.type; // L: 2939
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.cycle; // L: 2940
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.sender != null ? var14.sender : ""; // L: 2941
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.prefix != null ? var14.prefix : ""; // L: 2942
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.text != null ? var14.text : ""; // L: 2943
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.isFromFriend() ? 1 : (var14.isFromIgnored() ? 2 : 0); // L: 2944
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 2947
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2948
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2949
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2950
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2951
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2952
					}

					return 1; // L: 2954
				} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 2956
					if (Client.privateChatMode == null) { // L: 2957
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.privateChatMode.field3835; // L: 2958
					}

					return 1; // L: 2959
				} else if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 2961
					var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2962
					var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2963
					String var15 = var3.toLowerCase(); // L: 2964
					byte var17 = 0; // L: 2965
					if (var15.startsWith("yellow:")) { // L: 2966
						var17 = 0; // L: 2967
						var3 = var3.substring("yellow:".length()); // L: 2968
					} else if (var15.startsWith("red:")) { // L: 2970
						var17 = 1; // L: 2971
						var3 = var3.substring("red:".length()); // L: 2972
					} else if (var15.startsWith("green:")) { // L: 2974
						var17 = 2; // L: 2975
						var3 = var3.substring("green:".length()); // L: 2976
					} else if (var15.startsWith("cyan:")) { // L: 2978
						var17 = 3; // L: 2979
						var3 = var3.substring("cyan:".length()); // L: 2980
					} else if (var15.startsWith("purple:")) { // L: 2982
						var17 = 4; // L: 2983
						var3 = var3.substring("purple:".length()); // L: 2984
					} else if (var15.startsWith("white:")) { // L: 2986
						var17 = 5; // L: 2987
						var3 = var3.substring("white:".length()); // L: 2988
					} else if (var15.startsWith("flash1:")) { // L: 2990
						var17 = 6; // L: 2991
						var3 = var3.substring("flash1:".length()); // L: 2992
					} else if (var15.startsWith("flash2:")) { // L: 2994
						var17 = 7; // L: 2995
						var3 = var3.substring("flash2:".length()); // L: 2996
					} else if (var15.startsWith("flash3:")) { // L: 2998
						var17 = 8; // L: 2999
						var3 = var3.substring("flash3:".length()); // L: 3000
					} else if (var15.startsWith("glow1:")) { // L: 3002
						var17 = 9; // L: 3003
						var3 = var3.substring("glow1:".length()); // L: 3004
					} else if (var15.startsWith("glow2:")) { // L: 3006
						var17 = 10; // L: 3007
						var3 = var3.substring("glow2:".length()); // L: 3008
					} else if (var15.startsWith("glow3:")) { // L: 3010
						var17 = 11; // L: 3011
						var3 = var3.substring("glow3:".length()); // L: 3012
					} else if (WorldMapScaleHandler.clientLanguage != Language.Language_EN) { // L: 3014
						if (var15.startsWith("yellow:")) { // L: 3015
							var17 = 0; // L: 3016
							var3 = var3.substring("yellow:".length()); // L: 3017
						} else if (var15.startsWith("red:")) { // L: 3019
							var17 = 1; // L: 3020
							var3 = var3.substring("red:".length()); // L: 3021
						} else if (var15.startsWith("green:")) { // L: 3023
							var17 = 2; // L: 3024
							var3 = var3.substring("green:".length()); // L: 3025
						} else if (var15.startsWith("cyan:")) { // L: 3027
							var17 = 3; // L: 3028
							var3 = var3.substring("cyan:".length()); // L: 3029
						} else if (var15.startsWith("purple:")) { // L: 3031
							var17 = 4; // L: 3032
							var3 = var3.substring("purple:".length()); // L: 3033
						} else if (var15.startsWith("white:")) { // L: 3035
							var17 = 5; // L: 3036
							var3 = var3.substring("white:".length()); // L: 3037
						} else if (var15.startsWith("flash1:")) { // L: 3039
							var17 = 6; // L: 3040
							var3 = var3.substring("flash1:".length()); // L: 3041
						} else if (var15.startsWith("flash2:")) { // L: 3043
							var17 = 7; // L: 3044
							var3 = var3.substring("flash2:".length()); // L: 3045
						} else if (var15.startsWith("flash3:")) { // L: 3047
							var17 = 8; // L: 3048
							var3 = var3.substring("flash3:".length()); // L: 3049
						} else if (var15.startsWith("glow1:")) { // L: 3051
							var17 = 9; // L: 3052
							var3 = var3.substring("glow1:".length()); // L: 3053
						} else if (var15.startsWith("glow2:")) { // L: 3055
							var17 = 10; // L: 3056
							var3 = var3.substring("glow2:".length()); // L: 3057
						} else if (var15.startsWith("glow3:")) { // L: 3059
							var17 = 11; // L: 3060
							var3 = var3.substring("glow3:".length()); // L: 3061
						}
					}

					var15 = var3.toLowerCase(); // L: 3064
					byte var7 = 0; // L: 3065
					if (var15.startsWith("wave:")) { // L: 3066
						var7 = 1; // L: 3067
						var3 = var3.substring("wave:".length()); // L: 3068
					} else if (var15.startsWith("wave2:")) { // L: 3070
						var7 = 2; // L: 3071
						var3 = var3.substring("wave2:".length()); // L: 3072
					} else if (var15.startsWith("shake:")) { // L: 3074
						var7 = 3; // L: 3075
						var3 = var3.substring("shake:".length()); // L: 3076
					} else if (var15.startsWith("scroll:")) { // L: 3078
						var7 = 4; // L: 3079
						var3 = var3.substring("scroll:".length()); // L: 3080
					} else if (var15.startsWith("slide:")) { // L: 3082
						var7 = 5; // L: 3083
						var3 = var3.substring("slide:".length()); // L: 3084
					} else if (Language.Language_EN != WorldMapScaleHandler.clientLanguage) { // L: 3086
						if (var15.startsWith("wave:")) { // L: 3087
							var7 = 1; // L: 3088
							var3 = var3.substring("wave:".length()); // L: 3089
						} else if (var15.startsWith("wave2:")) { // L: 3091
							var7 = 2; // L: 3092
							var3 = var3.substring("wave2:".length()); // L: 3093
						} else if (var15.startsWith("shake:")) { // L: 3095
							var7 = 3; // L: 3096
							var3 = var3.substring("shake:".length()); // L: 3097
						} else if (var15.startsWith("scroll:")) { // L: 3099
							var7 = 4; // L: 3100
							var3 = var3.substring("scroll:".length()); // L: 3101
						} else if (var15.startsWith("slide:")) { // L: 3103
							var7 = 5; // L: 3104
							var3 = var3.substring("slide:".length()); // L: 3105
						}
					}

					PacketBufferNode var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher); // L: 3109
					var8.packetBuffer.writeByte(0); // L: 3110
					int var9 = var8.packetBuffer.offset; // L: 3111
					var8.packetBuffer.writeByte(var11); // L: 3112
					var8.packetBuffer.writeByte(var17); // L: 3113
					var8.packetBuffer.writeByte(var7); // L: 3114
					UrlRequester.method3383(var8.packetBuffer, var3); // L: 3115
					var8.packetBuffer.writeLengthByte(var8.packetBuffer.offset - var9); // L: 3116
					Client.packetWriter.addNode(var8); // L: 3117
					return 1; // L: 3118
				} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3120
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3121
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3122
					String var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3123
					PacketBufferNode var5 = ItemContainer.getPacketBufferNode(ClientPacket.field2230, Client.packetWriter.isaacCipher); // L: 3125
					var5.packetBuffer.writeShort(0); // L: 3126
					int var6 = var5.packetBuffer.offset; // L: 3127
					var5.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 3128
					UrlRequester.method3383(var5.packetBuffer, var4); // L: 3129
					var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6); // L: 3130
					Client.packetWriter.addNode(var5); // L: 3131
					return 1; // L: 3132
				} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3134
					if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3141
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3142
						return 1; // L: 3143
					} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3145
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3146
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Canvas.Messages_getHistorySize(var10); // L: 3147
						return 1; // L: 3148
					} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3150
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3151
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Calendar.Messages_getNextChatID(var10); // L: 3152
						return 1; // L: 3153
					} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3155
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3156
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class39.Messages_getLastChatID(var10); // L: 3157
						return 1; // L: 3158
					} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3160
						var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3161
						SecureRandomCallable.doCheat(var3); // L: 3162
						return 1; // L: 3163
					} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3165
						Client.field871 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3166
						return 1; // L: 3167
					} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3169
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field871; // L: 3170
						return 1; // L: 3171
					} else if (var0 == ScriptOpcodes.DEBUGMES) { // L: 3173
						var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3174
						System.out.println(var3); // L: 3175
						return 1; // L: 3176
					} else {
						return 2; // L: 3178
					}
				} else {
					if (PlayerComposition.localPlayer != null && PlayerComposition.localPlayer.username != null) { // L: 3136
						var3 = PlayerComposition.localPlayer.username.getName();
					} else {
						var3 = ""; // L: 3137
					}

					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 3138
					return 1; // L: 3139
				}
			}
		}
	}
}
