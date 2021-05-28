import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 81340013
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("v")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 186545257
	)
	@Export("world")
	public int world;
	@ObfuscatedName("f")
	@Export("name")
	public String name;

	ClanChannelMember() {
	} // L: 8

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)V",
		garbageValue = "-2073984636"
	)
	public static void method88(Huffman var0) {
		class249.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1338731866"
	)
	public static int method86(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var1;
		} else if (var2 == 1) { // L: 11
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0; // L: 12
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbi;",
		garbageValue = "-22"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1385459044"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 162
			if (KeyHandler.field293 == KeyHandler.field295) { // L: 163
				return false;
			} else {
				ItemComposition.field1859 = KeyHandler.field289[KeyHandler.field293]; // L: 164
				class249.field3116 = KeyHandler.field286[KeyHandler.field293]; // L: 165
				KeyHandler.field293 = KeyHandler.field293 + 1 & 127; // L: 166
				return true; // L: 167
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "74"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 762
		Login.Login_response2 = "Enter your username/email & password."; // L: 763
		Login.Login_response3 = ""; // L: 764
		Login.loginIndex = 2; // L: 765
		if (var0) { // L: 766
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 768
			if (ObjectComposition.clientPreferences.rememberedUsername != null) { // L: 769
				Login.Login_username = ObjectComposition.clientPreferences.rememberedUsername; // L: 770
				Client.Login_isUsernameRemembered = true; // L: 771
			} else {
				Client.Login_isUsernameRemembered = false; // L: 773
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 776
			Login.currentLoginField = 1; // L: 777
		} else {
			Login.currentLoginField = 0; // L: 780
		}

	} // L: 783

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgt;Lfz;B)V",
		garbageValue = "11"
	)
	static final void method89(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 245 246 247
			if (var0 < Tiles.Tiles_minPlane) { // L: 250
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class23.getObjectDefinition(var3); // L: 251
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 254
				var9 = var8.sizeX; // L: 259
				var10 = var8.sizeY; // L: 260
			} else {
				var9 = var8.sizeY; // L: 255
				var10 = var8.sizeX; // L: 256
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 266
				var11 = (var9 >> 1) + var1; // L: 267
				var12 = (var9 + 1 >> 1) + var1; // L: 268
			} else {
				var11 = var1; // L: 271
				var12 = var1 + 1; // L: 272
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 274
				var13 = (var10 >> 1) + var2; // L: 275
				var14 = var2 + (var10 + 1 >> 1); // L: 276
			} else {
				var13 = var2; // L: 279
				var14 = var2 + 1; // L: 280
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 282
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2; // L: 283
			int var17 = (var1 << 7) + (var9 << 6); // L: 284
			int var18 = (var2 << 7) + (var10 << 6); // L: 285
			long var19 = DevicePcmPlayerProvider.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 286
			int var21 = var5 + (var4 << 6); // L: 287
			if (var8.int3 == 1) { // L: 288
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 289
				class268.method4851(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 290
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 291
					if (var8.animationId == -1 && var8.transforms == null) { // L: 293
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 294
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 295
					if (var8.interactType == 1 && var7 != null) { // L: 296
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 299
					int[] var10000;
					if (var5 >= 12) { // L: 320
						if (var8.animationId == -1 && var8.transforms == null) { // L: 322
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 323
						}

						var6.method4007(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 324
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 325
							var10000 = UrlRequester.field1419[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 326
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 329
						if (var8.animationId == -1 && var8.transforms == null) { // L: 331
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 332
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1117[var4], 0, var19, var21); // L: 333
						if (var4 == 0) { // L: 334
							if (var8.clipped) { // L: 335
								class372.field4123[var0][var1][var2] = 50; // L: 336
								class372.field4123[var0][var1][var2 + 1] = 50; // L: 337
							}

							if (var8.modelClipped) { // L: 339
								var10000 = UrlRequester.field1419[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 341
							if (var8.clipped) { // L: 342
								class372.field4123[var0][var1][var2 + 1] = 50; // L: 343
								class372.field4123[var0][var1 + 1][var2 + 1] = 50; // L: 344
							}

							if (var8.modelClipped) { // L: 346
								var10000 = UrlRequester.field1419[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 348
							if (var8.clipped) { // L: 349
								class372.field4123[var0][var1 + 1][var2] = 50; // L: 350
								class372.field4123[var0][var1 + 1][var2 + 1] = 50; // L: 351
							}

							if (var8.modelClipped) { // L: 353
								var10000 = UrlRequester.field1419[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 355
							if (var8.clipped) { // L: 356
								class372.field4123[var0][var1][var2] = 50; // L: 357
								class372.field4123[var0][var1 + 1][var2] = 50; // L: 358
							}

							if (var8.modelClipped) { // L: 360
								var10000 = UrlRequester.field1419[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 362
							var7.method3164(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 363
							var6.method3967(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 366
						if (var8.animationId == -1 && var8.transforms == null) { // L: 368
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 369
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1125[var4], 0, var19, var21); // L: 370
						if (var8.clipped) { // L: 371
							if (var4 == 0) { // L: 372
								class372.field4123[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 373
								class372.field4123[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 374
								class372.field4123[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 375
								class372.field4123[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 377
							var7.method3164(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 380
							var22 = var4 + 1 & 3; // L: 381
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 384
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 385
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 386
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 389
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 390
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1117[var4], Tiles.field1117[var22], var19, var21); // L: 392
							if (var8.modelClipped) { // L: 393
								if (var4 == 0) { // L: 394
									var10000 = UrlRequester.field1419[var0][var1]; // L: 395
									var10000[var2] |= 585;
									var10000 = UrlRequester.field1419[var0][var1]; // L: 396
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) { // L: 398
									var10000 = UrlRequester.field1419[var0][var1]; // L: 399
									var10000[var2 + 1] |= 1170;
									var10000 = UrlRequester.field1419[var0][var1 + 1]; // L: 400
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 402
									var10000 = UrlRequester.field1419[var0][var1 + 1]; // L: 403
									var10000[var2] |= 585;
									var10000 = UrlRequester.field1419[var0][var1]; // L: 404
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 406
									var10000 = UrlRequester.field1419[var0][var1]; // L: 407
									var10000[var2] |= 1170;
									var10000 = UrlRequester.field1419[var0][var1]; // L: 408
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 411
								var7.method3164(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 412
								var6.method3967(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 415
							if (var8.animationId == -1 && var8.transforms == null) { // L: 417
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 418
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1125[var4], 0, var19, var21); // L: 419
							if (var8.clipped) { // L: 420
								if (var4 == 0) { // L: 421
									class372.field4123[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 422
									class372.field4123[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 423
									class372.field4123[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 424
									class372.field4123[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 426
								var7.method3164(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 429
							if (var8.animationId == -1 && var8.transforms == null) { // L: 431
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 432
							}

							var6.method4007(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 433
							if (var8.interactType != 0 && var7 != null) { // L: 434
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 435
								var6.method3967(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 438
							if (var8.animationId == -1 && var8.transforms == null) { // L: 440
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 441
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1117[var4], 0, 0, 0, var19, var21); // L: 442
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 445
								var22 = 16; // L: 446
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 447
								if (0L != var23) { // L: 448
									var22 = class23.getObjectDefinition(class93.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 450
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 451
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1117[var4], 0, var22 * Tiles.field1126[var4], var22 * Tiles.field1123[var4], var19, var21); // L: 452
							} else if (var5 == 6) { // L: 455
								var22 = 8; // L: 456
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 457
								if (var23 != 0L) { // L: 458
									var22 = class23.getObjectDefinition(class93.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 460
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 461
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1128[var4], var22 * Tiles.field1129[var4], var19, var21); // L: 462
							} else if (var5 == 7) { // L: 465
								var28 = var4 + 2 & 3; // L: 467
								if (var8.animationId == -1 && var8.transforms == null) { // L: 468
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 469
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 470
							} else if (var5 == 8) { // L: 473
								var22 = 8; // L: 474
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 475
								if (0L != var23) { // L: 476
									var22 = class23.getObjectDefinition(class93.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 479
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 480
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 481
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 482
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 485
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 486
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1128[var4], var22 * Tiles.field1129[var4], var19, var21); // L: 488
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 301
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field1801, (Renderable)null); // L: 302
					}

					if (var29 != null && var6.method4007(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 303 304
						var28 = 15; // L: 305
						if (var29 instanceof Model) { // L: 306
							var28 = ((Model)var29).method4180() / 4; // L: 307
							if (var28 > 30) { // L: 308
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 310
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 311
								if (var28 > class372.field4123[var0][var31 + var1][var32 + var2]) { // L: 312
									class372.field4123[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 317
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 297 318 327 364 378 413 427 436 443 453 463 471 489 491

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "813346347"
	)
	static final void method85() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11269
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11270
			var1.clearIsInFriendsChat(); // L: 11271
		}

	} // L: 11273
}
