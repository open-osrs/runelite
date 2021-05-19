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

@ObfuscatedName("fm")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 450419663
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1693190573
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("b")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -384570115
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1826350773
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("x")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("k")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("r")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1;
		this.regionY = var2;
		this.worldMapData1List = new LinkedList();
		this.icon0List = new LinkedList(); // L: 51
		this.iconMap = new HashMap(); // L: 52
		this.backgroundColor = var3 | -16777216;
		this.fonts = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-923028723"
	)
	void method3271(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 59
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		DemotingHashTable var8 = WorldMapRegion_cachedSprites;
		long var9 = (long)(var7 << 16 | var5 << 8 | var6);
		SpritePixels var4 = (SpritePixels)var8.get(var9); // L: 68
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) { // L: 72
				var4.drawAt(var1, var2); // L: 73
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 76
			}

		}
	} // L: 71 78

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lfh;Ljava/util/List;I)V",
		garbageValue = "-1532393491"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 81
		this.worldMapData_0 = var1; // L: 82
		this.addAllToIconList(var2); // L: 83
	} // L: 84

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "55"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 87
		Iterator var3 = var1.iterator(); // L: 88

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 89
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 91
				this.worldMapData1List.add(var4); // L: 92
			}
		}

		this.addAllToIconList(var2); // L: 96
	} // L: 97

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIILfw;B)V",
		garbageValue = "-114"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 100
			label49:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 101
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 102
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 103
					if (var9 != null && var9.length != 0) { // L: 104
						WorldMapDecoration[] var10 = var9; // L: 108

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 109
							WorldMapDecoration var12 = var10[var11]; // L: 110
							ObjectComposition var13 = AttackOption.getObjectDefinition(var12.objectDefinitionId); // L: 112
							if (class13.method204(var13)) { // L: 113
								this.getIcon(var13, var8, var6, var7, var5); // L: 116
								continue label49; // L: 117
							}
						}
					}
				}
			}
		}

	} // L: 124

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIILfw;B)V",
		garbageValue = "1"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 127
		Coord var7 = null; // L: 128
		if (this.worldMapData_0 != null) { // L: 129
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 130
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 133
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 134
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 137
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 138
		} else {
			var9 = WorldMapAreaData.WorldMapElement_get(var1.mapIconId); // L: 141
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 142
		}

		var9 = WorldMapAreaData.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 144
		if (var9.field1557) { // L: 145
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 146
		}

	} // L: 148

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1777749852"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 151

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 152
			if (var2 instanceof WorldMapIcon_1) { // L: 154
				((WorldMapIcon_1)var2).init(); // L: 155
			}
		}

	} // L: 159

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1899161773"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 162

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 163
			if (WorldMapAreaData.WorldMapElement_get(var3.element).field1557 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 165 168
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method3283(var3.element)); // L: 169
				this.icon0List.add(var4); // L: 170
			}
		}

	} // L: 174

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1381206848"
	)
	void method3361() {
		if (this.worldMapData_0 != null) { // L: 177
			this.worldMapData_0.reset(); // L: 178
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 181

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 182
				var2.reset(); // L: 184
			}
		}

	} // L: 188

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)Z",
		garbageValue = "1351055595"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 191
		if (this.worldMapData_0 != null) { // L: 192
			this.worldMapData_0.loadGeography(var1); // L: 193
			if (this.worldMapData_0.isFullyLoaded()) { // L: 194
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 195
				return true; // L: 196
			} else {
				return false; // L: 198
			}
		} else {
			boolean var2 = true; // L: 201

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 202 206
				var4 = (WorldMapData_1)var3.next(); // L: 203
				var4.loadGeography(var1); // L: 205
			}

			if (var2) { // L: 209
				var3 = this.worldMapData1List.iterator(); // L: 210

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 211
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 213
				}
			}

			return var2; // L: 217
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILgp;[Lof;Ljp;Ljp;I)V",
		garbageValue = "-1222887351"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 222
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 223
			int var7 = this.regionX; // L: 227
			int var8 = this.regionY; // L: 228
			DemotingHashTable var9 = WorldMapRegion_cachedSprites; // L: 230
			long var10 = (long)(var1 << 16 | var7 << 8 | var8); // L: 233
			SpritePixels var6 = (SpritePixels)var9.get(var10); // L: 235
			if (var6 == null) { // L: 237
				boolean var14 = true; // L: 240
				var14 &= this.loadGeography(var4); // L: 241
				int var11;
				if (this.worldMapData_0 != null) { // L: 244
					var11 = this.worldMapData_0.groupId; // L: 245
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 248
				}

				var14 &= var5.tryLoadGroup(var11); // L: 250
				if (var14) { // L: 251
					byte[] var15 = var5.takeFileFlat(var11); // L: 252
					WorldMapSprite var12 = WorldMapSectionType.method3540(var15); // L: 253
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 254
					var13.setRaster(); // L: 255
					if (this.worldMapData_0 != null) { // L: 256
						this.method3284(var2, var3, var12); // L: 257
					} else {
						this.method3285(var2, var3, var12); // L: 260
					}

					FloorOverlayDefinition.method3052(var13, this.regionX, this.regionY, this.pixelsPerTile); // L: 262
					this.method3361(); // L: 263
				}
			}
		}
	} // L: 224 238 264

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "2047114965"
	)
	void method3282(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 267
			var4 = new HashSet(); // L: 268
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 270
		this.drawMapLinks(var1, var2, var4, var3); // L: 271
	} // L: 272

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1306417176"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 275

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 276
			if (var5.hasValidElement()) { // L: 278
				int var6 = var5.getElement(); // L: 279
				if (var1.contains(var6)) { // L: 280
					WorldMapElement var7 = WorldMapAreaData.WorldMapElement_get(var6); // L: 281
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 282
				}
			}
		}

		this.method3293(var1, var2, var3); // L: 286
	} // L: 287

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgp;[Lof;Lfu;I)V",
		garbageValue = "1457996080"
	)
	void method3284(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 290
			for (var5 = 0; var5 < 64; ++var5) { // L: 291
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 292
				this.method3356(var4, var5, this.worldMapData_0, var1); // L: 293
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 296
			for (var5 = 0; var5 < 64; ++var5) { // L: 297
				this.method3286(var4, var5, this.worldMapData_0, var1, var2); // L: 298
			}
		}

	} // L: 301

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lgp;[Lof;Lfu;B)V",
		garbageValue = "43"
	)
	void method3285(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 304

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 305

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 307
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 308
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 309
					this.method3356(var6, var7, var5, var1); // L: 310
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 315

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 316

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 318
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 319
					this.method3286(var6, var7, var5, var1, var2); // L: 320
				}
			}
		}

	} // L: 325

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lgp;[Lof;B)V",
		garbageValue = "16"
	)
	void method3286(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method3291(var1, var2, var3); // L: 328
		this.method3288(var1, var2, var3, var5); // L: 329
	} // L: 330

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lgp;Lfu;B)V",
		garbageValue = "9"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 333
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 334
		if (var6 == -1 && var7 == -1) { // L: 335
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 336
		}

		int var8 = 16711935; // L: 338
		if (var7 != -1) { // L: 339
			var8 = ReflectionCheck.method1158(var7, this.backgroundColor); // L: 340
		}

		if (var7 > -1 && var3.field2063[0][var1][var2] == 0) { // L: 342
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 343
		} else {
			int var9 = this.method3289(var1, var2, var3, var5); // L: 346
			if (var7 == -1) { // L: 347
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 348
			} else {
				var4.method3676(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2063[0][var1][var2], var3.field2064[0][var1][var2]); // L: 351
			}
		}
	} // L: 344 349 352

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lgp;I)V",
		garbageValue = "-988381059"
	)
	void method3356(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 355
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 356
			if (var6 > -1) { // L: 357
				int var7 = ReflectionCheck.method1158(var6, this.backgroundColor); // L: 358
				if (var3.field2063[var5][var1][var2] == 0) { // L: 359
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 360
				} else {
					var4.method3676(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2063[var5][var1][var2], var3.field2064[var5][var1][var2]); // L: 363
				}
			}
		}

	} // L: 367

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lfu;I)I",
		garbageValue = "-947933969"
	)
	int method3289(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 370 371 373
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILfw;[Lof;I)V",
		garbageValue = "2119156323"
	)
	void method3288(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 377
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 378
			if (var6 != null && var6.length != 0) { // L: 379
				WorldMapDecoration[] var7 = var6; // L: 383

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 384
					WorldMapDecoration var9 = var7[var8]; // L: 385
					int var11 = var9.decoration; // L: 388
					boolean var10 = var11 >= WorldMapDecorationType.field3165.id && var11 <= WorldMapDecorationType.field3151.id; // L: 390
					if (var10 || method3399(var9.decoration)) { // L: 392
						ObjectComposition var12 = AttackOption.getObjectDefinition(var9.objectDefinitionId); // L: 393
						if (var12.mapSceneId != -1) { // L: 394
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 395
								var4[var12.mapSceneId].method6846(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 399
							} else {
								var4[var12.mapSceneId].method6846(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 396
							}
						}
					}
				}
			}
		}

	} // L: 407

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILfw;I)V",
		garbageValue = "994519782"
	)
	void method3291(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 410
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 411
			if (var5 != null && var5.length != 0) { // L: 412
				WorldMapDecoration[] var6 = var5; // L: 416

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 417
					WorldMapDecoration var8 = var6[var7]; // L: 418
					if (WorldMapRectangle.method3569(var8.decoration)) { // L: 420
						ObjectComposition var9 = AttackOption.getObjectDefinition(var8.objectDefinitionId); // L: 421
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 422
						if (var8.decoration == WorldMapDecorationType.field3159.id) { // L: 423
							this.method3305(var1, var2, var8.rotation, var10); // L: 424
						}

						if (var8.decoration == WorldMapDecorationType.field3164.id) { // L: 426
							this.method3305(var1, var2, var8.rotation, -3355444); // L: 427
							this.method3305(var1, var2, var8.rotation + 1, var10); // L: 428
						}

						if (var8.decoration == WorldMapDecorationType.field3148.id) { // L: 430
							if (var8.rotation == 0) { // L: 431
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 432
							}

							if (var8.rotation == 2) { // L: 433
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 434
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3162.id) { // L: 436
							int var11 = var8.rotation % 2; // L: 437
							int var12;
							if (var11 == 0) { // L: 438
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 439
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 440
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 444
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 445
								}
							}
						}
					}
				}
			}
		}

	} // L: 454

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1579381896"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 457
		float var6 = var5 / 2.0F; // L: 458
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 459

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 460
			Coord var9 = (Coord)var8.getKey(); // L: 462
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 463
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 464
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 465
			if (var12 != null && var12.hasValidElement()) { // L: 466
				var12.screenX = var10; // L: 467
				var12.screenY = var11; // L: 468
				WorldMapElement var13 = WorldMapAreaData.WorldMapElement_get(var12.getElement()); // L: 469
				if (!var3.contains(var13.getObjectId())) { // L: 470
					this.method3295(var12, var10, var11, var5); // L: 471
				}
			}
		}

	} // L: 476

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIS)V",
		garbageValue = "-3432"
	)
	void method3293(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 479

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 480
			if (var5.hasValidElement()) { // L: 482
				WorldMapElement var6 = WorldMapAreaData.WorldMapElement_get(var5.getElement()); // L: 483
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 484
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 485
				}
			}
		}

	} // L: 489

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Let;IIIII)V",
		garbageValue = "-1558532242"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 492
		if (var6 != null) { // L: 493
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 496
			if (var4 % var5 < var5 / 2) { // L: 497
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 498
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 499
			}

		}
	} // L: 494 501

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgw;IIFI)V",
		garbageValue = "-615214658"
	)
	void method3295(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = WorldMapAreaData.WorldMapElement_get(var1.getElement()); // L: 504
		this.method3296(var5, var2, var3); // L: 505
		this.method3297(var1, var5, var2, var3, var4); // L: 506
	} // L: 507

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Let;IIB)V",
		garbageValue = "-27"
	)
	void method3296(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 510
		if (var4 != null) { // L: 511
			int var5 = this.method3299(var4, var1.horizontalAlignment); // L: 512
			int var6 = this.method3384(var4, var1.verticalAlignment); // L: 513
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 514
		}

	} // L: 516

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgw;Let;IIFS)V",
		garbageValue = "-25727"
	)
	void method3297(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 519
		if (var6 != null) { // L: 520
			if (var6.size.method3154(var5)) { // L: 523
				Font var7 = (Font)this.fonts.get(var6.size); // L: 526
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1570, 0, 1, 0, var7.ascent / 2); // L: 527
			}
		}
	} // L: 521 524 528

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1464580667"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 531
		Iterator var6 = this.icon0List.iterator(); // L: 532

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 533
			if (var7.hasValidElement()) { // L: 535
				int var8 = var7.coord2.x % 64; // L: 536
				int var9 = var7.coord2.y % 64; // L: 537
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 538
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5); // L: 539
				if (!var3.contains(var7.getElement())) { // L: 540
					this.method3295(var7, var7.screenX, var7.screenY, var5); // L: 543
				}
			}
		}

	} // L: 546

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Low;Leg;I)I",
		garbageValue = "866674988"
	)
	int method3299(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 549
		case 0:
			return 0; // L: 552
		case 1:
			return -var1.subWidth / 2; // L: 556
		default:
			return -var1.subWidth; // L: 560
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Low;Lex;I)I",
		garbageValue = "-387662899"
	)
	int method3384(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 566
		case 0:
			return -var1.subHeight / 2; // L: 569
		case 1:
			return 0; // L: 577
		default:
			return -var1.subHeight; // L: 573
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "1828067299"
	)
	WorldMapLabel method3283(int var1) {
		WorldMapElement var2 = WorldMapAreaData.WorldMapElement_get(var1); // L: 604
		return this.createMapLabel(var2); // L: 605
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Let;I)Lfl;",
		garbageValue = "2136255067"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 609
			WorldMapLabelSize var2 = WorldMapLabelSize.method3162(var1.textSize); // L: 612
			if (var2 == null) { // L: 613
				return null; // L: 614
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 616
				if (var3 == null) { // L: 617
					return null; // L: 618
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 620
					String[] var5 = new String[var4]; // L: 621
					var3.breakLines(var1.name, (int[])null, var5); // L: 622
					int var6 = var5.length * var3.ascent / 2; // L: 623
					int var7 = 0; // L: 624
					String[] var8 = var5; // L: 626

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 627
						String var10 = var8[var9]; // L: 628
						int var11 = var3.stringWidth(var10); // L: 630
						if (var11 > var7) { // L: 631
							var7 = var11; // L: 632
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 637
				}
			}
		} else {
			return null; // L: 610
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-79"
	)
	List method3303(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 641
		if (var4 >= var1 && var5 >= var2) { // L: 642
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 643
				Iterator var7 = this.iconMap.values().iterator(); // L: 644

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 645
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 647
						var6.add(var8); // L: 648
					}
				}

				var7 = this.icon0List.iterator(); // L: 652

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 653
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 655
						var6.add(var8); // L: 656
					}
				}

				return var6; // L: 660
			} else {
				return var6; // L: 651
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "0"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 664
		var1.addAll(this.icon0List); // L: 665
		var1.addAll(this.iconMap.values()); // L: 666
		return var1; // L: 667
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-74"
	)
	void method3305(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 671
		if (var3 == 0) { // L: 672
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 673
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 674
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 675
		}

	} // L: 676

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lll;",
		garbageValue = "-1392612014"
	)
	static PrivateChatMode[] method3351() {
		return new PrivateChatMode[]{PrivateChatMode.field3901, PrivateChatMode.field3899, PrivateChatMode.field3900}; // L: 11
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1838028405"
	)
	public static void method3397(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "4"
	)
	public static boolean method3399(int var0) {
		return var0 == WorldMapDecorationType.field3167.id; // L: 46
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "680595351"
	)
	static void method3317(int var0, int var1) {
		int var2 = WorldMapArea.fontBold12.stringWidth("Choose Option"); // L: 8027

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8028
			Font var7 = WorldMapArea.fontBold12; // L: 8029
			String var8;
			if (var3 < 0) { // L: 8032
				var8 = ""; // L: 8033
			} else if (Client.menuTargets[var3].length() > 0) { // L: 8036
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 8037
			}

			int var6 = var7.stringWidth(var8); // L: 8039
			if (var6 > var2) { // L: 8040
				var2 = var6;
			}
		}

		var2 += 8; // L: 8042
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8043
		int var4 = var0 - var2 / 2; // L: 8044
		if (var4 + var2 > GameEngine.canvasWidth) { // L: 8045
			var4 = GameEngine.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8046
			var4 = 0;
		}

		int var5 = var1; // L: 8047
		if (var1 + var3 > HealthBarDefinition.canvasHeight) { // L: 8048
			var5 = HealthBarDefinition.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8049
			var5 = 0;
		}

		AbstractByteArrayCopier.menuX = var4; // L: 8050
		HitSplatDefinition.menuY = var5; // L: 8051
		SoundCache.menuWidth = var2; // L: 8052
		GrandExchangeOfferOwnWorldComparator.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 8053
	} // L: 8054
}
