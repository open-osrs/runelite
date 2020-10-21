import java.awt.Component;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("f")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Liw;IIIZB)V",
		garbageValue = "-116"
	)
	public static void method952(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class206.musicPlayerStatus = 1; // L: 34
		class23.musicTrackArchive = var0; // L: 35
		TileItem.musicTrackGroupId = var1; // L: 36
		class206.musicTrackFileId = var2; // L: 37
		class206.musicTrackVolume = var3; // L: 38
		class195.musicTrackBoolean = var4; // L: 39
		MusicPatch.pcmSampleLength = 10000; // L: 40
	} // L: 41

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Liw;Ljava/lang/String;Ljava/lang/String;I)Lle;",
		garbageValue = "1492245151"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 154
		int var4 = var0.getFileId(var3, var2); // L: 155
		return Skeleton.method3215(var0, var3, var4); // L: 156
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "-860651108"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameShell var0) {
		int var2;
		int var3;
		int var24;
		if (Login.worldSelectOpen) { // L: 224
			while (true) {
				if (!Clock.isKeyDown()) { // L: 226
					if (MouseHandler.MouseHandler_lastButton != 1 && (MusicPatchNode.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 247
						break;
					}

					int var1 = Login.xPadding + 280; // L: 248
					if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 249
						FriendSystem.changeWorldSelectSorting(0, 0); // L: 250
						break; // L: 251
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 253
						FriendSystem.changeWorldSelectSorting(0, 1); // L: 254
						break; // L: 255
					}

					var2 = Login.xPadding + 390; // L: 257
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 258
						FriendSystem.changeWorldSelectSorting(1, 0); // L: 259
						break; // L: 260
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 262
						FriendSystem.changeWorldSelectSorting(1, 1); // L: 263
						break; // L: 264
					}

					var3 = Login.xPadding + 500; // L: 266
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 267
						FriendSystem.changeWorldSelectSorting(2, 0); // L: 268
						break; // L: 269
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 271
						FriendSystem.changeWorldSelectSorting(2, 1); // L: 272
						break; // L: 273
					}

					var24 = Login.xPadding + 610; // L: 275
					if (MouseHandler.MouseHandler_lastPressedX >= var24 && MouseHandler.MouseHandler_lastPressedX <= var24 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 276
						FriendSystem.changeWorldSelectSorting(3, 0); // L: 277
						break; // L: 278
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var24 + 15 && MouseHandler.MouseHandler_lastPressedX <= var24 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 280
						FriendSystem.changeWorldSelectSorting(3, 1); // L: 281
						break; // L: 282
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 284
						Login.worldSelectOpen = false; // L: 286
						Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 287
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 288
						SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18); // L: 289
						break; // L: 291
					}

					if (Login.hoveredWorldIndex != -1) { // L: 293
						World var5 = DefaultsGroup.World_worlds[Login.hoveredWorldIndex]; // L: 294
						AbstractByteArrayCopier.changeWorld(var5); // L: 295
						Login.worldSelectOpen = false; // L: 297
						Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 298
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 299
						SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18); // L: 300
					} else {
						if (Login.worldSelectPage > 0 && class323.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class323.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBar.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBar.canvasHeight / 2 + 50) { // L: 304
							--Login.worldSelectPage; // L: 305
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class280.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= ItemContainer.canvasWidth - class280.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= ItemContainer.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= HealthBar.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= HealthBar.canvasHeight / 2 + 50) { // L: 307
							++Login.worldSelectPage; // L: 308
						}
					}
					break;
				}

				if (SecureRandomCallable.field555 == 13) { // L: 227
					Login.worldSelectOpen = false; // L: 229
					Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 230
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 231
					SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18); // L: 232
					break; // L: 234
				}

				if (SecureRandomCallable.field555 == 96) { // L: 236
					if (Login.worldSelectPage > 0 && class323.worldSelectLeftSprite != null) { // L: 237
						--Login.worldSelectPage; // L: 238
					}
				} else if (SecureRandomCallable.field555 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class280.worldSelectRightSprite != null) { // L: 241 242
					++Login.worldSelectPage; // L: 243
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 314
				GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled = !GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled; // L: 315
				Tile.savePreferences(); // L: 316
				if (!GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled) { // L: 317
					Archive var15 = ApproximateRouteStrategy.archive6; // L: 318
					var2 = var15.getGroupId("scape main"); // L: 320
					var3 = var15.getFileId(var2, ""); // L: 321
					method952(var15, var2, var3, 255, false); // L: 322
				} else {
					class13.midiPcmStream.clear(); // L: 326
					class206.musicPlayerStatus = 1; // L: 327
					class23.musicTrackArchive = null; // L: 328
				}
			}

			if (Client.gameState != 5) { // L: 331
				if (-1L == Login.field1223) { // L: 332
					Login.field1223 = User.currentTimeMillis() + 1000L; // L: 333
				}

				long var16 = User.currentTimeMillis(); // L: 335
				if (class52.method897() && -1L == Login.field1241) { // L: 336 337
					Login.field1241 = var16; // L: 338
					if (Login.field1241 > Login.field1223) { // L: 339
						Login.field1223 = Login.field1241; // L: 340
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 344
					if (FontName.clientLanguage == Language.Language_EN) { // L: 345
						if (MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 346
							var3 = Login.xPadding + 5; // L: 347
							short var4 = 463; // L: 348
							byte var18 = 100; // L: 349
							byte var6 = 35; // L: 350
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var18 + var3 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var6 + var4) { // L: 351
								if (WallDecoration.loadWorlds()) { // L: 353
									Login.worldSelectOpen = true; // L: 354
									Login.worldSelectPage = 0; // L: 355
									Login.worldSelectPagesCount = 0; // L: 356
								}

								return; // L: 359
							}
						}

						if (class248.World_request != null && WallDecoration.loadWorlds()) { // L: 362 363
							Login.worldSelectOpen = true; // L: 364
							Login.worldSelectPage = 0; // L: 365
							Login.worldSelectPagesCount = 0; // L: 366
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton; // L: 370
					var24 = MouseHandler.MouseHandler_lastPressedX; // L: 371
					int var30 = MouseHandler.MouseHandler_lastPressedY; // L: 372
					if (var3 == 0) { // L: 373
						var24 = MouseHandler.MouseHandler_x; // L: 374
						var30 = MouseHandler.MouseHandler_y; // L: 375
					}

					if (!MusicPatchNode.mouseCam && var3 == 4) { // L: 377
						var3 = 1;
					}

					short var27;
					int var28;
					if (Login.loginIndex == 0) { // L: 378
						boolean var29 = false; // L: 379

						while (Clock.isKeyDown()) { // L: 380
							if (SecureRandomCallable.field555 == 84) { // L: 381
								var29 = true; // L: 382
							}
						}

						var28 = AttackOption.loginBoxCenter - 80; // L: 385
						var27 = 291; // L: 386
						if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) { // L: 387
							Skeleton.openURL(NPC.method2157("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 388
						}

						var28 = AttackOption.loginBoxCenter + 80; // L: 390
						if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20 || var29) { // L: 391
							if ((Client.worldProperties & 33554432) != 0) { // L: 392
								Login.Login_response0 = ""; // L: 393
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 394
								Login.Login_response2 = "Your normal account will not be affected."; // L: 395
								Login.Login_response3 = ""; // L: 396
								Login.loginIndex = 1; // L: 397
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 399
									Login.currentLoginField = 1; // L: 400
								} else {
									Login.currentLoginField = 0; // L: 403
								}
							} else if ((Client.worldProperties & 4) != 0) { // L: 407
								if ((Client.worldProperties & 1024) != 0) { // L: 408
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 409
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 410
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 411
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 414
									Login.Login_response2 = "Players can attack each other"; // L: 415
									Login.Login_response3 = "almost everywhere."; // L: 416
								}

								Login.Login_response0 = "Warning!"; // L: 418
								Login.loginIndex = 1; // L: 419
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 421
									Login.currentLoginField = 1; // L: 422
								} else {
									Login.currentLoginField = 0; // L: 425
								}
							} else if ((Client.worldProperties & 1024) != 0) { // L: 429
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 430
								Login.Login_response2 = "The Protect Item prayer will"; // L: 431
								Login.Login_response3 = "not work on this world."; // L: 432
								Login.Login_response0 = "Warning!"; // L: 433
								Login.loginIndex = 1; // L: 434
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 436
									Login.currentLoginField = 1; // L: 437
								} else {
									Login.currentLoginField = 0; // L: 440
								}
							} else {
								HealthBar.Login_promptCredentials(false); // L: 445
							}
						}
					} else {
						short var7;
						int var25;
						if (Login.loginIndex == 1) { // L: 449
							while (true) {
								if (!Clock.isKeyDown()) { // L: 450
									var25 = AttackOption.loginBoxCenter - 80; // L: 458
									var7 = 321; // L: 459
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 460
										HealthBar.Login_promptCredentials(false); // L: 461
									}

									var25 = AttackOption.loginBoxCenter + 80; // L: 463
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 464
										Login.loginIndex = 0; // L: 465
									}
									break;
								}

								if (SecureRandomCallable.field555 == 84) { // L: 451
									HealthBar.Login_promptCredentials(false); // L: 452
								} else if (SecureRandomCallable.field555 == 13) { // L: 454
									Login.loginIndex = 0; // L: 455
								}
							}
						} else {
							short var26;
							if (Login.loginIndex == 2) { // L: 468
								var26 = 201; // L: 469
								var25 = var26 + 52; // L: 470
								if (var3 == 1 && var30 >= var25 - 12 && var30 < var25 + 2) { // L: 471
									Login.currentLoginField = 0;
								}

								var25 += 15; // L: 472
								if (var3 == 1 && var30 >= var25 - 12 && var30 < var25 + 2) { // L: 473
									Login.currentLoginField = 1;
								}

								var25 += 15; // L: 474
								var26 = 361; // L: 475
								if (class89.field1163 != null) { // L: 476
									var28 = class89.field1163.highX / 2; // L: 477
									if (var3 == 1 && var24 >= class89.field1163.lowX - var28 && var24 <= var28 + class89.field1163.lowX && var30 >= var26 - 15 && var30 < var26) { // L: 478
										switch(Login.field1217) { // L: 479
										case 1:
											GrandExchangeOfferNameComparator.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 482
											Login.loginIndex = 5; // L: 483
											return; // L: 484
										case 2:
											Skeleton.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 488
										}
									}
								}

								var28 = AttackOption.loginBoxCenter - 80; // L: 494
								var27 = 321; // L: 495
								if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) { // L: 496
									Login.Login_username = Login.Login_username.trim(); // L: 497
									if (Login.Login_username.length() == 0) { // L: 498
										GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 499
										return; // L: 500
									}

									if (Login.Login_password.length() == 0) { // L: 502
										GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your password.", ""); // L: 503
										return; // L: 504
									}

									GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", ""); // L: 506
									Message.method1314(false); // L: 507
									BuddyRankComparator.updateGameState(20); // L: 508
									return; // L: 509
								}

								var28 = Login.loginBoxX + 180 + 80; // L: 511
								if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) { // L: 512
									Login.loginIndex = 0; // L: 513
									Login.Login_username = ""; // L: 514
									Login.Login_password = ""; // L: 515
									class169.field2035 = 0; // L: 516
									EnumDefinition.otp = ""; // L: 517
									Login.field1227 = true; // L: 518
								}

								var28 = AttackOption.loginBoxCenter + -117; // L: 520
								var27 = 277; // L: 521
								Login.field1230 = var24 >= var28 && var24 < var28 + class225.field2576 && var30 >= var27 && var30 < var27 + class232.field2780; // L: 522
								if (var3 == 1 && Login.field1230) { // L: 523
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 524
									if (!Client.Login_isUsernameRemembered && GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername != null) { // L: 525
										GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = null; // L: 526
										Tile.savePreferences(); // L: 527
									}
								}

								var28 = AttackOption.loginBoxCenter + 24; // L: 530
								var27 = 277; // L: 531
								Login.field1229 = var24 >= var28 && var24 < var28 + class225.field2576 && var30 >= var27 && var30 < var27 + class232.field2780; // L: 532
								if (var3 == 1 && Login.field1229) { // L: 533
									GrandExchangeOfferAgeComparator.clientPreferences.hideUsername = !GrandExchangeOfferAgeComparator.clientPreferences.hideUsername; // L: 534
									if (!GrandExchangeOfferAgeComparator.clientPreferences.hideUsername) { // L: 535
										Login.Login_username = ""; // L: 536
										GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = null; // L: 537
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 539
											Login.currentLoginField = 1; // L: 540
										} else {
											Login.currentLoginField = 0; // L: 543
										}
									}

									Tile.savePreferences(); // L: 547
								}

								while (true) {
									Transferable var10;
									int var11;
									do {
										while (true) {
											label1113:
											do {
												while (true) {
													while (Clock.isKeyDown()) { // L: 549
														if (SecureRandomCallable.field555 != 13) { // L: 550
															if (Login.currentLoginField != 0) { // L: 559
																continue label1113;
															}

															class23.method251(WorldMapManager.field335); // L: 560
															if (SecureRandomCallable.field555 == 85 && Login.Login_username.length() > 0) { // L: 561
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (SecureRandomCallable.field555 == 84 || SecureRandomCallable.field555 == 80) { // L: 562
																Login.currentLoginField = 1;
															}

															if (Skeleton.method3212(WorldMapManager.field335) && Login.Login_username.length() < 320) { // L: 563
																Login.Login_username = Login.Login_username + WorldMapManager.field335;
															}
														} else {
															Login.loginIndex = 0; // L: 551
															Login.Login_username = ""; // L: 552
															Login.Login_password = ""; // L: 553
															class169.field2035 = 0; // L: 554
															EnumDefinition.otp = ""; // L: 555
															Login.field1227 = true; // L: 556
														}
													}

													return; // L: 804
												}
											} while(Login.currentLoginField != 1); // L: 565

											if (SecureRandomCallable.field555 == 85 && Login.Login_password.length() > 0) { // L: 566
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 567
											} else if (SecureRandomCallable.field555 == 84 || SecureRandomCallable.field555 == 80) { // L: 569
												Login.currentLoginField = 0; // L: 570
												if (SecureRandomCallable.field555 == 84) { // L: 571
													Login.Login_username = Login.Login_username.trim(); // L: 572
													if (Login.Login_username.length() == 0) { // L: 573
														GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 574
														return; // L: 575
													}

													if (Login.Login_password.length() == 0) { // L: 577
														GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter your password.", ""); // L: 578
														return; // L: 579
													}

													GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", ""); // L: 581
													Message.method1314(false); // L: 582
													BuddyRankComparator.updateGameState(20); // L: 583
													return; // L: 584
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SecureRandomCallable.field555 == 67) { // L: 587
												Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 588
												var10 = var9.getContents(ByteArrayPool.client); // L: 589
												var11 = 20 - Login.Login_password.length(); // L: 590
												break;
											}

											if (Tiles.method1195(WorldMapManager.field335) && Skeleton.method3212(WorldMapManager.field335) && Login.Login_password.length() < 20) { // L: 607
												Login.Login_password = Login.Login_password + WorldMapManager.field335; // L: 608
											}
										}
									} while(var11 <= 0); // L: 591

									try {
										String var12 = (String)var10.getTransferData(DataFlavor.stringFlavor); // L: 593
										int var13 = Math.min(var11, var12.length()); // L: 594

										for (int var14 = 0; var14 < var13; ++var14) { // L: 595
											if (!Tiles.method1195(var12.charAt(var14)) || !Skeleton.method3212(var12.charAt(var14))) { // L: 596
												Login.loginIndex = 3; // L: 597
												return; // L: 598
											}
										}

										Login.Login_password = Login.Login_password + var12.substring(0, var13); // L: 601
									} catch (UnsupportedFlavorException var22) { // L: 603
									} catch (IOException var23) { // L: 604
									}
								}
							} else if (Login.loginIndex == 3) { // L: 614
								var25 = Login.loginBoxX + 180; // L: 615
								var7 = 276; // L: 616
								if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 617
									HealthBar.Login_promptCredentials(false); // L: 618
								}

								var25 = Login.loginBoxX + 180; // L: 620
								var7 = 326; // L: 621
								if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 622
									GrandExchangeOfferNameComparator.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 623
									Login.loginIndex = 5; // L: 624
									return; // L: 625
								}
							} else {
								int var19;
								if (Login.loginIndex == 4) { // L: 628
									var25 = Login.loginBoxX + 180 - 80; // L: 629
									var7 = 321; // L: 630
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 631
										EnumDefinition.otp.trim(); // L: 632
										if (EnumDefinition.otp.length() != 6) { // L: 633
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 634
											return; // L: 635
										}

										class169.field2035 = Integer.parseInt(EnumDefinition.otp); // L: 637
										EnumDefinition.otp = ""; // L: 638
										Message.method1314(true); // L: 639
										GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", ""); // L: 640
										BuddyRankComparator.updateGameState(20); // L: 641
										return; // L: 642
									}

									if (var3 == 1 && var24 >= Login.loginBoxX + 180 - 9 && var24 <= Login.loginBoxX + 180 + 130 && var30 >= 263 && var30 <= 296) { // L: 644
										Login.field1227 = !Login.field1227; // L: 645
									}

									if (var3 == 1 && var24 >= Login.loginBoxX + 180 - 34 && var24 <= Login.loginBoxX + 34 + 180 && var30 >= 351 && var30 <= 363) { // L: 647
										Skeleton.openURL(NPC.method2157("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 648
									}

									var25 = Login.loginBoxX + 180 + 80; // L: 650
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 651
										Login.loginIndex = 0; // L: 652
										Login.Login_username = ""; // L: 653
										Login.Login_password = ""; // L: 654
										class169.field2035 = 0; // L: 655
										EnumDefinition.otp = ""; // L: 656
									}

									while (Clock.isKeyDown()) { // L: 658
										boolean var8 = false; // L: 659

										for (var19 = 0; var19 < "1234567890".length(); ++var19) { // L: 660
											if (WorldMapManager.field335 == "1234567890".charAt(var19)) { // L: 661
												var8 = true; // L: 662
												break; // L: 663
											}
										}

										if (SecureRandomCallable.field555 == 13) {
											Login.loginIndex = 0; // L: 667
											Login.Login_username = ""; // L: 668
											Login.Login_password = ""; // L: 669
											class169.field2035 = 0; // L: 670
											EnumDefinition.otp = ""; // L: 671
										} else {
											if (SecureRandomCallable.field555 == 85 && EnumDefinition.otp.length() > 0) { // L: 674
												EnumDefinition.otp = EnumDefinition.otp.substring(0, EnumDefinition.otp.length() - 1);
											}

											if (SecureRandomCallable.field555 == 84) { // L: 675
												EnumDefinition.otp.trim(); // L: 676
												if (EnumDefinition.otp.length() != 6) { // L: 677
													GrandExchangeOfferNameComparator.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 678
													return; // L: 679
												}

												class169.field2035 = Integer.parseInt(EnumDefinition.otp); // L: 681
												EnumDefinition.otp = ""; // L: 682
												Message.method1314(true); // L: 683
												GrandExchangeOfferNameComparator.setLoginResponseString("", "Connecting to server...", ""); // L: 684
												BuddyRankComparator.updateGameState(20); // L: 685
												return; // L: 686
											}

											if (var8 && EnumDefinition.otp.length() < 6) { // L: 688
												EnumDefinition.otp = EnumDefinition.otp + WorldMapManager.field335;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 692
									var25 = Login.loginBoxX + 180 - 80; // L: 693
									var7 = 321; // L: 694
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 695
										class2.method38(); // L: 696
										return; // L: 697
									}

									var25 = Login.loginBoxX + 180 + 80; // L: 699
									if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 700
										HealthBar.Login_promptCredentials(true); // L: 701
									}

									var27 = 361; // L: 703
									if (ClientPreferences.field1089 != null) { // L: 704
										var19 = ClientPreferences.field1089.highX / 2; // L: 705
										if (var3 == 1 && var24 >= ClientPreferences.field1089.lowX - var19 && var24 <= var19 + ClientPreferences.field1089.lowX && var30 >= var27 - 15 && var30 < var27) { // L: 706
											Skeleton.openURL(NPC.method2157("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 707
										}
									}

									while (Clock.isKeyDown()) { // L: 710
										boolean var31 = false; // L: 711

										for (int var20 = 0; var20 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var20) { // L: 712
											if (WorldMapManager.field335 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var20)) { // L: 713
												var31 = true; // L: 714
												break; // L: 715
											}
										}

										if (SecureRandomCallable.field555 == 13) { // L: 718
											HealthBar.Login_promptCredentials(true); // L: 719
										} else {
											if (SecureRandomCallable.field555 == 85 && Login.Login_username.length() > 0) { // L: 722
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (SecureRandomCallable.field555 == 84) { // L: 723
												class2.method38(); // L: 724
												return; // L: 725
											}

											if (var31 && Login.Login_username.length() < 320) { // L: 727
												Login.Login_username = Login.Login_username + WorldMapManager.field335;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 731
									if (Login.loginIndex == 7) { // L: 742
										var25 = Login.loginBoxX + 180 - 80; // L: 743
										var7 = 321; // L: 744
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 745
											Skeleton.openURL(NPC.method2157("secure", true) + "m=dob/set_dob.ws", true, false); // L: 746
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 747
											Login.loginIndex = 6; // L: 748
											return; // L: 749
										}

										var25 = Login.loginBoxX + 180 + 80; // L: 751
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 752
											HealthBar.Login_promptCredentials(true); // L: 753
										}
									} else if (Login.loginIndex == 8) { // L: 756
										var25 = Login.loginBoxX + 180 - 80; // L: 757
										var7 = 321; // L: 758
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 759
											Skeleton.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 760
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 761
											Login.loginIndex = 6; // L: 762
											return; // L: 763
										}

										var25 = Login.loginBoxX + 180 + 80; // L: 765
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 766
											HealthBar.Login_promptCredentials(true); // L: 767
										}
									} else if (Login.loginIndex == 12) { // L: 770
										String var21 = ""; // L: 771
										switch(Login.field1216) { // L: 772
										case 0:
											var21 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 780
											break;
										case 1:
											var21 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 777
											break; // L: 778
										default:
											HealthBar.Login_promptCredentials(false); // L: 774
										}

										var28 = Login.loginBoxX + 180; // L: 783
										var27 = 276; // L: 784
										if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) { // L: 785
											Skeleton.openURL(var21, true, false); // L: 786
											GrandExchangeOfferNameComparator.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 787
											Login.loginIndex = 6; // L: 788
											return; // L: 789
										}

										var28 = Login.loginBoxX + 180; // L: 791
										var27 = 326; // L: 792
										if (var3 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var30 >= var27 - 20 && var30 <= var27 + 20) { // L: 793
											HealthBar.Login_promptCredentials(false); // L: 794
										}
									} else if (Login.loginIndex == 24) { // L: 797
										var25 = Login.loginBoxX + 180; // L: 798
										var7 = 301; // L: 799
										if (var3 == 1 && var24 >= var25 - 75 && var24 <= var25 + 75 && var30 >= var7 - 20 && var30 <= var7 + 20) { // L: 800
											HealthBar.Login_promptCredentials(false); // L: 801
										}
									}
								} else {
									while (true) {
										do {
											if (!Clock.isKeyDown()) { // L: 732
												var26 = 321; // L: 737
												if (var3 == 1 && var30 >= var26 - 20 && var30 <= var26 + 20) { // L: 738
													HealthBar.Login_promptCredentials(true); // L: 739
												}

												return;
											}
										} while(SecureRandomCallable.field555 != 84 && SecureRandomCallable.field555 != 13); // L: 733

										HealthBar.Login_promptCredentials(true); // L: 734
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 312

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1888033666"
	)
	static final void method949(String var0) {
		PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher); // L: 141
		var1.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0)); // L: 142
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 143
		Client.packetWriter.addNode(var1); // L: 144
	} // L: 145

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)Lmi;",
		garbageValue = "676167972"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return KeyHandler.worldMap; // L: 666
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-123520476"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = ModeWhere.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5717
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 5718
			var7 = ModeWhere.scene.getObjectFlags(var0, var1, var2, var5); // L: 5719
			var8 = var7 >> 6 & 3; // L: 5720
			var9 = var7 & 31; // L: 5721
			var10 = var3; // L: 5722
			if (DevicePcmPlayerProvider.method941(var5)) { // L: 5723
				var10 = var4;
			}

			int[] var11 = InterfaceParent.sceneMinimapSprite.pixels; // L: 5724
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5725
			var13 = ObjectSound.Entity_unpackID(var5); // L: 5726
			ObjectDefinition var14 = ScriptEvent.getObjectDefinition(var13); // L: 5727
			if (var14.mapSceneId != -1) { // L: 5728
				IndexedSprite var15 = AbstractWorldMapIcon.mapSceneSprites[var14.mapSceneId]; // L: 5729
				if (var15 != null) { // L: 5730
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5731
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5732
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 5733
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5737
					if (var8 == 0) { // L: 5738
						var11[var12] = var10; // L: 5739
						var11[var12 + 512] = var10; // L: 5740
						var11[var12 + 1024] = var10; // L: 5741
						var11[var12 + 1536] = var10; // L: 5742
					} else if (var8 == 1) { // L: 5744
						var11[var12] = var10; // L: 5745
						var11[var12 + 1] = var10; // L: 5746
						var11[var12 + 2] = var10; // L: 5747
						var11[var12 + 3] = var10; // L: 5748
					} else if (var8 == 2) { // L: 5750
						var11[var12 + 3] = var10; // L: 5751
						var11[var12 + 512 + 3] = var10; // L: 5752
						var11[var12 + 1024 + 3] = var10; // L: 5753
						var11[var12 + 1536 + 3] = var10; // L: 5754
					} else if (var8 == 3) { // L: 5756
						var11[var12 + 1536] = var10; // L: 5757
						var11[var12 + 1536 + 1] = var10; // L: 5758
						var11[var12 + 1536 + 2] = var10; // L: 5759
						var11[var12 + 1536 + 3] = var10; // L: 5760
					}
				}

				if (var9 == 3) { // L: 5763
					if (var8 == 0) { // L: 5764
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5765
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5766
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5767
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5769
					if (var8 == 3) { // L: 5770
						var11[var12] = var10; // L: 5771
						var11[var12 + 512] = var10; // L: 5772
						var11[var12 + 1024] = var10; // L: 5773
						var11[var12 + 1536] = var10; // L: 5774
					} else if (var8 == 0) { // L: 5776
						var11[var12] = var10; // L: 5777
						var11[var12 + 1] = var10; // L: 5778
						var11[var12 + 2] = var10; // L: 5779
						var11[var12 + 3] = var10; // L: 5780
					} else if (var8 == 1) { // L: 5782
						var11[var12 + 3] = var10; // L: 5783
						var11[var12 + 512 + 3] = var10; // L: 5784
						var11[var12 + 1024 + 3] = var10; // L: 5785
						var11[var12 + 1536 + 3] = var10; // L: 5786
					} else if (var8 == 2) { // L: 5788
						var11[var12 + 1536] = var10; // L: 5789
						var11[var12 + 1536 + 1] = var10; // L: 5790
						var11[var12 + 1536 + 2] = var10; // L: 5791
						var11[var12 + 1536 + 3] = var10; // L: 5792
					}
				}
			}
		}

		var5 = ModeWhere.scene.getGameObjectTag(var0, var1, var2); // L: 5797
		if (var5 != 0L) { // L: 5798
			var7 = ModeWhere.scene.getObjectFlags(var0, var1, var2, var5); // L: 5799
			var8 = var7 >> 6 & 3; // L: 5800
			var9 = var7 & 31; // L: 5801
			var10 = ObjectSound.Entity_unpackID(var5); // L: 5802
			ObjectDefinition var24 = ScriptEvent.getObjectDefinition(var10); // L: 5803
			int var19;
			if (var24.mapSceneId != -1) { // L: 5804
				IndexedSprite var20 = AbstractWorldMapIcon.mapSceneSprites[var24.mapSceneId]; // L: 5805
				if (var20 != null) { // L: 5806
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5807
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5808
					var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 5809
				}
			} else if (var9 == 9) { // L: 5812
				var12 = 15658734; // L: 5813
				if (DevicePcmPlayerProvider.method941(var5)) { // L: 5814
					var12 = 15597568;
				}

				int[] var18 = InterfaceParent.sceneMinimapSprite.pixels; // L: 5815
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5816
				if (var8 != 0 && var8 != 2) { // L: 5817
					var18[var19] = var12; // L: 5824
					var18[var19 + 1 + 512] = var12; // L: 5825
					var18[var19 + 1024 + 2] = var12; // L: 5826
					var18[var19 + 1536 + 3] = var12; // L: 5827
				} else {
					var18[var19 + 1536] = var12; // L: 5818
					var18[var19 + 1 + 1024] = var12; // L: 5819
					var18[var19 + 512 + 2] = var12; // L: 5820
					var18[var19 + 3] = var12; // L: 5821
				}
			}
		}

		var5 = ModeWhere.scene.getFloorDecorationTag(var0, var1, var2); // L: 5831
		if (var5 != 0L) { // L: 5832
			var7 = ObjectSound.Entity_unpackID(var5); // L: 5833
			ObjectDefinition var21 = ScriptEvent.getObjectDefinition(var7); // L: 5834
			if (var21.mapSceneId != -1) { // L: 5835
				IndexedSprite var22 = AbstractWorldMapIcon.mapSceneSprites[var21.mapSceneId]; // L: 5836
				if (var22 != null) { // L: 5837
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 5838
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 5839
					var22.drawAt(var1 * 4 + var10 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 5840
				}
			}
		}

	} // L: 5844
}
