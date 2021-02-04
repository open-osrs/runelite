import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;I)I",
		garbageValue = "-617956062"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "62"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2791
			GameEngine.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2792
			GameEngine.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2793
			GameEngine.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2794
			Login.loginIndex = 3; // L: 2795
			Login.field1190 = 1; // L: 2796
		} else if (var0 == 4) { // L: 2798
			Login.loginIndex = 12; // L: 2800
			Login.field1199 = 0; // L: 2801
		} else if (var0 == 5) { // L: 2804
			Login.field1190 = 2; // L: 2805
			GameEngine.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2806
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2808
			if (var0 == 7) { // L: 2811
				GameEngine.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2812
				GameEngine.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2813
				GameEngine.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2814
				GameEngine.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2815
				GameEngine.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2816
				GameEngine.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2817
				GameEngine.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2818
				GameEngine.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2819
				GameEngine.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2820
				GameEngine.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 2821
				Login.loginIndex = 12; // L: 2823
				Login.field1199 = 1; // L: 2824
			} else if (var0 == 19) { // L: 2827
				GameEngine.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2828
				GameEngine.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2829
				GameEngine.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2830
				GameEngine.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2831
				GameEngine.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2832
				GameEngine.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2833
				GameEngine.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2834
				GameEngine.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2835
				GameEngine.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				GameEngine.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system."); // L: 2836
			} else if (var0 == 37) { // L: 2837
				GameEngine.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2838
				GameEngine.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2839
				Login.loginIndex = 8; // L: 2840
			} else {
				if (var0 == 56) { // L: 2842
					GameEngine.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2843
					WorldMapCacheName.updateGameState(11); // L: 2844
					return; // L: 2845
				}

				if (var0 == 57) { // L: 2847
					GameEngine.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2848
					WorldMapCacheName.updateGameState(11); // L: 2849
					return; // L: 2850
				}

				if (var0 == 61) { // L: 2852
					Login.loginIndex = 7; // L: 2853
				} else {
					GameEngine.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2855
				}
			}
		} else {
			GameEngine.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2809
		}

		WorldMapCacheName.updateGameState(10); // L: 2856
	} // L: 2857
}
