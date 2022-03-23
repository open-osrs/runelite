import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("es")
public class class149 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-2047833702"
	)
	static int method3081(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4118
			var3 = class160.Client_plane; // L: 4119
			int var15 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX; // L: 4120
			int var8 = (class19.localPlayer.y >> 7) + class250.baseY; // L: 4121
			StudioGame.getWorldMap().method7313(var3, var15, var8, true); // L: 4122
			return 1; // L: 4123
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4125
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4126
				String var16 = ""; // L: 4127
				var9 = StudioGame.getWorldMap().getMapArea(var3); // L: 4128
				if (var9 != null) { // L: 4129
					var16 = var9.getExternalName(); // L: 4130
				}

				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var16; // L: 4132
				return 1; // L: 4133
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4135
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4136
				StudioGame.getWorldMap().setCurrentMapAreaId(var3); // L: 4137
				return 1; // L: 4138
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4140
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().getZoomLevel(); // L: 4141
				return 1; // L: 4142
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4144
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4145
				StudioGame.getWorldMap().setZoomPercentage(var3); // L: 4146
				return 1; // L: 4147
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4149
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4150
				return 1; // L: 4151
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4153
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4154
					StudioGame.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4155
					return 1; // L: 4156
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4158
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4159
					StudioGame.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4160
					return 1; // L: 4161
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4163
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4164
					StudioGame.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4165
					return 1; // L: 4166
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4168
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4169
					StudioGame.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4170
					return 1; // L: 4171
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4173
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().getDisplayX(); // L: 4174
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().getDisplayY(); // L: 4175
					return 1; // L: 4176
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4178
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4179
						var11 = StudioGame.getWorldMap().getMapArea(var3); // L: 4180
						if (var11 == null) { // L: 4181
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4182
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4185
						}

						return 1; // L: 4187
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4189
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4190
						var11 = StudioGame.getWorldMap().getMapArea(var3); // L: 4191
						if (var11 == null) { // L: 4192
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4193
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4194
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4197
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4198
						}

						return 1; // L: 4200
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4202
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4203
						var11 = StudioGame.getWorldMap().getMapArea(var3); // L: 4204
						if (var11 == null) { // L: 4205
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4206
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4207
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4208
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4209
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4212
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4213
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4214
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4215
						}

						return 1; // L: 4217
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4219
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4220
						var11 = StudioGame.getWorldMap().getMapArea(var3); // L: 4221
						if (var11 == null) { // L: 4222
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4223
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4226
						}

						return 1; // L: 4228
					} else if (var0 == 6615) { // L: 4230
						var14 = StudioGame.getWorldMap().getDisplayCoord(); // L: 4231
						if (var14 == null) { // L: 4232
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4233
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4234
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var14.x; // L: 4237
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var14.y; // L: 4238
						}

						return 1; // L: 4240
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4242
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().currentMapAreaId(); // L: 4243
						return 1; // L: 4244
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4246
						var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4247
						var11 = StudioGame.getWorldMap().getCurrentMapArea(); // L: 4248
						if (var11 == null) { // L: 4249
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4250
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4251
							return 1; // L: 4252
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4254
							if (var12 == null) { // L: 4255
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4256
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4257
							} else {
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var12[0]; // L: 4260
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var12[1]; // L: 4261
							}

							return 1; // L: 4263
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4265
							var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4266
							var11 = StudioGame.getWorldMap().getCurrentMapArea(); // L: 4267
							if (var11 == null) { // L: 4268
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4269
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4270
								return 1; // L: 4271
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4273
								if (var5 == null) { // L: 4274
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4275
								} else {
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.packed(); // L: 4278
								}

								return 1; // L: 4280
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4282
								class295.Interpreter_intStackSize -= 2; // L: 4283
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4284
								var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 4285
								class263.method5204(var3, var10, false); // L: 4286
								return 1; // L: 4287
							} else if (var0 == 6620) { // L: 4289
								class295.Interpreter_intStackSize -= 2; // L: 4290
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4291
								var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 4292
								class263.method5204(var3, var10, true); // L: 4293
								return 1; // L: 4294
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4296
								class295.Interpreter_intStackSize -= 2; // L: 4297
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4298
								var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 4299
								var9 = StudioGame.getWorldMap().getMapArea(var3); // L: 4300
								if (var9 == null) { // L: 4301
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4302
									return 1; // L: 4303
								} else {
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4305
									return 1; // L: 4306
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4308
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().getDisplayWith(); // L: 4309
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().getDisplayHeight(); // L: 4310
								return 1; // L: 4311
							} else if (var0 == 6623) { // L: 4313
								var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4314
								var11 = StudioGame.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4315
								if (var11 == null) { // L: 4316
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4317
								} else {
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var11.getId(); // L: 4320
								}

								return 1; // L: 4322
							} else if (var0 == 6624) { // L: 4324
								StudioGame.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4325
								return 1; // L: 4326
							} else if (var0 == 6625) { // L: 4328
								StudioGame.getWorldMap().resetMaxFlashCount(); // L: 4329
								return 1; // L: 4330
							} else if (var0 == 6626) { // L: 4332
								StudioGame.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 4333
								return 1; // L: 4334
							} else if (var0 == 6627) { // L: 4336
								StudioGame.getWorldMap().resetCyclesPerFlash(); // L: 4337
								return 1; // L: 4338
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4340
									var13 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 4341
									StudioGame.getWorldMap().setPerpetualFlash(var13); // L: 4342
									return 1; // L: 4343
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4345
									var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4346
									StudioGame.getWorldMap().flashElement(var3); // L: 4347
									return 1; // L: 4348
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4350
									var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4351
									StudioGame.getWorldMap().flashCategory(var3); // L: 4352
									return 1; // L: 4353
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4355
									StudioGame.getWorldMap().stopCurrentFlashes(); // L: 4356
									return 1; // L: 4357
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4359
									var13 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 4360
									StudioGame.getWorldMap().setElementsDisabled(var13); // L: 4361
									return 1; // L: 4362
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4364
										class295.Interpreter_intStackSize -= 2; // L: 4365
										var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4366
										var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1; // L: 4367
										StudioGame.getWorldMap().disableElement(var3, var7); // L: 4368
										return 1; // L: 4369
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4371
										class295.Interpreter_intStackSize -= 2; // L: 4372
										var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4373
										var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1; // L: 4374
										StudioGame.getWorldMap().setCategoryDisabled(var3, var7); // L: 4375
										return 1; // L: 4376
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4378
										Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4379
										return 1; // L: 4380
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4382
										var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4383
										Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4384
										return 1; // L: 4385
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4387
										var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4388
										Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = StudioGame.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4389
										return 1; // L: 4390
									} else if (var0 == 6638) { // L: 4392
										class295.Interpreter_intStackSize -= 2; // L: 4393
										var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4394
										var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 4395
										var5 = StudioGame.getWorldMap().method7342(var3, var10); // L: 4396
										if (var5 == null) { // L: 4397
											Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4398
										} else {
											Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.packed(); // L: 4401
										}

										return 1; // L: 4403
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4405
											var6 = StudioGame.getWorldMap().iconStart(); // L: 4406
											if (var6 == null) { // L: 4407
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4408
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4409
											} else {
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4412
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4413
											}

											return 1; // L: 4415
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4417
											var6 = StudioGame.getWorldMap().iconNext(); // L: 4418
											if (var6 == null) { // L: 4419
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4420
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4421
											} else {
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4424
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4425
											}

											return 1; // L: 4427
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4429
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4430
												var4 = class19.WorldMapElement_get(var3); // L: 4431
												if (var4.name == null) { // L: 4432
													Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4433
												} else {
													Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.name; // L: 4436
												}

												return 1; // L: 4438
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4440
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4441
												var4 = class19.WorldMapElement_get(var3); // L: 4442
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.textSize; // L: 4443
												return 1; // L: 4444
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4446
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4447
												var4 = class19.WorldMapElement_get(var3); // L: 4448
												if (var4 == null) { // L: 4449
													Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4450
												} else {
													Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.category; // L: 4453
												}

												return 1; // L: 4455
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4457
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4458
												var4 = class19.WorldMapElement_get(var3); // L: 4459
												if (var4 == null) { // L: 4460
													Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4461
												} else {
													Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4464
												}

												return 1; // L: 4466
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4468
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class293.worldMapEvent.mapElement; // L: 4469
												return 1; // L: 4470
											} else if (var0 == 6698) { // L: 4472
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class293.worldMapEvent.coord1.packed(); // L: 4473
												return 1; // L: 4474
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4476
												Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class293.worldMapEvent.coord2.packed(); // L: 4477
												return 1; // L: 4478
											} else {
												return 2; // L: 4480
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "47"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 381
		int var2 = var1.readUnsignedByte(); // L: 382
		int var3 = var1.readInt(); // L: 383
		if (var3 < 0 || AbstractArchive.field3960 != 0 && var3 > AbstractArchive.field3960) { // L: 384
			throw new RuntimeException(); // L: 385
		} else if (var2 == 0) { // L: 387
			byte[] var6 = new byte[var3]; // L: 388
			var1.readBytes(var6, 0, var3); // L: 389
			return var6; // L: 390
		} else {
			int var4 = var1.readInt(); // L: 393
			if (var4 >= 0 && (AbstractArchive.field3960 == 0 || var4 <= AbstractArchive.field3960)) { // L: 394
				byte[] var5 = new byte[var4]; // L: 397
				if (var2 == 1) { // L: 398
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 399
				}

				return var5; // L: 400
			} else {
				throw new RuntimeException(); // L: 395
			}
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "369546615"
	)
	static boolean method3079() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1358
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1359
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1360
				if (!var0.isLoaded()) { // L: 1361
					return false;
				}

				++Client.archiveLoadersDone; // L: 1362
			}

			return true; // L: 1364
		} else {
			return true; // L: 1363
		}
	}
}
