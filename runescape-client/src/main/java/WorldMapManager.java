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

@ObfuscatedName("ai")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("h")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("v")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSpritePixels;
	@ObfuscatedName("t")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[[Lam;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("n")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("u")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1926509867
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 631527739
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1156728003
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1535286909
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1280315109
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Llo;Ljava/util/HashMap;Lib;Lib;)V"
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
		descriptor = "(Lib;Ljava/lang/String;ZI)V",
		garbageValue = "1247485995"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field328.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field328.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field326.name, var2)); // L: 50
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
			GrandExchangeOfferNameComparator.method201(); // L: 71
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
			if (var1.isValidFileName(WorldMapCacheName.field327.name, var2)) { // L: 94
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field327.name, var2); // L: 95
				this.compositeTextureSpritePixels = WorldMapSection0.convertJpgToSprite(var20); // L: 96
			}

			System.nanoTime(); // L: 98
			var1.clearGroups();
			var1.clearFiles();
			this.loaded = true;
		}
	} // L: 42

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1886974954"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
		int var10 = Rasterizer2D.Rasterizer2D_width;
		int var11 = Rasterizer2D.Rasterizer2D_height;
		int[] var12 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var12);
		WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var15 = (int)Math.ceil((double)var14);
		this.pixelsPerTile = var15;
		if (!this.scaleHandlers.containsKey(var15)) {
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15);
			var16.init();
			this.scaleHandlers.put(var15, var16);
		}

		int var23 = var13.x + var13.width - 1;
		int var17 = var13.height + var13.y - 1;

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) {
			for (var19 = var13.y; var19 <= var17; ++var19) {
				this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11);
		Rasterizer2D.Rasterizer2D_setClipArray(var12); // L: 131
		var18 = (int)(var14 * 64.0F);
		var19 = this.tileX + var1; // L: 133
		int var20 = var2 + this.tileY; // L: 134

		for (int var21 = var13.x; var21 < var13.width + var13.x; ++var21) { // L: 135
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) { // L: 136
				this.regions[var21][var22].method534(var5 + (this.regions[var21][var22].regionX * 64 - var19) * var18 / 64, var8 - (this.regions[var21][var22].regionY * 64 - var20 + 64) * var18 / 64, var18); // L: 137
			}
		}

	} // L: 140

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "1206614213"
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
			for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 149
				if (var13) { // L: 150
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 151
				}

				this.regions[var19][var20].method481(var5 + (this.regions[var19][var20].regionX * 64 - var17) * var16 / 64, var8 - (this.regions[var19][var20].regionY * 64 - var18 + 64) * var16 / 64, var16, var9); // L: 153
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;IIB)V",
		garbageValue = "-11"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSpritePixels != null) { // L: 166
			this.compositeTextureSpritePixels.drawScaledAt(var1, var2, var3, var4); // L: 169
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "279349552"
	)
	public List method707(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 196
		if (!this.loaded) { // L: 197
			return var11; // L: 198
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 200
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 201
			int var14 = (int)(var13 * 64.0F); // L: 202
			int var15 = this.tileX + var1; // L: 203
			int var16 = var2 + this.tileY; // L: 204

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 205
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 206
					List var19 = this.regions[var17][var18].method501(var5 + (this.regions[var17][var18].regionX * 64 - var15) * var14 / 64, var8 + var6 - (this.regions[var17][var18].regionY * 64 - var16 + 64) * var14 / 64, var14, var9, var10); // L: 207
					if (!var19.isEmpty()) { // L: 208
						var11.addAll(var19); // L: 209
					}
				}
			}

			return var11; // L: 213
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Las;",
		garbageValue = "604537210"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1914860720"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 250
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-1074161201"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 254
		return this.icons; // L: 255
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2005270001"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "-1229276140"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "-67"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 99

		for (int var6 = 0; var6 < var5; ++var6) { // L: 100
			char var7 = var0.charAt(var6 + var1); // L: 101
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 102
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 103
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 104
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 105
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 106
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 107
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 108
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 109
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 110
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) { // L: 111
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 112
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 113
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 114
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 115
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 116
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 117
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 118
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 119
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 120
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 121
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 122
			} else if (var7 == 732) { // L: 123
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 124
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 125
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 126
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 127
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 128
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 129
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 130
			}
		}

		return var5; // L: 132
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lky;ILbq;II)V",
		garbageValue = "-2082174377"
	)
	static final void method709(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = -1; // L: 453
		if ((var3 & 256) != 0) { // L: 454
			var2.field981 = var0.method5665(); // L: 455
			var2.field982 = var0.method5665(); // L: 456
			var2.field958 = var0.method5665(); // L: 457
			var2.field956 = var0.method5661(); // L: 458
			var2.field984 = var0.method5582() + Client.cycle; // L: 459
			var2.field973 = var0.method5539() + Client.cycle; // L: 460
			var2.field986 = var0.readUnsignedShort(); // L: 461
			if (var2.field631) { // L: 462
				var2.field981 += var2.tileX; // L: 463
				var2.field982 += var2.tileY; // L: 464
				var2.field958 += var2.tileX; // L: 465
				var2.field956 += var2.tileY; // L: 466
				var2.pathLength = 0; // L: 467
			} else {
				var2.field981 += var2.pathX[0]; // L: 470
				var2.field982 += var2.pathY[0]; // L: 471
				var2.field958 += var2.pathX[0]; // L: 472
				var2.field956 += var2.pathY[0]; // L: 473
				var2.pathLength = 1; // L: 474
			}

			var2.field996 = 0; // L: 476
		}

		if ((var3 & 32) != 0) { // L: 478
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 479
			if (var2.overheadText.charAt(0) == '~') { // L: 480
				var2.overheadText = var2.overheadText.substring(1); // L: 481
				class234.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 482
			} else if (var2 == PlayerComposition.localPlayer) { // L: 484
				class234.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 485
			}

			var2.isAutoChatting = false; // L: 487
			var2.overheadTextColor = 0; // L: 488
			var2.overheadTextEffect = 0; // L: 489
			var2.overheadTextCyclesRemaining = 150; // L: 490
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 128) != 0) { // L: 492
			var5 = var0.method5582(); // L: 493
			PlayerType var6 = (PlayerType)UrlRequester.findEnumerated(class234.PlayerType_values(), var0.method5571()); // L: 494
			boolean var7 = var0.readUnsignedByte() == 1; // L: 495
			var8 = var0.method5572(); // L: 496
			var9 = var0.offset; // L: 497
			if (var2.username != null && var2.appearance != null) { // L: 498
				boolean var10 = false; // L: 499
				if (var6.isUser && MilliClock.friendSystem.isIgnored(var2.username)) { // L: 500 501
					var10 = true;
				}

				if (!var10 && Client.field762 == 0 && !var2.isHidden) { // L: 503
					Players.field1264.offset = 0; // L: 504
					var0.method5593(Players.field1264.array, 0, var8); // L: 505
					Players.field1264.offset = 0; // L: 506
					String var11 = AbstractFont.escapeBrackets(ServerPacket.method3663(AttackOption.method2135(Players.field1264))); // L: 507
					var2.overheadText = var11.trim(); // L: 508
					var2.overheadTextColor = var5 >> 8; // L: 509
					var2.overheadTextEffect = var5 & 255; // L: 510
					var2.overheadTextCyclesRemaining = 150; // L: 511
					var2.isAutoChatting = var7; // L: 512
					var2.field953 = var2 != PlayerComposition.localPlayer && var6.isUser && "" != Client.field871 && var11.toLowerCase().indexOf(Client.field871) == -1; // L: 513
					if (var6.isPrivileged) { // L: 515
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 516
					}

					if (var6.modIcon != -1) { // L: 517
						class234.addGameMessage(var12, class25.method248(var6.modIcon) + var2.username.getName(), var11);
					} else {
						class234.addGameMessage(var12, var2.username.getName(), var11); // L: 518
					}
				}
			}

			var0.offset = var8 + var9; // L: 521
		}

		if ((var3 & 1024) != 0) { // L: 523
			for (var5 = 0; var5 < 3; ++var5) { // L: 524
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8) != 0) { // L: 526
			var2.field959 = var0.method5582(); // L: 527
			if (var2.pathLength == 0) { // L: 528
				var2.orientation = var2.field959; // L: 529
				var2.field959 = -1; // L: 530
			}
		}

		int var13;
		if ((var3 & 16) != 0) { // L: 533
			var5 = var0.method5571(); // L: 534
			int var15;
			int var17;
			int var19;
			if (var5 > 0) { // L: 535
				for (var13 = 0; var13 < var5; ++var13) { // L: 536
					var8 = -1; // L: 538
					var9 = -1; // L: 539
					var19 = -1; // L: 540
					var17 = var0.readUShortSmart(); // L: 541
					if (var17 == 32767) { // L: 542
						var17 = var0.readUShortSmart(); // L: 543
						var9 = var0.readUShortSmart(); // L: 544
						var8 = var0.readUShortSmart(); // L: 545
						var19 = var0.readUShortSmart(); // L: 546
					} else if (var17 != 32766) { // L: 548
						var9 = var0.readUShortSmart(); // L: 549
					} else {
						var17 = -1; // L: 551
					}

					var15 = var0.readUShortSmart(); // L: 552
					var2.addHitSplat(var17, var9, var8, var19, Client.cycle, var15); // L: 553
				}
			}

			var13 = var0.method5572(); // L: 556
			if (var13 > 0) { // L: 557
				for (var17 = 0; var17 < var13; ++var17) { // L: 558
					var8 = var0.readUShortSmart(); // L: 559
					var9 = var0.readUShortSmart(); // L: 560
					if (var9 != 32767) { // L: 561
						var19 = var0.readUShortSmart(); // L: 562
						var15 = var0.method5572(); // L: 563
						var12 = var9 > 0 ? var0.method5573() : var15; // L: 564
						var2.addHealthBar(var8, Client.cycle, var9, var19, var15, var12); // L: 565
					} else {
						var2.removeHealthBar(var8); // L: 567
					}
				}
			}
		}

		if ((var3 & 512) != 0) { // L: 571
			Players.field1253[var1] = var0.method5661(); // L: 572
		}

		if ((var3 & 1) != 0) { // L: 574
			var2.targetIndex = var0.method5539(); // L: 575
			if (var2.targetIndex == 65535) { // L: 576
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 4096) != 0) { // L: 578
			var2.spotAnimation = var0.method5539(); // L: 579
			var5 = var0.method5643(); // L: 580
			var2.field979 = var5 >> 16; // L: 581
			var2.field978 = (var5 & 65535) + Client.cycle; // L: 582
			var2.spotAnimationFrame = 0; // L: 583
			var2.spotAnimationFrameCycle = 0; // L: 584
			if (var2.field978 > Client.cycle) { // L: 585
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 586
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 2048) != 0) { // L: 588
			var4 = var0.method5665(); // L: 589
		}

		if ((var3 & 2) != 0) { // L: 591
			var5 = var0.method5539(); // L: 592
			if (var5 == 65535) { // L: 593
				var5 = -1;
			}

			var13 = var0.method5571(); // L: 594
			Tiles.performPlayerAnimation(var2, var5, var13); // L: 595
		}

		if ((var3 & 4) != 0) { // L: 597
			var5 = var0.method5573(); // L: 598
			byte[] var16 = new byte[var5]; // L: 599
			Buffer var14 = new Buffer(var16); // L: 600
			var0.method5733(var16, 0, var5); // L: 601
			Players.field1254[var1] = var14; // L: 602
			var2.read(var14); // L: 603
		}

		if (var2.field631) { // L: 605
			if (var4 == 127) { // L: 606
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				byte var18;
				if (var4 != -1) { // L: 609
					var18 = var4;
				} else {
					var18 = Players.field1253[var1]; // L: 610
				}

				var2.method1313(var2.tileX, var2.tileY, var18); // L: 611
			}
		}

	} // L: 615

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Llm;",
		garbageValue = "-1786223770"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 353
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 354
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + (long)var0 + ((long)var1 << 16); // L: 355
		SpritePixels var8;
		if (!var5) { // L: 357
			var8 = (SpritePixels) ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 358
			if (var8 != null) { // L: 359
				return var8;
			}
		}

		ItemComposition var9 = SecureRandomCallable.ItemDefinition_get(var0); // L: 361
		if (var1 > 1 && var9.countobj != null) { // L: 362
			int var10 = -1; // L: 363

			for (int var11 = 0; var11 < 10; ++var11) { // L: 364
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 365
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 367
				var9 = SecureRandomCallable.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 369
		if (var19 == null) { // L: 370
			return null;
		} else {
			SpritePixels var20 = null; // L: 371
			if (var9.noteTemplate != -1) { // L: 372
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 373
				if (var20 == null) { // L: 374
					return null;
				}
			} else if (var9.notedId != -1) { // L: 376
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 377
				if (var20 == null) { // L: 378
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 380
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 381
				if (var20 == null) { // L: 382
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 384
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 385
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 386
			int[] var15 = new int[4]; // L: 387
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 388
			var8 = new SpritePixels(36, 32); // L: 389
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 390
			Rasterizer2D.Rasterizer2D_clear(); // L: 391
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 392
			Rasterizer3D.method3138(16, 16); // L: 393
			Rasterizer3D.field1782 = false; // L: 394
			if (var9.placeholderTemplate != -1) { // L: 395
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 396
			if (var5) { // L: 397
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 398
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 399
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 400
			var19.calculateBoundsCylinder(); // L: 401
			var19.method2966(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 402
			if (var9.notedId != -1) { // L: 403
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 404
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 405
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 406
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 407
			if (var9.noteTemplate != -1) { // L: 408
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 409
				ItemComposition.ItemDefinition_fontPlain11.draw(class195.inventoryQuantityFormat(var1), 0, 9, 16776960, 1); // L: 410
			}

			if (!var5) { // L: 412
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 413
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 414
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 415
			Rasterizer3D.field1782 = true; // L: 416
			return var8; // L: 417
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2111583994"
	)
	static int method704(int var0) {
		return var0 * 3 + 600; // L: 1710
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-10595779"
	)
	static final void method679() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3619
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3620
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3621
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3633
				if (var1 == null) { // L: 3634
					Object var10000 = null; // L: 3635
					var1 = SoundEffect.readSoundEffect(class227.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3636
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3637
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3638
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3644
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3646
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3647
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3648
						int var5 = var4 * 128 + 64 - PlayerComposition.localPlayer.x; // L: 3649
						if (var5 < 0) { // L: 3650
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3651
						int var7 = var6 * 128 + 64 - PlayerComposition.localPlayer.y; // L: 3652
						if (var7 < 0) { // L: 3653
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3654
						if (var8 > var3) { // L: 3655
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3656
							continue; // L: 3657
						}

						if (var8 < 0) { // L: 3659
							var8 = 0;
						}

						var2 = (var3 - var8) * Timer.clientPreferences.areaSoundEffectsVolume / var3; // L: 3660
					} else {
						var2 = Timer.clientPreferences.soundEffectsVolume; // L: 3662
					}

					if (var2 > 0) { // L: 3663
						RawSound var9 = var1.toRawSound().resample(ItemLayer.decimator); // L: 3664
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3665
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3666
						pcmStreamMixer.addSubStream(var10); // L: 3667
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3669
				}
			} else {
				--Client.soundEffectCount; // L: 3622

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3623
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3624
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3625
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3626
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3627
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3628
				}

				--var0; // L: 3630
			}
		}

		if (Client.field883 && !JagexCache.method3566()) { // L: 3672
			if (Timer.clientPreferences.musicVolume != 0 && Client.currentTrackGroupId != -1) { // L: 3673
				Interpreter.method2082(class217.archive6, Client.currentTrackGroupId, 0, Timer.clientPreferences.musicVolume, false);
			}

			Client.field883 = false; // L: 3674
		}

	} // L: 3676

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-504342638"
	)
	static final void method703() {
		int[] var0 = Players.Players_indices; // L: 3824

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3825
			Player var4 = Client.players[var0[var1]]; // L: 3826
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3827
				--var4.overheadTextCyclesRemaining; // L: 3828
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3829
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3832
			int var2 = Client.npcIndices[var1]; // L: 3833
			NPC var3 = Client.npcs[var2]; // L: 3834
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3835
				--var3.overheadTextCyclesRemaining; // L: 3836
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3837
					var3.overheadText = null;
				}
			}
		}

	} // L: 3840

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "-939198295"
	)
	static final void method672(Actor var0) {
		int var1 = Math.max(1, var0.field984 - Client.cycle); // L: 3975
		int var2 = var0.field941 * 64 + var0.field981 * 128; // L: 3976
		int var3 = var0.field941 * 64 + var0.field982 * 128; // L: 3977
		var0.x += (var2 - var0.x) / var1; // L: 3978
		var0.y += (var3 - var0.y) / var1; // L: 3979
		var0.field963 = 0; // L: 3980
		var0.orientation = var0.field986; // L: 3981
	} // L: 3982

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1888675083"
	)
	static final int method712() {
		if (Timer.clientPreferences.roofsHidden) { // L: 4784
			return GameObject.Client_plane;
		} else {
			int var0 = SecureRandomFuture.getTileHeight(Player.cameraX, class69.cameraZ, GameObject.Client_plane); // L: 4785
			return var0 - KeyHandler.cameraY < 800 && (Tiles.Tiles_renderFlags[GameObject.Client_plane][Player.cameraX >> 7][class69.cameraZ >> 7] & 4) != 0 ? GameObject.Client_plane : 3; // L: 4786 4787
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1369174129"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8347
			Widget var0 = class92.getWidgetChild(MouseHandler.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8348
			if (var0 != null && var0.onTargetLeave != null) { // L: 8349
				ScriptEvent var1 = new ScriptEvent(); // L: 8350
				var1.widget = var0; // L: 8351
				var1.args = var0.onTargetLeave; // L: 8352
				class22.runScriptEvent(var1); // L: 8353
			}

			Client.isSpellSelected = false; // L: 8355
			CollisionMap.invalidateWidget(var0); // L: 8356
		}
	} // L: 8357

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1536063708"
	)
	static final void method686(int var0, int var1, int var2, boolean var3) {
		if (class41.loadInterface(var0)) { // L: 9477
			Interpreter.resizeInterface(class9.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 9478
		}
	} // L: 9479
}
