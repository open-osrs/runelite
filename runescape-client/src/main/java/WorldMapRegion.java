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

@ObfuscatedName("hw")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1430773617
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1183220227
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("n")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 590178605
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -90451331
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("v")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("d")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("h")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 52
		this.regionY = var2; // L: 53
		this.worldMapData1List = new LinkedList(); // L: 54
		this.icon0List = new LinkedList(); // L: 55
		this.iconMap = new HashMap(); // L: 56
		this.backgroundColor = var3 | -16777216; // L: 57
		this.fonts = var4; // L: 58
	} // L: 59

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "24"
	)
	void method4492(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 63
		int var6 = this.regionY; // L: 64
		int var7 = this.pixelsPerTile; // L: 65
		DemotingHashTable var8 = WorldMapRegion_cachedSprites; // L: 67
		long var9 = (long)(var7 << 16 | var5 << 8 | var6); // L: 70
		SpritePixels var4 = (SpritePixels)var8.get(var9); // L: 72
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) { // L: 76
				var4.drawAt(var1, var2); // L: 77
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 80
			}

		}
	} // L: 75 82

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhn;Ljava/util/List;I)V",
		garbageValue = "392577775"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 85
		this.worldMapData_0 = var1; // L: 86
		this.addAllToIconList(var2); // L: 87
	} // L: 88

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-763221367"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 91
		Iterator var3 = var1.iterator(); // L: 92

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 93
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 95
				this.worldMapData1List.add(var4); // L: 96
			}
		}

		this.addAllToIconList(var2); // L: 100
	} // L: 101

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIILhz;I)V",
		garbageValue = "826516683"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 104
			label75:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 105
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 106
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 107
					if (var9 != null && var9.length != 0) { // L: 108
						WorldMapDecoration[] var10 = var9; // L: 112

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 113
							ObjectComposition var13;
							boolean var14;
							label66: {
								WorldMapDecoration var12 = var10[var11]; // L: 114
								var13 = class148.getObjectDefinition(var12.objectDefinitionId); // L: 116
								if (var13.transforms != null) { // L: 119
									int[] var15 = var13.transforms; // L: 121

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 122
										int var17 = var15[var16]; // L: 123
										ObjectComposition var18 = class148.getObjectDefinition(var17); // L: 125
										if (var18.mapIconId != -1) { // L: 126
											var14 = true; // L: 127
											break label66;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 134
									var14 = true; // L: 135
									break label66; // L: 136
								}

								var14 = false; // L: 138
							}

							if (var14) { // L: 140
								this.getIcon(var13, var8, var6, var7, var5); // L: 143
								continue label75; // L: 144
							}
						}
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IIILhz;I)V",
		garbageValue = "-501099981"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 154
		Coord var7 = null; // L: 155
		if (this.worldMapData_0 != null) { // L: 156
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 157
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 160
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 161
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 164
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 165
		} else {
			var9 = class78.WorldMapElement_get(var1.mapIconId); // L: 168
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 169
		}

		var9 = class78.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 171
		if (var9.field1758) { // L: 172
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 173
		}

	} // L: 175

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1131881199"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 178

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 179
			if (var2 instanceof WorldMapIcon_1) { // L: 181
				((WorldMapIcon_1)var2).init(); // L: 182
			}
		}

	} // L: 186

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1992457391"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 189

		while (var2.hasNext()) { // L: 193
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 190
			if (class78.WorldMapElement_get(var3.element).field1758 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 192 195
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4551(var3.element)); // L: 196
				this.icon0List.add(var4); // L: 197
			}
		}

	} // L: 201

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1724854251"
	)
	void method4499() {
		if (this.worldMapData_0 != null) { // L: 204
			this.worldMapData_0.reset(); // L: 205
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 208

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 209
				var2.reset(); // L: 211
			}
		}

	} // L: 215

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lku;S)Z",
		garbageValue = "17548"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 218
		if (this.worldMapData_0 != null) { // L: 219
			this.worldMapData_0.loadGeography(var1); // L: 220
			if (this.worldMapData_0.isFullyLoaded()) { // L: 221
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 222
				return true; // L: 223
			} else {
				return false; // L: 225
			}
		} else {
			boolean var2 = true; // L: 228

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 229 233
				var4 = (WorldMapData_1)var3.next(); // L: 230
				var4.loadGeography(var1); // L: 232
			}

			if (var2) { // L: 236
				var3 = this.worldMapData1List.iterator(); // L: 237

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 238
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 240
				}
			}

			return var2; // L: 244
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILig;[Lpa;Lku;Lku;I)V",
		garbageValue = "619477379"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 249
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 250
			int var7 = this.regionX; // L: 254
			int var8 = this.regionY; // L: 255
			DemotingHashTable var9 = WorldMapRegion_cachedSprites; // L: 257
			long var10 = (long)(var1 << 16 | var7 << 8 | var8); // L: 260
			SpritePixels var6 = (SpritePixels)var9.get(var10); // L: 262
			if (var6 == null) { // L: 264
				boolean var15 = true; // L: 267
				var15 &= this.loadGeography(var4); // L: 268
				int var11;
				if (this.worldMapData_0 != null) { // L: 271
					var11 = this.worldMapData_0.groupId; // L: 272
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 275
				}

				var15 &= var5.tryLoadGroup(var11); // L: 277
				if (var15) { // L: 278
					byte[] var16 = var5.takeFileFlat(var11); // L: 279
					WorldMapSprite var12;
					if (var16 == null) { // L: 282
						var12 = new WorldMapSprite(); // L: 283
					} else {
						var12 = new WorldMapSprite(MouseRecorder.method2161(var16).pixels); // L: 286
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 289
					var14.setRaster(); // L: 290
					if (this.worldMapData_0 != null) { // L: 291
						this.method4561(var2, var3, var12); // L: 292
					} else {
						this.method4566(var2, var3, var12); // L: 295
					}

					ArchiveDiskAction.method5526(var14, this.regionX, this.regionY, this.pixelsPerTile); // L: 297
					this.method4499(); // L: 298
				}
			}
		}
	} // L: 251 265 299

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "-83"
	)
	void method4588(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 302
			var4 = new HashSet(); // L: 303
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 305
		this.drawMapLinks(var1, var2, var4, var3); // L: 306
	} // L: 307

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1818539814"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 310

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 311
			if (var5.hasValidElement()) { // L: 313
				int var6 = var5.getElement(); // L: 314
				if (var1.contains(var6)) { // L: 315
					WorldMapElement var7 = class78.WorldMapElement_get(var6); // L: 316
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 317
				}
			}
		}

		this.method4512(var1, var2, var3); // L: 321
	} // L: 322

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lig;[Lpa;Lhq;I)V",
		garbageValue = "180589965"
	)
	void method4561(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 325
			for (var5 = 0; var5 < 64; ++var5) { // L: 326
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 327
				this.method4507(var4, var5, this.worldMapData_0, var1); // L: 328
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 331
			for (var5 = 0; var5 < 64; ++var5) { // L: 332
				this.method4505(var4, var5, this.worldMapData_0, var1, var2); // L: 333
			}
		}

	} // L: 336

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lig;[Lpa;Lhq;I)V",
		garbageValue = "1976683107"
	)
	void method4566(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 339

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 340

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 342
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 343
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 344
					this.method4507(var6, var7, var5, var1); // L: 345
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 350

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 351

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 353
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 354
					this.method4505(var6, var7, var5, var1, var2); // L: 355
				}
			}
		}

	} // L: 360

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lig;[Lpa;I)V",
		garbageValue = "-1372993512"
	)
	void method4505(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4510(var1, var2, var3); // L: 363
		this.method4509(var1, var2, var3, var5); // L: 364
	} // L: 365

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lig;Lhq;I)V",
		garbageValue = "1507550490"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 368
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 369
		if (var6 == -1 && var7 == -1) { // L: 370
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 371
		}

		int var8 = 16711935; // L: 373
		if (var7 != -1) { // L: 374
			var8 = Actor.method2235(var7, this.backgroundColor); // L: 375
		}

		if (var7 > -1 && var3.field2699[0][var1][var2] == 0) { // L: 377
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 378
		} else {
			int var9 = this.method4508(var1, var2, var3, var5); // L: 381
			if (var7 == -1) { // L: 382
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 383
			} else {
				var4.method4907(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2699[0][var1][var2], var3.field2706[0][var1][var2]); // L: 386
			}
		}
	} // L: 379 384 387

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lig;I)V",
		garbageValue = "-1920100331"
	)
	void method4507(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 390
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 391
			if (var6 > -1) { // L: 392
				int var7 = Actor.method2235(var6, this.backgroundColor); // L: 393
				if (var3.field2699[var5][var1][var2] == 0) { // L: 394
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 395
				} else {
					var4.method4907(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2699[var5][var1][var2], var3.field2706[var5][var1][var2]); // L: 398
				}
			}
		}

	} // L: 402

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lhq;I)I",
		garbageValue = "-2111432629"
	)
	int method4508(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 405 406 408
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILhz;[Lpa;I)V",
		garbageValue = "-1600468399"
	)
	void method4509(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 412
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 413
			if (var6 != null && var6.length != 0) { // L: 414
				WorldMapDecoration[] var7 = var6; // L: 418

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 419
					WorldMapDecoration var9 = var7[var8]; // L: 420
					int var11 = var9.decoration; // L: 423
					boolean var10 = var11 >= WorldMapDecorationType.field3402.id && var11 <= WorldMapDecorationType.field3403.id; // L: 425
					if (!var10) { // L: 428
						int var13 = var9.decoration; // L: 430
						boolean var12 = var13 == WorldMapDecorationType.field3389.id; // L: 432
						if (!var12) { // L: 434
							continue;
						}
					}

					ObjectComposition var14 = class148.getObjectDefinition(var9.objectDefinitionId); // L: 436
					if (var14.mapSceneId != -1) { // L: 437
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 438
							var4[var14.mapSceneId].method7732(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 442
						} else {
							var4[var14.mapSceneId].method7732(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 439
						}
					}
				}
			}
		}

	} // L: 450

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILhz;I)V",
		garbageValue = "1344943338"
	)
	void method4510(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 453
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 454
			if (var5 != null && var5.length != 0) { // L: 455
				WorldMapDecoration[] var6 = var5; // L: 459

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 460
					WorldMapDecoration var8 = var6[var7]; // L: 461
					if (AbstractWorldMapIcon.method4863(var8.decoration)) { // L: 463
						ObjectComposition var9 = class148.getObjectDefinition(var8.objectDefinitionId); // L: 464
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 465
						if (var8.decoration == WorldMapDecorationType.field3391.id) { // L: 466
							this.method4501(var1, var2, var8.rotation, var10); // L: 467
						}

						if (var8.decoration == WorldMapDecorationType.field3384.id) { // L: 469
							this.method4501(var1, var2, var8.rotation, -3355444); // L: 470
							this.method4501(var1, var2, var8.rotation + 1, var10); // L: 471
						}

						if (var8.decoration == WorldMapDecorationType.field3385.id) { // L: 473
							if (var8.rotation == 0) { // L: 474
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 475
							}

							if (var8.rotation == 2) { // L: 476
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 477
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3406.id) { // L: 479
							int var11 = var8.rotation % 2; // L: 480
							int var12;
							if (var11 == 0) { // L: 481
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 482
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 483
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 487
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 488
								}
							}
						}
					}
				}
			}
		}

	} // L: 497

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "470292347"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 500
		float var6 = var5 / 2.0F; // L: 501
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 502

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 503
			Coord var9 = (Coord)var8.getKey(); // L: 505
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 506
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 507
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 508
			if (var12 != null && var12.hasValidElement()) { // L: 509
				var12.screenX = var10; // L: 510
				var12.screenY = var11; // L: 511
				WorldMapElement var13 = class78.WorldMapElement_get(var12.getElement()); // L: 512
				if (!var3.contains(var13.getObjectId())) { // L: 513
					this.method4569(var12, var10, var11, var5); // L: 514
				}
			}
		}

	} // L: 519

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1160918022"
	)
	void method4512(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 522

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 523
			if (var5.hasValidElement()) { // L: 525
				WorldMapElement var6 = class78.WorldMapElement_get(var5.getElement()); // L: 526
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 527
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 528
				}
			}
		}

	} // L: 532

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfj;IIIII)V",
		garbageValue = "2034829434"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 535
		if (var6 != null) { // L: 536
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 539
			if (var4 % var5 < var5 / 2) { // L: 540
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 541
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 542
			}

		}
	} // L: 537 544

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lij;IIFB)V",
		garbageValue = "99"
	)
	void method4569(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class78.WorldMapElement_get(var1.getElement()); // L: 547
		this.method4515(var5, var2, var3); // L: 548
		this.method4516(var1, var5, var2, var3, var4); // L: 549
	} // L: 550

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfj;III)V",
		garbageValue = "980896550"
	)
	void method4515(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 553
		if (var4 != null) { // L: 554
			int var5 = this.method4518(var4, var1.horizontalAlignment); // L: 555
			int var6 = this.method4519(var4, var1.verticalAlignment); // L: 556
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 557
		}

	} // L: 559

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lij;Lfj;IIFB)V",
		garbageValue = "87"
	)
	void method4516(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 562
		if (var6 != null) { // L: 563
			if (var6.size.method4370(var5)) { // L: 566
				Font var7 = (Font)this.fonts.get(var6.size); // L: 569
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1756, 0, 1, 0, var7.ascent / 2); // L: 570
			}
		}
	} // L: 564 567 571

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "707842246"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 574
		Iterator var6 = this.icon0List.iterator(); // L: 575

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 576
			if (var7.hasValidElement()) { // L: 578
				int var8 = var7.coord2.x % 64; // L: 579
				int var9 = var7.coord2.y % 64; // L: 580
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 581
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9)); // L: 582
				if (!var3.contains(var7.getElement())) { // L: 583
					this.method4569(var7, var7.screenX, var7.screenY, var5); // L: 586
				}
			}
		}

	} // L: 589

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lfc;I)I",
		garbageValue = "-2104998727"
	)
	int method4518(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 592
		case 0:
			return 0; // L: 595
		case 2:
			return -var1.subWidth / 2; // L: 603
		default:
			return -var1.subWidth; // L: 599
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lfs;B)I",
		garbageValue = "-51"
	)
	int method4519(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 609
		case 1:
			return -var1.subHeight / 2; // L: 616
		case 2:
			return 0; // L: 620
		default:
			return -var1.subHeight; // L: 612
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lhm;",
		garbageValue = "-2073836265"
	)
	WorldMapLabel method4551(int var1) {
		WorldMapElement var2 = class78.WorldMapElement_get(var1); // L: 626
		return this.createMapLabel(var2); // L: 627
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfj;B)Lhm;",
		garbageValue = "36"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 631
			WorldMapLabelSize var2 = WorldMapLabelSize.method4362(var1.textSize); // L: 634
			if (var2 == null) { // L: 635
				return null; // L: 636
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 638
				if (var3 == null) { // L: 639
					return null; // L: 640
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 642
					String[] var5 = new String[var4]; // L: 643
					var3.breakLines(var1.name, (int[])null, var5); // L: 644
					int var6 = var5.length * var3.ascent / 2; // L: 645
					int var7 = 0; // L: 646
					String[] var8 = var5; // L: 648

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 649
						String var10 = var8[var9]; // L: 650
						int var11 = var3.stringWidth(var10); // L: 652
						if (var11 > var7) { // L: 653
							var7 = var11; // L: 654
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 659
				}
			}
		} else {
			return null; // L: 632
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "2"
	)
	List method4522(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 663
		if (var4 >= var1 && var5 >= var2) { // L: 664
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 665
				Iterator var7 = this.iconMap.values().iterator(); // L: 666

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 667
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 669
						var6.add(var8); // L: 670
					}
				}

				var7 = this.icon0List.iterator(); // L: 674

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 675
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 677
						var6.add(var8); // L: 678
					}
				}

				return var6; // L: 682
			} else {
				return var6; // L: 673
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "1841805502"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 686
		var1.addAll(this.icon0List); // L: 687
		var1.addAll(this.iconMap.values()); // L: 688
		return var1; // L: 689
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "46"
	)
	void method4501(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 693
		if (var3 == 0) { // L: 694
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 695
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 696
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 697
		}

	} // L: 698
}
