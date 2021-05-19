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
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class179 {
	@ObfuscatedName("tx")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class179 field2097;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class179 field2094;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 243264849
	)
	@Export("value")
	final int value;

	static {
		field2097 = new class179(0); // L: 4
		field2094 = new class179(1); // L: 5
	}

	class179(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Laq;S)V",
		garbageValue = "11379"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		int var4;
		if (Login.worldSelectOpen) { // L: 251
			while (true) {
				if (!class17.isKeyDown()) { // L: 253
					if (MouseHandler.MouseHandler_lastButton != 1 && (class229.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 269
						break;
					}

					int var1 = Login.xPadding + 280; // L: 270
					if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 271
						class303.changeWorldSelectSorting(0, 0); // L: 272
						break; // L: 273
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 275
						class303.changeWorldSelectSorting(0, 1); // L: 276
						break; // L: 277
					}

					int var2 = Login.xPadding + 390; // L: 279
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 280
						class303.changeWorldSelectSorting(1, 0); // L: 281
						break; // L: 282
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 284
						class303.changeWorldSelectSorting(1, 1); // L: 285
						break; // L: 286
					}

					int var49 = Login.xPadding + 500; // L: 288
					if (MouseHandler.MouseHandler_lastPressedX >= var49 && MouseHandler.MouseHandler_lastPressedX <= var49 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 289
						class303.changeWorldSelectSorting(2, 0); // L: 290
						break; // L: 291
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var49 + 15 && MouseHandler.MouseHandler_lastPressedX <= var49 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 293
						class303.changeWorldSelectSorting(2, 1); // L: 294
						break; // L: 295
					}

					var4 = Login.xPadding + 610; // L: 297
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 298
						class303.changeWorldSelectSorting(3, 0); // L: 299
						break; // L: 300
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 302
						class303.changeWorldSelectSorting(3, 1); // L: 303
						break; // L: 304
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 306
						class69.method1151(); // L: 307
						break; // L: 308
					}

					if (Login.hoveredWorldIndex != -1) { // L: 310
						World var5 = Messages.World_worlds[Login.hoveredWorldIndex]; // L: 311
						PlatformInfo.changeWorld(var5); // L: 312
						class69.method1151(); // L: 313
					} else {
						if (Login.worldSelectPage > 0 && class285.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class285.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBarDefinition.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBarDefinition.canvasHeight / 2 + 50) { // L: 316
							--Login.worldSelectPage; // L: 317
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && User.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - User.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBarDefinition.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBarDefinition.canvasHeight / 2 + 50) { // L: 319
							++Login.worldSelectPage; // L: 320
						}
					}
					break;
				}

				if (MenuAction.field982 == 13) { // L: 254
					class69.method1151(); // L: 255
					break; // L: 256
				}

				if (MenuAction.field982 == 96) { // L: 258
					if (Login.worldSelectPage > 0 && class285.worldSelectLeftSprite != null) { // L: 259
						--Login.worldSelectPage; // L: 260
					}
				} else if (MenuAction.field982 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && User.worldSelectRightSprite != null) { // L: 263 264
					++Login.worldSelectPage; // L: 265
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 326
				class12.clientPreferences.titleMusicDisabled = !class12.clientPreferences.titleMusicDisabled; // L: 327
				KeyHandler.savePreferences(); // L: 328
				if (!class12.clientPreferences.titleMusicDisabled) { // L: 329
					MouseRecorder.method2124(class29.archive6, "scape main", "", 255, false);
				} else {
					ViewportMouse.method4193(); // L: 330
				}
			}

			if (Client.gameState != 5) { // L: 332
				if (Login.field1001 == -1L) { // L: 333
					Login.field1001 = Archive.currentTimeMillis() + 1000L; // L: 334
				}

				long var21 = Archive.currentTimeMillis(); // L: 336
				boolean var3;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 339
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 343
							var3 = true; // L: 351
							break;
						}

						ArchiveLoader var23 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 344
						if (!var23.isLoaded()) { // L: 345
							var3 = false; // L: 346
							break; // L: 347
						}

						++Client.archiveLoadersDone; // L: 349
					}
				} else {
					var3 = true; // L: 340
				}

				if (var3 && Login.field1019 == -1L) { // L: 353 354
					Login.field1019 = var21; // L: 355
					if (Login.field1019 > Login.field1001) { // L: 356
						Login.field1001 = Login.field1019; // L: 357
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 361
					if (Language.Language_EN == class7.clientLanguage) { // L: 362
						if (MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 363
							var4 = Login.xPadding + 5; // L: 364
							short var24 = 463; // L: 365
							byte var6 = 100; // L: 366
							byte var7 = 35; // L: 367
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var6 + var4 && MouseHandler.MouseHandler_lastPressedY >= var24 && MouseHandler.MouseHandler_lastPressedY <= var24 + var7) { // L: 368
								WorldMapCacheName.method3648(); // L: 369
								return; // L: 370
							}
						}

						if (World.World_request != null) { // L: 373
							WorldMapCacheName.method3648();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 375
					int var68 = MouseHandler.MouseHandler_lastPressedX; // L: 376
					int var50 = MouseHandler.MouseHandler_lastPressedY; // L: 377
					if (var4 == 0) { // L: 378
						var68 = MouseHandler.MouseHandler_x; // L: 379
						var50 = MouseHandler.MouseHandler_y; // L: 380
					}

					if (!class229.mouseCam && var4 == 4) { // L: 382
						var4 = 1;
					}

					short var53;
					int var54;
					if (Login.loginIndex == 0) { // L: 383
						boolean var62 = false; // L: 384

						while (class17.isKeyDown()) { // L: 385
							if (MenuAction.field982 == 84) { // L: 386
								var62 = true; // L: 387
							}
						}

						var54 = class21.loginBoxCenter - 80; // L: 390
						var53 = 291; // L: 391
						if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) { // L: 392
							Interpreter.openURL(class4.method57("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 393
						}

						var54 = class21.loginBoxCenter + 80; // L: 395
						if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20 || var62) { // L: 396
							if ((Client.worldProperties & 33554432) != 0) { // L: 397
								Login.Login_response0 = ""; // L: 398
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 399
								Login.Login_response2 = "Your normal account will not be affected."; // L: 400
								Login.Login_response3 = ""; // L: 401
								Login.loginIndex = 1; // L: 402
								GrandExchangeOfferOwnWorldComparator.method1213(); // L: 403
							} else if ((Client.worldProperties & 4) != 0) { // L: 405
								if ((Client.worldProperties & 1024) != 0) { // L: 406
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 407
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 408
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 409
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 412
									Login.Login_response2 = "Players can attack each other"; // L: 413
									Login.Login_response3 = "almost everywhere."; // L: 414
								}

								Login.Login_response0 = "Warning!"; // L: 416
								Login.loginIndex = 1; // L: 417
								GrandExchangeOfferOwnWorldComparator.method1213(); // L: 418
							} else if ((Client.worldProperties & 1024) != 0) { // L: 420
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 421
								Login.Login_response2 = "The Protect Item prayer will"; // L: 422
								Login.Login_response3 = "not work on this world."; // L: 423
								Login.Login_response0 = "Warning!"; // L: 424
								Login.loginIndex = 1; // L: 425
								GrandExchangeOfferOwnWorldComparator.method1213(); // L: 426
							} else {
								BufferedSink.Login_promptCredentials(false); // L: 429
							}
						}
					} else {
						short var8;
						int var51;
						if (Login.loginIndex == 1) { // L: 433
							while (true) {
								if (!class17.isKeyDown()) { // L: 434
									var51 = class21.loginBoxCenter - 80; // L: 442
									var8 = 321; // L: 443
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 444
										BufferedSink.Login_promptCredentials(false); // L: 445
									}

									var51 = class21.loginBoxCenter + 80; // L: 447
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 448
										Login.loginIndex = 0; // L: 449
									}
									break;
								}

								if (MenuAction.field982 == 84) { // L: 435
									BufferedSink.Login_promptCredentials(false); // L: 436
								} else if (MenuAction.field982 == 13) { // L: 438
									Login.loginIndex = 0; // L: 439
								}
							}
						} else {
							int var11;
							int var19;
							short var52;
							boolean var56;
							if (Login.loginIndex == 2) { // L: 452
								var52 = 201; // L: 453
								var51 = var52 + 52; // L: 454
								if (var4 == 1 && var50 >= var51 - 12 && var50 < var51 + 2) { // L: 455
									Login.currentLoginField = 0;
								}

								var51 += 15; // L: 456
								if (var4 == 1 && var50 >= var51 - 12 && var50 < var51 + 2) { // L: 457
									Login.currentLoginField = 1;
								}

								var51 += 15; // L: 458
								var52 = 361; // L: 459
								if (class18.field155 != null) { // L: 460
									var54 = class18.field155.highX / 2; // L: 461
									if (var4 == 1 && var68 >= class18.field155.lowX - var54 && var68 <= var54 + class18.field155.lowX && var50 >= var52 - 15 && var50 < var52) { // L: 462
										switch(Login.field997) { // L: 463
										case 1:
											class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 466
											Login.loginIndex = 5; // L: 467
											return; // L: 468
										case 2:
											Interpreter.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 472
										}
									}
								}

								var54 = class21.loginBoxCenter - 80; // L: 478
								var53 = 321; // L: 479
								if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) { // L: 480
									Login.Login_username = Login.Login_username.trim(); // L: 481
									if (Login.Login_username.length() == 0) { // L: 482
										class44.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 483
										return; // L: 484
									}

									if (Login.Login_password.length() == 0) { // L: 486
										class44.setLoginResponseString("", "Please enter your password.", ""); // L: 487
										return; // L: 488
									}

									class44.setLoginResponseString("", "Connecting to server...", ""); // L: 490
									HealthBarUpdate.method2204(false); // L: 491
									Client.updateGameState(20); // L: 492
									return; // L: 493
								}

								var54 = Login.loginBoxX + 180 + 80; // L: 495
								if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) { // L: 496
									Login.loginIndex = 0; // L: 497
									Login.Login_username = ""; // L: 498
									Login.Login_password = ""; // L: 499
									PendingSpawn.field1204 = 0; // L: 500
									class16.otp = ""; // L: 501
									Login.field1008 = true; // L: 502
								}

								var54 = class21.loginBoxCenter + -117; // L: 504
								var53 = 277; // L: 505
								Login.field1006 = var68 >= var54 && var68 < var54 + TaskHandler.field1466 && var50 >= var53 && var50 < var53 + class125.field1456; // L: 506
								if (var4 == 1 && Login.field1006) { // L: 507
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 508
									if (!Client.Login_isUsernameRemembered && class12.clientPreferences.rememberedUsername != null) { // L: 509
										class12.clientPreferences.rememberedUsername = null; // L: 510
										KeyHandler.savePreferences(); // L: 511
									}
								}

								var54 = class21.loginBoxCenter + 24; // L: 514
								var53 = 277; // L: 515
								Login.field1007 = var68 >= var54 && var68 < var54 + TaskHandler.field1466 && var50 >= var53 && var50 < var53 + class125.field1456; // L: 516
								if (var4 == 1 && Login.field1007) { // L: 517
									class12.clientPreferences.hideUsername = !class12.clientPreferences.hideUsername; // L: 518
									if (!class12.clientPreferences.hideUsername) { // L: 519
										Login.Login_username = ""; // L: 520
										class12.clientPreferences.rememberedUsername = null; // L: 521
										GrandExchangeOfferOwnWorldComparator.method1213(); // L: 522
									}

									KeyHandler.savePreferences(); // L: 524
								}

								label1335:
								while (true) {
									Transferable var26;
									int var59;
									do {
										while (true) {
											label1253:
											do {
												while (true) {
													while (class17.isKeyDown()) { // L: 526
														if (MenuAction.field982 != 13) { // L: 527
															if (Login.currentLoginField != 0) { // L: 536
																continue label1253;
															}

															char var57 = class25.field207; // L: 537

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var57 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 539 540
															}

															if (MenuAction.field982 == 85 && Login.Login_username.length() > 0) { // L: 543
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (MenuAction.field982 == 84 || MenuAction.field982 == 80) { // L: 544
																Login.currentLoginField = 1;
															}

															char var12 = class25.field207; // L: 546
															boolean var60 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var12) != -1; // L: 548
															if (var60 && Login.Login_username.length() < 320) { // L: 550
																Login.Login_username = Login.Login_username + class25.field207;
															}
														} else {
															Login.loginIndex = 0; // L: 528
															Login.Login_username = ""; // L: 529
															Login.Login_password = ""; // L: 530
															PendingSpawn.field1204 = 0; // L: 531
															class16.otp = ""; // L: 532
															Login.field1008 = true; // L: 533
														}
													}

													return; // L: 980
												}
											} while(Login.currentLoginField != 1); // L: 552

											if (MenuAction.field982 == 85 && Login.Login_password.length() > 0) { // L: 553
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 554
											} else if (MenuAction.field982 == 84 || MenuAction.field982 == 80) { // L: 556
												Login.currentLoginField = 0; // L: 557
												if (MenuAction.field982 == 84) { // L: 558
													Login.Login_username = Login.Login_username.trim(); // L: 559
													if (Login.Login_username.length() == 0) { // L: 560
														class44.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 561
														return; // L: 562
													}

													if (Login.Login_password.length() == 0) { // L: 564
														class44.setLoginResponseString("", "Please enter your password.", ""); // L: 565
														return; // L: 566
													}

													class44.setLoginResponseString("", "Connecting to server...", ""); // L: 568
													HealthBarUpdate.method2204(false); // L: 569
													Client.updateGameState(20); // L: 570
													return; // L: 571
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && MenuAction.field982 == 67) { // L: 574
												Clipboard var25 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 575
												var26 = var25.getContents(class303.client); // L: 576
												var59 = 20 - Login.Login_password.length(); // L: 577
												break;
											}

											char var63 = class25.field207; // L: 627
											if ((var63 < ' ' || var63 >= 127) && (var63 <= 127 || var63 >= 160) && (var63 <= 160 || var63 > 255)) { // L: 629
												label1464: {
													if (var63 != 0) { // L: 633
														char[] var69 = class301.cp1252AsciiExtension; // L: 635

														for (int var29 = 0; var29 < var69.length; ++var29) { // L: 636
															char var14 = var69[var29]; // L: 637
															if (var14 == var63) { // L: 639
																var56 = true; // L: 640
																break label1464; // L: 641
															}
														}
													}

													var56 = false; // L: 647
												}
											} else {
												var56 = true; // L: 630
											}

											if (var56) { // L: 649
												char var70 = class25.field207; // L: 651
												boolean var58 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var70) != -1; // L: 653
												if (var58 && Login.Login_password.length() < 20) { // L: 655 656
													Login.Login_password = Login.Login_password + class25.field207; // L: 657
												}
											}
										}
									} while(var59 <= 0); // L: 578

									try {
										String var61 = (String)var26.getTransferData(DataFlavor.stringFlavor); // L: 580
										int var64 = Math.min(var59, var61.length()); // L: 581
										int var15 = 0;

										while (true) {
											if (var15 >= var64) {
												Login.Login_password = Login.Login_password + var61.substring(0, var64); // L: 619
												continue label1335;
											}

											char var65 = var61.charAt(var15); // L: 585
											boolean var16;
											if ((var65 < ' ' || var65 >= 127) && (var65 <= 127 || var65 >= 160) && (var65 <= 160 || var65 > 255)) { // L: 587
												label1467: {
													if (var65 != 0) { // L: 591
														char[] var66 = class301.cp1252AsciiExtension; // L: 593

														for (var19 = 0; var19 < var66.length; ++var19) { // L: 594
															char var20 = var66[var19]; // L: 595
															if (var20 == var65) { // L: 597
																var16 = true; // L: 598
																break label1467; // L: 599
															}
														}
													}

													var16 = false; // L: 605
												}
											} else {
												var16 = true; // L: 588
											}

											if (!var16) { // L: 607
												break;
											}

											char var67 = var61.charAt(var15); // L: 609
											boolean var27 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var67) != -1; // L: 611
											if (!var27) { // L: 613
												break;
											}

											++var15; // L: 582
										}

										Login.loginIndex = 3; // L: 615
										return; // L: 616
									} catch (UnsupportedFlavorException var47) { // L: 621
									} catch (IOException var48) { // L: 622
									}
								}
							} else if (Login.loginIndex == 3) { // L: 666
								var51 = Login.loginBoxX + 180; // L: 667
								var8 = 276; // L: 668
								if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 669
									BufferedSink.Login_promptCredentials(false); // L: 670
								}

								var51 = Login.loginBoxX + 180; // L: 672
								var8 = 326; // L: 673
								if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 674
									class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 675
									Login.loginIndex = 5; // L: 676
									return; // L: 677
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 680
									var51 = Login.loginBoxX + 180 - 80; // L: 681
									var8 = 321; // L: 682
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 683
										class16.otp.trim(); // L: 684
										if (class16.otp.length() != 6) { // L: 685
											class44.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 686
											return; // L: 687
										}

										PendingSpawn.field1204 = Integer.parseInt(class16.otp); // L: 689
										class16.otp = ""; // L: 690
										HealthBarUpdate.method2204(true); // L: 691
										class44.setLoginResponseString("", "Connecting to server...", ""); // L: 692
										Client.updateGameState(20); // L: 693
										return; // L: 694
									}

									if (var4 == 1 && var68 >= Login.loginBoxX + 180 - 9 && var68 <= Login.loginBoxX + 180 + 130 && var50 >= 263 && var50 <= 296) { // L: 696
										Login.field1008 = !Login.field1008; // L: 697
									}

									if (var4 == 1 && var68 >= Login.loginBoxX + 180 - 34 && var68 <= Login.loginBoxX + 34 + 180 && var50 >= 351 && var50 <= 363) { // L: 699
										Interpreter.openURL(class4.method57("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 700
									}

									var51 = Login.loginBoxX + 180 + 80; // L: 702
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 703
										Login.loginIndex = 0; // L: 704
										Login.Login_username = ""; // L: 705
										Login.Login_password = ""; // L: 706
										PendingSpawn.field1204 = 0; // L: 707
										class16.otp = ""; // L: 708
									}

									while (class17.isKeyDown()) { // L: 710
										boolean var9 = false; // L: 711

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 712
											if (class25.field207 == "1234567890".charAt(var10)) { // L: 713
												var9 = true; // L: 714
												break; // L: 715
											}
										}

										if (MenuAction.field982 == 13) { // L: 718
											Login.loginIndex = 0; // L: 719
											Login.Login_username = ""; // L: 720
											Login.Login_password = ""; // L: 721
											PendingSpawn.field1204 = 0; // L: 722
											class16.otp = ""; // L: 723
										} else {
											if (MenuAction.field982 == 85 && class16.otp.length() > 0) { // L: 726
												class16.otp = class16.otp.substring(0, class16.otp.length() - 1);
											}

											if (MenuAction.field982 == 84) { // L: 727
												class16.otp.trim(); // L: 728
												if (class16.otp.length() != 6) { // L: 729
													class44.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 730
													return; // L: 731
												}

												PendingSpawn.field1204 = Integer.parseInt(class16.otp); // L: 733
												class16.otp = ""; // L: 734
												HealthBarUpdate.method2204(true); // L: 735
												class44.setLoginResponseString("", "Connecting to server...", ""); // L: 736
												Client.updateGameState(20); // L: 737
												return; // L: 738
											}

											if (var9 && class16.otp.length() < 6) { // L: 740
												class16.otp = class16.otp + class25.field207;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 744
									var51 = Login.loginBoxX + 180 - 80; // L: 745
									var8 = 321; // L: 746
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 747
										Login.Login_username = Login.Login_username.trim(); // L: 749
										if (Login.Login_username.length() == 0) { // L: 750
											class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 751
										} else {
											long var33;
											try {
												URL var28 = new URL(class4.method57("services", false) + "m=accountappeal/login.ws"); // L: 758
												URLConnection var13 = var28.openConnection(); // L: 759
												var13.setRequestProperty("connection", "close"); // L: 760
												var13.setDoInput(true); // L: 761
												var13.setDoOutput(true); // L: 762
												var13.setConnectTimeout(5000); // L: 763
												OutputStreamWriter var71 = new OutputStreamWriter(var13.getOutputStream()); // L: 764
												var71.write("data1=req"); // L: 765
												var71.flush(); // L: 766
												InputStream var72 = var13.getInputStream(); // L: 767
												Buffer var73 = new Buffer(new byte[1000]); // L: 768

												while (true) {
													int var17 = var72.read(var73.array, var73.offset, 1000 - var73.offset); // L: 770
													if (var17 == -1) { // L: 771
														var73.offset = 0; // L: 778
														long var35 = var73.readLong(); // L: 779
														var33 = var35; // L: 780
														break;
													}

													var73.offset += var17; // L: 772
													if (var73.offset >= 1000) { // L: 773
														var33 = 0L; // L: 774
														break;
													}
												}
											} catch (Exception var45) { // L: 782
												var33 = 0L; // L: 783
											}

											int var55;
											if (var33 == 0L) { // L: 787
												var55 = 5;
											} else {
												var55 = PendingSpawn.method2180(var33, Login.Login_username); // L: 788
											}

											switch(var55) { // L: 789
											case 2:
												class44.setLoginResponseString(Strings.field3439, Strings.field3503, Strings.field3512); // L: 797
												Login.loginIndex = 6; // L: 798
												break; // L: 799
											case 3:
												class44.setLoginResponseString("", "Error connecting to server.", ""); // L: 804
												break; // L: 805
											case 4:
												class44.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 807
												break;
											case 5:
												class44.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 791
												break; // L: 792
											case 6:
												class44.setLoginResponseString("", "Error connecting to server.", ""); // L: 794
												break; // L: 795
											case 7:
												class44.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 801
											}
										}

										return; // L: 811
									}

									var51 = Login.loginBoxX + 180 + 80; // L: 813
									if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 814
										BufferedSink.Login_promptCredentials(true); // L: 815
									}

									var53 = 361; // L: 817
									if (WorldMapElement.field1572 != null) { // L: 818
										var10 = WorldMapElement.field1572.highX / 2; // L: 819
										if (var4 == 1 && var68 >= WorldMapElement.field1572.lowX - var10 && var68 <= var10 + WorldMapElement.field1572.lowX && var50 >= var53 - 15 && var50 < var53) { // L: 820
											Interpreter.openURL(class4.method57("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 821
										}
									}

									while (class17.isKeyDown()) { // L: 824
										var56 = false; // L: 825

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 826
											if (class25.field207 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 827
												var56 = true; // L: 828
												break; // L: 829
											}
										}

										if (MenuAction.field982 == 13) { // L: 832
											BufferedSink.Login_promptCredentials(true); // L: 833
										} else {
											if (MenuAction.field982 == 85 && Login.Login_username.length() > 0) { // L: 836
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (MenuAction.field982 == 84) { // L: 837
												Login.Login_username = Login.Login_username.trim(); // L: 839
												if (Login.Login_username.length() == 0) { // L: 840
													class44.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 841
												} else {
													long var37;
													try {
														URL var30 = new URL(class4.method57("services", false) + "m=accountappeal/login.ws"); // L: 848
														URLConnection var31 = var30.openConnection(); // L: 849
														var31.setRequestProperty("connection", "close"); // L: 850
														var31.setDoInput(true); // L: 851
														var31.setDoOutput(true); // L: 852
														var31.setConnectTimeout(5000); // L: 853
														OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream()); // L: 854
														var32.write("data1=req"); // L: 855
														var32.flush(); // L: 856
														InputStream var39 = var31.getInputStream(); // L: 857
														Buffer var18 = new Buffer(new byte[1000]); // L: 858

														while (true) {
															var19 = var39.read(var18.array, var18.offset, 1000 - var18.offset); // L: 860
															if (var19 == -1) { // L: 861
																var18.offset = 0; // L: 868
																long var40 = var18.readLong(); // L: 869
																var37 = var40; // L: 870
																break;
															}

															var18.offset += var19; // L: 862
															if (var18.offset >= 1000) { // L: 863
																var37 = 0L; // L: 864
																break;
															}
														}
													} catch (Exception var46) { // L: 872
														var37 = 0L; // L: 873
													}

													if (var37 == 0L) { // L: 877
														var11 = 5;
													} else {
														var11 = PendingSpawn.method2180(var37, Login.Login_username); // L: 878
													}

													switch(var11) { // L: 879
													case 2:
														class44.setLoginResponseString(Strings.field3439, Strings.field3503, Strings.field3512); // L: 887
														Login.loginIndex = 6; // L: 888
														break; // L: 889
													case 3:
														class44.setLoginResponseString("", "Error connecting to server.", ""); // L: 897
														break;
													case 4:
														class44.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 881
														break; // L: 882
													case 5:
														class44.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 884
														break; // L: 885
													case 6:
														class44.setLoginResponseString("", "Error connecting to server.", ""); // L: 894
														break; // L: 895
													case 7:
														class44.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 891
													}
												}

												return; // L: 901
											}

											if (var56 && Login.Login_username.length() < 320) { // L: 903
												Login.Login_username = Login.Login_username + class25.field207;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 907
									if (Login.loginIndex == 7) { // L: 918
										var51 = Login.loginBoxX + 180 - 80; // L: 919
										var8 = 321; // L: 920
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 921
											Interpreter.openURL(class4.method57("secure", true) + "m=dob/set_dob.ws", true, false); // L: 922
											class44.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 923
											Login.loginIndex = 6; // L: 924
											return; // L: 925
										}

										var51 = Login.loginBoxX + 180 + 80; // L: 927
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 928
											BufferedSink.Login_promptCredentials(true); // L: 929
										}
									} else if (Login.loginIndex == 8) { // L: 932
										var51 = Login.loginBoxX + 180 - 80; // L: 933
										var8 = 321; // L: 934
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 935
											Interpreter.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 936
											class44.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 937
											Login.loginIndex = 6; // L: 938
											return; // L: 939
										}

										var51 = Login.loginBoxX + 180 + 80; // L: 941
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 942
											BufferedSink.Login_promptCredentials(true); // L: 943
										}
									} else if (Login.loginIndex == 12) { // L: 946
										String var44 = ""; // L: 947
										switch(Login.field996) { // L: 948
										case 0:
											var44 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 956
											break;
										case 1:
											var44 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 953
											break; // L: 954
										default:
											BufferedSink.Login_promptCredentials(false); // L: 950
										}

										var54 = Login.loginBoxX + 180; // L: 959
										var53 = 276; // L: 960
										if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) { // L: 961
											Interpreter.openURL(var44, true, false); // L: 962
											class44.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 963
											Login.loginIndex = 6; // L: 964
											return; // L: 965
										}

										var54 = Login.loginBoxX + 180; // L: 967
										var53 = 326; // L: 968
										if (var4 == 1 && var68 >= var54 - 75 && var68 <= var54 + 75 && var50 >= var53 - 20 && var50 <= var53 + 20) { // L: 969
											BufferedSink.Login_promptCredentials(false); // L: 970
										}
									} else if (Login.loginIndex == 24) { // L: 973
										var51 = Login.loginBoxX + 180; // L: 974
										var8 = 301; // L: 975
										if (var4 == 1 && var68 >= var51 - 75 && var68 <= var51 + 75 && var50 >= var8 - 20 && var50 <= var8 + 20) { // L: 976
											BufferedSink.Login_promptCredentials(false); // L: 977
										}
									}
								} else {
									while (true) {
										do {
											if (!class17.isKeyDown()) { // L: 908
												var52 = 321; // L: 913
												if (var4 == 1 && var50 >= var52 - 20 && var50 <= var52 + 20) { // L: 914
													BufferedSink.Login_promptCredentials(true); // L: 915
												}

												return;
											}
										} while(MenuAction.field982 != 84 && MenuAction.field982 != 13); // L: 909

										BufferedSink.Login_promptCredentials(true); // L: 910
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 324

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-89"
	)
	static final void method3586(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7902
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7903
				Client.field825[var4] = true;
			}
		}

	} // L: 7905
}
