import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class150 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -7750632583538685477L
	)
	long field1680;
	@ObfuscatedName("o")
	String field1679;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1680 = -1L; // L: 194
		this.field1679 = null; // L: 195
	} // L: 197

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1680 = var1.readLong(); // L: 202
		}

		this.field1679 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2912(this.field1680, this.field1679); // L: 208
	} // L: 209

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1682779053"
	)
	public static int method3091(int var0) {
		return PcmPlayer.method771(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 65
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1443556885"
	)
	static void method3092(String var0, String var1, String var2) {
		method3089(7); // L: 1259
		GrandExchangeEvent.setLoginResponseString(var0, var1, var2); // L: 1260
	} // L: 1261

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "16213"
	)
	static void method3089(int var0) {
		if (var0 != Login.loginIndex) { // L: 2091
			Login.loginIndex = var0; // L: 2092
		}
	} // L: 2093

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-101"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2448
			GrandExchangeEvent.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2449
			GrandExchangeEvent.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2450
			GrandExchangeEvent.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2451
			method3089(3); // L: 2452
			Login.field897 = 1; // L: 2453
		} else if (var0 == 4) { // L: 2455
			class128.method2841(0); // L: 2456
		} else if (var0 == 5) { // L: 2458
			Login.field897 = 2; // L: 2459
			GrandExchangeEvent.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2460
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2462
			if (var0 == 7) { // L: 2465
				GrandExchangeEvent.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2466
				GrandExchangeEvent.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2467
				GrandExchangeEvent.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2468
				GrandExchangeEvent.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2469
				GrandExchangeEvent.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2470
				GrandExchangeEvent.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2471
				GrandExchangeEvent.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2472
				GrandExchangeEvent.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2473
				GrandExchangeEvent.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2474
				GrandExchangeEvent.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 2475
				class128.method2841(1); // L: 2476
			} else if (var0 == 19) { // L: 2478
				GrandExchangeEvent.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2479
				GrandExchangeEvent.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2480
				GrandExchangeEvent.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2481
				GrandExchangeEvent.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2482
				GrandExchangeEvent.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2483
				GrandExchangeEvent.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2484
				GrandExchangeEvent.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2485
				GrandExchangeEvent.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2486
				GrandExchangeEvent.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2487
				GrandExchangeEvent.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) { // L: 2488
				GrandExchangeEvent.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2489
				GrandExchangeEvent.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2490
				method3089(8); // L: 2491
			} else {
				if (var0 == 56) { // L: 2493
					GrandExchangeEvent.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2494
					InterfaceParent.updateGameState(11); // L: 2495
					return; // L: 2496
				}

				if (var0 == 57) { // L: 2498
					GrandExchangeEvent.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2499
					InterfaceParent.updateGameState(11); // L: 2500
					return; // L: 2501
				}

				if (var0 == 61) { // L: 2503
					GrandExchangeEvent.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2504
					method3089(7); // L: 2505
				} else {
					if (var0 == 62) { // L: 2507
						InterfaceParent.updateGameState(10); // L: 2508
						method3089(9); // L: 2509
						GrandExchangeEvent.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2510
						return; // L: 2511
					}

					if (var0 == 63) { // L: 2513
						InterfaceParent.updateGameState(10); // L: 2514
						method3089(9); // L: 2515
						GrandExchangeEvent.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2516
						return; // L: 2517
					}

					if (var0 == 65 || var0 == 67) { // L: 2519
						InterfaceParent.updateGameState(10); // L: 2520
						method3089(9); // L: 2521
						GrandExchangeEvent.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2522
						return; // L: 2523
					}

					if (var0 == 71) { // L: 2525
						InterfaceParent.updateGameState(10); // L: 2526
						method3089(7); // L: 2527
						GrandExchangeEvent.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2528
					} else {
						GrandExchangeEvent.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2530
					}
				}
			}
		} else {
			GrandExchangeEvent.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2463
		}

		InterfaceParent.updateGameState(10); // L: 2531
		if (Client.field517.method8013()) { // L: 2532
			method3089(9); // L: 2533
		}

	} // L: 2535
}
