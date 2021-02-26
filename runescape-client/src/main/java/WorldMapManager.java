import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1947633143
	)
	static int field345;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("ei")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("n")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("v")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("y")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[[Las;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("z")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("s")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 749583707
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 461859631
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -571129221
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -437301779
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1259035297
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lly;Ljava/util/HashMap;Lig;Lig;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false; // L: 16
		this.loadStarted = false; // L: 17
		this.scaleHandlers = new HashMap(); // L: 22
		this.pixelsPerTile = 0;
		this.mapSceneSprites = var1; // L: 34
		this.fonts = var2; // L: 35
		this.geographyArchive = var3; // L: 36
		this.groundArchive = var4; // L: 37
	} // L: 38

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;ZI)V",
		garbageValue = "1075163259"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field333.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field333.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field323.name, var2)); // L: 50
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
			Messages.method2372(); // L: 71
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
			if (var1.isValidFileName(WorldMapCacheName.field324.name, var2)) { // L: 94
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field324.name, var2); // L: 95
				this.compositeTextureSprite = WorldMapRectangle.convertJpgToSprite(var20); // L: 96
			}

			System.nanoTime(); // L: 98
			var1.clearGroups(); // L: 99
			var1.clearFiles(); // L: 100
			this.loaded = true; // L: 101
		}
	} // L: 42 102

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-192155866"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 105
	} // L: 106

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1854160239"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 109
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 110
		int var11 = Rasterizer2D.Rasterizer2D_height;
		int[] var12 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var12);
		WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 114
		float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 115
		int var15 = (int)Math.ceil((double)var14);
		this.pixelsPerTile = var15;
		if (!this.scaleHandlers.containsKey(var15)) {
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15);
			var16.init();
			this.scaleHandlers.put(var15, var16);
		}

		int var23 = var13.x + var13.width - 1;
		int var17 = var13.y + var13.height - 1; // L: 124

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) { // L: 125
			for (var19 = var13.y; var19 <= var17; ++var19) { // L: 126
				this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11); // L: 130
		Rasterizer2D.Rasterizer2D_setClipArray(var12); // L: 131
		var18 = (int)(var14 * 64.0F); // L: 132
		var19 = this.tileX + var1; // L: 133
		int var20 = var2 + this.tileY; // L: 134

		for (int var21 = var13.x; var21 < var13.width + var13.x; ++var21) { // L: 135
			for (int var22 = var13.y; var22 < var13.height + var13.y; ++var22) { // L: 136
				this.regions[var21][var22].method506(var5 + (this.regions[var21][var22].regionX * 64 - var19) * var18 / 64, var8 - (this.regions[var21][var22].regionY * 64 - var20 + 64) * var18 / 64, var18); // L: 137
			}
		}

	} // L: 140

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-2105446269"
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
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 148
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 149
				if (var13) { // L: 150
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 151
				}

				this.regions[var19][var20].method516(var5 + (this.regions[var19][var20].regionX * 64 - var17) * var16 / 64, var8 - (this.regions[var19][var20].regionY * 64 - var18 + 64) * var16 / 64, var16, var9); // L: 153
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "1410026121"
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

					Iterator var11 = var10.iterator(); // L: 183

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 184
						int var13 = var3 * (var12.coord2.x - this.tileX) / this.tileWidth; // L: 186
						int var14 = var4 - (var12.coord2.y - this.tileY) * var4 / this.tileHeight; // L: 187
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 188
					}
				}
			}
		}
	} // L: 167 171

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "-1800022691"
	)
	public List method722(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 196
		if (!this.loaded) { // L: 197
			return var11; // L: 198
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 200
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 201
			int var14 = (int)(64.0F * var13); // L: 202
			int var15 = this.tileX + var1; // L: 203
			int var16 = var2 + this.tileY; // L: 204

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 205
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 206
					List var19 = this.regions[var17][var18].method537(var5 + (this.regions[var17][var18].regionX * 64 - var15) * var14 / 64, var8 + var6 - (this.regions[var17][var18].regionY * 64 - var16 + 64) * var14 / 64, var14, var9, var10); // L: 207
					if (!var19.isEmpty()) { // L: 208
						var11.addAll(var19); // L: 209
					}
				}
			}

			return var11; // L: 213
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Laq;",
		garbageValue = "-2121459740"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 250
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/HashMap;",
		garbageValue = "108"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 254
		return this.icons; // L: 255
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "11"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljx;",
		garbageValue = "-2146982596"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfe;B)V",
		garbageValue = "0"
	)
	static final void method749(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 111
			for (var10 = 0; var10 < 8; ++var10) { // L: 112
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2]; // L: 113
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var13 = new Buffer(var0); // L: 116

		for (var10 = 0; var10 < 4; ++var10) { // L: 117
			for (int var11 = 0; var11 < 64; ++var11) { // L: 118
				for (int var12 = 0; var12 < 64; ++var12) { // L: 119
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 120
						KeyHandler.loadTerrain(var13, var1, var2 + class236.method4332(var11 & 7, var12 & 7, var7), var3 + TextureProvider.method2914(var11 & 7, var12 & 7, var7), 0, 0, var7); // L: 121
					} else {
						KeyHandler.loadTerrain(var13, 0, -1, -1, 0, 0, 0); // L: 123
					}
				}
			}
		}

	} // L: 127

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-74"
	)
	static void method738() {
		Login.Login_username = Login.Login_username.trim(); // L: 794
		if (Login.Login_username.length() == 0) { // L: 795
			InvDefinition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 796
		} else {
			long var1;
			try {
				URL var3 = new URL(GrandExchangeOfferNameComparator.method209("services", false) + "m=accountappeal/login.ws"); // L: 803
				URLConnection var4 = var3.openConnection(); // L: 804
				var4.setRequestProperty("connection", "close"); // L: 805
				var4.setDoInput(true); // L: 806
				var4.setDoOutput(true); // L: 807
				var4.setConnectTimeout(5000); // L: 808
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 809
				var5.write("data1=req"); // L: 810
				var5.flush(); // L: 811
				InputStream var6 = var4.getInputStream(); // L: 812
				Buffer var7 = new Buffer(new byte[1000]); // L: 813

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 815
					if (var8 == -1) { // L: 816
						var7.offset = 0; // L: 823
						long var20 = var7.readLong(); // L: 824
						var1 = var20; // L: 825
						break;
					}

					var7.offset += var8; // L: 817
					if (var7.offset >= 1000) { // L: 818
						var1 = 0L; // L: 819
						break;
					}
				}
			} catch (Exception var28) { // L: 827
				var1 = 0L; // L: 828
			}

			byte var0;
			if (0L == var1) { // L: 832
				var0 = 5;
			} else {
				String var29 = Login.Login_username; // L: 835
				Random var30 = new Random(); // L: 837
				Buffer var24 = new Buffer(128); // L: 838
				Buffer var9 = new Buffer(128); // L: 839
				int[] var10 = new int[]{var30.nextInt(), var30.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 840 841 842 843 844
				var24.writeByte(10); // L: 845

				int var11;
				for (var11 = 0; var11 < 4; ++var11) { // L: 846
					var24.writeInt(var30.nextInt()); // L: 847
				}

				var24.writeInt(var10[0]); // L: 849
				var24.writeInt(var10[1]); // L: 850
				var24.writeLong(var1); // L: 851
				var24.writeLong(0L); // L: 852

				for (var11 = 0; var11 < 4; ++var11) { // L: 853
					var24.writeInt(var30.nextInt()); // L: 854
				}

				var24.encryptRsa(class89.field1155, class89.field1154); // L: 856
				var9.writeByte(10); // L: 857

				for (var11 = 0; var11 < 3; ++var11) { // L: 858
					var9.writeInt(var30.nextInt()); // L: 859
				}

				var9.writeLong(var30.nextLong()); // L: 861
				var9.writeLongMedium(var30.nextLong()); // L: 862
				GrandExchangeOfferOwnWorldComparator.method1378(var9); // L: 863
				var9.writeLong(var30.nextLong()); // L: 864
				var9.encryptRsa(class89.field1155, class89.field1154); // L: 865
				var11 = WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var29); // L: 866
				if (var11 % 8 != 0) { // L: 867
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11); // L: 868
				var12.writeStringCp1252NullTerminated(var29); // L: 869
				var12.offset = var11; // L: 870
				var12.xteaEncryptAll(var10); // L: 871
				Buffer var13 = new Buffer(var12.offset + var9.offset + var24.offset + 5); // L: 872
				var13.writeByte(2); // L: 873
				var13.writeByte(var24.offset); // L: 874
				var13.writeBytes(var24.array, 0, var24.offset); // L: 875
				var13.writeByte(var9.offset); // L: 876
				var13.writeBytes(var9.array, 0, var9.offset); // L: 877
				var13.writeShort(var12.offset); // L: 878
				var13.writeBytes(var12.array, 0, var12.offset); // L: 879
				String var14 = VertexNormal.method3163(var13.array); // L: 880

				byte var25;
				try {
					URL var15 = new URL(GrandExchangeOfferNameComparator.method209("services", false) + "m=accountappeal/login.ws"); // L: 882
					URLConnection var16 = var15.openConnection(); // L: 883
					var16.setDoInput(true); // L: 884
					var16.setDoOutput(true); // L: 885
					var16.setConnectTimeout(5000); // L: 886
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream()); // L: 887
					var17.write("data2=" + WallDecoration.method3450(var14) + "&dest=" + WallDecoration.method3450("passwordchoice.ws")); // L: 888
					var17.flush(); // L: 889
					InputStream var18 = var16.getInputStream(); // L: 890
					var13 = new Buffer(new byte[1000]); // L: 891

					while (true) {
						int var19 = var18.read(var13.array, var13.offset, 1000 - var13.offset); // L: 893
						if (var19 == -1) { // L: 894
							var17.close(); // L: 901
							var18.close(); // L: 902
							String var26 = new String(var13.array); // L: 903
							if (var26.startsWith("OFFLINE")) { // L: 904
								var25 = 4; // L: 905
							} else if (var26.startsWith("WRONG")) { // L: 908
								var25 = 7; // L: 909
							} else if (var26.startsWith("RELOAD")) { // L: 912
								var25 = 3; // L: 913
							} else if (var26.startsWith("Not permitted for social network accounts.")) { // L: 916
								var25 = 6; // L: 917
							} else {
								var13.xteaDecryptAll(var10); // L: 920

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) { // L: 921
									--var13.offset; // L: 922
								}

								var26 = new String(var13.array, 0, var13.offset); // L: 924
								if (ReflectionCheck.method2452(var26)) { // L: 925
									WorldMapRectangle.openURL(var26, true, false); // L: 926
									var25 = 2; // L: 927
								} else {
									var25 = 5; // L: 929
								}
							}
							break;
						}

						var13.offset += var19; // L: 895
						if (var13.offset >= 1000) { // L: 896
							var25 = 5; // L: 897
							break;
						}
					}
				} catch (Throwable var27) { // L: 931
					var27.printStackTrace(); // L: 932
					var25 = 5; // L: 933
				}

				var0 = var25; // L: 936
			}

			switch(var0) { // L: 938
			case 2:
				InvDefinition.setLoginResponseString(Strings.field3056, Strings.field3057, Strings.field3058); // L: 949
				Login.loginIndex = 6; // L: 950
				break; // L: 951
			case 3:
				InvDefinition.setLoginResponseString("", "Error connecting to server.", ""); // L: 956
				break;
			case 4:
				InvDefinition.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 943
				break; // L: 944
			case 5:
				InvDefinition.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 940
				break; // L: 941
			case 6:
				InvDefinition.setLoginResponseString("", "Error connecting to server.", ""); // L: 953
				break; // L: 954
			case 7:
				InvDefinition.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 946
			}

		}
	} // L: 797 959

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZB)I",
		garbageValue = "1"
	)
	static int method746(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 1920
			Interpreter.Interpreter_intStackSize -= 2; // L: 1921
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1922
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1923
			EnumComposition var10 = getEnum(var3); // L: 1924
			if (var10.outputType != 's') { // L: 1925
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 1926
				if (var9 == var10.keys[var6]) { // L: 1927
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 1928
					var10 = null; // L: 1929
					break;
				}
			}

			if (var10 != null) { // L: 1933
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 1934
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 1936
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 1962
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1963
				EnumComposition var4 = getEnum(var3); // L: 1964
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 1965
				return 1; // L: 1966
			} else {
				return 2; // L: 1968
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 1937
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1938
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1939
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1940
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 1941
			EnumComposition var7 = getEnum(var5); // L: 1942
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 1943
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 1948
					if (var6 == var7.keys[var8]) { // L: 1949
						if (var9 == 115) { // L: 1950
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 1951
						}

						var7 = null; // L: 1952
						break;
					}
				}

				if (var7 != null) { // L: 1956
					if (var9 == 115) { // L: 1957
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 1958
					}
				}

				return 1; // L: 1960
			} else {
				if (var9 == 115) { // L: 1944
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1945
				}

				return 1; // L: 1946
			}
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "4"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		WorldMapEvent.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 8997
	} // L: 8998

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Lhz;IIZB)V",
		garbageValue = "1"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 9971
		int var5 = var0.height; // L: 9972
		if (var0.widthAlignment == 0) { // L: 9973
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 9974
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 9975
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 9976
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 9977
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 9978
		}

		if (var0.widthAlignment == 4) { // L: 9979
			var0.width = var0.field2610 * var0.height / var0.field2611;
		}

		if (var0.heightAlignment == 4) { // L: 9980
			var0.height = var0.field2611 * var0.width / var0.field2610;
		}

		if (var0.contentType == 1337) { // L: 9981
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 9982
			ScriptEvent var6 = new ScriptEvent(); // L: 9983
			var6.widget = var0; // L: 9984
			var6.args = var0.onResize; // L: 9985
			Client.scriptEvents.addFirst(var6); // L: 9986
		}

	} // L: 9988
}
