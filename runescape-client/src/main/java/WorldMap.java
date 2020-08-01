import java.util.Arrays;
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

@ObfuscatedName("ma")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("h")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Llh;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("r")
	@Export("details")
	HashMap details;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	WorldMapArea field3984;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -477044905
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2103634789
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1027821819
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -921409869
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("f")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ah")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 356289309
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -733670243
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1490793911
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1155375327
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 414730673
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1380461053
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("am")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ak")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1899094841
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2123119613
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -879818821
	)
	int field4014;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1109861733
	)
	int field3975;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1756719777
	)
	int field4005;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -903365883
	)
	int field4006;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 684510429086866809L
	)
	long field4007;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 69046583
	)
	int field4008;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 788734491
	)
	int field4009;
	@ObfuscatedName("at")
	boolean field4017;
	@ObfuscatedName("az")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("aq")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("ay")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("au")
	HashSet field4027;
	@ObfuscatedName("aj")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 668714479
	)
	int field4016;
	@ObfuscatedName("bg")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("be")
	List field4018;
	@ObfuscatedName("bf")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("ba")
	HashSet field3978;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bb")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("sprite")
	Sprite sprite;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1633365947
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1616979105
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 780139023
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -385601979
	)
	int field3988;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11;
		fontNameVerdana13 = FontName.FontName_verdana13;
		fontNameVerdana15 = FontName.FontName_verdana15;
	}

	public WorldMap() {
		this.worldMapTargetX = -1;
		this.worldMapTargetY = -1;
		this.worldMapDisplayWidth = -1;
		this.worldMapDisplayHeight = -1;
		this.worldMapDisplayX = -1;
		this.worldMapDisplayY = -1;
		this.maxFlashCount = 3;
		this.cyclesPerFlash = 50;
		this.perpetualFlash = false;
		this.flashingElements = null;
		this.flashCount = -1;
		this.flashCycle = -1;
		this.field4014 = -1;
		this.field3975 = -1;
		this.field4005 = -1;
		this.field4006 = -1;
		this.field4017 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field4027 = new HashSet();
		this.elementsDisabled = false;
		this.field4016 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field3978 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field3988 = -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;Lic;Lko;Ljava/util/HashMap;[Llh;I)V",
		garbageValue = "-2031713861"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6;
		this.WorldMap_archive = var1;
		this.WorldMap_geographyArchive = var2;
		this.WorldMap_groundArchive = var3;
		this.font = var4;
		this.fonts = new HashMap();
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
		this.cacheLoader = new WorldMapArchiveLoader(var1);
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field322.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		this.details = new HashMap(var8.length);

		for (int var9 = 0; var9 < var8.length; ++var9) {
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9]));
			WorldMapArea var11 = new WorldMapArea();
			var11.read(var10, var8[var9]);
			this.details.put(var11.getInternalName(), var11);
			if (var11.getIsMain()) {
				this.mainMapArea = var11;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field3984 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	public void method6696() {
		Players.method2274();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "2116125643"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapManager.method695(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); InterfaceParent.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field3978.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field3978.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						InterfaceParent.runScriptEvent(var14);
					}
				}

				this.field3978 = var11;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "69"
	)
	public void method6693(int var1, int var2, boolean var3, boolean var4) {
		long var5 = MilliClock.currentTimeMillis();
		this.method6525(var1, var2, var4, var5);
		if (!this.hasTarget() && (var4 || var3)) {
			if (var4) {
				this.field4005 = var1;
				this.field4006 = var2;
				this.field4014 = this.centerTileX;
				this.field3975 = this.centerTileY;
			}

			if (this.field4014 != -1) {
				int var7 = var1 - this.field4005;
				int var8 = var2 - this.field4006;
				this.setWorldMapPosition(this.field4014 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field3975, false);
			}
		} else {
			this.method6529();
		}

		if (var4) {
			this.field4007 = var5;
			this.field4008 = var1;
			this.field4009 = var2;
		}

	}

	@ObfuscatedName("p")
	void method6525(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				boolean var8 = Client.staffModLevel >= 2;
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) {
					GrandExchangeOffer.method191(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var9 = true;
					if (this.field4017) {
						int var10 = var1 - this.field4008;
						int var11 = var2 - this.field4009;
						if (var4 - this.field4007 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
							var9 = false;
						}
					}

					if (var9) {
						PacketBufferNode var12 = UserComparator4.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher);
						var12.packetBuffer.method5764(this.mouseCoord.packed());
						Client.packetWriter.addNode(var12);
						this.field4007 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "422650301"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class278.field3585 != null) {
			this.zoom = this.zoomTarget;
		} else {
			if (this.zoom < this.zoomTarget) {
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom);
			}

			if (this.zoom > this.zoomTarget) {
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2119991272"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) {
			int var1 = this.worldMapTargetX - this.centerTileX;
			int var2 = this.worldMapTargetY - this.centerTileY;
			if (var1 != 0) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true);
			if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "83"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		MilliClock.currentTimeMillis();
		if (var3) {
			this.method6529();
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1330915767"
	)
	final void method6529() {
		this.field4006 = -1;
		this.field4005 = -1;
		this.field3975 = -1;
		this.field4014 = -1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2089729451"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lad;",
		garbageValue = "-342923578"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator();

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapArea)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1486444716"
	)
	public void method6532(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field3984 || var4) {
			this.field3984 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1476612822"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lad;",
		garbageValue = "-434939978"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lad;I)V",
		garbageValue = "1435320921"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMapManager(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lad;I)V",
		garbageValue = "1169619542"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lad;Lhg;Lhg;ZB)V",
		garbageValue = "-3"
	)
	public void method6538(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) {
			if (this.currentMapArea == null || var1 != this.currentMapArea) {
				this.initializeWorldMapManager(var1);
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
				this.jump(var2.plane, var2.x, var2.y);
			} else {
				this.jump(var3.plane, var3.x, var3.y);
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "662676533"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 == null) {
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
			this.zoomTarget = this.zoom;
			this.field4018 = null;
			this.iconIterator = null;
			this.worldMapManager.clearIcons();
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "45"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var6);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		int var7 = this.cacheLoader.getPercentLoaded();
		if (var7 < 100) {
			this.drawLoading(var1, var2, var3, var4, var7);
		} else {
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
					return;
				}
			}

			if (this.flashingElements != null) {
				++this.flashCycle;
				if (this.flashCycle % this.cyclesPerFlash == 0) {
					this.flashCycle = 0;
					++this.flashCount;
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
					this.flashingElements = null;
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom));
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			boolean var10;
			if (!this.elementsDisabled) {
				var10 = false;
				if (var5 - this.field4016 > 100) {
					this.field4016 = var5;
					var10 = true;
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4027, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
			}

			this.method6603(var1, var2, var3, var4, var8, var9);
			var10 = Client.staffModLevel >= 2;
			if (var10 && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8;
			this.worldMapDisplayHeight = var9;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var6);
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1450598957"
	)
	boolean method6565(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field3988 != Client.field942) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var2 + var4 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "0"
	)
	void method6603(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class278.field3585 != null) {
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2);
			int var8 = var3 + 512;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)((float)var8 / var10);
			var9 = (int)((float)var9 / var10);
			int var11 = this.getDisplayX() - var5 / 2 - var7;
			int var12 = this.getDisplayY() - var6 / 2 - var7;
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			if (this.method6565(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new Sprite(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile;
				class278.field3585.method4490(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field3988 = Client.field942;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method6337(var13, var14, 192);
			} else {
				this.sprite.method6366(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192);
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "371539895"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
					return;
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2046053399"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-911619085"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-101273681"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1432703186"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) {
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) {
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) {
			return 50;
		} else if (3.0D == (double)this.zoomTarget) {
			return 75;
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-344269271"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2083683127"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lad;",
		garbageValue = "173267923"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator();

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (WorldMapArea)var2.next();
		} while(var3.getId() != var1);

		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "124476569"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "796383009"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-86"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1641941372"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2103537124"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "692721192"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "-1863746595"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1645904359"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1582823724"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1740193117"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-316454776"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2071944062"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-999392835"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "106"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1070811489"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			if (Client.WorldMapElement_get(var2) != null && Client.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(Client.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "8454016"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-74185669"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1502020559"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method6573();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-324596356"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
			if (Client.WorldMapElement_get(var3) != null && Client.WorldMapElement_get(var3).category == var1) {
				int var4 = Client.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method6573();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-10758"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "24518"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	void method6573() {
		this.field4027.clear();
		this.field4027.addAll(this.enabledElements);
		this.field4027.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-102"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapManager.method695(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = Client.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							ScriptEvent.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILhg;I)Lhg;",
		garbageValue = "-1210676807"
	)
	public Coord method6575(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
			return null;
		} else {
			HashMap var3 = this.worldMapManager.buildIcons();
			List var4 = (List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				AbstractWorldMapIcon var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2;
						}

						var8 = (AbstractWorldMapIcon)var7.next();
						int var9 = var8.coord2.x - var2.x;
						int var10 = var8.coord2.y - var2.y;
						var11 = var9 * var9 + var10 * var10;
						if (var11 == 0) {
							return var8.coord2;
						}
					} while(var11 >= var6 && var5 != null);

					var5 = var8;
					var6 = var11;
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IILhg;Lhg;I)V",
		garbageValue = "346883599"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent();
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
		var5.setArgs(new Object[]{var6});
		switch(var1) {
		case 1008:
			var5.setType(10);
			break;
		case 1009:
			var5.setType(11);
			break;
		case 1010:
			var5.setType(12);
			break;
		case 1011:
			var5.setType(13);
			break;
		case 1012:
			var5.setType(14);
		}

		InterfaceParent.runScriptEvent(var5);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Laf;",
		garbageValue = "-1116444098"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapManager.buildIcons();
			this.field4018 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field4018.addAll(var3);
			}

			this.iconIterator = this.field4018.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Laf;",
		garbageValue = "-42"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) {
			return null;
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) {
					return null;
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next();
			} while(var1.getElement() == -1);

			return var1;
		}
	}
}
