import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("bu")
	static String field256;
	@ObfuscatedName("hz")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -961973477
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1923363369
	)
	@Export("id")
	int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -311842773
	)
	@Export("size")
	int size;
	@ObfuscatedName("s")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("e")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("r")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("o")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("i")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("w")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-116"
	)
	public static void method631() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 69
	} // L: 70

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-321975416"
	)
	public static int method630(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 85 86 89
			var2 = var2 << 1 | var0 & 1; // L: 87
			var0 >>>= 1; // L: 88
		}

		return var2; // L: 91
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "1776722764"
	)
	static int method629(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 2835
			Interpreter.Interpreter_intStackSize -= 2; // L: 2836
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2837
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2838
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var3; // L: 2839
			return 1; // L: 2840
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2842
			Interpreter.Interpreter_intStackSize -= 2; // L: 2843
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2844
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2845
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 - var4; // L: 2846
			return 1; // L: 2847
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2849
			Interpreter.Interpreter_intStackSize -= 2; // L: 2850
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2851
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2852
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var3; // L: 2853
			return 1; // L: 2854
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2856
			Interpreter.Interpreter_intStackSize -= 2; // L: 2857
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2858
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2859
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 / var4; // L: 2860
			return 1; // L: 2861
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2863
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2864
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 2865
			return 1; // L: 2866
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2868
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2869
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 2870
			return 1; // L: 2871
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2873
				Interpreter.Interpreter_intStackSize -= 5; // L: 2874
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2875
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2876
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2877
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2878
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2879
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5); // L: 2880
				return 1; // L: 2881
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2883
				Interpreter.Interpreter_intStackSize -= 2; // L: 2884
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2885
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2886
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100; // L: 2887
				return 1; // L: 2888
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2890
				Interpreter.Interpreter_intStackSize -= 2; // L: 2891
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2892
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2893
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 2894
				return 1; // L: 2895
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2897
				Interpreter.Interpreter_intStackSize -= 2; // L: 2898
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2899
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2900
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 2901
				return 1; // L: 2902
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2904
				Interpreter.Interpreter_intStackSize -= 2; // L: 2905
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2906
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2907
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 2908
				return 1; // L: 2909
			} else if (var0 == ScriptOpcodes.MOD) { // L: 2911
				Interpreter.Interpreter_intStackSize -= 2; // L: 2912
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2913
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2914
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 % var4; // L: 2915
				return 1; // L: 2916
			} else if (var0 == ScriptOpcodes.POW) { // L: 2918
				Interpreter.Interpreter_intStackSize -= 2; // L: 2919
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2920
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2921
				if (var3 == 0) { // L: 2922
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 2923
				}

				return 1; // L: 2924
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2926
				Interpreter.Interpreter_intStackSize -= 2; // L: 2927
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2928
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2929
				if (var3 == 0) { // L: 2930
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2931
					return 1; // L: 2932
				} else {
					switch(var4) { // L: 2934
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2937
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2947
						break; // L: 2948
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 2942
						break; // L: 2943
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 2952
						break; // L: 2953
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 2957
						break; // L: 2958
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 2962
					}

					return 1; // L: 2966
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 2968
				Interpreter.Interpreter_intStackSize -= 2; // L: 2969
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2970
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2971
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & var4; // L: 2972
				return 1; // L: 2973
			} else if (var0 == ScriptOpcodes.OR) { // L: 2975
				Interpreter.Interpreter_intStackSize -= 2; // L: 2976
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2977
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2978
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4; // L: 2979
				return 1; // L: 2980
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 2982
				Interpreter.Interpreter_intStackSize -= 3; // L: 2983
				long var9 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2984
				long var11 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2985
				long var13 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2986
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 2987
				return 1; // L: 2988
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 2990
				var3 = class9.method67(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2991
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2992
				return 1; // L: 2993
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 2995
				Interpreter.Interpreter_intStackSize -= 2; // L: 2996
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2997
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2998
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 2999
				return 1; // L: 3000
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3002
				Interpreter.Interpreter_intStackSize -= 3; // L: 3003
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3004
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3005
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3006
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPreferences.method2237(var3, var4, var5); // L: 3007
				return 1; // L: 3008
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3010
				Interpreter.Interpreter_intStackSize -= 3; // L: 3011
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3012
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3013
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3014
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanChannelMember.method2770(var3, var4, var5); // L: 3015
				return 1; // L: 3016
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3018
				Interpreter.Interpreter_intStackSize -= 3; // L: 3019
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3020
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3021
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3022
				var6 = 31 - var5; // L: 3023
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 3024
				return 1; // L: 3025
			} else if (var0 == 4030) { // L: 3027
				Interpreter.Interpreter_intStackSize -= 4; // L: 3028
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3029
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3030
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3031
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3032
				var3 = ClanChannelMember.method2770(var3, var5, var6); // L: 3033
				var7 = class125.method2741(var6 - var5 + 1); // L: 3034
				if (var4 > var7) { // L: 3035
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3036
				return 1; // L: 3037
			} else if (var0 == 4032) { // L: 3039
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class278.method5319(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3040
				return 1; // L: 3041
			} else if (var0 == 4033) { // L: 3043
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = UrlRequest.method2432(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3044
				return 1; // L: 3045
			} else if (var0 == 4034) { // L: 3047
				Interpreter.Interpreter_intStackSize -= 2; // L: 3048
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3049
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3050
				var5 = class341.method6227(var3, var4); // L: 3051
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3052
				return 1; // L: 3053
			} else if (var0 == 4035) { // L: 3055
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3056
				return 1; // L: 3057
			} else {
				return 2; // L: 3059
			}
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIIB)V",
		garbageValue = "23"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class122.playPcmPlayers(); // L: 11750
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11751
		if (var4 != null) { // L: 11752
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11753
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11754
				int var5 = Client.camAngleY & 2047; // L: 11755
				int var6 = WorldMapSprite.localPlayer.x / 32 + 48; // L: 11756
				int var7 = 464 - WorldMapSprite.localPlayer.y / 32; // L: 11757
				class414.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11758

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11759
					var16 = Client.mapIconXs[var8] * 4 + 2 - WorldMapSprite.localPlayer.x / 32; // L: 11760
					var10 = Client.mapIconYs[var8] * 4 + 2 - WorldMapSprite.localPlayer.y / 32; // L: 11761
					Interpreter.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11762
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11764
					for (var16 = 0; var16 < 104; ++var16) { // L: 11765
						NodeDeque var14 = Client.groundItems[SoundSystem.Client_plane][var8][var16]; // L: 11766
						if (var14 != null) { // L: 11767
							var11 = var8 * 4 + 2 - WorldMapSprite.localPlayer.x / 32; // L: 11768
							var12 = var16 * 4 + 2 - WorldMapSprite.localPlayer.y / 32; // L: 11769
							Interpreter.drawSpriteOnMinimap(var1, var2, var11, var12, Huffman.mapDotSprites[0], var4); // L: 11770
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11774
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11775
					if (var9 != null && var9.isVisible()) { // L: 11776
						NPCComposition var18 = var9.definition; // L: 11777
						if (var18 != null && var18.transforms != null) { // L: 11778
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11779
							var11 = var9.x / 32 - WorldMapSprite.localPlayer.x / 32; // L: 11780
							var12 = var9.y / 32 - WorldMapSprite.localPlayer.y / 32; // L: 11781
							Interpreter.drawSpriteOnMinimap(var1, var2, var11, var12, Huffman.mapDotSprites[1], var4); // L: 11782
						}
					}
				}

				var8 = Players.Players_count; // L: 11786
				int[] var17 = Players.Players_indices; // L: 11787

				for (var10 = 0; var10 < var8; ++var10) { // L: 11788
					Player var15 = Client.players[var17[var10]]; // L: 11789
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != WorldMapSprite.localPlayer) { // L: 11790
						var12 = var15.x / 32 - WorldMapSprite.localPlayer.x / 32; // L: 11791
						int var13 = var15.y / 32 - WorldMapSprite.localPlayer.y / 32; // L: 11792
						if (var15.isFriend()) { // L: 11793
							Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[3], var4);
						} else if (WorldMapSprite.localPlayer.team != 0 && var15.team != 0 && var15.team == WorldMapSprite.localPlayer.team) { // L: 11794
							Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11795
							Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11796
							Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[6], var4);
						} else {
							Interpreter.drawSpriteOnMinimap(var1, var2, var12, var13, Huffman.mapDotSprites[2], var4); // L: 11797
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11800
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11801
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11802
						if (var19 != null) { // L: 11803
							var11 = var19.x / 32 - WorldMapSprite.localPlayer.x / 32; // L: 11804
							var12 = var19.y / 32 - WorldMapSprite.localPlayer.y / 32; // L: 11805
							class12.worldToMinimap(var1, var2, var11, var12, Varcs.mapMarkerSprites[1], var4); // L: 11806
						}
					}

					if (Client.hintArrowType == 2) { // L: 11809
						var10 = Client.hintArrowX * 4 - Canvas.baseX * 4 + 2 - WorldMapSprite.localPlayer.x / 32; // L: 11810
						var11 = Client.hintArrowY * 4 - class118.baseY * 4 + 2 - WorldMapSprite.localPlayer.y / 32; // L: 11811
						class12.worldToMinimap(var1, var2, var10, var11, Varcs.mapMarkerSprites[1], var4); // L: 11812
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11814
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11815
						if (var20 != null) { // L: 11816
							var11 = var20.x / 32 - WorldMapSprite.localPlayer.x / 32; // L: 11817
							var12 = var20.y / 32 - WorldMapSprite.localPlayer.y / 32; // L: 11818
							class12.worldToMinimap(var1, var2, var11, var12, Varcs.mapMarkerSprites[1], var4); // L: 11819
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11823
					var10 = Client.destinationX * 4 + 2 - WorldMapSprite.localPlayer.x / 32; // L: 11824
					var11 = Client.destinationY * 4 + 2 - WorldMapSprite.localPlayer.y / 32; // L: 11825
					Interpreter.drawSpriteOnMinimap(var1, var2, var10, var11, Varcs.mapMarkerSprites[0], var4); // L: 11826
				}

				if (!WorldMapSprite.localPlayer.isHidden) { // L: 11828
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11830
			}

			Client.field714[var3] = true; // L: 11831
		}
	} // L: 11832
}
