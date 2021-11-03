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

@ObfuscatedName("fk")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	static ClanChannel field2069;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -1587771547
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1512933093
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1311115551
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("j")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -367405989
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -572472021
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("y")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("k")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("t")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 58
		this.regionY = var2; // L: 59
		this.worldMapData1List = new LinkedList(); // L: 60
		this.icon0List = new LinkedList(); // L: 61
		this.iconMap = new HashMap(); // L: 62
		this.backgroundColor = var3 | -16777216; // L: 63
		this.fonts = var4; // L: 64
	} // L: 65

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1133697443"
	)
	void method3685(int var1, int var2, int var3) {
		SpritePixels var4 = FileSystem.method2909(this.regionX, this.regionY, this.pixelsPerTile); // L: 68
		if (var4 != null) { // L: 69
			if (var3 == this.pixelsPerTile * 64) { // L: 70
				var4.drawAt(var1, var2); // L: 71
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 74
			}

		}
	} // L: 76

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lfv;Ljava/util/List;S)V",
		garbageValue = "8593"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 79
		this.worldMapData_0 = var1; // L: 80
		this.addAllToIconList(var2); // L: 81
	} // L: 82

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "99"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 85
		Iterator var3 = var1.iterator(); // L: 86

		while (var3.hasNext()) { // L: 93
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 87
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 89
				this.worldMapData1List.add(var4); // L: 90
			}
		}

		this.addAllToIconList(var2); // L: 94
	} // L: 95

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIILgl;I)V",
		garbageValue = "1671953569"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 98
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 99
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 100
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 101
					if (var9 != null && var9.length != 0) { // L: 102
						WorldMapDecoration[] var10 = var9; // L: 106

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 107
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11]; // L: 108
								var13 = KitDefinition.getObjectDefinition(var12.objectDefinitionId); // L: 110
								if (var13.transforms != null) { // L: 113
									int[] var15 = var13.transforms; // L: 115

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 116
										int var17 = var15[var16]; // L: 117
										ObjectComposition var18 = KitDefinition.getObjectDefinition(var17); // L: 119
										if (var18.mapIconId != -1) { // L: 120
											var14 = true; // L: 121
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 128
									var14 = true; // L: 129
									break label67; // L: 130
								}

								var14 = false; // L: 132
							}

							if (var14) { // L: 134
								this.getIcon(var13, var8, var6, var7, var5); // L: 137
								continue label76; // L: 138
							}
						}
					}
				}
			}
		}

	} // L: 145

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lfe;IIILgl;I)V",
		garbageValue = "-844362514"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 148
		Coord var7 = null; // L: 149
		if (this.worldMapData_0 != null) { // L: 150
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 151
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 154
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 155
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 158
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 159
		} else {
			var9 = ItemComposition.WorldMapElement_get(var1.mapIconId); // L: 162
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 163
		}

		var9 = ItemComposition.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 165
		if (var9.field1641) { // L: 166
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 167
		}

	} // L: 169

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1929800499"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 172

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 173
			if (var2 instanceof WorldMapIcon_1) { // L: 175
				((WorldMapIcon_1)var2).init(); // L: 176
			}
		}

	} // L: 180

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-402156972"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 183

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 184
			if (ItemComposition.WorldMapElement_get(var3.element).field1641 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 186 189
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method3756(var3.element)); // L: 190
				this.icon0List.add(var4); // L: 191
			}
		}

	} // L: 195

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1891636337"
	)
	void method3663() {
		if (this.worldMapData_0 != null) { // L: 198
			this.worldMapData_0.reset(); // L: 199
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 202

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 203
				var2.reset(); // L: 205
			}
		}

	} // L: 209

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)Z",
		garbageValue = "734008370"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 212
		if (this.worldMapData_0 != null) { // L: 213
			this.worldMapData_0.loadGeography(var1); // L: 214
			if (this.worldMapData_0.isFullyLoaded()) { // L: 215
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 216
				return true; // L: 217
			} else {
				return false; // L: 219
			}
		} else {
			boolean var2 = true; // L: 222

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 223 227
				var4 = (WorldMapData_1)var3.next(); // L: 224
				var4.loadGeography(var1); // L: 226
			}

			if (var2) { // L: 230
				var3 = this.worldMapData1List.iterator(); // L: 231

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 232
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 234
				}
			}

			return var2; // L: 238
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILge;[Loe;Lko;Lko;I)V",
		garbageValue = "749682565"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 243
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 244
			if (FileSystem.method2909(this.regionX, this.regionY, var1) == null) { // L: 247
				boolean var6 = true; // L: 250
				var6 &= this.loadGeography(var4); // L: 251
				int var8;
				if (this.worldMapData_0 != null) { // L: 254
					var8 = this.worldMapData_0.groupId; // L: 255
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 258
				}

				var6 &= var5.tryLoadGroup(var8); // L: 260
				if (var6) { // L: 261
					byte[] var7 = var5.takeFileFlat(var8); // L: 262
					WorldMapSprite var9 = class115.method2554(var7); // L: 263
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 264
					var10.setRaster(); // L: 265
					if (this.worldMapData_0 != null) { // L: 266
						this.method3668(var2, var3, var9); // L: 267
					} else {
						this.method3752(var2, var3, var9); // L: 270
					}

					class174.method3512(var10, this.regionX, this.regionY, this.pixelsPerTile); // L: 272
					this.method3663(); // L: 273
				}
			}
		}
	} // L: 245 248 274

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-1052443043"
	)
	void method3681(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 277
			var4 = new HashSet(); // L: 278
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 280
		this.drawMapLinks(var1, var2, var4, var3); // L: 281
	} // L: 282

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1956644892"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 285

		while (var4.hasNext()) { // L: 295
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 286
			if (var5.hasValidElement()) { // L: 288
				int var6 = var5.getElement(); // L: 289
				if (var1.contains(var6)) { // L: 290
					WorldMapElement var7 = ItemComposition.WorldMapElement_get(var6); // L: 291
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 292
				}
			}
		}

		this.method3719(var1, var2, var3); // L: 296
	} // L: 297

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lge;[Loe;Lgg;S)V",
		garbageValue = "-21128"
	)
	void method3668(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 300
			for (var5 = 0; var5 < 64; ++var5) { // L: 301
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 302
				this.method3672(var4, var5, this.worldMapData_0, var1); // L: 303
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 306
			for (var5 = 0; var5 < 64; ++var5) { // L: 307
				this.method3678(var4, var5, this.worldMapData_0, var1, var2); // L: 308
			}
		}

	} // L: 311

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lge;[Loe;Lgg;I)V",
		garbageValue = "-1733942667"
	)
	void method3752(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 314

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 315

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 317
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 318
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 319
					this.method3672(var6, var7, var5, var1); // L: 320
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 325

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 326

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 328
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 329
					this.method3678(var6, var7, var5, var1, var2); // L: 330
				}
			}
		}

	} // L: 335

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILgl;Lge;[Loe;I)V",
		garbageValue = "239188021"
	)
	void method3678(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method3675(var1, var2, var3); // L: 338
		this.method3674(var1, var2, var3, var5); // L: 339
	} // L: 340

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILgl;Lge;Lgg;B)V",
		garbageValue = "127"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 343
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 344
		if (var6 == -1 && var7 == -1) { // L: 345
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 346
		}

		int var8 = 16711935; // L: 348
		int var9;
		if (var7 != -1) { // L: 349
			int var10 = this.backgroundColor; // L: 351
			FloorOverlayDefinition var11 = InvDefinition.method2987(var7); // L: 353
			if (var11 == null) { // L: 354
				var9 = var10; // L: 355
			} else if (var11.secondaryRgb >= 0) { // L: 358
				var9 = var11.secondaryRgb | -16777216; // L: 359
			} else {
				int var12;
				int var13;
				byte var14;
				int var16;
				if (var11.texture >= 0) { // L: 361
					var13 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture); // L: 363
					var14 = 96; // L: 364
					if (var13 == -2) { // L: 366
						var12 = 12345678; // L: 367
					} else if (var13 == -1) { // L: 370
						if (var14 < 0) { // L: 371
							var14 = 0; // L: 372
						} else if (var14 > 127) { // L: 374
							var14 = 127; // L: 375
						}

						var16 = 127 - var14; // L: 377
						var12 = var16; // L: 378
					} else {
						var16 = var14 * (var13 & 127) / 128; // L: 381
						if (var16 < 2) { // L: 382
							var16 = 2;
						} else if (var16 > 126) { // L: 383
							var16 = 126;
						}

						var12 = var16 + (var13 & 65408); // L: 384
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 387
				} else if (var11.primaryRgb == 16711935) { // L: 389
					var9 = var10; // L: 390
				} else {
					var12 = LoginScreenAnimation.method2218(var11.hue, var11.saturation, var11.lightness); // L: 393
					var14 = 96; // L: 395
					if (var12 == -2) { // L: 397
						var13 = 12345678; // L: 398
					} else if (var12 == -1) { // L: 401
						if (var14 < 0) { // L: 402
							var14 = 0; // L: 403
						} else if (var14 > 127) { // L: 405
							var14 = 127; // L: 406
						}

						var16 = 127 - var14; // L: 408
						var13 = var16; // L: 409
					} else {
						var16 = var14 * (var12 & 127) / 128; // L: 412
						if (var16 < 2) { // L: 413
							var16 = 2;
						} else if (var16 > 126) { // L: 414
							var16 = 126;
						}

						var13 = var16 + (var12 & 65408); // L: 415
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 418
				}
			}

			var8 = var9; // L: 421
		}

		if (var7 > -1 && var3.field2154[0][var1][var2] == 0) { // L: 423
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 424
		} else {
			var9 = this.method3673(var1, var2, var3, var5); // L: 427
			if (var7 == -1) { // L: 428
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 429
			} else {
				var4.method4086(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2154[0][var1][var2], var3.field2145[0][var1][var2]); // L: 432
			}
		}
	} // L: 425 430 433

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILgl;Lge;B)V",
		garbageValue = "33"
	)
	void method3672(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 436
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 437
			if (var6 > -1) { // L: 438
				int var8 = this.backgroundColor; // L: 440
				FloorOverlayDefinition var9 = InvDefinition.method2987(var6); // L: 442
				int var7;
				if (var9 == null) { // L: 443
					var7 = var8; // L: 444
				} else if (var9.secondaryRgb >= 0) { // L: 447
					var7 = var9.secondaryRgb | -16777216; // L: 448
				} else {
					int var10;
					int var11;
					byte var12;
					int var15;
					if (var9.texture >= 0) { // L: 450
						var11 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture); // L: 452
						var12 = 96; // L: 453
						if (var11 == -2) { // L: 455
							var10 = 12345678; // L: 456
						} else if (var11 == -1) { // L: 459
							if (var12 < 0) { // L: 460
								var12 = 0; // L: 461
							} else if (var12 > 127) { // L: 463
								var12 = 127; // L: 464
							}

							var15 = 127 - var12; // L: 466
							var10 = var15; // L: 467
						} else {
							var15 = var12 * (var11 & 127) / 128; // L: 470
							if (var15 < 2) { // L: 471
								var15 = 2;
							} else if (var15 > 126) { // L: 472
								var15 = 126;
							}

							var10 = var15 + (var11 & 65408); // L: 473
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 476
					} else if (var9.primaryRgb == 16711935) { // L: 478
						var7 = var8; // L: 479
					} else {
						var10 = LoginScreenAnimation.method2218(var9.hue, var9.saturation, var9.lightness); // L: 482
						var12 = 96; // L: 484
						if (var10 == -2) { // L: 486
							var11 = 12345678; // L: 487
						} else if (var10 == -1) { // L: 490
							if (var12 < 0) { // L: 491
								var12 = 0; // L: 492
							} else if (var12 > 127) { // L: 494
								var12 = 127; // L: 495
							}

							var15 = 127 - var12; // L: 497
							var11 = var15; // L: 498
						} else {
							var15 = var12 * (var10 & 127) / 128; // L: 501
							if (var15 < 2) { // L: 502
								var15 = 2;
							} else if (var15 > 126) { // L: 503
								var15 = 126;
							}

							var11 = var15 + (var10 & 65408); // L: 504
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216; // L: 507
					}
				}

				if (var3.field2154[var5][var1][var2] == 0) { // L: 511
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 512
				} else {
					var4.method4086(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2154[var5][var1][var2], var3.field2145[var5][var1][var2]); // L: 515
				}
			}
		}

	} // L: 519

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILgl;Lgg;B)I",
		garbageValue = "4"
	)
	int method3673(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 522 523 525
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILgl;[Loe;B)V",
		garbageValue = "0"
	)
	void method3674(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 529
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 530
			if (var6 != null && var6.length != 0) { // L: 531
				WorldMapDecoration[] var7 = var6; // L: 535

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 536
					WorldMapDecoration var9 = var7[var8]; // L: 537
					int var11 = var9.decoration; // L: 540
					boolean var10 = var11 >= WorldMapDecorationType.field3242.id && var11 <= WorldMapDecorationType.field3243.id; // L: 542
					if (var10 || class123.method2614(var9.decoration)) { // L: 544
						ObjectComposition var12 = KitDefinition.getObjectDefinition(var9.objectDefinitionId); // L: 545
						if (var12.mapSceneId != -1) { // L: 546
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 547
								var4[var12.mapSceneId].method7362(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 551
							} else {
								var4[var12.mapSceneId].method7362(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 548
							}
						}
					}
				}
			}
		}

	} // L: 559

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILgl;B)V",
		garbageValue = "107"
	)
	void method3675(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 562
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 563
			if (var5 != null && var5.length != 0) { // L: 564
				WorldMapDecoration[] var6 = var5; // L: 568

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 569
					WorldMapDecoration var8 = var6[var7]; // L: 570
					int var10 = var8.decoration; // L: 573
					boolean var9 = var10 >= WorldMapDecorationType.field3238.id && var10 <= WorldMapDecorationType.field3230.id || var10 == WorldMapDecorationType.field3231.id; // L: 575
					if (var9) { // L: 577
						ObjectComposition var11 = KitDefinition.getObjectDefinition(var8.objectDefinitionId); // L: 578
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 579
						if (var8.decoration == WorldMapDecorationType.field3238.id) { // L: 580
							this.method3689(var1, var2, var8.rotation, var12); // L: 581
						}

						if (var8.decoration == WorldMapDecorationType.field3224.id) { // L: 583
							this.method3689(var1, var2, var8.rotation, -3355444); // L: 584
							this.method3689(var1, var2, var8.rotation + 1, var12); // L: 585
						}

						if (var8.decoration == WorldMapDecorationType.field3230.id) { // L: 587
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12); // L: 588
							}

							if (var8.rotation == 1) { // L: 589
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 590
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 591
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3231.id) { // L: 593
							int var13 = var8.rotation % 2; // L: 594
							int var14;
							if (var13 == 0) { // L: 595
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 596
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 597
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 601
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 602
								}
							}
						}
					}
				}
			}
		}

	} // L: 611

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-98"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 614
		float var6 = var5 / 2.0F; // L: 615
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 616

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 617
			Coord var9 = (Coord)var8.getKey(); // L: 619
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 620
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 621
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 622
			if (var12 != null && var12.hasValidElement()) { // L: 623
				var12.screenX = var10; // L: 624
				var12.screenY = var11; // L: 625
				WorldMapElement var13 = ItemComposition.WorldMapElement_get(var12.getElement()); // L: 626
				if (!var3.contains(var13.getObjectId())) { // L: 627
					this.method3666(var12, var10, var11, var5); // L: 628
				}
			}
		}

	} // L: 633

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "19259641"
	)
	void method3719(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 636

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 637
			if (var5.hasValidElement()) { // L: 639
				WorldMapElement var6 = ItemComposition.WorldMapElement_get(var5.getElement()); // L: 640
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 641
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 642
				}
			}
		}

	} // L: 646

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Len;IIIII)V",
		garbageValue = "614726264"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 649
		if (var6 != null) { // L: 650
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 653
			if (var4 % var5 < var5 / 2) { // L: 654
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 655
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 656
			}

		}
	} // L: 651 658

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lgm;IIFB)V",
		garbageValue = "2"
	)
	void method3666(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = ItemComposition.WorldMapElement_get(var1.getElement()); // L: 661
		this.method3680(var5, var2, var3); // L: 662
		this.method3676(var1, var5, var2, var3, var4); // L: 663
	} // L: 664

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Len;III)V",
		garbageValue = "-1236346843"
	)
	void method3680(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 667
		if (var4 != null) { // L: 668
			int var5 = this.method3683(var4, var1.horizontalAlignment); // L: 669
			int var6 = this.method3705(var4, var1.verticalAlignment); // L: 670
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 671
		}

	} // L: 673

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lgm;Len;IIFI)V",
		garbageValue = "-1559767910"
	)
	void method3676(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 676
		if (var6 != null) { // L: 677
			if (var6.size.method3533(var5)) { // L: 680
				Font var7 = (Font)this.fonts.get(var6.size); // L: 683
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1626, 0, 1, 0, var7.ascent / 2); // L: 684
			}
		}
	} // L: 678 681 685

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1502655393"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 688
		Iterator var6 = this.icon0List.iterator(); // L: 689

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 690
			if (var7.hasValidElement()) { // L: 692
				int var8 = var7.coord2.x % 64; // L: 693
				int var9 = var7.coord2.y % 64; // L: 694
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 695
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 696
				if (!var3.contains(var7.getElement())) { // L: 697
					this.method3666(var7, var7.screenX, var7.screenY, var5); // L: 700
				}
			}
		}

	} // L: 703

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Low;Lfj;B)I",
		garbageValue = "13"
	)
	int method3683(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 706
		case 0:
			return 0; // L: 709
		case 1:
			return -var1.subWidth / 2; // L: 717
		default:
			return -var1.subWidth; // L: 713
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Low;Lfg;S)I",
		garbageValue = "26323"
	)
	int method3705(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 723
		case 0:
			return -var1.subHeight / 2; // L: 734
		case 2:
			return 0; // L: 726
		default:
			return -var1.subHeight; // L: 730
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lga;",
		garbageValue = "-302877736"
	)
	WorldMapLabel method3756(int var1) {
		WorldMapElement var2 = ItemComposition.WorldMapElement_get(var1); // L: 740
		return this.createMapLabel(var2); // L: 741
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Len;B)Lga;",
		garbageValue = "15"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 745
			WorldMapLabelSize var2 = WorldMapLabelSize.method3538(var1.textSize); // L: 748
			if (var2 == null) { // L: 749
				return null; // L: 750
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 752
				if (var3 == null) { // L: 753
					return null; // L: 754
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 756
					String[] var5 = new String[var4]; // L: 757
					var3.breakLines(var1.name, (int[])null, var5); // L: 758
					int var6 = var5.length * var3.ascent / 2; // L: 759
					int var7 = 0; // L: 760
					String[] var8 = var5; // L: 762

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 763
						String var10 = var8[var9]; // L: 764
						int var11 = var3.stringWidth(var10); // L: 766
						if (var11 > var7) { // L: 767
							var7 = var11; // L: 768
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 773
				}
			}
		} else {
			return null; // L: 746
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "1"
	)
	List method3687(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 777
		if (var4 >= var1 && var5 >= var2) { // L: 778
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 779
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 780
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 781
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 783
						var6.add(var8); // L: 784
					}
				}

				var7 = this.icon0List.iterator(); // L: 788

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 789
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 791
						var6.add(var8); // L: 792
					}
				}

				return var6; // L: 796
			} else {
				return var6; // L: 787
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/List;",
		garbageValue = "-11615"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 800
		var1.addAll(this.icon0List); // L: 801
		var1.addAll(this.iconMap.values()); // L: 802
		return var1; // L: 803
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-18"
	)
	void method3689(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 807
		if (var3 == 0) { // L: 808
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 809
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 810
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 811
		}

	} // L: 812
}
