import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -1391181051
	)
	static int field1352;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lmd;I)I",
		garbageValue = "2116759731"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "269685470"
	)
	public static int method2464(CharSequence var0) {
		return WorldMapIcon_0.method4690(var0, 10, true); // L: 77
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lal;Llv;B)V",
		garbageValue = "-66"
	)
	static void method2465(GameEngine var0, Font var1) {
		int var3;
		int var4;
		int var5;
		if (Login.worldSelectOpen) { // L: 319
			while (true) {
				if (!class370.isKeyDown()) { // L: 321
					if (MouseHandler.MouseHandler_lastButton != 1 && (class370.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 337
						break;
					}

					int var2 = Login.xPadding + 280; // L: 338
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 339
						Message.changeWorldSelectSorting(0, 0); // L: 340
						break; // L: 341
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 343
						Message.changeWorldSelectSorting(0, 1); // L: 344
						break; // L: 345
					}

					var3 = Login.xPadding + 390; // L: 347
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 348
						Message.changeWorldSelectSorting(1, 0); // L: 349
						break; // L: 350
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 352
						Message.changeWorldSelectSorting(1, 1); // L: 353
						break; // L: 354
					}

					var4 = Login.xPadding + 500; // L: 356
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 357
						Message.changeWorldSelectSorting(2, 0); // L: 358
						break; // L: 359
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 361
						Message.changeWorldSelectSorting(2, 1); // L: 362
						break; // L: 363
					}

					var5 = Login.xPadding + 610; // L: 365
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 366
						Message.changeWorldSelectSorting(3, 0); // L: 367
						break; // L: 368
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 370
						Message.changeWorldSelectSorting(3, 1); // L: 371
						break; // L: 372
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 374
						class120.method2699(); // L: 375
						break; // L: 376
					}

					if (Login.hoveredWorldIndex != -1) { // L: 378
						World var6 = class33.World_worlds[Login.hoveredWorldIndex]; // L: 379
						InterfaceParent.changeWorld(var6); // L: 380
						class120.method2699(); // L: 381
					} else {
						if (Login.worldSelectPage > 0 && class186.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class186.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= NPC.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= NPC.canvasHeight / 2 + 50) { // L: 384
							--Login.worldSelectPage; // L: 385
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && DirectByteArrayCopier.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= DirectByteArrayCopier.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= DirectByteArrayCopier.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= NPC.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= NPC.canvasHeight / 2 + 50) { // L: 387
							++Login.worldSelectPage; // L: 388
						}
					}
					break;
				}

				if (class160.field1749 == 13) { // L: 322
					class120.method2699(); // L: 323
					break; // L: 324
				}

				if (class160.field1749 == 96) { // L: 326
					if (Login.worldSelectPage > 0 && class186.worldSelectLeftSprite != null) { // L: 327
						--Login.worldSelectPage; // L: 328
					}
				} else if (class160.field1749 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && DirectByteArrayCopier.worldSelectRightSprite != null) { // L: 331 332
					++Login.worldSelectPage; // L: 333
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class370.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 394
				class424.clientPreferences.titleMusicDisabled = !class424.clientPreferences.titleMusicDisabled; // L: 395
				GameEngine.savePreferences(); // L: 396
				if (!class424.clientPreferences.titleMusicDisabled) { // L: 397
					Archive var22 = WorldMapLabelSize.archive6; // L: 398
					var3 = var22.getGroupId("scape main"); // L: 400
					var4 = var22.getFileId(var3, ""); // L: 401
					MenuAction.method1894(var22, var3, var4, 255, false); // L: 402
				} else {
					class265.midiPcmStream.clear(); // L: 406
					class265.musicPlayerStatus = 1; // L: 407
					class265.musicTrackArchive = null; // L: 408
				}
			}

			if (Client.gameState != 5) { // L: 411
				if (-1L == Login.field922) { // L: 412
					Login.field922 = DirectByteArrayCopier.method5318() + 1000L; // L: 413
				}

				long var23 = DirectByteArrayCopier.method5318(); // L: 415
				boolean var44;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 418
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 422
							var44 = true; // L: 430
							break;
						}

						ArchiveLoader var25 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 423
						if (!var25.isLoaded()) { // L: 424
							var44 = false; // L: 425
							break; // L: 426
						}

						++Client.archiveLoadersDone; // L: 428
					}
				} else {
					var44 = true; // L: 419
				}

				if (var44 && -1L == Login.field923) { // L: 432 433
					Login.field923 = var23; // L: 434
					if (Login.field923 > Login.field922) { // L: 435
						Login.field922 = Login.field923; // L: 436
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 440
					if (Language.Language_EN == class122.clientLanguage) { // L: 441
						if (MouseHandler.MouseHandler_lastButton == 1 || !class370.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 442
							var5 = Login.xPadding + 5; // L: 443
							short var26 = 463; // L: 444
							byte var7 = 100; // L: 445
							byte var8 = 35; // L: 446
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var26 && MouseHandler.MouseHandler_lastPressedY <= var26 + var8) { // L: 447
								class414.method7278(); // L: 448
								return; // L: 449
							}
						}

						if (WorldMapID.World_request != null) { // L: 452
							class414.method7278();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 454
					int var59 = MouseHandler.MouseHandler_lastPressedX; // L: 455
					int var45 = MouseHandler.MouseHandler_lastPressedY; // L: 456
					if (var5 == 0) { // L: 457
						var59 = MouseHandler.MouseHandler_x; // L: 458
						var45 = MouseHandler.MouseHandler_y; // L: 459
					}

					if (!class370.mouseCam && var5 == 4) { // L: 461
						var5 = 1;
					}

					int var48;
					short var49;
					if (Login.loginIndex == 0) { // L: 462
						boolean var55 = false; // L: 463

						while (class370.isKeyDown()) { // L: 464
							if (class160.field1749 == 84) { // L: 465
								var55 = true; // L: 466
							}
						}

						var48 = class4.loginBoxCenter - 80; // L: 469
						var49 = 291; // L: 470
						if (var5 == 1 && var59 >= var48 - 75 && var59 <= var48 + 75 && var45 >= var49 - 20 && var45 <= var49 + 20) { // L: 471
							MilliClock.openURL(StructComposition.method3387("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 472
						}

						var48 = class4.loginBoxCenter + 80; // L: 474
						if (var5 == 1 && var59 >= var48 - 75 && var59 <= var48 + 75 && var45 >= var49 - 20 && var45 <= var49 + 20 || var55) { // L: 475
							if ((Client.worldProperties & 33554432) != 0) { // L: 476
								Login.Login_response0 = ""; // L: 477
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 478
								Login.Login_response2 = "Your normal account will not be affected."; // L: 479
								Login.Login_response3 = ""; // L: 480
								Player.method2159(1); // L: 481
								WorldMapLabelSize.method4317(); // L: 482
							} else if ((Client.worldProperties & 4) != 0) { // L: 484
								if ((Client.worldProperties & 1024) != 0) { // L: 485
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 486
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 487
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 488
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 491
									Login.Login_response2 = "Players can attack each other"; // L: 492
									Login.Login_response3 = "almost everywhere."; // L: 493
								}

								Login.Login_response0 = "Warning!"; // L: 495
								Player.method2159(1); // L: 496
								WorldMapLabelSize.method4317(); // L: 497
							} else if ((Client.worldProperties & 1024) != 0) { // L: 499
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 500
								Login.Login_response2 = "The Protect Item prayer will"; // L: 501
								Login.Login_response3 = "not work on this world."; // L: 502
								Login.Login_response0 = "Warning!"; // L: 503
								Player.method2159(1); // L: 504
								WorldMapLabelSize.method4317(); // L: 505
							} else {
								Archive.Login_promptCredentials(false); // L: 508
							}
						}
					} else {
						short var9;
						int var46;
						if (Login.loginIndex == 1) { // L: 512
							while (true) {
								if (!class370.isKeyDown()) { // L: 513
									var46 = class4.loginBoxCenter - 80; // L: 521
									var9 = 321; // L: 522
									if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 523
										Archive.Login_promptCredentials(false); // L: 524
									}

									var46 = class4.loginBoxCenter + 80; // L: 526
									if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 527
										Player.method2159(0); // L: 528
									}
									break;
								}

								if (class160.field1749 == 84) { // L: 514
									Archive.Login_promptCredentials(false); // L: 515
								} else if (class160.field1749 == 13) { // L: 517
									Player.method2159(0); // L: 518
								}
							}
						} else {
							int var13;
							int var20;
							int var30;
							short var47;
							boolean var60;
							if (Login.loginIndex == 2) { // L: 531
								var47 = 201; // L: 532
								var46 = var47 + 52; // L: 533
								if (var5 == 1 && var45 >= var46 - 12 && var45 < var46 + 2) { // L: 534
									Login.currentLoginField = 0;
								}

								var46 += 15; // L: 535
								if (var5 == 1 && var45 >= var46 - 12 && var45 < var46 + 2) { // L: 536
									Login.currentLoginField = 1;
								}

								var46 += 15; // L: 537
								var47 = 361; // L: 538
								if (class6.field25 != null) { // L: 539
									var48 = class6.field25.highX / 2; // L: 540
									if (var5 == 1 && var59 >= class6.field25.lowX - var48 && var59 <= var48 + class6.field25.lowX && var45 >= var47 - 15 && var45 < var47) { // L: 541
										switch(Login.field918) { // L: 542
										case 1:
											setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 545
											Player.method2159(5); // L: 546
											return; // L: 547
										case 2:
											MilliClock.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 551
										}
									}
								}

								var48 = class4.loginBoxCenter - 80; // L: 557
								var49 = 321; // L: 558
								if (var5 == 1 && var59 >= var48 - 75 && var59 <= var48 + 75 && var45 >= var49 - 20 && var45 <= var49 + 20) { // L: 559
									Login.Login_username = Login.Login_username.trim(); // L: 560
									if (Login.Login_username.length() == 0) { // L: 561
										setLoginResponseString("", "Please enter your username/email address.", ""); // L: 562
										return; // L: 563
									}

									if (Login.Login_password.length() == 0) { // L: 565
										setLoginResponseString("", "Please enter your password.", ""); // L: 566
										return; // L: 567
									}

									setLoginResponseString("", "Connecting to server...", ""); // L: 569
									Friend.method6297(false); // L: 570
									class111.updateGameState(20); // L: 571
									return; // L: 572
								}

								var48 = Login.loginBoxX + 180 + 80; // L: 574
								if (var5 == 1 && var59 >= var48 - 75 && var59 <= var48 + 75 && var45 >= var49 - 20 && var45 <= var49 + 20) { // L: 575
									Player.method2159(0); // L: 576
									Login.Login_username = ""; // L: 577
									Login.Login_password = ""; // L: 578
									GameObject.field2588 = 0; // L: 579
									class145.otp = ""; // L: 580
									Login.field893 = true; // L: 581
								}

								var48 = class4.loginBoxCenter + -117; // L: 583
								var49 = 277; // L: 584
								Login.field912 = var59 >= var48 && var59 < var48 + FriendSystem.field812 && var45 >= var49 && var45 < var49 + class133.field1560; // L: 585
								if (var5 == 1 && Login.field912) { // L: 586
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 587
									if (!Client.Login_isUsernameRemembered && class424.clientPreferences.rememberedUsername != null) { // L: 588
										class424.clientPreferences.rememberedUsername = null; // L: 589
										GameEngine.savePreferences(); // L: 590
									}
								}

								var48 = class4.loginBoxCenter + 24; // L: 593
								var49 = 277; // L: 594
								Login.field913 = var59 >= var48 && var59 < var48 + FriendSystem.field812 && var45 >= var49 && var45 < var49 + class133.field1560; // L: 595
								if (var5 == 1 && Login.field913) { // L: 596
									class424.clientPreferences.hideUsername = !class424.clientPreferences.hideUsername; // L: 597
									if (!class424.clientPreferences.hideUsername) { // L: 598
										Login.Login_username = ""; // L: 599
										class424.clientPreferences.rememberedUsername = null; // L: 600
										WorldMapLabelSize.method4317(); // L: 601
									}

									GameEngine.savePreferences(); // L: 603
								}

								while (true) {
									Transferable var51;
									do {
										while (true) {
											label1483:
											do {
												while (true) {
													while (class370.isKeyDown()) { // L: 605
														if (class160.field1749 != 13) { // L: 606
															if (Login.currentLoginField != 0) { // L: 615
																continue label1483;
															}

															Players.method2308(ClanSettings.field1610); // L: 616
															if (class160.field1749 == 85 && Login.Login_username.length() > 0) { // L: 617
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class160.field1749 == 84 || class160.field1749 == 80) { // L: 618
																Login.currentLoginField = 1;
															}

															if (class20.method288(ClanSettings.field1610) && Login.Login_username.length() < 320) { // L: 619
																Login.Login_username = Login.Login_username + ClanSettings.field1610;
															}
														} else {
															Player.method2159(0); // L: 607
															Login.Login_username = ""; // L: 608
															Login.Login_password = ""; // L: 609
															GameObject.field2588 = 0; // L: 610
															class145.otp = ""; // L: 611
															Login.field893 = true; // L: 612
														}
													}

													return; // L: 1168
												}
											} while(Login.currentLoginField != 1); // L: 621

											if (class160.field1749 == 85 && Login.Login_password.length() > 0) { // L: 622
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 623
											} else if (class160.field1749 == 84 || class160.field1749 == 80) { // L: 625
												Login.currentLoginField = 0; // L: 626
												if (class160.field1749 == 84) { // L: 627
													Login.Login_username = Login.Login_username.trim(); // L: 628
													if (Login.Login_username.length() == 0) { // L: 629
														setLoginResponseString("", "Please enter your username/email address.", ""); // L: 630
														return; // L: 631
													}

													if (Login.Login_password.length() == 0) { // L: 633
														setLoginResponseString("", "Please enter your password.", ""); // L: 634
														return; // L: 635
													}

													setLoginResponseString("", "Connecting to server...", ""); // L: 637
													Friend.method6297(false); // L: 638
													class111.updateGameState(20); // L: 639
													return; // L: 640
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class160.field1749 == 67) { // L: 643
												Clipboard var50 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 644
												var51 = var50.getContents(class414.client); // L: 645
												var13 = 20 - Login.Login_password.length(); // L: 646
												break;
											}

											char var61 = ClanSettings.field1610; // L: 688
											if ((var61 < ' ' || var61 >= 127) && (var61 <= 127 || var61 >= 160) && (var61 <= 160 || var61 > 255)) { // L: 690
												label1711: {
													if (var61 != 0) { // L: 694
														char[] var62 = class333.cp1252AsciiExtension; // L: 696

														for (var30 = 0; var30 < var62.length; ++var30) { // L: 697
															char var15 = var62[var30]; // L: 698
															if (var61 == var15) { // L: 700
																var60 = true; // L: 701
																break label1711; // L: 702
															}
														}
													}

													var60 = false; // L: 708
												}
											} else {
												var60 = true; // L: 691
											}

											if (var60 && class20.method288(ClanSettings.field1610) && Login.Login_password.length() < 20) { // L: 710
												Login.Login_password = Login.Login_password + ClanSettings.field1610; // L: 711
											}
										}
									} while(var13 <= 0); // L: 647

									try {
										String var14 = (String)var51.getTransferData(DataFlavor.stringFlavor); // L: 649
										int var53 = Math.min(var13, var14.length()); // L: 650

										for (int var54 = 0; var54 < var53; ++var54) { // L: 651
											char var56 = var14.charAt(var54); // L: 653
											boolean var17;
											if ((var56 < ' ' || var56 >= 127) && (var56 <= 127 || var56 >= 160) && (var56 <= 160 || var56 > 255)) { // L: 655
												label1714: {
													if (var56 != 0) { // L: 659
														char[] var58 = class333.cp1252AsciiExtension; // L: 661

														for (var20 = 0; var20 < var58.length; ++var20) { // L: 662
															char var21 = var58[var20]; // L: 663
															if (var56 == var21) { // L: 665
																var17 = true; // L: 666
																break label1714; // L: 667
															}
														}
													}

													var17 = false; // L: 673
												}
											} else {
												var17 = true; // L: 656
											}

											if (!var17 || !class20.method288(var14.charAt(var54))) { // L: 675
												Player.method2159(3); // L: 676
												return; // L: 677
											}
										}

										Login.Login_password = Login.Login_password + var14.substring(0, var53); // L: 680
									} catch (UnsupportedFlavorException var42) { // L: 682
									} catch (IOException var43) { // L: 683
									}
								}
							} else if (Login.loginIndex == 3) { // L: 718
								var46 = Login.loginBoxX + 180; // L: 719
								var9 = 276; // L: 720
								if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 721
									Tiles.method2027(false); // L: 722
								}

								var46 = Login.loginBoxX + 180; // L: 724
								var9 = 326; // L: 725
								if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 726
									setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 727
									Player.method2159(5); // L: 728
									return; // L: 729
								}
							} else {
								int var28;
								if (Login.loginIndex == 4) { // L: 732
									var46 = Login.loginBoxX + 180 - 80; // L: 733
									var9 = 321; // L: 734
									if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 735
										class145.otp.trim(); // L: 736
										if (class145.otp.length() != 6) { // L: 737
											setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 738
											return; // L: 739
										}

										GameObject.field2588 = Integer.parseInt(class145.otp); // L: 741
										class145.otp = ""; // L: 742
										Friend.method6297(true); // L: 743
										setLoginResponseString("", "Connecting to server...", ""); // L: 744
										class111.updateGameState(20); // L: 745
										return; // L: 746
									}

									if (var5 == 1 && var59 >= Login.loginBoxX + 180 - 9 && var59 <= Login.loginBoxX + 180 + 130 && var45 >= 263 && var45 <= 296) { // L: 748
										Login.field893 = !Login.field893; // L: 749
									}

									if (var5 == 1 && var59 >= Login.loginBoxX + 180 - 34 && var59 <= Login.loginBoxX + 34 + 180 && var45 >= 351 && var45 <= 363) { // L: 751
										MilliClock.openURL(StructComposition.method3387("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 752
									}

									var46 = Login.loginBoxX + 180 + 80; // L: 754
									if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 755
										Player.method2159(0); // L: 756
										Login.Login_username = ""; // L: 757
										Login.Login_password = ""; // L: 758
										GameObject.field2588 = 0; // L: 759
										class145.otp = ""; // L: 760
									}

									while (class370.isKeyDown()) { // L: 762
										boolean var10 = false; // L: 763

										for (var28 = 0; var28 < "1234567890".length(); ++var28) { // L: 764
											if (ClanSettings.field1610 == "1234567890".charAt(var28)) { // L: 765
												var10 = true; // L: 766
												break; // L: 767
											}
										}

										if (class160.field1749 == 13) { // L: 770
											Player.method2159(0); // L: 771
											Login.Login_username = ""; // L: 772
											Login.Login_password = ""; // L: 773
											GameObject.field2588 = 0; // L: 774
											class145.otp = ""; // L: 775
										} else {
											if (class160.field1749 == 85 && class145.otp.length() > 0) { // L: 778
												class145.otp = class145.otp.substring(0, class145.otp.length() - 1);
											}

											if (class160.field1749 == 84) { // L: 779
												class145.otp.trim(); // L: 780
												if (class145.otp.length() != 6) { // L: 781
													setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 782
													return; // L: 783
												}

												GameObject.field2588 = Integer.parseInt(class145.otp); // L: 785
												class145.otp = ""; // L: 786
												Friend.method6297(true); // L: 787
												setLoginResponseString("", "Connecting to server...", ""); // L: 788
												class111.updateGameState(20); // L: 789
												return; // L: 790
											}

											if (var10 && class145.otp.length() < 6) { // L: 792
												class145.otp = class145.otp + ClanSettings.field1610;
											}
										}
									}
								} else {
									int var27;
									if (Login.loginIndex == 5) { // L: 796
										var46 = Login.loginBoxX + 180 - 80; // L: 797
										var9 = 321; // L: 798
										if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 799
											class125.method2745(); // L: 800
											return; // L: 801
										}

										var46 = Login.loginBoxX + 180 + 80; // L: 803
										if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 804
											Archive.Login_promptCredentials(true); // L: 805
										}

										var49 = 361; // L: 807
										if (PendingSpawn.field1107 != null) { // L: 808
											var28 = PendingSpawn.field1107.highX / 2; // L: 809
											if (var5 == 1 && var59 >= PendingSpawn.field1107.lowX - var28 && var59 <= var28 + PendingSpawn.field1107.lowX && var45 >= var49 - 15 && var45 < var49) { // L: 810
												MilliClock.openURL(StructComposition.method3387("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 811
											}
										}

										while (class370.isKeyDown()) { // L: 814
											var60 = false; // L: 815

											for (var27 = 0; var27 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var27) { // L: 816
												if (ClanSettings.field1610 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var27)) { // L: 817
													var60 = true; // L: 818
													break; // L: 819
												}
											}

											if (class160.field1749 == 13) { // L: 822
												Archive.Login_promptCredentials(true); // L: 823
											} else {
												if (class160.field1749 == 85 && Login.Login_username.length() > 0) { // L: 826
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (class160.field1749 == 84) { // L: 827
													class125.method2745(); // L: 828
													return; // L: 829
												}

												if (var60 && Login.Login_username.length() < 320) { // L: 831
													Login.Login_username = Login.Login_username + ClanSettings.field1610;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 835
										if (Login.loginIndex == 7) { // L: 846
											if (class261.field3085 && !Client.onMobile) { // L: 847
												var46 = class4.loginBoxCenter - 150; // L: 848
												var48 = var46 + 40 + 240 + 25; // L: 849
												var49 = 231; // L: 850
												var28 = var49 + 40; // L: 851
												if (var5 == 1 && var59 >= var46 && var59 <= var48 && var45 >= var49 && var45 <= var28) { // L: 852
													var13 = var46; // L: 854
													var30 = 0;

													while (true) {
														if (var30 >= 8) {
															var27 = 0; // L: 864
															break;
														}

														if (var59 <= var13 + 30) { // L: 857
															var27 = var30; // L: 858
															break; // L: 859
														}

														var13 += 30; // L: 861
														var13 += var30 != 1 && var30 != 3 ? 5 : 20; // L: 862
														++var30; // L: 856
													}

													Login.field910 = var27; // L: 866
												}

												var27 = Login.loginBoxX + 180 - 80; // L: 868
												short var52 = 321; // L: 869
												boolean var16;
												boolean var18;
												String[] var19;
												SimpleDateFormat var31;
												StringBuilder var32;
												String var33;
												Date var34;
												Date var35;
												java.util.Calendar var36;
												Date var57;
												boolean var63;
												java.util.Calendar var64;
												Date var65;
												if (var5 == 1 && var59 >= var27 - 75 && var59 <= var27 + 75 && var45 >= var52 - 20 && var45 <= var52 + 20) { // L: 870
													label1362: {
														try {
															var31 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 877
															var31.setLenient(false); // L: 878
															var32 = new StringBuilder(); // L: 879
															var19 = Login.field911; // L: 881
															var20 = 0;

															while (true) {
																if (var20 >= var19.length) {
																	var32.append("12"); // L: 894
																	var34 = var31.parse(var32.toString()); // L: 895
																	break;
																}

																var33 = var19[var20]; // L: 883
																if (var33 == null) { // L: 885
																	DefaultsGroup.method6590("Date not valid.", "Please ensure all characters are populated.", ""); // L: 886
																	var34 = null; // L: 887
																	break; // L: 888
																}

																var32.append(var33); // L: 890
																++var20; // L: 882
															}

															var35 = var34; // L: 897
														} catch (ParseException var41) { // L: 899
															DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 900
															var63 = false; // L: 901
															break label1362; // L: 902
														}

														if (var35 == null) { // L: 904
															var63 = false; // L: 905
														} else {
															var64 = java.util.Calendar.getInstance(); // L: 910
															var64.set(1, var64.get(1) - 13); // L: 911
															var65 = var64.getTime(); // L: 912
															var16 = var35.before(var65); // L: 913
															var36 = java.util.Calendar.getInstance(); // L: 920
															var36.set(2, 0); // L: 921
															var36.set(5, 1); // L: 922
															var36.set(1, 1900); // L: 923
															var57 = var36.getTime(); // L: 924
															var18 = var35.after(var57); // L: 927
															if (!var18) { // L: 930
																DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 931
																var63 = false; // L: 932
															} else {
																if (!var16) { // L: 935
																	Occluder.field2399 = 8388607; // L: 936
																} else {
																	Occluder.field2399 = (int)(var35.getTime() / 86400000L - 11745L); // L: 939
																}

																var63 = true; // L: 941
															}
														}
													}

													if (var63) { // L: 944
														class111.updateGameState(50); // L: 945
														return; // L: 946
													}
												}

												var27 = Login.loginBoxX + 180 + 80; // L: 949
												if (var5 == 1 && var59 >= var27 - 75 && var59 <= var27 + 75 && var45 >= var52 - 20 && var45 <= var52 + 20) { // L: 950
													Login.field911 = new String[8]; // L: 951
													Archive.Login_promptCredentials(true); // L: 952
												}

												while (class370.isKeyDown()) { // L: 954
													if (class160.field1749 == 101) { // L: 955
														Login.field911[Login.field910] = null; // L: 956
													}

													if (class160.field1749 == 85) { // L: 958
														if (Login.field911[Login.field910] == null && Login.field910 > 0) { // L: 959
															--Login.field910; // L: 960
														}

														Login.field911[Login.field910] = null; // L: 962
													}

													if (ClanSettings.field1610 >= '0' && ClanSettings.field1610 <= '9') { // L: 964
														Login.field911[Login.field910] = "" + ClanSettings.field1610; // L: 965
														if (Login.field910 < 7) { // L: 966
															++Login.field910; // L: 967
														}
													}

													if (class160.field1749 == 84) { // L: 970
														label1290: {
															try {
																var31 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 977
																var31.setLenient(false); // L: 978
																var32 = new StringBuilder(); // L: 979
																var19 = Login.field911; // L: 981
																var20 = 0;

																while (true) {
																	if (var20 < var19.length) {
																		var33 = var19[var20]; // L: 983
																		if (var33 != null) { // L: 985
																			var32.append(var33); // L: 990
																			++var20; // L: 982
																			continue;
																		}

																		DefaultsGroup.method6590("Date not valid.", "Please ensure all characters are populated.", ""); // L: 986
																		var34 = null; // L: 987
																	} else {
																		var32.append("12"); // L: 994
																		var34 = var31.parse(var32.toString()); // L: 995
																	}

																	var35 = var34; // L: 997
																	break;
																}
															} catch (ParseException var40) { // L: 999
																DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1000
																var63 = false; // L: 1001
																break label1290; // L: 1002
															}

															if (var35 == null) { // L: 1004
																var63 = false; // L: 1005
															} else {
																var64 = java.util.Calendar.getInstance(); // L: 1010
																var64.set(1, var64.get(1) - 13); // L: 1011
																var65 = var64.getTime(); // L: 1012
																var16 = var35.before(var65); // L: 1013
																var36 = java.util.Calendar.getInstance(); // L: 1020
																var36.set(2, 0); // L: 1021
																var36.set(5, 1); // L: 1022
																var36.set(1, 1900); // L: 1023
																var57 = var36.getTime(); // L: 1024
																var18 = var35.after(var57); // L: 1027
																if (!var18) { // L: 1030
																	DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1031
																	var63 = false; // L: 1032
																} else {
																	if (!var16) { // L: 1035
																		Occluder.field2399 = 8388607; // L: 1036
																	} else {
																		Occluder.field2399 = (int)(var35.getTime() / 86400000L - 11745L); // L: 1039
																	}

																	var63 = true; // L: 1041
																}
															}
														}

														if (var63) { // L: 1044
															class111.updateGameState(50); // L: 1045
														}

														return; // L: 1047
													}
												}
											} else {
												var46 = Login.loginBoxX + 180 - 80; // L: 1052
												var9 = 321; // L: 1053
												if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1054
													MilliClock.openURL(StructComposition.method3387("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1055
													setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1056
													Player.method2159(6); // L: 1057
													return; // L: 1058
												}

												var46 = Login.loginBoxX + 180 + 80; // L: 1060
												if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1061
													Archive.Login_promptCredentials(true); // L: 1062
												}
											}
										} else if (Login.loginIndex == 8) { // L: 1066
											var46 = Login.loginBoxX + 180 - 80; // L: 1067
											var9 = 321; // L: 1068
											if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1069
												MilliClock.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1070
												setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1071
												Player.method2159(6); // L: 1072
												return; // L: 1073
											}

											var46 = Login.loginBoxX + 180 + 80; // L: 1075
											if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1076
												Archive.Login_promptCredentials(true); // L: 1077
											}
										} else if (Login.loginIndex == 9) { // L: 1080
											var46 = Login.loginBoxX + 180; // L: 1081
											var9 = 311; // L: 1082
											if (class160.field1749 == 84 || class160.field1749 == 13 || var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1083
												Tiles.method2027(false); // L: 1084
											}
										} else if (Login.loginIndex == 10) { // L: 1087
											var46 = Login.loginBoxX + 180; // L: 1088
											var9 = 209; // L: 1089
											if (class160.field1749 == 84 || var5 == 1 && var59 >= var46 - 109 && var59 <= var46 + 109 && var45 >= var9 && var45 <= var9 + 68) { // L: 1090
												setLoginResponseString("", "Connecting to server...", ""); // L: 1091
												Client.field534 = class424.field4561; // L: 1092
												Friend.method6297(false); // L: 1093
												class111.updateGameState(20); // L: 1094
											}
										} else if (Login.loginIndex == 12) { // L: 1097
											var46 = class4.loginBoxCenter; // L: 1098
											var9 = 233; // L: 1099
											Bounds var38 = var1.method6013(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var46, var9); // L: 1100
											Bounds var11 = var1.method6013(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var46, var9); // L: 1101
											Bounds var12 = var1.method6013(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var46, var9); // L: 1102
											var48 = var9 + 17; // L: 1103
											Bounds var29 = var1.method6013(0, 34, "<col=ffd200>agreement (EULA)</col>.", var46, var48); // L: 1104
											if (var5 == 1) { // L: 1105
												if (var38.method6599(var59, var45)) { // L: 1106
													MilliClock.openURL("https://www.jagex.com/terms", true, false); // L: 1107
												} else if (var11.method6599(var59, var45)) { // L: 1109
													MilliClock.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1110
												} else if (var12.method6599(var59, var45) || var29.method6599(var59, var45)) { // L: 1112
													MilliClock.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1113
												}
											}

											var46 = class4.loginBoxCenter - 80; // L: 1116
											var9 = 311; // L: 1117
											if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1118
												MenuAction.method1895(); // L: 1119
												Tiles.method2027(true); // L: 1120
											}

											var46 = class4.loginBoxCenter + 80; // L: 1122
											if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1123
												Login.loginIndex = 13; // L: 1124
											}
										} else if (Login.loginIndex == 13) { // L: 1127
											var46 = class4.loginBoxCenter; // L: 1128
											var9 = 321; // L: 1129
											if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1130
												Tiles.method2027(true); // L: 1131
											}
										} else if (Login.loginIndex == 14) { // L: 1134
											String var39 = ""; // L: 1135
											switch(Login.field914) { // L: 1136
											case 0:
												var39 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1141
												break; // L: 1142
											case 1:
												var39 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1144
												break;
											default:
												Archive.Login_promptCredentials(false); // L: 1138
											}

											var48 = Login.loginBoxX + 180; // L: 1147
											var49 = 276; // L: 1148
											if (var5 == 1 && var59 >= var48 - 75 && var59 <= var48 + 75 && var45 >= var49 - 20 && var45 <= var49 + 20) { // L: 1149
												MilliClock.openURL(var39, true, false); // L: 1150
												setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1151
												Player.method2159(6); // L: 1152
												return; // L: 1153
											}

											var48 = Login.loginBoxX + 180; // L: 1155
											var49 = 326; // L: 1156
											if (var5 == 1 && var59 >= var48 - 75 && var59 <= var48 + 75 && var45 >= var49 - 20 && var45 <= var49 + 20) { // L: 1157
												Archive.Login_promptCredentials(false); // L: 1158
											}
										} else if (Login.loginIndex == 24) { // L: 1161
											var46 = Login.loginBoxX + 180; // L: 1162
											var9 = 301; // L: 1163
											if (var5 == 1 && var59 >= var46 - 75 && var59 <= var46 + 75 && var45 >= var9 - 20 && var45 <= var9 + 20) { // L: 1164
												Tiles.method2027(false); // L: 1165
											}
										}
									} else {
										while (true) {
											do {
												if (!class370.isKeyDown()) { // L: 836
													var47 = 321; // L: 841
													if (var5 == 1 && var45 >= var47 - 20 && var45 <= var47 + 20) { // L: 842
														Archive.Login_promptCredentials(true); // L: 843
													}

													return;
												}
											} while(class160.field1749 != 84 && class160.field1749 != 13); // L: 837

											Archive.Login_promptCredentials(true); // L: 838
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 392

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "54"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1988
		Login.Login_response2 = var1; // L: 1989
		Login.Login_response3 = var2; // L: 1990
	} // L: 1991

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lij;I)V",
		garbageValue = "366984156"
	)
	static final void method2463(class255 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 6990
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var38;
		if (class255.field2946 == var0) { // L: 6991
			var2 = var1.method7414(); // L: 6992
			var38 = var1.readUnsignedByte(); // L: 6993
			var4 = (var38 >> 4 & 7) + class33.field243; // L: 6994
			var5 = (var38 & 7) + Canvas.field157; // L: 6995
			var6 = var1.readUnsignedByte(); // L: 6996
			var7 = var6 >> 2; // L: 6997
			var8 = var6 & 3; // L: 6998
			var9 = Client.field565[var7]; // L: 6999
			if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) { // L: 7000
				if (var9 == 0) { // L: 7001
					BoundaryObject var36 = Decimator.scene.method4002(SoundSystem.Client_plane, var4, var5); // L: 7002
					if (var36 != null) { // L: 7003
						var11 = Skeleton.Entity_unpackID(var36.tag); // L: 7004
						if (var7 == 2) { // L: 7005
							var36.renderable1 = new DynamicObject(var11, 2, var8 + 4, SoundSystem.Client_plane, var4, var5, var2, false, var36.renderable1); // L: 7006
							var36.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, SoundSystem.Client_plane, var4, var5, var2, false, var36.renderable2); // L: 7007
						} else {
							var36.renderable1 = new DynamicObject(var11, var7, var8, SoundSystem.Client_plane, var4, var5, var2, false, var36.renderable1); // L: 7009
						}
					}
				}

				if (var9 == 1) { // L: 7012
					WallDecoration var42 = Decimator.scene.method3919(SoundSystem.Client_plane, var4, var5); // L: 7013
					if (var42 != null) { // L: 7014
						var11 = Skeleton.Entity_unpackID(var42.tag); // L: 7015
						if (var7 != 4 && var7 != 5) { // L: 7016
							if (var7 == 6) { // L: 7017
								var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1);
							} else if (var7 == 7) { // L: 7018
								var42.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1);
							} else if (var7 == 8) { // L: 7019
								var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1); // L: 7020
								var42.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable2); // L: 7021
							}
						} else {
							var42.renderable1 = new DynamicObject(var11, 4, var8, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1);
						}
					}
				}

				if (var9 == 2) { // L: 7025
					GameObject var43 = Decimator.scene.getGameObject(SoundSystem.Client_plane, var4, var5); // L: 7026
					if (var7 == 11) { // L: 7027
						var7 = 10;
					}

					if (var43 != null) { // L: 7028
						var43.renderable = new DynamicObject(Skeleton.Entity_unpackID(var43.tag), var7, var8, SoundSystem.Client_plane, var4, var5, var2, false, var43.renderable);
					}
				}

				if (var9 == 3) { // L: 7030
					FloorDecoration var44 = Decimator.scene.getFloorDecoration(SoundSystem.Client_plane, var4, var5); // L: 7031
					if (var44 != null) { // L: 7032
						var44.renderable = new DynamicObject(Skeleton.Entity_unpackID(var44.tag), 22, var8, SoundSystem.Client_plane, var4, var5, var2, false, var44.renderable);
					}
				}
			}

		} else if (class255.field2942 == var0) { // L: 7037
			var2 = var1.readUnsignedByte(); // L: 7038
			var38 = (var2 >> 4 & 7) + class33.field243; // L: 7039
			var4 = (var2 & 7) + Canvas.field157; // L: 7040
			var5 = var1.method7414(); // L: 7041
			var6 = var1.method7408(); // L: 7042
			var7 = var1.readUnsignedShort(); // L: 7043
			if (var38 >= 0 && var4 >= 0 && var38 < 104 && var4 < 104) { // L: 7044
				NodeDeque var41 = Client.groundItems[SoundSystem.Client_plane][var38][var4]; // L: 7045
				if (var41 != null) { // L: 7046
					for (TileItem var35 = (TileItem)var41.last(); var35 != null; var35 = (TileItem)var41.previous()) { // L: 7047 7048 7053
						if ((var6 & 32767) == var35.id && var5 == var35.quantity) { // L: 7049
							var35.quantity = var7; // L: 7050
							break;
						}
					}

					StudioGame.updateItemPile(var38, var4); // L: 7055
				}
			}

		} else {
			byte var3;
			int var10;
			int var12;
			if (class255.field2947 == var0) { // L: 7060
				var2 = var1.method7414(); // L: 7061
				var3 = var1.method7400(); // L: 7062
				var4 = var1.method7562(); // L: 7063
				var5 = var1.readUnsignedShort(); // L: 7064
				var6 = var1.method7398(); // L: 7065
				var7 = (var6 >> 4 & 7) + class33.field243; // L: 7066
				var8 = (var6 & 7) + Canvas.field157; // L: 7067
				var9 = var1.method7398(); // L: 7068
				var10 = var9 >> 2; // L: 7069
				var11 = var9 & 3; // L: 7070
				var12 = Client.field565[var10]; // L: 7071
				byte var13 = var1.method7400(); // L: 7072
				byte var14 = var1.method7400(); // L: 7073
				byte var15 = var1.readByte(); // L: 7074
				int var16 = var1.readUnsignedShort(); // L: 7075
				Player var17;
				if (var2 == Client.localPlayerIndex) { // L: 7077
					var17 = WorldMapSprite.localPlayer;
				} else {
					var17 = Client.players[var2]; // L: 7078
				}

				if (var17 != null) { // L: 7079
					ObjectComposition var18 = ParamComposition.getObjectDefinition(var16); // L: 7080
					int var19;
					int var20;
					if (var11 != 1 && var11 != 3) { // L: 7083
						var19 = var18.sizeX; // L: 7088
						var20 = var18.sizeY; // L: 7089
					} else {
						var19 = var18.sizeY; // L: 7084
						var20 = var18.sizeX; // L: 7085
					}

					int var21 = var7 + (var19 >> 1); // L: 7091
					int var22 = var7 + (var19 + 1 >> 1); // L: 7092
					int var23 = var8 + (var20 >> 1); // L: 7093
					int var24 = var8 + (var20 + 1 >> 1); // L: 7094
					int[][] var25 = Tiles.Tiles_heights[SoundSystem.Client_plane]; // L: 7095
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 7096
					int var27 = (var7 << 7) + (var19 << 6); // L: 7097
					int var28 = (var8 << 7) + (var20 << 6); // L: 7098
					Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28); // L: 7099
					if (var29 != null) { // L: 7100
						AbstractWorldMapData.updatePendingSpawn(SoundSystem.Client_plane, var7, var8, var12, -1, 0, 0, var4 + 1, var5 + 1); // L: 7101
						var17.animationCycleStart = var4 + Client.cycle; // L: 7102
						var17.animationCycleEnd = var5 + Client.cycle; // L: 7103
						var17.model0 = var29; // L: 7104
						var17.field1075 = var19 * 64 + var7 * 128; // L: 7105
						var17.field1077 = var20 * 64 + var8 * 128; // L: 7106
						var17.tileHeight2 = var26; // L: 7107
						byte var30;
						if (var14 > var3) { // L: 7108
							var30 = var14; // L: 7109
							var14 = var3; // L: 7110
							var3 = var30; // L: 7111
						}

						if (var15 > var13) { // L: 7113
							var30 = var15; // L: 7114
							var15 = var13; // L: 7115
							var13 = var30; // L: 7116
						}

						var17.minX = var14 + var7; // L: 7118
						var17.maxX = var7 + var3; // L: 7119
						var17.minY = var15 + var8; // L: 7120
						var17.maxY = var13 + var8; // L: 7121
					}
				}
			}

			TileItem var33;
			if (class255.field2941 == var0) { // L: 7125
				var2 = var1.readUnsignedShort(); // L: 7126
				var38 = var1.method7408(); // L: 7127
				var4 = var1.method7467(); // L: 7128
				var5 = (var4 >> 4 & 7) + class33.field243; // L: 7129
				var6 = (var4 & 7) + Canvas.field157; // L: 7130
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7131
					var33 = new TileItem(); // L: 7132
					var33.id = var38; // L: 7133
					var33.quantity = var2; // L: 7134
					if (Client.groundItems[SoundSystem.Client_plane][var5][var6] == null) { // L: 7135
						Client.groundItems[SoundSystem.Client_plane][var5][var6] = new NodeDeque();
					}

					Client.groundItems[SoundSystem.Client_plane][var5][var6].addFirst(var33); // L: 7136
					StudioGame.updateItemPile(var5, var6); // L: 7137
				}

			} else if (class255.field2945 == var0) { // L: 7141
				var2 = var1.readUnsignedShort(); // L: 7142
				var38 = var1.method7398(); // L: 7143
				var4 = var38 >> 2; // L: 7144
				var5 = var38 & 3; // L: 7145
				var6 = Client.field565[var4]; // L: 7146
				var7 = var1.method7398(); // L: 7147
				var8 = (var7 >> 4 & 7) + class33.field243; // L: 7148
				var9 = (var7 & 7) + Canvas.field157; // L: 7149
				if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7150
					AbstractWorldMapData.updatePendingSpawn(SoundSystem.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1); // L: 7151
				}

			} else if (class255.field2949 == var0) { // L: 7155
				var2 = var1.method7467(); // L: 7156
				var38 = (var2 >> 4 & 7) + class33.field243; // L: 7157
				var4 = (var2 & 7) + Canvas.field157; // L: 7158
				var5 = var1.method7467(); // L: 7159
				var6 = var1.method7414(); // L: 7160
				var7 = var1.method7562(); // L: 7161
				if (var38 >= 0 && var4 >= 0 && var38 < 104 && var4 < 104) { // L: 7162
					var38 = var38 * 128 + 64; // L: 7163
					var4 = var4 * 128 + 64; // L: 7164
					GraphicsObject var34 = new GraphicsObject(var6, SoundSystem.Client_plane, var38, var4, class92.getTileHeight(var38, var4, SoundSystem.Client_plane) - var5, var7, Client.cycle); // L: 7165
					Client.graphicsObjects.addFirst(var34); // L: 7166
				}

			} else {
				if (class255.field2950 == var0) { // L: 7170
					var2 = var1.readUnsignedByte(); // L: 7171
					var38 = var2 >> 4 & 15; // L: 7172
					var4 = var2 & 7; // L: 7173
					var5 = var1.method7408(); // L: 7174
					var6 = var1.method7467(); // L: 7175
					var7 = var1.method7467(); // L: 7176
					var8 = (var7 >> 4 & 7) + class33.field243; // L: 7177
					var9 = (var7 & 7) + Canvas.field157; // L: 7178
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7179
						var10 = var38 + 1; // L: 7180
						if (WorldMapSprite.localPlayer.pathX[0] >= var8 - var10 && WorldMapSprite.localPlayer.pathX[0] <= var10 + var8 && WorldMapSprite.localPlayer.pathY[0] >= var9 - var10 && WorldMapSprite.localPlayer.pathY[0] <= var9 + var10 && class424.clientPreferences.areaSoundEffectsVolume != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 7181 7182
							Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 7183
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 7184
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var6; // L: 7185
							Client.soundEffects[Client.soundEffectCount] = null; // L: 7186
							Client.soundLocations[Client.soundEffectCount] = var38 + (var9 << 8) + (var8 << 16); // L: 7187
							++Client.soundEffectCount; // L: 7188
						}
					}
				}

				if (class255.field2944 == var0) { // L: 7193
					var2 = var1.method7398(); // L: 7194
					var38 = (var2 >> 4 & 7) + class33.field243; // L: 7195
					var4 = (var2 & 7) + Canvas.field157; // L: 7196
					var5 = var1.method7399(); // L: 7197
					var6 = var5 >> 2; // L: 7198
					var7 = var5 & 3; // L: 7199
					var8 = Client.field565[var6]; // L: 7200
					if (var38 >= 0 && var4 >= 0 && var38 < 104 && var4 < 104) { // L: 7201
						AbstractWorldMapData.updatePendingSpawn(SoundSystem.Client_plane, var38, var4, var8, -1, var6, var7, 0, -1); // L: 7202
					}

				} else if (class255.field2943 != var0) { // L: 7206
					if (class255.field2948 == var0) { // L: 7228
						byte var37 = var1.method7365(); // L: 7229
						var3 = var1.method7365(); // L: 7230
						var4 = var1.method7562(); // L: 7231
						var5 = var1.method7409(); // L: 7232
						var6 = var1.method7562(); // L: 7233
						var7 = var1.method7399() * 4; // L: 7234
						var8 = var1.method7467(); // L: 7235
						var9 = var1.method7562(); // L: 7236
						var10 = var1.method7467() * 4; // L: 7237
						var11 = var1.method7399(); // L: 7238
						var12 = (var11 >> 4 & 7) + class33.field243; // L: 7239
						int var39 = (var11 & 7) + Canvas.field157; // L: 7240
						int var40 = var1.method7399(); // L: 7241
						var2 = var37 + var12; // L: 7242
						var38 = var3 + var39; // L: 7243
						if (var12 >= 0 && var39 >= 0 && var12 < 104 && var39 < 104 && var2 >= 0 && var38 >= 0 && var2 < 104 && var38 < 104 && var4 != 65535) { // L: 7244
							var12 = var12 * 128 + 64; // L: 7245
							var39 = var39 * 128 + 64; // L: 7246
							var2 = var2 * 128 + 64; // L: 7247
							var38 = var38 * 128 + 64; // L: 7248
							Projectile var31 = new Projectile(var4, SoundSystem.Client_plane, var12, var39, class92.getTileHeight(var12, var39, SoundSystem.Client_plane) - var7, var6 + Client.cycle, var9 + Client.cycle, var40, var8, var5, var10); // L: 7249
							var31.setDestination(var2, var38, class92.getTileHeight(var2, var38, SoundSystem.Client_plane) - var10, var6 + Client.cycle); // L: 7250
							Client.projectiles.addFirst(var31); // L: 7251
						}

					}
				} else {
					var2 = var1.method7562(); // L: 7207
					var38 = var1.method7467(); // L: 7208
					var4 = (var38 >> 4 & 7) + class33.field243; // L: 7209
					var5 = (var38 & 7) + Canvas.field157; // L: 7210
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7211
						NodeDeque var32 = Client.groundItems[SoundSystem.Client_plane][var4][var5]; // L: 7212
						if (var32 != null) { // L: 7213
							for (var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) { // L: 7214 7215 7220
								if ((var2 & 32767) == var33.id) { // L: 7216
									var33.remove(); // L: 7217
									break;
								}
							}

							if (var32.last() == null) { // L: 7222
								Client.groundItems[SoundSystem.Client_plane][var4][var5] = null;
							}

							StudioGame.updateItemPile(var4, var5); // L: 7223
						}
					}

				}
			}
		}
	} // L: 7035 7058 7139 7153 7168 7204 7226 7253 7255
}
