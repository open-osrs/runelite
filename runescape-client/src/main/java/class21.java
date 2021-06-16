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

@ObfuscatedName("c")
public class class21 extends class14 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 688651321
	)
	static int field180;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 619101743
	)
	static int field171;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -293151227
	)
	int field179;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 64877513
	)
	int field174;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 20782795
	)
	int field173;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -462967025
	)
	int field172;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class21(class2 var1) {
		this.this$0 = var1;
		this.field179 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field179 = var1.readUnsignedShort(); // L: 166
		this.field174 = var1.readInt(); // L: 167
		this.field173 = var1.readUnsignedByte(); // L: 168
		this.field172 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method128(this.field179, this.field174, this.field173, this.field172); // L: 173
	} // L: 174

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)V",
		garbageValue = "-863685229"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) { // L: 204
			WorldMapManager.method3538(var0); // L: 205
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 208
				class4.clientPreferences.titleMusicDisabled = !class4.clientPreferences.titleMusicDisabled; // L: 209
				Actor.savePreferences(); // L: 210
				if (!class4.clientPreferences.titleMusicDisabled) { // L: 211
					Archive var1 = DynamicObject.archive6; // L: 212
					int var2 = var1.getGroupId("scape main"); // L: 214
					int var3 = var1.getFileId(var2, ""); // L: 215
					class105.method2357(var1, var2, var3, 255, false); // L: 216
				} else {
					Decimator.method1169(); // L: 219
				}
			}

			if (Client.gameState != 5) { // L: 221
				if (-1L == Login.field1019) { // L: 222
					Login.field1019 = ClientPacket.currentTimeMillis() + 1000L; // L: 223
				}

				long var16 = ClientPacket.currentTimeMillis(); // L: 225
				boolean var24;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 228
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 232
							var24 = true; // L: 240
							break;
						}

						ArchiveLoader var4 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 233
						if (!var4.isLoaded()) { // L: 234
							var24 = false; // L: 235
							break; // L: 236
						}

						++Client.archiveLoadersDone; // L: 238
					}
				} else {
					var24 = true; // L: 229
				}

				if (var24 && -1L == Login.field1031) { // L: 242 243
					Login.field1031 = var16; // L: 244
					if (Login.field1031 > Login.field1019) { // L: 245
						Login.field1019 = Login.field1031; // L: 246
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 250
					int var18;
					if (AbstractArchive.clientLanguage == Language.Language_EN) { // L: 251
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 252
							var18 = Login.xPadding + 5; // L: 253
							short var5 = 463; // L: 254
							byte var6 = 100; // L: 255
							byte var7 = 35; // L: 256
							if (MouseHandler.MouseHandler_lastPressedX >= var18 && MouseHandler.MouseHandler_lastPressedX <= var6 + var18 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var7 + var5) { // L: 257
								if (FaceNormal.loadWorlds()) { // L: 259
									Login.worldSelectOpen = true; // L: 260
									Login.worldSelectPage = 0; // L: 261
									Login.worldSelectPagesCount = 0; // L: 262
								}

								return; // L: 265
							}
						}

						if (World.World_request != null) { // L: 268
							ScriptFrame.method1231();
						}
					}

					var18 = MouseHandler.MouseHandler_lastButton; // L: 270
					int var25 = MouseHandler.MouseHandler_lastPressedX; // L: 271
					int var26 = MouseHandler.MouseHandler_lastPressedY; // L: 272
					if (var18 == 0) { // L: 273
						var25 = MouseHandler.MouseHandler_x; // L: 274
						var26 = MouseHandler.MouseHandler_y; // L: 275
					}

					if (!UserComparator3.mouseCam && var18 == 4) { // L: 277
						var18 = 1;
					}

					short var29;
					int var30;
					if (Login.loginIndex == 0) { // L: 278
						boolean var35 = false; // L: 279

						while (SecureRandomCallable.isKeyDown()) { // L: 280
							if (SoundCache.field446 == 84) { // L: 281
								var35 = true; // L: 282
							}
						}

						var30 = class25.loginBoxCenter - 80; // L: 285
						var29 = 291; // L: 286
						if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 287
							AttackOption.openURL(class19.method283("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 288
						}

						var30 = class25.loginBoxCenter + 80; // L: 290
						if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20 || var35) { // L: 291
							if ((Client.worldProperties & 33554432) != 0) { // L: 292
								Login.Login_response0 = ""; // L: 293
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 294
								Login.Login_response2 = "Your normal account will not be affected."; // L: 295
								Login.Login_response3 = ""; // L: 296
								Login.loginIndex = 1; // L: 297
								GameObject.method4433(); // L: 298
							} else if ((Client.worldProperties & 4) != 0) { // L: 300
								if ((Client.worldProperties & 1024) != 0) { // L: 301
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 302
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 303
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 304
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 307
									Login.Login_response2 = "Players can attack each other"; // L: 308
									Login.Login_response3 = "almost everywhere."; // L: 309
								}

								Login.Login_response0 = "Warning!"; // L: 311
								Login.loginIndex = 1; // L: 312
								GameObject.method4433(); // L: 313
							} else if ((Client.worldProperties & 1024) != 0) { // L: 315
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 316
								Login.Login_response2 = "The Protect Item prayer will"; // L: 317
								Login.Login_response3 = "not work on this world."; // L: 318
								Login.Login_response0 = "Warning!"; // L: 319
								Login.loginIndex = 1; // L: 320
								GameObject.method4433(); // L: 321
							} else {
								class69.Login_promptCredentials(false); // L: 324
							}
						}
					} else {
						short var8;
						int var27;
						if (Login.loginIndex == 1) { // L: 328
							while (true) {
								if (!SecureRandomCallable.isKeyDown()) { // L: 329
									var27 = class25.loginBoxCenter - 80; // L: 337
									var8 = 321; // L: 338
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 339
										class69.Login_promptCredentials(false); // L: 340
									}

									var27 = class25.loginBoxCenter + 80; // L: 342
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 343
										Login.loginIndex = 0; // L: 344
									}
									break;
								}

								if (SoundCache.field446 == 84) { // L: 330
									class69.Login_promptCredentials(false); // L: 331
								} else if (SoundCache.field446 == 13) { // L: 333
									Login.loginIndex = 0; // L: 334
								}
							}
						} else {
							int var11;
							short var28;
							if (Login.loginIndex == 2) { // L: 347
								var28 = 201; // L: 348
								var27 = var28 + 52; // L: 349
								if (var18 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) { // L: 350
									Login.currentLoginField = 0;
								}

								var27 += 15; // L: 351
								if (var18 == 1 && var26 >= var27 - 12 && var26 < var27 + 2) { // L: 352
									Login.currentLoginField = 1;
								}

								var27 += 15; // L: 353
								var28 = 361; // L: 354
								if (Client.field903 != null) { // L: 355
									var30 = Client.field903.highX / 2; // L: 356
									if (var18 == 1 && var25 >= Client.field903.lowX - var30 && var25 <= var30 + Client.field903.lowX && var26 >= var28 - 15 && var26 < var28) { // L: 357
										switch(Login.field1012) { // L: 358
										case 1:
											CollisionMap.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 361
											Login.loginIndex = 5; // L: 362
											return; // L: 363
										case 2:
											AttackOption.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 367
										}
									}
								}

								var30 = class25.loginBoxCenter - 80; // L: 373
								var29 = 321; // L: 374
								if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 375
									Login.Login_username = Login.Login_username.trim(); // L: 376
									if (Login.Login_username.length() == 0) { // L: 377
										CollisionMap.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 378
										return; // L: 379
									}

									if (Login.Login_password.length() == 0) { // L: 381
										CollisionMap.setLoginResponseString("", "Please enter your password.", ""); // L: 382
										return; // L: 383
									}

									CollisionMap.setLoginResponseString("", "Connecting to server...", ""); // L: 385
									class19.method281(false); // L: 386
									Projectile.updateGameState(20); // L: 387
									return; // L: 388
								}

								var30 = Login.loginBoxX + 180 + 80; // L: 390
								if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 391
									Login.loginIndex = 0; // L: 392
									Login.Login_username = ""; // L: 393
									Login.Login_password = ""; // L: 394
									class0.field2 = 0; // L: 395
									ItemLayer.otp = ""; // L: 396
									Login.field1022 = true; // L: 397
								}

								var30 = class25.loginBoxCenter + -117; // L: 399
								var29 = 277; // L: 400
								Login.field1006 = var25 >= var30 && var25 < var30 + class126.field1477 && var26 >= var29 && var26 < var29 + PcmPlayer.field416; // L: 401
								if (var18 == 1 && Login.field1006) { // L: 402
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 403
									if (!Client.Login_isUsernameRemembered && class4.clientPreferences.rememberedUsername != null) { // L: 404
										class4.clientPreferences.rememberedUsername = null; // L: 405
										Actor.savePreferences(); // L: 406
									}
								}

								var30 = class25.loginBoxCenter + 24; // L: 409
								var29 = 277; // L: 410
								Login.field1021 = var25 >= var30 && var25 < var30 + class126.field1477 && var26 >= var29 && var26 < var29 + PcmPlayer.field416; // L: 411
								if (var18 == 1 && Login.field1021) { // L: 412
									class4.clientPreferences.hideUsername = !class4.clientPreferences.hideUsername; // L: 413
									if (!class4.clientPreferences.hideUsername) { // L: 414
										Login.Login_username = ""; // L: 415
										class4.clientPreferences.rememberedUsername = null; // L: 416
										GameObject.method4433(); // L: 417
									}

									Actor.savePreferences(); // L: 419
								}

								while (true) {
									Transferable var20;
									int var33;
									do {
										while (true) {
											label903:
											do {
												while (true) {
													while (SecureRandomCallable.isKeyDown()) { // L: 421
														if (SoundCache.field446 != 13) { // L: 422
															if (Login.currentLoginField != 0) { // L: 431
																continue label903;
															}

															char var32 = Timer.field3780; // L: 432

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var32 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 434 435
															}

															if (SoundCache.field446 == 85 && Login.Login_username.length() > 0) { // L: 438
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (SoundCache.field446 == 84 || SoundCache.field446 == 80) { // L: 439
																Login.currentLoginField = 1;
															}

															char var12 = Timer.field3780; // L: 441
															boolean var34 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var12) != -1; // L: 443
															if (var34 && Login.Login_username.length() < 320) { // L: 445
																Login.Login_username = Login.Login_username + Timer.field3780;
															}
														} else {
															Login.loginIndex = 0; // L: 423
															Login.Login_username = ""; // L: 424
															Login.Login_password = ""; // L: 425
															class0.field2 = 0; // L: 426
															ItemLayer.otp = ""; // L: 427
															Login.field1022 = true; // L: 428
														}
													}

													return; // L: 686
												}
											} while(Login.currentLoginField != 1); // L: 447

											if (SoundCache.field446 == 85 && Login.Login_password.length() > 0) { // L: 448
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 449
											} else if (SoundCache.field446 == 84 || SoundCache.field446 == 80) { // L: 451
												Login.currentLoginField = 0; // L: 452
												if (SoundCache.field446 == 84) { // L: 453
													Login.Login_username = Login.Login_username.trim(); // L: 454
													if (Login.Login_username.length() == 0) { // L: 455
														CollisionMap.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 456
														return; // L: 457
													}

													if (Login.Login_password.length() == 0) { // L: 459
														CollisionMap.setLoginResponseString("", "Please enter your password.", ""); // L: 460
														return; // L: 461
													}

													CollisionMap.setLoginResponseString("", "Connecting to server...", ""); // L: 463
													class19.method281(false); // L: 464
													Projectile.updateGameState(20); // L: 465
													return; // L: 466
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SoundCache.field446 == 67) { // L: 469
												Clipboard var19 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 470
												var20 = var19.getContents(class1.client); // L: 471
												var33 = 20 - Login.Login_password.length(); // L: 472
												break;
											}

											if (ItemContainer.method2181(Timer.field3780) && PacketWriter.method2496(Timer.field3780) && Login.Login_password.length() < 20) { // L: 489
												Login.Login_password = Login.Login_password + Timer.field3780; // L: 490
											}
										}
									} while(var33 <= 0); // L: 473

									try {
										String var13 = (String)var20.getTransferData(DataFlavor.stringFlavor); // L: 475
										int var14 = Math.min(var33, var13.length()); // L: 476

										for (int var15 = 0; var15 < var14; ++var15) { // L: 477
											if (!ItemContainer.method2181(var13.charAt(var15)) || !PacketWriter.method2496(var13.charAt(var15))) { // L: 478
												Login.loginIndex = 3; // L: 479
												return; // L: 480
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var14); // L: 483
									} catch (UnsupportedFlavorException var22) { // L: 485
									} catch (IOException var23) { // L: 486
									}
								}
							} else if (Login.loginIndex == 3) { // L: 496
								var27 = Login.loginBoxX + 180; // L: 497
								var8 = 276; // L: 498
								if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 499
									class69.Login_promptCredentials(false); // L: 500
								}

								var27 = Login.loginBoxX + 180; // L: 502
								var8 = 326; // L: 503
								if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 504
									CollisionMap.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 505
									Login.loginIndex = 5; // L: 506
									return; // L: 507
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 510
									var27 = Login.loginBoxX + 180 - 80; // L: 511
									var8 = 321; // L: 512
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 513
										ItemLayer.otp.trim(); // L: 514
										if (ItemLayer.otp.length() != 6) { // L: 515
											CollisionMap.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 516
											return; // L: 517
										}

										class0.field2 = Integer.parseInt(ItemLayer.otp); // L: 519
										ItemLayer.otp = ""; // L: 520
										class19.method281(true); // L: 521
										CollisionMap.setLoginResponseString("", "Connecting to server...", ""); // L: 522
										Projectile.updateGameState(20); // L: 523
										return; // L: 524
									}

									if (var18 == 1 && var25 >= Login.loginBoxX + 180 - 9 && var25 <= Login.loginBoxX + 180 + 130 && var26 >= 263 && var26 <= 296) { // L: 526
										Login.field1022 = !Login.field1022; // L: 527
									}

									if (var18 == 1 && var25 >= Login.loginBoxX + 180 - 34 && var25 <= Login.loginBoxX + 34 + 180 && var26 >= 351 && var26 <= 363) { // L: 529
										AttackOption.openURL(class19.method283("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 530
									}

									var27 = Login.loginBoxX + 180 + 80; // L: 532
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 533
										Login.loginIndex = 0; // L: 534
										Login.Login_username = ""; // L: 535
										Login.Login_password = ""; // L: 536
										class0.field2 = 0; // L: 537
										ItemLayer.otp = ""; // L: 538
									}

									while (SecureRandomCallable.isKeyDown()) { // L: 540
										boolean var9 = false; // L: 541

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 542
											if (Timer.field3780 == "1234567890".charAt(var10)) { // L: 543
												var9 = true; // L: 544
												break; // L: 545
											}
										}

										if (SoundCache.field446 == 13) { // L: 548
											Login.loginIndex = 0; // L: 549
											Login.Login_username = ""; // L: 550
											Login.Login_password = ""; // L: 551
											class0.field2 = 0; // L: 552
											ItemLayer.otp = ""; // L: 553
										} else {
											if (SoundCache.field446 == 85 && ItemLayer.otp.length() > 0) { // L: 556
												ItemLayer.otp = ItemLayer.otp.substring(0, ItemLayer.otp.length() - 1);
											}

											if (SoundCache.field446 == 84) { // L: 557
												ItemLayer.otp.trim(); // L: 558
												if (ItemLayer.otp.length() != 6) { // L: 559
													CollisionMap.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 560
													return; // L: 561
												}

												class0.field2 = Integer.parseInt(ItemLayer.otp); // L: 563
												ItemLayer.otp = ""; // L: 564
												class19.method281(true); // L: 565
												CollisionMap.setLoginResponseString("", "Connecting to server...", ""); // L: 566
												Projectile.updateGameState(20); // L: 567
												return; // L: 568
											}

											if (var9 && ItemLayer.otp.length() < 6) { // L: 570
												ItemLayer.otp = ItemLayer.otp + Timer.field3780;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 574
									var27 = Login.loginBoxX + 180 - 80; // L: 575
									var8 = 321; // L: 576
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 577
										class143.method2810(); // L: 578
										return; // L: 579
									}

									var27 = Login.loginBoxX + 180 + 80; // L: 581
									if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 582
										class69.Login_promptCredentials(true); // L: 583
									}

									var29 = 361; // L: 585
									if (DefaultsGroup.field3891 != null) { // L: 586
										var10 = DefaultsGroup.field3891.highX / 2; // L: 587
										if (var18 == 1 && var25 >= DefaultsGroup.field3891.lowX - var10 && var25 <= var10 + DefaultsGroup.field3891.lowX && var26 >= var29 - 15 && var26 < var29) { // L: 588
											AttackOption.openURL(class19.method283("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 589
										}
									}

									while (SecureRandomCallable.isKeyDown()) { // L: 592
										boolean var31 = false; // L: 593

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 594
											if (Timer.field3780 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 595
												var31 = true; // L: 596
												break; // L: 597
											}
										}

										if (SoundCache.field446 == 13) { // L: 600
											class69.Login_promptCredentials(true); // L: 601
										} else {
											if (SoundCache.field446 == 85 && Login.Login_username.length() > 0) { // L: 604
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (SoundCache.field446 == 84) { // L: 605
												class143.method2810(); // L: 606
												return; // L: 607
											}

											if (var31 && Login.Login_username.length() < 320) { // L: 609
												Login.Login_username = Login.Login_username + Timer.field3780;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 613
									if (Login.loginIndex == 7) { // L: 624
										var27 = Login.loginBoxX + 180 - 80; // L: 625
										var8 = 321; // L: 626
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 627
											AttackOption.openURL(class19.method283("secure", true) + "m=dob/set_dob.ws", true, false); // L: 628
											CollisionMap.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 629
											Login.loginIndex = 6; // L: 630
											return; // L: 631
										}

										var27 = Login.loginBoxX + 180 + 80; // L: 633
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 634
											class69.Login_promptCredentials(true); // L: 635
										}
									} else if (Login.loginIndex == 8) { // L: 638
										var27 = Login.loginBoxX + 180 - 80; // L: 639
										var8 = 321; // L: 640
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 641
											AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 642
											CollisionMap.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 643
											Login.loginIndex = 6; // L: 644
											return; // L: 645
										}

										var27 = Login.loginBoxX + 180 + 80; // L: 647
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 648
											class69.Login_promptCredentials(true); // L: 649
										}
									} else if (Login.loginIndex == 12) { // L: 652
										String var21 = ""; // L: 653
										switch(Login.field1011) { // L: 654
										case 0:
											var21 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 659
											break; // L: 660
										case 1:
											var21 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 656
											break; // L: 657
										default:
											class69.Login_promptCredentials(false); // L: 662
										}

										var30 = Login.loginBoxX + 180; // L: 665
										var29 = 276; // L: 666
										if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 667
											AttackOption.openURL(var21, true, false); // L: 668
											CollisionMap.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 669
											Login.loginIndex = 6; // L: 670
											return; // L: 671
										}

										var30 = Login.loginBoxX + 180; // L: 673
										var29 = 326; // L: 674
										if (var18 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) { // L: 675
											class69.Login_promptCredentials(false); // L: 676
										}
									} else if (Login.loginIndex == 24) { // L: 679
										var27 = Login.loginBoxX + 180; // L: 680
										var8 = 301; // L: 681
										if (var18 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) { // L: 682
											class69.Login_promptCredentials(false); // L: 683
										}
									}
								} else {
									while (true) {
										do {
											if (!SecureRandomCallable.isKeyDown()) { // L: 614
												var28 = 321; // L: 619
												if (var18 == 1 && var26 >= var28 - 20 && var26 <= var28 + 20) { // L: 620
													class69.Login_promptCredentials(true); // L: 621
												}

												return;
											}
										} while(SoundCache.field446 != 84 && SoundCache.field446 != 13); // L: 615

										class69.Login_promptCredentials(true); // L: 616
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 206
}
