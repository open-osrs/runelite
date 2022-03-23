import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class132 extends class128 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1243159201
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 822748601
	)
	int field1552;
	@ObfuscatedName("o")
	byte field1553;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class132(class131 var1) {
		this.this$0 = var1;
		this.field1552 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1552 = var1.readUnsignedShort(); // L: 134
		this.field1553 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2940(this.field1552, this.field1553); // L: 139
	} // L: 140

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;Lmr;B)V",
		garbageValue = "32"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class4.canvasWidth - 765) / 2; // L: 1325
		Login.loginBoxX = Login.xPadding + 202; // L: 1326
		class134.loginBoxCenter = Login.loginBoxX + 180; // L: 1327
		if (Login.worldSelectOpen) { // L: 1328
			class346.method6482(var0, var1); // L: 1329
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1332
			class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1333
			HorizontalAlignment.logoSprite.drawAt(Login.xPadding + 382 - HorizontalAlignment.logoSprite.subWidth / 2, 18); // L: 1334
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1335
				byte var3 = 20; // L: 1336
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1337
				var4 = 253 - var3; // L: 1338
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1339
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1340
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1341
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1342
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1343
			}

			String var5;
			String var7;
			String var8;
			int var9;
			char[] var10;
			int var11;
			short var22;
			int var23;
			short var24;
			if (Client.gameState == 20) { // L: 1345
				AbstractByteArrayCopier.titleboxSprite.drawAt(Login.loginBoxX + 180 - AbstractByteArrayCopier.titleboxSprite.subWidth / 2, 271 - AbstractByteArrayCopier.titleboxSprite.subHeight / 2); // L: 1346
				var22 = 201; // L: 1347
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1348
				var23 = var22 + 15; // L: 1349
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1350
				var23 += 15; // L: 1351
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1352
				var23 += 15; // L: 1353
				var23 += 7; // L: 1354
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1355
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var23, 16777215, 0); // L: 1356
					var24 = 200; // L: 1357

					for (var5 = class360.method6636(); var0.stringWidth(var5) > var24; var5 = var5.substring(0, var5.length() - 1)) { // L: 1358 1359 1360
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var23, 16777215, 0); // L: 1362
					var23 += 15; // L: 1363
					var7 = Login.Login_password; // L: 1365
					var9 = var7.length(); // L: 1368
					var10 = new char[var9]; // L: 1370

					for (var11 = 0; var11 < var9; ++var11) { // L: 1371
						var10[var11] = '*';
					}

					var8 = new String(var10); // L: 1372

					for (var8 = var8; var0.stringWidth(var8) > var24; var8 = var8.substring(1)) { // L: 1376 1377 1378
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var23, 16777215, 0); // L: 1380
					var23 += 15; // L: 1381
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1384
				AbstractByteArrayCopier.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1385
				short var13;
				if (Login.loginIndex == 0) { // L: 1386
					var22 = 251; // L: 1387
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1388
					var23 = var22 + 30; // L: 1389
					var4 = Login.loginBoxX + 180 - 80; // L: 1390
					var13 = 291; // L: 1391
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1392
					var0.drawLines("New User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1393
					var4 = Login.loginBoxX + 180 + 80; // L: 1394
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1395
					var0.drawLines("Existing User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1396
				} else if (Login.loginIndex == 1) { // L: 1398
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1399
					var22 = 236; // L: 1400
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1401
					var23 = var22 + 15; // L: 1402
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1403
					var23 += 15; // L: 1404
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1405
					var23 += 15; // L: 1406
					var4 = Login.loginBoxX + 180 - 80; // L: 1407
					var13 = 321; // L: 1408
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1409
					var0.drawCentered("Continue", var4, var13 + 5, 16777215, 0); // L: 1410
					var4 = Login.loginBoxX + 180 + 80; // L: 1411
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1412
					var0.drawCentered("Cancel", var4, var13 + 5, 16777215, 0); // L: 1413
				} else {
					short var12;
					IndexedSprite var25;
					if (Login.loginIndex == 2) { // L: 1415
						var22 = 201; // L: 1416
						var0.drawCentered(Login.Login_response1, class134.loginBoxCenter, var22, 16776960, 0); // L: 1417
						var23 = var22 + 15; // L: 1418
						var0.drawCentered(Login.Login_response2, class134.loginBoxCenter, var23, 16776960, 0); // L: 1419
						var23 += 15; // L: 1420
						var0.drawCentered(Login.Login_response3, class134.loginBoxCenter, var23, 16776960, 0); // L: 1421
						var23 += 15; // L: 1422
						var23 += 7; // L: 1423
						var0.draw("Login: ", class134.loginBoxCenter - 110, var23, 16777215, 0); // L: 1424
						var24 = 200; // L: 1425

						for (var5 = class360.method6636(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) { // L: 1426 1427 1428
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? ChatChannel.colorStartTag(16776960) + "|" : ""), class134.loginBoxCenter - 70, var23, 16777215, 0); // L: 1430
						var23 += 15; // L: 1431
						var7 = Login.Login_password; // L: 1433
						var9 = var7.length(); // L: 1436
						var10 = new char[var9]; // L: 1438

						for (var11 = 0; var11 < var9; ++var11) { // L: 1439
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1440

						for (var8 = var8; var0.stringWidth(var8) > var24; var8 = var8.substring(1)) { // L: 1444 1445 1446
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? ChatChannel.colorStartTag(16776960) + "|" : ""), class134.loginBoxCenter - 108, var23, 16777215, 0); // L: 1448
						var23 += 15; // L: 1449
						var22 = 277; // L: 1450
						var9 = class134.loginBoxCenter + -117; // L: 1451
						var25 = MouseHandler.method622(Client.Login_isUsernameRemembered, Login.field901); // L: 1452
						var25.drawAt(var9, var22); // L: 1453
						var9 = var9 + var25.subWidth + 5; // L: 1454
						var1.draw("Remember username", var9, var22 + 13, 16776960, 0); // L: 1455
						var9 = class134.loginBoxCenter + 24; // L: 1456
						var25 = MouseHandler.method622(Interpreter.clientPreferences.method2257(), Login.field902); // L: 1457
						var25.drawAt(var9, var22); // L: 1458
						var9 = var9 + var25.subWidth + 5; // L: 1459
						var1.draw("Hide username", var9, var22 + 13, 16776960, 0); // L: 1460
						var23 = var22 + 15; // L: 1461
						var11 = class134.loginBoxCenter - 80; // L: 1462
						var12 = 321; // L: 1463
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1464
						var0.drawCentered("Login", var11, var12 + 5, 16777215, 0); // L: 1465
						var11 = class134.loginBoxCenter + 80; // L: 1466
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1467
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1468
						var22 = 357; // L: 1469
						switch(Login.field897) { // L: 1470
						case 2:
							class286.field3281 = "Having trouble logging in?"; // L: 1475
							break;
						default:
							class286.field3281 = "Can't login? Click here."; // L: 1472
						}

						DynamicObject.field973 = new Bounds(class134.loginBoxCenter, var22, var1.stringWidth(class286.field3281), 11); // L: 1478
						Projectile.field946 = new Bounds(class134.loginBoxCenter, var22, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1479
						var1.drawCentered(class286.field3281, class134.loginBoxCenter, var22, 16777215, 0); // L: 1480
					} else if (Login.loginIndex == 3) { // L: 1482
						var22 = 201; // L: 1483
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1484
						var23 = var22 + 20; // L: 1485
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1486
						var23 += 15; // L: 1487
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1488
						var23 += 15; // L: 1489
						var4 = Login.loginBoxX + 180; // L: 1490
						var13 = 276; // L: 1491
						class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1492
						var2.drawCentered("Try again", var4, var13 + 5, 16777215, 0); // L: 1493
						var4 = Login.loginBoxX + 180; // L: 1494
						var13 = 326; // L: 1495
						class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1496
						var2.drawCentered("Forgotten password?", var4, var13 + 5, 16777215, 0); // L: 1497
					} else if (Login.loginIndex == 4) { // L: 1499
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1500
						var22 = 236; // L: 1501
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1502
						var23 = var22 + 15; // L: 1503
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1504
						var23 += 15; // L: 1505
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1506
						var23 += 15; // L: 1507
						var5 = "PIN: "; // L: 1509
						var7 = class452.otp; // L: 1511
						var9 = var7.length(); // L: 1514
						var10 = new char[var9]; // L: 1516

						for (var11 = 0; var11 < var9; ++var11) { // L: 1517
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1518
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? ChatChannel.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var23, 16777215, 0); // L: 1522
						var23 -= 8; // L: 1523
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var23, 16776960, 0); // L: 1524
						var23 += 15; // L: 1525
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var23, 16776960, 0); // L: 1526
						int var16 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1527
						var9 = var23 - var0.ascent; // L: 1528
						if (Login.field903) { // L: 1530
							var25 = Skeleton.options_buttons_2Sprite; // L: 1531
						} else {
							var25 = class160.options_buttons_0Sprite; // L: 1534
						}

						var25.drawAt(var16, var9); // L: 1536
						var23 += 15; // L: 1537
						var11 = Login.loginBoxX + 180 - 80; // L: 1538
						var12 = 321; // L: 1539
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1540
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0); // L: 1541
						var11 = Login.loginBoxX + 180 + 80; // L: 1542
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1543
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1544
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0); // L: 1545
					} else {
						String var6;
						int var15;
						short var28;
						if (Login.loginIndex == 5) { // L: 1547
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1548
							var22 = 221; // L: 1549
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1550
							var23 = var22 + 15; // L: 1551
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1552
							var23 += 15; // L: 1553
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1554
							var23 += 15; // L: 1555
							var23 += 14; // L: 1556
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var23, 16777215, 0); // L: 1557
							var24 = 174; // L: 1558
							if (!Interpreter.clientPreferences.method2257()) { // L: 1562
								var6 = Login.Login_username; // L: 1577
							} else {
								var8 = Login.Login_username; // L: 1564
								int var18 = var8.length(); // L: 1567
								char[] var19 = new char[var18]; // L: 1569

								for (int var26 = 0; var26 < var18; ++var26) { // L: 1570
									var19[var26] = '*';
								}

								String var20 = new String(var19); // L: 1571
								var6 = var20; // L: 1575
							}

							for (var6 = var6; var0.stringWidth(var6) > var24; var6 = var6.substring(1)) { // L: 1580 1581 1582
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? ChatChannel.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var23, 16777215, 0); // L: 1584
							var23 += 15; // L: 1585
							var15 = Login.loginBoxX + 180 - 80; // L: 1586
							var28 = 321; // L: 1587
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20); // L: 1588
							var0.drawCentered("Recover", var15, var28 + 5, 16777215, 0); // L: 1589
							var15 = Login.loginBoxX + 180 + 80; // L: 1590
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20); // L: 1591
							var0.drawCentered("Back", var15, var28 + 5, 16777215, 0); // L: 1592
							var28 = 356; // L: 1593
							var1.drawCentered("Still having trouble logging in?", class134.loginBoxCenter, var28, 268435455, 0); // L: 1594
						} else if (Login.loginIndex == 6) { // L: 1596
							var22 = 201; // L: 1597
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1598
							var23 = var22 + 15; // L: 1599
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1600
							var23 += 15; // L: 1601
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1602
							var23 += 15; // L: 1603
							var4 = Login.loginBoxX + 180; // L: 1604
							var13 = 321; // L: 1605
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1606
							var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1607
						} else if (Login.loginIndex == 7) { // L: 1609
							if (class260.field2888 && !Client.onMobile) { // L: 1610
								var22 = 201; // L: 1611
								var0.drawCentered(Login.Login_response1, class134.loginBoxCenter, var22, 16776960, 0); // L: 1612
								var23 = var22 + 15; // L: 1613
								var0.drawCentered(Login.Login_response2, class134.loginBoxCenter, var23, 16776960, 0); // L: 1614
								var23 += 15; // L: 1615
								var0.drawCentered(Login.Login_response3, class134.loginBoxCenter, var23, 16776960, 0); // L: 1616
								var4 = class134.loginBoxCenter - 150; // L: 1617
								var23 += 10; // L: 1618

								int var27;
								for (var27 = 0; var27 < 8; ++var27) { // L: 1619
									class137.titlebuttonSprite.method8161(var4, var23, 30, 40); // L: 1620
									boolean var17 = var27 == Login.field899 & Client.cycle % 40 < 20; // L: 1621
									var0.draw((Login.field900[var27] == null ? "" : Login.field900[var27]) + (var17 ? ChatChannel.colorStartTag(16776960) + "|" : ""), var4 + 10, var23 + 27, 16777215, 0); // L: 1622
									if (var27 != 1 && var27 != 3) { // L: 1623
										var4 += 35; // L: 1628
									} else {
										var4 += 50; // L: 1624
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var23 + 27, 16777215, 0); // L: 1625
									}
								}

								var27 = class134.loginBoxCenter - 80; // L: 1631
								short var30 = 321; // L: 1632
								class137.titlebuttonSprite.drawAt(var27 - 73, var30 - 20); // L: 1633
								var0.drawCentered("Submit", var27, var30 + 5, 16777215, 0); // L: 1634
								var27 = class134.loginBoxCenter + 80; // L: 1635
								class137.titlebuttonSprite.drawAt(var27 - 73, var30 - 20); // L: 1636
								var0.drawCentered("Cancel", var27, var30 + 5, 16777215, 0); // L: 1637
							} else {
								var22 = 216; // L: 1640
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1641
								var23 = var22 + 15; // L: 1642
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1643
								var23 += 15; // L: 1644
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1645
								var23 += 15; // L: 1646
								var4 = Login.loginBoxX + 180 - 80; // L: 1647
								var13 = 321; // L: 1648
								class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1649
								var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0); // L: 1650
								var4 = Login.loginBoxX + 180 + 80; // L: 1651
								class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1652
								var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1653
							}
						} else if (Login.loginIndex == 8) { // L: 1656
							var22 = 216; // L: 1657
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1658
							var23 = var22 + 15; // L: 1659
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1660
							var23 += 15; // L: 1661
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1662
							var23 += 15; // L: 1663
							var4 = Login.loginBoxX + 180 - 80; // L: 1664
							var13 = 321; // L: 1665
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1666
							var0.drawCentered("Privacy Policy", var4, var13 + 5, 16777215, 0); // L: 1667
							var4 = Login.loginBoxX + 180 + 80; // L: 1668
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1669
							var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1670
						} else if (Login.loginIndex == 9) { // L: 1672
							var22 = 221; // L: 1673
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1674
							var23 = var22 + 25; // L: 1675
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1676
							var23 += 25; // L: 1677
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1678
							var4 = Login.loginBoxX + 180; // L: 1679
							var13 = 311; // L: 1680
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1681
							var0.drawCentered("Try again", var4, var13 + 5, 16777215, 0); // L: 1682
						} else if (Login.loginIndex == 10) { // L: 1684
							var23 = Login.loginBoxX + 180; // L: 1685
							var24 = 209; // L: 1686
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1687
							var4 = var24 + 20; // L: 1688
							Login.field882.drawAt(var23 - 109, var4); // L: 1689
							Login.field913.drawAt(var23 - 48, var4 + 18); // L: 1690
						} else if (Login.loginIndex == 12) { // L: 1692
							var23 = class134.loginBoxCenter; // L: 1693
							var24 = 216; // L: 1694
							var2.drawCentered("Before using this app, please read and accept our", var23, var24, 16777215, 0); // L: 1695
							var4 = var24 + 17; // L: 1696
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var23, var4, 16777215, 0); // L: 1697
							var4 += 17; // L: 1698
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var23, var4, 16777215, 0); // L: 1699
							var4 += 17; // L: 1700
							var2.drawCentered("By accepting, you agree to these documents.", var23, var4, 16777215, 0); // L: 1701
							var23 = class134.loginBoxCenter - 80; // L: 1702
							var24 = 311; // L: 1703
							class137.titlebuttonSprite.drawAt(var23 - 73, var24 - 20); // L: 1704
							var0.drawCentered("Accept", var23, var24 + 5, 16777215, 0); // L: 1705
							var23 = class134.loginBoxCenter + 80; // L: 1706
							class137.titlebuttonSprite.drawAt(var23 - 73, var24 - 20); // L: 1707
							var0.drawCentered("Decline", var23, var24 + 5, 16777215, 0); // L: 1708
						} else if (Login.loginIndex == 13) { // L: 1710
							var22 = 231; // L: 1711
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var22, 16777215, 0); // L: 1712
							var23 = var22 + 20; // L: 1713
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var23, 16777215, 0); // L: 1714
							var4 = Login.loginBoxX + 180; // L: 1715
							var22 = 311; // L: 1716
							class137.titlebuttonSprite.drawAt(var4 - 73, var22 - 20); // L: 1717
							var0.drawCentered("Back", var4, var22 + 5, 16777215, 0); // L: 1718
						} else if (Login.loginIndex == 14) { // L: 1720
							var22 = 201; // L: 1721
							String var14 = ""; // L: 1722
							var5 = ""; // L: 1723
							var6 = ""; // L: 1724
							switch(Login.field892) { // L: 1725
							case 0:
								var14 = "Your account has been disabled."; // L: 1735
								var5 = Strings.field3731; // L: 1736
								var6 = ""; // L: 1737
								break; // L: 1738
							case 1:
								var14 = "Account locked as we suspect it has been stolen."; // L: 1728
								var5 = Strings.field3684; // L: 1729
								var6 = ""; // L: 1730
								break;
							default:
								class127.Login_promptCredentials(false); // L: 1742
							}

							var0.drawCentered(var14, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1746
							var23 = var22 + 15; // L: 1747
							var2.drawCentered(var5, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1748
							var23 += 15; // L: 1749
							var2.drawCentered(var6, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1750
							var23 += 15; // L: 1751
							var15 = Login.loginBoxX + 180; // L: 1752
							var28 = 276; // L: 1753
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20); // L: 1754
							var0.drawCentered("Support Page", var15, var28 + 5, 16777215, 0); // L: 1755
							var15 = Login.loginBoxX + 180; // L: 1756
							var28 = 326; // L: 1757
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20); // L: 1758
							var0.drawCentered("Back", var15, var28 + 5, 16777215, 0); // L: 1759
						} else if (Login.loginIndex == 24) { // L: 1761
							var22 = 221; // L: 1762
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1763
							var23 = var22 + 15; // L: 1764
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1765
							var23 += 15; // L: 1766
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1767
							var23 += 15; // L: 1768
							var4 = Login.loginBoxX + 180; // L: 1769
							var13 = 301; // L: 1770
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1771
							var0.drawCentered("Ok", var4, var13 + 5, 16777215, 0); // L: 1772
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1775
				int[] var21 = new int[4]; // L: 1776
				Rasterizer2D.Rasterizer2D_getClipArray(var21); // L: 1777
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class309.canvasHeight); // L: 1778
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1779
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1780
				Rasterizer2D.Rasterizer2D_setClipArray(var21); // L: 1781
			}

			class114.title_muteSprite[Interpreter.clientPreferences.method2259() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1783
			if (Client.gameState > 5 && Language.Language_EN == FriendSystem.clientLanguage) { // L: 1784
				if (class19.field96 != null) { // L: 1785
					var23 = Login.xPadding + 5; // L: 1786
					var24 = 463; // L: 1787
					byte var29 = 100; // L: 1788
					byte var31 = 35; // L: 1789
					class19.field96.drawAt(var23, var24); // L: 1790
					var0.drawCentered("World" + " " + Client.worldId, var29 / 2 + var23, var31 / 2 + var24 - 2, 16777215, 0); // L: 1791
					if (class345.World_request != null) { // L: 1792
						var1.drawCentered("Loading...", var29 / 2 + var23, var31 / 2 + var24 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var29 / 2 + var23, var31 / 2 + var24 + 12, 16777215, 0); // L: 1793
					}
				} else {
					class19.field96 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(WorldMapData_1.archive8, "sl_button", ""); // L: 1796
				}
			}

		}
	} // L: 1330 1799

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "-110"
	)
	static int method2861(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2697
			if (var0 == 3702) { // L: 2702
				++class295.Interpreter_intStackSize; // L: 2703
				return 1; // L: 2704
			} else {
				return 2; // L: 2706
			}
		} else {
			--class295.Interpreter_intStackSize; // L: 2698
			--ChatChannel.Interpreter_stringStackSize; // L: 2699
			return 1; // L: 2700
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "48"
	)
	static final void method2864(int var0, int var1) {
		if (var0 < 128) { // L: 3528
			var0 = 128;
		}

		if (var0 > 383) { // L: 3529
			var0 = 383;
		}

		if (Language.cameraPitch < var0) { // L: 3530
			Language.cameraPitch = (var0 - Language.cameraPitch) * JagexCache.field1737 / 1000 + Language.cameraPitch + ClanChannel.field1660; // L: 3531
			if (Language.cameraPitch > var0) { // L: 3532
				Language.cameraPitch = var0;
			}
		}

		if (Language.cameraPitch > var0) { // L: 3534
			Language.cameraPitch -= (Language.cameraPitch - var0) * JagexCache.field1737 / 1000 + ClanChannel.field1660; // L: 3535
			if (Language.cameraPitch < var0) { // L: 3536
				Language.cameraPitch = var0;
			}
		}

		int var2 = var1 - MusicPatchNode2.cameraYaw; // L: 3538
		if (var2 > 1024) { // L: 3539
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3540
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3541
			MusicPatchNode2.cameraYaw = MusicPatchNode2.cameraYaw + ClanChannel.field1660 + var2 * JagexCache.field1737 / 1000; // L: 3542
			MusicPatchNode2.cameraYaw &= 2047; // L: 3543
		}

		if (var2 < 0) { // L: 3545
			MusicPatchNode2.cameraYaw -= -var2 * JagexCache.field1737 / 1000 + ClanChannel.field1660; // L: 3546
			MusicPatchNode2.cameraYaw &= 2047; // L: 3547
		}

		int var3 = var1 - MusicPatchNode2.cameraYaw; // L: 3549
		if (var3 > 1024) { // L: 3550
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 3551
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3552
			MusicPatchNode2.cameraYaw = var1;
		}

	} // L: 3553

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1895605377"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9242
			SecureRandomFuture.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9243
		}

		long var4 = -1L; // L: 9246
		long var6 = -1L; // L: 9247

		int var8;
		for (var8 = 0; var8 < SpotAnimationDefinition.method3515(); ++var8) { // L: 9248
			long var22 = WorldMapLabel.method4997(var8); // L: 9249
			if (var22 != var6) { // L: 9250
				var6 = var22; // L: 9251
				int var24 = DynamicObject.method1987(var8); // L: 9252
				int var12 = class150.method3091(var8); // L: 9253
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9257
				int var14 = (int)(var15 >>> 14 & 3L); // L: 9259
				int var25 = UserComparator10.method2615(var8); // L: 9264
				if (var14 == 2 && FriendSystem.scene.getObjectFlags(class160.Client_plane, var24, var12, var22) >= 0) { // L: 9265 9266
					ObjectComposition var16 = class116.getObjectDefinition(var25); // L: 9267
					if (var16.transforms != null) { // L: 9268
						var16 = var16.transform();
					}

					if (var16 == null) { // L: 9269
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9270
						SecureRandomFuture.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ChatChannel.colorStartTag(65535) + var16.name, 1, var25, var24, var12); // L: 9271
					} else if (Client.isSpellSelected) { // L: 9274
						if ((class154.selectedSpellFlags & 4) == 4) { // L: 9275
							SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ChatChannel.colorStartTag(65535) + var16.name, 2, var25, var24, var12); // L: 9276
						}
					} else {
						String[] var17 = var16.actions; // L: 9281
						if (var17 != null) { // L: 9282
							for (int var18 = 4; var18 >= 0; --var18) { // L: 9283
								if (var17[var18] != null) { // L: 9284
									short var19 = 0; // L: 9285
									if (var18 == 0) { // L: 9286
										var19 = 3;
									}

									if (var18 == 1) { // L: 9287
										var19 = 4;
									}

									if (var18 == 2) { // L: 9288
										var19 = 5;
									}

									if (var18 == 3) { // L: 9289
										var19 = 6;
									}

									if (var18 == 4) { // L: 9290
										var19 = 1001;
									}

									SecureRandomFuture.insertMenuItemNoShift(var17[var18], ChatChannel.colorStartTag(65535) + var16.name, var19, var25, var24, var12); // L: 9291
								}
							}
						}

						SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(65535) + var16.name, 1002, var16.id, var24, var12); // L: 9296
					}
				}

				Player var20;
				int var26;
				NPC var27;
				int var34;
				int[] var35;
				if (var14 == 1) { // L: 9301
					NPC var30 = Client.npcs[var25]; // L: 9302
					if (var30 == null) { // L: 9303
						continue;
					}

					if (var30.definition.size == 1 && (var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 9304
						for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 9305
							var27 = Client.npcs[Client.npcIndices[var26]]; // L: 9306
							if (var27 != null && var30 != var27 && var27.definition.size == 1 && var27.x == var30.x && var27.y == var30.y) { // L: 9307
								NPCComposition.addNpcToMenu(var27, Client.npcIndices[var26], var24, var12);
							}
						}

						var26 = Players.Players_count; // L: 9309
						var35 = Players.Players_indices; // L: 9310

						for (var34 = 0; var34 < var26; ++var34) { // L: 9311
							var20 = Client.players[var35[var34]]; // L: 9312
							if (var20 != null && var30.x == var20.x && var20.y == var30.y) { // L: 9313
								WorldMapSprite.addPlayerToMenu(var20, var35[var34], var24, var12);
							}
						}
					}

					NPCComposition.addNpcToMenu(var30, var25, var24, var12); // L: 9316
				}

				if (var14 == 0) { // L: 9318
					Player var31 = Client.players[var25]; // L: 9319
					if (var31 == null) { // L: 9320
						continue;
					}

					if ((var31.x & 127) == 64 && (var31.y & 127) == 64) { // L: 9321
						for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 9322
							var27 = Client.npcs[Client.npcIndices[var26]]; // L: 9323
							if (var27 != null && var27.definition.size == 1 && var27.x == var31.x && var31.y == var27.y) { // L: 9324
								NPCComposition.addNpcToMenu(var27, Client.npcIndices[var26], var24, var12);
							}
						}

						var26 = Players.Players_count; // L: 9326
						var35 = Players.Players_indices; // L: 9327

						for (var34 = 0; var34 < var26; ++var34) { // L: 9328
							var20 = Client.players[var35[var34]]; // L: 9329
							if (var20 != null && var20 != var31 && var20.x == var31.x && var20.y == var31.y) { // L: 9330
								WorldMapSprite.addPlayerToMenu(var20, var35[var34], var24, var12);
							}
						}
					}

					if (var25 != Client.combatTargetPlayerIndex) { // L: 9333
						WorldMapSprite.addPlayerToMenu(var31, var25, var24, var12);
					} else {
						var4 = var22; // L: 9334
					}
				}

				if (var14 == 3) { // L: 9336
					NodeDeque var33 = Client.groundItems[class160.Client_plane][var24][var12]; // L: 9337
					if (var33 != null) { // L: 9338
						for (TileItem var32 = (TileItem)var33.first(); var32 != null; var32 = (TileItem)var33.next()) { // L: 9339 9340 9373
							ItemComposition var36 = class67.ItemDefinition_get(var32.id); // L: 9341
							if (Client.isItemSelected == 1) { // L: 9342
								SecureRandomFuture.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ChatChannel.colorStartTag(16748608) + var36.name, 16, var32.id, var24, var12); // L: 9343
							} else if (Client.isSpellSelected) { // L: 9346
								if ((class154.selectedSpellFlags & 1) == 1) { // L: 9347
									SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ChatChannel.colorStartTag(16748608) + var36.name, 17, var32.id, var24, var12); // L: 9348
								}
							} else {
								String[] var28 = var36.groundActions; // L: 9353

								for (int var29 = 4; var29 >= 0; --var29) { // L: 9354
									if (var28 != null && var28[var29] != null) { // L: 9355
										byte var21 = 0; // L: 9356
										if (var29 == 0) { // L: 9357
											var21 = 18;
										}

										if (var29 == 1) { // L: 9358
											var21 = 19;
										}

										if (var29 == 2) { // L: 9359
											var21 = 20;
										}

										if (var29 == 3) { // L: 9360
											var21 = 21;
										}

										if (var29 == 4) { // L: 9361
											var21 = 22;
										}

										SecureRandomFuture.insertMenuItemNoShift(var28[var29], ChatChannel.colorStartTag(16748608) + var36.name, var21, var32.id, var24, var12); // L: 9362
									} else if (var29 == 2) { // L: 9365
										SecureRandomFuture.insertMenuItemNoShift("Take", ChatChannel.colorStartTag(16748608) + var36.name, 20, var32.id, var24, var12); // L: 9366
									}
								}

								SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16748608) + var36.name, 1004, var32.id, var24, var12); // L: 9370
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 9378
			var8 = (int)(var4 >>> 0 & 127L); // L: 9381
			int var10 = PcmPlayer.method771(var4); // L: 9384
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9385
			WorldMapSprite.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9386
		}

	} // L: 9388
}
