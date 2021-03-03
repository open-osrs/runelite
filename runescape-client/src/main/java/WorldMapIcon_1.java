import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 92186385
	)
	static int field218;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -197408887
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1040980621
	)
	@Export("element")
	int element;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1242494149
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1347635285
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhd;Lhd;ILas;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)Laa;",
		garbageValue = "31041"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-413607837"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 47
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1875187157"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 51
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-551497433"
	)
	@Export("init")
	void init() {
		this.element = WorldMapAreaData.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(InvDefinition.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = InvDefinition.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Le;",
		garbageValue = "-2092634459"
	)
	public static class7[] method376() {
		return new class7[]{class7.field41}; // L: 12
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1961749617"
	)
	public static void method377(int var0, int var1) {
		VarbitComposition var2 = Tiles.method1219(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1521238081"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 3943
			byte var2 = 4; // L: 3944
			int var3 = var2 + 6; // L: 3945
			int var4 = var2 + 6; // L: 3946
			int var5 = Login.fontPlain12.lineWidth(var0, 250); // L: 3947
			int var6 = Login.fontPlain12.lineCount(var0, 250) * 13; // L: 3948
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0); // L: 3949
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215); // L: 3950
			Login.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 3951
			Projectile.method2262(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6); // L: 3952
			if (var1) { // L: 3953
				FileSystem.rasterProvider.drawFull(0, 0); // L: 3954
			} else {
				int var7 = var3; // L: 3957
				int var8 = var4; // L: 3958
				int var9 = var5; // L: 3959
				int var10 = var6; // L: 3960

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 3962
					if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 3963
						Client.field827[var11] = true;
					}
				}
			}

		}
	} // L: 3967

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1982809553"
	)
	static final void method375() {
		HealthBar.method2166(false); // L: 5172
		Client.field785 = 0; // L: 5173
		boolean var0 = true; // L: 5174

		int var1;
		for (var1 = 0; var1 < class2.regionLandArchives.length; ++var1) { // L: 5175
			if (class92.regionMapArchiveIds[var1] != -1 && class2.regionLandArchives[var1] == null) { // L: 5176 5177
				class2.regionLandArchives[var1] = class8.archive5.takeFile(class92.regionMapArchiveIds[var1], 0); // L: 5178
				if (class2.regionLandArchives[var1] == null) { // L: 5179
					var0 = false; // L: 5180
					++Client.field785; // L: 5181
				}
			}

			if (MusicPatchNode2.regionLandArchiveIds[var1] != -1 && Interpreter.regionMapArchives[var1] == null) { // L: 5185 5186
				Interpreter.regionMapArchives[var1] = class8.archive5.takeFileEncrypted(MusicPatchNode2.regionLandArchiveIds[var1], 0, Bounds.xteaKeys[var1]); // L: 5187
				if (Interpreter.regionMapArchives[var1] == null) { // L: 5188
					var0 = false; // L: 5189
					++Client.field785; // L: 5190
				}
			}
		}

		if (!var0) { // L: 5195
			Client.field720 = 1; // L: 5196
		} else {
			Client.field718 = 0; // L: 5199
			var0 = true; // L: 5200

			int var4;
			int var9;
			int var10;
			int var11;
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			int var48;
			Buffer var51;
			for (var1 = 0; var1 < class2.regionLandArchives.length; ++var1) { // L: 5201
				byte[] var2 = Interpreter.regionMapArchives[var1]; // L: 5202
				if (var2 != null) { // L: 5203
					var48 = (class238.regions[var1] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX; // L: 5204
					var4 = (class238.regions[var1] & 255) * 64 - NetCache.baseY; // L: 5205
					if (Client.isInInstance) { // L: 5206
						var48 = 10; // L: 5207
						var4 = 10; // L: 5208
					}

					boolean var7 = true; // L: 5213
					var51 = new Buffer(var2); // L: 5214
					var9 = -1; // L: 5215

					label1246:
					while (true) {
						var10 = var51.method5704(); // L: 5217
						if (var10 == 0) { // L: 5218
							var0 &= var7; // L: 5251
							break;
						}

						var9 += var10; // L: 5219
						var11 = 0; // L: 5220
						boolean var12 = false; // L: 5221

						while (true) {
							while (!var12) { // L: 5223
								var13 = var51.readUShortSmart(); // L: 5229
								if (var13 == 0) { // L: 5230
									continue label1246;
								}

								var11 += var13 - 1; // L: 5231
								var14 = var11 & 63; // L: 5232
								var15 = var11 >> 6 & 63; // L: 5233
								var16 = var51.readUnsignedByte() >> 2; // L: 5234
								var17 = var48 + var15; // L: 5235
								var18 = var4 + var14; // L: 5236
								if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) { // L: 5237
									ObjectComposition var53 = WorldMapAreaData.getObjectDefinition(var9); // L: 5238
									if (var16 != 22 || !Client.isLowDetail || var53.int1 != 0 || var53.interactType == 1 || var53.boolean2) { // L: 5239
										if (!var53.needsModelFiles()) { // L: 5240
											++Client.field718; // L: 5241
											var7 = false; // L: 5242
										}

										var12 = true; // L: 5244
									}
								}
							}

							var13 = var51.readUShortSmart(); // L: 5224
							if (var13 == 0) { // L: 5225
								break;
							}

							var51.readUnsignedByte(); // L: 5226
						}
					}
				}
			}

			if (!var0) { // L: 5254
				Client.field720 = 2; // L: 5255
			} else {
				if (Client.field720 != 0) { // L: 5258
					drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				UserComparator5.playPcmPlayers(); // L: 5259
				MilliClock.scene.clear(); // L: 5260

				for (var1 = 0; var1 < 4; ++var1) { // L: 5261
					Client.collisionMaps[var1].clear();
				}

				int var44;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5262
					for (var44 = 0; var44 < 104; ++var44) { // L: 5263
						for (var48 = 0; var48 < 104; ++var48) { // L: 5264
							Tiles.Tiles_renderFlags[var1][var44][var48] = 0; // L: 5265
						}
					}
				}

				UserComparator5.playPcmPlayers(); // L: 5269
				class58.method939(); // L: 5270
				var1 = class2.regionLandArchives.length; // L: 5271

				for (ObjectSound var54 = (ObjectSound)ObjectSound.objectSounds.last(); var54 != null; var54 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 5273
					if (var54.stream1 != null) { // L: 5274
						VarbitComposition.pcmStreamMixer.removeSubStream(var54.stream1); // L: 5275
						var54.stream1 = null; // L: 5276
					}

					if (var54.stream2 != null) { // L: 5278
						VarbitComposition.pcmStreamMixer.removeSubStream(var54.stream2); // L: 5279
						var54.stream2 = null; // L: 5280
					}
				}

				ObjectSound.objectSounds.clear(); // L: 5283
				HealthBar.method2166(true); // L: 5285
				int var5;
				int var19;
				int var20;
				int var21;
				int var59;
				if (!Client.isInInstance) { // L: 5286
					byte[] var45;
					for (var44 = 0; var44 < var1; ++var44) { // L: 5287
						var48 = (class238.regions[var44] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX; // L: 5288
						var4 = (class238.regions[var44] & 255) * 64 - NetCache.baseY; // L: 5289
						var45 = class2.regionLandArchives[var44]; // L: 5290
						if (var45 != null) { // L: 5291
							UserComparator5.playPcmPlayers(); // L: 5292
							ModelData0.method3411(var45, var48, var4, class3.field24 * 8 - 48, class39.field284 * 8 - 48, Client.collisionMaps); // L: 5293
						}
					}

					for (var44 = 0; var44 < var1; ++var44) { // L: 5296
						var48 = (class238.regions[var44] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX; // L: 5297
						var4 = (class238.regions[var44] & 255) * 64 - NetCache.baseY; // L: 5298
						var45 = class2.regionLandArchives[var44]; // L: 5299
						if (var45 == null && class39.field284 < 800) { // L: 5300
							UserComparator5.playPcmPlayers(); // L: 5301
							class4.method55(var48, var4, 64, 64); // L: 5302
						}
					}

					HealthBar.method2166(true); // L: 5305

					for (var44 = 0; var44 < var1; ++var44) { // L: 5306
						byte[] var3 = Interpreter.regionMapArchives[var44]; // L: 5307
						if (var3 != null) { // L: 5308
							var4 = (class238.regions[var44] >> 8) * 64 - GrandExchangeOfferNameComparator.baseX; // L: 5309
							var5 = (class238.regions[var44] & 255) * 64 - NetCache.baseY; // L: 5310
							UserComparator5.playPcmPlayers(); // L: 5311
							Scene var49 = MilliClock.scene; // L: 5312
							CollisionMap[] var50 = Client.collisionMaps; // L: 5313
							var51 = new Buffer(var3); // L: 5315
							var9 = -1; // L: 5316

							while (true) {
								var10 = var51.method5704(); // L: 5318
								if (var10 == 0) { // L: 5319
									break;
								}

								var9 += var10; // L: 5320
								var11 = 0; // L: 5321

								while (true) {
									var59 = var51.readUShortSmart(); // L: 5323
									if (var59 == 0) { // L: 5324
										break;
									}

									var11 += var59 - 1; // L: 5325
									var13 = var11 & 63; // L: 5326
									var14 = var11 >> 6 & 63; // L: 5327
									var15 = var11 >> 12; // L: 5328
									var16 = var51.readUnsignedByte(); // L: 5329
									var17 = var16 >> 2; // L: 5330
									var18 = var16 & 3; // L: 5331
									var19 = var4 + var14; // L: 5332
									var20 = var13 + var5; // L: 5333
									if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) { // L: 5334
										var21 = var15; // L: 5335
										if ((Tiles.Tiles_renderFlags[1][var19][var20] & 2) == 2) { // L: 5336
											var21 = var15 - 1;
										}

										CollisionMap var52 = null; // L: 5337
										if (var21 >= 0) { // L: 5338
											var52 = var50[var21];
										}

										GameEngine.method1134(var15, var19, var20, var9, var18, var17, var49, var52); // L: 5339
									}
								}
							}
						}
					}
				}

				int var6;
				int var8;
				int var58;
				if (Client.isInInstance) { // L: 5347
					for (var44 = 0; var44 < 4; ++var44) { // L: 5348
						UserComparator5.playPcmPlayers(); // L: 5349

						for (var48 = 0; var48 < 13; ++var48) { // L: 5350
							for (var4 = 0; var4 < 13; ++var4) { // L: 5351
								boolean var57 = false; // L: 5352
								var6 = Client.instanceChunkTemplates[var44][var48][var4]; // L: 5353
								if (var6 != -1) { // L: 5354
									var58 = var6 >> 24 & 3; // L: 5355
									var8 = var6 >> 1 & 3; // L: 5356
									var9 = var6 >> 14 & 1023; // L: 5357
									var10 = var6 >> 3 & 2047; // L: 5358
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5359

									for (var59 = 0; var59 < class238.regions.length; ++var59) { // L: 5360
										if (class238.regions[var59] == var11 && class2.regionLandArchives[var59] != null) { // L: 5361
											WorldMapManager.method749(class2.regionLandArchives[var59], var44, var48 * 8, var4 * 8, var58, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5362
											var57 = true; // L: 5363
											break;
										}
									}
								}

								if (!var57) { // L: 5368
									var58 = var44; // L: 5369
									var8 = var48 * 8; // L: 5370
									var9 = var4 * 8; // L: 5371

									for (var10 = 0; var10 < 8; ++var10) { // L: 5373
										for (var11 = 0; var11 < 8; ++var11) { // L: 5374
											Tiles.Tiles_heights[var58][var10 + var8][var11 + var9] = 0;
										}
									}

									if (var8 > 0) { // L: 5376
										for (var10 = 1; var10 < 8; ++var10) { // L: 5377
											Tiles.Tiles_heights[var58][var8][var10 + var9] = Tiles.Tiles_heights[var58][var8 - 1][var10 + var9];
										}
									}

									if (var9 > 0) { // L: 5379
										for (var10 = 1; var10 < 8; ++var10) { // L: 5380
											Tiles.Tiles_heights[var58][var10 + var8][var9] = Tiles.Tiles_heights[var58][var10 + var8][var9 - 1];
										}
									}

									if (var8 > 0 && Tiles.Tiles_heights[var58][var8 - 1][var9] != 0) { // L: 5382
										Tiles.Tiles_heights[var58][var8][var9] = Tiles.Tiles_heights[var58][var8 - 1][var9];
									} else if (var9 > 0 && Tiles.Tiles_heights[var58][var8][var9 - 1] != 0) { // L: 5383
										Tiles.Tiles_heights[var58][var8][var9] = Tiles.Tiles_heights[var58][var8][var9 - 1];
									} else if (var8 > 0 && var9 > 0 && Tiles.Tiles_heights[var58][var8 - 1][var9 - 1] != 0) { // L: 5384
										Tiles.Tiles_heights[var58][var8][var9] = Tiles.Tiles_heights[var58][var8 - 1][var9 - 1];
									}
								}
							}
						}
					}

					for (var44 = 0; var44 < 13; ++var44) { // L: 5390
						for (var48 = 0; var48 < 13; ++var48) { // L: 5391
							var4 = Client.instanceChunkTemplates[0][var44][var48]; // L: 5392
							if (var4 == -1) { // L: 5393
								class4.method55(var44 * 8, var48 * 8, 8, 8); // L: 5394
							}
						}
					}

					HealthBar.method2166(true); // L: 5398

					for (var44 = 0; var44 < 4; ++var44) { // L: 5399
						UserComparator5.playPcmPlayers(); // L: 5400

						for (var48 = 0; var48 < 13; ++var48) { // L: 5401
							for (var4 = 0; var4 < 13; ++var4) { // L: 5402
								var5 = Client.instanceChunkTemplates[var44][var48][var4]; // L: 5403
								if (var5 != -1) { // L: 5404
									var6 = var5 >> 24 & 3; // L: 5405
									var58 = var5 >> 1 & 3; // L: 5406
									var8 = var5 >> 14 & 1023; // L: 5407
									var9 = var5 >> 3 & 2047; // L: 5408
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5409

									for (var11 = 0; var11 < class238.regions.length; ++var11) { // L: 5410
										if (class238.regions[var11] == var10 && Interpreter.regionMapArchives[var11] != null) { // L: 5411
											WorldMapSection0.method310(Interpreter.regionMapArchives[var11], var44, var48 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var58, MilliClock.scene, Client.collisionMaps); // L: 5412
											break; // L: 5413
										}
									}
								}
							}
						}
					}
				}

				HealthBar.method2166(true); // L: 5421
				UserComparator5.playPcmPlayers(); // L: 5422
				Scene var55 = MilliClock.scene; // L: 5423
				CollisionMap[] var56 = Client.collisionMaps; // L: 5424

				for (var4 = 0; var4 < 4; ++var4) { // L: 5426
					for (var5 = 0; var5 < 104; ++var5) { // L: 5427
						for (var6 = 0; var6 < 104; ++var6) { // L: 5428
							if ((Tiles.Tiles_renderFlags[var4][var5][var6] & 1) == 1) { // L: 5429
								var58 = var4; // L: 5430
								if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) { // L: 5431
									var58 = var4 - 1;
								}

								if (var58 >= 0) { // L: 5432
									var56[var58].setBlockedByFloor(var5, var6);
								}
							}
						}
					}
				}

				Tiles.field518 += (int)(Math.random() * 5.0D) - 2; // L: 5437
				if (Tiles.field518 < -8) { // L: 5438
					Tiles.field518 = -8;
				}

				if (Tiles.field518 > 8) { // L: 5439
					Tiles.field518 = 8;
				}

				Tiles.field528 += (int)(Math.random() * 5.0D) - 2; // L: 5440
				if (Tiles.field528 < -16) { // L: 5441
					Tiles.field528 = -16;
				}

				if (Tiles.field528 > 16) { // L: 5442
					Tiles.field528 = 16;
				}

				int[] var10000;
				for (var4 = 0; var4 < 4; ++var4) { // L: 5443
					byte[][] var63 = TaskHandler.field2045[var4]; // L: 5444
					var11 = (int)Math.sqrt(5100.0D); // L: 5450
					var59 = var11 * 768 >> 8; // L: 5451

					int var22;
					for (var13 = 1; var13 < 103; ++var13) { // L: 5452
						for (var14 = 1; var14 < 103; ++var14) { // L: 5453
							var15 = Tiles.Tiles_heights[var4][var14 + 1][var13] - Tiles.Tiles_heights[var4][var14 - 1][var13]; // L: 5454
							var16 = Tiles.Tiles_heights[var4][var14][var13 + 1] - Tiles.Tiles_heights[var4][var14][var13 - 1]; // L: 5455
							var17 = (int)Math.sqrt((double)(var16 * var16 + var15 * var15 + 65536)); // L: 5456
							var18 = (var15 << 8) / var17; // L: 5457
							var19 = 65536 / var17; // L: 5458
							var20 = (var16 << 8) / var17; // L: 5459
							var21 = (var18 * -50 + var20 * -50 + var19 * -10) / var59 + 96; // L: 5460
							var22 = (var63[var14 - 1][var13] >> 2) + (var63[var14][var13 - 1] >> 2) + (var63[var14 + 1][var13] >> 3) + (var63[var14][var13 + 1] >> 3) + (var63[var14][var13] >> 1); // L: 5461
							WorldMapSprite.field257[var14][var13] = var21 - var22; // L: 5462
						}
					}

					for (var13 = 0; var13 < 104; ++var13) { // L: 5465
						GrandExchangeOfferAgeComparator.Tiles_hue[var13] = 0; // L: 5466
						Tiles.Tiles_saturation[var13] = 0; // L: 5467
						WorldMapLabel.Tiles_lightness[var13] = 0; // L: 5468
						TaskHandler.Tiles_hueMultiplier[var13] = 0; // L: 5469
						WorldMapID.field292[var13] = 0; // L: 5470
					}

					for (var13 = -5; var13 < 109; ++var13) { // L: 5472
						for (var14 = 0; var14 < 104; ++var14) { // L: 5473
							var15 = var13 + 5; // L: 5474
							int var10002;
							if (var15 >= 0 && var15 < 104) { // L: 5475
								var16 = Tiles.field517[var4][var15][var14] & 255; // L: 5476
								if (var16 > 0) { // L: 5477
									FloorUnderlayDefinition var46 = class51.method876(var16 - 1); // L: 5478
									var10000 = GrandExchangeOfferAgeComparator.Tiles_hue; // L: 5479
									var10000[var14] += var46.hue;
									var10000 = Tiles.Tiles_saturation; // L: 5480
									var10000[var14] += var46.saturation;
									var10000 = WorldMapLabel.Tiles_lightness; // L: 5481
									var10000[var14] += var46.lightness;
									var10000 = TaskHandler.Tiles_hueMultiplier; // L: 5482
									var10000[var14] += var46.hueMultiplier;
									var10002 = WorldMapID.field292[var14]++; // L: 5483
								}
							}

							var16 = var13 - 5; // L: 5486
							if (var16 >= 0 && var16 < 104) { // L: 5487
								var17 = Tiles.field517[var4][var16][var14] & 255; // L: 5488
								if (var17 > 0) { // L: 5489
									FloorUnderlayDefinition var47 = class51.method876(var17 - 1); // L: 5490
									var10000 = GrandExchangeOfferAgeComparator.Tiles_hue; // L: 5491
									var10000[var14] -= var47.hue;
									var10000 = Tiles.Tiles_saturation; // L: 5492
									var10000[var14] -= var47.saturation;
									var10000 = WorldMapLabel.Tiles_lightness; // L: 5493
									var10000[var14] -= var47.lightness;
									var10000 = TaskHandler.Tiles_hueMultiplier; // L: 5494
									var10000[var14] -= var47.hueMultiplier;
									var10002 = WorldMapID.field292[var14]--; // L: 5495
								}
							}
						}

						if (var13 >= 1 && var13 < 103) { // L: 5499
							var14 = 0; // L: 5500
							var15 = 0; // L: 5501
							var16 = 0; // L: 5502
							var17 = 0; // L: 5503
							var18 = 0; // L: 5504

							for (var19 = -5; var19 < 109; ++var19) { // L: 5505
								var20 = var19 + 5; // L: 5506
								if (var20 >= 0 && var20 < 104) { // L: 5507
									var14 += GrandExchangeOfferAgeComparator.Tiles_hue[var20]; // L: 5508
									var15 += Tiles.Tiles_saturation[var20]; // L: 5509
									var16 += WorldMapLabel.Tiles_lightness[var20]; // L: 5510
									var17 += TaskHandler.Tiles_hueMultiplier[var20]; // L: 5511
									var18 += WorldMapID.field292[var20]; // L: 5512
								}

								var21 = var19 - 5; // L: 5514
								if (var21 >= 0 && var21 < 104) { // L: 5515
									var14 -= GrandExchangeOfferAgeComparator.Tiles_hue[var21]; // L: 5516
									var15 -= Tiles.Tiles_saturation[var21]; // L: 5517
									var16 -= WorldMapLabel.Tiles_lightness[var21]; // L: 5518
									var17 -= TaskHandler.Tiles_hueMultiplier[var21]; // L: 5519
									var18 -= WorldMapID.field292[var21]; // L: 5520
								}

								if (var19 >= 1 && var19 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var13][var19] & 2) != 0 || (Tiles.Tiles_renderFlags[var4][var13][var19] & 16) == 0)) { // L: 5522 5523 5524 5525
									if (var4 < Tiles.Tiles_minPlane) { // L: 5528
										Tiles.Tiles_minPlane = var4;
									}

									var22 = Tiles.field517[var4][var13][var19] & 255; // L: 5529
									int var23 = class200.field2399[var4][var13][var19] & 255; // L: 5530
									if (var22 > 0 || var23 > 0) { // L: 5531
										int var24 = Tiles.Tiles_heights[var4][var13][var19]; // L: 5532
										int var25 = Tiles.Tiles_heights[var4][var13 + 1][var19]; // L: 5533
										int var26 = Tiles.Tiles_heights[var4][var13 + 1][var19 + 1]; // L: 5534
										int var27 = Tiles.Tiles_heights[var4][var13][var19 + 1]; // L: 5535
										int var28 = WorldMapSprite.field257[var13][var19]; // L: 5536
										int var29 = WorldMapSprite.field257[var13 + 1][var19]; // L: 5537
										int var30 = WorldMapSprite.field257[var13 + 1][var19 + 1]; // L: 5538
										int var31 = WorldMapSprite.field257[var13][var19 + 1]; // L: 5539
										int var32 = -1; // L: 5540
										int var33 = -1; // L: 5541
										int var34;
										int var35;
										if (var22 > 0) { // L: 5542
											var34 = var14 * 256 / var17; // L: 5543
											var35 = var15 / var18; // L: 5544
											int var36 = var16 / var18; // L: 5545
											var32 = Interpreter.hslToRgb(var34, var35, var36); // L: 5546
											var34 = var34 + Tiles.field518 & 255; // L: 5547
											var36 += Tiles.field528; // L: 5548
											if (var36 < 0) { // L: 5549
												var36 = 0;
											} else if (var36 > 255) { // L: 5550
												var36 = 255;
											}

											var33 = Interpreter.hslToRgb(var34, var35, var36); // L: 5551
										}

										if (var4 > 0) { // L: 5553
											boolean var61 = true; // L: 5554
											if (var22 == 0 && Tiles.field530[var4][var13][var19] != 0) { // L: 5555
												var61 = false;
											}

											if (var23 > 0 && !WallDecoration.method3449(var23 - 1).hideUnderlay) { // L: 5556
												var61 = false;
											}

											if (var61 && var24 == var25 && var24 == var26 && var27 == var24) { // L: 5557 5558
												var10000 = class2.field12[var4][var13];
												var10000[var19] |= 2340;
											}
										}

										var34 = 0; // L: 5561
										if (var33 != -1) { // L: 5562
											var34 = Rasterizer3D.Rasterizer3D_colorPalette[GameObject.method3451(var33, 96)];
										}

										if (var23 == 0) { // L: 5563
											var55.addTile(var4, var13, var19, 0, 0, -1, var24, var25, var26, var27, GameObject.method3451(var32, var28), GameObject.method3451(var32, var29), GameObject.method3451(var32, var30), GameObject.method3451(var32, var31), 0, 0, 0, 0, var34, 0); // L: 5564
										} else {
											var35 = Tiles.field530[var4][var13][var19] + 1; // L: 5567
											byte var62 = class1.field1[var4][var13][var19]; // L: 5568
											FloorOverlayDefinition var37 = WallDecoration.method3449(var23 - 1); // L: 5569
											int var38 = var37.texture; // L: 5570
											int var39;
											int var40;
											int var41;
											int var42;
											if (var38 >= 0) { // L: 5573
												var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var38); // L: 5574
												var39 = -1; // L: 5575
											} else if (var37.primaryRgb == 16711935) { // L: 5578
												var39 = -2; // L: 5579
												var38 = -1; // L: 5580
												var40 = -2; // L: 5581
											} else {
												var39 = Interpreter.hslToRgb(var37.hue, var37.saturation, var37.lightness); // L: 5584
												var41 = var37.hue + Tiles.field518 & 255; // L: 5585
												var42 = var37.lightness + Tiles.field528; // L: 5586
												if (var42 < 0) { // L: 5587
													var42 = 0;
												} else if (var42 > 255) { // L: 5588
													var42 = 255;
												}

												var40 = Interpreter.hslToRgb(var41, var37.saturation, var42); // L: 5589
											}

											var41 = 0; // L: 5592
											if (var40 != -2) { // L: 5593
												var41 = Rasterizer3D.Rasterizer3D_colorPalette[SecureRandomCallable.method1226(var40, 96)];
											}

											if (var37.secondaryRgb != -1) { // L: 5594
												var42 = var37.secondaryHue + Tiles.field518 & 255; // L: 5595
												int var43 = var37.secondaryLightness + Tiles.field528; // L: 5596
												if (var43 < 0) { // L: 5597
													var43 = 0;
												} else if (var43 > 255) { // L: 5598
													var43 = 255;
												}

												var40 = Interpreter.hslToRgb(var42, var37.secondarySaturation, var43); // L: 5599
												var41 = Rasterizer3D.Rasterizer3D_colorPalette[SecureRandomCallable.method1226(var40, 96)]; // L: 5600
											}

											var55.addTile(var4, var13, var19, var35, var62, var38, var24, var25, var26, var27, GameObject.method3451(var32, var28), GameObject.method3451(var32, var29), GameObject.method3451(var32, var30), GameObject.method3451(var32, var31), SecureRandomCallable.method1226(var39, var28), SecureRandomCallable.method1226(var39, var29), SecureRandomCallable.method1226(var39, var30), SecureRandomCallable.method1226(var39, var31), var34, var41); // L: 5602
										}
									}
								}
							}
						}
					}

					for (var13 = 1; var13 < 103; ++var13) { // L: 5609
						for (var14 = 1; var14 < 103; ++var14) { // L: 5610
							var55.setTileMinPlane(var4, var14, var13, WorldMapData_0.method250(var4, var14, var13)); // L: 5611
						}
					}

					Tiles.field517[var4] = null; // L: 5614
					class200.field2399[var4] = null; // L: 5615
					Tiles.field530[var4] = null; // L: 5616
					class1.field1[var4] = null; // L: 5617
					TaskHandler.field2045[var4] = null; // L: 5618
				}

				var55.method3263(-50, -10, -50); // L: 5620

				for (var4 = 0; var4 < 104; ++var4) { // L: 5621
					for (var5 = 0; var5 < 104; ++var5) { // L: 5622
						if ((Tiles.Tiles_renderFlags[1][var4][var5] & 2) == 2) { // L: 5623
							var55.setLinkBelow(var4, var5);
						}
					}
				}

				var4 = 1; // L: 5626
				var5 = 2; // L: 5627
				var6 = 4; // L: 5628

				for (var58 = 0; var58 < 4; ++var58) { // L: 5629
					if (var58 > 0) { // L: 5630
						var4 <<= 3; // L: 5631
						var5 <<= 3; // L: 5632
						var6 <<= 3; // L: 5633
					}

					for (var8 = 0; var8 <= var58; ++var8) { // L: 5635
						for (var9 = 0; var9 <= 104; ++var9) { // L: 5636
							for (var10 = 0; var10 <= 104; ++var10) { // L: 5637
								short var60;
								if ((class2.field12[var8][var10][var9] & var4) != 0) { // L: 5638
									var11 = var9; // L: 5639
									var59 = var9; // L: 5640
									var13 = var8; // L: 5641

									for (var14 = var8; var11 > 0 && (class2.field12[var8][var10][var11 - 1] & var4) != 0; --var11) { // L: 5642 5643
									}

									while (var59 < 104 && (class2.field12[var8][var10][var59 + 1] & var4) != 0) { // L: 5644
										++var59;
									}

									label812:
									while (var13 > 0) { // L: 5645
										for (var15 = var11; var15 <= var59; ++var15) { // L: 5646
											if ((class2.field12[var13 - 1][var10][var15] & var4) == 0) {
												break label812;
											}
										}

										--var13; // L: 5647
									}

									label801:
									while (var14 < var58) { // L: 5649
										for (var15 = var11; var15 <= var59; ++var15) { // L: 5650
											if ((class2.field12[var14 + 1][var10][var15] & var4) == 0) {
												break label801;
											}
										}

										++var14; // L: 5651
									}

									var15 = (var14 + 1 - var13) * (var59 - var11 + 1); // L: 5653
									if (var15 >= 8) { // L: 5654
										var60 = 240; // L: 5655
										var17 = Tiles.Tiles_heights[var14][var10][var11] - var60; // L: 5656
										var18 = Tiles.Tiles_heights[var13][var10][var11]; // L: 5657
										Scene.Scene_addOccluder(var58, 1, var10 * 128, var10 * 128, var11 * 128, var59 * 128 + 128, var17, var18); // L: 5658

										for (var19 = var13; var19 <= var14; ++var19) { // L: 5659
											for (var20 = var11; var20 <= var59; ++var20) { // L: 5660
												var10000 = class2.field12[var19][var10];
												var10000[var20] &= ~var4;
											}
										}
									}
								}

								if ((class2.field12[var8][var10][var9] & var5) != 0) { // L: 5664
									var11 = var10; // L: 5665
									var59 = var10; // L: 5666
									var13 = var8; // L: 5667

									for (var14 = var8; var11 > 0 && (class2.field12[var8][var11 - 1][var9] & var5) != 0; --var11) { // L: 5668 5669
									}

									while (var59 < 104 && (class2.field12[var8][var59 + 1][var9] & var5) != 0) { // L: 5670
										++var59;
									}

									label865:
									while (var13 > 0) { // L: 5671
										for (var15 = var11; var15 <= var59; ++var15) { // L: 5672
											if ((class2.field12[var13 - 1][var15][var9] & var5) == 0) {
												break label865;
											}
										}

										--var13; // L: 5673
									}

									label854:
									while (var14 < var58) { // L: 5675
										for (var15 = var11; var15 <= var59; ++var15) { // L: 5676
											if ((class2.field12[var14 + 1][var15][var9] & var5) == 0) {
												break label854;
											}
										}

										++var14; // L: 5677
									}

									var15 = (var59 - var11 + 1) * (var14 + 1 - var13); // L: 5679
									if (var15 >= 8) { // L: 5680
										var60 = 240; // L: 5681
										var17 = Tiles.Tiles_heights[var14][var11][var9] - var60; // L: 5682
										var18 = Tiles.Tiles_heights[var13][var11][var9]; // L: 5683
										Scene.Scene_addOccluder(var58, 2, var11 * 128, var59 * 128 + 128, var9 * 128, var9 * 128, var17, var18); // L: 5684

										for (var19 = var13; var19 <= var14; ++var19) { // L: 5685
											for (var20 = var11; var20 <= var59; ++var20) { // L: 5686
												var10000 = class2.field12[var19][var20];
												var10000[var9] &= ~var5;
											}
										}
									}
								}

								if ((class2.field12[var8][var10][var9] & var6) != 0) { // L: 5690
									var11 = var10; // L: 5691
									var59 = var10; // L: 5692
									var13 = var9; // L: 5693

									for (var14 = var9; var13 > 0 && (class2.field12[var8][var10][var13 - 1] & var6) != 0; --var13) { // L: 5694 5695
									}

									while (var14 < 104 && (class2.field12[var8][var10][var14 + 1] & var6) != 0) { // L: 5696
										++var14;
									}

									label918:
									while (var11 > 0) { // L: 5697
										for (var15 = var13; var15 <= var14; ++var15) { // L: 5698
											if ((class2.field12[var8][var11 - 1][var15] & var6) == 0) {
												break label918;
											}
										}

										--var11; // L: 5699
									}

									label907:
									while (var59 < 104) { // L: 5701
										for (var15 = var13; var15 <= var14; ++var15) { // L: 5702
											if ((class2.field12[var8][var59 + 1][var15] & var6) == 0) {
												break label907;
											}
										}

										++var59; // L: 5703
									}

									if ((var14 - var13 + 1) * (var59 - var11 + 1) >= 4) { // L: 5705
										var15 = Tiles.Tiles_heights[var8][var11][var13]; // L: 5706
										Scene.Scene_addOccluder(var58, 4, var11 * 128, var59 * 128 + 128, var13 * 128, var14 * 128 + 128, var15, var15); // L: 5707

										for (var16 = var11; var16 <= var59; ++var16) { // L: 5708
											for (var17 = var13; var17 <= var14; ++var17) { // L: 5709
												var10000 = class2.field12[var8][var16];
												var10000[var17] &= ~var6;
											}
										}
									}
								}
							}
						}
					}
				}

				HealthBar.method2166(true); // L: 5718
				var4 = Tiles.Tiles_minPlane; // L: 5719
				if (var4 > class90.Client_plane) { // L: 5720
					var4 = class90.Client_plane;
				}

				if (var4 < class90.Client_plane - 1) { // L: 5721
					var4 = class90.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5722
					MilliClock.scene.init(Tiles.Tiles_minPlane);
				} else {
					MilliClock.scene.init(0); // L: 5723
				}

				for (var5 = 0; var5 < 104; ++var5) { // L: 5724
					for (var6 = 0; var6 < 104; ++var6) { // L: 5725
						HitSplatDefinition.updateItemPile(var5, var6); // L: 5726
					}
				}

				UserComparator5.playPcmPlayers(); // L: 5729

				for (PendingSpawn var64 = (PendingSpawn)Client.pendingSpawns.last(); var64 != null; var64 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5731 5732 5738
					if (var64.hitpoints == -1) { // L: 5733
						var64.delay = 0; // L: 5734
						WorldMapElement.method4592(var64); // L: 5735
					} else {
						var64.remove(); // L: 5737
					}
				}

				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5741
				PacketBufferNode var65;
				if (class1.client.hasFrame()) { // L: 5742
					var65 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher); // L: 5744
					var65.packetBuffer.writeInt(1057001181); // L: 5745
					Client.packetWriter.addNode(var65); // L: 5746
				}

				if (!Client.isInInstance) { // L: 5748
					var5 = (class3.field24 - 6) / 8; // L: 5749
					var6 = (class3.field24 + 6) / 8; // L: 5750
					var58 = (class39.field284 - 6) / 8; // L: 5751
					var8 = (class39.field284 + 6) / 8; // L: 5752

					for (var9 = var5 - 1; var9 <= var6 + 1; ++var9) { // L: 5753
						for (var10 = var58 - 1; var10 <= var8 + 1; ++var10) { // L: 5754
							if (var9 < var5 || var9 > var6 || var10 < var58 || var10 > var8) { // L: 5755
								class8.archive5.loadRegionFromName("m" + var9 + "_" + var10); // L: 5756
								class8.archive5.loadRegionFromName("l" + var9 + "_" + var10); // L: 5757
							}
						}
					}
				}

				ItemContainer.updateGameState(30); // L: 5761
				UserComparator5.playPcmPlayers(); // L: 5762
				class23.method232(); // L: 5763
				var65 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher); // L: 5764
				Client.packetWriter.addNode(var65); // L: 5765
				WorldMapSprite.clock.mark(); // L: 5767

				for (var6 = 0; var6 < 32; ++var6) { // L: 5768
					GameEngine.graphicsTickTimes[var6] = 0L;
				}

				for (var6 = 0; var6 < 32; ++var6) { // L: 5769
					GameEngine.clientTickTimes[var6] = 0L;
				}

				VertexNormal.gameCyclesToDo = 0; // L: 5770
			}
		}
	} // L: 5197 5256 5772
}
