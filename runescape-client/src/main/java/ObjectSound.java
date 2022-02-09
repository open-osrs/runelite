import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1786252123
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2120521357
	)
	int field820;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2074760199
	)
	@Export("x")
	int x;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -997931779
	)
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1792934911
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1121538931
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1848798585
	)
	int field822;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1730887729
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1302815923
	)
	int field830;
	@ObfuscatedName("h")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 368518999
	)
	int field826;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1608300064"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 44
		ObjectComposition var2 = this.obj.transform(); // L: 45
		if (var2 != null) { // L: 46
			this.soundEffectId = var2.ambientSoundId; // L: 47
			this.field822 = var2.int7 * 128; // L: 48
			this.field820 = var2.int5; // L: 49
			this.field830 = var2.int6; // L: 50
			this.soundEffectIds = var2.soundEffectIds; // L: 51
		} else {
			this.soundEffectId = -1; // L: 54
			this.field822 = 0; // L: 55
			this.field820 = 0; // L: 56
			this.field830 = 0; // L: 57
			this.soundEffectIds = null; // L: 58
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 60
			class123.pcmStreamMixer.removeSubStream(this.stream1); // L: 61
			this.stream1 = null; // L: 62
		}

	} // L: 64

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;I)V",
		garbageValue = "754798947"
	)
	public static void method1743(AbstractArchive var0) {
	} // L: 16

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;Llv;B)V",
		garbageValue = "-36"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (DirectByteArrayCopier.canvasWidth - 765) / 2; // L: 1380
		Login.loginBoxX = Login.xPadding + 202; // L: 1381
		class4.loginBoxCenter = Login.loginBoxX + 180; // L: 1382
		byte var3;
		int var4;
		int var9;
		int var11;
		int var14;
		int var26;
		int var27;
		int var33;
		int var42;
		int var43;
		if (Login.worldSelectOpen) { // L: 1383
			if (WorldMapRectangle.worldSelectBackSprites == null) { // L: 1385
				WorldMapRectangle.worldSelectBackSprites = ArchiveLoader.method2061(Message.archive8, "sl_back", "");
			}

			if (Occluder.worldSelectFlagSprites == null) { // L: 1386
				Occluder.worldSelectFlagSprites = Huffman.method5278(Message.archive8, "sl_flags", "");
			}

			if (VertexNormal.worldSelectArrows == null) { // L: 1387
				VertexNormal.worldSelectArrows = Huffman.method5278(Message.archive8, "sl_arrows", "");
			}

			if (Archive.worldSelectStars == null) { // L: 1388
				Archive.worldSelectStars = Huffman.method5278(Message.archive8, "sl_stars", "");
			}

			if (class186.worldSelectLeftSprite == null) { // L: 1389
				class186.worldSelectLeftSprite = class91.SpriteBuffer_getIndexedSpriteByName(Message.archive8, "leftarrow", "");
			}

			if (DirectByteArrayCopier.worldSelectRightSprite == null) { // L: 1390
				DirectByteArrayCopier.worldSelectRightSprite = class91.SpriteBuffer_getIndexedSpriteByName(Message.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1391
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1392
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1393
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1394
			if (Archive.worldSelectStars != null) { // L: 1395
				Archive.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1396
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1397
				Archive.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1398
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1399
			}

			if (VertexNormal.worldSelectArrows != null) { // L: 1401
				var33 = Login.xPadding + 280; // L: 1402
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1403
					VertexNormal.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					VertexNormal.worldSelectArrows[0].drawAt(var33, 4); // L: 1404
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1405
					VertexNormal.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					VertexNormal.worldSelectArrows[1].drawAt(var33 + 15, 4); // L: 1406
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1); // L: 1407
				var4 = Login.xPadding + 390; // L: 1408
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1409
					VertexNormal.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					VertexNormal.worldSelectArrows[0].drawAt(var4, 4); // L: 1410
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1411
					VertexNormal.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					VertexNormal.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1412
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1413
				var42 = Login.xPadding + 500; // L: 1414
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1415
					VertexNormal.worldSelectArrows[2].drawAt(var42, 4);
				} else {
					VertexNormal.worldSelectArrows[0].drawAt(var42, 4); // L: 1416
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1417
					VertexNormal.worldSelectArrows[3].drawAt(var42 + 15, 4);
				} else {
					VertexNormal.worldSelectArrows[1].drawAt(var42 + 15, 4); // L: 1418
				}

				var0.draw("Location", var42 + 32, 17, 16777215, -1); // L: 1419
				var27 = Login.xPadding + 610; // L: 1420
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1421
					VertexNormal.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					VertexNormal.worldSelectArrows[0].drawAt(var27, 4); // L: 1422
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1423
					VertexNormal.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					VertexNormal.worldSelectArrows[1].drawAt(var27 + 15, 4); // L: 1424
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1); // L: 1425
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1427
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1428
			Login.hoveredWorldIndex = -1; // L: 1429
			if (WorldMapRectangle.worldSelectBackSprites != null) { // L: 1430
				var3 = 88; // L: 1431
				byte var39 = 19; // L: 1432
				var42 = 765 / (var3 + 1) - 1; // L: 1433
				var27 = 480 / (var39 + 1); // L: 1434

				do {
					var43 = var27; // L: 1436
					var26 = var42; // L: 1437
					if (var27 * (var42 - 1) >= World.World_count) { // L: 1438
						--var42;
					}

					if (var42 * (var27 - 1) >= World.World_count) { // L: 1439
						--var27;
					}

					if (var42 * (var27 - 1) >= World.World_count) { // L: 1440
						--var27;
					}
				} while(var43 != var27 || var26 != var42); // L: 1441

				var43 = (765 - var3 * var42) / (var42 + 1); // L: 1443
				if (var43 > 5) { // L: 1444
					var43 = 5;
				}

				var26 = (480 - var27 * var39) / (var27 + 1); // L: 1445
				if (var26 > 5) { // L: 1446
					var26 = 5;
				}

				var9 = (765 - var3 * var42 - var43 * (var42 - 1)) / 2; // L: 1447
				int var30 = (480 - var39 * var27 - var26 * (var27 - 1)) / 2; // L: 1448
				var11 = (var27 + World.World_count - 1) / var27; // L: 1449
				Login.worldSelectPagesCount = var11 - var42; // L: 1450
				if (class186.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1451
					class186.worldSelectLeftSprite.drawAt(8, NPC.canvasHeight / 2 - class186.worldSelectLeftSprite.subHeight / 2); // L: 1452
				}

				if (DirectByteArrayCopier.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1454
					DirectByteArrayCopier.worldSelectRightSprite.drawAt(DirectByteArrayCopier.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth - 8, NPC.canvasHeight / 2 - DirectByteArrayCopier.worldSelectRightSprite.subHeight / 2); // L: 1455
				}

				int var37 = var30 + 23; // L: 1457
				int var38 = var9 + Login.xPadding; // L: 1458
				var14 = 0; // L: 1459
				boolean var40 = false; // L: 1460
				int var16 = Login.worldSelectPage; // L: 1461

				int var17;
				for (var17 = var16 * var27; var17 < World.World_count && var16 - Login.worldSelectPage < var42; ++var17) { // L: 1462 1463
					World var18 = class33.World_worlds[var17]; // L: 1466
					boolean var19 = true; // L: 1467
					String var20 = Integer.toString(var18.population); // L: 1468
					if (var18.population == -1) { // L: 1469
						var20 = "OFF"; // L: 1470
						var19 = false; // L: 1471
					} else if (var18.population > 1980) { // L: 1473
						var20 = "FULL"; // L: 1474
						var19 = false; // L: 1475
					}

					int var22 = 0; // L: 1478
					byte var21;
					if (var18.isBeta()) { // L: 1479
						if (var18.isMembersOnly()) { // L: 1480
							var21 = 7;
						} else {
							var21 = 6; // L: 1481
						}
					} else if (var18.isDeadman()) { // L: 1483
						var22 = 16711680; // L: 1484
						if (var18.isMembersOnly()) { // L: 1485
							var21 = 5;
						} else {
							var21 = 4; // L: 1486
						}
					} else if (var18.method1640()) { // L: 1488
						if (var18.isMembersOnly()) { // L: 1489
							var21 = 9;
						} else {
							var21 = 8; // L: 1490
						}
					} else if (var18.isPvp()) { // L: 1492
						if (var18.isMembersOnly()) { // L: 1493
							var21 = 3;
						} else {
							var21 = 2; // L: 1494
						}
					} else if (var18.isMembersOnly()) { // L: 1497
						var21 = 1;
					} else {
						var21 = 0; // L: 1498
					}

					if (MouseHandler.MouseHandler_x >= var38 && MouseHandler.MouseHandler_y >= var37 && MouseHandler.MouseHandler_x < var38 + var3 && MouseHandler.MouseHandler_y < var39 + var37 && var19) { // L: 1500
						Login.hoveredWorldIndex = var17; // L: 1501
						WorldMapRectangle.worldSelectBackSprites[var21].drawTransOverlayAt(var38, var37, 128, 16777215); // L: 1502
						var40 = true; // L: 1503
					} else {
						WorldMapRectangle.worldSelectBackSprites[var21].drawAt(var38, var37); // L: 1505
					}

					if (Occluder.worldSelectFlagSprites != null) { // L: 1506
						Occluder.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var38 + 29, var37);
					}

					var0.drawCentered(Integer.toString(var18.id), var38 + 15, var39 / 2 + var37 + 5, var22, -1); // L: 1507
					var1.drawCentered(var20, var38 + 60, var39 / 2 + var37 + 5, 268435455, -1); // L: 1508
					var37 = var37 + var39 + var26; // L: 1509
					++var14; // L: 1510
					if (var14 >= var27) {
						var37 = var30 + 23; // L: 1511
						var38 = var38 + var3 + var43; // L: 1512
						var14 = 0; // L: 1513
						++var16; // L: 1514
					}
				}

				if (var40) { // L: 1517
					var17 = var1.stringWidth(class33.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1518
					int var31 = var1.ascent + 8; // L: 1519
					int var41 = MouseHandler.MouseHandler_y + 25; // L: 1520
					if (var41 + var31 > 480) { // L: 1521
						var41 = MouseHandler.MouseHandler_y - 25 - var31; // L: 1522
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var41, var17, var31, 16777120); // L: 1524
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var41, var17, var31, 0); // L: 1525
					var1.drawCentered(class33.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var41 + var1.ascent + 4, 0, -1); // L: 1526
				}
			}

			PcmPlayer.rasterProvider.drawFull(0, 0); // L: 1529
		} else {
			class260.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1533
			FriendSystem.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1534
			class28.logoSprite.drawAt(Login.xPadding + 382 - class28.logoSprite.subWidth / 2, 18); // L: 1535
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1536
				var3 = 20; // L: 1537
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1538
				var4 = 253 - var3; // L: 1539
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1540
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1541
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1542
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1543
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1544
			}

			String var5;
			String var7;
			String var8;
			char[] var10;
			short var32;
			short var34;
			if (Client.gameState == 20) { // L: 1546
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1547
				var32 = 201; // L: 1548
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1549
				var33 = var32 + 15; // L: 1550
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1551
				var33 += 15; // L: 1552
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1553
				var33 += 15; // L: 1554
				var33 += 7; // L: 1555
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1556
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0); // L: 1557
					var34 = 200; // L: 1558

					for (var5 = FloorOverlayDefinition.method3573(); var0.stringWidth(var5) > var34; var5 = var5.substring(0, var5.length() - 1)) { // L: 1559 1560 1561
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var33, 16777215, 0); // L: 1563
					var33 += 15; // L: 1564
					var7 = Login.Login_password; // L: 1566
					var9 = var7.length(); // L: 1569
					var10 = new char[var9]; // L: 1571

					for (var11 = 0; var11 < var9; ++var11) { // L: 1572
						var10[var11] = '*';
					}

					var8 = new String(var10); // L: 1573

					for (var8 = var8; var0.stringWidth(var8) > var34; var8 = var8.substring(1)) { // L: 1577 1578 1579
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1581
					var33 += 15; // L: 1582
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1585
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1586
				short var23;
				if (Login.loginIndex == 0) { // L: 1587
					var32 = 251; // L: 1588
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1589
					var33 = var32 + 30; // L: 1590
					var4 = Login.loginBoxX + 180 - 80; // L: 1591
					var23 = 291; // L: 1592
					class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1593
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1594
					var4 = Login.loginBoxX + 180 + 80; // L: 1595
					class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1596
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1597
				} else if (Login.loginIndex == 1) { // L: 1599
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1600
					var32 = 236; // L: 1601
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1602
					var33 = var32 + 15; // L: 1603
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1604
					var33 += 15; // L: 1605
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1606
					var33 += 15; // L: 1607
					var4 = Login.loginBoxX + 180 - 80; // L: 1608
					var23 = 321; // L: 1609
					class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1610
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1611
					var4 = Login.loginBoxX + 180 + 80; // L: 1612
					class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1613
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1614
				} else {
					IndexedSprite var35;
					if (Login.loginIndex == 2) { // L: 1616
						var32 = 201; // L: 1617
						var0.drawCentered(Login.Login_response1, class4.loginBoxCenter, var32, 16776960, 0); // L: 1618
						var33 = var32 + 15; // L: 1619
						var0.drawCentered(Login.Login_response2, class4.loginBoxCenter, var33, 16776960, 0); // L: 1620
						var33 += 15; // L: 1621
						var0.drawCentered(Login.Login_response3, class4.loginBoxCenter, var33, 16776960, 0); // L: 1622
						var33 += 15; // L: 1623
						var33 += 7; // L: 1624
						var0.draw("Login: ", class4.loginBoxCenter - 110, var33, 16777215, 0); // L: 1625
						var34 = 200; // L: 1626

						for (var5 = FloorOverlayDefinition.method3573(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) { // L: 1627 1628 1629
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), class4.loginBoxCenter - 70, var33, 16777215, 0); // L: 1631
						var33 += 15; // L: 1632
						var7 = Login.Login_password; // L: 1634
						var9 = var7.length(); // L: 1637
						var10 = new char[var9]; // L: 1639

						for (var11 = 0; var11 < var9; ++var11) { // L: 1640
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1641

						for (var8 = var8; var0.stringWidth(var8) > var34; var8 = var8.substring(1)) { // L: 1645 1646 1647
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), class4.loginBoxCenter - 108, var33, 16777215, 0); // L: 1649
						var33 += 15; // L: 1650
						var32 = 277; // L: 1651
						var9 = class4.loginBoxCenter + -117; // L: 1652
						var35 = class377.method6795(Client.Login_isUsernameRemembered, Login.field912); // L: 1653
						var35.drawAt(var9, var32); // L: 1654
						var9 = var9 + var35.subWidth + 5; // L: 1655
						var1.draw("Remember username", var9, var32 + 13, 16776960, 0); // L: 1656
						var9 = class4.loginBoxCenter + 24; // L: 1657
						boolean var12 = class424.clientPreferences.hideUsername; // L: 1659
						boolean var13 = Login.field913; // L: 1660
						IndexedSprite var28 = var12 ? (var13 ? Bounds.field4220 : class1.options_buttons_2Sprite) : (var13 ? class143.field1638 : Script.options_buttons_0Sprite); // L: 1662
						var28.drawAt(var9, var32); // L: 1665
						var9 = var9 + var28.subWidth + 5; // L: 1666
						var1.draw("Hide username", var9, var32 + 13, 16776960, 0); // L: 1667
						var33 = var32 + 15; // L: 1668
						var14 = class4.loginBoxCenter - 80; // L: 1669
						short var15 = 321; // L: 1670
						class259.titlebuttonSprite.drawAt(var14 - 73, var15 - 20); // L: 1671
						var0.drawCentered("Login", var14, var15 + 5, 16777215, 0); // L: 1672
						var14 = class4.loginBoxCenter + 80; // L: 1673
						class259.titlebuttonSprite.drawAt(var14 - 73, var15 - 20); // L: 1674
						var0.drawCentered("Cancel", var14, var15 + 5, 16777215, 0); // L: 1675
						var32 = 357; // L: 1676
						switch(Login.field918) { // L: 1677
						case 2:
							class374.field4266 = "Having trouble logging in?"; // L: 1679
							break;
						default:
							class374.field4266 = "Can't login? Click here."; // L: 1682
						}

						class6.field25 = new Bounds(class4.loginBoxCenter, var32, var1.stringWidth(class374.field4266), 11); // L: 1685
						PendingSpawn.field1107 = new Bounds(class4.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1686
						var1.drawCentered(class374.field4266, class4.loginBoxCenter, var32, 16777215, 0); // L: 1687
					} else if (Login.loginIndex == 3) { // L: 1689
						var32 = 201; // L: 1690
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1691
						var33 = var32 + 20; // L: 1692
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1693
						var33 += 15; // L: 1694
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1695
						var33 += 15; // L: 1696
						var4 = Login.loginBoxX + 180; // L: 1697
						var23 = 276; // L: 1698
						class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1699
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1700
						var4 = Login.loginBoxX + 180; // L: 1701
						var23 = 326; // L: 1702
						class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1703
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1704
					} else if (Login.loginIndex == 4) { // L: 1706
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1707
						var32 = 236; // L: 1708
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1709
						var33 = var32 + 15; // L: 1710
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1711
						var33 += 15; // L: 1712
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1713
						var33 += 15; // L: 1714
						var5 = "PIN: "; // L: 1716
						var7 = class145.otp; // L: 1718
						var9 = var7.length(); // L: 1721
						var10 = new char[var9]; // L: 1723

						for (var11 = 0; var11 < var9; ++var11) { // L: 1724
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1725
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1729
						var33 -= 8; // L: 1730
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1731
						var33 += 15; // L: 1732
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1733
						var26 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1734
						var9 = var33 - var0.ascent; // L: 1735
						if (Login.field893) { // L: 1737
							var35 = class1.options_buttons_2Sprite; // L: 1738
						} else {
							var35 = Script.options_buttons_0Sprite; // L: 1741
						}

						var35.drawAt(var26, var9); // L: 1743
						var33 += 15; // L: 1744
						var11 = Login.loginBoxX + 180 - 80; // L: 1745
						short var36 = 321; // L: 1746
						class259.titlebuttonSprite.drawAt(var11 - 73, var36 - 20); // L: 1747
						var0.drawCentered("Continue", var11, var36 + 5, 16777215, 0); // L: 1748
						var11 = Login.loginBoxX + 180 + 80; // L: 1749
						class259.titlebuttonSprite.drawAt(var11 - 73, var36 - 20); // L: 1750
						var0.drawCentered("Cancel", var11, var36 + 5, 16777215, 0); // L: 1751
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0); // L: 1752
					} else if (Login.loginIndex == 5) { // L: 1754
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1755
						var32 = 221; // L: 1756
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1757
						var33 = var32 + 15; // L: 1758
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1759
						var33 += 15; // L: 1760
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1761
						var33 += 15; // L: 1762
						var33 += 14; // L: 1763
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0); // L: 1764
						var34 = 174; // L: 1765

						for (var5 = FloorOverlayDefinition.method3573(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) { // L: 1766 1767 1768
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0); // L: 1770
						var33 += 15; // L: 1771
						var27 = Login.loginBoxX + 180 - 80; // L: 1772
						short var25 = 321; // L: 1773
						class259.titlebuttonSprite.drawAt(var27 - 73, var25 - 20); // L: 1774
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0); // L: 1775
						var27 = Login.loginBoxX + 180 + 80; // L: 1776
						class259.titlebuttonSprite.drawAt(var27 - 73, var25 - 20); // L: 1777
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0); // L: 1778
						var25 = 356; // L: 1779
						var1.drawCentered("Still having trouble logging in?", class4.loginBoxCenter, var25, 268435455, 0); // L: 1780
					} else if (Login.loginIndex == 6) { // L: 1782
						var32 = 201; // L: 1783
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1784
						var33 = var32 + 15; // L: 1785
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1786
						var33 += 15; // L: 1787
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1788
						var33 += 15; // L: 1789
						var4 = Login.loginBoxX + 180; // L: 1790
						var23 = 321; // L: 1791
						class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1792
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1793
					} else if (Login.loginIndex == 7) { // L: 1795
						if (class261.field3085 && !Client.onMobile) { // L: 1796
							var32 = 201; // L: 1797
							var0.drawCentered(Login.Login_response1, class4.loginBoxCenter, var32, 16776960, 0); // L: 1798
							var33 = var32 + 15; // L: 1799
							var0.drawCentered(Login.Login_response2, class4.loginBoxCenter, var33, 16776960, 0); // L: 1800
							var33 += 15; // L: 1801
							var0.drawCentered(Login.Login_response3, class4.loginBoxCenter, var33, 16776960, 0); // L: 1802
							var4 = class4.loginBoxCenter - 150; // L: 1803
							var33 += 10; // L: 1804

							for (var42 = 0; var42 < 8; ++var42) { // L: 1805
								class259.titlebuttonSprite.method7753(var4, var33, 30, 40); // L: 1806
								boolean var46 = var42 == Login.field910 & Client.cycle % 40 < 20; // L: 1807
								var0.draw((Login.field911[var42] == null ? "" : Login.field911[var42]) + (var46 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), var4 + 10, var33 + 27, 16777215, 0); // L: 1808
								if (var42 != 1 && var42 != 3) { // L: 1809
									var4 += 35; // L: 1814
								} else {
									var4 += 50; // L: 1810
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var33 + 27, 16777215, 0); // L: 1811
								}
							}

							var42 = class4.loginBoxCenter - 80; // L: 1817
							short var47 = 321; // L: 1818
							class259.titlebuttonSprite.drawAt(var42 - 73, var47 - 20); // L: 1819
							var0.drawCentered("Submit", var42, var47 + 5, 16777215, 0); // L: 1820
							var42 = class4.loginBoxCenter + 80; // L: 1821
							class259.titlebuttonSprite.drawAt(var42 - 73, var47 - 20); // L: 1822
							var0.drawCentered("Cancel", var42, var47 + 5, 16777215, 0); // L: 1823
						} else {
							var32 = 216; // L: 1826
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1827
							var33 = var32 + 15; // L: 1828
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1829
							var33 += 15; // L: 1830
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1831
							var33 += 15; // L: 1832
							var4 = Login.loginBoxX + 180 - 80; // L: 1833
							var23 = 321; // L: 1834
							class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1835
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1836
							var4 = Login.loginBoxX + 180 + 80; // L: 1837
							class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1838
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1839
						}
					} else if (Login.loginIndex == 8) { // L: 1842
						var32 = 216; // L: 1843
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1844
						var33 = var32 + 15; // L: 1845
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1846
						var33 += 15; // L: 1847
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1848
						var33 += 15; // L: 1849
						var4 = Login.loginBoxX + 180 - 80; // L: 1850
						var23 = 321; // L: 1851
						class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1852
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1853
						var4 = Login.loginBoxX + 180 + 80; // L: 1854
						class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1855
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1856
					} else if (Login.loginIndex == 9) { // L: 1858
						var32 = 221; // L: 1859
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1860
						var33 = var32 + 25; // L: 1861
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1862
						var33 += 25; // L: 1863
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1864
						var4 = Login.loginBoxX + 180; // L: 1865
						var23 = 311; // L: 1866
						class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1867
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1868
					} else if (Login.loginIndex == 10) { // L: 1870
						var33 = Login.loginBoxX + 180; // L: 1871
						var34 = 209; // L: 1872
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1873
						var4 = var34 + 20; // L: 1874
						Login.field894.drawAt(var33 - 109, var4); // L: 1875
						class138.field1613.drawAt(var33 - 48, var4 + 18); // L: 1876
					} else if (Login.loginIndex == 12) { // L: 1878
						var33 = class4.loginBoxCenter; // L: 1879
						var34 = 216; // L: 1880
						var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0); // L: 1881
						var4 = var34 + 17; // L: 1882
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0); // L: 1883
						var4 += 17; // L: 1884
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0); // L: 1885
						var4 += 17; // L: 1886
						var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0); // L: 1887
						var33 = class4.loginBoxCenter - 80; // L: 1888
						var34 = 311; // L: 1889
						class259.titlebuttonSprite.drawAt(var33 - 73, var34 - 20); // L: 1890
						var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0); // L: 1891
						var33 = class4.loginBoxCenter + 80; // L: 1892
						class259.titlebuttonSprite.drawAt(var33 - 73, var34 - 20); // L: 1893
						var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0); // L: 1894
					} else if (Login.loginIndex == 13) { // L: 1896
						var32 = 231; // L: 1897
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0); // L: 1898
						var33 = var32 + 20; // L: 1899
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0); // L: 1900
						var4 = Login.loginBoxX + 180; // L: 1901
						var32 = 311; // L: 1902
						class259.titlebuttonSprite.drawAt(var4 - 73, var32 - 20); // L: 1903
						var0.drawCentered("Back", var4, var32 + 5, 16777215, 0); // L: 1904
					} else if (Login.loginIndex == 14) { // L: 1906
						var32 = 201; // L: 1907
						String var24 = ""; // L: 1908
						var5 = ""; // L: 1909
						String var6 = ""; // L: 1910
						switch(Login.field914) { // L: 1911
						case 0:
							var24 = "Your account has been disabled."; // L: 1914
							var5 = Strings.field3634; // L: 1915
							var6 = ""; // L: 1916
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1926
							var5 = Strings.field3763; // L: 1927
							var6 = ""; // L: 1928
							break;
						default:
							Archive.Login_promptCredentials(false); // L: 1921
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1932
						var33 = var32 + 15; // L: 1933
						var2.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1934
						var33 += 15; // L: 1935
						var2.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1936
						var33 += 15; // L: 1937
						var43 = Login.loginBoxX + 180; // L: 1938
						short var44 = 276; // L: 1939
						class259.titlebuttonSprite.drawAt(var43 - 73, var44 - 20); // L: 1940
						var0.drawCentered("Support Page", var43, var44 + 5, 16777215, 0); // L: 1941
						var43 = Login.loginBoxX + 180; // L: 1942
						var44 = 326; // L: 1943
						class259.titlebuttonSprite.drawAt(var43 - 73, var44 - 20); // L: 1944
						var0.drawCentered("Back", var43, var44 + 5, 16777215, 0); // L: 1945
					} else if (Login.loginIndex == 24) { // L: 1947
						var32 = 221; // L: 1948
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1949
						var33 = var32 + 15; // L: 1950
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1951
						var33 += 15; // L: 1952
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1953
						var33 += 15; // L: 1954
						var4 = Login.loginBoxX + 180; // L: 1955
						var23 = 301; // L: 1956
						class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1957
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1958
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1961
				int[] var29 = new int[4]; // L: 1962
				Rasterizer2D.Rasterizer2D_getClipArray(var29); // L: 1963
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, NPC.canvasHeight); // L: 1964
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1965
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1966
				Rasterizer2D.Rasterizer2D_setClipArray(var29); // L: 1967
			}

			class371.title_muteSprite[class424.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1969
			if (Client.gameState > 5 && Language.Language_EN == class122.clientLanguage) { // L: 1970
				if (Coord.field3230 != null) { // L: 1971
					var33 = Login.xPadding + 5; // L: 1972
					var34 = 463; // L: 1973
					byte var45 = 100; // L: 1974
					byte var48 = 35; // L: 1975
					Coord.field3230.drawAt(var33, var34); // L: 1976
					var0.drawCentered("World" + " " + Client.worldId, var45 / 2 + var33, var48 / 2 + var34 - 2, 16777215, 0); // L: 1977
					if (WorldMapID.World_request != null) { // L: 1978
						var1.drawCentered("Loading...", var45 / 2 + var33, var48 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var45 / 2 + var33, var48 / 2 + var34 + 12, 16777215, 0); // L: 1979
					}
				} else {
					Coord.field3230 = class91.SpriteBuffer_getIndexedSpriteByName(Message.archive8, "sl_button", ""); // L: 1982
				}
			}

		}
	} // L: 1531 1985
}
