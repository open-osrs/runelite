import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("f")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("e")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("j")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[[Lfn;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("m")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("z")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 303896089
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1832860335
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 590568685
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1476623753
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1546416373
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lof;Ljava/util/HashMap;Ljp;Ljp;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false; // L: 16
		this.loadStarted = false; // L: 17
		this.scaleHandlers = new HashMap(); // L: 22
		this.pixelsPerTile = 0; // L: 31
		this.mapSceneSprites = var1; // L: 34
		this.fonts = var2; // L: 35
		this.geographyArchive = var3; // L: 36
		this.groundArchive = var4; // L: 37
	} // L: 38

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;ZS)V",
		garbageValue = "-5214"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field2131.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2131.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2134.name, var2)); // L: 50
			System.nanoTime(); // L: 51
			System.nanoTime(); // L: 52
			this.mapAreaData = new WorldMapAreaData(); // L: 53

			try {
				this.mapAreaData.init(var6, var7, var5, var3); // L: 55
			} catch (IllegalStateException var19) { // L: 57
				return; // L: 58
			}

			this.mapAreaData.getOriginX(); // L: 60
			this.mapAreaData.getOriginPlane(); // L: 61
			this.mapAreaData.getOriginY(); // L: 62
			this.tileX = this.mapAreaData.getRegionLowX() * 64; // L: 63
			this.tileY = this.mapAreaData.getRegionLowY() * 64; // L: 64
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64; // L: 65
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64; // L: 66
			int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 67
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 68
			System.nanoTime(); // L: 69
			System.nanoTime(); // L: 70
			class44.method532(); // L: 71
			this.regions = new WorldMapRegion[var16][var9]; // L: 72
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator(); // L: 73

			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next(); // L: 74
				int var12 = var11.regionX; // L: 76
				int var13 = var11.regionY; // L: 77
				int var14 = var12 - this.mapAreaData.getRegionLowX(); // L: 78
				int var15 = var13 - this.mapAreaData.getRegionLowY(); // L: 79
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 80
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList); // L: 81
			}

			for (int var17 = 0; var17 < var16; ++var17) { // L: 84
				for (int var18 = 0; var18 < var9; ++var18) { // L: 85
					if (this.regions[var17][var18] == null) { // L: 86
						this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 87
						this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList); // L: 88
					}
				}
			}

			System.nanoTime(); // L: 92
			System.nanoTime(); // L: 93
			if (var1.isValidFileName(WorldMapCacheName.field2130.name, var2)) { // L: 94
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2130.name, var2); // L: 95
				this.compositeTextureSprite = class125.convertJpgToSprite(var20); // L: 96
			}

			System.nanoTime(); // L: 98
			var1.clearGroups(); // L: 99
			var1.clearFiles(); // L: 100
			this.loaded = true; // L: 101
		}
	} // L: 42 102

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1914125455"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 105
	} // L: 106

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 109
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 110
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 111
		int[] var12 = new int[4]; // L: 112
		Rasterizer2D.Rasterizer2D_getClipArray(var12); // L: 113
		WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 114
		float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 115
		int var15 = (int)Math.ceil((double)var14); // L: 116
		this.pixelsPerTile = var15; // L: 117
		if (!this.scaleHandlers.containsKey(var15)) { // L: 118
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15); // L: 119
			var16.init(); // L: 120
			this.scaleHandlers.put(var15, var16); // L: 121
		}

		int var23 = var13.x + var13.width - 1; // L: 123
		int var17 = var13.height + var13.y - 1; // L: 124

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) { // L: 125
			for (var19 = var13.y; var19 <= var17; ++var19) { // L: 126
				this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 127
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11); // L: 130
		Rasterizer2D.Rasterizer2D_setClipArray(var12); // L: 131
		var18 = (int)(64.0F * var14); // L: 132
		var19 = this.tileX + var1; // L: 133
		int var20 = var2 + this.tileY; // L: 134

		for (int var21 = var13.x; var21 < var13.x + var13.width; ++var21) { // L: 135
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) { // L: 136
				this.regions[var21][var22].method3407(var5 + (this.regions[var21][var22].regionX * 64 - var19) * var18 / 64, var8 - (this.regions[var21][var22].regionY * 64 - var20 + 64) * var18 / 64, var18); // L: 137
			}
		}

	} // L: 140

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V",
		garbageValue = "-95"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 143
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 144
		int var16 = (int)(var15 * 64.0F); // L: 145
		int var17 = this.tileX + var1; // L: 146
		int var18 = var2 + this.tileY; // L: 147

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 148
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 149
				if (var13) { // L: 150
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 151
				}

				this.regions[var19][var20].method3417(var5 + (this.regions[var19][var20].regionX * 64 - var17) * var16 / 64, var8 - (this.regions[var19][var20].regionY * 64 - var18 + 64) * var16 / 64, var16, var9); // L: 153
			}
		}

		if (var10 != null && var11 > 0) { // L: 156
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 157
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 158
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 159
				}
			}
		}

	} // L: 163

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "-1541196041"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) { // L: 166
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4); // L: 169
			if (var6 > 0 && var6 % var7 < var7 / 2) { // L: 170
				if (this.icons == null) { // L: 173
					this.buildIcons0(); // L: 174
				}

				Iterator var8 = var5.iterator(); // L: 176

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return; // L: 193
						}

						int var9 = (Integer)var8.next(); // L: 177
						var10 = (List)this.icons.get(var9); // L: 179
					} while(var10 == null); // L: 180

					Iterator var11 = var10.iterator();

					while (var11.hasNext()) { // L: 183
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 184
						int var13 = var3 * (var12.coord2.x - this.tileX) / this.tileWidth; // L: 186
						int var14 = var4 - (var12.coord2.y - this.tileY) * var4 / this.tileHeight; // L: 187
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 188
					}
				}
			}
		}
	} // L: 167 171

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "1811762017"
	)
	public List method3526(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 196
		if (!this.loaded) { // L: 197
			return var11; // L: 198
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 200
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 201
			int var14 = (int)(64.0F * var13); // L: 202
			int var15 = this.tileX + var1; // L: 203
			int var16 = var2 + this.tileY; // L: 204

			for (int var17 = var12.x; var17 < var12.width + var12.x; ++var17) { // L: 205
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) { // L: 206
					List var19 = this.regions[var17][var18].method3437(var5 + (this.regions[var17][var18].regionX * 64 - var15) * var14 / 64, var8 + var6 - (this.regions[var17][var18].regionY * 64 - var16 + 64) * var14 / 64, var14, var9, var10); // L: 207
					if (!var19.isEmpty()) { // L: 208
						var11.addAll(var19); // L: 209
					}
				}
			}

			return var11; // L: 213
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lfh;",
		garbageValue = "-2057635793"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 217
		int var6 = this.tileX + var1; // L: 218
		int var7 = var2 + this.tileY; // L: 219
		int var8 = var3 + this.tileX; // L: 220
		int var9 = var4 + this.tileY; // L: 221
		int var10 = var6 / 64; // L: 222
		int var11 = var7 / 64; // L: 223
		int var12 = var8 / 64; // L: 224
		int var13 = var9 / 64; // L: 225
		var5.width = var12 - var10 + 1; // L: 226
		var5.height = var13 - var11 + 1; // L: 227
		var5.x = var10 - this.mapAreaData.getRegionLowX(); // L: 228
		var5.y = var11 - this.mapAreaData.getRegionLowY(); // L: 229
		if (var5.x < 0) { // L: 230
			var5.width += var5.x; // L: 231
			var5.x = 0; // L: 232
		}

		if (var5.x > this.regions.length - var5.width) { // L: 234
			var5.width = this.regions.length - var5.x; // L: 235
		}

		if (var5.y < 0) { // L: 237
			var5.height += var5.y; // L: 238
			var5.y = 0; // L: 239
		}

		if (var5.y > this.regions[0].length - var5.height) { // L: 241
			var5.height = this.regions[0].length - var5.y; // L: 242
		}

		var5.width = Math.min(var5.width, this.regions.length); // L: 244
		var5.height = Math.min(var5.height, this.regions[0].length); // L: 245
		return var5; // L: 246
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-10"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 250
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-1763373289"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 254
		return this.icons; // L: 255
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) { // L: 259
			this.icons = new HashMap(); // L: 260
		}

		this.icons.clear(); // L: 262

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 263
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) { // L: 264
				List var3 = this.regions[var1][var2].icons(); // L: 265
				Iterator var4 = var3.iterator(); // L: 266

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 267
					if (var5.hasValidElement()) { // L: 269
						int var6 = var5.getElement(); // L: 270
						if (!this.icons.containsKey(var6)) { // L: 271
							LinkedList var7 = new LinkedList(); // L: 272
							var7.add(var5); // L: 273
							this.icons.put(var6, var7); // L: 274
						} else {
							List var8 = (List)this.icons.get(var6); // L: 277
							var8.add(var5); // L: 278
						}
					}
				}
			}
		}

	} // L: 284

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "1764352522"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 287
		if (var3 > 8.0F) { // L: 288
			return 8.0F;
		} else if (var3 < 1.0F) { // L: 289
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 290
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3; // L: 291 292
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)V",
		garbageValue = "59413416"
	)
	static void method3538(GameEngine var0) {
		while (SecureRandomCallable.isKeyDown()) { // L: 1409
			if (SoundCache.field446 == 13) { // L: 1410
				Login.worldSelectOpen = false; // L: 1412
				class339.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1413
				class377.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1414
				Messages.logoSprite.drawAt(Login.xPadding + 382 - Messages.logoSprite.subWidth / 2, 18); // L: 1415
				return; // L: 1417
			}

			if (SoundCache.field446 == 96) { // L: 1419
				if (Login.worldSelectPage > 0 && NetCache.worldSelectLeftSprite != null) { // L: 1420
					--Login.worldSelectPage; // L: 1421
				}
			} else if (SoundCache.field446 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class12.worldSelectRightSprite != null) { // L: 1424 1425
				++Login.worldSelectPage; // L: 1426
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1430
			int var1 = Login.xPadding + 280; // L: 1431
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1432
				World.changeWorldSelectSorting(0, 0); // L: 1433
				return; // L: 1434
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1436
				World.changeWorldSelectSorting(0, 1); // L: 1437
				return; // L: 1438
			}

			int var2 = Login.xPadding + 390; // L: 1440
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1441
				World.changeWorldSelectSorting(1, 0); // L: 1442
				return; // L: 1443
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1445
				World.changeWorldSelectSorting(1, 1); // L: 1446
				return; // L: 1447
			}

			int var3 = Login.xPadding + 500; // L: 1449
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1450
				World.changeWorldSelectSorting(2, 0); // L: 1451
				return; // L: 1452
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1454
				World.changeWorldSelectSorting(2, 1); // L: 1455
				return; // L: 1456
			}

			int var4 = Login.xPadding + 610; // L: 1458
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1459
				World.changeWorldSelectSorting(3, 0); // L: 1460
				return; // L: 1461
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1463
				World.changeWorldSelectSorting(3, 1); // L: 1464
				return; // L: 1465
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1467
				Login.worldSelectOpen = false; // L: 1469
				class339.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1470
				class377.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1471
				Messages.logoSprite.drawAt(Login.xPadding + 382 - Messages.logoSprite.subWidth / 2, 18); // L: 1472
				return; // L: 1474
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1476
				World var5 = World.World_worlds[Login.hoveredWorldIndex]; // L: 1477
				GrandExchangeOfferAgeComparator.changeWorld(var5); // L: 1478
				Login.worldSelectOpen = false; // L: 1480
				class339.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1481
				class377.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1482
				Messages.logoSprite.drawAt(Login.xPadding + 382 - Messages.logoSprite.subWidth / 2, 18); // L: 1483
				return; // L: 1485
			}

			if (Login.worldSelectPage > 0 && NetCache.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= NetCache.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class0.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class0.canvasHeight / 2 + 50) { // L: 1487
				--Login.worldSelectPage; // L: 1488
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class12.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= AttackOption.canvasWidth - class12.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= AttackOption.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class0.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class0.canvasHeight / 2 + 50) { // L: 1490
				++Login.worldSelectPage; // L: 1491
			}
		}

	} // L: 1494

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-306372299"
	)
	static final void method3557() {
		int[] var0 = Players.Players_indices; // L: 3852

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3853
			Player var4 = Client.players[var0[var1]]; // L: 3854
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3855
				--var4.overheadTextCyclesRemaining; // L: 3856
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3857
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3860
			int var2 = Client.npcIndices[var1]; // L: 3861
			NPC var3 = Client.npcs[var2]; // L: 3862
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3863
				--var3.overheadTextCyclesRemaining; // L: 3864
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3865
					var3.overheadText = null;
				}
			}
		}

	} // L: 3868
}
