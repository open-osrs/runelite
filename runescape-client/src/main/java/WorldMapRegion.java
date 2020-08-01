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

@ObfuscatedName("ap")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 224644345
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2039655483
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("a")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1539368261
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -484140581
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("y")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("c")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("h")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1;
		this.regionY = var2;
		this.worldMapData1List = new LinkedList();
		this.icon0List = new LinkedList();
		this.iconMap = new HashMap();
		this.backgroundColor = var3 | -16777216;
		this.fonts = var4;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-323473463"
	)
	void method490(int var1, int var2, int var3) {
		Sprite var4 = InterfaceParent.method1233(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Li;Ljava/util/List;I)V",
		garbageValue = "-1392873276"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "114"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next();
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
				this.worldMapData1List.add(var4);
			}
		}

		this.addAllToIconList(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIILax;I)V",
		garbageValue = "513799457"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label48:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							WorldMapDecoration var12 = var10[var11];
							ObjectDefinition var13 = Canvas.getObjectDefinition(var12.objectDefinitionId);
							if (GrandExchangeOfferUnitPriceComparator.method202(var13)) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label48;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljg;IIILax;I)V",
		garbageValue = "1752488167"
	)
	@Export("getIcon")
	void getIcon(ObjectDefinition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8);
		}

		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			WorldMapElement var9 = Client.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		this.iconMap.put(new Coord(0, var3, var4), var10);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1939037740"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator();

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
			if (var2 instanceof WorldMapIcon_1) {
				((WorldMapIcon_1)var2).init();
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-1366696532"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method518(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1391400259"
	)
	void method580() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator();

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next();
				var2.reset();
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)Z",
		garbageValue = "-1165934913"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear();
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.loadGeography(var1);
			if (this.worldMapData_0.isFullyLoaded()) {
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var2 = true;

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) {
				var4 = (WorldMapData_1)var3.next();
				var4.loadGeography(var1);
			}

			if (var2) {
				var3 = this.worldMapData1List.iterator();

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next();
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILay;[Llh;Lic;Lic;I)V",
		garbageValue = "-799383237"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			if (InterfaceParent.method1233(this.regionX, this.regionY, var1) == null) {
				boolean var6 = true;
				var6 &= this.loadGeography(var4);
				int var8;
				if (this.worldMapData_0 != null) {
					var8 = this.worldMapData_0.groupId;
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var6 &= var5.tryLoadGroup(var8);
				if (var6) {
					byte[] var7 = var5.takeFileFlat(var8);
					WorldMapSprite var9;
					if (var7 == null) {
						var9 = new WorldMapSprite();
					} else {
						var9 = new WorldMapSprite(FloorUnderlayDefinition.convertJpgToSprite(var7).pixels);
					}

					Sprite var11 = new Sprite(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var11.setRaster();
					if (this.worldMapData_0 != null) {
						this.method501(var2, var3, var9);
					} else {
						this.method502(var2, var3, var9);
					}

					class90.method2166(var11, this.regionX, this.regionY, this.pixelsPerTile);
					this.method580();
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "830003997"
	)
	void method514(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-850649722"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = Client.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method497(var1, var2, var3);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lay;[Llh;Las;B)V",
		garbageValue = "-41"
	)
	void method501(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method511(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method503(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lay;[Llh;Las;B)V",
		garbageValue = "-26"
	)
	void method502(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method511(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method503(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILax;Lay;[Llh;I)V",
		garbageValue = "-248826960"
	)
	void method503(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method527(var1, var2, var3);
		this.method507(var1, var2, var3, var5);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILax;Lay;Las;I)V",
		garbageValue = "1979978658"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}

		int var8 = 16711935;
		if (var7 != -1) {
			var8 = Buddy.method5363(var7, this.backgroundColor);
		}

		if (var7 > -1 && var3.field185[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method506(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method798(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field185[0][var1][var2], var3.field175[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILax;Lay;I)V",
		garbageValue = "-946989025"
	)
	void method511(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = Buddy.method5363(var6, this.backgroundColor);
				if (var3.field185[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method798(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field185[var5][var1][var2], var3.field175[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILax;Las;B)I",
		garbageValue = "76"
	)
	int method506(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILax;[Llh;I)V",
		garbageValue = "-388606552"
	)
	void method507(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					if (!WorldMapData_1.method784(var9.decoration)) {
						int var11 = var9.decoration;
						boolean var10 = var11 == WorldMapDecorationType.field2777.id;
						if (!var10) {
							continue;
						}
					}

					ObjectDefinition var12 = Canvas.getObjectDefinition(var9.objectDefinitionId);
					if (var12.mapSceneId != -1) {
						if (var12.mapSceneId != 46 && var12.mapSceneId != 52) {
							var4[var12.mapSceneId].method6322(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						} else {
							var4[var12.mapSceneId].method6322(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILax;B)V",
		garbageValue = "101"
	)
	void method527(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = var10 >= WorldMapDecorationType.field2756.id && var10 <= WorldMapDecorationType.field2758.id || var10 == WorldMapDecorationType.field2759.id;
					if (var9) {
						ObjectDefinition var11 = Canvas.getObjectDefinition(var8.objectDefinitionId);
						int var12 = var11.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field2756.id) {
							this.method522(var1, var2, var8.rotation, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field2755.id) {
							this.method522(var1, var2, var8.rotation, -3355444);
							this.method522(var1, var2, var8.rotation + 1, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field2758.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2759.id) {
							int var13 = var8.rotation % 2;
							int var14;
							if (var13 == 0) {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12);
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1066971556"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next();
			Coord var9 = (Coord)var8.getKey();
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6);
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = Client.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method512(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-545046717"
	)
	void method497(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = Client.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lih;IIIII)V",
		garbageValue = "1074456567"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		Sprite var6 = var1.getSpriteBool(false);
		if (var6 != null) {
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
			if (var4 % var5 < var5 / 2) {
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Laf;IIFI)V",
		garbageValue = "-591534558"
	)
	void method512(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = Client.WorldMapElement_get(var1.getElement());
		this.method494(var5, var2, var3);
		this.method604(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lih;IIB)V",
		garbageValue = "34"
	)
	void method494(WorldMapElement var1, int var2, int var3) {
		Sprite var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method516(var4, var1.horizontalAlignment);
			int var6 = this.method517(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Laf;Lih;IIFB)V",
		garbageValue = "81"
	)
	void method604(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method246(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3251, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-109418068"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		Iterator var6 = this.icon0List.iterator();

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next();
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = (int)(var5 * (float)var8 + (float)var1);
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9));
				if (!var3.contains(var7.getElement())) {
					this.method512(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llz;Ljc;I)I",
		garbageValue = "-1624159662"
	)
	int method516(Sprite var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 1:
			return -var1.subWidth / 2;
		case 2:
			return 0;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llz;Lif;I)I",
		garbageValue = "1330408949"
	)
	int method517(Sprite var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 1:
			return -var1.subHeight / 2;
		case 2:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lar;",
		garbageValue = "15"
	)
	WorldMapLabel method518(int var1) {
		WorldMapElement var2 = Client.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lih;I)Lar;",
		garbageValue = "-1165001445"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small};
			WorldMapLabelSize[] var5 = var4;
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null;
					break;
				}

				WorldMapLabelSize var7 = var5[var6];
				if (var3 == var7.field132) {
					var2 = var7;
					break;
				}

				++var6;
			}

			if (var2 == null) {
				return null;
			} else {
				Font var14 = (Font)this.fonts.get(var2);
				if (var14 == null) {
					return null;
				} else {
					var6 = var14.lineCount(var1.name, 1000000);
					String[] var15 = new String[var6];
					var14.breakLines(var1.name, (int[])null, var15);
					int var8 = var15.length * var14.ascent / 2;
					int var9 = 0;
					String[] var10 = var15;

					for (int var11 = 0; var11 < var10.length; ++var11) {
						String var12 = var10[var11];
						int var13 = var14.stringWidth(var12);
						if (var13 > var9) {
							var9 = var13;
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "1872285307"
	)
	List method544(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var3 + var2) {
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				}

				var7 = this.icon0List.iterator();

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				}

				return var6;
			} else {
				return var6;
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-2023703181"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-637196231"
	)
	void method522(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method611(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;ZIB)V",
		garbageValue = "73"
	)
	static void method541(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (GrandExchangeOfferAgeComparator.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = FloorUnderlayDefinition.convertJpgToSprite(var4);
			ItemContainer.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			if ((Client.worldProperties & 536870912) != 0) {
				Login.logoSprite = class329.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((Client.worldProperties & 1073741824) != 0) {
				Login.logoSprite = class329.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				Login.logoSprite = class329.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			HealthBar.titleboxSprite = class329.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Fonts.titlebuttonSprite = class329.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.runesSprite = PendingSpawn.method1806(var1, "runes", "");
			Decimator.title_muteSprite = PendingSpawn.method1806(var1, "title_mute", "");
			Login.options_buttons_0Sprite = class329.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class336.field3912 = class329.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			GameShell.options_buttons_2Sprite = class329.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			ScriptEvent.field597 = class329.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			ScriptEvent.field606 = Login.options_buttons_0Sprite.subWidth;
			Skeleton.field1826 = Login.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			WorldMapSprite.field264 = 0;
			ClanMate.otp = "";
			Login.field1223 = true;
			Login.worldSelectOpen = false;
			if (!NetSocket.clientPreferences.titleMusicDisabled) {
				WorldMapSectionType.method306(2, UserComparator7.archive6, "scape main", "", 255, false);
			} else {
				class206.field2439 = 1;
				Huffman.musicTrackArchive = null;
				class206.musicTrackGroupId = -1;
				MilliClock.musicTrackFileId = -1;
				class206.musicTrackVolume = 0;
				class336.musicTrackBoolean = false;
				class206.field2442 = 2;
			}

			class41.method624(false);
			GrandExchangeOfferAgeComparator.clearLoginScreen = true;
			Login.xPadding = (Varcs.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Login.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			ItemContainer.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIILem;[Lfz;I)V",
		garbageValue = "2110608618"
	)
	static final void method520(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;

		while (true) {
			int var7 = var5.method5732();
			if (var7 == 0) {
				return;
			}

			var6 += var7;
			int var8 = 0;

			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}

					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}

					class41.method623(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1188982051"
	)
	public static String method613(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1729353044"
	)
	static void method591() {
		if (WorldMapSection3.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}
}
