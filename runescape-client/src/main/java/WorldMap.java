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

@ObfuscatedName("or")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("q")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("p")
	@Export("details")
	HashMap details;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	WorldMapArea field4370;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 828442357
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 276879255
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -611114811
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 584594883
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("z")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ap")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -663140989
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 516307323
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1351720747
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1591613441
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 61796873
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 462292081
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("ao")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("aq")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1027047633
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1114852755
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 630993585
	)
	int field4372;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1004708149
	)
	int field4388;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 526251255
	)
	int field4389;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 961516579
	)
	int field4390;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -6089520608796467439L
	)
	long field4391;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 443689527
	)
	int field4392;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1213349115
	)
	int field4393;
	@ObfuscatedName("ae")
	boolean field4367;
	@ObfuscatedName("aj")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ax")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("ah")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ai")
	HashSet field4398;
	@ObfuscatedName("am")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 619725823
	)
	int field4396;
	@ObfuscatedName("bn")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bz")
	List field4402;
	@ObfuscatedName("bx")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bd")
	HashSet field4404;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bm")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1913692445
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1836719439
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -640589691
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -243604363
	)
	int field4411;

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
		this.field4372 = -1; // L: 74
		this.field4388 = -1; // L: 75
		this.field4389 = -1; // L: 76
		this.field4390 = -1; // L: 77
		this.field4367 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4398 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4396 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4404 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4411 = -1; // L: 101
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;Lkq;Llv;Ljava/util/HashMap;[Lpg;B)V",
		garbageValue = "19"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2793.name); // L: 115
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
		this.field4370 = null; // L: 128
	} // L: 129

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1693187068"
	)
	public void method6884() {
		ModelData0.method4272(); // L: 132
	} // L: 133

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "-16"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 136
			this.smoothZoom(); // L: 139
			this.scrollToTarget(); // L: 140
			if (var3) { // L: 141
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 144
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 145
				List var10 = this.worldMapManager.method4586(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 146
				HashSet var11 = new HashSet(); // L: 147

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class92.runScriptEvent(var14)) { // L: 148 161
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 149
					var11.add(var13); // L: 151
					var14 = new ScriptEvent(); // L: 152
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 153
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 154
					if (this.field4404.contains(var13)) { // L: 155
						var14.setType(17); // L: 156
					} else {
						var14.setType(15); // L: 159
					}
				}

				var12 = this.field4404.iterator(); // L: 164

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 165
					if (!var11.contains(var13)) { // L: 167
						var14 = new ScriptEvent(); // L: 168
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 169
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 170
						var14.setType(16); // L: 171
						class92.runScriptEvent(var14); // L: 172
					}
				}

				this.field4404 = var11; // L: 176
			}
		}
	} // L: 137 142 177

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-873462170"
	)
	public void method6886(int var1, int var2, boolean var3, boolean var4) {
		long var5 = DirectByteArrayCopier.method5318(); // L: 180
		this.method7035(var1, var2, var4, var5); // L: 181
		if (this.hasTarget() || !var4 && !var3) { // L: 182
			this.method7043(); // L: 196
		} else {
			if (var4) { // L: 183
				this.field4389 = var1; // L: 184
				this.field4390 = var2; // L: 185
				this.field4372 = this.centerTileX; // L: 186
				this.field4388 = this.centerTileY; // L: 187
			}

			if (this.field4372 != -1) { // L: 189
				int var7 = var1 - this.field4389; // L: 190
				int var8 = var2 - this.field4390; // L: 191
				this.setWorldMapPosition(this.field4372 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4388, false); // L: 192
			}
		}

		if (var4) { // L: 198
			this.field4391 = var5; // L: 199
			this.field4392 = var1; // L: 200
			this.field4393 = var2; // L: 201
		}

	} // L: 203

	@ObfuscatedName("r")
	void method7035(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 206
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 207
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 208
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 209
			if (this.mouseCoord != null && var3) { // L: 210
				if (class133.method2807() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 211
					DevicePcmPlayerProvider.method361(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 212
				} else {
					boolean var8 = true; // L: 215
					if (this.field4367) { // L: 216
						int var9 = var1 - this.field4392; // L: 217
						int var10 = var2 - this.field4393; // L: 218
						if (var4 - this.field4391 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) { // L: 219
							var8 = false; // L: 220
						}
					}

					if (var8) { // L: 223
						PacketBufferNode var11 = class135.getPacketBufferNode(ClientPacket.field2846, Client.packetWriter.isaacCipher); // L: 224
						var11.packetBuffer.method7450(this.mouseCoord.packed()); // L: 225
						Client.packetWriter.addNode(var11); // L: 226
						this.field4391 = 0L; // L: 227
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 232
		}

	} // L: 233

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "28855"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class9.field58 != null) { // L: 236
			this.zoom = this.zoomTarget; // L: 237
		} else {
			if (this.zoom < this.zoomTarget) { // L: 240
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 241
			}

			if (this.zoom > this.zoomTarget) { // L: 243
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 244
			}

		}
	} // L: 238 246

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1829009098"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 249
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 252
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 253
			if (var1 != 0) { // L: 254
				var1 /= Math.min(8, Math.abs(var1)); // L: 255
			}

			if (var2 != 0) { // L: 257
				var2 /= Math.min(8, Math.abs(var2)); // L: 258
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 260
			if (this.worldMapTargetX == this.centerTileX && this.worldMapTargetY == this.centerTileY) { // L: 261
				this.worldMapTargetX = -1; // L: 262
				this.worldMapTargetY = -1; // L: 263
			}

		}
	} // L: 250 265

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1235301857"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 268
		this.centerTileY = var2; // L: 269
		DirectByteArrayCopier.method5318(); // L: 270
		if (var3) {
			this.method7043(); // L: 271
		}

	} // L: 272

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-71008000"
	)
	final void method7043() {
		this.field4390 = -1; // L: 275
		this.field4389 = -1; // L: 276
		this.field4388 = -1; // L: 277
		this.field4372 = -1; // L: 278
	} // L: 279

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1567829287"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 282
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lhm;",
		garbageValue = "1984428473"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 286

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 294
			}

			var5 = (WorldMapArea)var4.next(); // L: 287
		} while(!var5.containsCoord(var1, var2, var3)); // L: 289

		return var5; // L: 290
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "405963954"
	)
	public void method6894(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 298
		if (var5 == null) { // L: 299
			if (!var4) { // L: 300
				return; // L: 303
			}

			var5 = this.mainMapArea; // L: 301
		}

		boolean var6 = false; // L: 305
		if (var5 != this.field4370 || var4) { // L: 306
			this.field4370 = var5; // L: 307
			this.setCurrentMapArea(var5); // L: 308
			var6 = true; // L: 309
		}

		if (var6 || var4) { // L: 311
			this.jump(var1, var2, var3); // L: 312
		}

	} // L: 314

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1895553360"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 317
		if (var2 != null) { // L: 318
			this.setCurrentMapArea(var2); // L: 319
		}

	} // L: 321

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1947574264"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 324 325 327
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lhm;",
		garbageValue = "101"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 331
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "586454693"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 335
			this.initializeWorldMapManager(var1); // L: 338
			this.jump(-1, -1, -1); // L: 339
		}
	} // L: 336 340

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "-1195294003"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 343
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 344
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 345
	} // L: 346

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhm;Ljd;Ljd;ZB)V",
		garbageValue = "-17"
	)
	public void method7006(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 349
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 352
				this.initializeWorldMapManager(var1); // L: 353
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 355
				this.jump(var2.plane, var2.x, var2.y); // L: 359
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 356
			}

		}
	} // L: 350 361

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1267591914"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 364
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 367
			if (var4 == null) { // L: 368
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 369
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 371
			this.worldMapTargetX = -1; // L: 372
			this.worldMapTargetY = -1; // L: 373
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 374
			this.zoomTarget = this.zoom; // L: 375
			this.field4402 = null; // L: 376
			this.iconIterator = null; // L: 377
			this.worldMapManager.clearIcons(); // L: 378
		}
	} // L: 365 379

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "577207508"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 382
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 383
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 384
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 385
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 386
		if (var7 < 100) { // L: 387
			this.drawLoading(var1, var2, var3, var4, var7); // L: 388
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 391
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 392
				if (!this.worldMapManager.isLoaded()) { // L: 393
					return; // L: 394
				}
			}

			if (this.flashingElements != null) { // L: 397
				++this.flashCycle; // L: 398
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 399
					this.flashCycle = 0; // L: 400
					++this.flashCount; // L: 401
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 403
					this.flashingElements = null; // L: 404
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 407
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 408
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 409
			if (!this.elementsDisabled) { // L: 410
				boolean var10 = false; // L: 411
				if (var5 - this.field4396 > 100) { // L: 412
					this.field4396 = var5; // L: 413
					var10 = true; // L: 414
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4398, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 416
			}

			this.method6983(var1, var2, var3, var4, var8, var9); // L: 418
			if (class133.method2807() && this.showCoord && this.mouseCoord != null) { // L: 419
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 420
			this.worldMapDisplayHeight = var9; // L: 421
			this.worldMapDisplayX = var1; // L: 422
			this.worldMapDisplayY = var2; // L: 423
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 424
		}
	} // L: 389 425

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-1405594741"
	)
	boolean method6903(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 428
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 429
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 430
				return true;
			} else if (this.field4411 != Client.field777) { // L: 431
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 432
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 433
			} else {
				return true; // L: 434
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1915821127"
	)
	void method6983(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class9.field58 != null) { // L: 438
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 439
			int var8 = var3 + 512; // L: 440
			int var9 = var4 + 512; // L: 441
			float var10 = 1.0F; // L: 442
			var8 = (int)((float)var8 / var10); // L: 443
			var9 = (int)((float)var9 / var10); // L: 444
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 445
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 446
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 447
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 448
			if (this.method6903(var8, var9, var13, var14, var3, var4)) { // L: 449
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 450
					Arrays.fill(this.sprite.pixels, 0); // L: 453
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 451
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 454
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 455
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 456
				class9.field58.method5766(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 457
				this.field4411 = Client.field777; // L: 458
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 459
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 460
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 462
			if (1.0F == var10) { // L: 463
				this.sprite.method7771(var13, var14, 192); // L: 464
			} else {
				this.sprite.method7796(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 467
			}
		}

	} // L: 470

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "23"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 473
			if (!this.worldMapManager.isLoaded()) { // L: 476
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 477
				if (!this.worldMapManager.isLoaded()) { // L: 478
					return; // L: 479
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 482
		}
	} // L: 474 483

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "128"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 486
	} // L: 487

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2109796675"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 490
		int var7 = var3 / 2 + var1; // L: 491
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 492
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 493
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 494
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 495
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 496
	} // L: 497

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1108378625"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 500
			return 1.0F;
		} else if (var1 == 37) { // L: 501
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 502
		} else if (var1 == 75) { // L: 503
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 504 505
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "29"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 509
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 510
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 511
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 512
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 513 514
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 518
	} // L: 519

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1609770049"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 522
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhm;",
		garbageValue = "-97"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 526

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) { // L: 533
				return null; // L: 534
			}

			var3 = (WorldMapArea)var2.next(); // L: 527
		} while(var3.getId() != var1); // L: 529

		return var3; // L: 530
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "4"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 538
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 541
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 542
		}
	} // L: 539 543

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1107981788"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 546
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 549
			this.worldMapTargetX = -1; // L: 550
			this.worldMapTargetY = -1; // L: 551
		}
	} // L: 547 552

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "5"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 555
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 558
			if (var4 != null) { // L: 559
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 560
			}

		}
	} // L: 556 562

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-45"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 565
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 568
			if (var4 != null) { // L: 569
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 570
			}

		}
	} // L: 566 572

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-82"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 575 576 578
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 582 583 585
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1413641352"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 589 590 592
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-937812411"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 596
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-439544907"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 600
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1644259642"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 604
			this.maxFlashCount = var1; // L: 605
		}

	} // L: 607

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1364892834"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 610
	} // L: 611

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1824522129"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 614
			this.cyclesPerFlash = var1; // L: 615
		}

	} // L: 617

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 620
	} // L: 621

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 624
	} // L: 625

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1967172727"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 628
		this.flashingElements.add(var1); // L: 629
		this.flashCount = 0; // L: 630
		this.flashCycle = 0; // L: 631
	} // L: 632

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "917592006"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 635
		this.flashCount = 0; // L: 636
		this.flashCycle = 0; // L: 637

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 638
			if (class126.WorldMapElement_get(var2) != null && class126.WorldMapElement_get(var2).category == var1) { // L: 639 642
				this.flashingElements.add(class126.WorldMapElement_get(var2).objectId); // L: 643
			}
		}

	} // L: 646

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 649
	} // L: 650

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "2"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 653
	} // L: 654

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-23253719"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 657
			this.enabledElements.add(var1); // L: 658
		} else {
			this.enabledElements.remove(var1); // L: 661
		}

		this.method6963(); // L: 663
	} // L: 664

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "62"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 667
			this.enabledCategories.add(var1); // L: 668
		} else {
			this.enabledCategories.remove(var1); // L: 671
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 673
			if (class126.WorldMapElement_get(var3) != null && class126.WorldMapElement_get(var3).category == var1) { // L: 674 677
				int var4 = class126.WorldMapElement_get(var3).objectId; // L: 678
				if (!var2) { // L: 679
					this.enabledElementIds.add(var4); // L: 680
				} else {
					this.enabledElementIds.remove(var4); // L: 683
				}
			}
		}

		this.method6963(); // L: 687
	} // L: 688

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "50"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 691
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1912556750"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 695
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-384797196"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 699
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "667355836"
	)
	void method6963() {
		this.field4398.clear(); // L: 703
		this.field4398.addAll(this.enabledElements); // L: 704
		this.field4398.addAll(this.enabledElementIds); // L: 705
	} // L: 706

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "183417655"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 709
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 712
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 713
			List var9 = this.worldMapManager.method4586(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 714
			if (!var9.isEmpty()) { // L: 715
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 718
						return; // L: 734
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 719
					WorldMapElement var12 = class126.WorldMapElement_get(var11.getElement()); // L: 721
					var13 = false; // L: 722

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 723
						if (var12.menuActions[var14] != null) { // L: 724
							class11.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 725
							var13 = true; // L: 726
						}
					}
				} while(!var13); // L: 729

			}
		}
	} // L: 710 716 730

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILjd;I)Ljd;",
		garbageValue = "1029185121"
	)
	public Coord method6897(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 737
			return null; // L: 738
		} else if (!this.worldMapManager.isLoaded()) { // L: 740
			return null; // L: 741
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 743
			return null; // L: 744
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 746
			List var4 = (List)var3.get(var1); // L: 747
			if (var4 != null && !var4.isEmpty()) { // L: 748
				AbstractWorldMapIcon var5 = null; // L: 751
				int var6 = -1; // L: 752
				Iterator var7 = var4.iterator(); // L: 753

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 768
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 754
						int var9 = var8.coord2.x - var2.x; // L: 756
						int var10 = var8.coord2.y - var2.y; // L: 757
						var11 = var9 * var9 + var10 * var10; // L: 758
						if (var11 == 0) { // L: 759
							return var8.coord2; // L: 760
						}
					} while(var11 >= var6 && var5 != null); // L: 762

					var5 = var8; // L: 763
					var6 = var11; // L: 764
				}
			} else {
				return null; // L: 749
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IILjd;Ljd;I)V",
		garbageValue = "2072083321"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 772
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 773
		var5.setArgs(new Object[]{var6}); // L: 774
		switch(var1) { // L: 775
		case 1008:
			var5.setType(10); // L: 793
			break; // L: 794
		case 1009:
			var5.setType(11); // L: 798
			break;
		case 1010:
			var5.setType(12); // L: 778
			break;
		case 1011:
			var5.setType(13); // L: 783
			break;
		case 1012:
			var5.setType(14); // L: 788
		}

		class92.runScriptEvent(var5); // L: 802
	} // L: 803

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "-1771099551"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 806
			return null; // L: 807
		} else if (!this.worldMapManager.isLoaded()) { // L: 809
			return null; // L: 810
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 812
			this.field4402 = new LinkedList(); // L: 813
			Iterator var2 = var1.values().iterator(); // L: 814

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 815
				this.field4402.addAll(var3); // L: 817
			}

			this.iconIterator = this.field4402.iterator(); // L: 820
			return this.iconNext(); // L: 821
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Lix;",
		garbageValue = "-33"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 825
			return null; // L: 826
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 828
					return null; // L: 834
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 829
			} while(var1.getElement() == -1); // L: 830

			return var1; // L: 831
		}
	}
}
