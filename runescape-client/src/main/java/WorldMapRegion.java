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

@ObfuscatedName("hd")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -832880865
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1022747117
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 295918545
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("r")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2124547861
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1151544367
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("c")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("w")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("b")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 51
		this.regionY = var2; // L: 52
		this.worldMapData1List = new LinkedList(); // L: 53
		this.icon0List = new LinkedList(); // L: 54
		this.iconMap = new HashMap(); // L: 55
		this.backgroundColor = var3 | -16777216; // L: 56
		this.fonts = var4; // L: 57
	} // L: 58

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1328537818"
	)
	void method4516(int var1, int var2, int var3) {
		SpritePixels var4 = SoundSystem.method774(this.regionX, this.regionY, this.pixelsPerTile); // L: 61
		if (var4 != null) { // L: 62
			if (var3 == this.pixelsPerTile * 64) { // L: 63
				var4.drawAt(var1, var2); // L: 64
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Ljava/util/List;I)V",
		garbageValue = "-544065510"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 72
		this.worldMapData_0 = var1; // L: 73
		this.addAllToIconList(var2); // L: 74
	} // L: 75

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "1544276205"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 78
		Iterator var3 = var1.iterator(); // L: 79

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 80
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 82
				this.worldMapData1List.add(var4); // L: 83
			}
		}

		this.addAllToIconList(var2); // L: 87
	} // L: 88

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIILib;I)V",
		garbageValue = "1261476375"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 91
			label74:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 92
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 93
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 94
					if (var9 != null && var9.length != 0) { // L: 95
						WorldMapDecoration[] var10 = var9; // L: 99

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 100
							ObjectComposition var13;
							boolean var14;
							label65: {
								WorldMapDecoration var12 = var10[var11]; // L: 101
								var13 = class82.getObjectDefinition(var12.objectDefinitionId); // L: 103
								if (var13.transforms != null) { // L: 106
									int[] var15 = var13.transforms; // L: 108

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 109
										int var17 = var15[var16]; // L: 110
										ObjectComposition var18 = class82.getObjectDefinition(var17); // L: 112
										if (var18.mapIconId != -1) { // L: 113
											var14 = true; // L: 114
											break label65;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 121
									var14 = true; // L: 122
									break label65; // L: 123
								}

								var14 = false; // L: 125
							}

							if (var14) { // L: 127
								this.getIcon(var13, var8, var6, var7, var5); // L: 130
								continue label74; // L: 131
							}
						}
					}
				}
			}
		}

	} // L: 138

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lgy;IIILib;I)V",
		garbageValue = "-956469356"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 141
		Coord var7 = null; // L: 142
		if (this.worldMapData_0 != null) { // L: 143
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 144
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 147
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 148
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 151
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 152
		} else {
			var9 = class120.WorldMapElement_get(var1.mapIconId); // L: 155
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 156
		}

		var9 = class120.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 158
		if (var9.field1876) { // L: 159
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 160
		}

	} // L: 162

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 165

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 166
			if (var2 instanceof WorldMapIcon_1) { // L: 168
				((WorldMapIcon_1)var2).init(); // L: 169
			}
		}

	} // L: 173

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "-78"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 176

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 177
			if (class120.WorldMapElement_get(var3.element).field1876 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 179 182
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4545(var3.element)); // L: 183
				this.icon0List.add(var4); // L: 184
			}
		}

	} // L: 188

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method4523() {
		if (this.worldMapData_0 != null) { // L: 191
			this.worldMapData_0.reset(); // L: 192
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 195

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 196
				var2.reset(); // L: 198
			}
		}

	} // L: 202

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llp;S)Z",
		garbageValue = "11541"
	)
	@Export("loadGeography")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILii;[Lqd;Llp;Llp;S)V",
		garbageValue = "-10084"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 236
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 237
			if (SoundSystem.method774(this.regionX, this.regionY, var1) == null) { // L: 240
				boolean var6 = true; // L: 243
				var6 &= this.loadGeography(var4); // L: 244
				int var8;
				if (this.worldMapData_0 != null) { // L: 247
					var8 = this.worldMapData_0.groupId; // L: 248
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 251
				}

				var6 &= var5.tryLoadGroup(var8); // L: 253
				if (var6) { // L: 254
					byte[] var7 = var5.takeFileFlat(var8); // L: 255
					WorldMapSprite var9;
					if (var7 == null) { // L: 258
						var9 = new WorldMapSprite(); // L: 259
					} else {
						var9 = new WorldMapSprite(Frames.method4217(var7).pixels); // L: 262
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 265
					var11.setRaster(); // L: 266
					if (this.worldMapData_0 != null) { // L: 267
						this.method4528(var2, var3, var9); // L: 268
					} else {
						this.method4620(var2, var3, var9); // L: 271
					}

					int var12 = this.regionX; // L: 273
					int var13 = this.regionY; // L: 274
					int var14 = this.pixelsPerTile; // L: 275
					DemotingHashTable var15 = WorldMapRegion_cachedSprites; // L: 277
					long var17 = (long)(var14 << 16 | var12 << 8 | var13); // L: 281
					var15.put(var11, var17, var11.pixels.length * 4); // L: 283
					this.method4523(); // L: 285
				}
			}
		}
	} // L: 238 241 286

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "1592995873"
	)
	void method4526(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 289
			var4 = new HashSet(); // L: 290
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 292
		this.drawMapLinks(var1, var2, var4, var3); // L: 293
	} // L: 294

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-53"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 297

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 298
			if (var5.hasValidElement()) { // L: 300
				int var6 = var5.getElement(); // L: 301
				if (var1.contains(var6)) { // L: 302
					WorldMapElement var7 = class120.WorldMapElement_get(var6); // L: 303
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 304
				}
			}
		}

		this.method4537(var1, var2, var3); // L: 308
	} // L: 309

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lii;[Lqd;Lix;S)V",
		garbageValue = "8250"
	)
	void method4528(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 312
			for (var5 = 0; var5 < 64; ++var5) { // L: 313
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 314
				this.method4515(var4, var5, this.worldMapData_0, var1); // L: 315
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 318
			for (var5 = 0; var5 < 64; ++var5) { // L: 319
				this.method4530(var4, var5, this.worldMapData_0, var1, var2); // L: 320
			}
		}

	} // L: 323

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lii;[Lqd;Lix;I)V",
		garbageValue = "1922312294"
	)
	void method4620(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 326

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 327

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 329
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 330
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 331
					this.method4515(var6, var7, var5, var1); // L: 332
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 337

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 338

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 340
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 341
					this.method4530(var6, var7, var5, var1, var2); // L: 342
				}
			}
		}

	} // L: 347

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILib;Lii;[Lqd;I)V",
		garbageValue = "-893644673"
	)
	void method4530(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4535(var1, var2, var3); // L: 350
		this.method4534(var1, var2, var3, var5); // L: 351
	} // L: 352

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILib;Lii;Lix;I)V",
		garbageValue = "337766862"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 355
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 356
		if (var6 == -1 && var7 == -1) { // L: 357
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 358
		}

		int var8 = 16711935; // L: 360
		int var9;
		if (var7 != -1) { // L: 361
			int var10 = this.backgroundColor; // L: 363
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 367
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 368
				var11 = var12; // L: 369
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 372
				var12 = new FloorOverlayDefinition(); // L: 373
				if (var13 != null) { // L: 374
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 375
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 376
				var11 = var12; // L: 377
			}

			if (var11 == null) { // L: 380
				var9 = var10; // L: 381
			} else if (var11.secondaryRgb >= 0) { // L: 384
				var9 = var11.secondaryRgb | -16777216; // L: 385
			} else {
				int var15;
				if (var11.texture >= 0) { // L: 387
					var15 = class18.method243(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 388
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 389
				} else if (var11.primaryRgb == 16711935) { // L: 391
					var9 = var10; // L: 392
				} else {
					var15 = class345.method6156(var11.hue, var11.saturation, var11.lightness); // L: 395
					int var14 = class18.method243(var15, 96); // L: 396
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216; // L: 397
				}
			}

			var8 = var9; // L: 400
		}

		if (var7 > -1 && var3.field2845[0][var1][var2] == 0) { // L: 402
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 403
		} else {
			var9 = this.method4533(var1, var2, var3, var5); // L: 406
			if (var7 == -1) { // L: 407
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 408
			} else {
				var4.method4889(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2845[0][var1][var2], var3.field2847[0][var1][var2]); // L: 411
			}
		}
	} // L: 404 409 412

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILib;Lii;B)V",
		garbageValue = "121"
	)
	void method4515(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 415
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 416
			if (var6 > -1) { // L: 417
				int var8 = this.backgroundColor; // L: 419
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 423
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 424
					var9 = var10; // L: 425
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 428
					var10 = new FloorOverlayDefinition(); // L: 429
					if (var11 != null) { // L: 430
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 431
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 432
					var9 = var10; // L: 433
				}

				int var7;
				if (var9 == null) { // L: 436
					var7 = var8; // L: 437
				} else if (var9.secondaryRgb >= 0) { // L: 440
					var7 = var9.secondaryRgb | -16777216; // L: 441
				} else {
					int var13;
					if (var9.texture >= 0) { // L: 443
						var13 = class18.method243(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 444
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 445
					} else if (var9.primaryRgb == 16711935) { // L: 447
						var7 = var8; // L: 448
					} else {
						var13 = class345.method6156(var9.hue, var9.saturation, var9.lightness); // L: 451
						int var12 = class18.method243(var13, 96); // L: 452
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 453
					}
				}

				if (var3.field2845[var5][var1][var2] == 0) { // L: 457
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 458
				} else {
					var4.method4889(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2845[var5][var1][var2], var3.field2847[var5][var1][var2]); // L: 461
				}
			}
		}

	} // L: 465

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILib;Lix;B)I",
		garbageValue = "127"
	)
	int method4533(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 468 469 471
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILib;[Lqd;B)V",
		garbageValue = "20"
	)
	void method4534(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 475
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 476
			if (var6 != null && var6.length != 0) { // L: 477
				WorldMapDecoration[] var7 = var6; // L: 481

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 482
					WorldMapDecoration var9 = var7[var8]; // L: 483
					if (ChatChannel.method1968(var9.decoration) || GraphicsObject.method1868(var9.decoration)) { // L: 485
						ObjectComposition var10 = class82.getObjectDefinition(var9.objectDefinitionId); // L: 486
						if (var10.mapSceneId != -1) { // L: 487
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 488
								var4[var10.mapSceneId].method7927(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 492
							} else {
								var4[var10.mapSceneId].method7927(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 489
							}
						}
					}
				}
			}
		}

	} // L: 500

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILib;I)V",
		garbageValue = "1254694573"
	)
	void method4535(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 503
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 504
			if (var5 != null && var5.length != 0) { // L: 505
				WorldMapDecoration[] var6 = var5; // L: 509

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 510
					WorldMapDecoration var8 = var6[var7]; // L: 511
					if (PendingSpawn.method2164(var8.decoration)) { // L: 513
						ObjectComposition var9 = class82.getObjectDefinition(var8.objectDefinitionId); // L: 514
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 515
						if (var8.decoration == WorldMapDecorationType.field3571.id) { // L: 516
							this.method4571(var1, var2, var8.rotation, var10); // L: 517
						}

						if (var8.decoration == WorldMapDecorationType.field3558.id) { // L: 519
							this.method4571(var1, var2, var8.rotation, -3355444); // L: 520
							this.method4571(var1, var2, var8.rotation + 1, var10); // L: 521
						}

						if (var8.decoration == WorldMapDecorationType.field3559.id) { // L: 523
							if (var8.rotation == 0) { // L: 524
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 525
							}

							if (var8.rotation == 2) { // L: 526
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 527
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3560.id) { // L: 529
							int var11 = var8.rotation % 2; // L: 530
							int var12;
							if (var11 == 0) { // L: 531
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 532
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 533
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 537
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 538
								}
							}
						}
					}
				}
			}
		}

	} // L: 547

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IS)V",
		garbageValue = "153"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 550
		float var6 = var5 / 2.0F; // L: 551
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 552

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 553
			Coord var9 = (Coord)var8.getKey(); // L: 555
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 556
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 557
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 558
			if (var12 != null && var12.hasValidElement()) { // L: 559
				var12.screenX = var10; // L: 560
				var12.screenY = var11; // L: 561
				WorldMapElement var13 = class120.WorldMapElement_get(var12.getElement()); // L: 562
				if (!var3.contains(var13.getObjectId())) { // L: 563
					this.method4575(var12, var10, var11, var5); // L: 564
				}
			}
		}

	} // L: 569

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIS)V",
		garbageValue = "256"
	)
	void method4537(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 572

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 573
			if (var5.hasValidElement()) { // L: 575
				WorldMapElement var6 = class120.WorldMapElement_get(var5.getElement()); // L: 576
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 577
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 578
				}
			}
		}

	} // L: 582

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfx;IIIII)V",
		garbageValue = "-1051315032"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 585
		if (var6 != null) { // L: 586
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 589
			if (var4 % var5 < var5 / 2) { // L: 590
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 591
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 592
			}

		}
	} // L: 587 594

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Liw;IIFI)V",
		garbageValue = "1241063243"
	)
	void method4575(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class120.WorldMapElement_get(var1.getElement()); // L: 597
		this.method4540(var5, var2, var3); // L: 598
		this.method4541(var1, var5, var2, var3, var4); // L: 599
	} // L: 600

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfx;III)V",
		garbageValue = "2127201520"
	)
	void method4540(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 603
		if (var4 != null) { // L: 604
			int var5 = this.method4543(var4, var1.horizontalAlignment); // L: 605
			int var6 = this.method4619(var4, var1.verticalAlignment); // L: 606
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 607
		}

	} // L: 609

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Liw;Lfx;IIFI)V",
		garbageValue = "1327912976"
	)
	void method4541(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 612
		if (var6 != null) { // L: 613
			if (var6.size.method4409(var5)) { // L: 616
				Font var7 = (Font)this.fonts.get(var6.size); // L: 619
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1871, 0, 1, 0, var7.ascent / 2); // L: 620
			}
		}
	} // L: 614 617 621

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1591705047"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 624
		Iterator var6 = this.icon0List.iterator(); // L: 625

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 626
			if (var7.hasValidElement()) { // L: 628
				int var8 = var7.coord2.x % 64; // L: 629
				int var9 = var7.coord2.y % 64; // L: 630
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 631
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5); // L: 632
				if (!var3.contains(var7.getElement())) { // L: 633
					this.method4575(var7, var7.screenX, var7.screenY, var5); // L: 636
				}
			}
		}

	} // L: 639

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Lfj;I)I",
		garbageValue = "1784906213"
	)
	int method4543(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 642
		case 0:
			return -var1.subWidth / 2; // L: 645
		case 2:
			return 0; // L: 649
		default:
			return -var1.subWidth; // L: 653
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Lfk;B)I",
		garbageValue = "11"
	)
	int method4619(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 659
		case 0:
			return 0; // L: 662
		case 1:
			return -var1.subHeight / 2; // L: 666
		default:
			return -var1.subHeight; // L: 670
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lip;",
		garbageValue = "1955466429"
	)
	WorldMapLabel method4545(int var1) {
		WorldMapElement var2 = class120.WorldMapElement_get(var1); // L: 676
		return this.createMapLabel(var2); // L: 677
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)Lip;",
		garbageValue = "-43"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 681
			int var3 = var1.textSize; // L: 685
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small}; // L: 690
			WorldMapLabelSize[] var5 = var4; // L: 692
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 703
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 694
				if (var3 == var7.field2712) { // L: 696
					var2 = var7; // L: 697
					break;
				}

				++var6; // L: 693
			}

			if (var2 == null) { // L: 706
				return null; // L: 707
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 709
				if (var14 == null) { // L: 710
					return null; // L: 711
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 713
					String[] var15 = new String[var6]; // L: 714
					var14.breakLines(var1.name, (int[])null, var15); // L: 715
					int var8 = var15.length * var14.ascent / 2; // L: 716
					int var9 = 0; // L: 717
					String[] var10 = var15; // L: 719

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 720
						String var12 = var10[var11]; // L: 721
						int var13 = var14.stringWidth(var12); // L: 723
						if (var13 > var9) { // L: 724
							var9 = var13; // L: 725
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 730
				}
			}
		} else {
			return null; // L: 682
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "1348030891"
	)
	List method4547(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 734
		if (var4 >= var1 && var5 >= var2) { // L: 735
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 736
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 737
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 738
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 740
						var6.add(var8); // L: 741
					}
				}

				var7 = this.icon0List.iterator(); // L: 745

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 746
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 748
						var6.add(var8); // L: 749
					}
				}

				return var6; // L: 753
			} else {
				return var6; // L: 744
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "621020876"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 757
		var1.addAll(this.icon0List); // L: 758
		var1.addAll(this.iconMap.values()); // L: 759
		return var1; // L: 760
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1095602630"
	)
	void method4571(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 764
		if (var3 == 0) { // L: 765
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 766
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 767
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 768
		}

	} // L: 769

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Lle;",
		garbageValue = "-1474520480"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 2071
		if (JagexCache.JagexCache_dat2File != null) { // L: 2072
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class135.masterDisk, var0, var1, var2, var3); // L: 2073
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([Lki;IIIIIIIB)V",
		garbageValue = "72"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11210
			Widget var9 = var0[var8]; // L: 11211
			if (var9 != null && var9.parentId == var1 && (var9.method5448() || UrlRequester.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11212 11213 11214
				if (var9.isIf3) { // L: 11215
					if (class434.isComponentHidden(var9)) { // L: 11216
						continue;
					}
				} else if (var9.type == 0 && var9 != class144.mousedOverWidgetIf1 && class434.isComponentHidden(var9)) { // L: 11219
					continue;
				}

				if (var9.type == 11 && var9.method5517(UserComparator7.urlRequester)) { // L: 11221 11222
					if (var9.method5498()) { // L: 11223
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var9); // L: 11224
						UserComparator8.revalidateWidgetScroll(var9.children, var9, true); // L: 11225
					}

					if (var9.field3460 != null) { // L: 11227
						ScriptEvent var10 = new ScriptEvent(); // L: 11228
						var10.widget = var9; // L: 11229
						var10.args = var9.field3460; // L: 11230
						Client.scriptEvents.addFirst(var10); // L: 11231
					}
				}

				int var26 = var9.x + var6; // L: 11235
				int var11 = var7 + var9.y; // L: 11236
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 11241
					var12 = var2; // L: 11242
					var13 = var3; // L: 11243
					var14 = var4; // L: 11244
					var15 = var5; // L: 11245
				} else {
					int var16;
					if (var9.type == 9) { // L: 11247
						var16 = var26; // L: 11248
						var17 = var11; // L: 11249
						var18 = var26 + var9.width; // L: 11250
						int var19 = var11 + var9.height; // L: 11251
						if (var18 < var26) { // L: 11252
							var16 = var18; // L: 11254
							var18 = var26; // L: 11255
						}

						if (var19 < var11) { // L: 11257
							var17 = var19; // L: 11259
							var19 = var11; // L: 11260
						}

						++var18; // L: 11262
						++var19; // L: 11263
						var12 = var16 > var2 ? var16 : var2; // L: 11264
						var13 = var17 > var3 ? var17 : var3; // L: 11265
						var14 = var18 < var4 ? var18 : var4; // L: 11266
						var15 = var19 < var5 ? var19 : var5; // L: 11267
					} else {
						var16 = var26 + var9.width; // L: 11270
						var17 = var11 + var9.height; // L: 11271
						var12 = var26 > var2 ? var26 : var2; // L: 11272
						var13 = var11 > var3 ? var11 : var3; // L: 11273
						var14 = var16 < var4 ? var16 : var4; // L: 11274
						var15 = var17 < var5 ? var17 : var5; // L: 11275
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11277
					Client.field675 = true; // L: 11278
					Client.field653 = var26; // L: 11279
					Client.field612 = var11; // L: 11280
				}

				boolean var34 = false; // L: 11282
				if (var9.field3473) { // L: 11283
					switch(Client.field487) { // L: 11284
					case 0:
						var34 = true; // L: 11296
					case 1:
					default:
						break;
					case 2:
						if (Client.field657 == var9.id >>> 16) { // L: 11286
							var34 = true; // L: 11287
						}
						break;
					case 3:
						if (var9.id == Client.field657) { // L: 11291
							var34 = true; // L: 11292
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11300
					if (var9.isIf3) { // L: 11301
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11302
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11303
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11304
									if (var27.isMouseInputEvent) { // L: 11305
										var27.remove(); // L: 11306
										var27.widget.containsMouse = false; // L: 11307
									}
								}

								if (SoundSystem.widgetDragDuration == 0) { // L: 11310
									Client.clickedWidget = null; // L: 11311
									Client.clickedWidgetParent = null; // L: 11312
								}

								if (!Client.isMenuOpen) { // L: 11314
									class20.addCancelMenuEntry(); // L: 11315
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11319 11320
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11321
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 11322
									var27.remove(); // L: 11323
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11329
					var18 = MouseHandler.MouseHandler_y; // L: 11330
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11331
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11332
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11333
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11335
					if (var9.contentType == 1337) { // L: 11336
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 11337
							WorldMapEvent.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11340
						class129.checkIfMinimapClicked(var9, var26, var11); // L: 11341
					} else {
						if (var9.contentType == 1400) { // L: 11344
							ServerPacket.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11345
						}

						if (!Client.isMenuOpen && var35) { // L: 11347
							if (var9.contentType == 1400) { // L: 11348
								ServerPacket.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11349
							} else {
								class160.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 11352
							}
						}

						boolean var21;
						int var29;
						if (var34) { // L: 11355
							for (int var20 = 0; var20 < var9.field3474.length; ++var20) { // L: 11356
								var21 = false; // L: 11357
								boolean var28 = false; // L: 11358
								if (!var21 && var9.field3474[var20] != null) { // L: 11359
									for (var29 = 0; var29 < var9.field3474[var20].length; ++var29) { // L: 11360
										boolean var24 = false; // L: 11361
										if (var9.field3527 != null) { // L: 11362
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3474[var20][var29]]; // L: 11363
										}

										if (class145.method2991(var9.field3474[var20][var29]) || var24) { // L: 11365
											var21 = true; // L: 11366
											if (var9.field3527 != null && var9.field3527[var20] > Client.cycle) { // L: 11367
												break;
											}

											byte var33 = var9.field3419[var20][var29]; // L: 11368
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 11369 11370 11371 11372 11373
												var28 = true; // L: 11375
												break; // L: 11376
											}
										}
									}
								}

								if (var28) { // L: 11381
									if (var20 < 10) { // L: 11382
										TaskHandler.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11383
										MusicPatchNode2.Widget_runOnTargetLeave(); // L: 11384
										class93.selectSpell(var9.id, var9.childIndex, WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var9)), var9.itemId); // L: 11385
										Client.selectedSpellActionName = TriBool.Widget_getSpellActionName(var9); // L: 11386
										if (Client.selectedSpellActionName == null) { // L: 11387
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class166.colorStartTag(16777215); // L: 11388
									}

									var29 = var9.field3476[var20]; // L: 11390
									if (var9.field3527 == null) { // L: 11391
										var9.field3527 = new int[var9.field3474.length];
									}

									if (var9.field3481 == null) { // L: 11392
										var9.field3481 = new int[var9.field3474.length];
									}

									if (var29 != 0) { // L: 11393
										if (var9.field3527[var20] == 0) { // L: 11394
											var9.field3527[var20] = var29 + Client.cycle + var9.field3481[var20];
										} else {
											var9.field3527[var20] = var29 + Client.cycle; // L: 11395
										}
									} else {
										var9.field3527[var20] = Integer.MAX_VALUE; // L: 11397
									}
								}

								if (!var21 && var9.field3527 != null) { // L: 11399 11400
									var9.field3527[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11404
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11405
								var35 = true;
							} else {
								var35 = false; // L: 11406
							}

							boolean var36 = false; // L: 11407
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11408
								var36 = true;
							}

							var21 = false; // L: 11409
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11410
								var21 = true;
							}

							int[] var22;
							if (var21) { // L: 11411
								class10.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11412
								if (var9.type == 11 && var9.method5474(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) { // L: 11413
									switch(var9.method5457()) { // L: 11414
									case 0:
										ScriptEvent.openURL(var9.method5480(), true, false); // L: 11416
										break;
									case 1:
										if (class152.method3039(UrlRequester.getWidgetFlags(var9))) { // L: 11419
											var22 = var9.method5460(); // L: 11420
											if (var22 != null) { // L: 11421
												PacketBufferNode var23 = WallDecoration.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 11422
												var23.packetBuffer.writeInt(var22[2]); // L: 11423
												var23.packetBuffer.writeIntME(var9.id); // L: 11424
												var23.packetBuffer.method7550(var9.childIndex); // L: 11425
												var23.packetBuffer.writeIntME(var22[1]); // L: 11426
												var23.packetBuffer.writeIntME(var22[0]); // L: 11427
												var23.packetBuffer.writeInt(var9.method5458()); // L: 11428
												Client.packetWriter.addNode(var23); // L: 11429
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) { // L: 11436
								ServerPacket.worldMap.method7025(var17, var18, var35 & var36, var35 & var21); // L: 11437
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class229.method4727(UrlRequester.getWidgetFlags(var9))) { // L: 11439
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11440
								Client.field574 = true; // L: 11441
								Client.field747 = var26; // L: 11442
								Client.field674 = var11; // L: 11443
							}

							if (var9.hasListener) { // L: 11445
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11446
									var37 = new ScriptEvent(); // L: 11447
									var37.isMouseInputEvent = true; // L: 11448
									var37.widget = var9; // L: 11449
									var37.mouseY = Client.mouseWheelRotation; // L: 11450
									var37.args = var9.onScroll; // L: 11451
									Client.scriptEvents.addFirst(var37); // L: 11452
								}

								if (Client.clickedWidget != null || Canvas.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11454
									var21 = false; // L: 11455
									var36 = false; // L: 11456
									var35 = false; // L: 11457
								}

								if (!var9.isClicked && var21) { // L: 11459
									var9.isClicked = true; // L: 11460
									if (var9.onClick != null) { // L: 11461
										var37 = new ScriptEvent(); // L: 11462
										var37.isMouseInputEvent = true; // L: 11463
										var37.widget = var9; // L: 11464
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11465
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11466
										var37.args = var9.onClick; // L: 11467
										Client.scriptEvents.addFirst(var37); // L: 11468
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) { // L: 11471 11472
									var37 = new ScriptEvent(); // L: 11473
									var37.isMouseInputEvent = true; // L: 11474
									var37.widget = var9; // L: 11475
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11476
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11477
									var37.args = var9.onClickRepeat; // L: 11478
									Client.scriptEvents.addFirst(var37); // L: 11479
								}

								if (var9.isClicked && !var36) { // L: 11482
									var9.isClicked = false; // L: 11483
									if (var9.onRelease != null) { // L: 11484
										var37 = new ScriptEvent(); // L: 11485
										var37.isMouseInputEvent = true; // L: 11486
										var37.widget = var9; // L: 11487
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11488
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11489
										var37.args = var9.onRelease; // L: 11490
										Client.field701.addFirst(var37); // L: 11491
									}
								}

								if (var36 && var9.onHold != null) { // L: 11494 11495
									var37 = new ScriptEvent(); // L: 11496
									var37.isMouseInputEvent = true; // L: 11497
									var37.widget = var9; // L: 11498
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11499
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11500
									var37.args = var9.onHold; // L: 11501
									Client.scriptEvents.addFirst(var37); // L: 11502
								}

								if (!var9.containsMouse && var35) { // L: 11505
									var9.containsMouse = true; // L: 11506
									if (var9.onMouseOver != null) { // L: 11507
										var37 = new ScriptEvent(); // L: 11508
										var37.isMouseInputEvent = true; // L: 11509
										var37.widget = var9; // L: 11510
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11511
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11512
										var37.args = var9.onMouseOver; // L: 11513
										Client.scriptEvents.addFirst(var37); // L: 11514
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11517 11518
									var37 = new ScriptEvent(); // L: 11519
									var37.isMouseInputEvent = true; // L: 11520
									var37.widget = var9; // L: 11521
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11522
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11523
									var37.args = var9.onMouseRepeat; // L: 11524
									Client.scriptEvents.addFirst(var37); // L: 11525
								}

								if (var9.containsMouse && !var35) { // L: 11528
									var9.containsMouse = false; // L: 11529
									if (var9.onMouseLeave != null) { // L: 11530
										var37 = new ScriptEvent(); // L: 11531
										var37.isMouseInputEvent = true; // L: 11532
										var37.widget = var9; // L: 11533
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11534
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11535
										var37.args = var9.onMouseLeave; // L: 11536
										Client.field701.addFirst(var37); // L: 11537
									}
								}

								if (var9.onTimer != null) { // L: 11540
									var37 = new ScriptEvent(); // L: 11541
									var37.widget = var9; // L: 11542
									var37.args = var9.onTimer; // L: 11543
									Client.field698.addFirst(var37); // L: 11544
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3538) { // L: 11546
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3538 <= 32) { // L: 11547
										label825:
										for (var40 = var9.field3538; var40 < Client.changedVarpCount; ++var40) { // L: 11554
											var29 = Client.changedVarps[var40 & 31]; // L: 11555

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) { // L: 11556
												if (var29 == var9.varTransmitTriggers[var39]) { // L: 11557
													var25 = new ScriptEvent(); // L: 11558
													var25.widget = var9; // L: 11559
													var25.args = var9.onVarTransmit; // L: 11560
													Client.scriptEvents.addFirst(var25); // L: 11561
													break label825; // L: 11562
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11548
										var37.widget = var9; // L: 11549
										var37.args = var9.onVarTransmit; // L: 11550
										Client.scriptEvents.addFirst(var37); // L: 11551
									}

									var9.field3538 = Client.changedVarpCount; // L: 11567
								}

								if (var9.onInvTransmit != null && Client.field683 > var9.field3539) { // L: 11569
									if (var9.invTransmitTriggers != null && Client.field683 - var9.field3539 <= 32) { // L: 11570
										label801:
										for (var40 = var9.field3539; var40 < Client.field683; ++var40) { // L: 11577
											var29 = Client.changedItemContainers[var40 & 31]; // L: 11578

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) { // L: 11579
												if (var29 == var9.invTransmitTriggers[var39]) { // L: 11580
													var25 = new ScriptEvent(); // L: 11581
													var25.widget = var9; // L: 11582
													var25.args = var9.onInvTransmit; // L: 11583
													Client.scriptEvents.addFirst(var25); // L: 11584
													break label801; // L: 11585
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11571
										var37.widget = var9; // L: 11572
										var37.args = var9.onInvTransmit; // L: 11573
										Client.scriptEvents.addFirst(var37); // L: 11574
									}

									var9.field3539 = Client.field683; // L: 11590
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3540) { // L: 11592
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3540 <= 32) { // L: 11593
										label777:
										for (var40 = var9.field3540; var40 < Client.changedSkillsCount; ++var40) { // L: 11600
											var29 = Client.changedSkills[var40 & 31]; // L: 11601

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) { // L: 11602
												if (var29 == var9.statTransmitTriggers[var39]) { // L: 11603
													var25 = new ScriptEvent(); // L: 11604
													var25.widget = var9; // L: 11605
													var25.args = var9.onStatTransmit; // L: 11606
													Client.scriptEvents.addFirst(var25); // L: 11607
													break label777; // L: 11608
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11594
										var37.widget = var9; // L: 11595
										var37.args = var9.onStatTransmit; // L: 11596
										Client.scriptEvents.addFirst(var37); // L: 11597
									}

									var9.field3540 = Client.changedSkillsCount; // L: 11613
								}

								if (Client.chatCycle > var9.field3524 && var9.onChatTransmit != null) { // L: 11615
									var37 = new ScriptEvent(); // L: 11616
									var37.widget = var9; // L: 11617
									var37.args = var9.onChatTransmit; // L: 11618
									Client.scriptEvents.addFirst(var37); // L: 11619
								}

								if (Client.field689 > var9.field3524 && var9.onFriendTransmit != null) { // L: 11621
									var37 = new ScriptEvent(); // L: 11622
									var37.widget = var9; // L: 11623
									var37.args = var9.onFriendTransmit; // L: 11624
									Client.scriptEvents.addFirst(var37); // L: 11625
								}

								if (Client.field690 > var9.field3524 && var9.onClanTransmit != null) { // L: 11627
									var37 = new ScriptEvent(); // L: 11628
									var37.widget = var9; // L: 11629
									var37.args = var9.onClanTransmit; // L: 11630
									Client.scriptEvents.addFirst(var37); // L: 11631
								}

								if (Client.field691 > var9.field3524 && var9.field3513 != null) { // L: 11633
									var37 = new ScriptEvent(); // L: 11634
									var37.widget = var9; // L: 11635
									var37.args = var9.field3513; // L: 11636
									Client.scriptEvents.addFirst(var37); // L: 11637
								}

								if (Client.field692 > var9.field3524 && var9.field3456 != null) { // L: 11639
									var37 = new ScriptEvent(); // L: 11640
									var37.widget = var9; // L: 11641
									var37.args = var9.field3456; // L: 11642
									Client.scriptEvents.addFirst(var37); // L: 11643
								}

								if (Client.field762 > var9.field3524 && var9.onStockTransmit != null) { // L: 11645
									var37 = new ScriptEvent(); // L: 11646
									var37.widget = var9; // L: 11647
									var37.args = var9.onStockTransmit; // L: 11648
									Client.scriptEvents.addFirst(var37); // L: 11649
								}

								if (Client.field512 > var9.field3524 && var9.field3520 != null) { // L: 11651
									var37 = new ScriptEvent(); // L: 11652
									var37.widget = var9; // L: 11653
									var37.args = var9.field3520; // L: 11654
									Client.scriptEvents.addFirst(var37); // L: 11655
								}

								if (Client.field695 > var9.field3524 && var9.onMiscTransmit != null) { // L: 11657
									var37 = new ScriptEvent(); // L: 11658
									var37.widget = var9; // L: 11659
									var37.args = var9.onMiscTransmit; // L: 11660
									Client.scriptEvents.addFirst(var37); // L: 11661
								}

								var9.field3524 = Client.cycleCntr; // L: 11663
								if (var9.onKey != null) { // L: 11664
									for (var40 = 0; var40 < Client.field719; ++var40) { // L: 11665
										ScriptEvent var38 = new ScriptEvent(); // L: 11666
										var38.widget = var9; // L: 11667
										var38.keyTyped = Client.field721[var40]; // L: 11668
										var38.keyPressed = Client.field720[var40]; // L: 11669
										var38.args = var9.onKey; // L: 11670
										Client.scriptEvents.addFirst(var38); // L: 11671
									}
								}

								ScriptEvent var32;
								if (var9.field3443 != null) { // L: 11674
									var22 = InterfaceParent.method2071(); // L: 11675

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11676
										var32 = new ScriptEvent(); // L: 11677
										var32.widget = var9; // L: 11678
										var32.keyTyped = var22[var29]; // L: 11679
										var32.args = var9.field3443; // L: 11680
										Client.scriptEvents.addFirst(var32); // L: 11681
									}
								}

								if (var9.field3510 != null) { // L: 11684
									var22 = ServerPacket.method5020(); // L: 11685

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11686
										var32 = new ScriptEvent(); // L: 11687
										var32.widget = var9; // L: 11688
										var32.keyTyped = var22[var29]; // L: 11689
										var32.args = var9.field3510; // L: 11690
										Client.scriptEvents.addFirst(var32); // L: 11691
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11696
							if (Client.clickedWidget != null || Canvas.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11697
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11698
								if (var9.mouseOverRedirect >= 0) { // L: 11699
									class144.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class144.mousedOverWidgetIf1 = var9; // L: 11700
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11702
								class113.field1422 = var9; // L: 11703
							}

							if (var9.scrollHeight > var9.height) { // L: 11705
								FileSystem.method3168(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11707
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11708
							if (var9.children != null) { // L: 11709
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11710
							if (var30 != null) { // L: 11711
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11712
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11713
										if (var31.isMouseInputEvent) { // L: 11714
											var31.remove(); // L: 11715
											var31.widget.containsMouse = false; // L: 11716
										}
									}

									if (SoundSystem.widgetDragDuration == 0) { // L: 11719
										Client.clickedWidget = null; // L: 11720
										Client.clickedWidgetParent = null; // L: 11721
									}

									if (!Client.isMenuOpen) { // L: 11723
										class20.addCancelMenuEntry(); // L: 11724
									}
								}

								class4.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11); // L: 11727
							}
						}
					}
				}
			}
		}

	} // L: 11731
}
