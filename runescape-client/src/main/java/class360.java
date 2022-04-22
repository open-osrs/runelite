import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
class class360 implements Comparator {
	@ObfuscatedName("fj")
	static String field4209;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	final class361 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmg;)V"
	)
	class360(class361 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;I)I",
		garbageValue = "1269106031"
	)
	int method6585(class362 var1, class362 var2) {
		if (var1.field4222 > var2.field4222) { // L: 9
			return 1;
		} else {
			return var1.field4222 < var2.field4222 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6585((class362)var1, (class362)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIILgj;II)V",
		garbageValue = "-1591189890"
	)
	static void method6589(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 67
		var5.plane = var0; // L: 68
		var5.x = var1 * 128; // L: 69
		var5.y = var2 * 128; // L: 70
		int var6 = var3.sizeX; // L: 71
		int var7 = var3.sizeY; // L: 72
		if (var4 == 1 || var4 == 3) { // L: 73
			var6 = var3.sizeY; // L: 74
			var7 = var3.sizeX; // L: 75
		}

		var5.maxX = (var6 + var1) * 128; // L: 77
		var5.maxY = (var7 + var2) * 128; // L: 78
		var5.soundEffectId = var3.ambientSoundId; // L: 79
		var5.field814 = var3.int7 * 128; // L: 80
		var5.field818 = var3.int5; // L: 81
		var5.field810 = var3.int6; // L: 82
		var5.soundEffectIds = var3.soundEffectIds; // L: 83
		if (var3.transforms != null) { // L: 84
			var5.obj = var3; // L: 85
			var5.set(); // L: 86
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 88
		if (var5.soundEffectIds != null) { // L: 89
			var5.field821 = var5.field818 + (int)(Math.random() * (double)(var5.field810 - var5.field818));
		}

	} // L: 90

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lao;Lmd;B)V",
		garbageValue = "3"
	)
	static void method6592(GameEngine var0, Font var1) {
		int var4;
		int var38;
		if (Login.worldSelectOpen) { // L: 309
			while (true) {
				if (!SecureRandomCallable.isKeyDown()) { // L: 311
					if (MouseHandler.MouseHandler_lastButton != 1 && (GameBuild.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 332
						break;
					}

					int var2 = Login.xPadding + 280; // L: 333
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 334
						Players.changeWorldSelectSorting(0, 0); // L: 335
						break; // L: 336
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 338
						Players.changeWorldSelectSorting(0, 1); // L: 339
						break; // L: 340
					}

					int var3 = Login.xPadding + 390; // L: 342
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 343
						Players.changeWorldSelectSorting(1, 0); // L: 344
						break; // L: 345
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 347
						Players.changeWorldSelectSorting(1, 1); // L: 348
						break; // L: 349
					}

					var4 = Login.xPadding + 500; // L: 351
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 352
						Players.changeWorldSelectSorting(2, 0); // L: 353
						break; // L: 354
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 356
						Players.changeWorldSelectSorting(2, 1); // L: 357
						break; // L: 358
					}

					var38 = Login.xPadding + 610; // L: 360
					if (MouseHandler.MouseHandler_lastPressedX >= var38 && MouseHandler.MouseHandler_lastPressedX <= var38 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 361
						Players.changeWorldSelectSorting(3, 0); // L: 362
						break; // L: 363
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var38 + 15 && MouseHandler.MouseHandler_lastPressedX <= var38 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 365
						Players.changeWorldSelectSorting(3, 1); // L: 366
						break; // L: 367
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 369
						Login.worldSelectOpen = false; // L: 371
						class17.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 372
						ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 373
						Decimator.logoSprite.drawAt(Login.xPadding + 382 - Decimator.logoSprite.subWidth / 2, 18); // L: 374
						break; // L: 376
					}

					if (Login.hoveredWorldIndex != -1) { // L: 378
						World var6 = DevicePcmPlayerProvider.World_worlds[Login.hoveredWorldIndex]; // L: 379
						PlatformInfo.changeWorld(var6); // L: 380
						Login.worldSelectOpen = false; // L: 382
						class17.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 383
						ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 384
						Decimator.logoSprite.drawAt(Login.xPadding + 382 - Decimator.logoSprite.subWidth / 2, 18); // L: 385
					} else {
						if (Login.worldSelectPage > 0 && class54.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class54.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class321.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class321.canvasHeight / 2 + 50) { // L: 389
							--Login.worldSelectPage; // L: 390
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && AttackOption.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= InvDefinition.canvasWidth - AttackOption.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= InvDefinition.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class321.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class321.canvasHeight / 2 + 50) { // L: 392
							++Login.worldSelectPage; // L: 393
						}
					}
					break;
				}

				if (GameEngine.field218 == 13) { // L: 312
					Login.worldSelectOpen = false; // L: 314
					class17.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 315
					ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 316
					Decimator.logoSprite.drawAt(Login.xPadding + 382 - Decimator.logoSprite.subWidth / 2, 18); // L: 317
					break; // L: 319
				}

				if (GameEngine.field218 == 96) { // L: 321
					if (Login.worldSelectPage > 0 && class54.worldSelectLeftSprite != null) { // L: 322
						--Login.worldSelectPage; // L: 323
					}
				} else if (GameEngine.field218 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && AttackOption.worldSelectRightSprite != null) { // L: 326 327
					++Login.worldSelectPage; // L: 328
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !GameBuild.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 399
				class131.clientPreferences.method2237(!class131.clientPreferences.method2279()); // L: 400
				if (!class131.clientPreferences.method2279()) { // L: 401
					MidiPcmStream.method5368(class16.archive6, "scape main", "", 255, false);
				} else {
					class273.midiPcmStream.clear(); // L: 403
					class273.musicPlayerStatus = 1; // L: 404
					class273.musicTrackArchive = null; // L: 405
				}
			}

			if (Client.gameState != 5) { // L: 408
				if (-1L == Login.field915) { // L: 409
					Login.field915 = class136.method2931() + 1000L; // L: 410
				}

				long var20 = class136.method2931(); // L: 412
				if (PendingSpawn.method2166() && -1L == Login.field916) { // L: 413 414
					Login.field916 = var20; // L: 415
					if (Login.field916 > Login.field915) { // L: 416
						Login.field915 = Login.field916; // L: 417
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 421
					if (Language.Language_EN == Skills.clientLanguage) { // L: 422
						if (MouseHandler.MouseHandler_lastButton == 1 || !GameBuild.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 423
							var4 = Login.xPadding + 5; // L: 424
							short var5 = 463; // L: 425
							byte var22 = 100; // L: 426
							byte var7 = 35; // L: 427
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + var22 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) { // L: 428
								SoundCache.method768(); // L: 429
								return; // L: 430
							}
						}

						if (class293.World_request != null) { // L: 433
							SoundCache.method768();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 435
					var38 = MouseHandler.MouseHandler_lastPressedX; // L: 436
					int var52 = MouseHandler.MouseHandler_lastPressedY; // L: 437
					if (var4 == 0) { // L: 438
						var38 = MouseHandler.MouseHandler_x; // L: 439
						var52 = MouseHandler.MouseHandler_y; // L: 440
					}

					if (!GameBuild.mouseCam && var4 == 4) { // L: 442
						var4 = 1;
					}

					int var41;
					short var42;
					if (Login.loginIndex == 0) { // L: 443
						boolean var50 = false; // L: 444

						while (SecureRandomCallable.isKeyDown()) { // L: 445
							if (GameEngine.field218 == 84) { // L: 446
								var50 = true; // L: 447
							}
						}

						var41 = HealthBarDefinition.loginBoxCenter - 80; // L: 450
						var42 = 291; // L: 451
						if (var4 == 1 && var38 >= var41 - 75 && var38 <= var41 + 75 && var52 >= var42 - 20 && var52 <= var42 + 20) { // L: 452
							class391.openURL(ArchiveLoader.method2063("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 453
						}

						var41 = HealthBarDefinition.loginBoxCenter + 80; // L: 455
						if (var4 == 1 && var38 >= var41 - 75 && var38 <= var41 + 75 && var52 >= var42 - 20 && var52 <= var42 + 20 || var50) { // L: 456
							if ((Client.worldProperties & 33554432) != 0) { // L: 457
								Login.Login_response0 = ""; // L: 458
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 459
								Login.Login_response2 = "Your normal account will not be affected."; // L: 460
								Login.Login_response3 = ""; // L: 461
								Ignored.method6828(1); // L: 462
								class12.method157(); // L: 463
							} else if ((Client.worldProperties & 4) != 0) { // L: 465
								if ((Client.worldProperties & 1024) != 0) { // L: 466
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 467
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 468
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 469
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 472
									Login.Login_response2 = "Players can attack each other"; // L: 473
									Login.Login_response3 = "almost everywhere."; // L: 474
								}

								Login.Login_response0 = "Warning!"; // L: 476
								Ignored.method6828(1); // L: 477
								class12.method157(); // L: 478
							} else if ((Client.worldProperties & 1024) != 0) { // L: 480
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 481
								Login.Login_response2 = "The Protect Item prayer will"; // L: 482
								Login.Login_response3 = "not work on this world."; // L: 483
								Login.Login_response0 = "Warning!"; // L: 484
								Ignored.method6828(1); // L: 485
								class12.method157(); // L: 486
							} else {
								Messages.Login_promptCredentials(false); // L: 489
							}
						}
					} else {
						short var8;
						int var39;
						if (Login.loginIndex == 1) { // L: 493
							while (true) {
								if (!SecureRandomCallable.isKeyDown()) { // L: 494
									var39 = HealthBarDefinition.loginBoxCenter - 80; // L: 502
									var8 = 321; // L: 503
									if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 504
										Messages.Login_promptCredentials(false); // L: 505
									}

									var39 = HealthBarDefinition.loginBoxCenter + 80; // L: 507
									if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 508
										Ignored.method6828(0); // L: 509
									}
									break;
								}

								if (GameEngine.field218 == 84) { // L: 495
									Messages.Login_promptCredentials(false); // L: 496
								} else if (GameEngine.field218 == 13) { // L: 498
									Ignored.method6828(0); // L: 499
								}
							}
						} else {
							int var11;
							int var12;
							short var40;
							boolean var43;
							if (Login.loginIndex == 2) { // L: 512
								var40 = 201; // L: 513
								var39 = var40 + 52; // L: 514
								if (var4 == 1 && var52 >= var39 - 12 && var52 < var39 + 2) { // L: 515
									Login.currentLoginField = 0;
								}

								var39 += 15; // L: 516
								if (var4 == 1 && var52 >= var39 - 12 && var52 < var39 + 2) { // L: 517
									Login.currentLoginField = 1;
								}

								var39 += 15; // L: 518
								var40 = 361; // L: 519
								if (class113.field1378 != null) { // L: 520
									var41 = class113.field1378.highX / 2; // L: 521
									if (var4 == 1 && var38 >= class113.field1378.lowX - var41 && var38 <= var41 + class113.field1378.lowX && var52 >= var40 - 15 && var52 < var40) { // L: 522
										switch(Login.field895) { // L: 523
										case 1:
											class4.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 531
											Ignored.method6828(5); // L: 532
											return; // L: 533
										case 2:
											class391.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 526
										}
									}
								}

								var41 = HealthBarDefinition.loginBoxCenter - 80; // L: 538
								var42 = 321; // L: 539
								if (var4 == 1 && var38 >= var41 - 75 && var38 <= var41 + 75 && var52 >= var42 - 20 && var52 <= var42 + 20) { // L: 540
									Login.Login_username = Login.Login_username.trim(); // L: 541
									if (Login.Login_username.length() == 0) { // L: 542
										class4.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 543
										return; // L: 544
									}

									if (Login.Login_password.length() == 0) { // L: 546
										class4.setLoginResponseString("", "Please enter your password.", ""); // L: 547
										return; // L: 548
									}

									class4.setLoginResponseString("", "Connecting to server...", ""); // L: 550
									class302.method5766(false); // L: 551
									Decimator.updateGameState(20); // L: 552
									return; // L: 553
								}

								var41 = Login.loginBoxX + 180 + 80; // L: 555
								if (var4 == 1 && var38 >= var41 - 75 && var38 <= var41 + 75 && var52 >= var42 - 20 && var52 <= var42 + 20) { // L: 556
									Ignored.method6828(0); // L: 557
									Login.Login_username = ""; // L: 558
									Login.Login_password = ""; // L: 559
									WorldMapID.field2386 = 0; // L: 560
									HealthBar.otp = ""; // L: 561
									Login.field907 = true; // L: 562
								}

								var41 = HealthBarDefinition.loginBoxCenter + -117; // L: 564
								var42 = 277; // L: 565
								Login.field909 = var38 >= var41 && var38 < var41 + AbstractSocket.field4275 && var52 >= var42 && var52 < var42 + Occluder.field2687; // L: 566
								if (var4 == 1 && Login.field909) { // L: 567
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 568
									if (!Client.Login_isUsernameRemembered && class131.clientPreferences.method2247() != null) { // L: 569
										class131.clientPreferences.method2286((String)null); // L: 570
									}
								}

								var41 = HealthBarDefinition.loginBoxCenter + 24; // L: 573
								var42 = 277; // L: 574
								Login.field906 = var38 >= var41 && var38 < var41 + AbstractSocket.field4275 && var52 >= var42 && var52 < var42 + Occluder.field2687; // L: 575
								if (var4 == 1 && Login.field906) { // L: 576
									class131.clientPreferences.method2230(!class131.clientPreferences.method2317()); // L: 577
									if (!class131.clientPreferences.method2317()) { // L: 578
										Login.Login_username = ""; // L: 579
										class131.clientPreferences.method2286((String)null); // L: 580
										class12.method157(); // L: 581
									}
								}

								label1472:
								while (true) {
									Transferable var54;
									do {
										while (true) {
											label1436:
											do {
												while (true) {
													while (SecureRandomCallable.isKeyDown()) { // L: 584
														if (GameEngine.field218 != 13) { // L: 585
															if (Login.currentLoginField != 0) { // L: 594
																continue label1436;
															}

															char var44 = ItemComposition.field2121; // L: 595

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var44 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 597 598
															}

															if (GameEngine.field218 == 85 && Login.Login_username.length() > 0) { // L: 601
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (GameEngine.field218 == 84 || GameEngine.field218 == 80) { // L: 602
																Login.currentLoginField = 1;
															}

															char var46 = ItemComposition.field2121; // L: 604
															boolean var47 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var46) != -1; // L: 606
															if (var47 && Login.Login_username.length() < 320) { // L: 608
																Login.Login_username = Login.Login_username + ItemComposition.field2121;
															}
														} else {
															Ignored.method6828(0); // L: 586
															Login.Login_username = ""; // L: 587
															Login.Login_password = ""; // L: 588
															WorldMapID.field2386 = 0; // L: 589
															HealthBar.otp = ""; // L: 590
															Login.field907 = true; // L: 591
														}
													}

													return; // L: 1096
												}
											} while(Login.currentLoginField != 1); // L: 610

											if (GameEngine.field218 == 85 && Login.Login_password.length() > 0) { // L: 611
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 612
											} else if (GameEngine.field218 == 84 || GameEngine.field218 == 80) { // L: 614
												Login.currentLoginField = 0; // L: 615
												if (GameEngine.field218 == 84) { // L: 616
													Login.Login_username = Login.Login_username.trim(); // L: 617
													if (Login.Login_username.length() == 0) { // L: 618
														class4.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 619
														return; // L: 620
													}

													if (Login.Login_password.length() == 0) { // L: 622
														class4.setLoginResponseString("", "Please enter your password.", ""); // L: 623
														return; // L: 624
													}

													class4.setLoginResponseString("", "Connecting to server...", ""); // L: 626
													class302.method5766(false); // L: 627
													Decimator.updateGameState(20); // L: 628
													return; // L: 629
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && GameEngine.field218 == 67) { // L: 632
												Clipboard var53 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 633
												var54 = var53.getContents(class127.client); // L: 634
												var12 = 20 - Login.Login_password.length(); // L: 635
												break;
											}

											if (WorldMapSection0.method4303(ItemComposition.field2121)) { // L: 660
												char var48 = ItemComposition.field2121; // L: 662
												var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var48) != -1; // L: 664
												if (var43 && Login.Login_password.length() < 20) { // L: 666 667
													Login.Login_password = Login.Login_password + ItemComposition.field2121; // L: 668
												}
											}
										}
									} while(var12 <= 0); // L: 636

									try {
										String var13 = (String)var54.getTransferData(DataFlavor.stringFlavor); // L: 638
										int var14 = Math.min(var12, var13.length()); // L: 639
										int var49 = 0;

										while (true) {
											if (var49 >= var14) {
												Login.Login_password = Login.Login_password + var13.substring(0, var14); // L: 654
												continue label1472;
											}

											if (!WorldMapSection0.method4303(var13.charAt(var49))) { // L: 642
												break;
											}

											char var51 = var13.charAt(var49); // L: 644
											boolean var16 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var51) != -1; // L: 646
											if (!var16) { // L: 648
												break;
											}

											++var49; // L: 640
										}

										Ignored.method6828(3); // L: 650
										return; // L: 651
									} catch (UnsupportedFlavorException var36) { // L: 656
									} catch (IOException var37) { // L: 657
									}
								}
							} else if (Login.loginIndex == 3) { // L: 676
								var39 = Login.loginBoxX + 180; // L: 677
								var8 = 276; // L: 678
								if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 679
									class348.method6505(false); // L: 680
								}

								var39 = Login.loginBoxX + 180; // L: 682
								var8 = 326; // L: 683
								if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 684
									class4.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 685
									Ignored.method6828(5); // L: 686
									return; // L: 687
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 690
									var39 = Login.loginBoxX + 180 - 80; // L: 691
									var8 = 321; // L: 692
									if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 693
										HealthBar.otp.trim(); // L: 694
										if (HealthBar.otp.length() != 6) { // L: 695
											class4.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 696
											return; // L: 697
										}

										WorldMapID.field2386 = Integer.parseInt(HealthBar.otp); // L: 699
										HealthBar.otp = ""; // L: 700
										class302.method5766(true); // L: 701
										class4.setLoginResponseString("", "Connecting to server...", ""); // L: 702
										Decimator.updateGameState(20); // L: 703
										return; // L: 704
									}

									if (var4 == 1 && var38 >= Login.loginBoxX + 180 - 9 && var38 <= Login.loginBoxX + 180 + 130 && var52 >= 263 && var52 <= 296) { // L: 706
										Login.field907 = !Login.field907; // L: 707
									}

									if (var4 == 1 && var38 >= Login.loginBoxX + 180 - 34 && var38 <= Login.loginBoxX + 34 + 180 && var52 >= 351 && var52 <= 363) { // L: 709
										class391.openURL(ArchiveLoader.method2063("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 710
									}

									var39 = Login.loginBoxX + 180 + 80; // L: 712
									if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 713
										Ignored.method6828(0); // L: 714
										Login.Login_username = ""; // L: 715
										Login.Login_password = ""; // L: 716
										WorldMapID.field2386 = 0; // L: 717
										HealthBar.otp = ""; // L: 718
									}

									while (SecureRandomCallable.isKeyDown()) { // L: 720
										boolean var9 = false; // L: 721

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 722
											if (ItemComposition.field2121 == "1234567890".charAt(var10)) { // L: 723
												var9 = true; // L: 724
												break; // L: 725
											}
										}

										if (GameEngine.field218 == 13) { // L: 728
											Ignored.method6828(0); // L: 729
											Login.Login_username = ""; // L: 730
											Login.Login_password = ""; // L: 731
											WorldMapID.field2386 = 0; // L: 732
											HealthBar.otp = ""; // L: 733
										} else {
											if (GameEngine.field218 == 85 && HealthBar.otp.length() > 0) { // L: 736
												HealthBar.otp = HealthBar.otp.substring(0, HealthBar.otp.length() - 1);
											}

											if (GameEngine.field218 == 84) { // L: 737
												HealthBar.otp.trim(); // L: 738
												if (HealthBar.otp.length() != 6) { // L: 739
													class4.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 740
													return; // L: 741
												}

												WorldMapID.field2386 = Integer.parseInt(HealthBar.otp); // L: 743
												HealthBar.otp = ""; // L: 744
												class302.method5766(true); // L: 745
												class4.setLoginResponseString("", "Connecting to server...", ""); // L: 746
												Decimator.updateGameState(20); // L: 747
												return; // L: 748
											}

											if (var9 && HealthBar.otp.length() < 6) { // L: 750
												HealthBar.otp = HealthBar.otp + ItemComposition.field2121;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 754
									var39 = Login.loginBoxX + 180 - 80; // L: 755
									var8 = 321; // L: 756
									if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 757
										DynamicObject.method2003(); // L: 758
										return; // L: 759
									}

									var39 = Login.loginBoxX + 180 + 80; // L: 761
									if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 762
										Messages.Login_promptCredentials(true); // L: 763
									}

									var42 = 361; // L: 765
									if (class260.field2892 != null) { // L: 766
										var10 = class260.field2892.highX / 2; // L: 767
										if (var4 == 1 && var38 >= class260.field2892.lowX - var10 && var38 <= var10 + class260.field2892.lowX && var52 >= var42 - 15 && var52 < var42) { // L: 768
											class391.openURL(ArchiveLoader.method2063("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 769
										}
									}

									while (SecureRandomCallable.isKeyDown()) { // L: 772
										var43 = false; // L: 773

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 774
											if (ItemComposition.field2121 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 775
												var43 = true; // L: 776
												break; // L: 777
											}
										}

										if (GameEngine.field218 == 13) { // L: 780
											Messages.Login_promptCredentials(true); // L: 781
										} else {
											if (GameEngine.field218 == 85 && Login.Login_username.length() > 0) { // L: 784
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (GameEngine.field218 == 84) { // L: 785
												DynamicObject.method2003(); // L: 786
												return; // L: 787
											}

											if (var43 && Login.Login_username.length() < 320) { // L: 789
												Login.Login_username = Login.Login_username + ItemComposition.field2121;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 793
									if (Login.loginIndex == 7) { // L: 804
										if (Client.field504 && !Client.onMobile) { // L: 805
											var39 = HealthBarDefinition.loginBoxCenter - 150; // L: 806
											var41 = var39 + 40 + 240 + 25; // L: 807
											var42 = 231; // L: 808
											var10 = var42 + 40; // L: 809
											if (var4 == 1 && var38 >= var39 && var38 <= var41 && var52 >= var42 && var52 <= var10) { // L: 810
												var12 = var39; // L: 812
												int var25 = 0;

												while (true) {
													if (var25 >= 8) {
														var11 = 0; // L: 822
														break;
													}

													if (var38 <= var12 + 30) { // L: 815
														var11 = var25; // L: 816
														break; // L: 817
													}

													var12 += 30; // L: 819
													var12 += var25 != 1 && var25 != 3 ? 5 : 20; // L: 820
													++var25; // L: 814
												}

												Login.field903 = var11; // L: 824
											}

											var11 = Login.loginBoxX + 180 - 80; // L: 826
											short var45 = 321; // L: 827
											boolean var15;
											boolean var17;
											Date var18;
											java.util.Calendar var19;
											Date var26;
											java.util.Calendar var28;
											Date var29;
											boolean var55;
											if (var4 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var52 >= var45 - 20 && var52 <= var45 + 20) { // L: 828
												label1307: {
													try {
														var26 = class345.method6441(); // L: 833
													} catch (ParseException var35) { // L: 835
														Ignored.method6828(7); // L: 837
														class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 838
														var55 = false; // L: 840
														break label1307; // L: 841
													}

													if (var26 == null) { // L: 843
														var55 = false; // L: 844
													} else {
														var28 = java.util.Calendar.getInstance(); // L: 849
														var28.set(1, var28.get(1) - 13); // L: 850
														var29 = var28.getTime(); // L: 851
														var15 = var26.before(var29); // L: 852
														var19 = java.util.Calendar.getInstance(); // L: 859
														var19.set(2, 0); // L: 860
														var19.set(5, 1); // L: 861
														var19.set(1, 1900); // L: 862
														var18 = var19.getTime(); // L: 863
														var17 = var26.after(var18); // L: 866
														if (!var17) { // L: 869
															Ignored.method6828(7); // L: 871
															class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 872
															var55 = false; // L: 874
														} else {
															if (!var15) { // L: 877
																WorldMapSectionType.field2321 = 8388607; // L: 878
															} else {
																WorldMapSectionType.field2321 = (int)(var26.getTime() / 86400000L - 11745L); // L: 881
															}

															var55 = true; // L: 883
														}
													}
												}

												if (var55) { // L: 886
													Decimator.updateGameState(50); // L: 887
													return; // L: 888
												}
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 891
											if (var4 == 1 && var38 >= var11 - 75 && var38 <= var11 + 75 && var52 >= var45 - 20 && var52 <= var45 + 20) { // L: 892
												Login.field904 = new String[8]; // L: 893
												Messages.Login_promptCredentials(true); // L: 894
											}

											while (SecureRandomCallable.isKeyDown()) { // L: 896
												if (GameEngine.field218 == 101) { // L: 897
													Login.field904[Login.field903] = null; // L: 898
												}

												if (GameEngine.field218 == 85) { // L: 900
													if (Login.field904[Login.field903] == null && Login.field903 > 0) { // L: 901
														--Login.field903; // L: 902
													}

													Login.field904[Login.field903] = null; // L: 904
												}

												if (ItemComposition.field2121 >= '0' && ItemComposition.field2121 <= '9') { // L: 906
													Login.field904[Login.field903] = "" + ItemComposition.field2121; // L: 907
													if (Login.field903 < 7) { // L: 908
														++Login.field903; // L: 909
													}
												}

												if (GameEngine.field218 == 84) { // L: 912
													label1243: {
														try {
															var26 = class345.method6441(); // L: 917
														} catch (ParseException var34) { // L: 919
															Ignored.method6828(7); // L: 921
															class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 922
															var55 = false; // L: 924
															break label1243; // L: 925
														}

														if (var26 == null) { // L: 927
															var55 = false; // L: 928
														} else {
															var28 = java.util.Calendar.getInstance(); // L: 933
															var28.set(1, var28.get(1) - 13); // L: 934
															var29 = var28.getTime(); // L: 935
															var15 = var26.before(var29); // L: 936
															var19 = java.util.Calendar.getInstance(); // L: 943
															var19.set(2, 0); // L: 944
															var19.set(5, 1); // L: 945
															var19.set(1, 1900); // L: 946
															var18 = var19.getTime(); // L: 947
															var17 = var26.after(var18); // L: 950
															if (!var17) { // L: 953
																Ignored.method6828(7); // L: 955
																class4.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 956
																var55 = false; // L: 958
															} else {
																if (!var15) { // L: 961
																	WorldMapSectionType.field2321 = 8388607; // L: 962
																} else {
																	WorldMapSectionType.field2321 = (int)(var26.getTime() / 86400000L - 11745L); // L: 965
																}

																var55 = true; // L: 967
															}
														}
													}

													if (var55) { // L: 970
														Decimator.updateGameState(50); // L: 971
													}

													return; // L: 973
												}
											}
										} else {
											var39 = Login.loginBoxX + 180 - 80; // L: 978
											var8 = 321; // L: 979
											if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 980
												class391.openURL(ArchiveLoader.method2063("secure", true) + "m=dob/set_dob.ws", true, false); // L: 981
												class4.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 982
												Ignored.method6828(6); // L: 983
												return; // L: 984
											}

											var39 = Login.loginBoxX + 180 + 80; // L: 986
											if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 987
												Messages.Login_promptCredentials(true); // L: 988
											}
										}
									} else if (Login.loginIndex == 8) { // L: 992
										var39 = Login.loginBoxX + 180 - 80; // L: 993
										var8 = 321; // L: 994
										if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 995
											class391.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 996
											class4.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 997
											Ignored.method6828(6); // L: 998
											return; // L: 999
										}

										var39 = Login.loginBoxX + 180 + 80; // L: 1001
										if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1002
											Messages.Login_promptCredentials(true); // L: 1003
										}
									} else if (Login.loginIndex == 9) { // L: 1006
										var39 = Login.loginBoxX + 180; // L: 1007
										var8 = 311; // L: 1008
										if (GameEngine.field218 == 84 || GameEngine.field218 == 13 || var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1009
											class348.method6505(false); // L: 1010
										}
									} else if (Login.loginIndex == 10) { // L: 1013
										var39 = Login.loginBoxX + 180; // L: 1014
										var8 = 209; // L: 1015
										if (GameEngine.field218 == 84 || var4 == 1 && var38 >= var39 - 109 && var38 <= var39 + 109 && var52 >= var8 && var52 <= var8 + 68) { // L: 1016
											class4.setLoginResponseString("", "Connecting to server...", ""); // L: 1017
											Client.field532 = class441.field4671; // L: 1018
											class302.method5766(false); // L: 1019
											Decimator.updateGameState(20); // L: 1020
										}
									} else if (Login.loginIndex == 12) { // L: 1023
										var39 = HealthBarDefinition.loginBoxCenter; // L: 1024
										var8 = 233; // L: 1025
										Bounds var31 = var1.method6333(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var39, var8); // L: 1026
										Bounds var23 = var1.method6333(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var39, var8); // L: 1027
										Bounds var24 = var1.method6333(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var39, var8); // L: 1028
										var41 = var8 + 17; // L: 1029
										Bounds var32 = var1.method6333(0, 34, "<col=ffd200>agreement (EULA)</col>.", var39, var41); // L: 1030
										if (var4 == 1) { // L: 1031
											if (var31.method6944(var38, var52)) { // L: 1032
												class391.openURL("https://www.jagex.com/terms", true, false); // L: 1033
											} else if (var23.method6944(var38, var52)) { // L: 1035
												class391.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1036
											} else if (var24.method6944(var38, var52) || var32.method6944(var38, var52)) { // L: 1038
												class391.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1039
											}
										}

										var39 = HealthBarDefinition.loginBoxCenter - 80; // L: 1042
										var8 = 311; // L: 1043
										if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1044
											class131.clientPreferences.method2248(Client.field617); // L: 1046
											class348.method6505(true); // L: 1048
										}

										var39 = HealthBarDefinition.loginBoxCenter + 80; // L: 1050
										if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1051
											Login.loginIndex = 13; // L: 1052
										}
									} else if (Login.loginIndex == 13) { // L: 1055
										var39 = HealthBarDefinition.loginBoxCenter; // L: 1056
										var8 = 321; // L: 1057
										if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1058
											class348.method6505(true); // L: 1059
										}
									} else if (Login.loginIndex == 14) { // L: 1062
										String var33 = ""; // L: 1063
										switch(Login.field901) { // L: 1064
										case 0:
											var33 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1066
											break; // L: 1067
										case 1:
											var33 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1069
											break; // L: 1070
										default:
											Messages.Login_promptCredentials(false); // L: 1072
										}

										var41 = Login.loginBoxX + 180; // L: 1075
										var42 = 276; // L: 1076
										if (var4 == 1 && var38 >= var41 - 75 && var38 <= var41 + 75 && var52 >= var42 - 20 && var52 <= var42 + 20) { // L: 1077
											class391.openURL(var33, true, false); // L: 1078
											class4.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1079
											Ignored.method6828(6); // L: 1080
											return; // L: 1081
										}

										var41 = Login.loginBoxX + 180; // L: 1083
										var42 = 326; // L: 1084
										if (var4 == 1 && var38 >= var41 - 75 && var38 <= var41 + 75 && var52 >= var42 - 20 && var52 <= var42 + 20) { // L: 1085
											Messages.Login_promptCredentials(false); // L: 1086
										}
									} else if (Login.loginIndex == 24) { // L: 1089
										var39 = Login.loginBoxX + 180; // L: 1090
										var8 = 301; // L: 1091
										if (var4 == 1 && var38 >= var39 - 75 && var38 <= var39 + 75 && var52 >= var8 - 20 && var52 <= var8 + 20) { // L: 1092
											class348.method6505(false); // L: 1093
										}
									}
								} else {
									while (true) {
										do {
											if (!SecureRandomCallable.isKeyDown()) { // L: 794
												var40 = 321; // L: 799
												if (var4 == 1 && var52 >= var40 - 20 && var52 <= var40 + 20) { // L: 800
													Messages.Login_promptCredentials(true); // L: 801
												}

												return;
											}
										} while(GameEngine.field218 != 84 && GameEngine.field218 != 13); // L: 795

										Messages.Login_promptCredentials(true); // L: 796
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 397
}
