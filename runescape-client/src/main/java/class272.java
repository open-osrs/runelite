import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class272 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lai;Lle;I)V",
		garbageValue = "-740150909"
	)
	static void method5197(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) { // L: 322
			PcmPlayer.method757(var0); // L: 323
		} else {
			int var4;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 326
				class408.clientPreferences.titleMusicDisabled = !class408.clientPreferences.titleMusicDisabled; // L: 327
				Login.savePreferences(); // L: 328
				if (!class408.clientPreferences.titleMusicDisabled) { // L: 329
					Archive var2 = Messages.archive6; // L: 330
					int var3 = var2.getGroupId("scape main"); // L: 332
					var4 = var2.getFileId(var3, ""); // L: 333
					class247.musicPlayerStatus = 1; // L: 335
					class128.musicTrackArchive = var2; // L: 336
					FillMode.musicTrackGroupId = var3; // L: 337
					ArchiveDiskActionHandler.musicTrackFileId = var4; // L: 338
					class247.musicTrackVolume = 255; // L: 339
					SecureRandomCallable.musicTrackBoolean = false; // L: 340
					class247.pcmSampleLength = 10000; // L: 341
				} else {
					WorldMapCacheName.method4027(); // L: 345
				}
			}

			if (Client.gameState != 5) { // L: 347
				if (Login.field876 == -1L) { // L: 348
					Login.field876 = class111.method2516() + 1000L; // L: 349
				}

				long var16 = class111.method2516(); // L: 351
				if (Client.method1643() && Login.field884 == -1L) { // L: 352 353
					Login.field884 = var16; // L: 354
					if (Login.field884 > Login.field876) { // L: 355
						Login.field876 = Login.field884; // L: 356
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 360
					if (MouseHandler.clientLanguage == Language.Language_EN) { // L: 361
						if (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 362
							var4 = Login.xPadding + 5; // L: 363
							short var5 = 463; // L: 364
							byte var6 = 100; // L: 365
							byte var7 = 35; // L: 366
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var6 + var4 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var5 + var7) { // L: 367
								if (MusicPatch.loadWorlds()) { // L: 369
									Login.worldSelectOpen = true; // L: 370
									Login.worldSelectPage = 0; // L: 371
									Login.worldSelectPagesCount = 0; // L: 372
								}

								return; // L: 375
							}
						}

						if (class21.World_request != null && MusicPatch.loadWorlds()) { // L: 378 379
							Login.worldSelectOpen = true; // L: 380
							Login.worldSelectPage = 0; // L: 381
							Login.worldSelectPagesCount = 0; // L: 382
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 386
					int var25 = MouseHandler.MouseHandler_lastPressedX; // L: 387
					int var26 = MouseHandler.MouseHandler_lastPressedY; // L: 388
					if (var4 == 0) { // L: 389
						var25 = MouseHandler.MouseHandler_x; // L: 390
						var26 = MouseHandler.MouseHandler_y; // L: 391
					}

					if (!ApproximateRouteStrategy.mouseCam && var4 == 4) { // L: 393
						var4 = 1;
					}

					short var29;
					int var31;
					if (Login.loginIndex == 0) { // L: 394
						boolean var33 = false; // L: 395

						while (WorldMapElement.isKeyDown()) { // L: 396
							if (class12.field55 == 84) { // L: 397
								var33 = true; // L: 398
							}
						}

						var31 = Login.loginBoxCenter - 80; // L: 401
						var29 = 291; // L: 402
						if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 403
							class91.openURL(HealthBar.method2246("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 404
						}

						var31 = Login.loginBoxCenter + 80; // L: 406
						if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20 || var33) { // L: 407
							if ((Client.worldProperties & 33554432) != 0) { // L: 408
								Login.Login_response0 = ""; // L: 409
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 410
								Login.Login_response2 = "Your normal account will not be affected."; // L: 411
								Login.Login_response3 = ""; // L: 412
								class275.method5201(1); // L: 413
								ParamComposition.method3216(); // L: 414
							} else if ((Client.worldProperties & 4) != 0) { // L: 416
								if ((Client.worldProperties & 1024) != 0) { // L: 417
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 418
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 419
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 420
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 423
									Login.Login_response2 = "Players can attack each other"; // L: 424
									Login.Login_response3 = "almost everywhere."; // L: 425
								}

								Login.Login_response0 = "Warning!"; // L: 427
								class275.method5201(1); // L: 428
								ParamComposition.method3216(); // L: 429
							} else if ((Client.worldProperties & 1024) != 0) { // L: 431
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 432
								Login.Login_response2 = "The Protect Item prayer will"; // L: 433
								Login.Login_response3 = "not work on this world."; // L: 434
								Login.Login_response0 = "Warning!"; // L: 435
								class275.method5201(1); // L: 436
								ParamComposition.method3216(); // L: 437
							} else {
								class1.Login_promptCredentials(false); // L: 440
							}
						}
					} else {
						short var8;
						int var27;
						if (Login.loginIndex == 1) { // L: 444
							while (true) {
								if (!WorldMapElement.isKeyDown()) { // L: 445
									var27 = Login.loginBoxCenter - 80; // L: 453
									var8 = 321; // L: 454
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 455
										class1.Login_promptCredentials(false); // L: 456
									}

									var27 = Login.loginBoxCenter + 80; // L: 458
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 459
										class275.method5201(0); // L: 460
									}
									break;
								}

								if (class12.field55 == 84) { // L: 446
									class1.Login_promptCredentials(false); // L: 447
								} else if (class12.field55 == 13) { // L: 449
									class275.method5201(0); // L: 450
								}
							}
						} else {
							int var11;
							short var28;
							if (Login.loginIndex == 2) { // L: 463
								var28 = 201; // L: 464
								var27 = var28 + 52; // L: 465
								if (var4 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) { // L: 466
									Login.currentLoginField = 0;
								}

								var27 += 15; // L: 467
								if (var4 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) { // L: 468
									Login.currentLoginField = 1;
								}

								var27 += 15; // L: 469
								var28 = 361; // L: 470
								if (class114.field1359 != null) { // L: 471
									var31 = class114.field1359.highX / 2; // L: 472
									if (var4 == 1 && var25 >= class114.field1359.lowX - var31 && var25 <= var31 + class114.field1359.lowX && var26 >= var28 - 15 && var26 < var28) { // L: 473
										switch(Login.field865) { // L: 474
										case 1:
											class1.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 482
											class275.method5201(5); // L: 483
											return; // L: 484
										case 2:
											class91.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 477
										}
									}
								}

								var31 = Login.loginBoxCenter - 80; // L: 489
								var29 = 321; // L: 490
								if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 491
									Login.Login_username = Login.Login_username.trim(); // L: 492
									if (Login.Login_username.length() == 0) { // L: 493
										class1.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 494
										return; // L: 495
									}

									if (Login.Login_password.length() == 0) { // L: 497
										class1.setLoginResponseString("", "Please enter your password.", ""); // L: 498
										return; // L: 499
									}

									class1.setLoginResponseString("", "Connecting to server...", ""); // L: 501
									WorldMapSection2.method3584(false); // L: 502
									WorldMapData_1.updateGameState(20); // L: 503
									return; // L: 504
								}

								var31 = Login.loginBoxX + 180 + 80; // L: 506
								if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 507
									class275.method5201(0); // L: 508
									Login.Login_username = ""; // L: 509
									Login.Login_password = ""; // L: 510
									ReflectionCheck.field429 = 0; // L: 511
									Tiles.otp = ""; // L: 512
									Login.field875 = true; // L: 513
								}

								var31 = Login.loginBoxCenter + -117; // L: 515
								var29 = 277; // L: 516
								Login.field873 = var25 >= var31 && var25 < var31 + class327.field3908 && var26 >= var29 && var26 < var29 + UserComparator9.field1326; // L: 517
								if (var4 == 1 && Login.field873) { // L: 518
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 519
									if (!Client.Login_isUsernameRemembered && class408.clientPreferences.rememberedUsername != null) { // L: 520
										class408.clientPreferences.rememberedUsername = null; // L: 521
										Login.savePreferences(); // L: 522
									}
								}

								var31 = Login.loginBoxCenter + 24; // L: 525
								var29 = 277; // L: 526
								Login.field860 = var25 >= var31 && var25 < var31 + class327.field3908 && var26 >= var29 && var26 < var29 + UserComparator9.field1326; // L: 527
								if (var4 == 1 && Login.field860) { // L: 528
									class408.clientPreferences.hideUsername = !class408.clientPreferences.hideUsername; // L: 529
									if (!class408.clientPreferences.hideUsername) { // L: 530
										Login.Login_username = ""; // L: 531
										class408.clientPreferences.rememberedUsername = null; // L: 532
										ParamComposition.method3216(); // L: 533
									}

									Login.savePreferences(); // L: 535
								}

								while (true) {
									int var12;
									Transferable var35;
									do {
										while (true) {
											label1030:
											do {
												while (true) {
													while (WorldMapElement.isKeyDown()) { // L: 537
														if (class12.field55 != 13) { // L: 538
															if (Login.currentLoginField != 0) { // L: 547
																continue label1030;
															}

															char var32 = class319.field3858; // L: 548

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var32 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 550 551
															}

															if (class12.field55 == 85 && Login.Login_username.length() > 0) { // L: 554
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class12.field55 == 84 || class12.field55 == 80) { // L: 555
																Login.currentLoginField = 1;
															}

															if (DynamicObject.method2001(class319.field3858) && Login.Login_username.length() < 320) { // L: 556
																Login.Login_username = Login.Login_username + class319.field3858;
															}
														} else {
															class275.method5201(0); // L: 539
															Login.Login_username = ""; // L: 540
															Login.Login_password = ""; // L: 541
															ReflectionCheck.field429 = 0; // L: 542
															Tiles.otp = ""; // L: 543
															Login.field875 = true; // L: 544
														}
													}

													return; // L: 854
												}
											} while(Login.currentLoginField != 1); // L: 558

											if (class12.field55 == 85 && Login.Login_password.length() > 0) { // L: 559
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 560
											} else if (class12.field55 == 84 || class12.field55 == 80) { // L: 562
												Login.currentLoginField = 0; // L: 563
												if (class12.field55 == 84) { // L: 564
													Login.Login_username = Login.Login_username.trim(); // L: 565
													if (Login.Login_username.length() == 0) { // L: 566
														class1.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 567
														return; // L: 568
													}

													if (Login.Login_password.length() == 0) { // L: 570
														class1.setLoginResponseString("", "Please enter your password.", ""); // L: 571
														return; // L: 572
													}

													class1.setLoginResponseString("", "Connecting to server...", ""); // L: 574
													WorldMapSection2.method3584(false); // L: 575
													WorldMapData_1.updateGameState(20); // L: 576
													return; // L: 577
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class12.field55 == 67) { // L: 580
												Clipboard var34 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 581
												var35 = var34.getContents(ArchiveLoader.client); // L: 582
												var12 = 20 - Login.Login_password.length(); // L: 583
												break;
											}

											if (GrandExchangeOffer.method5473(class319.field3858) && DynamicObject.method2001(class319.field3858) && Login.Login_password.length() < 20) { // L: 600
												Login.Login_password = Login.Login_password + class319.field3858; // L: 601
											}
										}
									} while(var12 <= 0); // L: 584

									try {
										String var13 = (String)var35.getTransferData(DataFlavor.stringFlavor); // L: 586
										int var14 = Math.min(var12, var13.length()); // L: 587

										for (int var15 = 0; var15 < var14; ++var15) { // L: 588
											if (!GrandExchangeOffer.method5473(var13.charAt(var15)) || !DynamicObject.method2001(var13.charAt(var15))) { // L: 589
												class275.method5201(3); // L: 590
												return; // L: 591
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var14); // L: 594
									} catch (UnsupportedFlavorException var23) { // L: 596
									} catch (IOException var24) { // L: 597
									}
								}
							} else if (Login.loginIndex == 3) { // L: 607
								var27 = Login.loginBoxX + 180; // L: 608
								var8 = 276; // L: 609
								if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 610
									EnumComposition.method3097(false); // L: 611
								}

								var27 = Login.loginBoxX + 180; // L: 613
								var8 = 326; // L: 614
								if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 615
									class1.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 616
									class275.method5201(5); // L: 617
									return; // L: 618
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 621
									var27 = Login.loginBoxX + 180 - 80; // L: 622
									var8 = 321; // L: 623
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 624
										Tiles.otp.trim(); // L: 625
										if (Tiles.otp.length() != 6) { // L: 626
											class1.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 627
											return; // L: 628
										}

										ReflectionCheck.field429 = Integer.parseInt(Tiles.otp); // L: 630
										Tiles.otp = ""; // L: 631
										WorldMapSection2.method3584(true); // L: 632
										class1.setLoginResponseString("", "Connecting to server...", ""); // L: 633
										WorldMapData_1.updateGameState(20); // L: 634
										return; // L: 635
									}

									if (var4 == 1 && var25 >= Login.loginBoxX + 180 - 9 && var25 <= Login.loginBoxX + 180 + 130 && var26 >= 263 && var26 <= 296) { // L: 637
										Login.field875 = !Login.field875; // L: 638
									}

									if (var4 == 1 && var25 >= Login.loginBoxX + 180 - 34 && var25 <= Login.loginBoxX + 34 + 180 && var26 >= 351 && var26 <= 363) { // L: 640
										class91.openURL(HealthBar.method2246("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 641
									}

									var27 = Login.loginBoxX + 180 + 80; // L: 643
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 644
										class275.method5201(0); // L: 645
										Login.Login_username = ""; // L: 646
										Login.Login_password = ""; // L: 647
										ReflectionCheck.field429 = 0; // L: 648
										Tiles.otp = ""; // L: 649
									}

									while (WorldMapElement.isKeyDown()) { // L: 651
										boolean var9 = false; // L: 652

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 653
											if (class319.field3858 == "1234567890".charAt(var10)) { // L: 654
												var9 = true; // L: 655
												break; // L: 656
											}
										}

										if (class12.field55 == 13) { // L: 659
											class275.method5201(0); // L: 660
											Login.Login_username = ""; // L: 661
											Login.Login_password = ""; // L: 662
											ReflectionCheck.field429 = 0; // L: 663
											Tiles.otp = ""; // L: 664
										} else {
											if (class12.field55 == 85 && Tiles.otp.length() > 0) { // L: 667
												Tiles.otp = Tiles.otp.substring(0, Tiles.otp.length() - 1);
											}

											if (class12.field55 == 84) { // L: 668
												Tiles.otp.trim(); // L: 669
												if (Tiles.otp.length() != 6) { // L: 670
													class1.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 671
													return; // L: 672
												}

												ReflectionCheck.field429 = Integer.parseInt(Tiles.otp); // L: 674
												Tiles.otp = ""; // L: 675
												WorldMapSection2.method3584(true); // L: 676
												class1.setLoginResponseString("", "Connecting to server...", ""); // L: 677
												WorldMapData_1.updateGameState(20); // L: 678
												return; // L: 679
											}

											if (var9 && Tiles.otp.length() < 6) { // L: 681
												Tiles.otp = Tiles.otp + class319.field3858;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 685
									var27 = Login.loginBoxX + 180 - 80; // L: 686
									var8 = 321; // L: 687
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 688
										Occluder.method4482(); // L: 689
										return; // L: 690
									}

									var27 = Login.loginBoxX + 180 + 80; // L: 692
									if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 693
										class1.Login_promptCredentials(true); // L: 694
									}

									var29 = 361; // L: 696
									if (ItemContainer.field998 != null) { // L: 697
										var10 = ItemContainer.field998.highX / 2; // L: 698
										if (var4 == 1 && var25 >= ItemContainer.field998.lowX - var10 && var25 <= var10 + ItemContainer.field998.lowX && var26 >= var29 - 15 && var26 < var29) { // L: 699
											class91.openURL(HealthBar.method2246("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 700
										}
									}

									while (WorldMapElement.isKeyDown()) { // L: 703
										boolean var30 = false; // L: 704

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 705
											if (class319.field3858 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 706
												var30 = true; // L: 707
												break; // L: 708
											}
										}

										if (class12.field55 == 13) { // L: 711
											class1.Login_promptCredentials(true); // L: 712
										} else {
											if (class12.field55 == 85 && Login.Login_username.length() > 0) { // L: 715
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class12.field55 == 84) { // L: 716
												Occluder.method4482(); // L: 717
												return; // L: 718
											}

											if (var30 && Login.Login_username.length() < 320) { // L: 720
												Login.Login_username = Login.Login_username + class319.field3858;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 724
									if (Login.loginIndex == 7) { // L: 735
										var27 = Login.loginBoxX + 180 - 80; // L: 736
										var8 = 321; // L: 737
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 738
											class91.openURL(HealthBar.method2246("secure", true) + "m=dob/set_dob.ws", true, false); // L: 739
											class1.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 740
											class275.method5201(6); // L: 741
											return; // L: 742
										}

										var27 = Login.loginBoxX + 180 + 80; // L: 744
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 745
											class1.Login_promptCredentials(true); // L: 746
										}
									} else if (Login.loginIndex == 8) { // L: 749
										var27 = Login.loginBoxX + 180 - 80; // L: 750
										var8 = 321; // L: 751
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 752
											class91.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 753
											class1.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 754
											class275.method5201(6); // L: 755
											return; // L: 756
										}

										var27 = Login.loginBoxX + 180 + 80; // L: 758
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 759
											class1.Login_promptCredentials(true); // L: 760
										}
									} else if (Login.loginIndex == 9) { // L: 763
										var27 = Login.loginBoxX + 180; // L: 764
										var8 = 311; // L: 765
										if (class12.field55 == 84 || class12.field55 == 13 || var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 766
											EnumComposition.method3097(false); // L: 767
										}
									} else if (Login.loginIndex == 10) { // L: 770
										var27 = Login.loginBoxX + 180; // L: 771
										var8 = 209; // L: 772
										if (class12.field55 == 84 || var4 == 1 && var25 >= var27 - 109 && var25 <= var27 + 109 && var26 >= var8 && var26 <= var8 + 68) { // L: 773
											class1.setLoginResponseString("", "Connecting to server...", ""); // L: 774
											Client.field500 = class404.field4352; // L: 775
											WorldMapSection2.method3584(false); // L: 776
											WorldMapData_1.updateGameState(20); // L: 777
										}
									} else if (Login.loginIndex == 12) { // L: 780
										var27 = Login.loginBoxCenter; // L: 781
										var8 = 233; // L: 782
										Bounds var20 = var1.method5745(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var27, var8); // L: 783
										Bounds var18 = var1.method5745(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var27, var8); // L: 784
										Bounds var19 = var1.method5745(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var27, var8); // L: 785
										var31 = var8 + 17; // L: 786
										Bounds var21 = var1.method5745(0, 34, "<col=ffd200>agreement (EULA)</col>.", var27, var31); // L: 787
										if (var4 == 1) { // L: 788
											if (var20.method6341(var25, var26)) { // L: 789
												class91.openURL("https://www.jagex.com/terms", true, false); // L: 790
											} else if (var18.method6341(var25, var26)) { // L: 792
												class91.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 793
											} else if (var19.method6341(var25, var26) || var21.method6341(var25, var26)) { // L: 795
												class91.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 796
											}
										}

										var27 = Login.loginBoxCenter - 80; // L: 799
										var8 = 311; // L: 800
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 801
											class408.clientPreferences.field1182 = Client.field467; // L: 803
											Login.savePreferences(); // L: 804
											EnumComposition.method3097(true); // L: 806
										}

										var27 = Login.loginBoxCenter + 80; // L: 808
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 809
											Login.loginIndex = 13; // L: 810
										}
									} else if (Login.loginIndex == 13) { // L: 813
										var27 = Login.loginBoxCenter; // L: 814
										var8 = 321; // L: 815
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 816
											EnumComposition.method3097(true); // L: 817
										}
									} else if (Login.loginIndex == 14) { // L: 820
										String var22 = ""; // L: 821
										switch(Login.field866) { // L: 822
										case 0:
											var22 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 827
											break; // L: 828
										case 1:
											var22 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 830
											break;
										default:
											class1.Login_promptCredentials(false); // L: 824
										}

										var31 = Login.loginBoxX + 180; // L: 833
										var29 = 276; // L: 834
										if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 835
											class91.openURL(var22, true, false); // L: 836
											class1.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 837
											class275.method5201(6); // L: 838
											return; // L: 839
										}

										var31 = Login.loginBoxX + 180; // L: 841
										var29 = 326; // L: 842
										if (var4 == 1 && var25 >= var31 - 75 && var25 <= var31 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 843
											class1.Login_promptCredentials(false); // L: 844
										}
									} else if (Login.loginIndex == 24) { // L: 847
										var27 = Login.loginBoxX + 180; // L: 848
										var8 = 301; // L: 849
										if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 850
											EnumComposition.method3097(false); // L: 851
										}
									}
								} else {
									while (true) {
										do {
											if (!WorldMapElement.isKeyDown()) { // L: 725
												var28 = 321; // L: 730
												if (var4 == 1 && var26 >= var28 - 20 && var26 <= var28 + 20) { // L: 731
													class1.Login_promptCredentials(true); // L: 732
												}

												return;
											}
										} while(class12.field55 != 84 && class12.field55 != 13); // L: 726

										class1.Login_promptCredentials(true); // L: 727
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 324
}
