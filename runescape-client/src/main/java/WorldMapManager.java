import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("i")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("w")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("o")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[[Lfk;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("e")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("x")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1580083231
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1005750841
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1027044671
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 730187433
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1922156865
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Loe;Ljava/util/HashMap;Lko;Lko;)V"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;Ljava/lang/String;ZI)V",
		garbageValue = "-535432557"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field2210.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2210.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2211.name, var2)); // L: 50
			System.nanoTime(); // L: 51
			System.nanoTime(); // L: 52
			this.mapAreaData = new WorldMapAreaData(); // L: 53

			try {
				this.mapAreaData.init(var6, var7, var5, var3); // L: 55
			} catch (IllegalStateException var23) { // L: 57
				return; // L: 58
			}

			this.mapAreaData.getOriginX(); // L: 60
			this.mapAreaData.getOriginPlane(); // L: 61
			this.mapAreaData.getOriginY(); // L: 62
			this.tileX = this.mapAreaData.getRegionLowX() * 64; // L: 63
			this.tileY = this.mapAreaData.getRegionLowY() * 64; // L: 64
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64; // L: 65
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64; // L: 66
			int var17 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 67
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 68
			System.nanoTime(); // L: 69
			System.nanoTime(); // L: 70
			InvDefinition.method2983(); // L: 71
			this.regions = new WorldMapRegion[var17][var9]; // L: 72
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator(); // L: 73

			int var13;
			int var14;
			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next(); // L: 74
				int var12 = var11.regionX; // L: 76
				var13 = var11.regionY; // L: 77
				var14 = var12 - this.mapAreaData.getRegionLowX(); // L: 78
				int var15 = var13 - this.mapAreaData.getRegionLowY(); // L: 79
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 80
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList); // L: 81
			}

			for (int var18 = 0; var18 < var17; ++var18) { // L: 84
				for (int var19 = 0; var19 < var9; ++var19) { // L: 85
					if (this.regions[var18][var19] == null) { // L: 86
						this.regions[var18][var19] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var18, this.mapAreaData.getRegionLowY() + var19, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 87
						this.regions[var18][var19].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList); // L: 88
					}
				}
			}

			System.nanoTime(); // L: 92
			System.nanoTime(); // L: 93
			if (var1.isValidFileName(WorldMapCacheName.field2215.name, var2)) { // L: 94
				byte[] var26 = var1.takeFileByNames(WorldMapCacheName.field2215.name, var2); // L: 95
				BufferedImage var20 = null; // L: 98

				SpritePixels var27;
				label48: {
					try {
						var20 = ImageIO.read(new ByteArrayInputStream(var26)); // L: 100
						var13 = var20.getWidth(); // L: 101
						var14 = var20.getHeight(); // L: 102
						int[] var21 = new int[var14 * var13]; // L: 103
						PixelGrabber var16 = new PixelGrabber(var20, 0, 0, var13, var14, var21, 0, var13); // L: 104
						var16.grabPixels(); // L: 105
						var27 = new SpritePixels(var21, var13, var14); // L: 106
						break label48;
					} catch (IOException var24) { // L: 109
					} catch (InterruptedException var25) { // L: 110
					}

					var27 = new SpritePixels(0, 0); // L: 111
				}

				this.compositeTextureSprite = var27; // L: 113
			}

			System.nanoTime(); // L: 115
			var1.clearGroups(); // L: 116
			var1.clearFiles(); // L: 117
			this.loaded = true; // L: 118
		}
	} // L: 42 119

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 122
	} // L: 123

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "634870474"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 126
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 127
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 128
		int[] var12 = new int[4]; // L: 129
		Rasterizer2D.Rasterizer2D_getClipArray(var12); // L: 130
		WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 131
		float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 132
		int var15 = (int)Math.ceil((double)var14); // L: 133
		this.pixelsPerTile = var15; // L: 134
		if (!this.scaleHandlers.containsKey(var15)) { // L: 135
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15); // L: 136
			var16.init(); // L: 137
			this.scaleHandlers.put(var15, var16); // L: 138
		}

		int var23 = var13.x + var13.width - 1; // L: 140
		int var17 = var13.height + var13.y - 1; // L: 141

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) { // L: 142
			for (var19 = var13.y; var19 <= var17; ++var19) { // L: 143
				this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 144
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11); // L: 147
		Rasterizer2D.Rasterizer2D_setClipArray(var12); // L: 148
		var18 = (int)(64.0F * var14); // L: 149
		var19 = this.tileX + var1; // L: 150
		int var20 = var2 + this.tileY; // L: 151

		for (int var21 = var13.x; var21 < var13.width + var13.x; ++var21) { // L: 152
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) { // L: 153
				this.regions[var21][var22].method3685(var5 + (this.regions[var21][var22].regionX * 64 - var19) * var18 / 64, var8 - (this.regions[var21][var22].regionY * 64 - var20 + 64) * var18 / 64, var18); // L: 154
			}
		}

	} // L: 157

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V",
		garbageValue = "0"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 160
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 161
		int var16 = (int)(64.0F * var15); // L: 162
		int var17 = this.tileX + var1; // L: 163
		int var18 = var2 + this.tileY; // L: 164

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 165
			for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 166
				if (var13) { // L: 167
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 168
				}

				this.regions[var19][var20].method3681(var5 + (this.regions[var19][var20].regionX * 64 - var17) * var16 / 64, var8 - (this.regions[var19][var20].regionY * 64 - var18 + 64) * var16 / 64, var16, var9); // L: 170
			}
		}

		if (var10 != null && var11 > 0) { // L: 173
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 174
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 175
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 176
				}
			}
		}

	} // L: 180

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "1858879901"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) { // L: 183
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4); // L: 186
			if (var6 > 0 && var6 % var7 < var7 / 2) { // L: 187
				if (this.icons == null) { // L: 190
					this.buildIcons0(); // L: 191
				}

				Iterator var8 = var5.iterator(); // L: 193

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return; // L: 210
						}

						int var9 = (Integer)var8.next(); // L: 194
						var10 = (List)this.icons.get(var9); // L: 196
					} while(var10 == null); // L: 197

					Iterator var11 = var10.iterator(); // L: 200

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 201
						int var13 = var3 * (var12.coord2.x - this.tileX) / this.tileWidth; // L: 203
						int var14 = var4 - (var12.coord2.y - this.tileY) * var4 / this.tileHeight; // L: 204
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 205
					}
				}
			}
		}
	} // L: 184 188

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "2076457944"
	)
	public List method3807(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 213
		if (!this.loaded) { // L: 214
			return var11; // L: 215
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 217
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 218
			int var14 = (int)(64.0F * var13); // L: 219
			int var15 = this.tileX + var1; // L: 220
			int var16 = var2 + this.tileY; // L: 221

			for (int var17 = var12.x; var17 < var12.width + var12.x; ++var17) { // L: 222
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) { // L: 223
					List var19 = this.regions[var17][var18].method3687(var5 + (this.regions[var17][var18].regionX * 64 - var15) * var14 / 64, var8 + var6 - (this.regions[var17][var18].regionY * 64 - var16 + 64) * var14 / 64, var14, var9, var10); // L: 224
					if (!var19.isEmpty()) { // L: 225
						var11.addAll(var19); // L: 226
					}
				}
			}

			return var11; // L: 230
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Lgb;",
		garbageValue = "47"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 234
		int var6 = this.tileX + var1; // L: 235
		int var7 = var2 + this.tileY; // L: 236
		int var8 = var3 + this.tileX; // L: 237
		int var9 = var4 + this.tileY; // L: 238
		int var10 = var6 / 64; // L: 239
		int var11 = var7 / 64; // L: 240
		int var12 = var8 / 64; // L: 241
		int var13 = var9 / 64; // L: 242
		var5.width = var12 - var10 + 1; // L: 243
		var5.height = var13 - var11 + 1; // L: 244
		var5.x = var10 - this.mapAreaData.getRegionLowX(); // L: 245
		var5.y = var11 - this.mapAreaData.getRegionLowY(); // L: 246
		if (var5.x < 0) { // L: 247
			var5.width += var5.x; // L: 248
			var5.x = 0; // L: 249
		}

		if (var5.x > this.regions.length - var5.width) { // L: 251
			var5.width = this.regions.length - var5.x; // L: 252
		}

		if (var5.y < 0) { // L: 254
			var5.height += var5.y; // L: 255
			var5.y = 0; // L: 256
		}

		if (var5.y > this.regions[0].length - var5.height) { // L: 258
			var5.height = this.regions[0].length - var5.y; // L: 259
		}

		var5.width = Math.min(var5.width, this.regions.length); // L: 261
		var5.height = Math.min(var5.height, this.regions[0].length); // L: 262
		return var5; // L: 263
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "16711935"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 267
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/HashMap;",
		garbageValue = "11419"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 271
		return this.icons; // L: 272
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "60263929"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) { // L: 276
			this.icons = new HashMap(); // L: 277
		}

		this.icons.clear(); // L: 279

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 280
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) { // L: 281
				List var3 = this.regions[var1][var2].icons(); // L: 282
				Iterator var4 = var3.iterator(); // L: 283

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 284
					if (var5.hasValidElement()) { // L: 286
						int var6 = var5.getElement(); // L: 287
						if (!this.icons.containsKey(var6)) { // L: 288
							LinkedList var7 = new LinkedList(); // L: 289
							var7.add(var5); // L: 290
							this.icons.put(var6, var7); // L: 291
						} else {
							List var8 = (List)this.icons.get(var6); // L: 294
							var8.add(var5); // L: 295
						}
					}
				}
			}
		}

	} // L: 301

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "-7"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 304
		if (var3 > 8.0F) { // L: 305
			return 8.0F;
		} else if (var3 < 1.0F) { // L: 306
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 307
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3; // L: 308 309
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "2038669517"
	)
	static final void method3814(Actor var0) {
		if (var0.field1138 != 0) { // L: 4400
			if (var0.targetIndex != -1) { // L: 4401
				Object var1 = null; // L: 4402
				if (var0.targetIndex < 32768) { // L: 4403
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4404
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) { // L: 4405
					int var2 = var0.x - ((Actor)var1).x; // L: 4406
					int var3 = var0.y - ((Actor)var1).y; // L: 4407
					if (var2 != 0 || var3 != 0) { // L: 4408
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4410
					var0.targetIndex = -1; // L: 4411
					var0.false0 = false; // L: 4412
				}
			}

			if (var0.field1112 != -1 && (var0.pathLength == 0 || var0.field1085 > 0)) { // L: 4415
				var0.orientation = var0.field1112; // L: 4416
				var0.field1112 = -1; // L: 4417
			}

			int var4 = var0.orientation - var0.rotation & 2047; // L: 4419
			if (var4 == 0 && var0.false0) { // L: 4420
				var0.targetIndex = -1; // L: 4421
				var0.false0 = false; // L: 4422
			}

			if (var4 != 0) { // L: 4424
				++var0.field1137; // L: 4425
				boolean var6;
				if (var4 > 1024) { // L: 4426
					var0.rotation -= var0.field1127 ? var4 : var0.field1138 * 369982221 * 1275186117; // L: 4427
					var6 = true; // L: 4428
					if (var4 < var0.field1138 || var4 > 2048 - var0.field1138) { // L: 4429
						var0.rotation = var0.orientation; // L: 4430
						var6 = false; // L: 4431
					}

					if (!var0.field1127 && var0.movementSequence == var0.idleSequence && (var0.field1137 > 25 || var6)) { // L: 4433
						if (var0.turnLeftSequence != -1) { // L: 4434
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4435
						}
					}
				} else {
					var0.rotation += var0.field1127 ? var4 : 369982221 * var0.field1138 * 1275186117; // L: 4439
					var6 = true; // L: 4440
					if (var4 < var0.field1138 || var4 > 2048 - var0.field1138) { // L: 4441
						var0.rotation = var0.orientation; // L: 4442
						var6 = false; // L: 4443
					}

					if (!var0.field1127 && var0.idleSequence == var0.movementSequence && (var0.field1137 > 25 || var6)) { // L: 4445
						if (var0.turnRightSequence != -1) { // L: 4446
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4447
						}
					}
				}

				var0.rotation &= 2047; // L: 4451
				var0.field1127 = false; // L: 4452
			} else {
				var0.field1137 = 0; // L: 4454
			}

		}
	} // L: 4455
}
