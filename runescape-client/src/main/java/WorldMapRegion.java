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

@ObfuscatedName("ax")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ba")
	static String field281;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1496476917
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 159033397
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("u")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1241362547
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2000095907
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("o")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("n")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("x")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 54
		this.regionY = var2; // L: 55
		this.worldMapData1List = new LinkedList(); // L: 56
		this.icon0List = new LinkedList(); // L: 57
		this.iconMap = new HashMap(); // L: 58
		this.backgroundColor = var3 | -16777216; // L: 59
		this.fonts = var4; // L: 60
	} // L: 61

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "4"
	)
	void method521(int var1, int var2, int var3) {
		Sprite var4 = Buddy.method5321(this.regionX, this.regionY, this.pixelsPerTile); // L: 64
		if (var4 != null) { // L: 65
			if (var3 == this.pixelsPerTile * 64) { // L: 66
				var4.drawAt(var1, var2); // L: 67
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 70
			}

		}
	} // L: 72

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lh;Ljava/util/List;I)V",
		garbageValue = "-1766116567"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 75
		this.worldMapData_0 = var1; // L: 76
		this.addAllToIconList(var2); // L: 77
	} // L: 78

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-555470431"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 81
		Iterator var3 = var1.iterator(); // L: 82

		while (var3.hasNext()) { // L: 89
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 83
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 85
				this.worldMapData1List.add(var4); // L: 86
			}
		}

		this.addAllToIconList(var2); // L: 90
	} // L: 91

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIILav;B)V",
		garbageValue = "92"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 94
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 95
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 96
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 97
					if (var9 != null && var9.length != 0) { // L: 98
						WorldMapDecoration[] var10 = var9; // L: 102

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 103
							WorldMapDecoration var12 = var10[var11]; // L: 104
							ObjectDefinition var13 = ScriptEvent.getObjectDefinition(var12.objectDefinitionId); // L: 106
							if (PcmPlayer.method2598(var13)) { // L: 107
								this.getIcon(var13, var8, var6, var7, var5); // L: 110
								continue label51; // L: 111
							}
						}
					}
				}
			}
		}

	} // L: 118

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lje;IIILav;B)V",
		garbageValue = "-109"
	)
	@Export("getIcon")
	void getIcon(ObjectDefinition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 121
		Coord var7 = null; // L: 122
		if (this.worldMapData_0 != null) { // L: 123
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 124
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 127
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 128
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 131
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 132
		} else {
			var9 = class194.WorldMapElement_get(var1.mapIconId); // L: 135
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 136
		}

		var9 = class194.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 138
		if (var9.field3258) { // L: 139
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 140
		}

	} // L: 142

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1279150124"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 145

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 146
			if (var2 instanceof WorldMapIcon_1) { // L: 148
				((WorldMapIcon_1)var2).init(); // L: 149
			}
		}

	} // L: 153

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "3"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 156

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 157
			if (class194.WorldMapElement_get(var3.element).field3258 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 159 162
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method550(var3.element)); // L: 163
				this.icon0List.add(var4); // L: 164
			}
		}

	} // L: 168

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1315993718"
	)
	void method528() {
		if (this.worldMapData_0 != null) { // L: 171
			this.worldMapData_0.reset(); // L: 172
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 175

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 176
				var2.reset(); // L: 178
			}
		}

	} // L: 182

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)Z",
		garbageValue = "-1635082422"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 185
		if (this.worldMapData_0 != null) { // L: 186
			this.worldMapData_0.loadGeography(var1); // L: 187
			if (this.worldMapData_0.isFullyLoaded()) { // L: 188
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 189
				return true; // L: 190
			} else {
				return false; // L: 192
			}
		} else {
			boolean var2 = true; // L: 195

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 196 200
				var4 = (WorldMapData_1)var3.next(); // L: 197
				var4.loadGeography(var1); // L: 199
			}

			if (var2) { // L: 203
				var3 = this.worldMapData1List.iterator(); // L: 204

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 205
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 207
				}
			}

			return var2; // L: 211
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILal;[Lle;Liw;Liw;I)V",
		garbageValue = "-406335289"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 216
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 217
			if (Buddy.method5321(this.regionX, this.regionY, var1) == null) { // L: 220
				boolean var6 = true; // L: 223
				var6 &= this.loadGeography(var4); // L: 224
				int var8;
				if (this.worldMapData_0 != null) { // L: 227
					var8 = this.worldMapData_0.groupId; // L: 228
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 231
				}

				var6 &= var5.tryLoadGroup(var8); // L: 233
				if (var6) { // L: 234
					byte[] var7 = var5.takeFileFlat(var8); // L: 235
					WorldMapSprite var9 = ChatChannel.method2375(var7); // L: 236
					Sprite var10 = new Sprite(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 237
					var10.setRaster(); // L: 238
					if (this.worldMapData_0 != null) { // L: 239
						this.method533(var2, var3, var9); // L: 240
					} else {
						this.method534(var2, var3, var9); // L: 243
					}

					ModeWhere.method3814(var10, this.regionX, this.regionY, this.pixelsPerTile); // L: 245
					this.method528(); // L: 246
				}
			}
		}
	} // L: 218 221 247

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-134217045"
	)
	void method585(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 250
			var4 = new HashSet(); // L: 251
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 253
		this.drawMapLinks(var1, var2, var4, var3); // L: 254
	} // L: 255

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-33"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 258

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 259
			if (var5.hasValidElement()) { // L: 261
				int var6 = var5.getElement(); // L: 262
				if (var1.contains(var6)) { // L: 263
					WorldMapElement var7 = class194.WorldMapElement_get(var6); // L: 264
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 265
				}
			}
		}

		this.method540(var1, var2, var3); // L: 269
	} // L: 270

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lal;[Lle;Lau;B)V",
		garbageValue = "-28"
	)
	void method533(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 273
			for (var5 = 0; var5 < 64; ++var5) { // L: 274
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 275
				this.method623(var4, var5, this.worldMapData_0, var1); // L: 276
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 279
			for (var5 = 0; var5 < 64; ++var5) { // L: 280
				this.method535(var4, var5, this.worldMapData_0, var1, var2); // L: 281
			}
		}

	} // L: 284

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lal;[Lle;Lau;I)V",
		garbageValue = "1440356366"
	)
	void method534(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 287

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 288

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 290
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 291
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 292
					this.method623(var6, var7, var5, var1); // L: 293
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 298

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 299

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 301
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 302
					this.method535(var6, var7, var5, var1, var2); // L: 303
				}
			}
		}

	} // L: 308

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILav;Lal;[Lle;I)V",
		garbageValue = "-2045754418"
	)
	void method535(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method630(var1, var2, var3); // L: 311
		this.method539(var1, var2, var3, var5); // L: 312
	} // L: 313

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILav;Lal;Lau;S)V",
		garbageValue = "-3017"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 316
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 317
		if (var6 == -1 && var7 == -1) { // L: 318
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 319
		}

		int var8 = 16711935; // L: 321
		int var9;
		if (var7 != -1) { // L: 322
			int var10 = this.backgroundColor; // L: 324
			FloorOverlayDefinition var11 = PendingSpawn.method1839(var7); // L: 326
			if (var11 == null) { // L: 327
				var9 = var10; // L: 328
			} else if (var11.secondaryRgb >= 0) { // L: 331
				var9 = var11.secondaryRgb | -16777216; // L: 332
			} else if (var11.texture >= 0) { // L: 334
				int var12 = BuddyRankComparator.method3558(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 335
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 336
			} else if (var11.primaryRgb == 16711935) { // L: 338
				var9 = var10; // L: 339
			} else {
				int var13 = var11.hue; // L: 343
				int var14 = var11.saturation; // L: 344
				int var15 = var11.lightness; // L: 345
				if (var15 > 179) { // L: 347
					var14 /= 2;
				}

				if (var15 > 192) { // L: 348
					var14 /= 2;
				}

				if (var15 > 217) { // L: 349
					var14 /= 2;
				}

				if (var15 > 243) { // L: 350
					var14 /= 2;
				}

				int var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10); // L: 351
				int var17 = BuddyRankComparator.method3558(var16, 96); // L: 355
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 356
			}

			var8 = var9; // L: 359
		}

		if (var7 > -1 && var3.field196[0][var1][var2] == 0) { // L: 361
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 362
		} else {
			var9 = this.method538(var1, var2, var3, var5); // L: 365
			if (var7 == -1) { // L: 366
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 367
			} else {
				var4.method826(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field196[0][var1][var2], var3.field187[0][var1][var2]); // L: 370
			}
		}
	} // L: 363 368 371

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILav;Lal;I)V",
		garbageValue = "208983501"
	)
	void method623(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 374
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 375
			if (var6 > -1) { // L: 376
				int var8 = this.backgroundColor; // L: 378
				FloorOverlayDefinition var9 = PendingSpawn.method1839(var6); // L: 380
				int var7;
				if (var9 == null) { // L: 381
					var7 = var8; // L: 382
				} else if (var9.secondaryRgb >= 0) { // L: 385
					var7 = var9.secondaryRgb | -16777216; // L: 386
				} else if (var9.texture >= 0) { // L: 388
					int var10 = BuddyRankComparator.method3558(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 389
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 390
				} else if (var9.primaryRgb == 16711935) { // L: 392
					var7 = var8; // L: 393
				} else {
					int var11 = var9.hue; // L: 397
					int var12 = var9.saturation; // L: 398
					int var13 = var9.lightness; // L: 399
					if (var13 > 179) { // L: 401
						var12 /= 2;
					}

					if (var13 > 192) { // L: 402
						var12 /= 2;
					}

					if (var13 > 217) { // L: 403
						var12 /= 2;
					}

					if (var13 > 243) { // L: 404
						var12 /= 2;
					}

					int var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10); // L: 405
					int var15 = BuddyRankComparator.method3558(var14, 96); // L: 409
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 410
				}

				if (var3.field196[var5][var1][var2] == 0) { // L: 414
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 415
				} else {
					var4.method826(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field196[var5][var1][var2], var3.field187[var5][var1][var2]); // L: 418
				}
			}
		}

	} // L: 422

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILav;Lau;I)I",
		garbageValue = "-2000366066"
	)
	int method538(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 425 426 428
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILav;[Lle;I)V",
		garbageValue = "2146304456"
	)
	void method539(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 432
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 433
			if (var6 != null && var6.length != 0) { // L: 434
				WorldMapDecoration[] var7 = var6; // L: 438

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 439
					WorldMapDecoration var9 = var7[var8]; // L: 440
					if (GameObject.method3416(var9.decoration) || class7.method108(var9.decoration)) { // L: 442
						ObjectDefinition var10 = ScriptEvent.getObjectDefinition(var9.objectDefinitionId); // L: 443
						if (var10.mapSceneId != -1) { // L: 444
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 445
								var4[var10.mapSceneId].method6247(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 449
							} else {
								var4[var10.mapSceneId].method6247(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 446
							}
						}
					}
				}
			}
		}

	} // L: 457

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILav;I)V",
		garbageValue = "-1846642435"
	)
	void method630(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 460
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 461
			if (var5 != null && var5.length != 0) { // L: 462
				WorldMapDecoration[] var6 = var5; // L: 466

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 467
					WorldMapDecoration var8 = var6[var7]; // L: 468
					if (LoginPacket.method3751(var8.decoration)) { // L: 470
						ObjectDefinition var9 = ScriptEvent.getObjectDefinition(var8.objectDefinitionId); // L: 471
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 472
						if (var8.decoration == WorldMapDecorationType.field2750.id) { // L: 473
							this.method554(var1, var2, var8.rotation, var10); // L: 474
						}

						if (var8.decoration == WorldMapDecorationType.field2748.id) { // L: 476
							this.method554(var1, var2, var8.rotation, -3355444); // L: 477
							this.method554(var1, var2, var8.rotation + 1, var10); // L: 478
						}

						if (var8.decoration == WorldMapDecorationType.field2754.id) { // L: 480
							if (var8.rotation == 0) { // L: 481
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 482
							}

							if (var8.rotation == 2) { // L: 483
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 484
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2751.id) { // L: 486
							int var11 = var8.rotation % 2; // L: 487
							int var12;
							if (var11 == 0) { // L: 488
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 489
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 490
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 494
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 495
								}
							}
						}
					}
				}
			}
		}

	} // L: 504

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-66"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 507
		float var6 = var5 / 2.0F; // L: 508
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 509

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 510
			Coord var9 = (Coord)var8.getKey(); // L: 512
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6); // L: 513
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 514
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 515
			if (var12 != null && var12.hasValidElement()) { // L: 516
				var12.screenX = var10; // L: 517
				var12.screenY = var11; // L: 518
				WorldMapElement var13 = class194.WorldMapElement_get(var12.getElement()); // L: 519
				if (!var3.contains(var13.getObjectId())) { // L: 520
					this.method544(var12, var10, var11, var5); // L: 521
				}
			}
		}

	} // L: 526

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIS)V",
		garbageValue = "-19257"
	)
	void method540(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 529

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 530
			if (var5.hasValidElement()) { // L: 532
				WorldMapElement var6 = class194.WorldMapElement_get(var5.getElement()); // L: 533
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 534
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 535
				}
			}
		}

	} // L: 539

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lij;IIIII)V",
		garbageValue = "1701094485"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		Sprite var6 = var1.getSpriteBool(false); // L: 542
		if (var6 != null) { // L: 543
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 546
			if (var4 % var5 < var5 / 2) { // L: 547
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 548
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 549
			}

		}
	} // L: 544 551

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lam;IIFB)V",
		garbageValue = "37"
	)
	void method544(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class194.WorldMapElement_get(var1.getElement()); // L: 554
		this.method545(var5, var2, var3); // L: 555
		this.method599(var1, var5, var2, var3, var4); // L: 556
	} // L: 557

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lij;III)V",
		garbageValue = "-1898823455"
	)
	void method545(WorldMapElement var1, int var2, int var3) {
		Sprite var4 = var1.getSpriteBool(false); // L: 560
		if (var4 != null) { // L: 561
			int var5 = this.method531(var4, var1.horizontalAlignment); // L: 562
			int var6 = this.method549(var4, var1.verticalAlignment); // L: 563
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 564
		}

	} // L: 566

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lam;Lij;IIFI)V",
		garbageValue = "-937867024"
	)
	void method599(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 569
		if (var6 != null) { // L: 570
			if (var6.size.method277(var5)) { // L: 573
				Font var7 = (Font)this.fonts.get(var6.size); // L: 576
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3245, 0, 1, 0, var7.ascent / 2); // L: 577
			}
		}
	} // L: 571 574 578

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-97"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 581
		Iterator var6 = this.icon0List.iterator(); // L: 582

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 583
			if (var7.hasValidElement()) { // L: 585
				int var8 = var7.coord2.x % 64; // L: 586
				int var9 = var7.coord2.y % 64; // L: 587
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 588
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 589
				if (!var3.contains(var7.getElement())) { // L: 590
					this.method544(var7, var7.screenX, var7.screenY, var5); // L: 593
				}
			}
		}

	} // L: 596

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llc;Ljy;I)I",
		garbageValue = "2012053105"
	)
	int method531(Sprite var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 599
		case 1:
			return 0; // L: 606
		case 2:
			return -var1.subWidth / 2; // L: 610
		default:
			return -var1.subWidth; // L: 602
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llc;Lir;B)I",
		garbageValue = "-1"
	)
	int method549(Sprite var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 616
		case 0:
			return 0; // L: 627
		case 1:
			return -var1.subHeight / 2; // L: 619
		default:
			return -var1.subHeight; // L: 623
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lai;",
		garbageValue = "-1045904165"
	)
	WorldMapLabel method550(int var1) {
		WorldMapElement var2 = class194.WorldMapElement_get(var1); // L: 654
		return this.createMapLabel(var2); // L: 655
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lij;I)Lai;",
		garbageValue = "1905291224"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 659
			int var3 = var1.textSize; // L: 663
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method273(); // L: 666
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 677
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 668
				if (var3 == var6.field150) { // L: 670
					var2 = var6; // L: 671
					break;
				}

				++var5; // L: 667
			}

			if (var2 == null) { // L: 680
				return null; // L: 681
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 683
				if (var14 == null) { // L: 684
					return null; // L: 685
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 687
					String[] var7 = new String[var15]; // L: 688
					var14.breakLines(var1.name, (int[])null, var7); // L: 689
					int var8 = var7.length * var14.ascent / 2; // L: 690
					int var9 = 0; // L: 691
					String[] var10 = var7; // L: 693

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 694
						String var12 = var10[var11]; // L: 695
						int var13 = var14.stringWidth(var12); // L: 697
						if (var13 > var9) { // L: 698
							var9 = var13; // L: 699
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 704
				}
			}
		} else {
			return null; // L: 660
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-56"
	)
	List method609(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 708
		if (var4 >= var1 && var5 >= var2) { // L: 709
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 710
				Iterator var7 = this.iconMap.values().iterator(); // L: 711

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 712
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 714
						var6.add(var8); // L: 715
					}
				}

				var7 = this.icon0List.iterator(); // L: 719

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 720
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 722
						var6.add(var8); // L: 723
					}
				}

				return var6; // L: 727
			} else {
				return var6; // L: 718
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "89"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 731
		var1.addAll(this.icon0List); // L: 732
		var1.addAll(this.iconMap.values()); // L: 733
		return var1; // L: 734
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1518831838"
	)
	void method554(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 738
		if (var3 == 0) { // L: 739
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 740
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 741
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 742
		}

	} // L: 743

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "([Lht;IIIIIIIII)V",
		garbageValue = "-1261994565"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9339
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9340

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9341
			Widget var10 = var0[var9]; // L: 9342
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9343 9344
				int var11;
				if (var8 == -1) { // L: 9346
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9347
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9348
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9349
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9350
					var11 = ++Client.rootWidgetCount - 1; // L: 9351
				} else {
					var11 = var8; // L: 9353
				}

				var10.rootIndex = var11; // L: 9354
				var10.cycle = Client.cycle; // L: 9355
				if (!var10.isIf3 || !VertexNormal.isComponentHidden(var10)) { // L: 9356
					if (var10.contentType > 0) { // L: 9357
						WorldMapID.method664(var10);
					}

					int var12 = var10.x + var6; // L: 9358
					int var13 = var7 + var10.y; // L: 9359
					int var14 = var10.transparencyTop; // L: 9360
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9361
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9362
							ItemContainer.field572 = var0; // L: 9363
							WorldMapSprite.field256 = var6; // L: 9364
							GrandExchangeOffer.field87 = var7; // L: 9365
							continue; // L: 9366
						}

						if (Client.isDraggingWidget && Client.field859) { // L: 9368
							var15 = MouseHandler.MouseHandler_x; // L: 9369
							var16 = MouseHandler.MouseHandler_y; // L: 9370
							var15 -= Client.widgetClickX; // L: 9371
							var16 -= Client.widgetClickY; // L: 9372
							if (var15 < Client.field860) { // L: 9373
								var15 = Client.field860;
							}

							if (var15 + var10.width > Client.field860 + Client.clickedWidgetParent.width) { // L: 9374
								var15 = Client.field860 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field861) { // L: 9375
								var16 = Client.field861;
							}

							if (var16 + var10.height > Client.field861 + Client.clickedWidgetParent.height) { // L: 9376
								var16 = Client.field861 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9377
							var13 = var16; // L: 9378
						}

						if (!var10.isScrollBar) { // L: 9380
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9386
						var15 = var2; // L: 9387
						var16 = var3; // L: 9388
						var17 = var4; // L: 9389
						var18 = var5; // L: 9390
					} else if (var10.type == 9) { // L: 9392
						var19 = var12; // L: 9393
						var20 = var13; // L: 9394
						var21 = var12 + var10.width; // L: 9395
						var22 = var13 + var10.height; // L: 9396
						if (var21 < var12) { // L: 9397
							var19 = var21; // L: 9399
							var21 = var12; // L: 9400
						}

						if (var22 < var13) { // L: 9402
							var20 = var22; // L: 9404
							var22 = var13; // L: 9405
						}

						++var21; // L: 9407
						++var22; // L: 9408
						var15 = var19 > var2 ? var19 : var2; // L: 9409
						var16 = var20 > var3 ? var20 : var3; // L: 9410
						var17 = var21 < var4 ? var21 : var4; // L: 9411
						var18 = var22 < var5 ? var22 : var5; // L: 9412
					} else {
						var19 = var12 + var10.width; // L: 9415
						var20 = var13 + var10.height; // L: 9416
						var15 = var12 > var2 ? var12 : var2; // L: 9417
						var16 = var13 > var3 ? var13 : var3; // L: 9418
						var17 = var19 < var4 ? var19 : var4; // L: 9419
						var18 = var20 < var5 ? var20 : var5; // L: 9420
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9422
						if (var10.contentType != 0) { // L: 9423
							if (var10.contentType == 1336) { // L: 9424
								if (Client.displayFps) { // L: 9425
									var13 += 15; // L: 9426
									WorldMapCacheName.fontPlain12.drawRightAligned("Fps:" + GameShell.fps, var12 + var10.width, var13, 16776960, -1); // L: 9427
									var13 += 15; // L: 9428
									Runtime var42 = Runtime.getRuntime(); // L: 9429
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9430
									var21 = 16776960; // L: 9431
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9432
										var21 = 16711680;
									}

									WorldMapCacheName.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9433
									var13 += 15; // L: 9434
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9438
								Client.viewportX = var12; // L: 9439
								Client.viewportY = var13; // L: 9440
								ItemContainer.drawEntities(var12, var13, var10.width, var10.height); // L: 9441
								Client.field834[var10.rootIndex] = true; // L: 9442
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9443
								continue; // L: 9444
							}

							if (var10.contentType == 1338) { // L: 9446
								UserComparator10.drawMinimap(var10, var12, var13, var11); // L: 9447
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9448
								continue; // L: 9449
							}

							if (var10.contentType == 1339) { // L: 9451
								WorldMapSectionType.drawCompass(var10, var12, var13, var11); // L: 9452
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9453
								continue; // L: 9454
							}

							if (var10.contentType == 1400) { // L: 9456
								KeyHandler.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9457
							}

							if (var10.contentType == 1401) { // L: 9459
								KeyHandler.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9460
							}

							if (var10.contentType == 1402) { // L: 9462
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9463
							}
						}

						if (var10.type == 0) { // L: 9466
							if (!var10.isIf3 && VertexNormal.isComponentHidden(var10) && var10 != GrandExchangeEvent.mousedOverWidgetIf1) { // L: 9467
								continue;
							}

							if (!var10.isIf3) { // L: 9468
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9469
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9470
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9472
							if (var10.children != null) { // L: 9473
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9474
							if (var30 != null) { // L: 9475
								ClanChat.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9476
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9478
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9479
						}

						if (Client.isResizable || Client.field745[var11] || Client.gameDrawingMode > 1) { // L: 9481
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9482 9483
								WorldMapData_0.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9485
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9488
									var19 = 0; // L: 9489

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9490
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9491
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9492
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 9493
											if (var19 < 20) { // L: 9494
												var22 += var10.inventoryXOffsets[var19]; // L: 9495
												var23 += var10.inventoryYOffsets[var19]; // L: 9496
											}

											if (var10.itemIds[var19] <= 0) { // L: 9498
												if (var10.inventorySprites != null && var19 < 20) { // L: 9543
													Sprite var46 = var10.getInventorySprite(var19); // L: 9544
													if (var46 != null) { // L: 9545
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2677) { // L: 9546
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9499
												boolean var38 = false; // L: 9500
												var26 = var10.itemIds[var19] - 1; // L: 9501
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == GameBuild.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9502
													Sprite var35;
													if (Client.isItemSelected == 1 && var19 == InvDefinition.selectedItemSlot && var10.id == SpotAnimationDefinition.selectedItemWidget) { // L: 9504
														var35 = TilePaint.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = TilePaint.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9505
													}

													if (var35 != null) { // L: 9506
														if (var10 == GameBuild.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9507
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9508
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9509
															if (var24 < 5 && var24 > -5) { // L: 9510
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9511
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9512
																var24 = 0; // L: 9513
																var25 = 0; // L: 9514
															}

															var35.drawTransAt(var22 + var24, var25 + var23, 128); // L: 9516
															if (var1 != -1) { // L: 9517
																Widget var28 = var0[var1 & 65535]; // L: 9518
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9519
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field743 / 3; // L: 9520
																	if (var29 > Client.field743 * 10) { // L: 9521
																		var29 = Client.field743 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9522
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9523
																	Client.draggedWidgetY += var29; // L: 9524
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var28); // L: 9525
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9527
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field743 / 3; // L: 9528
																	if (var29 > Client.field743 * 10) { // L: 9529
																		var29 = Client.field743 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9530
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9531
																	Client.draggedWidgetY -= var29; // L: 9532
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var28); // L: 9533
																}
															}
														} else if (var10 == MouseHandler.field525 && var19 == Client.field788) { // L: 9537
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9538
														}
													} else {
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10); // L: 9540
													}
												}
											}

											++var19; // L: 9548
										}
									}
								} else if (var10.type == 3) { // L: 9553
									if (BufferedNetSocket.runCs1(var10)) { // L: 9555
										var19 = var10.color2; // L: 9556
										if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9557
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9560
										if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9561
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9563
										switch(var10.fillMode.id) { // L: 9564
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9573
											break; // L: 9574
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9570
											break; // L: 9571
										default:
											if (var14 == 0) { // L: 9566
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9567
											}
										}
									} else if (var14 == 0) { // L: 9578
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9579
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9583
										var39 = var10.getFont(); // L: 9584
										if (var39 == null) { // L: 9585
											if (Widget.field2677) { // L: 9586
												GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9590
											if (BufferedNetSocket.runCs1(var10)) { // L: 9591
												var20 = var10.color2; // L: 9592
												if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9593
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9594
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9597
												if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9598
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9600
												ItemDefinition var45 = AbstractWorldMapData.ItemDefinition_get(var10.itemId); // L: 9601
												var44 = var45.name; // L: 9602
												if (var44 == null) { // L: 9603
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9604
													var44 = Client.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + InterfaceParent.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9606
												var44 = "Please wait..."; // L: 9607
												var20 = var10.color; // L: 9608
											}

											if (!var10.isIf3) { // L: 9610
												var44 = class2.method39(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9611
										}
									} else if (var10.type == 5) { // L: 9614
										Sprite var40;
										if (!var10.isIf3) { // L: 9615
											var40 = var10.getSprite(BufferedNetSocket.runCs1(var10)); // L: 9616
											if (var40 != null) { // L: 9617
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2677) { // L: 9618
												GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9622
												var40 = TilePaint.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9623
											}

											if (var40 == null) { // L: 9624
												if (Widget.field2677) { // L: 9648
													GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9625
												var21 = var40.height; // L: 9626
												if (!var10.spriteTiling) { // L: 9627
													var22 = var10.width * 4096 / var20; // L: 9641
													if (var10.spriteAngle != 0) { // L: 9642
														var40.method6299(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9643
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9644
														var40.drawTransBgAt(var12, var13); // L: 9645
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9628
													var22 = (var20 - 1 + var10.width) / var20; // L: 9629
													var23 = (var21 - 1 + var10.height) / var21; // L: 9630

													for (var24 = 0; var24 < var22; ++var24) { // L: 9631
														for (var25 = 0; var25 < var23; ++var25) { // L: 9632
															if (var10.spriteAngle != 0) { // L: 9633
																var40.method6299(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9634
																var40.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 9635
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9638
												}
											}
										}
									} else {
										ItemDefinition var33;
										if (var10.type == 6) { // L: 9652
											boolean var36 = BufferedNetSocket.runCs1(var10); // L: 9653
											if (var36) { // L: 9655
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9656
											}

											Model var41 = null; // L: 9657
											var22 = 0; // L: 9658
											if (var10.itemId != -1) { // L: 9659
												var33 = AbstractWorldMapData.ItemDefinition_get(var10.itemId); // L: 9660
												if (var33 != null) { // L: 9661
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9662
													var41 = var33.getModel(1); // L: 9663
													if (var41 != null) { // L: 9664
														var41.calculateBoundsCylinder(); // L: 9665
														var22 = var41.height / 2; // L: 9666
													} else {
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10); // L: 9668
													}
												}
											} else if (var10.modelType == 5) { // L: 9671
												if (var10.modelId == 0) { // L: 9672
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = PlayerType.localPlayer.getModel(); // L: 9673
												}
											} else if (var20 == -1) { // L: 9675
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, PlayerType.localPlayer.appearance); // L: 9676
												if (var41 == null && Widget.field2677) { // L: 9677
													GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class105.SequenceDefinition_get(var20); // L: 9680
												var41 = var10.getModel(var47, var10.modelFrame, var36, PlayerType.localPlayer.appearance); // L: 9681
												if (var41 == null && Widget.field2677) { // L: 9682
													GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3174(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9684
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9685
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9686
											if (var41 != null) { // L: 9687
												if (!var10.isIf3) { // L: 9688
													var41.method3064(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9690
													if (var10.modelOrthog) { // L: 9691
														var41.method3025(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method3064(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9692
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9695
										} else {
											if (var10.type == 7) { // L: 9698
												var39 = var10.getFont(); // L: 9699
												if (var39 == null) { // L: 9700
													if (Widget.field2677) { // L: 9701
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9704

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9705
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9706
														if (var10.itemIds[var20] > 0) { // L: 9707
															var33 = AbstractWorldMapData.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9708
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9710
																var34 = Client.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = Client.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + InterfaceParent.formatItemStacks(var10.itemQuantities[var20]); // L: 9711
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 9712
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 9713
															if (var10.textXAlignment == 0) { // L: 9714
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9715
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9716
															}
														}

														++var20; // L: 9718
													}
												}
											}

											if (var10.type == 8 && var10 == GrandExchangeOfferOwnWorldComparator.field677 && Client.field833 == Client.field832) { // L: 9722 9723
												var19 = 0; // L: 9724
												var20 = 0; // L: 9725
												Font var31 = WorldMapCacheName.fontPlain12; // L: 9726
												String var32 = var10.text; // L: 9727

												String var43;
												for (var32 = class2.method39(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9729 9730 9742
													var24 = var32.indexOf("<br>"); // L: 9731
													if (var24 != -1) { // L: 9732
														var43 = var32.substring(0, var24); // L: 9733
														var32 = var32.substring(var24 + 4); // L: 9734
													} else {
														var43 = var32; // L: 9737
														var32 = ""; // L: 9738
													}

													var25 = var31.stringWidth(var43); // L: 9740
													if (var25 > var19) { // L: 9741
														var19 = var25;
													}
												}

												var19 += 6; // L: 9744
												var20 += 7; // L: 9745
												var24 = var12 + var10.width - 5 - var19; // L: 9746
												var25 = var13 + var10.height + 5; // L: 9747
												if (var24 < var12 + 5) { // L: 9748
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 9749
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 9750
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9751
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9752
												var32 = var10.text; // L: 9753
												var26 = var25 + var31.ascent + 2; // L: 9754

												for (var32 = class2.method39(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9755 9756 9767
													int var27 = var32.indexOf("<br>"); // L: 9757
													if (var27 != -1) { // L: 9758
														var43 = var32.substring(0, var27); // L: 9759
														var32 = var32.substring(var27 + 4); // L: 9760
													} else {
														var43 = var32; // L: 9763
														var32 = ""; // L: 9764
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9766
												}
											}

											if (var10.type == 9) { // L: 9771
												if (var10.field2627) { // L: 9776
													var19 = var12; // L: 9777
													var20 = var13 + var10.height; // L: 9778
													var21 = var12 + var10.width; // L: 9779
													var22 = var13; // L: 9780
												} else {
													var19 = var12; // L: 9783
													var20 = var13; // L: 9784
													var21 = var12 + var10.width; // L: 9785
													var22 = var13 + var10.height; // L: 9786
												}

												if (var10.lineWid == 1) { // L: 9788
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9789
												} else {
													class300.method5419(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9792
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 9797
}
