import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lak;",
		garbageValue = "-317198731"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lak;",
		garbageValue = "830371012"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lak;",
		garbageValue = "-1527876593"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lak;",
		garbageValue = "243303881"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Lmx;Lmx;I)V",
		garbageValue = "-417556486"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GraphicsObject.canvasWidth - 765) / 2; // L: 1171
		Login.loginBoxX = Login.xPadding + 202; // L: 1172
		Decimator.loginBoxCenter = Login.loginBoxX + 180; // L: 1173
		if (Login.worldSelectOpen) { // L: 1174
			Language.method5885(var0, var1); // L: 1175
		} else {
			UserComparator6.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1178
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1179
			Clock.logoSprite.drawAt(Login.xPadding + 382 - Clock.logoSprite.subWidth / 2, 18); // L: 1180
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1181
				byte var3 = 20; // L: 1182
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1183
				var4 = 253 - var3; // L: 1184
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1185
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1186
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1187
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1188
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1189
			}

			String var5;
			String var7;
			String var8;
			int var9;
			char[] var10;
			int var11;
			short var25;
			int var26;
			short var27;
			if (Client.gameState == 20) { // L: 1191
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1192
				var25 = 201; // L: 1193
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1194
				var26 = var25 + 15; // L: 1195
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1196
				var26 += 15; // L: 1197
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1198
				var26 += 15; // L: 1199
				var26 += 7; // L: 1200
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1201
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var26, 16777215, 0); // L: 1202
					var27 = 200; // L: 1203

					for (var5 = class168.method3253(); var0.stringWidth(var5) > var27; var5 = var5.substring(0, var5.length() - 1)) { // L: 1204 1205 1206
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var26, 16777215, 0); // L: 1208
					var26 += 15; // L: 1209
					var7 = Login.Login_password; // L: 1211
					var9 = var7.length(); // L: 1214
					var10 = new char[var9]; // L: 1216

					for (var11 = 0; var11 < var9; ++var11) { // L: 1217
						var10[var11] = '*';
					}

					var8 = new String(var10); // L: 1218

					for (var8 = var8; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) { // L: 1222 1223 1224
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var26, 16777215, 0); // L: 1226
					var26 += 15; // L: 1227
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1230
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1231
				short var19;
				if (Login.loginIndex == 0) { // L: 1232
					var25 = 251; // L: 1233
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1234
					var26 = var25 + 30; // L: 1235
					var4 = Login.loginBoxX + 180 - 80; // L: 1236
					var19 = 291; // L: 1237
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1238
					var0.drawLines("New User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1239
					var4 = Login.loginBoxX + 180 + 80; // L: 1240
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1241
					var0.drawLines("Existing User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1242
				} else if (Login.loginIndex == 1) { // L: 1244
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1245
					var25 = 236; // L: 1246
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1247
					var26 = var25 + 15; // L: 1248
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1249
					var26 += 15; // L: 1250
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1251
					var26 += 15; // L: 1252
					var4 = Login.loginBoxX + 180 - 80; // L: 1253
					var19 = 321; // L: 1254
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1255
					var0.drawCentered("Continue", var4, var19 + 5, 16777215, 0); // L: 1256
					var4 = Login.loginBoxX + 180 + 80; // L: 1257
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1258
					var0.drawCentered("Cancel", var4, var19 + 5, 16777215, 0); // L: 1259
				} else {
					IndexedSprite var28;
					if (Login.loginIndex == 2) { // L: 1261
						var25 = 201; // L: 1262
						var0.drawCentered(Login.Login_response1, Decimator.loginBoxCenter, var25, 16776960, 0); // L: 1263
						var26 = var25 + 15; // L: 1264
						var0.drawCentered(Login.Login_response2, Decimator.loginBoxCenter, var26, 16776960, 0); // L: 1265
						var26 += 15; // L: 1266
						var0.drawCentered(Login.Login_response3, Decimator.loginBoxCenter, var26, 16776960, 0); // L: 1267
						var26 += 15; // L: 1268
						var26 += 7; // L: 1269
						var0.draw("Login: ", Decimator.loginBoxCenter - 110, var26, 16777215, 0); // L: 1270
						var27 = 200; // L: 1271

						for (var5 = class168.method3253(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) { // L: 1272 1273 1274
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Decimator.loginBoxCenter - 70, var26, 16777215, 0); // L: 1276
						var26 += 15; // L: 1277
						var7 = Login.Login_password; // L: 1279
						var9 = var7.length(); // L: 1282
						var10 = new char[var9]; // L: 1284

						for (var11 = 0; var11 < var9; ++var11) { // L: 1285
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1286

						for (var8 = var8; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) { // L: 1290 1291 1292
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Decimator.loginBoxCenter - 108, var26, 16777215, 0); // L: 1294
						var26 += 15; // L: 1295
						var25 = 277; // L: 1296
						var9 = Decimator.loginBoxCenter + -117; // L: 1297
						boolean var29 = Client.Login_isUsernameRemembered; // L: 1299
						boolean var12 = Login.field879; // L: 1300
						var28 = var29 ? (var12 ? UrlRequester.field1354 : class101.options_buttons_2Sprite) : (var12 ? Login.field888 : class67.options_buttons_0Sprite); // L: 1302
						var28.drawAt(var9, var25); // L: 1305
						var9 = var9 + var28.subWidth + 5; // L: 1306
						var1.draw("Remember username", var9, var25 + 13, 16776960, 0); // L: 1307
						var9 = Decimator.loginBoxCenter + 24; // L: 1308
						boolean var15 = class12.clientPreferences.method2257(); // L: 1310
						boolean var16 = Login.field881; // L: 1311
						IndexedSprite var14 = var15 ? (var16 ? UrlRequester.field1354 : class101.options_buttons_2Sprite) : (var16 ? Login.field888 : class67.options_buttons_0Sprite); // L: 1313
						var14.drawAt(var9, var25); // L: 1316
						var9 = var9 + var14.subWidth + 5; // L: 1317
						var1.draw("Hide username", var9, var25 + 13, 16776960, 0); // L: 1318
						var26 = var25 + 15; // L: 1319
						int var17 = Decimator.loginBoxCenter - 80; // L: 1320
						short var18 = 321; // L: 1321
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20); // L: 1322
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0); // L: 1323
						var17 = Decimator.loginBoxCenter + 80; // L: 1324
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20); // L: 1325
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0); // L: 1326
						var25 = 357; // L: 1327
						switch(Login.field907) { // L: 1328
						case 2:
							class17.field89 = "Having trouble logging in?"; // L: 1333
							break;
						default:
							class17.field89 = "Can't login? Click here."; // L: 1330
						}

						ChatChannel.field976 = new Bounds(Decimator.loginBoxCenter, var25, var1.stringWidth(class17.field89), 11); // L: 1336
						ChatChannel.field977 = new Bounds(Decimator.loginBoxCenter, var25, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1337
						var1.drawCentered(class17.field89, Decimator.loginBoxCenter, var25, 16777215, 0); // L: 1338
					} else if (Login.loginIndex == 3) { // L: 1340
						var25 = 201; // L: 1341
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1342
						var26 = var25 + 20; // L: 1343
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1344
						var26 += 15; // L: 1345
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1346
						var26 += 15; // L: 1347
						var4 = Login.loginBoxX + 180; // L: 1348
						var19 = 276; // L: 1349
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1350
						var2.drawCentered("Try again", var4, var19 + 5, 16777215, 0); // L: 1351
						var4 = Login.loginBoxX + 180; // L: 1352
						var19 = 326; // L: 1353
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1354
						var2.drawCentered("Forgotten password?", var4, var19 + 5, 16777215, 0); // L: 1355
					} else if (Login.loginIndex == 4) { // L: 1357
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1358
						var25 = 236; // L: 1359
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1360
						var26 = var25 + 15; // L: 1361
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1362
						var26 += 15; // L: 1363
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1364
						var26 += 15; // L: 1365
						var5 = "PIN: "; // L: 1367
						var7 = class92.otp; // L: 1369
						var9 = var7.length(); // L: 1372
						var10 = new char[var9]; // L: 1374

						for (var11 = 0; var11 < var9; ++var11) { // L: 1375
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1376
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var26, 16777215, 0); // L: 1380
						var26 -= 8; // L: 1381
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var26, 16776960, 0); // L: 1382
						var26 += 15; // L: 1383
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var26, 16776960, 0); // L: 1384
						int var22 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1385
						var9 = var26 - var0.ascent; // L: 1386
						if (Login.field900) { // L: 1388
							var28 = class101.options_buttons_2Sprite; // L: 1389
						} else {
							var28 = class67.options_buttons_0Sprite; // L: 1392
						}

						var28.drawAt(var22, var9); // L: 1394
						var26 += 15; // L: 1395
						var11 = Login.loginBoxX + 180 - 80; // L: 1396
						short var30 = 321; // L: 1397
						Login.titlebuttonSprite.drawAt(var11 - 73, var30 - 20); // L: 1398
						var0.drawCentered("Continue", var11, var30 + 5, 16777215, 0); // L: 1399
						var11 = Login.loginBoxX + 180 + 80; // L: 1400
						Login.titlebuttonSprite.drawAt(var11 - 73, var30 - 20); // L: 1401
						var0.drawCentered("Cancel", var11, var30 + 5, 16777215, 0); // L: 1402
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var30 + 36, 255, 0); // L: 1403
					} else if (Login.loginIndex == 5) { // L: 1405
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1406
						var25 = 221; // L: 1407
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1408
						var26 = var25 + 15; // L: 1409
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1410
						var26 += 15; // L: 1411
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1412
						var26 += 15; // L: 1413
						var26 += 14; // L: 1414
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var26, 16777215, 0); // L: 1415
						var27 = 174; // L: 1416

						for (var5 = class168.method3253(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) { // L: 1417 1418 1419
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class166.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var26, 16777215, 0); // L: 1421
						var26 += 15; // L: 1422
						int var23 = Login.loginBoxX + 180 - 80; // L: 1423
						short var21 = 321; // L: 1424
						Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20); // L: 1425
						var0.drawCentered("Recover", var23, var21 + 5, 16777215, 0); // L: 1426
						var23 = Login.loginBoxX + 180 + 80; // L: 1427
						Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20); // L: 1428
						var0.drawCentered("Back", var23, var21 + 5, 16777215, 0); // L: 1429
						var21 = 356; // L: 1430
						var1.drawCentered("Still having trouble logging in?", Decimator.loginBoxCenter, var21, 268435455, 0); // L: 1431
					} else if (Login.loginIndex == 6) { // L: 1433
						var25 = 201; // L: 1434
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1435
						var26 = var25 + 15; // L: 1436
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1437
						var26 += 15; // L: 1438
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1439
						var26 += 15; // L: 1440
						var4 = Login.loginBoxX + 180; // L: 1441
						var19 = 321; // L: 1442
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1443
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1444
					} else if (Login.loginIndex == 7) { // L: 1446
						if (class92.field1273 && !Client.onMobile) { // L: 1447
							var25 = 201; // L: 1448
							var0.drawCentered(Login.Login_response1, Decimator.loginBoxCenter, var25, 16776960, 0); // L: 1449
							var26 = var25 + 15; // L: 1450
							var0.drawCentered(Login.Login_response2, Decimator.loginBoxCenter, var26, 16776960, 0); // L: 1451
							var26 += 15; // L: 1452
							var0.drawCentered(Login.Login_response3, Decimator.loginBoxCenter, var26, 16776960, 0); // L: 1453
							var4 = Decimator.loginBoxCenter - 150; // L: 1454
							var26 += 10; // L: 1455

							int var31;
							for (var31 = 0; var31 < 8; ++var31) { // L: 1456
								Login.titlebuttonSprite.method7927(var4, var26, 30, 40); // L: 1457
								boolean var35 = var31 == Login.field896 & Client.cycle % 40 < 20; // L: 1458
								var0.draw((Login.field876[var31] == null ? "" : Login.field876[var31]) + (var35 ? class166.colorStartTag(16776960) + "|" : ""), var4 + 10, var26 + 27, 16777215, 0); // L: 1459
								if (var31 != 1 && var31 != 3) { // L: 1460
									var4 += 35; // L: 1465
								} else {
									var4 += 50; // L: 1461
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var26 + 27, 16777215, 0); // L: 1462
								}
							}

							var31 = Decimator.loginBoxCenter - 80; // L: 1468
							short var36 = 321; // L: 1469
							Login.titlebuttonSprite.drawAt(var31 - 73, var36 - 20); // L: 1470
							var0.drawCentered("Submit", var31, var36 + 5, 16777215, 0); // L: 1471
							var31 = Decimator.loginBoxCenter + 80; // L: 1472
							Login.titlebuttonSprite.drawAt(var31 - 73, var36 - 20); // L: 1473
							var0.drawCentered("Cancel", var31, var36 + 5, 16777215, 0); // L: 1474
						} else {
							var25 = 216; // L: 1477
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1478
							var26 = var25 + 15; // L: 1479
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1480
							var26 += 15; // L: 1481
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1482
							var26 += 15; // L: 1483
							var4 = Login.loginBoxX + 180 - 80; // L: 1484
							var19 = 321; // L: 1485
							Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1486
							var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0); // L: 1487
							var4 = Login.loginBoxX + 180 + 80; // L: 1488
							Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1489
							var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1490
						}
					} else if (Login.loginIndex == 8) { // L: 1493
						var25 = 216; // L: 1494
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1495
						var26 = var25 + 15; // L: 1496
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1497
						var26 += 15; // L: 1498
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1499
						var26 += 15; // L: 1500
						var4 = Login.loginBoxX + 180 - 80; // L: 1501
						var19 = 321; // L: 1502
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1503
						var0.drawCentered("Privacy Policy", var4, var19 + 5, 16777215, 0); // L: 1504
						var4 = Login.loginBoxX + 180 + 80; // L: 1505
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1506
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1507
					} else if (Login.loginIndex == 9) { // L: 1509
						var25 = 221; // L: 1510
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1511
						var26 = var25 + 25; // L: 1512
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1513
						var26 += 25; // L: 1514
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1515
						var4 = Login.loginBoxX + 180; // L: 1516
						var19 = 311; // L: 1517
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1518
						var0.drawCentered("Try again", var4, var19 + 5, 16777215, 0); // L: 1519
					} else if (Login.loginIndex == 10) { // L: 1521
						var26 = Login.loginBoxX + 180; // L: 1522
						var27 = 209; // L: 1523
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var27, 16776960, 0); // L: 1524
						var4 = var27 + 20; // L: 1525
						Clock.field1839.drawAt(var26 - 109, var4); // L: 1526
						Login.field882.drawAt(var26 - 48, var4 + 18); // L: 1527
					} else if (Login.loginIndex == 12) { // L: 1529
						var26 = Decimator.loginBoxCenter; // L: 1530
						var27 = 216; // L: 1531
						var2.drawCentered("Before using this app, please read and accept our", var26, var27, 16777215, 0); // L: 1532
						var4 = var27 + 17; // L: 1533
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var26, var4, 16777215, 0); // L: 1534
						var4 += 17; // L: 1535
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var26, var4, 16777215, 0); // L: 1536
						var4 += 17; // L: 1537
						var2.drawCentered("By accepting, you agree to these documents.", var26, var4, 16777215, 0); // L: 1538
						var26 = Decimator.loginBoxCenter - 80; // L: 1539
						var27 = 311; // L: 1540
						Login.titlebuttonSprite.drawAt(var26 - 73, var27 - 20); // L: 1541
						var0.drawCentered("Accept", var26, var27 + 5, 16777215, 0); // L: 1542
						var26 = Decimator.loginBoxCenter + 80; // L: 1543
						Login.titlebuttonSprite.drawAt(var26 - 73, var27 - 20); // L: 1544
						var0.drawCentered("Decline", var26, var27 + 5, 16777215, 0); // L: 1545
					} else if (Login.loginIndex == 13) { // L: 1547
						var25 = 231; // L: 1548
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var25, 16777215, 0); // L: 1549
						var26 = var25 + 20; // L: 1550
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var26, 16777215, 0); // L: 1551
						var4 = Login.loginBoxX + 180; // L: 1552
						var25 = 311; // L: 1553
						Login.titlebuttonSprite.drawAt(var4 - 73, var25 - 20); // L: 1554
						var0.drawCentered("Back", var4, var25 + 5, 16777215, 0); // L: 1555
					} else if (Login.loginIndex == 14) { // L: 1557
						var25 = 201; // L: 1558
						String var20 = ""; // L: 1559
						var5 = ""; // L: 1560
						String var6 = ""; // L: 1561
						switch(Login.field887) { // L: 1562
						case 0:
							var20 = "Your account has been disabled."; // L: 1577
							var5 = Strings.field3689; // L: 1578
							var6 = ""; // L: 1579
							break;
						case 1:
							var20 = "Account locked as we suspect it has been stolen."; // L: 1565
							var5 = Strings.field3743; // L: 1566
							var6 = ""; // L: 1567
							break;
						default:
							PcmPlayer.Login_promptCredentials(false); // L: 1572
						}

						var0.drawCentered(var20, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1583
						var26 = var25 + 15; // L: 1584
						var2.drawCentered(var5, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1585
						var26 += 15; // L: 1586
						var2.drawCentered(var6, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1587
						var26 += 15; // L: 1588
						int var32 = Login.loginBoxX + 180; // L: 1589
						short var33 = 276; // L: 1590
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20); // L: 1591
						var0.drawCentered("Support Page", var32, var33 + 5, 16777215, 0); // L: 1592
						var32 = Login.loginBoxX + 180; // L: 1593
						var33 = 326; // L: 1594
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20); // L: 1595
						var0.drawCentered("Back", var32, var33 + 5, 16777215, 0); // L: 1596
					} else if (Login.loginIndex == 24) { // L: 1598
						var25 = 221; // L: 1599
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1600
						var26 = var25 + 15; // L: 1601
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1602
						var26 += 15; // L: 1603
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1604
						var26 += 15; // L: 1605
						var4 = Login.loginBoxX + 180; // L: 1606
						var19 = 301; // L: 1607
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1608
						var0.drawCentered("Ok", var4, var19 + 5, 16777215, 0); // L: 1609
					} else if (Login.loginIndex == 26) { // L: 1611
						var25 = 216; // L: 1612
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1613
						var26 = var25 + 15; // L: 1614
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1615
						var26 += 15; // L: 1616
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1617
						var26 += 15; // L: 1618
						var4 = Login.loginBoxX + 180 - 80; // L: 1619
						var19 = 321; // L: 1620
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1621
						var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0); // L: 1622
						var4 = Login.loginBoxX + 180 + 80; // L: 1623
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1624
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1625
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1628
				int[] var24 = new int[4]; // L: 1629
				Rasterizer2D.Rasterizer2D_getClipArray(var24); // L: 1630
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class433.canvasHeight); // L: 1631
				class193.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1632
				class193.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1633
				Rasterizer2D.Rasterizer2D_setClipArray(var24); // L: 1634
			}

			class358.title_muteSprite[class12.clientPreferences.method2226() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1636
			if (Client.gameState > 5 && class263.clientLanguage == Language.Language_EN) { // L: 1637
				if (ArchiveDiskAction.field3997 != null) { // L: 1638
					var26 = Login.xPadding + 5; // L: 1639
					var27 = 463; // L: 1640
					byte var34 = 100; // L: 1641
					byte var37 = 35; // L: 1642
					ArchiveDiskAction.field3997.drawAt(var26, var27); // L: 1643
					var0.drawCentered("World" + " " + Client.worldId, var34 / 2 + var26, var37 / 2 + var27 - 2, 16777215, 0); // L: 1644
					if (NPC.World_request != null) { // L: 1645
						var1.drawCentered("Loading...", var34 / 2 + var26, var37 / 2 + var27 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var34 / 2 + var26, var37 / 2 + var27 + 12, 16777215, 0); // L: 1646
					}
				} else {
					ArchiveDiskAction.field3997 = JagexCache.SpriteBuffer_getIndexedSpriteByName(class305.archive8, "sl_button", ""); // L: 1649
				}
			}

		}
	} // L: 1176 1652
}
