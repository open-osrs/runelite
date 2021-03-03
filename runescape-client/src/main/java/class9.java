import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("l")
public class class9 {
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		longValue = 3250818225276468935L
	)
	static long field57;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("n")
	ExecutorService field56;
	@ObfuscatedName("v")
	Future field53;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	final Buffer field58;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class12 field55;

	@ObfuscatedSignature(
		descriptor = "(Lkx;La;)V"
	)
	public class9(Buffer var1, class12 var2) {
		this.field56 = Executors.newSingleThreadExecutor(); // L: 10
		this.field58 = var1; // L: 16
		this.field55 = var2; // L: 17
		this.method92(); // L: 18
	} // L: 19

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-807097054"
	)
	public boolean method108() {
		return this.field53.isDone(); // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1213783874"
	)
	public void method93() {
		this.field56.shutdown(); // L: 26
		this.field56 = null; // L: 27
	} // L: 28

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Lkx;",
		garbageValue = "808914251"
	)
	public Buffer method94() {
		try {
			return (Buffer)this.field53.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2058592191"
	)
	void method92() {
		this.field53 = this.field56.submit(new class8(this, this.field58, this.field55)); // L: 40
	} // L: 41

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V",
		garbageValue = "-1405869501"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) { // L: 254
			WorldMapID.method646(var0); // L: 255
		} else {
			int var3;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 258
				WorldMapSectionType.clientPreferences.titleMusicDisabled = !WorldMapSectionType.clientPreferences.titleMusicDisabled; // L: 259
				class23.savePreferences(); // L: 260
				if (!WorldMapSectionType.clientPreferences.titleMusicDisabled) { // L: 261
					Archive var1 = UrlRequester.archive6; // L: 262
					int var2 = var1.getGroupId("scape main"); // L: 264
					var3 = var1.getFileId(var2, ""); // L: 265
					ReflectionCheck.method2450(var1, var2, var3, 255, false); // L: 266
				} else {
					ScriptEvent.method1272(); // L: 269
				}
			}

			if (Client.gameState != 5) { // L: 271
				if (-1L == Login.field1213) { // L: 272
					Login.field1213 = Tiles.currentTimeMillis() + 1000L; // L: 273
				}

				long var20 = Tiles.currentTimeMillis(); // L: 275
				if (VarpDefinition.method4552() && -1L == Login.field1226) { // L: 276 277
					Login.field1226 = var20; // L: 278
					if (Login.field1226 > Login.field1213) { // L: 279
						Login.field1213 = Login.field1226; // L: 280
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 284
					if (Language.Language_EN == NPCComposition.clientLanguage) { // L: 285
						if (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 286
							var3 = Login.xPadding + 5; // L: 287
							short var4 = 463; // L: 288
							byte var5 = 100; // L: 289
							byte var6 = 35; // L: 290
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + var5 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var6 + var4) { // L: 291
								Decimator.method2704(); // L: 292
								return; // L: 293
							}
						}

						if (UserComparator9.World_request != null) { // L: 296
							Decimator.method2704();
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton; // L: 298
					int var30 = MouseHandler.MouseHandler_lastPressedX; // L: 299
					int var31 = MouseHandler.MouseHandler_lastPressedY; // L: 300
					if (var3 == 0) { // L: 301
						var30 = MouseHandler.MouseHandler_x; // L: 302
						var31 = MouseHandler.MouseHandler_y; // L: 303
					}

					if (!class8.mouseCam && var3 == 4) { // L: 305
						var3 = 1;
					}

					short var34;
					int var35;
					if (Login.loginIndex == 0) { // L: 306
						boolean var39 = false; // L: 307

						while (Varcs.isKeyDown()) { // L: 308
							if (ModeWhere.field2417 == 84) { // L: 309
								var39 = true; // L: 310
							}
						}

						var35 = GraphicsObject.loginBoxCenter - 80; // L: 313
						var34 = 291; // L: 314
						if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 315
							WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 316
						}

						var35 = GraphicsObject.loginBoxCenter + 80; // L: 318
						if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20 || var39) { // L: 319
							if ((Client.worldProperties & 33554432) != 0) { // L: 320
								Login.Login_response0 = ""; // L: 321
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 322
								Login.Login_response2 = "Your normal account will not be affected."; // L: 323
								Login.Login_response3 = ""; // L: 324
								Login.loginIndex = 1; // L: 325
								class8.method88(); // L: 326
							} else if ((Client.worldProperties & 4) != 0) { // L: 328
								if ((Client.worldProperties & 1024) != 0) { // L: 329
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 330
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 331
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 332
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 335
									Login.Login_response2 = "Players can attack each other"; // L: 336
									Login.Login_response3 = "almost everywhere."; // L: 337
								}

								Login.Login_response0 = "Warning!"; // L: 339
								Login.loginIndex = 1; // L: 340
								class8.method88(); // L: 341
							} else if ((Client.worldProperties & 1024) != 0) { // L: 343
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 344
								Login.Login_response2 = "The Protect Item prayer will"; // L: 345
								Login.Login_response3 = "not work on this world."; // L: 346
								Login.Login_response0 = "Warning!"; // L: 347
								Login.loginIndex = 1; // L: 348
								class8.method88(); // L: 349
							} else {
								GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 352
							}
						}
					} else {
						short var7;
						int var32;
						if (Login.loginIndex == 1) { // L: 356
							while (true) {
								if (!Varcs.isKeyDown()) { // L: 357
									var32 = GraphicsObject.loginBoxCenter - 80; // L: 365
									var7 = 321; // L: 366
									if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 367
										GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 368
									}

									var32 = GraphicsObject.loginBoxCenter + 80; // L: 370
									if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 371
										Login.loginIndex = 0; // L: 372
									}
									break;
								}

								if (ModeWhere.field2417 == 84) { // L: 358
									GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 359
								} else if (ModeWhere.field2417 == 13) { // L: 361
									Login.loginIndex = 0; // L: 362
								}
							}
						} else {
							short var33;
							boolean var36;
							if (Login.loginIndex == 2) { // L: 375
								var33 = 201; // L: 376
								var32 = var33 + 52; // L: 377
								if (var3 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) { // L: 378
									Login.currentLoginField = 0;
								}

								var32 += 15; // L: 379
								if (var3 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) { // L: 380
									Login.currentLoginField = 1;
								}

								var32 += 15; // L: 381
								var33 = 361; // L: 382
								if (AttackOption.field1190 != null) { // L: 383
									var35 = AttackOption.field1190.highX / 2; // L: 384
									if (var3 == 1 && var30 >= AttackOption.field1190.lowX - var35 && var30 <= var35 + AttackOption.field1190.lowX && var31 >= var33 - 15 && var31 < var33) { // L: 385
										switch(Login.field1207) { // L: 386
										case 1:
											InvDefinition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 389
											Login.loginIndex = 5; // L: 390
											return; // L: 391
										case 2:
											WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 395
										}
									}
								}

								var35 = GraphicsObject.loginBoxCenter - 80; // L: 401
								var34 = 321; // L: 402
								if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 403
									Login.Login_username = Login.Login_username.trim(); // L: 404
									if (Login.Login_username.length() == 0) { // L: 405
										InvDefinition.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 406
										return; // L: 407
									}

									if (Login.Login_password.length() == 0) { // L: 409
										InvDefinition.setLoginResponseString("", "Please enter your password.", ""); // L: 410
										return; // L: 411
									}

									InvDefinition.setLoginResponseString("", "Connecting to server...", ""); // L: 413
									class23.method234(false); // L: 414
									ItemContainer.updateGameState(20); // L: 415
									return; // L: 416
								}

								var35 = Login.loginBoxX + 180 + 80; // L: 418
								if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 419
									Login.loginIndex = 0; // L: 420
									Login.Login_username = ""; // L: 421
									Login.Login_password = ""; // L: 422
									Canvas.field439 = 0; // L: 423
									class1.otp = ""; // L: 424
									Login.field1217 = true; // L: 425
								}

								var35 = GraphicsObject.loginBoxCenter + -117; // L: 427
								var34 = 277; // L: 428
								Login.field1222 = var30 >= var35 && var30 < var35 + WorldMapDecoration.field235 && var31 >= var34 && var31 < var34 + MouseHandler.field512; // L: 429
								if (var3 == 1 && Login.field1222) { // L: 430
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 431
									if (!Client.Login_isUsernameRemembered && WorldMapSectionType.clientPreferences.rememberedUsername != null) { // L: 432
										WorldMapSectionType.clientPreferences.rememberedUsername = null; // L: 433
										class23.savePreferences(); // L: 434
									}
								}

								var35 = GraphicsObject.loginBoxCenter + 24; // L: 437
								var34 = 277; // L: 438
								Login.field1216 = var30 >= var35 && var30 < var35 + WorldMapDecoration.field235 && var31 >= var34 && var31 < var34 + MouseHandler.field512; // L: 439
								if (var3 == 1 && Login.field1216) { // L: 440
									WorldMapSectionType.clientPreferences.hideUsername = !WorldMapSectionType.clientPreferences.hideUsername; // L: 441
									if (!WorldMapSectionType.clientPreferences.hideUsername) { // L: 442
										Login.Login_username = ""; // L: 443
										WorldMapSectionType.clientPreferences.rememberedUsername = null; // L: 444
										class8.method88(); // L: 445
									}

									class23.savePreferences(); // L: 447
								}

								label1002:
								while (true) {
									Transferable var23;
									int var38;
									do {
										while (true) {
											char var37;
											label918:
											do {
												while (true) {
													while (Varcs.isKeyDown()) { // L: 449
														if (ModeWhere.field2417 != 13) { // L: 450
															if (Login.currentLoginField != 0) { // L: 459
																continue label918;
															}

															WorldMapSection1.method657(WorldMapID.field299); // L: 460
															if (ModeWhere.field2417 == 85 && Login.Login_username.length() > 0) { // L: 461
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (ModeWhere.field2417 == 84 || ModeWhere.field2417 == 80) { // L: 462
																Login.currentLoginField = 1;
															}

															var37 = WorldMapID.field299; // L: 464
															var36 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var37) != -1; // L: 466
															if (var36 && Login.Login_username.length() < 320) { // L: 468
																Login.Login_username = Login.Login_username + WorldMapID.field299;
															}
														} else {
															Login.loginIndex = 0; // L: 451
															Login.Login_username = ""; // L: 452
															Login.Login_password = ""; // L: 453
															Canvas.field439 = 0; // L: 454
															class1.otp = ""; // L: 455
															Login.field1217 = true; // L: 456
														}
													}

													return; // L: 774
												}
											} while(Login.currentLoginField != 1); // L: 470

											if (ModeWhere.field2417 == 85 && Login.Login_password.length() > 0) { // L: 471
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 472
											} else if (ModeWhere.field2417 == 84 || ModeWhere.field2417 == 80) { // L: 474
												Login.currentLoginField = 0; // L: 475
												if (ModeWhere.field2417 == 84) { // L: 476
													Login.Login_username = Login.Login_username.trim(); // L: 477
													if (Login.Login_username.length() == 0) { // L: 478
														InvDefinition.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 479
														return; // L: 480
													}

													if (Login.Login_password.length() == 0) { // L: 482
														InvDefinition.setLoginResponseString("", "Please enter your password.", ""); // L: 483
														return; // L: 484
													}

													InvDefinition.setLoginResponseString("", "Connecting to server...", ""); // L: 486
													class23.method234(false); // L: 487
													ItemContainer.updateGameState(20); // L: 488
													return; // L: 489
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && ModeWhere.field2417 == 67) { // L: 492
												Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 493
												var23 = var22.getContents(class1.client); // L: 494
												var38 = 20 - Login.Login_password.length(); // L: 495
												break;
											}

											var37 = WorldMapID.field299; // L: 545
											if ((var37 < ' ' || var37 >= 127) && (var37 <= 127 || var37 >= 160) && (var37 <= 160 || var37 > 255)) { // L: 547
												label1113: {
													if (var37 != 0) { // L: 551
														char[] var25 = class298.cp1252AsciiExtension; // L: 553

														for (int var26 = 0; var26 < var25.length; ++var26) { // L: 554
															char var13 = var25[var26]; // L: 555
															if (var37 == var13) { // L: 557
																var36 = true; // L: 558
																break label1113; // L: 559
															}
														}
													}

													var36 = false; // L: 565
												}
											} else {
												var36 = true; // L: 548
											}

											if (var36) { // L: 567
												char var42 = WorldMapID.field299; // L: 569
												boolean var11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var42) != -1; // L: 571
												if (var11 && Login.Login_password.length() < 20) { // L: 573 574
													Login.Login_password = Login.Login_password + WorldMapID.field299; // L: 575
												}
											}
										}
									} while(var38 <= 0); // L: 496

									try {
										String var12 = (String)var23.getTransferData(DataFlavor.stringFlavor); // L: 498
										int var40 = Math.min(var38, var12.length()); // L: 499
										int var14 = 0;

										while (true) {
											if (var14 >= var40) {
												Login.Login_password = Login.Login_password + var12.substring(0, var40); // L: 537
												continue label1002;
											}

											char var16 = var12.charAt(var14); // L: 503
											boolean var15;
											if (var16 >= ' ' && var16 < 127 || var16 > 127 && var16 < 160 || var16 > 160 && var16 <= 255) { // L: 505
												var15 = true; // L: 506
											} else {
												label1126: {
													if (var16 != 0) { // L: 509
														char[] var17 = class298.cp1252AsciiExtension; // L: 511

														for (int var18 = 0; var18 < var17.length; ++var18) { // L: 512
															char var19 = var17[var18]; // L: 513
															if (var19 == var16) { // L: 515
																var15 = true; // L: 516
																break label1126; // L: 517
															}
														}
													}

													var15 = false; // L: 523
												}
											}

											if (!var15) { // L: 525
												break;
											}

											char var41 = var12.charAt(var14); // L: 527
											boolean var24 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var41) != -1; // L: 529
											if (!var24) { // L: 531
												break;
											}

											++var14; // L: 500
										}

										Login.loginIndex = 3; // L: 533
										return; // L: 534
									} catch (UnsupportedFlavorException var28) { // L: 539
									} catch (IOException var29) { // L: 540
									}
								}
							} else if (Login.loginIndex == 3) { // L: 584
								var32 = Login.loginBoxX + 180; // L: 585
								var7 = 276; // L: 586
								if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 587
									GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 588
								}

								var32 = Login.loginBoxX + 180; // L: 590
								var7 = 326; // L: 591
								if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 592
									InvDefinition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 593
									Login.loginIndex = 5; // L: 594
									return; // L: 595
								}
							} else {
								int var9;
								if (Login.loginIndex == 4) { // L: 598
									var32 = Login.loginBoxX + 180 - 80; // L: 599
									var7 = 321; // L: 600
									if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 601
										class1.otp.trim(); // L: 602
										if (class1.otp.length() != 6) { // L: 603
											InvDefinition.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 604
											return; // L: 605
										}

										Canvas.field439 = Integer.parseInt(class1.otp); // L: 607
										class1.otp = ""; // L: 608
										class23.method234(true); // L: 609
										InvDefinition.setLoginResponseString("", "Connecting to server...", ""); // L: 610
										ItemContainer.updateGameState(20); // L: 611
										return; // L: 612
									}

									if (var3 == 1 && var30 >= Login.loginBoxX + 180 - 9 && var30 <= Login.loginBoxX + 180 + 130 && var31 >= 263 && var31 <= 296) { // L: 614
										Login.field1217 = !Login.field1217; // L: 615
									}

									if (var3 == 1 && var30 >= Login.loginBoxX + 180 - 34 && var30 <= Login.loginBoxX + 34 + 180 && var31 >= 351 && var31 <= 363) { // L: 617
										WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 618
									}

									var32 = Login.loginBoxX + 180 + 80; // L: 620
									if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 621
										Login.loginIndex = 0; // L: 622
										Login.Login_username = ""; // L: 623
										Login.Login_password = ""; // L: 624
										Canvas.field439 = 0; // L: 625
										class1.otp = ""; // L: 626
									}

									while (Varcs.isKeyDown()) { // L: 628
										boolean var8 = false; // L: 629

										for (var9 = 0; var9 < "1234567890".length(); ++var9) { // L: 630
											if (WorldMapID.field299 == "1234567890".charAt(var9)) { // L: 631
												var8 = true; // L: 632
												break; // L: 633
											}
										}

										if (ModeWhere.field2417 == 13) { // L: 636
											Login.loginIndex = 0; // L: 637
											Login.Login_username = ""; // L: 638
											Login.Login_password = ""; // L: 639
											Canvas.field439 = 0; // L: 640
											class1.otp = ""; // L: 641
										} else {
											if (ModeWhere.field2417 == 85 && class1.otp.length() > 0) { // L: 644
												class1.otp = class1.otp.substring(0, class1.otp.length() - 1);
											}

											if (ModeWhere.field2417 == 84) { // L: 645
												class1.otp.trim(); // L: 646
												if (class1.otp.length() != 6) { // L: 647
													InvDefinition.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 648
													return; // L: 649
												}

												Canvas.field439 = Integer.parseInt(class1.otp); // L: 651
												class1.otp = ""; // L: 652
												class23.method234(true); // L: 653
												InvDefinition.setLoginResponseString("", "Connecting to server...", ""); // L: 654
												ItemContainer.updateGameState(20); // L: 655
												return; // L: 656
											}

											if (var8 && class1.otp.length() < 6) { // L: 658
												class1.otp = class1.otp + WorldMapID.field299;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 662
									var32 = Login.loginBoxX + 180 - 80; // L: 663
									var7 = 321; // L: 664
									if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 665
										WorldMapManager.method738(); // L: 666
										return; // L: 667
									}

									var32 = Login.loginBoxX + 180 + 80; // L: 669
									if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 670
										GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true); // L: 671
									}

									var34 = 361; // L: 673
									if (KeyHandler.field409 != null) { // L: 674
										var9 = KeyHandler.field409.highX / 2; // L: 675
										if (var3 == 1 && var30 >= KeyHandler.field409.lowX - var9 && var30 <= var9 + KeyHandler.field409.lowX && var31 >= var34 - 15 && var31 < var34) { // L: 676
											WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 677
										}
									}

									while (Varcs.isKeyDown()) { // L: 680
										var36 = false; // L: 681

										for (int var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) { // L: 682
											if (WorldMapID.field299 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) { // L: 683
												var36 = true; // L: 684
												break; // L: 685
											}
										}

										if (ModeWhere.field2417 == 13) { // L: 688
											GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true); // L: 689
										} else {
											if (ModeWhere.field2417 == 85 && Login.Login_username.length() > 0) { // L: 692
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (ModeWhere.field2417 == 84) { // L: 693
												WorldMapManager.method738(); // L: 694
												return; // L: 695
											}

											if (var36 && Login.Login_username.length() < 320) { // L: 697
												Login.Login_username = Login.Login_username + WorldMapID.field299;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 701
									if (Login.loginIndex == 7) { // L: 712
										var32 = Login.loginBoxX + 180 - 80; // L: 713
										var7 = 321; // L: 714
										if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 715
											WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=dob/set_dob.ws", true, false); // L: 716
											InvDefinition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 717
											Login.loginIndex = 6; // L: 718
											return; // L: 719
										}

										var32 = Login.loginBoxX + 180 + 80; // L: 721
										if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 722
											GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true); // L: 723
										}
									} else if (Login.loginIndex == 8) { // L: 726
										var32 = Login.loginBoxX + 180 - 80; // L: 727
										var7 = 321; // L: 728
										if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 729
											WorldMapRectangle.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 730
											InvDefinition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 731
											Login.loginIndex = 6; // L: 732
											return; // L: 733
										}

										var32 = Login.loginBoxX + 180 + 80; // L: 735
										if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 736
											GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true); // L: 737
										}
									} else if (Login.loginIndex == 12) { // L: 740
										String var27 = ""; // L: 741
										switch(Login.field1206) { // L: 742
										case 0:
											var27 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 747
											break; // L: 748
										case 1:
											var27 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 750
											break;
										default:
											GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 744
										}

										var35 = Login.loginBoxX + 180; // L: 753
										var34 = 276; // L: 754
										if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 755
											WorldMapRectangle.openURL(var27, true, false); // L: 756
											InvDefinition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 757
											Login.loginIndex = 6; // L: 758
											return; // L: 759
										}

										var35 = Login.loginBoxX + 180; // L: 761
										var34 = 326; // L: 762
										if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) { // L: 763
											GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 764
										}
									} else if (Login.loginIndex == 24) { // L: 767
										var32 = Login.loginBoxX + 180; // L: 768
										var7 = 301; // L: 769
										if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) { // L: 770
											GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 771
										}
									}
								} else {
									while (true) {
										do {
											if (!Varcs.isKeyDown()) { // L: 702
												var33 = 321; // L: 707
												if (var3 == 1 && var31 >= var33 - 20 && var31 <= var33 + 20) { // L: 708
													GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true); // L: 709
												}

												return;
											}
										} while(ModeWhere.field2417 != 84 && ModeWhere.field2417 != 13); // L: 703

										GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true); // L: 704
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 256

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-1465568490"
	)
	static int method98(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1042
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1043
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1044
			return 1; // L: 1045
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1047
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1048
			return 1; // L: 1049
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1051
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1052
			return 1; // L: 1053
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1055
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1056
			return 1; // L: 1057
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1059
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1060
			return 1; // L: 1061
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1063
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1064
			return 1; // L: 1065
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1067
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1068
			return 1; // L: 1069
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1071
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1072
			return 1; // L: 1073
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1075
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1076
			return 1; // L: 1077
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) { // L: 1079
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1080
			return 1; // L: 1081
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) { // L: 1083
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1084
			return 1; // L: 1085
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1087
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1088
			return 1; // L: 1089
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1091
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1092
			return 1; // L: 1093
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) { // L: 1095
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1096
			return 1; // L: 1097
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1099
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1100
			return 1; // L: 1101
		} else {
			return 2; // L: 1103
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lhz;I)Ljava/lang/String;",
		garbageValue = "16711935"
	)
	static String method95(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9891
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9892
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 9894
					if (var3 == -1) { // L: 9895
						break;
					}

					var0 = var0.substring(0, var3) + GrandExchangeOffer.method187(HealthBar.method2168(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 9896
				}
			}
		}

		return var0; // L: 9900
	}
}
