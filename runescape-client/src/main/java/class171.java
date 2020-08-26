import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fi")
public class class171 implements class170 {
	@ObfuscatedName("x")
	static byte[][][] field2049;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1487282942"
	)
	public static void method3543() {
		class105.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "-94"
	)
	static int method3544(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 2822
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 2823
			return 1; // L: 2824
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 2826
			Interpreter.Interpreter_intStackSize -= 3; // L: 2827
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2828
			Player.privateChatMode = TileItem.method2202(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2829
			if (Player.privateChatMode == null) { // L: 2830
				Player.privateChatMode = PrivateChatMode.field3821;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2831
			PacketBufferNode var18 = Client.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher); // L: 2833
			var18.packetBuffer.writeByte(Client.publicChatMode); // L: 2834
			var18.packetBuffer.writeByte(Player.privateChatMode.field3824); // L: 2835
			var18.packetBuffer.writeByte(Client.tradeChatMode); // L: 2836
			Client.packetWriter.addNode(var18); // L: 2837
			return 1; // L: 2838
		} else {
			String var3;
			int var11;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 2840
				var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2841
				Interpreter.Interpreter_intStackSize -= 2; // L: 2842
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2843
				int var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2844
				PacketBufferNode var13 = Client.getPacketBufferNode(ClientPacket.field2273, Client.packetWriter.isaacCipher); // L: 2846
				var13.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var3) + 2); // L: 2847
				var13.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 2848
				var13.packetBuffer.writeByte(var11 - 1); // L: 2849
				var13.packetBuffer.writeByte(var12); // L: 2850
				Client.packetWriter.addNode(var13); // L: 2851
				return 1; // L: 2852
			} else {
				int var10;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 2854
					Interpreter.Interpreter_intStackSize -= 2; // L: 2855
					var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2856
					var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2857
					Message var16 = WorldMapCacheName.Messages_getByChannelAndID(var10, var11); // L: 2858
					if (var16 != null) { // L: 2859
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.count; // L: 2860
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.cycle; // L: 2861
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var16.sender != null ? var16.sender : ""; // L: 2862
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var16.prefix != null ? var16.prefix : ""; // L: 2863
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var16.text != null ? var16.text : ""; // L: 2864
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.isFromFriend() ? 1 : (var16.isFromIgnored() ? 2 : 0); // L: 2865
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 2868
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2869
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2870
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2871
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2872
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2873
					}

					return 1; // L: 2875
				} else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 2877
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2878
					Message var14 = WorldMapSection2.Messages_getMessage(var10); // L: 2879
					if (var14 != null) { // L: 2880
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.type; // L: 2881
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.cycle; // L: 2882
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var14.sender != null ? var14.sender : ""; // L: 2883
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var14.prefix != null ? var14.prefix : ""; // L: 2884
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var14.text != null ? var14.text : ""; // L: 2885
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.isFromFriend() ? 1 : (var14.isFromIgnored() ? 2 : 0); // L: 2886
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 2889
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2890
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2891
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2892
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2893
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2894
					}

					return 1; // L: 2896
				} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 2898
					if (Player.privateChatMode == null) { // L: 2899
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.privateChatMode.field3824; // L: 2900
					}

					return 1; // L: 2901
				} else if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 2903
					var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2904
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2905
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
					} else if (class58.clientLanguage != Language.Language_EN) { // L: 2956
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
					} else if (class58.clientLanguage != Language.Language_EN) { // L: 3028
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

					PacketBufferNode var8 = Client.getPacketBufferNode(ClientPacket.field2342, Client.packetWriter.isaacCipher); // L: 3051
					var8.packetBuffer.writeByte(0); // L: 3052
					int var9 = var8.packetBuffer.offset; // L: 3053
					var8.packetBuffer.writeByte(var11); // L: 3054
					var8.packetBuffer.writeByte(var17); // L: 3055
					var8.packetBuffer.writeByte(var7); // L: 3056
					Player.method1326(var8.packetBuffer, var3); // L: 3057
					var8.packetBuffer.writeLengthByte(var8.packetBuffer.offset - var9); // L: 3058
					Client.packetWriter.addNode(var8); // L: 3059
					return 1; // L: 3060
				} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3062
					Varps.Interpreter_stringStackSize -= 2; // L: 3063
					var3 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize]; // L: 3064
					String var4 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1]; // L: 3065
					PacketBufferNode var5 = Client.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher); // L: 3067
					var5.packetBuffer.writeShort(0); // L: 3068
					int var6 = var5.packetBuffer.offset; // L: 3069
					var5.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 3070
					Player.method1326(var5.packetBuffer, var4); // L: 3071
					var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6); // L: 3072
					Client.packetWriter.addNode(var5); // L: 3073
					return 1; // L: 3074
				} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3076
					if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3083
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3084
						return 1; // L: 3085
					} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3087
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3088
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomFuture.Messages_getHistorySize(var10); // L: 3089
						return 1; // L: 3090
					} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3092
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3093
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBar.Messages_getNextChatID(var10); // L: 3094
						return 1; // L: 3095
					} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3097
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3098
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.Messages_getLastChatID(var10); // L: 3099
						return 1; // L: 3100
					} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3102
						var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 3103
						WorldMapSection2.doCheat(var3); // L: 3104
						return 1; // L: 3105
					} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3107
						Client.field913 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3108
						return 1; // L: 3109
					} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3111
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Client.field913; // L: 3112
						return 1; // L: 3113
					} else if (var0 == ScriptOpcodes.DEBUGMES) { // L: 3115
						var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 3116
						System.out.println(var3); // L: 3117
						return 1; // L: 3118
					} else {
						return 2; // L: 3120
					}
				} else {
					if (WorldMapLabelSize.localPlayer != null && WorldMapLabelSize.localPlayer.username != null) { // L: 3078
						var3 = WorldMapLabelSize.localPlayer.username.getName();
					} else {
						var3 = ""; // L: 3079
					}

					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3; // L: 3080
					return 1; // L: 3081
				}
			}
		}
	}
}
