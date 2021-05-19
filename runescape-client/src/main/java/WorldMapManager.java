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

@ObfuscatedName("fs")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 46139673
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("h")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("c")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("l")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("t")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("i")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1845573137
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -459948677
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -893999221
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -865810233
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1081719921
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;ZI)V",
		garbageValue = "1799614523"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field2128.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2128.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2123.name, var2)); // L: 50
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
			if (var1.isValidFileName(WorldMapCacheName.field2124.name, var2)) { // L: 96
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2124.name, var2); // L: 97
				this.compositeTextureSprite = WorldMapAreaData.convertJpgToSprite(var20); // L: 98
			}

			System.nanoTime(); // L: 100
			var1.clearGroups(); // L: 101
			var1.clearFiles(); // L: 102
			this.loaded = true; // L: 103
		}
	} // L: 42 104

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 107
	} // L: 108

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-98"
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

		int var23 = var13.x + var13.width - 1; // L: 125
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

		for (int var21 = var13.x; var21 < var13.x + var13.width; ++var21) { // L: 137
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) { // L: 138
				this.regions[var21][var22].method3271(var5 + (this.regions[var21][var22].regionX * 64 - var19) * var18 / 64, var8 - (this.regions[var21][var22].regionY * 64 - var20 + 64) * var18 / 64, var18); // L: 139
			}
		}

	} // L: 142

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-2114068837"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 145
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 146
		int var16 = (int)(64.0F * var15); // L: 147
		int var17 = this.tileX + var1; // L: 148
		int var18 = var2 + this.tileY; // L: 149

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 150
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 151
				if (var13) { // L: 152
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 153
				}

				this.regions[var19][var20].method3282(var5 + (this.regions[var19][var20].regionX * 64 - var17) * var16 / 64, var8 - (this.regions[var19][var20].regionY * 64 - var18 + 64) * var16 / 64, var16, var9); // L: 155
			}
		}

		if (var10 != null && var11 > 0) { // L: 158
			for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 159
				for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 160
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 161
				}
			}
		}

	} // L: 165

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "-1860707171"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)Ljava/util/List;",
		garbageValue = "-50"
	)
	public List method3430(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 198
		if (!this.loaded) { // L: 199
			return var11; // L: 200
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 202
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 203
			int var14 = (int)(var13 * 64.0F); // L: 204
			int var15 = this.tileX + var1; // L: 205
			int var16 = var2 + this.tileY; // L: 206

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 207
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 208
					List var19 = this.regions[var17][var18].method3303(var5 + (this.regions[var17][var18].regionX * 64 - var15) * var14 / 64, var8 + var6 - (this.regions[var17][var18].regionY * 64 - var16 + 64) * var14 / 64, var14, var9, var10); // L: 209
					if (!var19.isEmpty()) { // L: 210
						var11.addAll(var19); // L: 211
					}
				}
			}

			return var11; // L: 215
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lfq;",
		garbageValue = "-77568480"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1468507675"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 252
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/HashMap;",
		garbageValue = "-114"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 256
		return this.icons; // L: 257
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1232365989"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "2102761874"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "100"
	)
	static int method3438(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 3511
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lfb;IIII)V",
		garbageValue = "-604667253"
	)
	static void method3425(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class12.clientPreferences.areaSoundEffectsVolume != 0) { // L: 3752
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3753
				int var4 = var0.soundEffects[var1]; // L: 3754
				if (var4 != 0) { // L: 3755
					int var5 = var4 >> 8; // L: 3756
					int var6 = var4 >> 4 & 7; // L: 3757
					int var7 = var4 & 15; // L: 3758
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 3759
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 3760
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3761
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3762
					int var8 = (var2 - 64) / 128; // L: 3763
					int var9 = (var3 - 64) / 128; // L: 3764
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 3765
					++Client.soundEffectCount; // L: 3766
				}
			}
		}
	} // L: 3767

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	static final void method3439() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3898
			var0 = class35.localPlayer.x; // L: 3899
			var1 = class35.localPlayer.y; // L: 3900
			if (HorizontalAlignment.oculusOrbFocalPointX - var0 < -500 || HorizontalAlignment.oculusOrbFocalPointX - var0 > 500 || class280.oculusOrbFocalPointY - var1 < -500 || class280.oculusOrbFocalPointY - var1 > 500) { // L: 3901
				HorizontalAlignment.oculusOrbFocalPointX = var0; // L: 3902
				class280.oculusOrbFocalPointY = var1; // L: 3903
			}

			if (var0 != HorizontalAlignment.oculusOrbFocalPointX) { // L: 3905
				HorizontalAlignment.oculusOrbFocalPointX += (var0 - HorizontalAlignment.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class280.oculusOrbFocalPointY) { // L: 3906
				class280.oculusOrbFocalPointY += (var1 - class280.oculusOrbFocalPointY) / 16;
			}

			var2 = HorizontalAlignment.oculusOrbFocalPointX >> 7; // L: 3907
			var3 = class280.oculusOrbFocalPointY >> 7; // L: 3908
			var4 = SceneTilePaint.getTileHeight(HorizontalAlignment.oculusOrbFocalPointX, class280.oculusOrbFocalPointY, ParamComposition.Client_plane); // L: 3909
			var5 = 0; // L: 3910
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3911
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3912
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3913
						int var8 = ParamComposition.Client_plane; // L: 3914
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3915
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3916
						if (var9 > var5) { // L: 3917
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3921
			if (var6 > 98048) { // L: 3922
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3923
				var6 = 32768;
			}

			if (var6 > Client.field702) { // L: 3924
				Client.field702 += (var6 - Client.field702) / 24;
			} else if (var6 < Client.field702) { // L: 3925
				Client.field702 += (var6 - Client.field702) / 80;
			}

			Decimator.field523 = SceneTilePaint.getTileHeight(class35.localPlayer.x, class35.localPlayer.y, ParamComposition.Client_plane) - Client.camFollowHeight; // L: 3926
		} else if (Client.oculusOrbState == 1) { // L: 3928
			if (Client.field699 && class35.localPlayer != null) { // L: 3930
				var0 = class35.localPlayer.pathX[0]; // L: 3931
				var1 = class35.localPlayer.pathY[0]; // L: 3932
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 3933
					HorizontalAlignment.oculusOrbFocalPointX = class35.localPlayer.x; // L: 3934
					var2 = SceneTilePaint.getTileHeight(class35.localPlayer.x, class35.localPlayer.y, ParamComposition.Client_plane) - Client.camFollowHeight; // L: 3935
					if (var2 < Decimator.field523) { // L: 3936
						Decimator.field523 = var2;
					}

					class280.oculusOrbFocalPointY = class35.localPlayer.y; // L: 3937
					Client.field699 = false; // L: 3938
				}
			}

			short var10 = -1; // L: 3941
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3942
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3943
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3944
				if (var10 == 0) { // L: 3945
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3946
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3947
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3949
				if (var10 == 0) { // L: 3950
					var10 = 256;
				} else if (var10 == 1024) { // L: 3951
					var10 = 768;
				} else {
					var10 = 512; // L: 3952
				}
			}

			byte var11 = 0; // L: 3954
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3955
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3956
				var11 = 1;
			}

			var2 = 0; // L: 3957
			if (var10 >= 0 || var11 != 0) { // L: 3958
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * 1976464923 * -217353197 : Client.oculusOrbNormalSpeed * -832411863 * 1510155545; // L: 3959
				var2 *= 16; // L: 3960
				Client.field694 = var10; // L: 3961
				Client.field695 = var11; // L: 3962
			}

			if (Client.field693 < var2) { // L: 3964
				Client.field693 += var2 / 8; // L: 3965
				if (Client.field693 > var2) { // L: 3966
					Client.field693 = var2;
				}
			} else if (Client.field693 > var2) { // L: 3968
				Client.field693 = Client.field693 * 9 / 10;
			}

			if (Client.field693 > 0) { // L: 3969
				var3 = Client.field693 / 16; // L: 3970
				if (Client.field694 >= 0) { // L: 3971
					var0 = Client.field694 - HealthBarDefinition.cameraYaw & 2047; // L: 3972
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3973
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3974
					HorizontalAlignment.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3975
					class280.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 3976
				}

				if (Client.field695 != 0) { // L: 3978
					Decimator.field523 += var3 * Client.field695; // L: 3979
					if (Decimator.field523 > 0) { // L: 3980
						Decimator.field523 = 0;
					}
				}
			} else {
				Client.field694 = -1; // L: 3984
				Client.field695 = -1; // L: 3985
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3987
				Client.packetWriter.addNode(HealthBarDefinition.getPacketBufferNode(ClientPacket.field2601, Client.packetWriter.isaacCipher)); // L: 3989
				Client.oculusOrbState = 0; // L: 3990
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class229.mouseCam) { // L: 3994
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3995
			Client.camAngleDX = var0 * 2; // L: 3996
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * -563072281 * 245940439; // L: 3997
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3998
			Client.camAngleDY = var1 * 2; // L: 3999
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * -661389681 * -1322164113; // L: 4000
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 4003
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 4004
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 4005
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 4006
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 4007
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 4008
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 4009
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 4010
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 4012
		Client.camAngleX += Client.camAngleDX / 2; // L: 4013
		if (Client.camAngleX < 128) { // L: 4014
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4015
			Client.camAngleX = 383;
		}

	} // L: 4016
}
