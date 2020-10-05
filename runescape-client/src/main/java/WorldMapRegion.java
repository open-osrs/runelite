import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class WorldMapRegion {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("u")
	static String field277;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1185290071
	)
	int regionX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1059284245
	)
	int regionY;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("g")
	LinkedList worldMapData1List;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1881987389
	)
	int backgroundColor;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1196076883
	)
	int pixelsPerTile;
	@ObfuscatedName("d")
	List icon0List;
	@ObfuscatedName("h")
	HashMap iconMap;
	@ObfuscatedName("a")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1575156019"
	)
	void method505(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 61
		int var6 = this.regionY; // L: 62
		int var7 = this.pixelsPerTile; // L: 63
		Sprite var4 = (Sprite)WorldMapRegion_cachedSprites.get(MenuAction.method2139(var5, var6, var7)); // L: 65
		if (var4 != null) { // L: 68
			if (var3 == this.pixelsPerTile * 64) { // L: 69
				var4.drawAt(var1, var2); // L: 70
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 73
			}

		}
	} // L: 75

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ll;Ljava/util/List;I)V",
		garbageValue = "-1730892204"
	)
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 78
		this.worldMapData_0 = var1; // L: 79
		this.addAllToIconList(var2); // L: 80
	} // L: 81

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "1"
	)
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 84
		Iterator var3 = var1.iterator(); // L: 85

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 86
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 88
				this.worldMapData1List.add(var4); // L: 89
			}
		}

		this.addAllToIconList(var2); // L: 93
	} // L: 94

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIILan;I)V",
		garbageValue = "121581751"
	)
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 97
			label74:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 98
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 99
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 100
					if (var9 != null && var9.length != 0) { // L: 101
						WorldMapDecoration[] var10 = var9; // L: 105

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 106
							ObjectDefinition var13;
							boolean var14;
							label65: {
								WorldMapDecoration var12 = var10[var11]; // L: 107
								var13 = MidiPcmStream.getObjectDefinition(var12.objectDefinitionId); // L: 109
								if (var13.transforms != null) { // L: 112
									int[] var15 = var13.transforms; // L: 114

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 115
										int var17 = var15[var16]; // L: 116
										ObjectDefinition var18 = MidiPcmStream.getObjectDefinition(var17); // L: 118
										if (var18.mapIconId != -1) {
											var14 = true; // L: 120
											break label65;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 127
									var14 = true; // L: 128
									break label65; // L: 129
								}

								var14 = false; // L: 131
							}

							if (var14) { // L: 133
								this.getIcon(var13, var8, var6, var7, var5); // L: 136
								continue label74; // L: 137
							}
						}
					}
				}
			}
		}

	} // L: 144

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljg;IIILan;I)V",
		garbageValue = "329414981"
	)
	void getIcon(ObjectDefinition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 147
		Coord var7 = null; // L: 148
		if (this.worldMapData_0 != null) { // L: 149
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 150
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 153
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 154
		}

		Object var10;
		if (var1.transforms != null) { // L: 157
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 158
		} else {
			WorldMapElement var9 = WorldMapSection0.WorldMapElement_get(var1.mapIconId); // L: 161
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 162
		}

		this.iconMap.put(new Coord(0, var3, var4), var10); // L: 164
	} // L: 165

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1946946990"
	)
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 168

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 169
			if (var2 instanceof WorldMapIcon_1) { // L: 171
				((WorldMapIcon_1)var2).init(); // L: 172
			}
		}

	} // L: 176

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-2052830022"
	)
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method529(var3.element));
				this.icon0List.add(var4);
			}
		}

	} // L: 188

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "478350201"
	)
	void method507() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 195

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next();
				var2.reset(); // L: 198
			}
		}

	} // L: 202

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lic;B)Z",
		garbageValue = "-62"
	)
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 205
		if (this.worldMapData_0 != null) { // L: 206
			this.worldMapData_0.loadGeography(var1); // L: 207
			if (this.worldMapData_0.isFullyLoaded()) { // L: 208
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 209
				return true; // L: 210
			} else {
				return false; // L: 212
			}
		} else {
			boolean var2 = true; // L: 215

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 216 220
				var4 = (WorldMapData_1)var3.next(); // L: 217
				var4.loadGeography(var1); // L: 219
			}

			if (var2) { // L: 223
				var3 = this.worldMapData1List.iterator(); // L: 224

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 225
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 227
				}
			}

			return var2; // L: 231
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILaf;[Lls;Lic;Lic;B)V",
		garbageValue = "-79"
	)
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 236
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 237
			int var7 = this.regionX; // L: 241
			int var8 = this.regionY; // L: 242
			Sprite var6 = (Sprite)WorldMapRegion_cachedSprites.get(MenuAction.method2139(var7, var8, var1)); // L: 244
			if (var6 == null) { // L: 246
				boolean var9 = true; // L: 249
				var9 &= this.loadGeography(var4); // L: 250
				int var11;
				if (this.worldMapData_0 != null) { // L: 253
					var11 = this.worldMapData_0.groupId; // L: 254
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 257
				}

				var9 &= var5.tryLoadGroup(var11); // L: 259
				if (var9) { // L: 260
					byte[] var10 = var5.takeFileFlat(var11); // L: 261
					WorldMapSprite var12 = class39.method613(var10); // L: 262
					Sprite var13 = new Sprite(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 263
					var13.setRaster(); // L: 264
					if (this.worldMapData_0 != null) { // L: 265
						this.method553(var2, var3, var12); // L: 266
					} else {
						this.method502(var2, var3, var12); // L: 269
					}

					AbstractWorldMapData.method353(var13, this.regionX, this.regionY, this.pixelsPerTile); // L: 271
					this.method507(); // L: 272
				}
			}
		}
	} // L: 238 247 273

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "1940218585"
	)
	void method569(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 276
			var4 = new HashSet(); // L: 277
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 279
		this.drawMapLinks(var1, var2, var4, var3); // L: 280
	} // L: 281

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "2015143479"
	)
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 284

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 285
			if (var5.hasValidElement()) { // L: 287
				int var6 = var5.getElement(); // L: 288
				if (var1.contains(var6)) { // L: 289
					WorldMapElement var7 = WorldMapSection0.WorldMapElement_get(var6); // L: 290
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 291
				}
			}
		}

		this.method521(var1, var2, var3); // L: 295
	} // L: 296

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Laf;[Lls;Lat;I)V",
		garbageValue = "-1361448318"
	)
	void method553(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 299
			for (var5 = 0; var5 < 64; ++var5) { // L: 300
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 301
				this.method499(var4, var5, this.worldMapData_0, var1); // L: 302
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 305
			for (var5 = 0; var5 < 64; ++var5) { // L: 306
				this.method545(var4, var5, this.worldMapData_0, var1, var2); // L: 307
			}
		}

	} // L: 310

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Laf;[Lls;Lat;B)V",
		garbageValue = "-121"
	)
	void method502(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 313

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 314

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 316
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 317
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 318
					this.method499(var6, var7, var5, var1); // L: 319
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 324

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 325

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 327
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 328
					this.method545(var6, var7, var5, var1, var2); // L: 329
				}
			}
		}

	} // L: 334

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILan;Laf;[Lls;I)V",
		garbageValue = "553934135"
	)
	void method545(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method519(var1, var2, var3); // L: 337
		this.method533(var1, var2, var3, var5); // L: 338
	} // L: 339

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILan;Laf;Lat;I)V",
		garbageValue = "-1873495133"
	)
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 342
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 343
		if (var6 == -1 && var7 == -1) { // L: 344
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 345
		}

		int var8 = 16711935; // L: 347
		int var9;
		if (var7 != -1) { // L: 348
			int var10 = this.backgroundColor; // L: 350
			FloorOverlayDefinition var11 = SoundSystem.method2594(var7); // L: 352
			if (var11 == null) { // L: 353
				var9 = var10; // L: 354
			} else if (var11.secondaryRgb >= 0) { // L: 357
				var9 = var11.secondaryRgb | -16777216; // L: 358
			} else if (var11.texture >= 0) { // L: 360
				int var12 = GrandExchangeOfferTotalQuantityComparator.method172(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 361
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 362
			} else if (var11.primaryRgb == 16711935) { // L: 364
				var9 = var10; // L: 365
			} else {
				int var13 = var11.hue; // L: 369
				int var14 = var11.saturation; // L: 370
				int var15 = var11.lightness; // L: 371
				if (var15 > 179) { // L: 373
					var14 /= 2;
				}

				if (var15 > 192) { // L: 374
					var14 /= 2;
				}

				if (var15 > 217) { // L: 375
					var14 /= 2;
				}

				if (var15 > 243) { // L: 376
					var14 /= 2;
				}

				int var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10); // L: 377
				int var17 = GrandExchangeOfferTotalQuantityComparator.method172(var16, 96); // L: 381
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 382
			}

			var8 = var9; // L: 385
		}

		if (var7 > -1 && var3.field198[0][var1][var2] == 0) { // L: 387
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 388
		} else {
			var9 = this.method517(var1, var2, var3, var5); // L: 391
			if (var7 == -1) { // L: 392
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 393
			} else {
				var4.method802(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field198[0][var1][var2], var3.field191[0][var1][var2]); // L: 396
			}
		}
	} // L: 389 394 397

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILan;Laf;I)V",
		garbageValue = "-100065860"
	)
	void method499(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 400
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 401
			if (var6 > -1) { // L: 402
				int var8 = this.backgroundColor; // L: 404
				FloorOverlayDefinition var9 = SoundSystem.method2594(var6); // L: 406
				int var7;
				if (var9 == null) { // L: 407
					var7 = var8; // L: 408
				} else if (var9.secondaryRgb >= 0) { // L: 411
					var7 = var9.secondaryRgb | -16777216; // L: 412
				} else if (var9.texture >= 0) { // L: 414
					int var10 = GrandExchangeOfferTotalQuantityComparator.method172(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 415
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 416
				} else if (var9.primaryRgb == 16711935) { // L: 418
					var7 = var8; // L: 419
				} else {
					int var11 = var9.hue; // L: 423
					int var12 = var9.saturation; // L: 424
					int var13 = var9.lightness; // L: 425
					if (var13 > 179) { // L: 427
						var12 /= 2;
					}

					if (var13 > 192) { // L: 428
						var12 /= 2;
					}

					if (var13 > 217) { // L: 429
						var12 /= 2;
					}

					if (var13 > 243) { // L: 430
						var12 /= 2;
					}

					int var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10); // L: 431
					int var15 = GrandExchangeOfferTotalQuantityComparator.method172(var14, 96); // L: 435
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 436
				}

				if (var3.field198[var5][var1][var2] == 0) { // L: 440
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 441
				} else {
					var4.method802(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field198[var5][var1][var2], var3.field191[var5][var1][var2]); // L: 444
				}
			}
		}

	} // L: 448

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILan;Lat;I)I",
		garbageValue = "1234221167"
	)
	int method517(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 451 452 454
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILan;[Lls;B)V",
		garbageValue = "-109"
	)
	void method533(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 458
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 459
			if (var6 != null && var6.length != 0) { // L: 460
				WorldMapDecoration[] var7 = var6; // L: 464

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 465
					WorldMapDecoration var9 = var7[var8]; // L: 466
					int var11 = var9.decoration; // L: 469
					boolean var10 = var11 >= WorldMapDecorationType.field2777.id && var11 <= WorldMapDecorationType.field2778.id; // L: 471
					if (!var10) { // L: 474
						int var13 = var9.decoration; // L: 476
						boolean var12 = var13 == WorldMapDecorationType.field2779.id; // L: 478
						if (!var12) { // L: 480
							continue;
						}
					}

					ObjectDefinition var14 = MidiPcmStream.getObjectDefinition(var9.objectDefinitionId); // L: 482
					if (var14.mapSceneId != -1) { // L: 483
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 484
							var4[var14.mapSceneId].method6217(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 488
						} else {
							var4[var14.mapSceneId].method6217(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 485
						}
					}
				}
			}
		}

	} // L: 496

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILan;B)V",
		garbageValue = "-118"
	)
	void method519(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 499
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 500
			if (var5 != null && var5.length != 0) { // L: 501
				WorldMapDecoration[] var6 = var5; // L: 505

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 506
					WorldMapDecoration var8 = var6[var7]; // L: 507
					if (TextureProvider.method2876(var8.decoration)) { // L: 509
						ObjectDefinition var9 = MidiPcmStream.getObjectDefinition(var8.objectDefinitionId); // L: 510
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 511
						if (var8.decoration == WorldMapDecorationType.field2760.id) { // L: 512
							this.method585(var1, var2, var8.rotation, var10); // L: 513
						}

						if (var8.decoration == WorldMapDecorationType.field2763.id) { // L: 515
							this.method585(var1, var2, var8.rotation, -3355444); // L: 516
							this.method585(var1, var2, var8.rotation + 1, var10); // L: 517
						}

						if (var8.decoration == WorldMapDecorationType.field2757.id) { // L: 519
							if (var8.rotation == 0) { // L: 520
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 521
							}

							if (var8.rotation == 2) { // L: 522
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 523
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2761.id) { // L: 525
							int var11 = var8.rotation % 2; // L: 526
							int var12;
							if (var11 == 0) { // L: 527
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 528
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 529
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 533
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 534
								}
							}
						}
					}
				}
			}
		}

	} // L: 543

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-473063416"
	)
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 546
		float var6 = var5 / 2.0F; // L: 547
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 548

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 549
			Coord var9 = (Coord)var8.getKey(); // L: 551
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 552
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 553
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 554
			if (var12 != null && var12.hasValidElement()) { // L: 555
				var12.screenX = var10; // L: 556
				var12.screenY = var11; // L: 557
				WorldMapElement var13 = WorldMapSection0.WorldMapElement_get(var12.getElement()); // L: 558
				if (!var3.contains(var13.getObjectId())) { // L: 559
					this.method523(var12, var10, var11, var5); // L: 560
				}
			}
		}

	} // L: 565

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1020675379"
	)
	void method521(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 568

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 569
			if (var5.hasValidElement()) { // L: 571
				WorldMapElement var6 = WorldMapSection0.WorldMapElement_get(var5.getElement()); // L: 572
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 573
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 574
				}
			}
		}

	} // L: 578

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIII)V",
		garbageValue = "-1177603152"
	)
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		Sprite var6 = var1.getSpriteBool(false); // L: 581
		if (var6 != null) { // L: 582
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 585
			if (var4 % var5 < var5 / 2) { // L: 586
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 587
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 588
			}

		}
	} // L: 583 590

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Laz;IIFI)V",
		garbageValue = "-1943029754"
	)
	void method523(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = WorldMapSection0.WorldMapElement_get(var1.getElement()); // L: 593
		this.method524(var5, var2, var3); // L: 594
		this.method567(var1, var5, var2, var3, var4); // L: 595
	} // L: 596

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "1650240142"
	)
	void method524(WorldMapElement var1, int var2, int var3) {
		Sprite var4 = var1.getSpriteBool(false); // L: 599
		if (var4 != null) { // L: 600
			int var5 = this.method527(var4, var1.horizontalAlignment); // L: 601
			int var6 = this.method528(var4, var1.verticalAlignment); // L: 602
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 603
		}

	} // L: 605

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Laz;Liv;IIFB)V",
		garbageValue = "-60"
	)
	void method567(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 608
		if (var6 != null) { // L: 609
			if (var6.size.method274(var5)) { // L: 612
				Font var7 = (Font)this.fonts.get(var6.size); // L: 615
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3243, 0, 1, 0, var7.ascent / 2); // L: 616
			}
		}
	} // L: 610 613 617

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1868522380"
	)
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 620
		Iterator var6 = this.icon0List.iterator(); // L: 621

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 622
			if (var7.hasValidElement()) { // L: 624
				int var8 = var7.coord2.x % 64; // L: 625
				int var9 = var7.coord2.y % 64; // L: 626
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 627
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 628
				if (!var3.contains(var7.getElement())) { // L: 629
					this.method523(var7, var7.screenX, var7.screenY, var5); // L: 632
				}
			}
		}

	} // L: 635

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llp;Lju;I)I",
		garbageValue = "-249160527"
	)
	int method527(Sprite var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 638
		case 0:
			return -var1.subWidth / 2; // L: 649
		case 1:
			return 0; // L: 641
		default:
			return -var1.subWidth; // L: 645
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llp;Lit;I)I",
		garbageValue = "-74495504"
	)
	int method528(Sprite var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 655
		case 0:
			return -var1.subHeight / 2; // L: 658
		case 1:
			return 0; // L: 662
		default:
			return -var1.subHeight; // L: 666
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Laq;",
		garbageValue = "-576832449"
	)
	WorldMapLabel method529(int var1) {
		WorldMapElement var2 = WorldMapSection0.WorldMapElement_get(var1); // L: 672
		return this.createMapLabel(var2); // L: 673
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Laq;",
		garbageValue = "-1919467673"
	)
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 677
			WorldMapLabelSize var2 = WorldMapLabelSize.method270(var1.textSize); // L: 680
			if (var2 == null) { // L: 681
				return null; // L: 682
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 684
				if (var3 == null) { // L: 685
					return null; // L: 686
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 688
					String[] var5 = new String[var4]; // L: 689
					var3.breakLines(var1.name, (int[])null, var5); // L: 690
					int var6 = var5.length * var3.ascent / 2; // L: 691
					int var7 = 0; // L: 692
					String[] var8 = var5; // L: 694

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 695
						String var10 = var8[var9]; // L: 696
						int var11 = var3.stringWidth(var10); // L: 698
						if (var11 > var7) { // L: 699
							var7 = var11; // L: 700
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 705
				}
			}
		} else {
			return null; // L: 678
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-2065951782"
	)
	List method531(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 709
		if (var4 >= var1 && var5 >= var2) { // L: 710
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 711
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 712
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 713
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 715
						var6.add(var8); // L: 716
					}
				}

				var7 = this.icon0List.iterator(); // L: 720

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 721
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 723
						var6.add(var8); // L: 724
					}
				}

				return var6; // L: 728
			} else {
				return var6; // L: 719
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-715702618"
	)
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 732
		var1.addAll(this.icon0List); // L: 733
		var1.addAll(this.iconMap.values()); // L: 734
		return var1; // L: 735
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-301130878"
	)
	void method585(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 739
		if (var3 == 0) { // L: 740
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 741
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 742
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 743
		}

	} // L: 744

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljm;",
		garbageValue = "-91"
	)
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 37
			var1 = new SequenceDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIB)Lls;",
		garbageValue = "20"
	)
	static IndexedSprite method611(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			Occluder.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		return !var3 ? null : InvDefinition.method4448(); // L: 48 49
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "783564244"
	)
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = AbstractByteArrayCopier.World_worlds[var6]; // L: 180
			AbstractByteArrayCopier.World_worlds[var6] = AbstractByteArrayCopier.World_worlds[var1]; // L: 181
			AbstractByteArrayCopier.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (ModelData0.method3376(AbstractByteArrayCopier.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = AbstractByteArrayCopier.World_worlds[var9]; // L: 185
					AbstractByteArrayCopier.World_worlds[var9] = AbstractByteArrayCopier.World_worlds[var7]; // L: 186
					AbstractByteArrayCopier.World_worlds[var7++] = var10; // L: 187
				}
			}

			AbstractByteArrayCopier.World_worlds[var1] = AbstractByteArrayCopier.World_worlds[var7]; // L: 191
			AbstractByteArrayCopier.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1201601061"
	)
	static final void method609(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 119
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		WorldMapRectangle.addGameMessage(30, "", var1); // L: 121
	} // L: 123
}
