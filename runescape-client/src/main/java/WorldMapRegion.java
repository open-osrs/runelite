import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = 1321531033
	)
	static int field2706;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1652001983
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 175632235
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("u")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -862418989
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1514122443
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("x")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("c")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("j")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 50
		this.regionY = var2; // L: 51
		this.worldMapData1List = new LinkedList(); // L: 52
		this.icon0List = new LinkedList(); // L: 53
		this.iconMap = new HashMap(); // L: 54
		this.backgroundColor = var3 | -16777216; // L: 55
		this.fonts = var4; // L: 56
	} // L: 57

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1350544983"
	)
	void method4677(int var1, int var2, int var3) {
		SpritePixels var4 = class28.method423(this.regionX, this.regionY, this.pixelsPerTile); // L: 60
		if (var4 != null) { // L: 61
			if (var3 == this.pixelsPerTile * 64) { // L: 62
				var4.drawAt(var1, var2); // L: 63
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 66
			}

		}
	} // L: 68

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhn;Ljava/util/List;B)V",
		garbageValue = "0"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 71
		this.worldMapData_0 = var1; // L: 72
		this.addAllToIconList(var2); // L: 73
	} // L: 74

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-691680416"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 77
		Iterator var3 = var1.iterator(); // L: 78

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 79
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 81
				this.worldMapData1List.add(var4); // L: 82
			}
		}

		this.addAllToIconList(var2); // L: 86
	} // L: 87

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIILiu;I)V",
		garbageValue = "554525387"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 90
			label75:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 91
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 92
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 93
					if (var9 != null && var9.length != 0) { // L: 94
						WorldMapDecoration[] var10 = var9; // L: 98

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 99
							ObjectComposition var13;
							boolean var14;
							label66: {
								WorldMapDecoration var12 = var10[var11]; // L: 100
								var13 = class116.getObjectDefinition(var12.objectDefinitionId); // L: 102
								if (var13.transforms != null) { // L: 105
									int[] var15 = var13.transforms; // L: 107

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 108
										int var17 = var15[var16]; // L: 109
										ObjectComposition var18 = class116.getObjectDefinition(var17); // L: 111
										if (var18.mapIconId != -1) { // L: 112
											var14 = true; // L: 113
											break label66;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 120
									var14 = true; // L: 121
									break label66; // L: 122
								}

								var14 = false; // L: 124
							}

							if (var14) { // L: 126
								this.getIcon(var13, var8, var6, var7, var5); // L: 129
								continue label75; // L: 130
							}
						}
					}
				}
			}
		}

	} // L: 137

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgx;IIILiu;B)V",
		garbageValue = "3"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 140
		Coord var7 = null; // L: 141
		if (this.worldMapData_0 != null) { // L: 142
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 143
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 146
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 147
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 150
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 151
		} else {
			var9 = class19.WorldMapElement_get(var1.mapIconId); // L: 154
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 155
		}

		var9 = class19.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 157
		if (var9.field1835) { // L: 158
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 159
		}

	} // L: 161

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1628100931"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 164

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 165
			if (var2 instanceof WorldMapIcon_1) { // L: 167
				((WorldMapIcon_1)var2).init(); // L: 168
			}
		}

	} // L: 172

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-883306894"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 175

		while (var2.hasNext()) { // L: 186
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 176
			if (class19.WorldMapElement_get(var3.element).field1835 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 178 181
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4675(var3.element)); // L: 182
				this.icon0List.add(var4); // L: 183
			}
		}

	} // L: 187

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2141874289"
	)
	void method4679() {
		if (this.worldMapData_0 != null) { // L: 190
			this.worldMapData_0.reset(); // L: 191
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 194

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 195
				var2.reset(); // L: 197
			}
		}

	} // L: 201

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)Z",
		garbageValue = "-1638134467"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 204
		if (this.worldMapData_0 != null) { // L: 205
			this.worldMapData_0.loadGeography(var1); // L: 206
			if (this.worldMapData_0.isFullyLoaded()) { // L: 207
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 208
				return true; // L: 209
			} else {
				return false; // L: 211
			}
		} else {
			boolean var2 = true; // L: 214

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 215 219
				var4 = (WorldMapData_1)var3.next(); // L: 216
				var4.loadGeography(var1); // L: 218
			}

			if (var2) { // L: 222
				var3 = this.worldMapData1List.iterator(); // L: 223

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 224
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 226
				}
			}

			return var2; // L: 230
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILie;[Lqx;Llq;Llq;I)V",
		garbageValue = "-1187149260"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 235
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 236
			if (class28.method423(this.regionX, this.regionY, var1) == null) { // L: 239
				boolean var6 = true; // L: 242
				var6 &= this.loadGeography(var4); // L: 243
				int var8;
				if (this.worldMapData_0 != null) { // L: 246
					var8 = this.worldMapData_0.groupId; // L: 247
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 250
				}

				var6 &= var5.tryLoadGroup(var8); // L: 252
				if (var6) { // L: 253
					byte[] var7 = var5.takeFileFlat(var8); // L: 254
					WorldMapSprite var9;
					if (var7 == null) { // L: 257
						var9 = new WorldMapSprite(); // L: 258
					} else {
						var9 = new WorldMapSprite(class29.method433(var7).pixels); // L: 261
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 264
					var11.setRaster(); // L: 265
					if (this.worldMapData_0 != null) { // L: 266
						this.method4684(var2, var3, var9); // L: 267
					} else {
						this.method4714(var2, var3, var9); // L: 270
					}

					int var12 = this.regionX; // L: 272
					int var13 = this.regionY; // L: 273
					int var14 = this.pixelsPerTile; // L: 274
					WorldMapRegion_cachedSprites.put(var11, class65.method1867(var12, var13, var14), var11.pixels.length * 4); // L: 276
					this.method4679(); // L: 278
				}
			}
		}
	} // L: 237 240 279

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-268050800"
	)
	void method4682(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 282
			var4 = new HashSet(); // L: 283
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 285
		this.drawMapLinks(var1, var2, var4, var3); // L: 286
	} // L: 287

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1089200955"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 290

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 291
			if (var5.hasValidElement()) { // L: 293
				int var6 = var5.getElement(); // L: 294
				if (var1.contains(var6)) { // L: 295
					WorldMapElement var7 = class19.WorldMapElement_get(var6); // L: 296
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 297
				}
			}
		}

		this.method4693(var1, var2, var3); // L: 301
	} // L: 302

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lie;[Lqx;Lis;I)V",
		garbageValue = "954232927"
	)
	void method4684(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 305
			for (var5 = 0; var5 < 64; ++var5) { // L: 306
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 307
				this.method4688(var4, var5, this.worldMapData_0, var1); // L: 308
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 311
			for (var5 = 0; var5 < 64; ++var5) { // L: 312
				this.method4687(var4, var5, this.worldMapData_0, var1, var2); // L: 313
			}
		}

	} // L: 316

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lie;[Lqx;Lis;I)V",
		garbageValue = "1932235022"
	)
	void method4714(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 319

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 320

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 322
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 323
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 324
					this.method4688(var6, var7, var5, var1); // L: 325
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 330

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 331

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 333
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 334
					this.method4687(var6, var7, var5, var1, var2); // L: 335
				}
			}
		}

	} // L: 340

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IILiu;Lie;[Lqx;S)V",
		garbageValue = "-17045"
	)
	void method4687(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4706(var1, var2, var3); // L: 343
		this.method4690(var1, var2, var3, var5); // L: 344
	} // L: 345

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILiu;Lie;Lis;I)V",
		garbageValue = "-845219169"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 348
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 349
		if (var6 == -1 && var7 == -1) { // L: 350
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 351
		}

		int var8 = 16711935; // L: 353
		int var9;
		if (var7 != -1) { // L: 354
			int var10 = this.backgroundColor; // L: 356
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 360
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 361
				var11 = var12; // L: 362
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 365
				var12 = new FloorOverlayDefinition(); // L: 366
				if (var13 != null) { // L: 367
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 368
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 369
				var11 = var12; // L: 370
			}

			if (var11 == null) { // L: 373
				var9 = var10; // L: 374
			} else if (var11.secondaryRgb >= 0) { // L: 377
				var9 = var11.secondaryRgb | -16777216; // L: 378
			} else {
				int var14;
				int var22;
				if (var11.texture >= 0) { // L: 380
					var14 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture); // L: 382
					byte var15 = 96; // L: 383
					int var21;
					if (var14 == -2) { // L: 385
						var21 = 12345678; // L: 386
					} else if (var14 == -1) { // L: 389
						if (var15 < 0) { // L: 390
							var15 = 0; // L: 391
						} else if (var15 > 127) { // L: 393
							var15 = 127; // L: 394
						}

						var22 = 127 - var15; // L: 396
						var21 = var22; // L: 397
					} else {
						var22 = var15 * (var14 & 127) / 128; // L: 400
						if (var22 < 2) { // L: 401
							var22 = 2;
						} else if (var22 > 126) { // L: 402
							var22 = 126;
						}

						var21 = var22 + (var14 & 65408); // L: 403
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var21] | -16777216; // L: 406
				} else if (var11.primaryRgb == 16711935) { // L: 408
					var9 = var10; // L: 409
				} else {
					var14 = var11.hue; // L: 413
					var22 = var11.saturation; // L: 414
					int var16 = var11.lightness; // L: 415
					if (var16 > 179) { // L: 417
						var22 /= 2;
					}

					if (var16 > 192) { // L: 418
						var22 /= 2;
					}

					if (var16 > 217) { // L: 419
						var22 /= 2;
					}

					if (var16 > 243) { // L: 420
						var22 /= 2;
					}

					int var17 = (var22 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 421
					byte var19 = 96; // L: 426
					int var18;
					if (var17 == -2) { // L: 428
						var18 = 12345678; // L: 429
					} else {
						int var23;
						if (var17 == -1) { // L: 432
							if (var19 < 0) { // L: 433
								var19 = 0; // L: 434
							} else if (var19 > 127) { // L: 436
								var19 = 127; // L: 437
							}

							var23 = 127 - var19; // L: 439
							var18 = var23; // L: 440
						} else {
							var23 = var19 * (var17 & 127) / 128; // L: 443
							if (var23 < 2) { // L: 444
								var23 = 2;
							} else if (var23 > 126) { // L: 445
								var23 = 126;
							}

							var18 = var23 + (var17 & 65408); // L: 446
						}
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 449
				}
			}

			var8 = var9; // L: 452
		}

		if (var7 > -1 && var3.field2793[0][var1][var2] == 0) { // L: 454
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 455
		} else {
			var9 = this.method4671(var1, var2, var3, var5); // L: 458
			if (var7 == -1) { // L: 459
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 460
			} else {
				var4.method5091(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2793[0][var1][var2], var3.field2792[0][var1][var2]); // L: 463
			}
		}
	} // L: 456 461 464

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILiu;Lie;I)V",
		garbageValue = "1864797508"
	)
	void method4688(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 467
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 468
			if (var6 > -1) { // L: 469
				int var8 = this.backgroundColor; // L: 471
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 475
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 476
					var9 = var10; // L: 477
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 480
					var10 = new FloorOverlayDefinition(); // L: 481
					if (var11 != null) { // L: 482
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 483
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 484
					var9 = var10; // L: 485
				}

				int var7;
				if (var9 == null) { // L: 488
					var7 = var8; // L: 489
				} else if (var9.secondaryRgb >= 0) { // L: 492
					var7 = var9.secondaryRgb | -16777216; // L: 493
				} else {
					int var12;
					int var21;
					if (var9.texture >= 0) { // L: 495
						var12 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture); // L: 497
						byte var13 = 96; // L: 498
						int var19;
						if (var12 == -2) { // L: 500
							var19 = 12345678; // L: 501
						} else if (var12 == -1) { // L: 504
							if (var13 < 0) { // L: 505
								var13 = 0; // L: 506
							} else if (var13 > 127) { // L: 508
								var13 = 127; // L: 509
							}

							var21 = 127 - var13; // L: 511
							var19 = var21; // L: 512
						} else {
							var21 = var13 * (var12 & 127) / 128; // L: 515
							if (var21 < 2) {
								var21 = 2; // L: 516
							} else if (var21 > 126) { // L: 517
								var21 = 126;
							}

							var19 = var21 + (var12 & 65408); // L: 518
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216; // L: 521
					} else if (var9.primaryRgb == 16711935) { // L: 523
						var7 = var8; // L: 524
					} else {
						var12 = var9.hue; // L: 528
						var21 = var9.saturation; // L: 529
						int var14 = var9.lightness; // L: 530
						if (var14 > 179) { // L: 532
							var21 /= 2;
						}

						if (var14 > 192) { // L: 533
							var21 /= 2;
						}

						if (var14 > 217) { // L: 534
							var21 /= 2;
						}

						if (var14 > 243) { // L: 535
							var21 /= 2;
						}

						int var15 = (var21 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 536
						byte var17 = 96; // L: 541
						int var16;
						if (var15 == -2) { // L: 543
							var16 = 12345678; // L: 544
						} else {
							int var22;
							if (var15 == -1) { // L: 547
								if (var17 < 0) { // L: 548
									var17 = 0; // L: 549
								} else if (var17 > 127) { // L: 551
									var17 = 127; // L: 552
								}

								var22 = 127 - var17; // L: 554
								var16 = var22; // L: 555
							} else {
								var22 = var17 * (var15 & 127) / 128; // L: 558
								if (var22 < 2) { // L: 559
									var22 = 2;
								} else if (var22 > 126) { // L: 560
									var22 = 126;
								}

								var16 = var22 + (var15 & 65408); // L: 561
							}
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 564
					}
				}

				if (var3.field2793[var5][var1][var2] == 0) { // L: 568
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 569
				} else {
					var4.method5091(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2793[var5][var1][var2], var3.field2792[var5][var1][var2]); // L: 572
				}
			}
		}

	} // L: 576

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILiu;Lis;I)I",
		garbageValue = "-1949774050"
	)
	int method4671(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 579 580 582
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILiu;[Lqx;B)V",
		garbageValue = "94"
	)
	void method4690(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 586
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 587
			if (var6 != null && var6.length != 0) { // L: 588
				WorldMapDecoration[] var7 = var6; // L: 592

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 593
					WorldMapDecoration var9 = var7[var8]; // L: 594
					int var11 = var9.decoration; // L: 597
					boolean var10 = var11 >= WorldMapDecorationType.field3513.id && var11 <= WorldMapDecorationType.field3532.id; // L: 599
					if (!var10) { // L: 602
						int var13 = var9.decoration; // L: 604
						boolean var12 = var13 == WorldMapDecorationType.field3520.id; // L: 606
						if (!var12) { // L: 608
							continue;
						}
					}

					ObjectComposition var14 = class116.getObjectDefinition(var9.objectDefinitionId); // L: 610
					if (var14.mapSceneId != -1) { // L: 611
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 612
							var4[var14.mapSceneId].method8161(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 616
						} else {
							var4[var14.mapSceneId].method8161(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 613
						}
					}
				}
			}
		}

	} // L: 624

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILiu;B)V",
		garbageValue = "-88"
	)
	void method4706(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 627
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 628
			if (var5 != null && var5.length != 0) { // L: 629
				WorldMapDecoration[] var6 = var5; // L: 633

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 634
					WorldMapDecoration var8 = var6[var7]; // L: 635
					if (class14.method175(var8.decoration)) { // L: 637
						ObjectComposition var9 = class116.getObjectDefinition(var8.objectDefinitionId); // L: 638
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 639
						if (var8.decoration == WorldMapDecorationType.field3519.id) { // L: 640
							this.method4739(var1, var2, var8.rotation, var10); // L: 641
						}

						if (var8.decoration == WorldMapDecorationType.field3512.id) { // L: 643
							this.method4739(var1, var2, var8.rotation, -3355444); // L: 644
							this.method4739(var1, var2, var8.rotation + 1, var10); // L: 645
						}

						if (var8.decoration == WorldMapDecorationType.field3511.id) { // L: 647
							if (var8.rotation == 0) { // L: 648
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 649
							}

							if (var8.rotation == 2) { // L: 650
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 651
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3514.id) { // L: 653
							int var11 = var8.rotation % 2; // L: 654
							int var12;
							if (var11 == 0) { // L: 655
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 656
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 657
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 661
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 662
								}
							}
						}
					}
				}
			}
		}

	} // L: 671

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-162919389"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 674
		float var6 = var5 / 2.0F; // L: 675
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 676

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 677
			Coord var9 = (Coord)var8.getKey(); // L: 679
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 680
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 681
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 682
			if (var12 != null && var12.hasValidElement()) { // L: 683
				var12.screenX = var10; // L: 684
				var12.screenY = var11; // L: 685
				WorldMapElement var13 = class19.WorldMapElement_get(var12.getElement()); // L: 686
				if (!var3.contains(var13.getObjectId())) { // L: 687
					this.method4695(var12, var10, var11, var5); // L: 688
				}
			}
		}

	} // L: 693

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-127"
	)
	void method4693(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 696

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 697
			if (var5.hasValidElement()) { // L: 699
				WorldMapElement var6 = class19.WorldMapElement_get(var5.getElement()); // L: 700
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 701
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 702
				}
			}
		}

	} // L: 706

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfs;IIIIB)V",
		garbageValue = "-10"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 709
		if (var6 != null) { // L: 710
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 713
			if (var4 % var5 < var5 / 2) { // L: 714
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 715
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 716
			}

		}
	} // L: 711 718

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIFI)V",
		garbageValue = "1970229100"
	)
	void method4695(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class19.WorldMapElement_get(var1.getElement()); // L: 721
		this.method4696(var5, var2, var3); // L: 722
		this.method4789(var1, var5, var2, var3, var4); // L: 723
	} // L: 724

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfs;IIB)V",
		garbageValue = "44"
	)
	void method4696(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 727
		if (var4 != null) { // L: 728
			int var5 = this.method4710(var4, var1.horizontalAlignment); // L: 729
			int var6 = this.method4700(var4, var1.verticalAlignment); // L: 730
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 731
		}

	} // L: 733

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lfs;IIFS)V",
		garbageValue = "-3122"
	)
	void method4789(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 736
		if (var6 != null) { // L: 737
			if (var6.size.method4532(var5)) { // L: 740
				Font var7 = (Font)this.fonts.get(var6.size); // L: 743
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1833, 0, 1, 0, var7.ascent / 2); // L: 744
			}
		}
	} // L: 738 741 745

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IS)V",
		garbageValue = "16351"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 748
		Iterator var6 = this.icon0List.iterator(); // L: 749

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 750
			if (var7.hasValidElement()) { // L: 752
				int var8 = var7.coord2.x % 64; // L: 753
				int var9 = var7.coord2.y % 64; // L: 754
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 755
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 756
				if (!var3.contains(var7.getElement())) { // L: 757
					this.method4695(var7, var7.screenX, var7.screenY, var5); // L: 760
				}
			}
		}

	} // L: 763

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lfg;I)I",
		garbageValue = "1542273594"
	)
	int method4710(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 766
		case 0:
			return 0; // L: 769
		case 1:
			return -var1.subWidth / 2; // L: 777
		default:
			return -var1.subWidth; // L: 773
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lfm;I)I",
		garbageValue = "-646566813"
	)
	int method4700(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 783
		case 0:
			return -var1.subHeight / 2; // L: 794
		case 2:
			return 0; // L: 790
		default:
			return -var1.subHeight; // L: 786
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Liw;",
		garbageValue = "836188853"
	)
	WorldMapLabel method4675(int var1) {
		WorldMapElement var2 = class19.WorldMapElement_get(var1); // L: 800
		return this.createMapLabel(var2); // L: 801
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfs;I)Liw;",
		garbageValue = "-2050165109"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 805
			WorldMapLabelSize var2 = WorldMapLabelSize.method4536(var1.textSize); // L: 808
			if (var2 == null) { // L: 809
				return null; // L: 810
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 812
				if (var3 == null) { // L: 813
					return null; // L: 814
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 816
					String[] var5 = new String[var4]; // L: 817
					var3.breakLines(var1.name, (int[])null, var5); // L: 818
					int var6 = var5.length * var3.ascent / 2; // L: 819
					int var7 = 0; // L: 820
					String[] var8 = var5; // L: 822

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 823
						String var10 = var8[var9]; // L: 824
						int var11 = var3.stringWidth(var10); // L: 826
						if (var11 > var7) { // L: 827
							var7 = var11; // L: 828
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 833
				}
			}
		} else {
			return null; // L: 806
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "123"
	)
	List method4703(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 837
		if (var4 >= var1 && var5 >= var2) { // L: 838
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 839
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 840
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 841
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 843
						var6.add(var8); // L: 844
					}
				}

				var7 = this.icon0List.iterator(); // L: 848

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 849
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 851
						var6.add(var8); // L: 852
					}
				}

				return var6; // L: 856
			} else {
				return var6; // L: 847
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "32"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 860
		var1.addAll(this.icon0List); // L: 861
		var1.addAll(this.iconMap.values()); // L: 862
		return var1; // L: 863
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1810808163"
	)
	void method4739(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 867
		if (var3 == 0) { // L: 868
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 869
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 870
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 871
		}

	} // L: 872

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2014559127"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lck;B)V",
		garbageValue = "3"
	)
	static final void method4795(PendingSpawn var0) {
		long var1 = 0L; // L: 7373
		int var3 = -1; // L: 7374
		int var4 = 0; // L: 7375
		int var5 = 0; // L: 7376
		if (var0.type == 0) { // L: 7377
			var1 = FriendSystem.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7378
			var1 = FriendSystem.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7379
			var1 = FriendSystem.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 7380
			var1 = FriendSystem.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 7381
			int var6 = FriendSystem.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7382
			var3 = class121.Entity_unpackID(var1); // L: 7383
			var4 = var6 & 31; // L: 7384
			var5 = var6 >> 6 & 3; // L: 7385
		}

		var0.objectId = var3; // L: 7387
		var0.field1119 = var4; // L: 7388
		var0.field1117 = var5; // L: 7389
	} // L: 7390

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "56012862"
	)
	static void method4798(Buffer var0, int var1) {
		FontName.method7510(var0.array, var1); // L: 11875
		if (JagexCache.JagexCache_randomDat != null) { // L: 11877
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11879
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 11880
			} catch (Exception var3) { // L: 11882
			}
		}

	} // L: 11885
}
