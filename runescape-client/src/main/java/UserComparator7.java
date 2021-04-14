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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dh")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;I)I",
		garbageValue = "-465902583"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-770449800"
	)
	static int method2431(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			var4 = class139.getWidget(var3); // L: 559
		} else {
			var4 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 561
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 562
			class16.Interpreter_intStackSize -= 4; // L: 563
			var4.rawX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			class29.invalidateWidget(var4);
			class10.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) { // L: 570
				UserList.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class16.Interpreter_intStackSize -= 4; // L: 574
			var4.rawWidth = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			class29.invalidateWidget(var4);
			class10.client.alignWidget(var4); // L: 580
			if (var3 != -1 && var4.type == 0) { // L: 581
				UserList.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class29.invalidateWidget(var4); // L: 588
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 592
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 593
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
			return 1; // L: 598
		} else {
			return 2; // L: 600
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lal;B)V",
		garbageValue = "0"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) { // L: 217
			class223.method4238(var0); // L: 218
		} else {
			int var3;
			if ((MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 221
				Login.clientPreferences.titleMusicDisabled = !Login.clientPreferences.titleMusicDisabled; // L: 222
				Message.savePreferences(); // L: 223
				if (!Login.clientPreferences.titleMusicDisabled) { // L: 224
					Archive var1 = class8.archive6; // L: 225
					int var2 = var1.getGroupId("scape main"); // L: 227
					var3 = var1.getFileId(var2, ""); // L: 228
					PacketBufferNode.method3898(var1, var2, var3, 255, false); // L: 229
				} else {
					class210.midiPcmStream.clear(); // L: 233
					class210.musicPlayerStatus = 1; // L: 234
					class210.musicTrackArchive = null; // L: 235
				}
			}

			if (Client.gameState != 5) { // L: 238
				if (-1L == Login.field991) { // L: 239
					Login.field991 = ObjectSound.currentTimeMillis() + 1000L; // L: 240
				}

				long var15 = ObjectSound.currentTimeMillis(); // L: 242
				if (class3.method63() && -1L == Login.field1016) { // L: 243 244
					Login.field1016 = var15; // L: 245
					if (Login.field1016 > Login.field991) { // L: 246
						Login.field991 = Login.field1016; // L: 247
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 251
					if (class35.clientLanguage == Language.Language_EN) { // L: 252
						if (MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 253
							var3 = Login.xPadding + 5; // L: 254
							short var4 = 463; // L: 255
							byte var5 = 100; // L: 256
							byte var6 = 35; // L: 257
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + var5 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var4 + var6) { // L: 258
								class18.method283(); // L: 259
								return; // L: 260
							}
						}

						if (World.World_request != null) { // L: 263
							class18.method283();
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton; // L: 265
					int var22 = MouseHandler.MouseHandler_lastPressedX; // L: 266
					int var23 = MouseHandler.MouseHandler_lastPressedY; // L: 267
					if (var3 == 0) { // L: 268
						var22 = MouseHandler.MouseHandler_x; // L: 269
						var23 = MouseHandler.MouseHandler_y; // L: 270
					}

					if (!MouseHandler.mouseCam && var3 == 4) { // L: 272
						var3 = 1;
					}

					short var26;
					int var27;
					if (Login.loginIndex == 0) { // L: 273
						boolean var30 = false; // L: 274

						while (class231.isKeyDown()) { // L: 275
							if (class19.field146 == 84) { // L: 276
								var30 = true; // L: 277
							}
						}

						var27 = GraphicsObject.loginBoxCenter - 80; // L: 280
						var26 = 291; // L: 281
						if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) { // L: 282
							class302.openURL(FontName.method6285("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 283
						}

						var27 = GraphicsObject.loginBoxCenter + 80; // L: 285
						if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20 || var30) { // L: 286
							if ((Client.worldProperties & 33554432) != 0) { // L: 287
								Login.Login_response0 = ""; // L: 288
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 289
								Login.Login_response2 = "Your normal account will not be affected."; // L: 290
								Login.Login_response3 = ""; // L: 291
								Login.loginIndex = 1; // L: 292
								Canvas.method481(); // L: 293
							} else if ((Client.worldProperties & 4) != 0) { // L: 295
								if ((Client.worldProperties & 1024) != 0) { // L: 296
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 297
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 298
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 299
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 302
									Login.Login_response2 = "Players can attack each other"; // L: 303
									Login.Login_response3 = "almost everywhere."; // L: 304
								}

								Login.Login_response0 = "Warning!"; // L: 306
								Login.loginIndex = 1; // L: 307
								Canvas.method481(); // L: 308
							} else if ((Client.worldProperties & 1024) != 0) { // L: 310
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 311
								Login.Login_response2 = "The Protect Item prayer will"; // L: 312
								Login.Login_response3 = "not work on this world."; // L: 313
								Login.Login_response0 = "Warning!"; // L: 314
								Login.loginIndex = 1; // L: 315
								Canvas.method481(); // L: 316
							} else {
								class25.Login_promptCredentials(false); // L: 319
							}
						}
					} else {
						short var7;
						int var24;
						if (Login.loginIndex == 1) { // L: 323
							while (true) {
								if (!class231.isKeyDown()) { // L: 324
									var24 = GraphicsObject.loginBoxCenter - 80; // L: 332
									var7 = 321; // L: 333
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 334
										class25.Login_promptCredentials(false); // L: 335
									}

									var24 = GraphicsObject.loginBoxCenter + 80; // L: 337
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 338
										Login.loginIndex = 0; // L: 339
									}
									break;
								}

								if (class19.field146 == 84) { // L: 325
									class25.Login_promptCredentials(false); // L: 326
								} else if (class19.field146 == 13) { // L: 328
									Login.loginIndex = 0; // L: 329
								}
							}
						} else {
							int var10;
							short var25;
							if (Login.loginIndex == 2) { // L: 342
								var25 = 201; // L: 343
								var24 = var25 + 52; // L: 344
								if (var3 == 1 && var23 >= var24 - 12 && var23 < var24 + 2) { // L: 345
									Login.currentLoginField = 0;
								}

								var24 += 15; // L: 346
								if (var3 == 1 && var23 >= var24 - 12 && var23 < var24 + 2) { // L: 347
									Login.currentLoginField = 1;
								}

								var24 += 15; // L: 348
								var25 = 361; // L: 349
								if (ChatChannel.field1084 != null) { // L: 350
									var27 = ChatChannel.field1084.highX / 2; // L: 351
									if (var3 == 1 && var22 >= ChatChannel.field1084.lowX - var27 && var22 <= var27 + ChatChannel.field1084.lowX && var23 >= var25 - 15 && var23 < var25) { // L: 352
										switch(Login.field994) { // L: 353
										case 1:
											class9.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 356
											Login.loginIndex = 5; // L: 357
											return; // L: 358
										case 2:
											class302.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 362
										}
									}
								}

								var27 = GraphicsObject.loginBoxCenter - 80; // L: 368
								var26 = 321; // L: 369
								if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) { // L: 370
									Login.Login_username = Login.Login_username.trim(); // L: 371
									if (Login.Login_username.length() == 0) { // L: 372
										class9.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 373
										return; // L: 374
									}

									if (Login.Login_password.length() == 0) { // L: 376
										class9.setLoginResponseString("", "Please enter your password.", ""); // L: 377
										return; // L: 378
									}

									class9.setLoginResponseString("", "Connecting to server...", ""); // L: 380
									TriBool.method5818(false); // L: 381
									class20.updateGameState(20); // L: 382
									return; // L: 383
								}

								var27 = Login.loginBoxX + 180 + 80; // L: 385
								if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) { // L: 386
									Login.loginIndex = 0; // L: 387
									Login.Login_username = ""; // L: 388
									Login.Login_password = ""; // L: 389
									class139.field1560 = 0; // L: 390
									Bounds.otp = ""; // L: 391
									Login.field1005 = true; // L: 392
								}

								var27 = GraphicsObject.loginBoxCenter + -117; // L: 394
								var26 = 277; // L: 395
								Login.field1003 = var22 >= var27 && var22 < var27 + class225.field2777 && var23 >= var26 && var23 < var26 + class34.field232; // L: 396
								if (var3 == 1 && Login.field1003) { // L: 397
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 398
									if (!Client.Login_isUsernameRemembered && Login.clientPreferences.rememberedUsername != null) { // L: 399
										Login.clientPreferences.rememberedUsername = null; // L: 400
										Message.savePreferences(); // L: 401
									}
								}

								var27 = GraphicsObject.loginBoxCenter + 24; // L: 404
								var26 = 277; // L: 405
								Login.field1012 = var22 >= var27 && var22 < var27 + class225.field2777 && var23 >= var26 && var23 < var26 + class34.field232; // L: 406
								if (var3 == 1 && Login.field1012) { // L: 407
									Login.clientPreferences.hideUsername = !Login.clientPreferences.hideUsername; // L: 408
									if (!Login.clientPreferences.hideUsername) { // L: 409
										Login.Login_username = ""; // L: 410
										Login.clientPreferences.rememberedUsername = null; // L: 411
										Canvas.method481(); // L: 412
									}

									Message.savePreferences(); // L: 414
								}

								while (true) {
									int var11;
									Transferable var18;
									do {
										while (true) {
											label882:
											do {
												while (true) {
													while (class231.isKeyDown()) { // L: 416
														if (class19.field146 != 13) { // L: 417
															if (Login.currentLoginField != 0) { // L: 426
																continue label882;
															}

															char var29 = Message.field591; // L: 427

															for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var29 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10); ++var10) { // L: 429 430
															}

															if (class19.field146 == 85 && Login.Login_username.length() > 0) { // L: 433
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class19.field146 == 84 || class19.field146 == 80) { // L: 434
																Login.currentLoginField = 1;
															}

															if (class4.method76(Message.field591) && Login.Login_username.length() < 320) { // L: 435
																Login.Login_username = Login.Login_username + Message.field591;
															}
														} else {
															Login.loginIndex = 0; // L: 418
															Login.Login_username = ""; // L: 419
															Login.Login_password = ""; // L: 420
															class139.field1560 = 0; // L: 421
															Bounds.otp = ""; // L: 422
															Login.field1005 = true; // L: 423
														}
													}

													return; // L: 676
												}
											} while(Login.currentLoginField != 1); // L: 437

											if (class19.field146 == 85 && Login.Login_password.length() > 0) { // L: 438
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 439
											} else if (class19.field146 == 84 || class19.field146 == 80) { // L: 441
												Login.currentLoginField = 0; // L: 442
												if (class19.field146 == 84) { // L: 443
													Login.Login_username = Login.Login_username.trim(); // L: 444
													if (Login.Login_username.length() == 0) { // L: 445
														class9.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 446
														return; // L: 447
													}

													if (Login.Login_password.length() == 0) { // L: 449
														class9.setLoginResponseString("", "Please enter your password.", ""); // L: 450
														return; // L: 451
													}

													class9.setLoginResponseString("", "Connecting to server...", ""); // L: 453
													TriBool.method5818(false); // L: 454
													class20.updateGameState(20); // L: 455
													return; // L: 456
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class19.field146 == 67) { // L: 459
												Clipboard var17 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 460
												var18 = var17.getContents(class10.client); // L: 461
												var11 = 20 - Login.Login_password.length(); // L: 462
												break;
											}

											if (Players.method2287(Message.field591) && class4.method76(Message.field591) && Login.Login_password.length() < 20) { // L: 479
												Login.Login_password = Login.Login_password + Message.field591; // L: 480
											}
										}
									} while(var11 <= 0); // L: 463

									try {
										String var12 = (String)var18.getTransferData(DataFlavor.stringFlavor); // L: 465
										int var13 = Math.min(var11, var12.length()); // L: 466

										for (int var14 = 0; var14 < var13; ++var14) { // L: 467
											if (!Players.method2287(var12.charAt(var14)) || !class4.method76(var12.charAt(var14))) { // L: 468
												Login.loginIndex = 3; // L: 469
												return; // L: 470
											}
										}

										Login.Login_password = Login.Login_password + var12.substring(0, var13); // L: 473
									} catch (UnsupportedFlavorException var20) { // L: 475
									} catch (IOException var21) { // L: 476
									}
								}
							} else if (Login.loginIndex == 3) { // L: 486
								var24 = Login.loginBoxX + 180; // L: 487
								var7 = 276; // L: 488
								if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 489
									class25.Login_promptCredentials(false); // L: 490
								}

								var24 = Login.loginBoxX + 180; // L: 492
								var7 = 326; // L: 493
								if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 494
									class9.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 495
									Login.loginIndex = 5; // L: 496
									return; // L: 497
								}
							} else {
								int var9;
								if (Login.loginIndex == 4) { // L: 500
									var24 = Login.loginBoxX + 180 - 80; // L: 501
									var7 = 321; // L: 502
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 503
										Bounds.otp.trim(); // L: 504
										if (Bounds.otp.length() != 6) { // L: 505
											class9.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 506
											return; // L: 507
										}

										class139.field1560 = Integer.parseInt(Bounds.otp); // L: 509
										Bounds.otp = ""; // L: 510
										TriBool.method5818(true); // L: 511
										class9.setLoginResponseString("", "Connecting to server...", ""); // L: 512
										class20.updateGameState(20); // L: 513
										return; // L: 514
									}

									if (var3 == 1 && var22 >= Login.loginBoxX + 180 - 9 && var22 <= Login.loginBoxX + 180 + 130 && var23 >= 263 && var23 <= 296) { // L: 516
										Login.field1005 = !Login.field1005; // L: 517
									}

									if (var3 == 1 && var22 >= Login.loginBoxX + 180 - 34 && var22 <= Login.loginBoxX + 34 + 180 && var23 >= 351 && var23 <= 363) { // L: 519
										class302.openURL(FontName.method6285("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 520
									}

									var24 = Login.loginBoxX + 180 + 80; // L: 522
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 523
										Login.loginIndex = 0; // L: 524
										Login.Login_username = ""; // L: 525
										Login.Login_password = ""; // L: 526
										class139.field1560 = 0; // L: 527
										Bounds.otp = ""; // L: 528
									}

									while (class231.isKeyDown()) { // L: 530
										boolean var8 = false; // L: 531

										for (var9 = 0; var9 < "1234567890".length(); ++var9) { // L: 532
											if (Message.field591 == "1234567890".charAt(var9)) { // L: 533
												var8 = true; // L: 534
												break; // L: 535
											}
										}

										if (class19.field146 == 13) { // L: 538
											Login.loginIndex = 0; // L: 539
											Login.Login_username = ""; // L: 540
											Login.Login_password = ""; // L: 541
											class139.field1560 = 0; // L: 542
											Bounds.otp = ""; // L: 543
										} else {
											if (class19.field146 == 85 && Bounds.otp.length() > 0) { // L: 546
												Bounds.otp = Bounds.otp.substring(0, Bounds.otp.length() - 1);
											}

											if (class19.field146 == 84) { // L: 547
												Bounds.otp.trim(); // L: 548
												if (Bounds.otp.length() != 6) { // L: 549
													class9.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 550
													return; // L: 551
												}

												class139.field1560 = Integer.parseInt(Bounds.otp); // L: 553
												Bounds.otp = ""; // L: 554
												TriBool.method5818(true); // L: 555
												class9.setLoginResponseString("", "Connecting to server...", ""); // L: 556
												class20.updateGameState(20); // L: 557
												return; // L: 558
											}

											if (var8 && Bounds.otp.length() < 6) { // L: 560
												Bounds.otp = Bounds.otp + Message.field591;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 564
									var24 = Login.loginBoxX + 180 - 80; // L: 565
									var7 = 321; // L: 566
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 567
										class18.method282(); // L: 568
										return; // L: 569
									}

									var24 = Login.loginBoxX + 180 + 80; // L: 571
									if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 572
										class25.Login_promptCredentials(true); // L: 573
									}

									var26 = 361; // L: 575
									if (ModeWhere.field3378 != null) { // L: 576
										var9 = ModeWhere.field3378.highX / 2; // L: 577
										if (var3 == 1 && var22 >= ModeWhere.field3378.lowX - var9 && var22 <= var9 + ModeWhere.field3378.lowX && var23 >= var26 - 15 && var23 < var26) { // L: 578
											class302.openURL(FontName.method6285("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 579
										}
									}

									while (class231.isKeyDown()) { // L: 582
										boolean var28 = false; // L: 583

										for (var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) { // L: 584
											if (Message.field591 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) { // L: 585
												var28 = true; // L: 586
												break; // L: 587
											}
										}

										if (class19.field146 == 13) { // L: 590
											class25.Login_promptCredentials(true); // L: 591
										} else {
											if (class19.field146 == 85 && Login.Login_username.length() > 0) { // L: 594
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class19.field146 == 84) { // L: 595
												class18.method282(); // L: 596
												return; // L: 597
											}

											if (var28 && Login.Login_username.length() < 320) { // L: 599
												Login.Login_username = Login.Login_username + Message.field591;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 603
									if (Login.loginIndex == 7) { // L: 614
										var24 = Login.loginBoxX + 180 - 80; // L: 615
										var7 = 321; // L: 616
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 617
											class302.openURL(FontName.method6285("secure", true) + "m=dob/set_dob.ws", true, false); // L: 618
											class9.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 619
											Login.loginIndex = 6; // L: 620
											return; // L: 621
										}

										var24 = Login.loginBoxX + 180 + 80; // L: 623
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 624
											class25.Login_promptCredentials(true); // L: 625
										}
									} else if (Login.loginIndex == 8) { // L: 628
										var24 = Login.loginBoxX + 180 - 80; // L: 629
										var7 = 321; // L: 630
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 631
											class302.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 632
											class9.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 633
											Login.loginIndex = 6; // L: 634
											return; // L: 635
										}

										var24 = Login.loginBoxX + 180 + 80; // L: 637
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 638
											class25.Login_promptCredentials(true); // L: 639
										}
									} else if (Login.loginIndex == 12) { // L: 642
										String var19 = ""; // L: 643
										switch(Login.field993) { // L: 644
										case 0:
											var19 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 649
											break; // L: 650
										case 1:
											var19 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 646
											break; // L: 647
										default:
											class25.Login_promptCredentials(false); // L: 652
										}

										var27 = Login.loginBoxX + 180; // L: 655
										var26 = 276; // L: 656
										if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) { // L: 657
											class302.openURL(var19, true, false); // L: 658
											class9.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 659
											Login.loginIndex = 6; // L: 660
											return; // L: 661
										}

										var27 = Login.loginBoxX + 180; // L: 663
										var26 = 326; // L: 664
										if (var3 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) { // L: 665
											class25.Login_promptCredentials(false); // L: 666
										}
									} else if (Login.loginIndex == 24) { // L: 669
										var24 = Login.loginBoxX + 180; // L: 670
										var7 = 301; // L: 671
										if (var3 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var7 - 20 && var23 <= var7 + 20) { // L: 672
											class25.Login_promptCredentials(false); // L: 673
										}
									}
								} else {
									while (true) {
										do {
											if (!class231.isKeyDown()) { // L: 604
												var25 = 321; // L: 609
												if (var3 == 1 && var23 >= var25 - 20 && var23 <= var25 + 20) { // L: 610
													class25.Login_promptCredentials(true); // L: 611
												}

												return;
											}
										} while(class19.field146 != 84 && class19.field146 != 13); // L: 605

										class25.Login_promptCredentials(true); // L: 606
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 219

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1516268196"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 4638
		int var4 = var1 >> 7; // L: 4639
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 4640
			int var5 = var2; // L: 4641
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 4642
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 4643
			int var7 = var1 & 127; // L: 4644
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 4645
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 4646
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 4647
		} else {
			return 0;
		}
	}
}
