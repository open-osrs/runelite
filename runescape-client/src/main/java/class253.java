import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class253 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2918;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2911;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2912;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2913;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2914;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2915;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2916;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2917;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2920;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2919;

	static {
		field2918 = new class253(2); // L: 5
		field2911 = new class253(4); // L: 6
		field2912 = new class253(6); // L: 7
		field2913 = new class253(14); // L: 8
		field2914 = new class253(5); // L: 9
		field2915 = new class253(5); // L: 10
		field2916 = new class253(4); // L: 11
		field2917 = new class253(3); // L: 12
		field2920 = new class253(15); // L: 13
		field2919 = new class253(7); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	class253(int var1) {
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpg;",
		garbageValue = "-850723008"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field4552, FillMode.field4553}; // L: 15
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Llx;Llx;Llx;I)V",
		garbageValue = "1280031541"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class186.canvasWidth - 765) / 2; // L: 1254
		Login.loginBoxX = Login.xPadding + 202; // L: 1255
		class138.loginBoxCenter = Login.loginBoxX + 180; // L: 1256
		if (Login.worldSelectOpen) { // L: 1257
			Language.method5841(var0, var1); // L: 1258
		} else {
			WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1261
			NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1262
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1263
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1264
				byte var3 = 20; // L: 1265
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1266
				var4 = 253 - var3; // L: 1267
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1268
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1269
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1270
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1271
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1272
			}

			String var5;
			String var6;
			String var7;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) { // L: 1274
				AbstractByteArrayCopier.titleboxSprite.drawAt(Login.loginBoxX + 180 - AbstractByteArrayCopier.titleboxSprite.subWidth / 2, 271 - AbstractByteArrayCopier.titleboxSprite.subHeight / 2); // L: 1275
				var23 = 201; // L: 1276
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1277
				var24 = var23 + 15; // L: 1278
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1279
				var24 += 15; // L: 1280
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1281
				var24 += 15; // L: 1282
				var24 += 7; // L: 1283
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1284
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0); // L: 1285
					var25 = 200; // L: 1286
					var5 = SecureRandomFuture.clientPreferences.hideUsername ? LoginPacket.method5019(Login.Login_username) : Login.Login_username; // L: 1289

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) { // L: 1291 1292 1293
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0); // L: 1295
					var24 += 15; // L: 1296

					for (var7 = LoginPacket.method5019(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) { // L: 1297 1298 1299
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1301
					var24 += 15; // L: 1302
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1305
				AbstractByteArrayCopier.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1306
				short var18;
				if (Login.loginIndex == 0) { // L: 1307
					var23 = 251; // L: 1308
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1309
					var24 = var23 + 30; // L: 1310
					var4 = Login.loginBoxX + 180 - 80; // L: 1311
					var18 = 291; // L: 1312
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1313
					var0.drawLines("New User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1314
					var4 = Login.loginBoxX + 180 + 80; // L: 1315
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1316
					var0.drawLines("Existing User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1317
				} else if (Login.loginIndex == 1) { // L: 1319
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1320
					var23 = 236; // L: 1321
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1322
					var24 = var23 + 15; // L: 1323
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1324
					var24 += 15; // L: 1325
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1326
					var24 += 15; // L: 1327
					var4 = Login.loginBoxX + 180 - 80; // L: 1328
					var18 = 321; // L: 1329
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1330
					var0.drawCentered("Continue", var4, var18 + 5, 16777215, 0); // L: 1331
					var4 = Login.loginBoxX + 180 + 80; // L: 1332
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1333
					var0.drawCentered("Cancel", var4, var18 + 5, 16777215, 0); // L: 1334
				} else if (Login.loginIndex == 2) { // L: 1336
					var23 = 201; // L: 1337
					var0.drawCentered(Login.Login_response1, class138.loginBoxCenter, var23, 16776960, 0); // L: 1338
					var24 = var23 + 15; // L: 1339
					var0.drawCentered(Login.Login_response2, class138.loginBoxCenter, var24, 16776960, 0); // L: 1340
					var24 += 15; // L: 1341
					var0.drawCentered(Login.Login_response3, class138.loginBoxCenter, var24, 16776960, 0); // L: 1342
					var24 += 15; // L: 1343
					var24 += 7; // L: 1344
					var0.draw("Login: ", class138.loginBoxCenter - 110, var24, 16777215, 0); // L: 1345
					var25 = 200; // L: 1346
					var5 = SecureRandomFuture.clientPreferences.hideUsername ? LoginPacket.method5019(Login.Login_username) : Login.Login_username; // L: 1349

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1351 1352 1353
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), class138.loginBoxCenter - 70, var24, 16777215, 0); // L: 1355
					var24 += 15; // L: 1356

					for (var7 = LoginPacket.method5019(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) { // L: 1357 1358 1359
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), class138.loginBoxCenter - 108, var24, 16777215, 0); // L: 1361
					var24 += 15; // L: 1362
					var23 = 277; // L: 1363
					int var8 = class138.loginBoxCenter + -117; // L: 1364
					boolean var10 = Client.Login_isUsernameRemembered; // L: 1366
					boolean var11 = Login.field880; // L: 1367
					IndexedSprite var9 = var10 ? (var11 ? Login.field888 : LoginType.options_buttons_2Sprite) : (var11 ? UserComparator9.field1336 : KeyHandler.options_buttons_0Sprite); // L: 1369
					var9.drawAt(var8, var23); // L: 1372
					var8 = var8 + var9.subWidth + 5; // L: 1373
					var1.draw("Remember username", var8, var23 + 13, 16776960, 0); // L: 1374
					var8 = class138.loginBoxCenter + 24; // L: 1375
					boolean var14 = SecureRandomFuture.clientPreferences.hideUsername; // L: 1377
					boolean var15 = Login.field881; // L: 1378
					IndexedSprite var13 = var14 ? (var15 ? Login.field888 : LoginType.options_buttons_2Sprite) : (var15 ? UserComparator9.field1336 : KeyHandler.options_buttons_0Sprite); // L: 1380
					var13.drawAt(var8, var23); // L: 1383
					var8 = var8 + var13.subWidth + 5; // L: 1384
					var1.draw("Hide username", var8, var23 + 13, 16776960, 0); // L: 1385
					var24 = var23 + 15; // L: 1386
					int var16 = class138.loginBoxCenter - 80; // L: 1387
					short var17 = 321; // L: 1388
					class19.titlebuttonSprite.drawAt(var16 - 73, var17 - 20); // L: 1389
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0); // L: 1390
					var16 = class138.loginBoxCenter + 80; // L: 1391
					class19.titlebuttonSprite.drawAt(var16 - 73, var17 - 20); // L: 1392
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0); // L: 1393
					var23 = 357; // L: 1394
					switch(Login.field872) { // L: 1395
					case 2:
						class10.field58 = "Having trouble logging in?"; // L: 1397
						break;
					default:
						class10.field58 = "Can't login? Click here."; // L: 1400
					}

					WorldMapData_1.field2652 = new Bounds(class138.loginBoxCenter, var23, var1.stringWidth(class10.field58), 11); // L: 1403
					MouseRecorder.field1044 = new Bounds(class138.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1404
					var1.drawCentered(class10.field58, class138.loginBoxCenter, var23, 16777215, 0); // L: 1405
				} else if (Login.loginIndex == 3) { // L: 1407
					var23 = 201; // L: 1408
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1409
					var24 = var23 + 20; // L: 1410
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1411
					var24 += 15; // L: 1412
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1413
					var24 += 15; // L: 1414
					var4 = Login.loginBoxX + 180; // L: 1415
					var18 = 276; // L: 1416
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1417
					var2.drawCentered("Try again", var4, var18 + 5, 16777215, 0); // L: 1418
					var4 = Login.loginBoxX + 180; // L: 1419
					var18 = 326; // L: 1420
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1421
					var2.drawCentered("Forgotten password?", var4, var18 + 5, 16777215, 0); // L: 1422
				} else {
					int var20;
					short var27;
					if (Login.loginIndex == 4) { // L: 1424
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1425
						var23 = 236; // L: 1426
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1427
						var24 = var23 + 15; // L: 1428
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1429
						var24 += 15; // L: 1430
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1431
						var24 += 15; // L: 1432
						var0.draw("PIN: " + LoginPacket.method5019(BufferedSource.otp) + (Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1433
						var24 -= 8; // L: 1434
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1435
						var24 += 15; // L: 1436
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1437
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1438
						int var28 = var24 - var0.ascent; // L: 1439
						IndexedSprite var26;
						if (Login.field882) { // L: 1441
							var26 = LoginType.options_buttons_2Sprite; // L: 1442
						} else {
							var26 = KeyHandler.options_buttons_0Sprite; // L: 1445
						}

						var26.drawAt(var4, var28); // L: 1447
						var24 += 15; // L: 1448
						var20 = Login.loginBoxX + 180 - 80; // L: 1449
						var27 = 321; // L: 1450
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20); // L: 1451
						var0.drawCentered("Continue", var20, var27 + 5, 16777215, 0); // L: 1452
						var20 = Login.loginBoxX + 180 + 80; // L: 1453
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20); // L: 1454
						var0.drawCentered("Cancel", var20, var27 + 5, 16777215, 0); // L: 1455
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var27 + 36, 255, 0); // L: 1456
					} else if (Login.loginIndex == 5) { // L: 1458
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1459
						var23 = 221; // L: 1460
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1461
						var24 = var23 + 15; // L: 1462
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1463
						var24 += 15; // L: 1464
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1465
						var24 += 15; // L: 1466
						var24 += 14; // L: 1467
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0); // L: 1468
						var25 = 174; // L: 1469
						var5 = SecureRandomFuture.clientPreferences.hideUsername ? LoginPacket.method5019(Login.Login_username) : Login.Login_username; // L: 1472

						for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1474 1475 1476
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0); // L: 1478
						var24 += 15; // L: 1479
						var20 = Login.loginBoxX + 180 - 80; // L: 1480
						var27 = 321; // L: 1481
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20); // L: 1482
						var0.drawCentered("Recover", var20, var27 + 5, 16777215, 0); // L: 1483
						var20 = Login.loginBoxX + 180 + 80; // L: 1484
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20); // L: 1485
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0); // L: 1486
						var27 = 356; // L: 1487
						var1.drawCentered("Still having trouble logging in?", class138.loginBoxCenter, var27, 268435455, 0); // L: 1488
					} else if (Login.loginIndex == 6) { // L: 1490
						var23 = 201; // L: 1491
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1492
						var24 = var23 + 15; // L: 1493
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1494
						var24 += 15; // L: 1495
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1496
						var24 += 15; // L: 1497
						var4 = Login.loginBoxX + 180; // L: 1498
						var18 = 321; // L: 1499
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1500
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1501
					} else if (Login.loginIndex == 7) { // L: 1503
						var23 = 216; // L: 1504
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1505
						var24 = var23 + 15; // L: 1506
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1507
						var24 += 15; // L: 1508
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1509
						var24 += 15; // L: 1510
						var4 = Login.loginBoxX + 180 - 80; // L: 1511
						var18 = 321; // L: 1512
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1513
						var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0); // L: 1514
						var4 = Login.loginBoxX + 180 + 80; // L: 1515
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1516
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1517
					} else if (Login.loginIndex == 8) { // L: 1519
						var23 = 216; // L: 1520
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1521
						var24 = var23 + 15; // L: 1522
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1523
						var24 += 15; // L: 1524
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1525
						var24 += 15; // L: 1526
						var4 = Login.loginBoxX + 180 - 80; // L: 1527
						var18 = 321; // L: 1528
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1529
						var0.drawCentered("Privacy Policy", var4, var18 + 5, 16777215, 0); // L: 1530
						var4 = Login.loginBoxX + 180 + 80; // L: 1531
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1532
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1533
					} else if (Login.loginIndex == 9) { // L: 1535
						var23 = 221; // L: 1536
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1537
						var24 = var23 + 25; // L: 1538
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1539
						var24 += 25; // L: 1540
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1541
						var4 = Login.loginBoxX + 180; // L: 1542
						var18 = 311; // L: 1543
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1544
						var0.drawCentered("Try again", var4, var18 + 5, 16777215, 0); // L: 1545
					} else if (Login.loginIndex == 10) { // L: 1547
						var24 = Login.loginBoxX + 180; // L: 1548
						var25 = 209; // L: 1549
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1550
						var4 = var25 + 20; // L: 1551
						Login.field894.drawAt(var24 - 109, var4); // L: 1552
						Login.field864.drawAt(var24 - 48, var4 + 18); // L: 1553
					} else if (Login.loginIndex == 12) { // L: 1555
						var24 = class138.loginBoxCenter; // L: 1556
						var25 = 216; // L: 1557
						var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0); // L: 1558
						var4 = var25 + 17; // L: 1559
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0); // L: 1560
						var4 += 17; // L: 1561
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0); // L: 1562
						var4 += 17; // L: 1563
						var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0); // L: 1564
						var24 = class138.loginBoxCenter - 80; // L: 1565
						var25 = 311; // L: 1566
						class19.titlebuttonSprite.drawAt(var24 - 73, var25 - 20); // L: 1567
						var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0); // L: 1568
						var24 = class138.loginBoxCenter + 80; // L: 1569
						class19.titlebuttonSprite.drawAt(var24 - 73, var25 - 20); // L: 1570
						var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0); // L: 1571
					} else if (Login.loginIndex == 13) { // L: 1573
						var23 = 231; // L: 1574
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0); // L: 1575
						var24 = var23 + 20; // L: 1576
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0); // L: 1577
						var4 = Login.loginBoxX + 180; // L: 1578
						var23 = 311; // L: 1579
						class19.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1580
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1581
					} else if (Login.loginIndex == 14) { // L: 1583
						var23 = 201; // L: 1584
						String var19 = ""; // L: 1585
						var5 = ""; // L: 1586
						var6 = ""; // L: 1587
						switch(Login.field871) { // L: 1588
						case 0:
							var19 = "Your account has been disabled."; // L: 1591
							var5 = Strings.field3523; // L: 1592
							var6 = ""; // L: 1593
							break;
						case 1:
							var19 = "Account locked as we suspect it has been stolen."; // L: 1598
							var5 = Strings.field3562; // L: 1599
							var6 = ""; // L: 1600
							break; // L: 1601
						default:
							class67.Login_promptCredentials(false); // L: 1605
						}

						var0.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1609
						var24 = var23 + 15; // L: 1610
						var2.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1611
						var24 += 15; // L: 1612
						var2.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1613
						var24 += 15; // L: 1614
						var20 = Login.loginBoxX + 180; // L: 1615
						var27 = 276; // L: 1616
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20); // L: 1617
						var0.drawCentered("Support Page", var20, var27 + 5, 16777215, 0); // L: 1618
						var20 = Login.loginBoxX + 180; // L: 1619
						var27 = 326; // L: 1620
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20); // L: 1621
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0); // L: 1622
					} else if (Login.loginIndex == 24) { // L: 1624
						var23 = 221; // L: 1625
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1626
						var24 = var23 + 15; // L: 1627
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1628
						var24 += 15; // L: 1629
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1630
						var24 += 15; // L: 1631
						var4 = Login.loginBoxX + 180; // L: 1632
						var18 = 301; // L: 1633
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20); // L: 1634
						var0.drawCentered("Ok", var4, var18 + 5, 16777215, 0); // L: 1635
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1638
				int[] var21 = new int[4]; // L: 1639
				Rasterizer2D.Rasterizer2D_getClipArray(var21); // L: 1640
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, BoundaryObject.canvasHeight); // L: 1641
				Client.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1642
				Client.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1643
				Rasterizer2D.Rasterizer2D_setClipArray(var21); // L: 1644
			}

			Login.title_muteSprite[SecureRandomFuture.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1646
			if (Client.gameState > 5 && ScriptFrame.clientLanguage == Language.Language_EN) { // L: 1647
				if (class21.field118 != null) { // L: 1648
					var24 = Login.xPadding + 5; // L: 1649
					var25 = 463; // L: 1650
					byte var29 = 100; // L: 1651
					byte var22 = 35; // L: 1652
					class21.field118.drawAt(var24, var25); // L: 1653
					var0.drawCentered("World" + " " + Client.worldId, var29 / 2 + var24, var22 / 2 + var25 - 2, 16777215, 0); // L: 1654
					if (HorizontalAlignment.World_request != null) { // L: 1655
						var1.drawCentered("Loading...", var29 / 2 + var24, var22 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var29 / 2 + var24, var22 / 2 + var25 + 12, 16777215, 0); // L: 1656
					}
				} else {
					class21.field118 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(UserComparator6.archive8, "sl_button", ""); // L: 1659
				}
			}

		}
	} // L: 1259 1662
}
