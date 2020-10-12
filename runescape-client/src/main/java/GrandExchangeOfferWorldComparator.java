import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("q")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "[Lls;"
	)
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1435460859
	)
	static int oculusOrbFocalPointX;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lf;Lf;I)I",
		garbageValue = "-1922470"
	)
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILec;Lft;B)V",
		garbageValue = "-56"
	)
	static final void method137(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 236 237 238
			if (var0 < Tiles.Tiles_minPlane) { // L: 241
				Tiles.Tiles_minPlane = var0;
			}

			ObjectDefinition var8 = MidiPcmStream.getObjectDefinition(var3); // L: 242
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 245
				var9 = var8.sizeX; // L: 250
				var10 = var8.sizeY; // L: 251
			} else {
				var9 = var8.sizeY; // L: 246
				var10 = var8.sizeX; // L: 247
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 257
				var11 = (var9 >> 1) + var1; // L: 258
				var12 = (var9 + 1 >> 1) + var1; // L: 259
			} else {
				var11 = var1; // L: 262
				var12 = var1 + 1; // L: 263
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 265
				var13 = (var10 >> 1) + var2; // L: 266
				var14 = var2 + (var10 + 1 >> 1); // L: 267
			} else {
				var13 = var2; // L: 270
				var14 = var2 + 1; // L: 271
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 273
			int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 274
			int var17 = (var1 << 7) + (var9 << 6); // L: 275
			int var18 = (var2 << 7) + (var10 << 6); // L: 276
			long var19 = class227.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 277
			int var21 = var5 + (var4 << 6); // L: 278
			if (var8.int3 == 1) { // L: 279
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 280
				class280.method5093(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 281
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 282
					if (var8.animationId == -1 && var8.transforms == null) { // L: 284
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 285
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Entity)var29, var19, var21); // L: 286
					if (var8.interactType == 1 && var7 != null) { // L: 287
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 290
					int[] var10000;
					if (var5 >= 12) { // L: 311
						if (var8.animationId == -1 && var8.transforms == null) { // L: 313
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 314
						}

						var6.method3263(var0, var1, var2, var16, 1, 1, (Entity)var29, 0, var19, var21); // L: 315
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 316
							var10000 = class204.field2421[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 317
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 320
						if (var8.animationId == -1 && var8.transforms == null) { // L: 322
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 323
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var29, (Entity)null, Tiles.field524[var4], 0, var19, var21); // L: 324
						if (var4 == 0) { // L: 325
							if (var8.clipped) { // L: 326
								class22.field122[var0][var1][var2] = 50; // L: 327
								class22.field122[var0][var1][var2 + 1] = 50; // L: 328
							}

							if (var8.modelClipped) { // L: 330
								var10000 = class204.field2421[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 332
							if (var8.clipped) { // L: 333
								class22.field122[var0][var1][var2 + 1] = 50; // L: 334
								class22.field122[var0][var1 + 1][var2 + 1] = 50; // L: 335
							}

							if (var8.modelClipped) { // L: 337
								var10000 = class204.field2421[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 339
							if (var8.clipped) { // L: 340
								class22.field122[var0][var1 + 1][var2] = 50; // L: 341
								class22.field122[var0][var1 + 1][var2 + 1] = 50; // L: 342
							}

							if (var8.modelClipped) { // L: 344
								var10000 = class204.field2421[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 346
							if (var8.clipped) { // L: 347
								class22.field122[var0][var1][var2] = 50; // L: 348
								class22.field122[var0][var1 + 1][var2] = 50; // L: 349
							}

							if (var8.modelClipped) { // L: 351
								var10000 = class204.field2421[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 353
							var7.method3630(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 354
							var6.method3204(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 357
						if (var8.animationId == -1 && var8.transforms == null) { // L: 359
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 360
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var29, (Entity)null, Tiles.field525[var4], 0, var19, var21); // L: 361
						if (var8.clipped) { // L: 362
							if (var4 == 0) {
								class22.field122[var0][var1][var2 + 1] = 50; // L: 363
							} else if (var4 == 1) { // L: 364
								class22.field122[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 365
								class22.field122[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 366
								class22.field122[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 368
							var7.method3630(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 371
							var22 = var4 + 1 & 3; // L: 372
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 375
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 376
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 377
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 380
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 381
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var30, (Entity)var24, Tiles.field524[var4], Tiles.field524[var22], var19, var21); // L: 383
							if (var8.modelClipped) { // L: 384
								if (var4 == 0) { // L: 385
									var10000 = class204.field2421[var0][var1]; // L: 386
									var10000[var2] |= 585;
									var10000 = class204.field2421[var0][var1]; // L: 387
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 389
									var10000 = class204.field2421[var0][var1]; // L: 390
									var10000[1 + var2] |= 1170;
									var10000 = class204.field2421[var0][var1 + 1]; // L: 391
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 393
									var10000 = class204.field2421[var0][var1 + 1]; // L: 394
									var10000[var2] |= 585;
									var10000 = class204.field2421[var0][var1]; // L: 395
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 397
									var10000 = class204.field2421[var0][var1]; // L: 398
									var10000[var2] |= 1170;
									var10000 = class204.field2421[var0][var1]; // L: 399
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 402
								var7.method3630(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 403
								var6.method3204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 406
							if (var8.animationId == -1 && var8.transforms == null) { // L: 408
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 409
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var29, (Entity)null, Tiles.field525[var4], 0, var19, var21); // L: 410
							if (var8.clipped) { // L: 411
								if (var4 == 0) { // L: 412
									class22.field122[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 413
									class22.field122[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 414
									class22.field122[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 415
									class22.field122[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 417
								var7.method3630(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 420
							if (var8.animationId == -1 && var8.transforms == null) { // L: 422
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 423
							}

							var6.method3263(var0, var1, var2, var16, 1, 1, (Entity)var29, 0, var19, var21); // L: 424
							if (var8.interactType != 0 && var7 != null) { // L: 425
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 426
								var6.method3204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 429
							if (var8.animationId == -1 && var8.transforms == null) { // L: 431
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 432
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Entity)var29, (Entity)null, Tiles.field524[var4], 0, 0, 0, var19, var21); // L: 433
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 436
								var22 = 16; // L: 437
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 438
								if (0L != var23) { // L: 439
									var22 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 441
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 442
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var25, (Entity)null, Tiles.field524[var4], 0, var22 * Tiles.field517[var4], var22 * Tiles.field527[var4], var19, var21); // L: 443
							} else if (var5 == 6) { // L: 446
								var22 = 8; // L: 447
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 448
								if (var23 != 0L) { // L: 449
									var22 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 451
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 452
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var25, (Entity)null, 256, var4, var22 * Tiles.field534[var4], var22 * Tiles.field529[var4], var19, var21); // L: 453
							} else if (var5 == 7) { // L: 456
								var28 = var4 + 2 & 3; // L: 458
								if (var8.animationId == -1 && var8.transforms == null) { // L: 459
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 460
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var29, (Entity)null, 256, var28, 0, 0, var19, var21); // L: 461
							} else if (var5 == 8) { // L: 464
								var22 = 8; // L: 465
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 466
								if (var23 != 0L) { // L: 467
									var22 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 470
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 471
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 472
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 473
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 476
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 477
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var25, (Entity)var26, 256, var4, var22 * Tiles.field534[var4], var22 * Tiles.field529[var4], var19, var21); // L: 479
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 292
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 293
					}

					if (var29 != null && var6.method3263(var0, var1, var2, var16, var9, var10, (Entity)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 294 295
						var28 = 15; // L: 296
						if (var29 instanceof Model) { // L: 297
							var28 = ((Model)var29).method3016() / 4; // L: 298
							if (var28 > 30) { // L: 299
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 301
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 302
								if (var28 > class22.field122[var0][var31 + var1][var32 + var2]) { // L: 303
									class22.field122[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 308
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 288 309 318 355 369 404 418 427 434 444 454 462 480 482

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "-107"
	)
	static int method141(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1306
			var7 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1307
			WorldMapRectangle.addGameMessage(0, "", var7); // L: 1308
			return 1; // L: 1309
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1312
			GrandExchangeOfferNameComparator.performPlayerAnimation(WorldMapLabelSize.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1313
			return 1; // L: 1314
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1132) { // L: 1317
				Interpreter.field1131 = true; // L: 1318
			}

			return 1; // L: 1320
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1323
				var15 = 0; // L: 1324
				if (World.isNumber(var7)) { // L: 1325
					var15 = GrandExchangeOfferTotalQuantityComparator.parseInt(var7);
				}

				PacketBufferNode var13 = Client.getPacketBufferNode(ClientPacket.field2332, Client.packetWriter.isaacCipher); // L: 1327
				var13.packetBuffer.writeInt(var15); // L: 1328
				Client.packetWriter.addNode(var13); // L: 1329
				return 1; // L: 1330
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1333
					var11 = Client.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher); // L: 1335
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1336
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1337
					Client.packetWriter.addNode(var11); // L: 1338
					return 1; // L: 1339
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1342
					var11 = Client.getPacketBufferNode(ClientPacket.field2339, Client.packetWriter.isaacCipher); // L: 1344
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1345
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1346
					Client.packetWriter.addNode(var11); // L: 1347
					return 1; // L: 1348
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1351
						var4 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1352
						Archive.method4383(var10, var4); // L: 1353
						return 1; // L: 1354
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1357
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1358
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1359
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1360
						Widget var14 = TileItem.getWidget(var9); // L: 1361
						class13.clickWidget(var14, var10, var15); // L: 1362
						return 1; // L: 1363
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1366
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1367
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1368
						Widget var12 = var2 ? Canvas.field438 : class3.field12; // L: 1369
						class13.clickWidget(var12, var10, var15); // L: 1370
						return 1; // L: 1371
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ScriptEvent.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1374
						return 1; // L: 1375
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Tile.clientPreferences.roofsHidden ? 1 : 0; // L: 1378
						return 1; // L: 1379
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Tile.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1382
						WorldMapData_1.savePreferences(); // L: 1383
						return 1; // L: 1384
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1387
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1388
						class280.openURL(var7, var8, false); // L: 1389
						return 1; // L: 1390
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1393
						var11 = Client.getPacketBufferNode(ClientPacket.field2338, Client.packetWriter.isaacCipher); // L: 1395
						var11.packetBuffer.writeShort(var10); // L: 1396
						Client.packetWriter.addNode(var11); // L: 1397
						return 1; // L: 1398
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1401
						Varps.Interpreter_stringStackSize -= 2; // L: 1402
						var4 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize]; // L: 1403
						String var5 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1]; // L: 1404
						if (var4.length() > 500) { // L: 1405
							return 1;
						} else if (var5.length() > 500) { // L: 1406
							return 1;
						} else {
							PacketBufferNode var6 = Client.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher); // L: 1407
							var6.packetBuffer.writeShort(1 + Decimator.stringCp1252NullTerminatedByteSize(var4) + Decimator.stringCp1252NullTerminatedByteSize(var5)); // L: 1408
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1409
							var6.packetBuffer.method5645(var10); // L: 1410
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1411
							Client.packetWriter.addNode(var6); // L: 1412
							return 1; // L: 1413
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1416
						return 1; // L: 1417
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1420
						return 1; // L: 1421
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1424
						return 1; // L: 1425
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1428
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1429
						}

						return 1; // L: 1430
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1433
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1434
						}

						return 1; // L: 1435
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1438
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1439
						}

						return 1; // L: 1440
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1443
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1444
						}

						return 1; // L: 1445
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1448
						return 1; // L: 1449
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1452
						return 1; // L: 1453
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1456
						return 1; // L: 1457
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						GrandExchangeEvents.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1460
						return 1; // L: 1461
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanChat.getTapToDrop() ? 1 : 0; // L: 1464
						return 1; // L: 1465
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1468
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1469
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1470
						return 1; // L: 1471
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1474
						return 1; // L: 1475
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 1478
						return 1; // L: 1479
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorDecoration.canvasWidth; // L: 1482
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameShell.canvasHeight; // L: 1483
						return 1; // L: 1484
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 1487
						return 1; // L: 1488
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1491
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1494
						return 1; // L: 1495
					} else if (var0 == 3136) {
						Client.field865 = 3; // L: 1498
						Client.field840 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1499
						return 1; // L: 1500
					} else if (var0 == 3137) {
						Client.field865 = 2; // L: 1503
						Client.field840 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1504
						return 1; // L: 1505
					} else if (var0 == 3138) {
						Client.field865 = 0; // L: 1508
						return 1; // L: 1509
					} else if (var0 == 3139) {
						Client.field865 = 1; // L: 1512
						return 1; // L: 1513
					} else if (var0 == 3140) {
						Client.field865 = 3; // L: 1516
						Client.field840 = var2 ? Canvas.field438.id * 1163691799 * 1189552295 : class3.field12.id * 1163691799 * 1189552295; // L: 1517
						return 1; // L: 1518
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1521
							Tile.clientPreferences.hideUsername = var3; // L: 1522
							WorldMapData_1.savePreferences(); // L: 1523
							return 1; // L: 1524
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Tile.clientPreferences.hideUsername ? 1 : 0; // L: 1527
							return 1; // L: 1528
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1531
							Client.Login_isUsernameRemembered = var3; // L: 1532
							if (!var3) { // L: 1533
								Tile.clientPreferences.rememberedUsername = ""; // L: 1534
								WorldMapData_1.savePreferences(); // L: 1535
							}

							return 1; // L: 1537
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1540
							return 1; // L: 1541
						} else if (var0 == 3145) {
							return 1; // L: 1544
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1547
							if (var3 == Tile.clientPreferences.titleMusicDisabled) { // L: 1548
								Tile.clientPreferences.titleMusicDisabled = !var3; // L: 1549
								WorldMapData_1.savePreferences(); // L: 1550
							}

							return 1; // L: 1552
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Tile.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1555
							return 1; // L: 1556
						} else if (var0 == 3148) {
							return 1; // L: 1559
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1562
							return 1; // L: 1563
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1566
							return 1; // L: 1567
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1570
							return 1; // L: 1571
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1574
							return 1; // L: 1575
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1578
							return 1; // L: 1579
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_1.method785(); // L: 1582
							return 1; // L: 1583
						} else if (var0 == 3155) {
							--Varps.Interpreter_stringStackSize; // L: 1586
							return 1; // L: 1587
						} else if (var0 == 3156) {
							return 1; // L: 1590
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1593
							return 1; // L: 1594
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1597
							return 1; // L: 1598
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1601
							return 1; // L: 1602
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1605
							return 1; // L: 1606
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 1609
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1610
							return 1; // L: 1611
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 1614
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1615
							return 1; // L: 1616
						} else if (var0 == 3163) {
							--Varps.Interpreter_stringStackSize; // L: 1619
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1620
							return 1; // L: 1621
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 1624
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1625
							return 1; // L: 1626
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 1629
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1630
							return 1; // L: 1631
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1634
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1635
							return 1; // L: 1636
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1639
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1640
							return 1; // L: 1641
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1644
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1645
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1646
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1647
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1648
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1649
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1650
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1651
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1652
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1653
							return 1; // L: 1654
						} else if (var0 == 3169) {
							return 1; // L: 1657
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1660
							return 1; // L: 1661
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1664
							return 1; // L: 1665
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 1668
							return 1; // L: 1669
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 1672
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1673
							return 1; // L: 1674
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 1677
							return 1; // L: 1678
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1681
							return 1; // L: 1682
						} else if (var0 == 3176) {
							return 1; // L: 1685
						} else if (var0 == 3177) {
							return 1; // L: 1688
						} else if (var0 == 3178) {
							--Varps.Interpreter_stringStackSize; // L: 1691
							return 1; // L: 1692
						} else if (var0 == 3179) {
							return 1; // L: 1695
						} else if (var0 == 3180) {
							--Varps.Interpreter_stringStackSize; // L: 1698
							return 1; // L: 1699
						} else {
							return 2; // L: 1701
						}
					}
				}
			}
		}
	}
}
