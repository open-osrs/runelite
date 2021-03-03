import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public final class class52 {
	@ObfuscatedName("su")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1687421711
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive0")
	static Archive archive0;

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1618970834"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2462
			InvDefinition.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2463
			InvDefinition.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2464
			InvDefinition.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2465
			Login.loginIndex = 3; // L: 2466
			Login.field1207 = 1; // L: 2467
		} else if (var0 == 4) { // L: 2469
			WorldMapDecoration.method406(0); // L: 2470
		} else if (var0 == 5) { // L: 2472
			Login.field1207 = 2; // L: 2473
			InvDefinition.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2474
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2476
			if (var0 == 7) { // L: 2479
				InvDefinition.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2480
				InvDefinition.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2481
				InvDefinition.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2482
				InvDefinition.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2483
				InvDefinition.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2484
				InvDefinition.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2485
				InvDefinition.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2486
				InvDefinition.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2487
				InvDefinition.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2488
				InvDefinition.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 2489
				WorldMapDecoration.method406(1); // L: 2490
			} else if (var0 == 19) { // L: 2492
				InvDefinition.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2493
				InvDefinition.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2494
				InvDefinition.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2495
				InvDefinition.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2496
				InvDefinition.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2497
				InvDefinition.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2498
				InvDefinition.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2499
				InvDefinition.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2500
				InvDefinition.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				InvDefinition.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system."); // L: 2501
			} else if (var0 == 37) { // L: 2502
				InvDefinition.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2503
				InvDefinition.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2504
				Login.loginIndex = 8; // L: 2505
			} else {
				if (var0 == 56) { // L: 2507
					InvDefinition.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2508
					ItemContainer.updateGameState(11); // L: 2509
					return; // L: 2510
				}

				if (var0 == 57) { // L: 2512
					InvDefinition.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2513
					ItemContainer.updateGameState(11); // L: 2514
					return; // L: 2515
				}

				if (var0 == 61) { // L: 2517
					Login.loginIndex = 7; // L: 2518
				} else {
					InvDefinition.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2520
				}
			}
		} else {
			InvDefinition.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2477
		}

		ItemContainer.updateGameState(10); // L: 2521
	} // L: 2522
}
