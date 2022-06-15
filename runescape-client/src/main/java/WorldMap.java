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

@ObfuscatedName("oe")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("r")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("k")
	@Export("details")
	HashMap details;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	WorldMapArea field4550;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1280824469
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -310067487
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1880779153
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -723853881
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("d")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ad")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -562089369
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1885245943
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1139632457
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1859750739
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 847440549
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 415648465
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("ae")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("aj")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1913006969
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -998053929
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1595444339
	)
	int field4546;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1517937465
	)
	int field4547;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -510236727
	)
	int field4539;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 376848179
	)
	int field4567;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -999650809358427355L
	)
	long field4534;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -410641503
	)
	int field4551;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 597430499
	)
	int field4552;
	@ObfuscatedName("ai")
	boolean field4514;
	@ObfuscatedName("aw")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("au")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("aa")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ay")
	HashSet field4561;
	@ObfuscatedName("as")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1332813641
	)
	int field4559;
	@ObfuscatedName("bp")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bf")
	List field4548;
	@ObfuscatedName("bg")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("br")
	HashSet field4531;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bq")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 781783389
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1609384449
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -15655745
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -772484837
	)
	int field4560;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11; // L: 46
		fontNameVerdana13 = FontName.FontName_verdana13; // L: 47
		fontNameVerdana15 = FontName.FontName_verdana15; // L: 48
	}

	public WorldMap() {
		this.worldMapTargetX = -1; // L: 60
		this.worldMapTargetY = -1; // L: 61
		this.worldMapDisplayWidth = -1; // L: 64
		this.worldMapDisplayHeight = -1; // L: 65
		this.worldMapDisplayX = -1; // L: 66
		this.worldMapDisplayY = -1; // L: 67
		this.maxFlashCount = 3; // L: 68
		this.cyclesPerFlash = 50; // L: 69
		this.perpetualFlash = false; // L: 70
		this.flashingElements = null; // L: 71
		this.flashCount = -1; // L: 72
		this.flashCycle = -1; // L: 73
		this.field4546 = -1; // L: 74
		this.field4547 = -1; // L: 75
		this.field4539 = -1; // L: 76
		this.field4567 = -1; // L: 77
		this.field4514 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4561 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4559 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4531 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4560 = -1; // L: 101
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;Llh;Lmt;Ljava/util/HashMap;[Lqu;B)V",
		garbageValue = "35"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 105
		this.WorldMap_archive = var1; // L: 106
		this.WorldMap_geographyArchive = var2; // L: 107
		this.WorldMap_groundArchive = var3; // L: 108
		this.font = var4; // L: 109
		this.fonts = new HashMap(); // L: 110
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 111
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 113
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 114
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2867.name); // L: 115
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 116
		this.details = new HashMap(var8.length); // L: 117

		for (int var9 = 0; var9 < var8.length; ++var9) { // L: 118
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9])); // L: 119
			WorldMapArea var11 = new WorldMapArea(); // L: 120
			var11.read(var10, var8[var9]); // L: 121
			this.details.put(var11.getInternalName(), var11); // L: 122
			if (var11.getIsMain()) { // L: 123
				this.mainMapArea = var11; // L: 124
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 127
		this.field4550 = null; // L: 128
	} // L: 129

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2022922542"
	)
	public void method7182() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 133
	} // L: 135

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "885172006"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method4819(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); BoundaryObject.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4531.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4531.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						BoundaryObject.runScriptEvent(var14); // L: 174
					}
				}

				this.field4531 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIZZS)V",
		garbageValue = "13586"
	)
	public void method7307(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label40: {
			var5 = class115.method2692(); // L: 182
			this.method7217(var1, var2, var4, var5); // L: 183
			if (!this.hasTarget() && (var4 || var3)) { // L: 185
				boolean var7 = Client.clickedWidget != null; // L: 188
				if (!var7) { // L: 190
					if (var4) { // L: 191
						this.field4539 = var1; // L: 192
						this.field4567 = var2; // L: 193
						this.field4546 = this.centerTileX; // L: 194
						this.field4547 = this.centerTileY; // L: 195
					}

					if (this.field4546 != -1) { // L: 197
						int var8 = var1 - this.field4539; // L: 198
						int var9 = var2 - this.field4567; // L: 199
						this.setWorldMapPosition(this.field4546 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4547, false); // L: 200
					}
					break label40;
				}
			}

			this.method7189(); // L: 205
		}

		if (var4) { // L: 207
			this.field4534 = var5; // L: 208
			this.field4551 = var1; // L: 209
			this.field4552 = var2; // L: 210
		}

	} // L: 212

	@ObfuscatedName("j")
	void method7217(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 215
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 216
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 217
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 218
			if (this.mouseCoord != null && var3) { // L: 219
				boolean var8 = Client.staffModLevel >= 2; // L: 222
				int var10;
				int var11;
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 224
					int var14 = this.mouseCoord.x; // L: 225
					var10 = this.mouseCoord.y; // L: 226
					var11 = this.mouseCoord.plane; // L: 227
					PacketBufferNode var12 = EnumComposition.getPacketBufferNode(ClientPacket.field2966, Client.packetWriter.isaacCipher); // L: 230
					var12.packetBuffer.method7763(var11); // L: 231
					var12.packetBuffer.writeIntME(var10); // L: 232
					var12.packetBuffer.method7760(0); // L: 233
					var12.packetBuffer.writeIntME(var14); // L: 234
					Client.packetWriter.addNode(var12); // L: 235
				} else {
					boolean var9 = true; // L: 239
					if (this.field4514) { // L: 240
						var10 = var1 - this.field4551; // L: 241
						var11 = var2 - this.field4552; // L: 242
						if (var4 - this.field4534 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 243
							var9 = false; // L: 244
						}
					}

					if (var9) { // L: 247
						PacketBufferNode var13 = EnumComposition.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher); // L: 248
						var13.packetBuffer.method7783(this.mouseCoord.packed()); // L: 249
						Client.packetWriter.addNode(var13); // L: 250
						this.field4534 = 0L; // L: 251
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 256
		}

	} // L: 257

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-454245958"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (UrlRequester.field1362 != null) { // L: 260
			this.zoom = this.zoomTarget; // L: 261
		} else {
			if (this.zoom < this.zoomTarget) { // L: 264
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 265
			}

			if (this.zoom > this.zoomTarget) { // L: 267
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 268
			}

		}
	} // L: 262 270

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1467959919"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 273
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 276
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 277
			if (var1 != 0) { // L: 278
				var1 /= Math.min(8, Math.abs(var1)); // L: 279
			}

			if (var2 != 0) { // L: 281
				var2 /= Math.min(8, Math.abs(var2)); // L: 282
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 284
			if (this.centerTileX == this.worldMapTargetX && this.worldMapTargetY == this.centerTileY) { // L: 285
				this.worldMapTargetX = -1; // L: 286
				this.worldMapTargetY = -1; // L: 287
			}

		}
	} // L: 274 289

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "715686977"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 292
		this.centerTileY = var2; // L: 293
		class115.method2692(); // L: 294
		if (var3) {
			this.method7189(); // L: 295
		}

	} // L: 296

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "119146039"
	)
	final void method7189() {
		this.field4567 = -1; // L: 299
		this.field4539 = -1; // L: 300
		this.field4547 = -1; // L: 301
		this.field4546 = -1; // L: 302
	} // L: 303

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-352879133"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 306
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lhg;",
		garbageValue = "-123"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 310

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 318
			}

			var5 = (WorldMapArea)var4.next(); // L: 311
		} while(!var5.containsCoord(var1, var2, var3)); // L: 313

		return var5; // L: 314
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1521542752"
	)
	public void method7192(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 322
		if (var5 == null) { // L: 323
			if (!var4) { // L: 324
				return; // L: 327
			}

			var5 = this.mainMapArea; // L: 325
		}

		boolean var6 = false; // L: 329
		if (var5 != this.field4550 || var4) { // L: 330
			this.field4550 = var5; // L: 331
			this.setCurrentMapArea(var5); // L: 332
			var6 = true; // L: 333
		}

		if (var6 || var4) { // L: 335
			this.jump(var1, var2, var3); // L: 336
		}

	} // L: 338

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1883142675"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 341
		if (var2 != null) { // L: 342
			this.setCurrentMapArea(var2); // L: 343
		}

	} // L: 345

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-126"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 348 349 351
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "2042436529"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 355
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "-1953611759"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 359
			this.initializeWorldMapManager(var1); // L: 362
			this.jump(-1, -1, -1); // L: 363
		}
	} // L: 360 364

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "254842140"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 367
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 368
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 369
	} // L: 370

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lhg;Lkd;Lkd;ZI)V",
		garbageValue = "812023779"
	)
	public void method7292(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 373
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 376
				this.initializeWorldMapManager(var1); // L: 377
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 379
				this.jump(var2.plane, var2.x, var2.y); // L: 383
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 380
			}

		}
	} // L: 374 385

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-462860729"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 388
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 391
			if (var4 == null) { // L: 392
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 393
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 395
			this.worldMapTargetX = -1; // L: 396
			this.worldMapTargetY = -1; // L: 397
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 398
			this.zoomTarget = this.zoom; // L: 399
			this.field4548 = null; // L: 400
			this.iconIterator = null; // L: 401
			this.worldMapManager.clearIcons(); // L: 402
		}
	} // L: 389 403

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "0"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 406
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 407
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 408
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 409
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 410
		if (var7 < 100) { // L: 411
			this.drawLoading(var1, var2, var3, var4, var7); // L: 412
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 415
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 416
				if (!this.worldMapManager.isLoaded()) { // L: 417
					return; // L: 418
				}
			}

			if (this.flashingElements != null) { // L: 421
				++this.flashCycle; // L: 422
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 423
					this.flashCycle = 0; // L: 424
					++this.flashCount; // L: 425
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 427
					this.flashingElements = null; // L: 428
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 431
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 432
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 433
			boolean var10;
			if (!this.elementsDisabled) { // L: 434
				var10 = false; // L: 435
				if (var5 - this.field4559 > 100) { // L: 436
					this.field4559 = var5; // L: 437
					var10 = true; // L: 438
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4561, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 440
			}

			this.method7202(var1, var2, var3, var4, var8, var9); // L: 442
			var10 = Client.staffModLevel >= 2; // L: 445
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 447
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 448
			this.worldMapDisplayHeight = var9; // L: 449
			this.worldMapDisplayX = var1; // L: 450
			this.worldMapDisplayY = var2; // L: 451
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 452
		}
	} // L: 413 453

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "39"
	)
	boolean method7201(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 456
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 457
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 458
				return true;
			} else if (this.field4560 != Client.field770) { // L: 459
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 460
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 461
			} else {
				return true; // L: 462
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "273043499"
	)
	void method7202(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (UrlRequester.field1362 != null) { // L: 466
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 467
			int var8 = var3 + 512; // L: 468
			int var9 = var4 + 512; // L: 469
			float var10 = 1.0F; // L: 470
			var8 = (int)((float)var8 / var10); // L: 471
			var9 = (int)((float)var9 / var10); // L: 472
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 473
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 474
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 475
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 476
			if (this.method7201(var8, var9, var13, var14, var3, var4)) { // L: 477
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 478
					Arrays.fill(this.sprite.pixels, 0); // L: 481
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 479
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 482
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 483
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 484
				UrlRequester.field1362.method6046(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 485
				this.field4560 = Client.field770; // L: 486
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 487
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 488
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 490
			if (1.0F == var10) { // L: 491
				this.sprite.method8171(var13, var14, 192); // L: 492
			} else {
				this.sprite.method8155(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192); // L: 495
			}
		}

	} // L: 498

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-9"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 501
			if (!this.worldMapManager.isLoaded()) { // L: 504
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 505
				if (!this.worldMapManager.isLoaded()) { // L: 506
					return; // L: 507
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 510
		}
	} // L: 502 511

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1059944700"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 514
	} // L: 515

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-884095682"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 518
		int var7 = var3 / 2 + var1; // L: 519
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 520
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 521
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 522
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 523
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 524
	} // L: 525

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1978346324"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 528
			return 1.0F;
		} else if (var1 == 37) { // L: 529
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 530
		} else if (var1 == 75) { // L: 531
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 532 533
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1581963366"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 537
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 538
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 539
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) { // L: 540
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 541 542
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 546
	} // L: 547

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1992211650"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 550
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lhg;",
		garbageValue = "488070761"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 554

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 562
			}

			var3 = (WorldMapArea)var2.next(); // L: 555
		} while(var3.getId() != var1); // L: 557

		return var3; // L: 558
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2000292746"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 566
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 569
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 570
		}
	} // L: 567 571

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1697646850"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 574
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 577
			this.worldMapTargetX = -1; // L: 578
			this.worldMapTargetY = -1; // L: 579
		}
	} // L: 575 580

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "49"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 583
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 586
			if (var4 != null) { // L: 587
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 588
			}

		}
	} // L: 584 590

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "16"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 593
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 596
			if (var4 != null) { // L: 597
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 598
			}

		}
	} // L: 594 600

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1624577008"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 603 604 606
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1104957899"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 610 611 613
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lkd;",
		garbageValue = "-42"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 617 618 620
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1921682831"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 624
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1280379372"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 628
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-43"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 632
			this.maxFlashCount = var1; // L: 633
		}

	} // L: 635

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "753498595"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 638
	} // L: 639

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2030876969"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 642
			this.cyclesPerFlash = var1; // L: 643
		}

	} // L: 645

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-563581056"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 648
	} // L: 649

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1949039555"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 652
	} // L: 653

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1359240412"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 656
		this.flashingElements.add(var1); // L: 657
		this.flashCount = 0; // L: 658
		this.flashCycle = 0; // L: 659
	} // L: 660

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1059835143"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 663
		this.flashCount = 0; // L: 664
		this.flashCycle = 0; // L: 665

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 666
			if (class432.WorldMapElement_get(var2) != null && class432.WorldMapElement_get(var2).category == var1) { // L: 667 670
				this.flashingElements.add(class432.WorldMapElement_get(var2).objectId); // L: 671
			}
		}

	} // L: 674

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1504784158"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 677
	} // L: 678

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "6222"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 681
	} // L: 682

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "230935257"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 685
			this.enabledElements.add(var1); // L: 686
		} else {
			this.enabledElements.remove(var1); // L: 689
		}

		this.method7233(); // L: 691
	} // L: 692

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1347113189"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 695
			this.enabledCategories.add(var1); // L: 696
		} else {
			this.enabledCategories.remove(var1); // L: 699
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 701
			if (class432.WorldMapElement_get(var3) != null && class432.WorldMapElement_get(var3).category == var1) { // L: 702 705
				int var4 = class432.WorldMapElement_get(var3).objectId; // L: 706
				if (!var2) { // L: 707
					this.enabledElementIds.add(var4); // L: 708
				} else {
					this.enabledElementIds.remove(var4); // L: 711
				}
			}
		}

		this.method7233(); // L: 715
	} // L: 716

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "51"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 719
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "74"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 723
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-104"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 727
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "493716456"
	)
	void method7233() {
		this.field4561.clear(); // L: 731
		this.field4561.addAll(this.enabledElements); // L: 732
		this.field4561.addAll(this.enabledElementIds); // L: 733
	} // L: 734

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1554810691"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 737
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 740
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 741
			List var9 = this.worldMapManager.method4819(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 742
			if (!var9.isEmpty()) { // L: 743
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 746
						return; // L: 762
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 747
					WorldMapElement var12 = class432.WorldMapElement_get(var11.getElement()); // L: 749
					var13 = false; // L: 750

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 751
						if (var12.menuActions[var14] != null) { // L: 752
							class4.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 753
							var13 = true; // L: 754
						}
					}
				} while(!var13); // L: 757

			}
		}
	} // L: 738 744 758

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILkd;S)Lkd;",
		garbageValue = "-7526"
	)
	public Coord method7235(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 765
			return null; // L: 766
		} else if (!this.worldMapManager.isLoaded()) { // L: 768
			return null; // L: 769
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 771
			return null; // L: 772
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 774
			List var4 = (List)var3.get(var1); // L: 775
			if (var4 != null && !var4.isEmpty()) { // L: 776
				AbstractWorldMapIcon var5 = null; // L: 779
				int var6 = -1; // L: 780
				Iterator var7 = var4.iterator(); // L: 781

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 796
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 782
						int var9 = var8.coord2.x - var2.x; // L: 784
						int var10 = var8.coord2.y - var2.y; // L: 785
						var11 = var9 * var9 + var10 * var10; // L: 786
						if (var11 == 0) { // L: 787
							return var8.coord2; // L: 788
						}
					} while(var11 >= var6 && var5 != null); // L: 790

					var5 = var8; // L: 791
					var6 = var11; // L: 792
				}
			} else {
				return null; // L: 777
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IILkd;Lkd;I)V",
		garbageValue = "-880651836"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 800
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 801
		var5.setArgs(new Object[]{var6}); // L: 802
		switch(var1) { // L: 803
		case 1008:
			var5.setType(10); // L: 826
			break;
		case 1009:
			var5.setType(11); // L: 811
			break; // L: 812
		case 1010:
			var5.setType(12); // L: 816
			break; // L: 817
		case 1011:
			var5.setType(13); // L: 821
			break; // L: 822
		case 1012:
			var5.setType(14); // L: 806
		}

		BoundaryObject.runScriptEvent(var5); // L: 830
	} // L: 831

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-1835543472"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 834
			return null; // L: 835
		} else if (!this.worldMapManager.isLoaded()) { // L: 837
			return null; // L: 838
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 840
			this.field4548 = new LinkedList(); // L: 841
			Iterator var2 = var1.values().iterator(); // L: 842

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 843
				this.field4548.addAll(var3); // L: 845
			}

			this.iconIterator = this.field4548.iterator(); // L: 848
			return this.iconNext(); // L: 849
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Lim;",
		garbageValue = "-29"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 853
			return null; // L: 854
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 856
					return null; // L: 862
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 857
			} while(var1.getElement() == -1); // L: 858

			return var1; // L: 859
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-110608054"
	)
	static final void method7376() {
		Client.field607 = 0; // L: 5419
		int var0 = (class101.localPlayer.x >> 7) + class28.baseX; // L: 5420
		int var1 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY; // L: 5421
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5422
			Client.field607 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5423
			Client.field607 = 1;
		}

		if (Client.field607 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5424
			Client.field607 = 0;
		}

	} // L: 5425

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-976677354"
	)
	static final void method7377(int var0, int var1, boolean var2) {
		if (!var2 || var0 != GrandExchangeOffer.field4070 || ApproximateRouteStrategy.field466 != var1) { // L: 5621
			GrandExchangeOffer.field4070 = var0; // L: 5624
			ApproximateRouteStrategy.field466 = var1; // L: 5625
			HealthBarUpdate.updateGameState(25); // L: 5626
			SequenceDefinition.drawLoadingMessage("Loading - please wait.", true); // L: 5627
			int var3 = class28.baseX; // L: 5628
			int var4 = WorldMapLabelSize.baseY; // L: 5629
			class28.baseX = (var0 - 6) * 8; // L: 5630
			WorldMapLabelSize.baseY = (var1 - 6) * 8; // L: 5631
			int var5 = class28.baseX - var3; // L: 5632
			int var6 = WorldMapLabelSize.baseY - var4; // L: 5633
			var3 = class28.baseX; // L: 5634
			var4 = WorldMapLabelSize.baseY; // L: 5635

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5636
				NPC var19 = Client.npcs[var7]; // L: 5637
				if (var19 != null) { // L: 5638
					for (var9 = 0; var9 < 10; ++var9) { // L: 5639
						var10000 = var19.pathX; // L: 5640
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5641
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5643
					var19.y -= var6 * 128; // L: 5644
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5647
				Player var22 = Client.players[var7]; // L: 5648
				if (var22 != null) { // L: 5649
					for (var9 = 0; var9 < 10; ++var9) { // L: 5650
						var10000 = var22.pathX; // L: 5651
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5652
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5654
					var22.y -= var6 * 128; // L: 5655
				}
			}

			byte var20 = 0; // L: 5658
			byte var8 = 104; // L: 5659
			byte var21 = 1; // L: 5660
			if (var5 < 0) { // L: 5661
				var20 = 103; // L: 5662
				var8 = -1; // L: 5663
				var21 = -1; // L: 5664
			}

			byte var10 = 0; // L: 5666
			byte var11 = 104; // L: 5667
			byte var12 = 1; // L: 5668
			if (var6 < 0) { // L: 5669
				var10 = 103; // L: 5670
				var11 = -1; // L: 5671
				var12 = -1; // L: 5672
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5674
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5675
					int var15 = var5 + var13; // L: 5676
					int var16 = var14 + var6; // L: 5677

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5678
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5679
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5680
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5684 5685 5689
				var18.x -= var5; // L: 5686
				var18.y -= var6; // L: 5687
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5688
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5691
				Client.destinationX -= var5; // L: 5692
				Client.destinationY -= var6; // L: 5693
			}

			Client.soundEffectCount = 0; // L: 5695
			Client.isCameraLocked = false; // L: 5696
			class18.cameraX -= var5 << 7; // L: 5697
			class228.cameraZ -= var6 << 7; // L: 5698
			InterfaceParent.oculusOrbFocalPointX -= var5 << 7; // L: 5699
			class141.oculusOrbFocalPointY -= var6 << 7; // L: 5700
			Client.field725 = -1; // L: 5701
			Client.graphicsObjects.clear(); // L: 5702
			Client.projectiles.clear(); // L: 5703

			for (var14 = 0; var14 < 4; ++var14) { // L: 5704
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5622 5705
}
