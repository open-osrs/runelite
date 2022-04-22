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

@ObfuscatedName("gd")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1770017441
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2095222453
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2124136901
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("q")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 827222531
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 465516293
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("p")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("w")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("k")
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-32"
	)
	void method4039(int var1, int var2, int var3) {
		SpritePixels var4 = UserComparator5.method2599(this.regionX, this.regionY, this.pixelsPerTile); // L: 61
		if (var4 != null) { // L: 62
			if (var3 == this.pixelsPerTile * 64) { // L: 63
				var4.drawAt(var1, var2); // L: 64
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lge;Ljava/util/List;B)V",
		garbageValue = "25"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 72
		this.worldMapData_0 = var1; // L: 73
		this.addAllToIconList(var2); // L: 74
	} // L: 75

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "674550029"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIILhz;S)V",
		garbageValue = "8217"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 91
			label50:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 92
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 93
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 94
					if (var9 != null && var9.length != 0) { // L: 95
						WorldMapDecoration[] var10 = var9; // L: 99

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 100
							WorldMapDecoration var12 = var10[var11]; // L: 101
							ObjectComposition var13 = class146.getObjectDefinition(var12.objectDefinitionId); // L: 103
							if (VerticalAlignment.method3539(var13)) { // L: 104
								this.getIcon(var13, var8, var6, var7, var5); // L: 107
								continue label50;
							}
						}
					}
				}
			}
		}

	} // L: 115

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgj;IIILhz;I)V",
		garbageValue = "-1962947985"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 118
		Coord var7 = null; // L: 119
		if (this.worldMapData_0 != null) { // L: 120
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 121
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 124
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 125
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 128
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 129
		} else {
			var9 = UserComparator7.WorldMapElement_get(var1.mapIconId); // L: 132
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 133
		}

		var9 = UserComparator7.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 135
		if (var9.field1822) { // L: 136
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 137
		}

	} // L: 139

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 142

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 143
			if (var2 instanceof WorldMapIcon_1) { // L: 145
				((WorldMapIcon_1)var2).init(); // L: 146
			}
		}

	} // L: 150

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-867806211"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 153

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 154
			if (UserComparator7.WorldMapElement_get(var3.element).field1822 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 156 159
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4082(var3.element)); // L: 160
				this.icon0List.add(var4); // L: 161
			}
		}

	} // L: 165

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	void method4046() {
		if (this.worldMapData_0 != null) { // L: 168
			this.worldMapData_0.reset(); // L: 169
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 172

			while (var1.hasNext()) { // L: 177
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 173
				var2.reset(); // L: 175
			}
		}

	} // L: 179

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)Z",
		garbageValue = "1708143981"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 182
		if (this.worldMapData_0 != null) { // L: 183
			this.worldMapData_0.loadGeography(var1); // L: 184
			if (this.worldMapData_0.isFullyLoaded()) { // L: 185
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 186
				return true; // L: 187
			} else {
				return false; // L: 189
			}
		} else {
			boolean var2 = true; // L: 192

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 193 197
				var4 = (WorldMapData_1)var3.next(); // L: 194
				var4.loadGeography(var1); // L: 196
			}

			if (var2) { // L: 200
				var3 = this.worldMapData1List.iterator(); // L: 201

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 202
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 204
				}
			}

			return var2; // L: 208
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILhx;[Lqq;Lln;Lln;I)V",
		garbageValue = "-350994346"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 213
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 214
			int var7 = this.regionX; // L: 218
			int var8 = this.regionY; // L: 219
			DemotingHashTable var9 = WorldMapRegion_cachedSprites; // L: 221
			long var10 = (long)(var1 << 16 | var7 << 8 | var8); // L: 224
			SpritePixels var6 = (SpritePixels)var9.get(var10); // L: 226
			if (var6 == null) { // L: 228
				boolean var21 = true; // L: 231
				var21 &= this.loadGeography(var4); // L: 232
				int var11;
				if (this.worldMapData_0 != null) { // L: 235
					var11 = this.worldMapData_0.groupId; // L: 236
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 239
				}

				var21 &= var5.tryLoadGroup(var11); // L: 241
				if (var21) { // L: 242
					byte[] var22 = var5.takeFileFlat(var11); // L: 243
					WorldMapSprite var12 = Interpreter.method1798(var22); // L: 244
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 245
					var13.setRaster(); // L: 246
					if (this.worldMapData_0 != null) { // L: 247
						this.method4124(var2, var3, var12); // L: 248
					} else {
						this.method4144(var2, var3, var12); // L: 251
					}

					int var14 = this.regionX; // L: 253
					int var15 = this.regionY; // L: 254
					int var16 = this.pixelsPerTile; // L: 255
					DemotingHashTable var17 = WorldMapRegion_cachedSprites; // L: 257
					long var19 = (long)(var16 << 16 | var14 << 8 | var15); // L: 261
					var17.put(var13, var19, var13.pixels.length * 4); // L: 263
					this.method4046(); // L: 265
				}
			}
		}
	} // L: 215 229 266

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "13"
	)
	void method4097(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 269
			var4 = new HashSet(); // L: 270
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 272
		this.drawMapLinks(var1, var2, var4, var3); // L: 273
	} // L: 274

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "463084567"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 277

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 278
			if (var5.hasValidElement()) { // L: 280
				int var6 = var5.getElement(); // L: 281
				if (var1.contains(var6)) { // L: 282
					WorldMapElement var7 = UserComparator7.WorldMapElement_get(var6); // L: 283
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 284
				}
			}
		}

		this.method4059(var1, var2, var3); // L: 288
	} // L: 289

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lhx;[Lqq;Lhn;S)V",
		garbageValue = "-30301"
	)
	void method4124(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 292
			for (var5 = 0; var5 < 64; ++var5) { // L: 293
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 294
				this.method4055(var4, var5, this.worldMapData_0, var1); // L: 295
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 298
			for (var5 = 0; var5 < 64; ++var5) { // L: 299
				this.method4053(var4, var5, this.worldMapData_0, var1, var2); // L: 300
			}
		}

	} // L: 303

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhx;[Lqq;Lhn;I)V",
		garbageValue = "-1984333842"
	)
	void method4144(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 306

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 307

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 309
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 310
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 311
					this.method4055(var6, var7, var5, var1); // L: 312
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 317

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 318

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 320
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 321
					this.method4053(var6, var7, var5, var1, var2); // L: 322
				}
			}
		}

	} // L: 327

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lhx;[Lqq;B)V",
		garbageValue = "-27"
	)
	void method4053(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4098(var1, var2, var3); // L: 330
		this.method4057(var1, var2, var3, var5); // L: 331
	} // L: 332

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lhx;Lhn;I)V",
		garbageValue = "-1568059728"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 335
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 336
		if (var6 == -1 && var7 == -1) { // L: 337
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 338
		}

		int var8 = 16711935; // L: 340
		if (var7 != -1) { // L: 341
			var8 = class7.method53(var7, this.backgroundColor); // L: 342
		}

		if (var7 > -1 && var3.field2334[0][var1][var2] == 0) { // L: 344
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 345
		} else {
			int var9 = this.method4056(var1, var2, var3, var5); // L: 348
			if (var7 == -1) { // L: 349
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 350
			} else {
				var4.method4461(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2334[0][var1][var2], var3.field2342[0][var1][var2]); // L: 353
			}
		}
	} // L: 346 351 354

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lhx;B)V",
		garbageValue = "0"
	)
	void method4055(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 357
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 358
			if (var6 > -1) { // L: 359
				int var7 = class7.method53(var6, this.backgroundColor); // L: 360
				if (var3.field2334[var5][var1][var2] == 0) { // L: 361
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 362
				} else {
					var4.method4461(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2334[var5][var1][var2], var3.field2342[var5][var1][var2]); // L: 365
				}
			}
		}

	} // L: 369

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILhz;Lhn;I)I",
		garbageValue = "-952737975"
	)
	int method4056(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 372 373 375
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILhz;[Lqq;I)V",
		garbageValue = "-902447610"
	)
	void method4057(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 379
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 380
			if (var6 != null && var6.length != 0) { // L: 381
				WorldMapDecoration[] var7 = var6; // L: 385

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 386
					WorldMapDecoration var9 = var7[var8]; // L: 387
					if (class137.method2938(var9.decoration) || WorldMapEvent.method4505(var9.decoration)) { // L: 389
						ObjectComposition var10 = class146.getObjectDefinition(var9.objectDefinitionId); // L: 390
						if (var10.mapSceneId != -1) { // L: 391
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 392
								var4[var10.mapSceneId].method8054(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 396
							} else {
								var4[var10.mapSceneId].method8054(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 393
							}
						}
					}
				}
			}
		}

	} // L: 404

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILhz;B)V",
		garbageValue = "-2"
	)
	void method4098(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 407
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 408
			if (var5 != null && var5.length != 0) { // L: 409
				WorldMapDecoration[] var6 = var5; // L: 413

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 414
					WorldMapDecoration var8 = var6[var7]; // L: 415
					int var10 = var8.decoration; // L: 418
					boolean var9 = var10 >= WorldMapDecorationType.field3517.id && var10 <= WorldMapDecorationType.field3500.id || var10 == WorldMapDecorationType.field3501.id; // L: 420
					if (var9) { // L: 422
						ObjectComposition var11 = class146.getObjectDefinition(var8.objectDefinitionId); // L: 423
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 424
						if (var8.decoration == WorldMapDecorationType.field3517.id) { // L: 425
							this.method4071(var1, var2, var8.rotation, var12); // L: 426
						}

						if (var8.decoration == WorldMapDecorationType.field3509.id) { // L: 428
							this.method4071(var1, var2, var8.rotation, -3355444); // L: 429
							this.method4071(var1, var2, var8.rotation + 1, var12); // L: 430
						}

						if (var8.decoration == WorldMapDecorationType.field3500.id) { // L: 432
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12); // L: 433
							}

							if (var8.rotation == 1) { // L: 434
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 435
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 436
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3501.id) { // L: 438
							int var13 = var8.rotation % 2; // L: 439
							int var14;
							if (var13 == 0) { // L: 440
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 441
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 442
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 446
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 447
								}
							}
						}
					}
				}
			}
		}

	} // L: 456

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1736856412"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 459
		float var6 = var5 / 2.0F; // L: 460
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 461

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 462
			Coord var9 = (Coord)var8.getKey(); // L: 464
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 465
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 466
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 467
			if (var12 != null && var12.hasValidElement()) { // L: 468
				var12.screenX = var10; // L: 469
				var12.screenY = var11; // L: 470
				WorldMapElement var13 = UserComparator7.WorldMapElement_get(var12.getElement()); // L: 471
				if (!var3.contains(var13.getObjectId())) { // L: 472
					this.method4064(var12, var10, var11, var5); // L: 473
				}
			}
		}

	} // L: 478

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-7"
	)
	void method4059(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 481

		while (var4.hasNext()) { // L: 490
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 482
			if (var5.hasValidElement()) { // L: 484
				WorldMapElement var6 = UserComparator7.WorldMapElement_get(var5.getElement()); // L: 485
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 486
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 487
				}
			}
		}

	} // L: 491

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lfe;IIIIB)V",
		garbageValue = "-104"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 494
		if (var6 != null) { // L: 495
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 498
			if (var4 % var5 < var5 / 2) { // L: 499
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 500
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 501
			}

		}
	} // L: 496 503

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIFI)V",
		garbageValue = "-19271127"
	)
	void method4064(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = UserComparator7.WorldMapElement_get(var1.getElement()); // L: 506
		this.method4062(var5, var2, var3); // L: 507
		this.method4063(var1, var5, var2, var3, var4); // L: 508
	} // L: 509

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfe;III)V",
		garbageValue = "-714774385"
	)
	void method4062(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 512
		if (var4 != null) { // L: 513
			int var5 = this.method4161(var4, var1.horizontalAlignment); // L: 514
			int var6 = this.method4123(var4, var1.verticalAlignment); // L: 515
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 516
		}

	} // L: 518

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhq;Lfe;IIFI)V",
		garbageValue = "1984252761"
	)
	void method4063(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 521
		if (var6 != null) { // L: 522
			if (var6.size.method3902(var5)) { // L: 525
				Font var7 = (Font)this.fonts.get(var6.size); // L: 528
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1819, 0, 1, 0, var7.ascent / 2); // L: 529
			}
		}
	} // L: 523 526 530

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1065289794"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 533
		Iterator var6 = this.icon0List.iterator(); // L: 534

		while (var6.hasNext()) { // L: 543
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 535
			if (var7.hasValidElement()) { // L: 537
				int var8 = var7.coord2.x % 64; // L: 538
				int var9 = var7.coord2.y % 64; // L: 539
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 540
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 541
				if (!var3.contains(var7.getElement())) { // L: 542
					this.method4064(var7, var7.screenX, var7.screenY, var5); // L: 545
				}
			}
		}

	} // L: 548

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lfw;I)I",
		garbageValue = "1167261995"
	)
	int method4161(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 551
		case 1:
			return -var1.subWidth / 2; // L: 562
		case 2:
			return 0; // L: 558
		default:
			return -var1.subWidth; // L: 554
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lfg;I)I",
		garbageValue = "1110187464"
	)
	int method4123(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 568
		case 1:
			return -var1.subHeight / 2; // L: 579
		case 2:
			return 0; // L: 575
		default:
			return -var1.subHeight; // L: 571
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lho;",
		garbageValue = "-108"
	)
	WorldMapLabel method4082(int var1) {
		WorldMapElement var2 = UserComparator7.WorldMapElement_get(var1); // L: 606
		return this.createMapLabel(var2); // L: 607
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)Lho;",
		garbageValue = "2017474757"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 611
			int var3 = var1.textSize; // L: 615
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method3901(); // L: 618
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 629
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 620
				if (var3 == var6.field2215) { // L: 622
					var2 = var6; // L: 623
					break;
				}

				++var5; // L: 619
			}

			if (var2 == null) { // L: 632
				return null; // L: 633
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 635
				if (var14 == null) { // L: 636
					return null; // L: 637
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 639
					String[] var7 = new String[var15]; // L: 640
					var14.breakLines(var1.name, (int[])null, var7); // L: 641
					int var8 = var7.length * var14.ascent / 2; // L: 642
					int var9 = 0; // L: 643
					String[] var10 = var7; // L: 645

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 646
						String var12 = var10[var11]; // L: 647
						int var13 = var14.stringWidth(var12); // L: 649
						if (var13 > var9) { // L: 650
							var9 = var13; // L: 651
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 656
				}
			}
		} else {
			return null; // L: 612
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-1950583236"
	)
	List method4069(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 660
		if (var4 >= var1 && var5 >= var2) { // L: 661
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 662
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 663
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 664
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 666
						var6.add(var8); // L: 667
					}
				}

				var7 = this.icon0List.iterator(); // L: 671

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 672
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 674
						var6.add(var8); // L: 675
					}
				}

				return var6; // L: 679
			} else {
				return var6; // L: 670
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "1649195814"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 683
		var1.addAll(this.icon0List); // L: 684
		var1.addAll(this.iconMap.values()); // L: 685
		return var1; // L: 686
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2107740024"
	)
	void method4071(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 690
		if (var3 == 0) { // L: 691
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 692
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 693
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 694
		}

	} // L: 695
}
