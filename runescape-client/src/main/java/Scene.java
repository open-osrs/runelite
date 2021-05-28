import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("v")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("e")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("g")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("a")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("k")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("m")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("x")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("z")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("w")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("t")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("h")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("q")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("i")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("ae")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("ap")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("ab")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("al")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lhj;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("ai")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("ar")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("ag")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("ax")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("as")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("aj")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("am")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("ac")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("at")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lgn;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("ao")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("af")
	static final int[] field2338;
	@ObfuscatedName("ak")
	static final int[] field2352;
	@ObfuscatedName("ay")
	static final int[] field2340;
	@ObfuscatedName("aa")
	static final int[] field2341;
	@ObfuscatedName("au")
	static final int[] field2342;
	@ObfuscatedName("an")
	static final int[] field2305;
	@ObfuscatedName("bd")
	static final int[] field2344;
	@ObfuscatedName("bz")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("bh")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("bs")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("br")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("bf")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("ba")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("be")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("bj")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("n")
	@Export("planes")
	int planes;
	@ObfuscatedName("f")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("y")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("p")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[[[Lgx;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("r")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lhj;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("s")
	int[][][] field2301;
	@ObfuscatedName("bv")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("bm")
	@Export("tileRotation2D")
	int[][] tileRotation2D;

	static {
		Scene_isLowDetail = true; // L: 8
		tileUpdateCount = 0; // L: 22
		Scene_plane = 0; // L: 23
		gameObjects = new GameObject[100]; // L: 38
		checkClick = false; // L: 39
		Scene_selectedPlane = 0; // L: 40
		Scene_selectedScreenX = 0; // L: 41
		Scene_selectedScreenY = 0; // L: 42
		Scene_selectedX = -1; // L: 43
		Scene_selectedY = -1; // L: 44
		viewportWalking = false; // L: 45
		Scene_planesCount = 4; // L: 48
		Scene_planeOccluderCounts = new int[Scene_planesCount]; // L: 49
		Scene_planeOccluders = new Occluder[Scene_planesCount][500]; // L: 50
		Scene_currentOccludersCount = 0; // L: 51
		Scene_currentOccluders = new Occluder[500]; // L: 52
		Scene_tilesDeque = new NodeDeque(); // L: 53
		field2338 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field2352 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field2340 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field2341 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field2342 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field2305 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field2344 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
		visibilityMap = new boolean[8][32][51][51]; // L: 86
	}

	public Scene(int var1, int var2, int var3, int[][][] var4) {
		this.minPlane = 0; // L: 14
		this.tempGameObjectsCount = 0; // L: 15
		this.tempGameObjects = new GameObject[5000]; // L: 16
		this.tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}}; // L: 65
		this.tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}}; // L: 80
		this.planes = var1; // L: 96
		this.xSize = var2; // L: 97
		this.ySize = var3; // L: 98
		this.tiles = new Tile[var1][var2][var3]; // L: 99
		this.field2301 = new int[var1][var2 + 1][var3 + 1]; // L: 100
		this.tileHeights = var4; // L: 101
		this.clear(); // L: 102
	} // L: 103

	@ObfuscatedName("v")
	@Export("clear")
	public void clear() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.planes; ++var1) { // L: 106
			for (var2 = 0; var2 < this.xSize; ++var2) { // L: 107
				for (int var3 = 0; var3 < this.ySize; ++var3) { // L: 108
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < Scene_planesCount; ++var1) { // L: 111
			for (var2 = 0; var2 < Scene_planeOccluderCounts[var1]; ++var2) { // L: 112
				Scene_planeOccluders[var1][var2] = null;
			}

			Scene_planeOccluderCounts[var1] = 0; // L: 113
		}

		for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 115
			this.tempGameObjects[var1] = null; // L: 116
		}

		this.tempGameObjectsCount = 0; // L: 118

		for (var1 = 0; var1 < gameObjects.length; ++var1) { // L: 119
			gameObjects[var1] = null;
		}

	} // L: 120

	@ObfuscatedName("n")
	@Export("init")
	public void init(int var1) {
		this.minPlane = var1; // L: 123

		for (int var2 = 0; var2 < this.xSize; ++var2) { // L: 124
			for (int var3 = 0; var3 < this.ySize; ++var3) { // L: 125
				if (this.tiles[var1][var2][var3] == null) { // L: 126
					this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	} // L: 129

	@ObfuscatedName("f")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2]; // L: 132

		for (int var4 = 0; var4 < 3; ++var4) { // L: 133
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2]; // L: 134
			if (var5 != null) { // L: 135
				--var5.plane; // L: 136

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) { // L: 137
					GameObject var7 = var5.gameObjects[var6]; // L: 138
					long var9 = var7.tag; // L: 140
					int var11 = (int)(var9 >>> 14 & 3L); // L: 144
					boolean var8 = var11 == 2; // L: 146
					if (var8 && var7.startX == var1 && var2 == var7.startY) { // L: 148
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) { // L: 152
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3; // L: 153
		this.tiles[3][var1][var2] = null; // L: 154
	} // L: 155

	@ObfuscatedName("p")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 174
		if (var5 != null) { // L: 175
			this.tiles[var1][var2][var3].minPlane = var4; // L: 176
		}
	} // L: 177

	@ObfuscatedName("j")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) { // L: 180
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false); // L: 181

			for (var22 = var1; var22 >= 0; --var22) { // L: 182
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 183
		} else if (var4 != 1) { // L: 186
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 192

			for (var22 = var1; var22 >= 0; --var22) { // L: 193
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23; // L: 194
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 187

			for (var22 = var1; var22 >= 0; --var22) { // L: 188
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 189
		}
	} // L: 184 190 195

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIILgl;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 198
			FloorDecoration var9 = new FloorDecoration(); // L: 199
			var9.renderable = var5; // L: 200
			var9.x = var2 * 128 + 64; // L: 201
			var9.y = var3 * 128 + 64; // L: 202
			var9.tileHeight = var4; // L: 203
			var9.tag = var6; // L: 204
			var9.flags = var8; // L: 205
			if (this.tiles[var1][var2][var3] == null) { // L: 206
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9; // L: 207
		}
	} // L: 208

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIILgl;JLgl;Lgl;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 211
		var10.first = var5; // L: 212
		var10.x = var2 * 128 + 64; // L: 213
		var10.y = var3 * 128 + 64; // L: 214
		var10.tileHeight = var4; // L: 215
		var10.tag = var6; // L: 216
		var10.second = var8; // L: 217
		var10.third = var9; // L: 218
		int var11 = 0; // L: 219
		Tile var12 = this.tiles[var1][var2][var3]; // L: 220
		if (var12 != null) { // L: 221
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) { // L: 222
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) { // L: 223
					Model var14 = (Model)var12.gameObjects[var13].renderable; // L: 224
					var14.calculateBoundsCylinder(); // L: 225
					if (var14.height > var11) { // L: 226
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11; // L: 230
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3); // L: 231
		}

		this.tiles[var1][var2][var3].itemLayer = var10; // L: 232
	} // L: 233

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIILgl;Lgl;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 236
			BoundaryObject var12 = new BoundaryObject(); // L: 237
			var12.tag = var9; // L: 238
			var12.flags = var11; // L: 239
			var12.x = var2 * 128 + 64; // L: 240
			var12.y = var3 * 128 + 64; // L: 241
			var12.tileHeight = var4; // L: 242
			var12.renderable1 = var5; // L: 243
			var12.renderable2 = var6; // L: 244
			var12.orientationA = var7; // L: 245
			var12.orientationB = var8; // L: 246

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3); // L: 247
				}
			}

			this.tiles[var1][var2][var3].boundaryObject = var12; // L: 248
		}
	} // L: 249

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIILgl;Lgl;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 252
			WallDecoration var14 = new WallDecoration(); // L: 253
			var14.tag = var11; // L: 254
			var14.flags = var13; // L: 255
			var14.x = var2 * 128 + 64; // L: 256
			var14.y = var3 * 128 + 64; // L: 257
			var14.tileHeight = var4; // L: 258
			var14.renderable1 = var5; // L: 259
			var14.renderable2 = var6; // L: 260
			var14.orientation = var7; // L: 261
			var14.orientation2 = var8; // L: 262
			var14.xOffset = var9; // L: 263
			var14.yOffset = var10; // L: 264

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3); // L: 265
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14; // L: 266
		}
	} // L: 267

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgl;IJI)Z"
	)
	public boolean method4007(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 270
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 271
			int var13 = var6 * 64 + var3 * 128; // L: 272
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 273
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgl;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) { // L: 277
			return true;
		} else {
			int var11 = var2 - var5; // L: 278
			int var12 = var3 - var5; // L: 279
			int var13 = var5 + var2; // L: 280
			int var14 = var3 + var5; // L: 281
			if (var10) { // L: 282
				if (var7 > 640 && var7 < 1408) { // L: 283
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) { // L: 284
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) { // L: 285
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) { // L: 286
					var11 -= 128;
				}
			}

			var11 /= 128; // L: 288
			var12 /= 128; // L: 289
			var13 /= 128; // L: 290
			var14 /= 128; // L: 291
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 292
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgl;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 296 297
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILgl;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) { // L: 301
			for (var16 = var3; var16 < var3 + var5; ++var16) { // L: 302
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) { // L: 303
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16]; // L: 304
				if (var23 != null && var23.gameObjectsCount >= 5) { // L: 305
					return false;
				}
			}
		}

		GameObject var21 = new GameObject(); // L: 308
		var21.tag = var12; // L: 309
		var21.flags = var14; // L: 310
		var21.plane = var1; // L: 311
		var21.centerX = var6; // L: 312
		var21.centerY = var7; // L: 313
		var21.height = var8; // L: 314
		var21.renderable = var9; // L: 315
		var21.orientation = var10; // L: 316
		var21.startX = var2; // L: 317
		var21.startY = var3; // L: 318
		var21.endX = var2 + var4 - 1; // L: 319
		var21.endY = var3 + var5 - 1; // L: 320

		for (var16 = var2; var16 < var2 + var4; ++var16) { // L: 321
			for (int var17 = var3; var17 < var3 + var5; ++var17) { // L: 322
				int var18 = 0; // L: 323
				if (var16 > var2) { // L: 324
					++var18;
				}

				if (var16 < var2 + var4 - 1) { // L: 325
					var18 += 4;
				}

				if (var17 > var3) { // L: 326
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) { // L: 327
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17); // L: 328
					}
				}

				Tile var22 = this.tiles[var1][var16][var17]; // L: 329
				var22.gameObjects[var22.gameObjectsCount] = var21; // L: 330
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18; // L: 331
				var22.gameObjectsEdgeMask |= var18; // L: 333
				++var22.gameObjectsCount; // L: 334
			}
		}

		if (var11) { // L: 337
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true; // L: 338
	}

	@ObfuscatedName("e")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 342
			GameObject var2 = this.tempGameObjects[var1]; // L: 343
			this.removeGameObject(var2); // L: 344
			this.tempGameObjects[var1] = null; // L: 345
		}

		this.tempGameObjectsCount = 0; // L: 347
	} // L: 348

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lhj;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) { // L: 351
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) { // L: 352
				Tile var4 = this.tiles[var1.plane][var2][var3]; // L: 353
				if (var4 != null) { // L: 354
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 355
						if (var4.gameObjects[var5] == var1) { // L: 356
							--var4.gameObjectsCount; // L: 357

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) { // L: 358
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1]; // L: 359
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1]; // L: 360
							}

							var4.gameObjects[var4.gameObjectsCount] = null; // L: 362
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0; // L: 366

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 367
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5]; // L: 369
					}
				}
			}
		}

	} // L: 374

	@ObfuscatedName("a")
	public void method3967(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 377
		if (var5 != null) { // L: 378
			WallDecoration var6 = var5.wallDecoration; // L: 379
			if (var6 != null) { // L: 380
				var6.xOffset = var4 * var6.xOffset / 16; // L: 381
				var6.yOffset = var4 * var6.yOffset / 16; // L: 382
			}
		}
	} // L: 383

	@ObfuscatedName("k")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 386
		if (var4 != null) {
			var4.boundaryObject = null; // L: 388
		}
	} // L: 387 389

	@ObfuscatedName("m")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 392
		if (var4 != null) {
			var4.wallDecoration = null; // L: 394
		}
	} // L: 393 395

	@ObfuscatedName("x")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 398
		if (var4 != null) { // L: 399
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 400
				GameObject var6 = var4.gameObjects[var5]; // L: 401
				if (UserComparator8.method2437(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 402
					this.removeGameObject(var6); // L: 403
					return; // L: 404
				}
			}

		}
	} // L: 407

	@ObfuscatedName("z")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 410
		if (var4 != null) {
			var4.floorDecoration = null; // L: 412
		}
	} // L: 411 413

	@ObfuscatedName("w")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 416
		if (var4 != null) {
			var4.itemLayer = null; // L: 418
		}
	} // L: 417 419

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Lhw;"
	)
	public BoundaryObject method4089(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 422
		return var4 == null ? null : var4.boundaryObject; // L: 423 424
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)Lho;"
	)
	public WallDecoration method3948(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 428
		return var4 == null ? null : var4.wallDecoration; // L: 429 430
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Lhj;"
	)
	public GameObject method3926(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 434
		if (var4 == null) { // L: 435
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 436
				GameObject var6 = var4.gameObjects[var5]; // L: 437
				long var8 = var6.tag; // L: 439
				int var10 = (int)(var8 >>> 14 & 3L); // L: 443
				boolean var7 = var10 == 2; // L: 445
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 447
					return var6;
				}
			}

			return null; // L: 449
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Lgo;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 453
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null; // L: 454 455
	}

	@ObfuscatedName("ae")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 459
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L; // L: 460 461
	}

	@ObfuscatedName("ap")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 465
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L; // L: 466 467
	}

	@ObfuscatedName("ab")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 471
		if (var4 == null) { // L: 472
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 473
				GameObject var6 = var4.gameObjects[var5]; // L: 474
				long var8 = var6.tag; // L: 476
				int var10 = (int)(var8 >>> 14 & 3L); // L: 480
				boolean var7 = var10 == 2; // L: 482
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 484
					return var6.tag;
				}
			}

			return 0L; // L: 486
		}
	}

	@ObfuscatedName("al")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 490
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L; // L: 491 492
	}

	@ObfuscatedName("ad")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 496
		if (var6 == null) { // L: 497
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) { // L: 498
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) { // L: 499
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) { // L: 500
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 501
				if (var6.gameObjects[var7].tag == var4) { // L: 502
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 504
		}
	}

	@ObfuscatedName("ai")
	public void method3955(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 508
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 509
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 510
					Tile var7 = this.tiles[var4][var5][var6]; // L: 511
					if (var7 != null) { // L: 512
						BoundaryObject var8 = var7.boundaryObject; // L: 513
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 514
							ModelData var9 = (ModelData)var8.renderable1; // L: 515
							this.method3957(var9, var4, var5, var6, 1, 1); // L: 516
							if (var8.renderable2 instanceof ModelData) { // L: 517
								var10 = (ModelData)var8.renderable2; // L: 518
								this.method3957(var10, var4, var5, var6, 1, 1); // L: 519
								ModelData.method3774(var9, var10, 0, 0, 0, false); // L: 520
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 521
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 523
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 525
							GameObject var14 = var7.gameObjects[var12]; // L: 526
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 527
								ModelData var11 = (ModelData)var14.renderable; // L: 528
								this.method3957(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 529
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 530
							}
						}

						FloorDecoration var13 = var7.floorDecoration; // L: 533
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 534
							var10 = (ModelData)var13.renderable; // L: 535
							this.method4076(var10, var4, var5, var6); // L: 536
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 537
						}
					}
				}
			}
		}

	} // L: 543

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lgm;III)V"
	)
	void method4076(ModelData var1, int var2, int var3, int var4) {
		Tile var5;
		ModelData var6;
		if (var3 < this.xSize) { // L: 546
			var5 = this.tiles[var2][var3 + 1][var4]; // L: 547
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 548
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 549
				ModelData.method3774(var1, var6, 128, 0, 0, true); // L: 550
			}
		}

		if (var4 < this.xSize) { // L: 553
			var5 = this.tiles[var2][var3][var4 + 1]; // L: 554
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 555
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 556
				ModelData.method3774(var1, var6, 0, 0, 128, true); // L: 557
			}
		}

		if (var3 < this.xSize && var4 < this.ySize) { // L: 560
			var5 = this.tiles[var2][var3 + 1][var4 + 1]; // L: 561
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 562
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 563
				ModelData.method3774(var1, var6, 128, 0, 128, true); // L: 564
			}
		}

		if (var3 < this.xSize && var4 > 0) { // L: 567
			var5 = this.tiles[var2][var3 + 1][var4 - 1]; // L: 568
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 569
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 570
				ModelData.method3774(var1, var6, 128, 0, -128, true); // L: 571
			}
		}

	} // L: 574

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgm;IIIII)V"
	)
	void method3957(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 577
		int var8 = var3; // L: 578
		int var9 = var3 + var5; // L: 579
		int var10 = var4 - 1; // L: 580
		int var11 = var4 + var6; // L: 581

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 582
			if (var12 != this.planes) { // L: 583
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 584
					if (var13 >= 0 && var13 < this.xSize) { // L: 585
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 586
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 587 588
								Tile var15 = this.tiles[var12][var13][var14]; // L: 589
								if (var15 != null) { // L: 590
									int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4; // L: 591
									BoundaryObject var17 = var15.boundaryObject; // L: 592
									if (var17 != null) { // L: 593
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 594
											var18 = (ModelData)var17.renderable1; // L: 595
											ModelData.method3774(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 596
										}

										if (var17.renderable2 instanceof ModelData) { // L: 598
											var18 = (ModelData)var17.renderable2; // L: 599
											ModelData.method3774(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 600
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 603
										GameObject var19 = var15.gameObjects[var23]; // L: 604
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 605
											ModelData var20 = (ModelData)var19.renderable; // L: 606
											int var21 = var19.endX - var19.startX + 1; // L: 607
											int var22 = var19.endY - var19.startY + 1; // L: 608
											ModelData.method3774(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 609
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 614
				var7 = false; // L: 615
			}
		}

	} // L: 617

	@ObfuscatedName("ax")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 620
		if (var7 != null) { // L: 621
			SceneTilePaint var8 = var7.paint; // L: 622
			int var10;
			if (var8 != null) { // L: 623
				int var18 = var8.rgb; // L: 624
				if (var18 != 0) { // L: 625
					for (var10 = 0; var10 < 4; ++var10) { // L: 626
						var1[var2] = var18; // L: 627
						var1[var2 + 1] = var18; // L: 628
						var1[var2 + 2] = var18; // L: 629
						var1[var2 + 3] = var18; // L: 630
						var2 += var3; // L: 631
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 635
				if (var9 != null) { // L: 636
					var10 = var9.shape; // L: 637
					int var11 = var9.rotation; // L: 638
					int var12 = var9.underlayRgb; // L: 639
					int var13 = var9.overlayRgb; // L: 640
					int[] var14 = this.tileShape2D[var10]; // L: 641
					int[] var15 = this.tileRotation2D[var11]; // L: 642
					int var16 = 0; // L: 643
					int var17;
					if (var12 != 0) { // L: 644
						for (var17 = 0; var17 < 4; ++var17) { // L: 645
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 646
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 647
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 648
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 649
							var2 += var3; // L: 650
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 654
							if (var14[var15[var16++]] != 0) { // L: 655
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 656
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 657
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 658
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 659
						}
					}

				}
			}
		}
	} // L: 633 662

	@ObfuscatedName("am")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 741
			checkClick = true; // L: 742
			viewportWalking = var4; // L: 743
			Scene_selectedPlane = var1; // L: 744
			Scene_selectedScreenX = var2; // L: 745
			Scene_selectedScreenY = var3; // L: 746
			Scene_selectedX = -1; // L: 747
			Scene_selectedY = -1; // L: 748
		}
	} // L: 749

	@ObfuscatedName("az")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 752
	} // L: 753

	@ObfuscatedName("at")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 765
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 766
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 767
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 768
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 769
			var4 = 128;
		} else if (var4 > 383) { // L: 770
			var4 = 383;
		}

		++Scene_drawnCount; // L: 771
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 772
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 773
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 774
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 775
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 776
		Scene_cameraX = var1; // L: 777
		Scene_cameraY = var2; // L: 778
		Scene_cameraZ = var3; // L: 779
		Scene_cameraXTile = var1 / 128; // L: 780
		Scene_cameraYTile = var3 / 128; // L: 781
		Scene_plane = var6; // L: 782
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 783
		if (Scene_cameraXTileMin < 0) { // L: 784
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 785
		if (Scene_cameraYTileMin < 0) { // L: 786
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 787
		if (Scene_cameraXTileMax > this.xSize) { // L: 788
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 789
		if (Scene_cameraYTileMax > this.ySize) { // L: 790
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 791
		tileUpdateCount = 0; // L: 792

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 793
			var8 = this.tiles[var7]; // L: 794

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 795
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 796
					Tile var16 = var8[var9][var10]; // L: 797
					if (var16 != null) { // L: 798
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 799
							var16.drawPrimary = true; // L: 805
							var16.drawSecondary = true; // L: 806
							if (var16.gameObjectsCount > 0) { // L: 807
								var16.drawGameObjects = true;
							} else {
								var16.drawGameObjects = false; // L: 808
							}

							++tileUpdateCount; // L: 809
						} else {
							var16.drawPrimary = false; // L: 800
							var16.drawSecondary = false; // L: 801
							var16.drawGameObjectEdges = 0; // L: 802
						}
					}
				}
			}
		}

		int var11;
		int var12;
		int var13;
		int var14;
		Tile var15;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 815
			var8 = this.tiles[var7]; // L: 816

			for (var9 = -25; var9 <= 0; ++var9) { // L: 817
				var10 = var9 + Scene_cameraXTile; // L: 818
				var11 = Scene_cameraXTile - var9; // L: 819
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 820
					for (var12 = -25; var12 <= 0; ++var12) { // L: 821
						var13 = var12 + Scene_cameraYTile; // L: 822
						var14 = Scene_cameraYTile - var12; // L: 823
						if (var10 >= Scene_cameraXTileMin) { // L: 824
							if (var13 >= Scene_cameraYTileMin) { // L: 825
								var15 = var8[var10][var13]; // L: 826
								if (var15 != null && var15.drawPrimary) { // L: 827
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 829
								var15 = var8[var10][var14]; // L: 830
								if (var15 != null && var15.drawPrimary) { // L: 831
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 834
							if (var13 >= Scene_cameraYTileMin) { // L: 835
								var15 = var8[var11][var13]; // L: 836
								if (var15 != null && var15.drawPrimary) { // L: 837
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 839
								var15 = var8[var11][var14]; // L: 840
								if (var15 != null && var15.drawPrimary) { // L: 841
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 844
							checkClick = false; // L: 845
							return; // L: 846
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 852
			var8 = this.tiles[var7]; // L: 853

			for (var9 = -25; var9 <= 0; ++var9) { // L: 854
				var10 = var9 + Scene_cameraXTile; // L: 855
				var11 = Scene_cameraXTile - var9; // L: 856
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 857
					for (var12 = -25; var12 <= 0; ++var12) { // L: 858
						var13 = var12 + Scene_cameraYTile; // L: 859
						var14 = Scene_cameraYTile - var12; // L: 860
						if (var10 >= Scene_cameraXTileMin) { // L: 861
							if (var13 >= Scene_cameraYTileMin) { // L: 862
								var15 = var8[var10][var13]; // L: 863
								if (var15 != null && var15.drawPrimary) { // L: 864
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 866
								var15 = var8[var10][var14]; // L: 867
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false); // L: 868
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 871
							if (var13 >= Scene_cameraYTileMin) { // L: 872
								var15 = var8[var11][var13]; // L: 873
								if (var15 != null && var15.drawPrimary) { // L: 874
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 876
								var15 = var8[var11][var14]; // L: 877
								if (var15 != null && var15.drawPrimary) { // L: 878
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 881
							checkClick = false; // L: 882
							return; // L: 883
						}
					}
				}
			}
		}

		checkClick = false; // L: 889
	} // L: 890

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgx;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 893

		while (true) {
			Tile var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Tile[][] var8;
			Tile var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										BoundaryObject var10;
										GameObject var12;
										int var17;
										int var18;
										boolean var20;
										int var21;
										Tile var36;
										while (true) {
											do {
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 895
												if (var3 == null) { // L: 896
													return;
												}
											} while(!var3.drawSecondary); // L: 897

											var4 = var3.x; // L: 898
											var5 = var3.y; // L: 899
											var6 = var3.plane; // L: 900
											var7 = var3.originalPlane; // L: 901
											var8 = this.tiles[var6]; // L: 902
											if (!var3.drawPrimary) { // L: 903
												break;
											}

											if (var2) { // L: 904
												if (var6 > 0) { // L: 905
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 906
													if (var9 != null && var9.drawSecondary) { // L: 907
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 909
													var9 = var8[var4 - 1][var5]; // L: 910
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 911
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 913
													var9 = var8[var4 + 1][var5]; // L: 914
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 915
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 917
													var9 = var8[var4][var5 - 1]; // L: 918
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 919
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 921
													var9 = var8[var4][var5 + 1]; // L: 922
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 923
														continue;
													}
												}
											} else {
												var2 = true; // L: 926
											}

											var3.drawPrimary = false; // L: 927
											if (var3.linkedBelowTile != null) { // L: 928
												var9 = var3.linkedBelowTile; // L: 929
												if (var9.paint != null) { // L: 930
													if (!this.method3972(0, var4, var5)) { // L: 931
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method3972(0, var4, var5)) { // L: 933 934
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.boundaryObject; // L: 936
												if (var10 != null) { // L: 937
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.tileHeight - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 938
													var12 = var9.gameObjects[var11]; // L: 939
													if (var12 != null) { // L: 940
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.height - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 943
											if (var3.paint != null) { // L: 944
												if (!this.method3972(var7, var4, var5)) { // L: 945
													var20 = true; // L: 946
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 947
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method3972(var7, var4, var5)) { // L: 950 951
												var20 = true; // L: 952
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 953
											}

											var21 = 0; // L: 956
											var11 = 0; // L: 957
											BoundaryObject var31 = var3.boundaryObject; // L: 958
											WallDecoration var13 = var3.wallDecoration; // L: 959
											if (var31 != null || var13 != null) { // L: 960
												if (var4 == Scene_cameraXTile) { // L: 961
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 962
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 963
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 964
													var21 += 6;
												}

												var11 = field2338[var21]; // L: 965
												var3.field2235 = field2340[var21]; // L: 966
											}

											if (var31 != null) { // L: 968
												if ((var31.orientationA & field2352[var21]) != 0) { // L: 969
													if (var31.orientationA == 16) { // L: 970
														var3.drawGameObjectEdges = 3; // L: 971
														var3.field2254 = field2341[var21]; // L: 972
														var3.field2244 = 3 - var3.field2254; // L: 973
													} else if (var31.orientationA == 32) { // L: 975
														var3.drawGameObjectEdges = 6; // L: 976
														var3.field2254 = field2342[var21]; // L: 977
														var3.field2244 = 6 - var3.field2254; // L: 978
													} else if (var31.orientationA == 64) { // L: 980
														var3.drawGameObjectEdges = 12; // L: 981
														var3.field2254 = field2305[var21]; // L: 982
														var3.field2244 = 12 - var3.field2254; // L: 983
													} else {
														var3.drawGameObjectEdges = 9; // L: 986
														var3.field2254 = field2344[var21]; // L: 987
														var3.field2244 = 9 - var3.field2254; // L: 988
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 991
												}

												if ((var31.orientationA & var11) != 0 && !this.method3973(var7, var4, var5, var31.orientationA)) { // L: 992
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method3973(var7, var4, var5, var31.orientationB)) { // L: 993
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method3974(var7, var4, var5, var13.renderable1.height)) { // L: 995
												if ((var13.orientation & var11) != 0) { // L: 996
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.x - Scene_cameraX + var13.xOffset, var13.tileHeight - Scene_cameraY, var13.y - Scene_cameraZ + var13.yOffset, var13.tag); // L: 997
												} else if (var13.orientation == 256) { // L: 999
													var14 = var13.x - Scene_cameraX; // L: 1000
													var15 = var13.tileHeight - Scene_cameraY; // L: 1001
													var16 = var13.y - Scene_cameraZ; // L: 1002
													var17 = var13.orientation2; // L: 1003
													if (var17 != 1 && var17 != 2) { // L: 1005
														var18 = var14; // L: 1006
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 1008
														var19 = var16; // L: 1009
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 1010
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 1011
													} else if (var13.renderable2 != null) { // L: 1013
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 1014
													}
												}
											}

											if (var20) { // L: 1018
												FloorDecoration var22 = var3.floorDecoration; // L: 1019
												if (var22 != null) { // L: 1020
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x - Scene_cameraX, var22.tileHeight - Scene_cameraY, var22.y - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 1021
												if (var23 != null && var23.height == 0) { // L: 1022
													if (var23.second != null) { // L: 1023
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 1024
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 1025
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1028
											if (var14 != 0) { // L: 1029
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1030
													var36 = var8[var4 + 1][var5]; // L: 1031
													if (var36 != null && var36.drawSecondary) { // L: 1032
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1034
													var36 = var8[var4][var5 + 1]; // L: 1035
													if (var36 != null && var36.drawSecondary) { // L: 1036
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1038
													var36 = var8[var4 - 1][var5]; // L: 1039
													if (var36 != null && var36.drawSecondary) { // L: 1040
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1042
													var36 = var8[var4][var5 - 1]; // L: 1043
													if (var36 != null && var36.drawSecondary) { // L: 1044
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1048
											var20 = true; // L: 1049

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1050
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field2254) { // L: 1051
													var20 = false; // L: 1052
													break; // L: 1053
												}
											}

											if (var20) { // L: 1056
												var10 = var3.boundaryObject; // L: 1057
												if (!this.method3973(var7, var4, var5, var10.orientationA)) { // L: 1058
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.tileHeight - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1059
											}
										}

										if (!var3.drawGameObjects) { // L: 1062
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1064
											var3.drawGameObjects = false; // L: 1065
											var21 = 0; // L: 1066

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1067
												var12 = var3.gameObjects[var11]; // L: 1068
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1069
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1070
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1071
															var36 = var8[var24][var14]; // L: 1072
															if (var36.drawPrimary) { // L: 1073
																var3.drawGameObjects = true; // L: 1074
																continue label563; // L: 1075
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1077
																var16 = 0; // L: 1078
																if (var24 > var12.startX) { // L: 1079
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1080
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1081
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1082
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field2244) { // L: 1083
																	var3.drawGameObjects = true; // L: 1084
																	continue label563; // L: 1085
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1090
													var24 = Scene_cameraXTile - var12.startX; // L: 1091
													var14 = var12.endX - Scene_cameraXTile; // L: 1092
													if (var14 > var24) { // L: 1093
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1094
													var16 = var12.endY - Scene_cameraYTile; // L: 1095
													if (var16 > var15) { // L: 1096
														var12.field2554 = var24 + var16;
													} else {
														var12.field2554 = var24 + var15; // L: 1097
													}
												}
											}

											while (var21 > 0) { // L: 1100
												var11 = -50; // L: 1101
												var25 = -1; // L: 1102

												for (var24 = 0; var24 < var21; ++var24) { // L: 1103
													GameObject var35 = gameObjects[var24]; // L: 1104
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1105
														if (var35.field2554 > var11) { // L: 1106
															var11 = var35.field2554; // L: 1107
															var25 = var24; // L: 1108
														} else if (var11 == var35.field2554) { // L: 1110
															var15 = var35.centerX - Scene_cameraX; // L: 1111
															var16 = var35.centerY - Scene_cameraZ; // L: 1112
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1113
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1114
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1115
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1119
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1120
												var33.lastDrawn = Scene_drawnCount; // L: 1121
												if (!this.method3975(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1122
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.height - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1123
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1125
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1126
														Tile var26 = var8[var14][var15]; // L: 1127
														if (var26.drawGameObjectEdges != 0) { // L: 1128
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1129
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1133
												break;
											}
										} catch (Exception var28) { // L: 1135
											var3.drawGameObjects = false; // L: 1136
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1139
							} while(var3.drawGameObjectEdges != 0); // L: 1140

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1141
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1142
						} while(var9 != null && var9.drawSecondary); // L: 1143

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1145
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1146
					} while(var9 != null && var9.drawSecondary); // L: 1147

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1149
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1150
				} while(var9 != null && var9.drawSecondary); // L: 1151

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1153
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1154
			} while(var9 != null && var9.drawSecondary); // L: 1155

			var3.drawSecondary = false; // L: 1157
			--tileUpdateCount; // L: 1158
			ItemLayer var32 = var3.itemLayer; // L: 1159
			if (var32 != null && var32.height != 0) { // L: 1160
				if (var32.second != null) { // L: 1161
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1162
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1163
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field2235 != 0) { // L: 1165
				WallDecoration var29 = var3.wallDecoration; // L: 1166
				if (var29 != null && !this.method3974(var7, var4, var5, var29.renderable1.height)) { // L: 1167
					if ((var29.orientation & var3.field2235) != 0) { // L: 1168
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x - Scene_cameraX + var29.xOffset, var29.tileHeight - Scene_cameraY, var29.y - Scene_cameraZ + var29.yOffset, var29.tag); // L: 1169
					} else if (var29.orientation == 256) { // L: 1171
						var11 = var29.x - Scene_cameraX; // L: 1172
						var25 = var29.tileHeight - Scene_cameraY; // L: 1173
						var24 = var29.y - Scene_cameraZ; // L: 1174
						var14 = var29.orientation2; // L: 1175
						if (var14 != 1 && var14 != 2) { // L: 1177
							var15 = var11; // L: 1178
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1180
							var16 = var24; // L: 1181
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1182
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1183
						} else if (var29.renderable2 != null) { // L: 1185
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1186
						}
					}
				}

				BoundaryObject var27 = var3.boundaryObject; // L: 1190
				if (var27 != null) { // L: 1191
					if ((var27.orientationB & var3.field2235) != 0 && !this.method3973(var7, var4, var5, var27.orientationB)) { // L: 1192
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.tileHeight - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field2235) != 0 && !this.method3973(var7, var4, var5, var27.orientationA)) { // L: 1193
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.tileHeight - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1196
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1197
				if (var30 != null && var30.drawSecondary) { // L: 1198
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1200
				var30 = var8[var4 + 1][var5]; // L: 1201
				if (var30 != null && var30.drawSecondary) { // L: 1202
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1204
				var30 = var8[var4][var5 + 1]; // L: 1205
				if (var30 != null && var30.drawSecondary) { // L: 1206
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1208
				var30 = var8[var4 - 1][var5]; // L: 1209
				if (var30 != null && var30.drawSecondary) { // L: 1210
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1212
				var30 = var8[var4][var5 - 1]; // L: 1213
				if (var30 != null && var30.drawSecondary) { // L: 1214
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1222
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1224
		int var13;
		int var14 = var13 = var10 + 128; // L: 1226
		int var15;
		int var16 = var15 = var12 + 128; // L: 1228
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1229
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1230
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1231
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1232
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1233
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1234
		var10 = var21; // L: 1235
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1236
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1237
		var17 = var21; // L: 1238
		if (var12 >= 50) { // L: 1239
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1240
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1241
			var14 = var21; // L: 1242
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1243
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1244
			var18 = var21; // L: 1245
			if (var11 >= 50) { // L: 1246
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1247
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1248
				var13 = var21; // L: 1249
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1250
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1251
				var19 = var21; // L: 1252
				if (var16 >= 50) { // L: 1253
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1254
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1255
					var9 = var21; // L: 1256
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1257
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1258
					if (var15 >= 50) { // L: 1260
						int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1261
						int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1262
						int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1263
						int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1264
						int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1265
						int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1266
						int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1267
						int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1268
						Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1269
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1270
							Rasterizer3D.field2262 = false; // L: 1271
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1272
								Rasterizer3D.field2262 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1273
								Scene_selectedX = var7; // L: 1274
								Scene_selectedY = var8; // L: 1275
							}

							if (var1.texture == -1) { // L: 1277
								if (var1.neColor != 12345678) { // L: 1278
									Rasterizer3D.method3854(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1280
								if (var1.isFlat) { // L: 1281
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1282
								}
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1285
								Rasterizer3D.method3854(var27, var29, var25, var26, var28, var24, method3969(var30, var1.neColor), method3969(var30, var1.nwColor), method3969(var30, var1.seColor)); // L: 1286
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1289
							Rasterizer3D.field2262 = false; // L: 1290
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1291
								Rasterizer3D.field2262 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1292
								Scene_selectedX = var7; // L: 1293
								Scene_selectedY = var8; // L: 1294
							}

							if (var1.texture == -1) { // L: 1296
								if (var1.swColor != 12345678) { // L: 1297
									Rasterizer3D.method3854(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1299
								Rasterizer3D.drawTexturedTile(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1300
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1303
								Rasterizer3D.method3854(var23, var25, var29, var22, var24, var28, method3969(var30, var1.swColor), method3969(var30, var1.seColor), method3969(var30, var1.nwColor)); // L: 1304
							}
						}

					}
				}
			}
		}
	} // L: 1307

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1310

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1311
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1312
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1313
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1314
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1315
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1316
			var10 = var13; // L: 1317
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1318
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1319
			if (var12 < 50) { // L: 1321
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1322
				SceneTileModel.field2417[var9] = var10; // L: 1323
				SceneTileModel.field2418[var9] = var13; // L: 1324
				SceneTileModel.field2419[var9] = var12; // L: 1325
			}

			SceneTileModel.field2402[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1327
			SceneTileModel.field2416[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1328
		}

		Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1330
		var8 = var1.faceX.length; // L: 1331

		for (var9 = 0; var9 < var8; ++var9) { // L: 1332
			var10 = var1.faceX[var9]; // L: 1333
			var11 = var1.faceY[var9]; // L: 1334
			var12 = var1.faceZ[var9]; // L: 1335
			var13 = SceneTileModel.field2402[var10]; // L: 1336
			int var14 = SceneTileModel.field2402[var11]; // L: 1337
			int var15 = SceneTileModel.field2402[var12]; // L: 1338
			int var16 = SceneTileModel.field2416[var10]; // L: 1339
			int var17 = SceneTileModel.field2416[var11]; // L: 1340
			int var18 = SceneTileModel.field2416[var12]; // L: 1341
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1342
				Rasterizer3D.field2262 = false; // L: 1343
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1344
					Rasterizer3D.field2262 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1345
					Scene_selectedX = var6; // L: 1346
					Scene_selectedY = var7; // L: 1347
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1349
					if (!Scene_isLowDetail) { // L: 1353
						if (var1.isFlat) { // L: 1354
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2417[0], SceneTileModel.field2417[1], SceneTileModel.field2417[3], SceneTileModel.field2418[0], SceneTileModel.field2418[1], SceneTileModel.field2418[3], SceneTileModel.field2419[0], SceneTileModel.field2419[1], SceneTileModel.field2419[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2417[var10], SceneTileModel.field2417[var11], SceneTileModel.field2417[var12], SceneTileModel.field2418[var10], SceneTileModel.field2418[var11], SceneTileModel.field2418[var12], SceneTileModel.field2419[var10], SceneTileModel.field2419[var11], SceneTileModel.field2419[var12], var1.triangleTextureId[var9]); // L: 1355
						}
					} else {
						int var19 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1358
						Rasterizer3D.method3854(var16, var17, var18, var13, var14, var15, method3969(var19, var1.triangleColorA[var9]), method3969(var19, var1.triangleColorB[var9]), method3969(var19, var1.triangleColorC[var9])); // L: 1359
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1350
					Rasterizer3D.method3854(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1364

	@ObfuscatedName("ak")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1391
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1392
		Scene_currentOccludersCount = 0; // L: 1393

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1394
			Occluder var4 = var2[var3]; // L: 1395
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1396
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1397
				if (var5 >= 0 && var5 <= 50) { // L: 1398
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1399
					if (var6 < 0) { // L: 1400
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1401
					if (var7 > 50) { // L: 1402
						var7 = 50;
					}

					var13 = false; // L: 1403

					while (var6 <= var7) { // L: 1404
						if (visibleTiles[var5][var6++]) { // L: 1405
							var13 = true; // L: 1406
							break;
						}
					}

					if (var13) { // L: 1410
						var9 = Scene_cameraX - var4.minX; // L: 1411
						if (var9 > 32) { // L: 1412
							var4.field2380 = 1;
						} else {
							if (var9 >= -32) { // L: 1413
								continue;
							}

							var4.field2380 = 2; // L: 1414
							var9 = -var9; // L: 1415
						}

						var4.field2382 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1418
						var4.field2384 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1419
						var4.field2369 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1420
						var4.field2386 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1421
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1422
					}
				}
			} else if (var4.type == 2) { // L: 1425
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1426
				if (var5 >= 0 && var5 <= 50) { // L: 1427
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1428
					if (var6 < 0) { // L: 1429
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1430
					if (var7 > 50) { // L: 1431
						var7 = 50;
					}

					var13 = false; // L: 1432

					while (var6 <= var7) { // L: 1433
						if (visibleTiles[var6++][var5]) { // L: 1434
							var13 = true; // L: 1435
							break;
						}
					}

					if (var13) { // L: 1439
						var9 = Scene_cameraZ - var4.minZ; // L: 1440
						if (var9 > 32) { // L: 1441
							var4.field2380 = 3;
						} else {
							if (var9 >= -32) { // L: 1442
								continue;
							}

							var4.field2380 = 4; // L: 1443
							var9 = -var9; // L: 1444
						}

						var4.field2385 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1447
						var4.field2372 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1448
						var4.field2369 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1449
						var4.field2386 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1450
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1451
					}
				}
			} else if (var4.type == 4) { // L: 1454
				var5 = var4.minY - Scene_cameraY; // L: 1455
				if (var5 > 128) { // L: 1456
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1457
					if (var6 < 0) { // L: 1458
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1459
					if (var7 > 50) { // L: 1460
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1461
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1462
						if (var8 < 0) { // L: 1463
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1464
						if (var9 > 50) { // L: 1465
							var9 = 50;
						}

						boolean var10 = false; // L: 1466

						label148:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1467
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1468
								if (visibleTiles[var11][var12]) { // L: 1469
									var10 = true; // L: 1470
									break label148;
								}
							}
						}

						if (var10) { // L: 1475
							var4.field2380 = 5; // L: 1476
							var4.field2385 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1477
							var4.field2372 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1478
							var4.field2382 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1479
							var4.field2384 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1480
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1481
						}
					}
				}
			}
		}

	} // L: 1485

	@ObfuscatedName("ay")
	boolean method3972(int var1, int var2, int var3) {
		int var4 = this.field2301[var1][var2][var3]; // L: 1488
		if (var4 == -Scene_drawnCount) { // L: 1489
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1490
			return true;
		} else {
			int var5 = var2 << 7; // L: 1491
			int var6 = var3 << 7; // L: 1492
			if (this.method3976(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method3976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method3976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3976(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1493
				this.field2301[var1][var2][var3] = Scene_drawnCount; // L: 1494
				return true; // L: 1495
			} else {
				this.field2301[var1][var2][var3] = -Scene_drawnCount; // L: 1498
				return false; // L: 1499
			}
		}
	}

	@ObfuscatedName("aa")
	boolean method3973(int var1, int var2, int var3, int var4) {
		if (!this.method3972(var1, var2, var3)) { // L: 1504
			return false;
		} else {
			int var5 = var2 << 7; // L: 1505
			int var6 = var3 << 7; // L: 1506
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1507
			int var8 = var7 - 120; // L: 1508
			int var9 = var7 - 230; // L: 1509
			int var10 = var7 - 238; // L: 1510
			if (var4 < 16) { // L: 1511
				if (var4 == 1) { // L: 1512
					if (var5 > Scene_cameraX) { // L: 1513
						if (!this.method3976(var5, var7, var6)) { // L: 1514
							return false;
						}

						if (!this.method3976(var5, var7, var6 + 128)) { // L: 1515
							return false;
						}
					}

					if (var1 > 0) { // L: 1517
						if (!this.method3976(var5, var8, var6)) { // L: 1518
							return false;
						}

						if (!this.method3976(var5, var8, var6 + 128)) { // L: 1519
							return false;
						}
					}

					if (!this.method3976(var5, var9, var6)) { // L: 1521
						return false;
					}

					if (!this.method3976(var5, var9, var6 + 128)) { // L: 1522
						return false;
					}

					return true; // L: 1523
				}

				if (var4 == 2) { // L: 1525
					if (var6 < Scene_cameraZ) { // L: 1526
						if (!this.method3976(var5, var7, var6 + 128)) { // L: 1527
							return false;
						}

						if (!this.method3976(var5 + 128, var7, var6 + 128)) { // L: 1528
							return false;
						}
					}

					if (var1 > 0) { // L: 1530
						if (!this.method3976(var5, var8, var6 + 128)) { // L: 1531
							return false;
						}

						if (!this.method3976(var5 + 128, var8, var6 + 128)) { // L: 1532
							return false;
						}
					}

					if (!this.method3976(var5, var9, var6 + 128)) { // L: 1534
						return false;
					}

					if (!this.method3976(var5 + 128, var9, var6 + 128)) { // L: 1535
						return false;
					}

					return true; // L: 1536
				}

				if (var4 == 4) { // L: 1538
					if (var5 < Scene_cameraX) { // L: 1539
						if (!this.method3976(var5 + 128, var7, var6)) { // L: 1540
							return false;
						}

						if (!this.method3976(var5 + 128, var7, var6 + 128)) { // L: 1541
							return false;
						}
					}

					if (var1 > 0) { // L: 1543
						if (!this.method3976(var5 + 128, var8, var6)) { // L: 1544
							return false;
						}

						if (!this.method3976(var5 + 128, var8, var6 + 128)) { // L: 1545
							return false;
						}
					}

					if (!this.method3976(var5 + 128, var9, var6)) { // L: 1547
						return false;
					}

					if (!this.method3976(var5 + 128, var9, var6 + 128)) { // L: 1548
						return false;
					}

					return true; // L: 1549
				}

				if (var4 == 8) { // L: 1551
					if (var6 > Scene_cameraZ) { // L: 1552
						if (!this.method3976(var5, var7, var6)) { // L: 1553
							return false;
						}

						if (!this.method3976(var5 + 128, var7, var6)) { // L: 1554
							return false;
						}
					}

					if (var1 > 0) { // L: 1556
						if (!this.method3976(var5, var8, var6)) { // L: 1557
							return false;
						}

						if (!this.method3976(var5 + 128, var8, var6)) { // L: 1558
							return false;
						}
					}

					if (!this.method3976(var5, var9, var6)) { // L: 1560
						return false;
					}

					if (!this.method3976(var5 + 128, var9, var6)) { // L: 1561
						return false;
					}

					return true; // L: 1562
				}
			}

			if (!this.method3976(var5 + 64, var10, var6 + 64)) { // L: 1565
				return false;
			} else if (var4 == 16) { // L: 1566
				return this.method3976(var5, var9, var6 + 128); // L: 1567
			} else if (var4 == 32) { // L: 1570
				return this.method3976(var5 + 128, var9, var6 + 128); // L: 1571
			} else if (var4 == 64) { // L: 1574
				return this.method3976(var5 + 128, var9, var6); // L: 1575
			} else if (var4 == 128) { // L: 1578
				return this.method3976(var5, var9, var6); // L: 1579
			} else {
				return true; // L: 1582
			}
		}
	}

	@ObfuscatedName("au")
	boolean method3974(int var1, int var2, int var3, int var4) {
		if (!this.method3972(var1, var2, var3)) { // L: 1586
			return false;
		} else {
			int var5 = var2 << 7; // L: 1587
			int var6 = var3 << 7; // L: 1588
			return this.method3976(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method3976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3976(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1589
		}
	}

	@ObfuscatedName("an")
	boolean method3975(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1594
			if (!this.method3972(var1, var2, var4)) { // L: 1595
				return false;
			} else {
				var7 = var2 << 7; // L: 1596
				var8 = var4 << 7; // L: 1597
				return this.method3976(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method3976(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3976(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3976(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1598
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1601
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1602
					if (this.field2301[var1][var7][var8] == -Scene_drawnCount) { // L: 1603
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1606
			var8 = (var4 << 7) + 2; // L: 1607
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1608
			if (!this.method3976(var7, var9, var8)) { // L: 1609
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1610
				if (!this.method3976(var10, var9, var8)) { // L: 1611
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1612
					if (!this.method3976(var7, var9, var11)) { // L: 1613
						return false;
					} else if (!this.method3976(var10, var9, var11)) { // L: 1614
						return false;
					} else {
						return true; // L: 1615
					}
				}
			}
		}
	}

	@ObfuscatedName("bd")
	boolean method3976(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1619
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1620
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2380 == 1) { // L: 1621
				var6 = var5.minX - var1; // L: 1622
				if (var6 > 0) { // L: 1623
					var7 = (var6 * var5.field2382 >> 8) + var5.minZ; // L: 1624
					var8 = (var6 * var5.field2384 >> 8) + var5.maxZ; // L: 1625
					var9 = (var6 * var5.field2369 >> 8) + var5.minY; // L: 1626
					var10 = (var6 * var5.field2386 >> 8) + var5.maxY; // L: 1627
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1628
						return true;
					}
				}
			} else if (var5.field2380 == 2) { // L: 1632
				var6 = var1 - var5.minX; // L: 1633
				if (var6 > 0) { // L: 1634
					var7 = (var6 * var5.field2382 >> 8) + var5.minZ; // L: 1635
					var8 = (var6 * var5.field2384 >> 8) + var5.maxZ; // L: 1636
					var9 = (var6 * var5.field2369 >> 8) + var5.minY; // L: 1637
					var10 = (var6 * var5.field2386 >> 8) + var5.maxY; // L: 1638
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1639
						return true;
					}
				}
			} else if (var5.field2380 == 3) { // L: 1643
				var6 = var5.minZ - var3; // L: 1644
				if (var6 > 0) { // L: 1645
					var7 = (var6 * var5.field2385 >> 8) + var5.minX; // L: 1646
					var8 = (var6 * var5.field2372 >> 8) + var5.maxX; // L: 1647
					var9 = (var6 * var5.field2369 >> 8) + var5.minY; // L: 1648
					var10 = (var6 * var5.field2386 >> 8) + var5.maxY; // L: 1649
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1650
						return true;
					}
				}
			} else if (var5.field2380 == 4) { // L: 1654
				var6 = var3 - var5.minZ; // L: 1655
				if (var6 > 0) { // L: 1656
					var7 = (var6 * var5.field2385 >> 8) + var5.minX; // L: 1657
					var8 = (var6 * var5.field2372 >> 8) + var5.maxX; // L: 1658
					var9 = (var6 * var5.field2369 >> 8) + var5.minY; // L: 1659
					var10 = (var6 * var5.field2386 >> 8) + var5.maxY; // L: 1660
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1661
						return true;
					}
				}
			} else if (var5.field2380 == 5) { // L: 1665
				var6 = var2 - var5.minY; // L: 1666
				if (var6 > 0) { // L: 1667
					var7 = (var6 * var5.field2385 >> 8) + var5.minX; // L: 1668
					var8 = (var6 * var5.field2372 >> 8) + var5.maxX; // L: 1669
					var9 = (var6 * var5.field2382 >> 8) + var5.minZ; // L: 1670
					var10 = (var6 * var5.field2384 >> 8) + var5.maxZ; // L: 1671
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1672
						return true;
					}
				}
			}
		}

		return false; // L: 1677
	}

	@ObfuscatedName("y")
	@Export("Scene_addOccluder")
	public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder var8 = new Occluder(); // L: 158
		var8.minTileX = var2 / 128; // L: 159
		var8.maxTileX = var3 / 128; // L: 160
		var8.minTileY = var4 / 128; // L: 161
		var8.maxTileY = var5 / 128; // L: 162
		var8.type = var1; // L: 163
		var8.minX = var2; // L: 164
		var8.maxX = var3; // L: 165
		var8.minZ = var4; // L: 166
		var8.maxZ = var5; // L: 167
		var8.minY = var6; // L: 168
		var8.maxY = var7; // L: 169
		Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8; // L: 170
	} // L: 171

	@ObfuscatedName("as")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 665
		Scene_viewportYMin = 0; // L: 666
		Scene_viewportXMax = var3; // L: 667
		Scene_viewportYMax = var4; // L: 668
		Scene_viewportXCenter = var3 / 2; // L: 669
		Scene_viewportYCenter = var4 / 2; // L: 670
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 671

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 672
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 673
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 674
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 675
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 676
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 677
				var8 = (var6 - 128) / 32; // L: 678
				var9 = var7 / 64; // L: 679

				for (int var10 = -26; var10 < 26; ++var10) { // L: 680
					for (var11 = -26; var11 < 26; ++var11) { // L: 681
						var12 = var10 * 128; // L: 682
						int var13 = var11 * 128; // L: 683
						boolean var14 = false; // L: 684

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 685
							if (method3960(var12, var0[var8] + var15, var13)) { // L: 686
								var14 = true; // L: 687
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 691
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 696
			for (var7 = 0; var7 < 32; ++var7) { // L: 697
				for (var8 = -25; var8 < 25; ++var8) { // L: 698
					for (var9 = -25; var9 < 25; ++var9) { // L: 699
						boolean var16 = false; // L: 700

						label84:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 701
							for (var12 = -1; var12 <= 1; ++var12) { // L: 702
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 703
									var16 = true; // L: 704
									break label84;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 707
									var16 = true; // L: 708
									break label84;
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 711
									var16 = true; // L: 712
									break label84; // L: 713
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 715
									var16 = true; // L: 716
									break label84; // L: 717
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 721
					}
				}
			}
		}

	} // L: 726

	@ObfuscatedName("aj")
	static boolean method3960(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 729
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 730
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 731
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 732
		if (var5 >= 50 && var5 <= 3500) { // L: 733
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 734
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 735
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 736
		} else {
			return false; // L: 737
		}
	}

	@ObfuscatedName("av")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 756
	}

	@ObfuscatedName("ac")
	public static void method4047() {
		Scene_selectedX = -1; // L: 760
		viewportWalking = false; // L: 761
	} // L: 762

	@ObfuscatedName("aw")
	static final int method3969(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1367
		if (var1 < 2) { // L: 1368
			var1 = 2;
		} else if (var1 > 126) { // L: 1369
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1370
	}

	@ObfuscatedName("af")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1374
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1375
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1376
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1377
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1378
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1379
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1380
			if (var8 == 0) { // L: 1381
				if (var9 != 0) { // L: 1384
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1385
				} else {
					return true; // L: 1387
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1382
			}
		}
	}
}
