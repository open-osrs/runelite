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
		this.reversed = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;I)I",
		garbageValue = "-617956062"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "62"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			GameShell.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			GameShell.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			GameShell.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field1190 = 1;
		} else if (var0 == 4) {
			Login.loginIndex = 12;
			Login.field1199 = 0;
		} else if (var0 == 5) {
			Login.field1190 = 2;
			GameShell.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				GameShell.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				GameShell.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				GameShell.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				GameShell.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				GameShell.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				GameShell.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				GameShell.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				GameShell.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				GameShell.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				GameShell.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) {
				Login.loginIndex = 12;
				Login.field1199 = 1;
			} else if (var0 == 19) {
				GameShell.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				GameShell.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				GameShell.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				GameShell.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				GameShell.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				GameShell.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				GameShell.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				GameShell.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				GameShell.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				GameShell.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				GameShell.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				GameShell.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				Login.loginIndex = 8;
			} else {
				if (var0 == 56) {
					GameShell.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					WorldMapCacheName.updateGameState(11);
					return;
				}

				if (var0 == 57) {
					GameShell.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					WorldMapCacheName.updateGameState(11);
					return;
				}

				if (var0 == 61) {
					Login.loginIndex = 7;
				} else {
					GameShell.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		} else {
			GameShell.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}

		WorldMapCacheName.updateGameState(10);
	}
}
