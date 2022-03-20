import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("c")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("x")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("p")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("n")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("m")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("d")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("j")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("f")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("g")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("t")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("k")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("b")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("z")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("ap")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("af")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("ak")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("av")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lhq;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("al")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("aa")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("ao")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("aq")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("ay")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("ac")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("ab")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("az")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("ad")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[Lgg;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("at")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lgg;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("aw")
	static final int[] field2350;
	@ObfuscatedName("aj")
	static final int[] field2351;
	@ObfuscatedName("ax")
	static final int[] field2353;
	@ObfuscatedName("ah")
	static final int[] field2322;
	@ObfuscatedName("ai")
	static final int[] field2354;
	@ObfuscatedName("am")
	static final int[] field2329;
	@ObfuscatedName("be")
	static final int[] field2356;
	@ObfuscatedName("bm")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("bi")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("bw")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("bu")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("bs")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("bb")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("br")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("bh")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("l")
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("e")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("r")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[[[Lgc;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("i")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("w")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lhq;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("a")
	int[][][] field2321;
	@ObfuscatedName("bd")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("bg")
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
		field2350 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field2351 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field2353 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field2322 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field2354 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field2329 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field2356 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
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
		this.field2321 = new int[var1][var2 + 1][var3 + 1]; // L: 100
		this.tileHeights = var4; // L: 101
		this.clear(); // L: 102
	} // L: 103

	@ObfuscatedName("c")
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

	@ObfuscatedName("l")
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

	@ObfuscatedName("s")
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
					boolean var8 = RouteStrategy.method3679(var9) == 2; // L: 142
					if (var8 && var7.startX == var1 && var2 == var7.startY) { // L: 144
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) { // L: 148
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3; // L: 149
		this.tiles[3][var1][var2] = null; // L: 150
	} // L: 151

	@ObfuscatedName("r")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 170
		if (var5 != null) { // L: 171
			this.tiles[var1][var2][var3].minPlane = var4; // L: 172
		}
	} // L: 173

	@ObfuscatedName("o")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) { // L: 176
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false); // L: 177

			for (var22 = var1; var22 >= 0; --var22) { // L: 178
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 179
		} else if (var4 != 1) { // L: 182
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 188

			for (var22 = var1; var22 >= 0; --var22) { // L: 189
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23; // L: 190
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 183

			for (var22 = var1; var22 >= 0; --var22) { // L: 184
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 185
		}
	} // L: 180 186 191

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIILgp;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 194
			FloorDecoration var9 = new FloorDecoration(); // L: 195
			var9.renderable = var5; // L: 196
			var9.x = var2 * 128 + 64; // L: 197
			var9.y = var3 * 128 + 64; // L: 198
			var9.z = var4; // L: 199
			var9.tag = var6; // L: 200
			var9.flags = var8; // L: 201
			if (this.tiles[var1][var2][var3] == null) { // L: 202
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9; // L: 203
		}
	} // L: 204

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIILgp;JLgp;Lgp;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 207
		var10.first = var5; // L: 208
		var10.x = var2 * 128 + 64; // L: 209
		var10.y = var3 * 128 + 64; // L: 210
		var10.tileHeight = var4; // L: 211
		var10.tag = var6; // L: 212
		var10.second = var8; // L: 213
		var10.third = var9; // L: 214
		int var11 = 0; // L: 215
		Tile var12 = this.tiles[var1][var2][var3]; // L: 216
		if (var12 != null) { // L: 217
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) { // L: 218
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) { // L: 219
					Model var14 = (Model)var12.gameObjects[var13].renderable; // L: 220
					var14.calculateBoundsCylinder(); // L: 221
					if (var14.height > var11) { // L: 222
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11; // L: 226
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3); // L: 227
		}

		this.tiles[var1][var2][var3].itemLayer = var10; // L: 228
	} // L: 229

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIILgp;Lgp;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 232
			BoundaryObject var12 = new BoundaryObject(); // L: 233
			var12.tag = var9; // L: 234
			var12.flags = var11; // L: 235
			var12.x = var2 * 128 + 64; // L: 236
			var12.y = var3 * 128 + 64; // L: 237
			var12.z = var4; // L: 238
			var12.renderable1 = var5; // L: 239
			var12.renderable2 = var6; // L: 240
			var12.orientationA = var7; // L: 241
			var12.orientationB = var8; // L: 242

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3); // L: 243
				}
			}

			this.tiles[var1][var2][var3].boundaryObject = var12; // L: 244
		}
	} // L: 245

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIILgp;Lgp;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 248
			WallDecoration var14 = new WallDecoration(); // L: 249
			var14.tag = var11; // L: 250
			var14.flags = var13; // L: 251
			var14.x = var2 * 128 + 64; // L: 252
			var14.y = var3 * 128 + 64; // L: 253
			var14.z = var4; // L: 254
			var14.renderable1 = var5; // L: 255
			var14.renderable2 = var6; // L: 256
			var14.orientation = var7; // L: 257
			var14.orientation2 = var8; // L: 258
			var14.xOffset = var9; // L: 259
			var14.yOffset = var10; // L: 260

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3); // L: 261
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14; // L: 262
		}
	} // L: 263

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgp;IJI)Z"
	)
	public boolean method4027(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 266
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 267
			int var13 = var6 * 64 + var3 * 128; // L: 268
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 269
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgp;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) { // L: 273
			return true;
		} else {
			int var11 = var2 - var5; // L: 274
			int var12 = var3 - var5; // L: 275
			int var13 = var5 + var2; // L: 276
			int var14 = var3 + var5; // L: 277
			if (var10) { // L: 278
				if (var7 > 640 && var7 < 1408) { // L: 279
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) { // L: 280
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) { // L: 281
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) { // L: 282
					var11 -= 128;
				}
			}

			var11 /= 128; // L: 284
			var12 /= 128; // L: 285
			var13 /= 128; // L: 286
			var14 /= 128; // L: 287
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 288
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgp;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 292 293
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILgp;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) { // L: 297
			for (var16 = var3; var16 < var3 + var5; ++var16) { // L: 298
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) { // L: 299
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16]; // L: 300
				if (var23 != null && var23.gameObjectsCount >= 5) { // L: 301
					return false;
				}
			}
		}

		GameObject var21 = new GameObject(); // L: 304
		var21.tag = var12; // L: 305
		var21.flags = var14; // L: 306
		var21.plane = var1; // L: 307
		var21.centerX = var6; // L: 308
		var21.centerY = var7; // L: 309
		var21.z = var8; // L: 310
		var21.renderable = var9; // L: 311
		var21.orientation = var10; // L: 312
		var21.startX = var2; // L: 313
		var21.startY = var3; // L: 314
		var21.endX = var2 + var4 - 1; // L: 315
		var21.endY = var3 + var5 - 1; // L: 316

		for (var16 = var2; var16 < var2 + var4; ++var16) { // L: 317
			for (int var17 = var3; var17 < var3 + var5; ++var17) { // L: 318
				int var18 = 0; // L: 319
				if (var16 > var2) { // L: 320
					++var18;
				}

				if (var16 < var2 + var4 - 1) { // L: 321
					var18 += 4;
				}

				if (var17 > var3) { // L: 322
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) { // L: 323
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17); // L: 324
					}
				}

				Tile var22 = this.tiles[var1][var16][var17]; // L: 325
				var22.gameObjects[var22.gameObjectsCount] = var21; // L: 326
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18; // L: 327
				var22.gameObjectsEdgeMask |= var18; // L: 329
				++var22.gameObjectsCount; // L: 330
			}
		}

		if (var11) { // L: 333
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true; // L: 334
	}

	@ObfuscatedName("x")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 338
			GameObject var2 = this.tempGameObjects[var1]; // L: 339
			this.removeGameObject(var2); // L: 340
			this.tempGameObjects[var1] = null; // L: 341
		}

		this.tempGameObjectsCount = 0; // L: 343
	} // L: 344

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhq;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) { // L: 347
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) { // L: 348
				Tile var4 = this.tiles[var1.plane][var2][var3]; // L: 349
				if (var4 != null) { // L: 350
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 351
						if (var4.gameObjects[var5] == var1) { // L: 352
							--var4.gameObjectsCount; // L: 353

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) { // L: 354
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1]; // L: 355
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1]; // L: 356
							}

							var4.gameObjects[var4.gameObjectsCount] = null; // L: 358
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0; // L: 362

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 363
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5]; // L: 365
					}
				}
			}
		}

	} // L: 370

	@ObfuscatedName("n")
	public void method3912(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 373
		if (var5 != null) { // L: 374
			WallDecoration var6 = var5.wallDecoration; // L: 375
			if (var6 != null) { // L: 376
				var6.xOffset = var4 * var6.xOffset / 16; // L: 377
				var6.yOffset = var4 * var6.yOffset / 16; // L: 378
			}
		}
	} // L: 379

	@ObfuscatedName("m")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 382
		if (var4 != null) {
			var4.boundaryObject = null; // L: 384
		}
	} // L: 383 385

	@ObfuscatedName("d")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 388
		if (var4 != null) {
			var4.wallDecoration = null; // L: 390
		}
	} // L: 389 391

	@ObfuscatedName("j")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 394
		if (var4 != null) { // L: 395
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 396
				GameObject var6 = var4.gameObjects[var5]; // L: 397
				long var8 = var6.tag; // L: 399
				boolean var7 = RouteStrategy.method3679(var8) == 2; // L: 401
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 403
					this.removeGameObject(var6); // L: 404
					return; // L: 405
				}
			}

		}
	} // L: 408

	@ObfuscatedName("f")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 411
		if (var4 != null) {
			var4.floorDecoration = null; // L: 413
		}
	} // L: 412 414

	@ObfuscatedName("g")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 417
		if (var4 != null) {
			var4.itemLayer = null; // L: 419
		}
	} // L: 418 420

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;"
	)
	public BoundaryObject method4002(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 423
		return var4 == null ? null : var4.boundaryObject; // L: 424 425
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Lhc;"
	)
	public WallDecoration method3919(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 429
		return var4 == null ? null : var4.wallDecoration; // L: 430 431
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lhq;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 435
		if (var4 == null) { // L: 436
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 437
				GameObject var6 = var4.gameObjects[var5]; // L: 438
				long var8 = var6.tag; // L: 440
				boolean var7 = RouteStrategy.method3679(var8) == 2; // L: 442
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 444
					return var6;
				}
			}

			return null; // L: 446
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)Lgo;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 450
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null; // L: 451 452
	}

	@ObfuscatedName("ap")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 456
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L; // L: 457 458
	}

	@ObfuscatedName("af")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 462
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L; // L: 463 464
	}

	@ObfuscatedName("ak")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 468
		if (var4 == null) { // L: 469
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 470
				GameObject var6 = var4.gameObjects[var5]; // L: 471
				long var8 = var6.tag; // L: 473
				boolean var7 = RouteStrategy.method3679(var8) == 2; // L: 475
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 477
					return var6.tag;
				}
			}

			return 0L; // L: 479
		}
	}

	@ObfuscatedName("av")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 483
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L; // L: 484 485
	}

	@ObfuscatedName("ar")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 489
		if (var6 == null) { // L: 490
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) { // L: 491
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) { // L: 492
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) { // L: 493
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 494
				if (var6.gameObjects[var7].tag == var4) { // L: 495
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 497
		}
	}

	@ObfuscatedName("al")
	public void method3927(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 501
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 502
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 503
					Tile var7 = this.tiles[var4][var5][var6]; // L: 504
					if (var7 != null) { // L: 505
						BoundaryObject var8 = var7.boundaryObject; // L: 506
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 507
							ModelData var9 = (ModelData)var8.renderable1; // L: 508
							this.method3929(var9, var4, var5, var6, 1, 1); // L: 509
							if (var8.renderable2 instanceof ModelData) { // L: 510
								var10 = (ModelData)var8.renderable2; // L: 511
								this.method3929(var10, var4, var5, var6, 1, 1); // L: 512
								ModelData.method3701(var9, var10, 0, 0, 0, false); // L: 513
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 514
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 516
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 518
							GameObject var14 = var7.gameObjects[var12]; // L: 519
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 520
								ModelData var11 = (ModelData)var14.renderable; // L: 521
								this.method3929(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 522
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 523
							}
						}

						FloorDecoration var13 = var7.floorDecoration; // L: 526
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 527
							var10 = (ModelData)var13.renderable; // L: 528
							this.method4008(var10, var4, var5, var6); // L: 529
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 530
						}
					}
				}
			}
		}

	} // L: 536

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lgq;III)V"
	)
	void method4008(ModelData var1, int var2, int var3, int var4) {
		Tile var5;
		ModelData var6;
		if (var3 < this.xSize) { // L: 539
			var5 = this.tiles[var2][var3 + 1][var4]; // L: 540
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 541
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 542
				ModelData.method3701(var1, var6, 128, 0, 0, true); // L: 543
			}
		}

		if (var4 < this.xSize) { // L: 546
			var5 = this.tiles[var2][var3][var4 + 1]; // L: 547
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 548
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 549
				ModelData.method3701(var1, var6, 0, 0, 128, true); // L: 550
			}
		}

		if (var3 < this.xSize && var4 < this.ySize) { // L: 553
			var5 = this.tiles[var2][var3 + 1][var4 + 1]; // L: 554
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 555
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 556
				ModelData.method3701(var1, var6, 128, 0, 128, true); // L: 557
			}
		}

		if (var3 < this.xSize && var4 > 0) { // L: 560
			var5 = this.tiles[var2][var3 + 1][var4 - 1]; // L: 561
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 562
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 563
				ModelData.method3701(var1, var6, 128, 0, -128, true); // L: 564
			}
		}

	} // L: 567

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lgq;IIIII)V"
	)
	void method3929(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 570
		int var8 = var3; // L: 571
		int var9 = var3 + var5; // L: 572
		int var10 = var4 - 1; // L: 573
		int var11 = var4 + var6; // L: 574

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 575
			if (var12 != this.planes) { // L: 576
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 577
					if (var13 >= 0 && var13 < this.xSize) { // L: 578
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 579
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 580 581
								Tile var15 = this.tiles[var12][var13][var14]; // L: 582
								if (var15 != null) { // L: 583
									int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4; // L: 584
									BoundaryObject var17 = var15.boundaryObject; // L: 585
									if (var17 != null) { // L: 586
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 587
											var18 = (ModelData)var17.renderable1; // L: 588
											ModelData.method3701(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 589
										}

										if (var17.renderable2 instanceof ModelData) { // L: 591
											var18 = (ModelData)var17.renderable2; // L: 592
											ModelData.method3701(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 593
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 596
										GameObject var19 = var15.gameObjects[var23]; // L: 597
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 598
											ModelData var20 = (ModelData)var19.renderable; // L: 599
											int var21 = var19.endX - var19.startX + 1; // L: 600
											int var22 = var19.endY - var19.startY + 1; // L: 601
											ModelData.method3701(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 602
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 607
				var7 = false; // L: 608
			}
		}

	} // L: 610

	@ObfuscatedName("aq")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 613
		if (var7 != null) { // L: 614
			SceneTilePaint var8 = var7.paint; // L: 615
			int var10;
			if (var8 != null) { // L: 616
				int var18 = var8.rgb; // L: 617
				if (var18 != 0) { // L: 618
					for (var10 = 0; var10 < 4; ++var10) { // L: 619
						var1[var2] = var18; // L: 620
						var1[var2 + 1] = var18; // L: 621
						var1[var2 + 2] = var18; // L: 622
						var1[var2 + 3] = var18; // L: 623
						var2 += var3; // L: 624
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 628
				if (var9 != null) { // L: 629
					var10 = var9.shape; // L: 630
					int var11 = var9.rotation; // L: 631
					int var12 = var9.underlayRgb; // L: 632
					int var13 = var9.overlayRgb; // L: 633
					int[] var14 = this.tileShape2D[var10]; // L: 634
					int[] var15 = this.tileRotation2D[var11]; // L: 635
					int var16 = 0; // L: 636
					int var17;
					if (var12 != 0) { // L: 637
						for (var17 = 0; var17 < 4; ++var17) { // L: 638
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 639
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 640
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 641
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 642
							var2 += var3; // L: 643
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 647
							if (var14[var15[var16++]] != 0) { // L: 648
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 649
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 650
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 651
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 652
						}
					}

				}
			}
		}
	} // L: 626 655

	@ObfuscatedName("ab")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 734
			checkClick = true; // L: 735
			viewportWalking = var4; // L: 736
			Scene_selectedPlane = var1; // L: 737
			Scene_selectedScreenX = var2; // L: 738
			Scene_selectedScreenY = var3; // L: 739
			Scene_selectedX = -1; // L: 740
			Scene_selectedY = -1; // L: 741
		}
	} // L: 742

	@ObfuscatedName("as")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 745
	} // L: 746

	@ObfuscatedName("ad")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 758
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 759
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 760
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 761
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 762
			var4 = 128;
		} else if (var4 > 383) { // L: 763
			var4 = 383;
		}

		++Scene_drawnCount; // L: 764
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 765
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 766
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 767
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 768
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 769
		Scene_cameraX = var1; // L: 770
		Scene_cameraY = var2; // L: 771
		Scene_cameraZ = var3; // L: 772
		Scene_cameraXTile = var1 / 128; // L: 773
		Scene_cameraYTile = var3 / 128; // L: 774
		Scene_plane = var6; // L: 775
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 776
		if (Scene_cameraXTileMin < 0) { // L: 777
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 778
		if (Scene_cameraYTileMin < 0) { // L: 779
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 780
		if (Scene_cameraXTileMax > this.xSize) { // L: 781
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 782
		if (Scene_cameraYTileMax > this.ySize) { // L: 783
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 784
		tileUpdateCount = 0; // L: 785

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 786
			var8 = this.tiles[var7]; // L: 787

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 788
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 789
					Tile var16 = var8[var9][var10]; // L: 790
					if (var16 != null) { // L: 791
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 792
							var16.drawPrimary = true; // L: 798
							var16.drawSecondary = true; // L: 799
							if (var16.gameObjectsCount > 0) {
								var16.drawGameObjects = true; // L: 800
							} else {
								var16.drawGameObjects = false; // L: 801
							}

							++tileUpdateCount; // L: 802
						} else {
							var16.drawPrimary = false; // L: 793
							var16.drawSecondary = false; // L: 794
							var16.drawGameObjectEdges = 0; // L: 795
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
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 808
			var8 = this.tiles[var7]; // L: 809

			for (var9 = -25; var9 <= 0; ++var9) { // L: 810
				var10 = var9 + Scene_cameraXTile; // L: 811
				var11 = Scene_cameraXTile - var9; // L: 812
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 813
					for (var12 = -25; var12 <= 0; ++var12) { // L: 814
						var13 = var12 + Scene_cameraYTile; // L: 815
						var14 = Scene_cameraYTile - var12; // L: 816
						if (var10 >= Scene_cameraXTileMin) { // L: 817
							if (var13 >= Scene_cameraYTileMin) { // L: 818
								var15 = var8[var10][var13]; // L: 819
								if (var15 != null && var15.drawPrimary) { // L: 820
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 822
								var15 = var8[var10][var14]; // L: 823
								if (var15 != null && var15.drawPrimary) { // L: 824
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 827
							if (var13 >= Scene_cameraYTileMin) { // L: 828
								var15 = var8[var11][var13]; // L: 829
								if (var15 != null && var15.drawPrimary) { // L: 830
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 832
								var15 = var8[var11][var14]; // L: 833
								if (var15 != null && var15.drawPrimary) { // L: 834
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 837
							checkClick = false; // L: 838
							return; // L: 839
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 845
			var8 = this.tiles[var7]; // L: 846

			for (var9 = -25; var9 <= 0; ++var9) { // L: 847
				var10 = var9 + Scene_cameraXTile; // L: 848
				var11 = Scene_cameraXTile - var9; // L: 849
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 850
					for (var12 = -25; var12 <= 0; ++var12) { // L: 851
						var13 = var12 + Scene_cameraYTile; // L: 852
						var14 = Scene_cameraYTile - var12; // L: 853
						if (var10 >= Scene_cameraXTileMin) { // L: 854
							if (var13 >= Scene_cameraYTileMin) { // L: 855
								var15 = var8[var10][var13]; // L: 856
								if (var15 != null && var15.drawPrimary) { // L: 857
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 859
								var15 = var8[var10][var14]; // L: 860
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false); // L: 861
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 864
							if (var13 >= Scene_cameraYTileMin) { // L: 865
								var15 = var8[var11][var13]; // L: 866
								if (var15 != null && var15.drawPrimary) { // L: 867
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 869
								var15 = var8[var11][var14]; // L: 870
								if (var15 != null && var15.drawPrimary) { // L: 871
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 874
							checkClick = false; // L: 875
							return; // L: 876
						}
					}
				}
			}
		}

		checkClick = false; // L: 882
	} // L: 883

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgc;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 886

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
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 888
												if (var3 == null) { // L: 889
													return;
												}
											} while(!var3.drawSecondary); // L: 890

											var4 = var3.x; // L: 891
											var5 = var3.y; // L: 892
											var6 = var3.plane; // L: 893
											var7 = var3.originalPlane; // L: 894
											var8 = this.tiles[var6]; // L: 895
											if (!var3.drawPrimary) { // L: 896
												break;
											}

											if (var2) { // L: 897
												if (var6 > 0) { // L: 898
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 899
													if (var9 != null && var9.drawSecondary) { // L: 900
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 902
													var9 = var8[var4 - 1][var5]; // L: 903
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 904
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 906
													var9 = var8[var4 + 1][var5]; // L: 907
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 908
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 910
													var9 = var8[var4][var5 - 1]; // L: 911
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 912
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 914
													var9 = var8[var4][var5 + 1]; // L: 915
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 916
														continue;
													}
												}
											} else {
												var2 = true; // L: 919
											}

											var3.drawPrimary = false; // L: 920
											if (var3.linkedBelowTile != null) { // L: 921
												var9 = var3.linkedBelowTile; // L: 922
												if (var9.paint != null) { // L: 923
													if (!this.method3944(0, var4, var5)) { // L: 924
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method3944(0, var4, var5)) { // L: 926 927
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.boundaryObject; // L: 929
												if (var10 != null) { // L: 930
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.z - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 931
													var12 = var9.gameObjects[var11]; // L: 932
													if (var12 != null) { // L: 933
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.z - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 936
											if (var3.paint != null) { // L: 937
												if (!this.method3944(var7, var4, var5)) { // L: 938
													var20 = true; // L: 939
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 940
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method3944(var7, var4, var5)) { // L: 943 944
												var20 = true; // L: 945
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 946
											}

											var21 = 0; // L: 949
											var11 = 0; // L: 950
											BoundaryObject var31 = var3.boundaryObject; // L: 951
											WallDecoration var13 = var3.wallDecoration; // L: 952
											if (var31 != null || var13 != null) { // L: 953
												if (var4 == Scene_cameraXTile) { // L: 954
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 955
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 956
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 957
													var21 += 6;
												}

												var11 = field2350[var21]; // L: 958
												var3.field2243 = field2353[var21]; // L: 959
											}

											if (var31 != null) { // L: 961
												if ((var31.orientationA & field2351[var21]) != 0) { // L: 962
													if (var31.orientationA == 16) { // L: 963
														var3.drawGameObjectEdges = 3; // L: 964
														var3.field2233 = field2322[var21]; // L: 965
														var3.field2252 = 3 - var3.field2233; // L: 966
													} else if (var31.orientationA == 32) { // L: 968
														var3.drawGameObjectEdges = 6; // L: 969
														var3.field2233 = field2354[var21]; // L: 970
														var3.field2252 = 6 - var3.field2233; // L: 971
													} else if (var31.orientationA == 64) { // L: 973
														var3.drawGameObjectEdges = 12; // L: 974
														var3.field2233 = field2329[var21]; // L: 975
														var3.field2252 = 12 - var3.field2233; // L: 976
													} else {
														var3.drawGameObjectEdges = 9; // L: 979
														var3.field2233 = field2356[var21]; // L: 980
														var3.field2252 = 9 - var3.field2233; // L: 981
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 984
												}

												if ((var31.orientationA & var11) != 0 && !this.method3945(var7, var4, var5, var31.orientationA)) { // L: 985
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.z - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method3945(var7, var4, var5, var31.orientationB)) { // L: 986
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.z - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method3979(var7, var4, var5, var13.renderable1.height)) { // L: 988
												if ((var13.orientation & var11) != 0) { // L: 989
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.x - Scene_cameraX + var13.xOffset, var13.z - Scene_cameraY, var13.y - Scene_cameraZ + var13.yOffset, var13.tag); // L: 990
												} else if (var13.orientation == 256) { // L: 992
													var14 = var13.x - Scene_cameraX; // L: 993
													var15 = var13.z - Scene_cameraY; // L: 994
													var16 = var13.y - Scene_cameraZ; // L: 995
													var17 = var13.orientation2; // L: 996
													if (var17 != 1 && var17 != 2) { // L: 998
														var18 = var14; // L: 999
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 1001
														var19 = var16; // L: 1002
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 1003
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 1004
													} else if (var13.renderable2 != null) { // L: 1006
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 1007
													}
												}
											}

											if (var20) { // L: 1011
												FloorDecoration var22 = var3.floorDecoration; // L: 1012
												if (var22 != null) { // L: 1013
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x - Scene_cameraX, var22.z - Scene_cameraY, var22.y - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 1014
												if (var23 != null && var23.height == 0) { // L: 1015
													if (var23.second != null) { // L: 1016
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 1017
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 1018
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1021
											if (var14 != 0) { // L: 1022
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1023
													var36 = var8[var4 + 1][var5]; // L: 1024
													if (var36 != null && var36.drawSecondary) { // L: 1025
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1027
													var36 = var8[var4][var5 + 1]; // L: 1028
													if (var36 != null && var36.drawSecondary) { // L: 1029
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1031
													var36 = var8[var4 - 1][var5]; // L: 1032
													if (var36 != null && var36.drawSecondary) { // L: 1033
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1035
													var36 = var8[var4][var5 - 1]; // L: 1036
													if (var36 != null && var36.drawSecondary) { // L: 1037
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1041
											var20 = true; // L: 1042

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1043
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field2233) { // L: 1044
													var20 = false; // L: 1045
													break; // L: 1046
												}
											}

											if (var20) { // L: 1049
												var10 = var3.boundaryObject; // L: 1050
												if (!this.method3945(var7, var4, var5, var10.orientationA)) { // L: 1051
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.z - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1052
											}
										}

										if (!var3.drawGameObjects) { // L: 1055
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1057
											var3.drawGameObjects = false; // L: 1058
											var21 = 0; // L: 1059

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1060
												var12 = var3.gameObjects[var11]; // L: 1061
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1062
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1063
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1064
															var36 = var8[var24][var14]; // L: 1065
															if (var36.drawPrimary) { // L: 1066
																var3.drawGameObjects = true; // L: 1067
																continue label563; // L: 1068
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1070
																var16 = 0; // L: 1071
																if (var24 > var12.startX) { // L: 1072
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1073
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1074
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1075
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field2252) { // L: 1076
																	var3.drawGameObjects = true; // L: 1077
																	continue label563; // L: 1078
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1083
													var24 = Scene_cameraXTile - var12.startX; // L: 1084
													var14 = var12.endX - Scene_cameraXTile; // L: 1085
													if (var14 > var24) { // L: 1086
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1087
													var16 = var12.endY - Scene_cameraYTile; // L: 1088
													if (var16 > var15) { // L: 1089
														var12.field2584 = var24 + var16;
													} else {
														var12.field2584 = var24 + var15; // L: 1090
													}
												}
											}

											while (var21 > 0) { // L: 1093
												var11 = -50; // L: 1094
												var25 = -1; // L: 1095

												for (var24 = 0; var24 < var21; ++var24) { // L: 1096
													GameObject var35 = gameObjects[var24]; // L: 1097
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1098
														if (var35.field2584 > var11) { // L: 1099
															var11 = var35.field2584; // L: 1100
															var25 = var24; // L: 1101
														} else if (var11 == var35.field2584) { // L: 1103
															var15 = var35.centerX - Scene_cameraX; // L: 1104
															var16 = var35.centerY - Scene_cameraZ; // L: 1105
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1106
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1107
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1108
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1112
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1113
												var33.lastDrawn = Scene_drawnCount; // L: 1114
												if (!this.method3947(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1115
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.z - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1116
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1118
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1119
														Tile var26 = var8[var14][var15]; // L: 1120
														if (var26.drawGameObjectEdges != 0) { // L: 1121
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1122
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1126
												break;
											}
										} catch (Exception var28) { // L: 1128
											var3.drawGameObjects = false; // L: 1129
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1132
							} while(var3.drawGameObjectEdges != 0); // L: 1133

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1134
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1135
						} while(var9 != null && var9.drawSecondary); // L: 1136

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1138
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1139
					} while(var9 != null && var9.drawSecondary); // L: 1140

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1142
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1143
				} while(var9 != null && var9.drawSecondary); // L: 1144

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1146
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1147
			} while(var9 != null && var9.drawSecondary); // L: 1148

			var3.drawSecondary = false; // L: 1150
			--tileUpdateCount; // L: 1151
			ItemLayer var32 = var3.itemLayer; // L: 1152
			if (var32 != null && var32.height != 0) { // L: 1153
				if (var32.second != null) { // L: 1154
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1155
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1156
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field2243 != 0) { // L: 1158
				WallDecoration var29 = var3.wallDecoration; // L: 1159
				if (var29 != null && !this.method3979(var7, var4, var5, var29.renderable1.height)) { // L: 1160
					if ((var29.orientation & var3.field2243) != 0) { // L: 1161
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x - Scene_cameraX + var29.xOffset, var29.z - Scene_cameraY, var29.y - Scene_cameraZ + var29.yOffset, var29.tag); // L: 1162
					} else if (var29.orientation == 256) { // L: 1164
						var11 = var29.x - Scene_cameraX; // L: 1165
						var25 = var29.z - Scene_cameraY; // L: 1166
						var24 = var29.y - Scene_cameraZ; // L: 1167
						var14 = var29.orientation2; // L: 1168
						if (var14 != 1 && var14 != 2) { // L: 1170
							var15 = var11; // L: 1171
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1173
							var16 = var24; // L: 1174
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1175
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1176
						} else if (var29.renderable2 != null) { // L: 1178
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1179
						}
					}
				}

				BoundaryObject var27 = var3.boundaryObject; // L: 1183
				if (var27 != null) { // L: 1184
					if ((var27.orientationB & var3.field2243) != 0 && !this.method3945(var7, var4, var5, var27.orientationB)) { // L: 1185
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.z - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field2243) != 0 && !this.method3945(var7, var4, var5, var27.orientationA)) { // L: 1186
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.z - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1189
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1190
				if (var30 != null && var30.drawSecondary) { // L: 1191
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1193
				var30 = var8[var4 + 1][var5]; // L: 1194
				if (var30 != null && var30.drawSecondary) { // L: 1195
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1197
				var30 = var8[var4][var5 + 1]; // L: 1198
				if (var30 != null && var30.drawSecondary) { // L: 1199
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1201
				var30 = var8[var4 - 1][var5]; // L: 1202
				if (var30 != null && var30.drawSecondary) { // L: 1203
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1205
				var30 = var8[var4][var5 - 1]; // L: 1206
				if (var30 != null && var30.drawSecondary) { // L: 1207
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgj;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1215
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1217
		int var13;
		int var14 = var13 = var10 + 128; // L: 1219
		int var15;
		int var16 = var15 = var12 + 128; // L: 1221
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1222
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1223
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1224
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1225
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1226
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1227
		var10 = var21; // L: 1228
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1229
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1230
		var17 = var21; // L: 1231
		if (var12 >= 50) { // L: 1232
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1233
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1234
			var14 = var21; // L: 1235
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1236
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1237
			var18 = var21; // L: 1238
			if (var11 >= 50) { // L: 1239
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1240
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1241
				var13 = var21; // L: 1242
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1243
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1244
				var19 = var21; // L: 1245
				if (var16 >= 50) { // L: 1246
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1247
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1248
					var9 = var21; // L: 1249
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1250
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1251
					if (var15 >= 50) { // L: 1253
						int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1254
						int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1255
						int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1256
						int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1257
						int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1258
						int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1259
						int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1260
						int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1261
						Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1262
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1263
							Rasterizer3D.field2262 = false; // L: 1264
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1265
								Rasterizer3D.field2262 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1266
								Scene_selectedX = var7; // L: 1267
								Scene_selectedY = var8; // L: 1268
							}

							if (var1.texture == -1) { // L: 1270
								if (var1.neColor != 12345678) { // L: 1271
									Rasterizer3D.method3843(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1273
								if (var1.isFlat) { // L: 1274
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1275
								}
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1278
								Rasterizer3D.method3843(var27, var29, var25, var26, var28, var24, method3941(var30, var1.neColor), method3941(var30, var1.nwColor), method3941(var30, var1.seColor)); // L: 1279
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1282
							Rasterizer3D.field2262 = false; // L: 1283
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1284
								Rasterizer3D.field2262 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1285
								Scene_selectedX = var7; // L: 1286
								Scene_selectedY = var8; // L: 1287
							}

							if (var1.texture == -1) { // L: 1289
								if (var1.swColor != 12345678) { // L: 1290
									Rasterizer3D.method3843(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1292
								Rasterizer3D.drawTexturedTile(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1293
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1296
								Rasterizer3D.method3843(var23, var25, var29, var22, var24, var28, method3941(var30, var1.swColor), method3941(var30, var1.seColor), method3941(var30, var1.nwColor)); // L: 1297
							}
						}

					}
				}
			}
		}
	} // L: 1300

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgt;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1303

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1304
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1305
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1306
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1307
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1308
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1309
			var10 = var13; // L: 1310
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1311
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1312
			if (var12 < 50) { // L: 1314
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1315
				SceneTileModel.field2417[var9] = var10; // L: 1316
				SceneTileModel.field2429[var9] = var13; // L: 1317
				SceneTileModel.field2430[var9] = var12; // L: 1318
			}

			SceneTileModel.field2426[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1320
			SceneTileModel.field2427[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1321
		}

		Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1323
		var8 = var1.faceX.length; // L: 1324

		for (var9 = 0; var9 < var8; ++var9) { // L: 1325
			var10 = var1.faceX[var9]; // L: 1326
			var11 = var1.faceY[var9]; // L: 1327
			var12 = var1.faceZ[var9]; // L: 1328
			var13 = SceneTileModel.field2426[var10]; // L: 1329
			int var14 = SceneTileModel.field2426[var11]; // L: 1330
			int var15 = SceneTileModel.field2426[var12]; // L: 1331
			int var16 = SceneTileModel.field2427[var10]; // L: 1332
			int var17 = SceneTileModel.field2427[var11]; // L: 1333
			int var18 = SceneTileModel.field2427[var12]; // L: 1334
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1335
				Rasterizer3D.field2262 = false; // L: 1336
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1337
					Rasterizer3D.field2262 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1338
					Scene_selectedX = var6; // L: 1339
					Scene_selectedY = var7; // L: 1340
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1342
					if (!Scene_isLowDetail) { // L: 1346
						if (var1.isFlat) { // L: 1347
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2417[0], SceneTileModel.field2417[1], SceneTileModel.field2417[3], SceneTileModel.field2429[0], SceneTileModel.field2429[1], SceneTileModel.field2429[3], SceneTileModel.field2430[0], SceneTileModel.field2430[1], SceneTileModel.field2430[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2417[var10], SceneTileModel.field2417[var11], SceneTileModel.field2417[var12], SceneTileModel.field2429[var10], SceneTileModel.field2429[var11], SceneTileModel.field2429[var12], SceneTileModel.field2430[var10], SceneTileModel.field2430[var11], SceneTileModel.field2430[var12], var1.triangleTextureId[var9]); // L: 1348
						}
					} else {
						int var19 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1351
						Rasterizer3D.method3843(var16, var17, var18, var13, var14, var15, method3941(var19, var1.triangleColorA[var9]), method3941(var19, var1.triangleColorB[var9]), method3941(var19, var1.triangleColorC[var9])); // L: 1352
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1343
					Rasterizer3D.method3843(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1357

	@ObfuscatedName("aj")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1384
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1385
		Scene_currentOccludersCount = 0; // L: 1386

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1387
			Occluder var4 = var2[var3]; // L: 1388
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1389
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1390
				if (var5 >= 0 && var5 <= 50) { // L: 1391
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1392
					if (var6 < 0) { // L: 1393
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1394
					if (var7 > 50) { // L: 1395
						var7 = 50;
					}

					var13 = false; // L: 1396

					while (var6 <= var7) { // L: 1397
						if (visibleTiles[var5][var6++]) { // L: 1398
							var13 = true; // L: 1399
							break;
						}
					}

					if (var13) { // L: 1403
						var9 = Scene_cameraX - var4.minX; // L: 1404
						if (var9 > 32) { // L: 1405
							var4.field2392 = 1;
						} else {
							if (var9 >= -32) { // L: 1406
								continue;
							}

							var4.field2392 = 2; // L: 1407
							var9 = -var9; // L: 1408
						}

						var4.field2398 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1411
						var4.field2396 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1412
						var4.field2397 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1413
						var4.field2381 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1414
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1415
					}
				}
			} else if (var4.type == 2) { // L: 1418
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1419
				if (var5 >= 0 && var5 <= 50) { // L: 1420
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1421
					if (var6 < 0) { // L: 1422
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1423
					if (var7 > 50) { // L: 1424
						var7 = 50;
					}

					var13 = false; // L: 1425

					while (var6 <= var7) { // L: 1426
						if (visibleTiles[var6++][var5]) { // L: 1427
							var13 = true; // L: 1428
							break;
						}
					}

					if (var13) { // L: 1432
						var9 = Scene_cameraZ - var4.minZ; // L: 1433
						if (var9 > 32) { // L: 1434
							var4.field2392 = 3;
						} else {
							if (var9 >= -32) { // L: 1435
								continue;
							}

							var4.field2392 = 4; // L: 1436
							var9 = -var9; // L: 1437
						}

						var4.field2393 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1440
						var4.field2391 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1441
						var4.field2397 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1442
						var4.field2381 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1443
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1444
					}
				}
			} else if (var4.type == 4) { // L: 1447
				var5 = var4.minY - Scene_cameraY; // L: 1448
				if (var5 > 128) { // L: 1449
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1450
					if (var6 < 0) { // L: 1451
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1452
					if (var7 > 50) { // L: 1453
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1454
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1455
						if (var8 < 0) { // L: 1456
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1457
						if (var9 > 50) { // L: 1458
							var9 = 50;
						}

						boolean var10 = false; // L: 1459

						label150:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1460
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1461
								if (visibleTiles[var11][var12]) { // L: 1462
									var10 = true; // L: 1463
									break label150;
								}
							}
						}

						if (var10) { // L: 1468
							var4.field2392 = 5; // L: 1469
							var4.field2393 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1470
							var4.field2391 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1471
							var4.field2398 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1472
							var4.field2396 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1473
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1474
						}
					}
				}
			}
		}

	} // L: 1478

	@ObfuscatedName("ax")
	boolean method3944(int var1, int var2, int var3) {
		int var4 = this.field2321[var1][var2][var3]; // L: 1481
		if (var4 == -Scene_drawnCount) { // L: 1482
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1483
			return true;
		} else {
			int var5 = var2 << 7; // L: 1484
			int var6 = var3 << 7; // L: 1485
			if (this.method3948(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method3948(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method3948(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3948(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1486
				this.field2321[var1][var2][var3] = Scene_drawnCount; // L: 1487
				return true; // L: 1488
			} else {
				this.field2321[var1][var2][var3] = -Scene_drawnCount; // L: 1491
				return false; // L: 1492
			}
		}
	}

	@ObfuscatedName("ah")
	boolean method3945(int var1, int var2, int var3, int var4) {
		if (!this.method3944(var1, var2, var3)) { // L: 1497
			return false;
		} else {
			int var5 = var2 << 7; // L: 1498
			int var6 = var3 << 7; // L: 1499
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1500
			int var8 = var7 - 120; // L: 1501
			int var9 = var7 - 230; // L: 1502
			int var10 = var7 - 238; // L: 1503
			if (var4 < 16) { // L: 1504
				if (var4 == 1) { // L: 1505
					if (var5 > Scene_cameraX) { // L: 1506
						if (!this.method3948(var5, var7, var6)) { // L: 1507
							return false;
						}

						if (!this.method3948(var5, var7, var6 + 128)) { // L: 1508
							return false;
						}
					}

					if (var1 > 0) { // L: 1510
						if (!this.method3948(var5, var8, var6)) { // L: 1511
							return false;
						}

						if (!this.method3948(var5, var8, var6 + 128)) { // L: 1512
							return false;
						}
					}

					if (!this.method3948(var5, var9, var6)) { // L: 1514
						return false;
					}

					if (!this.method3948(var5, var9, var6 + 128)) { // L: 1515
						return false;
					}

					return true; // L: 1516
				}

				if (var4 == 2) { // L: 1518
					if (var6 < Scene_cameraZ) { // L: 1519
						if (!this.method3948(var5, var7, var6 + 128)) { // L: 1520
							return false;
						}

						if (!this.method3948(var5 + 128, var7, var6 + 128)) { // L: 1521
							return false;
						}
					}

					if (var1 > 0) { // L: 1523
						if (!this.method3948(var5, var8, var6 + 128)) { // L: 1524
							return false;
						}

						if (!this.method3948(var5 + 128, var8, var6 + 128)) { // L: 1525
							return false;
						}
					}

					if (!this.method3948(var5, var9, var6 + 128)) { // L: 1527
						return false;
					}

					if (!this.method3948(var5 + 128, var9, var6 + 128)) { // L: 1528
						return false;
					}

					return true; // L: 1529
				}

				if (var4 == 4) { // L: 1531
					if (var5 < Scene_cameraX) { // L: 1532
						if (!this.method3948(var5 + 128, var7, var6)) { // L: 1533
							return false;
						}

						if (!this.method3948(var5 + 128, var7, var6 + 128)) { // L: 1534
							return false;
						}
					}

					if (var1 > 0) { // L: 1536
						if (!this.method3948(var5 + 128, var8, var6)) { // L: 1537
							return false;
						}

						if (!this.method3948(var5 + 128, var8, var6 + 128)) { // L: 1538
							return false;
						}
					}

					if (!this.method3948(var5 + 128, var9, var6)) { // L: 1540
						return false;
					}

					if (!this.method3948(var5 + 128, var9, var6 + 128)) { // L: 1541
						return false;
					}

					return true; // L: 1542
				}

				if (var4 == 8) { // L: 1544
					if (var6 > Scene_cameraZ) { // L: 1545
						if (!this.method3948(var5, var7, var6)) { // L: 1546
							return false;
						}

						if (!this.method3948(var5 + 128, var7, var6)) { // L: 1547
							return false;
						}
					}

					if (var1 > 0) { // L: 1549
						if (!this.method3948(var5, var8, var6)) { // L: 1550
							return false;
						}

						if (!this.method3948(var5 + 128, var8, var6)) { // L: 1551
							return false;
						}
					}

					if (!this.method3948(var5, var9, var6)) { // L: 1553
						return false;
					}

					if (!this.method3948(var5 + 128, var9, var6)) { // L: 1554
						return false;
					}

					return true; // L: 1555
				}
			}

			if (!this.method3948(var5 + 64, var10, var6 + 64)) { // L: 1558
				return false;
			} else if (var4 == 16) { // L: 1559
				return this.method3948(var5, var9, var6 + 128); // L: 1560
			} else if (var4 == 32) { // L: 1563
				return this.method3948(var5 + 128, var9, var6 + 128); // L: 1564
			} else if (var4 == 64) { // L: 1567
				return this.method3948(var5 + 128, var9, var6); // L: 1568
			} else if (var4 == 128) { // L: 1571
				return this.method3948(var5, var9, var6); // L: 1572
			} else {
				return true; // L: 1575
			}
		}
	}

	@ObfuscatedName("ai")
	boolean method3979(int var1, int var2, int var3, int var4) {
		if (!this.method3944(var1, var2, var3)) { // L: 1579
			return false;
		} else {
			int var5 = var2 << 7; // L: 1580
			int var6 = var3 << 7; // L: 1581
			return this.method3948(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method3948(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3948(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3948(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1582
		}
	}

	@ObfuscatedName("am")
	boolean method3947(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1587
			if (!this.method3944(var1, var2, var4)) { // L: 1588
				return false;
			} else {
				var7 = var2 << 7; // L: 1589
				var8 = var4 << 7; // L: 1590
				return this.method3948(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method3948(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3948(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3948(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1591
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1594
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1595
					if (this.field2321[var1][var7][var8] == -Scene_drawnCount) { // L: 1596
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1599
			var8 = (var4 << 7) + 2; // L: 1600
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1601
			if (!this.method3948(var7, var9, var8)) { // L: 1602
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1603
				if (!this.method3948(var10, var9, var8)) { // L: 1604
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1605
					if (!this.method3948(var7, var9, var11)) { // L: 1606
						return false;
					} else if (!this.method3948(var10, var9, var11)) { // L: 1607
						return false;
					} else {
						return true; // L: 1608
					}
				}
			}
		}
	}

	@ObfuscatedName("bt")
	boolean method3948(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1612
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1613
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2392 == 1) { // L: 1614
				var6 = var5.minX - var1; // L: 1615
				if (var6 > 0) { // L: 1616
					var7 = (var6 * var5.field2398 >> 8) + var5.minZ; // L: 1617
					var8 = (var6 * var5.field2396 >> 8) + var5.maxZ; // L: 1618
					var9 = (var6 * var5.field2397 >> 8) + var5.minY; // L: 1619
					var10 = (var6 * var5.field2381 >> 8) + var5.maxY; // L: 1620
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1621
						return true;
					}
				}
			} else if (var5.field2392 == 2) { // L: 1625
				var6 = var1 - var5.minX; // L: 1626
				if (var6 > 0) { // L: 1627
					var7 = (var6 * var5.field2398 >> 8) + var5.minZ; // L: 1628
					var8 = (var6 * var5.field2396 >> 8) + var5.maxZ; // L: 1629
					var9 = (var6 * var5.field2397 >> 8) + var5.minY; // L: 1630
					var10 = (var6 * var5.field2381 >> 8) + var5.maxY; // L: 1631
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1632
						return true;
					}
				}
			} else if (var5.field2392 == 3) { // L: 1636
				var6 = var5.minZ - var3; // L: 1637
				if (var6 > 0) { // L: 1638
					var7 = (var6 * var5.field2393 >> 8) + var5.minX; // L: 1639
					var8 = (var6 * var5.field2391 >> 8) + var5.maxX; // L: 1640
					var9 = (var6 * var5.field2397 >> 8) + var5.minY; // L: 1641
					var10 = (var6 * var5.field2381 >> 8) + var5.maxY; // L: 1642
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1643
						return true;
					}
				}
			} else if (var5.field2392 == 4) { // L: 1647
				var6 = var3 - var5.minZ; // L: 1648
				if (var6 > 0) { // L: 1649
					var7 = (var6 * var5.field2393 >> 8) + var5.minX; // L: 1650
					var8 = (var6 * var5.field2391 >> 8) + var5.maxX; // L: 1651
					var9 = (var6 * var5.field2397 >> 8) + var5.minY; // L: 1652
					var10 = (var6 * var5.field2381 >> 8) + var5.maxY; // L: 1653
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1654
						return true;
					}
				}
			} else if (var5.field2392 == 5) { // L: 1658
				var6 = var2 - var5.minY; // L: 1659
				if (var6 > 0) { // L: 1660
					var7 = (var6 * var5.field2393 >> 8) + var5.minX; // L: 1661
					var8 = (var6 * var5.field2391 >> 8) + var5.maxX; // L: 1662
					var9 = (var6 * var5.field2398 >> 8) + var5.minZ; // L: 1663
					var10 = (var6 * var5.field2396 >> 8) + var5.maxZ; // L: 1664
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1665
						return true;
					}
				}
			}
		}

		return false; // L: 1670
	}

	@ObfuscatedName("e")
	@Export("Scene_addOccluder")
	public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder var8 = new Occluder(); // L: 154
		var8.minTileX = var2 / 128; // L: 155
		var8.maxTileX = var3 / 128; // L: 156
		var8.minTileY = var4 / 128; // L: 157
		var8.maxTileY = var5 / 128; // L: 158
		var8.type = var1; // L: 159
		var8.minX = var2; // L: 160
		var8.maxX = var3; // L: 161
		var8.minZ = var4; // L: 162
		var8.maxZ = var5; // L: 163
		var8.minY = var6; // L: 164
		var8.maxY = var7; // L: 165
		Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8; // L: 166
	} // L: 167

	@ObfuscatedName("ay")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 658
		Scene_viewportYMin = 0; // L: 659
		Scene_viewportXMax = var3; // L: 660
		Scene_viewportYMax = var4; // L: 661
		Scene_viewportXCenter = var3 / 2; // L: 662
		Scene_viewportYCenter = var4 / 2; // L: 663
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 664

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 665
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 666
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 667
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 668
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 669
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 670
				var8 = (var6 - 128) / 32; // L: 671
				var9 = var7 / 64; // L: 672

				for (int var10 = -26; var10 < 26; ++var10) { // L: 673
					for (var11 = -26; var11 < 26; ++var11) { // L: 674
						var12 = var10 * 128; // L: 675
						int var13 = var11 * 128; // L: 676
						boolean var14 = false; // L: 677

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 678
							if (method3932(var12, var0[var8] + var15, var13)) { // L: 679
								var14 = true; // L: 680
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 684
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 689
			for (var7 = 0; var7 < 32; ++var7) { // L: 690
				for (var8 = -25; var8 < 25; ++var8) { // L: 691
					for (var9 = -25; var9 < 25; ++var9) { // L: 692
						boolean var16 = false; // L: 693

						label84:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 694
							for (var12 = -1; var12 <= 1; ++var12) { // L: 695
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 696
									var16 = true; // L: 697
									break label84;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 700
									var16 = true; // L: 701
									break label84; // L: 702
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 704
									var16 = true; // L: 705
									break label84; // L: 706
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 708
									var16 = true; // L: 709
									break label84; // L: 710
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 714
					}
				}
			}
		}

	} // L: 719

	@ObfuscatedName("ac")
	static boolean method3932(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 722
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 723
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 724
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 725
		if (var5 >= 50 && var5 <= 3500) { // L: 726
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 727
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 728
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 729
		} else {
			return false; // L: 730
		}
	}

	@ObfuscatedName("ag")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 749
	}

	@ObfuscatedName("az")
	public static void method3936() {
		Scene_selectedX = -1; // L: 753
		viewportWalking = false; // L: 754
	} // L: 755

	@ObfuscatedName("an")
	static final int method3941(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1360
		if (var1 < 2) { // L: 1361
			var1 = 2;
		} else if (var1 > 126) { // L: 1362
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1363
	}

	@ObfuscatedName("aw")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1367
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1368
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1369
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1370
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1371
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1372
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1373
			if (var8 == 0) { // L: 1374
				if (var9 != 0) { // L: 1377
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1378
				} else {
					return true; // L: 1380
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1375
			}
		}
	}
}
