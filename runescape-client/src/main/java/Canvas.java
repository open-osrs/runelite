import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("h")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1814972075
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("c")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("q")
	public static boolean method322(long var0) {
		boolean var2 = var0 != 0L; // L: 52
		if (var2) { // L: 53
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 56
			var2 = !var3; // L: 58
		}

		return var2; // L: 60
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lgv;B)V",
		garbageValue = "70"
	)
	static final void method315(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 111
			for (var10 = 0; var10 < 8; ++var10) { // L: 112
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2]; // L: 113
					var10000[var3 + var10] &= -16777217;
				}
			}
		}

		Buffer var13 = new Buffer(var0); // L: 116

		for (var10 = 0; var10 < 4; ++var10) { // L: 117
			for (int var11 = 0; var11 < 64; ++var11) { // L: 118
				for (int var12 = 0; var12 < 64; ++var12) { // L: 119
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 120
						Players.loadTerrain(var13, var1, var2 + class122.method2763(var11 & 7, var12 & 7, var7), var3 + FloorOverlayDefinition.method3818(var11 & 7, var12 & 7, var7), 0, 0, var7); // L: 121
					} else {
						Players.loadTerrain(var13, 0, -1, -1, 0, 0, 0); // L: 123
					}
				}
			}
		}

	} // L: 127

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-113372020"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2788
		if (var0 == -3) { // L: 2791
			class101.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2792
			class101.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2793
			class101.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2794
			WorldMapData_1.method4872(3); // L: 2795
			Login.field902 = 1; // L: 2796
		} else if (var0 == 4) { // L: 2798
			WorldMapData_1.method4872(14); // L: 2800
			Login.field897 = 0; // L: 2801
		} else if (var0 == 5) { // L: 2804
			Login.field902 = 2; // L: 2805
			class101.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2806
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2808
			if (var0 == 7) { // L: 2811
				class101.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2812
				class101.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2813
				class101.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2814
				class101.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2815
				class101.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2816
				class101.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2817
				class101.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2818
				class101.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2819
				class101.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2820
				class101.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) { // L: 2821
				WorldMapData_1.method4872(14); // L: 2823
				Login.field897 = 1; // L: 2824
			} else if (var0 == 19) { // L: 2827
				class101.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2828
				class101.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2829
				class101.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2830
				class101.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2831
				class101.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2832
				class101.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2833
				class101.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2834
				class101.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2835
				class101.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2836
				class101.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) { // L: 2837
				class101.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2838
				class101.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2839
				WorldMapData_1.method4872(8); // L: 2840
			} else {
				if (var0 == 56) { // L: 2842
					class101.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2843
					HealthBarUpdate.updateGameState(11); // L: 2844
					return; // L: 2845
				}

				if (var0 == 57) { // L: 2847
					class101.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2848
					HealthBarUpdate.updateGameState(11); // L: 2849
					return; // L: 2850
				}

				if (var0 == 61) { // L: 2852
					class101.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2853
					WorldMapData_1.method4872(7); // L: 2854
				} else {
					if (var0 == 62) { // L: 2856
						HealthBarUpdate.updateGameState(10); // L: 2857
						WorldMapData_1.method4872(9); // L: 2858
						class101.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2859
						return; // L: 2860
					}

					if (var0 == 63) { // L: 2862
						HealthBarUpdate.updateGameState(10); // L: 2863
						WorldMapData_1.method4872(9); // L: 2864
						class101.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2865
						return; // L: 2866
					}

					if (var0 == 65 || var0 == 67) { // L: 2868
						HealthBarUpdate.updateGameState(10); // L: 2869
						WorldMapData_1.method4872(9); // L: 2870
						class101.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2871
						return; // L: 2872
					}

					if (var0 == 71) { // L: 2874
						HealthBarUpdate.updateGameState(10); // L: 2875
						WorldMapData_1.method4872(7); // L: 2876
						class101.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2877
					} else if (var0 == 73) { // L: 2879
						HealthBarUpdate.updateGameState(10); // L: 2880
						WorldMapData_1.method4872(6); // L: 2881
						class101.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2882
					} else if (var0 == 72) { // L: 2884
						HealthBarUpdate.updateGameState(10); // L: 2885
						WorldMapData_1.method4872(26); // L: 2886
					} else {
						class101.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2888
					}
				}
			}
		} else {
			class101.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2809
		}

		HealthBarUpdate.updateGameState(10); // L: 2889
		int var4 = Login.loginIndex; // L: 2893
		boolean var5 = var4 != var1; // L: 2895
		if (!var5 && Client.field516.method8008()) { // L: 2896
			WorldMapData_1.method4872(9); // L: 2897
		}

	} // L: 2899

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-525734760"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7757

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7758 7759 7764
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7760
				var9 = var10; // L: 7761
				break;
			}
		}

		if (var9 == null) { // L: 7766
			var9 = new PendingSpawn(); // L: 7767
			var9.plane = var0; // L: 7768
			var9.type = var3; // L: 7769
			var9.x = var1; // L: 7770
			var9.y = var2; // L: 7771
			class151.method3146(var9); // L: 7772
			Client.pendingSpawns.addFirst(var9); // L: 7773
		}

		var9.id = var4; // L: 7775
		var9.field1125 = var5; // L: 7776
		var9.orientation = var6; // L: 7777
		var9.delay = var7; // L: 7778
		var9.hitpoints = var8; // L: 7779
	} // L: 7780

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)I",
		garbageValue = "9"
	)
	static final int method319(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10788
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10790
				int var3 = 0; // L: 10791
				int var4 = 0; // L: 10792
				byte var5 = 0; // L: 10793

				while (true) {
					int var6 = var2[var4++]; // L: 10795
					int var7 = 0; // L: 10796
					byte var8 = 0; // L: 10797
					if (var6 == 0) { // L: 10798
						return var3;
					}

					if (var6 == 1) { // L: 10799
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10800
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10801
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10802
						var9 = var2[var4++] << 16; // L: 10803
						var9 += var2[var4++]; // L: 10804
						var10 = class140.getWidget(var9); // L: 10805
						var11 = var2[var4++]; // L: 10806
						if (var11 != -1 && (!EnumComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10807
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10808
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10809
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10813
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10814
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10815
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10816
						var7 = class101.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10817
						for (var9 = 0; var9 < 25; ++var9) { // L: 10818
							if (Skills.Skills_enabled[var9]) { // L: 10819
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10822
						var9 = var2[var4++] << 16; // L: 10823
						var9 += var2[var4++]; // L: 10824
						var10 = class140.getWidget(var9); // L: 10825
						var11 = var2[var4++]; // L: 10826
						if (var11 != -1 && (!EnumComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10827
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10828
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10829
									var7 = 999999999; // L: 10830
									break; // L: 10831
								}
							}
						}
					}

					if (var6 == 11) { // L: 10836
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10837
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10838
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10839
						int var13 = var2[var4++]; // L: 10840
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10841
					}

					if (var6 == 14) { // L: 10843
						var9 = var2[var4++]; // L: 10844
						var7 = class388.getVarbit(var9); // L: 10845
					}

					if (var6 == 15) { // L: 10847
						var8 = 1;
					}

					if (var6 == 16) { // L: 10848
						var8 = 2;
					}

					if (var6 == 17) { // L: 10849
						var8 = 3;
					}

					if (var6 == 18) { // L: 10850
						var7 = (class101.localPlayer.x >> 7) + class28.baseX;
					}

					if (var6 == 19) { // L: 10851
						var7 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY;
					}

					if (var6 == 20) { // L: 10852
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10853
						if (var5 == 0) { // L: 10854
							var3 += var7;
						}

						if (var5 == 1) { // L: 10855
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10856
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10857
							var3 *= var7;
						}

						var5 = 0; // L: 10858
					} else {
						var5 = var8; // L: 10860
					}
				}
			} catch (Exception var14) { // L: 10863
				return -1; // L: 10864
			}
		} else {
			return -2;
		}
	}
}
