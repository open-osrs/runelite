import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1331844199
	)
	@Export("id")
	int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -256285215
	)
	@Export("count")
	int count;
	@ObfuscatedName("w")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("n")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	class194 field2290;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2290 = new class194(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2086831010"
	)
	public int method3949() {
		return this.count;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgq;",
		garbageValue = "1597567435"
	)
	public class194 method3943() {
		return this.field2290;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbn;",
		garbageValue = "1"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = WorldMapSection2.method4414(var1, var0); // L: 38
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3); // L: 46
			int var7 = TaskHandler.archive12.getGroupId(var6); // L: 47
			if (var7 == -1) { // L: 48
				var4 = null; // L: 49
			} else {
				label59: {
					byte[] var8 = TaskHandler.archive12.takeFileFlat(var7); // L: 52
					if (var8 != null) { // L: 53
						if (var8.length <= 1) { // L: 54
							var4 = null; // L: 55
							break label59; // L: 56
						}

						var5 = class145.newScript(var8); // L: 58
						if (var5 != null) { // L: 59
							Script.Script_cached.put(var5, (long)(var3 << 16)); // L: 60
							var4 = var5; // L: 61
							break label59; // L: 62
						}
					}

					var4 = null; // L: 65
				}
			}
		}

		if (var4 != null) { // L: 68
			return var4; // L: 69
		} else {
			int var12 = (-3 - var2 << 8) + var0; // L: 73
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16)); // L: 78
			Script var13;
			if (var14 != null) { // L: 79
				var13 = var14; // L: 80
			} else {
				String var9 = String.valueOf(var12); // L: 83
				int var10 = TaskHandler.archive12.getGroupId(var9); // L: 84
				if (var10 == -1) { // L: 85
					var13 = null; // L: 86
				} else {
					byte[] var11 = TaskHandler.archive12.takeFileFlat(var10); // L: 89
					if (var11 != null) { // L: 90
						if (var11.length <= 1) { // L: 91
							var13 = null; // L: 92
							return var13 != null ? var13 : null; // L: 105 108
						}

						var14 = class145.newScript(var11); // L: 95
						if (var14 != null) { // L: 96
							Script.Script_cached.put(var14, (long)(var12 << 16)); // L: 97
							var13 = var14; // L: 98
							return var13 != null ? var13 : null;
						}
					}

					var13 = null; // L: 102
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Loz;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method3948(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "211610749"
	)
	static String method3944(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 116
			if (var2 && var0 >= 0) { // L: 117
				int var3 = 2; // L: 118

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 119 120 122
					var4 /= var1; // L: 121
				}

				char[] var5 = new char[var3]; // L: 124
				var5[0] = '+'; // L: 125

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 126
					int var7 = var0; // L: 127
					var0 /= var1; // L: 128
					int var8 = var7 - var0 * var1; // L: 129
					if (var8 >= 10) { // L: 130
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 131
					}
				}

				return new String(var5); // L: 133
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lam;Llx;I)V",
		garbageValue = "1471521185"
	)
	static void method3947(GameEngine var0, Font var1) {
		int var5;
		if (Login.worldSelectOpen) { // L: 348
			while (true) {
				if (!NPCComposition.isKeyDown()) { // L: 350
					if (MouseHandler.MouseHandler_lastButton != 1 && (class150.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 371
						break;
					}

					int var2 = Login.xPadding + 280; // L: 372
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 373
						UserComparator3.changeWorldSelectSorting(0, 0); // L: 374
						break; // L: 375
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 377
						UserComparator3.changeWorldSelectSorting(0, 1); // L: 378
						break; // L: 379
					}

					int var3 = Login.xPadding + 390; // L: 381
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 382
						UserComparator3.changeWorldSelectSorting(1, 0); // L: 383
						break; // L: 384
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 386
						UserComparator3.changeWorldSelectSorting(1, 1); // L: 387
						break; // L: 388
					}

					int var35 = Login.xPadding + 500; // L: 390
					if (MouseHandler.MouseHandler_lastPressedX >= var35 && MouseHandler.MouseHandler_lastPressedX <= var35 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 391
						UserComparator3.changeWorldSelectSorting(2, 0); // L: 392
						break; // L: 393
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var35 + 15 && MouseHandler.MouseHandler_lastPressedX <= var35 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 395
						UserComparator3.changeWorldSelectSorting(2, 1); // L: 396
						break; // L: 397
					}

					var5 = Login.xPadding + 610; // L: 399
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 400
						UserComparator3.changeWorldSelectSorting(3, 0); // L: 401
						break; // L: 402
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 404
						UserComparator3.changeWorldSelectSorting(3, 1); // L: 405
						break; // L: 406
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 408
						Login.worldSelectOpen = false; // L: 410
						WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 411
						NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 412
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 413
						break; // L: 415
					}

					if (Login.hoveredWorldIndex != -1) { // L: 417
						World var6 = class334.World_worlds[Login.hoveredWorldIndex]; // L: 418
						BoundaryObject.changeWorld(var6); // L: 419
						Login.worldSelectOpen = false; // L: 421
						WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 422
						NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 423
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 424
					} else {
						if (Login.worldSelectPage > 0 && class11.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class11.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= BoundaryObject.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= BoundaryObject.canvasHeight / 2 + 50) { // L: 428
							--Login.worldSelectPage; // L: 429
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && UrlRequest.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class186.canvasWidth - UrlRequest.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class186.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= BoundaryObject.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= BoundaryObject.canvasHeight / 2 + 50) { // L: 431
							++Login.worldSelectPage; // L: 432
						}
					}
					break;
				}

				if (Players.field1247 == 13) { // L: 351
					Login.worldSelectOpen = false; // L: 353
					WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 354
					NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 355
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 356
					break; // L: 358
				}

				if (Players.field1247 == 96) { // L: 360
					if (Login.worldSelectPage > 0 && class11.worldSelectLeftSprite != null) { // L: 361
						--Login.worldSelectPage; // L: 362
					}
				} else if (Players.field1247 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && UrlRequest.worldSelectRightSprite != null) { // L: 365 366
					++Login.worldSelectPage; // L: 367
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 438
				SecureRandomFuture.clientPreferences.titleMusicDisabled = !SecureRandomFuture.clientPreferences.titleMusicDisabled; // L: 439
				class127.savePreferences(); // L: 440
				if (!SecureRandomFuture.clientPreferences.titleMusicDisabled) { // L: 441
					Players.method2382(WorldMapScaleHandler.archive6, "scape main", "", 255, false);
				} else {
					StructComposition.method3444(); // L: 442
				}
			}

			if (Client.gameState != 5) { // L: 444
				if (-1L == Login.field890) { // L: 445
					Login.field890 = Ignored.method6459() + 1000L; // L: 446
				}

				long var22 = Ignored.method6459(); // L: 448
				boolean var4;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 451
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 455
							var4 = true; // L: 463
							break;
						}

						ArchiveLoader var24 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 456
						if (!var24.isLoaded()) { // L: 457
							var4 = false; // L: 458
							break; // L: 459
						}

						++Client.archiveLoadersDone; // L: 461
					}
				} else {
					var4 = true; // L: 452
				}

				if (var4 && -1L == Login.field869) { // L: 465 466
					Login.field869 = var22; // L: 467
					if (Login.field869 > Login.field890) { // L: 468
						Login.field890 = Login.field869; // L: 469
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 473
					if (Language.Language_EN == ScriptFrame.clientLanguage) { // L: 474
						if (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 475
							var5 = Login.xPadding + 5; // L: 476
							short var25 = 463; // L: 477
							byte var7 = 100; // L: 478
							byte var8 = 35; // L: 479
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var8 + var25) { // L: 480
								if (PlayerComposition.loadWorlds()) { // L: 482
									Login.worldSelectOpen = true; // L: 483
									Login.worldSelectPage = 0; // L: 484
									Login.worldSelectPagesCount = 0; // L: 485
								}

								return; // L: 488
							}
						}

						if (HorizontalAlignment.World_request != null && PlayerComposition.loadWorlds()) { // L: 491 492
							Login.worldSelectOpen = true; // L: 493
							Login.worldSelectPage = 0; // L: 494
							Login.worldSelectPagesCount = 0; // L: 495
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 499
					int var50 = MouseHandler.MouseHandler_lastPressedX; // L: 500
					int var36 = MouseHandler.MouseHandler_lastPressedY; // L: 501
					if (var5 == 0) { // L: 502
						var50 = MouseHandler.MouseHandler_x; // L: 503
						var36 = MouseHandler.MouseHandler_y; // L: 504
					}

					if (!class150.mouseCam && var5 == 4) { // L: 506
						var5 = 1;
					}

					short var39;
					int var41;
					if (Login.loginIndex == 0) { // L: 507
						boolean var48 = false; // L: 508

						while (NPCComposition.isKeyDown()) { // L: 509
							if (Players.field1247 == 84) { // L: 510
								var48 = true; // L: 511
							}
						}

						var41 = class138.loginBoxCenter - 80; // L: 514
						var39 = 291; // L: 515
						if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 516
							WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 517
						}

						var41 = class138.loginBoxCenter + 80; // L: 519
						if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20 || var48) { // L: 520
							if ((Client.worldProperties & 33554432) != 0) { // L: 521
								Login.Login_response0 = ""; // L: 522
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 523
								Login.Login_response2 = "Your normal account will not be affected."; // L: 524
								Login.Login_response3 = ""; // L: 525
								PlayerType.method5521(1); // L: 526
								WorldMapID.method4805(); // L: 527
							} else if ((Client.worldProperties & 4) != 0) { // L: 529
								if ((Client.worldProperties & 1024) != 0) { // L: 530
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 531
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 532
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 533
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 536
									Login.Login_response2 = "Players can attack each other"; // L: 537
									Login.Login_response3 = "almost everywhere."; // L: 538
								}

								Login.Login_response0 = "Warning!"; // L: 540
								PlayerType.method5521(1); // L: 541
								WorldMapID.method4805(); // L: 542
							} else if ((Client.worldProperties & 1024) != 0) { // L: 544
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 545
								Login.Login_response2 = "The Protect Item prayer will"; // L: 546
								Login.Login_response3 = "not work on this world."; // L: 547
								Login.Login_response0 = "Warning!"; // L: 548
								PlayerType.method5521(1); // L: 549
								WorldMapID.method4805(); // L: 550
							} else {
								class67.Login_promptCredentials(false); // L: 553
							}
						}
					} else {
						short var9;
						int var37;
						if (Login.loginIndex == 1) { // L: 557
							while (true) {
								if (!NPCComposition.isKeyDown()) { // L: 558
									var37 = class138.loginBoxCenter - 80; // L: 566
									var9 = 321; // L: 567
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 568
										class67.Login_promptCredentials(false); // L: 569
									}

									var37 = class138.loginBoxCenter + 80; // L: 571
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 572
										PlayerType.method5521(0); // L: 573
									}
									break;
								}

								if (Players.field1247 == 84) { // L: 559
									class67.Login_promptCredentials(false); // L: 560
								} else if (Players.field1247 == 13) { // L: 562
									PlayerType.method5521(0); // L: 563
								}
							}
						} else {
							int var12;
							short var38;
							boolean var40;
							if (Login.loginIndex == 2) { // L: 576
								var38 = 201; // L: 577
								var37 = var38 + 52; // L: 578
								if (var5 == 1 && var36 >= var37 - 12 && var36 < var37 + 2) { // L: 579
									Login.currentLoginField = 0;
								}

								var37 += 15; // L: 580
								if (var5 == 1 && var36 >= var37 - 12 && var36 < var37 + 2) { // L: 581
									Login.currentLoginField = 1;
								}

								var37 += 15; // L: 582
								var38 = 361; // L: 583
								if (WorldMapData_1.field2652 != null) { // L: 584
									var41 = WorldMapData_1.field2652.highX / 2; // L: 585
									if (var5 == 1 && var50 >= WorldMapData_1.field2652.lowX - var41 && var50 <= var41 + WorldMapData_1.field2652.lowX && var36 >= var38 - 15 && var36 < var38) { // L: 586
										switch(Login.field872) { // L: 587
										case 1:
											class19.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 590
											PlayerType.method5521(5); // L: 591
											return; // L: 592
										case 2:
											WorldMapSprite.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 596
										}
									}
								}

								var41 = class138.loginBoxCenter - 80; // L: 602
								var39 = 321; // L: 603
								if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 604
									Login.Login_username = Login.Login_username.trim(); // L: 605
									if (Login.Login_username.length() == 0) { // L: 606
										class19.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 607
										return; // L: 608
									}

									if (Login.Login_password.length() == 0) { // L: 610
										class19.setLoginResponseString("", "Please enter your password.", ""); // L: 611
										return; // L: 612
									}

									class19.setLoginResponseString("", "Connecting to server...", ""); // L: 614
									FriendSystem.method1791(false); // L: 615
									VertexNormal.updateGameState(20); // L: 616
									return; // L: 617
								}

								var41 = Login.loginBoxX + 180 + 80; // L: 619
								if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 620
									PlayerType.method5521(0); // L: 621
									Login.Login_username = ""; // L: 622
									Login.Login_password = ""; // L: 623
									class148.field1651 = 0; // L: 624
									BufferedSource.otp = ""; // L: 625
									Login.field882 = true; // L: 626
								}

								var41 = class138.loginBoxCenter + -117; // L: 628
								var39 = 277; // L: 629
								Login.field880 = var50 >= var41 && var50 < var41 + class315.field3918 && var36 >= var39 && var36 < var39 + Huffman.field3152; // L: 630
								if (var5 == 1 && Login.field880) { // L: 631
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 632
									if (!Client.Login_isUsernameRemembered && SecureRandomFuture.clientPreferences.rememberedUsername != null) { // L: 633
										SecureRandomFuture.clientPreferences.rememberedUsername = null; // L: 634
										class127.savePreferences(); // L: 635
									}
								}

								var41 = class138.loginBoxCenter + 24; // L: 638
								var39 = 277; // L: 639
								Login.field881 = var50 >= var41 && var50 < var41 + class315.field3918 && var36 >= var39 && var36 < var39 + Huffman.field3152; // L: 640
								if (var5 == 1 && Login.field881) { // L: 641
									SecureRandomFuture.clientPreferences.hideUsername = !SecureRandomFuture.clientPreferences.hideUsername; // L: 642
									if (!SecureRandomFuture.clientPreferences.hideUsername) { // L: 643
										Login.Login_username = ""; // L: 644
										SecureRandomFuture.clientPreferences.rememberedUsername = null; // L: 645
										WorldMapID.method4805(); // L: 646
									}

									class127.savePreferences(); // L: 648
								}

								label1392:
								while (true) {
									int var45;
									Transferable var52;
									do {
										while (true) {
											label1306:
											do {
												while (true) {
													while (NPCComposition.isKeyDown()) { // L: 650
														if (Players.field1247 != 13) { // L: 651
															if (Login.currentLoginField != 0) { // L: 660
																continue label1306;
															}

															char var42 = ModeWhere.field3954; // L: 661

															for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var42 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12); ++var12) { // L: 663 664
															}

															if (Players.field1247 == 85 && Login.Login_username.length() > 0) { // L: 667
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (Players.field1247 == 84 || Players.field1247 == 80) { // L: 668
																Login.currentLoginField = 1;
															}

															char var13 = ModeWhere.field3954; // L: 670
															boolean var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var13) != -1; // L: 672
															if (var43 && Login.Login_username.length() < 320) { // L: 674
																Login.Login_username = Login.Login_username + ModeWhere.field3954;
															}
														} else {
															PlayerType.method5521(0); // L: 652
															Login.Login_username = ""; // L: 653
															Login.Login_password = ""; // L: 654
															class148.field1651 = 0; // L: 655
															BufferedSource.otp = ""; // L: 656
															Login.field882 = true; // L: 657
														}
													}

													return; // L: 1034
												}
											} while(Login.currentLoginField != 1); // L: 676

											if (Players.field1247 == 85 && Login.Login_password.length() > 0) { // L: 677
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 678
											} else if (Players.field1247 == 84 || Players.field1247 == 80) { // L: 680
												Login.currentLoginField = 0; // L: 681
												if (Players.field1247 == 84) { // L: 682
													Login.Login_username = Login.Login_username.trim(); // L: 683
													if (Login.Login_username.length() == 0) { // L: 684
														class19.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 685
														return; // L: 686
													}

													if (Login.Login_password.length() == 0) { // L: 688
														class19.setLoginResponseString("", "Please enter your password.", ""); // L: 689
														return; // L: 690
													}

													class19.setLoginResponseString("", "Connecting to server...", ""); // L: 692
													FriendSystem.method1791(false); // L: 693
													VertexNormal.updateGameState(20); // L: 694
													return; // L: 695
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && Players.field1247 == 67) { // L: 698
												Clipboard var51 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 699
												var52 = var51.getContents(class295.client); // L: 700
												var45 = 20 - Login.Login_password.length(); // L: 701
												break;
											}

											char var46 = ModeWhere.field3954; // L: 751
											if (var46 >= ' ' && var46 < 127 || var46 > 127 && var46 < 160 || var46 > 160 && var46 <= 255) { // L: 753
												var40 = true; // L: 754
											} else {
												label1540: {
													if (var46 != 0) { // L: 757
														char[] var53 = class328.cp1252AsciiExtension; // L: 759

														for (int var30 = 0; var30 < var53.length; ++var30) { // L: 760
															char var15 = var53[var30]; // L: 761
															if (var15 == var46) { // L: 763
																var40 = true; // L: 764
																break label1540; // L: 765
															}
														}
													}

													var40 = false; // L: 771
												}
											}

											if (var40) { // L: 773
												char var54 = ModeWhere.field3954; // L: 775
												boolean var44 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var54) != -1; // L: 777
												if (var44 && Login.Login_password.length() < 20) { // L: 779 780
													Login.Login_password = Login.Login_password + ModeWhere.field3954; // L: 781
												}
											}
										}
									} while(var45 <= 0); // L: 702

									try {
										String var14 = (String)var52.getTransferData(DataFlavor.stringFlavor); // L: 704
										int var47 = Math.min(var45, var14.length()); // L: 705
										int var16 = 0;

										while (true) {
											if (var16 >= var47) {
												Login.Login_password = Login.Login_password + var14.substring(0, var47); // L: 743
												continue label1392;
											}

											char var18 = var14.charAt(var16); // L: 709
											boolean var17;
											if (var18 >= ' ' && var18 < 127 || var18 > 127 && var18 < 160 || var18 > 160 && var18 <= 255) { // L: 711
												var17 = true; // L: 712
											} else {
												label1541: {
													if (var18 != 0) { // L: 715
														char[] var19 = class328.cp1252AsciiExtension; // L: 717

														for (int var20 = 0; var20 < var19.length; ++var20) { // L: 718
															char var21 = var19[var20]; // L: 719
															if (var18 == var21) { // L: 721
																var17 = true; // L: 722
																break label1541; // L: 723
															}
														}
													}

													var17 = false; // L: 729
												}
											}

											if (!var17) { // L: 731
												break;
											}

											char var49 = var14.charAt(var16); // L: 733
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var49) != -1; // L: 735
											if (!var28) { // L: 737
												break;
											}

											++var16; // L: 706
										}

										PlayerType.method5521(3); // L: 739
										return; // L: 740
									} catch (UnsupportedFlavorException var33) { // L: 745
									} catch (IOException var34) { // L: 746
									}
								}
							} else if (Login.loginIndex == 3) { // L: 790
								var37 = Login.loginBoxX + 180; // L: 791
								var9 = 276; // L: 792
								if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 793
									class185.method3731(false); // L: 794
								}

								var37 = Login.loginBoxX + 180; // L: 796
								var9 = 326; // L: 797
								if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 798
									class19.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 799
									PlayerType.method5521(5); // L: 800
									return; // L: 801
								}
							} else {
								int var11;
								if (Login.loginIndex == 4) { // L: 804
									var37 = Login.loginBoxX + 180 - 80; // L: 805
									var9 = 321; // L: 806
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 807
										BufferedSource.otp.trim(); // L: 808
										if (BufferedSource.otp.length() != 6) { // L: 809
											class19.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 810
											return; // L: 811
										}

										class148.field1651 = Integer.parseInt(BufferedSource.otp); // L: 813
										BufferedSource.otp = ""; // L: 814
										FriendSystem.method1791(true); // L: 815
										class19.setLoginResponseString("", "Connecting to server...", ""); // L: 816
										VertexNormal.updateGameState(20); // L: 817
										return; // L: 818
									}

									if (var5 == 1 && var50 >= Login.loginBoxX + 180 - 9 && var50 <= Login.loginBoxX + 180 + 130 && var36 >= 263 && var36 <= 296) { // L: 820
										Login.field882 = !Login.field882; // L: 821
									}

									if (var5 == 1 && var50 >= Login.loginBoxX + 180 - 34 && var50 <= Login.loginBoxX + 34 + 180 && var36 >= 351 && var36 <= 363) { // L: 823
										WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 824
									}

									var37 = Login.loginBoxX + 180 + 80; // L: 826
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 827
										PlayerType.method5521(0); // L: 828
										Login.Login_username = ""; // L: 829
										Login.Login_password = ""; // L: 830
										class148.field1651 = 0; // L: 831
										BufferedSource.otp = ""; // L: 832
									}

									while (NPCComposition.isKeyDown()) { // L: 834
										boolean var10 = false; // L: 835

										for (var11 = 0; var11 < "1234567890".length(); ++var11) { // L: 836
											if (ModeWhere.field3954 == "1234567890".charAt(var11)) { // L: 837
												var10 = true; // L: 838
												break; // L: 839
											}
										}

										if (Players.field1247 == 13) { // L: 842
											PlayerType.method5521(0); // L: 843
											Login.Login_username = ""; // L: 844
											Login.Login_password = ""; // L: 845
											class148.field1651 = 0; // L: 846
											BufferedSource.otp = ""; // L: 847
										} else {
											if (Players.field1247 == 85 && BufferedSource.otp.length() > 0) { // L: 850
												BufferedSource.otp = BufferedSource.otp.substring(0, BufferedSource.otp.length() - 1);
											}

											if (Players.field1247 == 84) { // L: 851
												BufferedSource.otp.trim(); // L: 852
												if (BufferedSource.otp.length() != 6) { // L: 853
													class19.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 854
													return; // L: 855
												}

												class148.field1651 = Integer.parseInt(BufferedSource.otp); // L: 857
												BufferedSource.otp = ""; // L: 858
												FriendSystem.method1791(true); // L: 859
												class19.setLoginResponseString("", "Connecting to server...", ""); // L: 860
												VertexNormal.updateGameState(20); // L: 861
												return; // L: 862
											}

											if (var10 && BufferedSource.otp.length() < 6) { // L: 864
												BufferedSource.otp = BufferedSource.otp + ModeWhere.field3954;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 868
									var37 = Login.loginBoxX + 180 - 80; // L: 869
									var9 = 321; // L: 870
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 871
										WorldMapRectangle.method4793(); // L: 872
										return; // L: 873
									}

									var37 = Login.loginBoxX + 180 + 80; // L: 875
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 876
										class67.Login_promptCredentials(true); // L: 877
									}

									var39 = 361; // L: 879
									if (MouseRecorder.field1044 != null) { // L: 880
										var11 = MouseRecorder.field1044.highX / 2; // L: 881
										if (var5 == 1 && var50 >= MouseRecorder.field1044.lowX - var11 && var50 <= var11 + MouseRecorder.field1044.lowX && var36 >= var39 - 15 && var36 < var39) { // L: 882
											WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 883
										}
									}

									while (NPCComposition.isKeyDown()) { // L: 886
										var40 = false; // L: 887

										for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var12) { // L: 888
											if (ModeWhere.field3954 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12)) { // L: 889
												var40 = true; // L: 890
												break; // L: 891
											}
										}

										if (Players.field1247 == 13) { // L: 894
											class67.Login_promptCredentials(true); // L: 895
										} else {
											if (Players.field1247 == 85 && Login.Login_username.length() > 0) { // L: 898
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (Players.field1247 == 84) { // L: 899
												WorldMapRectangle.method4793(); // L: 900
												return; // L: 901
											}

											if (var40 && Login.Login_username.length() < 320) { // L: 903
												Login.Login_username = Login.Login_username + ModeWhere.field3954;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 907
									if (Login.loginIndex == 7) { // L: 918
										var37 = Login.loginBoxX + 180 - 80; // L: 919
										var9 = 321; // L: 920
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 921
											WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=dob/set_dob.ws", true, false); // L: 922
											class19.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 923
											PlayerType.method5521(6); // L: 924
											return; // L: 925
										}

										var37 = Login.loginBoxX + 180 + 80; // L: 927
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 928
											class67.Login_promptCredentials(true); // L: 929
										}
									} else if (Login.loginIndex == 8) { // L: 932
										var37 = Login.loginBoxX + 180 - 80; // L: 933
										var9 = 321; // L: 934
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 935
											WorldMapSprite.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 936
											class19.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 937
											PlayerType.method5521(6); // L: 938
											return; // L: 939
										}

										var37 = Login.loginBoxX + 180 + 80; // L: 941
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 942
											class67.Login_promptCredentials(true); // L: 943
										}
									} else if (Login.loginIndex == 9) { // L: 946
										var37 = Login.loginBoxX + 180; // L: 947
										var9 = 311; // L: 948
										if (Players.field1247 == 84 || Players.field1247 == 13 || var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 949
											class185.method3731(false); // L: 950
										}
									} else if (Login.loginIndex == 10) { // L: 953
										var37 = Login.loginBoxX + 180; // L: 954
										var9 = 209; // L: 955
										if (Players.field1247 == 84 || var5 == 1 && var50 >= var37 - 109 && var50 <= var37 + 109 && var36 >= var9 && var36 <= var9 + 68) { // L: 956
											class19.setLoginResponseString("", "Connecting to server...", ""); // L: 957
											Client.field508 = class422.field4524; // L: 958
											FriendSystem.method1791(false); // L: 959
											VertexNormal.updateGameState(20); // L: 960
										}
									} else if (Login.loginIndex == 12) { // L: 963
										var37 = class138.loginBoxCenter; // L: 964
										var9 = 233; // L: 965
										Bounds var31 = var1.method6091(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var37, var9); // L: 966
										Bounds var26 = var1.method6091(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var37, var9); // L: 967
										Bounds var27 = var1.method6091(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var37, var9); // L: 968
										var41 = var9 + 17; // L: 969
										Bounds var29 = var1.method6091(0, 34, "<col=ffd200>agreement (EULA)</col>.", var37, var41); // L: 970
										if (var5 == 1) { // L: 971
											if (var31.method6577(var50, var36)) { // L: 972
												WorldMapSprite.openURL("https://www.jagex.com/terms", true, false); // L: 973
											} else if (var26.method6577(var50, var36)) { // L: 975
												WorldMapSprite.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 976
											} else if (var27.method6577(var50, var36) || var29.method6577(var50, var36)) { // L: 978
												WorldMapSprite.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 979
											}
										}

										var37 = class138.loginBoxCenter - 80; // L: 982
										var9 = 311; // L: 983
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 984
											UserComparator6.method2549(); // L: 985
											class185.method3731(true); // L: 986
										}

										var37 = class138.loginBoxCenter + 80; // L: 988
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 989
											Login.loginIndex = 13; // L: 990
										}
									} else if (Login.loginIndex == 13) { // L: 993
										var37 = class138.loginBoxCenter; // L: 994
										var9 = 321; // L: 995
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 996
											class185.method3731(true); // L: 997
										}
									} else if (Login.loginIndex == 14) { // L: 1000
										String var32 = ""; // L: 1001
										switch(Login.field871) { // L: 1002
										case 0:
											var32 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 1007
											break; // L: 1008
										case 1:
											var32 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 1004
											break; // L: 1005
										default:
											class67.Login_promptCredentials(false); // L: 1010
										}

										var41 = Login.loginBoxX + 180; // L: 1013
										var39 = 276; // L: 1014
										if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 1015
											WorldMapSprite.openURL(var32, true, false); // L: 1016
											class19.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 1017
											PlayerType.method5521(6); // L: 1018
											return; // L: 1019
										}

										var41 = Login.loginBoxX + 180; // L: 1021
										var39 = 326; // L: 1022
										if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) { // L: 1023
											class67.Login_promptCredentials(false); // L: 1024
										}
									} else if (Login.loginIndex == 24) { // L: 1027
										var37 = Login.loginBoxX + 180; // L: 1028
										var9 = 301; // L: 1029
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) { // L: 1030
											class185.method3731(false); // L: 1031
										}
									}
								} else {
									while (true) {
										do {
											if (!NPCComposition.isKeyDown()) { // L: 908
												var38 = 321; // L: 913
												if (var5 == 1 && var36 >= var38 - 20 && var36 <= var38 + 20) { // L: 914
													class67.Login_promptCredentials(true); // L: 915
												}

												return;
											}
										} while(Players.field1247 != 84 && Players.field1247 != 13); // L: 909

										class67.Login_promptCredentials(true); // L: 910
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 436

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		BufferedSource.method6516(); // L: 12465
		if (Players.friendsChat != null) { // L: 12466
			Players.friendsChat.invalidateIgnoreds(); // L: 12467
		}

	} // L: 12469
}
