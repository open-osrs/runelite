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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fn")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -91763405
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1756122927
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("h")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -314457837
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 605397793
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("b")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("i")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("k")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 46
		this.regionY = var2; // L: 47
		this.worldMapData1List = new LinkedList(); // L: 48
		this.icon0List = new LinkedList(); // L: 49
		this.iconMap = new HashMap(); // L: 50
		this.backgroundColor = var3 | -16777216; // L: 51
		this.fonts = var4; // L: 52
	} // L: 53

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1948817139"
	)
	void method3407(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 57
		int var6 = this.regionY; // L: 58
		int var7 = this.pixelsPerTile; // L: 59
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(GameEngine.method716(var5, var6, var7)); // L: 61
		if (var4 != null) { // L: 64
			if (var3 == this.pixelsPerTile * 64) { // L: 65
				var4.drawAt(var1, var2); // L: 66
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 69
			}

		}
	} // L: 71

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lfo;Ljava/util/List;I)V",
		garbageValue = "-2121590512"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 74
		this.worldMapData_0 = var1; // L: 75
		this.addAllToIconList(var2); // L: 76
	} // L: 77

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "2112928302"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 80
		Iterator var3 = var1.iterator(); // L: 81

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 82
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 84
				this.worldMapData1List.add(var4); // L: 85
			}
		}

		this.addAllToIconList(var2); // L: 89
	} // L: 90

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIILfy;I)V",
		garbageValue = "831467254"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 93
			label74:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 94
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 95
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 96
					if (var9 != null && var9.length != 0) { // L: 97
						WorldMapDecoration[] var10 = var9; // L: 101

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 102
							ObjectComposition var13;
							boolean var14;
							label65: {
								WorldMapDecoration var12 = var10[var11]; // L: 103
								var13 = Tiles.getObjectDefinition(var12.objectDefinitionId); // L: 105
								if (var13.transforms != null) { // L: 108
									int[] var15 = var13.transforms; // L: 110

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 111
										int var17 = var15[var16]; // L: 112
										ObjectComposition var18 = Tiles.getObjectDefinition(var17); // L: 114
										if (var18.mapIconId != -1) { // L: 115
											var14 = true; // L: 116
											break label65;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 123
									var14 = true; // L: 124
									break label65; // L: 125
								}

								var14 = false; // L: 127
							}

							if (var14) { // L: 129
								this.getIcon(var13, var8, var6, var7, var5); // L: 132
								continue label74; // L: 133
							}
						}
					}
				}
			}
		}

	} // L: 140

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lez;IIILfy;B)V",
		garbageValue = "111"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 143
		Coord var7 = null; // L: 144
		if (this.worldMapData_0 != null) { // L: 145
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 146
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 149
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 150
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 153
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 154
		} else {
			var9 = Archive.WorldMapElement_get(var1.mapIconId); // L: 157
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 158
		}

		var9 = Archive.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 160
		if (var9.field1569) { // L: 161
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 162
		}

	} // L: 164

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-95285337"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 167

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 168
			if (var2 instanceof WorldMapIcon_1) { // L: 170
				((WorldMapIcon_1)var2).init(); // L: 171
			}
		}

	} // L: 175

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "631658105"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 178

		while (var2.hasNext()) { // L: 189
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 179
			if (Archive.WorldMapElement_get(var3.element).field1569 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 181 184
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method3435(var3.element)); // L: 185
				this.icon0List.add(var4); // L: 186
			}
		}

	} // L: 190

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1612272147"
	)
	void method3414() {
		if (this.worldMapData_0 != null) { // L: 193
			this.worldMapData_0.reset(); // L: 194
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 197

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 198
				var2.reset(); // L: 200
			}
		}

	} // L: 204

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljp;B)Z",
		garbageValue = "37"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 207
		if (this.worldMapData_0 != null) { // L: 208
			this.worldMapData_0.loadGeography(var1); // L: 209
			if (this.worldMapData_0.isFullyLoaded()) { // L: 210
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 211
				return true; // L: 212
			} else {
				return false; // L: 214
			}
		} else {
			boolean var2 = true; // L: 217

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 218 222
				var4 = (WorldMapData_1)var3.next(); // L: 219
				var4.loadGeography(var1); // L: 221
			}

			if (var2) { // L: 225
				var3 = this.worldMapData1List.iterator(); // L: 226

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 227
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 229
				}
			}

			return var2; // L: 233
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILgs;[Lof;Ljp;Ljp;B)V",
		garbageValue = "-40"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 238
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 239
			int var7 = this.regionX; // L: 243
			int var8 = this.regionY; // L: 244
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(GameEngine.method716(var7, var8, var1)); // L: 246
			if (var6 == null) { // L: 248
				boolean var9 = true; // L: 251
				var9 &= this.loadGeography(var4); // L: 252
				int var11;
				if (this.worldMapData_0 != null) { // L: 255
					var11 = this.worldMapData_0.groupId; // L: 256
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 259
				}

				var9 &= var5.tryLoadGroup(var11); // L: 261
				if (var9) { // L: 262
					byte[] var10 = var5.takeFileFlat(var11); // L: 263
					WorldMapSprite var12;
					if (var10 == null) { // L: 266
						var12 = new WorldMapSprite(); // L: 267
					} else {
						var12 = new WorldMapSprite(class125.convertJpgToSprite(var10).pixels); // L: 270
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 273
					var14.setRaster(); // L: 274
					if (this.worldMapData_0 != null) { // L: 275
						this.method3419(var2, var3, var12); // L: 276
					} else {
						this.method3420(var2, var3, var12); // L: 279
					}

					int var15 = this.regionX; // L: 281
					int var16 = this.regionY; // L: 282
					int var17 = this.pixelsPerTile; // L: 283
					WorldMapRegion_cachedSprites.put(var14, GameEngine.method716(var15, var16, var17), var14.pixels.length * 4); // L: 285
					this.method3414(); // L: 287
				}
			}
		}
	} // L: 240 249 288

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "92"
	)
	void method3417(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 291
			var4 = new HashSet(); // L: 292
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 294
		this.drawMapLinks(var1, var2, var4, var3); // L: 295
	} // L: 296

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1184159068"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 299

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 300
			if (var5.hasValidElement()) { // L: 302
				int var6 = var5.getElement(); // L: 303
				if (var1.contains(var6)) { // L: 304
					WorldMapElement var7 = Archive.WorldMapElement_get(var6); // L: 305
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 306
				}
			}
		}

		this.method3488(var1, var2, var3); // L: 310
	} // L: 311

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lgs;[Lof;Lfk;B)V",
		garbageValue = "0"
	)
	void method3419(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 314
			for (var5 = 0; var5 < 64; ++var5) { // L: 315
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 316
				this.method3423(var4, var5, this.worldMapData_0, var1); // L: 317
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 320
			for (var5 = 0; var5 < 64; ++var5) { // L: 321
				this.method3421(var4, var5, this.worldMapData_0, var1, var2); // L: 322
			}
		}

	} // L: 325

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgs;[Lof;Lfk;B)V",
		garbageValue = "39"
	)
	void method3420(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 328

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 329

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 331
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 332
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 333
					this.method3423(var6, var7, var5, var1); // L: 334
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 339

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 340

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 342
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 343
					this.method3421(var6, var7, var5, var1, var2); // L: 344
				}
			}
		}

	} // L: 349

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lgs;[Lof;B)V",
		garbageValue = "56"
	)
	void method3421(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method3426(var1, var2, var3); // L: 352
		this.method3425(var1, var2, var3, var5); // L: 353
	} // L: 354

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lgs;Lfk;I)V",
		garbageValue = "1645371529"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 357
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 358
		if (var6 == -1 && var7 == -1) { // L: 359
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 360
		}

		int var8 = 16711935; // L: 362
		int var9;
		if (var7 != -1) { // L: 363
			int var10 = this.backgroundColor; // L: 365
			FloorOverlayDefinition var11 = WorldMapSectionType.method3677(var7); // L: 367
			if (var11 == null) { // L: 368
				var9 = var10; // L: 369
			} else if (var11.secondaryRgb >= 0) { // L: 372
				var9 = var11.secondaryRgb | -16777216; // L: 373
			} else {
				int var12;
				if (var11.texture >= 0) { // L: 375
					var12 = WorldMapID.method3718(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 376
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 377
				} else if (var11.primaryRgb == 16711935) { // L: 379
					var9 = var10; // L: 380
				} else {
					var12 = ClientPreferences.method2330(var11.hue, var11.saturation, var11.lightness); // L: 383
					int var13 = WorldMapID.method3718(var12, 96); // L: 384
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 385
				}
			}

			var8 = var9; // L: 388
		}

		if (var7 > -1 && var3.field2068[0][var1][var2] == 0) { // L: 390
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 391
		} else {
			var9 = this.method3424(var1, var2, var3, var5); // L: 394
			if (var7 == -1) { // L: 395
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 396
			} else {
				var4.method3819(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2068[0][var1][var2], var3.field2074[0][var1][var2]); // L: 399
			}
		}
	} // L: 392 397 400

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lgs;B)V",
		garbageValue = "1"
	)
	void method3423(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 403
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 404
			if (var6 > -1) { // L: 405
				int var8 = this.backgroundColor; // L: 407
				FloorOverlayDefinition var9 = WorldMapSectionType.method3677(var6); // L: 409
				int var7;
				if (var9 == null) { // L: 410
					var7 = var8; // L: 411
				} else if (var9.secondaryRgb >= 0) { // L: 414
					var7 = var9.secondaryRgb | -16777216; // L: 415
				} else {
					int var10;
					if (var9.texture >= 0) { // L: 417
						var10 = WorldMapID.method3718(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 418
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 419
					} else if (var9.primaryRgb == 16711935) { // L: 421
						var7 = var8; // L: 422
					} else {
						var10 = ClientPreferences.method2330(var9.hue, var9.saturation, var9.lightness); // L: 425
						int var11 = WorldMapID.method3718(var10, 96); // L: 426
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216; // L: 427
					}
				}

				if (var3.field2068[var5][var1][var2] == 0) { // L: 431
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 432
				} else {
					var4.method3819(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2068[var5][var1][var2], var3.field2074[var5][var1][var2]); // L: 435
				}
			}
		}

	} // L: 439

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lfk;B)I",
		garbageValue = "37"
	)
	int method3424(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 442 443 445
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILfy;[Lof;I)V",
		garbageValue = "-1994135211"
	)
	void method3425(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 449
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 450
			if (var6 != null && var6.length != 0) { // L: 451
				WorldMapDecoration[] var7 = var6; // L: 455

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 456
					WorldMapDecoration var9 = var7[var8]; // L: 457
					int var11 = var9.decoration; // L: 460
					boolean var10 = var11 >= WorldMapDecorationType.field3154.id && var11 <= WorldMapDecorationType.field3167.id; // L: 462
					if (var10 || class32.method384(var9.decoration)) { // L: 464
						ObjectComposition var12 = Tiles.getObjectDefinition(var9.objectDefinitionId); // L: 465
						if (var12.mapSceneId != -1) { // L: 466
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 467
								var4[var12.mapSceneId].method6997(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 471
							} else {
								var4[var12.mapSceneId].method6997(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 468
							}
						}
					}
				}
			}
		}

	} // L: 479

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILfy;B)V",
		garbageValue = "22"
	)
	void method3426(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 482
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 483
			if (var5 != null && var5.length != 0) { // L: 484
				WorldMapDecoration[] var6 = var5; // L: 488

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 489
					WorldMapDecoration var8 = var6[var7]; // L: 490
					if (Login.method2058(var8.decoration)) { // L: 492
						ObjectComposition var9 = Tiles.getObjectDefinition(var8.objectDefinitionId); // L: 493
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 494
						if (var8.decoration == WorldMapDecorationType.field3160.id) { // L: 495
							this.method3439(var1, var2, var8.rotation, var10); // L: 496
						}

						if (var8.decoration == WorldMapDecorationType.field3148.id) { // L: 498
							this.method3439(var1, var2, var8.rotation, -3355444); // L: 499
							this.method3439(var1, var2, var8.rotation + 1, var10); // L: 500
						}

						if (var8.decoration == WorldMapDecorationType.field3170.id) { // L: 502
							if (var8.rotation == 0) { // L: 503
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 504
							}

							if (var8.rotation == 2) { // L: 505
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 506
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3150.id) { // L: 508
							int var11 = var8.rotation % 2; // L: 509
							int var12;
							if (var11 == 0) { // L: 510
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 511
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 512
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 516
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 517
								}
							}
						}
					}
				}
			}
		}

	} // L: 526

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-34"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 529
		float var6 = var5 / 2.0F; // L: 530
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 531

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 532
			Coord var9 = (Coord)var8.getKey(); // L: 534
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6); // L: 535
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 536
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 537
			if (var12 != null && var12.hasValidElement()) { // L: 538
				var12.screenX = var10; // L: 539
				var12.screenY = var11; // L: 540
				WorldMapElement var13 = Archive.WorldMapElement_get(var12.getElement()); // L: 541
				if (!var3.contains(var13.getObjectId())) { // L: 542
					this.method3429(var12, var10, var11, var5); // L: 543
				}
			}
		}

	} // L: 548

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-466157918"
	)
	void method3488(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 551

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 552
			if (var5.hasValidElement()) { // L: 554
				WorldMapElement var6 = Archive.WorldMapElement_get(var5.getElement()); // L: 555
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 556
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 557
				}
			}
		}

	} // L: 561

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lek;IIIII)V",
		garbageValue = "-380618886"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 564
		if (var6 != null) { // L: 565
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 568
			if (var4 % var5 < var5 / 2) { // L: 569
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 570
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 571
			}

		}
	} // L: 566 573

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgh;IIFB)V",
		garbageValue = "41"
	)
	void method3429(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = Archive.WorldMapElement_get(var1.getElement()); // L: 576
		this.method3477(var5, var2, var3); // L: 577
		this.method3431(var1, var5, var2, var3, var4); // L: 578
	} // L: 579

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lek;III)V",
		garbageValue = "2103112249"
	)
	void method3477(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 582
		if (var4 != null) { // L: 583
			int var5 = this.method3433(var4, var1.horizontalAlignment); // L: 584
			int var6 = this.method3409(var4, var1.verticalAlignment); // L: 585
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 586
		}

	} // L: 588

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgh;Lek;IIFI)V",
		garbageValue = "-796895701"
	)
	void method3431(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 591
		if (var6 != null) { // L: 592
			if (var6.size.method3278(var5)) { // L: 595
				Font var7 = (Font)this.fonts.get(var6.size); // L: 598
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1563, 0, 1, 0, var7.ascent / 2); // L: 599
			}
		}
	} // L: 593 596 600

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-281265080"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 603
		Iterator var6 = this.icon0List.iterator(); // L: 604

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 605
			if (var7.hasValidElement()) { // L: 607
				int var8 = var7.coord2.x % 64; // L: 608
				int var9 = var7.coord2.y % 64; // L: 609
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 610
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5); // L: 611
				if (!var3.contains(var7.getElement())) { // L: 612
					this.method3429(var7, var7.screenX, var7.screenY, var5); // L: 615
				}
			}
		}

	} // L: 618

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Loa;Leq;I)I",
		garbageValue = "2137509015"
	)
	int method3433(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 621
		case 1:
			return 0; // L: 632
		case 2:
			return -var1.subWidth / 2; // L: 628
		default:
			return -var1.subWidth; // L: 624
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Loa;Lee;I)I",
		garbageValue = "-128811790"
	)
	int method3409(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 638
		case 0:
			return -var1.subHeight / 2; // L: 641
		case 2:
			return 0; // L: 649
		default:
			return -var1.subHeight; // L: 645
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfd;",
		garbageValue = "1"
	)
	WorldMapLabel method3435(int var1) {
		WorldMapElement var2 = Archive.WorldMapElement_get(var1); // L: 655
		return this.createMapLabel(var2); // L: 656
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Lfd;",
		garbageValue = "282116482"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 660
			WorldMapLabelSize var2 = WorldMapLabelSize.method3281(var1.textSize); // L: 663
			if (var2 == null) { // L: 664
				return null; // L: 665
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 667
				if (var3 == null) { // L: 668
					return null; // L: 669
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 671
					String[] var5 = new String[var4]; // L: 672
					var3.breakLines(var1.name, (int[])null, var5); // L: 673
					int var6 = var5.length * var3.ascent / 2; // L: 674
					int var7 = 0; // L: 675
					String[] var8 = var5; // L: 677

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 678
						String var10 = var8[var9]; // L: 679
						int var11 = var3.stringWidth(var10); // L: 681
						if (var11 > var7) { // L: 682
							var7 = var11; // L: 683
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 688
				}
			}
		} else {
			return null; // L: 661
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "0"
	)
	List method3437(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 692
		if (var4 >= var1 && var5 >= var2) { // L: 693
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 694
				Iterator var7 = this.iconMap.values().iterator(); // L: 695

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 696
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 698
						var6.add(var8); // L: 699
					}
				}

				var7 = this.icon0List.iterator(); // L: 703

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 704
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 706
						var6.add(var8); // L: 707
					}
				}

				return var6; // L: 711
			} else {
				return var6; // L: 702
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-1092434212"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 715
		var1.addAll(this.icon0List); // L: 716
		var1.addAll(this.iconMap.values()); // L: 717
		return var1; // L: 718
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-767493128"
	)
	void method3439(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 722
		if (var3 == 0) { // L: 723
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 724
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 725
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 726
		}

	} // L: 727

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1078417152"
	)
	static int method3472(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1202
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1203
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var3)); // L: 1204
			return 1; // L: 1205
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1207
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1214
				if (var3.dataText == null) { // L: 1215
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1216
				}

				return 1; // L: 1217
			} else {
				return 2; // L: 1219
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1208
			--var4; // L: 1209
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1210
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1211
			} else {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1212
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1896402361"
	)
	static final void method3519(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 11510
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method49()) { // L: 11511
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11512
				if (var2.rank == -1) { // L: 11513
					PacketWriter var3 = Client.packetWriter; // L: 11514
					PacketBufferNode var4 = InterfaceParent.getPacketBufferNode(ClientPacket.field2584, var3.isaacCipher); // L: 11515
					var4.packetBuffer.writeByte(3 + class44.stringCp1252NullTerminatedByteSize(var2.name)); // L: 11516
					var4.packetBuffer.writeByte(var0); // L: 11517
					var4.packetBuffer.writeShort(var1); // L: 11518
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.name); // L: 11519
					var3.addNode(var4); // L: 11520
				}
			}
		}
	} // L: 11521
}
