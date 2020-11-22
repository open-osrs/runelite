import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1244171609
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("z")
	static byte[][][] field1161;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("definition")
	NPCDefinition definition;

	NPC() {
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IBI)V",
		garbageValue = "-522302894"
	)
	final void method2150(int var1, byte var2) {
		int var3 = super.pathX[0]; // L: 15
		int var4 = super.pathY[0]; // L: 16
		if (var1 == 0) { // L: 17
			--var3; // L: 18
			++var4; // L: 19
		}

		if (var1 == 1) { // L: 21
			++var4;
		}

		if (var1 == 2) { // L: 22
			++var3; // L: 23
			++var4; // L: 24
		}

		if (var1 == 3) { // L: 26
			--var3;
		}

		if (var1 == 4) { // L: 27
			++var3;
		}

		if (var1 == 5) { // L: 28
			--var3; // L: 29
			--var4; // L: 30
		}

		if (var1 == 6) { // L: 32
			--var4;
		}

		if (var1 == 7) { // L: 33
			++var3; // L: 34
			--var4; // L: 35
		}

		if (super.sequence != -1 && class105.SequenceDefinition_get(super.sequence).field3550 == 1) { // L: 37
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 38
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 39
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 40
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 41
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 42
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	} // L: 47

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "124"
	)
	final void method2144(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class105.SequenceDefinition_get(super.sequence).field3550 == 1) { // L: 50
			super.sequence = -1;
		}

		if (!var3) { // L: 51
			int var4 = var1 - super.pathX[0]; // L: 52
			int var5 = var2 - super.pathY[0]; // L: 53
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 54
				if (super.pathLength < 9) { // L: 55
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 56
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 57
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 58
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 59
				}

				super.pathX[0] = var1; // L: 61
				super.pathY[0] = var2; // L: 62
				super.pathTraversed[0] = 1; // L: 63
				return; // L: 64
			}
		}

		super.pathLength = 0; // L: 67
		super.field1034 = 0; // L: 68
		super.field978 = 0; // L: 69
		super.pathX[0] = var1; // L: 70
		super.pathY[0] = var2; // L: 71
		super.x = super.pathX[0] * 128 + super.field1011 * 64; // L: 72
		super.y = super.field1011 * 64 + super.pathY[0] * 128; // L: 73
	} // L: 74

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 77
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class105.SequenceDefinition_get(super.sequence) : null; // L: 78
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? class105.SequenceDefinition_get(super.movementSequence) : null; // L: 79
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 80
			if (var3 == null) { // L: 81
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 82
				super.defaultHeight = var3.height; // L: 83
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 84
					Model var4 = HealthBarUpdate.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 85
					if (var4 != null) { // L: 86
						var4.offsetBy(0, -super.field1016, 0); // L: 87
						Model[] var5 = new Model[]{var3, var4}; // L: 88
						var3 = new Model(var5, 2); // L: 89
					}
				}

				if (this.definition.size == 1) { // L: 92
					var3.isSingleTile = true;
				}

				return var3; // L: 93
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035007323"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 97
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1437281786"
	)
	public static void method2146() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 43
			synchronized(MouseHandler.MouseHandler_instance) { // L: 44
				MouseHandler.MouseHandler_instance = null; // L: 45
			} // L: 46
		}

	} // L: 48

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILef;Lfh;I)V",
		garbageValue = "1419271309"
	)
	static final void method2160(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 155 156 157
			if (var0 < Tiles.Tiles_minPlane) { // L: 160
				Tiles.Tiles_minPlane = var0;
			}

			ObjectDefinition var8 = ScriptEvent.getObjectDefinition(var3); // L: 161
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 164
				var9 = var8.sizeX; // L: 169
				var10 = var8.sizeY; // L: 170
			} else {
				var9 = var8.sizeY; // L: 165
				var10 = var8.sizeX; // L: 166
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 176
				var11 = (var9 >> 1) + var1; // L: 177
				var12 = (var9 + 1 >> 1) + var1; // L: 178
			} else {
				var11 = var1; // L: 181
				var12 = var1 + 1; // L: 182
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 184
				var13 = (var10 >> 1) + var2; // L: 185
				var14 = var2 + (var10 + 1 >> 1); // L: 186
			} else {
				var13 = var2; // L: 189
				var14 = var2 + 1; // L: 190
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 192
			int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 193
			int var17 = (var1 << 7) + (var9 << 6); // L: 194
			int var18 = (var2 << 7) + (var10 << 6); // L: 195
			long var19 = GrandExchangeOfferOwnWorldComparator.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 196
			int var21 = var5 + (var4 << 6); // L: 197
			if (var8.int3 == 1) { // L: 198
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 199
				ObjectSound var22 = new ObjectSound(); // L: 200
				var22.plane = var0; // L: 201
				var22.x = var1 * 128; // L: 202
				var22.y = var2 * 128; // L: 203
				var23 = var8.sizeX; // L: 204
				var24 = var8.sizeY; // L: 205
				if (var4 == 1 || var4 == 3) { // L: 206
					var23 = var8.sizeY; // L: 207
					var24 = var8.sizeX; // L: 208
				}

				var22.field1103 = (var23 + var1) * 128; // L: 210
				var22.field1112 = (var24 + var2) * 128; // L: 211
				var22.soundEffectId = var8.ambientSoundId; // L: 212
				var22.field1104 = var8.int4 * 128; // L: 213
				var22.field1107 = var8.int5; // L: 214
				var22.field1109 = var8.int6; // L: 215
				var22.soundEffectIds = var8.soundEffectIds; // L: 216
				if (var8.transforms != null) { // L: 217
					var22.obj = var8; // L: 218
					var22.set(); // L: 219
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 221
				if (var22.soundEffectIds != null) { // L: 222
					var22.field1108 = var22.field1107 + (int)(Math.random() * (double)(var22.field1109 - var22.field1107));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 224
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 225
					if (var8.animationId == -1 && var8.transforms == null) { // L: 227
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 228
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Entity)var34, var19, var21); // L: 229
					if (var8.interactType == 1 && var7 != null) { // L: 230
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 233
				int[] var10000;
				if (var5 >= 12) { // L: 254
					if (var8.animationId == -1 && var8.transforms == null) { // L: 256
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 257
					}

					var6.method3227(var0, var1, var2, var16, 1, 1, (Entity)var34, 0, var19, var21); // L: 258
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 259
						var10000 = UserComparator10.field2000[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 260
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 263
					if (var8.animationId == -1 && var8.transforms == null) { // L: 265
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 266
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var34, (Entity)null, Tiles.field533[var4], 0, var19, var21); // L: 267
					if (var4 == 0) { // L: 268
						if (var8.clipped) { // L: 269
							class299.field3679[var0][var1][var2] = 50; // L: 270
							class299.field3679[var0][var1][var2 + 1] = 50; // L: 271
						}

						if (var8.modelClipped) { // L: 273
							var10000 = UserComparator10.field2000[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 275
						if (var8.clipped) { // L: 276
							class299.field3679[var0][var1][var2 + 1] = 50; // L: 277
							class299.field3679[var0][var1 + 1][var2 + 1] = 50; // L: 278
						}

						if (var8.modelClipped) { // L: 280
							var10000 = UserComparator10.field2000[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) { // L: 282
						if (var8.clipped) { // L: 283
							class299.field3679[var0][var1 + 1][var2] = 50; // L: 284
							class299.field3679[var0][var1 + 1][var2 + 1] = 50; // L: 285
						}

						if (var8.modelClipped) { // L: 287
							var10000 = UserComparator10.field2000[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 289
						if (var8.clipped) { // L: 290
							class299.field3679[var0][var1][var2] = 50; // L: 291
							class299.field3679[var0][var1 + 1][var2] = 50; // L: 292
						}

						if (var8.modelClipped) { // L: 294
							var10000 = UserComparator10.field2000[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 296
						var7.method3683(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 297
						var6.method3233(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 300
					if (var8.animationId == -1 && var8.transforms == null) { // L: 302
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 303
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var34, (Entity)null, Tiles.field534[var4], 0, var19, var21); // L: 304
					if (var8.clipped) { // L: 305
						if (var4 == 0) { // L: 306
							class299.field3679[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 307
							class299.field3679[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 308
							class299.field3679[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 309
							class299.field3679[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 311
						var7.method3683(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 314
						var28 = var4 + 1 & 3; // L: 315
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 318
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 319
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 320
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 323
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 324
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var31, (Entity)var32, Tiles.field533[var4], Tiles.field533[var28], var19, var21); // L: 326
						if (var8.modelClipped) { // L: 327
							if (var4 == 0) { // L: 328
								var10000 = UserComparator10.field2000[var0][var1]; // L: 329
								var10000[var2] |= 585;
								var10000 = UserComparator10.field2000[var0][var1]; // L: 330
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) { // L: 332
								var10000 = UserComparator10.field2000[var0][var1]; // L: 333
								var10000[1 + var2] |= 1170;
								var10000 = UserComparator10.field2000[var0][var1 + 1]; // L: 334
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 336
								var10000 = UserComparator10.field2000[var0][var1 + 1]; // L: 337
								var10000[var2] |= 585;
								var10000 = UserComparator10.field2000[var0][var1]; // L: 338
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 340
								var10000 = UserComparator10.field2000[var0][var1]; // L: 341
								var10000[var2] |= 1170;
								var10000 = UserComparator10.field2000[var0][var1]; // L: 342
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 345
							var7.method3683(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 346
							var6.method3233(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 349
						if (var8.animationId == -1 && var8.transforms == null) { // L: 351
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 352
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var34, (Entity)null, Tiles.field534[var4], 0, var19, var21); // L: 353
						if (var8.clipped) { // L: 354
							if (var4 == 0) { // L: 355
								class299.field3679[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 356
								class299.field3679[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 357
								class299.field3679[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 358
								class299.field3679[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 360
							var7.method3683(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 363
						if (var8.animationId == -1 && var8.transforms == null) { // L: 365
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 366
						}

						var6.method3227(var0, var1, var2, var16, 1, 1, (Entity)var34, 0, var19, var21); // L: 367
						if (var8.interactType != 0 && var7 != null) { // L: 368
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 369
							var6.method3233(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 372
						if (var8.animationId == -1 && var8.transforms == null) { // L: 374
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 375
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Entity)var34, (Entity)null, Tiles.field533[var4], 0, 0, 0, var19, var21); // L: 376
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 379
							var28 = 16; // L: 380
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 381
							if (var29 != 0L) { // L: 382
								var28 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 384
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 385
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Entity)var25, (Entity)null, Tiles.field533[var4], 0, var28 * Tiles.field528[var4], var28 * Tiles.field536[var4], var19, var21); // L: 386
						} else if (var5 == 6) { // L: 389
							var28 = 8; // L: 390
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 391
							if (0L != var29) { // L: 392
								var28 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 394
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 395
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Entity)var25, (Entity)null, 256, var4, var28 * Tiles.field535[var4], var28 * Tiles.field529[var4], var19, var21); // L: 396
						} else if (var5 == 7) { // L: 399
							var23 = var4 + 2 & 3; // L: 401
							if (var8.animationId == -1 && var8.transforms == null) { // L: 402
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 403
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Entity)var34, (Entity)null, 256, var23, 0, 0, var19, var21); // L: 404
						} else if (var5 == 8) { // L: 407
							var28 = 8; // L: 408
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 409
							if (var29 != 0L) { // L: 410
								var28 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 413
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 414
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 415
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 416
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 419
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 420
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Entity)var25, (Entity)var26, 256, var4, var28 * Tiles.field535[var4], var28 * Tiles.field529[var4], var19, var21); // L: 422
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 235
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, true, (Entity)null); // L: 236
				}

				if (var34 != null && var6.method3227(var0, var1, var2, var16, var9, var10, (Entity)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 237 238
					var23 = 15; // L: 239
					if (var34 instanceof Model) { // L: 240
						var23 = ((Model)var34).method3013() / 4; // L: 241
						if (var23 > 30) { // L: 242
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 244
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 245
							if (var23 > class299.field3679[var0][var24 + var1][var33 + var2]) { // L: 246
								class299.field3679[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 251
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 231 252 261 298 312 347 361 370 377 387 397 405 423 425

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "750977522"
	)
	static int method2158(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1306
			var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1307
			DevicePcmPlayerProvider.addGameMessage(0, "", var7); // L: 1308
			return 1; // L: 1309
		} else if (var0 == ScriptOpcodes.ANIM) {
			MilliClock.Interpreter_intStackSize -= 2; // L: 1312
			Varps.performPlayerAnimation(PlayerType.localPlayer, Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 1313
			return 1; // L: 1314
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1128) { // L: 1317
				Interpreter.field1130 = true; // L: 1318
			}

			return 1; // L: 1320
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1323
				var15 = 0; // L: 1324
				if (class195.isNumber(var7)) { // L: 1325
					var15 = ObjectSound.parseInt(var7);
				}

				PacketBufferNode var13 = class4.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher); // L: 1327
				var13.packetBuffer.writeInt(var15); // L: 1328
				Client.packetWriter.addNode(var13); // L: 1329
				return 1; // L: 1330
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1333
					var11 = class4.getPacketBufferNode(ClientPacket.field2241, Client.packetWriter.isaacCipher); // L: 1335
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1336
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1337
					Client.packetWriter.addNode(var11); // L: 1338
					return 1; // L: 1339
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1342
					var11 = class4.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher); // L: 1344
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1345
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1346
					Client.packetWriter.addNode(var11); // L: 1347
					return 1; // L: 1348
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1351
						var4 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1352
						FontName.method5458(var10, var4); // L: 1353
						return 1; // L: 1354
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						MilliClock.Interpreter_intStackSize -= 3; // L: 1357
						var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1358
						var15 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1359
						int var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 1360
						Widget var14 = UserComparator4.getWidget(var9); // L: 1361
						class228.clickWidget(var14, var10, var15); // L: 1362
						return 1; // L: 1363
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						MilliClock.Interpreter_intStackSize -= 2; // L: 1366
						var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1367
						var15 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1368
						Widget var12 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 1369
						class228.clickWidget(var12, var10, var15); // L: 1370
						return 1; // L: 1371
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						MusicPatchNode.mouseCam = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1374
						return 1; // L: 1375
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden ? 1 : 0; // L: 1378
						return 1; // L: 1379
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1382
						Tile.savePreferences(); // L: 1383
						return 1; // L: 1384
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1387
						boolean var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1388
						Skeleton.openURL(var7, var8, false); // L: 1389
						return 1; // L: 1390
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1393
						var11 = class4.getPacketBufferNode(ClientPacket.field2316, Client.packetWriter.isaacCipher); // L: 1395
						var11.packetBuffer.writeShort(var10); // L: 1396
						Client.packetWriter.addNode(var11); // L: 1397
						return 1; // L: 1398
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1401
						UrlRequester.Interpreter_stringStackSize -= 2; // L: 1402
						var4 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize]; // L: 1403
						String var5 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1]; // L: 1404
						if (var4.length() > 500) { // L: 1405
							return 1;
						} else if (var5.length() > 500) { // L: 1406
							return 1;
						} else {
							PacketBufferNode var6 = class4.getPacketBufferNode(ClientPacket.field2310, Client.packetWriter.isaacCipher); // L: 1407
							var6.packetBuffer.writeShort(1 + SpriteMask.stringCp1252NullTerminatedByteSize(var4) + SpriteMask.stringCp1252NullTerminatedByteSize(var5)); // L: 1408
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1409
							var6.packetBuffer.writeByte(var10); // L: 1410
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1411
							Client.packetWriter.addNode(var6); // L: 1412
							return 1; // L: 1413
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1416
						return 1; // L: 1417
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1420
						return 1; // L: 1421
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1424
						return 1; // L: 1425
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) { // L: 1428
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1429
						}

						return 1; // L: 1430
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) { // L: 1433
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1434
						}

						return 1; // L: 1435
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) { // L: 1438
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1439
						}

						return 1; // L: 1440
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) { // L: 1443
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1444
						}

						return 1; // L: 1445
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1448
						return 1; // L: 1449
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1452
						return 1; // L: 1453
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1456
						return 1; // L: 1457
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Huffman.setTapToDrop(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1); // L: 1460
						return 1; // L: 1461
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ModeWhere.getTapToDrop() ? 1 : 0; // L: 1464
						return 1; // L: 1465
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						MilliClock.Interpreter_intStackSize -= 2; // L: 1468
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1469
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1470
						return 1; // L: 1471
					} else if (var0 == 3130) {
						MilliClock.Interpreter_intStackSize -= 2; // L: 1474
						return 1; // L: 1475
					} else if (var0 == 3131) {
						--MilliClock.Interpreter_intStackSize; // L: 1478
						return 1; // L: 1479
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ItemContainer.canvasWidth; // L: 1482
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = HealthBar.canvasHeight; // L: 1483
						return 1; // L: 1484
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--MilliClock.Interpreter_intStackSize; // L: 1487
						return 1; // L: 1488
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1491
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						MilliClock.Interpreter_intStackSize -= 2; // L: 1494
						return 1; // L: 1495
					} else if (var0 == 3136) {
						Client.field843 = 3; // L: 1498
						Client.field844 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1499
						return 1; // L: 1500
					} else if (var0 == 3137) {
						Client.field843 = 2; // L: 1503
						Client.field844 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1504
						return 1; // L: 1505
					} else if (var0 == 3138) {
						Client.field843 = 0; // L: 1508
						return 1; // L: 1509
					} else if (var0 == 3139) {
						Client.field843 = 1; // L: 1512
						return 1; // L: 1513
					} else if (var0 == 3140) {
						Client.field843 = 3; // L: 1516
						Client.field844 = var2 ? MouseRecorder.field621.id * -583486671 * -509491759 : Interpreter.field1122.id * -583486671 * -509491759; // L: 1517
						return 1; // L: 1518
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1521
							GrandExchangeOfferAgeComparator.clientPreferences.hideUsername = var3; // L: 1522
							Tile.savePreferences(); // L: 1523
							return 1; // L: 1524
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? 1 : 0; // L: 1527
							return 1; // L: 1528
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1531
							Client.Login_isUsernameRemembered = var3; // L: 1532
							if (!var3) { // L: 1533
								GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = ""; // L: 1534
								Tile.savePreferences(); // L: 1535
							}

							return 1; // L: 1537
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1540
							return 1; // L: 1541
						} else if (var0 == 3145) {
							return 1; // L: 1544
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 1547
							if (var3 == GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled) { // L: 1548
								GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled = !var3; // L: 1549
								Tile.savePreferences(); // L: 1550
							}

							return 1; // L: 1552
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1555
							return 1; // L: 1556
						} else if (var0 == 3148) {
							return 1; // L: 1559
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1562
							return 1; // L: 1563
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1566
							return 1; // L: 1567
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1570
							return 1; // L: 1571
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1574
							return 1; // L: 1575
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1578
							return 1; // L: 1579
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GraphicsObject.method2122(); // L: 1582
							return 1; // L: 1583
						} else if (var0 == 3155) {
							--UrlRequester.Interpreter_stringStackSize; // L: 1586
							return 1; // L: 1587
						} else if (var0 == 3156) {
							return 1; // L: 1590
						} else if (var0 == 3157) {
							MilliClock.Interpreter_intStackSize -= 2; // L: 1593
							return 1; // L: 1594
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1597
							return 1; // L: 1598
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1601
							return 1; // L: 1602
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1605
							return 1; // L: 1606
						} else if (var0 == 3161) {
							--MilliClock.Interpreter_intStackSize; // L: 1609
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1610
							return 1; // L: 1611
						} else if (var0 == 3162) {
							--MilliClock.Interpreter_intStackSize; // L: 1614
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1615
							return 1; // L: 1616
						} else if (var0 == 3163) {
							--UrlRequester.Interpreter_stringStackSize; // L: 1619
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1620
							return 1; // L: 1621
						} else if (var0 == 3164) {
							--MilliClock.Interpreter_intStackSize; // L: 1624
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1625
							return 1; // L: 1626
						} else if (var0 == 3165) {
							--MilliClock.Interpreter_intStackSize; // L: 1629
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1630
							return 1; // L: 1631
						} else if (var0 == 3166) {
							MilliClock.Interpreter_intStackSize -= 2; // L: 1634
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1635
							return 1; // L: 1636
						} else if (var0 == 3167) {
							MilliClock.Interpreter_intStackSize -= 2; // L: 1639
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1640
							return 1; // L: 1641
						} else if (var0 == 3168) {
							MilliClock.Interpreter_intStackSize -= 2; // L: 1644
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1645
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1646
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1647
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1648
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1649
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1650
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1651
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1652
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1653
							return 1; // L: 1654
						} else if (var0 == 3169) {
							return 1; // L: 1657
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1660
							return 1; // L: 1661
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1664
							return 1; // L: 1665
						} else if (var0 == 3172) {
							--MilliClock.Interpreter_intStackSize; // L: 1668
							return 1; // L: 1669
						} else if (var0 == 3173) {
							--MilliClock.Interpreter_intStackSize; // L: 1672
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1673
							return 1; // L: 1674
						} else if (var0 == 3174) {
							--MilliClock.Interpreter_intStackSize; // L: 1677
							return 1; // L: 1678
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1681
							return 1; // L: 1682
						} else if (var0 == 3176) {
							return 1; // L: 1685
						} else if (var0 == 3177) {
							return 1; // L: 1688
						} else if (var0 == 3178) {
							--UrlRequester.Interpreter_stringStackSize; // L: 1691
							return 1; // L: 1692
						} else if (var0 == 3179) {
							return 1; // L: 1695
						} else if (var0 == 3180) {
							--UrlRequester.Interpreter_stringStackSize; // L: 1698
							return 1; // L: 1699
						} else {
							return 2; // L: 1701
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1211610671"
	)
	static String method2157(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 11544
		if (Client.gameBuild == 1) { // L: 11545
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 11546
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 11547
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 11548
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 11549
			var0 = "local";
		}

		String var3 = ""; // L: 11550
		if (WorldMapRegion.field281 != null) { // L: 11551
			var3 = "/p=" + WorldMapRegion.field281;
		}

		String var4 = "runescape.com"; // L: 11552
		return var2 + var0 + "." + var4 + "/l=" + FontName.clientLanguage + "/a=" + TextureProvider.field1561 + var3 + "/"; // L: 11553
	}
}
