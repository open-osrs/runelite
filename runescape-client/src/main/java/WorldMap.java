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

@ObfuscatedName("on")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("j")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("s")
	@Export("details")
	HashMap details;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	WorldMapArea field4476;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 408955541
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1426073287
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 332929337
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -236036255
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("i")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ac")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1419638859
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1579840621
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1167803945
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2066122969
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 517821217
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 826780571
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("ae")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ab")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 3395265
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 472385181
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -557110831
	)
	int field4495;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1015816733
	)
	int field4496;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1486339413
	)
	int field4497;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1300251727
	)
	int field4498;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -3497508433383023727L
	)
	long field4499;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 329780085
	)
	int field4500;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1671130161
	)
	int field4501;
	@ObfuscatedName("am")
	boolean field4464;
	@ObfuscatedName("az")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ag")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("af")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ap")
	HashSet field4507;
	@ObfuscatedName("ai")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -889165185
	)
	int field4470;
	@ObfuscatedName("bl")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("be")
	List field4519;
	@ObfuscatedName("bt")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("ba")
	HashSet field4460;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bq")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2110734943
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1052523623
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1982945111
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1453677139
	)
	int field4520;

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
		this.field4495 = -1; // L: 74
		this.field4496 = -1; // L: 75
		this.field4497 = -1; // L: 76
		this.field4498 = -1; // L: 77
		this.field4464 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4507 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4470 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4460 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4520 = -1; // L: 101
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;Llq;Lmr;Ljava/util/HashMap;[Lqx;B)V",
		garbageValue = "16"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2849.name); // L: 115
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
		this.field4476 = null; // L: 128
	} // L: 129

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1192677755"
	)
	public void method7303() {
		class140.method2985(); // L: 132
	} // L: 133

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "1"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 136
			this.smoothZoom(); // L: 139
			this.scrollToTarget(); // L: 140
			if (var3) { // L: 141
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 144
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 145
				List var10 = this.worldMapManager.method4806(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 146
				HashSet var11 = new HashSet(); // L: 147

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class1.runScriptEvent(var14)) { // L: 148 161
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 149
					var11.add(var13); // L: 151
					var14 = new ScriptEvent(); // L: 152
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 153
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 154
					if (this.field4460.contains(var13)) { // L: 155
						var14.setType(17); // L: 156
					} else {
						var14.setType(15); // L: 159
					}
				}

				var12 = this.field4460.iterator(); // L: 164

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 165
					if (!var11.contains(var13)) { // L: 167
						var14 = new ScriptEvent(); // L: 168
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 169
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 170
						var14.setType(16); // L: 171
						class1.runScriptEvent(var14); // L: 172
					}
				}

				this.field4460 = var11; // L: 176
			}
		}
	} // L: 137 142 177

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-42282906"
	)
	public void method7305(int var1, int var2, boolean var3, boolean var4) {
		long var5 = WorldMapSprite.method4989(); // L: 180
		this.method7315(var1, var2, var4, var5); // L: 181
		if (this.hasTarget() || !var4 && !var3) { // L: 182
			this.method7499(); // L: 196
		} else {
			if (var4) { // L: 183
				this.field4497 = var1; // L: 184
				this.field4498 = var2; // L: 185
				this.field4495 = this.centerTileX; // L: 186
				this.field4496 = this.centerTileY; // L: 187
			}

			if (this.field4495 != -1) { // L: 189
				int var7 = var1 - this.field4497; // L: 190
				int var8 = var2 - this.field4498; // L: 191
				this.setWorldMapPosition(this.field4495 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4496, false); // L: 192
			}
		}

		if (var4) { // L: 198
			this.field4499 = var5; // L: 199
			this.field4500 = var1; // L: 200
			this.field4501 = var2; // L: 201
		}

	} // L: 203

	@ObfuscatedName("l")
	void method7315(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 206
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 207
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 208
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 209
			if (this.mouseCoord != null && var3) { // L: 210
				boolean var8 = Client.staffModLevel >= 2; // L: 213
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 215
					class392.method7191(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 216
				} else {
					boolean var9 = true; // L: 219
					if (this.field4464) { // L: 220
						int var10 = var1 - this.field4500; // L: 221
						int var11 = var2 - this.field4501; // L: 222
						if (var4 - this.field4499 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 223
							var9 = false; // L: 224
						}
					}

					if (var9) { // L: 227
						PacketBufferNode var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher); // L: 228
						var12.packetBuffer.writeInt(this.mouseCoord.packed()); // L: 229
						Client.packetWriter.addNode(var12); // L: 230
						this.field4499 = 0L; // L: 231
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 236
		}

	} // L: 237

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "403257256"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class340.field4109 != null) { // L: 240
			this.zoom = this.zoomTarget; // L: 241
		} else {
			if (this.zoom < this.zoomTarget) { // L: 244
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 245
			}

			if (this.zoom > this.zoomTarget) { // L: 247
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 248
			}

		}
	} // L: 242 250

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 253
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 256
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 257
			if (var1 != 0) { // L: 258
				var1 /= Math.min(8, Math.abs(var1)); // L: 259
			}

			if (var2 != 0) { // L: 261
				var2 /= Math.min(8, Math.abs(var2)); // L: 262
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 264
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 265
				this.worldMapTargetX = -1; // L: 266
				this.worldMapTargetY = -1; // L: 267
			}

		}
	} // L: 254 269

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1898905069"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 272
		this.centerTileY = var2; // L: 273
		WorldMapSprite.method4989(); // L: 274
		if (var3) {
			this.method7499(); // L: 275
		}

	} // L: 276

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1193199774"
	)
	final void method7499() {
		this.field4498 = -1; // L: 279
		this.field4497 = -1; // L: 280
		this.field4496 = -1; // L: 281
		this.field4495 = -1; // L: 282
	} // L: 283

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1728836815"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 286
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lhw;",
		garbageValue = "2133488552"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 290

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 298
			}

			var5 = (WorldMapArea)var4.next(); // L: 291
		} while(!var5.containsCoord(var1, var2, var3)); // L: 293

		return var5; // L: 294
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "660135431"
	)
	public void method7313(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 302
		if (var5 == null) { // L: 303
			if (!var4) { // L: 304
				return; // L: 307
			}

			var5 = this.mainMapArea; // L: 305
		}

		boolean var6 = false; // L: 309
		if (var5 != this.field4476 || var4) { // L: 310
			this.field4476 = var5; // L: 311
			this.setCurrentMapArea(var5); // L: 312
			var6 = true; // L: 313
		}

		if (var6 || var4) { // L: 315
			this.jump(var1, var2, var3); // L: 316
		}

	} // L: 318

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1503903829"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 321
		if (var2 != null) { // L: 322
			this.setCurrentMapArea(var2); // L: 323
		}

	} // L: 325

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1936294730"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 328 329 331
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "-1794473827"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 335
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhw;B)V",
		garbageValue = "3"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 339
			this.initializeWorldMapManager(var1); // L: 342
			this.jump(-1, -1, -1); // L: 343
		}
	} // L: 340 344

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)V",
		garbageValue = "-525711858"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 347
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 348
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 349
	} // L: 350

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lhw;Lko;Lko;ZI)V",
		garbageValue = "23223639"
	)
	public void method7319(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 353
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 356
				this.initializeWorldMapManager(var1); // L: 357
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 359
				this.jump(var2.plane, var2.x, var2.y); // L: 363
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 360
			}

		}
	} // L: 354 365

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "122"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 368
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 371
			if (var4 == null) { // L: 372
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 373
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 375
			this.worldMapTargetX = -1; // L: 376
			this.worldMapTargetY = -1; // L: 377
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 378
			this.zoomTarget = this.zoom; // L: 379
			this.field4519 = null; // L: 380
			this.iconIterator = null; // L: 381
			this.worldMapManager.clearIcons(); // L: 382
		}
	} // L: 369 383

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2101106312"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 386
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 387
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 388
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 389
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 390
		if (var7 < 100) { // L: 391
			this.drawLoading(var1, var2, var3, var4, var7); // L: 392
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 395
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 396
				if (!this.worldMapManager.isLoaded()) { // L: 397
					return; // L: 398
				}
			}

			if (this.flashingElements != null) { // L: 401
				++this.flashCycle; // L: 402
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 403
					this.flashCycle = 0; // L: 404
					++this.flashCount; // L: 405
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 407
					this.flashingElements = null; // L: 408
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 411
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 412
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 413
			boolean var10;
			if (!this.elementsDisabled) { // L: 414
				var10 = false; // L: 415
				if (var5 - this.field4470 > 100) { // L: 416
					this.field4470 = var5; // L: 417
					var10 = true; // L: 418
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4507, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 420
			}

			this.method7323(var1, var2, var3, var4, var8, var9); // L: 422
			var10 = Client.staffModLevel >= 2; // L: 425
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 427
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 428
			this.worldMapDisplayHeight = var9; // L: 429
			this.worldMapDisplayX = var1; // L: 430
			this.worldMapDisplayY = var2; // L: 431
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 432
		}
	} // L: 393 433

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "569446067"
	)
	boolean method7358(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 436
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 437
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 438
				return true;
			} else if (this.field4520 != Client.field764) { // L: 439
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 440
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 441
			} else {
				return true; // L: 442
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1981206171"
	)
	void method7323(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class340.field4109 != null) { // L: 446
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 447
			int var8 = var3 + 512; // L: 448
			int var9 = var4 + 512; // L: 449
			float var10 = 1.0F; // L: 450
			var8 = (int)((float)var8 / var10); // L: 451
			var9 = (int)((float)var9 / var10); // L: 452
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 453
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 454
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 455
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 456
			if (this.method7358(var8, var9, var13, var14, var3, var4)) { // L: 457
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 458
					Arrays.fill(this.sprite.pixels, 0); // L: 461
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 459
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 462
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 463
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 464
				class340.field4109.method6082(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 465
				this.field4520 = Client.field764; // L: 466
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 467
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 468
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 470
			if (var10 == 1.0F) { // L: 471
				this.sprite.method8198(var13, var14, 192); // L: 472
			} else {
				this.sprite.method8242(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 475
			}
		}

	} // L: 478

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "239687024"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 481
			if (!this.worldMapManager.isLoaded()) { // L: 484
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 485
				if (!this.worldMapManager.isLoaded()) { // L: 486
					return; // L: 487
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 490
		}
	} // L: 482 491

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 494
	} // L: 495

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-552636091"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 498
		int var7 = var3 / 2 + var1; // L: 499
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 500
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 501
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 502
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 503
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 504
	} // L: 505

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "1"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 508
			return 1.0F;
		} else if (var1 == 37) { // L: 509
			return 1.5F;
		} else if (var1 == 50) { // L: 510
			return 2.0F;
		} else if (var1 == 75) { // L: 511
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 512 513
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1559529721"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 517
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 518
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 519
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 520
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 521 522
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1909569492"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 526
	} // L: 527

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "71230720"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 530
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "-1379309819"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 534

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 542
			}

			var3 = (WorldMapArea)var2.next(); // L: 535
		} while(var3.getId() != var1); // L: 537

		return var3; // L: 538
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-33"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 546
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 549
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 550
		}
	} // L: 547 551

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1498726313"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 554
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 557
			this.worldMapTargetX = -1; // L: 558
			this.worldMapTargetY = -1; // L: 559
		}
	} // L: 555 560

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-648258167"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 563
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 566
			if (var4 != null) { // L: 567
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 568
			}

		}
	} // L: 564 570

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1321495201"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 573
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 576
			if (var4 != null) { // L: 577
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 578
			}

		}
	} // L: 574 580

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-637373299"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 583 584 586
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565015812"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 590 591 593
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-505137213"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 597 598 600
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275514917"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 604
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 608
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "996304193"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 612
			this.maxFlashCount = var1; // L: 613
		}

	} // L: 615

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "52"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 618
	} // L: 619

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1101317331"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 622
			this.cyclesPerFlash = var1; // L: 623
		}

	} // L: 625

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 628
	} // L: 629

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2136197333"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 632
	} // L: 633

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1705535166"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 636
		this.flashingElements.add(var1); // L: 637
		this.flashCount = 0; // L: 638
		this.flashCycle = 0; // L: 639
	} // L: 640

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2124527614"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 643
		this.flashCount = 0; // L: 644
		this.flashCycle = 0; // L: 645

		for (int var2 = 0; var2 < class132.WorldMapElement_count; ++var2) { // L: 646
			if (class19.WorldMapElement_get(var2) != null && class19.WorldMapElement_get(var2).category == var1) { // L: 647 650
				this.flashingElements.add(class19.WorldMapElement_get(var2).objectId); // L: 651
			}
		}

	} // L: 654

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "591336020"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 657
	} // L: 658

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-73"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 661
	} // L: 662

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1468812142"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 665
			this.enabledElements.add(var1); // L: 666
		} else {
			this.enabledElements.remove(var1); // L: 669
		}

		this.method7354(); // L: 671
	} // L: 672

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "83"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 675
			this.enabledCategories.add(var1); // L: 676
		} else {
			this.enabledCategories.remove(var1); // L: 679
		}

		for (int var3 = 0; var3 < class132.WorldMapElement_count; ++var3) { // L: 681
			if (class19.WorldMapElement_get(var3) != null && class19.WorldMapElement_get(var3).category == var1) { // L: 682 685
				int var4 = class19.WorldMapElement_get(var3).objectId; // L: 686
				if (!var2) { // L: 687
					this.enabledElementIds.add(var4); // L: 688
				} else {
					this.enabledElementIds.remove(var4); // L: 691
				}
			}
		}

		this.method7354(); // L: 695
	} // L: 696

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "197493966"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 699
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2134196249"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 703
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-62"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 707
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "913012823"
	)
	void method7354() {
		this.field4507.clear(); // L: 711
		this.field4507.addAll(this.enabledElements); // L: 712
		this.field4507.addAll(this.enabledElementIds); // L: 713
	} // L: 714

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1822071374"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 717
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 720
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 721
			List var9 = this.worldMapManager.method4806(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 722
			if (!var9.isEmpty()) { // L: 723
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 726
						return; // L: 742
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 727
					WorldMapElement var12 = class19.WorldMapElement_get(var11.getElement()); // L: 729
					var13 = false; // L: 730

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 731
						if (var12.menuActions[var14] != null) { // L: 732
							SecureRandomFuture.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 733
							var13 = true; // L: 734
						}
					}
				} while(!var13); // L: 737

			}
		}
	} // L: 718 724 738

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILko;I)Lko;",
		garbageValue = "-733665636"
	)
	public Coord method7342(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 745
			return null; // L: 746
		} else if (!this.worldMapManager.isLoaded()) { // L: 748
			return null; // L: 749
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 751
			return null; // L: 752
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 754
			List var4 = (List)var3.get(var1); // L: 755
			if (var4 != null && !var4.isEmpty()) { // L: 756
				AbstractWorldMapIcon var5 = null; // L: 759
				int var6 = -1; // L: 760
				Iterator var7 = var4.iterator(); // L: 761

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) { // L: 775
							return var5.coord2; // L: 776
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 762
						int var9 = var8.coord2.x - var2.x; // L: 764
						int var10 = var8.coord2.y - var2.y; // L: 765
						var11 = var10 * var10 + var9 * var9; // L: 766
						if (var11 == 0) { // L: 767
							return var8.coord2; // L: 768
						}
					} while(var11 >= var6 && var5 != null); // L: 770

					var5 = var8; // L: 771
					var6 = var11; // L: 772
				}
			} else {
				return null; // L: 757
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IILko;Lko;S)V",
		garbageValue = "-2529"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 780
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 781
		var5.setArgs(new Object[]{var6}); // L: 782
		switch(var1) { // L: 783
		case 1008:
			var5.setType(10); // L: 786
			break;
		case 1009:
			var5.setType(11); // L: 801
			break; // L: 802
		case 1010:
			var5.setType(12); // L: 791
			break; // L: 792
		case 1011:
			var5.setType(13); // L: 796
			break; // L: 797
		case 1012:
			var5.setType(14); // L: 806
		}

		class1.runScriptEvent(var5); // L: 810
	} // L: 811

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "-1289438305"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 814
			return null; // L: 815
		} else if (!this.worldMapManager.isLoaded()) { // L: 817
			return null; // L: 818
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 820
			this.field4519 = new LinkedList(); // L: 821
			Iterator var2 = var1.values().iterator(); // L: 822

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 823
				this.field4519.addAll(var3); // L: 825
			}

			this.iconIterator = this.field4519.iterator(); // L: 828
			return this.iconNext(); // L: 829
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lic;",
		garbageValue = "20"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 833
			return null; // L: 834
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 836
					return null; // L: 842
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 837
			} while(var1.getElement() == -1); // L: 838

			return var1; // L: 839
		}
	}
}
