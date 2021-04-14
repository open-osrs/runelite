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

@ObfuscatedName("ew")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -945646571
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 557518487
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("h")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1255950001
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -465902583
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("m")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("d")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("c")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 38
		this.regionY = var2; // L: 39
		this.worldMapData1List = new LinkedList(); // L: 40
		this.icon0List = new LinkedList(); // L: 41
		this.iconMap = new HashMap(); // L: 42
		this.backgroundColor = var3 | -16777216; // L: 43
		this.fonts = var4; // L: 44
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1387360033"
	)
	void method2805(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 49
		int var6 = this.regionY; // L: 50
		int var7 = this.pixelsPerTile; // L: 51
		DemotingHashTable var8 = WorldMapRegion_cachedSprites; // L: 53
		long var9 = (long)(var7 << 16 | var5 << 8 | var6); // L: 56
		SpritePixels var4 = (SpritePixels)var8.get(var9); // L: 58
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) { // L: 62
				var4.drawAt(var1, var2); // L: 63
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 66
			}

		}
	} // L: 61 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lem;Ljava/util/List;I)V",
		garbageValue = "180621664"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 71
		this.worldMapData_0 = var1; // L: 72
		this.addAllToIconList(var2); // L: 73
	} // L: 74

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "1703141389"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIILee;I)V",
		garbageValue = "2023835510"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 90
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 91
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 92
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 93
					if (var9 != null && var9.length != 0) { // L: 94
						WorldMapDecoration[] var10 = var9; // L: 98

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 99
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11]; // L: 100
								var13 = class19.getObjectDefinition(var12.objectDefinitionId); // L: 102
								if (var13.transforms != null) { // L: 105
									int[] var15 = var13.transforms; // L: 107

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 108
										int var17 = var15[var16]; // L: 109
										ObjectComposition var18 = class19.getObjectDefinition(var17); // L: 111
										if (var18.mapIconId != -1) { // L: 112
											var14 = true; // L: 113
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 120
									var14 = true; // L: 121
									break label67; // L: 122
								}

								var14 = false; // L: 124
							}

							if (var14) { // L: 126
								this.getIcon(var13, var8, var6, var7, var5); // L: 129
								continue label76; // L: 130
							}
						}
					}
				}
			}
		}

	} // L: 137

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IIILee;I)V",
		garbageValue = "1552882899"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 140
		Coord var7 = null; // L: 141
		if (this.worldMapData_0 != null) { // L: 142
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 143
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 146
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 147
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 150
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 151
		} else {
			var9 = ByteArrayPool.WorldMapElement_get(var1.mapIconId); // L: 154
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 155
		}

		var9 = ByteArrayPool.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 157
		if (var9.field3411) { // L: 158
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 159
		}

	} // L: 161

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-559628958"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "89"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 175

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 176
			if (ByteArrayPool.WorldMapElement_get(var3.element).field3411 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 178 181
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method2834(var3.element)); // L: 182
				this.icon0List.add(var4); // L: 183
			}
		}

	} // L: 187

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-896441711"
	)
	void method2812() {
		if (this.worldMapData_0 != null) { // L: 190
			this.worldMapData_0.reset(); // L: 191
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 194

			while (var1.hasNext()) { // L: 199
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 195
				var2.reset(); // L: 197
			}
		}

	} // L: 201

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lir;B)Z",
		garbageValue = "0"
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

			return var2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILfw;[Low;Lir;Lir;I)V",
		garbageValue = "-1670034680"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var7 = this.regionX;
			int var8 = this.regionY;
			DemotingHashTable var9 = WorldMapRegion_cachedSprites; // L: 243
			long var10 = (long)(var1 << 16 | var7 << 8 | var8); // L: 246
			SpritePixels var6 = (SpritePixels)var9.get(var10); // L: 248
			if (var6 == null) { // L: 250
				boolean var22 = true; // L: 253
				var22 &= this.loadGeography(var4); // L: 254
				int var11;
				if (this.worldMapData_0 != null) { // L: 257
					var11 = this.worldMapData_0.groupId; // L: 258
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 261
				}

				var22 &= var5.tryLoadGroup(var11); // L: 263
				if (var22) { // L: 264
					byte[] var23 = var5.takeFileFlat(var11); // L: 265
					WorldMapSprite var12;
					if (var23 == null) { // L: 268
						var12 = new WorldMapSprite(); // L: 269
					} else {
						var12 = new WorldMapSprite(WorldMapDecorationType.convertJpgToSprite(var23).pixels); // L: 272
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 275
					var14.setRaster(); // L: 276
					if (this.worldMapData_0 != null) { // L: 277
						this.method2817(var2, var3, var12); // L: 278
					} else {
						this.method2858(var2, var3, var12); // L: 281
					}

					int var15 = this.regionX; // L: 283
					int var16 = this.regionY; // L: 284
					int var17 = this.pixelsPerTile; // L: 285
					DemotingHashTable var18 = WorldMapRegion_cachedSprites; // L: 287
					long var20 = (long)(var17 << 16 | var15 << 8 | var16); // L: 291
					var18.put(var14, var20, var14.pixels.length * 4); // L: 293
					this.method2812(); // L: 295
				}
			}
		}
	} // L: 251 296

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-2125781425"
	)
	void method2815(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 299
			var4 = new HashSet(); // L: 300
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 302
		this.drawMapLinks(var1, var2, var4, var3); // L: 303
	} // L: 304

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-114"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 307

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 308
			if (var5.hasValidElement()) { // L: 310
				int var6 = var5.getElement(); // L: 311
				if (var1.contains(var6)) { // L: 312
					WorldMapElement var7 = ByteArrayPool.WorldMapElement_get(var6); // L: 313
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 314
				}
			}
		}

		this.method2855(var1, var2, var3); // L: 318
	} // L: 319

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lfw;[Low;Lea;B)V",
		garbageValue = "-4"
	)
	void method2817(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 322
			for (var5 = 0; var5 < 64; ++var5) { // L: 323
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 324
				this.method2827(var4, var5, this.worldMapData_0, var1); // L: 325
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 328
			for (var5 = 0; var5 < 64; ++var5) { // L: 329
				this.method2819(var4, var5, this.worldMapData_0, var1, var2); // L: 330
			}
		}

	} // L: 333

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lfw;[Low;Lea;I)V",
		garbageValue = "1276390377"
	)
	void method2858(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 336

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 337

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 339
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 340
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 341
					this.method2827(var6, var7, var5, var1); // L: 342
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 347

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 348

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 350
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 351
					this.method2819(var6, var7, var5, var1, var2); // L: 352
				}
			}
		}

	} // L: 357

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILee;Lfw;[Low;B)V",
		garbageValue = "0"
	)
	void method2819(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method2824(var1, var2, var3); // L: 360
		this.method2823(var1, var2, var3, var5); // L: 361
	} // L: 362

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILee;Lfw;Lea;B)V",
		garbageValue = "0"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 365
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 366
		if (var6 == -1 && var7 == -1) { // L: 367
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 368
		}

		int var8 = 16711935; // L: 370
		if (var7 != -1) { // L: 371
			var8 = class10.method136(var7, this.backgroundColor); // L: 372
		}

		if (var7 > -1 && var3.field1690[0][var1][var2] == 0) { // L: 374
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 375
		} else {
			int var9 = this.method2822(var1, var2, var3, var5); // L: 378
			if (var7 == -1) { // L: 379
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 380
			} else {
				var4.method3223(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field1690[0][var1][var2], var3.field1700[0][var1][var2]); // L: 383
			}
		}
	} // L: 376 381 384

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILee;Lfw;I)V",
		garbageValue = "-1595724187"
	)
	void method2827(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 387
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 388
			if (var6 > -1) { // L: 389
				int var7 = class10.method136(var6, this.backgroundColor); // L: 390
				if (var3.field1690[var5][var1][var2] == 0) { // L: 391
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 392
				} else {
					var4.method3223(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field1690[var5][var1][var2], var3.field1700[var5][var1][var2]); // L: 395
				}
			}
		}

	} // L: 399

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILee;Lea;I)I",
		garbageValue = "-1683449387"
	)
	int method2822(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 402 403 405
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IILee;[Low;I)V",
		garbageValue = "164067153"
	)
	void method2823(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 409
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 410
			if (var6 != null && var6.length != 0) { // L: 411
				WorldMapDecoration[] var7 = var6; // L: 415

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 416
					WorldMapDecoration var9 = var7[var8]; // L: 417
					if (WorldMapSectionType.method3066(var9.decoration) || class244.method4402(var9.decoration)) { // L: 419
						ObjectComposition var10 = class19.getObjectDefinition(var9.objectDefinitionId); // L: 420
						if (var10.mapSceneId != -1) { // L: 421
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 422
								var4[var10.mapSceneId].method6951(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 426
							} else {
								var4[var10.mapSceneId].method6951(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 423
							}
						}
					}
				}
			}
		}

	} // L: 434

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILee;I)V",
		garbageValue = "-1141468534"
	)
	void method2824(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 437
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 438
			if (var5 != null && var5.length != 0) { // L: 439
				WorldMapDecoration[] var6 = var5; // L: 443

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 444
					WorldMapDecoration var8 = var6[var7]; // L: 445
					int var10 = var8.decoration; // L: 448
					boolean var9 = var10 >= WorldMapDecorationType.field2820.id && var10 <= WorldMapDecorationType.field2817.id || var10 == WorldMapDecorationType.field2818.id; // L: 450
					if (var9) { // L: 452
						ObjectComposition var11 = class19.getObjectDefinition(var8.objectDefinitionId); // L: 453
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 454
						if (var8.decoration == WorldMapDecorationType.field2820.id) { // L: 455
							this.method2838(var1, var2, var8.rotation, var12); // L: 456
						}

						if (var8.decoration == WorldMapDecorationType.field2816.id) { // L: 458
							this.method2838(var1, var2, var8.rotation, -3355444); // L: 459
							this.method2838(var1, var2, var8.rotation + 1, var12); // L: 460
						}

						if (var8.decoration == WorldMapDecorationType.field2817.id) { // L: 462
							if (var8.rotation == 0) { // L: 463
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) { // L: 464
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 465
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 466
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2818.id) { // L: 468
							int var13 = var8.rotation % 2; // L: 469
							int var14;
							if (var13 == 0) { // L: 470
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 471
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 472
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 476
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 477
								}
							}
						}
					}
				}
			}
		}

	} // L: 486

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "25"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 489
		float var6 = var5 / 2.0F; // L: 490
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 491

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 492
			Coord var9 = (Coord)var8.getKey(); // L: 494
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6); // L: 495
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 496
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 497
			if (var12 != null && var12.hasValidElement()) { // L: 498
				var12.screenX = var10; // L: 499
				var12.screenY = var11; // L: 500
				WorldMapElement var13 = ByteArrayPool.WorldMapElement_get(var12.getElement()); // L: 501
				if (!var3.contains(var13.getObjectId())) { // L: 502
					this.method2828(var12, var10, var11, var5); // L: 503
				}
			}
		}

	} // L: 508

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1107537620"
	)
	void method2855(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 511

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 512
			if (var5.hasValidElement()) { // L: 514
				WorldMapElement var6 = ByteArrayPool.WorldMapElement_get(var5.getElement()); // L: 515
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 516
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 517
				}
			}
		}

	} // L: 521

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IIIII)V",
		garbageValue = "-2097553050"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 524
		if (var6 != null) { // L: 525
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 528
			if (var4 % var5 < var5 / 2) { // L: 529
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 530
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 531
			}

		}
	} // L: 526 533

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfg;IIFI)V",
		garbageValue = "1220317543"
	)
	void method2828(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = ByteArrayPool.WorldMapElement_get(var1.getElement()); // L: 536
		this.method2887(var5, var2, var3); // L: 537
		this.method2830(var1, var5, var2, var3, var4); // L: 538
	} // L: 539

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;III)V",
		garbageValue = "2016144673"
	)
	void method2887(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 542
		if (var4 != null) { // L: 543
			int var5 = this.method2832(var4, var1.horizontalAlignment); // L: 544
			int var6 = this.method2833(var4, var1.verticalAlignment); // L: 545
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 546
		}

	} // L: 548

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lfg;Ljy;IIFI)V",
		garbageValue = "-1614908131"
	)
	void method2830(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 551
		if (var6 != null) { // L: 552
			if (var6.size.method2671(var5)) { // L: 555
				Font var7 = (Font)this.fonts.get(var6.size); // L: 558
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3417, 0, 1, 0, var7.ascent / 2); // L: 559
			}
		}
	} // L: 553 556 560

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1979423677"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 563
		Iterator var6 = this.icon0List.iterator(); // L: 564

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 565
			if (var7.hasValidElement()) { // L: 567
				int var8 = var7.coord2.x % 64; // L: 568
				int var9 = var7.coord2.y % 64; // L: 569
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 570
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 571
				if (!var3.contains(var7.getElement())) { // L: 572
					this.method2828(var7, var7.screenX, var7.screenY, var5); // L: 575
				}
			}
		}

	} // L: 578

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loh;Ljd;I)I",
		garbageValue = "-2143469237"
	)
	int method2832(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 581
		case 0:
			return 0; // L: 588
		case 1:
			return -var1.subWidth / 2; // L: 592
		default:
			return -var1.subWidth; // L: 584
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Loh;Lkf;B)I",
		garbageValue = "-70"
	)
	int method2833(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 598
		case 0:
			return -var1.subHeight / 2; // L: 601
		case 1:
			return 0; // L: 605
		default:
			return -var1.subHeight; // L: 609
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfi;",
		garbageValue = "1"
	)
	WorldMapLabel method2834(int var1) {
		WorldMapElement var2 = ByteArrayPool.WorldMapElement_get(var1); // L: 615
		return this.createMapLabel(var2); // L: 616
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljy;B)Lfi;",
		garbageValue = "2"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 620
			WorldMapLabelSize var2 = WorldMapLabelSize.method2670(var1.textSize); // L: 623
			if (var2 == null) { // L: 624
				return null; // L: 625
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 627
				if (var3 == null) { // L: 628
					return null; // L: 629
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 631
					String[] var5 = new String[var4]; // L: 632
					var3.breakLines(var1.name, (int[])null, var5); // L: 633
					int var6 = var5.length * var3.ascent / 2; // L: 634
					int var7 = 0; // L: 635
					String[] var8 = var5; // L: 637

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 638
						String var10 = var8[var9]; // L: 639
						int var11 = var3.stringWidth(var10); // L: 641
						if (var11 > var7) { // L: 642
							var7 = var11; // L: 643
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 648
				}
			}
		} else {
			return null; // L: 621
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-84"
	)
	List method2895(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 652
		if (var4 >= var1 && var5 >= var2) { // L: 653
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 654
				Iterator var7 = this.iconMap.values().iterator(); // L: 655

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 656
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 658
						var6.add(var8); // L: 659
					}
				}

				var7 = this.icon0List.iterator(); // L: 663

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 664
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 666
						var6.add(var8); // L: 667
					}
				}

				return var6; // L: 671
			} else {
				return var6; // L: 662
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-221640680"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 675
		var1.addAll(this.icon0List); // L: 676
		var1.addAll(this.iconMap.values()); // L: 677
		return var1; // L: 678
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2020684426"
	)
	void method2838(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 682
		if (var3 == 0) { // L: 683
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 684
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 685
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 686
		}

	} // L: 687

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1279999644"
	)
	public static void method2929(int var0) {
		if (var0 != -1) { // L: 229
			if (class69.Widget_loadedInterfaces[var0]) { // L: 230
				FloorDecoration.Widget_archive.clearFilesGroup(var0); // L: 231
				if (Widget.Widget_interfaceComponents[var0] != null) { // L: 232
					boolean var1 = true; // L: 233

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) { // L: 234
						if (Widget.Widget_interfaceComponents[var0][var2] != null) { // L: 235
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) { // L: 236
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 237
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null; // L: 240
					}

					class69.Widget_loadedInterfaces[var0] = false; // L: 241
				}
			}
		}
	} // L: 242
}
