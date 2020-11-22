import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1286160069
	)
	@Export("element")
	final int element;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1200101821
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1527714453
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhw;Lhw;ILai;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class194.WorldMapElement_get(this.getElement()); // L: 17
		Sprite var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) {
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 30
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;",
		garbageValue = "-669051823"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1627026836"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "190840278"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 42
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "104"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lii;",
		garbageValue = "55"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 33
		if (var1 != null) { // L: 34
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 35
			var1 = new KitDefinition(); // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2085091146"
	)
	public static void method297() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 77
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 78
	} // L: 79

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1229271771"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7215
			if (Client.isLowDetail && var0 != GrandExchangeOfferUnitPriceComparator.Client_plane) { // L: 7216
				return;
			}

			long var7 = 0L; // L: 7217
			boolean var9 = true; // L: 7218
			boolean var10 = false; // L: 7219
			boolean var11 = false; // L: 7220
			if (var1 == 0) { // L: 7221
				var7 = ModeWhere.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7222
				var7 = ModeWhere.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7223
				var7 = ModeWhere.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7224
				var7 = ModeWhere.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 7225
				var12 = ModeWhere.scene.getObjectFlags(var0, var2, var3, var7); // L: 7226
				int var38 = ObjectSound.Entity_unpackID(var7); // L: 7227
				int var39 = var12 & 31; // L: 7228
				int var40 = var12 >> 6 & 3; // L: 7229
				ObjectDefinition var13;
				if (var1 == 0) { // L: 7230
					ModeWhere.scene.removeBoundaryObject(var0, var2, var3); // L: 7231
					var13 = ScriptEvent.getObjectDefinition(var38); // L: 7232
					if (var13.interactType != 0) { // L: 7233
						Client.collisionMaps[var0].method3688(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7235
					ModeWhere.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7236
					ModeWhere.scene.removeGameObject(var0, var2, var3); // L: 7237
					var13 = ScriptEvent.getObjectDefinition(var38); // L: 7238
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7239
						return;
					}

					if (var13.interactType != 0) { // L: 7240
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7242
					ModeWhere.scene.removeFloorDecoration(var0, var2, var3); // L: 7243
					var13 = ScriptEvent.getObjectDefinition(var38); // L: 7244
					if (var13.interactType == 1) { // L: 7245
						Client.collisionMaps[var0].method3691(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7248
				var12 = var0; // L: 7249
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7250
					var12 = var0 + 1;
				}

				Scene var41 = ModeWhere.scene; // L: 7251
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 7252
				ObjectDefinition var15 = ScriptEvent.getObjectDefinition(var4); // L: 7254
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 7257
					var16 = var15.sizeX; // L: 7262
					var17 = var15.sizeY; // L: 7263
				} else {
					var16 = var15.sizeY; // L: 7258
					var17 = var15.sizeX; // L: 7259
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 7269
					var18 = (var16 >> 1) + var2; // L: 7270
					var19 = var2 + (var16 + 1 >> 1); // L: 7271
				} else {
					var18 = var2; // L: 7274
					var19 = var2 + 1; // L: 7275
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 7277
					var20 = var3 + (var17 >> 1); // L: 7278
					var21 = var3 + (var17 + 1 >> 1); // L: 7279
				} else {
					var20 = var3; // L: 7282
					var21 = var3 + 1; // L: 7283
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 7285
				int var23 = var22[var19][var20] + var22[var18][var20] + var22[var18][var21] + var22[var19][var21] >> 2; // L: 7286
				int var24 = (var2 << 7) + (var16 << 6); // L: 7287
				int var25 = (var3 << 7) + (var17 << 6); // L: 7288
				long var26 = GrandExchangeOfferOwnWorldComparator.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 7289
				int var28 = (var5 << 6) + var6; // L: 7290
				if (var15.int3 == 1) { // L: 7291
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 7292
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7294
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7295
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Entity)var36, var26, var28); // L: 7296
					if (var15.interactType == 1) { // L: 7297
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 7300
					if (var6 >= 12) { // L: 7308
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7310
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7311
						}

						var41.method3227(var0, var2, var3, var23, 1, 1, (Entity)var36, 0, var26, var28); // L: 7312
						if (var15.interactType != 0) { // L: 7313
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 7316
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7318
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7319
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Entity)var36, (Entity)null, Tiles.field533[var5], 0, var26, var28); // L: 7320
						if (var15.interactType != 0) { // L: 7321
							var14.method3683(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7324
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7326
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7327
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Entity)var36, (Entity)null, Tiles.field534[var5], 0, var26, var28); // L: 7328
						if (var15.interactType != 0) { // L: 7329
							var14.method3683(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7332
							var29 = var5 + 1 & 3; // L: 7333
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7336
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7337
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7338
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7341
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7342
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Entity)var37, (Entity)var31, Tiles.field533[var5], Tiles.field533[var29], var26, var28); // L: 7344
							if (var15.interactType != 0) { // L: 7345
								var14.method3683(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7348
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7350
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7351
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Entity)var36, (Entity)null, Tiles.field534[var5], 0, var26, var28); // L: 7352
							if (var15.interactType != 0) { // L: 7353
								var14.method3683(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7356
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7358
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7359
							}

							var41.method3227(var0, var2, var3, var23, 1, 1, (Entity)var36, 0, var26, var28); // L: 7360
							if (var15.interactType != 0) { // L: 7361
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7364
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7366
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7367
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Entity)var36, (Entity)null, Tiles.field533[var5], 0, 0, 0, var26, var28); // L: 7368
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7371
								var29 = 16; // L: 7372
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7373
								if (0L != var30) { // L: 7374
									var29 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7376
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7377
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Entity)var32, (Entity)null, Tiles.field533[var5], 0, var29 * Tiles.field528[var5], var29 * Tiles.field536[var5], var26, var28); // L: 7378
							} else if (var6 == 6) { // L: 7381
								var29 = 8; // L: 7382
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7383
								if (var30 != 0L) { // L: 7384
									var29 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7386
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7387
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Entity)var32, (Entity)null, 256, var5, var29 * Tiles.field535[var5], var29 * Tiles.field529[var5], var26, var28); // L: 7388
							} else if (var6 == 7) { // L: 7391
								int var35 = var5 + 2 & 3; // L: 7393
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7394
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7395
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Entity)var36, (Entity)null, 256, var35, 0, 0, var26, var28); // L: 7396
							} else if (var6 == 8) { // L: 7399
								var29 = 8; // L: 7400
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7401
								if (var30 != 0L) { // L: 7402
									var29 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7405
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7406
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7407
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7408
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7411
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7412
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Entity)var32, (Entity)var33, 256, var5, var29 * Tiles.field535[var5], var29 * Tiles.field529[var5], var26, var28); // L: 7414
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7302
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, true, (Entity)null); // L: 7303
					}

					if (var36 != null) { // L: 7304
						var41.method3227(var0, var2, var3, var23, var16, var17, (Entity)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 7305
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 7419

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIZB)V",
		garbageValue = "-45"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 9905
		int var5 = var0.height; // L: 9906
		if (var0.widthAlignment == 0) { // L: 9907
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 9908
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 9909
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 9910
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 9911
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 9912
		}

		if (var0.widthAlignment == 4) { // L: 9913
			var0.width = var0.height * var0.field2610 / var0.field2611;
		}

		if (var0.heightAlignment == 4) { // L: 9914
			var0.height = var0.width * var0.field2611 / var0.field2610;
		}

		if (var0.contentType == 1337) { // L: 9915
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 9916
			ScriptEvent var6 = new ScriptEvent(); // L: 9917
			var6.widget = var0; // L: 9918
			var6.args = var0.onResize; // L: 9919
			Client.scriptEvents.addFirst(var6); // L: 9920
		}

	} // L: 9922
}
