import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Login")
public class Login {
	@ObfuscatedName("c")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2022945893
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1514793593
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 66055169
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("z")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 688596069
	)
	static int field901;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -547641813
	)
	static int field895;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1615096635
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("as")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("aa")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bj")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bm")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("br")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bo")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 326073325
	)
	static int field903;
	@ObfuscatedName("bh")
	static String[] field904;
	@ObfuscatedName("by")
	static boolean field909;
	@ObfuscatedName("bt")
	static boolean field906;
	@ObfuscatedName("bp")
	static boolean field907;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1549221867
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("cm")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1213239867
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -418396213
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -2129612195
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		longValue = -2025470405168207311L
	)
	static long field915;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		longValue = 679387299211312041L
	)
	static long field916;
	@ObfuscatedName("cr")
	static String[] field917;
	@ObfuscatedName("cq")
	static String[] field918;

	static {
		xPadding = 0; // L: 47
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10; // L: 68
		Login_loadingText = ""; // L: 69
		field901 = -1; // L: 87
		field895 = 1; // L: 90
		loginIndex = 0; // L: 94
		Login_response0 = ""; // L: 95
		Login_response1 = ""; // L: 96
		Login_response2 = ""; // L: 97
		Login_response3 = ""; // L: 98
		Login_username = ""; // L: 99
		Login_password = ""; // L: 100
		field903 = 0; // L: 102
		field904 = new String[8]; // L: 103
		field909 = false; // L: 114
		field906 = false; // L: 115
		field907 = true; // L: 118
		currentLoginField = 0; // L: 119
		worldSelectOpen = false; // L: 123
		hoveredWorldIndex = -1; // L: 131
		worldSelectPage = 0; // L: 132
		worldSelectPagesCount = 0; // L: 133
		new DecimalFormat("##0.00"); // L: 136
		new class120();
		field915 = -1L; // L: 144
		field916 = -1L; // L: 145
		field917 = new String[]{"title.jpg"}; // L: 148
		field918 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 151
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2061264207"
	)
	static void method1960() {
		ByteArrayPool.field4167.clear(); // L: 61
		ByteArrayPool.field4167.add(100); // L: 62
		ByteArrayPool.field4167.add(5000); // L: 63
		ByteArrayPool.field4167.add(10000); // L: 64
		ByteArrayPool.field4167.add(30000); // L: 65
	} // L: 66

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpz;ILcz;II)V",
		garbageValue = "540363482"
	)
	static final void method1932(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class193.field2186.field2183; // L: 451
		if ((var3 & 8192) != 0) { // L: 452
			var2.field1167 = Client.cycle + var0.method7714(); // L: 453
			var2.field1168 = Client.cycle + var0.method7713(); // L: 454
			var2.field1169 = var0.method7708(); // L: 455
			var2.field1114 = var0.method7708(); // L: 456
			var2.field1171 = var0.method7885(); // L: 457
			var2.field1122 = (byte)var0.method7773(); // L: 458
		}

		if ((var3 & 256) != 0) { // L: 460
			var4 = var0.method7885(); // L: 461
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 1) != 0) { // L: 463
			var5 = var0.method7713(); // L: 464
			PlayerType var6 = (PlayerType)MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var0.readUnsignedByte()); // L: 465
			boolean var7 = var0.method7742() == 1; // L: 466
			var8 = var0.method7742(); // L: 467
			var9 = var0.offset; // L: 468
			if (var2.username != null && var2.appearance != null) { // L: 469
				boolean var10 = false; // L: 470
				if (var6.isUser && Decimator.friendSystem.isIgnored(var2.username)) { // L: 471 472
					var10 = true;
				}

				if (!var10 && Client.field618 == 0 && !var2.isHidden) { // L: 474
					Players.field1273.offset = 0; // L: 475
					var0.method7814(Players.field1273.array, 0, var8); // L: 476
					Players.field1273.offset = 0; // L: 477
					String var11 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(Players.field1273))); // L: 478
					var2.overheadText = var11.trim(); // L: 479
					var2.overheadTextColor = var5 >> 8; // L: 480
					var2.overheadTextEffect = var5 & 255; // L: 481
					var2.overheadTextCyclesRemaining = 150; // L: 482
					var2.isAutoChatting = var7; // L: 483
					var2.field1130 = var2 != GrandExchangeEvents.localPlayer && var6.isUser && "" != Client.field728 && var11.toLowerCase().indexOf(Client.field728) == -1; // L: 484
					if (var6.isPrivileged) { // L: 486
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 487
					}

					if (var6.modIcon != -1) { // L: 488
						Actor.addGameMessage(var12, Script.method1990(var6.modIcon) + var2.username.getName(), var11);
					} else {
						Actor.addGameMessage(var12, var2.username.getName(), var11); // L: 489
					}
				}
			}

			var0.offset = var8 + var9; // L: 492
		}

		if ((var3 & 2048) != 0) { // L: 494
			for (var5 = 0; var5 < 3; ++var5) { // L: 495
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 4096) != 0) { // L: 497
			var2.spotAnimation = var0.method7713(); // L: 498
			var5 = var0.method7705(); // L: 499
			var2.spotAnimationHeight = var5 >> 16; // L: 500
			var2.field1134 = (var5 & 65535) + Client.cycle; // L: 501
			var2.spotAnimationFrame = 0; // L: 502
			var2.spotAnimationFrameCycle = 0; // L: 503
			if (var2.field1134 > Client.cycle) { // L: 504
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 505
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 128) != 0) { // L: 507
			var5 = var0.method7742(); // L: 508
			byte[] var17 = new byte[var5]; // L: 509
			Buffer var13 = new Buffer(var17); // L: 510
			var0.method7814(var17, 0, var5); // L: 511
			Players.field1276[var1] = var13; // L: 512
			var2.read(var13); // L: 513
		}

		if ((var3 & 512) != 0) { // L: 515
			var2.field1129 = var0.method7707(); // L: 516
			var2.field1160 = var0.readByte(); // L: 517
			var2.field1132 = var0.method7885(); // L: 518
			var2.field1161 = var0.method7708(); // L: 519
			var2.field1143 = var0.method7714() + Client.cycle; // L: 520
			var2.field1163 = var0.method7715() + Client.cycle; // L: 521
			var2.field1135 = var0.method7713(); // L: 522
			if (var2.field1070) { // L: 523
				var2.field1129 += var2.tileX; // L: 524
				var2.field1160 += var2.tileY; // L: 525
				var2.field1132 += var2.tileX; // L: 526
				var2.field1161 += var2.tileY; // L: 527
				var2.pathLength = 0; // L: 528
			} else {
				var2.field1129 += var2.pathX[0]; // L: 531
				var2.field1160 += var2.pathY[0]; // L: 532
				var2.field1132 += var2.pathX[0]; // L: 533
				var2.field1161 += var2.pathY[0]; // L: 534
				var2.pathLength = 1; // L: 535
			}

			var2.field1170 = 0; // L: 537
		}

		if ((var3 & 16) != 0) { // L: 539
			var2.field1121 = var0.readUnsignedShort(); // L: 540
			if (var2.pathLength == 0) { // L: 541
				var2.orientation = var2.field1121; // L: 542
				var2.field1121 = -1; // L: 543
			}
		}

		if ((var3 & 2) != 0) { // L: 546
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 547
			if (var2.overheadText.charAt(0) == '~') { // L: 548
				var2.overheadText = var2.overheadText.substring(1); // L: 549
				Actor.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 550
			} else if (var2 == GrandExchangeEvents.localPlayer) { // L: 552
				Actor.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 553
			}

			var2.isAutoChatting = false; // L: 555
			var2.overheadTextColor = 0; // L: 556
			var2.overheadTextEffect = 0; // L: 557
			var2.overheadTextCyclesRemaining = 150; // L: 558
		}

		int var14;
		if ((var3 & 8) != 0) { // L: 560
			var5 = var0.method7715(); // L: 561
			if (var5 == 65535) { // L: 562
				var5 = -1;
			}

			var14 = var0.method7742(); // L: 563
			GrandExchangeOfferOwnWorldComparator.performPlayerAnimation(var2, var5, var14); // L: 564
		}

		if ((var3 & 16384) != 0) { // L: 566
			class193[] var15 = Players.field1286; // L: 567
			class193[] var21 = new class193[]{class193.field2185, class193.field2187, class193.field2186, class193.field2184}; // L: 571
			var15[var1] = (class193)MusicPatchPcmStream.findEnumerated(var21, var0.method7708()); // L: 573
		}

		if ((var3 & 32) != 0) { // L: 575
			var2.targetIndex = var0.method7713(); // L: 576
			if (var2.targetIndex == 65535) { // L: 577
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 4) != 0) { // L: 579
			var5 = var0.method7773(); // L: 580
			int var16;
			int var19;
			int var20;
			if (var5 > 0) { // L: 581
				for (var14 = 0; var14 < var5; ++var14) { // L: 582
					var8 = -1; // L: 584
					var9 = -1; // L: 585
					var20 = -1; // L: 586
					var19 = var0.readUShortSmart(); // L: 587
					if (var19 == 32767) { // L: 588
						var19 = var0.readUShortSmart(); // L: 589
						var9 = var0.readUShortSmart(); // L: 590
						var8 = var0.readUShortSmart(); // L: 591
						var20 = var0.readUShortSmart(); // L: 592
					} else if (var19 != 32766) { // L: 594
						var9 = var0.readUShortSmart(); // L: 595
					} else {
						var19 = -1; // L: 597
					}

					var16 = var0.readUShortSmart(); // L: 598
					var2.addHitSplat(var19, var9, var8, var20, Client.cycle, var16); // L: 599
				}
			}

			var14 = var0.readUnsignedByte(); // L: 602
			if (var14 > 0) { // L: 603
				for (var19 = 0; var19 < var14; ++var19) { // L: 604
					var8 = var0.readUShortSmart(); // L: 605
					var9 = var0.readUShortSmart(); // L: 606
					if (var9 != 32767) { // L: 607
						var20 = var0.readUShortSmart(); // L: 608
						var16 = var0.readUnsignedByte(); // L: 609
						var12 = var9 > 0 ? var0.method7773() : var16; // L: 610
						var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12); // L: 611
					} else {
						var2.removeHealthBar(var8); // L: 613
					}
				}
			}
		}

		if (var2.field1070) { // L: 617
			if (var4 == 127) { // L: 618
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class193 var22;
				if (var4 != class193.field2186.field2183) { // L: 621
					class193[] var18 = new class193[]{class193.field2185, class193.field2187, class193.field2186, class193.field2184}; // L: 624
					var22 = (class193)MusicPatchPcmStream.findEnumerated(var18, var4); // L: 626
				} else {
					var22 = Players.field1286[var1]; // L: 628
				}

				var2.method2125(var2.tileX, var2.tileY, var22); // L: 629
			}
		}

	} // L: 633
}
