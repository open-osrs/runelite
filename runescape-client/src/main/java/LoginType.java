import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4224;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4232;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4226;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4227;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4228;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4233;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4230;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static final LoginType field4231;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 454299659
	)
	final int field4229;
	@ObfuscatedName("x")
	final String field4223;

	static {
		oldscape = new LoginType(0, 0, "", ""); // L: 5
		field4224 = new LoginType(8, 1, "", ""); // L: 6
		field4232 = new LoginType(7, 2, "", ""); // L: 7
		field4226 = new LoginType(4, 3, "", ""); // L: 8
		field4227 = new LoginType(1, 4, "", ""); // L: 9
		field4228 = new LoginType(2, 5, "", ""); // L: 10
		field4233 = new LoginType(6, 6, "", ""); // L: 11
		field4230 = new LoginType(5, 7, "", ""); // L: 12
		field4231 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4224, field4232, field4227, field4226}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4229 = var1; // L: 18
		this.field4223 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lni;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4229 = var1; // L: 23
		this.field4223 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4223; // L: 28
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lct;IIIIII)V",
		garbageValue = "205467401"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5132
			if (var0 instanceof NPC) { // L: 5133
				NPCComposition var6 = ((NPC)var0).definition; // L: 5134
				if (var6.transforms != null) { // L: 5135
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5136
					return;
				}
			}

			int var76 = Players.Players_count; // L: 5138
			int[] var7 = Players.Players_indices; // L: 5139
			byte var8 = 0; // L: 5140
			Player var10;
			int var92;
			if (var1 < var76 && var0.playerCycle == Client.cycle) { // L: 5141
				var10 = (Player)var0; // L: 5143
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 5145
					var9 = false; // L: 5146
				} else {
					boolean var11;
					if (var10 != HealthBarDefinition.localPlayer) { // L: 5149
						var11 = (Client.drawPlayerNames & 4) != 0; // L: 5152
						boolean var12 = var11; // L: 5154
						if (!var11) { // L: 5155
							boolean var13 = (Client.drawPlayerNames & 1) != 0; // L: 5158
							var12 = var13 && var10.isFriend(); // L: 5160
						}

						var9 = var12 || Message.method1147() && var10.isFriendsChatMember(); // L: 5162
					} else {
						var11 = (Client.drawPlayerNames & 8) != 0; // L: 5167
						var9 = var11; // L: 5169
					}
				}

				if (var9) { // L: 5172
					Player var77 = (Player)var0; // L: 5173
					if (var1 < var76) { // L: 5174
						var92 = var0.defaultHeight + 15; // L: 5175
						DefaultsGroup.worldToScreen(var0.x, var0.y, var92); // L: 5177
						AbstractFont var78 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5179
						byte var14 = 9; // L: 5180
						var78.drawCentered(var77.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var14, 16777215, 0); // L: 5181
						var8 = 18; // L: 5182
					}
				}
			}

			int var89 = -2; // L: 5186
			int var17;
			int var23;
			int var24;
			int var79;
			if (!var0.healthBars.method5633()) { // L: 5187
				var79 = var0.defaultHeight + 15; // L: 5188
				DefaultsGroup.worldToScreen(var0.x, var0.y, var79); // L: 5190

				for (HealthBar var95 = (HealthBar)var0.healthBars.last(); var95 != null; var95 = (HealthBar)var0.healthBars.previous()) { // L: 5192
					HealthBarUpdate var81 = var95.get(Client.cycle); // L: 5193
					if (var81 == null) { // L: 5194
						if (var95.isEmpty()) { // L: 5252
							var95.remove();
						}
					} else {
						HealthBarDefinition var96 = var95.definition; // L: 5195
						SpritePixels var82 = var96.getBackSprite(); // L: 5196
						SpritePixels var83 = var96.getFrontSprite(); // L: 5197
						var17 = 0; // L: 5199
						int var84;
						if (var82 != null && var83 != null) { // L: 5200
							if (var96.widthPadding * 2 < var83.subWidth) { // L: 5201
								var17 = var96.widthPadding;
							}

							var84 = var83.subWidth - var17 * 2; // L: 5202
						} else {
							var84 = var96.width; // L: 5204
						}

						int var18 = 255; // L: 5205
						boolean var85 = true; // L: 5206
						int var86 = Client.cycle - var81.cycle; // L: 5207
						int var87 = var84 * var81.health2 / var96.width; // L: 5208
						int var88;
						int var98;
						if (var81.cycleOffset > var86) { // L: 5209
							var88 = var96.field1666 == 0 ? 0 : var96.field1666 * (var86 / var96.field1666); // L: 5210
							var23 = var84 * var81.health / var96.width; // L: 5211
							var98 = var88 * (var87 - var23) / var81.cycleOffset + var23; // L: 5212
						} else {
							var98 = var87; // L: 5215
							var88 = var81.cycleOffset + var96.int5 - var86; // L: 5216
							if (var96.int3 >= 0) { // L: 5217
								var18 = (var88 << 8) / (var96.int5 - var96.int3);
							}
						}

						if (var81.health2 > 0 && var98 < 1) { // L: 5219
							var98 = 1;
						}

						if (var82 != null && var83 != null) { // L: 5220
							if (var98 == var84) { // L: 5221
								var98 += var17 * 2;
							} else {
								var98 += var17; // L: 5222
							}

							var88 = var82.subHeight; // L: 5223
							var89 += var88; // L: 5224
							var23 = var2 + Client.viewportTempX - (var84 >> 1); // L: 5225
							var24 = var3 + Client.viewportTempY - var89; // L: 5226
							var23 -= var17; // L: 5227
							if (var18 >= 0 && var18 < 255) { // L: 5228
								var82.drawTransAt(var23, var24, var18); // L: 5229
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var98, var24 + var88); // L: 5230
								var83.drawTransAt(var23, var24, var18); // L: 5231
							} else {
								var82.drawTransBgAt(var23, var24); // L: 5234
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var98 + var23, var88 + var24); // L: 5235
								var83.drawTransBgAt(var23, var24); // L: 5236
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5238
							var89 += 2; // L: 5239
						} else {
							var89 += 5; // L: 5242
							if (Client.viewportTempX > -1) { // L: 5243
								var88 = var2 + Client.viewportTempX - (var84 >> 1); // L: 5244
								var23 = var3 + Client.viewportTempY - var89; // L: 5245
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var23, var98, 5, 65280); // L: 5246
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var98, var23, var84 - var98, 5, 16711680); // L: 5247
							}

							var89 += 2; // L: 5249
						}
					}
				}
			}

			if (var89 == -2) { // L: 5255
				var89 += 7;
			}

			var89 += var8; // L: 5256
			int var91;
			if (var1 < var76) { // L: 5257
				var10 = (Player)var0; // L: 5258
				if (var10.isHidden) { // L: 5259
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 5260
					var91 = var0.defaultHeight + 15; // L: 5261
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91); // L: 5263
					if (Client.viewportTempX > -1) { // L: 5265
						if (var10.headIconPk != -1) { // L: 5266
							var89 += 25; // L: 5267
							Client.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5268
						}

						if (var10.headIconPrayer != -1) { // L: 5270
							var89 += 25; // L: 5271
							ServerPacket.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5272
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5276
					var91 = var0.defaultHeight + 15; // L: 5277
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91); // L: 5279
					if (Client.viewportTempX > -1) { // L: 5281
						var89 += DevicePcmPlayerProvider.headIconHintSprites[1].subHeight; // L: 5282
						DevicePcmPlayerProvider.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5283
					}
				}
			} else {
				NPCComposition var90 = ((NPC)var0).definition; // L: 5288
				if (var90.transforms != null) { // L: 5289
					var90 = var90.transform();
				}

				if (var90.headIconPrayer >= 0 && var90.headIconPrayer < ServerPacket.headIconPrayerSprites.length) { // L: 5290
					var91 = var0.defaultHeight + 15; // L: 5291
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91); // L: 5293
					if (Client.viewportTempX > -1) { // L: 5295
						ServerPacket.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5296
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5299
					var91 = var0.defaultHeight + 15; // L: 5300
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91); // L: 5302
					if (Client.viewportTempX > -1) { // L: 5304
						DevicePcmPlayerProvider.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field1099 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5307 5308
				var79 = var0.defaultHeight; // L: 5309
				DefaultsGroup.worldToScreen(var0.x, var0.y, var79); // L: 5311
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5313
					Client.overheadTextXOffsets[Client.overheadTextCount] = Login.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5314
					Client.overheadTextAscents[Client.overheadTextCount] = Login.fontBold12.ascent; // L: 5315
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5316
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5317
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5318
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5319
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5320
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5321
					++Client.overheadTextCount; // L: 5322
				}
			}

			for (var79 = 0; var79 < 4; ++var79) { // L: 5326
				var91 = var0.hitSplatCycles[var79]; // L: 5327
				var92 = var0.hitSplatTypes[var79]; // L: 5328
				HitSplatDefinition var97 = null; // L: 5329
				int var93 = 0; // L: 5330
				if (var92 >= 0) { // L: 5331
					if (var91 <= Client.cycle) { // L: 5332
						continue;
					}

					var97 = Canvas.method372(var0.hitSplatTypes[var79]); // L: 5333
					var93 = var97.field1805; // L: 5334
					if (var97 != null && var97.transforms != null) { // L: 5335
						var97 = var97.transform(); // L: 5336
						if (var97 == null) { // L: 5337
							var0.hitSplatCycles[var79] = -1; // L: 5338
							continue; // L: 5339
						}
					}
				} else if (var91 < 0) { // L: 5343
					continue;
				}

				int var15 = var0.hitSplatTypes2[var79]; // L: 5344
				HitSplatDefinition var16 = null; // L: 5345
				if (var15 >= 0) { // L: 5346
					var16 = Canvas.method372(var15); // L: 5347
					if (var16 != null && var16.transforms != null) { // L: 5348
						var16 = var16.transform();
					}
				}

				if (var91 - var93 <= Client.cycle) { // L: 5350
					if (var97 == null) { // L: 5351
						var0.hitSplatCycles[var79] = -1; // L: 5352
					} else {
						var17 = var0.defaultHeight / 2; // L: 5355
						DefaultsGroup.worldToScreen(var0.x, var0.y, var17); // L: 5357
						if (Client.viewportTempX > -1) { // L: 5359
							if (var79 == 1) { // L: 5361
								Client.viewportTempY -= 20; // L: 5362
							}

							if (var79 == 2) { // L: 5364
								Client.viewportTempX -= 15; // L: 5365
								Client.viewportTempY -= 10; // L: 5366
							}

							if (var79 == 3) { // L: 5368
								Client.viewportTempX += 15; // L: 5369
								Client.viewportTempY -= 10; // L: 5370
							}

							SpritePixels var19 = null; // L: 5372
							SpritePixels var20 = null; // L: 5373
							SpritePixels var21 = null; // L: 5374
							SpritePixels var22 = null; // L: 5375
							var23 = 0; // L: 5376
							var24 = 0; // L: 5377
							int var25 = 0; // L: 5378
							int var26 = 0; // L: 5379
							int var27 = 0; // L: 5380
							int var28 = 0; // L: 5381
							int var29 = 0; // L: 5382
							int var30 = 0; // L: 5383
							SpritePixels var31 = null; // L: 5384
							SpritePixels var32 = null; // L: 5385
							SpritePixels var33 = null; // L: 5386
							SpritePixels var34 = null; // L: 5387
							int var35 = 0; // L: 5388
							int var36 = 0; // L: 5389
							int var37 = 0; // L: 5390
							int var38 = 0; // L: 5391
							int var39 = 0; // L: 5392
							int var40 = 0; // L: 5393
							int var41 = 0; // L: 5394
							int var42 = 0; // L: 5395
							int var43 = 0; // L: 5396
							var19 = var97.method3256(); // L: 5397
							int var44;
							if (var19 != null) { // L: 5398
								var23 = var19.subWidth; // L: 5399
								var44 = var19.subHeight; // L: 5400
								if (var44 > var43) { // L: 5401
									var43 = var44;
								}

								var27 = var19.xOffset; // L: 5402
							}

							var20 = var97.method3286(); // L: 5404
							if (var20 != null) { // L: 5405
								var24 = var20.subWidth; // L: 5406
								var44 = var20.subHeight; // L: 5407
								if (var44 > var43) { // L: 5408
									var43 = var44;
								}

								var28 = var20.xOffset; // L: 5409
							}

							var21 = var97.method3258(); // L: 5411
							if (var21 != null) { // L: 5412
								var25 = var21.subWidth; // L: 5413
								var44 = var21.subHeight; // L: 5414
								if (var44 > var43) { // L: 5415
									var43 = var44;
								}

								var29 = var21.xOffset; // L: 5416
							}

							var22 = var97.method3281(); // L: 5418
							if (var22 != null) { // L: 5419
								var26 = var22.subWidth; // L: 5420
								var44 = var22.subHeight; // L: 5421
								if (var44 > var43) { // L: 5422
									var43 = var44;
								}

								var30 = var22.xOffset; // L: 5423
							}

							if (var16 != null) { // L: 5425
								var31 = var16.method3256(); // L: 5426
								if (var31 != null) { // L: 5427
									var35 = var31.subWidth; // L: 5428
									var44 = var31.subHeight; // L: 5429
									if (var44 > var43) { // L: 5430
										var43 = var44;
									}

									var39 = var31.xOffset; // L: 5431
								}

								var32 = var16.method3286(); // L: 5433
								if (var32 != null) { // L: 5434
									var36 = var32.subWidth; // L: 5435
									var44 = var32.subHeight; // L: 5436
									if (var44 > var43) { // L: 5437
										var43 = var44;
									}

									var40 = var32.xOffset; // L: 5438
								}

								var33 = var16.method3258(); // L: 5440
								if (var33 != null) { // L: 5441
									var37 = var33.subWidth; // L: 5442
									var44 = var33.subHeight; // L: 5443
									if (var44 > var43) { // L: 5444
										var43 = var44;
									}

									var41 = var33.xOffset; // L: 5445
								}

								var34 = var16.method3281(); // L: 5447
								if (var34 != null) { // L: 5448
									var38 = var34.subWidth; // L: 5449
									var44 = var34.subHeight; // L: 5450
									if (var44 > var43) { // L: 5451
										var43 = var44;
									}

									var42 = var34.xOffset; // L: 5452
								}
							}

							Font var80 = var97.getFont(); // L: 5457
							if (var80 == null) { // L: 5458
								var80 = FriendLoginUpdate.fontPlain11;
							}

							Font var45;
							if (var16 != null) { // L: 5459
								var45 = var16.getFont(); // L: 5460
								if (var45 == null) { // L: 5461
									var45 = FriendLoginUpdate.fontPlain11;
								}
							} else {
								var45 = FriendLoginUpdate.fontPlain11; // L: 5463
							}

							String var46 = null; // L: 5464
							String var47 = null; // L: 5465
							boolean var48 = false; // L: 5466
							int var49 = 0; // L: 5467
							var46 = var97.getString(var0.hitSplatValues[var79]); // L: 5468
							int var94 = var80.stringWidth(var46); // L: 5469
							if (var16 != null) { // L: 5470
								var47 = var16.getString(var0.hitSplatValues2[var79]); // L: 5471
								var49 = var45.stringWidth(var47); // L: 5472
							}

							int var50 = 0; // L: 5474
							int var51 = 0; // L: 5475
							if (var24 > 0) { // L: 5476
								if (var21 == null && var22 == null) { // L: 5477
									var50 = 1; // L: 5478
								} else {
									var50 = var94 / var24 + 1;
								}
							}

							if (var16 != null && var36 > 0) { // L: 5480 5481
								if (var33 == null && var34 == null) { // L: 5482
									var51 = 1; // L: 5483
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0; // L: 5486
							int var53 = var52; // L: 5487
							if (var23 > 0) { // L: 5488
								var52 += var23;
							}

							var52 += 2; // L: 5489
							int var54 = var52; // L: 5490
							if (var25 > 0) { // L: 5491
								var52 += var25;
							}

							int var55 = var52; // L: 5492
							int var56 = var52; // L: 5493
							int var57;
							if (var24 > 0) { // L: 5494
								var57 = var50 * var24; // L: 5495
								var52 += var57; // L: 5496
								var56 += (var57 - var94) / 2; // L: 5497
							} else {
								var52 += var94; // L: 5500
							}

							var57 = var52; // L: 5502
							if (var26 > 0) { // L: 5503
								var52 += var26;
							}

							int var58 = 0; // L: 5504
							int var59 = 0; // L: 5505
							int var60 = 0; // L: 5506
							int var61 = 0; // L: 5507
							int var62 = 0; // L: 5508
							int var63;
							if (var16 != null) { // L: 5509
								var52 += 2; // L: 5510
								var58 = var52; // L: 5511
								if (var35 > 0) { // L: 5512
									var52 += var35;
								}

								var52 += 2; // L: 5513
								var59 = var52; // L: 5514
								if (var37 > 0) { // L: 5515
									var52 += var37;
								}

								var60 = var52; // L: 5516
								var62 = var52; // L: 5517
								if (var36 > 0) { // L: 5518
									var63 = var36 * var51; // L: 5519
									var52 += var63; // L: 5520
									var62 += (var63 - var49) / 2; // L: 5521
								} else {
									var52 += var49; // L: 5524
								}

								var61 = var52; // L: 5526
								if (var38 > 0) { // L: 5527
									var52 += var38;
								}
							}

							var63 = var0.hitSplatCycles[var79] - Client.cycle; // L: 5529
							int var64 = var97.field1812 - var63 * var97.field1812 / var97.field1805; // L: 5530
							int var65 = var63 * var97.field1807 / var97.field1805 + -var97.field1807; // L: 5531
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1)); // L: 5532
							int var67 = var3 + Client.viewportTempY - 12 + var65; // L: 5533
							int var68 = var67; // L: 5534
							int var69 = var43 + var67; // L: 5535
							int var70 = var67 + var97.field1820 + 15; // L: 5536
							int var71 = var70 - var80.maxAscent; // L: 5537
							int var72 = var70 + var80.maxDescent; // L: 5538
							if (var71 < var67) { // L: 5539
								var68 = var71;
							}

							if (var72 > var69) { // L: 5540
								var69 = var72;
							}

							int var73 = 0; // L: 5541
							int var74;
							int var75;
							if (var16 != null) { // L: 5542
								var73 = var67 + var16.field1820 + 15; // L: 5543
								var74 = var73 - var45.maxAscent; // L: 5544
								var75 = var73 + var45.maxDescent; // L: 5545
								if (var74 < var68) { // L: 5546
									;
								}

								if (var75 > var69) { // L: 5547
									;
								}
							}

							var74 = 255; // L: 5549
							if (var97.field1814 >= 0) { // L: 5550
								var74 = (var63 << 8) / (var97.field1805 - var97.field1814);
							}

							if (var74 >= 0 && var74 < 255) { // L: 5551
								if (var19 != null) { // L: 5552
									var19.drawTransAt(var53 + var66 - var27, var67, var74);
								}

								if (var21 != null) { // L: 5553
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) { // L: 5554
									for (var75 = 0; var75 < var50; ++var75) { // L: 5555
										var20.drawTransAt(var75 * var24 + (var55 + var66 - var28), var67, var74); // L: 5556
									}
								}

								if (var22 != null) { // L: 5559
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var80.drawAlpha(var46, var66 + var56, var70, var97.textColor, 0, var74); // L: 5560
								if (var16 != null) { // L: 5561
									if (var31 != null) { // L: 5562
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) { // L: 5563
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) { // L: 5564
										for (var75 = 0; var75 < var51; ++var75) { // L: 5565
											var32.drawTransAt(var75 * var36 + (var66 + var60 - var40), var67, var74); // L: 5566
										}
									}

									if (var34 != null) { // L: 5569
										var34.drawTransAt(var61 + var66 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var16.textColor, 0, var74); // L: 5570
								}
							} else {
								if (var19 != null) { // L: 5574
									var19.drawTransBgAt(var53 + var66 - var27, var67);
								}

								if (var21 != null) { // L: 5575
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}

								if (var20 != null) { // L: 5576
									for (var75 = 0; var75 < var50; ++var75) { // L: 5577
										var20.drawTransBgAt(var24 * var75 + (var55 + var66 - var28), var67); // L: 5578
									}
								}

								if (var22 != null) { // L: 5581
									var22.drawTransBgAt(var66 + var57 - var30, var67);
								}

								var80.draw(var46, var56 + var66, var70, var97.textColor | -16777216, 0); // L: 5582
								if (var16 != null) { // L: 5583
									if (var31 != null) { // L: 5584
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) { // L: 5585
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) { // L: 5586
										for (var75 = 0; var75 < var51; ++var75) { // L: 5587
											var32.drawTransBgAt(var36 * var75 + (var66 + var60 - var40), var67); // L: 5588
										}
									}

									if (var34 != null) { // L: 5591
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var62 + var66, var73, var16.textColor | -16777216, 0); // L: 5592
								}
							}
						}
					}
				}
			}

		}
	} // L: 5597
}
