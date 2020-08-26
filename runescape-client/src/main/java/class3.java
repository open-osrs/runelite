import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class3 implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	static final class3 field23;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	static final class3 field13;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	static final class3 field24;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1676805267
	)
	static int field25;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static Widget field12;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1942324961
	)
	final int field15;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -83927061
	)
	public final int field16;
	@ObfuscatedName("o")
	public final Class field17;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	final class0 field18;

	static {
		field23 = new class3(0, 0, Integer.class, new class1()); // L: 10
		field13 = new class3(1, 1, Long.class, new class2()); // L: 23
		field24 = new class3(2, 2, String.class, new class4()); // L: 36
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lz;)V"
	)
	class3(int var1, int var2, Class var3, class0 var4) {
		this.field15 = var1; // L: 59
		this.field16 = var2; // L: 60
		this.field17 = var3; // L: 61
		this.field18 = var4; // L: 62
	} // L: 63

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16; // L: 94
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)Ljava/lang/Object;",
		garbageValue = "101023804"
	)
	public Object method46(Buffer var1) {
		return this.field18.vmethod61(var1); // L: 98
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lt;",
		garbageValue = "-127122137"
	)
	public static class3[] method47() {
		return new class3[]{field23, field13, field24}; // L: 55
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkf;B)V",
		garbageValue = "69"
	)
	public static void method43(Object var0, Buffer var1) {
		Class var3 = var0.getClass(); // L: 67
		class3[] var5 = method47(); // L: 72
		int var6 = 0;

		class3 var4;
		while (true) {
			if (var6 >= var5.length) {
				var4 = null; // L: 83
				break;
			}

			class3 var7 = var5[var6]; // L: 74
			if (var3 == var7.field17) { // L: 76
				var4 = var7; // L: 77
				break;
			}

			++var6; // L: 73
		}

		if (var4 == null) {
			throw new IllegalArgumentException(); // L: 86
		} else {
			class0 var2 = var4.field18; // L: 87
			var2.vmethod70(var0, var1); // L: 90
		}
	} // L: 91

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lbw;I)V",
		garbageValue = "823083332"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameShell var0) {
		if (Login.worldSelectOpen) { // L: 264
			GameBuild.method4217(var0); // L: 265
		} else {
			int var3;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 268
				Tile.clientPreferences.titleMusicDisabled = !Tile.clientPreferences.titleMusicDisabled; // L: 269
				WorldMapData_1.savePreferences(); // L: 270
				if (!Tile.clientPreferences.titleMusicDisabled) { // L: 271
					Archive var1 = CollisionMap.archive6; // L: 272
					int var2 = var1.getGroupId("scape main"); // L: 274
					var3 = var1.getFileId(var2, ""); // L: 275
					Script.method2322(var1, var2, var3, 255, false); // L: 276
				} else {
					class206.midiPcmStream.clear(); // L: 280
					class206.musicPlayerStatus = 1; // L: 281
					class204.musicTrackArchive = null; // L: 282
				}
			}

			if (Client.gameState != 5) { // L: 285
				if (-1L == Login.field1232) { // L: 286
					Login.field1232 = PacketWriter.currentTimeMillis() + 1000L; // L: 287
				}

				long var30 = PacketWriter.currentTimeMillis(); // L: 289
				if (GrandExchangeOffer.method207() && -1L == Login.field1233) { // L: 290 291
					Login.field1233 = var30; // L: 292
					if (Login.field1233 > Login.field1232) { // L: 293
						Login.field1232 = Login.field1233; // L: 294
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 298
					if (Language.Language_EN == class58.clientLanguage) { // L: 299
						if (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 300
							var3 = Login.xPadding + 5; // L: 301
							short var4 = 463; // L: 302
							byte var5 = 100; // L: 303
							byte var6 = 35; // L: 304
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + var5 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var4 + var6) { // L: 305
								if (ScriptFrame.loadWorlds()) { // L: 307
									Login.worldSelectOpen = true; // L: 308
									Login.worldSelectPage = 0; // L: 309
									Login.worldSelectPagesCount = 0; // L: 310
								}

								return; // L: 313
							}
						}

						if (WorldMapScaleHandler.World_request != null && ScriptFrame.loadWorlds()) { // L: 316 317
							Login.worldSelectOpen = true; // L: 318
							Login.worldSelectPage = 0; // L: 319
							Login.worldSelectPagesCount = 0; // L: 320
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton; // L: 324
					int var54 = MouseHandler.MouseHandler_lastPressedX; // L: 325
					int var55 = MouseHandler.MouseHandler_lastPressedY; // L: 326
					if (var3 == 0) { // L: 327
						var54 = MouseHandler.MouseHandler_x; // L: 328
						var55 = MouseHandler.MouseHandler_y; // L: 329
					}

					if (!ScriptEvent.mouseCam && var3 == 4) { // L: 331
						var3 = 1;
					}

					short var58;
					int var59;
					if (Login.loginIndex == 0) { // L: 332
						boolean var65 = false; // L: 333

						while (class60.isKeyDown()) { // L: 334
							if (PlayerAppearance.field2581 == 84) { // L: 335
								var65 = true; // L: 336
							}
						}

						var59 = IsaacCipher.loginBoxCenter - 80; // L: 339
						var58 = 291; // L: 340
						if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) { // L: 341
							class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 342
						}

						var59 = IsaacCipher.loginBoxCenter + 80; // L: 344
						if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20 || var65) { // L: 345
							if ((Client.worldProperties & 33554432) != 0) { // L: 346
								Login.Login_response0 = ""; // L: 347
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 348
								Login.Login_response2 = "Your normal account will not be affected."; // L: 349
								Login.Login_response3 = ""; // L: 350
								Login.loginIndex = 1; // L: 351
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
								Login.loginIndex = 1; // L: 373
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
								Login.loginIndex = 1; // L: 388
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 390
									Login.currentLoginField = 1; // L: 391
								} else {
									Login.currentLoginField = 0; // L: 394
								}
							} else {
								class41.Login_promptCredentials(false); // L: 399
							}
						}
					} else {
						short var7;
						int var56;
						if (Login.loginIndex == 1) { // L: 403
							while (true) {
								if (!class60.isKeyDown()) { // L: 404
									var56 = IsaacCipher.loginBoxCenter - 80; // L: 412
									var7 = 321; // L: 413
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 414
										class41.Login_promptCredentials(false); // L: 415
									}

									var56 = IsaacCipher.loginBoxCenter + 80; // L: 417
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 418
										Login.loginIndex = 0; // L: 419
									}
									break;
								}

								if (PlayerAppearance.field2581 == 84) { // L: 405
									class41.Login_promptCredentials(false); // L: 406
								} else if (PlayerAppearance.field2581 == 13) { // L: 408
									Login.loginIndex = 0; // L: 409
								}
							}
						} else {
							int var10;
							String var12;
							short var57;
							boolean var61;
							if (Login.loginIndex == 2) { // L: 422
								var57 = 201; // L: 423
								var56 = var57 + 52; // L: 424
								if (var3 == 1 && var55 >= var56 - 12 && var55 < var56 + 2) { // L: 425
									Login.currentLoginField = 0;
								}

								var56 += 15; // L: 426
								if (var3 == 1 && var55 >= var56 - 12 && var55 < var56 + 2) { // L: 427
									Login.currentLoginField = 1;
								}

								var56 += 15; // L: 428
								var57 = 361; // L: 429
								if (GrandExchangeOfferNameComparator.field112 != null) { // L: 430
									var59 = GrandExchangeOfferNameComparator.field112.highX / 2; // L: 431
									if (var3 == 1 && var54 >= GrandExchangeOfferNameComparator.field112.lowX - var59 && var54 <= var59 + GrandExchangeOfferNameComparator.field112.lowX && var55 >= var57 - 15 && var55 < var57) { // L: 432
										switch(Login.field1213) { // L: 433
										case 1:
											UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 436
											Login.loginIndex = 5; // L: 437
											return; // L: 438
										case 2:
											class280.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 442
										}
									}
								}

								var59 = IsaacCipher.loginBoxCenter - 80; // L: 448
								var58 = 321; // L: 449
								if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) { // L: 450
									Login.Login_username = Login.Login_username.trim(); // L: 451
									if (Login.Login_username.length() == 0) { // L: 452
										UrlRequester.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 453
										return; // L: 454
									}

									if (Login.Login_password.length() == 0) { // L: 456
										UrlRequester.setLoginResponseString("", "Please enter your password.", ""); // L: 457
										return; // L: 458
									}

									UrlRequester.setLoginResponseString("", "Connecting to server...", ""); // L: 460
									class22.method245(false); // L: 461
									CollisionMap.updateGameState(20); // L: 462
									return; // L: 463
								}

								var59 = Login.loginBoxX + 180 + 80; // L: 465
								if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) { // L: 466
									Login.loginIndex = 0; // L: 467
									Login.Login_username = ""; // L: 468
									Login.Login_password = ""; // L: 469
									LoginScreenAnimation.field1070 = 0; // L: 470
									WorldMapLabelSize.otp = ""; // L: 471
									Login.field1223 = true; // L: 472
								}

								var59 = IsaacCipher.loginBoxCenter + -117; // L: 474
								var58 = 277; // L: 475
								Login.field1224 = var54 >= var59 && var54 < var59 + GrandExchangeOfferNameComparator.field114 && var55 >= var58 && var55 < var58 + ReflectionCheck.field1364; // L: 476
								if (var3 == 1 && Login.field1224) { // L: 477
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 478
									if (!Client.Login_isUsernameRemembered && Tile.clientPreferences.rememberedUsername != null) { // L: 479
										Tile.clientPreferences.rememberedUsername = null; // L: 480
										WorldMapData_1.savePreferences(); // L: 481
									}
								}

								var59 = IsaacCipher.loginBoxCenter + 24; // L: 484
								var58 = 277; // L: 485
								Login.field1201 = var54 >= var59 && var54 < var59 + GrandExchangeOfferNameComparator.field114 && var55 >= var58 && var55 < var58 + ReflectionCheck.field1364; // L: 486
								if (var3 == 1 && Login.field1201) { // L: 487
									Tile.clientPreferences.hideUsername = !Tile.clientPreferences.hideUsername; // L: 488
									if (!Tile.clientPreferences.hideUsername) { // L: 489
										Login.Login_username = ""; // L: 490
										Tile.clientPreferences.rememberedUsername = null; // L: 491
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 493
											Login.currentLoginField = 1; // L: 494
										} else {
											Login.currentLoginField = 0; // L: 497
										}
									}

									WorldMapData_1.savePreferences(); // L: 501
								}

								label1256:
								while (true) {
									Transferable var33;
									int var68;
									do {
										while (true) {
											label1220:
											do {
												while (true) {
													while (class60.isKeyDown()) { // L: 503
														if (PlayerAppearance.field2581 != 13) { // L: 504
															if (Login.currentLoginField != 0) { // L: 513
																continue label1220;
															}

															char var63 = PacketWriter.field1350; // L: 514

															for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var63 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10); ++var10) { // L: 516 517
															}

															if (PlayerAppearance.field2581 == 85 && Login.Login_username.length() > 0) { // L: 520
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (PlayerAppearance.field2581 == 84 || PlayerAppearance.field2581 == 80) { // L: 521
																Login.currentLoginField = 1;
															}

															char var67 = PacketWriter.field1350; // L: 523
															boolean var64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var67) != -1; // L: 525
															if (var64 && Login.Login_username.length() < 320) { // L: 527
																Login.Login_username = Login.Login_username + PacketWriter.field1350;
															}
														} else {
															Login.loginIndex = 0; // L: 505
															Login.Login_username = ""; // L: 506
															Login.Login_password = ""; // L: 507
															LoginScreenAnimation.field1070 = 0; // L: 508
															WorldMapLabelSize.otp = ""; // L: 509
															Login.field1223 = true; // L: 510
														}
													}

													return; // L: 1085
												}
											} while(Login.currentLoginField != 1); // L: 529

											if (PlayerAppearance.field2581 == 85 && Login.Login_password.length() > 0) { // L: 530
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 531
											} else if (PlayerAppearance.field2581 == 84 || PlayerAppearance.field2581 == 80) { // L: 533
												Login.currentLoginField = 0; // L: 534
												if (PlayerAppearance.field2581 == 84) { // L: 535
													Login.Login_username = Login.Login_username.trim(); // L: 536
													if (Login.Login_username.length() == 0) { // L: 537
														UrlRequester.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 538
														return; // L: 539
													}

													if (Login.Login_password.length() == 0) { // L: 541
														UrlRequester.setLoginResponseString("", "Please enter your password.", ""); // L: 542
														return; // L: 543
													}

													UrlRequester.setLoginResponseString("", "Connecting to server...", ""); // L: 545
													class22.method245(false); // L: 546
													CollisionMap.updateGameState(20); // L: 547
													return; // L: 548
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && PlayerAppearance.field2581 == 67) { // L: 551
												Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 552
												var33 = var32.getContents(class2.client); // L: 553
												var68 = 20 - Login.Login_password.length(); // L: 554
												break;
											}

											if (Tiles.method1187(PacketWriter.field1350)) { // L: 579
												char var66 = PacketWriter.field1350; // L: 581
												var61 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var66) != -1; // L: 583
												if (var61 && Login.Login_password.length() < 20) { // L: 585 586
													Login.Login_password = Login.Login_password + PacketWriter.field1350; // L: 587
												}
											}
										}
									} while(var68 <= 0); // L: 555

									try {
										var12 = (String)var33.getTransferData(DataFlavor.stringFlavor); // L: 557
										int var69 = Math.min(var68, var12.length()); // L: 558
										int var14 = 0;

										while (true) {
											if (var14 >= var69) {
												Login.Login_password = Login.Login_password + var12.substring(0, var69); // L: 573
												continue label1256;
											}

											if (!Tiles.method1187(var12.charAt(var14))) { // L: 561
												break;
											}

											char var16 = var12.charAt(var14); // L: 563
											boolean var15 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var16) != -1; // L: 565
											if (!var15) { // L: 567
												break;
											}

											++var14; // L: 559
										}

										Login.loginIndex = 3; // L: 569
										return; // L: 570
									} catch (UnsupportedFlavorException var52) { // L: 575
									} catch (IOException var53) { // L: 576
									}
								}
							} else if (Login.loginIndex == 3) { // L: 595
								var56 = Login.loginBoxX + 180; // L: 596
								var7 = 276; // L: 597
								if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 598
									class41.Login_promptCredentials(false); // L: 599
								}

								var56 = Login.loginBoxX + 180; // L: 601
								var7 = 326; // L: 602
								if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 603
									UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 604
									Login.loginIndex = 5; // L: 605
									return; // L: 606
								}
							} else {
								int var9;
								if (Login.loginIndex == 4) { // L: 609
									var56 = Login.loginBoxX + 180 - 80; // L: 610
									var7 = 321; // L: 611
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 612
										WorldMapLabelSize.otp.trim(); // L: 613
										if (WorldMapLabelSize.otp.length() != 6) { // L: 614
											UrlRequester.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 615
											return; // L: 616
										}

										LoginScreenAnimation.field1070 = Integer.parseInt(WorldMapLabelSize.otp); // L: 618
										WorldMapLabelSize.otp = ""; // L: 619
										class22.method245(true); // L: 620
										UrlRequester.setLoginResponseString("", "Connecting to server...", ""); // L: 621
										CollisionMap.updateGameState(20); // L: 622
										return; // L: 623
									}

									if (var3 == 1 && var54 >= Login.loginBoxX + 180 - 9 && var54 <= Login.loginBoxX + 180 + 130 && var55 >= 263 && var55 <= 296) { // L: 625
										Login.field1223 = !Login.field1223; // L: 626
									}

									if (var3 == 1 && var54 >= Login.loginBoxX + 180 - 34 && var54 <= Login.loginBoxX + 34 + 180 && var55 >= 351 && var55 <= 363) { // L: 628
										class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 629
									}

									var56 = Login.loginBoxX + 180 + 80; // L: 631
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 632
										Login.loginIndex = 0; // L: 633
										Login.Login_username = ""; // L: 634
										Login.Login_password = ""; // L: 635
										LoginScreenAnimation.field1070 = 0; // L: 636
										WorldMapLabelSize.otp = ""; // L: 637
									}

									while (class60.isKeyDown()) { // L: 639
										boolean var8 = false; // L: 640

										for (var9 = 0; var9 < "1234567890".length(); ++var9) { // L: 641
											if (PacketWriter.field1350 == "1234567890".charAt(var9)) { // L: 642
												var8 = true; // L: 643
												break; // L: 644
											}
										}

										if (PlayerAppearance.field2581 == 13) { // L: 647
											Login.loginIndex = 0; // L: 648
											Login.Login_username = ""; // L: 649
											Login.Login_password = ""; // L: 650
											LoginScreenAnimation.field1070 = 0; // L: 651
											WorldMapLabelSize.otp = ""; // L: 652
										} else {
											if (PlayerAppearance.field2581 == 85 && WorldMapLabelSize.otp.length() > 0) { // L: 655
												WorldMapLabelSize.otp = WorldMapLabelSize.otp.substring(0, WorldMapLabelSize.otp.length() - 1);
											}

											if (PlayerAppearance.field2581 == 84) { // L: 656
												WorldMapLabelSize.otp.trim(); // L: 657
												if (WorldMapLabelSize.otp.length() != 6) { // L: 658
													UrlRequester.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 659
													return; // L: 660
												}

												LoginScreenAnimation.field1070 = Integer.parseInt(WorldMapLabelSize.otp); // L: 662
												WorldMapLabelSize.otp = ""; // L: 663
												class22.method245(true); // L: 664
												UrlRequester.setLoginResponseString("", "Connecting to server...", ""); // L: 665
												CollisionMap.updateGameState(20); // L: 666
												return; // L: 667
											}

											if (var8 && WorldMapLabelSize.otp.length() < 6) { // L: 669
												WorldMapLabelSize.otp = WorldMapLabelSize.otp + PacketWriter.field1350;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 673
									var56 = Login.loginBoxX + 180 - 80; // L: 674
									var7 = 321; // L: 675
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 676
										Login.Login_username = Login.Login_username.trim(); // L: 678
										if (Login.Login_username.length() == 0) { // L: 679
											UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 680
										} else {
											long var34 = class13.method134(); // L: 684
											byte var60;
											if (0L == var34) { // L: 685
												var60 = 5;
											} else {
												var12 = Login.Login_username; // L: 688
												Random var36 = new Random(); // L: 690
												Buffer var76 = new Buffer(128); // L: 691
												Buffer var77 = new Buffer(128); // L: 692
												int[] var78 = new int[]{var36.nextInt(), var36.nextInt(), (int)(var34 >> 32), (int)var34}; // L: 693 694 695 696 697
												var76.writeByte(10); // L: 698

												int var17;
												for (var17 = 0; var17 < 4; ++var17) { // L: 699
													var76.writeInt(var36.nextInt()); // L: 700
												}

												var76.writeInt(var78[0]); // L: 702
												var76.writeInt(var78[1]); // L: 703
												var76.writeLong(var34); // L: 704
												var76.writeLong(0L); // L: 705

												for (var17 = 0; var17 < 4; ++var17) { // L: 706
													var76.writeInt(var36.nextInt()); // L: 707
												}

												var76.encryptRsa(class89.field1161, class89.field1164); // L: 709
												var77.writeByte(10); // L: 710

												for (var17 = 0; var17 < 3; ++var17) { // L: 711
													var77.writeInt(var36.nextInt()); // L: 712
												}

												var77.writeLong(var36.nextLong()); // L: 714
												var77.writeLongMedium(var36.nextLong()); // L: 715
												WorldMapData_1.method783(var77); // L: 716
												var77.writeLong(var36.nextLong()); // L: 717
												var77.encryptRsa(class89.field1161, class89.field1164); // L: 718
												var17 = Decimator.stringCp1252NullTerminatedByteSize(var12); // L: 719
												if (var17 % 8 != 0) { // L: 720
													var17 += 8 - var17 % 8;
												}

												Buffer var70 = new Buffer(var17); // L: 721
												var70.writeStringCp1252NullTerminated(var12); // L: 722
												var70.offset = var17; // L: 723
												var70.xteaEncryptAll(var78); // L: 724
												Buffer var19 = new Buffer(var70.offset + var76.offset + var77.offset + 5); // L: 725
												var19.writeByte(2); // L: 726
												var19.writeByte(var76.offset); // L: 727
												var19.writeBytes(var76.array, 0, var76.offset); // L: 728
												var19.writeByte(var77.offset); // L: 729
												var19.writeBytes(var77.array, 0, var77.offset); // L: 730
												var19.writeShort(var70.offset); // L: 731
												var19.writeBytes(var70.array, 0, var70.offset); // L: 732
												String var71 = class2.method40(var19.array); // L: 733

												byte var11;
												try {
													URL var72 = new URL(HealthBarDefinition.method4563("services", false) + "m=accountappeal/login.ws"); // L: 735
													URLConnection var73 = var72.openConnection(); // L: 736
													var73.setDoInput(true); // L: 737
													var73.setDoOutput(true); // L: 738
													var73.setConnectTimeout(5000); // L: 739
													OutputStreamWriter var74 = new OutputStreamWriter(var73.getOutputStream()); // L: 740
													var74.write("data2=" + class298.method5386(var71) + "&dest=" + class298.method5386("passwordchoice.ws")); // L: 741
													var74.flush(); // L: 742
													InputStream var75 = var73.getInputStream(); // L: 743
													var19 = new Buffer(new byte[1000]); // L: 744

													while (true) {
														int var25 = var75.read(var19.array, var19.offset, 1000 - var19.offset); // L: 746
														if (var25 == -1) { // L: 747
															var74.close(); // L: 754
															var75.close(); // L: 755
															String var79 = new String(var19.array); // L: 756
															if (var79.startsWith("OFFLINE")) { // L: 757
																var11 = 4; // L: 758
															} else if (var79.startsWith("WRONG")) { // L: 761
																var11 = 7; // L: 762
															} else if (var79.startsWith("RELOAD")) { // L: 765
																var11 = 3; // L: 766
															} else if (var79.startsWith("Not permitted for social network accounts.")) { // L: 769
																var11 = 6; // L: 770
															} else {
																var19.xteaDecryptAll(var78); // L: 773

																while (var19.offset > 0 && var19.array[var19.offset - 1] == 0) { // L: 774
																	--var19.offset; // L: 775
																}

																var79 = new String(var19.array, 0, var19.offset); // L: 777
																boolean var26;
																if (var79 == null) { // L: 780
																	var26 = false; // L: 781
																} else {
																	label1379: {
																		try {
																			new URL(var79);
																		} catch (MalformedURLException var48) { // L: 787
																			var26 = false; // L: 788
																			break label1379; // L: 789
																		}

																		var26 = true; // L: 791
																	}
																}

																if (var26) { // L: 793
																	class280.openURL(var79, true, false); // L: 794
																	var11 = 2; // L: 795
																} else {
																	var11 = 5; // L: 797
																}
															}
															break;
														}

														var19.offset += var25; // L: 748
														if (var19.offset >= 1000) { // L: 749
															var11 = 5; // L: 750
															break;
														}
													}
												} catch (Throwable var49) { // L: 799
													var49.printStackTrace(); // L: 800
													var11 = 5; // L: 801
												}

												var60 = var11; // L: 804
											}

											switch(var60) { // L: 806
											case 2:
												UrlRequester.setLoginResponseString(Strings.field3067, Strings.field3015, Strings.field3069); // L: 820
												Login.loginIndex = 6; // L: 821
												break; // L: 822
											case 3:
												UrlRequester.setLoginResponseString("", "Error connecting to server.", ""); // L: 824
												break;
											case 4:
												UrlRequester.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 808
												break; // L: 809
											case 5:
												UrlRequester.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 811
												break; // L: 812
											case 6:
												UrlRequester.setLoginResponseString("", "Error connecting to server.", ""); // L: 817
												break; // L: 818
											case 7:
												UrlRequester.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 814
											}
										}

										return; // L: 828
									}

									var56 = Login.loginBoxX + 180 + 80; // L: 830
									if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 831
										class41.Login_promptCredentials(true); // L: 832
									}

									var58 = 361; // L: 834
									if (MusicPatchPcmStream.field2519 != null) { // L: 835
										var9 = MusicPatchPcmStream.field2519.highX / 2; // L: 836
										if (var3 == 1 && var54 >= MusicPatchPcmStream.field2519.lowX - var9 && var54 <= var9 + MusicPatchPcmStream.field2519.lowX && var55 >= var58 - 15 && var55 < var58) { // L: 837
											class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 838
										}
									}

									while (class60.isKeyDown()) { // L: 841
										var61 = false; // L: 842

										for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) { // L: 843
											if (PacketWriter.field1350 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) { // L: 844
												var61 = true; // L: 845
												break; // L: 846
											}
										}

										if (PlayerAppearance.field2581 == 13) { // L: 849
											class41.Login_promptCredentials(true); // L: 850
										} else {
											if (PlayerAppearance.field2581 == 85 && Login.Login_username.length() > 0) { // L: 853
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (PlayerAppearance.field2581 == 84) { // L: 854
												Login.Login_username = Login.Login_username.trim(); // L: 856
												if (Login.Login_username.length() == 0) { // L: 857
													UrlRequester.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 858
												} else {
													long var41 = class13.method134(); // L: 862
													byte var62;
													if (var41 == 0L) { // L: 863
														var62 = 5;
													} else {
														String var37 = Login.Login_username; // L: 866
														Random var38 = new Random(); // L: 868
														Buffer var39 = new Buffer(128); // L: 869
														Buffer var43 = new Buffer(128); // L: 870
														int[] var18 = new int[]{var38.nextInt(), var38.nextInt(), (int)(var41 >> 32), (int)var41}; // L: 871 872 873 874 875
														var39.writeByte(10); // L: 876

														int var44;
														for (var44 = 0; var44 < 4; ++var44) { // L: 877
															var39.writeInt(var38.nextInt()); // L: 878
														}

														var39.writeInt(var18[0]); // L: 880
														var39.writeInt(var18[1]); // L: 881
														var39.writeLong(var41); // L: 882
														var39.writeLong(0L); // L: 883

														for (var44 = 0; var44 < 4; ++var44) { // L: 884
															var39.writeInt(var38.nextInt()); // L: 885
														}

														var39.encryptRsa(class89.field1161, class89.field1164); // L: 887
														var43.writeByte(10); // L: 888

														for (var44 = 0; var44 < 3; ++var44) { // L: 889
															var43.writeInt(var38.nextInt()); // L: 890
														}

														var43.writeLong(var38.nextLong()); // L: 892
														var43.writeLongMedium(var38.nextLong()); // L: 893
														WorldMapData_1.method783(var43); // L: 894
														var43.writeLong(var38.nextLong()); // L: 895
														var43.encryptRsa(class89.field1161, class89.field1164); // L: 896
														var44 = Decimator.stringCp1252NullTerminatedByteSize(var37); // L: 897
														if (var44 % 8 != 0) { // L: 898
															var44 += 8 - var44 % 8;
														}

														Buffer var20 = new Buffer(var44); // L: 899
														var20.writeStringCp1252NullTerminated(var37); // L: 900
														var20.offset = var44; // L: 901
														var20.xteaEncryptAll(var18); // L: 902
														Buffer var21 = new Buffer(var20.offset + var39.offset + var43.offset + 5); // L: 903
														var21.writeByte(2); // L: 904
														var21.writeByte(var39.offset); // L: 905
														var21.writeBytes(var39.array, 0, var39.offset); // L: 906
														var21.writeByte(var43.offset); // L: 907
														var21.writeBytes(var43.array, 0, var43.offset); // L: 908
														var21.writeShort(var20.offset); // L: 909
														var21.writeBytes(var20.array, 0, var20.offset); // L: 910
														String var22 = class2.method40(var21.array); // L: 911

														byte var13;
														try {
															URL var23 = new URL(HealthBarDefinition.method4563("services", false) + "m=accountappeal/login.ws"); // L: 913
															URLConnection var24 = var23.openConnection(); // L: 914
															var24.setDoInput(true); // L: 915
															var24.setDoOutput(true); // L: 916
															var24.setConnectTimeout(5000); // L: 917
															OutputStreamWriter var40 = new OutputStreamWriter(var24.getOutputStream()); // L: 918
															var40.write("data2=" + class298.method5386(var22) + "&dest=" + class298.method5386("passwordchoice.ws")); // L: 919
															var40.flush(); // L: 920
															InputStream var45 = var24.getInputStream(); // L: 921
															var21 = new Buffer(new byte[1000]); // L: 922

															while (true) {
																int var46 = var45.read(var21.array, var21.offset, 1000 - var21.offset); // L: 924
																if (var46 == -1) { // L: 925
																	var40.close(); // L: 932
																	var45.close(); // L: 933
																	String var27 = new String(var21.array); // L: 934
																	if (var27.startsWith("OFFLINE")) { // L: 935
																		var13 = 4; // L: 936
																	} else if (var27.startsWith("WRONG")) { // L: 939
																		var13 = 7; // L: 940
																	} else if (var27.startsWith("RELOAD")) { // L: 943
																		var13 = 3; // L: 944
																	} else if (var27.startsWith("Not permitted for social network accounts.")) { // L: 947
																		var13 = 6; // L: 948
																	} else {
																		var21.xteaDecryptAll(var18); // L: 951

																		while (var21.offset > 0 && var21.array[var21.offset - 1] == 0) { // L: 952
																			--var21.offset; // L: 953
																		}

																		var27 = new String(var21.array, 0, var21.offset); // L: 955
																		boolean var28;
																		if (var27 == null) { // L: 958
																			var28 = false; // L: 959
																		} else {
																			label1381: {
																				try {
																					new URL(var27);
																				} catch (MalformedURLException var50) { // L: 965
																					var28 = false; // L: 966
																					break label1381; // L: 967
																				}

																				var28 = true; // L: 969
																			}
																		}

																		if (var28) { // L: 971
																			class280.openURL(var27, true, false); // L: 972
																			var13 = 2; // L: 973
																		} else {
																			var13 = 5; // L: 975
																		}
																	}
																	break;
																}

																var21.offset += var46; // L: 926
																if (var21.offset >= 1000) { // L: 927
																	var13 = 5; // L: 928
																	break;
																}
															}
														} catch (Throwable var51) { // L: 977
															var51.printStackTrace(); // L: 978
															var13 = 5; // L: 979
														}

														var62 = var13; // L: 982
													}

													switch(var62) { // L: 984
													case 2:
														UrlRequester.setLoginResponseString(Strings.field3067, Strings.field3015, Strings.field3069); // L: 986
														Login.loginIndex = 6; // L: 987
														break; // L: 988
													case 3:
														UrlRequester.setLoginResponseString("", "Error connecting to server.", ""); // L: 999
														break; // L: 1000
													case 4:
														UrlRequester.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 990
														break; // L: 991
													case 5:
														UrlRequester.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 996
														break; // L: 997
													case 6:
														UrlRequester.setLoginResponseString("", "Error connecting to server.", ""); // L: 993
														break; // L: 994
													case 7:
														UrlRequester.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1002
													}
												}

												return; // L: 1006
											}

											if (var61 && Login.Login_username.length() < 320) { // L: 1008
												Login.Login_username = Login.Login_username + PacketWriter.field1350;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 1012
									if (Login.loginIndex == 7) { // L: 1023
										var56 = Login.loginBoxX + 180 - 80; // L: 1024
										var7 = 321; // L: 1025
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 1026
											class280.openURL(HealthBarDefinition.method4563("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1027
											UrlRequester.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1028
											Login.loginIndex = 6; // L: 1029
											return; // L: 1030
										}

										var56 = Login.loginBoxX + 180 + 80; // L: 1032
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 1033
											class41.Login_promptCredentials(true); // L: 1034
										}
									} else if (Login.loginIndex == 8) { // L: 1037
										var56 = Login.loginBoxX + 180 - 80; // L: 1038
										var7 = 321; // L: 1039
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 1040
											class280.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1041
											UrlRequester.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1042
											Login.loginIndex = 6; // L: 1043
											return; // L: 1044
										}

										var56 = Login.loginBoxX + 180 + 80; // L: 1046
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 1047
											class41.Login_promptCredentials(true); // L: 1048
										}
									} else if (Login.loginIndex == 12) { // L: 1051
										String var47 = ""; // L: 1052
										switch(Login.field1210) { // L: 1053
										case 0:
											var47 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1055
											break; // L: 1056
										case 1:
											var47 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1058
											break; // L: 1059
										default:
											class41.Login_promptCredentials(false); // L: 1061
										}

										var59 = Login.loginBoxX + 180; // L: 1064
										var58 = 276; // L: 1065
										if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) { // L: 1066
											class280.openURL(var47, true, false); // L: 1067
											UrlRequester.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1068
											Login.loginIndex = 6; // L: 1069
											return; // L: 1070
										}

										var59 = Login.loginBoxX + 180; // L: 1072
										var58 = 326; // L: 1073
										if (var3 == 1 && var54 >= var59 - 75 && var54 <= var59 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) { // L: 1074
											class41.Login_promptCredentials(false); // L: 1075
										}
									} else if (Login.loginIndex == 24) { // L: 1078
										var56 = Login.loginBoxX + 180; // L: 1079
										var7 = 301; // L: 1080
										if (var3 == 1 && var54 >= var56 - 75 && var54 <= var56 + 75 && var55 >= var7 - 20 && var55 <= var7 + 20) { // L: 1081
											class41.Login_promptCredentials(false); // L: 1082
										}
									}
								} else {
									while (true) {
										do {
											if (!class60.isKeyDown()) { // L: 1013
												var57 = 321; // L: 1018
												if (var3 == 1 && var55 >= var57 - 20 && var55 <= var57 + 20) { // L: 1019
													class41.Login_promptCredentials(true); // L: 1020
												}

												return;
											}
										} while(PlayerAppearance.field2581 != 84 && PlayerAppearance.field2581 != 13); // L: 1014

										class41.Login_promptCredentials(true); // L: 1015
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 266

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1948911757"
	)
	@Export("load")
	static void load() {
		int var27;
		if (Client.titleLoadingStage == 0) { // L: 1446
			ScriptEvent.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1447

			for (var27 = 0; var27 < 4; ++var27) { // L: 1448
				Client.collisionMaps[var27] = new CollisionMap(104, 104);
			}

			ApproximateRouteStrategy.sceneMinimapSprite = new Sprite(512, 512); // L: 1449
			Login.Login_loadingText = "Starting game engine..."; // L: 1450
			Login.Login_loadingPercent = 5; // L: 1451
			Client.titleLoadingStage = 20; // L: 1452
		} else if (Client.titleLoadingStage == 20) { // L: 1455
			Login.Login_loadingText = "Prepared visibility map"; // L: 1456
			Login.Login_loadingPercent = 10; // L: 1457
			Client.titleLoadingStage = 30; // L: 1458
		} else if (Client.titleLoadingStage == 30) { // L: 1461
			class182.archive0 = WorldMapLabelSize.newArchive(0, false, true, true); // L: 1462
			Client.archive1 = WorldMapLabelSize.newArchive(1, false, true, true); // L: 1463
			NetFileRequest.archive2 = WorldMapLabelSize.newArchive(2, true, false, true); // L: 1464
			WorldMapID.archive3 = WorldMapLabelSize.newArchive(3, false, true, true); // L: 1465
			GrandExchangeOfferUnitPriceComparator.archive4 = WorldMapLabelSize.newArchive(4, false, true, true); // L: 1466
			WorldMapLabel.archive5 = WorldMapLabelSize.newArchive(5, true, true, true); // L: 1467
			CollisionMap.archive6 = WorldMapLabelSize.newArchive(6, true, true, true); // L: 1468
			WorldMapSection1.archive7 = WorldMapLabelSize.newArchive(7, false, true, true); // L: 1469
			Huffman.archive8 = WorldMapLabelSize.newArchive(8, false, true, true); // L: 1470
			UrlRequester.archive9 = WorldMapLabelSize.newArchive(9, false, true, true); // L: 1471
			Occluder.archive10 = WorldMapLabelSize.newArchive(10, false, true, true); // L: 1472
			GrandExchangeEvent.archive11 = WorldMapLabelSize.newArchive(11, false, true, true); // L: 1473
			ApproximateRouteStrategy.archive12 = WorldMapLabelSize.newArchive(12, false, true, true); // L: 1474
			TilePaint.archive13 = WorldMapLabelSize.newArchive(13, true, false, true); // L: 1475
			PlayerAppearance.archive14 = WorldMapLabelSize.newArchive(14, false, true, true); // L: 1476
			PlayerAppearance.archive15 = WorldMapLabelSize.newArchive(15, false, true, true); // L: 1477
			archive17 = WorldMapLabelSize.newArchive(17, true, true, true); // L: 1478
			MouseRecorder.archive18 = WorldMapLabelSize.newArchive(18, false, true, true); // L: 1479
			WorldMapData_1.archive19 = WorldMapLabelSize.newArchive(19, false, true, true); // L: 1480
			FontName.archive20 = WorldMapLabelSize.newArchive(20, false, true, true); // L: 1481
			Login.Login_loadingText = "Connecting to update server"; // L: 1482
			Login.Login_loadingPercent = 20; // L: 1483
			Client.titleLoadingStage = 40; // L: 1484
		} else if (Client.titleLoadingStage == 40) { // L: 1487
			byte var36 = 0; // L: 1488
			var27 = var36 + class182.archive0.percentage() * 4 / 100; // L: 1489
			var27 += Client.archive1.percentage() * 4 / 100; // L: 1490
			var27 += NetFileRequest.archive2.percentage() * 2 / 100; // L: 1491
			var27 += WorldMapID.archive3.percentage() * 2 / 100; // L: 1492
			var27 += GrandExchangeOfferUnitPriceComparator.archive4.percentage() * 6 / 100; // L: 1493
			var27 += WorldMapLabel.archive5.percentage() * 4 / 100; // L: 1494
			var27 += CollisionMap.archive6.percentage() * 2 / 100; // L: 1495
			var27 += WorldMapSection1.archive7.percentage() * 56 / 100; // L: 1496
			var27 += Huffman.archive8.percentage() * 2 / 100; // L: 1497
			var27 += UrlRequester.archive9.percentage() * 2 / 100; // L: 1498
			var27 += Occluder.archive10.percentage() * 2 / 100; // L: 1499
			var27 += GrandExchangeEvent.archive11.percentage() * 2 / 100; // L: 1500
			var27 += ApproximateRouteStrategy.archive12.percentage() * 2 / 100; // L: 1501
			var27 += TilePaint.archive13.percentage() * 2 / 100; // L: 1502
			var27 += PlayerAppearance.archive14.percentage() * 2 / 100; // L: 1503
			var27 += PlayerAppearance.archive15.percentage() * 2 / 100; // L: 1504
			var27 += WorldMapData_1.archive19.percentage() / 100; // L: 1505
			var27 += MouseRecorder.archive18.percentage() / 100; // L: 1506
			var27 += FontName.archive20.percentage() / 100; // L: 1507
			var27 += archive17.method4340() && archive17.isFullyLoaded() ? 1 : 0; // L: 1508
			if (var27 != 100) { // L: 1509
				if (var27 != 0) { // L: 1510
					Login.Login_loadingText = "Checking for updates - " + var27 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1511
			} else {
				ViewportMouse.method3082(class182.archive0, "Animations"); // L: 1514
				ViewportMouse.method3082(Client.archive1, "Skeletons"); // L: 1515
				ViewportMouse.method3082(GrandExchangeOfferUnitPriceComparator.archive4, "Sound FX"); // L: 1516
				ViewportMouse.method3082(WorldMapLabel.archive5, "Maps"); // L: 1517
				ViewportMouse.method3082(CollisionMap.archive6, "Music Tracks"); // L: 1518
				ViewportMouse.method3082(WorldMapSection1.archive7, "Models"); // L: 1519
				ViewportMouse.method3082(Huffman.archive8, "Sprites"); // L: 1520
				ViewportMouse.method3082(GrandExchangeEvent.archive11, "Music Jingles"); // L: 1521
				ViewportMouse.method3082(PlayerAppearance.archive14, "Music Samples"); // L: 1522
				ViewportMouse.method3082(PlayerAppearance.archive15, "Music Patches"); // L: 1523
				ViewportMouse.method3082(WorldMapData_1.archive19, "World Map"); // L: 1524
				ViewportMouse.method3082(MouseRecorder.archive18, "World Map Geography"); // L: 1525
				ViewportMouse.method3082(FontName.archive20, "World Map Ground"); // L: 1526
				NetSocket.spriteIds = new GraphicsDefaults(); // L: 1527
				NetSocket.spriteIds.decode(archive17); // L: 1528
				Login.Login_loadingText = "Loaded update list"; // L: 1529
				Login.Login_loadingPercent = 30; // L: 1530
				Client.titleLoadingStage = 45; // L: 1531
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1534
			class2.method37(22050, !Client.isLowDetail, 2); // L: 1535
			MidiPcmStream var33 = new MidiPcmStream(); // L: 1536
			var33.method3813(9, 128); // L: 1537
			WorldMapManager.pcmPlayer0 = TileItem.method2205(GameShell.taskHandler, 0, 22050); // L: 1538
			WorldMapManager.pcmPlayer0.setStream(var33); // L: 1539
			BoundaryObject.method3385(PlayerAppearance.archive15, PlayerAppearance.archive14, GrandExchangeOfferUnitPriceComparator.archive4, var33); // L: 1540
			IntHashTable.pcmPlayer1 = TileItem.method2205(GameShell.taskHandler, 1, 2048); // L: 1541
			Players.pcmStreamMixer = new PcmStreamMixer(); // L: 1542
			IntHashTable.pcmPlayer1.setStream(Players.pcmStreamMixer); // L: 1543
			class9.decimator = new Decimator(22050, PcmPlayer.field1447); // L: 1544
			Login.Login_loadingText = "Prepared sound engine"; // L: 1545
			Login.Login_loadingPercent = 35; // L: 1546
			Client.titleLoadingStage = 50; // L: 1547
			DevicePcmPlayerProvider.WorldMapElement_fonts = new Fonts(Huffman.archive8, TilePaint.archive13); // L: 1548
		} else if (Client.titleLoadingStage == 50) { // L: 1551
			var27 = FontName.method5439().length; // L: 1552
			Client.fontsMap = DevicePcmPlayerProvider.WorldMapElement_fonts.createMap(FontName.method5439()); // L: 1553
			if (Client.fontsMap.size() < var27) { // L: 1554
				Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var27 + "%"; // L: 1555
				Login.Login_loadingPercent = 40; // L: 1556
			} else {
				DynamicObject.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1559
				ItemDefinition.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1560
				class4.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1561
				WorldMapArea.platformInfo = Client.platformInfoProvider.get(); // L: 1562
				Login.Login_loadingText = "Loaded fonts"; // L: 1563
				Login.Login_loadingPercent = 40; // L: 1564
				Client.titleLoadingStage = 60; // L: 1565
			}
		} else {
			int var3;
			Archive var28;
			Archive var29;
			if (Client.titleLoadingStage == 60) { // L: 1568
				var28 = Occluder.archive10; // L: 1570
				var29 = Huffman.archive8; // L: 1571
				var3 = 0; // L: 1573
				if (var28.tryLoadFileByNames("title.jpg", "")) { // L: 1574
					++var3;
				}

				if (var29.tryLoadFileByNames("logo", "")) { // L: 1575
					++var3;
				}

				if (var29.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 1576
					++var3;
				}

				if (var29.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 1577
					++var3;
				}

				if (var29.tryLoadFileByNames("titlebox", "")) { // L: 1578
					++var3;
				}

				if (var29.tryLoadFileByNames("titlebutton", "")) { // L: 1579
					++var3;
				}

				if (var29.tryLoadFileByNames("runes", "")) { // L: 1580
					++var3;
				}

				if (var29.tryLoadFileByNames("title_mute", "")) { // L: 1581
					++var3;
				}

				if (var29.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 1582
					++var3;
				}

				if (var29.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 1583
					++var3;
				}

				if (var29.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 1584
					++var3;
				}

				if (var29.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 1585
					++var3;
				}

				var29.tryLoadFileByNames("sl_back", ""); // L: 1586
				var29.tryLoadFileByNames("sl_flags", ""); // L: 1587
				var29.tryLoadFileByNames("sl_arrows", ""); // L: 1588
				var29.tryLoadFileByNames("sl_stars", ""); // L: 1589
				var29.tryLoadFileByNames("sl_button", ""); // L: 1590
				byte var35 = 12; // L: 1596
				if (var3 < var35) { // L: 1599
					Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var35 + "%"; // L: 1600
					Login.Login_loadingPercent = 50; // L: 1601
				} else {
					Login.Login_loadingText = "Loaded title screen"; // L: 1604
					Login.Login_loadingPercent = 50; // L: 1605
					CollisionMap.updateGameState(5); // L: 1606
					Client.titleLoadingStage = 70; // L: 1607
				}
			} else if (Client.titleLoadingStage == 70) { // L: 1610
				if (!NetFileRequest.archive2.isFullyLoaded()) { // L: 1611
					Login.Login_loadingText = "Loading config - " + NetFileRequest.archive2.loadPercent() + "%"; // L: 1612
					Login.Login_loadingPercent = 60; // L: 1613
				} else {
					Archive var32 = NetFileRequest.archive2; // L: 1616
					class1.FloorOverlayDefinition_archive = var32; // L: 1618
					Varcs.method2257(NetFileRequest.archive2); // L: 1620
					Entity.method3381(NetFileRequest.archive2, WorldMapSection1.archive7); // L: 1621
					var28 = NetFileRequest.archive2; // L: 1622
					var29 = WorldMapSection1.archive7; // L: 1623
					boolean var34 = Client.isLowDetail; // L: 1624
					ObjectDefinition.ObjectDefinition_archive = var28; // L: 1626
					DirectByteArrayCopier.ObjectDefinition_modelsArchive = var29; // L: 1627
					ObjectDefinition.ObjectDefinition_isLowDetail = var34; // L: 1628
					Archive var30 = NetFileRequest.archive2; // L: 1630
					Archive var5 = WorldMapSection1.archive7; // L: 1631
					NPCDefinition.NpcDefinition_archive = var30; // L: 1633
					NPCDefinition.NpcDefinition_modelArchive = var5; // L: 1634
					Script.method2325(NetFileRequest.archive2); // L: 1636
					UserComparator9.method3487(NetFileRequest.archive2, WorldMapSection1.archive7, Client.isMembersWorld, DynamicObject.fontPlain11); // L: 1637
					Archive var6 = NetFileRequest.archive2; // L: 1638
					Archive var7 = class182.archive0; // L: 1639
					Archive var8 = Client.archive1; // L: 1640
					SequenceDefinition.SequenceDefinition_archive = var6; // L: 1642
					SequenceDefinition.SequenceDefinition_animationsArchive = var7; // L: 1643
					GrandExchangeOfferAgeComparator.SequenceDefinition_skeletonsArchive = var8; // L: 1644
					Archive var9 = NetFileRequest.archive2; // L: 1646
					Archive var10 = WorldMapSection1.archive7; // L: 1647
					SpotAnimationDefinition.SpotAnimationDefinition_archive = var9; // L: 1649
					SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var10; // L: 1650
					Archive var11 = NetFileRequest.archive2; // L: 1652
					VarbitDefinition.VarbitDefinition_archive = var11; // L: 1654
					class227.method4185(NetFileRequest.archive2); // L: 1656
					Archive var12 = WorldMapID.archive3; // L: 1657
					Archive var13 = WorldMapSection1.archive7; // L: 1658
					Archive var14 = Huffman.archive8; // L: 1659
					Archive var15 = TilePaint.archive13; // L: 1660
					Widget.Widget_archive = var12; // L: 1662
					Widget.Widget_modelsArchive = var13; // L: 1663
					Messages.Widget_spritesArchive = var14; // L: 1664
					HealthBar.Widget_fontsArchive = var15; // L: 1665
					Widget.Widget_interfaceComponents = new Widget[Widget.Widget_archive.getGroupCount()][]; // L: 1666
					Bounds.Widget_loadedInterfaces = new boolean[Widget.Widget_archive.getGroupCount()]; // L: 1667
					class4.method73(NetFileRequest.archive2); // L: 1669
					class225.method4129(NetFileRequest.archive2); // L: 1670
					Archive var16 = NetFileRequest.archive2; // L: 1671
					VarcInt.VarcInt_archive = var16; // L: 1673
					Archive var17 = NetFileRequest.archive2; // L: 1675
					ParamDefinition.ParamDefinition_archive = var17; // L: 1677
					ClientPreferences.varcs = new Varcs(); // L: 1679
					Archive var18 = NetFileRequest.archive2; // L: 1680
					Archive var19 = Huffman.archive8; // L: 1681
					Archive var20 = TilePaint.archive13; // L: 1682
					HitSplatDefinition.HitSplatDefinition_archive = var18; // L: 1684
					HitSplatDefinition.field3364 = var19; // L: 1685
					HitSplatDefinition.HitSplatDefinition_fontsArchive = var20; // L: 1686
					Archive var21 = NetFileRequest.archive2; // L: 1688
					Archive var22 = Huffman.archive8; // L: 1689
					HealthBarDefinition.HealthBarDefinition_archive = var21; // L: 1691
					HealthBarDefinition.HitSplatDefinition_spritesArchive = var22; // L: 1692
					Archive var23 = NetFileRequest.archive2; // L: 1694
					Archive var24 = Huffman.archive8; // L: 1695
					WorldMapElement.WorldMapElement_archive = var24; // L: 1697
					if (var23.isFullyLoaded()) { // L: 1698
						WorldMapElement.WorldMapElement_count = var23.getGroupFileCount(35); // L: 1701
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1702

						for (int var25 = 0; var25 < WorldMapElement.WorldMapElement_count; ++var25) { // L: 1703
							byte[] var26 = var23.takeFile(35, var25); // L: 1704
							WorldMapElement.WorldMapElement_cached[var25] = new WorldMapElement(var25); // L: 1705
							if (var26 != null) { // L: 1706
								WorldMapElement.WorldMapElement_cached[var25].decode(new Buffer(var26)); // L: 1707
								WorldMapElement.WorldMapElement_cached[var25].method4469(); // L: 1708
							}
						}
					}

					Login.Login_loadingText = "Loaded config"; // L: 1712
					Login.Login_loadingPercent = 60; // L: 1713
					Client.titleLoadingStage = 80; // L: 1714
				}
			} else if (Client.titleLoadingStage == 80) { // L: 1717
				var27 = 0; // L: 1718
				if (LoginPacket.compass == null) { // L: 1719
					LoginPacket.compass = AbstractUserComparator.SpriteBuffer_getSprite(Huffman.archive8, NetSocket.spriteIds.compass, 0);
				} else {
					++var27; // L: 1720
				}

				if (FontName.redHintArrowSprite == null) { // L: 1721
					FontName.redHintArrowSprite = AbstractUserComparator.SpriteBuffer_getSprite(Huffman.archive8, NetSocket.spriteIds.field3831, 0);
				} else {
					++var27; // L: 1722
				}

				if (ReflectionCheck.mapSceneSprites == null) { // L: 1723
					ReflectionCheck.mapSceneSprites = UserComparator5.method3515(Huffman.archive8, NetSocket.spriteIds.mapScenes, 0);
				} else {
					++var27; // L: 1724
				}

				if (class279.headIconPkSprites == null) { // L: 1725
					class279.headIconPkSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.headIconsPk, 0);
				} else {
					++var27; // L: 1726
				}

				if (Client.headIconPrayerSprites == null) { // L: 1727
					Client.headIconPrayerSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3839, 0);
				} else {
					++var27; // L: 1728
				}

				if (Varcs.headIconHintSprites == null) { // L: 1729
					Varcs.headIconHintSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3835, 0);
				} else {
					++var27; // L: 1730
				}

				if (VarbitDefinition.mapMarkerSprites == null) { // L: 1731
					VarbitDefinition.mapMarkerSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3838, 0);
				} else {
					++var27; // L: 1732
				}

				if (ArchiveLoader.crossSprites == null) { // L: 1733
					ArchiveLoader.crossSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3837, 0);
				} else {
					++var27; // L: 1734
				}

				if (class235.mapDotSprites == null) { // L: 1735
					class235.mapDotSprites = GameBuild.method4214(Huffman.archive8, NetSocket.spriteIds.field3836, 0);
				} else {
					++var27; // L: 1736
				}

				if (GrandExchangeEvent.scrollBarSprites == null) { // L: 1737
					GrandExchangeEvent.scrollBarSprites = UserComparator5.method3515(Huffman.archive8, NetSocket.spriteIds.field3834, 0);
				} else {
					++var27; // L: 1738
				}

				if (GrandExchangeOfferWorldComparator.modIconSprites == null) { // L: 1739
					GrandExchangeOfferWorldComparator.modIconSprites = UserComparator5.method3515(Huffman.archive8, NetSocket.spriteIds.field3840, 0);
				} else {
					++var27; // L: 1740
				}

				if (var27 < 11) { // L: 1741
					Login.Login_loadingText = "Loading sprites - " + var27 * 100 / 12 + "%"; // L: 1742
					Login.Login_loadingPercent = 70; // L: 1743
				} else {
					AbstractFont.AbstractFont_modIconSprites = GrandExchangeOfferWorldComparator.modIconSprites; // L: 1746
					FontName.redHintArrowSprite.normalize(); // L: 1747
					int var1 = (int)(Math.random() * 21.0D) - 10; // L: 1748
					int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1749
					var3 = (int)(Math.random() * 21.0D) - 10; // L: 1750
					int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1751
					ReflectionCheck.mapSceneSprites[0].shiftColors(var4 + var1, var2 + var4, var4 + var3); // L: 1752
					Login.Login_loadingText = "Loaded sprites"; // L: 1753
					Login.Login_loadingPercent = 70; // L: 1754
					Client.titleLoadingStage = 90; // L: 1755
				}
			} else if (Client.titleLoadingStage == 90) { // L: 1758
				if (!UrlRequester.archive9.isFullyLoaded()) { // L: 1759
					Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1760
					Login.Login_loadingPercent = 90; // L: 1761
				} else {
					class41.textureProvider = new TextureProvider(UrlRequester.archive9, Huffman.archive8, 20, 0.8D, Client.isLowDetail ? 64 : 128); // L: 1764
					Rasterizer3D.Rasterizer3D_setTextureLoader(class41.textureProvider); // L: 1765
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 1766
					Client.titleLoadingStage = 100; // L: 1767
				}
			} else if (Client.titleLoadingStage == 100) { // L: 1770
				var27 = class41.textureProvider.getLoadedPercentage(); // L: 1771
				if (var27 < 100) { // L: 1772
					Login.Login_loadingText = "Loading textures - " + var27 + "%"; // L: 1773
					Login.Login_loadingPercent = 90; // L: 1774
				} else {
					Login.Login_loadingText = "Loaded textures"; // L: 1777
					Login.Login_loadingPercent = 90; // L: 1778
					Client.titleLoadingStage = 110; // L: 1779
				}
			} else if (Client.titleLoadingStage == 110) { // L: 1782
				ByteArrayPool.mouseRecorder = new MouseRecorder(); // L: 1783
				GameShell.taskHandler.newThreadTask(ByteArrayPool.mouseRecorder, 10); // L: 1784
				Login.Login_loadingText = "Loaded input handler"; // L: 1785
				Login.Login_loadingPercent = 92; // L: 1786
				Client.titleLoadingStage = 120; // L: 1787
			} else if (Client.titleLoadingStage == 120) { // L: 1790
				if (!Occluder.archive10.tryLoadFileByNames("huffman", "")) { // L: 1791
					Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1792
					Login.Login_loadingPercent = 94; // L: 1793
				} else {
					Huffman var0 = new Huffman(Occluder.archive10.takeFileByNames("huffman", "")); // L: 1796
					class219.huffman = var0; // L: 1798
					Login.Login_loadingText = "Loaded wordpack"; // L: 1800
					Login.Login_loadingPercent = 94; // L: 1801
					Client.titleLoadingStage = 130; // L: 1802
				}
			} else if (Client.titleLoadingStage == 130) { // L: 1805
				if (!WorldMapID.archive3.isFullyLoaded()) { // L: 1806
					Login.Login_loadingText = "Loading interfaces - " + WorldMapID.archive3.loadPercent() * 4 / 5 + "%"; // L: 1807
					Login.Login_loadingPercent = 96; // L: 1808
				} else if (!ApproximateRouteStrategy.archive12.isFullyLoaded()) { // L: 1811
					Login.Login_loadingText = "Loading interfaces - " + (80 + ApproximateRouteStrategy.archive12.loadPercent() / 6) + "%"; // L: 1812
					Login.Login_loadingPercent = 96; // L: 1813
				} else if (!TilePaint.archive13.isFullyLoaded()) { // L: 1816
					Login.Login_loadingText = "Loading interfaces - " + (96 + TilePaint.archive13.loadPercent() / 50) + "%"; // L: 1817
					Login.Login_loadingPercent = 96; // L: 1818
				} else {
					Login.Login_loadingText = "Loaded interfaces"; // L: 1821
					Login.Login_loadingPercent = 98; // L: 1822
					Client.titleLoadingStage = 140; // L: 1823
				}
			} else if (Client.titleLoadingStage == 140) { // L: 1826
				Login.Login_loadingPercent = 100; // L: 1827
				if (!WorldMapData_1.archive19.tryLoadGroupByName(WorldMapCacheName.field322.name)) { // L: 1828
					Login.Login_loadingText = "Loading world map - " + WorldMapData_1.archive19.groupLoadPercentByName(WorldMapCacheName.field322.name) / 10 + "%"; // L: 1829
				} else {
					if (Message.worldMap == null) { // L: 1832
						Message.worldMap = new WorldMap(); // L: 1833
						Message.worldMap.init(WorldMapData_1.archive19, MouseRecorder.archive18, FontName.archive20, class4.fontBold12, Client.fontsMap, ReflectionCheck.mapSceneSprites); // L: 1834
					}

					Login.Login_loadingText = "Loaded world map"; // L: 1836
					Client.titleLoadingStage = 150; // L: 1837
				}
			} else if (Client.titleLoadingStage == 150) { // L: 1840
				CollisionMap.updateGameState(10); // L: 1841
			}
		}
	} // L: 1453 1459 1485 1512 1532 1549 1557 1566 1602 1608 1614 1715 1744 1756 1762 1768 1775 1780 1788 1794 1803 1809 1814 1819 1824 1830 1838 1842 1844
}
