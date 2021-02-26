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

@ObfuscatedName("mf")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("w")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("i")
	@Export("details")
	HashMap details;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	WorldMapArea field4001;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1485160707
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 468675207
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -552998349
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -103147929
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("j")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ay")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2118998885
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1890808813
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2127306477
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -511724315
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 430742145
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2091000699
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("ak")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ax")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -668167233
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 369580101
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -495293641
	)
	int field3983;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -717916547
	)
	int field4024;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -543796417
	)
	int field4022;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -866652017
	)
	int field4023;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -8962083882606265099L
	)
	long field4040;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -255624939
	)
	int field4014;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 795601449
	)
	int field4026;
	@ObfuscatedName("an")
	boolean field4027;
	@ObfuscatedName("au")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ad")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("af")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("av")
	HashSet field4032;
	@ObfuscatedName("ao")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1798825541
	)
	int field3994;
	@ObfuscatedName("bi")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bp")
	List field4035;
	@ObfuscatedName("br")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bq")
	HashSet field3992;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bc")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1265489045
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1633065457
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1866710929
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1184565479
	)
	int field4044;

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
		this.field3983 = -1; // L: 74
		this.field4024 = -1; // L: 75
		this.field4022 = -1; // L: 76
		this.field4023 = -1; // L: 77
		this.field4027 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4032 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field3994 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field3992 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4044 = -1; // L: 101
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;Lig;Lkl;Ljava/util/HashMap;[Lly;B)V",
		garbageValue = "32"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field333.name); // L: 115
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
		this.field4001 = null; // L: 128
	} // L: 129

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "85863738"
	)
	public void method6584() {
		WorldMapSection1.method671(); // L: 132
	} // L: 133

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "230943505"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 136
			this.smoothZoom(); // L: 139
			this.scrollToTarget(); // L: 140
			if (var3) { // L: 141
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 144
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 145
				List var10 = this.worldMapManager.method722(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 146
				HashSet var11 = new HashSet(); // L: 147

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); PacketWriter.runScriptEvent(var14)) { // L: 148 161
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 149
					var11.add(var13); // L: 151
					var14 = new ScriptEvent(); // L: 152
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 153
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 154
					if (this.field3992.contains(var13)) { // L: 155
						var14.setType(17); // L: 156
					} else {
						var14.setType(15); // L: 159
					}
				}

				var12 = this.field3992.iterator(); // L: 164

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 165
					if (!var11.contains(var13)) { // L: 167
						var14 = new ScriptEvent(); // L: 168
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 169
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 170
						var14.setType(16); // L: 171
						PacketWriter.runScriptEvent(var14); // L: 172
					}
				}

				this.field3992 = var11; // L: 176
			}
		}
	} // L: 137 142 177

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1689705014"
	)
	public void method6525(int var1, int var2, boolean var3, boolean var4) {
		long var5 = Tiles.currentTimeMillis(); // L: 180
		this.method6539(var1, var2, var4, var5); // L: 181
		if (this.hasTarget() || !var4 && !var3) { // L: 182
			this.method6527(); // L: 196
		} else {
			if (var4) { // L: 183
				this.field4022 = var1; // L: 184
				this.field4023 = var2; // L: 185
				this.field3983 = this.centerTileX; // L: 186
				this.field4024 = this.centerTileY; // L: 187
			}

			if (this.field3983 != -1) { // L: 189
				int var7 = var1 - this.field4022; // L: 190
				int var8 = var2 - this.field4023; // L: 191
				this.setWorldMapPosition(this.field3983 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4024, false); // L: 192
			}
		}

		if (var4) { // L: 198
			this.field4040 = var5; // L: 199
			this.field4014 = var1; // L: 200
			this.field4026 = var2; // L: 201
		}

	} // L: 203

	@ObfuscatedName("y")
	void method6539(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 206
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 207
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 208
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 209
			if (this.mouseCoord != null && var3) { // L: 210
				int var9;
				int var10;
				if (TriBool.method5372() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 211
					int var13 = this.mouseCoord.x; // L: 212
					var9 = this.mouseCoord.y; // L: 213
					var10 = this.mouseCoord.plane; // L: 214
					PacketBufferNode var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2230, Client.packetWriter.isaacCipher); // L: 217
					var11.packetBuffer.writeShortLE(var9); // L: 218
					var11.packetBuffer.method5883(var10); // L: 219
					var11.packetBuffer.method5736(0); // L: 220
					var11.packetBuffer.writeIntME(var13); // L: 221
					Client.packetWriter.addNode(var11); // L: 222
				} else {
					boolean var8 = true; // L: 226
					if (this.field4027) { // L: 227
						var9 = var1 - this.field4014; // L: 228
						var10 = var2 - this.field4026; // L: 229
						if (var4 - this.field4040 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) { // L: 230
							var8 = false; // L: 231
						}
					}

					if (var8) { // L: 234
						PacketBufferNode var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher); // L: 235
						var12.packetBuffer.method5736(this.mouseCoord.packed()); // L: 236
						Client.packetWriter.addNode(var12); // L: 237
						this.field4040 = 0L; // L: 238
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 243
		}

	} // L: 244

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (HealthBarUpdate.field1016 != null) { // L: 247
			this.zoom = this.zoomTarget; // L: 248
		} else {
			if (this.zoom < this.zoomTarget) { // L: 251
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 252
			}

			if (this.zoom > this.zoomTarget) { // L: 254
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 255
			}

		}
	} // L: 249 257

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2023842573"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 260
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 263
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 264
			if (var1 != 0) { // L: 265
				var1 /= Math.min(8, Math.abs(var1)); // L: 266
			}

			if (var2 != 0) { // L: 268
				var2 /= Math.min(8, Math.abs(var2)); // L: 269
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 271
			if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) { // L: 272
				this.worldMapTargetX = -1; // L: 273
				this.worldMapTargetY = -1; // L: 274
			}

		}
	} // L: 261 276

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1942318889"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 279
		this.centerTileY = var2; // L: 280
		Tiles.currentTimeMillis(); // L: 281
		if (var3) {
			this.method6527(); // L: 282
		}

	} // L: 283

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-759849186"
	)
	final void method6527() {
		this.field4023 = -1; // L: 286
		this.field4022 = -1; // L: 287
		this.field4024 = -1; // L: 288
		this.field3983 = -1; // L: 289
	} // L: 290

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-172308230"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 293
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lar;",
		garbageValue = "1643132565"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 297

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 305
			}

			var5 = (WorldMapArea)var4.next(); // L: 298
		} while(!var5.containsCoord(var1, var2, var3)); // L: 300

		return var5; // L: 301
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "76619956"
	)
	public void method6530(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 309
		if (var5 == null) { // L: 310
			if (!var4) { // L: 311
				return; // L: 314
			}

			var5 = this.mainMapArea; // L: 312
		}

		boolean var6 = false; // L: 316
		if (var5 != this.field4001 || var4) { // L: 317
			this.field4001 = var5; // L: 318
			this.setCurrentMapArea(var5); // L: 319
			var6 = true; // L: 320
		}

		if (var6 || var4) { // L: 322
			this.jump(var1, var2, var3); // L: 323
		}

	} // L: 325

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1925451385"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 328
		if (var2 != null) { // L: 329
			this.setCurrentMapArea(var2); // L: 330
		}

	} // L: 332

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-730626276"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 335 336 338
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Lar;",
		garbageValue = "-84"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 342
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lar;I)V",
		garbageValue = "-248631189"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 346
			this.initializeWorldMapManager(var1); // L: 349
			this.jump(-1, -1, -1); // L: 350
		}
	} // L: 347 351

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lar;I)V",
		garbageValue = "1768917402"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 354
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 355
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 356
	} // L: 357

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lar;Lhd;Lhd;ZI)V",
		garbageValue = "-1378443139"
	)
	public void method6536(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 360
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 363
				this.initializeWorldMapManager(var1); // L: 364
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 366
				this.jump(var2.plane, var2.x, var2.y); // L: 370
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 367
			}

		}
	} // L: 361 372

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-10194"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 375
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 378
			if (var4 == null) { // L: 379
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 380
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 382
			this.worldMapTargetX = -1; // L: 383
			this.worldMapTargetY = -1; // L: 384
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 385
			this.zoomTarget = this.zoom; // L: 386
			this.field4035 = null; // L: 387
			this.iconIterator = null; // L: 388
			this.worldMapManager.clearIcons(); // L: 389
		}
	} // L: 376 390

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "943833316"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 393
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 394
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 395
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 396
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 397
		if (var7 < 100) { // L: 398
			this.drawLoading(var1, var2, var3, var4, var7); // L: 399
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 402
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 403
				if (!this.worldMapManager.isLoaded()) { // L: 404
					return; // L: 405
				}
			}

			if (this.flashingElements != null) { // L: 408
				++this.flashCycle; // L: 409
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 410
					this.flashCycle = 0; // L: 411
					++this.flashCount; // L: 412
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 414
					this.flashingElements = null; // L: 415
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 418
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 419
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 420
			if (!this.elementsDisabled) { // L: 421
				boolean var10 = false; // L: 422
				if (var5 - this.field3994 > 100) { // L: 423
					this.field3994 = var5; // L: 424
					var10 = true; // L: 425
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4032, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 427
			}

			this.method6699(var1, var2, var3, var4, var8, var9); // L: 429
			if (TriBool.method5372() && this.showCoord && this.mouseCoord != null) { // L: 430
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 431
			this.worldMapDisplayHeight = var9; // L: 432
			this.worldMapDisplayX = var1; // L: 433
			this.worldMapDisplayY = var2; // L: 434
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 435
		}
	} // L: 400 436

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "32"
	)
	boolean method6633(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 439
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 440
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 441
				return true;
			} else if (this.field4044 != Client.field674) { // L: 442
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 443
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 444
			} else {
				return true; // L: 445
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1237692088"
	)
	void method6699(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (HealthBarUpdate.field1016 != null) { // L: 449
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 450
			int var8 = var3 + 512; // L: 451
			int var9 = var4 + 512; // L: 452
			float var10 = 1.0F; // L: 453
			var8 = (int)((float)var8 / var10); // L: 454
			var9 = (int)((float)var9 / var10); // L: 455
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 456
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 457
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 458
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 459
			if (this.method6633(var8, var9, var13, var14, var3, var4)) { // L: 460
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 461
					Arrays.fill(this.sprite.pixels, 0); // L: 464
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 462
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 465
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 466
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 467
				HealthBarUpdate.field1016.method4511(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 468
				this.field4044 = Client.field674; // L: 469
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 470
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 471
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 473
			if (1.0F == var10) { // L: 474
				this.sprite.method6426(var13, var14, 192); // L: 475
			} else {
				this.sprite.method6347(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192); // L: 478
			}
		}

	} // L: 481

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1634362123"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 484
			if (!this.worldMapManager.isLoaded()) { // L: 487
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 488
				if (!this.worldMapManager.isLoaded()) { // L: 489
					return; // L: 490
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 493
		}
	} // L: 485 494

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1829622274"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 497
	} // L: 498

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-22"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 501
		int var7 = var3 / 2 + var1; // L: 502
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 503
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 504
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 505
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 506
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 507
	} // L: 508

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "2058338790"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 511
			return 1.0F;
		} else if (var1 == 37) { // L: 512
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 513
		} else if (var1 == 75) { // L: 514
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 515 516
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "755044862"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 520
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 521
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 522
			return 50;
		} else if (3.0D == (double)this.zoomTarget) { // L: 523
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 524 525
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7039"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 529
	} // L: 530

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1977951354"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 533
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lar;",
		garbageValue = "24879988"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 537

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 545
			}

			var3 = (WorldMapArea)var2.next(); // L: 538
		} while(var3.getId() != var1); // L: 540

		return var3; // L: 541
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1763337265"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 549
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 552
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 553
		}
	} // L: 550 554

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1279892888"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 557
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 560
			this.worldMapTargetX = -1; // L: 561
			this.worldMapTargetY = -1; // L: 562
		}
	} // L: 558 563

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1845440607"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 566
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 569
			if (var4 != null) { // L: 570
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 571
			}

		}
	} // L: 567 573

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "739439346"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 576
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 579
			if (var4 != null) { // L: 580
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 581
			}

		}
	} // L: 577 583

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1657700908"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 586 587 589
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-162188906"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 593 594 596
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "39771742"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 600 601 603
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1570043056"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 607
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 611
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1795336966"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 615
			this.maxFlashCount = var1; // L: 616
		}

	} // L: 618

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 621
	} // L: 622

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "91922323"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 625
			this.cyclesPerFlash = var1; // L: 626
		}

	} // L: 628

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "24643102"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 631
	} // L: 632

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1604690679"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 635
	} // L: 636

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-18"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 639
		this.flashingElements.add(var1); // L: 640
		this.flashCount = 0; // L: 641
		this.flashCycle = 0; // L: 642
	} // L: 643

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "176453590"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 646
		this.flashCount = 0; // L: 647
		this.flashCycle = 0; // L: 648

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 649
			if (InvDefinition.WorldMapElement_get(var2) != null && InvDefinition.WorldMapElement_get(var2).category == var1) { // L: 650 653
				this.flashingElements.add(InvDefinition.WorldMapElement_get(var2).objectId); // L: 654
			}
		}

	} // L: 657

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 660
	} // L: 661

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "651351210"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 664
	} // L: 665

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1491746515"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 668
			this.enabledElements.add(var1); // L: 669
		} else {
			this.enabledElements.remove(var1); // L: 672
		}

		this.method6571(); // L: 674
	} // L: 675

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "375985188"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 678
			this.enabledCategories.add(var1); // L: 679
		} else {
			this.enabledCategories.remove(var1); // L: 682
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 684
			if (InvDefinition.WorldMapElement_get(var3) != null && InvDefinition.WorldMapElement_get(var3).category == var1) { // L: 685 688
				int var4 = InvDefinition.WorldMapElement_get(var3).objectId; // L: 689
				if (!var2) { // L: 690
					this.enabledElementIds.add(var4); // L: 691
				} else {
					this.enabledElementIds.remove(var4); // L: 694
				}
			}
		}

		this.method6571(); // L: 698
	} // L: 699

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 702
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "799594991"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 706
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1690733813"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 710
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "793022783"
	)
	void method6571() {
		this.field4032.clear(); // L: 714
		this.field4032.addAll(this.enabledElements); // L: 715
		this.field4032.addAll(this.enabledElementIds); // L: 716
	} // L: 717

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2078368565"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 720
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 723
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 724
			List var9 = this.worldMapManager.method722(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 725
			if (!var9.isEmpty()) { // L: 726
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 729
						return; // L: 745
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 730
					WorldMapElement var12 = InvDefinition.WorldMapElement_get(var11.getElement()); // L: 732
					var13 = false; // L: 733

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 734
						if (var12.menuActions[var14] != null) { // L: 735
							WorldMapManager.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 736
							var13 = true; // L: 737
						}
					}
				} while(!var13); // L: 740

			}
		}
	} // L: 721 727 741

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILhd;I)Lhd;",
		garbageValue = "242977526"
	)
	public Coord method6643(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 748
			return null; // L: 749
		} else if (!this.worldMapManager.isLoaded()) { // L: 751
			return null; // L: 752
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 754
			return null; // L: 755
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 757
			List var4 = (List)var3.get(var1); // L: 758
			if (var4 != null && !var4.isEmpty()) { // L: 759
				AbstractWorldMapIcon var5 = null; // L: 762
				int var6 = -1; // L: 763
				Iterator var7 = var4.iterator(); // L: 764

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 779
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 765
						int var9 = var8.coord2.x - var2.x; // L: 767
						int var10 = var8.coord2.y - var2.y; // L: 768
						var11 = var9 * var9 + var10 * var10; // L: 769
						if (var11 == 0) { // L: 770
							return var8.coord2; // L: 771
						}
					} while(var11 >= var6 && var5 != null); // L: 773

					var5 = var8; // L: 774
					var6 = var11; // L: 775
				}
			} else {
				return null; // L: 760
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IILhd;Lhd;I)V",
		garbageValue = "-1238486806"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 783
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 784
		var5.setArgs(new Object[]{var6}); // L: 785
		switch(var1) { // L: 786
		case 1008:
			var5.setType(10); // L: 794
			break; // L: 795
		case 1009:
			var5.setType(11); // L: 799
			break; // L: 800
		case 1010:
			var5.setType(12); // L: 804
			break; // L: 805
		case 1011:
			var5.setType(13); // L: 789
			break;
		case 1012:
			var5.setType(14); // L: 809
		}

		PacketWriter.runScriptEvent(var5); // L: 813
	} // L: 814

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)Laj;",
		garbageValue = "-77"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 817
			return null; // L: 818
		} else if (!this.worldMapManager.isLoaded()) { // L: 820
			return null; // L: 821
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 823
			this.field4035 = new LinkedList(); // L: 824
			Iterator var2 = var1.values().iterator(); // L: 825

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 826
				this.field4035.addAll(var3); // L: 828
			}

			this.iconIterator = this.field4035.iterator(); // L: 831
			return this.iconNext(); // L: 832
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)Laj;",
		garbageValue = "-25"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 836
			return null; // L: 837
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 839
					return null; // L: 845
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 840
			} while(var1.getElement() == -1); // L: 841

			return var1; // L: 842
		}
	}
}
