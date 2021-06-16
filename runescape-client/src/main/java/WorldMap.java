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

@ObfuscatedName("me")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("k")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("t")
	@Export("details")
	HashMap details;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	WorldMapArea field4007;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -24822515
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1439876257
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 824727721
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -495123055
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("a")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("aw")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1381841547
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2081300499
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2113167105
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -702073087
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1344926445
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 642877669
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("ag")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ab")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 947484267
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2115600229
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -294067895
	)
	int field4011;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 987503049
	)
	int field4027;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1736170551
	)
	int field4028;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 655380945
	)
	int field4022;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1876007755272833433L
	)
	long field3992;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1902935505
	)
	int field3996;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2007971713
	)
	int field4032;
	@ObfuscatedName("ay")
	boolean field4033;
	@ObfuscatedName("ai")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("av")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("ax")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ar")
	HashSet field4037;
	@ObfuscatedName("af")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1319766615
	)
	int field3999;
	@ObfuscatedName("bi")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bz")
	List field4041;
	@ObfuscatedName("bb")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bv")
	HashSet field4043;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("be")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 451764491
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2118190899
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1403776455
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 736851519
	)
	int field4026;

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
		this.field4011 = -1; // L: 74
		this.field4027 = -1; // L: 75
		this.field4028 = -1; // L: 76
		this.field4022 = -1; // L: 77
		this.field4033 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4037 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field3999 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4043 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4026 = -1; // L: 101
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;Lkj;Ljava/util/HashMap;[Lof;I)V",
		garbageValue = "-1791711936"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2131.name); // L: 115
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
		this.field4007 = null; // L: 128
	} // L: 129

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method6239() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 133
	} // L: 135

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "4"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method3526(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); WorldMapSection1.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4043.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4043.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						WorldMapSection1.runScriptEvent(var14); // L: 174
					}
				}

				this.field4043 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1544897880"
	)
	public void method6133(int var1, int var2, boolean var3, boolean var4) {
		long var5 = ClientPacket.currentTimeMillis(); // L: 182
		this.method6160(var1, var2, var4, var5); // L: 183
		if (this.hasTarget() || !var4 && !var3) { // L: 184
			this.method6138(); // L: 198
		} else {
			if (var4) { // L: 185
				this.field4028 = var1; // L: 186
				this.field4022 = var2; // L: 187
				this.field4011 = this.centerTileX; // L: 188
				this.field4027 = this.centerTileY; // L: 189
			}

			if (this.field4011 != -1) { // L: 191
				int var7 = var1 - this.field4028; // L: 192
				int var8 = var2 - this.field4022; // L: 193
				this.setWorldMapPosition(this.field4011 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4027, false); // L: 194
			}
		}

		if (var4) { // L: 200
			this.field3992 = var5; // L: 201
			this.field3996 = var1; // L: 202
			this.field4032 = var2; // L: 203
		}

	} // L: 205

	@ObfuscatedName("j")
	void method6160(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 208
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 209
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 210
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 211
			if (this.mouseCoord != null && var3) { // L: 212
				boolean var8 = Client.staffModLevel >= 2; // L: 215
				int var10;
				int var11;
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 217
					int var14 = this.mouseCoord.x; // L: 218
					var10 = this.mouseCoord.y; // L: 219
					var11 = this.mouseCoord.plane; // L: 220
					PacketBufferNode var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2596, Client.packetWriter.isaacCipher); // L: 223
					var12.packetBuffer.writeShort(var14); // L: 224
					var12.packetBuffer.method6659(0); // L: 225
					var12.packetBuffer.method6640(var11); // L: 226
					var12.packetBuffer.method6648(var10); // L: 227
					Client.packetWriter.addNode(var12); // L: 228
				} else {
					boolean var9 = true; // L: 232
					if (this.field4033) { // L: 233
						var10 = var1 - this.field3996; // L: 234
						var11 = var2 - this.field4032; // L: 235
						if (var4 - this.field3992 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 236
							var9 = false; // L: 237
						}
					}

					if (var9) { // L: 240
						PacketBufferNode var13 = InterfaceParent.getPacketBufferNode(ClientPacket.field2575, Client.packetWriter.isaacCipher); // L: 241
						var13.packetBuffer.writeIntME(this.mouseCoord.packed()); // L: 242
						Client.packetWriter.addNode(var13); // L: 243
						this.field3992 = 0L; // L: 244
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 249
		}

	} // L: 250

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1153461919"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (LoginPacket.field2800 != null) { // L: 253
			this.zoom = this.zoomTarget; // L: 254
		} else {
			if (this.zoom < this.zoomTarget) { // L: 257
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 258
			}

			if (this.zoom > this.zoomTarget) { // L: 260
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 261
			}

		}
	} // L: 255 263

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1583682530"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 266
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 269
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 270
			if (var1 != 0) { // L: 271
				var1 /= Math.min(8, Math.abs(var1)); // L: 272
			}

			if (var2 != 0) { // L: 274
				var2 /= Math.min(8, Math.abs(var2)); // L: 275
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 277
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 278
				this.worldMapTargetX = -1; // L: 279
				this.worldMapTargetY = -1; // L: 280
			}

		}
	} // L: 267 282

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-962488922"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 285
		this.centerTileY = var2; // L: 286
		ClientPacket.currentTimeMillis(); // L: 287
		if (var3) {
			this.method6138(); // L: 288
		}

	} // L: 289

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "259207971"
	)
	final void method6138() {
		this.field4022 = -1; // L: 292
		this.field4028 = -1; // L: 293
		this.field4027 = -1; // L: 294
		this.field4011 = -1; // L: 295
	} // L: 296

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-89"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 299
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lfa;",
		garbageValue = "-8"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 303

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) { // L: 310
				return null; // L: 311
			}

			var5 = (WorldMapArea)var4.next(); // L: 304
		} while(!var5.containsCoord(var1, var2, var3)); // L: 306

		return var5; // L: 307
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "2011089652"
	)
	public void method6287(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 315
		if (var5 == null) { // L: 316
			if (!var4) { // L: 317
				return; // L: 320
			}

			var5 = this.mainMapArea; // L: 318
		}

		boolean var6 = false; // L: 322
		if (var5 != this.field4007 || var4) { // L: 323
			this.field4007 = var5; // L: 324
			this.setCurrentMapArea(var5); // L: 325
			var6 = true; // L: 326
		}

		if (var6 || var4) { // L: 328
			this.jump(var1, var2, var3); // L: 329
		}

	} // L: 331

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 334
		if (var2 != null) { // L: 335
			this.setCurrentMapArea(var2); // L: 336
		}

	} // L: 338

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1020439482"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 341 342 344
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Lfa;",
		garbageValue = "25"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 348
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "-1508783399"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 352
			this.initializeWorldMapManager(var1); // L: 355
			this.jump(-1, -1, -1); // L: 356
		}
	} // L: 353 357

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "908397980"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 360
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 361
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 362
	} // L: 363

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lfa;Liw;Liw;ZI)V",
		garbageValue = "-749408227"
	)
	public void method6147(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 366
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 369
				this.initializeWorldMapManager(var1); // L: 370
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 372
				this.jump(var2.plane, var2.x, var2.y); // L: 376
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 373
			}

		}
	} // L: 367 378

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2083556923"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 381
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 384
			if (var4 == null) { // L: 385
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 386
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 388
			this.worldMapTargetX = -1; // L: 389
			this.worldMapTargetY = -1; // L: 390
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 391
			this.zoomTarget = this.zoom; // L: 392
			this.field4041 = null; // L: 393
			this.iconIterator = null; // L: 394
			this.worldMapManager.clearIcons(); // L: 395
		}
	} // L: 382 396

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1081774257"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 399
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 400
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 401
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 402
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 403
		if (var7 < 100) { // L: 404
			this.drawLoading(var1, var2, var3, var4, var7); // L: 405
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 408
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 409
				if (!this.worldMapManager.isLoaded()) { // L: 410
					return; // L: 411
				}
			}

			if (this.flashingElements != null) { // L: 414
				++this.flashCycle; // L: 415
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 416
					this.flashCycle = 0; // L: 417
					++this.flashCount; // L: 418
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 420
					this.flashingElements = null; // L: 421
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 424
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 425
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 426
			boolean var10;
			if (!this.elementsDisabled) { // L: 427
				var10 = false; // L: 428
				if (var5 - this.field3999 > 100) { // L: 429
					this.field3999 = var5; // L: 430
					var10 = true; // L: 431
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4037, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 433
			}

			this.method6151(var1, var2, var3, var4, var8, var9); // L: 435
			var10 = Client.staffModLevel >= 2; // L: 438
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 440
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 441
			this.worldMapDisplayHeight = var9; // L: 442
			this.worldMapDisplayX = var1; // L: 443
			this.worldMapDisplayY = var2; // L: 444
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 445
		}
	} // L: 406 446

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-38980544"
	)
	boolean method6142(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 449
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 450
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 451
				return true;
			} else if (this.field4026 != Client.field798) {
				return true; // L: 452
			} else if (var3 <= 0 && var4 <= 0) { // L: 453
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 454
			} else {
				return true; // L: 455
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "166660592"
	)
	void method6151(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (LoginPacket.field2800 != null) { // L: 459
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 460
			int var8 = var3 + 512; // L: 461
			int var9 = var4 + 512; // L: 462
			float var10 = 1.0F; // L: 463
			var8 = (int)((float)var8 / var10); // L: 464
			var9 = (int)((float)var9 / var10); // L: 465
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 466
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 467
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 468
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 469
			if (this.method6142(var8, var9, var13, var14, var3, var4)) { // L: 470
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 471
					Arrays.fill(this.sprite.pixels, 0); // L: 474
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 472
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 475
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 476
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 477
				LoginPacket.field2800.method5247(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 478
				this.field4026 = Client.field798; // L: 479
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 480
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 481
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 483
			if (var10 == 1.0F) { // L: 484
				this.sprite.method7035(var13, var14, 192); // L: 485
			} else {
				this.sprite.method7038(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 488
			}
		}

	} // L: 491

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2047077811"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 494
			if (!this.worldMapManager.isLoaded()) { // L: 497
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 498
				if (!this.worldMapManager.isLoaded()) { // L: 499
					return; // L: 500
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 503
		}
	} // L: 495 504

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1733790373"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 507
	} // L: 508

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-263376647"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 511
		int var7 = var3 / 2 + var1; // L: 512
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 513
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 514
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 515
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 516
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 517
	} // L: 518

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "10"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 521
			return 1.0F;
		} else if (var1 == 37) { // L: 522
			return 1.5F;
		} else if (var1 == 50) { // L: 523
			return 2.0F;
		} else if (var1 == 75) { // L: 524
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 525 526
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-801808132"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 530
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 531
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 532
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 533
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 534 535
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1078712730"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 539
	} // L: 540

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "114"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 543
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lfa;",
		garbageValue = "1247262475"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 547

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 555
			}

			var3 = (WorldMapArea)var2.next(); // L: 548
		} while(var3.getId() != var1); // L: 550

		return var3; // L: 551
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "902836069"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 559
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 562
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 563
		}
	} // L: 560 564

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-462808636"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 567
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 570
			this.worldMapTargetX = -1; // L: 571
			this.worldMapTargetY = -1; // L: 572
		}
	} // L: 568 573

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1944417243"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 576
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 579
			if (var4 != null) { // L: 580
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 581
			}

		}
	} // L: 577 583

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2114706132"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 586
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 589
			if (var4 != null) { // L: 590
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 591
			}

		}
	} // L: 587 593

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-407384794"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 596 597 599
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1052524051"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 603 604 606
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "680807554"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 610 611 613
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-12956"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 617
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 621
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "69"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 625
			this.maxFlashCount = var1; // L: 626
		}

	} // L: 628

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2107849699"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 631
	} // L: 632

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2136117532"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 635
			this.cyclesPerFlash = var1; // L: 636
		}

	} // L: 638

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 641
	} // L: 642

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1146559262"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 645
	} // L: 646

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "9389136"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 649
		this.flashingElements.add(var1); // L: 650
		this.flashCount = 0; // L: 651
		this.flashCycle = 0; // L: 652
	} // L: 653

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "156861495"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 656
		this.flashCount = 0; // L: 657
		this.flashCycle = 0; // L: 658

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 659
			if (Archive.WorldMapElement_get(var2) != null && Archive.WorldMapElement_get(var2).category == var1) { // L: 660 663
				this.flashingElements.add(Archive.WorldMapElement_get(var2).objectId); // L: 664
			}
		}

	} // L: 667

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1840445078"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 670
	} // L: 671

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1467263825"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 674
	} // L: 675

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1998904362"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 678
			this.enabledElements.add(var1); // L: 679
		} else {
			this.enabledElements.remove(var1); // L: 682
		}

		this.method6182(); // L: 684
	} // L: 685

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1964224308"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 688
			this.enabledCategories.add(var1); // L: 689
		} else {
			this.enabledCategories.remove(var1); // L: 692
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 694
			if (Archive.WorldMapElement_get(var3) != null && Archive.WorldMapElement_get(var3).category == var1) { // L: 695 698
				int var4 = Archive.WorldMapElement_get(var3).objectId; // L: 699
				if (!var2) { // L: 700
					this.enabledElementIds.add(var4); // L: 701
				} else {
					this.enabledElementIds.remove(var4); // L: 704
				}
			}
		}

		this.method6182(); // L: 708
	} // L: 709

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-268102441"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 712
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-89"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 716
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-348662358"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 720
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1439307571"
	)
	void method6182() {
		this.field4037.clear(); // L: 724
		this.field4037.addAll(this.enabledElements); // L: 725
		this.field4037.addAll(this.enabledElementIds); // L: 726
	} // L: 727

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1475137861"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 730
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 733
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 734
			List var9 = this.worldMapManager.method3526(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 735
			if (!var9.isEmpty()) { // L: 736
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 739
						return; // L: 755
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 740
					WorldMapElement var12 = Archive.WorldMapElement_get(var11.getElement()); // L: 742
					var13 = false; // L: 743

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 744
						if (var12.menuActions[var14] != null) { // L: 745
							class22.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 746
							var13 = true; // L: 747
						}
					}
				} while(!var13); // L: 750

			}
		}
	} // L: 731 737 751

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILiw;I)Liw;",
		garbageValue = "1919686510"
	)
	public Coord method6184(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 758
			return null; // L: 759
		} else if (!this.worldMapManager.isLoaded()) { // L: 761
			return null; // L: 762
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 764
			return null; // L: 765
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 767
			List var4 = (List)var3.get(var1); // L: 768
			if (var4 != null && !var4.isEmpty()) { // L: 769
				AbstractWorldMapIcon var5 = null; // L: 772
				int var6 = -1; // L: 773
				Iterator var7 = var4.iterator(); // L: 774

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 789
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 775
						int var9 = var8.coord2.x - var2.x; // L: 777
						int var10 = var8.coord2.y - var2.y; // L: 778
						var11 = var10 * var10 + var9 * var9; // L: 779
						if (var11 == 0) { // L: 780
							return var8.coord2; // L: 781
						}
					} while(var11 >= var6 && var5 != null); // L: 783

					var5 = var8; // L: 784
					var6 = var11; // L: 785
				}
			} else {
				return null; // L: 770
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IILiw;Liw;B)V",
		garbageValue = "89"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 793
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 794
		var5.setArgs(new Object[]{var6}); // L: 795
		switch(var1) { // L: 796
		case 1008:
			var5.setType(10); // L: 804
			break; // L: 805
		case 1009:
			var5.setType(11); // L: 819
			break;
		case 1010:
			var5.setType(12); // L: 809
			break; // L: 810
		case 1011:
			var5.setType(13); // L: 814
			break; // L: 815
		case 1012:
			var5.setType(14); // L: 799
		}

		WorldMapSection1.runScriptEvent(var5); // L: 823
	} // L: 824

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lgh;",
		garbageValue = "604534686"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 827
			return null; // L: 828
		} else if (!this.worldMapManager.isLoaded()) { // L: 830
			return null; // L: 831
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 833
			this.field4041 = new LinkedList(); // L: 834
			Iterator var2 = var1.values().iterator(); // L: 835

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 836
				this.field4041.addAll(var3); // L: 838
			}

			this.iconIterator = this.field4041.iterator(); // L: 841
			return this.iconNext(); // L: 842
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lgh;",
		garbageValue = "-379304026"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 846
			return null; // L: 847
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 849
					return null; // L: 855
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 850
			} while(var1.getElement() == -1); // L: 851

			return var1; // L: 852
		}
	}
}
