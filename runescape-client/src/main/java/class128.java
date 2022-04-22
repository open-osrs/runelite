import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public abstract class class128 extends Node {
	@ObfuscatedName("t")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("a")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;

	class128() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	abstract void vmethod3168(Buffer var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	abstract void vmethod3162(ClanSettings var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;B)V",
		garbageValue = "63"
	)
	static void method2856(File var0) {
		class120.FileSystem_cacheDir = var0; // L: 16
		if (!class120.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "-1938819519"
	)
	static String method2853(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 67
			RunException var2 = (RunException)var0; // L: 68
			var1 = var2.message + " | "; // L: 69
			var0 = var2.throwable; // L: 70
		} else {
			var1 = ""; // L: 72
		}

		StringWriter var12 = new StringWriter(); // L: 73
		PrintWriter var3 = new PrintWriter(var12); // L: 74
		var0.printStackTrace(var3); // L: 75
		var3.close(); // L: 76
		String var4 = var12.toString(); // L: 77
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 78
		String var6 = var5.readLine(); // L: 79

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 81
				if (var7 == null) { // L: 82
					var1 = var1 + "| " + var6; // L: 100
					return var1; // L: 101
				}

				int var8 = var7.indexOf(40); // L: 83
				int var9 = var7.indexOf(41, var8 + 1); // L: 84
				if (var8 >= 0 && var9 >= 0) { // L: 85
					String var10 = var7.substring(var8 + 1, var9); // L: 86
					int var11 = var10.indexOf(".java:"); // L: 87
					if (var11 >= 0) { // L: 88
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 89
						var1 = var1 + var10 + ' '; // L: 90
						continue; // L: 91
					}

					var7 = var7.substring(0, var8); // L: 93
				}

				var7 = var7.trim(); // L: 95
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 96
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 97
				var1 = var1 + var7 + ' '; // L: 98
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lmd;Lmd;I)V",
		garbageValue = "-461855642"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (InvDefinition.canvasWidth - 765) / 2; // L: 1185
		Login.loginBoxX = Login.xPadding + 202; // L: 1186
		HealthBarDefinition.loginBoxCenter = Login.loginBoxX + 180; // L: 1187
		byte var3;
		int var4;
		int var11;
		int var12;
		int var25;
		int var26;
		int var28;
		int var29;
		int var34;
		int var40;
		if (Login.worldSelectOpen) { // L: 1188
			int var46;
			if (class393.worldSelectBackSprites == null) { // L: 1190
				Archive var41 = class145.archive8; // L: 1192
				var40 = var41.getGroupId("sl_back"); // L: 1194
				var46 = var41.getFileId(var40, ""); // L: 1195
				SpritePixels[] var47 = class429.method7568(var41, var40, var46); // L: 1196
				class393.worldSelectBackSprites = var47; // L: 1198
			}

			if (class400.worldSelectFlagSprites == null) { // L: 1200
				class400.worldSelectFlagSprites = class93.method2386(class145.archive8, "sl_flags", "");
			}

			if (class126.worldSelectArrows == null) { // L: 1201
				class126.worldSelectArrows = class93.method2386(class145.archive8, "sl_arrows", "");
			}

			if (TileItem.worldSelectStars == null) { // L: 1202
				TileItem.worldSelectStars = class93.method2386(class145.archive8, "sl_stars", "");
			}

			if (class54.worldSelectLeftSprite == null) { // L: 1203
				class54.worldSelectLeftSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(class145.archive8, "leftarrow", "");
			}

			if (AttackOption.worldSelectRightSprite == null) { // L: 1204
				AttackOption.worldSelectRightSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(class145.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1205
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1206
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1207
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1208
			if (TileItem.worldSelectStars != null) { // L: 1209
				TileItem.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1210
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1211
				TileItem.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1212
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1213
			}

			if (class126.worldSelectArrows != null) { // L: 1215
				var34 = Login.xPadding + 280; // L: 1216
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1217
					class126.worldSelectArrows[2].drawAt(var34, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var34, 4); // L: 1218
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1219
					class126.worldSelectArrows[3].drawAt(var34 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var34 + 15, 4); // L: 1220
				}

				var0.draw("World", var34 + 32, 17, 16777215, -1); // L: 1221
				var4 = Login.xPadding + 390; // L: 1222
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1223
					class126.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var4, 4); // L: 1224
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1225
					class126.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1226
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1227
				var40 = Login.xPadding + 500; // L: 1228
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1229
					class126.worldSelectArrows[2].drawAt(var40, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var40, 4); // L: 1230
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1231
					class126.worldSelectArrows[3].drawAt(var40 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var40 + 15, 4); // L: 1232
				}

				var0.draw("Location", var40 + 32, 17, 16777215, -1); // L: 1233
				var46 = Login.xPadding + 610; // L: 1234
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1235
					class126.worldSelectArrows[2].drawAt(var46, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var46, 4); // L: 1236
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1237
					class126.worldSelectArrows[3].drawAt(var46 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var46 + 15, 4); // L: 1238
				}

				var0.draw("Type", var46 + 32, 17, 16777215, -1); // L: 1239
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1241
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1242
			Login.hoveredWorldIndex = -1; // L: 1243
			if (class393.worldSelectBackSprites != null) { // L: 1244
				var3 = 88; // L: 1245
				byte var38 = 19; // L: 1246
				var40 = 765 / (var3 + 1) - 1; // L: 1247
				var46 = 480 / (var38 + 1); // L: 1248

				do {
					var25 = var46; // L: 1250
					var26 = var40; // L: 1251
					if (var46 * (var40 - 1) >= World.World_count) { // L: 1252
						--var40;
					}

					if (var40 * (var46 - 1) >= World.World_count) { // L: 1253
						--var46;
					}

					if (var40 * (var46 - 1) >= World.World_count) { // L: 1254
						--var46;
					}
				} while(var25 != var46 || var26 != var40); // L: 1255

				var25 = (765 - var3 * var40) / (var40 + 1); // L: 1257
				if (var25 > 5) { // L: 1258
					var25 = 5;
				}

				var26 = (480 - var46 * var38) / (var46 + 1); // L: 1259
				if (var26 > 5) { // L: 1260
					var26 = 5;
				}

				var28 = (765 - var3 * var40 - var25 * (var40 - 1)) / 2; // L: 1261
				var29 = (480 - var46 * var38 - var26 * (var46 - 1)) / 2; // L: 1262
				var11 = (var46 + World.World_count - 1) / var46; // L: 1263
				Login.worldSelectPagesCount = var11 - var40; // L: 1264
				if (class54.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1265
					class54.worldSelectLeftSprite.drawAt(8, class321.canvasHeight / 2 - class54.worldSelectLeftSprite.subHeight / 2); // L: 1266
				}

				if (AttackOption.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1268
					AttackOption.worldSelectRightSprite.drawAt(InvDefinition.canvasWidth - AttackOption.worldSelectRightSprite.subWidth - 8, class321.canvasHeight / 2 - AttackOption.worldSelectRightSprite.subHeight / 2); // L: 1269
				}

				var12 = var29 + 23; // L: 1271
				int var37 = var28 + Login.xPadding; // L: 1272
				int var14 = 0; // L: 1273
				boolean var15 = false; // L: 1274
				int var16 = Login.worldSelectPage; // L: 1275

				int var17;
				for (var17 = var46 * var16; var17 < World.World_count && var16 - Login.worldSelectPage < var40; ++var17) { // L: 1276 1277
					World var18 = DevicePcmPlayerProvider.World_worlds[var17]; // L: 1280
					boolean var19 = true; // L: 1281
					String var20 = Integer.toString(var18.population); // L: 1282
					if (var18.population == -1) { // L: 1283
						var20 = "OFF"; // L: 1284
						var19 = false; // L: 1285
					} else if (var18.population > 1980) { // L: 1287
						var20 = "FULL"; // L: 1288
						var19 = false; // L: 1289
					}

					int var22 = 0; // L: 1292
					byte var21;
					if (var18.isBeta()) { // L: 1293
						if (var18.isMembersOnly()) { // L: 1294
							var21 = 7;
						} else {
							var21 = 6; // L: 1295
						}
					} else if (var18.isDeadman()) { // L: 1297
						var22 = 16711680; // L: 1298
						if (var18.isMembersOnly()) { // L: 1299
							var21 = 5;
						} else {
							var21 = 4; // L: 1300
						}
					} else if (var18.method1642()) { // L: 1302
						if (var18.isMembersOnly()) { // L: 1303
							var21 = 9;
						} else {
							var21 = 8; // L: 1304
						}
					} else if (var18.isPvp()) { // L: 1306
						if (var18.isMembersOnly()) { // L: 1307
							var21 = 3;
						} else {
							var21 = 2; // L: 1308
						}
					} else if (var18.isMembersOnly()) { // L: 1311
						var21 = 1;
					} else {
						var21 = 0; // L: 1312
					}

					if (MouseHandler.MouseHandler_x >= var37 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var37 + var3 && MouseHandler.MouseHandler_y < var12 + var38 && var19) { // L: 1314
						Login.hoveredWorldIndex = var17; // L: 1315
						class393.worldSelectBackSprites[var21].drawTransOverlayAt(var37, var12, 128, 16777215); // L: 1316
						var15 = true; // L: 1317
					} else {
						class393.worldSelectBackSprites[var21].drawAt(var37, var12); // L: 1319
					}

					if (class400.worldSelectFlagSprites != null) { // L: 1320
						class400.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var37 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var37 + 15, var38 / 2 + var12 + 5, var22, -1); // L: 1321
					var1.drawCentered(var20, var37 + 60, var38 / 2 + var12 + 5, 268435455, -1); // L: 1322
					var12 = var12 + var38 + var26; // L: 1323
					++var14; // L: 1324
					if (var14 >= var46) {
						var12 = var29 + 23; // L: 1325
						var37 = var37 + var3 + var25; // L: 1326
						var14 = 0; // L: 1327
						++var16; // L: 1328
					}
				}

				if (var15) { // L: 1331
					var17 = var1.stringWidth(DevicePcmPlayerProvider.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1332
					int var32 = var1.ascent + 8; // L: 1333
					int var39 = MouseHandler.MouseHandler_y + 25; // L: 1334
					if (var39 + var32 > 480) { // L: 1335
						var39 = MouseHandler.MouseHandler_y - 25 - var32; // L: 1336
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var39, var17, var32, 16777120); // L: 1338
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var39, var17, var32, 0); // L: 1339
					var1.drawCentered(DevicePcmPlayerProvider.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var39 + var1.ascent + 4, 0, -1); // L: 1340
				}
			}

			FontName.rasterProvider.drawFull(0, 0); // L: 1343
		} else {
			class17.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1347
			ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1348
			Decimator.logoSprite.drawAt(Login.xPadding + 382 - Decimator.logoSprite.subWidth / 2, 18); // L: 1349
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1350
				var3 = 20; // L: 1351
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1352
				var4 = 253 - var3; // L: 1353
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1354
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1355
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1356
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1357
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1358
			}

			String var6;
			String var7;
			String var8;
			String var9;
			short var33;
			short var35;
			if (Client.gameState == 20) { // L: 1360
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1361
				var33 = 201; // L: 1362
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1363
				var34 = var33 + 15; // L: 1364
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1365
				var34 += 15; // L: 1366
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1367
				var34 += 15; // L: 1368
				var34 += 7; // L: 1369
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1370
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var34, 16777215, 0); // L: 1371
					var35 = 200; // L: 1372
					if (class131.clientPreferences.method2317()) { // L: 1376
						var8 = Login.Login_username; // L: 1378
						var7 = class140.method3040('*', var8.length()); // L: 1380
						var6 = var7; // L: 1382
					} else {
						var6 = Login.Login_username; // L: 1384
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(0, var6.length() - 1)) { // L: 1387 1388 1389
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var34, 16777215, 0); // L: 1391
					var34 += 15; // L: 1392
					var8 = Login.Login_password; // L: 1394
					var7 = class140.method3040('*', var8.length()); // L: 1396

					for (var9 = var7; var0.stringWidth(var9) > var35; var9 = var9.substring(1)) { // L: 1398 1399 1400
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var34, 16777215, 0); // L: 1402
					var34 += 15; // L: 1403
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1406
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1407
				short var23;
				if (Login.loginIndex == 0) { // L: 1408
					var33 = 251; // L: 1409
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1410
					var34 = var33 + 30; // L: 1411
					var4 = Login.loginBoxX + 180 - 80; // L: 1412
					var23 = 291; // L: 1413
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1414
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1415
					var4 = Login.loginBoxX + 180 + 80; // L: 1416
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1417
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1418
				} else if (Login.loginIndex == 1) { // L: 1420
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1421
					var33 = 236; // L: 1422
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1423
					var34 = var33 + 15; // L: 1424
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1425
					var34 += 15; // L: 1426
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1427
					var34 += 15; // L: 1428
					var4 = Login.loginBoxX + 180 - 80; // L: 1429
					var23 = 321; // L: 1430
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1431
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1432
					var4 = Login.loginBoxX + 180 + 80; // L: 1433
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1434
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1435
				} else if (Login.loginIndex == 2) { // L: 1437
					var33 = 201; // L: 1438
					var0.drawCentered(Login.Login_response1, HealthBarDefinition.loginBoxCenter, var33, 16776960, 0); // L: 1439
					var34 = var33 + 15; // L: 1440
					var0.drawCentered(Login.Login_response2, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0); // L: 1441
					var34 += 15; // L: 1442
					var0.drawCentered(Login.Login_response3, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0); // L: 1443
					var34 += 15; // L: 1444
					var34 += 7; // L: 1445
					var0.draw("Login: ", HealthBarDefinition.loginBoxCenter - 110, var34, 16777215, 0); // L: 1446
					var35 = 200; // L: 1447
					if (class131.clientPreferences.method2317()) { // L: 1451
						var8 = Login.Login_username; // L: 1453
						var7 = class140.method3040('*', var8.length()); // L: 1455
						var6 = var7; // L: 1457
					} else {
						var6 = Login.Login_username; // L: 1459
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) { // L: 1462 1463 1464
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? UserComparator9.colorStartTag(16776960) + "|" : ""), HealthBarDefinition.loginBoxCenter - 70, var34, 16777215, 0); // L: 1466
					var34 += 15; // L: 1467
					var8 = Login.Login_password; // L: 1469
					var7 = class140.method3040('*', var8.length()); // L: 1471

					for (var9 = var7; var0.stringWidth(var9) > var35; var9 = var9.substring(1)) { // L: 1473 1474 1475
					}

					var0.draw("Password: " + var9 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? UserComparator9.colorStartTag(16776960) + "|" : ""), HealthBarDefinition.loginBoxCenter - 108, var34, 16777215, 0); // L: 1477
					var34 += 15; // L: 1478
					var33 = 277; // L: 1479
					var29 = HealthBarDefinition.loginBoxCenter + -117; // L: 1480
					IndexedSprite var30 = class9.method73(Client.Login_isUsernameRemembered, Login.field909); // L: 1481
					var30.drawAt(var29, var33); // L: 1482
					var29 = var29 + var30.subWidth + 5; // L: 1483
					var1.draw("Remember username", var29, var33 + 13, 16776960, 0); // L: 1484
					var29 = HealthBarDefinition.loginBoxCenter + 24; // L: 1485
					var30 = class9.method73(class131.clientPreferences.method2317(), Login.field906); // L: 1486
					var30.drawAt(var29, var33); // L: 1487
					var29 = var29 + var30.subWidth + 5; // L: 1488
					var1.draw("Hide username", var29, var33 + 13, 16776960, 0); // L: 1489
					var34 = var33 + 15; // L: 1490
					var12 = HealthBarDefinition.loginBoxCenter - 80; // L: 1491
					short var13 = 321; // L: 1492
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1493
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0); // L: 1494
					var12 = HealthBarDefinition.loginBoxCenter + 80; // L: 1495
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1496
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0); // L: 1497
					var33 = 357; // L: 1498
					switch(Login.field895) { // L: 1499
					case 2:
						class137.field1573 = "Having trouble logging in?"; // L: 1501
						break;
					default:
						class137.field1573 = "Can't login? Click here."; // L: 1504
					}

					class113.field1378 = new Bounds(HealthBarDefinition.loginBoxCenter, var33, var1.stringWidth(class137.field1573), 11); // L: 1507
					class260.field2892 = new Bounds(HealthBarDefinition.loginBoxCenter, var33, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1508
					var1.drawCentered(class137.field1573, HealthBarDefinition.loginBoxCenter, var33, 16777215, 0); // L: 1509
				} else if (Login.loginIndex == 3) { // L: 1511
					var33 = 201; // L: 1512
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1513
					var34 = var33 + 20; // L: 1514
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1515
					var34 += 15; // L: 1516
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1517
					var34 += 15; // L: 1518
					var4 = Login.loginBoxX + 180; // L: 1519
					var23 = 276; // L: 1520
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1521
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1522
					var4 = Login.loginBoxX + 180; // L: 1523
					var23 = 326; // L: 1524
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1525
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1526
				} else {
					String var5;
					if (Login.loginIndex == 4) { // L: 1528
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1529
						var33 = 236; // L: 1530
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1531
						var34 = var33 + 15; // L: 1532
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1533
						var34 += 15; // L: 1534
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1535
						var34 += 15; // L: 1536
						var5 = "PIN: "; // L: 1538
						var7 = HealthBar.otp; // L: 1540
						var6 = class140.method3040('*', var7.length()); // L: 1542
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? UserComparator9.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var34, 16777215, 0); // L: 1544
						var34 -= 8; // L: 1545
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var34, 16776960, 0); // L: 1546
						var34 += 15; // L: 1547
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var34, 16776960, 0); // L: 1548
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1549
						var28 = var34 - var0.ascent; // L: 1550
						IndexedSprite var10;
						if (Login.field907) { // L: 1552
							var10 = class54.options_buttons_2Sprite; // L: 1553
						} else {
							var10 = WorldMapSection2.options_buttons_0Sprite; // L: 1556
						}

						var10.drawAt(var26, var28); // L: 1558
						var34 += 15; // L: 1559
						var11 = Login.loginBoxX + 180 - 80; // L: 1560
						short var36 = 321; // L: 1561
						Login.titlebuttonSprite.drawAt(var11 - 73, var36 - 20); // L: 1562
						var0.drawCentered("Continue", var11, var36 + 5, 16777215, 0); // L: 1563
						var11 = Login.loginBoxX + 180 + 80; // L: 1564
						Login.titlebuttonSprite.drawAt(var11 - 73, var36 - 20); // L: 1565
						var0.drawCentered("Cancel", var11, var36 + 5, 16777215, 0); // L: 1566
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0); // L: 1567
					} else {
						short var42;
						if (Login.loginIndex == 5) { // L: 1569
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1570
							var33 = 221; // L: 1571
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1572
							var34 = var33 + 15; // L: 1573
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1574
							var34 += 15; // L: 1575
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1576
							var34 += 15; // L: 1577
							var34 += 14; // L: 1578
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var34, 16777215, 0); // L: 1579
							var35 = 174; // L: 1580
							if (class131.clientPreferences.method2317()) { // L: 1584
								var8 = Login.Login_username; // L: 1586
								var7 = class140.method3040('*', var8.length()); // L: 1588
								var6 = var7; // L: 1590
							} else {
								var6 = Login.Login_username; // L: 1592
							}

							for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) { // L: 1595 1596 1597
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? UserComparator9.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var34, 16777215, 0); // L: 1599
							var34 += 15; // L: 1600
							var25 = Login.loginBoxX + 180 - 80; // L: 1601
							var42 = 321; // L: 1602
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20); // L: 1603
							var0.drawCentered("Recover", var25, var42 + 5, 16777215, 0); // L: 1604
							var25 = Login.loginBoxX + 180 + 80; // L: 1605
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20); // L: 1606
							var0.drawCentered("Back", var25, var42 + 5, 16777215, 0); // L: 1607
							var42 = 356; // L: 1608
							var1.drawCentered("Still having trouble logging in?", HealthBarDefinition.loginBoxCenter, var42, 268435455, 0); // L: 1609
						} else if (Login.loginIndex == 6) { // L: 1611
							var33 = 201; // L: 1612
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1613
							var34 = var33 + 15; // L: 1614
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1615
							var34 += 15; // L: 1616
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1617
							var34 += 15; // L: 1618
							var4 = Login.loginBoxX + 180; // L: 1619
							var23 = 321; // L: 1620
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1621
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1622
						} else if (Login.loginIndex == 7) { // L: 1624
							if (Client.field504 && !Client.onMobile) { // L: 1625
								var33 = 201; // L: 1626
								var0.drawCentered(Login.Login_response1, HealthBarDefinition.loginBoxCenter, var33, 16776960, 0); // L: 1627
								var34 = var33 + 15; // L: 1628
								var0.drawCentered(Login.Login_response2, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0); // L: 1629
								var34 += 15; // L: 1630
								var0.drawCentered(Login.Login_response3, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0); // L: 1631
								var4 = HealthBarDefinition.loginBoxCenter - 150; // L: 1632
								var34 += 10; // L: 1633

								for (var40 = 0; var40 < 8; ++var40) { // L: 1634
									Login.titlebuttonSprite.method8054(var4, var34, 30, 40); // L: 1635
									boolean var27 = var40 == Login.field903 & Client.cycle % 40 < 20; // L: 1636
									var0.draw((Login.field904[var40] == null ? "" : Login.field904[var40]) + (var27 ? UserComparator9.colorStartTag(16776960) + "|" : ""), var4 + 10, var34 + 27, 16777215, 0); // L: 1637
									if (var40 != 1 && var40 != 3) { // L: 1638
										var4 += 35; // L: 1643
									} else {
										var4 += 50; // L: 1639
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var34 + 27, 16777215, 0); // L: 1640
									}
								}

								var40 = HealthBarDefinition.loginBoxCenter - 80; // L: 1646
								short var44 = 321; // L: 1647
								Login.titlebuttonSprite.drawAt(var40 - 73, var44 - 20); // L: 1648
								var0.drawCentered("Submit", var40, var44 + 5, 16777215, 0); // L: 1649
								var40 = HealthBarDefinition.loginBoxCenter + 80; // L: 1650
								Login.titlebuttonSprite.drawAt(var40 - 73, var44 - 20); // L: 1651
								var0.drawCentered("Cancel", var40, var44 + 5, 16777215, 0); // L: 1652
							} else {
								var33 = 216; // L: 1655
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1656
								var34 = var33 + 15; // L: 1657
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1658
								var34 += 15; // L: 1659
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1660
								var34 += 15; // L: 1661
								var4 = Login.loginBoxX + 180 - 80; // L: 1662
								var23 = 321; // L: 1663
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1664
								var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1665
								var4 = Login.loginBoxX + 180 + 80; // L: 1666
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1667
								var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1668
							}
						} else if (Login.loginIndex == 8) { // L: 1671
							var33 = 216; // L: 1672
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1673
							var34 = var33 + 15; // L: 1674
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1675
							var34 += 15; // L: 1676
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1677
							var34 += 15; // L: 1678
							var4 = Login.loginBoxX + 180 - 80; // L: 1679
							var23 = 321; // L: 1680
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1681
							var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1682
							var4 = Login.loginBoxX + 180 + 80; // L: 1683
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1684
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1685
						} else if (Login.loginIndex == 9) { // L: 1687
							var33 = 221; // L: 1688
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1689
							var34 = var33 + 25; // L: 1690
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1691
							var34 += 25; // L: 1692
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1693
							var4 = Login.loginBoxX + 180; // L: 1694
							var23 = 311; // L: 1695
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1696
							var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1697
						} else if (Login.loginIndex == 10) { // L: 1699
							var34 = Login.loginBoxX + 180; // L: 1700
							var35 = 209; // L: 1701
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0); // L: 1702
							var4 = var35 + 20; // L: 1703
							class296.field3496.drawAt(var34 - 109, var4); // L: 1704
							class259.field2887.drawAt(var34 - 48, var4 + 18); // L: 1705
						} else if (Login.loginIndex == 12) { // L: 1707
							var34 = HealthBarDefinition.loginBoxCenter; // L: 1708
							var35 = 216; // L: 1709
							var2.drawCentered("Before using this app, please read and accept our", var34, var35, 16777215, 0); // L: 1710
							var4 = var35 + 17; // L: 1711
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var34, var4, 16777215, 0); // L: 1712
							var4 += 17; // L: 1713
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var34, var4, 16777215, 0); // L: 1714
							var4 += 17; // L: 1715
							var2.drawCentered("By accepting, you agree to these documents.", var34, var4, 16777215, 0); // L: 1716
							var34 = HealthBarDefinition.loginBoxCenter - 80; // L: 1717
							var35 = 311; // L: 1718
							Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20); // L: 1719
							var0.drawCentered("Accept", var34, var35 + 5, 16777215, 0); // L: 1720
							var34 = HealthBarDefinition.loginBoxCenter + 80; // L: 1721
							Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20); // L: 1722
							var0.drawCentered("Decline", var34, var35 + 5, 16777215, 0); // L: 1723
						} else if (Login.loginIndex == 13) { // L: 1725
							var33 = 231; // L: 1726
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var33, 16777215, 0); // L: 1727
							var34 = var33 + 20; // L: 1728
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var34, 16777215, 0); // L: 1729
							var4 = Login.loginBoxX + 180; // L: 1730
							var33 = 311; // L: 1731
							Login.titlebuttonSprite.drawAt(var4 - 73, var33 - 20); // L: 1732
							var0.drawCentered("Back", var4, var33 + 5, 16777215, 0); // L: 1733
						} else if (Login.loginIndex == 14) { // L: 1735
							var33 = 201; // L: 1736
							String var24 = ""; // L: 1737
							var5 = ""; // L: 1738
							var6 = ""; // L: 1739
							switch(Login.field901) { // L: 1740
							case 0:
								var24 = "Your account has been disabled."; // L: 1755
								var5 = Strings.field3645; // L: 1756
								var6 = ""; // L: 1757
								break;
							case 1:
								var24 = "Account locked as we suspect it has been stolen."; // L: 1748
								var5 = Strings.field3684; // L: 1749
								var6 = ""; // L: 1750
								break; // L: 1751
							default:
								Messages.Login_promptCredentials(false); // L: 1743
							}

							var0.drawCentered(var24, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1761
							var34 = var33 + 15; // L: 1762
							var2.drawCentered(var5, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1763
							var34 += 15; // L: 1764
							var2.drawCentered(var6, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1765
							var34 += 15; // L: 1766
							var25 = Login.loginBoxX + 180; // L: 1767
							var42 = 276; // L: 1768
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20); // L: 1769
							var0.drawCentered("Support Page", var25, var42 + 5, 16777215, 0); // L: 1770
							var25 = Login.loginBoxX + 180; // L: 1771
							var42 = 326; // L: 1772
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20); // L: 1773
							var0.drawCentered("Back", var25, var42 + 5, 16777215, 0); // L: 1774
						} else if (Login.loginIndex == 24) { // L: 1776
							var33 = 221; // L: 1777
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1778
							var34 = var33 + 15; // L: 1779
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1780
							var34 += 15; // L: 1781
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1782
							var34 += 15; // L: 1783
							var4 = Login.loginBoxX + 180; // L: 1784
							var23 = 301; // L: 1785
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1786
							var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1787
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1790
				int[] var31 = new int[4]; // L: 1791
				Rasterizer2D.Rasterizer2D_getClipArray(var31); // L: 1792
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class321.canvasHeight); // L: 1793
				class341.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1794
				class341.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1795
				Rasterizer2D.Rasterizer2D_setClipArray(var31); // L: 1796
			}

			class92.title_muteSprite[class131.clientPreferences.method2279() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1798
			if (Client.gameState > 5 && Language.Language_EN == Skills.clientLanguage) { // L: 1799
				if (class135.field1569 != null) { // L: 1800
					var34 = Login.xPadding + 5; // L: 1801
					var35 = 463; // L: 1802
					byte var43 = 100; // L: 1803
					byte var45 = 35; // L: 1804
					class135.field1569.drawAt(var34, var35); // L: 1805
					var0.drawCentered("World" + " " + Client.worldId, var43 / 2 + var34, var45 / 2 + var35 - 2, 16777215, 0); // L: 1806
					if (class293.World_request != null) { // L: 1807
						var1.drawCentered("Loading...", var43 / 2 + var34, var45 / 2 + var35 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var43 / 2 + var34, var45 / 2 + var35 + 12, 16777215, 0); // L: 1808
					}
				} else {
					class135.field1569 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(class145.archive8, "sl_button", ""); // L: 1811
				}
			}

		}
	} // L: 1345 1814

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1863745488"
	)
	static final void method2854() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4830 4831 4838
			if (var0.plane == class18.Client_plane && !var0.isFinished) { // L: 4832
				if (Client.cycle >= var0.cycleStart) { // L: 4833
					var0.advance(Client.field556); // L: 4834
					if (var0.isFinished) { // L: 4835
						var0.remove();
					} else {
						ArchiveLoader.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 4836
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4840
}
