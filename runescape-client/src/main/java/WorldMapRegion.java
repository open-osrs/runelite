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

@ObfuscatedName("fq")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1618950683
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2001174097
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("d")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -747005213
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1359138405
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("l")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("o")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("c")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 47
		this.regionY = var2; // L: 48
		this.worldMapData1List = new LinkedList(); // L: 49
		this.icon0List = new LinkedList(); // L: 50
		this.iconMap = new HashMap(); // L: 51
		this.backgroundColor = var3 | -16777216; // L: 52
		this.fonts = var4; // L: 53
	} // L: 54

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "125158399"
	)
	void method3328(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 58
		int var6 = this.regionY; // L: 59
		int var7 = this.pixelsPerTile; // L: 60
		DemotingHashTable var8 = WorldMapRegion_cachedSprites; // L: 62
		long var9 = (long)(var7 << 16 | var5 << 8 | var6); // L: 65
		SpritePixels var4 = (SpritePixels)var8.get(var9); // L: 67
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) { // L: 71
				var4.drawAt(var1, var2); // L: 72
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 75
			}

		}
	} // L: 70 77

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lft;Ljava/util/List;I)V",
		garbageValue = "-1081431828"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 80
		this.worldMapData_0 = var1; // L: 81
		this.addAllToIconList(var2); // L: 82
	} // L: 83

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-1864841845"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 86
		Iterator var3 = var1.iterator(); // L: 87

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 88
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 90
				this.worldMapData1List.add(var4); // L: 91
			}
		}

		this.addAllToIconList(var2); // L: 95
	} // L: 96

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIILfm;I)V",
		garbageValue = "-1919437807"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 99
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 100
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 101
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 102
					if (var9 != null && var9.length != 0) { // L: 103
						WorldMapDecoration[] var10 = var9; // L: 107

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 108
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11]; // L: 109
								var13 = class23.getObjectDefinition(var12.objectDefinitionId); // L: 111
								if (var13.transforms != null) { // L: 114
									int[] var15 = var13.transforms; // L: 116

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 117
										int var17 = var15[var16]; // L: 118
										ObjectComposition var18 = class23.getObjectDefinition(var17); // L: 120
										if (var18.mapIconId != -1) { // L: 121
											var14 = true; // L: 122
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 129
									var14 = true; // L: 130
									break label67; // L: 131
								}

								var14 = false; // L: 133
							}

							if (var14) { // L: 135
								this.getIcon(var13, var8, var6, var7, var5); // L: 138
								continue label76; // L: 139
							}
						}
					}
				}
			}
		}

	} // L: 146

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Leg;IIILfm;I)V",
		garbageValue = "1079929853"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 149
		Coord var7 = null; // L: 150
		if (this.worldMapData_0 != null) { // L: 151
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 152
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 155
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 156
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 159
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 160
		} else {
			var9 = class6.WorldMapElement_get(var1.mapIconId); // L: 163
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 164
		}

		var9 = class6.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 166
		if (var9.field1560) { // L: 167
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 168
		}

	} // L: 170

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16083"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 173

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 174
			if (var2 instanceof WorldMapIcon_1) { // L: 176
				((WorldMapIcon_1)var2).init(); // L: 177
			}
		}

	} // L: 181

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1099621062"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 184

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 185
			if (class6.WorldMapElement_get(var3.element).field1560 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 187 190
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method3357(var3.element)); // L: 191
				this.icon0List.add(var4); // L: 192
			}
		}

	} // L: 196

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1753897051"
	)
	void method3388() {
		if (this.worldMapData_0 != null) { // L: 199
			this.worldMapData_0.reset(); // L: 200
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 203

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 204
				var2.reset(); // L: 206
			}
		}

	} // L: 210

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljv;S)Z",
		garbageValue = "27128"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 213
		if (this.worldMapData_0 != null) { // L: 214
			this.worldMapData_0.loadGeography(var1); // L: 215
			if (this.worldMapData_0.isFullyLoaded()) { // L: 216
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 217
				return true; // L: 218
			} else {
				return false; // L: 220
			}
		} else {
			boolean var2 = true; // L: 223

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 224 228
				var4 = (WorldMapData_1)var3.next(); // L: 225
				var4.loadGeography(var1); // L: 227
			}

			if (var2) { // L: 231
				var3 = this.worldMapData1List.iterator(); // L: 232

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 233
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 235
				}
			}

			return var2; // L: 239
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILgb;[Lop;Ljv;Ljv;I)V",
		garbageValue = "-1087727229"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 244
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 245
			if (class7.method76(this.regionX, this.regionY, var1) == null) { // L: 248
				boolean var6 = true; // L: 251
				var6 &= this.loadGeography(var4); // L: 252
				int var8;
				if (this.worldMapData_0 != null) { // L: 255
					var8 = this.worldMapData_0.groupId; // L: 256
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 259
				}

				var6 &= var5.tryLoadGroup(var8); // L: 261
				if (var6) { // L: 262
					byte[] var7 = var5.takeFileFlat(var8); // L: 263
					WorldMapSprite var9 = class82.method1909(var7); // L: 264
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 265
					var10.setRaster(); // L: 266
					if (this.worldMapData_0 != null) { // L: 267
						this.method3340(var2, var3, var9); // L: 268
					} else {
						this.method3455(var2, var3, var9); // L: 271
					}

					int var11 = this.regionX; // L: 273
					int var12 = this.regionY; // L: 274
					int var13 = this.pixelsPerTile; // L: 275
					DemotingHashTable var14 = WorldMapRegion_cachedSprites; // L: 277
					long var16 = (long)(var13 << 16 | var11 << 8 | var12); // L: 281
					var14.put(var10, var16, var10.pixels.length * 4); // L: 283
					this.method3388(); // L: 285
				}
			}
		}
	} // L: 246 249 286

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "1432505674"
	)
	void method3353(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 289
			var4 = new HashSet(); // L: 290
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 292
		this.drawMapLinks(var1, var2, var4, var3); // L: 293
	} // L: 294

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "685193317"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 297

		while (var4.hasNext()) { // L: 307
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 298
			if (var5.hasValidElement()) { // L: 300
				int var6 = var5.getElement(); // L: 301
				if (var1.contains(var6)) { // L: 302
					WorldMapElement var7 = class6.WorldMapElement_get(var6); // L: 303
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 304
				}
			}
		}

		this.method3349(var1, var2, var3); // L: 308
	} // L: 309

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lgb;[Lop;Lfd;I)V",
		garbageValue = "1016970364"
	)
	void method3340(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 312
			for (var5 = 0; var5 < 64; ++var5) { // L: 313
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 314
				this.method3344(var4, var5, this.worldMapData_0, var1); // L: 315
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 318
			for (var5 = 0; var5 < 64; ++var5) { // L: 319
				this.method3410(var4, var5, this.worldMapData_0, var1, var2); // L: 320
			}
		}

	} // L: 323

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lgb;[Lop;Lfd;B)V",
		garbageValue = "-39"
	)
	void method3455(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 326

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 327

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 329
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 330
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 331
					this.method3344(var6, var7, var5, var1); // L: 332
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 337

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 338

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 340
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 341
					this.method3410(var6, var7, var5, var1, var2); // L: 342
				}
			}
		}

	} // L: 347

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILfm;Lgb;[Lop;B)V",
		garbageValue = "27"
	)
	void method3410(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method3347(var1, var2, var3); // L: 350
		this.method3346(var1, var2, var3, var5); // L: 351
	} // L: 352

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILfm;Lgb;Lfd;I)V",
		garbageValue = "-1821301029"
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
			FloorOverlayDefinition var11 = SoundSystem.method807(var7); // L: 365
			if (var11 == null) { // L: 366
				var9 = var10; // L: 367
			} else if (var11.secondaryRgb >= 0) { // L: 370
				var9 = var11.secondaryRgb | -16777216; // L: 371
			} else if (var11.texture >= 0) { // L: 373
				int var12 = WorldMapSection0.method3590(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 374
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 375
			} else if (var11.primaryRgb == 16711935) { // L: 377
				var9 = var10; // L: 378
			} else {
				int var13 = var11.hue; // L: 382
				int var14 = var11.saturation; // L: 383
				int var15 = var11.lightness; // L: 384
				if (var15 > 179) { // L: 386
					var14 /= 2;
				}

				if (var15 > 192) { // L: 387
					var14 /= 2;
				}

				if (var15 > 217) { // L: 388
					var14 /= 2;
				}

				if (var15 > 243) { // L: 389
					var14 /= 2;
				}

				int var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10); // L: 390
				int var17 = WorldMapSection0.method3590(var16, 96); // L: 394
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 395
			}

			var8 = var9; // L: 398
		}

		if (var7 > -1 && var3.field2067[0][var1][var2] == 0) { // L: 400
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 401
		} else {
			var9 = this.method3345(var1, var2, var3, var5); // L: 404
			if (var7 == -1) { // L: 405
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 406
			} else {
				var4.method3719(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2067[0][var1][var2], var3.field2065[0][var1][var2]); // L: 409
			}
		}
	} // L: 402 407 410

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IILfm;Lgb;B)V",
		garbageValue = "16"
	)
	void method3344(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 413
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 414
			if (var6 > -1) { // L: 415
				int var8 = this.backgroundColor; // L: 417
				FloorOverlayDefinition var9 = SoundSystem.method807(var6); // L: 419
				int var7;
				if (var9 == null) { // L: 420
					var7 = var8; // L: 421
				} else if (var9.secondaryRgb >= 0) { // L: 424
					var7 = var9.secondaryRgb | -16777216; // L: 425
				} else if (var9.texture >= 0) { // L: 427
					int var10 = WorldMapSection0.method3590(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 428
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 429
				} else if (var9.primaryRgb == 16711935) { // L: 431
					var7 = var8; // L: 432
				} else {
					int var11 = var9.hue; // L: 436
					int var12 = var9.saturation; // L: 437
					int var13 = var9.lightness; // L: 438
					if (var13 > 179) { // L: 440
						var12 /= 2;
					}

					if (var13 > 192) { // L: 441
						var12 /= 2;
					}

					if (var13 > 217) { // L: 442
						var12 /= 2;
					}

					if (var13 > 243) { // L: 443
						var12 /= 2;
					}

					int var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10); // L: 444
					int var15 = WorldMapSection0.method3590(var14, 96); // L: 448
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 449
				}

				if (var3.field2067[var5][var1][var2] == 0) { // L: 453
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 454
				} else {
					var4.method3719(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2067[var5][var1][var2], var3.field2065[var5][var1][var2]); // L: 457
				}
			}
		}

	} // L: 461

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILfm;Lfd;I)I",
		garbageValue = "-404634884"
	)
	int method3345(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 464 465 467
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILfm;[Lop;I)V",
		garbageValue = "1218867013"
	)
	void method3346(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 471
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 472
			if (var6 != null && var6.length != 0) { // L: 473
				WorldMapDecoration[] var7 = var6; // L: 477

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 478
					WorldMapDecoration var9 = var7[var8]; // L: 479
					if (!PacketBufferNode.method4367(var9.decoration)) { // L: 482
						int var11 = var9.decoration; // L: 484
						boolean var10 = var11 == WorldMapDecorationType.field3154.id; // L: 486
						if (!var10) { // L: 488
							continue;
						}
					}

					ObjectComposition var12 = class23.getObjectDefinition(var9.objectDefinitionId); // L: 490
					if (var12.mapSceneId != -1) { // L: 491
						if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 492
							var4[var12.mapSceneId].method6958(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 496
						} else {
							var4[var12.mapSceneId].method6958(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 493
						}
					}
				}
			}
		}

	} // L: 504

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILfm;I)V",
		garbageValue = "1479082417"
	)
	void method3347(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 507
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 508
			if (var5 != null && var5.length != 0) { // L: 509
				WorldMapDecoration[] var6 = var5; // L: 513

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 514
					WorldMapDecoration var8 = var6[var7]; // L: 515
					if (class254.method4823(var8.decoration)) { // L: 517
						ObjectComposition var9 = class23.getObjectDefinition(var8.objectDefinitionId); // L: 518
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 519
						if (var8.decoration == WorldMapDecorationType.field3149.id) { // L: 520
							this.method3361(var1, var2, var8.rotation, var10); // L: 521
						}

						if (var8.decoration == WorldMapDecorationType.field3167.id) { // L: 523
							this.method3361(var1, var2, var8.rotation, -3355444); // L: 524
							this.method3361(var1, var2, var8.rotation + 1, var10); // L: 525
						}

						if (var8.decoration == WorldMapDecorationType.field3145.id) { // L: 527
							if (var8.rotation == 0) { // L: 528
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 529
							}

							if (var8.rotation == 2) { // L: 530
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 531
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3146.id) { // L: 533
							int var11 = var8.rotation % 2; // L: 534
							int var12;
							if (var11 == 0) { // L: 535
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 536
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 537
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 541
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 542
								}
							}
						}
					}
				}
			}
		}

	} // L: 551

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1949332191"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 554
		float var6 = var5 / 2.0F; // L: 555
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 556

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 557
			Coord var9 = (Coord)var8.getKey(); // L: 559
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 560
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 561
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 562
			if (var12 != null && var12.hasValidElement()) { // L: 563
				var12.screenX = var10; // L: 564
				var12.screenY = var11; // L: 565
				WorldMapElement var13 = class6.WorldMapElement_get(var12.getElement()); // L: 566
				if (!var3.contains(var13.getObjectId())) { // L: 567
					this.method3351(var12, var10, var11, var5); // L: 568
				}
			}
		}

	} // L: 573

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-341047508"
	)
	void method3349(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 576

		while (var4.hasNext()) { // L: 585
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 577
			if (var5.hasValidElement()) { // L: 579
				WorldMapElement var6 = class6.WorldMapElement_get(var5.getElement()); // L: 580
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 581
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 582
				}
			}
		}

	} // L: 586

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lew;IIIII)V",
		garbageValue = "1184916583"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 589
		if (var6 != null) { // L: 590
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 593
			if (var4 % var5 < var5 / 2) { // L: 594
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 595
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 596
			}

		}
	} // L: 591 598

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgq;IIFI)V",
		garbageValue = "-266654765"
	)
	void method3351(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class6.WorldMapElement_get(var1.getElement()); // L: 601
		this.method3449(var5, var2, var3); // L: 602
		this.method3342(var1, var5, var2, var3, var4); // L: 603
	} // L: 604

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lew;III)V",
		garbageValue = "-1515500646"
	)
	void method3449(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 607
		if (var4 != null) { // L: 608
			int var5 = this.method3391(var4, var1.horizontalAlignment); // L: 609
			int var6 = this.method3356(var4, var1.verticalAlignment); // L: 610
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 611
		}

	} // L: 613

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgq;Lew;IIFS)V",
		garbageValue = "-4359"
	)
	void method3342(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 616
		if (var6 != null) { // L: 617
			if (var6.size.method3215(var5)) { // L: 620
				Font var7 = (Font)this.fonts.get(var6.size); // L: 623
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1557, 0, 1, 0, var7.ascent / 2); // L: 624
			}
		}
	} // L: 618 621 625

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-810530478"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 628
		Iterator var6 = this.icon0List.iterator(); // L: 629

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 630
			if (var7.hasValidElement()) { // L: 632
				int var8 = var7.coord2.x % 64; // L: 633
				int var9 = var7.coord2.y % 64; // L: 634
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 635
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9)); // L: 636
				if (!var3.contains(var7.getElement())) { // L: 637
					this.method3351(var7, var7.screenX, var7.screenY, var5); // L: 640
				}
			}
		}

	} // L: 643

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Loh;Len;I)I",
		garbageValue = "491939852"
	)
	int method3391(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 646
		case 0:
			return -var1.subWidth / 2; // L: 649
		case 1:
			return 0; // L: 657
		default:
			return -var1.subWidth; // L: 653
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Loh;Lem;I)I",
		garbageValue = "1319342568"
	)
	int method3356(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 663
		case 0:
			return 0; // L: 674
		case 1:
			return -var1.subHeight / 2; // L: 670
		default:
			return -var1.subHeight; // L: 666
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "1606957307"
	)
	WorldMapLabel method3357(int var1) {
		WorldMapElement var2 = class6.WorldMapElement_get(var1); // L: 680
		return this.createMapLabel(var2); // L: 681
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lew;I)Lfv;",
		garbageValue = "-1759446365"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 685
			WorldMapLabelSize var2 = WorldMapLabelSize.method3208(var1.textSize); // L: 688
			if (var2 == null) { // L: 689
				return null; // L: 690
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 692
				if (var3 == null) { // L: 693
					return null; // L: 694
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 696
					String[] var5 = new String[var4]; // L: 697
					var3.breakLines(var1.name, (int[])null, var5); // L: 698
					int var6 = var5.length * var3.ascent / 2; // L: 699
					int var7 = 0; // L: 700
					String[] var8 = var5; // L: 702

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 703
						String var10 = var8[var9]; // L: 704
						int var11 = var3.stringWidth(var10); // L: 706
						if (var11 > var7) { // L: 707
							var7 = var11; // L: 708
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 713
				}
			}
		} else {
			return null; // L: 686
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-183202693"
	)
	List method3359(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 717
		if (var4 >= var1 && var5 >= var2) { // L: 718
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 719
				Iterator var7 = this.iconMap.values().iterator(); // L: 720

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 721
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 723
						var6.add(var8); // L: 724
					}
				}

				var7 = this.icon0List.iterator(); // L: 728

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 729
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 731
						var6.add(var8); // L: 732
					}
				}

				return var6; // L: 736
			} else {
				return var6; // L: 727
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-983336809"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 740
		var1.addAll(this.icon0List); // L: 741
		var1.addAll(this.iconMap.values()); // L: 742
		return var1; // L: 743
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "575857346"
	)
	void method3361(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 747
		if (var3 == 0) { // L: 748
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 749
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 750
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 751
		}

	} // L: 752

	@ObfuscatedName("v")
	public static final int method3437(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = (var12 - var14) * 6.0D * var16 + var14;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var14 + (var12 - var14) * 6.0D * var20;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}
}
