import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class27 extends class14 {
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	static class370 field215;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1631949421
	)
	int field216;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class27(class2 var1) {
		this.this$0 = var1;
		this.field216 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field216 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method132(this.field216); // L: 153
	} // L: 154

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IB)V",
		garbageValue = "-1"
	)
	static void method364(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 183
			Messages.logoSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 184
		} else if ((var1 & 1073741824) != 0) { // L: 186
			Messages.logoSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 187
		} else {
			Messages.logoSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 190
		}

	} // L: 192

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;B)V",
		garbageValue = "0"
	)
	static void method353(Font var0, Font var1) {
		int var4;
		int var5;
		int var9;
		int var11;
		int var13;
		if (Varcs.worldSelectBackSprites == null) { // L: 1224
			Archive var3 = ModeWhere.archive8; // L: 1226
			var4 = var3.getGroupId("sl_back"); // L: 1228
			var5 = var3.getFileId(var4, ""); // L: 1229
			SpritePixels[] var6;
			if (!Message.method1263(var3, var4, var5)) { // L: 1232
				var6 = null; // L: 1233
			} else {
				SpritePixels[] var8 = new SpritePixels[class397.SpriteBuffer_spriteCount]; // L: 1238
				var9 = 0;

				while (true) {
					if (var9 >= class397.SpriteBuffer_spriteCount) {
						ArchiveDisk.method5993(); // L: 1252
						var6 = var8; // L: 1255
						break;
					}

					SpritePixels var10 = var8[var9] = new SpritePixels(); // L: 1240
					var10.width = class397.SpriteBuffer_spriteWidth; // L: 1241
					var10.height = class244.SpriteBuffer_spriteHeight; // L: 1242
					var10.xOffset = class397.SpriteBuffer_xOffsets[var9]; // L: 1243
					var10.yOffset = class26.SpriteBuffer_yOffsets[var9]; // L: 1244
					var10.subWidth = Canvas.SpriteBuffer_spriteWidths[var9]; // L: 1245
					var10.subHeight = Clock.SpriteBuffer_spriteHeights[var9]; // L: 1246
					var11 = var10.subHeight * var10.subWidth; // L: 1247
					byte[] var12 = class126.SpriteBuffer_pixels[var9]; // L: 1248
					var10.pixels = new int[var11]; // L: 1249

					for (var13 = 0; var13 < var11; ++var13) { // L: 1250
						var10.pixels[var13] = class397.SpriteBuffer_spritePalette[var12[var13] & 255];
					}

					++var9; // L: 1239
				}
			}

			Varcs.worldSelectBackSprites = var6; // L: 1259
		}

		if (class364.worldSelectFlagSprites == null) { // L: 1261
			class364.worldSelectFlagSprites = WorldMapLabelSize.method3268(ModeWhere.archive8, "sl_flags", "");
		}

		if (class10.worldSelectArrows == null) { // L: 1262
			class10.worldSelectArrows = WorldMapLabelSize.method3268(ModeWhere.archive8, "sl_arrows", "");
		}

		if (Huffman.worldSelectStars == null) { // L: 1263
			Huffman.worldSelectStars = WorldMapLabelSize.method3268(ModeWhere.archive8, "sl_stars", "");
		}

		if (NetCache.worldSelectLeftSprite == null) { // L: 1264
			NetCache.worldSelectLeftSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "leftarrow", "");
		}

		if (class12.worldSelectRightSprite == null) { // L: 1265
			class12.worldSelectRightSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1266
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1267
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1268
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1269
		if (Huffman.worldSelectStars != null) { // L: 1270
			Huffman.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1271
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1272
			Huffman.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1273
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1274
		}

		if (class10.worldSelectArrows != null) { // L: 1276
			int var22 = Login.xPadding + 280; // L: 1277
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1278
				class10.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var22, 4); // L: 1279
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1280
				class10.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1281
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1282
			int var23 = Login.xPadding + 390; // L: 1283
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1284
				class10.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var23, 4); // L: 1285
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1286
				class10.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1287
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1288
			var4 = Login.xPadding + 500; // L: 1289
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1290
				class10.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var4, 4); // L: 1291
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1292
				class10.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1293
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1294
			var5 = Login.xPadding + 610; // L: 1295
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1296
				class10.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var5, 4); // L: 1297
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1298
				class10.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1299
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1300
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1302
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1303
		Login.hoveredWorldIndex = -1; // L: 1304
		if (Varcs.worldSelectBackSprites != null) { // L: 1305
			byte var31 = 88; // L: 1306
			byte var32 = 19; // L: 1307
			var4 = 765 / (var31 + 1) - 1; // L: 1308
			var5 = 480 / (var32 + 1); // L: 1309

			int var24;
			int var25;
			do {
				var24 = var5; // L: 1311
				var25 = var4; // L: 1312
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1313
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1314
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1315
					--var5;
				}
			} while(var24 != var5 || var25 != var4); // L: 1316

			var24 = (765 - var31 * var4) / (var4 + 1); // L: 1318
			if (var24 > 5) { // L: 1319
				var24 = 5;
			}

			var25 = (480 - var5 * var32) / (var5 + 1); // L: 1320
			if (var25 > 5) { // L: 1321
				var25 = 5;
			}

			int var26 = (765 - var4 * var31 - var24 * (var4 - 1)) / 2; // L: 1322
			var9 = (480 - var32 * var5 - var25 * (var5 - 1)) / 2; // L: 1323
			int var27 = (var5 + World.World_count - 1) / var5; // L: 1324
			Login.worldSelectPagesCount = var27 - var4; // L: 1325
			if (NetCache.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1326
				NetCache.worldSelectLeftSprite.drawAt(8, class0.canvasHeight / 2 - NetCache.worldSelectLeftSprite.subHeight / 2); // L: 1327
			}

			if (class12.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1329
				class12.worldSelectRightSprite.drawAt(AttackOption.canvasWidth - class12.worldSelectRightSprite.subWidth - 8, class0.canvasHeight / 2 - class12.worldSelectRightSprite.subHeight / 2); // L: 1330
			}

			var11 = var9 + 23; // L: 1332
			int var28 = var26 + Login.xPadding; // L: 1333
			var13 = 0; // L: 1334
			boolean var14 = false; // L: 1335
			int var15 = Login.worldSelectPage; // L: 1336

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1337 1338
				World var17 = World.World_worlds[var16]; // L: 1341
				boolean var18 = true; // L: 1342
				String var19 = Integer.toString(var17.population); // L: 1343
				if (var17.population == -1) { // L: 1344
					var19 = "OFF"; // L: 1345
					var18 = false; // L: 1346
				} else if (var17.population > 1980) { // L: 1348
					var19 = "FULL"; // L: 1349
					var18 = false; // L: 1350
				}

				int var21 = 0; // L: 1353
				byte var20;
				if (var17.isBeta()) { // L: 1354
					if (var17.isMembersOnly()) { // L: 1355
						var20 = 7;
					} else {
						var20 = 6; // L: 1356
					}
				} else if (var17.isDeadman()) { // L: 1358
					var21 = 16711680; // L: 1359
					if (var17.isMembersOnly()) { // L: 1360
						var20 = 5;
					} else {
						var20 = 4; // L: 1361
					}
				} else if (var17.method1778()) { // L: 1363
					if (var17.isMembersOnly()) { // L: 1364
						var20 = 9;
					} else {
						var20 = 8; // L: 1365
					}
				} else if (var17.isPvp()) { // L: 1367
					if (var17.isMembersOnly()) { // L: 1368
						var20 = 3;
					} else {
						var20 = 2; // L: 1369
					}
				} else if (var17.isMembersOnly()) { // L: 1372
					var20 = 1;
				} else {
					var20 = 0; // L: 1373
				}

				if (MouseHandler.MouseHandler_x >= var28 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var31 + var28 && MouseHandler.MouseHandler_y < var32 + var11 && var18) { // L: 1375
					Login.hoveredWorldIndex = var16; // L: 1376
					Varcs.worldSelectBackSprites[var20].drawTransOverlayAt(var28, var11, 128, 16777215); // L: 1377
					var14 = true; // L: 1378
				} else {
					Varcs.worldSelectBackSprites[var20].drawAt(var28, var11); // L: 1380
				}

				if (class364.worldSelectFlagSprites != null) { // L: 1381
					class364.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var28 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var28 + 15, var32 / 2 + var11 + 5, var21, -1); // L: 1382
				var1.drawCentered(var19, var28 + 60, var32 / 2 + var11 + 5, 268435455, -1); // L: 1383
				var11 = var11 + var25 + var32; // L: 1384
				++var13; // L: 1385
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1386
					var28 = var28 + var24 + var31; // L: 1387
					var13 = 0; // L: 1388
					++var15; // L: 1389
				}
			}

			if (var14) { // L: 1392
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1393
				int var29 = var1.ascent + 8; // L: 1394
				int var30 = MouseHandler.MouseHandler_y + 25; // L: 1395
				if (var29 + var30 > 480) { // L: 1396
					var30 = MouseHandler.MouseHandler_y - 25 - var29; // L: 1397
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var30, var16, var29, 16777120); // L: 1399
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var30, var16, var29, 0); // L: 1400
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var30 + var1.ascent + 4, 0, -1); // L: 1401
			}
		}

		AbstractWorldMapData.rasterProvider.drawFull(0, 0); // L: 1404
	} // L: 1405

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Liv;IB)I",
		garbageValue = "1"
	)
	static final int method355(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10070
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10072
				int var3 = 0; // L: 10073
				int var4 = 0; // L: 10074
				byte var5 = 0; // L: 10075

				while (true) {
					int var6 = var2[var4++]; // L: 10077
					int var7 = 0; // L: 10078
					byte var8 = 0; // L: 10079
					if (var6 == 0) { // L: 10080
						return var3;
					}

					if (var6 == 1) { // L: 10081
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10082
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10083
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10084
						var9 = var2[var4++] << 16; // L: 10085
						var9 += var2[var4++]; // L: 10086
						var10 = WorldMapData_1.getWidget(var9); // L: 10087
						var11 = var2[var4++]; // L: 10088
						if (var11 != -1 && (!class250.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10089
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10090
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10091
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10095
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10096
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10097
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10098
						var7 = class262.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10099
						for (var9 = 0; var9 < 25; ++var9) { // L: 10100
							if (Skills.Skills_enabled[var9]) { // L: 10101
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10104
						var9 = var2[var4++] << 16; // L: 10105
						var9 += var2[var4++]; // L: 10106
						var10 = WorldMapData_1.getWidget(var9); // L: 10107
						var11 = var2[var4++]; // L: 10108
						if (var11 != -1 && (!class250.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10109
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10110
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10111
									var7 = 999999999; // L: 10112
									break; // L: 10113
								}
							}
						}
					}

					if (var6 == 11) { // L: 10118
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10119
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10120
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10121
						int var13 = var2[var4++]; // L: 10122
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10123
					}

					if (var6 == 14) { // L: 10125
						var9 = var2[var4++]; // L: 10126
						var7 = ScriptFrame.getVarbit(var9); // L: 10127
					}

					if (var6 == 15) { // L: 10129
						var8 = 1;
					}

					if (var6 == 16) { // L: 10130
						var8 = 2;
					}

					if (var6 == 17) { // L: 10131
						var8 = 3;
					}

					if (var6 == 18) { // L: 10132
						var7 = (class262.localPlayer.x >> 7) + class15.baseX;
					}

					if (var6 == 19) { // L: 10133
						var7 = (class262.localPlayer.y >> 7) + WorldMapSprite.baseY;
					}

					if (var6 == 20) { // L: 10134
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10135
						if (var5 == 0) { // L: 10136
							var3 += var7;
						}

						if (var5 == 1) { // L: 10137
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10138
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10139
							var3 *= var7;
						}

						var5 = 0; // L: 10140
					} else {
						var5 = var8; // L: 10142
					}
				}
			} catch (Exception var14) { // L: 10145
				return -1; // L: 10146
			}
		} else {
			return -2;
		}
	}
}
