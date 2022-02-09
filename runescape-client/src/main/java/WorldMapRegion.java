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
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1680571103
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -562965229
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("v")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1182979997
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 852240481
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("u")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("h")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("q")
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-13"
	)
	void method4529(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 57
		int var6 = this.regionY; // L: 58
		int var7 = this.pixelsPerTile; // L: 59
		DemotingHashTable var8 = WorldMapRegion_cachedSprites; // L: 61
		long var9 = (long)(var7 << 16 | var5 << 8 | var6); // L: 64
		SpritePixels var4 = (SpritePixels)var8.get(var9); // L: 66
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) { // L: 70
				var4.drawAt(var1, var2); // L: 71
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 74
			}

		}
	} // L: 69 76

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lhu;Ljava/util/List;I)V",
		garbageValue = "605061873"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 79
		this.worldMapData_0 = var1; // L: 80
		this.addAllToIconList(var2); // L: 81
	} // L: 82

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;S)V",
		garbageValue = "-2249"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 85
		Iterator var3 = var1.iterator(); // L: 86

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 87
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 89
				this.worldMapData1List.add(var4); // L: 90
			}
		}

		this.addAllToIconList(var2); // L: 94
	} // L: 95

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIILhx;B)V",
		garbageValue = "-58"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 98
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 99
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 100
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 101
					if (var9 != null && var9.length != 0) { // L: 102
						WorldMapDecoration[] var10 = var9; // L: 106

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 107
							WorldMapDecoration var12 = var10[var11]; // L: 108
							ObjectComposition var13 = ParamComposition.getObjectDefinition(var12.objectDefinitionId); // L: 110
							if (IgnoreList.method6265(var13)) { // L: 111
								this.getIcon(var13, var8, var6, var7, var5); // L: 114
								continue label51; // L: 115
							}
						}
					}
				}
			}
		}

	} // L: 122

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfg;IIILhx;B)V",
		garbageValue = "-46"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 125
		Coord var7 = null; // L: 126
		if (this.worldMapData_0 != null) { // L: 127
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 128
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 131
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 132
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 135
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 136
		} else {
			var9 = class126.WorldMapElement_get(var1.mapIconId); // L: 139
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 140
		}

		var9 = class126.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 142
		if (var9.field1769) { // L: 143
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 144
		}

	} // L: 146

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1666242277"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 149

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 150
			if (var2 instanceof WorldMapIcon_1) { // L: 152
				((WorldMapIcon_1)var2).init(); // L: 153
			}
		}

	} // L: 157

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "972259681"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 160

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 161
			if (class126.WorldMapElement_get(var3.element).field1769 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 163 166
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4477(var3.element)); // L: 167
				this.icon0List.add(var4); // L: 168
			}
		}

	} // L: 172

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1756616208"
	)
	void method4455() {
		if (this.worldMapData_0 != null) { // L: 175
			this.worldMapData_0.reset(); // L: 176
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 179

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 180
				var2.reset(); // L: 182
			}
		}

	} // L: 186

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkq;S)Z",
		garbageValue = "4032"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 189
		if (this.worldMapData_0 != null) { // L: 190
			this.worldMapData_0.loadGeography(var1); // L: 191
			if (this.worldMapData_0.isFullyLoaded()) { // L: 192
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 193
				return true; // L: 194
			} else {
				return false; // L: 196
			}
		} else {
			boolean var2 = true; // L: 199

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 200 204
				var4 = (WorldMapData_1)var3.next(); // L: 201
				var4.loadGeography(var1); // L: 203
			}

			if (var2) { // L: 207
				var3 = this.worldMapData1List.iterator(); // L: 208

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 209
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 211
				}
			}

			return var2; // L: 215
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILif;[Lpg;Lkq;Lkq;I)V",
		garbageValue = "386346219"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 220
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 221
			int var7 = this.regionX; // L: 225
			int var8 = this.regionY; // L: 226
			DemotingHashTable var9 = WorldMapRegion_cachedSprites; // L: 228
			long var10 = (long)(var1 << 16 | var7 << 8 | var8); // L: 231
			SpritePixels var6 = (SpritePixels)var9.get(var10); // L: 233
			if (var6 == null) { // L: 235
				boolean var22 = true; // L: 238
				var22 &= this.loadGeography(var4); // L: 239
				int var11;
				if (this.worldMapData_0 != null) { // L: 242
					var11 = this.worldMapData_0.groupId; // L: 243
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 246
				}

				var22 &= var5.tryLoadGroup(var11); // L: 248
				if (var22) { // L: 249
					byte[] var23 = var5.takeFileFlat(var11); // L: 250
					WorldMapSprite var12;
					if (var23 == null) { // L: 253
						var12 = new WorldMapSprite(); // L: 254
					} else {
						var12 = new WorldMapSprite(class125.method2743(var23).pixels); // L: 257
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 260
					var14.setRaster(); // L: 261
					if (this.worldMapData_0 != null) { // L: 262
						this.method4551(var2, var3, var12); // L: 263
					} else {
						this.method4461(var2, var3, var12); // L: 266
					}

					int var15 = this.regionX; // L: 268
					int var16 = this.regionY; // L: 269
					int var17 = this.pixelsPerTile; // L: 270
					DemotingHashTable var18 = WorldMapRegion_cachedSprites; // L: 272
					long var20 = (long)(var17 << 16 | var15 << 8 | var16); // L: 276
					var18.put(var14, var20, var14.pixels.length * 4); // L: 278
					this.method4455(); // L: 280
				}
			}
		}
	} // L: 222 236 281

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-1153996012"
	)
	void method4458(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 284
			var4 = new HashSet(); // L: 285
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 287
		this.drawMapLinks(var1, var2, var4, var3); // L: 288
	} // L: 289

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1505477012"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 292

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 293
			if (var5.hasValidElement()) { // L: 295
				int var6 = var5.getElement(); // L: 296
				if (var1.contains(var6)) { // L: 297
					WorldMapElement var7 = class126.WorldMapElement_get(var6); // L: 298
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 299
				}
			}
		}

		this.method4464(var1, var2, var3); // L: 303
	} // L: 304

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lif;[Lpg;Lhl;I)V",
		garbageValue = "321052771"
	)
	void method4551(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 307
			for (var5 = 0; var5 < 64; ++var5) { // L: 308
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 309
				this.method4504(var4, var5, this.worldMapData_0, var1); // L: 310
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 313
			for (var5 = 0; var5 < 64; ++var5) { // L: 314
				this.method4462(var4, var5, this.worldMapData_0, var1, var2); // L: 315
			}
		}

	} // L: 318

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lif;[Lpg;Lhl;I)V",
		garbageValue = "1869935790"
	)
	void method4461(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 321

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 322

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 324
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 325
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 326
					this.method4504(var6, var7, var5, var1); // L: 327
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 332

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 333

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 335
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 336
					this.method4462(var6, var7, var5, var1, var2); // L: 337
				}
			}
		}

	} // L: 342

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILhx;Lif;[Lpg;I)V",
		garbageValue = "1586018783"
	)
	void method4462(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4471(var1, var2, var3); // L: 345
		this.method4466(var1, var2, var3, var5); // L: 346
	} // L: 347

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILhx;Lif;Lhl;I)V",
		garbageValue = "632653510"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 350
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 351
		if (var6 == -1 && var7 == -1) { // L: 352
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 353
		}

		int var8 = 16711935; // L: 355
		int var9;
		if (var7 != -1) { // L: 356
			int var10 = this.backgroundColor; // L: 358
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 362
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 363
				var11 = var12; // L: 364
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 367
				var12 = new FloorOverlayDefinition(); // L: 368
				if (var13 != null) { // L: 369
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 370
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 371
				var11 = var12; // L: 372
			}

			if (var11 == null) { // L: 375
				var9 = var10; // L: 376
			} else if (var11.secondaryRgb >= 0) { // L: 379
				var9 = var11.secondaryRgb | -16777216; // L: 380
			} else if (var11.texture >= 0) { // L: 382
				int var19 = Canvas.method371(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 383
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216; // L: 384
			} else if (var11.primaryRgb == 16711935) { // L: 386
				var9 = var10; // L: 387
			} else {
				int var14 = var11.hue; // L: 391
				int var15 = var11.saturation; // L: 392
				int var16 = var11.lightness; // L: 393
				if (var16 > 179) { // L: 395
					var15 /= 2;
				}

				if (var16 > 192) { // L: 396
					var15 /= 2;
				}

				if (var16 > 217) { // L: 397
					var15 /= 2;
				}

				if (var16 > 243) { // L: 398
					var15 /= 2;
				}

				int var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 399
				int var18 = Canvas.method371(var17, 96); // L: 403
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 404
			}

			var8 = var9; // L: 407
		}

		if (var7 > -1 && var3.field2736[0][var1][var2] == 0) { // L: 409
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 410
		} else {
			var9 = this.method4465(var1, var2, var3, var5); // L: 413
			if (var7 == -1) { // L: 414
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 415
			} else {
				var4.method4890(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2736[0][var1][var2], var3.field2731[0][var1][var2]); // L: 418
			}
		}
	} // L: 411 416 419

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILhx;Lif;I)V",
		garbageValue = "1515839713"
	)
	void method4504(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 422
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 423
			if (var6 > -1) { // L: 424
				int var8 = this.backgroundColor; // L: 426
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 430
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 431
					var9 = var10; // L: 432
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 435
					var10 = new FloorOverlayDefinition(); // L: 436
					if (var11 != null) { // L: 437
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 438
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 439
					var9 = var10; // L: 440
				}

				int var7;
				if (var9 == null) { // L: 443
					var7 = var8; // L: 444
				} else if (var9.secondaryRgb >= 0) { // L: 447
					var7 = var9.secondaryRgb | -16777216; // L: 448
				} else if (var9.texture >= 0) { // L: 450
					int var17 = Canvas.method371(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 451
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 452
				} else if (var9.primaryRgb == 16711935) { // L: 454
					var7 = var8; // L: 455
				} else {
					int var12 = var9.hue; // L: 459
					int var13 = var9.saturation; // L: 460
					int var14 = var9.lightness; // L: 461
					if (var14 > 179) { // L: 463
						var13 /= 2;
					}

					if (var14 > 192) { // L: 464
						var13 /= 2;
					}

					if (var14 > 217) {
						var13 /= 2; // L: 465
					}

					if (var14 > 243) { // L: 466
						var13 /= 2;
					}

					int var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 467
					int var16 = Canvas.method371(var15, 96); // L: 471
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 472
				}

				if (var3.field2736[var5][var1][var2] == 0) { // L: 476
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 477
				} else {
					var4.method4890(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2736[var5][var1][var2], var3.field2731[var5][var1][var2]); // L: 480
				}
			}
		}

	} // L: 484

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILhx;Lhl;S)I",
		garbageValue = "256"
	)
	int method4465(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 487 488 490
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILhx;[Lpg;B)V",
		garbageValue = "33"
	)
	void method4466(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 494
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 495
			if (var6 != null && var6.length != 0) { // L: 496
				WorldMapDecoration[] var7 = var6; // L: 500

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 501
					WorldMapDecoration var9 = var7[var8]; // L: 502
					int var11 = var9.decoration; // L: 505
					boolean var10 = var11 >= WorldMapDecorationType.field3438.id && var11 <= WorldMapDecorationType.field3444.id; // L: 507
					if (!var10) { // L: 510
						int var13 = var9.decoration; // L: 512
						boolean var12 = var13 == WorldMapDecorationType.field3437.id; // L: 514
						if (!var12) { // L: 516
							continue;
						}
					}

					ObjectComposition var14 = ParamComposition.getObjectDefinition(var9.objectDefinitionId); // L: 518
					if (var14.mapSceneId != -1) { // L: 519
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 520
							var4[var14.mapSceneId].method7753(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 524
						} else {
							var4[var14.mapSceneId].method7753(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 521
						}
					}
				}
			}
		}

	} // L: 532

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILhx;B)V",
		garbageValue = "-114"
	)
	void method4471(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 535
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 536
			if (var5 != null && var5.length != 0) { // L: 537
				WorldMapDecoration[] var6 = var5; // L: 541

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 542
					WorldMapDecoration var8 = var6[var7]; // L: 543
					if (class286.method5462(var8.decoration)) { // L: 545
						ObjectComposition var9 = ParamComposition.getObjectDefinition(var8.objectDefinitionId); // L: 546
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 547
						if (var8.decoration == WorldMapDecorationType.field3424.id) { // L: 548
							this.method4467(var1, var2, var8.rotation, var10); // L: 549
						}

						if (var8.decoration == WorldMapDecorationType.field3425.id) { // L: 551
							this.method4467(var1, var2, var8.rotation, -3355444); // L: 552
							this.method4467(var1, var2, var8.rotation + 1, var10); // L: 553
						}

						if (var8.decoration == WorldMapDecorationType.field3426.id) { // L: 555
							if (var8.rotation == 0) { // L: 556
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 557
							}

							if (var8.rotation == 2) { // L: 558
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 559
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3429.id) { // L: 561
							int var11 = var8.rotation % 2; // L: 562
							int var12;
							if (var11 == 0) { // L: 563
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 564
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 565
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 569
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 570
								}
							}
						}
					}
				}
			}
		}

	} // L: 579

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "2025693021"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 582
		float var6 = var5 / 2.0F; // L: 583
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 584

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 585
			Coord var9 = (Coord)var8.getKey(); // L: 587
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6); // L: 588
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 589
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 590
			if (var12 != null && var12.hasValidElement()) { // L: 591
				var12.screenX = var10; // L: 592
				var12.screenY = var11; // L: 593
				WorldMapElement var13 = class126.WorldMapElement_get(var12.getElement()); // L: 594
				if (!var3.contains(var13.getObjectId())) { // L: 595
					this.method4476(var12, var10, var11, var5); // L: 596
				}
			}
		}

	} // L: 601

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "5"
	)
	void method4464(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 604

		while (var4.hasNext()) { // L: 613
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 605
			if (var5.hasValidElement()) { // L: 607
				WorldMapElement var6 = class126.WorldMapElement_get(var5.getElement()); // L: 608
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 609
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 610
				}
			}
		}

	} // L: 614

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lfr;IIIII)V",
		garbageValue = "418620224"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 617
		if (var6 != null) { // L: 618
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 621
			if (var4 % var5 < var5 / 2) { // L: 622
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 623
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 624
			}

		}
	} // L: 619 626

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lix;IIFI)V",
		garbageValue = "-696046692"
	)
	void method4476(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class126.WorldMapElement_get(var1.getElement()); // L: 629
		this.method4503(var5, var2, var3); // L: 630
		this.method4522(var1, var5, var2, var3, var4); // L: 631
	} // L: 632

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfr;III)V",
		garbageValue = "1445965665"
	)
	void method4503(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 635
		if (var4 != null) { // L: 636
			int var5 = this.method4475(var4, var1.horizontalAlignment); // L: 637
			int var6 = this.method4555(var4, var1.verticalAlignment); // L: 638
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 639
		}

	} // L: 641

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lix;Lfr;IIFI)V",
		garbageValue = "1143588429"
	)
	void method4522(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 644
		if (var6 != null) { // L: 645
			if (var6.size.method4311(var5)) { // L: 648
				Font var7 = (Font)this.fonts.get(var6.size); // L: 651
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1767, 0, 1, 0, var7.ascent / 2); // L: 652
			}
		}
	} // L: 646 649 653

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1498016817"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 656
		Iterator var6 = this.icon0List.iterator(); // L: 657

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 658
			if (var7.hasValidElement()) { // L: 660
				int var8 = var7.coord2.x % 64; // L: 661
				int var9 = var7.coord2.y % 64; // L: 662
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 663
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 664
				if (!var3.contains(var7.getElement())) { // L: 665
					this.method4476(var7, var7.screenX, var7.screenY, var5); // L: 668
				}
			}
		}

	} // L: 671

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lfh;I)I",
		garbageValue = "1758248115"
	)
	int method4475(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 674
		case 0:
			return 0; // L: 677
		case 1:
			return -var1.subWidth / 2; // L: 681
		default:
			return -var1.subWidth; // L: 685
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lfo;B)I",
		garbageValue = "50"
	)
	int method4555(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 691
		case 0:
			return -var1.subHeight / 2; // L: 694
		case 2:
			return 0; // L: 702
		default:
			return -var1.subHeight; // L: 698
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "-967738245"
	)
	WorldMapLabel method4477(int var1) {
		WorldMapElement var2 = class126.WorldMapElement_get(var1); // L: 729
		return this.createMapLabel(var2); // L: 730
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)Lhp;",
		garbageValue = "865645266"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 734
			WorldMapLabelSize var2 = WorldMapLabelSize.method4320(var1.textSize); // L: 737
			if (var2 == null) { // L: 738
				return null; // L: 739
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 741
				if (var3 == null) { // L: 742
					return null; // L: 743
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 745
					String[] var5 = new String[var4]; // L: 746
					var3.breakLines(var1.name, (int[])null, var5); // L: 747
					int var6 = var5.length * var3.ascent / 2; // L: 748
					int var7 = 0; // L: 749
					String[] var8 = var5; // L: 751

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 752
						String var10 = var8[var9]; // L: 753
						int var11 = var3.stringWidth(var10); // L: 755
						if (var11 > var7) { // L: 756
							var7 = var11; // L: 757
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 762
				}
			}
		} else {
			return null; // L: 735
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-1549827680"
	)
	List method4449(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 766
		if (var4 >= var1 && var5 >= var2) { // L: 767
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 768
				Iterator var7 = this.iconMap.values().iterator(); // L: 769

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 770
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 772
						var6.add(var8); // L: 773
					}
				}

				var7 = this.icon0List.iterator(); // L: 777

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 778
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 780
						var6.add(var8); // L: 781
					}
				}

				return var6; // L: 785
			} else {
				return var6; // L: 776
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "753010260"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 789
		var1.addAll(this.icon0List); // L: 790
		var1.addAll(this.iconMap.values()); // L: 791
		return var1; // L: 792
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "23"
	)
	void method4467(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 796
		if (var3 == 0) { // L: 797
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 798
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 799
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 800
		}

	} // L: 801

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "2136379260"
	)
	static final int method4495(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 979
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 980
	}
}
