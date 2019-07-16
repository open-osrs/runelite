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

@ObfuscatedName("al")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("m")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("f")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lae;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	@Export("compositeTextureSprite")
	Sprite compositeTextureSprite;
	@ObfuscatedName("o")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "[[Lav;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("g")
	HashMap field1045;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "[Llq;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("d")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1459928419
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1364441271
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1729323633
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -395718741
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1085359673
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		signature = "([Llq;Ljava/util/HashMap;Lir;Lir;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false;
		this.loadStarted = false;
		this.field1045 = new HashMap();
		this.pixelsPerTile = 0;
		this.mapSceneSprites = var1;
		this.fonts = var2;
		this.geographyArchive = var3;
		this.groundArchive = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lir;Ljava/lang/String;ZB)V",
		garbageValue = "32"
	)
	@Export("load")
	public void load(AbstractArchive archive, String cacheName, boolean isMembersWorld) {
		if (!this.loadStarted) {
			this.loaded = false;
			this.loadStarted = true;
			System.nanoTime();
			int var4 = archive.getGroupId(WorldMapCacheName.WorldMapCacheName_details.name);
			int var5 = archive.getFileId(var4, cacheName);
			Buffer var6 = new Buffer(archive.takeFileByNames(WorldMapCacheName.WorldMapCacheName_details.name, cacheName));
			Buffer var7 = new Buffer(archive.takeFileByNames(WorldMapCacheName.WorldMapCacheName_compositeMap.name, cacheName));
			System.nanoTime();
			System.nanoTime();
			this.mapAreaData = new WorldMapAreaData();

			try {
				this.mapAreaData.init(var6, var7, var5, isMembersWorld);
			} catch (IllegalStateException var16) {
				return;
			}

			this.mapAreaData.getOriginX();
			this.mapAreaData.getOriginPlane();
			this.mapAreaData.getOriginY();
			this.tileX = this.mapAreaData.getRegionLowX() * 64;
			this.tileY = this.mapAreaData.getRegionLowY() * 64;
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64;
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64;
			int var8 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
			System.nanoTime();
			System.nanoTime();
			SoundSystem.WorldMapRegion_clearCachedSprites();
			this.regions = new WorldMapRegion[var8][var9];
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator();

			int var11;
			while (var10.hasNext()) {
				WorldMapData_0 var12 = (WorldMapData_0)var10.next();
				var11 = var12.regionXLow;
				int var13 = var12.regionYLow;
				int var14 = var11 - this.mapAreaData.getRegionLowX();
				int var15 = var13 - this.mapAreaData.getRegionLowY();
				this.regions[var14][var15] = new WorldMapRegion(var11, var13, this.mapAreaData.getBackGroundColor(), this.fonts);
				this.regions[var14][var15].initWorldMapData0(var12, this.mapAreaData.iconList);
			}

			for (int var17 = 0; var17 < var8; ++var17) {
				for (var11 = 0; var11 < var9; ++var11) {
					if (this.regions[var17][var11] == null) {
						this.regions[var17][var11] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var11, this.mapAreaData.getBackGroundColor(), this.fonts);
						this.regions[var17][var11].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (archive.isValidFileName(WorldMapCacheName.WorldMapCacheName_compositeTexture.name, cacheName)) {
				byte[] var18 = archive.takeFileByNames(WorldMapCacheName.WorldMapCacheName_compositeTexture.name, cacheName);
				this.compositeTextureSprite = WorldMapSprite.convertJpgToSprite(var18);
			}

			System.nanoTime();
			archive.clearGroups();
			archive.clearFiles();
			this.loaded = true;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "20"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIIIIIIII)V",
		garbageValue = "1619301748"
	)
	@Export("drawTiles")
	public final void drawTiles(int minTileX, int minTileY, int maxTileX, int maxTileY, int minScreenX, int minScreenY, int maxScreenX, int maxScreenY) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
		int var10 = Rasterizer2D.Rasterizer2D_width;
		int var11 = Rasterizer2D.Rasterizer2D_height;
		int[] var12 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var12);
		WorldMapRectangle var13 = this.createWorldMapRectangle(minTileX, minTileY, maxTileX, maxTileY);
		float var14 = this.getPixelsPerTile(maxScreenX - minScreenX, maxTileX - minTileX);
		int var15 = (int)Math.ceil((double)var14);
		this.pixelsPerTile = var15;
		if (!this.field1045.containsKey(var15)) {
			class40 var16 = new class40(var15);
			var16.init();
			this.field1045.put(var15, var16);
		}

		int var23 = var13.x + var13.width - 1;
		int var17 = var13.y + var13.height - 1;

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) {
			for (var19 = var13.y; var19 <= var17; ++var19) {
				this.regions[var18][var19].drawTile(var15, (class40)this.field1045.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11);
		Rasterizer2D.Rasterizer2D_setClipArray(var12);
		var18 = (int)(64.0F * var14);
		var19 = this.tileX + minTileX;
		int var20 = minTileY + this.tileY;

		for (int var21 = var13.x; var21 < var13.x + var13.width; ++var21) {
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) {
				this.regions[var21][var22].method404(minScreenX + var18 * (this.regions[var21][var22].regionx * 64 - var19) / 64, maxScreenY - var18 * (this.regions[var21][var22].regionY * 64 - var20 + 64) / 64, var18);
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V",
		garbageValue = "-71"
	)
	public final void method402(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var16 = (int)(var15 * 64.0F);
		int var17 = this.tileX + var1;
		int var18 = var2 + this.tileY;

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
				if (var13) {
					this.regions[var19][var20].initWorldMapIcon1s();
				}

				this.regions[var19][var20].method410(var5 + var16 * (this.regions[var19][var20].regionx * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
				for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) {
					this.regions[var19][var20].method411(var10, var11, var12);
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "-2144548575"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) {
			this.compositeTextureSprite.method309(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.icons == null) {
					this.buildIcons0();
				}

				Iterator var8 = var5.iterator();

				while (true) {
					List var9;
					do {
						if (!var8.hasNext()) {
							return;
						}

						int var10 = (Integer)var8.next();
						var9 = (List)this.icons.get(var10);
					} while(var9 == null);

					Iterator var14 = var9.iterator();

					while (var14.hasNext()) {
						AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var14.next();
						int var12 = var3 * (var11.coord2.x - this.tileX) / this.tileWidth;
						int var13 = var4 - (var11.coord2.y - this.tileY) * var4 / this.tileHeight;
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var12 + var1, var13 + var2, 2, 16776960, 256);
					}
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "1185703832"
	)
	public List method403(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList();
		if (!this.loaded) {
			return var11;
		}
		WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var13 = this.getPixelsPerTile(var7, var3 - var1);
		int var14 = (int)(var13 * 64.0F);
		int var15 = this.tileX + var1;
		int var16 = var2 + this.tileY;

		for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) {
			for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) {
				List var19 = this.regions[var17][var18].method421(var5 + var14 * (this.regions[var17][var18].regionx * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
				if (!var19.isEmpty()) {
					var11.addAll(var19);
				}
			}
		}

		return var11;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IIIII)Lc;",
		garbageValue = "-1455088394"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this);
		int var6 = this.tileX + var1;
		int var7 = var2 + this.tileY;
		int var8 = var3 + this.tileX;
		int var9 = var4 + this.tileY;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.width = var12 - var10 + 1;
		var5.height = var13 - var11 + 1;
		var5.x = var10 - this.mapAreaData.getRegionLowX();
		var5.y = var11 - this.mapAreaData.getRegionLowY();
		if (var5.x < 0) {
			var5.width += var5.x;
			var5.x = 0;
		}

		if (var5.x > this.regions.length - var5.width) {
			var5.width = this.regions.length - var5.x;
		}

		if (var5.y < 0) {
			var5.height += var5.y;
			var5.y = 0;
		}

		if (var5.y > this.regions[0].length - var5.height) {
			var5.height = this.regions[0].length - var5.y;
		}

		var5.width = Math.min(var5.width, this.regions.length);
		var5.height = Math.min(var5.height, this.regions[0].length);
		return var5;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "483037662"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)Ljava/util/HashMap;",
		garbageValue = "464090770"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0();
		return this.icons;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "14"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) {
			this.icons = new HashMap();
		}

		this.icons.clear();

		for (int var1 = 0; var1 < this.regions.length; ++var1) {
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) {
				List var3 = this.regions[var1][var2].icons();
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
					if (var5.hasValidElement()) {
						int var6 = var5.getElement();
						if (!this.icons.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(III)F",
		garbageValue = "1249403507"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2;
		if (var3 > 8.0F) {
			return 8.0F;
		}
		if (var3 < 1.0F) {
			return 1.0F;
		}
		int var4 = Math.round(var3);
		return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "514181856"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int itemContainerId, int index, int itemId, int itemQuantity) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)itemContainerId);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)itemContainerId);
		}

		if (var4.ids.length <= index) {
			int[] var5 = new int[index + 1];
			int[] var6 = new int[index + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < index; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[index] = itemId;
		var4.quantities[index] = itemQuantity;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1743251873"
	)
	@Export("ObjectDefinition_clearCached")
	public static void ObjectDefinition_clearCached() {
		ObjectDefinition.ObjectDefinition_cached.clear();
		ObjectDefinition.ObjectDefinition_cachedModelData.clear();
		ObjectDefinition.ObjectDefinition_cachedEntities.clear();
		ObjectDefinition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1344882321"
	)
	@Export("isWidgetMenuOpcode")
	static boolean isWidgetMenuOpcode(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1341489301"
	)
	static final void method668() {
		Client.field105 = Client.cycleCntr;
	}
}
