import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class194 {
	@ObfuscatedName("h")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("g")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1600759589
	)
	static int field2202;
	@ObfuscatedName("f")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("u")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lpz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Law;Lmr;I)V",
		garbageValue = "847036111"
	)
	static void method3894(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) { // L: 329
			MouseHandler.method621(var0); // L: 330
		} else {
			int var4;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator5.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 333
				Interpreter.clientPreferences.method2258(!Interpreter.clientPreferences.method2259()); // L: 334
				if (!Interpreter.clientPreferences.method2259()) { // L: 335
					Archive var2 = ArchiveLoader.archive6; // L: 336
					int var3 = var2.getGroupId("scape main"); // L: 338
					var4 = var2.getFileId(var3, ""); // L: 339
					WorldMapSection2.method4561(var2, var3, var4, 255, false); // L: 340
				} else {
					WorldMapEvent.midiPcmStream.clear(); // L: 344
					class273.musicPlayerStatus = 1; // L: 345
					class147.musicTrackArchive = null; // L: 346
				}
			}

			if (Client.gameState != 5) { // L: 349
				if (-1L == Login.field911) { // L: 350
					Login.field911 = WorldMapSprite.method4989() + 1000L; // L: 351
				}

				long var21 = WorldMapSprite.method4989(); // L: 353
				if (class149.method3079() && Login.field912 == -1L) { // L: 354 355
					Login.field912 = var21; // L: 356
					if (Login.field912 > Login.field911) { // L: 357
						Login.field911 = Login.field912; // L: 358
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 362
					if (Language.Language_EN == FriendSystem.clientLanguage) { // L: 363
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator5.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 364
							var4 = Login.xPadding + 5; // L: 365
							short var5 = 463; // L: 366
							byte var6 = 100; // L: 367
							byte var7 = 35; // L: 368
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var6 + var4 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) { // L: 369
								FloorUnderlayDefinition.method3548(); // L: 370
								return; // L: 371
							}
						}

						if (class345.World_request != null) { // L: 374
							FloorUnderlayDefinition.method3548();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 376
					int var51 = MouseHandler.MouseHandler_lastPressedX; // L: 377
					int var52 = MouseHandler.MouseHandler_lastPressedY; // L: 378
					if (var4 == 0) { // L: 379
						var51 = MouseHandler.MouseHandler_x; // L: 380
						var52 = MouseHandler.MouseHandler_y; // L: 381
					}

					if (!UserComparator5.mouseCam && var4 == 4) { // L: 383
						var4 = 1;
					}

					int var55;
					short var56;
					if (Login.loginIndex == 0) { // L: 384
						boolean var68 = false; // L: 385

						while (class16.isKeyDown()) { // L: 386
							if (class241.field2833 == 84) { // L: 387
								var68 = true; // L: 388
							}
						}

						var55 = class134.loginBoxCenter - 80; // L: 391
						var56 = 291; // L: 392
						if (var4 == 1 && var51 >= var55 - 75 && var51 <= var55 + 75 && var52 >= var56 - 20 && var52 <= var56 + 20) { // L: 393
							class11.openURL(class129.method2849("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 394
						}

						var55 = class134.loginBoxCenter + 80; // L: 396
						if (var4 == 1 && var51 >= var55 - 75 && var51 <= var55 + 75 && var52 >= var56 - 20 && var52 <= var56 + 20 || var68) { // L: 397
							if ((Client.worldProperties & 33554432) != 0) { // L: 398
								Login.Login_response0 = ""; // L: 399
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 400
								Login.Login_response2 = "Your normal account will not be affected."; // L: 401
								Login.Login_response3 = ""; // L: 402
								class150.method3089(1); // L: 403
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 405
									Login.currentLoginField = 1; // L: 406
								} else {
									Login.currentLoginField = 0; // L: 409
								}
							} else if ((Client.worldProperties & 4) != 0) { // L: 413
								if ((Client.worldProperties & 1024) != 0) { // L: 414
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 415
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 416
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 417
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 420
									Login.Login_response2 = "Players can attack each other"; // L: 421
									Login.Login_response3 = "almost everywhere."; // L: 422
								}

								Login.Login_response0 = "Warning!"; // L: 424
								class150.method3089(1); // L: 425
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 427
									Login.currentLoginField = 1; // L: 428
								} else {
									Login.currentLoginField = 0; // L: 431
								}
							} else if ((Client.worldProperties & 1024) != 0) { // L: 435
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 436
								Login.Login_response2 = "The Protect Item prayer will"; // L: 437
								Login.Login_response3 = "not work on this world."; // L: 438
								Login.Login_response0 = "Warning!"; // L: 439
								class150.method3089(1); // L: 440
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 442
									Login.currentLoginField = 1; // L: 443
								} else {
									Login.currentLoginField = 0; // L: 446
								}
							} else {
								class127.Login_promptCredentials(false); // L: 451
							}
						}
					} else {
						short var8;
						int var53;
						if (Login.loginIndex == 1) { // L: 455
							while (true) {
								if (!class16.isKeyDown()) { // L: 456
									var53 = class134.loginBoxCenter - 80; // L: 464
									var8 = 321; // L: 465
									if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 466
										class127.Login_promptCredentials(false); // L: 467
									}

									var53 = class134.loginBoxCenter + 80; // L: 469
									if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 470
										class150.method3089(0); // L: 471
									}
									break;
								}

								if (class241.field2833 == 84) { // L: 457
									class127.Login_promptCredentials(false); // L: 458
								} else if (class241.field2833 == 13) { // L: 460
									class150.method3089(0); // L: 461
								}
							}
						} else {
							int var11;
							int var12;
							int var19;
							int var27;
							short var54;
							boolean var58;
							if (Login.loginIndex == 2) { // L: 474
								var54 = 201; // L: 475
								var53 = var54 + 52; // L: 476
								if (var4 == 1 && var52 >= var53 - 12 && var52 < var53 + 2) { // L: 477
									Login.currentLoginField = 0;
								}

								var53 += 15; // L: 478
								if (var4 == 1 && var52 >= var53 - 12 && var52 < var53 + 2) { // L: 479
									Login.currentLoginField = 1;
								}

								var53 += 15; // L: 480
								var54 = 361; // L: 481
								if (DynamicObject.field973 != null) { // L: 482
									var55 = DynamicObject.field973.highX / 2; // L: 483
									if (var4 == 1 && var51 >= DynamicObject.field973.lowX - var55 && var51 <= var55 + DynamicObject.field973.lowX && var52 >= var54 - 15 && var52 < var54) { // L: 484
										switch(Login.field897) { // L: 485
										case 1:
											GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 488
											class150.method3089(5); // L: 489
											return; // L: 490
										case 2:
											class11.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 494
										}
									}
								}

								var55 = class134.loginBoxCenter - 80; // L: 500
								var56 = 321; // L: 501
								if (var4 == 1 && var51 >= var55 - 75 && var51 <= var55 + 75 && var52 >= var56 - 20 && var52 <= var56 + 20) { // L: 502
									Login.Login_username = Login.Login_username.trim(); // L: 503
									if (Login.Login_username.length() == 0) { // L: 504
										GrandExchangeEvent.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 505
										return; // L: 506
									}

									if (Login.Login_password.length() == 0) { // L: 508
										GrandExchangeEvent.setLoginResponseString("", "Please enter your password.", ""); // L: 509
										return; // L: 510
									}

									GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", ""); // L: 512
									Varcs.method2462(false); // L: 513
									InterfaceParent.updateGameState(20); // L: 514
									return; // L: 515
								}

								var55 = Login.loginBoxX + 180 + 80; // L: 517
								if (var4 == 1 && var51 >= var55 - 75 && var51 <= var55 + 75 && var52 >= var56 - 20 && var52 <= var56 + 20) { // L: 518
									class150.method3089(0); // L: 519
									Login.Login_username = ""; // L: 520
									Login.Login_password = ""; // L: 521
									UrlRequest.field1346 = 0; // L: 522
									class452.otp = ""; // L: 523
									Login.field903 = true; // L: 524
								}

								var55 = class134.loginBoxCenter + -117; // L: 526
								var56 = 277; // L: 527
								Login.field901 = var51 >= var55 && var51 < var55 + Message.field458 && var52 >= var56 && var52 < var56 + KeyHandler.field140; // L: 528
								if (var4 == 1 && Login.field901) { // L: 529
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 530
									if (!Client.Login_isUsernameRemembered && Interpreter.clientPreferences.method2273() != null) { // L: 531
										Interpreter.clientPreferences.method2316((String)null); // L: 532
									}
								}

								var55 = class134.loginBoxCenter + 24; // L: 535
								var56 = 277; // L: 536
								Login.field902 = var51 >= var55 && var51 < var55 + Message.field458 && var52 >= var56 && var52 < var56 + KeyHandler.field140; // L: 537
								if (var4 == 1 && Login.field902) { // L: 538
									Interpreter.clientPreferences.method2256(!Interpreter.clientPreferences.method2257()); // L: 539
									if (!Interpreter.clientPreferences.method2257()) { // L: 540
										Login.Login_username = ""; // L: 541
										Interpreter.clientPreferences.method2316((String)null); // L: 542
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 544
											Login.currentLoginField = 1; // L: 545
										} else {
											Login.currentLoginField = 0; // L: 548
										}
									}
								}

								label1490:
								while (true) {
									Transferable var75;
									do {
										while (true) {
											label1404:
											do {
												while (true) {
													while (class16.isKeyDown()) { // L: 553
														if (class241.field2833 != 13) { // L: 554
															if (Login.currentLoginField != 0) { // L: 563
																continue label1404;
															}

															char var59 = class1.field3; // L: 564

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var59 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 566 567
															}

															if (class241.field2833 == 85 && Login.Login_username.length() > 0) { // L: 570
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class241.field2833 == 84 || class241.field2833 == 80) { // L: 571
																Login.currentLoginField = 1;
															}

															char var61 = class1.field3; // L: 573
															boolean var65 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var61) != -1; // L: 575
															if (var65 && Login.Login_username.length() < 320) { // L: 577
																Login.Login_username = Login.Login_username + class1.field3;
															}
														} else {
															class150.method3089(0); // L: 555
															Login.Login_username = ""; // L: 556
															Login.Login_password = ""; // L: 557
															UrlRequest.field1346 = 0; // L: 558
															class452.otp = ""; // L: 559
															Login.field903 = true; // L: 560
														}
													}

													return; // L: 1243
												}
											} while(Login.currentLoginField != 1); // L: 579

											if (class241.field2833 == 85 && Login.Login_password.length() > 0) { // L: 580
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 581
											} else if (class241.field2833 == 84 || class241.field2833 == 80) { // L: 583
												Login.currentLoginField = 0; // L: 584
												if (class241.field2833 == 84) { // L: 585
													Login.Login_username = Login.Login_username.trim(); // L: 586
													if (Login.Login_username.length() == 0) { // L: 587
														GrandExchangeEvent.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 588
														return; // L: 589
													}

													if (Login.Login_password.length() == 0) { // L: 591
														GrandExchangeEvent.setLoginResponseString("", "Please enter your password.", ""); // L: 592
														return; // L: 593
													}

													GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", ""); // L: 595
													Varcs.method2462(false); // L: 596
													InterfaceParent.updateGameState(20); // L: 597
													return; // L: 598
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class241.field2833 == 67) { // L: 601
												Clipboard var74 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 602
												var75 = var74.getContents(UserComparator10.client); // L: 603
												var12 = 20 - Login.Login_password.length(); // L: 604
												break;
											}

											char var66 = class1.field3; // L: 654
											if (var66 >= ' ' && var66 < 127 || var66 > 127 && var66 < 160 || var66 > 160 && var66 <= 255) { // L: 656
												var58 = true; // L: 657
											} else {
												label1661: {
													if (var66 != 0) { // L: 660
														char[] var77 = class345.cp1252AsciiExtension; // L: 662

														for (var27 = 0; var27 < var77.length; ++var27) { // L: 663
															char var14 = var77[var27]; // L: 664
															if (var66 == var14) { // L: 666
																var58 = true; // L: 667
																break label1661; // L: 668
															}
														}
													}

													var58 = false; // L: 674
												}
											}

											if (var58) { // L: 676
												char var86 = class1.field3; // L: 678
												boolean var63 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var86) != -1; // L: 680
												if (var63 && Login.Login_password.length() < 20) { // L: 682 683
													Login.Login_password = Login.Login_password + class1.field3; // L: 684
												}
											}
										}
									} while(var12 <= 0); // L: 605

									try {
										String var62 = (String)var75.getTransferData(DataFlavor.stringFlavor); // L: 607
										int var64 = Math.min(var12, var62.length()); // L: 608
										int var67 = 0;

										while (true) {
											if (var67 >= var64) {
												Login.Login_password = Login.Login_password + var62.substring(0, var64); // L: 646
												continue label1490;
											}

											char var70 = var62.charAt(var67); // L: 612
											boolean var16;
											if (var70 >= ' ' && var70 < 127 || var70 > 127 && var70 < 160 || var70 > 160 && var70 <= 255) { // L: 614
												var16 = true; // L: 615
											} else {
												label1662: {
													if (var70 != 0) { // L: 618
														char[] var72 = class345.cp1252AsciiExtension; // L: 620

														for (var19 = 0; var19 < var72.length; ++var19) { // L: 621
															char var20 = var72[var19]; // L: 622
															if (var70 == var20) { // L: 624
																var16 = true; // L: 625
																break label1662; // L: 626
															}
														}
													}

													var16 = false; // L: 632
												}
											}

											if (!var16) { // L: 634
												break;
											}

											char var73 = var62.charAt(var67); // L: 636
											boolean var25 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var73) != -1; // L: 638
											if (!var25) { // L: 640
												break;
											}

											++var67; // L: 609
										}

										class150.method3089(3); // L: 642
										return; // L: 643
									} catch (UnsupportedFlavorException var49) { // L: 648
									} catch (IOException var50) { // L: 649
									}
								}
							} else if (Login.loginIndex == 3) { // L: 693
								var53 = Login.loginBoxX + 180; // L: 694
								var8 = 276; // L: 695
								if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 696
									class230.method4894(false); // L: 697
								}

								var53 = Login.loginBoxX + 180; // L: 699
								var8 = 326; // L: 700
								if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 701
									GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 702
									class150.method3089(5); // L: 703
									return; // L: 704
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 707
									var53 = Login.loginBoxX + 180 - 80; // L: 708
									var8 = 321; // L: 709
									if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 710
										class452.otp.trim(); // L: 711
										if (class452.otp.length() != 6) { // L: 712
											GrandExchangeEvent.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 713
											return; // L: 714
										}

										UrlRequest.field1346 = Integer.parseInt(class452.otp); // L: 716
										class452.otp = ""; // L: 717
										Varcs.method2462(true); // L: 718
										GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", ""); // L: 719
										InterfaceParent.updateGameState(20); // L: 720
										return; // L: 721
									}

									if (var4 == 1 && var51 >= Login.loginBoxX + 180 - 9 && var51 <= Login.loginBoxX + 180 + 130 && var52 >= 263 && var52 <= 296) { // L: 723
										Login.field903 = !Login.field903; // L: 724
									}

									if (var4 == 1 && var51 >= Login.loginBoxX + 180 - 34 && var51 <= Login.loginBoxX + 34 + 180 && var52 >= 351 && var52 <= 363) { // L: 726
										class11.openURL(class129.method2849("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 727
									}

									var53 = Login.loginBoxX + 180 + 80; // L: 729
									if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 730
										class150.method3089(0); // L: 731
										Login.Login_username = ""; // L: 732
										Login.Login_password = ""; // L: 733
										UrlRequest.field1346 = 0; // L: 734
										class452.otp = ""; // L: 735
									}

									while (class16.isKeyDown()) { // L: 737
										boolean var9 = false; // L: 738

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 739
											if (class1.field3 == "1234567890".charAt(var10)) { // L: 740
												var9 = true; // L: 741
												break; // L: 742
											}
										}

										if (class241.field2833 == 13) { // L: 745
											class150.method3089(0); // L: 746
											Login.Login_username = ""; // L: 747
											Login.Login_password = ""; // L: 748
											UrlRequest.field1346 = 0; // L: 749
											class452.otp = ""; // L: 750
										} else {
											if (class241.field2833 == 85 && class452.otp.length() > 0) { // L: 753
												class452.otp = class452.otp.substring(0, class452.otp.length() - 1);
											}

											if (class241.field2833 == 84) { // L: 754
												class452.otp.trim(); // L: 755
												if (class452.otp.length() != 6) { // L: 756
													GrandExchangeEvent.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 757
													return; // L: 758
												}

												UrlRequest.field1346 = Integer.parseInt(class452.otp); // L: 760
												class452.otp = ""; // L: 761
												Varcs.method2462(true); // L: 762
												GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", ""); // L: 763
												InterfaceParent.updateGameState(20); // L: 764
												return; // L: 765
											}

											if (var9 && class452.otp.length() < 6) { // L: 767
												class452.otp = class452.otp + class1.field3;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 771
									var53 = Login.loginBoxX + 180 - 80; // L: 772
									var8 = 321; // L: 773
									if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 774
										Login.Login_username = Login.Login_username.trim(); // L: 776
										if (Login.Login_username.length() == 0) { // L: 777
											GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 778
										} else {
											long var31;
											try {
												URL var26 = new URL(class129.method2849("services", false) + "m=accountappeal/login.ws"); // L: 785
												URLConnection var13 = var26.openConnection(); // L: 786
												var13.setRequestProperty("connection", "close"); // L: 787
												var13.setDoInput(true); // L: 788
												var13.setDoOutput(true); // L: 789
												var13.setConnectTimeout(5000); // L: 790
												OutputStreamWriter var79 = new OutputStreamWriter(var13.getOutputStream()); // L: 791
												var79.write("data1=req"); // L: 792
												var79.flush(); // L: 793
												InputStream var81 = var13.getInputStream(); // L: 794
												Buffer var83 = new Buffer(new byte[1000]); // L: 795

												while (true) {
													int var17 = var81.read(var83.array, var83.offset, 1000 - var83.offset); // L: 797
													if (var17 == -1) { // L: 798
														var83.offset = 0; // L: 805
														long var33 = var83.readLong(); // L: 806
														var31 = var33; // L: 807
														break;
													}

													var83.offset += var17; // L: 799
													if (var83.offset >= 1000) { // L: 800
														var31 = 0L; // L: 801
														break;
													}
												}
											} catch (Exception var45) { // L: 809
												var31 = 0L; // L: 810
											}

											int var57;
											if (0L == var31) { // L: 814
												var57 = 5;
											} else {
												var57 = class141.method2990(var31, Login.Login_username); // L: 815
											}

											switch(var57) { // L: 816
											case 2:
												GrandExchangeEvent.setLoginResponseString(Strings.field3645, Strings.field3870, Strings.field3871); // L: 824
												class150.method3089(6); // L: 825
												break; // L: 826
											case 3:
												GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", ""); // L: 831
												break; // L: 832
											case 4:
												GrandExchangeEvent.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 834
												break;
											case 5:
												GrandExchangeEvent.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 818
												break; // L: 819
											case 6:
												GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", ""); // L: 821
												break; // L: 822
											case 7:
												GrandExchangeEvent.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 828
											}
										}

										return; // L: 838
									}

									var53 = Login.loginBoxX + 180 + 80; // L: 840
									if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 841
										class127.Login_promptCredentials(true); // L: 842
									}

									var56 = 361; // L: 844
									if (Projectile.field946 != null) { // L: 845
										var10 = Projectile.field946.highX / 2; // L: 846
										if (var4 == 1 && var51 >= Projectile.field946.lowX - var10 && var51 <= var10 + Projectile.field946.lowX && var52 >= var56 - 15 && var52 < var56) { // L: 847
											class11.openURL(class129.method2849("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 848
										}
									}

									while (class16.isKeyDown()) { // L: 851
										var58 = false; // L: 852

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 853
											if (class1.field3 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 854
												var58 = true; // L: 855
												break; // L: 856
											}
										}

										if (class241.field2833 == 13) { // L: 859
											class127.Login_promptCredentials(true); // L: 860
										} else {
											if (class241.field2833 == 85 && Login.Login_username.length() > 0) { // L: 863
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class241.field2833 == 84) { // L: 864
												Login.Login_username = Login.Login_username.trim(); // L: 866
												if (Login.Login_username.length() == 0) { // L: 867
													GrandExchangeEvent.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 868
												} else {
													long var35;
													try {
														URL var28 = new URL(class129.method2849("services", false) + "m=accountappeal/login.ws"); // L: 875
														URLConnection var29 = var28.openConnection(); // L: 876
														var29.setRequestProperty("connection", "close"); // L: 877
														var29.setDoInput(true); // L: 878
														var29.setDoOutput(true); // L: 879
														var29.setConnectTimeout(5000); // L: 880
														OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream()); // L: 881
														var30.write("data1=req"); // L: 882
														var30.flush(); // L: 883
														InputStream var37 = var29.getInputStream(); // L: 884
														Buffer var18 = new Buffer(new byte[1000]); // L: 885

														while (true) {
															var19 = var37.read(var18.array, var18.offset, 1000 - var18.offset); // L: 887
															if (var19 == -1) { // L: 888
																var18.offset = 0; // L: 895
																long var38 = var18.readLong(); // L: 896
																var35 = var38; // L: 897
																break;
															}

															var18.offset += var19; // L: 889
															if (var18.offset >= 1000) { // L: 890
																var35 = 0L; // L: 891
																break;
															}
														}
													} catch (Exception var46) { // L: 899
														var35 = 0L; // L: 900
													}

													if (0L == var35) { // L: 904
														var11 = 5;
													} else {
														var11 = class141.method2990(var35, Login.Login_username); // L: 905
													}

													switch(var11) { // L: 906
													case 2:
														GrandExchangeEvent.setLoginResponseString(Strings.field3645, Strings.field3870, Strings.field3871); // L: 914
														class150.method3089(6); // L: 915
														break; // L: 916
													case 3:
														GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", ""); // L: 911
														break; // L: 912
													case 4:
														GrandExchangeEvent.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 924
														break;
													case 5:
														GrandExchangeEvent.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 921
														break; // L: 922
													case 6:
														GrandExchangeEvent.setLoginResponseString("", "Error connecting to server.", ""); // L: 908
														break; // L: 909
													case 7:
														GrandExchangeEvent.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 918
													}
												}

												return; // L: 928
											}

											if (var58 && Login.Login_username.length() < 320) { // L: 930
												Login.Login_username = Login.Login_username + class1.field3;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 934
									if (Login.loginIndex == 7) { // L: 945
										if (class260.field2888 && !Client.onMobile) { // L: 946
											var53 = class134.loginBoxCenter - 150; // L: 947
											var55 = var53 + 40 + 240 + 25; // L: 948
											var56 = 231; // L: 949
											var10 = var56 + 40; // L: 950
											if (var4 == 1 && var51 >= var53 && var51 <= var55 && var52 >= var56 && var52 <= var10) { // L: 951
												var12 = var53; // L: 953
												var27 = 0;

												while (true) {
													if (var27 >= 8) {
														var11 = 0; // L: 963
														break;
													}

													if (var51 <= var12 + 30) { // L: 956
														var11 = var27; // L: 957
														break; // L: 958
													}

													var12 += 30; // L: 960
													var12 += var27 != 1 && var27 != 3 ? 5 : 20; // L: 961
													++var27; // L: 955
												}

												Login.field899 = var11; // L: 965
											}

											var11 = Login.loginBoxX + 180 - 80; // L: 967
											short var60 = 321; // L: 968
											boolean var15;
											String var42;
											boolean var69;
											String[] var71;
											boolean var78;
											Date var80;
											Date var82;
											SimpleDateFormat var84;
											java.util.Calendar var85;
											StringBuilder var87;
											Date var88;
											if (var4 == 1 && var51 >= var11 - 75 && var51 <= var11 + 75 && var52 >= var60 - 20 && var52 <= var60 + 20) { // L: 969
												label1256: {
													try {
														var84 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 976
														var84.setLenient(false); // L: 977
														var87 = new StringBuilder(); // L: 978
														var71 = Login.field900; // L: 980
														var19 = 0;

														while (true) {
															if (var19 < var71.length) {
																var42 = var71[var19]; // L: 982
																if (var42 != null) { // L: 984
																	var87.append(var42); // L: 989
																	++var19; // L: 981
																	continue;
																}

																class150.method3092("Date not valid.", "Please ensure all characters are populated.", ""); // L: 985
																var82 = null; // L: 986
															} else {
																var87.append("12"); // L: 993
																var82 = var84.parse(var87.toString()); // L: 994
															}

															var80 = var82; // L: 996
															break;
														}
													} catch (ParseException var48) { // L: 998
														class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 999
														var78 = false; // L: 1000
														break label1256; // L: 1001
													}

													if (var80 == null) { // L: 1003
														var78 = false; // L: 1004
													} else {
														var85 = java.util.Calendar.getInstance(); // L: 1009
														var85.set(1, var85.get(1) - 13); // L: 1010
														var88 = var85.getTime(); // L: 1011
														var15 = var80.before(var88); // L: 1012
														var69 = GraphicsObject.method1864(var80); // L: 1015
														if (!var69) { // L: 1016
															class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1017
															var78 = false; // L: 1018
														} else {
															if (!var15) { // L: 1021
																class9.field35 = 8388607; // L: 1022
															} else {
																class9.field35 = (int)(var80.getTime() / 86400000L - 11745L); // L: 1025
															}

															var78 = true; // L: 1027
														}
													}
												}

												if (var78) { // L: 1030
													InterfaceParent.updateGameState(50); // L: 1031
													return; // L: 1032
												}
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 1035
											if (var4 == 1 && var51 >= var11 - 75 && var51 <= var11 + 75 && var52 >= var60 - 20 && var52 <= var60 + 20) { // L: 1036
												Login.field900 = new String[8]; // L: 1037
												class127.Login_promptCredentials(true); // L: 1038
											}

											while (class16.isKeyDown()) { // L: 1040
												if (class241.field2833 == 101) { // L: 1041
													Login.field900[Login.field899] = null; // L: 1042
												}

												if (class241.field2833 == 85) { // L: 1044
													if (Login.field900[Login.field899] == null && Login.field899 > 0) { // L: 1045
														--Login.field899; // L: 1046
													}

													Login.field900[Login.field899] = null; // L: 1048
												}

												if (class1.field3 >= '0' && class1.field3 <= '9') { // L: 1050
													Login.field900[Login.field899] = "" + class1.field3; // L: 1051
													if (Login.field899 < 7) { // L: 1052
														++Login.field899; // L: 1053
													}
												}

												if (class241.field2833 == 84) { // L: 1056
													label1185: {
														try {
															var84 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1063
															var84.setLenient(false); // L: 1064
															var87 = new StringBuilder(); // L: 1065
															var71 = Login.field900; // L: 1067
															var19 = 0;

															while (true) {
																if (var19 >= var71.length) {
																	var87.append("12"); // L: 1080
																	var82 = var84.parse(var87.toString()); // L: 1081
																	break;
																}

																var42 = var71[var19]; // L: 1069
																if (var42 == null) { // L: 1071
																	class150.method3092("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1072
																	var82 = null; // L: 1073
																	break; // L: 1074
																}

																var87.append(var42); // L: 1076
																++var19; // L: 1068
															}

															var80 = var82; // L: 1083
														} catch (ParseException var47) { // L: 1085
															class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1086
															var78 = false; // L: 1087
															break label1185; // L: 1088
														}

														if (var80 == null) { // L: 1090
															var78 = false; // L: 1091
														} else {
															var85 = java.util.Calendar.getInstance(); // L: 1096
															var85.set(1, var85.get(1) - 13); // L: 1097
															var88 = var85.getTime(); // L: 1098
															var15 = var80.before(var88); // L: 1099
															var69 = GraphicsObject.method1864(var80); // L: 1102
															if (!var69) { // L: 1103
																class150.method3092("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1104
																var78 = false; // L: 1105
															} else {
																if (!var15) { // L: 1108
																	class9.field35 = 8388607; // L: 1109
																} else {
																	class9.field35 = (int)(var80.getTime() / 86400000L - 11745L); // L: 1112
																}

																var78 = true; // L: 1114
															}
														}
													}

													if (var78) { // L: 1117
														InterfaceParent.updateGameState(50); // L: 1118
													}

													return; // L: 1120
												}
											}
										} else {
											var53 = Login.loginBoxX + 180 - 80; // L: 1125
											var8 = 321; // L: 1126
											if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1127
												class11.openURL(class129.method2849("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1128
												GrandExchangeEvent.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1129
												class150.method3089(6); // L: 1130
												return; // L: 1131
											}

											var53 = Login.loginBoxX + 180 + 80; // L: 1133
											if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1134
												class127.Login_promptCredentials(true); // L: 1135
											}
										}
									} else if (Login.loginIndex == 8) { // L: 1139
										var53 = Login.loginBoxX + 180 - 80; // L: 1140
										var8 = 321; // L: 1141
										if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1142
											class11.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1143
											GrandExchangeEvent.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1144
											class150.method3089(6); // L: 1145
											return; // L: 1146
										}

										var53 = Login.loginBoxX + 180 + 80; // L: 1148
										if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1149
											class127.Login_promptCredentials(true); // L: 1150
										}
									} else if (Login.loginIndex == 9) { // L: 1153
										var53 = Login.loginBoxX + 180; // L: 1154
										var8 = 311; // L: 1155
										if (class241.field2833 == 84 || class241.field2833 == 13 || var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1156
											class230.method4894(false); // L: 1157
										}
									} else if (Login.loginIndex == 10) { // L: 1160
										var53 = Login.loginBoxX + 180; // L: 1161
										var8 = 209; // L: 1162
										if (class241.field2833 == 84 || var4 == 1 && var51 >= var53 - 109 && var51 <= var53 + 109 && var52 >= var8 && var52 <= var8 + 68) { // L: 1163
											GrandExchangeEvent.setLoginResponseString("", "Connecting to server...", ""); // L: 1164
											Client.field517 = class441.field4667; // L: 1165
											Varcs.method2462(false); // L: 1166
											InterfaceParent.updateGameState(20); // L: 1167
										}
									} else if (Login.loginIndex == 12) { // L: 1170
										var53 = class134.loginBoxCenter; // L: 1171
										var8 = 233; // L: 1172
										Bounds var43 = var1.method6432(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var53, var8); // L: 1173
										Bounds var23 = var1.method6432(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var53, var8); // L: 1174
										Bounds var24 = var1.method6432(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var53, var8); // L: 1175
										var55 = var8 + 17; // L: 1176
										Bounds var76 = var1.method6432(0, 34, "<col=ffd200>agreement (EULA)</col>.", var53, var55); // L: 1177
										if (var4 == 1) { // L: 1178
											if (var43.method6983(var51, var52)) { // L: 1179
												class11.openURL("https://www.jagex.com/terms", true, false); // L: 1180
											} else if (var23.method6983(var51, var52)) { // L: 1182
												class11.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1183
											} else if (var24.method6983(var51, var52) || var76.method6983(var51, var52)) { // L: 1185
												class11.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1186
											}
										}

										var53 = class134.loginBoxCenter - 80; // L: 1189
										var8 = 311; // L: 1190
										if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1191
											Interpreter.clientPreferences.method2274(Client.field484); // L: 1193
											class230.method4894(true); // L: 1195
										}

										var53 = class134.loginBoxCenter + 80; // L: 1197
										if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1198
											Login.loginIndex = 13; // L: 1199
										}
									} else if (Login.loginIndex == 13) { // L: 1202
										var53 = class134.loginBoxCenter; // L: 1203
										var8 = 321; // L: 1204
										if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1205
											class230.method4894(true); // L: 1206
										}
									} else if (Login.loginIndex == 14) { // L: 1209
										String var44 = ""; // L: 1210
										switch(Login.field892) { // L: 1211
										case 0:
											var44 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1216
											break; // L: 1217
										case 1:
											var44 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1219
											break;
										default:
											class127.Login_promptCredentials(false); // L: 1213
										}

										var55 = Login.loginBoxX + 180; // L: 1222
										var56 = 276; // L: 1223
										if (var4 == 1 && var51 >= var55 - 75 && var51 <= var55 + 75 && var52 >= var56 - 20 && var52 <= var56 + 20) { // L: 1224
											class11.openURL(var44, true, false); // L: 1225
											GrandExchangeEvent.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1226
											class150.method3089(6); // L: 1227
											return; // L: 1228
										}

										var55 = Login.loginBoxX + 180; // L: 1230
										var56 = 326; // L: 1231
										if (var4 == 1 && var51 >= var55 - 75 && var51 <= var55 + 75 && var52 >= var56 - 20 && var52 <= var56 + 20) { // L: 1232
											class127.Login_promptCredentials(false); // L: 1233
										}
									} else if (Login.loginIndex == 24) { // L: 1236
										var53 = Login.loginBoxX + 180; // L: 1237
										var8 = 301; // L: 1238
										if (var4 == 1 && var51 >= var53 - 75 && var51 <= var53 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1239
											class230.method4894(false); // L: 1240
										}
									}
								} else {
									while (true) {
										do {
											if (!class16.isKeyDown()) { // L: 935
												var54 = 321; // L: 940
												if (var4 == 1 && var52 >= var54 - 20 && var52 <= var54 + 20) { // L: 941
													class127.Login_promptCredentials(true); // L: 942
												}

												return;
											}
										} while(class241.field2833 != 84 && class241.field2833 != 13); // L: 936

										class127.Login_promptCredentials(true); // L: 937
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 331
}
