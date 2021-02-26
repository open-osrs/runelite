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

@ObfuscatedName("as")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1299522103
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 861898053
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("q")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -360836645
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1984621095
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("b")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("a")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("w")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "46"
	)
	void method506(int var1, int var2, int var3) {
		SpritePixels var4 = LoginPacket.method3816(this.regionX, this.regionY, this.pixelsPerTile); // L: 68
		if (var4 != null) { // L: 69
			if (var3 == this.pixelsPerTile * 64) { // L: 70
				var4.drawAt(var1, var2); // L: 71
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 74
			}

		}
	} // L: 76

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lo;Ljava/util/List;I)V",
		garbageValue = "1448874199"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 79
		this.worldMapData_0 = var1; // L: 80
		this.addAllToIconList(var2); // L: 81
	} // L: 82

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-905581142"
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
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIILac;I)V",
		garbageValue = "-747714746"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 98
			label50:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 99
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 100
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 101
					if (var9 != null && var9.length != 0) { // L: 102
						WorldMapDecoration[] var10 = var9; // L: 106

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 107
							WorldMapDecoration var12 = var10[var11]; // L: 108
							ObjectComposition var13 = WorldMapAreaData.getObjectDefinition(var12.objectDefinitionId); // L: 110
							if (MidiPcmStream.method4031(var13)) { // L: 111
								this.getIcon(var13, var8, var6, var7, var5); // L: 114
								continue label50; // L: 115
							}
						}
					}
				}
			}
		}

	} // L: 122

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljg;IIILac;S)V",
		garbageValue = "-25437"
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
			var9 = InvDefinition.WorldMapElement_get(var1.mapIconId); // L: 139
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 140
		}

		var9 = InvDefinition.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 142
		if (var9.field3250) { // L: 143
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 144
		}

	} // L: 146

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1523999708"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "614836611"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 160

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 161
			if (InvDefinition.WorldMapElement_get(var3.element).field3250 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 163 166
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method535(var3.element)); // L: 167
				this.icon0List.add(var4); // L: 168
			}
		}

	} // L: 172

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1548540670"
	)
	void method513() {
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lig;I)Z",
		garbageValue = "130952485"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILaf;[Lly;Lig;Lig;I)V",
		garbageValue = "-1610882473"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 220
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 221
			if (LoginPacket.method3816(this.regionX, this.regionY, var1) == null) { // L: 224
				boolean var6 = true; // L: 227
				var6 &= this.loadGeography(var4); // L: 228
				int var8;
				if (this.worldMapData_0 != null) { // L: 231
					var8 = this.worldMapData_0.groupId; // L: 232
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 235
				}

				var6 &= var5.tryLoadGroup(var8); // L: 237
				if (var6) { // L: 238
					byte[] var7 = var5.takeFileFlat(var8); // L: 239
					WorldMapSprite var9;
					if (var7 == null) { // L: 242
						var9 = new WorldMapSprite(); // L: 243
					} else {
						var9 = new WorldMapSprite(WorldMapRectangle.convertJpgToSprite(var7).pixels); // L: 246
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 249
					var11.setRaster(); // L: 250
					if (this.worldMapData_0 != null) { // L: 251
						this.method617(var2, var3, var9); // L: 252
					} else {
						this.method519(var2, var3, var9); // L: 255
					}

					GrandExchangeOfferNameComparator.method211(var11, this.regionX, this.regionY, this.pixelsPerTile); // L: 257
					this.method513(); // L: 258
				}
			}
		}
	} // L: 222 225 259

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "-78"
	)
	void method516(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 262
			var4 = new HashSet(); // L: 263
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 265
		this.drawMapLinks(var1, var2, var4, var3); // L: 266
	} // L: 267

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "14"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 270

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 271
			if (var5.hasValidElement()) { // L: 273
				int var6 = var5.getElement(); // L: 274
				if (var1.contains(var6)) { // L: 275
					WorldMapElement var7 = InvDefinition.WorldMapElement_get(var6); // L: 276
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 277
				}
			}
		}

		this.method527(var1, var2, var3); // L: 281
	} // L: 282

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Laf;[Lly;Lal;B)V",
		garbageValue = "-124"
	)
	void method617(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 285
			for (var5 = 0; var5 < 64; ++var5) { // L: 286
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 287
				this.method611(var4, var5, this.worldMapData_0, var1); // L: 288
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 291
			for (var5 = 0; var5 < 64; ++var5) { // L: 292
				this.method590(var4, var5, this.worldMapData_0, var1, var2); // L: 293
			}
		}

	} // L: 296

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Laf;[Lly;Lal;I)V",
		garbageValue = "-1042910211"
	)
	void method519(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 299

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 300

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 302
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 303
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 304
					this.method611(var6, var7, var5, var1); // L: 305
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 310

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 311

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 313
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 314
					this.method590(var6, var7, var5, var1, var2); // L: 315
				}
			}
		}

	} // L: 320

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILac;Laf;[Lly;I)V",
		garbageValue = "-1638899903"
	)
	void method590(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method631(var1, var2, var3); // L: 323
		this.method555(var1, var2, var3, var5); // L: 324
	} // L: 325

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILac;Laf;Lal;I)V",
		garbageValue = "-2002564713"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 328
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 329
		if (var6 == -1 && var7 == -1) { // L: 330
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 331
		}

		int var8 = 16711935; // L: 333
		int var9;
		if (var7 != -1) { // L: 334
			int var10 = this.backgroundColor; // L: 336
			FloorOverlayDefinition var11 = WallDecoration.method3449(var7); // L: 338
			if (var11 == null) { // L: 339
				var9 = var10; // L: 340
			} else if (var11.secondaryRgb >= 0) { // L: 343
				var9 = var11.secondaryRgb | -16777216; // L: 344
			} else {
				int var13;
				int var20;
				if (var11.texture >= 0) { // L: 346
					var13 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture); // L: 348
					byte var14 = 96; // L: 349
					int var12;
					if (var13 == -2) { // L: 351
						var12 = 12345678; // L: 352
					} else if (var13 == -1) { // L: 355
						if (var14 < 0) { // L: 356
							var14 = 0; // L: 357
						} else if (var14 > 127) { // L: 359
							var14 = 127; // L: 360
						}

						var20 = 127 - var14; // L: 362
						var12 = var20; // L: 363
					} else {
						var20 = var14 * (var13 & 127) / 128; // L: 366
						if (var20 < 2) { // L: 367
							var20 = 2;
						} else if (var20 > 126) { // L: 368
							var20 = 126;
						}

						var12 = var20 + (var13 & 65408); // L: 369
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 372
				} else if (var11.primaryRgb == 16711935) { // L: 374
					var9 = var10; // L: 375
				} else {
					var13 = var11.hue; // L: 379
					var20 = var11.saturation; // L: 380
					int var15 = var11.lightness; // L: 381
					if (var15 > 179) { // L: 383
						var20 /= 2;
					}

					if (var15 > 192) { // L: 384
						var20 /= 2;
					}

					if (var15 > 217) { // L: 385
						var20 /= 2;
					}

					if (var15 > 243) { // L: 386
						var20 /= 2;
					}

					int var16 = (var20 / 32 << 7) + var15 / 2 + (var13 / 4 << 10); // L: 387
					byte var18 = 96; // L: 392
					int var17;
					if (var16 == -2) { // L: 394
						var17 = 12345678; // L: 395
					} else {
						int var21;
						if (var16 == -1) { // L: 398
							if (var18 < 0) { // L: 399
								var18 = 0; // L: 400
							} else if (var18 > 127) { // L: 402
								var18 = 127; // L: 403
							}

							var21 = 127 - var18; // L: 405
							var17 = var21; // L: 406
						} else {
							var21 = var18 * (var16 & 127) / 128; // L: 409
							if (var21 < 2) { // L: 410
								var21 = 2;
							} else if (var21 > 126) { // L: 411
								var21 = 126;
							}

							var17 = var21 + (var16 & 65408); // L: 412
						}
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 415
				}
			}

			var8 = var9; // L: 418
		}

		if (var7 > -1 && var3.field193[0][var1][var2] == 0) { // L: 420
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 421
		} else {
			var9 = this.method525(var1, var2, var3, var5); // L: 424
			if (var7 == -1) { // L: 425
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 426
			} else {
				var4.method813(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field193[0][var1][var2], var3.field204[0][var1][var2]); // L: 429
			}
		}
	} // L: 422 427 430

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILac;Laf;I)V",
		garbageValue = "-1963666509"
	)
	void method611(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 433
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 434
			if (var6 > -1) { // L: 435
				int var8 = this.backgroundColor; // L: 437
				FloorOverlayDefinition var9 = WallDecoration.method3449(var6); // L: 439
				int var7;
				if (var9 == null) { // L: 440
					var7 = var8; // L: 441
				} else if (var9.secondaryRgb >= 0) { // L: 444
					var7 = var9.secondaryRgb | -16777216; // L: 445
				} else {
					int var11;
					int var19;
					if (var9.texture >= 0) { // L: 447
						var11 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture); // L: 449
						byte var12 = 96; // L: 450
						int var10;
						if (var11 == -2) { // L: 452
							var10 = 12345678; // L: 453
						} else if (var11 == -1) { // L: 456
							if (var12 < 0) { // L: 457
								var12 = 0; // L: 458
							} else if (var12 > 127) { // L: 460
								var12 = 127; // L: 461
							}

							var19 = 127 - var12; // L: 463
							var10 = var19; // L: 464
						} else {
							var19 = var12 * (var11 & 127) / 128; // L: 467
							if (var19 < 2) { // L: 468
								var19 = 2;
							} else if (var19 > 126) { // L: 469
								var19 = 126;
							}

							var10 = var19 + (var11 & 65408); // L: 470
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 473
					} else if (var9.primaryRgb == 16711935) { // L: 475
						var7 = var8; // L: 476
					} else {
						var11 = var9.hue; // L: 480
						var19 = var9.saturation; // L: 481
						int var13 = var9.lightness; // L: 482
						if (var13 > 179) { // L: 484
							var19 /= 2;
						}

						if (var13 > 192) { // L: 485
							var19 /= 2;
						}

						if (var13 > 217) { // L: 486
							var19 /= 2;
						}

						if (var13 > 243) { // L: 487
							var19 /= 2;
						}

						int var14 = (var19 / 32 << 7) + var13 / 2 + (var11 / 4 << 10); // L: 488
						byte var16 = 96; // L: 493
						int var15;
						if (var14 == -2) { // L: 495
							var15 = 12345678; // L: 496
						} else {
							int var20;
							if (var14 == -1) { // L: 499
								if (var16 < 0) { // L: 500
									var16 = 0; // L: 501
								} else if (var16 > 127) { // L: 503
									var16 = 127; // L: 504
								}

								var20 = 127 - var16; // L: 506
								var15 = var20; // L: 507
							} else {
								var20 = var16 * (var14 & 127) / 128; // L: 510
								if (var20 < 2) { // L: 511
									var20 = 2;
								} else if (var20 > 126) { // L: 512
									var20 = 126;
								}

								var15 = var20 + (var14 & 65408); // L: 513
							}
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 516
					}
				}

				if (var3.field193[var5][var1][var2] == 0) { // L: 520
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 521
				} else {
					var4.method813(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field193[var5][var1][var2], var3.field204[var5][var1][var2]); // L: 524
				}
			}
		}

	} // L: 528

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILac;Lal;I)I",
		garbageValue = "-306988149"
	)
	int method525(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 531 532 534
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILac;[Lly;B)V",
		garbageValue = "54"
	)
	void method555(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 538
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 539
			if (var6 != null && var6.length != 0) { // L: 540
				WorldMapDecoration[] var7 = var6; // L: 544

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 545
					WorldMapDecoration var9 = var7[var8]; // L: 546
					int var11 = var9.decoration; // L: 549
					boolean var10 = var11 >= WorldMapDecorationType.field2747.id && var11 <= WorldMapDecorationType.field2753.id; // L: 551
					if (!var10) { // L: 554
						int var13 = var9.decoration; // L: 556
						boolean var12 = var13 == WorldMapDecorationType.field2759.id; // L: 558
						if (!var12) { // L: 560
							continue;
						}
					}

					ObjectComposition var14 = WorldMapAreaData.getObjectDefinition(var9.objectDefinitionId); // L: 562
					if (var14.mapSceneId != -1) { // L: 563
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 564
							var4[var14.mapSceneId].method6302(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 568
						} else {
							var4[var14.mapSceneId].method6302(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 565
						}
					}
				}
			}
		}

	} // L: 576

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILac;B)V",
		garbageValue = "-12"
	)
	void method631(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 579
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 580
			if (var5 != null && var5.length != 0) { // L: 581
				WorldMapDecoration[] var6 = var5; // L: 585

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 586
					WorldMapDecoration var8 = var6[var7]; // L: 587
					if (GraphicsObject.method2153(var8.decoration)) { // L: 589
						ObjectComposition var9 = WorldMapAreaData.getObjectDefinition(var8.objectDefinitionId); // L: 590
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 591
						if (var8.decoration == WorldMapDecorationType.field2765.id) { // L: 592
							this.method539(var1, var2, var8.rotation, var10); // L: 593
						}

						if (var8.decoration == WorldMapDecorationType.field2749.id) { // L: 595
							this.method539(var1, var2, var8.rotation, -3355444); // L: 596
							this.method539(var1, var2, var8.rotation + 1, var10); // L: 597
						}

						if (var8.decoration == WorldMapDecorationType.field2750.id) { // L: 599
							if (var8.rotation == 0) { // L: 600
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 601
							}

							if (var8.rotation == 2) { // L: 602
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 603
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2760.id) { // L: 605
							int var11 = var8.rotation % 2; // L: 606
							int var12;
							if (var11 == 0) { // L: 607
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 608
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 609
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 613
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 614
								}
							}
						}
					}
				}
			}
		}

	} // L: 623

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "1"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 626
		float var6 = var5 / 2.0F; // L: 627
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 628

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 629
			Coord var9 = (Coord)var8.getKey(); // L: 631
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 632
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 633
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 634
			if (var12 != null && var12.hasValidElement()) { // L: 635
				var12.screenX = var10; // L: 636
				var12.screenY = var11; // L: 637
				WorldMapElement var13 = InvDefinition.WorldMapElement_get(var12.getElement()); // L: 638
				if (!var3.contains(var13.getObjectId())) { // L: 639
					this.method520(var12, var10, var11, var5); // L: 640
				}
			}
		}

	} // L: 645

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "31"
	)
	void method527(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 648

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 649
			if (var5.hasValidElement()) { // L: 651
				WorldMapElement var6 = InvDefinition.WorldMapElement_get(var5.getElement()); // L: 652
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 653
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 654
				}
			}
		}

	} // L: 658

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIIII)V",
		garbageValue = "-515640206"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 661
		if (var6 != null) { // L: 662
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 665
			if (var4 % var5 < var5 / 2) { // L: 666
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 667
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 668
			}

		}
	} // L: 663 670

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Laj;IIFI)V",
		garbageValue = "1091480533"
	)
	void method520(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = InvDefinition.WorldMapElement_get(var1.getElement()); // L: 673
		this.method530(var5, var2, var3); // L: 674
		this.method601(var1, var5, var2, var3, var4); // L: 675
	} // L: 676

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIS)V",
		garbageValue = "-21879"
	)
	void method530(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 679
		if (var4 != null) { // L: 680
			int var5 = this.method577(var4, var1.horizontalAlignment); // L: 681
			int var6 = this.method534(var4, var1.verticalAlignment); // L: 682
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 683
		}

	} // L: 685

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Laj;Lic;IIFI)V",
		garbageValue = "-1852361850"
	)
	void method601(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 688
		if (var6 != null) { // L: 689
			if (var6.size.method255(var5)) { // L: 692
				Font var7 = (Font)this.fonts.get(var6.size); // L: 695
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3245, 0, 1, 0, var7.ascent / 2); // L: 696
			}
		}
	} // L: 690 693 697

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "281744270"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 700
		Iterator var6 = this.icon0List.iterator(); // L: 701

		while (var6.hasNext()) { // L: 714
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 702
			if (var7.hasValidElement()) { // L: 704
				int var8 = var7.coord2.x % 64; // L: 705
				int var9 = var7.coord2.y % 64; // L: 706
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 707
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 708
				if (!var3.contains(var7.getElement())) { // L: 709
					this.method520(var7, var7.screenX, var7.screenY, var5); // L: 712
				}
			}
		}

	} // L: 715

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llm;Lje;I)I",
		garbageValue = "1212230502"
	)
	int method577(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 718
		case 0:
			return 0; // L: 729
		case 2:
			return -var1.subWidth / 2; // L: 721
		default:
			return -var1.subWidth; // L: 725
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llm;Lie;I)I",
		garbageValue = "1365602769"
	)
	int method534(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 735
		case 0:
			return 0; // L: 742
		case 2:
			return -var1.subHeight / 2; // L: 746
		default:
			return -var1.subHeight; // L: 738
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Laa;",
		garbageValue = "-1773755795"
	)
	WorldMapLabel method535(int var1) {
		WorldMapElement var2 = InvDefinition.WorldMapElement_get(var1); // L: 773
		return this.createMapLabel(var2); // L: 774
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lic;B)Laa;",
		garbageValue = "-89"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 778
			WorldMapLabelSize var2 = WorldMapLabelSize.method266(var1.textSize); // L: 781
			if (var2 == null) { // L: 782
				return null; // L: 783
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 785
				if (var3 == null) { // L: 786
					return null; // L: 787
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 789
					String[] var5 = new String[var4]; // L: 790
					var3.breakLines(var1.name, (int[])null, var5); // L: 791
					int var6 = var5.length * var3.ascent / 2; // L: 792
					int var7 = 0; // L: 793
					String[] var8 = var5; // L: 795

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 796
						String var10 = var8[var9]; // L: 797
						int var11 = var3.stringWidth(var10); // L: 799
						if (var11 > var7) { // L: 800
							var7 = var11; // L: 801
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 806
				}
			}
		} else {
			return null; // L: 779
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "123"
	)
	List method537(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 810
		if (var4 >= var1 && var5 >= var2) { // L: 811
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 812
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 813
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 814
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 816
						var6.add(var8); // L: 817
					}
				}

				var7 = this.icon0List.iterator(); // L: 821

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 822
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 824
						var6.add(var8); // L: 825
					}
				}

				return var6; // L: 829
			} else {
				return var6; // L: 820
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-1276264710"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 833
		var1.addAll(this.icon0List); // L: 834
		var1.addAll(this.iconMap.values()); // L: 835
		return var1; // L: 836
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	void method539(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 840
		if (var3 == 0) { // L: 841
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 842
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 843
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 844
		}

	} // L: 845

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)[Lgb;",
		garbageValue = "16256"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2172, ServerPacket.field2205, ServerPacket.field2143, ServerPacket.field2144, ServerPacket.field2153, ServerPacket.field2146, ServerPacket.field2147, ServerPacket.field2210, ServerPacket.field2149, ServerPacket.field2195, ServerPacket.field2151, ServerPacket.field2141, ServerPacket.field2198, ServerPacket.field2154, ServerPacket.field2155, ServerPacket.field2156, ServerPacket.field2157, ServerPacket.field2158, ServerPacket.field2159, ServerPacket.field2160, ServerPacket.field2161, ServerPacket.field2207, ServerPacket.field2163, ServerPacket.field2152, ServerPacket.field2165, ServerPacket.field2166, ServerPacket.field2145, ServerPacket.field2184, ServerPacket.field2169, ServerPacket.field2170, ServerPacket.field2188, ServerPacket.field2164, ServerPacket.field2173, ServerPacket.field2174, ServerPacket.field2175, ServerPacket.field2176, ServerPacket.field2177, ServerPacket.field2178, ServerPacket.field2168, ServerPacket.field2171, ServerPacket.field2181, ServerPacket.field2182, ServerPacket.field2183, ServerPacket.field2203, ServerPacket.field2185, ServerPacket.field2150, ServerPacket.field2224, ServerPacket.field2221, ServerPacket.field2189, ServerPacket.field2190, ServerPacket.field2216, ServerPacket.field2186, ServerPacket.field2193, ServerPacket.field2194, ServerPacket.field2202, ServerPacket.field2196, ServerPacket.field2197, ServerPacket.field2191, ServerPacket.field2199, ServerPacket.field2200, ServerPacket.field2206, ServerPacket.field2192, ServerPacket.field2220, ServerPacket.field2204, ServerPacket.field2226, ServerPacket.field2167, ServerPacket.field2215, ServerPacket.field2208, ServerPacket.field2209, ServerPacket.field2179, ServerPacket.field2211, ServerPacket.field2212, ServerPacket.field2213, ServerPacket.field2214, ServerPacket.field2142, ServerPacket.field2148, ServerPacket.field2217, ServerPacket.field2218, ServerPacket.field2219, ServerPacket.field2187, ServerPacket.field2201, ServerPacket.field2180, ServerPacket.field2223, ServerPacket.field2162, ServerPacket.field2225, ServerPacket.field2222}; // L: 95
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)Ljava/lang/String;",
		garbageValue = "216758500"
	)
	static String method642(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart(); // L: 27
			if (var2 > var1) { // L: 28
				var2 = var1;
			}

			byte[] var3 = new byte[var2]; // L: 29
			var0.offset += class219.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 30
			String var4 = VertexNormal.decodeStringCp1252(var3, 0, var2); // L: 31
			return var4; // L: 32
		} catch (Exception var6) { // L: 34
			return "Cabbage"; // L: 35
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhz;IIII)V",
		garbageValue = "-1454373131"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2686 == null) { // L: 929
			throw new RuntimeException(); // L: 930
		} else {
			var0.field2686[var1] = var2; // L: 932
			var0.field2599[var1] = var3; // L: 933
		}
	} // L: 934

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "556014304"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 4913
		int var4 = var1 >> 7; // L: 4914
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 4915
			int var5 = var2; // L: 4916
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 4917
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 4918
			int var7 = var1 & 127; // L: 4919
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 4920
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7; // L: 4921
			return var7 * var9 + var8 * (128 - var7) >> 7; // L: 4922
		} else {
			return 0;
		}
	}
}
