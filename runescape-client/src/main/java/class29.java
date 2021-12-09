import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class29 {
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("c")
	public static Applet field172;
	@ObfuscatedName("b")
	public static String field177;

	static {
		field172 = null; // L: 10
		field177 = ""; // L: 11
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "534236872"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 3454
			class19.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 3455
			class19.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 3456
			class19.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 3457
			PlayerType.method5521(3); // L: 3458
			Login.field872 = 1; // L: 3459
		} else if (var0 == 4) { // L: 3461
			PlayerType.method5521(14); // L: 3463
			Login.field871 = 0; // L: 3464
		} else if (var0 == 5) { // L: 3467
			Login.field872 = 2; // L: 3468
			class19.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 3469
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 3471
			class19.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 3472
		} else if (var0 == 7) { // L: 3474
			class19.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 3475
			class19.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 3476
			class19.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 3477
			class19.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 3478
			class19.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 3479
			class19.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 3480
			class19.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 3481
			class19.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 3482
			class19.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) { // L: 3483
			class19.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) { // L: 3484
			PlayerType.method5521(14); // L: 3486
			Login.field871 = 1; // L: 3487
		} else if (var0 == 19) { // L: 3490
			class19.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 3491
			class19.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 3492
			class19.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 3493
			class19.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 3494
			class19.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 3495
			class19.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 3496
			class19.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 3497
			class19.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 3498
			class19.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class19.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system."); // L: 3499
		} else if (var0 == 37) { // L: 3500
			class19.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 3501
			class19.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 3502
			PlayerType.method5521(8); // L: 3503
		} else {
			if (var0 == 56) { // L: 3505
				class19.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 3506
				VertexNormal.updateGameState(11); // L: 3507
				return; // L: 3508
			}

			if (var0 == 57) { // L: 3510
				class19.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 3511
				VertexNormal.updateGameState(11); // L: 3512
				return; // L: 3513
			}

			if (var0 == 61) { // L: 3515
				PlayerType.method5521(7); // L: 3516
			} else {
				if (var0 == 62) { // L: 3518
					VertexNormal.updateGameState(10); // L: 3519
					PlayerType.method5521(9); // L: 3520
					class19.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 3521
					return; // L: 3522
				}

				if (var0 == 63) { // L: 3524
					VertexNormal.updateGameState(10); // L: 3525
					PlayerType.method5521(9); // L: 3526
					class19.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 3527
					return; // L: 3528
				}

				if (var0 == 65 || var0 == 67) { // L: 3530
					VertexNormal.updateGameState(10); // L: 3531
					PlayerType.method5521(9); // L: 3532
					class19.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 3533
					return; // L: 3534
				}

				class19.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 3536
			}
		}

		VertexNormal.updateGameState(10); // L: 3537
		if (Client.field508.method7605()) { // L: 3538
			PlayerType.method5521(9); // L: 3539
		}

	} // L: 3541

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIZI)V",
		garbageValue = "-1480983977"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10955
		int var5 = var0.height; // L: 10956
		if (var0.widthAlignment == 0) { // L: 10957
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10958
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10959
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10960
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10961
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10962
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10963
			var0.width = var0.height * var0.field3242 / var0.field3243;
		}

		if (var0.heightAlignment == 4) { // L: 10964
			var0.height = var0.field3243 * var0.width / var0.field3242;
		}

		if (var0.contentType == 1337) { // L: 10965
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10966
			ScriptEvent var6 = new ScriptEvent(); // L: 10967
			var6.widget = var0; // L: 10968
			var6.args = var0.onResize; // L: 10969
			Client.scriptEvents.addFirst(var6); // L: 10970
		}

	} // L: 10972

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ljm;III)V",
		garbageValue = "83568708"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11914
			if (var0 != null) { // L: 11916
				Widget var4 = SpotAnimationDefinition.method3340(var0); // L: 11919
				if (var4 == null) { // L: 11920
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 11923
					Client.clickedWidget = var0; // L: 11927
					var4 = SpotAnimationDefinition.method3340(var0); // L: 11930
					if (var4 == null) { // L: 11931
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 11934
					Client.widgetClickX = var1; // L: 11935
					Client.widgetClickY = var2; // L: 11936
					class87.widgetDragDuration = 0; // L: 11937
					Client.isDraggingWidget = false; // L: 11938
					int var6 = Client.menuOptionsCount - 1; // L: 11941
					if (var6 != -1) { // L: 11944
						class16.method239(var6);
					}

					return; // L: 11945
				}
			}

		}
	} // L: 11925
}
