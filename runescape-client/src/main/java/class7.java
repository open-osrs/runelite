import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public enum class7 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	field25(0, 0);

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1415154919
	)
	final int field26;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 403603803
	)
	final int field24;

	class7(int var3, int var4) {
		this.field26 = var3; // L: 16
		this.field24 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field24; // L: 21
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILeo;Lfo;B)V",
		garbageValue = "14"
	)
	static final void method90(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 228 229 230
			if (var0 < Tiles.Tiles_minPlane) { // L: 233
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = WorldMapDecoration.getObjectDefinition(var3); // L: 234
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 237
				var9 = var8.sizeX; // L: 242
				var10 = var8.sizeY; // L: 243
			} else {
				var9 = var8.sizeY; // L: 238
				var10 = var8.sizeX; // L: 239
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 249
				var11 = (var9 >> 1) + var1; // L: 250
				var12 = (var9 + 1 >> 1) + var1; // L: 251
			} else {
				var11 = var1; // L: 254
				var12 = var1 + 1; // L: 255
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 257
				var13 = (var10 >> 1) + var2; // L: 258
				var14 = var2 + (var10 + 1 >> 1); // L: 259
			} else {
				var13 = var2; // L: 262
				var14 = var2 + 1; // L: 263
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 265
			int var16 = var15[var12][var14] + var15[var12][var13] + var15[var11][var13] + var15[var11][var14] >> 2; // L: 266
			int var17 = (var1 << 7) + (var9 << 6); // L: 267
			int var18 = (var2 << 7) + (var10 << 6); // L: 268
			long var19 = NPC.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 269
			int var21 = var5 + (var4 << 6); // L: 270
			if (var8.int3 == 1) { // L: 271
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 272
				ObjectSound var22 = new ObjectSound(); // L: 273
				var22.plane = var0; // L: 274
				var22.x = var1 * 128; // L: 275
				var22.y = var2 * 128; // L: 276
				var23 = var8.sizeX; // L: 277
				var24 = var8.sizeY; // L: 278
				if (var4 == 1 || var4 == 3) { // L: 279
					var23 = var8.sizeY; // L: 280
					var24 = var8.sizeX; // L: 281
				}

				var22.field1073 = (var23 + var1) * 128; // L: 283
				var22.field1078 = (var24 + var2) * 128; // L: 284
				var22.soundEffectId = var8.ambientSoundId; // L: 285
				var22.field1086 = var8.int4 * 128; // L: 286
				var22.field1085 = var8.int5; // L: 287
				var22.field1083 = var8.int6; // L: 288
				var22.soundEffectIds = var8.soundEffectIds; // L: 289
				if (var8.transforms != null) { // L: 290
					var22.obj = var8; // L: 291
					var22.set(); // L: 292
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 294
				if (var22.soundEffectIds != null) { // L: 295
					var22.field1081 = var22.field1085 + (int)(Math.random() * (double)(var22.field1083 - var22.field1085));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 297
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 298
					if (var8.animationId == -1 && var8.transforms == null) { // L: 300
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 301
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 302
					if (var8.interactType == 1 && var7 != null) { // L: 303
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 306
				int[] var10000;
				if (var5 >= 12) { // L: 327
					if (var8.animationId == -1 && var8.transforms == null) { // L: 329
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 330
					}

					var6.method3160(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 331
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 332
						var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 333
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 336
					if (var8.animationId == -1 && var8.transforms == null) { // L: 338
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 339
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field512[var4], 0, var19, var21); // L: 340
					if (var4 == 0) { // L: 341
						if (var8.clipped) { // L: 342
							Tiles.field511[var0][var1][var2] = 50; // L: 343
							Tiles.field511[var0][var1][var2 + 1] = 50; // L: 344
						}

						if (var8.modelClipped) { // L: 346
							var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 348
						if (var8.clipped) { // L: 349
							Tiles.field511[var0][var1][var2 + 1] = 50; // L: 350
							Tiles.field511[var0][var1 + 1][var2 + 1] = 50; // L: 351
						}

						if (var8.modelClipped) { // L: 353
							var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) { // L: 355
						if (var8.clipped) { // L: 356
							Tiles.field511[var0][var1 + 1][var2] = 50; // L: 357
							Tiles.field511[var0][var1 + 1][var2 + 1] = 50; // L: 358
						}

						if (var8.modelClipped) { // L: 360
							var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 362
						if (var8.clipped) { // L: 363
							Tiles.field511[var0][var1][var2] = 50; // L: 364
							Tiles.field511[var0][var1 + 1][var2] = 50; // L: 365
						}

						if (var8.modelClipped) { // L: 367
							var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 369
						var7.method3611(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 370
						var6.method3175(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 373
					if (var8.animationId == -1 && var8.transforms == null) { // L: 375
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 376
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field513[var4], 0, var19, var21); // L: 377
					if (var8.clipped) { // L: 378
						if (var4 == 0) { // L: 379
							Tiles.field511[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 380
							Tiles.field511[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 381
							Tiles.field511[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 382
							Tiles.field511[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 384
						var7.method3611(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 387
						var28 = var4 + 1 & 3; // L: 388
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 391
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 392
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 393
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 396
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 397
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field512[var4], Tiles.field512[var28], var19, var21); // L: 399
						if (var8.modelClipped) { // L: 400
							if (var4 == 0) { // L: 401
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1]; // L: 402
								var10000[var2] |= 585;
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1]; // L: 403
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) { // L: 405
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1]; // L: 406
								var10000[var2 + 1] |= 1170;
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1 + 1]; // L: 407
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 409
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1 + 1]; // L: 410
								var10000[var2] |= 585;
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1]; // L: 411
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 413
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1]; // L: 414
								var10000[var2] |= 1170;
								var10000 = GrandExchangeOfferWorldComparator.field52[var0][var1]; // L: 415
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 418
							var7.method3611(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 419
							var6.method3175(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 422
						if (var8.animationId == -1 && var8.transforms == null) { // L: 424
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 425
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field513[var4], 0, var19, var21); // L: 426
						if (var8.clipped) { // L: 427
							if (var4 == 0) { // L: 428
								Tiles.field511[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 429
								Tiles.field511[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 430
								Tiles.field511[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 431
								Tiles.field511[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 433
							var7.method3611(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 436
						if (var8.animationId == -1 && var8.transforms == null) { // L: 438
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 439
						}

						var6.method3160(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 440
						if (var8.interactType != 0 && var7 != null) { // L: 441
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 442
							var6.method3175(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 445
						if (var8.animationId == -1 && var8.transforms == null) { // L: 447
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 448
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field512[var4], 0, 0, 0, var19, var21); // L: 449
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 452
							var28 = 16; // L: 453
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 454
							if (var29 != 0L) { // L: 455
								var28 = WorldMapDecoration.getObjectDefinition(Occluder.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 457
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 458
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field512[var4], 0, var28 * Tiles.field518[var4], var28 * Tiles.field515[var4], var19, var21); // L: 459
						} else if (var5 == 6) { // L: 462
							var28 = 8; // L: 463
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 464
							if (var29 != 0L) { // L: 465
								var28 = WorldMapDecoration.getObjectDefinition(Occluder.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 467
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 468
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field509[var4], var28 * Tiles.field517[var4], var19, var21); // L: 469
						} else if (var5 == 7) { // L: 472
							var23 = var4 + 2 & 3; // L: 474
							if (var8.animationId == -1 && var8.transforms == null) { // L: 475
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 476
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 477
						} else if (var5 == 8) { // L: 480
							var28 = 8; // L: 481
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 482
							if (var29 != 0L) { // L: 483
								var28 = WorldMapDecoration.getObjectDefinition(Occluder.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 486
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 487
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 488
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 489
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 492
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 493
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field509[var4], var28 * Tiles.field517[var4], var19, var21); // L: 495
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 308
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 309
				}

				if (var34 != null && var6.method3160(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 310 311
					var23 = 15; // L: 312
					if (var34 instanceof Model) { // L: 313
						var23 = ((Model)var34).method2991() / 4; // L: 314
						if (var23 > 30) { // L: 315
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 317
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 318
							if (var23 > Tiles.field511[var0][var24 + var1][var33 + var2]) { // L: 319
								Tiles.field511[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 324
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 304 325 334 371 385 420 434 443 450 460 470 478 496 498

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-249600986"
	)
	static void method83() {
		Login.Login_username = Login.Login_username.trim(); // L: 896
		if (Login.Login_username.length() == 0) { // L: 897
			GameShell.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 898
		} else {
			long var1;
			try {
				URL var3 = new URL(AbstractWorldMapIcon.method632("services", false) + "m=accountappeal/login.ws"); // L: 905
				URLConnection var4 = var3.openConnection(); // L: 906
				var4.setRequestProperty("connection", "close"); // L: 907
				var4.setDoInput(true); // L: 908
				var4.setDoOutput(true); // L: 909
				var4.setConnectTimeout(5000); // L: 910
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 911
				var5.write("data1=req"); // L: 912
				var5.flush(); // L: 913
				InputStream var6 = var4.getInputStream(); // L: 914
				Buffer var7 = new Buffer(new byte[1000]); // L: 915

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 917
					if (var8 == -1) { // L: 918
						var7.offset = 0; // L: 925
						long var10 = var7.readLong(); // L: 926
						var1 = var10; // L: 927
						break;
					}

					var7.offset += var8; // L: 919
					if (var7.offset >= 1000) { // L: 920
						var1 = 0L; // L: 921
						break;
					}
				}
			} catch (Exception var14) { // L: 929
				var1 = 0L; // L: 930
			}

			int var0;
			if (0L == var1) { // L: 934
				var0 = 5;
			} else {
				var0 = MusicPatchNode2.method3724(var1, Login.Login_username); // L: 935
			}

			switch(var0) { // L: 936
			case 2:
				GameShell.setLoginResponseString(Strings.field3053, Strings.field3054, Strings.field3055); // L: 941
				Login.loginIndex = 6; // L: 942
				break; // L: 943
			case 3:
				GameShell.setLoginResponseString("", "Error connecting to server.", ""); // L: 954
				break;
			case 4:
				GameShell.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 951
				break; // L: 952
			case 5:
				GameShell.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 938
				break; // L: 939
			case 6:
				GameShell.setLoginResponseString("", "Error connecting to server.", ""); // L: 948
				break; // L: 949
			case 7:
				GameShell.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 945
			}

		}
	} // L: 899 957

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lbp;I)V",
		garbageValue = "-1524924441"
	)
	static final void method86(PendingSpawn var0) {
		long var1 = 0L; // L: 6942
		int var3 = -1; // L: 6943
		int var4 = 0; // L: 6944
		int var5 = 0; // L: 6945
		if (var0.type == 0) { // L: 6946
			var1 = ArchiveLoader.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 6947
			var1 = ArchiveLoader.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 6948
			var1 = ArchiveLoader.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = ArchiveLoader.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y); // L: 6949
		}

		if (var1 != 0L) { // L: 6950
			int var6 = ArchiveLoader.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 6951
			var3 = Occluder.Entity_unpackID(var1); // L: 6952
			var4 = var6 & 31; // L: 6953
			var5 = var6 >> 6 & 3; // L: 6954
		}

		var0.objectId = var3; // L: 6956
		var0.field935 = var4; // L: 6957
		var0.field929 = var5; // L: 6958
	} // L: 6959

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "175619167"
	)
	static final void method87(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 9392
		int var7 = var3 - var1; // L: 9393
		int var8 = var6 >= 0 ? var6 : -var6; // L: 9394
		int var9 = var7 >= 0 ? var7 : -var7; // L: 9395
		int var10 = var8; // L: 9396
		if (var8 < var9) { // L: 9397
			var10 = var9;
		}

		if (var10 != 0) { // L: 9398
			int var11 = (var6 << 16) / var10; // L: 9399
			int var12 = (var7 << 16) / var10; // L: 9400
			if (var12 <= var11) { // L: 9401
				var11 = -var11;
			} else {
				var12 = -var12; // L: 9402
			}

			int var13 = var5 * var12 >> 17; // L: 9403
			int var14 = var5 * var12 + 1 >> 17; // L: 9404
			int var15 = var5 * var11 >> 17; // L: 9405
			int var16 = var5 * var11 + 1 >> 17; // L: 9406
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 9407
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 9408
			int var17 = var0 + var13; // L: 9409
			int var18 = var0 - var14; // L: 9410
			int var19 = var0 + var6 - var14; // L: 9411
			int var20 = var0 + var13 + var6; // L: 9412
			int var21 = var15 + var1; // L: 9413
			int var22 = var1 - var16; // L: 9414
			int var23 = var7 + var1 - var16; // L: 9415
			int var24 = var15 + var7 + var1; // L: 9416
			Rasterizer3D.method3078(var17, var18, var19); // L: 9417
			Rasterizer3D.method3081(var21, var22, var23, var17, var18, var19, var4); // L: 9418
			Rasterizer3D.method3078(var17, var19, var20); // L: 9419
			Rasterizer3D.method3081(var21, var23, var24, var17, var19, var20, var4); // L: 9420
		}
	} // L: 9421

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lhe;III)V",
		garbageValue = "-1067771846"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 9517
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 9518
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 9519
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 9520
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 9521
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 9522
		}

		if (var0.yAlignment == 0) { // L: 9523
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 9524
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 9525
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 9526
		} else if (var0.yAlignment == 4) { // L: 9527
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 9528
		}

	} // L: 9529

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lhe;Ljq;IIZI)V",
		garbageValue = "1516995220"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 9686
		byte var6 = -1; // L: 9687
		String var7 = null; // L: 9688
		if (var5 != null && var5[var3] != null) { // L: 9689
			if (var3 == 0) { // L: 9690
				var6 = 33;
			} else if (var3 == 1) { // L: 9691
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 9692
			} else if (var3 == 3) { // L: 9693
				var6 = 36;
			} else {
				var6 = 37; // L: 9694
			}

			var7 = var5[var3]; // L: 9695
		} else if (var3 == 4) { // L: 9698
			var6 = 37; // L: 9699
			var7 = "Drop"; // L: 9700
		}

		if (var6 != -1 && var7 != null) { // L: 9703
			WorldMapID.insertMenuItem(var7, class23.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 9704
		}

	} // L: 9706
}
