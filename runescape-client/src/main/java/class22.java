import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class22 {
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1318000387
	)
	static int field104;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "4320081"
	)
	public static int method227(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1618940930"
	)
	static void method225() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "1"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			MusicPatchPcmStream.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			MusicPatchPcmStream.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			MusicPatchPcmStream.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field1213 = 1;
		} else if (var0 == 4) {
			Buddy.method5349(0);
		} else if (var0 == 5) {
			Login.field1213 = 2;
			MusicPatchPcmStream.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			MusicPatchPcmStream.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			MusicPatchPcmStream.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			MusicPatchPcmStream.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			MusicPatchPcmStream.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			MusicPatchPcmStream.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			MusicPatchPcmStream.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			MusicPatchPcmStream.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			MusicPatchPcmStream.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			MusicPatchPcmStream.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			MusicPatchPcmStream.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			MusicPatchPcmStream.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			Buddy.method5349(1);
		} else if (var0 == 19) {
			MusicPatchPcmStream.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			MusicPatchPcmStream.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			MusicPatchPcmStream.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			MusicPatchPcmStream.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			MusicPatchPcmStream.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			MusicPatchPcmStream.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			MusicPatchPcmStream.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			MusicPatchPcmStream.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			MusicPatchPcmStream.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			MusicPatchPcmStream.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			MusicPatchPcmStream.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			MusicPatchPcmStream.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			Login.loginIndex = 8;
		} else {
			if (var0 == 56) {
				MusicPatchPcmStream.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				ClientPreferences.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				MusicPatchPcmStream.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				ClientPreferences.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				Login.loginIndex = 7;
			} else {
				MusicPatchPcmStream.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
			}
		}

		ClientPreferences.updateGameState(10);
	}
}
