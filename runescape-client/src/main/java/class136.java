import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class136 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -862261103
	)
	int field1624;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1624 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	void vmethod3037(Buffer var1) {
		this.field1624 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	void vmethod3032(ClanChannel var1) {
		var1.removeMember(this.field1624);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "-185692115"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Laj;Lmx;I)V",
		garbageValue = "617611550"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) { // L: 288
			class132.method2829(var0); // L: 289
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 292
				class12.clientPreferences.method2305(!class12.clientPreferences.method2226()); // L: 293
				if (!class12.clientPreferences.method2226()) { // L: 294
					class118.method2733(AbstractUserComparator.archive6, "scape main", "", 255, false);
				} else {
					ApproximateRouteStrategy.method1110(); // L: 295
				}
			}

			if (Client.gameState != 5) { // L: 297
				if (-1L == Login.field883) { // L: 298
					Login.field883 = class113.method2624() + 1000L; // L: 299
				}

				long var2 = class113.method2624(); // L: 301
				if (class121.method2748() && Login.field909 == -1L) { // L: 302 303
					Login.field909 = var2; // L: 304
					if (Login.field909 > Login.field883) { // L: 305
						Login.field883 = Login.field909; // L: 306
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 310
					int var4;
					if (Language.Language_EN == class263.clientLanguage) { // L: 311
						if (MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 312
							var4 = Login.xPadding + 5; // L: 313
							short var5 = 463; // L: 314
							byte var6 = 100; // L: 315
							byte var7 = 35; // L: 316
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) { // L: 317
								Player.method2135(); // L: 318
								return; // L: 319
							}
						}

						if (NPC.World_request != null) { // L: 322
							Player.method2135();
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 324
					int var30 = MouseHandler.MouseHandler_lastPressedX; // L: 325
					int var31 = MouseHandler.MouseHandler_lastPressedY; // L: 326
					if (var4 == 0) { // L: 327
						var30 = MouseHandler.MouseHandler_x; // L: 328
						var31 = MouseHandler.MouseHandler_y; // L: 329
					}

					if (!Login.mouseCam && var4 == 4) { // L: 331
						var4 = 1;
					}

					int var34;
					short var35;
					if (Login.loginIndex == 0) { // L: 332
						boolean var44 = false; // L: 333

						while (TaskHandler.isKeyDown()) { // L: 334
							if (class12.field61 == 84) { // L: 335
								var44 = true; // L: 336
							}
						}

						var34 = Decimator.loginBoxCenter - 80; // L: 339
						var35 = 291; // L: 340
						if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) { // L: 341
							ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 342
						}

						var34 = Decimator.loginBoxCenter + 80; // L: 344
						if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20 || var44) { // L: 345
							if ((Client.worldProperties & 33554432) != 0) { // L: 346
								Login.Login_response0 = ""; // L: 347
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 348
								Login.Login_response2 = "Your normal account will not be affected."; // L: 349
								Login.Login_response3 = ""; // L: 350
								class126.method2799(1); // L: 351
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 353
									Login.currentLoginField = 1; // L: 354
								} else {
									Login.currentLoginField = 0; // L: 357
								}
							} else if ((Client.worldProperties & 4) != 0) { // L: 361
								if ((Client.worldProperties & 1024) != 0) { // L: 362
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 363
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 364
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 365
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 368
									Login.Login_response2 = "Players can attack each other"; // L: 369
									Login.Login_response3 = "almost everywhere."; // L: 370
								}

								Login.Login_response0 = "Warning!"; // L: 372
								class126.method2799(1); // L: 373
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 375
									Login.currentLoginField = 1; // L: 376
								} else {
									Login.currentLoginField = 0; // L: 379
								}
							} else if ((Client.worldProperties & 1024) != 0) { // L: 383
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 384
								Login.Login_response2 = "The Protect Item prayer will"; // L: 385
								Login.Login_response3 = "not work on this world."; // L: 386
								Login.Login_response0 = "Warning!"; // L: 387
								class126.method2799(1); // L: 388
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 390
									Login.currentLoginField = 1; // L: 391
								} else {
									Login.currentLoginField = 0; // L: 394
								}
							} else {
								PcmPlayer.Login_promptCredentials(false); // L: 399
							}
						}
					} else {
						short var8;
						int var32;
						if (Login.loginIndex == 1) { // L: 403
							while (true) {
								if (!TaskHandler.isKeyDown()) { // L: 404
									var32 = Decimator.loginBoxCenter - 80; // L: 412
									var8 = 321; // L: 413
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 414
										PcmPlayer.Login_promptCredentials(false); // L: 415
									}

									var32 = Decimator.loginBoxCenter + 80; // L: 417
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 418
										class126.method2799(0); // L: 419
									}
									break;
								}

								if (class12.field61 == 84) { // L: 405
									PcmPlayer.Login_promptCredentials(false); // L: 406
								} else if (class12.field61 == 13) { // L: 408
									class126.method2799(0); // L: 409
								}
							}
						} else {
							int var11;
							short var33;
							boolean var36;
							if (Login.loginIndex == 2) { // L: 422
								var33 = 201; // L: 423
								var32 = var33 + 52; // L: 424
								if (var4 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) { // L: 425
									Login.currentLoginField = 0;
								}

								var32 += 15; // L: 426
								if (var4 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) { // L: 427
									Login.currentLoginField = 1;
								}

								var32 += 15; // L: 428
								var33 = 361; // L: 429
								if (ChatChannel.field976 != null) { // L: 430
									var34 = ChatChannel.field976.highX / 2; // L: 431
									if (var4 == 1 && var30 >= ChatChannel.field976.lowX - var34 && var30 <= var34 + ChatChannel.field976.lowX && var31 >= var33 - 15 && var31 < var33) { // L: 432
										switch(Login.field907) { // L: 433
										case 1:
											class345.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 441
											class126.method2799(5); // L: 442
											return; // L: 443
										case 2:
											ScriptEvent.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 436
										}
									}
								}

								var34 = Decimator.loginBoxCenter - 80; // L: 448
								var35 = 321; // L: 449
								if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) { // L: 450
									Login.Login_username = Login.Login_username.trim(); // L: 451
									if (Login.Login_username.length() == 0) { // L: 452
										class345.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 453
										return; // L: 454
									}

									if (Login.Login_password.length() == 0) { // L: 456
										class345.setLoginResponseString("", "Please enter your password.", ""); // L: 457
										return; // L: 458
									}

									class345.setLoginResponseString("", "Connecting to server...", ""); // L: 460
									ObjectSound.method1730(false); // L: 461
									PendingSpawn.updateGameState(20); // L: 462
									return; // L: 463
								}

								var34 = Login.loginBoxX + 180 + 80; // L: 465
								if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) { // L: 466
									class126.method2799(0); // L: 467
									Login.Login_username = ""; // L: 468
									Login.Login_password = ""; // L: 469
									WorldMapCacheName.field2912 = 0; // L: 470
									class92.otp = ""; // L: 471
									Login.field900 = true; // L: 472
								}

								var34 = Decimator.loginBoxCenter + -117; // L: 474
								var35 = 277; // L: 475
								Login.field879 = var30 >= var34 && var30 < var34 + class16.field81 && var31 >= var35 && var31 < var35 + class268.field3212; // L: 476
								if (var4 == 1 && Login.field879) { // L: 477
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 478
									if (!Client.Login_isUsernameRemembered && class12.clientPreferences.method2241() != null) { // L: 479
										class12.clientPreferences.method2297((String)null); // L: 480
									}
								}

								var34 = Decimator.loginBoxCenter + 24; // L: 483
								var35 = 277; // L: 484
								Login.field881 = var30 >= var34 && var30 < var34 + class16.field81 && var31 >= var35 && var31 < var35 + class268.field3212; // L: 485
								if (var4 == 1 && Login.field881) { // L: 486
									class12.clientPreferences.method2223(!class12.clientPreferences.method2257()); // L: 487
									if (!class12.clientPreferences.method2257()) { // L: 488
										Login.Login_username = ""; // L: 489
										class12.clientPreferences.method2297((String)null); // L: 490
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 492
											Login.currentLoginField = 1; // L: 493
										} else {
											Login.currentLoginField = 0; // L: 496
										}
									}
								}

								label1340:
								while (true) {
									int var40;
									Transferable var47;
									do {
										while (true) {
											label1256:
											do {
												while (true) {
													while (TaskHandler.isKeyDown()) { // L: 501
														if (class12.field61 != 13) { // L: 502
															if (Login.currentLoginField != 0) { // L: 511
																continue label1256;
															}

															char var37 = InvDefinition.field1850; // L: 512

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var37 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 514 515
															}

															if (class12.field61 == 85 && Login.Login_username.length() > 0) { // L: 518
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class12.field61 == 84 || class12.field61 == 80) { // L: 519
																Login.currentLoginField = 1;
															}

															char var38 = InvDefinition.field1850; // L: 521
															boolean var41 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var38) != -1; // L: 523
															if (var41 && Login.Login_username.length() < 320) { // L: 525
																Login.Login_username = Login.Login_username + InvDefinition.field1850;
															}
														} else {
															class126.method2799(0); // L: 503
															Login.Login_username = ""; // L: 504
															Login.Login_password = ""; // L: 505
															WorldMapCacheName.field2912 = 0; // L: 506
															class92.otp = ""; // L: 507
															Login.field900 = true; // L: 508
														}
													}

													return; // L: 950
												}
											} while(Login.currentLoginField != 1); // L: 527

											if (class12.field61 == 85 && Login.Login_password.length() > 0) { // L: 528
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 529
											} else if (class12.field61 == 84 || class12.field61 == 80) { // L: 531
												Login.currentLoginField = 0; // L: 532
												if (class12.field61 == 84) { // L: 533
													Login.Login_username = Login.Login_username.trim(); // L: 534
													if (Login.Login_username.length() == 0) { // L: 535
														class345.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 536
														return; // L: 537
													}

													if (Login.Login_password.length() == 0) { // L: 539
														class345.setLoginResponseString("", "Please enter your password.", ""); // L: 540
														return; // L: 541
													}

													class345.setLoginResponseString("", "Connecting to server...", ""); // L: 543
													ObjectSound.method1730(false); // L: 544
													PendingSpawn.updateGameState(20); // L: 545
													return; // L: 546
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class12.field61 == 67) { // L: 549
												Clipboard var46 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 550
												var47 = var46.getContents(class82.client); // L: 551
												var40 = 20 - Login.Login_password.length(); // L: 552
												break;
											}

											char var42 = InvDefinition.field1850; // L: 602
											if ((var42 < ' ' || var42 >= 127) && (var42 <= 127 || var42 >= 160) && (var42 <= 160 || var42 > 255)) { // L: 604
												label1472: {
													if (var42 != 0) { // L: 608
														char[] var48 = class341.cp1252AsciiExtension; // L: 610

														for (int var49 = 0; var49 < var48.length; ++var49) { // L: 611
															char var14 = var48[var49]; // L: 612
															if (var42 == var14) { // L: 614
																var36 = true; // L: 615
																break label1472; // L: 616
															}
														}
													}

													var36 = false; // L: 622
												}
											} else {
												var36 = true; // L: 605
											}

											if (var36) { // L: 624
												char var50 = InvDefinition.field1850; // L: 626
												boolean var39 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1; // L: 628
												if (var39 && Login.Login_password.length() < 20) { // L: 630 631
													Login.Login_password = Login.Login_password + InvDefinition.field1850; // L: 632
												}
											}
										}
									} while(var40 <= 0); // L: 553

									try {
										String var13 = (String)var47.getTransferData(DataFlavor.stringFlavor); // L: 555
										int var43 = Math.min(var40, var13.length()); // L: 556
										int var15 = 0;

										while (true) {
											if (var15 >= var43) {
												Login.Login_password = Login.Login_password + var13.substring(0, var43); // L: 594
												continue label1340;
											}

											char var17 = var13.charAt(var15); // L: 560
											boolean var16;
											if (var17 >= ' ' && var17 < 127 || var17 > 127 && var17 < 160 || var17 > 160 && var17 <= 255) { // L: 562
												var16 = true; // L: 563
											} else {
												label1486: {
													if (var17 != 0) { // L: 566
														char[] var18 = class341.cp1252AsciiExtension; // L: 568

														for (int var19 = 0; var19 < var18.length; ++var19) { // L: 569
															char var20 = var18[var19]; // L: 570
															if (var17 == var20) { // L: 572
																var16 = true; // L: 573
																break label1486; // L: 574
															}
														}
													}

													var16 = false; // L: 580
												}
											}

											if (!var16) { // L: 582
												break;
											}

											char var45 = var13.charAt(var15); // L: 584
											boolean var23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var45) != -1; // L: 586
											if (!var23) { // L: 588
												break;
											}

											++var15; // L: 557
										}

										class126.method2799(3); // L: 590
										return; // L: 591
									} catch (UnsupportedFlavorException var28) { // L: 596
									} catch (IOException var29) { // L: 597
									}
								}
							} else if (Login.loginIndex == 3) { // L: 641
								var32 = Login.loginBoxX + 180; // L: 642
								var8 = 276; // L: 643
								if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 644
									WorldMapData_1.method4706(false); // L: 645
								}

								var32 = Login.loginBoxX + 180; // L: 647
								var8 = 326; // L: 648
								if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 649
									class345.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 650
									class126.method2799(5); // L: 651
									return; // L: 652
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 655
									var32 = Login.loginBoxX + 180 - 80; // L: 656
									var8 = 321; // L: 657
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 658
										class92.otp.trim(); // L: 659
										if (class92.otp.length() != 6) { // L: 660
											class345.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 661
											return; // L: 662
										}

										WorldMapCacheName.field2912 = Integer.parseInt(class92.otp); // L: 664
										class92.otp = ""; // L: 665
										ObjectSound.method1730(true); // L: 666
										class345.setLoginResponseString("", "Connecting to server...", ""); // L: 667
										PendingSpawn.updateGameState(20); // L: 668
										return; // L: 669
									}

									if (var4 == 1 && var30 >= Login.loginBoxX + 180 - 9 && var30 <= Login.loginBoxX + 180 + 130 && var31 >= 263 && var31 <= 296) { // L: 671
										Login.field900 = !Login.field900; // L: 672
									}

									if (var4 == 1 && var30 >= Login.loginBoxX + 180 - 34 && var30 <= Login.loginBoxX + 34 + 180 && var31 >= 351 && var31 <= 363) { // L: 674
										ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 675
									}

									var32 = Login.loginBoxX + 180 + 80; // L: 677
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 678
										class126.method2799(0); // L: 679
										Login.Login_username = ""; // L: 680
										Login.Login_password = ""; // L: 681
										WorldMapCacheName.field2912 = 0; // L: 682
										class92.otp = ""; // L: 683
									}

									while (TaskHandler.isKeyDown()) { // L: 685
										boolean var9 = false; // L: 686

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 687
											if (InvDefinition.field1850 == "1234567890".charAt(var10)) { // L: 688
												var9 = true; // L: 689
												break; // L: 690
											}
										}

										if (class12.field61 == 13) { // L: 693
											class126.method2799(0); // L: 694
											Login.Login_username = ""; // L: 695
											Login.Login_password = ""; // L: 696
											WorldMapCacheName.field2912 = 0; // L: 697
											class92.otp = ""; // L: 698
										} else {
											if (class12.field61 == 85 && class92.otp.length() > 0) { // L: 701
												class92.otp = class92.otp.substring(0, class92.otp.length() - 1);
											}

											if (class12.field61 == 84) { // L: 702
												class92.otp.trim(); // L: 703
												if (class92.otp.length() != 6) { // L: 704
													class345.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 705
													return; // L: 706
												}

												WorldMapCacheName.field2912 = Integer.parseInt(class92.otp); // L: 708
												class92.otp = ""; // L: 709
												ObjectSound.method1730(true); // L: 710
												class345.setLoginResponseString("", "Connecting to server...", ""); // L: 711
												PendingSpawn.updateGameState(20); // L: 712
												return; // L: 713
											}

											if (var9 && class92.otp.length() < 6) { // L: 715
												class92.otp = class92.otp + InvDefinition.field1850;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 719
									var32 = Login.loginBoxX + 180 - 80; // L: 720
									var8 = 321; // L: 721
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 722
										class21.method280(); // L: 723
										return; // L: 724
									}

									var32 = Login.loginBoxX + 180 + 80; // L: 726
									if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 727
										PcmPlayer.Login_promptCredentials(true); // L: 728
									}

									var35 = 361; // L: 730
									if (ChatChannel.field977 != null) { // L: 731
										var10 = ChatChannel.field977.highX / 2; // L: 732
										if (var4 == 1 && var30 >= ChatChannel.field977.lowX - var10 && var30 <= var10 + ChatChannel.field977.lowX && var31 >= var35 - 15 && var31 < var35) { // L: 733
											ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 734
										}
									}

									while (TaskHandler.isKeyDown()) { // L: 737
										var36 = false; // L: 738

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 739
											if (InvDefinition.field1850 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 740
												var36 = true; // L: 741
												break; // L: 742
											}
										}

										if (class12.field61 == 13) { // L: 745
											PcmPlayer.Login_promptCredentials(true); // L: 746
										} else {
											if (class12.field61 == 85 && Login.Login_username.length() > 0) { // L: 749
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class12.field61 == 84) { // L: 750
												class21.method280(); // L: 751
												return; // L: 752
											}

											if (var36 && Login.Login_username.length() < 320) { // L: 754
												Login.Login_username = Login.Login_username + InvDefinition.field1850;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 758
									if (Login.loginIndex == 7) { // L: 769
										if (class92.field1273 && !Client.onMobile) { // L: 770
											var32 = Decimator.loginBoxCenter - 150; // L: 771
											var34 = var32 + 40 + 240 + 25; // L: 772
											var35 = 231; // L: 773
											var10 = var35 + 40; // L: 774
											if (var4 == 1 && var30 >= var32 && var30 <= var34 && var31 >= var35 && var31 <= var10) { // L: 775
												Login.field896 = PcmPlayer.method693(var32, var30); // L: 776
											}

											var11 = Login.loginBoxX + 180 - 80; // L: 778
											short var12 = 321; // L: 779
											boolean var25;
											if (var4 == 1 && var30 >= var11 - 75 && var30 <= var11 + 75 && var31 >= var12 - 20 && var31 <= var12 + 20) { // L: 780
												var25 = GraphicsObject.method1867(); // L: 781
												if (var25) { // L: 782
													PendingSpawn.updateGameState(50); // L: 783
													return; // L: 784
												}
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 787
											if (var4 == 1 && var30 >= var11 - 75 && var30 <= var11 + 75 && var31 >= var12 - 20 && var31 <= var12 + 20) { // L: 788
												Login.field876 = new String[8]; // L: 789
												PcmPlayer.Login_promptCredentials(true); // L: 790
											}

											while (TaskHandler.isKeyDown()) { // L: 792
												if (class12.field61 == 101) { // L: 793
													Login.field876[Login.field896] = null; // L: 794
												}

												if (class12.field61 == 85) { // L: 796
													if (Login.field876[Login.field896] == null && Login.field896 > 0) { // L: 797
														--Login.field896; // L: 798
													}

													Login.field876[Login.field896] = null; // L: 800
												}

												if (InvDefinition.field1850 >= '0' && InvDefinition.field1850 <= '9') { // L: 802
													Login.field876[Login.field896] = "" + InvDefinition.field1850; // L: 803
													if (Login.field896 < 7) { // L: 804
														++Login.field896; // L: 805
													}
												}

												if (class12.field61 == 84) { // L: 808
													var25 = GraphicsObject.method1867(); // L: 809
													if (var25) { // L: 810
														PendingSpawn.updateGameState(50); // L: 811
													}

													return; // L: 813
												}
											}
										} else {
											var32 = Login.loginBoxX + 180 - 80; // L: 818
											var8 = 321; // L: 819
											if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 820
												ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=dob/set_dob.ws", true, false); // L: 821
												class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 822
												class126.method2799(6); // L: 823
												return; // L: 824
											}

											var32 = Login.loginBoxX + 180 + 80; // L: 826
											if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 827
												PcmPlayer.Login_promptCredentials(true); // L: 828
											}
										}
									} else if (Login.loginIndex == 8) { // L: 832
										var32 = Login.loginBoxX + 180 - 80; // L: 833
										var8 = 321; // L: 834
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 835
											ScriptEvent.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 836
											class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 837
											class126.method2799(6); // L: 838
											return; // L: 839
										}

										var32 = Login.loginBoxX + 180 + 80; // L: 841
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 842
											PcmPlayer.Login_promptCredentials(true); // L: 843
										}
									} else if (Login.loginIndex == 9) { // L: 846
										var32 = Login.loginBoxX + 180; // L: 847
										var8 = 311; // L: 848
										if (class12.field61 == 84 || class12.field61 == 13 || var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 849
											WorldMapData_1.method4706(false); // L: 850
										}
									} else if (Login.loginIndex == 10) { // L: 853
										var32 = Login.loginBoxX + 180; // L: 854
										var8 = 209; // L: 855
										if (class12.field61 == 84 || var4 == 1 && var30 >= var32 - 109 && var30 <= var32 + 109 && var31 >= var8 && var31 <= var8 + 68) { // L: 856
											class345.setLoginResponseString("", "Connecting to server...", ""); // L: 857
											Client.field517 = class443.field4730; // L: 858
											ObjectSound.method1730(false); // L: 859
											PendingSpawn.updateGameState(20); // L: 860
										}
									} else if (Login.loginIndex == 12) { // L: 863
										var32 = Decimator.loginBoxCenter; // L: 864
										var8 = 233; // L: 865
										Bounds var26 = var1.method6219(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var8); // L: 866
										Bounds var21 = var1.method6219(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var8); // L: 867
										Bounds var22 = var1.method6219(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var8); // L: 868
										var34 = var8 + 17; // L: 869
										Bounds var24 = var1.method6219(0, 34, "<col=ffd200>agreement (EULA)</col>.", var32, var34); // L: 870
										if (var4 == 1) { // L: 871
											if (var26.method6742(var30, var31)) { // L: 872
												ScriptEvent.openURL("https://www.jagex.com/terms", true, false); // L: 873
											} else if (var21.method6742(var30, var31)) { // L: 875
												ScriptEvent.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 876
											} else if (var22.method6742(var30, var31) || var24.method6742(var30, var31)) { // L: 878
												ScriptEvent.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 879
											}
										}

										var32 = Decimator.loginBoxCenter - 80; // L: 882
										var8 = 311; // L: 883
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 884
											class12.clientPreferences.method2306(Client.field484); // L: 886
											WorldMapData_1.method4706(true); // L: 888
										}

										var32 = Decimator.loginBoxCenter + 80; // L: 890
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 891
											Login.loginIndex = 13; // L: 892
										}
									} else if (Login.loginIndex == 13) { // L: 895
										var32 = Decimator.loginBoxCenter; // L: 896
										var8 = 321; // L: 897
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 898
											WorldMapData_1.method4706(true); // L: 899
										}
									} else if (Login.loginIndex == 14) { // L: 902
										String var27 = ""; // L: 903
										switch(Login.field887) { // L: 904
										case 0:
											var27 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 909
											break; // L: 910
										case 1:
											var27 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 906
											break; // L: 907
										default:
											PcmPlayer.Login_promptCredentials(false); // L: 912
										}

										var34 = Login.loginBoxX + 180; // L: 915
										var35 = 276; // L: 916
										if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) { // L: 917
											ScriptEvent.openURL(var27, true, false); // L: 918
											class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 919
											class126.method2799(6); // L: 920
											return; // L: 921
										}

										var34 = Login.loginBoxX + 180; // L: 923
										var35 = 326; // L: 924
										if (var4 == 1 && var30 >= var34 - 75 && var30 <= var34 + 75 && var31 >= var35 - 20 && var31 <= var35 + 20) { // L: 925
											PcmPlayer.Login_promptCredentials(false); // L: 926
										}
									} else if (Login.loginIndex == 24) { // L: 929
										var32 = Login.loginBoxX + 180; // L: 930
										var8 = 301; // L: 931
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 932
											WorldMapData_1.method4706(false); // L: 933
										}
									} else if (Login.loginIndex == 26) { // L: 936
										var32 = Login.loginBoxX + 180 - 80; // L: 937
										var8 = 321; // L: 938
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 939
											ScriptEvent.openURL(WorldMapData_1.method4707("secure", true) + "m=dob/set_dob.ws", true, false); // L: 940
											class345.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 941
											class126.method2799(6); // L: 942
											return; // L: 943
										}

										var32 = Login.loginBoxX + 180 + 80; // L: 945
										if (var4 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var8 - 20 && var31 <= var8 + 20) { // L: 946
											PcmPlayer.Login_promptCredentials(true); // L: 947
										}
									}
								} else {
									while (true) {
										do {
											if (!TaskHandler.isKeyDown()) { // L: 759
												var33 = 321; // L: 764
												if (var4 == 1 && var31 >= var33 - 20 && var31 <= var33 + 20) { // L: 765
													PcmPlayer.Login_promptCredentials(true); // L: 766
												}

												return;
											}
										} while(class12.field61 != 84 && class12.field61 != 13); // L: 760

										PcmPlayer.Login_promptCredentials(true); // L: 761
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 290

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "412461879"
	)
	public static final void method2865(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 94
		ViewportMouse.ViewportMouse_y = var1; // L: 95
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 96
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 97
		ViewportMouse.ViewportMouse_false0 = false; // L: 98
	} // L: 99

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "748851559"
	)
	static int method2868() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1491
			int var0 = 0; // L: 1492

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1493
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1494
			}

			return var0 * 10000 / Client.field770; // L: 1496
		} else {
			return 10000;
		}
	}
}
