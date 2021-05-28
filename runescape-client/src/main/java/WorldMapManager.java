import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
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

@ObfuscatedName("ff")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("v")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("n")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("p")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[[Lfq;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("r")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("u")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 758122357
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 197299753
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 274838579
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1210430205
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -978895597
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lop;Ljava/util/HashMap;Ljv;Ljv;)V"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljava/lang/String;ZB)V",
		garbageValue = "-19"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field2137.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2137.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2132.name, var2)); // L: 50
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
			if (var1.isValidFileName(WorldMapCacheName.field2134.name, var2)) { // L: 96
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2134.name, var2); // L: 97
				this.compositeTextureSprite = ParamComposition.convertJpgToSprite(var20); // L: 98
			}

			System.nanoTime(); // L: 100
			var1.clearGroups(); // L: 101
			var1.clearFiles(); // L: 102
			this.loaded = true; // L: 103
		}
	} // L: 42 104

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "768"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 107
	} // L: 108

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "181464110"
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
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15);
			var16.init(); // L: 122
			this.scaleHandlers.put(var15, var16);
		}

		int var23 = var13.width + var13.x - 1;
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
			for (int var22 = var13.y; var22 < var13.height + var13.y; ++var22) { // L: 138
				this.regions[var21][var22].method3328(var5 + (this.regions[var21][var22].regionX * 64 - var19) * var18 / 64, var8 - (this.regions[var21][var22].regionY * 64 - var20 + 64) * var18 / 64, var18); // L: 139
			}
		}

	} // L: 142

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1554077956"
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
		for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 150
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 151
				if (var13) { // L: 152
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 153
				}

				this.regions[var19][var20].method3353(var5 + (this.regions[var19][var20].regionX * 64 - var17) * var16 / 64, var8 - (this.regions[var19][var20].regionY * 64 - var18 + 64) * var16 / 64, var16, var9); // L: 155
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "-397966592"
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

					Iterator var11 = var10.iterator(); // L: 185

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 186
						int var13 = var3 * (var12.coord2.x - this.tileX) / this.tileWidth; // L: 188
						int var14 = var4 - (var12.coord2.y - this.tileY) * var4 / this.tileHeight; // L: 189
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 190
					}
				}
			}
		}
	} // L: 169 173

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "533098241"
	)
	public List method3465(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 198
		if (!this.loaded) { // L: 199
			return var11; // L: 200
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 202
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 203
			int var14 = (int)(var13 * 64.0F);
			int var15 = this.tileX + var1;
			int var16 = var2 + this.tileY;

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 207
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) {
					List var19 = this.regions[var17][var18].method3359(var5 + (this.regions[var17][var18].regionX * 64 - var15) * var14 / 64, var8 + var6 - (this.regions[var17][var18].regionY * 64 - var16 + 64) * var14 / 64, var14, var9, var10);
					if (!var19.isEmpty()) {
						var11.addAll(var19);
					}
				}
			}

			return var11;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Lfu;",
		garbageValue = "-6"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 219
		int var6 = this.tileX + var1;
		int var7 = var2 + this.tileY;
		int var8 = var3 + this.tileX;
		int var9 = var4 + this.tileY; // L: 223
		int var10 = var6 / 64; // L: 224
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.width = var12 - var10 + 1; // L: 228
		var5.height = var13 - var11 + 1;
		var5.x = var10 - this.mapAreaData.getRegionLowX(); // L: 230
		var5.y = var11 - this.mapAreaData.getRegionLowY(); // L: 231
		if (var5.x < 0) {
			var5.width += var5.x;
			var5.x = 0; // L: 234
		}

		if (var5.x > this.regions.length - var5.width) {
			var5.width = this.regions.length - var5.x;
		}

		if (var5.y < 0) {
			var5.height += var5.y;
			var5.y = 0; // L: 241
		}

		if (var5.y > this.regions[0].length - var5.height) { // L: 243
			var5.height = this.regions[0].length - var5.y;
		}

		var5.width = Math.min(var5.width, this.regions.length);
		var5.height = Math.min(var5.height, this.regions[0].length);
		return var5;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "831698872"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 252
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "1724645516"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0();
		return this.icons;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "582634997"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) {
			this.icons = new HashMap();
		}

		this.icons.clear(); // L: 264

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 265
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) {
				List var3 = this.regions[var1][var2].icons(); // L: 267
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
					if (var5.hasValidElement()) {
						int var6 = var5.getElement();
						if (!this.icons.containsKey(var6)) {
							LinkedList var7 = new LinkedList(); // L: 274
							var7.add(var5);
							this.icons.put(var6, var7);
						} else {
							List var8 = (List)this.icons.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "20"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2;
		if (var3 > 8.0F) {
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3);
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Laf;B)V",
		garbageValue = "-51"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) { // L: 204
			class20.method230(var0); // L: 205
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 208
				ObjectComposition.clientPreferences.titleMusicDisabled = !ObjectComposition.clientPreferences.titleMusicDisabled; // L: 209
				TileItem.savePreferences(); // L: 210
				if (!ObjectComposition.clientPreferences.titleMusicDisabled) { // L: 211
					Archive var1 = UrlRequest.archive6; // L: 212
					int var2 = var1.getGroupId("scape main"); // L: 214
					int var3 = var1.getFileId(var2, ""); // L: 215
					LoginScreenAnimation.method2219(var1, var2, var3, 255, false); // L: 216
				} else {
					class124.midiPcmStream.clear(); // L: 220
					class232.musicPlayerStatus = 1; // L: 221
					ModelData0.musicTrackArchive = null; // L: 222
				}
			}

			if (Client.gameState != 5) { // L: 225
				if (Login.field1050 == -1L) { // L: 226
					Login.field1050 = ObjectComposition.currentTimeMillis() + 1000L; // L: 227
				}

				long var21 = ObjectComposition.currentTimeMillis(); // L: 229
				boolean var31;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 232
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 236
							var31 = true; // L: 244
							break;
						}

						ArchiveLoader var4 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 237
						if (!var4.isLoaded()) { // L: 238
							var31 = false; // L: 239
							break; // L: 240
						}

						++Client.archiveLoadersDone; // L: 242
					}
				} else {
					var31 = true; // L: 233
				}

				if (var31 && -1L == Login.field1022) { // L: 246 247
					Login.field1022 = var21; // L: 248
					if (Login.field1022 > Login.field1050) { // L: 249
						Login.field1050 = Login.field1022; // L: 250
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 254
					int var23;
					if (Language.Language_EN == class378.clientLanguage) { // L: 255
						if (MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 256
							var23 = Login.xPadding + 5; // L: 257
							short var5 = 463; // L: 258
							byte var6 = 100; // L: 259
							byte var7 = 35; // L: 260
							if (MouseHandler.MouseHandler_lastPressedX >= var23 && MouseHandler.MouseHandler_lastPressedX <= var23 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var5 + var7) { // L: 261
								VarbitComposition.method2859(); // L: 262
								return; // L: 263
							}
						}

						if (MilliClock.World_request != null) { // L: 266
							VarbitComposition.method2859();
						}
					}

					var23 = MouseHandler.MouseHandler_lastButton; // L: 268
					int var32 = MouseHandler.MouseHandler_lastPressedX; // L: 269
					int var33 = MouseHandler.MouseHandler_lastPressedY; // L: 270
					if (var23 == 0) { // L: 271
						var32 = MouseHandler.MouseHandler_x; // L: 272
						var33 = MouseHandler.MouseHandler_y; // L: 273
					}

					if (!Client.mouseCam && var23 == 4) { // L: 275
						var23 = 1;
					}

					short var36;
					int var37;
					if (Login.loginIndex == 0) { // L: 276
						boolean var41 = false; // L: 277

						while (ClanChannelMember.isKeyDown()) { // L: 278
							if (ItemComposition.field1859 == 84) { // L: 279
								var41 = true; // L: 280
							}
						}

						var37 = UserComparator4.loginBoxCenter - 80; // L: 283
						var36 = 291; // L: 284
						if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) { // L: 285
							Players.openURL(KitDefinition.method2705("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 286
						}

						var37 = UserComparator4.loginBoxCenter + 80; // L: 288
						if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20 || var41) { // L: 289
							if ((Client.worldProperties & 33554432) != 0) { // L: 290
								Login.Login_response0 = ""; // L: 291
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 292
								Login.Login_response2 = "Your normal account will not be affected."; // L: 293
								Login.Login_response3 = ""; // L: 294
								Login.loginIndex = 1; // L: 295
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 297
									Login.currentLoginField = 1; // L: 298
								} else {
									Login.currentLoginField = 0; // L: 301
								}
							} else if ((Client.worldProperties & 4) != 0) { // L: 305
								if ((Client.worldProperties & 1024) != 0) { // L: 306
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 307
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 308
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 309
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 312
									Login.Login_response2 = "Players can attack each other"; // L: 313
									Login.Login_response3 = "almost everywhere."; // L: 314
								}

								Login.Login_response0 = "Warning!"; // L: 316
								Login.loginIndex = 1; // L: 317
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 319
									Login.currentLoginField = 1; // L: 320
								} else {
									Login.currentLoginField = 0; // L: 323
								}
							} else if ((Client.worldProperties & 1024) != 0) { // L: 327
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 328
								Login.Login_response2 = "The Protect Item prayer will"; // L: 329
								Login.Login_response3 = "not work on this world."; // L: 330
								Login.Login_response0 = "Warning!"; // L: 331
								Login.loginIndex = 1; // L: 332
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 334
									Login.currentLoginField = 1; // L: 335
								} else {
									Login.currentLoginField = 0; // L: 338
								}
							} else {
								ClanChannelMember.Login_promptCredentials(false); // L: 343
							}
						}
					} else {
						short var8;
						int var34;
						if (Login.loginIndex == 1) { // L: 347
							while (true) {
								if (!ClanChannelMember.isKeyDown()) { // L: 348
									var34 = UserComparator4.loginBoxCenter - 80; // L: 356
									var8 = 321; // L: 357
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 358
										ClanChannelMember.Login_promptCredentials(false); // L: 359
									}

									var34 = UserComparator4.loginBoxCenter + 80; // L: 361
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 362
										Login.loginIndex = 0; // L: 363
									}
									break;
								}

								if (ItemComposition.field1859 == 84) { // L: 349
									ClanChannelMember.Login_promptCredentials(false); // L: 350
								} else if (ItemComposition.field1859 == 13) { // L: 352
									Login.loginIndex = 0; // L: 353
								}
							}
						} else {
							int var11;
							short var35;
							boolean var38;
							if (Login.loginIndex == 2) { // L: 366
								var35 = 201; // L: 367
								var34 = var35 + 52; // L: 368
								if (var23 == 1 && var33 >= var34 - 12 && var33 < var34 + 2) { // L: 369
									Login.currentLoginField = 0;
								}

								var34 += 15; // L: 370
								if (var23 == 1 && var33 >= var34 - 12 && var33 < var34 + 2) { // L: 371
									Login.currentLoginField = 1;
								}

								var34 += 15; // L: 372
								var35 = 361; // L: 373
								if (DynamicObject.field1107 != null) { // L: 374
									var37 = DynamicObject.field1107.highX / 2; // L: 375
									if (var23 == 1 && var32 >= DynamicObject.field1107.lowX - var37 && var32 <= var37 + DynamicObject.field1107.lowX && var33 >= var35 - 15 && var33 < var35) { // L: 376
										switch(Login.field1039) { // L: 377
										case 1:
											class260.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 380
											Login.loginIndex = 5; // L: 381
											return; // L: 382
										case 2:
											Players.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 386
										}
									}
								}

								var37 = UserComparator4.loginBoxCenter - 80; // L: 392
								var36 = 321; // L: 393
								if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) { // L: 394
									Login.Login_username = Login.Login_username.trim(); // L: 395
									if (Login.Login_username.length() == 0) { // L: 396
										class260.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 397
										return; // L: 398
									}

									if (Login.Login_password.length() == 0) { // L: 400
										class260.setLoginResponseString("", "Please enter your password.", ""); // L: 401
										return; // L: 402
									}

									class260.setLoginResponseString("", "Connecting to server...", ""); // L: 404
									VarbitComposition.method2849(false); // L: 405
									class12.updateGameState(20); // L: 406
									return; // L: 407
								}

								var37 = Login.loginBoxX + 180 + 80; // L: 409
								if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) { // L: 410
									Login.loginIndex = 0; // L: 411
									Login.Login_username = ""; // L: 412
									Login.Login_password = ""; // L: 413
									class5.field53 = 0; // L: 414
									Varps.otp = ""; // L: 415
									Login.field1043 = true; // L: 416
								}

								var37 = UserComparator4.loginBoxCenter + -117; // L: 418
								var36 = 277; // L: 419
								Login.field1041 = var32 >= var37 && var32 < var37 + Skeleton.field2287 && var33 >= var36 && var33 < var36 + WorldMapIcon_1.field1937; // L: 420
								if (var23 == 1 && Login.field1041) { // L: 421
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 422
									if (!Client.Login_isUsernameRemembered && ObjectComposition.clientPreferences.rememberedUsername != null) { // L: 423
										ObjectComposition.clientPreferences.rememberedUsername = null; // L: 424
										TileItem.savePreferences(); // L: 425
									}
								}

								var37 = UserComparator4.loginBoxCenter + 24; // L: 428
								var36 = 277; // L: 429
								Login.field1047 = var32 >= var37 && var32 < var37 + Skeleton.field2287 && var33 >= var36 && var33 < var36 + WorldMapIcon_1.field1937; // L: 430
								if (var23 == 1 && Login.field1047) { // L: 431
									ObjectComposition.clientPreferences.hideUsername = !ObjectComposition.clientPreferences.hideUsername; // L: 432
									if (!ObjectComposition.clientPreferences.hideUsername) { // L: 433
										Login.Login_username = ""; // L: 434
										ObjectComposition.clientPreferences.rememberedUsername = null; // L: 435
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 437
											Login.currentLoginField = 1; // L: 438
										} else {
											Login.currentLoginField = 0; // L: 441
										}
									}

									TileItem.savePreferences(); // L: 445
								}

								while (true) {
									int var12;
									Transferable var25;
									do {
										while (true) {
											label975:
											do {
												while (true) {
													while (ClanChannelMember.isKeyDown()) { // L: 447
														if (ItemComposition.field1859 != 13) { // L: 448
															if (Login.currentLoginField != 0) { // L: 457
																continue label975;
															}

															char var39 = class249.field3116; // L: 458

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var39 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 460 461
															}

															if (ItemComposition.field1859 == 85 && Login.Login_username.length() > 0) { // L: 464
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (ItemComposition.field1859 == 84 || ItemComposition.field1859 == 80) { // L: 465
																Login.currentLoginField = 1;
															}

															if (DevicePcmPlayerProvider.method385(class249.field3116) && Login.Login_username.length() < 320) { // L: 466
																Login.Login_username = Login.Login_username + class249.field3116;
															}
														} else {
															Login.loginIndex = 0; // L: 449
															Login.Login_username = ""; // L: 450
															Login.Login_password = ""; // L: 451
															class5.field53 = 0; // L: 452
															Varps.otp = ""; // L: 453
															Login.field1043 = true; // L: 454
														}
													}

													return; // L: 755
												}
											} while(Login.currentLoginField != 1); // L: 468

											if (ItemComposition.field1859 == 85 && Login.Login_password.length() > 0) { // L: 469
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 470
											} else if (ItemComposition.field1859 == 84 || ItemComposition.field1859 == 80) { // L: 472
												Login.currentLoginField = 0; // L: 473
												if (ItemComposition.field1859 == 84) { // L: 474
													Login.Login_username = Login.Login_username.trim(); // L: 475
													if (Login.Login_username.length() == 0) { // L: 476
														class260.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 477
														return; // L: 478
													}

													if (Login.Login_password.length() == 0) { // L: 480
														class260.setLoginResponseString("", "Please enter your password.", ""); // L: 481
														return; // L: 482
													}

													class260.setLoginResponseString("", "Connecting to server...", ""); // L: 484
													VarbitComposition.method2849(false); // L: 485
													class12.updateGameState(20); // L: 486
													return; // L: 487
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && ItemComposition.field1859 == 67) { // L: 490
												Clipboard var24 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 491
												var25 = var24.getContents(class23.client); // L: 492
												var12 = 20 - Login.Login_password.length(); // L: 493
												break;
											}

											char var40 = class249.field3116; // L: 535
											if ((var40 < ' ' || var40 >= 127) && (var40 <= 127 || var40 >= 160) && (var40 <= 160 || var40 > 255)) { // L: 537
												label1187: {
													if (var40 != 0) { // L: 541
														char[] var26 = class301.cp1252AsciiExtension; // L: 543

														for (int var27 = 0; var27 < var26.length; ++var27) { // L: 544
															char var14 = var26[var27]; // L: 545
															if (var40 == var14) { // L: 547
																var38 = true; // L: 548
																break label1187; // L: 549
															}
														}
													}

													var38 = false; // L: 555
												}
											} else {
												var38 = true; // L: 538
											}

											if (var38 && DevicePcmPlayerProvider.method385(class249.field3116) && Login.Login_password.length() < 20) { // L: 557
												Login.Login_password = Login.Login_password + class249.field3116; // L: 558
											}
										}
									} while(var12 <= 0); // L: 494

									try {
										String var13 = (String)var25.getTransferData(DataFlavor.stringFlavor); // L: 496
										int var42 = Math.min(var12, var13.length()); // L: 497

										for (int var15 = 0; var15 < var42; ++var15) { // L: 498
											char var17 = var13.charAt(var15); // L: 500
											boolean var16;
											if ((var17 < ' ' || var17 >= 127) && (var17 <= 127 || var17 >= 160) && (var17 <= 160 || var17 > 255)) { // L: 502
												label1190: {
													if (var17 != 0) { // L: 506
														char[] var18 = class301.cp1252AsciiExtension; // L: 508

														for (int var19 = 0; var19 < var18.length; ++var19) { // L: 509
															char var20 = var18[var19]; // L: 510
															if (var20 == var17) { // L: 512
																var16 = true; // L: 513
																break label1190; // L: 514
															}
														}
													}

													var16 = false; // L: 520
												}
											} else {
												var16 = true; // L: 503
											}

											if (!var16 || !DevicePcmPlayerProvider.method385(var13.charAt(var15))) { // L: 522
												Login.loginIndex = 3; // L: 523
												return; // L: 524
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var42); // L: 527
									} catch (UnsupportedFlavorException var29) { // L: 529
									} catch (IOException var30) { // L: 530
									}
								}
							} else if (Login.loginIndex == 3) { // L: 565
								var34 = Login.loginBoxX + 180; // L: 566
								var8 = 276; // L: 567
								if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 568
									ClanChannelMember.Login_promptCredentials(false); // L: 569
								}

								var34 = Login.loginBoxX + 180; // L: 571
								var8 = 326; // L: 572
								if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 573
									class260.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 574
									Login.loginIndex = 5; // L: 575
									return; // L: 576
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 579
									var34 = Login.loginBoxX + 180 - 80; // L: 580
									var8 = 321; // L: 581
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 582
										Varps.otp.trim(); // L: 583
										if (Varps.otp.length() != 6) { // L: 584
											class260.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 585
											return; // L: 586
										}

										class5.field53 = Integer.parseInt(Varps.otp); // L: 588
										Varps.otp = ""; // L: 589
										VarbitComposition.method2849(true); // L: 590
										class260.setLoginResponseString("", "Connecting to server...", ""); // L: 591
										class12.updateGameState(20); // L: 592
										return; // L: 593
									}

									if (var23 == 1 && var32 >= Login.loginBoxX + 180 - 9 && var32 <= Login.loginBoxX + 180 + 130 && var33 >= 263 && var33 <= 296) { // L: 595
										Login.field1043 = !Login.field1043; // L: 596
									}

									if (var23 == 1 && var32 >= Login.loginBoxX + 180 - 34 && var32 <= Login.loginBoxX + 34 + 180 && var33 >= 351 && var33 <= 363) { // L: 598
										Players.openURL(KitDefinition.method2705("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 599
									}

									var34 = Login.loginBoxX + 180 + 80; // L: 601
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 602
										Login.loginIndex = 0; // L: 603
										Login.Login_username = ""; // L: 604
										Login.Login_password = ""; // L: 605
										class5.field53 = 0; // L: 606
										Varps.otp = ""; // L: 607
									}

									while (ClanChannelMember.isKeyDown()) { // L: 609
										boolean var9 = false; // L: 610

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 611
											if (class249.field3116 == "1234567890".charAt(var10)) { // L: 612
												var9 = true; // L: 613
												break; // L: 614
											}
										}

										if (ItemComposition.field1859 == 13) { // L: 617
											Login.loginIndex = 0; // L: 618
											Login.Login_username = ""; // L: 619
											Login.Login_password = ""; // L: 620
											class5.field53 = 0; // L: 621
											Varps.otp = ""; // L: 622
										} else {
											if (ItemComposition.field1859 == 85 && Varps.otp.length() > 0) { // L: 625
												Varps.otp = Varps.otp.substring(0, Varps.otp.length() - 1);
											}

											if (ItemComposition.field1859 == 84) { // L: 626
												Varps.otp.trim(); // L: 627
												if (Varps.otp.length() != 6) { // L: 628
													class260.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 629
													return; // L: 630
												}

												class5.field53 = Integer.parseInt(Varps.otp); // L: 632
												Varps.otp = ""; // L: 633
												VarbitComposition.method2849(true); // L: 634
												class260.setLoginResponseString("", "Connecting to server...", ""); // L: 635
												class12.updateGameState(20); // L: 636
												return; // L: 637
											}

											if (var9 && Varps.otp.length() < 6) { // L: 639
												Varps.otp = Varps.otp + class249.field3116;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 643
									var34 = Login.loginBoxX + 180 - 80; // L: 644
									var8 = 321; // L: 645
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 646
										ClanMate.method5712(); // L: 647
										return; // L: 648
									}

									var34 = Login.loginBoxX + 180 + 80; // L: 650
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 651
										ClanChannelMember.Login_promptCredentials(true); // L: 652
									}

									var36 = 361; // L: 654
									if (GrandExchangeOfferOwnWorldComparator.field631 != null) { // L: 655
										var10 = GrandExchangeOfferOwnWorldComparator.field631.highX / 2; // L: 656
										if (var23 == 1 && var32 >= GrandExchangeOfferOwnWorldComparator.field631.lowX - var10 && var32 <= var10 + GrandExchangeOfferOwnWorldComparator.field631.lowX && var33 >= var36 - 15 && var33 < var36) { // L: 657
											Players.openURL(KitDefinition.method2705("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 658
										}
									}

									while (ClanChannelMember.isKeyDown()) { // L: 661
										var38 = false; // L: 662

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 663
											if (class249.field3116 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 664
												var38 = true; // L: 665
												break; // L: 666
											}
										}

										if (ItemComposition.field1859 == 13) { // L: 669
											ClanChannelMember.Login_promptCredentials(true); // L: 670
										} else {
											if (ItemComposition.field1859 == 85 && Login.Login_username.length() > 0) { // L: 673
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (ItemComposition.field1859 == 84) { // L: 674
												ClanMate.method5712(); // L: 675
												return; // L: 676
											}

											if (var38 && Login.Login_username.length() < 320) { // L: 678
												Login.Login_username = Login.Login_username + class249.field3116;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 682
									if (Login.loginIndex == 7) { // L: 693
										var34 = Login.loginBoxX + 180 - 80; // L: 694
										var8 = 321; // L: 695
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 696
											Players.openURL(KitDefinition.method2705("secure", true) + "m=dob/set_dob.ws", true, false); // L: 697
											class260.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 698
											Login.loginIndex = 6; // L: 699
											return; // L: 700
										}

										var34 = Login.loginBoxX + 180 + 80; // L: 702
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 703
											ClanChannelMember.Login_promptCredentials(true); // L: 704
										}
									} else if (Login.loginIndex == 8) { // L: 707
										var34 = Login.loginBoxX + 180 - 80; // L: 708
										var8 = 321; // L: 709
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 710
											Players.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 711
											class260.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 712
											Login.loginIndex = 6; // L: 713
											return; // L: 714
										}

										var34 = Login.loginBoxX + 180 + 80; // L: 716
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 717
											ClanChannelMember.Login_promptCredentials(true); // L: 718
										}
									} else if (Login.loginIndex == 12) { // L: 721
										String var28 = ""; // L: 722
										switch(Login.field1032) { // L: 723
										case 0:
											var28 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 731
											break;
										case 1:
											var28 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 725
											break; // L: 726
										default:
											ClanChannelMember.Login_promptCredentials(false); // L: 728
										}

										var37 = Login.loginBoxX + 180; // L: 734
										var36 = 276; // L: 735
										if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) { // L: 736
											Players.openURL(var28, true, false); // L: 737
											class260.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 738
											Login.loginIndex = 6; // L: 739
											return; // L: 740
										}

										var37 = Login.loginBoxX + 180; // L: 742
										var36 = 326; // L: 743
										if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) { // L: 744
											ClanChannelMember.Login_promptCredentials(false); // L: 745
										}
									} else if (Login.loginIndex == 24) { // L: 748
										var34 = Login.loginBoxX + 180; // L: 749
										var8 = 301; // L: 750
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) { // L: 751
											ClanChannelMember.Login_promptCredentials(false); // L: 752
										}
									}
								} else {
									while (true) {
										do {
											if (!ClanChannelMember.isKeyDown()) { // L: 683
												var35 = 321; // L: 688
												if (var23 == 1 && var33 >= var35 - 20 && var33 <= var35 + 20) { // L: 689
													ClanChannelMember.Login_promptCredentials(true); // L: 690
												}

												return;
											}
										} while(ItemComposition.field1859 != 84 && ItemComposition.field1859 != 13); // L: 684

										ClanChannelMember.Login_promptCredentials(true); // L: 685
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 206

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-84"
	)
	static final void method3490(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 121
		World.addGameMessage(30, "", var1); // L: 123
	} // L: 125

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "([Lio;IIIIIIII)V",
		garbageValue = "1695957245"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10186
			Widget var9 = var0[var8]; // L: 10187
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class21.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10188 10189 10190
				if (var9.isIf3) { // L: 10191
					if (HitSplatDefinition.isComponentHidden(var9)) { // L: 10192
						continue;
					}
				} else if (var9.type == 0 && var9 != World.mousedOverWidgetIf1 && HitSplatDefinition.isComponentHidden(var9)) { // L: 10195
					continue;
				}

				int var10 = var9.x + var6; // L: 10197
				int var11 = var7 + var9.y; // L: 10198
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10203
					var12 = var2; // L: 10204
					var13 = var3; // L: 10205
					var14 = var4; // L: 10206
					var15 = var5; // L: 10207
				} else {
					int var16;
					if (var9.type == 9) { // L: 10209
						var16 = var10; // L: 10210
						var17 = var11; // L: 10211
						var18 = var10 + var9.width; // L: 10212
						int var19 = var11 + var9.height; // L: 10213
						if (var18 < var10) { // L: 10214
							var16 = var18; // L: 10216
							var18 = var10; // L: 10217
						}

						if (var19 < var11) { // L: 10219
							var17 = var19; // L: 10221
							var19 = var11; // L: 10222
						}

						++var18; // L: 10224
						++var19; // L: 10225
						var12 = var16 > var2 ? var16 : var2; // L: 10226
						var13 = var17 > var3 ? var17 : var3; // L: 10227
						var14 = var18 < var4 ? var18 : var4; // L: 10228
						var15 = var19 < var5 ? var19 : var5; // L: 10229
					} else {
						var16 = var10 + var9.width; // L: 10232
						var17 = var11 + var9.height; // L: 10233
						var12 = var10 > var2 ? var10 : var2; // L: 10234
						var13 = var11 > var3 ? var11 : var3; // L: 10235
						var14 = var16 < var4 ? var16 : var4; // L: 10236
						var15 = var17 < var5 ? var17 : var5; // L: 10237
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10239
					Client.field822 = true; // L: 10240
					Client.field854 = var10; // L: 10241
					Client.field804 = var11; // L: 10242
				}

				boolean var32 = false; // L: 10244
				if (var9.field3032) { // L: 10245
					switch(Client.field803) { // L: 10246
					case 0:
						var32 = true; // L: 10258
					case 1:
					default:
						break;
					case 2:
						if (Client.field805 == var9.id >>> 16) { // L: 10248
							var32 = true; // L: 10249
						}
						break;
					case 3:
						if (var9.id == Client.field805) { // L: 10253
							var32 = true; // L: 10254
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10262
					if (var9.isIf3) { // L: 10263
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10264
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10265
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10266
									if (var26.isMouseInputEvent) { // L: 10267
										var26.remove(); // L: 10268
										var26.widget.containsMouse = false; // L: 10269
									}
								}

								if (Actor.widgetDragDuration == 0) { // L: 10272
									Client.clickedWidget = null; // L: 10273
									Client.clickedWidgetParent = null; // L: 10274
								}

								if (!Client.isMenuOpen) { // L: 10276
									NetSocket.addCancelMenuEntry(); // L: 10277
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10281 10282
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10283
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10284
									var26.remove(); // L: 10285
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10291
					var18 = MouseHandler.MouseHandler_y; // L: 10292
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10293
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10294
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10295
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10297
					if (var9.contentType == 1337) { // L: 10298
						if (!Client.isLoading && !Client.isMenuOpen && var33) { // L: 10299
							class2.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10302
						class69.checkIfMinimapClicked(var9, var10, var11); // L: 10303
					} else {
						if (var9.contentType == 1400) { // L: 10306
							class243.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height); // L: 10307
						}

						if (!Client.isMenuOpen && var33) { // L: 10309
							if (var9.contentType == 1400) { // L: 10310
								class243.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10311
							} else {
								HealthBarUpdate.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10314
							}
						}

						boolean var21;
						int var23;
						if (var32) { // L: 10317
							for (int var20 = 0; var20 < var9.field3033.length; ++var20) { // L: 10318
								var21 = false; // L: 10319
								boolean var27 = false; // L: 10320
								if (!var21 && var9.field3033[var20] != null) { // L: 10321
									for (var23 = 0; var23 < var9.field3033[var20].length; ++var23) { // L: 10322
										boolean var24 = false; // L: 10323
										if (var9.field3012 != null) { // L: 10324
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3033[var20][var23]]; // L: 10325
										}

										if (NPC.method2258(var9.field3033[var20][var23]) || var24) { // L: 10327
											var21 = true; // L: 10328
											if (var9.field3012 != null && var9.field3012[var20] > Client.cycle) { // L: 10329
												break;
											}

											byte var31 = var9.field3034[var20][var23]; // L: 10330
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10331 10332 10333 10334 10335
												var27 = true; // L: 10337
												break;
											}
										}
									}
								}

								if (var27) { // L: 10343
									if (var20 < 10) { // L: 10344
										class376.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10345
										class5.Widget_runOnTargetLeave(); // L: 10346
										LoginScreenAnimation.selectSpell(var9.id, var9.childIndex, AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var9)), var9.itemId); // L: 10347
										Client.selectedSpellActionName = BoundaryObject.Widget_getSpellActionName(var9); // L: 10348
										if (Client.selectedSpellActionName == null) { // L: 10349
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class44.colorStartTag(16777215); // L: 10350
									}

									var23 = var9.field3035[var20]; // L: 10352
									if (var9.field3012 == null) { // L: 10353
										var9.field3012 = new int[var9.field3033.length];
									}

									if (var9.field3079 == null) { // L: 10354
										var9.field3079 = new int[var9.field3033.length];
									}

									if (var23 != 0) { // L: 10355
										if (var9.field3012[var20] == 0) { // L: 10356
											var9.field3012[var20] = var23 + Client.cycle + var9.field3079[var20];
										} else {
											var9.field3012[var20] = var23 + Client.cycle; // L: 10357
										}
									} else {
										var9.field3012[var20] = Integer.MAX_VALUE; // L: 10359
									}
								}

								if (!var21 && var9.field3012 != null) { // L: 10361 10362
									var9.field3012[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10366
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10367
								var33 = true;
							} else {
								var33 = false; // L: 10368
							}

							boolean var34 = false; // L: 10369
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) { // L: 10370
								var34 = true;
							}

							var21 = false; // L: 10371
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10372
								var21 = true;
							}

							if (var21) { // L: 10373
								VarcInt.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10374
								class243.worldMap.method6188(var17, var18, var33 & var34, var33 & var21); // L: 10375
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && class170.method3552(class21.getWidgetFlags(var9))) { // L: 10377
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10378
								Client.field819 = true; // L: 10379
								Client.field740 = var10; // L: 10380
								Client.field821 = var11; // L: 10381
							}

							if (var9.hasListener) { // L: 10383
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10384
									var22 = new ScriptEvent(); // L: 10385
									var22.isMouseInputEvent = true; // L: 10386
									var22.widget = var9; // L: 10387
									var22.mouseY = Client.mouseWheelRotation; // L: 10388
									var22.args = var9.onScroll; // L: 10389
									Client.scriptEvents.addFirst(var22); // L: 10390
								}

								if (Client.clickedWidget != null || Script.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10392
									var21 = false; // L: 10393
									var34 = false; // L: 10394
									var33 = false; // L: 10395
								}

								if (!var9.isClicked && var21) { // L: 10397
									var9.isClicked = true; // L: 10398
									if (var9.onClick != null) { // L: 10399
										var22 = new ScriptEvent(); // L: 10400
										var22.isMouseInputEvent = true; // L: 10401
										var22.widget = var9; // L: 10402
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10403
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10404
										var22.args = var9.onClick; // L: 10405
										Client.scriptEvents.addFirst(var22); // L: 10406
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) { // L: 10409 10410
									var22 = new ScriptEvent(); // L: 10411
									var22.isMouseInputEvent = true; // L: 10412
									var22.widget = var9; // L: 10413
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10414
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10415
									var22.args = var9.onClickRepeat; // L: 10416
									Client.scriptEvents.addFirst(var22); // L: 10417
								}

								if (var9.isClicked && !var34) { // L: 10420
									var9.isClicked = false; // L: 10421
									if (var9.onRelease != null) { // L: 10422
										var22 = new ScriptEvent(); // L: 10423
										var22.isMouseInputEvent = true; // L: 10424
										var22.widget = var9; // L: 10425
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10426
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10427
										var22.args = var9.onRelease; // L: 10428
										Client.field846.addFirst(var22); // L: 10429
									}
								}

								if (var34 && var9.onHold != null) { // L: 10432 10433
									var22 = new ScriptEvent(); // L: 10434
									var22.isMouseInputEvent = true; // L: 10435
									var22.widget = var9; // L: 10436
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10437
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10438
									var22.args = var9.onHold; // L: 10439
									Client.scriptEvents.addFirst(var22); // L: 10440
								}

								if (!var9.containsMouse && var33) { // L: 10443
									var9.containsMouse = true; // L: 10444
									if (var9.onMouseOver != null) { // L: 10445
										var22 = new ScriptEvent(); // L: 10446
										var22.isMouseInputEvent = true; // L: 10447
										var22.widget = var9; // L: 10448
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10449
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10450
										var22.args = var9.onMouseOver; // L: 10451
										Client.scriptEvents.addFirst(var22); // L: 10452
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) { // L: 10455 10456
									var22 = new ScriptEvent(); // L: 10457
									var22.isMouseInputEvent = true; // L: 10458
									var22.widget = var9; // L: 10459
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10460
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10461
									var22.args = var9.onMouseRepeat; // L: 10462
									Client.scriptEvents.addFirst(var22); // L: 10463
								}

								if (var9.containsMouse && !var33) { // L: 10466
									var9.containsMouse = false; // L: 10467
									if (var9.onMouseLeave != null) { // L: 10468
										var22 = new ScriptEvent(); // L: 10469
										var22.isMouseInputEvent = true; // L: 10470
										var22.widget = var9; // L: 10471
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10472
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10473
										var22.args = var9.onMouseLeave; // L: 10474
										Client.field846.addFirst(var22); // L: 10475
									}
								}

								if (var9.onTimer != null) { // L: 10478
									var22 = new ScriptEvent(); // L: 10479
									var22.widget = var9; // L: 10480
									var22.args = var9.onTimer; // L: 10481
									Client.field652.addFirst(var22); // L: 10482
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field2990) { // L: 10484
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field2990 <= 32) { // L: 10485
										label789:
										for (var36 = var9.field2990; var36 < Client.changedVarpCount; ++var36) { // L: 10492
											var23 = Client.changedVarps[var36 & 31]; // L: 10493

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) { // L: 10494
												if (var23 == var9.varTransmitTriggers[var35]) { // L: 10495
													var25 = new ScriptEvent(); // L: 10496
													var25.widget = var9; // L: 10497
													var25.args = var9.onVarTransmit; // L: 10498
													Client.scriptEvents.addFirst(var25); // L: 10499
													break label789; // L: 10500
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10486
										var22.widget = var9; // L: 10487
										var22.args = var9.onVarTransmit; // L: 10488
										Client.scriptEvents.addFirst(var22); // L: 10489
									}

									var9.field2990 = Client.changedVarpCount; // L: 10505
								}

								if (var9.onInvTransmit != null && Client.field830 > var9.field3095) { // L: 10507
									if (var9.invTransmitTriggers != null && Client.field830 - var9.field3095 <= 32) { // L: 10508
										label765:
										for (var36 = var9.field3095; var36 < Client.field830; ++var36) { // L: 10515
											var23 = Client.changedItemContainers[var36 & 31]; // L: 10516

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) { // L: 10517
												if (var23 == var9.invTransmitTriggers[var35]) { // L: 10518
													var25 = new ScriptEvent(); // L: 10519
													var25.widget = var9; // L: 10520
													var25.args = var9.onInvTransmit; // L: 10521
													Client.scriptEvents.addFirst(var25); // L: 10522
													break label765; // L: 10523
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10509
										var22.widget = var9; // L: 10510
										var22.args = var9.onInvTransmit; // L: 10511
										Client.scriptEvents.addFirst(var22); // L: 10512
									}

									var9.field3095 = Client.field830; // L: 10528
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3096) { // L: 10530
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3096 <= 32) { // L: 10531
										label741:
										for (var36 = var9.field3096; var36 < Client.changedSkillsCount; ++var36) { // L: 10538
											var23 = Client.changedSkills[var36 & 31]; // L: 10539

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) { // L: 10540
												if (var23 == var9.statTransmitTriggers[var35]) { // L: 10541
													var25 = new ScriptEvent(); // L: 10542
													var25.widget = var9; // L: 10543
													var25.args = var9.onStatTransmit; // L: 10544
													Client.scriptEvents.addFirst(var25); // L: 10545
													break label741; // L: 10546
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10532
										var22.widget = var9; // L: 10533
										var22.args = var9.onStatTransmit; // L: 10534
										Client.scriptEvents.addFirst(var22); // L: 10535
									}

									var9.field3096 = Client.changedSkillsCount; // L: 10551
								}

								if (Client.chatCycle > var9.field3104 && var9.onChatTransmit != null) { // L: 10553
									var22 = new ScriptEvent(); // L: 10554
									var22.widget = var9; // L: 10555
									var22.args = var9.onChatTransmit; // L: 10556
									Client.scriptEvents.addFirst(var22); // L: 10557
								}

								if (Client.field836 > var9.field3104 && var9.onFriendTransmit != null) { // L: 10559
									var22 = new ScriptEvent(); // L: 10560
									var22.widget = var9; // L: 10561
									var22.args = var9.onFriendTransmit; // L: 10562
									Client.scriptEvents.addFirst(var22); // L: 10563
								}

								if (Client.field844 > var9.field3104 && var9.onClanTransmit != null) { // L: 10565
									var22 = new ScriptEvent(); // L: 10566
									var22.widget = var9; // L: 10567
									var22.args = var9.onClanTransmit; // L: 10568
									Client.scriptEvents.addFirst(var22); // L: 10569
								}

								if (Client.field654 > var9.field3104 && var9.field3043 != null) { // L: 10571
									var22 = new ScriptEvent(); // L: 10572
									var22.widget = var9; // L: 10573
									var22.args = var9.field3043; // L: 10574
									Client.scriptEvents.addFirst(var22); // L: 10575
								}

								if (Client.field839 > var9.field3104 && var9.field3071 != null) { // L: 10577
									var22 = new ScriptEvent(); // L: 10578
									var22.widget = var9; // L: 10579
									var22.args = var9.field3071; // L: 10580
									Client.scriptEvents.addFirst(var22); // L: 10581
								}

								if (Client.field840 > var9.field3104 && var9.onStockTransmit != null) { // L: 10583
									var22 = new ScriptEvent(); // L: 10584
									var22.widget = var9; // L: 10585
									var22.args = var9.onStockTransmit; // L: 10586
									Client.scriptEvents.addFirst(var22); // L: 10587
								}

								if (Client.field748 > var9.field3104 && var9.field3077 != null) { // L: 10589
									var22 = new ScriptEvent(); // L: 10590
									var22.widget = var9; // L: 10591
									var22.args = var9.field3077; // L: 10592
									Client.scriptEvents.addFirst(var22); // L: 10593
								}

								if (Client.field659 > var9.field3104 && var9.onMiscTransmit != null) { // L: 10595
									var22 = new ScriptEvent(); // L: 10596
									var22.widget = var9; // L: 10597
									var22.args = var9.onMiscTransmit; // L: 10598
									Client.scriptEvents.addFirst(var22); // L: 10599
								}

								var9.field3104 = Client.cycleCntr; // L: 10601
								if (var9.onKey != null) { // L: 10602
									for (var36 = 0; var36 < Client.field806; ++var36) { // L: 10603
										ScriptEvent var30 = new ScriptEvent(); // L: 10604
										var30.widget = var9; // L: 10605
										var30.keyTyped = Client.field868[var36]; // L: 10606
										var30.keyPressed = Client.field867[var36]; // L: 10607
										var30.args = var9.onKey; // L: 10608
										Client.scriptEvents.addFirst(var30); // L: 10609
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10614
							if (Client.clickedWidget != null || Script.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10615
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10616
								if (var9.mouseOverRedirect >= 0) { // L: 10617
									World.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									World.mousedOverWidgetIf1 = var9; // L: 10618
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10620
								ReflectionCheck.field609 = var9; // L: 10621
							}

							if (var9.scrollHeight > var9.height) { // L: 10623
								class313.method5617(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10625
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10626
							if (var9.children != null) { // L: 10627
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10628
							if (var28 != null) { // L: 10629
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10630
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10631
										if (var29.isMouseInputEvent) { // L: 10632
											var29.remove(); // L: 10633
											var29.widget.containsMouse = false; // L: 10634
										}
									}

									if (Actor.widgetDragDuration == 0) { // L: 10637
										Client.clickedWidget = null; // L: 10638
										Client.clickedWidgetParent = null; // L: 10639
									}

									if (!Client.isMenuOpen) { // L: 10641
										NetSocket.addCancelMenuEntry(); // L: 10642
									}
								}

								class32.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10645
							}
						}
					}
				}
			}
		}

	} // L: 10649
}
