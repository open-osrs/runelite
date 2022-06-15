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

@ObfuscatedName("hm")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -1432180747
	)
	static int field2743;
	@ObfuscatedName("c")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("v")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("j")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[Lhn;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("g")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("s")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2096721995
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1553712937
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2035001383
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 909480201
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1585461089
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lqu;Ljava/util/HashMap;Llh;Llh;)V"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;Ljava/lang/String;ZI)V",
		garbageValue = "-945278394"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field2867.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2867.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2865.name, var2)); // L: 50
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
			WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 72
			this.regions = new WorldMapRegion[var16][var9]; // L: 74
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator(); // L: 75

			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next(); // L: 76
				int var12 = var11.regionX; // L: 78
				int var13 = var11.regionY; // L: 79
				int var14 = var12 - this.mapAreaData.getRegionLowX(); // L: 80
				int var15 = var13 - this.mapAreaData.getRegionLowY(); // L: 81
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 82
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList); // L: 83
			}

			for (int var17 = 0; var17 < var16; ++var17) { // L: 86
				for (int var18 = 0; var18 < var9; ++var18) { // L: 87
					if (this.regions[var17][var18] == null) { // L: 88
						this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 89
						this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList); // L: 90
					}
				}
			}

			System.nanoTime(); // L: 94
			System.nanoTime(); // L: 95
			if (var1.isValidFileName(WorldMapCacheName.field2866.name, var2)) { // L: 96
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2866.name, var2); // L: 97
				this.compositeTextureSprite = ItemLayer.method3920(var20); // L: 98
			}

			System.nanoTime(); // L: 100
			var1.clearGroups(); // L: 101
			var1.clearFiles(); // L: 102
			this.loaded = true; // L: 103
		}
	} // L: 42 104

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-71448186"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 107
	} // L: 108

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-415772889"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 111
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 112
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 113
		int[] var12 = new int[4]; // L: 114
		Rasterizer2D.Rasterizer2D_getClipArray(var12); // L: 115
		WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 116
		float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 117
		int var15 = (int)Math.ceil((double)var14); // L: 118
		this.pixelsPerTile = var15; // L: 119
		if (!this.scaleHandlers.containsKey(var15)) { // L: 120
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15); // L: 121
			var16.init(); // L: 122
			this.scaleHandlers.put(var15, var16); // L: 123
		}

		int var23 = var13.width + var13.x - 1; // L: 125
		int var17 = var13.height + var13.y - 1; // L: 126

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) { // L: 127
			for (var19 = var13.y; var19 <= var17; ++var19) { // L: 128
				this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 129
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11); // L: 132
		Rasterizer2D.Rasterizer2D_setClipArray(var12); // L: 133
		var18 = (int)(var14 * 64.0F); // L: 134
		var19 = this.tileX + var1; // L: 135
		int var20 = var2 + this.tileY; // L: 136

		for (int var21 = var13.x; var21 < var13.width + var13.x; ++var21) { // L: 137
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) { // L: 138
				this.regions[var21][var22].method4694(var5 + (this.regions[var21][var22].regionX * 64 - var19) * var18 / 64, var8 - (this.regions[var21][var22].regionY * 64 - var20 + 64) * var18 / 64, var18); // L: 139
			}
		}

	} // L: 142

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V",
		garbageValue = "-12"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 145
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 146
		int var16 = (int)(var15 * 64.0F); // L: 147
		int var17 = this.tileX + var1; // L: 148
		int var18 = var2 + this.tileY; // L: 149

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 150
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 151
				if (var13) { // L: 152
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 153
				}

				this.regions[var19][var20].method4738(var5 + (this.regions[var19][var20].regionX * 64 - var17) * var16 / 64, var8 - (this.regions[var19][var20].regionY * 64 - var18 + 64) * var16 / 64, var16, var9); // L: 155
			}
		}

		if (var10 != null && var11 > 0) { // L: 158
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 159
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 160
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 161
				}
			}
		}

	} // L: 165

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "647582053"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) { // L: 168
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4); // L: 171
			if (var6 > 0 && var6 % var7 < var7 / 2) { // L: 172
				if (this.icons == null) { // L: 175
					this.buildIcons0(); // L: 176
				}

				Iterator var8 = var5.iterator(); // L: 178

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return; // L: 195
						}

						int var9 = (Integer)var8.next(); // L: 179
						var10 = (List)this.icons.get(var9); // L: 181
					} while(var10 == null); // L: 182

					Iterator var11 = var10.iterator();

					while (var11.hasNext()) { // L: 185
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 186
						int var13 = var3 * (var12.coord2.x - this.tileX) / this.tileWidth; // L: 188
						int var14 = var4 - (var12.coord2.y - this.tileY) * var4 / this.tileHeight; // L: 189
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 190
					}
				}
			}
		}
	} // L: 169 173

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "1063140476"
	)
	public List method4819(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 198
		if (!this.loaded) { // L: 199
			return var11; // L: 200
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 202
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 203
			int var14 = (int)(64.0F * var13); // L: 204
			int var15 = this.tileX + var1; // L: 205
			int var16 = var2 + this.tileY; // L: 206

			for (int var17 = var12.x; var17 < var12.width + var12.x; ++var17) { // L: 207
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 208
					List var19 = this.regions[var17][var18].method4802(var5 + (this.regions[var17][var18].regionX * 64 - var15) * var14 / 64, var8 + var6 - (this.regions[var17][var18].regionY * 64 - var16 + 64) * var14 / 64, var14, var9, var10); // L: 209
					if (!var19.isEmpty()) { // L: 210
						var11.addAll(var19); // L: 211
					}
				}
			}

			return var11; // L: 215
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lij;",
		garbageValue = "376056062"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 219
		int var6 = this.tileX + var1; // L: 220
		int var7 = var2 + this.tileY; // L: 221
		int var8 = var3 + this.tileX; // L: 222
		int var9 = var4 + this.tileY; // L: 223
		int var10 = var6 / 64; // L: 224
		int var11 = var7 / 64; // L: 225
		int var12 = var8 / 64; // L: 226
		int var13 = var9 / 64; // L: 227
		var5.width = var12 - var10 + 1; // L: 228
		var5.height = var13 - var11 + 1; // L: 229
		var5.x = var10 - this.mapAreaData.getRegionLowX(); // L: 230
		var5.y = var11 - this.mapAreaData.getRegionLowY(); // L: 231
		if (var5.x < 0) { // L: 232
			var5.width += var5.x; // L: 233
			var5.x = 0; // L: 234
		}

		if (var5.x > this.regions.length - var5.width) { // L: 236
			var5.width = this.regions.length - var5.x; // L: 237
		}

		if (var5.y < 0) { // L: 239
			var5.height += var5.y; // L: 240
			var5.y = 0; // L: 241
		}

		if (var5.y > this.regions[0].length - var5.height) { // L: 243
			var5.height = this.regions[0].length - var5.y; // L: 244
		}

		var5.width = Math.min(var5.width, this.regions.length); // L: 246
		var5.height = Math.min(var5.height, this.regions[0].length); // L: 247
		return var5; // L: 248
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-43937891"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 252
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-1914441394"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 256
		return this.icons; // L: 257
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2076094078"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) { // L: 261
			this.icons = new HashMap(); // L: 262
		}

		this.icons.clear(); // L: 264

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 265
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) { // L: 266
				List var3 = this.regions[var1][var2].icons(); // L: 267
				Iterator var4 = var3.iterator(); // L: 268

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 269
					if (var5.hasValidElement()) { // L: 271
						int var6 = var5.getElement(); // L: 272
						if (!this.icons.containsKey(var6)) { // L: 273
							LinkedList var7 = new LinkedList(); // L: 274
							var7.add(var5); // L: 275
							this.icons.put(var6, var7); // L: 276
						} else {
							List var8 = (List)this.icons.get(var6); // L: 279
							var8.add(var5); // L: 280
						}
					}
				}
			}
		}

	} // L: 286

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "-251921137"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 289
		if (var3 > 8.0F) { // L: 290
			return 8.0F;
		} else if (var3 < 1.0F) { // L: 291
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 292
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3; // L: 293 294
		}
	}
}
