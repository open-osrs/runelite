import java.io.File;
import java.io.IOException;
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

@ObfuscatedName("am")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 625285525
	)
	static int field271;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1611303231
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1835973111
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("l")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 900207131
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1432423267
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("e")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("m")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("c")
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1252499183"
	)
	void method534(int var1, int var2, int var3) {
		SpritePixels var4 = PlayerType.method4170(this.regionX, this.regionY, this.pixelsPerTile); // L: 61
		if (var4 != null) { // L: 62
			if (var3 == this.pixelsPerTile * 64) { // L: 63
				var4.drawAt(var1, var2); // L: 64
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lk;Ljava/util/List;B)V",
		garbageValue = "1"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 72
		this.worldMapData_0 = var1; // L: 73
		this.addAllToIconList(var2); // L: 74
	} // L: 75

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "390590880"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIILau;I)V",
		garbageValue = "-1057419535"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 91
			label75:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 92
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 93
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 94
					if (var9 != null && var9.length != 0) { // L: 95
						WorldMapDecoration[] var10 = var9; // L: 99

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 100
							ObjectComposition var13;
							boolean var14;
							label66: {
								WorldMapDecoration var12 = var10[var11]; // L: 101
								var13 = WorldMapDecoration.getObjectDefinition(var12.objectDefinitionId); // L: 103
								if (var13.transforms != null) { // L: 106
									int[] var15 = var13.transforms; // L: 108

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 109
										int var17 = var15[var16]; // L: 110
										ObjectComposition var18 = WorldMapDecoration.getObjectDefinition(var17); // L: 112
										if (var18.mapIconId != -1) { // L: 113
											var14 = true; // L: 114
											break label66;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 121
									var14 = true; // L: 122
									break label66; // L: 123
								}

								var14 = false; // L: 125
							}

							if (var14) { // L: 127
								this.getIcon(var13, var8, var6, var7, var5); // L: 130
								continue label75; // L: 131
							}
						}
					}
				}
			}
		}

	} // L: 138

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIILau;I)V",
		garbageValue = "1801137136"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 141
		Coord var7 = null; // L: 142
		if (this.worldMapData_0 != null) { // L: 143
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 144
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 147
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 148
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 151
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 152
		} else {
			var9 = UserComparator10.WorldMapElement_get(var1.mapIconId); // L: 155
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 156
		}

		var9 = UserComparator10.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 158
		if (var9.field3250) { // L: 159
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 160
		}

	} // L: 162

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1147787882"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-1315662131"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 176

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 177
			if (UserComparator10.WorldMapElement_get(var3.element).field3250 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 179 182
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method474(var3.element));
				this.icon0List.add(var4);
			}
		}

	} // L: 188

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1700"
	)
	void method530() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator();

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 196
				var2.reset();
			}
		}

	} // L: 202

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)Z",
		garbageValue = "-1344110120"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 205
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.loadGeography(var1);
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILar;[Llo;Lib;Lib;B)V",
		garbageValue = "71"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 236
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 237
			if (PlayerType.method4170(this.regionX, this.regionY, var1) == null) { // L: 240
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
					WorldMapSprite var9 = DynamicObject.method2300(var7); // L: 256
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 257
					var10.setRaster(); // L: 258
					if (this.worldMapData_0 != null) { // L: 259
						this.method471(var2, var3, var9); // L: 260
					} else {
						this.method484(var2, var3, var9); // L: 263
					}

					int var11 = this.regionX; // L: 265
					int var12 = this.regionY; // L: 266
					int var13 = this.pixelsPerTile; // L: 267
					DemotingHashTable var14 = WorldMapRegion_cachedSprites; // L: 269
					long var16 = (long)(var13 << 16 | var11 << 8 | var12); // L: 273
					var14.put(var10, var16, var10.pixels.length * 4); // L: 275
					this.method530(); // L: 277
				}
			}
		}
	} // L: 238 241 278

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-935222416"
	)
	void method481(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 281
			var4 = new HashSet(); // L: 282
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 284
		this.drawMapLinks(var1, var2, var4, var3); // L: 285
	} // L: 286

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-879873974"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 289

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 290
			if (var5.hasValidElement()) { // L: 292
				int var6 = var5.getElement(); // L: 293
				if (var1.contains(var6)) { // L: 294
					WorldMapElement var7 = UserComparator10.WorldMapElement_get(var6); // L: 295
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 296
				}
			}
		}

		this.method491(var1, var2, var3); // L: 300
	} // L: 301

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lar;[Llo;Laq;I)V",
		garbageValue = "-830543594"
	)
	void method471(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 304
			for (var5 = 0; var5 < 64; ++var5) { // L: 305
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 306
				this.method487(var4, var5, this.worldMapData_0, var1); // L: 307
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 310
			for (var5 = 0; var5 < 64; ++var5) { // L: 311
				this.method485(var4, var5, this.worldMapData_0, var1, var2); // L: 312
			}
		}

	} // L: 315

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lar;[Llo;Laq;I)V",
		garbageValue = "574283591"
	)
	void method484(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 318

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 319

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 321
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 322
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 323
					this.method487(var6, var7, var5, var1); // L: 324
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 329

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 330

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 332
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 333
					this.method485(var6, var7, var5, var1, var2); // L: 334
				}
			}
		}

	} // L: 339

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILau;Lar;[Llo;B)V",
		garbageValue = "-14"
	)
	void method485(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method548(var1, var2, var3); // L: 342
		this.method552(var1, var2, var3, var5); // L: 343
	} // L: 344

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILau;Lar;Laq;I)V",
		garbageValue = "143170882"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 347
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 348
		if (var6 == -1 && var7 == -1) { // L: 349
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 350
		}

		int var8 = 16711935; // L: 352
		if (var7 != -1) { // L: 353
			var8 = GrandExchangeOffer.method186(var7, this.backgroundColor); // L: 354
		}

		if (var7 > -1 && var3.field178[0][var1][var2] == 0) { // L: 356
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 357
		} else {
			int var9 = this.method488(var1, var2, var3, var5); // L: 360
			if (var7 == -1) { // L: 361
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 362
			} else {
				var4.method780(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field178[0][var1][var2], var3.field177[0][var1][var2]); // L: 365
			}
		}
	} // L: 358 363 366

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILau;Lar;I)V",
		garbageValue = "1236225695"
	)
	void method487(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 369
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 370
			if (var6 > -1) { // L: 371
				int var7 = GrandExchangeOffer.method186(var6, this.backgroundColor); // L: 372
				if (var3.field178[var5][var1][var2] == 0) { // L: 373
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 374
				} else {
					var4.method780(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field178[var5][var1][var2], var3.field177[var5][var1][var2]); // L: 377
				}
			}
		}

	} // L: 381

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILau;Laq;I)I",
		garbageValue = "372915391"
	)
	int method488(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 384 385 387
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILau;[Llo;B)V",
		garbageValue = "109"
	)
	void method552(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 391
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 392
			if (var6 != null && var6.length != 0) { // L: 393
				WorldMapDecoration[] var7 = var6; // L: 397

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 398
					WorldMapDecoration var9 = var7[var8]; // L: 399
					int var11 = var9.decoration; // L: 402
					boolean var10 = var11 >= WorldMapDecorationType.field2764.id && var11 <= WorldMapDecorationType.field2755.id; // L: 404
					if (var10 || BoundaryObject.method3342(var9.decoration)) { // L: 406
						ObjectComposition var12 = WorldMapDecoration.getObjectDefinition(var9.objectDefinitionId); // L: 407
						if (var12.mapSceneId != -1) { // L: 408
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 409
								var4[var12.mapSceneId].method6141(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 413
							} else {
								var4[var12.mapSceneId].method6141(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 410
							}
						}
					}
				}
			}
		}

	} // L: 421

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILau;I)V",
		garbageValue = "160900359"
	)
	void method548(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 424
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 425
			if (var5 != null && var5.length != 0) { // L: 426
				WorldMapDecoration[] var6 = var5; // L: 430

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 431
					WorldMapDecoration var8 = var6[var7]; // L: 432
					if (FriendLoginUpdate.method5290(var8.decoration)) { // L: 434
						ObjectComposition var9 = WorldMapDecoration.getObjectDefinition(var8.objectDefinitionId); // L: 435
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 436
						if (var8.decoration == WorldMapDecorationType.field2761.id) { // L: 437
							this.method503(var1, var2, var8.rotation, var10); // L: 438
						}

						if (var8.decoration == WorldMapDecorationType.field2746.id) { // L: 440
							this.method503(var1, var2, var8.rotation, -3355444); // L: 441
							this.method503(var1, var2, var8.rotation + 1, var10); // L: 442
						}

						if (var8.decoration == WorldMapDecorationType.field2747.id) { // L: 444
							if (var8.rotation == 0) { // L: 445
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 446
							}

							if (var8.rotation == 2) { // L: 447
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 448
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2748.id) { // L: 450
							int var11 = var8.rotation % 2; // L: 451
							int var12;
							if (var11 == 0) { // L: 452
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 453
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 454
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 458
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 459
								}
							}
						}
					}
				}
			}
		}

	} // L: 468

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1579796963"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 471
		float var6 = var5 / 2.0F; // L: 472
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 473

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 474
			Coord var9 = (Coord)var8.getKey(); // L: 476
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 477
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 478
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 479
			if (var12 != null && var12.hasValidElement()) { // L: 480
				var12.screenX = var10; // L: 481
				var12.screenY = var11; // L: 482
				WorldMapElement var13 = UserComparator10.WorldMapElement_get(var12.getElement()); // L: 483
				if (!var3.contains(var13.getObjectId())) { // L: 484
					this.method493(var12, var10, var11, var5); // L: 485
				}
			}
		}

	} // L: 490

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1282937551"
	)
	void method491(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 493

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 494
			if (var5.hasValidElement()) { // L: 496
				WorldMapElement var6 = UserComparator10.WorldMapElement_get(var5.getElement()); // L: 497
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 498
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 499
				}
			}
		}

	} // L: 503

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Liy;IIIII)V",
		garbageValue = "1953515805"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 506
		if (var6 != null) { // L: 507
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 510
			if (var4 % var5 < var5 / 2) { // L: 511
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 512
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 513
			}

		}
	} // L: 508 515

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lap;IIFI)V",
		garbageValue = "66792937"
	)
	void method493(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = UserComparator10.WorldMapElement_get(var1.getElement()); // L: 518
		this.method494(var5, var2, var3); // L: 519
		this.method580(var1, var5, var2, var3, var4); // L: 520
	} // L: 521

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Liy;IIB)V",
		garbageValue = "0"
	)
	void method494(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 524
		if (var4 != null) { // L: 525
			int var5 = this.method497(var4, var1.horizontalAlignment); // L: 526
			int var6 = this.method498(var4, var1.verticalAlignment); // L: 527
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 528
		}

	} // L: 530

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lap;Liy;IIFB)V",
		garbageValue = "19"
	)
	void method580(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 533
		if (var6 != null) { // L: 534
			if (var6.size.method254(var5)) { // L: 537
				Font var7 = (Font)this.fonts.get(var6.size); // L: 540
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3251, 0, 1, 0, var7.ascent / 2); // L: 541
			}
		}
	} // L: 535 538 542

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-907563765"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 545
		Iterator var6 = this.icon0List.iterator(); // L: 546

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 547
			if (var7.hasValidElement()) { // L: 549
				int var8 = var7.coord2.x % 64; // L: 550
				int var9 = var7.coord2.y % 64; // L: 551
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 552
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 553
				if (!var3.contains(var7.getElement())) { // L: 554
					this.method493(var7, var7.screenX, var7.screenY, var5); // L: 557
				}
			}
		}

	} // L: 560

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llm;Ljt;I)I",
		garbageValue = "-1268952607"
	)
	int method497(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 563
		case 1:
			return -var1.subWidth / 2; // L: 570
		case 2:
			return 0; // L: 574
		default:
			return -var1.subWidth; // L: 566
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llm;Lit;S)I",
		garbageValue = "-11626"
	)
	int method498(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 580
		case 1:
			return 0; // L: 583
		case 2:
			return -var1.subHeight / 2; // L: 587
		default:
			return -var1.subHeight; // L: 591
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lah;",
		garbageValue = "-951001387"
	)
	WorldMapLabel method474(int var1) {
		WorldMapElement var2 = UserComparator10.WorldMapElement_get(var1); // L: 597
		return this.createMapLabel(var2); // L: 598
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Liy;I)Lah;",
		garbageValue = "-1657578860"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 602
			int var3 = var1.textSize; // L: 606
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small}; // L: 611
			WorldMapLabelSize[] var5 = var4; // L: 613
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 624
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 615
				if (var3 == var7.field133) { // L: 617
					var2 = var7; // L: 618
					break;
				}

				++var6; // L: 614
			}

			if (var2 == null) { // L: 627
				return null; // L: 628
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 630
				if (var14 == null) { // L: 631
					return null; // L: 632
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 634
					String[] var15 = new String[var6]; // L: 635
					var14.breakLines(var1.name, (int[])null, var15); // L: 636
					int var8 = var15.length * var14.ascent / 2; // L: 637
					int var9 = 0; // L: 638
					String[] var10 = var15; // L: 640

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 641
						String var12 = var10[var11]; // L: 642
						int var13 = var14.stringWidth(var12); // L: 644
						if (var13 > var9) { // L: 645
							var9 = var13; // L: 646
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 651
				}
			}
		} else {
			return null; // L: 603
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-1578345699"
	)
	List method501(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 655
		if (var4 >= var1 && var5 >= var2) { // L: 656
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 657
				Iterator var7 = this.iconMap.values().iterator(); // L: 658

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 659
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 661
						var6.add(var8); // L: 662
					}
				}

				var7 = this.icon0List.iterator(); // L: 666

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 667
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 669
						var6.add(var8); // L: 670
					}
				}

				return var6; // L: 674
			} else {
				return var6; // L: 665
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "1048345279"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 678
		var1.addAll(this.icon0List); // L: 679
		var1.addAll(this.iconMap.values()); // L: 680
		return var1; // L: 681
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-660950240"
	)
	void method503(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 685
		if (var3 == 0) { // L: 686
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 687
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 688
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 689
		}

	} // L: 690

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lmy;",
		garbageValue = "-1411778137"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 183
		if (var3.exists()) { // L: 184
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 186
				return var10; // L: 187
			} catch (IOException var9) { // L: 189
			}
		}

		String var4 = ""; // L: 191
		if (JagexCache.cacheGamebuild == 33) { // L: 192
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 193
			var4 = "_wip";
		}

		File var5 = new File(ItemLayer.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 194
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 195
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 197
				return var6; // L: 198
			} catch (IOException var8) { // L: 200
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 203
			return var6; // L: 204
		} catch (IOException var7) { // L: 206
			throw new RuntimeException(); // L: 207
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1183681872"
	)
	public static void method588() {
		class206.midiPcmStream.clear(); // L: 36
		class206.musicPlayerStatus = 1; // L: 37
		Varps.musicTrackArchive = null; // L: 38
	} // L: 39

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1426103660"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		WorldMapID.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 8506
	} // L: 8507

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIB)V",
		garbageValue = "54"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 9709
			insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 9710
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 9713
			var3 = StudioGame.Widget_getSpellActionName(var0); // L: 9714
			if (var3 != null) { // L: 9715
				insertMenuItemNoShift(var3, class23.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 9716
			}
		}

		if (var0.buttonType == 3) { // L: 9720
			insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 9721
		}

		if (var0.buttonType == 4) { // L: 9724
			insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 9725
		}

		if (var0.buttonType == 5) { // L: 9728
			insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 9729
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 9732
			insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 9733
		}

		int var4;
		int var5;
		int var6;
		int var7;
		int var15;
		if (var0.type == 2) { // L: 9736
			var15 = 0; // L: 9737

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 9738
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 9739
					var6 = (var0.paddingX + 32) * var5; // L: 9740
					var7 = (var0.paddingY + 32) * var4; // L: 9741
					if (var15 < 20) { // L: 9742
						var6 += var0.inventoryXOffsets[var15]; // L: 9743
						var7 += var0.inventoryYOffsets[var15]; // L: 9744
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 9746
						Client.dragItemSlotDestination = var15; // L: 9747
						Occluder.hoveredItemContainer = var0; // L: 9748
						if (var0.itemIds[var15] > 0) { // L: 9749
							ItemComposition var8 = SecureRandomCallable.ItemDefinition_get(var0.itemIds[var15] - 1); // L: 9750
							if (Client.isItemSelected == 1 && class52.method844(FaceNormal.getWidgetFlags(var0))) { // L: 9751
								if (var0.id != WorldMapLabelSize.selectedItemWidget || var15 != ChatChannel.selectedItemSlot) { // L: 9752
									insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id); // L: 9753
								}
							} else if (Client.isSpellSelected && class52.method844(FaceNormal.getWidgetFlags(var0))) { // L: 9757
								if ((Player.selectedSpellFlags & 16) == 16) { // L: 9758
									insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id); // L: 9759
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 9764
								int var10 = -1; // L: 9765
								if (Client.shiftClickDrop && class169.method3529()) { // L: 9766
									var10 = var8.getShiftClickIndex(); // L: 9767
								}

								if (class52.method844(FaceNormal.getWidgetFlags(var0))) { // L: 9769
									for (int var11 = 4; var11 >= 3; --var11) { // L: 9770
										if (var11 != var10) { // L: 9771
											class7.addWidgetItemMenuItem(var0, var8, var15, var11, false); // L: 9772
										}
									}
								}

								int var12 = FaceNormal.getWidgetFlags(var0); // L: 9776
								boolean var22 = (var12 >> 31 & 1) != 0; // L: 9778
								if (var22) { // L: 9780
									insertMenuItemNoShift("Use", class23.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id); // L: 9781
								}

								Object var10000 = null; // L: 9784
								int var13;
								if (class52.method844(FaceNormal.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) { // L: 9785
										if (var10 != var13) { // L: 9786
											class7.addWidgetItemMenuItem(var0, var8, var15, var13, false); // L: 9787
										}
									}

									if (var10 >= 0) { // L: 9789
										class7.addWidgetItemMenuItem(var0, var8, var15, var10, true); // L: 9790
									}
								}

								var9 = var0.itemActions; // L: 9793
								if (var9 != null) { // L: 9794
									for (var13 = 4; var13 >= 0; --var13) { // L: 9795
										if (var9[var13] != null) { // L: 9796
											byte var14 = 0; // L: 9797
											if (var13 == 0) { // L: 9798
												var14 = 39;
											}

											if (var13 == 1) { // L: 9799
												var14 = 40;
											}

											if (var13 == 2) { // L: 9800
												var14 = 41;
											}

											if (var13 == 3) { // L: 9801
												var14 = 42;
											}

											if (var13 == 4) { // L: 9802
												var14 = 43;
											}

											insertMenuItemNoShift(var9[var13], class23.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id); // L: 9803
										}
									}
								}

								insertMenuItemNoShift("Examine", class23.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id); // L: 9808
							}
						}
					}

					++var15; // L: 9813
				}
			}
		}

		if (var0.isIf3) { // L: 9817
			if (Client.isSpellSelected) { // L: 9818
				if (Decimator.method2598(FaceNormal.getWidgetFlags(var0)) && (Player.selectedSpellFlags & 32) == 32) { // L: 9819
					insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 9820
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) { // L: 9825
					var6 = FaceNormal.getWidgetFlags(var0); // L: 9829
					boolean var20 = (var6 >> var15 + 1 & 1) != 0; // L: 9831
					String var18;
					if (!var20 && var0.onOp == null) { // L: 9833
						var18 = null; // L: 9834
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) { // L: 9837
						var18 = var0.actions[var15]; // L: 9841
					} else {
						var18 = null; // L: 9838
					}

					if (var18 != null) { // L: 9844
						insertMenuItemNoShift(var18, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id); // L: 9845
					}
				}

				var3 = StudioGame.Widget_getSpellActionName(var0); // L: 9849
				if (var3 != null) { // L: 9850
					insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 9851
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 9854
					var7 = FaceNormal.getWidgetFlags(var0); // L: 9858
					boolean var21 = (var7 >> var4 + 1 & 1) != 0; // L: 9860
					String var16;
					if (!var21 && var0.onOp == null) { // L: 9862
						var16 = null; // L: 9863
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 9866
						var16 = var0.actions[var4]; // L: 9870
					} else {
						var16 = null; // L: 9867
					}

					if (var16 != null) { // L: 9873
						WorldMapID.insertMenuItem(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 9874
					}
				}

				var5 = FaceNormal.getWidgetFlags(var0); // L: 9879
				boolean var19 = (var5 & 1) != 0; // L: 9881
				if (var19) { // L: 9883
					insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 9884
				}
			}
		}

	} // L: 9889

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1135522977"
	)
	static void method589(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 11045
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 11046
				var1.remove(); // L: 11047
			}
		}

	} // L: 11050
}
