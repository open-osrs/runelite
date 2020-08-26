import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class58 {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1766812037
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1957401130"
	)
	public static void method907() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 44
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 45
			} // L: 46

			if (var0 == null) {
				return; // L: 47
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 48
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1050373784"
	)
	public static int method912(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 25
			int var6 = var3; // L: 26
			var3 = var4; // L: 27
			var4 = var6; // L: 28
		}

		var2 &= 3; // L: 30
		if (var2 == 0) { // L: 31
			return var1;
		} else if (var2 == 1) { // L: 32
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 33
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "101066912"
	)
	public static void method915(int var0) {
		class206.musicPlayerStatus = 1; // L: 49
		class204.musicTrackArchive = null; // L: 50
		BuddyRankComparator.musicTrackGroupId = -1; // L: 51
		class206.musicTrackFileId = -1; // L: 52
		Tiles.musicTrackVolume = 0; // L: 53
		class206.musicTrackBoolean = false; // L: 54
		FaceNormal.pcmSampleLength = var0; // L: 55
	} // L: 56

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	static final void method914(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 93
			for (int var4 = 0; var4 < 8; ++var4) { // L: 94
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 96
			for (var3 = 1; var3 < 8; ++var3) { // L: 97
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 99
			for (var3 = 1; var3 < 8; ++var3) { // L: 100
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 102
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 103
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 104
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 105

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(CLgn;I)I",
		garbageValue = "65536"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 128
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 129
			var0 = Character.toLowerCase(var0); // L: 130
			var2 = (var0 << 4) + 1; // L: 131
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 133
			var2 = 1762;
		}

		return var2; // L: 134
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2419
			UrlRequester.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2420
			UrlRequester.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2421
			UrlRequester.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2422
			Login.loginIndex = 3; // L: 2423
			Login.field1213 = 1; // L: 2424
		} else if (var0 == 4) { // L: 2426
			class89.method2130(0); // L: 2427
		} else if (var0 == 5) { // L: 2429
			Login.field1213 = 2; // L: 2430
			UrlRequester.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2431
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2433
			if (var0 == 7) { // L: 2436
				UrlRequester.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2437
				UrlRequester.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2438
				UrlRequester.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2439
				UrlRequester.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2440
				UrlRequester.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2441
				UrlRequester.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2442
				UrlRequester.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2443
				UrlRequester.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2444
				UrlRequester.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2445
				UrlRequester.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 2446
				Login.loginIndex = 12; // L: 2448
				Login.field1210 = 1; // L: 2449
			} else if (var0 == 19) { // L: 2452
				UrlRequester.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2453
				UrlRequester.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2454
				UrlRequester.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2455
				UrlRequester.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2456
				UrlRequester.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2457
				UrlRequester.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2458
				UrlRequester.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2459
				UrlRequester.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2460
				UrlRequester.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				UrlRequester.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system."); // L: 2461
			} else if (var0 == 37) { // L: 2462
				UrlRequester.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2463
				UrlRequester.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2464
				Login.loginIndex = 8; // L: 2465
			} else {
				if (var0 == 56) { // L: 2467
					UrlRequester.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2468
					CollisionMap.updateGameState(11); // L: 2469
					return; // L: 2470
				}

				if (var0 == 57) { // L: 2472
					UrlRequester.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2473
					CollisionMap.updateGameState(11); // L: 2474
					return; // L: 2475
				}

				if (var0 == 61) { // L: 2477
					Login.loginIndex = 7; // L: 2478
				} else {
					UrlRequester.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2480
				}
			}
		} else {
			UrlRequester.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2434
		}

		CollisionMap.updateGameState(10); // L: 2481
	} // L: 2482

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-693784957"
	)
	static final void method913(int var0) {
		if (WorldMapSprite.loadInterface(var0)) { // L: 10297
			Projectile.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1); // L: 10298
		}
	} // L: 10299

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Lbq;ZI)V",
		garbageValue = "-1212325817"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 10505
		int var3 = (int)var0.key; // L: 10506
		var0.remove(); // L: 10507
		if (var1) { // L: 10508
			SecureRandomFuture.method2225(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) { // L: 10510
			if ((long)var2 == (var4.key >> 48 & 65535L)) { // L: 10511
				var4.remove(); // L: 10512
			}
		}

		Widget var5 = TileItem.getWidget(var3); // L: 10516
		if (var5 != null) { // L: 10517
			class52.invalidateWidget(var5);
		}

		class2.method24(); // L: 10518
		if (Client.rootInterface != -1) { // L: 10519
			ClientPacket.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 10520
}
