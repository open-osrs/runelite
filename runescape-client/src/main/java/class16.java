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
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class16 implements ThreadFactory {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 733600801
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("c")
	final ThreadGroup field93;
	@ObfuscatedName("v")
	final AtomicInteger field88;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field88 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field93 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field93, var1, this.this$0.field77 + "-rest-request-" + this.field88.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lap;Lmt;B)V",
		garbageValue = "5"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) { // L: 307
			class151.method3136(var0); // L: 308
		} else {
			int var4;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 311
				class19.clientPreferences.method2248(!class19.clientPreferences.method2317()); // L: 312
				if (!class19.clientPreferences.method2317()) { // L: 313
					Archive var2 = class121.archive6; // L: 314
					int var3 = var2.getGroupId("scape main"); // L: 316
					var4 = var2.getFileId(var3, ""); // L: 317
					AttackOption.method2410(var2, var3, var4, 255, false); // L: 318
				} else {
					ReflectionCheck.method579(); // L: 321
				}
			}

			if (Client.gameState != 5) { // L: 323
				if (-1L == Login.field923) { // L: 324
					Login.field923 = class115.method2692() + 1000L; // L: 325
				}

				long var21 = class115.method2692(); // L: 327
				if (class342.method6312() && Login.field925 == -1L) { // L: 328 329
					Login.field925 = var21; // L: 330
					if (Login.field925 > Login.field923) { // L: 331
						Login.field923 = Login.field925; // L: 332
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 336
					if (Language.Language_EN == class134.clientLanguage) { // L: 337
						if (MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 338
							var4 = Login.xPadding + 5; // L: 339
							short var5 = 463; // L: 340
							byte var6 = 100; // L: 341
							byte var7 = 35; // L: 342
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) { // L: 343
								class118.method2738(); // L: 344
								return; // L: 345
							}
						}

						if (class174.World_request != null) { // L: 348
							class118.method2738();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 350
					int var48 = MouseHandler.MouseHandler_lastPressedX; // L: 351
					int var49 = MouseHandler.MouseHandler_lastPressedY; // L: 352
					if (var4 == 0) { // L: 353
						var48 = MouseHandler.MouseHandler_x; // L: 354
						var49 = MouseHandler.MouseHandler_y; // L: 355
					}

					if (!class122.mouseCam && var4 == 4) { // L: 357
						var4 = 1;
					}

					int var52;
					short var53;
					if (Login.loginIndex == 0) { // L: 358
						boolean var64 = false; // L: 359

						while (class18.isKeyDown()) { // L: 360
							if (class272.field3196 == 84) { // L: 361
								var64 = true; // L: 362
							}
						}

						var52 = Canvas.loginBoxCenter - 80; // L: 365
						var53 = 291; // L: 366
						if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) { // L: 367
							class258.openURL(ModeWhere.method6080("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 368
						}

						var52 = Canvas.loginBoxCenter + 80; // L: 370
						if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20 || var64) { // L: 371
							if ((Client.worldProperties & 33554432) != 0) { // L: 372
								Login.Login_response0 = ""; // L: 373
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 374
								Login.Login_response2 = "Your normal account will not be affected."; // L: 375
								Login.Login_response3 = ""; // L: 376
								WorldMapData_1.method4872(1); // L: 377
								class29.method357(); // L: 378
							} else if ((Client.worldProperties & 4) != 0) { // L: 380
								if ((Client.worldProperties & 1024) != 0) { // L: 381
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 382
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 383
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 384
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 387
									Login.Login_response2 = "Players can attack each other"; // L: 388
									Login.Login_response3 = "almost everywhere."; // L: 389
								}

								Login.Login_response0 = "Warning!"; // L: 391
								WorldMapData_1.method4872(1); // L: 392
								class29.method357(); // L: 393
							} else if ((Client.worldProperties & 1024) != 0) { // L: 395
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 396
								Login.Login_response2 = "The Protect Item prayer will"; // L: 397
								Login.Login_response3 = "not work on this world."; // L: 398
								Login.Login_response0 = "Warning!"; // L: 399
								WorldMapData_1.method4872(1); // L: 400
								class29.method357(); // L: 401
							} else {
								class135.Login_promptCredentials(false); // L: 404
							}
						}
					} else {
						short var8;
						int var50;
						if (Login.loginIndex == 1) { // L: 408
							while (true) {
								if (!class18.isKeyDown()) { // L: 409
									var50 = Canvas.loginBoxCenter - 80; // L: 417
									var8 = 321; // L: 418
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 419
										class135.Login_promptCredentials(false); // L: 420
									}

									var50 = Canvas.loginBoxCenter + 80; // L: 422
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 423
										WorldMapData_1.method4872(0); // L: 424
									}
									break;
								}

								if (class272.field3196 == 84) { // L: 410
									class135.Login_promptCredentials(false); // L: 411
								} else if (class272.field3196 == 13) { // L: 413
									WorldMapData_1.method4872(0); // L: 414
								}
							}
						} else {
							int var11;
							int var19;
							short var51;
							boolean var55;
							if (Login.loginIndex == 2) { // L: 427
								var51 = 201; // L: 428
								var50 = var51 + 52; // L: 429
								if (var4 == 1 && var49 >= var50 - 12 && var49 < var50 + 2) { // L: 430
									Login.currentLoginField = 0;
								}

								var50 += 15; // L: 431
								if (var4 == 1 && var49 >= var50 - 12 && var49 < var50 + 2) { // L: 432
									Login.currentLoginField = 1;
								}

								var50 += 15; // L: 433
								var51 = 361; // L: 434
								if (ArchiveLoader.field1022 != null) { // L: 435
									var52 = ArchiveLoader.field1022.highX / 2; // L: 436
									if (var4 == 1 && var48 >= ArchiveLoader.field1022.lowX - var52 && var48 <= var52 + ArchiveLoader.field1022.lowX && var49 >= var51 - 15 && var49 < var51) { // L: 437
										switch(Login.field902) { // L: 438
										case 1:
											class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 446
											WorldMapData_1.method4872(5); // L: 447
											return; // L: 448
										case 2:
											class258.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 441
										}
									}
								}

								var52 = Canvas.loginBoxCenter - 80; // L: 453
								var53 = 321; // L: 454
								if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) { // L: 455
									Login.Login_username = Login.Login_username.trim(); // L: 456
									if (Login.Login_username.length() == 0) { // L: 457
										class101.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 458
										return; // L: 459
									}

									if (Login.Login_password.length() == 0) { // L: 461
										class101.setLoginResponseString("", "Please enter your password.", ""); // L: 462
										return; // L: 463
									}

									class101.setLoginResponseString("", "Connecting to server...", ""); // L: 465
									TriBool.method6791(false); // L: 466
									HealthBarUpdate.updateGameState(20); // L: 467
									return; // L: 468
								}

								var52 = Login.loginBoxX + 180 + 80; // L: 470
								if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) { // L: 471
									WorldMapData_1.method4872(0); // L: 472
									Login.Login_username = ""; // L: 473
									Login.Login_password = ""; // L: 474
									class240.field2846 = 0; // L: 475
									World.otp = ""; // L: 476
									Login.field895 = true; // L: 477
								}

								var52 = Canvas.loginBoxCenter + -117; // L: 479
								var53 = 277; // L: 480
								Login.field912 = var48 >= var52 && var48 < var52 + ReflectionCheck.field247 && var49 >= var53 && var49 < var53 + MouseRecorder.field1064; // L: 481
								if (var4 == 1 && Login.field912) { // L: 482
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 483
									if (!Client.Login_isUsernameRemembered && class19.clientPreferences.method2264() != null) { // L: 484
										class19.clientPreferences.method2260((String)null); // L: 485
									}
								}

								var52 = Canvas.loginBoxCenter + 24; // L: 488
								var53 = 277; // L: 489
								Login.field913 = var48 >= var52 && var48 < var52 + ReflectionCheck.field247 && var49 >= var53 && var49 < var53 + MouseRecorder.field1064; // L: 490
								if (var4 == 1 && Login.field913) { // L: 491
									class19.clientPreferences.method2246(!class19.clientPreferences.method2247()); // L: 492
									if (!class19.clientPreferences.method2247()) { // L: 493
										Login.Login_username = ""; // L: 494
										class19.clientPreferences.method2260((String)null); // L: 495
										class29.method357(); // L: 496
									}
								}

								label1389:
								while (true) {
									int var59;
									Transferable var69;
									do {
										while (true) {
											label1307:
											do {
												while (true) {
													while (class18.isKeyDown()) { // L: 499
														if (class272.field3196 != 13) { // L: 500
															if (Login.currentLoginField != 0) { // L: 509
																continue label1307;
															}

															char var56 = HealthBar.field1258; // L: 510

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var56 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 512 513
															}

															if (class272.field3196 == 85 && Login.Login_username.length() > 0) { // L: 516
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class272.field3196 == 84 || class272.field3196 == 80) { // L: 517
																Login.currentLoginField = 1;
															}

															char var57 = HealthBar.field1258; // L: 519
															boolean var61 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var57) != -1; // L: 521
															if (var61 && Login.Login_username.length() < 320) { // L: 523
																Login.Login_username = Login.Login_username + HealthBar.field1258;
															}
														} else {
															WorldMapData_1.method4872(0); // L: 501
															Login.Login_username = ""; // L: 502
															Login.Login_password = ""; // L: 503
															class240.field2846 = 0; // L: 504
															World.otp = ""; // L: 505
															Login.field895 = true; // L: 506
														}
													}

													return; // L: 1072
												}
											} while(Login.currentLoginField != 1); // L: 525

											if (class272.field3196 == 85 && Login.Login_password.length() > 0) { // L: 526
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 527
											} else if (class272.field3196 == 84 || class272.field3196 == 80) { // L: 529
												Login.currentLoginField = 0; // L: 530
												if (class272.field3196 == 84) { // L: 531
													Login.Login_username = Login.Login_username.trim(); // L: 532
													if (Login.Login_username.length() == 0) { // L: 533
														class101.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 534
														return; // L: 535
													}

													if (Login.Login_password.length() == 0) { // L: 537
														class101.setLoginResponseString("", "Please enter your password.", ""); // L: 538
														return; // L: 539
													}

													class101.setLoginResponseString("", "Connecting to server...", ""); // L: 541
													TriBool.method6791(false); // L: 542
													HealthBarUpdate.updateGameState(20); // L: 543
													return; // L: 544
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class272.field3196 == 67) { // L: 547
												Clipboard var68 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 548
												var69 = var68.getContents(class353.client); // L: 549
												var59 = 20 - Login.Login_password.length(); // L: 550
												break;
											}

											char var62 = HealthBar.field1258; // L: 600
											if ((var62 < ' ' || var62 >= 127) && (var62 <= 127 || var62 >= 160) && (var62 <= 160 || var62 > 255)) { // L: 602
												label1514: {
													if (var62 != 0) { // L: 606
														char[] var71 = class340.cp1252AsciiExtension; // L: 608

														for (int var72 = 0; var72 < var71.length; ++var72) { // L: 609
															char var14 = var71[var72]; // L: 610
															if (var62 == var14) { // L: 612
																var55 = true; // L: 613
																break label1514; // L: 614
															}
														}
													}

													var55 = false; // L: 620
												}
											} else {
												var55 = true; // L: 603
											}

											if (var55) { // L: 622
												char var74 = HealthBar.field1258; // L: 624
												boolean var58 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var74) != -1; // L: 626
												if (var58 && Login.Login_password.length() < 20) { // L: 628 629
													Login.Login_password = Login.Login_password + HealthBar.field1258; // L: 630
												}
											}
										}
									} while(var59 <= 0); // L: 551

									try {
										String var60 = (String)var69.getTransferData(DataFlavor.stringFlavor); // L: 553
										int var63 = Math.min(var59, var60.length()); // L: 554
										int var15 = 0;

										while (true) {
											if (var15 >= var63) {
												Login.Login_password = Login.Login_password + var60.substring(0, var63); // L: 592
												continue label1389;
											}

											char var65 = var60.charAt(var15); // L: 558
											boolean var16;
											if ((var65 < ' ' || var65 >= 127) && (var65 <= 127 || var65 >= 160) && (var65 <= 160 || var65 > 255)) { // L: 560
												label1517: {
													if (var65 != 0) { // L: 564
														char[] var66 = class340.cp1252AsciiExtension; // L: 566

														for (var19 = 0; var19 < var66.length; ++var19) { // L: 567
															char var20 = var66[var19]; // L: 568
															if (var65 == var20) { // L: 570
																var16 = true; // L: 571
																break label1517; // L: 572
															}
														}
													}

													var16 = false; // L: 578
												}
											} else {
												var16 = true; // L: 561
											}

											if (!var16) { // L: 580
												break;
											}

											char var67 = var60.charAt(var15); // L: 582
											boolean var25 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var67) != -1; // L: 584
											if (!var25) { // L: 586
												break;
											}

											++var15; // L: 555
										}

										WorldMapData_1.method4872(3); // L: 588
										return; // L: 589
									} catch (UnsupportedFlavorException var46) { // L: 594
									} catch (IOException var47) { // L: 595
									}
								}
							} else if (Login.loginIndex == 3) { // L: 639
								var50 = Login.loginBoxX + 180; // L: 640
								var8 = 276; // L: 641
								if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 642
									class101.method2547(false); // L: 643
								}

								var50 = Login.loginBoxX + 180; // L: 645
								var8 = 326; // L: 646
								if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 647
									class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 648
									WorldMapData_1.method4872(5); // L: 649
									return; // L: 650
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 653
									var50 = Login.loginBoxX + 180 - 80; // L: 654
									var8 = 321; // L: 655
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 656
										World.otp.trim(); // L: 657
										if (World.otp.length() != 6) { // L: 658
											class101.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 659
											return; // L: 660
										}

										class240.field2846 = Integer.parseInt(World.otp); // L: 662
										World.otp = ""; // L: 663
										TriBool.method6791(true); // L: 664
										class101.setLoginResponseString("", "Connecting to server...", ""); // L: 665
										HealthBarUpdate.updateGameState(20); // L: 666
										return; // L: 667
									}

									if (var4 == 1 && var48 >= Login.loginBoxX + 180 - 9 && var48 <= Login.loginBoxX + 180 + 130 && var49 >= 263 && var49 <= 296) { // L: 669
										Login.field895 = !Login.field895; // L: 670
									}

									if (var4 == 1 && var48 >= Login.loginBoxX + 180 - 34 && var48 <= Login.loginBoxX + 34 + 180 && var49 >= 351 && var49 <= 363) { // L: 672
										class258.openURL(ModeWhere.method6080("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 673
									}

									var50 = Login.loginBoxX + 180 + 80; // L: 675
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 676
										WorldMapData_1.method4872(0); // L: 677
										Login.Login_username = ""; // L: 678
										Login.Login_password = ""; // L: 679
										class240.field2846 = 0; // L: 680
										World.otp = ""; // L: 681
									}

									while (class18.isKeyDown()) { // L: 683
										boolean var9 = false; // L: 684

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 685
											if (HealthBar.field1258 == "1234567890".charAt(var10)) { // L: 686
												var9 = true; // L: 687
												break; // L: 688
											}
										}

										if (class272.field3196 == 13) { // L: 691
											WorldMapData_1.method4872(0); // L: 692
											Login.Login_username = ""; // L: 693
											Login.Login_password = ""; // L: 694
											class240.field2846 = 0; // L: 695
											World.otp = ""; // L: 696
										} else {
											if (class272.field3196 == 85 && World.otp.length() > 0) { // L: 699
												World.otp = World.otp.substring(0, World.otp.length() - 1);
											}

											if (class272.field3196 == 84) { // L: 700
												World.otp.trim(); // L: 701
												if (World.otp.length() != 6) { // L: 702
													class101.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 703
													return; // L: 704
												}

												class240.field2846 = Integer.parseInt(World.otp); // L: 706
												World.otp = ""; // L: 707
												TriBool.method6791(true); // L: 708
												class101.setLoginResponseString("", "Connecting to server...", ""); // L: 709
												HealthBarUpdate.updateGameState(20); // L: 710
												return; // L: 711
											}

											if (var9 && World.otp.length() < 6) { // L: 713
												World.otp = World.otp + HealthBar.field1258;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 717
									var50 = Login.loginBoxX + 180 - 80; // L: 718
									var8 = 321; // L: 719
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 720
										Login.Login_username = Login.Login_username.trim(); // L: 722
										if (Login.Login_username.length() == 0) { // L: 723
											class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 724
										} else {
											long var31;
											try {
												URL var26 = new URL(ModeWhere.method6080("services", false) + "m=accountappeal/login.ws"); // L: 731
												URLConnection var13 = var26.openConnection(); // L: 732
												var13.setRequestProperty("connection", "close"); // L: 733
												var13.setDoInput(true); // L: 734
												var13.setDoOutput(true); // L: 735
												var13.setConnectTimeout(5000); // L: 736
												OutputStreamWriter var73 = new OutputStreamWriter(var13.getOutputStream()); // L: 737
												var73.write("data1=req"); // L: 738
												var73.flush(); // L: 739
												InputStream var75 = var13.getInputStream(); // L: 740
												Buffer var76 = new Buffer(new byte[1000]); // L: 741

												while (true) {
													int var17 = var75.read(var76.array, var76.offset, 1000 - var76.offset); // L: 743
													if (var17 == -1) { // L: 744
														var76.offset = 0; // L: 751
														long var33 = var76.readLong(); // L: 752
														var31 = var33; // L: 753
														break;
													}

													var76.offset += var17; // L: 745
													if (var76.offset >= 1000) { // L: 746
														var31 = 0L; // L: 747
														break;
													}
												}
											} catch (Exception var44) { // L: 755
												var31 = 0L; // L: 756
											}

											int var54;
											if (var31 == 0L) { // L: 760
												var54 = 5;
											} else {
												var54 = WorldMapAreaData.method5082(var31, Login.Login_username); // L: 761
											}

											switch(var54) { // L: 762
											case 2:
												class101.setLoginResponseString(Strings.field3894, Strings.field3926, Strings.field3896); // L: 770
												WorldMapData_1.method4872(6); // L: 771
												break; // L: 772
											case 3:
												class101.setLoginResponseString("", "Error connecting to server.", ""); // L: 777
												break; // L: 778
											case 4:
												class101.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 780
												break;
											case 5:
												class101.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 767
												break; // L: 768
											case 6:
												class101.setLoginResponseString("", "Error connecting to server.", ""); // L: 774
												break; // L: 775
											case 7:
												class101.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 764
											}
										}

										return; // L: 784
									}

									var50 = Login.loginBoxX + 180 + 80; // L: 786
									if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 787
										class135.Login_promptCredentials(true); // L: 788
									}

									var53 = 361; // L: 790
									if (PcmPlayer.field294 != null) { // L: 791
										var10 = PcmPlayer.field294.highX / 2; // L: 792
										if (var4 == 1 && var48 >= PcmPlayer.field294.lowX - var10 && var48 <= var10 + PcmPlayer.field294.lowX && var49 >= var53 - 15 && var49 < var53) { // L: 793
											class258.openURL(ModeWhere.method6080("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 794
										}
									}

									while (class18.isKeyDown()) { // L: 797
										var55 = false; // L: 798

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 799
											if (HealthBar.field1258 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 800
												var55 = true; // L: 801
												break; // L: 802
											}
										}

										if (class272.field3196 == 13) { // L: 805
											class135.Login_promptCredentials(true); // L: 806
										} else {
											if (class272.field3196 == 85 && Login.Login_username.length() > 0) { // L: 809
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class272.field3196 == 84) { // L: 810
												Login.Login_username = Login.Login_username.trim(); // L: 812
												if (Login.Login_username.length() == 0) { // L: 813
													class101.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 814
												} else {
													long var35;
													try {
														URL var28 = new URL(ModeWhere.method6080("services", false) + "m=accountappeal/login.ws"); // L: 821
														URLConnection var29 = var28.openConnection(); // L: 822
														var29.setRequestProperty("connection", "close"); // L: 823
														var29.setDoInput(true); // L: 824
														var29.setDoOutput(true); // L: 825
														var29.setConnectTimeout(5000); // L: 826
														OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream()); // L: 827
														var30.write("data1=req"); // L: 828
														var30.flush(); // L: 829
														InputStream var37 = var29.getInputStream(); // L: 830
														Buffer var18 = new Buffer(new byte[1000]); // L: 831

														while (true) {
															var19 = var37.read(var18.array, var18.offset, 1000 - var18.offset); // L: 833
															if (var19 == -1) { // L: 834
																var18.offset = 0; // L: 841
																long var38 = var18.readLong(); // L: 842
																var35 = var38; // L: 843
																break;
															}

															var18.offset += var19; // L: 835
															if (var18.offset >= 1000) { // L: 836
																var35 = 0L; // L: 837
																break;
															}
														}
													} catch (Exception var45) { // L: 845
														var35 = 0L; // L: 846
													}

													if (var35 == 0L) { // L: 850
														var11 = 5;
													} else {
														var11 = WorldMapAreaData.method5082(var35, Login.Login_username); // L: 851
													}

													switch(var11) { // L: 852
													case 2:
														class101.setLoginResponseString(Strings.field3894, Strings.field3926, Strings.field3896); // L: 860
														WorldMapData_1.method4872(6); // L: 861
														break; // L: 862
													case 3:
														class101.setLoginResponseString("", "Error connecting to server.", ""); // L: 864
														break; // L: 865
													case 4:
														class101.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 867
														break; // L: 868
													case 5:
														class101.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 870
														break;
													case 6:
														class101.setLoginResponseString("", "Error connecting to server.", ""); // L: 857
														break; // L: 858
													case 7:
														class101.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 854
													}
												}

												return; // L: 874
											}

											if (var55 && Login.Login_username.length() < 320) { // L: 876
												Login.Login_username = Login.Login_username + HealthBar.field1258;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 880
									if (Login.loginIndex == 7) { // L: 891
										if (VarpDefinition.field1821 && !Client.onMobile) { // L: 892
											var50 = Canvas.loginBoxCenter - 150; // L: 893
											var52 = var50 + 40 + 240 + 25; // L: 894
											var53 = 231; // L: 895
											var10 = var53 + 40; // L: 896
											if (var4 == 1 && var48 >= var50 && var48 <= var52 && var49 >= var53 && var49 <= var10) { // L: 897
												Login.field910 = class119.method2757(var50, var48); // L: 898
											}

											var11 = Login.loginBoxX + 180 - 80; // L: 900
											short var12 = 321; // L: 901
											boolean var27;
											if (var4 == 1 && var48 >= var11 - 75 && var48 <= var11 + 75 && var49 >= var12 - 20 && var49 <= var12 + 20) { // L: 902
												var27 = GrandExchangeOfferUnitPriceComparator.method6031(); // L: 903
												if (var27) { // L: 904
													HealthBarUpdate.updateGameState(50); // L: 905
													return; // L: 906
												}
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 909
											if (var4 == 1 && var48 >= var11 - 75 && var48 <= var11 + 75 && var49 >= var12 - 20 && var49 <= var12 + 20) { // L: 910
												Login.field911 = new String[8]; // L: 911
												class135.Login_promptCredentials(true); // L: 912
											}

											while (class18.isKeyDown()) { // L: 914
												if (class272.field3196 == 101) { // L: 915
													Login.field911[Login.field910] = null; // L: 916
												}

												if (class272.field3196 == 85) { // L: 918
													if (Login.field911[Login.field910] == null && Login.field910 > 0) { // L: 919
														--Login.field910; // L: 920
													}

													Login.field911[Login.field910] = null; // L: 922
												}

												if (HealthBar.field1258 >= '0' && HealthBar.field1258 <= '9') { // L: 924
													Login.field911[Login.field910] = "" + HealthBar.field1258; // L: 925
													if (Login.field910 < 7) { // L: 926
														++Login.field910; // L: 927
													}
												}

												if (class272.field3196 == 84) { // L: 930
													var27 = GrandExchangeOfferUnitPriceComparator.method6031(); // L: 931
													if (var27) { // L: 932
														HealthBarUpdate.updateGameState(50); // L: 933
													}

													return; // L: 935
												}
											}
										} else {
											var50 = Login.loginBoxX + 180 - 80; // L: 940
											var8 = 321; // L: 941
											if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 942
												class258.openURL(ModeWhere.method6080("secure", true) + "m=dob/set_dob.ws", true, false); // L: 943
												class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 944
												WorldMapData_1.method4872(6); // L: 945
												return; // L: 946
											}

											var50 = Login.loginBoxX + 180 + 80; // L: 948
											if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 949
												class135.Login_promptCredentials(true); // L: 950
											}
										}
									} else if (Login.loginIndex == 8) { // L: 954
										var50 = Login.loginBoxX + 180 - 80; // L: 955
										var8 = 321; // L: 956
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 957
											class258.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 958
											class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 959
											WorldMapData_1.method4872(6); // L: 960
											return; // L: 961
										}

										var50 = Login.loginBoxX + 180 + 80; // L: 963
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 964
											class135.Login_promptCredentials(true); // L: 965
										}
									} else if (Login.loginIndex == 9) { // L: 968
										var50 = Login.loginBoxX + 180; // L: 969
										var8 = 311; // L: 970
										if (class272.field3196 == 84 || class272.field3196 == 13 || var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 971
											class101.method2547(false); // L: 972
										}
									} else if (Login.loginIndex == 10) { // L: 975
										var50 = Login.loginBoxX + 180; // L: 976
										var8 = 209; // L: 977
										if (class272.field3196 == 84 || var4 == 1 && var48 >= var50 - 109 && var48 <= var50 + 109 && var49 >= var8 && var49 <= var8 + 68) { // L: 978
											class101.setLoginResponseString("", "Connecting to server...", ""); // L: 979
											Client.field516 = class446.field4750; // L: 980
											TriBool.method6791(false); // L: 981
											HealthBarUpdate.updateGameState(20); // L: 982
										}
									} else if (Login.loginIndex == 12) { // L: 985
										var50 = Canvas.loginBoxCenter; // L: 986
										var8 = 233; // L: 987
										Bounds var42 = var1.method6372(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var50, var8); // L: 988
										Bounds var23 = var1.method6372(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var50, var8); // L: 989
										Bounds var24 = var1.method6372(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var50, var8); // L: 990
										var52 = var8 + 17; // L: 991
										Bounds var70 = var1.method6372(0, 34, "<col=ffd200>agreement (EULA)</col>.", var50, var52); // L: 992
										if (var4 == 1) { // L: 993
											if (var42.method6894(var48, var49)) { // L: 994
												class258.openURL("https://www.jagex.com/terms", true, false); // L: 995
											} else if (var23.method6894(var48, var49)) { // L: 997
												class258.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 998
											} else if (var24.method6894(var48, var49) || var70.method6894(var48, var49)) { // L: 1000
												class258.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1001
											}
										}

										var50 = Canvas.loginBoxCenter - 80; // L: 1004
										var8 = 311; // L: 1005
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 1006
											class19.clientPreferences.method2307(Client.field482); // L: 1008
											class101.method2547(true); // L: 1010
										}

										var50 = Canvas.loginBoxCenter + 80; // L: 1012
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 1013
											Login.loginIndex = 13; // L: 1014
										}
									} else if (Login.loginIndex == 13) { // L: 1017
										var50 = Canvas.loginBoxCenter; // L: 1018
										var8 = 321; // L: 1019
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 1020
											class101.method2547(true); // L: 1021
										}
									} else if (Login.loginIndex == 14) { // L: 1024
										String var43 = ""; // L: 1025
										switch(Login.field897) { // L: 1026
										case 0:
											var43 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1031
											break; // L: 1032
										case 1:
											var43 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1028
											break; // L: 1029
										default:
											class135.Login_promptCredentials(false); // L: 1034
										}

										var52 = Login.loginBoxX + 180; // L: 1037
										var53 = 276; // L: 1038
										if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) { // L: 1039
											class258.openURL(var43, true, false); // L: 1040
											class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1041
											WorldMapData_1.method4872(6); // L: 1042
											return; // L: 1043
										}

										var52 = Login.loginBoxX + 180; // L: 1045
										var53 = 326; // L: 1046
										if (var4 == 1 && var48 >= var52 - 75 && var48 <= var52 + 75 && var49 >= var53 - 20 && var49 <= var53 + 20) { // L: 1047
											class135.Login_promptCredentials(false); // L: 1048
										}
									} else if (Login.loginIndex == 24) { // L: 1051
										var50 = Login.loginBoxX + 180; // L: 1052
										var8 = 301; // L: 1053
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 1054
											class101.method2547(false); // L: 1055
										}
									} else if (Login.loginIndex == 26) { // L: 1058
										var50 = Login.loginBoxX + 180 - 80; // L: 1059
										var8 = 321; // L: 1060
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 1061
											class258.openURL(ModeWhere.method6080("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1062
											class101.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1063
											WorldMapData_1.method4872(6); // L: 1064
											return; // L: 1065
										}

										var50 = Login.loginBoxX + 180 + 80; // L: 1067
										if (var4 == 1 && var48 >= var50 - 75 && var48 <= var50 + 75 && var49 >= var8 - 20 && var49 <= var8 + 20) { // L: 1068
											class135.Login_promptCredentials(true); // L: 1069
										}
									}
								} else {
									while (true) {
										do {
											if (!class18.isKeyDown()) { // L: 881
												var51 = 321; // L: 886
												if (var4 == 1 && var49 >= var51 - 20 && var49 <= var51 + 20) { // L: 887
													class135.Login_promptCredentials(true); // L: 888
												}

												return;
											}
										} while(class272.field3196 != 84 && class272.field3196 != 13); // L: 882

										class135.Login_promptCredentials(true); // L: 883
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 309

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2067958159"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3758
			ReflectionCheck.method579(); // L: 3759
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class19.clientPreferences.method2258() != 0 && !Client.playingJingle) { // L: 3761
			Archive var1 = class121.archive6; // L: 3762
			int var2 = class19.clientPreferences.method2258(); // L: 3763
			class272.musicPlayerStatus = 1; // L: 3765
			class272.musicTrackArchive = var1; // L: 3766
			class272.musicTrackGroupId = var0; // L: 3767
			class151.musicTrackFileId = 0; // L: 3768
			class272.musicTrackVolume = var2; // L: 3769
			class11.musicTrackBoolean = false; // L: 3770
			class272.pcmSampleLength = 2; // L: 3771
		}

		Client.currentTrackGroupId = var0; // L: 3774
	} // L: 3775

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIS)V",
		garbageValue = "16886"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (WorldMapSection2.loadInterface(var0)) { // L: 11044
			class29.updateInterface(SoundCache.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11045
		}
	} // L: 11046
}
