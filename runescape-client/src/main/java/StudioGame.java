import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("w")
	@Export("name")
	public final String name;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -840829897
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lom;",
		garbageValue = "-5"
	)
	static SpritePixels method4914(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(HitSplatDefinition.method2988(var0, var1, var2));
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "6409"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			Client.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			Client.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			Client.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field809 = 1;
		} else if (var0 == 4) {
			Login.loginIndex = 12;
			Login.field804 = 0;
		} else if (var0 == 5) {
			Login.field809 = 2;
			Client.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				Client.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				Client.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				Client.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				Client.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				Client.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				Client.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				Client.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				Client.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				Client.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				Client.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) {
				Login.loginIndex = 12;
				Login.field804 = 1;
			} else if (var0 == 19) {
				Client.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				Client.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				Client.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				Client.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				Client.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				Client.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				Client.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				Client.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				Client.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				Client.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				Client.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				Client.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				Login.loginIndex = 8;
			} else {
				if (var0 == 56) {
					Client.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					class16.updateGameState(11);
					return;
				}

				if (var0 == 57) {
					Client.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					class16.updateGameState(11);
					return;
				}

				if (var0 == 61) {
					Login.loginIndex = 7;
				} else {
					Client.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		} else {
			Client.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}

		class16.updateGameState(10);
	}
}
