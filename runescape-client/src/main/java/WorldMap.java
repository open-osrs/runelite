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

@ObfuscatedName("mr")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("c")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("r")
	@Export("details")
	HashMap details;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	WorldMapArea field4007;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1751776365
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1683320435
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -751777809
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -336489583
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("y")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ac")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1643261397
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1632358729
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1337127919
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1148708503
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1727442279
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1918242041
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("aw")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ap")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -77181029
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2142589891
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1086120873
	)
	int field4026;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 641837143
	)
	int field4012;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1952031231
	)
	int field4028;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1367433461
	)
	int field4029;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 5480394132200405517L
	)
	long field4030;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1651460063
	)
	int field4031;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1141378953
	)
	int field4032;
	@ObfuscatedName("ab")
	boolean field4033;
	@ObfuscatedName("ar")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ak")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("an")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ah")
	HashSet field4005;
	@ObfuscatedName("ae")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 736836363
	)
	int field4021;
	@ObfuscatedName("bn")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bi")
	List field4047;
	@ObfuscatedName("bb")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bk")
	HashSet field4027;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ba")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1390297175
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 744893993
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1355273529
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1222034053
	)
	int field4039;

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
		this.field4026 = -1; // L: 74
		this.field4012 = -1; // L: 75
		this.field4028 = -1; // L: 76
		this.field4029 = -1; // L: 77
		this.field4033 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4005 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4021 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4027 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4039 = -1; // L: 101
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;Lir;Lkq;Ljava/util/HashMap;[Low;I)V",
		garbageValue = "733115823"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field1768.name); // L: 115
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1101698518"
	)
	public void method6148() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 133
	} // L: 135

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-953768475"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method2936(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class19.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4027.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4027.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						class19.runScriptEvent(var14); // L: 174
					}
				}

				this.field4027 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "-86"
	)
	public void method6197(int var1, int var2, boolean var3, boolean var4) {
		long var5 = ObjectSound.currentTimeMillis(); // L: 182
		this.method6080(var1, var2, var4, var5); // L: 183
		if (this.hasTarget() || !var4 && !var3) { // L: 184
			this.method6179(); // L: 198
		} else {
			if (var4) { // L: 185
				this.field4028 = var1; // L: 186
				this.field4029 = var2; // L: 187
				this.field4026 = this.centerTileX; // L: 188
				this.field4012 = this.centerTileY; // L: 189
			}

			if (this.field4026 != -1) { // L: 191
				int var7 = var1 - this.field4028; // L: 192
				int var8 = var2 - this.field4029; // L: 193
				this.setWorldMapPosition(this.field4026 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4012, false); // L: 194
			}
		}

		if (var4) { // L: 200
			this.field4030 = var5; // L: 201
			this.field4031 = var1; // L: 202
			this.field4032 = var2; // L: 203
		}

	} // L: 205

	@ObfuscatedName("b")
	void method6080(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 208
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 209
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 210
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 211
			if (this.mouseCoord != null && var3) { // L: 212
				boolean var8 = Client.staffModLevel >= 2; // L: 215
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 217
					class9.method123(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 218
				} else {
					boolean var9 = true; // L: 221
					if (this.field4033) { // L: 222
						int var10 = var1 - this.field4031; // L: 223
						int var11 = var2 - this.field4032; // L: 224
						if (var4 - this.field4030 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 225
							var9 = false; // L: 226
						}
					}

					if (var9) { // L: 229
						PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher); // L: 230
						var12.packetBuffer.method6625(this.mouseCoord.packed()); // L: 231
						Client.packetWriter.addNode(var12); // L: 232
						this.field4030 = 0L; // L: 233
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 238
		}

	} // L: 239

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1837270270"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class105.field1331 != null) { // L: 242
			this.zoom = this.zoomTarget; // L: 243
		} else {
			if (this.zoom < this.zoomTarget) { // L: 246
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 247
			}

			if (this.zoom > this.zoomTarget) { // L: 249
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 250
			}

		}
	} // L: 244 252

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1435545327"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 255
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 258
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 259
			if (var1 != 0) { // L: 260
				var1 /= Math.min(8, Math.abs(var1)); // L: 261
			}

			if (var2 != 0) { // L: 263
				var2 /= Math.min(8, Math.abs(var2)); // L: 264
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 266
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 267
				this.worldMapTargetX = -1; // L: 268
				this.worldMapTargetY = -1; // L: 269
			}

		}
	} // L: 256 271

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1358516193"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 274
		this.centerTileY = var2; // L: 275
		ObjectSound.currentTimeMillis(); // L: 276
		if (var3) {
			this.method6179(); // L: 277
		}

	} // L: 278

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1371340744"
	)
	final void method6179() {
		this.field4029 = -1; // L: 281
		this.field4028 = -1; // L: 282
		this.field4012 = -1; // L: 283
		this.field4026 = -1; // L: 284
	} // L: 285

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1558869849"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 288
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)Leq;",
		garbageValue = "-2036677867"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 292

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 300
			}

			var5 = (WorldMapArea)var4.next(); // L: 293
		} while(!var5.containsCoord(var1, var2, var3)); // L: 295

		return var5; // L: 296
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-105"
	)
	public void method6116(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 304
		if (var5 == null) { // L: 305
			if (!var4) { // L: 306
				return; // L: 309
			}

			var5 = this.mainMapArea; // L: 307
		}

		boolean var6 = false; // L: 311
		if (var5 != this.field4007 || var4) { // L: 312
			this.field4007 = var5; // L: 313
			this.setCurrentMapArea(var5); // L: 314
			var6 = true; // L: 315
		}

		if (var6 || var4) { // L: 317
			this.jump(var1, var2, var3); // L: 318
		}

	} // L: 320

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-278872438"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 323
		if (var2 != null) { // L: 324
			this.setCurrentMapArea(var2); // L: 325
		}

	} // L: 327

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-549031120"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 330 331 333
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Leq;",
		garbageValue = "13"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 337
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Leq;S)V",
		garbageValue = "14713"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 341
			this.initializeWorldMapManager(var1); // L: 344
			this.jump(-1, -1, -1); // L: 345
		}
	} // L: 342 346

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leq;B)V",
		garbageValue = "1"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 349
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 350
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 351
	} // L: 352

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Leq;Lhk;Lhk;ZI)V",
		garbageValue = "-1033794508"
	)
	public void method6264(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 355
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 358
				this.initializeWorldMapManager(var1); // L: 359
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 361
				this.jump(var2.plane, var2.x, var2.y); // L: 365
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 362
			}

		}
	} // L: 356 367

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-445360101"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 370
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 373
			if (var4 == null) { // L: 374
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 375
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 377
			this.worldMapTargetX = -1; // L: 378
			this.worldMapTargetY = -1; // L: 379
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 380
			this.zoomTarget = this.zoom; // L: 381
			this.field4047 = null; // L: 382
			this.iconIterator = null; // L: 383
			this.worldMapManager.clearIcons(); // L: 384
		}
	} // L: 371 385

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-546604535"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 388
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 389
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 390
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 391
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 392
		if (var7 < 100) { // L: 393
			this.drawLoading(var1, var2, var3, var4, var7); // L: 394
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 397
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 398
				if (!this.worldMapManager.isLoaded()) { // L: 399
					return; // L: 400
				}
			}

			if (this.flashingElements != null) { // L: 403
				++this.flashCycle; // L: 404
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 405
					this.flashCycle = 0; // L: 406
					++this.flashCount; // L: 407
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 409
					this.flashingElements = null; // L: 410
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 413
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 414
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 415
			boolean var10;
			if (!this.elementsDisabled) { // L: 416
				var10 = false; // L: 417
				if (var5 - this.field4021 > 100) { // L: 418
					this.field4021 = var5; // L: 419
					var10 = true; // L: 420
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4005, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 422
			}

			this.method6096(var1, var2, var3, var4, var8, var9); // L: 424
			var10 = Client.staffModLevel >= 2; // L: 427
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 429
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 430
			this.worldMapDisplayHeight = var9; // L: 431
			this.worldMapDisplayX = var1; // L: 432
			this.worldMapDisplayY = var2; // L: 433
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 434
		}
	} // L: 395 435

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-1240841312"
	)
	boolean method6095(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 438
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 439
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 440
				return true;
			} else if (this.field4039 != Client.field623) {
				return true; // L: 441
			} else if (var3 <= 0 && var4 <= 0) { // L: 442
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 443
			} else {
				return true; // L: 444
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "217911820"
	)
	void method6096(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class105.field1331 != null) { // L: 448
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 449
			int var8 = var3 + 512; // L: 450
			int var9 = var4 + 512; // L: 451
			float var10 = 1.0F; // L: 452
			var8 = (int)((float)var8 / var10); // L: 453
			var9 = (int)((float)var9 / var10); // L: 454
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 455
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 456
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 457
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 458
			if (this.method6095(var8, var9, var13, var14, var3, var4)) { // L: 459
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 460
					Arrays.fill(this.sprite.pixels, 0); // L: 463
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 461
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 464
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 465
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 466
				class105.field1331.method4658(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 467
				this.field4039 = Client.field623; // L: 468
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 469
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 470
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 472
			if (1.0F == var10) { // L: 473
				this.sprite.method6991(var13, var14, 192); // L: 474
			} else {
				this.sprite.method7010(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192); // L: 477
			}
		}

	} // L: 480

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1928614918"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 483
			if (!this.worldMapManager.isLoaded()) { // L: 486
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 487
				if (!this.worldMapManager.isLoaded()) { // L: 488
					return; // L: 489
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 492
		}
	} // L: 484 493

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-478155082"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 496
	} // L: 497

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-13"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 500
		int var7 = var3 / 2 + var1; // L: 501
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 502
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 503
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 504
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 505
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 506
	} // L: 507

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1463277853"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 510
			return 1.0F;
		} else if (var1 == 37) { // L: 511
			return 1.5F;
		} else if (var1 == 50) { // L: 512
			return 2.0F;
		} else if (var1 == 75) { // L: 513
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 514 515
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 519
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 520
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 521
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) { // L: 522
			return 75;
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 523 524
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7601"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 528
	} // L: 529

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "112"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 532
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Leq;",
		garbageValue = "324822975"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 536

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 544
			}

			var3 = (WorldMapArea)var2.next(); // L: 537
		} while(var3.getId() != var1); // L: 539

		return var3; // L: 540
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "21"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 548
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 551
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 552
		}
	} // L: 549 553

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "585943441"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 556
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 559
			this.worldMapTargetX = -1; // L: 560
			this.worldMapTargetY = -1; // L: 561
		}
	} // L: 557 562

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2024921554"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 565
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 568
			if (var4 != null) { // L: 569
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 570
			}

		}
	} // L: 566 572

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "92"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 575
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 578
			if (var4 != null) { // L: 579
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 580
			}

		}
	} // L: 576 582

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-132740090"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 585 586 588
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "923209033"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 592 593 595
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "-1553151088"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 599 600 602
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1469564176"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 606
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2065229363"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 610
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1186313481"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 614
			this.maxFlashCount = var1; // L: 615
		}

	} // L: 617

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1255497148"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 620
	} // L: 621

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-433512779"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 624
			this.cyclesPerFlash = var1; // L: 625
		}

	} // L: 627

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1067426400"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 630
	} // L: 631

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "667819567"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 634
	} // L: 635

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-773455874"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 638
		this.flashingElements.add(var1); // L: 639
		this.flashCount = 0; // L: 640
		this.flashCycle = 0; // L: 641
	} // L: 642

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1749900916"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 645
		this.flashCount = 0; // L: 646
		this.flashCycle = 0; // L: 647

		for (int var2 = 0; var2 < class370.WorldMapElement_count; ++var2) { // L: 648
			if (ByteArrayPool.WorldMapElement_get(var2) != null && ByteArrayPool.WorldMapElement_get(var2).category == var1) { // L: 649 652
				this.flashingElements.add(ByteArrayPool.WorldMapElement_get(var2).objectId); // L: 653
			}
		}

	} // L: 656

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1053661130"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 659
	} // L: 660

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1814568635"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 663
	} // L: 664

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1973422189"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 667
			this.enabledElements.add(var1); // L: 668
		} else {
			this.enabledElements.remove(var1); // L: 671
		}

		this.method6128(); // L: 673
	} // L: 674

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "8"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 677
			this.enabledCategories.add(var1); // L: 678
		} else {
			this.enabledCategories.remove(var1); // L: 681
		}

		for (int var3 = 0; var3 < class370.WorldMapElement_count; ++var3) { // L: 683
			if (ByteArrayPool.WorldMapElement_get(var3) != null && ByteArrayPool.WorldMapElement_get(var3).category == var1) { // L: 684 687
				int var4 = ByteArrayPool.WorldMapElement_get(var3).objectId; // L: 688
				if (!var2) { // L: 689
					this.enabledElementIds.add(var4); // L: 690
				} else {
					this.enabledElementIds.remove(var4); // L: 693
				}
			}
		}

		this.method6128(); // L: 697
	} // L: 698

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "565606727"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 701
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1222988471"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 705
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "15510212"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 709
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2070055474"
	)
	void method6128() {
		this.field4005.clear(); // L: 713
		this.field4005.addAll(this.enabledElements); // L: 714
		this.field4005.addAll(this.enabledElementIds); // L: 715
	} // L: 716

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "551646228"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 719
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 722
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 723
			List var9 = this.worldMapManager.method2936(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 724
			if (!var9.isEmpty()) { // L: 725
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 728
						return; // L: 744
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 729
					WorldMapElement var12 = ByteArrayPool.WorldMapElement_get(var11.getElement()); // L: 731
					var13 = false; // L: 732

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 733
						if (var12.menuActions[var14] != null) { // L: 734
							SpriteMask.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 735
							var13 = true; // L: 736
						}
					}
				} while(!var13); // L: 739

			}
		}
	} // L: 720 726 740

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILhk;B)Lhk;",
		garbageValue = "-88"
	)
	public Coord method6130(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 747
			return null; // L: 748
		} else if (!this.worldMapManager.isLoaded()) { // L: 750
			return null; // L: 751
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 753
			return null; // L: 754
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 756
			List var4 = (List)var3.get(var1); // L: 757
			if (var4 != null && !var4.isEmpty()) { // L: 758
				AbstractWorldMapIcon var5 = null; // L: 761
				int var6 = -1; // L: 762
				Iterator var7 = var4.iterator(); // L: 763

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 778
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 764
						int var9 = var8.coord2.x - var2.x; // L: 766
						int var10 = var8.coord2.y - var2.y; // L: 767
						var11 = var9 * var9 + var10 * var10; // L: 768
						if (var11 == 0) { // L: 769
							return var8.coord2; // L: 770
						}
					} while(var11 >= var6 && var5 != null); // L: 772

					var5 = var8; // L: 773
					var6 = var11; // L: 774
				}
			} else {
				return null; // L: 759
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IILhk;Lhk;I)V",
		garbageValue = "765993102"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 782
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 783
		var5.setArgs(new Object[]{var6}); // L: 784
		switch(var1) { // L: 785
		case 1008:
			var5.setType(10); // L: 808
			break;
		case 1009:
			var5.setType(11); // L: 798
			break; // L: 799
		case 1010:
			var5.setType(12); // L: 803
			break; // L: 804
		case 1011:
			var5.setType(13); // L: 788
			break;
		case 1012:
			var5.setType(14); // L: 793
		}

		class19.runScriptEvent(var5); // L: 812
	} // L: 813

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lfg;",
		garbageValue = "1625574905"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 816
			return null; // L: 817
		} else if (!this.worldMapManager.isLoaded()) { // L: 819
			return null; // L: 820
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 822
			this.field4047 = new LinkedList(); // L: 823
			Iterator var2 = var1.values().iterator(); // L: 824

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 825
				this.field4047.addAll(var3); // L: 827
			}

			this.iconIterator = this.field4047.iterator(); // L: 830
			return this.iconNext(); // L: 831
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)Lfg;",
		garbageValue = "23"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 835
			return null; // L: 836
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 838
					return null; // L: 844
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 839
			} while(var1.getElement() == -1); // L: 840

			return var1; // L: 841
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1611977737"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}
}
