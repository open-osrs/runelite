import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("uq")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1104135589
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("i")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("f")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "74"
	)
	static int method1085(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3917
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TileItem.loadWorlds() ? 1 : 0; // L: 3918
			return 1; // L: 3919
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3921
				var9 = SecureRandomCallable.worldListStart(); // L: 3922
				if (var9 != null) { // L: 3923
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3924
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3925
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var9.activity; // L: 3926
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3927
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3928
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var9.host; // L: 3929
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3932
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3933
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3934
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3935
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3936
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3937
				}

				return 1; // L: 3939
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3941
				var9 = class305.getNextWorldListWorld(); // L: 3942
				if (var9 != null) { // L: 3943
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3944
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3945
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var9.activity; // L: 3946
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3947
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3948
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var9.host; // L: 3949
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3952
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3953
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3954
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3955
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3956
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3957
				}

				return 1; // L: 3959
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3961
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3962
					var7 = null; // L: 3963

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3964
						if (var3 == DevicePcmPlayerProvider.World_worlds[var8].id) { // L: 3965
							var7 = DevicePcmPlayerProvider.World_worlds[var8]; // L: 3966
							break;
						}
					}

					if (var7 != null) { // L: 3970
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3971
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3972
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var7.activity; // L: 3973
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3974
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3975
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var7.host; // L: 3976
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3979
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3980
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3981
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3982
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3983
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3984
					}

					return 1; // L: 3986
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3988
					Interpreter.Interpreter_intStackSize -= 4; // L: 3989
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3990
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3991
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3992
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 3993
					class204.sortWorldList(var3, var10, var8, var6); // L: 3994
					return 1; // L: 3995
				} else if (var0 != 6511) { // L: 3997
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4018
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4019
						return 1; // L: 4020
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4022
							Interpreter.Interpreter_intStackSize -= 2; // L: 4023
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4024
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4025
							var5 = class151.getParamDefinition(var4); // L: 4026
							if (var5.isString()) { // L: 4027
								Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = KeyHandler.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4028
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KeyHandler.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4031
							}

							return 1; // L: 4033
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4035
							Interpreter.Interpreter_intStackSize -= 2; // L: 4036
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4037
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4038
							var5 = class151.getParamDefinition(var4); // L: 4039
							if (var5.isString()) { // L: 4040
								Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = class146.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4041
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class146.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4044
							}

							return 1; // L: 4046
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4048
							Interpreter.Interpreter_intStackSize -= 2; // L: 4049
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4050
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4051
							var5 = class151.getParamDefinition(var4); // L: 4052
							if (var5.isString()) { // L: 4053
								Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = class19.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4054
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4057
							}

							return 1; // L: 4059
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4061
							Interpreter.Interpreter_intStackSize -= 2; // L: 4062
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4063
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4064
							var5 = class151.getParamDefinition(var4); // L: 4065
							if (var5.isString()) { // L: 4066
								Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ObjectComposition.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4067
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectComposition.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4070
							}

							return 1; // L: 4072
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4074
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4075
							return 1; // L: 4076
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4078
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 4079
							return 1; // L: 4080
						} else if (var0 == 6520) { // L: 4082
							return 1; // L: 4083
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4085
							return 1; // L: 4086
						} else if (var0 == 6522) { // L: 4088
							--class122.Interpreter_stringStackSize; // L: 4089
							--Interpreter.Interpreter_intStackSize; // L: 4090
							return 1; // L: 4091
						} else if (var0 == 6523) { // L: 4093
							--class122.Interpreter_stringStackSize; // L: 4094
							--Interpreter.Interpreter_intStackSize; // L: 4095
							return 1; // L: 4096
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4098
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4099
							return 1; // L: 4100
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4102
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4103
							return 1; // L: 4104
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4106
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4107
							return 1; // L: 4108
						} else if (var0 == 6527) { // L: 4110
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field498; // L: 4111
							return 1; // L: 4112
						} else {
							return 2; // L: 4114
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3998
					if (var3 >= 0 && var3 < World.World_count) { // L: 3999
						var7 = DevicePcmPlayerProvider.World_worlds[var3]; // L: 4000
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4001
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4002
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var7.activity; // L: 4003
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4004
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4005
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var7.host; // L: 4006
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4009
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4010
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 4011
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4012
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4013
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 4014
					}

					return 1; // L: 4016
				}
			}
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "377425883"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2764
			class4.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2765
			class4.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2766
			class4.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2767
			Ignored.method6828(3); // L: 2768
			Login.field895 = 1; // L: 2769
		} else if (var0 == 4) { // L: 2771
			class267.method5196(0); // L: 2772
		} else if (var0 == 5) { // L: 2774
			Login.field895 = 2; // L: 2775
			class4.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2776
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 2778
			class4.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2779
		} else if (var0 == 7) { // L: 2781
			class4.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2782
			class4.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2783
			class4.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2784
			class4.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2785
			class4.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2786
			class4.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2787
			class4.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2788
			class4.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2789
			class4.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) { // L: 2790
			class4.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) { // L: 2791
			class267.method5196(1); // L: 2792
		} else if (var0 == 19) { // L: 2794
			class4.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2795
			class4.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2796
			class4.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2797
			class4.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2798
			class4.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2799
			class4.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2800
			class4.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2801
			class4.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2802
			class4.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2803
			class4.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) { // L: 2804
			class4.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2805
			class4.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2806
			Ignored.method6828(8); // L: 2807
		} else {
			if (var0 == 56) { // L: 2809
				class4.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2810
				Decimator.updateGameState(11); // L: 2811
				return; // L: 2812
			}

			if (var0 == 57) { // L: 2814
				class4.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2815
				Decimator.updateGameState(11); // L: 2816
				return; // L: 2817
			}

			if (var0 == 61) { // L: 2819
				class4.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2820
				Ignored.method6828(7); // L: 2821
			} else {
				if (var0 == 62) { // L: 2823
					Decimator.updateGameState(10); // L: 2824
					Ignored.method6828(9); // L: 2825
					class4.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2826
					return; // L: 2827
				}

				if (var0 == 63) { // L: 2829
					Decimator.updateGameState(10); // L: 2830
					Ignored.method6828(9); // L: 2831
					class4.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2832
					return; // L: 2833
				}

				if (var0 == 65 || var0 == 67) { // L: 2835
					Decimator.updateGameState(10); // L: 2836
					Ignored.method6828(9); // L: 2837
					class4.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2838
					return; // L: 2839
				}

				if (var0 == 71) { // L: 2841
					Decimator.updateGameState(10); // L: 2842
					Ignored.method6828(7); // L: 2843
					class4.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2844
				} else {
					class4.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2846
				}
			}
		}

		Decimator.updateGameState(10); // L: 2847
		if (Client.field532.method7928()) { // L: 2848
			Ignored.method6828(9); // L: 2849
		}

	} // L: 2851

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lcb;IIIIII)V",
		garbageValue = "692099527"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4877
			if (var0 instanceof NPC) { // L: 4878
				NPCComposition var6 = ((NPC)var0).definition; // L: 4879
				if (var6.transforms != null) { // L: 4880
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4881
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4883
			int[] var7 = Players.Players_indices; // L: 4884
			byte var8 = 0; // L: 4885
			if (var1 < var75 && var0.playerCycle == Client.cycle && PacketBufferNode.method5188((Player)var0)) { // L: 4886
				Player var9 = (Player)var0; // L: 4887
				if (var1 < var75) { // L: 4888
					class93.method2376(var0, var0.defaultHeight + 15); // L: 4889
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4890
					byte var11 = 9; // L: 4891
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 4892
					var8 = 18; // L: 4893
				}
			}

			int var76 = -2; // L: 4896
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6164()) { // L: 4897
				class93.method2376(var0, var0.defaultHeight + 15); // L: 4898

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 4899
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 4900
					if (var79 == null) { // L: 4901
						if (var87.isEmpty()) { // L: 4959
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 4902
						SpritePixels var13 = var80.getBackSprite(); // L: 4903
						SpritePixels var81 = var80.getFrontSprite(); // L: 4904
						int var82 = 0; // L: 4906
						if (var13 != null && var81 != null) { // L: 4907
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 4908
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4909
						} else {
							var15 = var80.width; // L: 4911
						}

						int var17 = 255; // L: 4912
						boolean var83 = true; // L: 4913
						int var84 = Client.cycle - var79.cycle; // L: 4914
						int var85 = var15 * var79.health2 / var80.width; // L: 4915
						int var86;
						int var93;
						if (var79.cycleOffset > var84) { // L: 4916
							var86 = var80.field1866 == 0 ? 0 : var80.field1866 * (var84 / var80.field1866); // L: 4917
							var22 = var15 * var79.health / var80.width; // L: 4918
							var93 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 4919
						} else {
							var93 = var85; // L: 4922
							var86 = var80.int5 + var79.cycleOffset - var84; // L: 4923
							if (var80.int3 >= 0) { // L: 4924
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var93 < 1) { // L: 4926
							var93 = 1;
						}

						if (var13 != null && var81 != null) { // L: 4927
							if (var15 == var93) { // L: 4928
								var93 += var82 * 2;
							} else {
								var93 += var82; // L: 4929
							}

							var86 = var13.subHeight; // L: 4930
							var76 += var86; // L: 4931
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4932
							var23 = var3 + Client.viewportTempY - var76; // L: 4933
							var22 -= var82; // L: 4934
							if (var17 >= 0 && var17 < 255) { // L: 4935
								var13.drawTransAt(var22, var23, var17); // L: 4936
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var93, var86 + var23); // L: 4937
								var81.drawTransAt(var22, var23, var17); // L: 4938
							} else {
								var13.drawTransBgAt(var22, var23); // L: 4941
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var93, var86 + var23); // L: 4942
								var81.drawTransBgAt(var22, var23); // L: 4943
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4945
							var76 += 2; // L: 4946
						} else {
							var76 += 5; // L: 4949
							if (Client.viewportTempX > -1) { // L: 4950
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4951
								var22 = var3 + Client.viewportTempY - var76; // L: 4952
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var93, 5, 65280); // L: 4953
								Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var93, var22, var15 - var93, 5, 16711680); // L: 4954
							}

							var76 += 2; // L: 4956
						}
					}
				}
			}

			if (var76 == -2) { // L: 4962
				var76 += 7;
			}

			var76 += var8; // L: 4963
			if (var1 < var75) { // L: 4964
				Player var88 = (Player)var0; // L: 4965
				if (var88.isHidden) { // L: 4966
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 4967
					class93.method2376(var0, var0.defaultHeight + 15); // L: 4968
					if (Client.viewportTempX > -1) { // L: 4969
						if (var88.headIconPk != -1) { // L: 4970
							var76 += 25; // L: 4971
							class150.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4972
						}

						if (var88.headIconPrayer != -1) { // L: 4974
							var76 += 25; // L: 4975
							WallDecoration.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4976
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4980
					class93.method2376(var0, var0.defaultHeight + 15); // L: 4981
					if (Client.viewportTempX > -1) { // L: 4982
						var76 += InvDefinition.headIconHintSprites[1].subHeight; // L: 4983
						InvDefinition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4984
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 4989
				if (var89.transforms != null) { // L: 4990
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < WallDecoration.headIconPrayerSprites.length) { // L: 4991
					class93.method2376(var0, var0.defaultHeight + 15); // L: 4992
					if (Client.viewportTempX > -1) { // L: 4993
						WallDecoration.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4994
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4997
					class93.method2376(var0, var0.defaultHeight + 15); // L: 4998
					if (Client.viewportTempX > -1) { // L: 4999
						InvDefinition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1130 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5002 5003
				class93.method2376(var0, var0.defaultHeight); // L: 5004
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5005
					Client.overheadTextXOffsets[Client.overheadTextCount] = RouteStrategy.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5006
					Client.overheadTextAscents[Client.overheadTextCount] = RouteStrategy.fontBold12.ascent; // L: 5007
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5008
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5009
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5010
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5011
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5012
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5013
					++Client.overheadTextCount; // L: 5014
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 5018
				int var90 = var0.hitSplatCycles[var77]; // L: 5019
				int var12 = var0.hitSplatTypes[var77]; // L: 5020
				HitSplatDefinition var91 = null; // L: 5021
				int var14 = 0; // L: 5022
				if (var12 >= 0) { // L: 5023
					if (var90 <= Client.cycle) { // L: 5024
						continue;
					}

					var91 = UserComparator3.method2602(var0.hitSplatTypes[var77]); // L: 5025
					var14 = var91.field1998; // L: 5026
					if (var91 != null && var91.transforms != null) { // L: 5027
						var91 = var91.transform(); // L: 5028
						if (var91 == null) { // L: 5029
							var0.hitSplatCycles[var77] = -1; // L: 5030
							continue; // L: 5031
						}
					}
				} else if (var90 < 0) { // L: 5035
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 5036
				HitSplatDefinition var16 = null; // L: 5037
				if (var15 >= 0) { // L: 5038
					var16 = UserComparator3.method2602(var15); // L: 5039
					if (var16 != null && var16.transforms != null) { // L: 5040
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 5042
					if (var91 == null) { // L: 5043
						var0.hitSplatCycles[var77] = -1; // L: 5044
					} else {
						class93.method2376(var0, var0.defaultHeight / 2); // L: 5047
						if (Client.viewportTempX > -1) { // L: 5048
							if (var77 == 1) { // L: 5050
								Client.viewportTempY -= 20; // L: 5051
							}

							if (var77 == 2) { // L: 5053
								Client.viewportTempX -= 15; // L: 5054
								Client.viewportTempY -= 10; // L: 5055
							}

							if (var77 == 3) { // L: 5057
								Client.viewportTempX += 15; // L: 5058
								Client.viewportTempY -= 10; // L: 5059
							}

							SpritePixels var18 = null; // L: 5061
							SpritePixels var19 = null; // L: 5062
							SpritePixels var20 = null; // L: 5063
							SpritePixels var21 = null; // L: 5064
							var22 = 0; // L: 5065
							var23 = 0; // L: 5066
							int var24 = 0; // L: 5067
							int var25 = 0; // L: 5068
							int var26 = 0; // L: 5069
							int var27 = 0; // L: 5070
							int var28 = 0; // L: 5071
							int var29 = 0; // L: 5072
							SpritePixels var30 = null; // L: 5073
							SpritePixels var31 = null; // L: 5074
							SpritePixels var32 = null; // L: 5075
							SpritePixels var33 = null; // L: 5076
							int var34 = 0; // L: 5077
							int var35 = 0; // L: 5078
							int var36 = 0; // L: 5079
							int var37 = 0; // L: 5080
							int var38 = 0; // L: 5081
							int var39 = 0; // L: 5082
							int var40 = 0; // L: 5083
							int var41 = 0; // L: 5084
							int var42 = 0; // L: 5085
							var18 = var91.method3625(); // L: 5086
							int var43;
							if (var18 != null) { // L: 5087
								var22 = var18.subWidth; // L: 5088
								var43 = var18.subHeight; // L: 5089
								if (var43 > var42) { // L: 5090
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5091
							}

							var19 = var91.method3640(); // L: 5093
							if (var19 != null) { // L: 5094
								var23 = var19.subWidth; // L: 5095
								var43 = var19.subHeight; // L: 5096
								if (var43 > var42) { // L: 5097
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5098
							}

							var20 = var91.method3626(); // L: 5100
							if (var20 != null) { // L: 5101
								var24 = var20.subWidth; // L: 5102
								var43 = var20.subHeight; // L: 5103
								if (var43 > var42) { // L: 5104
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5105
							}

							var21 = var91.method3627(); // L: 5107
							if (var21 != null) { // L: 5108
								var25 = var21.subWidth; // L: 5109
								var43 = var21.subHeight; // L: 5110
								if (var43 > var42) { // L: 5111
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5112
							}

							if (var16 != null) { // L: 5114
								var30 = var16.method3625(); // L: 5115
								if (var30 != null) { // L: 5116
									var34 = var30.subWidth; // L: 5117
									var43 = var30.subHeight; // L: 5118
									if (var43 > var42) { // L: 5119
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5120
								}

								var31 = var16.method3640(); // L: 5122
								if (var31 != null) { // L: 5123
									var35 = var31.subWidth; // L: 5124
									var43 = var31.subHeight; // L: 5125
									if (var43 > var42) { // L: 5126
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5127
								}

								var32 = var16.method3626(); // L: 5129
								if (var32 != null) { // L: 5130
									var36 = var32.subWidth; // L: 5131
									var43 = var32.subHeight; // L: 5132
									if (var43 > var42) { // L: 5133
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5134
								}

								var33 = var16.method3627(); // L: 5136
								if (var33 != null) { // L: 5137
									var37 = var33.subWidth; // L: 5138
									var43 = var33.subHeight; // L: 5139
									if (var43 > var42) { // L: 5140
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5141
								}
							}

							Font var78 = var91.getFont(); // L: 5146
							if (var78 == null) { // L: 5147
								var78 = class113.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5148
								var44 = var16.getFont(); // L: 5149
								if (var44 == null) { // L: 5150
									var44 = class113.fontPlain11;
								}
							} else {
								var44 = class113.fontPlain11; // L: 5152
							}

							String var45 = null; // L: 5153
							String var46 = null; // L: 5154
							boolean var47 = false; // L: 5155
							int var48 = 0; // L: 5156
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 5157
							int var92 = var78.stringWidth(var45); // L: 5158
							if (var16 != null) { // L: 5159
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 5160
								var48 = var44.stringWidth(var46); // L: 5161
							}

							int var49 = 0; // L: 5163
							int var50 = 0; // L: 5164
							if (var23 > 0) { // L: 5165
								if (var20 == null && var21 == null) { // L: 5166
									var49 = 1; // L: 5167
								} else {
									var49 = var92 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5169 5170
								if (var32 == null && var33 == null) { // L: 5171
									var50 = 1; // L: 5172
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5175
							int var52 = var51; // L: 5176
							if (var22 > 0) { // L: 5177
								var51 += var22;
							}

							var51 += 2; // L: 5178
							int var53 = var51; // L: 5179
							if (var24 > 0) { // L: 5180
								var51 += var24;
							}

							int var54 = var51; // L: 5181
							int var55 = var51; // L: 5182
							int var56;
							if (var23 > 0) { // L: 5183
								var56 = var23 * var49; // L: 5184
								var51 += var56; // L: 5185
								var55 += (var56 - var92) / 2; // L: 5186
							} else {
								var51 += var92; // L: 5189
							}

							var56 = var51; // L: 5191
							if (var25 > 0) { // L: 5192
								var51 += var25;
							}

							int var57 = 0; // L: 5193
							int var58 = 0; // L: 5194
							int var59 = 0; // L: 5195
							int var60 = 0; // L: 5196
							int var61 = 0; // L: 5197
							int var62;
							if (var16 != null) { // L: 5198
								var51 += 2; // L: 5199
								var57 = var51; // L: 5200
								if (var34 > 0) { // L: 5201
									var51 += var34;
								}

								var51 += 2; // L: 5202
								var58 = var51; // L: 5203
								if (var36 > 0) { // L: 5204
									var51 += var36;
								}

								var59 = var51; // L: 5205
								var61 = var51; // L: 5206
								if (var35 > 0) { // L: 5207
									var62 = var35 * var50; // L: 5208
									var51 += var62; // L: 5209
									var61 += (var62 - var48) / 2; // L: 5210
								} else {
									var51 += var48; // L: 5213
								}

								var60 = var51; // L: 5215
								if (var37 > 0) { // L: 5216
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5218
							int var63 = var91.field2003 - var62 * var91.field2003 / var91.field1998; // L: 5219
							int var64 = var62 * var91.field2004 / var91.field1998 + -var91.field2004; // L: 5220
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5221
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5222
							int var67 = var66; // L: 5223
							int var68 = var42 + var66; // L: 5224
							int var69 = var66 + var91.field2011 + 15; // L: 5225
							int var70 = var69 - var78.maxAscent; // L: 5226
							int var71 = var69 + var78.maxDescent; // L: 5227
							if (var70 < var66) { // L: 5228
								var67 = var70;
							}

							if (var71 > var68) { // L: 5229
								var68 = var71;
							}

							int var72 = 0; // L: 5230
							int var73;
							int var74;
							if (var16 != null) { // L: 5231
								var72 = var66 + var16.field2011 + 15; // L: 5232
								var73 = var72 - var44.maxAscent; // L: 5233
								var74 = var72 + var44.maxDescent; // L: 5234
								if (var73 < var67) { // L: 5235
									;
								}

								if (var74 > var68) { // L: 5236
									;
								}
							}

							var73 = 255; // L: 5238
							if (var91.field2005 >= 0) { // L: 5239
								var73 = (var62 << 8) / (var91.field1998 - var91.field2005);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5240
								if (var18 != null) { // L: 5241
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5242
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5243
									for (var74 = 0; var74 < var49; ++var74) { // L: 5244
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5245
									}
								}

								if (var21 != null) { // L: 5248
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var55 + var65, var69, var91.textColor, 0, var73); // L: 5249
								if (var16 != null) { // L: 5250
									if (var30 != null) { // L: 5251
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5252
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5253
										for (var74 = 0; var74 < var50; ++var74) { // L: 5254
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73); // L: 5255
										}
									}

									if (var33 != null) { // L: 5258
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var16.textColor, 0, var73); // L: 5259
								}
							} else {
								if (var18 != null) { // L: 5263
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5264
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5265
									for (var74 = 0; var74 < var49; ++var74) { // L: 5266
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5267
									}
								}

								if (var21 != null) { // L: 5270
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var78.draw(var45, var55 + var65, var69, var91.textColor | -16777216, 0); // L: 5271
								if (var16 != null) { // L: 5272
									if (var30 != null) { // L: 5273
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5274
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5275
										for (var74 = 0; var74 < var50; ++var74) { // L: 5276
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66); // L: 5277
										}
									}

									if (var33 != null) { // L: 5280
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 5281
								}
							}
						}
					}
				}
			}

		}
	} // L: 5286
}
