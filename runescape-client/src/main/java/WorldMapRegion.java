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

@ObfuscatedName("hn")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("hc")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1546454377
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 800960001
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("y")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2806249
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1260783779
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("t")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("z")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("r")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 57
		this.regionY = var2; // L: 58
		this.worldMapData1List = new LinkedList(); // L: 59
		this.icon0List = new LinkedList(); // L: 60
		this.iconMap = new HashMap(); // L: 61
		this.backgroundColor = var3 | -16777216; // L: 62
		this.fonts = var4; // L: 63
	} // L: 64

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1988867113"
	)
	void method4694(int var1, int var2, int var3) {
		SpritePixels var4 = class432.method7578(this.regionX, this.regionY, this.pixelsPerTile); // L: 67
		if (var4 != null) { // L: 68
			if (var3 == this.pixelsPerTile * 64) { // L: 69
				var4.drawAt(var1, var2); // L: 70
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 73
			}

		}
	} // L: 75

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhh;Ljava/util/List;S)V",
		garbageValue = "128"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 78
		this.worldMapData_0 = var1; // L: 79
		this.addAllToIconList(var2); // L: 80
	} // L: 81

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "1764533382"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 84
		Iterator var3 = var1.iterator(); // L: 85

		while (var3.hasNext()) { // L: 92
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 86
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 88
				this.worldMapData1List.add(var4); // L: 89
			}
		}

		this.addAllToIconList(var2); // L: 93
	} // L: 94

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIILhd;I)V",
		garbageValue = "165512816"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 97
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 98
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 99
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 100
					if (var9 != null && var9.length != 0) { // L: 101
						WorldMapDecoration[] var10 = var9; // L: 105

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 106
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11]; // L: 107
								var13 = class162.getObjectDefinition(var12.objectDefinitionId); // L: 109
								if (var13.transforms != null) { // L: 112
									int[] var15 = var13.transforms; // L: 114

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 115
										int var17 = var15[var16]; // L: 116
										ObjectComposition var18 = class162.getObjectDefinition(var17); // L: 118
										if (var18.mapIconId != -1) { // L: 119
											var14 = true; // L: 120
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 127
									var14 = true; // L: 128
									break label67; // L: 129
								}

								var14 = false; // L: 131
							}

							if (var14) { // L: 133
								this.getIcon(var13, var8, var6, var7, var5); // L: 136
								continue label76; // L: 137
							}
						}
					}
				}
			}
		}

	} // L: 144

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lgk;IIILhd;B)V",
		garbageValue = "127"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 147
		Coord var7 = null; // L: 148
		if (this.worldMapData_0 != null) { // L: 149
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 150
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 153
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 154
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 157
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 158
		} else {
			var9 = class432.WorldMapElement_get(var1.mapIconId); // L: 161
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 162
		}

		var9 = class432.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 164
		if (var9.field1830) { // L: 165
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 166
		}

	} // L: 168

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 171

		while (var1.hasNext()) { // L: 178
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 172
			if (var2 instanceof WorldMapIcon_1) { // L: 174
				((WorldMapIcon_1)var2).init(); // L: 175
			}
		}

	} // L: 179

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "32"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 182

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 183
			if (class432.WorldMapElement_get(var3.element).field1830 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 185 188
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4808(var3.element)); // L: 189
				this.icon0List.add(var4); // L: 190
			}
		}

	} // L: 194

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-727804061"
	)
	void method4701() {
		if (this.worldMapData_0 != null) { // L: 197
			this.worldMapData_0.reset(); // L: 198
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 201

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 202
				var2.reset(); // L: 204
			}
		}

	} // L: 208

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)Z",
		garbageValue = "-2071549269"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 211
		if (this.worldMapData_0 != null) { // L: 212
			this.worldMapData_0.loadGeography(var1); // L: 213
			if (this.worldMapData_0.isFullyLoaded()) { // L: 214
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 215
				return true; // L: 216
			} else {
				return false; // L: 218
			}
		} else {
			boolean var2 = true; // L: 221

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 222 226
				var4 = (WorldMapData_1)var3.next(); // L: 223
				var4.loadGeography(var1); // L: 225
			}

			if (var2) { // L: 229
				var3 = this.worldMapData1List.iterator(); // L: 230

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 231
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 233
				}
			}

			return var2; // L: 237
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILif;[Lqu;Llh;Llh;B)V",
		garbageValue = "94"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 242
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 243
			if (class432.method7578(this.regionX, this.regionY, var1) == null) { // L: 246
				boolean var6 = true; // L: 249
				var6 &= this.loadGeography(var4); // L: 250
				int var8;
				if (this.worldMapData_0 != null) { // L: 253
					var8 = this.worldMapData_0.groupId; // L: 254
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 257
				}

				var6 &= var5.tryLoadGroup(var8); // L: 259
				if (var6) { // L: 260
					byte[] var7 = var5.takeFileFlat(var8); // L: 261
					WorldMapSprite var9;
					if (var7 == null) { // L: 264
						var9 = new WorldMapSprite(); // L: 265
					} else {
						var9 = new WorldMapSprite(ItemLayer.method3920(var7).pixels); // L: 268
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 271
					var11.setRaster(); // L: 272
					if (this.worldMapData_0 != null) { // L: 273
						this.method4784(var2, var3, var9); // L: 274
					} else {
						this.method4788(var2, var3, var9); // L: 277
					}

					class116.method2699(var11, this.regionX, this.regionY, this.pixelsPerTile); // L: 279
					this.method4701(); // L: 280
				}
			}
		}
	} // L: 244 247 281

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "1460089775"
	)
	void method4738(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 284
			var4 = new HashSet(); // L: 285
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 287
		this.drawMapLinks(var1, var2, var4, var3); // L: 288
	} // L: 289

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "396083089"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 292

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 293
			if (var5.hasValidElement()) { // L: 295
				int var6 = var5.getElement(); // L: 296
				if (var1.contains(var6)) { // L: 297
					WorldMapElement var7 = class432.WorldMapElement_get(var6); // L: 298
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 299
				}
			}
		}

		this.method4715(var1, var2, var3); // L: 303
	} // L: 304

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lif;[Lqu;Lis;B)V",
		garbageValue = "36"
	)
	void method4784(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 307
			for (var5 = 0; var5 < 64; ++var5) { // L: 308
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 309
				this.method4782(var4, var5, this.worldMapData_0, var1); // L: 310
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 313
			for (var5 = 0; var5 < 64; ++var5) { // L: 314
				this.method4708(var4, var5, this.worldMapData_0, var1, var2); // L: 315
			}
		}

	} // L: 318

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lif;[Lqu;Lis;I)V",
		garbageValue = "-389074070"
	)
	void method4788(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 321

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 322

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 324
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 325
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 326
					this.method4782(var6, var7, var5, var1); // L: 327
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 332

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 333

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 335
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 336
					this.method4708(var6, var7, var5, var1, var2); // L: 337
				}
			}
		}

	} // L: 342

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILhd;Lif;[Lqu;B)V",
		garbageValue = "28"
	)
	void method4708(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4713(var1, var2, var3); // L: 345
		this.method4706(var1, var2, var3, var5); // L: 346
	} // L: 347

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILhd;Lif;Lis;I)V",
		garbageValue = "1839695565"
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
			FloorOverlayDefinition var11 = class124.method2814(var7); // L: 360
			if (var11 == null) { // L: 361
				var9 = var10; // L: 362
			} else if (var11.secondaryRgb >= 0) { // L: 365
				var9 = var11.secondaryRgb | -16777216; // L: 366
			} else if (var11.texture >= 0) { // L: 368
				int var12 = class154.method3170(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 369
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 370
			} else if (var11.primaryRgb == 16711935) { // L: 372
				var9 = var10; // L: 373
			} else {
				int var13 = var11.hue; // L: 377
				int var14 = var11.saturation; // L: 378
				int var15 = var11.lightness; // L: 379
				if (var15 > 179) { // L: 381
					var14 /= 2;
				}

				if (var15 > 192) { // L: 382
					var14 /= 2;
				}

				if (var15 > 217) { // L: 383
					var14 /= 2;
				}

				if (var15 > 243) { // L: 384
					var14 /= 2;
				}

				int var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10); // L: 385
				int var17 = class154.method3170(var16, 96); // L: 389
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 390
			}

			var8 = var9; // L: 393
		}

		if (var7 > -1 && var3.field2796[0][var1][var2] == 0) { // L: 395
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 396
		} else {
			var9 = this.method4711(var1, var2, var3, var5); // L: 399
			if (var7 == -1) { // L: 400
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 401
			} else {
				var4.method5108(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[0][var1][var2], var3.field2795[0][var1][var2]); // L: 404
			}
		}
	} // L: 397 402 405

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILhd;Lif;I)V",
		garbageValue = "-1128004844"
	)
	void method4782(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 408
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 409
			if (var6 > -1) { // L: 410
				int var8 = this.backgroundColor; // L: 412
				FloorOverlayDefinition var9 = class124.method2814(var6); // L: 414
				int var7;
				if (var9 == null) { // L: 415
					var7 = var8; // L: 416
				} else if (var9.secondaryRgb >= 0) { // L: 419
					var7 = var9.secondaryRgb | -16777216; // L: 420
				} else if (var9.texture >= 0) { // L: 422
					int var10 = class154.method3170(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 423
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 424
				} else if (var9.primaryRgb == 16711935) { // L: 426
					var7 = var8; // L: 427
				} else {
					int var11 = var9.hue; // L: 431
					int var12 = var9.saturation; // L: 432
					int var13 = var9.lightness; // L: 433
					if (var13 > 179) { // L: 435
						var12 /= 2;
					}

					if (var13 > 192) { // L: 436
						var12 /= 2;
					}

					if (var13 > 217) { // L: 437
						var12 /= 2;
					}

					if (var13 > 243) { // L: 438
						var12 /= 2;
					}

					int var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10); // L: 439
					int var15 = class154.method3170(var14, 96); // L: 443
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 444
				}

				if (var3.field2796[var5][var1][var2] == 0) { // L: 448
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 449
				} else {
					var4.method5108(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[var5][var1][var2], var3.field2795[var5][var1][var2]); // L: 452
				}
			}
		}

	} // L: 456

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILhd;Lis;I)I",
		garbageValue = "2000160992"
	)
	int method4711(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 459 460 462
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILhd;[Lqu;I)V",
		garbageValue = "114482222"
	)
	void method4706(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 466
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 467
			if (var6 != null && var6.length != 0) { // L: 468
				WorldMapDecoration[] var7 = var6; // L: 472

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 473
					WorldMapDecoration var9 = var7[var8]; // L: 474
					if (Clock.method3331(var9.decoration) || WorldMapLabelSize.method4575(var9.decoration)) { // L: 476
						ObjectComposition var10 = class162.getObjectDefinition(var9.objectDefinitionId); // L: 477
						if (var10.mapSceneId != -1) { // L: 478
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 479
								var4[var10.mapSceneId].method8135(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 483
							} else {
								var4[var10.mapSceneId].method8135(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 480
							}
						}
					}
				}
			}
		}

	} // L: 491

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILhd;B)V",
		garbageValue = "16"
	)
	void method4713(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 494
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 495
			if (var5 != null && var5.length != 0) { // L: 496
				WorldMapDecoration[] var6 = var5; // L: 500

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 501
					WorldMapDecoration var8 = var6[var7]; // L: 502
					int var10 = var8.decoration; // L: 505
					boolean var9 = var10 >= WorldMapDecorationType.field3549.id && var10 <= WorldMapDecorationType.field3534.id || var10 == WorldMapDecorationType.field3535.id; // L: 507
					if (var9) { // L: 509
						ObjectComposition var11 = class162.getObjectDefinition(var8.objectDefinitionId); // L: 510
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 511
						if (var8.decoration == WorldMapDecorationType.field3549.id) { // L: 512
							this.method4723(var1, var2, var8.rotation, var12); // L: 513
						}

						if (var8.decoration == WorldMapDecorationType.field3533.id) { // L: 515
							this.method4723(var1, var2, var8.rotation, -3355444); // L: 516
							this.method4723(var1, var2, var8.rotation + 1, var12); // L: 517
						}

						if (var8.decoration == WorldMapDecorationType.field3534.id) { // L: 519
							if (var8.rotation == 0) { // L: 520
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) { // L: 521
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 522
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 523
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3535.id) { // L: 525
							int var13 = var8.rotation % 2; // L: 526
							int var14;
							if (var13 == 0) { // L: 527
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 528
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 529
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 533
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 534
								}
							}
						}
					}
				}
			}
		}

	} // L: 543

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "8"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 546
		float var6 = var5 / 2.0F; // L: 547
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 548

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 549
			Coord var9 = (Coord)var8.getKey(); // L: 551
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6); // L: 552
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 553
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 554
			if (var12 != null && var12.hasValidElement()) { // L: 555
				var12.screenX = var10; // L: 556
				var12.screenY = var11; // L: 557
				WorldMapElement var13 = class432.WorldMapElement_get(var12.getElement()); // L: 558
				if (!var3.contains(var13.getObjectId())) { // L: 559
					this.method4771(var12, var10, var11, var5); // L: 560
				}
			}
		}

	} // L: 565

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1790127090"
	)
	void method4715(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 568

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 569
			if (var5.hasValidElement()) { // L: 571
				WorldMapElement var6 = class432.WorldMapElement_get(var5.getElement()); // L: 572
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 573
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 574
				}
			}
		}

	} // L: 578

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIIII)V",
		garbageValue = "797623326"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 581
		if (var6 != null) { // L: 582
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 585
			if (var4 % var5 < var5 / 2) { // L: 586
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 587
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 588
			}

		}
	} // L: 583 590

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lim;IIFB)V",
		garbageValue = "-8"
	)
	void method4771(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class432.WorldMapElement_get(var1.getElement()); // L: 593
		this.method4718(var5, var2, var3); // L: 594
		this.method4719(var1, var5, var2, var3, var4); // L: 595
	} // L: 596

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfa;III)V",
		garbageValue = "-1556950864"
	)
	void method4718(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 599
		if (var4 != null) { // L: 600
			int var5 = this.method4721(var4, var1.horizontalAlignment); // L: 601
			int var6 = this.method4722(var4, var1.verticalAlignment); // L: 602
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 603
		}

	} // L: 605

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lim;Lfa;IIFI)V",
		garbageValue = "1703862225"
	)
	void method4719(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 608
		if (var6 != null) { // L: 609
			if (var6.size.method4567(var5)) { // L: 612
				Font var7 = (Font)this.fonts.get(var6.size); // L: 615
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1834, 0, 1, 0, var7.ascent / 2); // L: 616
			}
		}
	} // L: 610 613 617

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "612177592"
	)
	@Export("drawMapLinks")
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
					this.method4771(var7, var7.screenX, var7.screenY, var5); // L: 632
				}
			}
		}

	} // L: 635

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lfk;I)I",
		garbageValue = "-1396908726"
	)
	int method4721(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 638
		case 1:
			return 0; // L: 649
		case 2:
			return -var1.subWidth / 2; // L: 641
		default:
			return -var1.subWidth; // L: 645
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lft;I)I",
		garbageValue = "1287844359"
	)
	int method4722(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 655
		case 0:
			return 0; // L: 662
		case 2:
			return -var1.subHeight / 2; // L: 666
		default:
			return -var1.subHeight; // L: 658
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Liz;",
		garbageValue = "-66"
	)
	WorldMapLabel method4808(int var1) {
		WorldMapElement var2 = class432.WorldMapElement_get(var1); // L: 672
		return this.createMapLabel(var2); // L: 673
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)Liz;",
		garbageValue = "-927951776"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 677
			int var3 = var1.textSize; // L: 681
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method4568(); // L: 684
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 695
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 686
				if (var3 == var6.field2672) { // L: 688
					var2 = var6; // L: 689
					break;
				}

				++var5; // L: 685
			}

			if (var2 == null) { // L: 698
				return null; // L: 699
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 701
				if (var14 == null) { // L: 702
					return null; // L: 703
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 705
					String[] var7 = new String[var15]; // L: 706
					var14.breakLines(var1.name, (int[])null, var7); // L: 707
					int var8 = var7.length * var14.ascent / 2; // L: 708
					int var9 = 0; // L: 709
					String[] var10 = var7; // L: 711

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 712
						String var12 = var10[var11]; // L: 713
						int var13 = var14.stringWidth(var12); // L: 715
						if (var13 > var9) { // L: 716
							var9 = var13; // L: 717
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 722
				}
			}
		} else {
			return null; // L: 678
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "78"
	)
	List method4802(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 726
		if (var4 >= var1 && var5 >= var2) { // L: 727
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 728
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 729
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 730
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 732
						var6.add(var8); // L: 733
					}
				}

				var7 = this.icon0List.iterator(); // L: 737

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 738
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 740
						var6.add(var8); // L: 741
					}
				}

				return var6; // L: 745
			} else {
				return var6; // L: 736
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-74215594"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 749
		var1.addAll(this.icon0List); // L: 750
		var1.addAll(this.iconMap.values()); // L: 751
		return var1; // L: 752
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1662314817"
	)
	void method4723(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 756
		if (var3 == 0) { // L: 757
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 758
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 759
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 760
		}

	} // L: 761
}
