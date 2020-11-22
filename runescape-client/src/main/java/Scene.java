import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("f")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("p")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("r")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("y")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("s")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("j")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("w")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("v")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("d")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("a")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("g")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("h")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("i")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("ab")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("ac")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("ao")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("af")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lel;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("ar")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("ay")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("ah")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("az")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("ak")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("au")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("ai")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("aq")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("aw")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Led;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("am")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Led;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("as")
	static final int[] field1874;
	@ObfuscatedName("aj")
	static final int[] field1875;
	@ObfuscatedName("ae")
	static final int[] field1876;
	@ObfuscatedName("al")
	static final int[] field1851;
	@ObfuscatedName("ap")
	static final int[] field1878;
	@ObfuscatedName("ad")
	static final int[] field1828;
	@ObfuscatedName("bb")
	static final int[] field1856;
	@ObfuscatedName("bn")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("bo")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("be")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("ba")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("bt")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("bw")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("bm")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("by")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("b")
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("m")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("z")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[[Leo;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("k")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lel;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("t")
	int[][][] field1837;
	@ObfuscatedName("bj")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("bl")
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
		field1874 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field1875 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field1876 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field1851 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field1878 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field1828 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field1856 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
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
		this.field1837 = new int[var1][var2 + 1][var3 + 1]; // L: 100
		this.tileHeights = var4; // L: 101
		this.clear(); // L: 102
	} // L: 103

	@ObfuscatedName("f")
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

	@ObfuscatedName("b")
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

	@ObfuscatedName("l")
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
					boolean var8 = KeyHandler.Entity_unpackSceneX(var9) == 2; // L: 142
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

	@ObfuscatedName("z")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 170
		if (var5 != null) { // L: 171
			this.tiles[var1][var2][var3].minPlane = var4; // L: 172
		}
	} // L: 173

	@ObfuscatedName("q")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		TilePaint var21;
		int var22;
		if (var4 == 0) { // L: 176
			var21 = new TilePaint(var11, var12, var13, var14, -1, var19, false); // L: 177

			for (var22 = var1; var22 >= 0; --var22) { // L: 178
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 179
		} else if (var4 != 1) { // L: 182
			TileModel var23 = new TileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 188

			for (var22 = var1; var22 >= 0; --var22) { // L: 189
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23; // L: 190
		} else {
			var21 = new TilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 183

			for (var22 = var1; var22 >= 0; --var22) { // L: 184
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 185
		}
	} // L: 180 186 191

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIILej;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Entity var5, long var6, int var8) {
		if (var5 != null) { // L: 194
			FloorDecoration var9 = new FloorDecoration(); // L: 195
			var9.entity = var5; // L: 196
			var9.x = var2 * 128 + 64; // L: 197
			var9.y = var3 * 128 + 64; // L: 198
			var9.tileHeight = var4; // L: 199
			var9.tag = var6; // L: 200
			var9.flags = var8; // L: 201
			if (this.tiles[var1][var2][var3] == null) { // L: 202
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9; // L: 203
		}
	} // L: 204

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIILej;JLej;Lej;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Entity var5, long var6, Entity var8, Entity var9) {
		TileItemPile var10 = new TileItemPile(); // L: 207
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
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].entity instanceof Model) { // L: 219
					Model var14 = (Model)var12.gameObjects[var13].entity; // L: 220
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

		this.tiles[var1][var2][var3].tileItemPile = var10; // L: 228
	} // L: 229

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIILej;Lej;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 232
			BoundaryObject var12 = new BoundaryObject(); // L: 233
			var12.tag = var9; // L: 234
			var12.flags = var11; // L: 235
			var12.x = var2 * 128 + 64; // L: 236
			var12.y = var3 * 128 + 64; // L: 237
			var12.tileHeight = var4; // L: 238
			var12.entity1 = var5; // L: 239
			var12.entity2 = var6; // L: 240
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIILej;Lej;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 248
			WallDecoration var14 = new WallDecoration(); // L: 249
			var14.tag = var11; // L: 250
			var14.flags = var13; // L: 251
			var14.x = var2 * 128 + 64; // L: 252
			var14.y = var3 * 128 + 64; // L: 253
			var14.tileHeight = var4; // L: 254
			var14.entity1 = var5; // L: 255
			var14.entity2 = var6; // L: 256
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILej;IJI)Z"
	)
	public boolean method3227(int var1, int var2, int var3, int var4, int var5, int var6, Entity var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 266
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 267
			int var13 = var6 * 64 + var3 * 128; // L: 268
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 269
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIILej;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, boolean var10) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIILej;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 292 293
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILej;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9, int var10, boolean var11, long var12, int var14) {
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
		var21.height = var8; // L: 310
		var21.entity = var9; // L: 311
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

	@ObfuscatedName("p")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 338
			GameObject var2 = this.tempGameObjects[var1]; // L: 339
			this.removeGameObject(var2); // L: 340
			this.tempGameObjects[var1] = null; // L: 341
		}

		this.tempGameObjectsCount = 0; // L: 343
	} // L: 344

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
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

	@ObfuscatedName("y")
	public void method3233(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 373
		if (var5 != null) { // L: 374
			WallDecoration var6 = var5.wallDecoration; // L: 375
			if (var6 != null) { // L: 376
				var6.xOffset = var4 * var6.xOffset / 16; // L: 377
				var6.yOffset = var4 * var6.yOffset / 16; // L: 378
			}
		}
	} // L: 379

	@ObfuscatedName("s")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 382
		if (var4 != null) {
			var4.boundaryObject = null; // L: 384
		}
	} // L: 383 385

	@ObfuscatedName("j")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 388
		if (var4 != null) {
			var4.wallDecoration = null; // L: 390
		}
	} // L: 389 391

	@ObfuscatedName("d")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 394
		if (var4 != null) { // L: 395
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 396
				GameObject var6 = var4.gameObjects[var5]; // L: 397
				long var8 = var6.tag; // L: 399
				boolean var7 = KeyHandler.Entity_unpackSceneX(var8) == 2; // L: 401
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 403
					this.removeGameObject(var6); // L: 404
					return; // L: 405
				}
			}

		}
	} // L: 408

	@ObfuscatedName("a")
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
			var4.tileItemPile = null; // L: 419
		}
	} // L: 418 420

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)Lem;"
	)
	public BoundaryObject method3277(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 423
		return var4 == null ? null : var4.boundaryObject; // L: 424 425
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Ley;"
	)
	public WallDecoration method3276(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 429
		return var4 == null ? null : var4.wallDecoration; // L: 430 431
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lel;"
	)
	public GameObject method3241(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 435
		if (var4 == null) { // L: 436
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 437
				GameObject var6 = var4.gameObjects[var5]; // L: 438
				if (class1.method8(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 439
					return var6;
				}
			}

			return null; // L: 441
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lek;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 445
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null; // L: 446 447
	}

	@ObfuscatedName("af")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 451
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L; // L: 452 453
	}

	@ObfuscatedName("av")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 457
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L; // L: 458 459
	}

	@ObfuscatedName("ar")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 463
		if (var4 == null) { // L: 464
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 465
				GameObject var6 = var4.gameObjects[var5]; // L: 466
				long var8 = var6.tag; // L: 468
				boolean var7 = KeyHandler.Entity_unpackSceneX(var8) == 2; // L: 470
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 472
					return var6.tag;
				}
			}

			return 0L; // L: 474
		}
	}

	@ObfuscatedName("ay")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 478
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L; // L: 479 480
	}

	@ObfuscatedName("ah")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 484
		if (var6 == null) { // L: 485
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) { // L: 486
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) { // L: 487
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) { // L: 488
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 489
				if (var6.gameObjects[var7].tag == var4) { // L: 490
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 492
		}
	}

	@ObfuscatedName("az")
	public void method3248(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 496
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 497
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 498
					Tile var7 = this.tiles[var4][var5][var6]; // L: 499
					if (var7 != null) { // L: 500
						BoundaryObject var8 = var7.boundaryObject; // L: 501
						ModelData var10;
						if (var8 != null && var8.entity1 instanceof ModelData) { // L: 502
							ModelData var9 = (ModelData)var8.entity1; // L: 503
							this.method3250(var9, var4, var5, var6, 1, 1); // L: 504
							if (var8.entity2 instanceof ModelData) { // L: 505
								var10 = (ModelData)var8.entity2; // L: 506
								this.method3250(var10, var4, var5, var6, 1, 1); // L: 507
								ModelData.method2929(var9, var10, 0, 0, 0, false); // L: 508
								var8.entity2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 509
							}

							var8.entity1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 511
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 513
							GameObject var14 = var7.gameObjects[var12]; // L: 514
							if (var14 != null && var14.entity instanceof ModelData) { // L: 515
								ModelData var11 = (ModelData)var14.entity; // L: 516
								this.method3250(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 517
								var14.entity = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 518
							}
						}

						FloorDecoration var13 = var7.floorDecoration; // L: 521
						if (var13 != null && var13.entity instanceof ModelData) { // L: 522
							var10 = (ModelData)var13.entity; // L: 523
							this.method3249(var10, var4, var5, var6); // L: 524
							var13.entity = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 525
						}
					}
				}
			}
		}

	} // L: 531

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Len;III)V"
	)
	void method3249(ModelData var1, int var2, int var3, int var4) {
		Tile var5;
		ModelData var6;
		if (var3 < this.xSize) { // L: 534
			var5 = this.tiles[var2][var3 + 1][var4]; // L: 535
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) { // L: 536
				var6 = (ModelData)var5.floorDecoration.entity; // L: 537
				ModelData.method2929(var1, var6, 128, 0, 0, true); // L: 538
			}
		}

		if (var4 < this.xSize) { // L: 541
			var5 = this.tiles[var2][var3][var4 + 1]; // L: 542
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) { // L: 543
				var6 = (ModelData)var5.floorDecoration.entity; // L: 544
				ModelData.method2929(var1, var6, 0, 0, 128, true); // L: 545
			}
		}

		if (var3 < this.xSize && var4 < this.ySize) { // L: 548
			var5 = this.tiles[var2][var3 + 1][var4 + 1]; // L: 549
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) { // L: 550
				var6 = (ModelData)var5.floorDecoration.entity; // L: 551
				ModelData.method2929(var1, var6, 128, 0, 128, true); // L: 552
			}
		}

		if (var3 < this.xSize && var4 > 0) { // L: 555
			var5 = this.tiles[var2][var3 + 1][var4 - 1]; // L: 556
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) { // L: 557
				var6 = (ModelData)var5.floorDecoration.entity; // L: 558
				ModelData.method2929(var1, var6, 128, 0, -128, true); // L: 559
			}
		}

	} // L: 562

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Len;IIIII)V"
	)
	void method3250(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 565
		int var8 = var3; // L: 566
		int var9 = var3 + var5; // L: 567
		int var10 = var4 - 1; // L: 568
		int var11 = var4 + var6; // L: 569

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 570
			if (var12 != this.planes) { // L: 571
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 572
					if (var13 >= 0 && var13 < this.xSize) { // L: 573
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 574
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 575 576
								Tile var15 = this.tiles[var12][var13][var14]; // L: 577
								if (var15 != null) { // L: 578
									int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4; // L: 579
									BoundaryObject var17 = var15.boundaryObject; // L: 580
									if (var17 != null) { // L: 581
										ModelData var18;
										if (var17.entity1 instanceof ModelData) { // L: 582
											var18 = (ModelData)var17.entity1; // L: 583
											ModelData.method2929(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 584
										}

										if (var17.entity2 instanceof ModelData) { // L: 586
											var18 = (ModelData)var17.entity2; // L: 587
											ModelData.method2929(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 588
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 591
										GameObject var19 = var15.gameObjects[var23]; // L: 592
										if (var19 != null && var19.entity instanceof ModelData) { // L: 593
											ModelData var20 = (ModelData)var19.entity; // L: 594
											int var21 = var19.endX - var19.startX + 1; // L: 595
											int var22 = var19.endY - var19.startY + 1; // L: 596
											ModelData.method2929(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 597
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 602
				var7 = false; // L: 603
			}
		}

	} // L: 605

	@ObfuscatedName("ai")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 608
		if (var7 != null) { // L: 609
			TilePaint var8 = var7.paint; // L: 610
			int var10;
			if (var8 != null) { // L: 611
				int var18 = var8.rgb; // L: 612
				if (var18 != 0) { // L: 613
					for (var10 = 0; var10 < 4; ++var10) { // L: 614
						var1[var2] = var18; // L: 615
						var1[var2 + 1] = var18; // L: 616
						var1[var2 + 2] = var18; // L: 617
						var1[var2 + 3] = var18; // L: 618
						var2 += var3; // L: 619
					}

				}
			} else {
				TileModel var9 = var7.model; // L: 623
				if (var9 != null) { // L: 624
					var10 = var9.shape; // L: 625
					int var11 = var9.rotation; // L: 626
					int var12 = var9.underlayRgb; // L: 627
					int var13 = var9.overlayRgb; // L: 628
					int[] var14 = this.tileShape2D[var10]; // L: 629
					int[] var15 = this.tileRotation2D[var11]; // L: 630
					int var16 = 0; // L: 631
					int var17;
					if (var12 != 0) { // L: 632
						for (var17 = 0; var17 < 4; ++var17) { // L: 633
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 634
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 635
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 636
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 637
							var2 += var3; // L: 638
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 642
							if (var14[var15[var16++]] != 0) { // L: 643
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 644
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 645
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 646
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 647
						}
					}

				}
			}
		}
	} // L: 621 650

	@ObfuscatedName("aq")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 729
			checkClick = true; // L: 730
			viewportWalking = var4; // L: 731
			Scene_selectedPlane = var1; // L: 732
			Scene_selectedScreenX = var2; // L: 733
			Scene_selectedScreenY = var3; // L: 734
			Scene_selectedX = -1; // L: 735
			Scene_selectedY = -1; // L: 736
		}
	} // L: 737

	@ObfuscatedName("aw")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 740
	} // L: 741

	@ObfuscatedName("aa")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 753
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 754
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 755
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 756
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 757
			var4 = 128;
		} else if (var4 > 383) { // L: 758
			var4 = 383;
		}

		++Scene_drawnCount; // L: 759
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 760
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 761
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 762
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 763
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 764
		Scene_cameraX = var1; // L: 765
		Scene_cameraY = var2; // L: 766
		Scene_cameraZ = var3; // L: 767
		Scene_cameraXTile = var1 / 128; // L: 768
		Scene_cameraYTile = var3 / 128; // L: 769
		Scene_plane = var6; // L: 770
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 771
		if (Scene_cameraXTileMin < 0) { // L: 772
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 773
		if (Scene_cameraYTileMin < 0) { // L: 774
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 775
		if (Scene_cameraXTileMax > this.xSize) { // L: 776
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 777
		if (Scene_cameraYTileMax > this.ySize) { // L: 778
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 779
		tileUpdateCount = 0; // L: 780

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 781
			var8 = this.tiles[var7]; // L: 782

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 783
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 784
					Tile var16 = var8[var9][var10]; // L: 785
					if (var16 != null) { // L: 786
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 787
							var16.drawPrimary = true; // L: 793
							var16.drawSecondary = true; // L: 794
							if (var16.gameObjectsCount > 0) {
								var16.drawGameObjects = true; // L: 795
							} else {
								var16.drawGameObjects = false; // L: 796
							}

							++tileUpdateCount; // L: 797
						} else {
							var16.drawPrimary = false; // L: 788
							var16.drawSecondary = false; // L: 789
							var16.drawGameObjectEdges = 0; // L: 790
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
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 803
			var8 = this.tiles[var7]; // L: 804

			for (var9 = -25; var9 <= 0; ++var9) { // L: 805
				var10 = var9 + Scene_cameraXTile; // L: 806
				var11 = Scene_cameraXTile - var9; // L: 807
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 808
					for (var12 = -25; var12 <= 0; ++var12) { // L: 809
						var13 = var12 + Scene_cameraYTile; // L: 810
						var14 = Scene_cameraYTile - var12; // L: 811
						if (var10 >= Scene_cameraXTileMin) { // L: 812
							if (var13 >= Scene_cameraYTileMin) { // L: 813
								var15 = var8[var10][var13]; // L: 814
								if (var15 != null && var15.drawPrimary) { // L: 815
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 817
								var15 = var8[var10][var14]; // L: 818
								if (var15 != null && var15.drawPrimary) { // L: 819
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 822
							if (var13 >= Scene_cameraYTileMin) { // L: 823
								var15 = var8[var11][var13]; // L: 824
								if (var15 != null && var15.drawPrimary) { // L: 825
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 827
								var15 = var8[var11][var14]; // L: 828
								if (var15 != null && var15.drawPrimary) { // L: 829
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 832
							checkClick = false; // L: 833
							return; // L: 834
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 840
			var8 = this.tiles[var7]; // L: 841

			for (var9 = -25; var9 <= 0; ++var9) { // L: 842
				var10 = var9 + Scene_cameraXTile; // L: 843
				var11 = Scene_cameraXTile - var9; // L: 844
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 845
					for (var12 = -25; var12 <= 0; ++var12) { // L: 846
						var13 = var12 + Scene_cameraYTile; // L: 847
						var14 = Scene_cameraYTile - var12; // L: 848
						if (var10 >= Scene_cameraXTileMin) { // L: 849
							if (var13 >= Scene_cameraYTileMin) { // L: 850
								var15 = var8[var10][var13]; // L: 851
								if (var15 != null && var15.drawPrimary) { // L: 852
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 854
								var15 = var8[var10][var14]; // L: 855
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false); // L: 856
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 859
							if (var13 >= Scene_cameraYTileMin) { // L: 860
								var15 = var8[var11][var13]; // L: 861
								if (var15 != null && var15.drawPrimary) { // L: 862
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 864
								var15 = var8[var11][var14]; // L: 865
								if (var15 != null && var15.drawPrimary) { // L: 866
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 869
							checkClick = false; // L: 870
							return; // L: 871
						}
					}
				}
			}
		}

		checkClick = false; // L: 877
	} // L: 878

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Leo;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 881

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
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 883
												if (var3 == null) { // L: 884
													return;
												}
											} while(!var3.drawSecondary); // L: 885

											var4 = var3.x; // L: 886
											var5 = var3.y; // L: 887
											var6 = var3.plane; // L: 888
											var7 = var3.originalPlane; // L: 889
											var8 = this.tiles[var6]; // L: 890
											if (!var3.drawPrimary) { // L: 891
												break;
											}

											if (var2) { // L: 892
												if (var6 > 0) { // L: 893
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 894
													if (var9 != null && var9.drawSecondary) { // L: 895
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 897
													var9 = var8[var4 - 1][var5]; // L: 898
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 899
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 901
													var9 = var8[var4 + 1][var5]; // L: 902
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 903
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 905
													var9 = var8[var4][var5 - 1]; // L: 906
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 907
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 909
													var9 = var8[var4][var5 + 1]; // L: 910
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 911
														continue;
													}
												}
											} else {
												var2 = true; // L: 914
											}

											var3.drawPrimary = false; // L: 915
											if (var3.linkedBelowTile != null) { // L: 916
												var9 = var3.linkedBelowTile; // L: 917
												if (var9.paint != null) { // L: 918
													if (!this.method3265(0, var4, var5)) { // L: 919
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method3265(0, var4, var5)) { // L: 921 922
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.boundaryObject; // L: 924
												if (var10 != null) { // L: 925
													var10.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.tileHeight - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 926
													var12 = var9.gameObjects[var11]; // L: 927
													if (var12 != null) { // L: 928
														var12.entity.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.height - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 931
											if (var3.paint != null) { // L: 932
												if (!this.method3265(var7, var4, var5)) { // L: 933
													var20 = true; // L: 934
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 935
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method3265(var7, var4, var5)) { // L: 938 939
												var20 = true; // L: 940
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 941
											}

											var21 = 0; // L: 944
											var11 = 0; // L: 945
											BoundaryObject var31 = var3.boundaryObject; // L: 946
											WallDecoration var13 = var3.wallDecoration; // L: 947
											if (var31 != null || var13 != null) { // L: 948
												if (var4 == Scene_cameraXTile) { // L: 949
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 950
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 951
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 952
													var21 += 6;
												}

												var11 = field1874[var21]; // L: 953
												var3.field1671 = field1876[var21]; // L: 954
											}

											if (var31 != null) { // L: 956
												if ((var31.orientationA & field1875[var21]) != 0) { // L: 957
													if (var31.orientationA == 16) { // L: 958
														var3.drawGameObjectEdges = 3; // L: 959
														var3.field1690 = field1851[var21]; // L: 960
														var3.field1691 = 3 - var3.field1690; // L: 961
													} else if (var31.orientationA == 32) { // L: 963
														var3.drawGameObjectEdges = 6; // L: 964
														var3.field1690 = field1878[var21]; // L: 965
														var3.field1691 = 6 - var3.field1690; // L: 966
													} else if (var31.orientationA == 64) { // L: 968
														var3.drawGameObjectEdges = 12; // L: 969
														var3.field1690 = field1828[var21]; // L: 970
														var3.field1691 = 12 - var3.field1690; // L: 971
													} else {
														var3.drawGameObjectEdges = 9; // L: 974
														var3.field1690 = field1856[var21]; // L: 975
														var3.field1691 = 9 - var3.field1690; // L: 976
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 979
												}

												if ((var31.orientationA & var11) != 0 && !this.method3346(var7, var4, var5, var31.orientationA)) { // L: 980
													var31.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method3346(var7, var4, var5, var31.orientationB)) { // L: 981
													var31.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method3325(var7, var4, var5, var13.entity1.height)) { // L: 983
												if ((var13.orientation & var11) != 0) { // L: 984
													var13.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.x - Scene_cameraX + var13.xOffset, var13.tileHeight - Scene_cameraY, var13.y - Scene_cameraZ + var13.yOffset, var13.tag); // L: 985
												} else if (var13.orientation == 256) { // L: 987
													var14 = var13.x - Scene_cameraX; // L: 988
													var15 = var13.tileHeight - Scene_cameraY; // L: 989
													var16 = var13.y - Scene_cameraZ; // L: 990
													var17 = var13.orientation2; // L: 991
													if (var17 != 1 && var17 != 2) { // L: 993
														var18 = var14; // L: 994
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 996
														var19 = var16; // L: 997
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 998
														var13.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 999
													} else if (var13.entity2 != null) { // L: 1001
														var13.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 1002
													}
												}
											}

											if (var20) { // L: 1006
												FloorDecoration var22 = var3.floorDecoration; // L: 1007
												if (var22 != null) { // L: 1008
													var22.entity.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x - Scene_cameraX, var22.tileHeight - Scene_cameraY, var22.y - Scene_cameraZ, var22.tag);
												}

												TileItemPile var23 = var3.tileItemPile; // L: 1009
												if (var23 != null && var23.height == 0) { // L: 1010
													if (var23.second != null) { // L: 1011
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 1012
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 1013
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1016
											if (var14 != 0) { // L: 1017
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1018
													var36 = var8[var4 + 1][var5]; // L: 1019
													if (var36 != null && var36.drawSecondary) { // L: 1020
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1022
													var36 = var8[var4][var5 + 1]; // L: 1023
													if (var36 != null && var36.drawSecondary) { // L: 1024
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1026
													var36 = var8[var4 - 1][var5]; // L: 1027
													if (var36 != null && var36.drawSecondary) { // L: 1028
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1030
													var36 = var8[var4][var5 - 1]; // L: 1031
													if (var36 != null && var36.drawSecondary) { // L: 1032
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1036
											var20 = true; // L: 1037

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1038
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field1690) { // L: 1039
													var20 = false; // L: 1040
													break; // L: 1041
												}
											}

											if (var20) { // L: 1044
												var10 = var3.boundaryObject; // L: 1045
												if (!this.method3346(var7, var4, var5, var10.orientationA)) { // L: 1046
													var10.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.tileHeight - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1047
											}
										}

										if (!var3.drawGameObjects) { // L: 1050
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1052
											var3.drawGameObjects = false; // L: 1053
											var21 = 0; // L: 1054

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1055
												var12 = var3.gameObjects[var11]; // L: 1056
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1057
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1058
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1059
															var36 = var8[var24][var14]; // L: 1060
															if (var36.drawPrimary) { // L: 1061
																var3.drawGameObjects = true; // L: 1062
																continue label563; // L: 1063
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1065
																var16 = 0; // L: 1066
																if (var24 > var12.startX) { // L: 1067
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1068
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1069
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1070
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field1691) { // L: 1071
																	var3.drawGameObjects = true; // L: 1072
																	continue label563; // L: 1073
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1078
													var24 = Scene_cameraXTile - var12.startX; // L: 1079
													var14 = var12.endX - Scene_cameraXTile; // L: 1080
													if (var14 > var24) { // L: 1081
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1082
													var16 = var12.endY - Scene_cameraYTile; // L: 1083
													if (var16 > var15) { // L: 1084
														var12.field1962 = var24 + var16;
													} else {
														var12.field1962 = var24 + var15; // L: 1085
													}
												}
											}

											while (var21 > 0) { // L: 1088
												var11 = -50; // L: 1089
												var25 = -1; // L: 1090

												for (var24 = 0; var24 < var21; ++var24) { // L: 1091
													GameObject var35 = gameObjects[var24]; // L: 1092
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1093
														if (var35.field1962 > var11) { // L: 1094
															var11 = var35.field1962; // L: 1095
															var25 = var24; // L: 1096
														} else if (var11 == var35.field1962) { // L: 1098
															var15 = var35.centerX - Scene_cameraX; // L: 1099
															var16 = var35.centerY - Scene_cameraZ; // L: 1100
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1101
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1102
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1103
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1107
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1108
												var33.lastDrawn = Scene_drawnCount; // L: 1109
												if (!this.method3343(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.entity.height)) { // L: 1110
													var33.entity.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.height - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1111
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1113
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1114
														Tile var26 = var8[var14][var15]; // L: 1115
														if (var26.drawGameObjectEdges != 0) { // L: 1116
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1117
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1121
												break;
											}
										} catch (Exception var28) { // L: 1123
											var3.drawGameObjects = false; // L: 1124
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1127
							} while(var3.drawGameObjectEdges != 0); // L: 1128

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1129
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1130
						} while(var9 != null && var9.drawSecondary); // L: 1131

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1133
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1134
					} while(var9 != null && var9.drawSecondary); // L: 1135

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1137
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1138
				} while(var9 != null && var9.drawSecondary); // L: 1139

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1141
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1142
			} while(var9 != null && var9.drawSecondary); // L: 1143

			var3.drawSecondary = false; // L: 1145
			--tileUpdateCount; // L: 1146
			TileItemPile var32 = var3.tileItemPile; // L: 1147
			if (var32 != null && var32.height != 0) { // L: 1148
				if (var32.second != null) { // L: 1149
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1150
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1151
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field1671 != 0) { // L: 1153
				WallDecoration var29 = var3.wallDecoration; // L: 1154
				if (var29 != null && !this.method3325(var7, var4, var5, var29.entity1.height)) { // L: 1155
					if ((var29.orientation & var3.field1671) != 0) { // L: 1156
						var29.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x - Scene_cameraX + var29.xOffset, var29.tileHeight - Scene_cameraY, var29.y - Scene_cameraZ + var29.yOffset, var29.tag); // L: 1157
					} else if (var29.orientation == 256) { // L: 1159
						var11 = var29.x - Scene_cameraX; // L: 1160
						var25 = var29.tileHeight - Scene_cameraY; // L: 1161
						var24 = var29.y - Scene_cameraZ; // L: 1162
						var14 = var29.orientation2; // L: 1163
						if (var14 != 1 && var14 != 2) { // L: 1165
							var15 = var11; // L: 1166
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1168
							var16 = var24; // L: 1169
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1170
							var29.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1171
						} else if (var29.entity2 != null) { // L: 1173
							var29.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1174
						}
					}
				}

				BoundaryObject var27 = var3.boundaryObject; // L: 1178
				if (var27 != null) { // L: 1179
					if ((var27.orientationB & var3.field1671) != 0 && !this.method3346(var7, var4, var5, var27.orientationB)) { // L: 1180
						var27.entity2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.tileHeight - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field1671) != 0 && !this.method3346(var7, var4, var5, var27.orientationA)) { // L: 1181
						var27.entity1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.tileHeight - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1184
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1185
				if (var30 != null && var30.drawSecondary) { // L: 1186
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1188
				var30 = var8[var4 + 1][var5]; // L: 1189
				if (var30 != null && var30.drawSecondary) { // L: 1190
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1192
				var30 = var8[var4][var5 + 1]; // L: 1193
				if (var30 != null && var30.drawSecondary) { // L: 1194
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1196
				var30 = var8[var4 - 1][var5]; // L: 1197
				if (var30 != null && var30.drawSecondary) { // L: 1198
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1200
				var30 = var8[var4][var5 - 1]; // L: 1201
				if (var30 != null && var30.drawSecondary) { // L: 1202
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Leu;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(TilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1210
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1212
		int var13;
		int var14 = var13 = var10 + 128; // L: 1214
		int var15;
		int var16 = var15 = var12 + 128; // L: 1216
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1217
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1218
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1219
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1220
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1221
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1222
		var10 = var21; // L: 1223
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1224
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1225
		var17 = var21; // L: 1226
		if (var12 >= 50) { // L: 1227
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1228
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1229
			var14 = var21; // L: 1230
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1231
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1232
			var18 = var21; // L: 1233
			if (var11 >= 50) { // L: 1234
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1235
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1236
				var13 = var21; // L: 1237
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1238
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1239
				var19 = var21; // L: 1240
				if (var16 >= 50) { // L: 1241
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1242
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1243
					var9 = var21; // L: 1244
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1245
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1246
					if (var15 >= 50) { // L: 1248
						int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1249
						int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1250
						int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1251
						int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1252
						int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1253
						int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1254
						int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1255
						int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1256
						Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1257
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1258
							Rasterizer3D.field1800 = false; // L: 1259
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1260
								Rasterizer3D.field1800 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1261
								Scene_selectedX = var7; // L: 1262
								Scene_selectedY = var8; // L: 1263
							}

							if (var1.texture == -1) { // L: 1265
								if (var1.neColor != 12345678) { // L: 1266
									Rasterizer3D.method3155(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1268
								if (var1.isFlat) { // L: 1269
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1270
								}
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1273
								Rasterizer3D.method3155(var27, var29, var25, var26, var28, var24, method3262(var30, var1.neColor), method3262(var30, var1.nwColor), method3262(var30, var1.seColor)); // L: 1274
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1277
							Rasterizer3D.field1800 = false; // L: 1278
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1279
								Rasterizer3D.field1800 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1280
								Scene_selectedX = var7; // L: 1281
								Scene_selectedY = var8; // L: 1282
							}

							if (var1.texture == -1) { // L: 1284
								if (var1.swColor != 12345678) { // L: 1285
									Rasterizer3D.method3155(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1287
								Rasterizer3D.drawTexturedTile(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1288
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1291
								Rasterizer3D.method3155(var23, var25, var29, var22, var24, var28, method3262(var30, var1.swColor), method3262(var30, var1.seColor), method3262(var30, var1.nwColor)); // L: 1292
							}
						}

					}
				}
			}
		}
	} // L: 1295

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Leq;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(TileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1298

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1299
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1300
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1301
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1302
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1303
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1304
			var10 = var13; // L: 1305
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1306
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1307
			if (var12 < 50) { // L: 1309
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1310
				TileModel.field1630[var9] = var10; // L: 1311
				TileModel.field1627[var9] = var13; // L: 1312
				TileModel.field1632[var9] = var12; // L: 1313
			}

			TileModel.field1628[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1315
			TileModel.field1634[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1316
		}

		Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1318
		var8 = var1.faceX.length; // L: 1319

		for (var9 = 0; var9 < var8; ++var9) { // L: 1320
			var10 = var1.faceX[var9]; // L: 1321
			var11 = var1.faceY[var9]; // L: 1322
			var12 = var1.faceZ[var9]; // L: 1323
			var13 = TileModel.field1628[var10]; // L: 1324
			int var14 = TileModel.field1628[var11]; // L: 1325
			int var15 = TileModel.field1628[var12]; // L: 1326
			int var16 = TileModel.field1634[var10]; // L: 1327
			int var17 = TileModel.field1634[var11]; // L: 1328
			int var18 = TileModel.field1634[var12]; // L: 1329
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1330
				Rasterizer3D.field1800 = false; // L: 1331
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1332
					Rasterizer3D.field1800 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1333
					Scene_selectedX = var6; // L: 1334
					Scene_selectedY = var7; // L: 1335
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1337
					if (!Scene_isLowDetail) { // L: 1341
						if (var1.isFlat) { // L: 1342
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], TileModel.field1630[0], TileModel.field1630[1], TileModel.field1630[3], TileModel.field1627[0], TileModel.field1627[1], TileModel.field1627[3], TileModel.field1632[0], TileModel.field1632[1], TileModel.field1632[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], TileModel.field1630[var10], TileModel.field1630[var11], TileModel.field1630[var12], TileModel.field1627[var10], TileModel.field1627[var11], TileModel.field1627[var12], TileModel.field1632[var10], TileModel.field1632[var11], TileModel.field1632[var12], var1.triangleTextureId[var9]); // L: 1343
						}
					} else {
						int var19 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1346
						Rasterizer3D.method3155(var16, var17, var18, var13, var14, var15, method3262(var19, var1.triangleColorA[var9]), method3262(var19, var1.triangleColorB[var9]), method3262(var19, var1.triangleColorC[var9])); // L: 1347
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1338
					Rasterizer3D.method3155(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1352

	@ObfuscatedName("ap")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1379
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1380
		Scene_currentOccludersCount = 0; // L: 1381

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1382
			Occluder var4 = var2[var3]; // L: 1383
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1384
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1385
				if (var5 >= 0 && var5 <= 50) { // L: 1386
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1387
					if (var6 < 0) { // L: 1388
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1389
					if (var7 > 50) { // L: 1390
						var7 = 50;
					}

					var13 = false; // L: 1391

					while (var6 <= var7) { // L: 1392
						if (visibleTiles[var5][var6++]) { // L: 1393
							var13 = true; // L: 1394
							break;
						}
					}

					if (var13) { // L: 1398
						var9 = Scene_cameraX - var4.minX; // L: 1399
						if (var9 > 32) { // L: 1400
							var4.field1931 = 1;
						} else {
							if (var9 >= -32) { // L: 1401
								continue;
							}

							var4.field1931 = 2; // L: 1402
							var9 = -var9; // L: 1403
						}

						var4.field1920 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1406
						var4.field1932 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1407
						var4.field1936 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1408
						var4.field1937 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1409
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1410
					}
				}
			} else if (var4.type == 2) { // L: 1413
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1414
				if (var5 >= 0 && var5 <= 50) { // L: 1415
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1416
					if (var6 < 0) { // L: 1417
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1418
					if (var7 > 50) { // L: 1419
						var7 = 50;
					}

					var13 = false; // L: 1420

					while (var6 <= var7) { // L: 1421
						if (visibleTiles[var6++][var5]) { // L: 1422
							var13 = true; // L: 1423
							break;
						}
					}

					if (var13) { // L: 1427
						var9 = Scene_cameraZ - var4.minZ; // L: 1428
						if (var9 > 32) { // L: 1429
							var4.field1931 = 3;
						} else {
							if (var9 >= -32) { // L: 1430
								continue;
							}

							var4.field1931 = 4; // L: 1431
							var9 = -var9; // L: 1432
						}

						var4.field1925 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1435
						var4.field1933 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1436
						var4.field1936 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1437
						var4.field1937 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1438
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1439
					}
				}
			} else if (var4.type == 4) { // L: 1442
				var5 = var4.minY - Scene_cameraY; // L: 1443
				if (var5 > 128) { // L: 1444
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1445
					if (var6 < 0) { // L: 1446
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1447
					if (var7 > 50) { // L: 1448
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1449
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1450
						if (var8 < 0) { // L: 1451
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1452
						if (var9 > 50) { // L: 1453
							var9 = 50;
						}

						boolean var10 = false; // L: 1454

						label148:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1455
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1456
								if (visibleTiles[var11][var12]) { // L: 1457
									var10 = true; // L: 1458
									break label148;
								}
							}
						}

						if (var10) { // L: 1463
							var4.field1931 = 5; // L: 1464
							var4.field1925 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1465
							var4.field1933 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1466
							var4.field1920 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1467
							var4.field1932 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1468
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1469
						}
					}
				}
			}
		}

	} // L: 1473

	@ObfuscatedName("ad")
	boolean method3265(int var1, int var2, int var3) {
		int var4 = this.field1837[var1][var2][var3]; // L: 1476
		if (var4 == -Scene_drawnCount) { // L: 1477
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1478
			return true;
		} else {
			int var5 = var2 << 7; // L: 1479
			int var6 = var3 << 7; // L: 1480
			if (this.method3269(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method3269(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method3269(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3269(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1481
				this.field1837[var1][var2][var3] = Scene_drawnCount; // L: 1482
				return true; // L: 1483
			} else {
				this.field1837[var1][var2][var3] = -Scene_drawnCount; // L: 1486
				return false; // L: 1487
			}
		}
	}

	@ObfuscatedName("bb")
	boolean method3346(int var1, int var2, int var3, int var4) {
		if (!this.method3265(var1, var2, var3)) { // L: 1492
			return false;
		} else {
			int var5 = var2 << 7; // L: 1493
			int var6 = var3 << 7; // L: 1494
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1495
			int var8 = var7 - 120; // L: 1496
			int var9 = var7 - 230; // L: 1497
			int var10 = var7 - 238; // L: 1498
			if (var4 < 16) { // L: 1499
				if (var4 == 1) { // L: 1500
					if (var5 > Scene_cameraX) { // L: 1501
						if (!this.method3269(var5, var7, var6)) { // L: 1502
							return false;
						}

						if (!this.method3269(var5, var7, var6 + 128)) { // L: 1503
							return false;
						}
					}

					if (var1 > 0) { // L: 1505
						if (!this.method3269(var5, var8, var6)) { // L: 1506
							return false;
						}

						if (!this.method3269(var5, var8, var6 + 128)) { // L: 1507
							return false;
						}
					}

					if (!this.method3269(var5, var9, var6)) { // L: 1509
						return false;
					}

					if (!this.method3269(var5, var9, var6 + 128)) { // L: 1510
						return false;
					}

					return true; // L: 1511
				}

				if (var4 == 2) { // L: 1513
					if (var6 < Scene_cameraZ) { // L: 1514
						if (!this.method3269(var5, var7, var6 + 128)) { // L: 1515
							return false;
						}

						if (!this.method3269(var5 + 128, var7, var6 + 128)) { // L: 1516
							return false;
						}
					}

					if (var1 > 0) { // L: 1518
						if (!this.method3269(var5, var8, var6 + 128)) { // L: 1519
							return false;
						}

						if (!this.method3269(var5 + 128, var8, var6 + 128)) { // L: 1520
							return false;
						}
					}

					if (!this.method3269(var5, var9, var6 + 128)) { // L: 1522
						return false;
					}

					if (!this.method3269(var5 + 128, var9, var6 + 128)) { // L: 1523
						return false;
					}

					return true; // L: 1524
				}

				if (var4 == 4) { // L: 1526
					if (var5 < Scene_cameraX) { // L: 1527
						if (!this.method3269(var5 + 128, var7, var6)) { // L: 1528
							return false;
						}

						if (!this.method3269(var5 + 128, var7, var6 + 128)) { // L: 1529
							return false;
						}
					}

					if (var1 > 0) { // L: 1531
						if (!this.method3269(var5 + 128, var8, var6)) { // L: 1532
							return false;
						}

						if (!this.method3269(var5 + 128, var8, var6 + 128)) { // L: 1533
							return false;
						}
					}

					if (!this.method3269(var5 + 128, var9, var6)) { // L: 1535
						return false;
					}

					if (!this.method3269(var5 + 128, var9, var6 + 128)) { // L: 1536
						return false;
					}

					return true; // L: 1537
				}

				if (var4 == 8) { // L: 1539
					if (var6 > Scene_cameraZ) { // L: 1540
						if (!this.method3269(var5, var7, var6)) { // L: 1541
							return false;
						}

						if (!this.method3269(var5 + 128, var7, var6)) { // L: 1542
							return false;
						}
					}

					if (var1 > 0) { // L: 1544
						if (!this.method3269(var5, var8, var6)) { // L: 1545
							return false;
						}

						if (!this.method3269(var5 + 128, var8, var6)) { // L: 1546
							return false;
						}
					}

					if (!this.method3269(var5, var9, var6)) { // L: 1548
						return false;
					}

					if (!this.method3269(var5 + 128, var9, var6)) { // L: 1549
						return false;
					}

					return true; // L: 1550
				}
			}

			if (!this.method3269(var5 + 64, var10, var6 + 64)) { // L: 1553
				return false;
			} else if (var4 == 16) { // L: 1554
				return this.method3269(var5, var9, var6 + 128); // L: 1555
			} else if (var4 == 32) { // L: 1558
				return this.method3269(var5 + 128, var9, var6 + 128); // L: 1559
			} else if (var4 == 64) { // L: 1562
				return this.method3269(var5 + 128, var9, var6); // L: 1563
			} else if (var4 == 128) { // L: 1566
				return this.method3269(var5, var9, var6); // L: 1567
			} else {
				return true; // L: 1570
			}
		}
	}

	@ObfuscatedName("bf")
	boolean method3325(int var1, int var2, int var3, int var4) {
		if (!this.method3265(var1, var2, var3)) { // L: 1574
			return false;
		} else {
			int var5 = var2 << 7; // L: 1575
			int var6 = var3 << 7; // L: 1576
			return this.method3269(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method3269(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3269(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3269(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1577
		}
	}

	@ObfuscatedName("bp")
	boolean method3343(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1582
			if (!this.method3265(var1, var2, var4)) { // L: 1583
				return false;
			} else {
				var7 = var2 << 7; // L: 1584
				var8 = var4 << 7; // L: 1585
				return this.method3269(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method3269(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3269(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3269(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1586
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1589
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1590
					if (this.field1837[var1][var7][var8] == -Scene_drawnCount) { // L: 1591
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1594
			var8 = (var4 << 7) + 2; // L: 1595
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1596
			if (!this.method3269(var7, var9, var8)) { // L: 1597
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1598
				if (!this.method3269(var10, var9, var8)) { // L: 1599
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1600
					if (!this.method3269(var7, var9, var11)) { // L: 1601
						return false;
					} else if (!this.method3269(var10, var9, var11)) { // L: 1602
						return false;
					} else {
						return true; // L: 1603
					}
				}
			}
		}
	}

	@ObfuscatedName("bg")
	boolean method3269(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1607
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1608
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field1931 == 1) { // L: 1609
				var6 = var5.minX - var1; // L: 1610
				if (var6 > 0) { // L: 1611
					var7 = (var6 * var5.field1920 >> 8) + var5.minZ; // L: 1612
					var8 = (var6 * var5.field1932 >> 8) + var5.maxZ; // L: 1613
					var9 = (var6 * var5.field1936 >> 8) + var5.minY; // L: 1614
					var10 = (var6 * var5.field1937 >> 8) + var5.maxY; // L: 1615
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1616
						return true;
					}
				}
			} else if (var5.field1931 == 2) { // L: 1620
				var6 = var1 - var5.minX; // L: 1621
				if (var6 > 0) { // L: 1622
					var7 = (var6 * var5.field1920 >> 8) + var5.minZ; // L: 1623
					var8 = (var6 * var5.field1932 >> 8) + var5.maxZ; // L: 1624
					var9 = (var6 * var5.field1936 >> 8) + var5.minY; // L: 1625
					var10 = (var6 * var5.field1937 >> 8) + var5.maxY; // L: 1626
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1627
						return true;
					}
				}
			} else if (var5.field1931 == 3) { // L: 1631
				var6 = var5.minZ - var3; // L: 1632
				if (var6 > 0) { // L: 1633
					var7 = (var6 * var5.field1925 >> 8) + var5.minX; // L: 1634
					var8 = (var6 * var5.field1933 >> 8) + var5.maxX; // L: 1635
					var9 = (var6 * var5.field1936 >> 8) + var5.minY; // L: 1636
					var10 = (var6 * var5.field1937 >> 8) + var5.maxY; // L: 1637
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1638
						return true;
					}
				}
			} else if (var5.field1931 == 4) { // L: 1642
				var6 = var3 - var5.minZ; // L: 1643
				if (var6 > 0) { // L: 1644
					var7 = (var6 * var5.field1925 >> 8) + var5.minX; // L: 1645
					var8 = (var6 * var5.field1933 >> 8) + var5.maxX; // L: 1646
					var9 = (var6 * var5.field1936 >> 8) + var5.minY; // L: 1647
					var10 = (var6 * var5.field1937 >> 8) + var5.maxY; // L: 1648
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1649
						return true;
					}
				}
			} else if (var5.field1931 == 5) { // L: 1653
				var6 = var2 - var5.minY; // L: 1654
				if (var6 > 0) { // L: 1655
					var7 = (var6 * var5.field1925 >> 8) + var5.minX; // L: 1656
					var8 = (var6 * var5.field1933 >> 8) + var5.maxX; // L: 1657
					var9 = (var6 * var5.field1920 >> 8) + var5.minZ; // L: 1658
					var10 = (var6 * var5.field1932 >> 8) + var5.maxZ; // L: 1659
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1660
						return true;
					}
				}
			}
		}

		return false; // L: 1665
	}

	@ObfuscatedName("m")
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

	@ObfuscatedName("ax")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 653
		Scene_viewportYMin = 0; // L: 654
		Scene_viewportXMax = var3; // L: 655
		Scene_viewportYMax = var4; // L: 656
		Scene_viewportXCenter = var3 / 2; // L: 657
		Scene_viewportYCenter = var4 / 2; // L: 658
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 659

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 660
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 661
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 662
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 663
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 664
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 665
				var8 = (var6 - 128) / 32; // L: 666
				var9 = var7 / 64; // L: 667

				for (int var10 = -26; var10 < 26; ++var10) { // L: 668
					for (var11 = -26; var11 < 26; ++var11) { // L: 669
						var12 = var10 * 128; // L: 670
						int var13 = var11 * 128; // L: 671
						boolean var14 = false; // L: 672

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 673
							if (method3309(var12, var0[var8] + var15, var13)) { // L: 674
								var14 = true; // L: 675
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 679
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 684
			for (var7 = 0; var7 < 32; ++var7) { // L: 685
				for (var8 = -25; var8 < 25; ++var8) { // L: 686
					for (var9 = -25; var9 < 25; ++var9) { // L: 687
						boolean var16 = false; // L: 688

						label83:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 689
							for (var12 = -1; var12 <= 1; ++var12) { // L: 690
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 691
									var16 = true; // L: 692
									break label83;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 695
									var16 = true; // L: 696
									break label83; // L: 697
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 699
									var16 = true; // L: 700
									break label83; // L: 701
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 703
									var16 = true; // L: 704
									break label83; // L: 705
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 709
					}
				}
			}
		}

	} // L: 714

	@ObfuscatedName("ag")
	static boolean method3309(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 717
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 718
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 719
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 720
		if (var5 >= 50 && var5 <= 3500) { // L: 721
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 722
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 723
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 724
		} else {
			return false; // L: 725
		}
	}

	@ObfuscatedName("an")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 744
	}

	@ObfuscatedName("am")
	public static void method3253() {
		Scene_selectedX = -1; // L: 748
		viewportWalking = false; // L: 749
	} // L: 750

	@ObfuscatedName("ae")
	static final int method3262(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1355
		if (var1 < 2) { // L: 1356
			var1 = 2;
		} else if (var1 > 126) { // L: 1357
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1358
	}

	@ObfuscatedName("al")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1362
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1363
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1364
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1365
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1366
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1367
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1368
			if (var8 == 0) { // L: 1369
				if (var9 != 0) { // L: 1372
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1373
				} else {
					return true; // L: 1375
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1370
			}
		}
	}
}
