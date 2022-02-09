import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class221 implements WorldMapSection {
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static class375 field2680;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1476515463
	)
	int field2690;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 654724429
	)
	int field2687;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1376537717
	)
	int field2681;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -956224345
	)
	int field2679;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1954446807
	)
	int field2688;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 852075819
	)
	int field2684;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1302751213
	)
	int field2685;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 973794983
	)
	int field2683;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1012984099
	)
	int field2686;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1516865303
	)
	int field2682;

	class221() {
	} // L: 18

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "806489369"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2688) { // L: 22
			var1.regionLowX = this.field2688;
		}

		if (var1.regionHighX < this.field2688) {
			var1.regionHighX = this.field2688; // L: 23
		}

		if (var1.regionLowY > this.field2684) { // L: 24
			var1.regionLowY = this.field2684;
		}

		if (var1.regionHighY < this.field2684) { // L: 25
			var1.regionHighY = this.field2684;
		}

	} // L: 26

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1721879281"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2690 && var1 < this.field2690 + this.field2687) { // L: 30
			return var2 >= (this.field2681 << 6) + (this.field2685 << 3) && var2 <= (this.field2681 << 6) + (this.field2685 << 3) + 7 && var3 >= (this.field2679 << 6) + (this.field2683 << 3) && var3 <= (this.field2679 << 6) + (this.field2683 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "898039462"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2688 << 6) + (this.field2686 << 3) && var1 <= (this.field2688 << 6) + (this.field2686 << 3) + 7 && var2 >= (this.field2684 << 6) + (this.field2682 << 3) && var2 <= (this.field2684 << 6) + (this.field2682 << 3) + 7; // L: 38
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "499785766"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.field2688 * 64 - this.field2681 * 64) + (this.field2686 * 8 - this.field2685 * 8), var3 + (this.field2684 * 64 - this.field2679 * 64) + (this.field2682 * 8 - this.field2683 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljd;",
		garbageValue = "90"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2681 * 64 - this.field2688 * 64 + (this.field2685 * 8 - this.field2686 * 8) + var1;
			int var4 = var2 + (this.field2679 * 64 - this.field2684 * 64) + (this.field2683 * 8 - this.field2682 * 8); // L: 58
			return new Coord(this.field2690, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-121"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2690 = var1.readUnsignedByte(); // L: 64
		this.field2687 = var1.readUnsignedByte(); // L: 65
		this.field2681 = var1.readUnsignedShort(); // L: 66
		this.field2685 = var1.readUnsignedByte(); // L: 67
		this.field2679 = var1.readUnsignedShort(); // L: 68
		this.field2683 = var1.readUnsignedByte(); // L: 69
		this.field2688 = var1.readUnsignedShort(); // L: 70
		this.field2686 = var1.readUnsignedByte(); // L: 71
		this.field2684 = var1.readUnsignedShort(); // L: 72
		this.field2682 = var1.readUnsignedByte(); // L: 73
		this.method4647(); // L: 74
	} // L: 75

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	void method4647() {
	} // L: 77

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	public static int method4644() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 57
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2090450299"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2644
			UserComparator7.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2645
			UserComparator7.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2646
			UserComparator7.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2647
			Player.method2159(3); // L: 2648
			Login.field918 = 1; // L: 2649
		} else if (var0 == 4) { // L: 2651
			Player.method2159(14); // L: 2653
			Login.field914 = 0; // L: 2654
		} else if (var0 == 5) { // L: 2657
			Login.field918 = 2; // L: 2658
			UserComparator7.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2659
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 2661
			UserComparator7.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2662
		} else if (var0 == 7) { // L: 2664
			UserComparator7.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2665
			UserComparator7.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2666
			UserComparator7.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2667
			UserComparator7.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2668
			UserComparator7.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2669
			UserComparator7.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2670
			UserComparator7.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2671
			UserComparator7.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2672
			UserComparator7.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) { // L: 2673
			UserComparator7.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) { // L: 2674
			Player.method2159(14); // L: 2676
			Login.field914 = 1; // L: 2677
		} else if (var0 == 19) { // L: 2680
			UserComparator7.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2681
			UserComparator7.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2682
			UserComparator7.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2683
			UserComparator7.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2684
			UserComparator7.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2685
			UserComparator7.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2686
			UserComparator7.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2687
			UserComparator7.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2688
			UserComparator7.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			UserComparator7.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system."); // L: 2689
		} else if (var0 == 37) { // L: 2690
			UserComparator7.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2691
			UserComparator7.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2692
			Player.method2159(8); // L: 2693
		} else {
			if (var0 == 56) { // L: 2695
				UserComparator7.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2696
				class111.updateGameState(11); // L: 2697
				return; // L: 2698
			}

			if (var0 == 57) { // L: 2700
				UserComparator7.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2701
				class111.updateGameState(11); // L: 2702
				return; // L: 2703
			}

			if (var0 == 61) { // L: 2705
				UserComparator7.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2706
				Player.method2159(7); // L: 2707
			} else {
				if (var0 == 62) { // L: 2709
					class111.updateGameState(10); // L: 2710
					Player.method2159(9); // L: 2711
					UserComparator7.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2712
					return; // L: 2713
				}

				if (var0 == 63) { // L: 2715
					class111.updateGameState(10); // L: 2716
					Player.method2159(9); // L: 2717
					UserComparator7.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2718
					return; // L: 2719
				}

				if (var0 == 65 || var0 == 67) { // L: 2721
					class111.updateGameState(10); // L: 2722
					Player.method2159(9); // L: 2723
					UserComparator7.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2724
					return; // L: 2725
				}

				if (var0 == 70) { // L: 2727
					UserComparator7.setLoginResponseString("", "Connecting to server...", ""); // L: 2728
					class111.updateGameState(20); // L: 2729
					WorldMapLabelSize.method4321(0); // L: 2730
					return; // L: 2731
				}

				if (var0 == 71) { // L: 2733
					class111.updateGameState(10); // L: 2734
					Player.method2159(7); // L: 2735
					UserComparator7.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2736
				} else {
					UserComparator7.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2738
				}
			}
		}

		class111.updateGameState(10); // L: 2739
		if (Client.field534.method7628()) { // L: 2740
			Player.method2159(9); // L: 2741
		}

	} // L: 2743
}
