import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -157770033
	)
	static int field1837;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lfe;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 225433591
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("bw")
	static String field1836;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1299473343
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2002473353
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1967880505
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("l")
	@Export("name")
	public String name;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -713900129
	)
	public int field1819;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1130122781
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("p")
	public boolean field1822;
	@ObfuscatedName("w")
	public boolean field1823;
	@ObfuscatedName("k")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("d")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("m")
	int[] field1826;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 380033171
	)
	int field1827;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 290055171
	)
	int field1818;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1320968285
	)
	int field1829;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 822364643
	)
	int field1816;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("j")
	int[] field1821;
	@ObfuscatedName("e")
	byte[] field1834;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -504229365
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1822 = true; // L: 24
		this.field1823 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1827 = Integer.MAX_VALUE; // L: 29
		this.field1818 = Integer.MAX_VALUE; // L: 30
		this.field1829 = Integer.MIN_VALUE;
		this.field1816 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	} // L: 41

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "2"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 70
			if (var2 == 0) { // L: 71
				return; // L: 74
			}

			this.decodeNext(var1, var2); // L: 72
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-633870320"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method7692();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method7692();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1819 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field1822 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field1823 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field1826 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field1826[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1821 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1821.length; ++var5) { // L: 101
					this.field1821[var5] = var1.readInt();
				}

				this.field1834 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field1834[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method7692(); // L: 108
				} else if (var2 == 19) { // L: 110
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 111
					var1.readInt(); // L: 112
				} else if (var2 == 22) { // L: 114
					var1.readInt(); // L: 115
				} else if (var2 == 23) { // L: 117
					var1.readUnsignedByte(); // L: 118
					var1.readUnsignedByte(); // L: 119
					var1.readUnsignedByte(); // L: 120
				} else if (var2 == 24) { // L: 122
					var1.readShort(); // L: 123
					var1.readShort(); // L: 124
				} else if (var2 == 25) { // L: 126
					var1.method7692(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1890, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1889}; // L: 135
					this.horizontalAlignment = (HorizontalAlignment)MusicPatchPcmStream.findEnumerated(var3, var1.readUnsignedByte()); // L: 137
				} else if (var2 == 30) { // L: 139
					this.verticalAlignment = (VerticalAlignment)MusicPatchPcmStream.findEnumerated(class295.method5745(), var1.readUnsignedByte()); // L: 140
				}
			}
		}

	} // L: 143

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	void method3381() {
		if (this.field1826 != null) { // L: 146
			for (int var1 = 0; var1 < this.field1826.length; var1 += 2) { // L: 147
				if (this.field1826[var1] < this.field1827) { // L: 148
					this.field1827 = this.field1826[var1];
				} else if (this.field1826[var1] > this.field1829) {
					this.field1829 = this.field1826[var1]; // L: 149
				}

				if (this.field1826[var1 + 1] < this.field1818) { // L: 150
					this.field1818 = this.field1826[var1 + 1];
				} else if (this.field1826[var1 + 1] > this.field1816) {
					this.field1816 = this.field1826[var1 + 1]; // L: 151
				}
			}
		}

	} // L: 154

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lqi;",
		garbageValue = "39477486"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 157
		return this.getSprite(var2); // L: 158
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lqi;",
		garbageValue = "-824891527"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 162
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 163
			if (var2 != null) { // L: 164
				return var2;
			} else {
				var2 = class6.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 165
				if (var2 != null) { // L: 166
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 167
				}

				return var2; // L: 169
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1607536994"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 173
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "1727118397"
	)
	static void method3403(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 31
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 32
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 34
					return; // L: 35
				} catch (Exception var5) { // L: 37
				}
			}

			if (class29.field175.startsWith("win") && !var3) { // L: 39 40
				PendingSpawn.method2165(var0, 0, "openjs"); // L: 42
				return; // L: 44
			}

			if (class29.field175.startsWith("mac")) { // L: 47
				PendingSpawn.method2165(var0, 1, var2); // L: 48
				return; // L: 49
			}

			PendingSpawn.method2165(var0, 2, "openjs"); // L: 52
		} else {
			PendingSpawn.method2165(var0, 3, "openjs"); // L: 57
		}

	} // L: 60

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1481708201"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 142
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILhv;Lgv;B)V",
		garbageValue = "-47"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 332 333 334
			if (var0 < Tiles.Tiles_minPlane) { // L: 337
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class146.getObjectDefinition(var3); // L: 338
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 341
				var9 = var8.sizeX; // L: 346
				var10 = var8.sizeY; // L: 347
			} else {
				var9 = var8.sizeY; // L: 342
				var10 = var8.sizeX; // L: 343
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 353
				var11 = (var9 >> 1) + var1; // L: 354
				var12 = (var9 + 1 >> 1) + var1; // L: 355
			} else {
				var11 = var1; // L: 358
				var12 = var1 + 1; // L: 359
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 361
				var13 = (var10 >> 1) + var2; // L: 362
				var14 = var2 + (var10 + 1 >> 1); // L: 363
			} else {
				var13 = var2; // L: 366
				var14 = var2 + 1; // L: 367
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 369
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2; // L: 370
			int var17 = (var1 << 7) + (var9 << 6); // L: 371
			int var18 = (var2 << 7) + (var10 << 6); // L: 372
			long var19 = GameObject.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 373
			int var21 = var5 + (var4 << 6); // L: 374
			if (var8.int3 == 1) { // L: 375
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 376
				class360.method6589(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 377
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 378
					if (var8.animationId == -1 && var8.transforms == null) { // L: 380
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 381
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 382
					if (var8.interactType == 1 && var7 != null) { // L: 383
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 386
					int[] var10000;
					if (var5 >= 12) { // L: 407
						if (var8.animationId == -1 && var8.transforms == null) { // L: 409
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 410
						}

						var6.method4882(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 411
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 412
							var10000 = class420.field4545[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 413
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 416
						if (var8.animationId == -1 && var8.transforms == null) { // L: 418
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 419
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field990[var4], 0, var19, var21); // L: 420
						if (var4 == 0) { // L: 421
							if (var8.clipped) { // L: 422
								class392.field4374[var0][var1][var2] = 50; // L: 423
								class392.field4374[var0][var1][var2 + 1] = 50; // L: 424
							}

							if (var8.modelClipped) { // L: 426
								var10000 = class420.field4545[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 428
							if (var8.clipped) { // L: 429
								class392.field4374[var0][var1][var2 + 1] = 50; // L: 430
								class392.field4374[var0][var1 + 1][var2 + 1] = 50; // L: 431
							}

							if (var8.modelClipped) { // L: 433
								var10000 = class420.field4545[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 435
							if (var8.clipped) { // L: 436
								class392.field4374[var0][var1 + 1][var2] = 50; // L: 437
								class392.field4374[var0][var1 + 1][var2 + 1] = 50; // L: 438
							}

							if (var8.modelClipped) { // L: 440
								var10000 = class420.field4545[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 442
							if (var8.clipped) { // L: 443
								class392.field4374[var0][var1][var2] = 50; // L: 444
								class392.field4374[var0][var1 + 1][var2] = 50; // L: 445
							}

							if (var8.modelClipped) { // L: 447
								var10000 = class420.field4545[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 449
							var7.method3872(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 450
							var6.method4748(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 453
						if (var8.animationId == -1 && var8.transforms == null) { // L: 455
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 456
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field989[var4], 0, var19, var21); // L: 457
						if (var8.clipped) { // L: 458
							if (var4 == 0) { // L: 459
								class392.field4374[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 460
								class392.field4374[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 461
								class392.field4374[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 462
								class392.field4374[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 464
							var7.method3872(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 467
							var22 = var4 + 1 & 3; // L: 468
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 471
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 472
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 473
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 476
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 477
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field990[var4], Tiles.field990[var22], var19, var21); // L: 479
							if (var8.modelClipped) { // L: 480
								if (var4 == 0) { // L: 481
									var10000 = class420.field4545[var0][var1]; // L: 482
									var10000[var2] |= 585;
									var10000 = class420.field4545[var0][var1]; // L: 483
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) { // L: 485
									var10000 = class420.field4545[var0][var1]; // L: 486
									var10000[1 + var2] |= 1170;
									var10000 = class420.field4545[var0][var1 + 1]; // L: 487
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 489
									var10000 = class420.field4545[var0][var1 + 1]; // L: 490
									var10000[var2] |= 585;
									var10000 = class420.field4545[var0][var1]; // L: 491
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 493
									var10000 = class420.field4545[var0][var1]; // L: 494
									var10000[var2] |= 1170;
									var10000 = class420.field4545[var0][var1]; // L: 495
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 498
								var7.method3872(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 499
								var6.method4748(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 502
							if (var8.animationId == -1 && var8.transforms == null) { // L: 504
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 505
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field989[var4], 0, var19, var21); // L: 506
							if (var8.clipped) { // L: 507
								if (var4 == 0) { // L: 508
									class392.field4374[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 509
									class392.field4374[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 510
									class392.field4374[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 511
									class392.field4374[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 513
								var7.method3872(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 516
							if (var8.animationId == -1 && var8.transforms == null) { // L: 518
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 519
							}

							var6.method4882(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 520
							if (var8.interactType != 0 && var7 != null) { // L: 521
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 522
								var6.method4748(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 525
							if (var8.animationId == -1 && var8.transforms == null) { // L: 527
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 528
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field990[var4], 0, 0, 0, var19, var21); // L: 529
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 532
								var22 = 16; // L: 533
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 534
								if (0L != var23) { // L: 535
									var22 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 537
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 538
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field990[var4], 0, var22 * Tiles.field992[var4], var22 * Tiles.field993[var4], var19, var21); // L: 539
							} else if (var5 == 6) { // L: 542
								var22 = 8; // L: 543
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 544
								if (var23 != 0L) { // L: 545
									var22 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 547
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 548
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field997[var4], var22 * Tiles.field995[var4], var19, var21); // L: 549
							} else if (var5 == 7) { // L: 552
								var28 = var4 + 2 & 3; // L: 554
								if (var8.animationId == -1 && var8.transforms == null) { // L: 555
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 556
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 557
							} else if (var5 == 8) { // L: 560
								var22 = 8; // L: 561
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 562
								if (0L != var23) { // L: 563
									var22 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 566
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 567
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 568
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 569
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 572
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 573
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field997[var4], var22 * Tiles.field995[var4], var19, var21); // L: 575
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 388
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 389
					}

					if (var29 != null && var6.method4882(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 390 391
						var28 = 15; // L: 392
						if (var29 instanceof Model) { // L: 393
							var28 = ((Model)var29).method5014() / 4; // L: 394
							if (var28 > 30) { // L: 395
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 397
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 398
								if (var28 > class392.field4374[var0][var31 + var1][var32 + var2]) { // L: 399
									class392.field4374[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 404
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 384 405 414 451 465 500 514 523 530 540 550 558 576 578

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-62"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12393
			PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher); // L: 12395
			var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0)); // L: 12396
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12397
			Client.packetWriter.addNode(var1); // L: 12398
		}
	} // L: 12399
}
