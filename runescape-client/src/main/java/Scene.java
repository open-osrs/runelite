import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("v")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("p")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("s")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("b")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("w")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("a")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("m")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("q")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("y")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("z")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("e")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("t")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("i")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("ac")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("ax")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("ay")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("au")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("aw")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("ar")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("ae")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("ab")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("aa")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("ad")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("aj")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("av")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("aq")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Lhd;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("ah")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lhd;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("ak")
	static final int[] field2413;
	@ObfuscatedName("az")
	static final int[] field2414;
	@ObfuscatedName("ag")
	static final int[] field2415;
	@ObfuscatedName("af")
	static final int[] field2404;
	@ObfuscatedName("ap")
	static final int[] field2417;
	@ObfuscatedName("ai")
	static final int[] field2403;
	@ObfuscatedName("bk")
	static final int[] field2419;
	@ObfuscatedName("bq")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("br")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("bc")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("bd")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("bf")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("by")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("bu")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("bp")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("o")
	@Export("planes")
	int planes;
	@ObfuscatedName("h")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("g")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("l")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[[[Lgy;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("d")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("f")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("r")
	int[][][] field2410;
	@ObfuscatedName("ba")
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
		field2413 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field2414 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field2415 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field2404 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field2417 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field2403 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field2419 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
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
		this.field2410 = new int[var1][var2 + 1][var3 + 1]; // L: 100
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

	@ObfuscatedName("o")
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

	@ObfuscatedName("h")
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

	@ObfuscatedName("l")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 174
		if (var5 != null) { // L: 175
			this.tiles[var1][var2][var3].minPlane = var4; // L: 176
		}
	} // L: 177

	@ObfuscatedName("n")
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIILgh;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 198
			FloorDecoration var9 = new FloorDecoration(); // L: 199
			var9.renderable = var5; // L: 200
			var9.x = var2 * 128 + 64; // L: 201
			var9.y = var3 * 128 + 64; // L: 202
			var9.z = var4; // L: 203
			var9.tag = var6; // L: 204
			var9.flags = var8; // L: 205
			if (this.tiles[var1][var2][var3] == null) { // L: 206
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9; // L: 207
		}
	} // L: 208

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIILgh;JLgh;Lgh;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 211
		var10.first = var5; // L: 212
		var10.x = var2 * 128 + 64; // L: 213
		var10.y = var3 * 128 + 64; // L: 214
		var10.z = var4; // L: 215
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIILgh;Lgh;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 236
			BoundaryObject var12 = new BoundaryObject(); // L: 237
			var12.tag = var9; // L: 238
			var12.flags = var11; // L: 239
			var12.x = var2 * 128 + 64; // L: 240
			var12.y = var3 * 128 + 64; // L: 241
			var12.z = var4; // L: 242
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIILgh;Lgh;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 252
			WallDecoration var14 = new WallDecoration(); // L: 253
			var14.tag = var11; // L: 254
			var14.flags = var13; // L: 255
			var14.x = var2 * 128 + 64; // L: 256
			var14.y = var3 * 128 + 64; // L: 257
			var14.z = var4; // L: 258
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgh;IJI)Z"
	)
	public boolean method4138(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 270
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 271
			int var13 = var6 * 64 + var3 * 128; // L: 272
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 273
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgh;IJZ)Z"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgh;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 296 297
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILgh;IZJI)Z"
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
		var21.z = var8; // L: 314
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

	@ObfuscatedName("p")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 342
			GameObject var2 = this.tempGameObjects[var1]; // L: 343
			this.removeGameObject(var2); // L: 344
			this.tempGameObjects[var1] = null; // L: 345
		}

		this.tempGameObjectsCount = 0; // L: 347
	} // L: 348

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
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

	@ObfuscatedName("b")
	public void method4144(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 377
		if (var5 != null) { // L: 378
			WallDecoration var6 = var5.wallDecoration; // L: 379
			if (var6 != null) { // L: 380
				var6.xOffset = var4 * var6.xOffset / 16; // L: 381
				var6.yOffset = var4 * var6.yOffset / 16; // L: 382
			}
		}
	} // L: 383

	@ObfuscatedName("w")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 386
		if (var4 != null) {
			var4.boundaryObject = null; // L: 388
		}
	} // L: 387 389

	@ObfuscatedName("a")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 392
		if (var4 != null) {
			var4.wallDecoration = null; // L: 394
		}
	} // L: 393 395

	@ObfuscatedName("m")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 398
		if (var4 != null) { // L: 399
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 400
				GameObject var6 = var4.gameObjects[var5]; // L: 401
				long var8 = var6.tag; // L: 403
				int var10 = (int)(var8 >>> 14 & 3L); // L: 407
				boolean var7 = var10 == 2; // L: 409
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 411
					this.removeGameObject(var6); // L: 412
					return; // L: 413
				}
			}

		}
	} // L: 416

	@ObfuscatedName("q")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 419
		if (var4 != null) {
			var4.floorDecoration = null; // L: 421
		}
	} // L: 420 422

	@ObfuscatedName("y")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 425
		if (var4 != null) {
			var4.itemLayer = null; // L: 427
		}
	} // L: 426 428

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)Lhu;"
	)
	public BoundaryObject method4150(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 431
		return var4 == null ? null : var4.boundaryObject; // L: 432 433
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)Lhr;"
	)
	public WallDecoration method4224(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 437
		return var4 == null ? null : var4.wallDecoration; // L: 438 439
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 443
		if (var4 == null) { // L: 444
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 445
				GameObject var6 = var4.gameObjects[var5]; // L: 446
				long var8 = var6.tag; // L: 448
				int var10 = (int)(var8 >>> 14 & 3L); // L: 452
				boolean var7 = var10 == 2; // L: 454
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 456
					return var6;
				}
			}

			return null; // L: 458
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Lgb;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 462
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null; // L: 463 464
	}

	@ObfuscatedName("ac")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 468
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L; // L: 469 470
	}

	@ObfuscatedName("ax")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 474
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L; // L: 475 476
	}

	@ObfuscatedName("ay")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 480
		if (var4 == null) { // L: 481
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 482
				GameObject var6 = var4.gameObjects[var5]; // L: 483
				long var8 = var6.tag; // L: 485
				int var10 = (int)(var8 >>> 14 & 3L); // L: 489
				boolean var7 = var10 == 2; // L: 491
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 493
					return var6.tag;
				}
			}

			return 0L; // L: 495
		}
	}

	@ObfuscatedName("au")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 499
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L; // L: 500 501
	}

	@ObfuscatedName("at")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 505
		if (var6 == null) { // L: 506
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) { // L: 507
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) { // L: 508
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) { // L: 509
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 510
				if (var6.gameObjects[var7].tag == var4) { // L: 511
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 513
		}
	}

	@ObfuscatedName("aw")
	public void method4158(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 517
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 518
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 519
					Tile var7 = this.tiles[var4][var5][var6]; // L: 520
					if (var7 != null) { // L: 521
						BoundaryObject var8 = var7.boundaryObject; // L: 522
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 523
							ModelData var9 = (ModelData)var8.renderable1; // L: 524
							this.method4160(var9, var4, var5, var6, 1, 1); // L: 525
							if (var8.renderable2 instanceof ModelData) { // L: 526
								var10 = (ModelData)var8.renderable2; // L: 527
								this.method4160(var10, var4, var5, var6, 1, 1); // L: 528
								ModelData.method3976(var9, var10, 0, 0, 0, false); // L: 529
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 530
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 532
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 534
							GameObject var14 = var7.gameObjects[var12]; // L: 535
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 536
								ModelData var11 = (ModelData)var14.renderable; // L: 537
								this.method4160(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 538
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 539
							}
						}

						FloorDecoration var13 = var7.floorDecoration; // L: 542
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 543
							var10 = (ModelData)var13.renderable; // L: 544
							this.method4159(var10, var4, var5, var6); // L: 545
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 546
						}
					}
				}
			}
		}

	} // L: 552

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lgt;III)V"
	)
	void method4159(ModelData var1, int var2, int var3, int var4) {
		Tile var5;
		ModelData var6;
		if (var3 < this.xSize) { // L: 555
			var5 = this.tiles[var2][var3 + 1][var4]; // L: 556
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 557
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 558
				ModelData.method3976(var1, var6, 128, 0, 0, true); // L: 559
			}
		}

		if (var4 < this.xSize) { // L: 562
			var5 = this.tiles[var2][var3][var4 + 1]; // L: 563
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 564
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 565
				ModelData.method3976(var1, var6, 0, 0, 128, true); // L: 566
			}
		}

		if (var3 < this.xSize && var4 < this.ySize) { // L: 569
			var5 = this.tiles[var2][var3 + 1][var4 + 1]; // L: 570
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 571
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 572
				ModelData.method3976(var1, var6, 128, 0, 128, true); // L: 573
			}
		}

		if (var3 < this.xSize && var4 > 0) { // L: 576
			var5 = this.tiles[var2][var3 + 1][var4 - 1]; // L: 577
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 578
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 579
				ModelData.method3976(var1, var6, 128, 0, -128, true); // L: 580
			}
		}

	} // L: 583

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgt;IIIII)V"
	)
	void method4160(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 586
		int var8 = var3; // L: 587
		int var9 = var3 + var5; // L: 588
		int var10 = var4 - 1; // L: 589
		int var11 = var4 + var6; // L: 590

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 591
			if (var12 != this.planes) { // L: 592
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 593
					if (var13 >= 0 && var13 < this.xSize) { // L: 594
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 595
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 596 597
								Tile var15 = this.tiles[var12][var13][var14]; // L: 598
								if (var15 != null) { // L: 599
									int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4; // L: 600
									BoundaryObject var17 = var15.boundaryObject; // L: 601
									if (var17 != null) { // L: 602
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 603
											var18 = (ModelData)var17.renderable1; // L: 604
											ModelData.method3976(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 605
										}

										if (var17.renderable2 instanceof ModelData) { // L: 607
											var18 = (ModelData)var17.renderable2; // L: 608
											ModelData.method3976(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 609
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 612
										GameObject var19 = var15.gameObjects[var23]; // L: 613
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 614
											ModelData var20 = (ModelData)var19.renderable; // L: 615
											int var21 = var19.endX - var19.startX + 1; // L: 616
											int var22 = var19.endY - var19.startY + 1; // L: 617
											ModelData.method3976(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 618
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 623
				var7 = false; // L: 624
			}
		}

	} // L: 626

	@ObfuscatedName("ab")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 629
		if (var7 != null) { // L: 630
			SceneTilePaint var8 = var7.paint; // L: 631
			int var10;
			if (var8 != null) { // L: 632
				int var18 = var8.rgb; // L: 633
				if (var18 != 0) { // L: 634
					for (var10 = 0; var10 < 4; ++var10) { // L: 635
						var1[var2] = var18; // L: 636
						var1[var2 + 1] = var18; // L: 637
						var1[var2 + 2] = var18; // L: 638
						var1[var2 + 3] = var18; // L: 639
						var2 += var3; // L: 640
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 644
				if (var9 != null) { // L: 645
					var10 = var9.shape; // L: 646
					int var11 = var9.rotation; // L: 647
					int var12 = var9.underlayRgb; // L: 648
					int var13 = var9.overlayRgb; // L: 649
					int[] var14 = this.tileShape2D[var10]; // L: 650
					int[] var15 = this.tileRotation2D[var11]; // L: 651
					int var16 = 0; // L: 652
					int var17;
					if (var12 != 0) { // L: 653
						for (var17 = 0; var17 < 4; ++var17) { // L: 654
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 655
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 656
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 657
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 658
							var2 += var3; // L: 659
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 663
							if (var14[var15[var16++]] != 0) { // L: 664
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 665
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 666
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 667
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 668
						}
					}

				}
			}
		}
	} // L: 642 671

	@ObfuscatedName("aj")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 750
			checkClick = true; // L: 751
			viewportWalking = var4; // L: 752
			Scene_selectedPlane = var1; // L: 753
			Scene_selectedScreenX = var2; // L: 754
			Scene_selectedScreenY = var3; // L: 755
			Scene_selectedX = -1; // L: 756
			Scene_selectedY = -1; // L: 757
		}
	} // L: 758

	@ObfuscatedName("as")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 761
	} // L: 762

	@ObfuscatedName("aq")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 774
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 775
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 776
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 777
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 778
			var4 = 128;
		} else if (var4 > 383) { // L: 779
			var4 = 383;
		}

		++Scene_drawnCount; // L: 780
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 781
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 782
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 783
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 784
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 785
		Scene_cameraX = var1; // L: 786
		Scene_cameraY = var2; // L: 787
		Scene_cameraZ = var3; // L: 788
		Scene_cameraXTile = var1 / 128; // L: 789
		Scene_cameraYTile = var3 / 128; // L: 790
		Scene_plane = var6; // L: 791
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 792
		if (Scene_cameraXTileMin < 0) { // L: 793
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 794
		if (Scene_cameraYTileMin < 0) { // L: 795
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 796
		if (Scene_cameraXTileMax > this.xSize) { // L: 797
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 798
		if (Scene_cameraYTileMax > this.ySize) { // L: 799
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 800
		tileUpdateCount = 0; // L: 801

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 802
			var8 = this.tiles[var7]; // L: 803

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 804
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 805
					Tile var16 = var8[var9][var10]; // L: 806
					if (var16 != null) { // L: 807
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 808
							var16.drawPrimary = true; // L: 814
							var16.drawSecondary = true; // L: 815
							if (var16.gameObjectsCount > 0) { // L: 816
								var16.drawGameObjects = true;
							} else {
								var16.drawGameObjects = false; // L: 817
							}

							++tileUpdateCount; // L: 818
						} else {
							var16.drawPrimary = false; // L: 809
							var16.drawSecondary = false; // L: 810
							var16.drawGameObjectEdges = 0; // L: 811
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
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 824
			var8 = this.tiles[var7]; // L: 825

			for (var9 = -25; var9 <= 0; ++var9) { // L: 826
				var10 = var9 + Scene_cameraXTile; // L: 827
				var11 = Scene_cameraXTile - var9; // L: 828
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 829
					for (var12 = -25; var12 <= 0; ++var12) { // L: 830
						var13 = var12 + Scene_cameraYTile; // L: 831
						var14 = Scene_cameraYTile - var12; // L: 832
						if (var10 >= Scene_cameraXTileMin) { // L: 833
							if (var13 >= Scene_cameraYTileMin) { // L: 834
								var15 = var8[var10][var13]; // L: 835
								if (var15 != null && var15.drawPrimary) { // L: 836
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 838
								var15 = var8[var10][var14]; // L: 839
								if (var15 != null && var15.drawPrimary) { // L: 840
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 843
							if (var13 >= Scene_cameraYTileMin) { // L: 844
								var15 = var8[var11][var13]; // L: 845
								if (var15 != null && var15.drawPrimary) { // L: 846
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 848
								var15 = var8[var11][var14]; // L: 849
								if (var15 != null && var15.drawPrimary) { // L: 850
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 853
							checkClick = false; // L: 854
							return; // L: 855
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 861
			var8 = this.tiles[var7]; // L: 862

			for (var9 = -25; var9 <= 0; ++var9) { // L: 863
				var10 = var9 + Scene_cameraXTile; // L: 864
				var11 = Scene_cameraXTile - var9; // L: 865
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 866
					for (var12 = -25; var12 <= 0; ++var12) { // L: 867
						var13 = var12 + Scene_cameraYTile; // L: 868
						var14 = Scene_cameraYTile - var12; // L: 869
						if (var10 >= Scene_cameraXTileMin) { // L: 870
							if (var13 >= Scene_cameraYTileMin) { // L: 871
								var15 = var8[var10][var13]; // L: 872
								if (var15 != null && var15.drawPrimary) { // L: 873
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 875
								var15 = var8[var10][var14]; // L: 876
								if (var15 != null && var15.drawPrimary) { // L: 877
									this.drawTile(var15, false);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 880
							if (var13 >= Scene_cameraYTileMin) { // L: 881
								var15 = var8[var11][var13]; // L: 882
								if (var15 != null && var15.drawPrimary) { // L: 883
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 885
								var15 = var8[var11][var14]; // L: 886
								if (var15 != null && var15.drawPrimary) { // L: 887
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 890
							checkClick = false; // L: 891
							return; // L: 892
						}
					}
				}
			}
		}

		checkClick = false; // L: 898
	} // L: 899

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgy;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 902

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
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 904
												if (var3 == null) { // L: 905
													return;
												}
											} while(!var3.drawSecondary); // L: 906

											var4 = var3.x; // L: 907
											var5 = var3.y; // L: 908
											var6 = var3.plane; // L: 909
											var7 = var3.originalPlane; // L: 910
											var8 = this.tiles[var6]; // L: 911
											if (!var3.drawPrimary) { // L: 912
												break;
											}

											if (var2) { // L: 913
												if (var6 > 0) { // L: 914
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 915
													if (var9 != null && var9.drawSecondary) { // L: 916
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 918
													var9 = var8[var4 - 1][var5]; // L: 919
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 920
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 922
													var9 = var8[var4 + 1][var5]; // L: 923
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 924
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 926
													var9 = var8[var4][var5 - 1]; // L: 927
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 928
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 930
													var9 = var8[var4][var5 + 1]; // L: 931
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 932
														continue;
													}
												}
											} else {
												var2 = true; // L: 935
											}

											var3.drawPrimary = false; // L: 936
											if (var3.linkedBelowTile != null) { // L: 937
												var9 = var3.linkedBelowTile; // L: 938
												if (var9.paint != null) { // L: 939
													if (!this.method4175(0, var4, var5)) { // L: 940
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method4175(0, var4, var5)) { // L: 942 943
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.boundaryObject; // L: 945
												if (var10 != null) { // L: 946
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.z - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 947
													var12 = var9.gameObjects[var11]; // L: 948
													if (var12 != null) { // L: 949
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.z - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 952
											if (var3.paint != null) { // L: 953
												if (!this.method4175(var7, var4, var5)) { // L: 954
													var20 = true; // L: 955
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 956
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method4175(var7, var4, var5)) { // L: 959 960
												var20 = true; // L: 961
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 962
											}

											var21 = 0; // L: 965
											var11 = 0; // L: 966
											BoundaryObject var31 = var3.boundaryObject; // L: 967
											WallDecoration var13 = var3.wallDecoration; // L: 968
											if (var31 != null || var13 != null) { // L: 969
												if (var4 == Scene_cameraXTile) { // L: 970
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 971
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 972
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 973
													var21 += 6;
												}

												var11 = field2413[var21]; // L: 974
												var3.field2318 = field2415[var21]; // L: 975
											}

											if (var31 != null) { // L: 977
												if ((var31.orientationA & field2414[var21]) != 0) { // L: 978
													if (var31.orientationA == 16) { // L: 979
														var3.drawGameObjectEdges = 3; // L: 980
														var3.field2300 = field2404[var21]; // L: 981
														var3.field2305 = 3 - var3.field2300; // L: 982
													} else if (var31.orientationA == 32) { // L: 984
														var3.drawGameObjectEdges = 6; // L: 985
														var3.field2300 = field2417[var21]; // L: 986
														var3.field2305 = 6 - var3.field2300; // L: 987
													} else if (var31.orientationA == 64) { // L: 989
														var3.drawGameObjectEdges = 12; // L: 990
														var3.field2300 = field2403[var21]; // L: 991
														var3.field2305 = 12 - var3.field2300; // L: 992
													} else {
														var3.drawGameObjectEdges = 9; // L: 995
														var3.field2300 = field2419[var21]; // L: 996
														var3.field2305 = 9 - var3.field2300; // L: 997
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 1000
												}

												if ((var31.orientationA & var11) != 0 && !this.method4176(var7, var4, var5, var31.orientationA)) { // L: 1001
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.z - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method4176(var7, var4, var5, var31.orientationB)) { // L: 1002
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.z - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method4177(var7, var4, var5, var13.renderable1.height)) { // L: 1004
												if ((var13.orientation & var11) != 0) { // L: 1005
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.x - Scene_cameraX + var13.xOffset, var13.z - Scene_cameraY, var13.y - Scene_cameraZ + var13.yOffset, var13.tag); // L: 1006
												} else if (var13.orientation == 256) { // L: 1008
													var14 = var13.x - Scene_cameraX; // L: 1009
													var15 = var13.z - Scene_cameraY; // L: 1010
													var16 = var13.y - Scene_cameraZ; // L: 1011
													var17 = var13.orientation2; // L: 1012
													if (var17 != 1 && var17 != 2) { // L: 1014
														var18 = var14; // L: 1015
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 1017
														var19 = var16; // L: 1018
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 1019
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 1020
													} else if (var13.renderable2 != null) { // L: 1022
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 1023
													}
												}
											}

											if (var20) { // L: 1027
												FloorDecoration var22 = var3.floorDecoration; // L: 1028
												if (var22 != null) { // L: 1029
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x - Scene_cameraX, var22.z - Scene_cameraY, var22.y - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 1030
												if (var23 != null && var23.height == 0) { // L: 1031
													if (var23.second != null) { // L: 1032
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.z - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 1033
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.z - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 1034
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.z - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1037
											if (var14 != 0) { // L: 1038
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1039
													var36 = var8[var4 + 1][var5]; // L: 1040
													if (var36 != null && var36.drawSecondary) { // L: 1041
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1043
													var36 = var8[var4][var5 + 1]; // L: 1044
													if (var36 != null && var36.drawSecondary) { // L: 1045
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1047
													var36 = var8[var4 - 1][var5]; // L: 1048
													if (var36 != null && var36.drawSecondary) { // L: 1049
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1051
													var36 = var8[var4][var5 - 1]; // L: 1052
													if (var36 != null && var36.drawSecondary) { // L: 1053
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1057
											var20 = true; // L: 1058

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1059
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field2300) { // L: 1060
													var20 = false; // L: 1061
													break; // L: 1062
												}
											}

											if (var20) { // L: 1065
												var10 = var3.boundaryObject; // L: 1066
												if (!this.method4176(var7, var4, var5, var10.orientationA)) { // L: 1067
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.z - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1068
											}
										}

										if (!var3.drawGameObjects) { // L: 1071
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1073
											var3.drawGameObjects = false; // L: 1074
											var21 = 0; // L: 1075

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1076
												var12 = var3.gameObjects[var11]; // L: 1077
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1078
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1079
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1080
															var36 = var8[var24][var14]; // L: 1081
															if (var36.drawPrimary) { // L: 1082
																var3.drawGameObjects = true; // L: 1083
																continue label563; // L: 1084
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1086
																var16 = 0; // L: 1087
																if (var24 > var12.startX) { // L: 1088
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1089
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1090
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1091
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field2305) { // L: 1092
																	var3.drawGameObjects = true; // L: 1093
																	continue label563; // L: 1094
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1099
													var24 = Scene_cameraXTile - var12.startX; // L: 1100
													var14 = var12.endX - Scene_cameraXTile; // L: 1101
													if (var14 > var24) { // L: 1102
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1103
													var16 = var12.endY - Scene_cameraYTile; // L: 1104
													if (var16 > var15) { // L: 1105
														var12.field2639 = var24 + var16;
													} else {
														var12.field2639 = var24 + var15; // L: 1106
													}
												}
											}

											while (var21 > 0) { // L: 1109
												var11 = -50; // L: 1110
												var25 = -1; // L: 1111

												for (var24 = 0; var24 < var21; ++var24) { // L: 1112
													GameObject var35 = gameObjects[var24]; // L: 1113
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1114
														if (var35.field2639 > var11) { // L: 1115
															var11 = var35.field2639; // L: 1116
															var25 = var24; // L: 1117
														} else if (var11 == var35.field2639) { // L: 1119
															var15 = var35.centerX - Scene_cameraX; // L: 1120
															var16 = var35.centerY - Scene_cameraZ; // L: 1121
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1122
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1123
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1124
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1128
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1129
												var33.lastDrawn = Scene_drawnCount; // L: 1130
												if (!this.method4178(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1131
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.z - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1132
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1134
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1135
														Tile var26 = var8[var14][var15]; // L: 1136
														if (var26.drawGameObjectEdges != 0) { // L: 1137
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1138
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1142
												break;
											}
										} catch (Exception var28) { // L: 1144
											var3.drawGameObjects = false; // L: 1145
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1148
							} while(var3.drawGameObjectEdges != 0); // L: 1149

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1150
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1151
						} while(var9 != null && var9.drawSecondary); // L: 1152

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1154
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1155
					} while(var9 != null && var9.drawSecondary); // L: 1156

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1158
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1159
				} while(var9 != null && var9.drawSecondary); // L: 1160

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1162
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1163
			} while(var9 != null && var9.drawSecondary); // L: 1164

			var3.drawSecondary = false; // L: 1166
			--tileUpdateCount; // L: 1167
			ItemLayer var32 = var3.itemLayer; // L: 1168
			if (var32 != null && var32.height != 0) { // L: 1169
				if (var32.second != null) { // L: 1170
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1171
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1172
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field2318 != 0) { // L: 1174
				WallDecoration var29 = var3.wallDecoration; // L: 1175
				if (var29 != null && !this.method4177(var7, var4, var5, var29.renderable1.height)) { // L: 1176
					if ((var29.orientation & var3.field2318) != 0) { // L: 1177
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x - Scene_cameraX + var29.xOffset, var29.z - Scene_cameraY, var29.y - Scene_cameraZ + var29.yOffset, var29.tag); // L: 1178
					} else if (var29.orientation == 256) { // L: 1180
						var11 = var29.x - Scene_cameraX; // L: 1181
						var25 = var29.z - Scene_cameraY; // L: 1182
						var24 = var29.y - Scene_cameraZ; // L: 1183
						var14 = var29.orientation2; // L: 1184
						if (var14 != 1 && var14 != 2) { // L: 1186
							var15 = var11; // L: 1187
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1189
							var16 = var24; // L: 1190
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1191
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1192
						} else if (var29.renderable2 != null) { // L: 1194
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1195
						}
					}
				}

				BoundaryObject var27 = var3.boundaryObject; // L: 1199
				if (var27 != null) { // L: 1200
					if ((var27.orientationB & var3.field2318) != 0 && !this.method4176(var7, var4, var5, var27.orientationB)) { // L: 1201
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.z - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field2318) != 0 && !this.method4176(var7, var4, var5, var27.orientationA)) { // L: 1202
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.z - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1205
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1206
				if (var30 != null && var30.drawSecondary) { // L: 1207
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1209
				var30 = var8[var4 + 1][var5]; // L: 1210
				if (var30 != null && var30.drawSecondary) { // L: 1211
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1213
				var30 = var8[var4][var5 + 1]; // L: 1214
				if (var30 != null && var30.drawSecondary) { // L: 1215
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1217
				var30 = var8[var4 - 1][var5]; // L: 1218
				if (var30 != null && var30.drawSecondary) { // L: 1219
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1221
				var30 = var8[var4][var5 - 1]; // L: 1222
				if (var30 != null && var30.drawSecondary) { // L: 1223
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhj;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1231
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1233
		int var13;
		int var14 = var13 = var10 + 128; // L: 1235
		int var15;
		int var16 = var15 = var12 + 128; // L: 1237
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1238
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1239
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1240
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1241
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1242
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1243
		var10 = var21; // L: 1244
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1245
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1246
		var17 = var21; // L: 1247
		if (var12 >= 50) { // L: 1248
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1249
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1250
			var14 = var21; // L: 1251
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1252
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1253
			var18 = var21; // L: 1254
			if (var11 >= 50) { // L: 1255
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1256
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1257
				var13 = var21; // L: 1258
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1259
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1260
				var19 = var21; // L: 1261
				if (var16 >= 50) { // L: 1262
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1263
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1264
					var9 = var21; // L: 1265
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1266
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1267
					if (var15 >= 50) { // L: 1269
						int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1270
						int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1271
						int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1272
						int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1273
						int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1274
						int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1275
						int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1276
						int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1277
						Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1278
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1279
							Rasterizer3D.field2334 = false; // L: 1280
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1281
								Rasterizer3D.field2334 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1282
								Scene_selectedX = var7; // L: 1283
								Scene_selectedY = var8; // L: 1284
							}

							if (var1.texture == -1) { // L: 1286
								if (var1.neColor != 12345678) { // L: 1287
									Rasterizer3D.method4003(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1289
								if (var1.isFlat) { // L: 1290
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1291
								}
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1294
								Rasterizer3D.method4003(var27, var29, var25, var26, var28, var24, method4205(var30, var1.neColor), method4205(var30, var1.nwColor), method4205(var30, var1.seColor)); // L: 1295
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1298
							Rasterizer3D.field2334 = false; // L: 1299
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1300
								Rasterizer3D.field2334 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1301
								Scene_selectedX = var7; // L: 1302
								Scene_selectedY = var8; // L: 1303
							}

							if (var1.texture == -1) { // L: 1305
								if (var1.swColor != 12345678) { // L: 1306
									Rasterizer3D.method4003(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1308
								Rasterizer3D.drawTexturedTile(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1309
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1312
								Rasterizer3D.method4003(var23, var25, var29, var22, var24, var28, method4205(var30, var1.swColor), method4205(var30, var1.seColor), method4205(var30, var1.nwColor)); // L: 1313
							}
						}

					}
				}
			}
		}
	} // L: 1316

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lhp;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1319

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1320
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1321
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1322
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1323
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1324
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1325
			var10 = var13; // L: 1326
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1327
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1328
			if (var12 < 50) { // L: 1330
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1331
				SceneTileModel.field2472[var9] = var10; // L: 1332
				SceneTileModel.field2490[var9] = var13; // L: 1333
				SceneTileModel.field2485[var9] = var12; // L: 1334
			}

			SceneTileModel.field2491[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1336
			SceneTileModel.field2488[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1337
		}

		Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1339
		var8 = var1.faceX.length; // L: 1340

		for (var9 = 0; var9 < var8; ++var9) { // L: 1341
			var10 = var1.faceX[var9]; // L: 1342
			var11 = var1.faceY[var9]; // L: 1343
			var12 = var1.faceZ[var9]; // L: 1344
			var13 = SceneTileModel.field2491[var10]; // L: 1345
			int var14 = SceneTileModel.field2491[var11]; // L: 1346
			int var15 = SceneTileModel.field2491[var12]; // L: 1347
			int var16 = SceneTileModel.field2488[var10]; // L: 1348
			int var17 = SceneTileModel.field2488[var11]; // L: 1349
			int var18 = SceneTileModel.field2488[var12]; // L: 1350
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1351
				Rasterizer3D.field2334 = false; // L: 1352
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1353
					Rasterizer3D.field2334 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1354
					Scene_selectedX = var6; // L: 1355
					Scene_selectedY = var7; // L: 1356
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1358
					if (!Scene_isLowDetail) { // L: 1362
						if (var1.isFlat) { // L: 1363
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2472[0], SceneTileModel.field2472[1], SceneTileModel.field2472[3], SceneTileModel.field2490[0], SceneTileModel.field2490[1], SceneTileModel.field2490[3], SceneTileModel.field2485[0], SceneTileModel.field2485[1], SceneTileModel.field2485[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2472[var10], SceneTileModel.field2472[var11], SceneTileModel.field2472[var12], SceneTileModel.field2490[var10], SceneTileModel.field2490[var11], SceneTileModel.field2490[var12], SceneTileModel.field2485[var10], SceneTileModel.field2485[var11], SceneTileModel.field2485[var12], var1.triangleTextureId[var9]); // L: 1364
						}
					} else {
						int var19 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1367
						Rasterizer3D.method4003(var16, var17, var18, var13, var14, var15, method4205(var19, var1.triangleColorA[var9]), method4205(var19, var1.triangleColorB[var9]), method4205(var19, var1.triangleColorC[var9])); // L: 1368
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1359
					Rasterizer3D.method4003(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1373

	@ObfuscatedName("az")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1400
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1401
		Scene_currentOccludersCount = 0; // L: 1402

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1403
			Occluder var4 = var2[var3]; // L: 1404
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1405
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1406
				if (var5 >= 0 && var5 <= 50) { // L: 1407
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1408
					if (var6 < 0) { // L: 1409
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1410
					if (var7 > 50) { // L: 1411
						var7 = 50;
					}

					var13 = false; // L: 1412

					while (var6 <= var7) { // L: 1413
						if (visibleTiles[var5][var6++]) { // L: 1414
							var13 = true; // L: 1415
							break;
						}
					}

					if (var13) { // L: 1419
						var9 = Scene_cameraX - var4.minX; // L: 1420
						if (var9 > 32) { // L: 1421
							var4.field2453 = 1;
						} else {
							if (var9 >= -32) { // L: 1422
								continue;
							}

							var4.field2453 = 2; // L: 1423
							var9 = -var9; // L: 1424
						}

						var4.field2456 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1427
						var4.field2460 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1428
						var4.field2458 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1429
						var4.field2459 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1430
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1431
					}
				}
			} else if (var4.type == 2) { // L: 1434
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1435
				if (var5 >= 0 && var5 <= 50) { // L: 1436
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1437
					if (var6 < 0) { // L: 1438
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1439
					if (var7 > 50) { // L: 1440
						var7 = 50;
					}

					var13 = false; // L: 1441

					while (var6 <= var7) { // L: 1442
						if (visibleTiles[var6++][var5]) { // L: 1443
							var13 = true; // L: 1444
							break;
						}
					}

					if (var13) { // L: 1448
						var9 = Scene_cameraZ - var4.minZ; // L: 1449
						if (var9 > 32) { // L: 1450
							var4.field2453 = 3;
						} else {
							if (var9 >= -32) { // L: 1451
								continue;
							}

							var4.field2453 = 4; // L: 1452
							var9 = -var9; // L: 1453
						}

						var4.field2454 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1456
						var4.field2455 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1457
						var4.field2458 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1458
						var4.field2459 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1459
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1460
					}
				}
			} else if (var4.type == 4) { // L: 1463
				var5 = var4.minY - Scene_cameraY; // L: 1464
				if (var5 > 128) { // L: 1465
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1466
					if (var6 < 0) { // L: 1467
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1468
					if (var7 > 50) { // L: 1469
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1470
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1471
						if (var8 < 0) { // L: 1472
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1473
						if (var9 > 50) { // L: 1474
							var9 = 50;
						}

						boolean var10 = false; // L: 1475

						label148:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1476
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1477
								if (visibleTiles[var11][var12]) { // L: 1478
									var10 = true; // L: 1479
									break label148;
								}
							}
						}

						if (var10) { // L: 1484
							var4.field2453 = 5; // L: 1485
							var4.field2454 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1486
							var4.field2455 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1487
							var4.field2456 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1488
							var4.field2460 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1489
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1490
						}
					}
				}
			}
		}

	} // L: 1494

	@ObfuscatedName("ag")
	boolean method4175(int var1, int var2, int var3) {
		int var4 = this.field2410[var1][var2][var3]; // L: 1497
		if (var4 == -Scene_drawnCount) { // L: 1498
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1499
			return true;
		} else {
			int var5 = var2 << 7; // L: 1500
			int var6 = var3 << 7; // L: 1501
			if (this.method4129(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4129(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4129(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4129(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1502
				this.field2410[var1][var2][var3] = Scene_drawnCount; // L: 1503
				return true; // L: 1504
			} else {
				this.field2410[var1][var2][var3] = -Scene_drawnCount; // L: 1507
				return false; // L: 1508
			}
		}
	}

	@ObfuscatedName("af")
	boolean method4176(int var1, int var2, int var3, int var4) {
		if (!this.method4175(var1, var2, var3)) { // L: 1513
			return false;
		} else {
			int var5 = var2 << 7; // L: 1514
			int var6 = var3 << 7; // L: 1515
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1516
			int var8 = var7 - 120; // L: 1517
			int var9 = var7 - 230; // L: 1518
			int var10 = var7 - 238; // L: 1519
			if (var4 < 16) { // L: 1520
				if (var4 == 1) { // L: 1521
					if (var5 > Scene_cameraX) { // L: 1522
						if (!this.method4129(var5, var7, var6)) { // L: 1523
							return false;
						}

						if (!this.method4129(var5, var7, var6 + 128)) { // L: 1524
							return false;
						}
					}

					if (var1 > 0) { // L: 1526
						if (!this.method4129(var5, var8, var6)) { // L: 1527
							return false;
						}

						if (!this.method4129(var5, var8, var6 + 128)) { // L: 1528
							return false;
						}
					}

					if (!this.method4129(var5, var9, var6)) { // L: 1530
						return false;
					}

					if (!this.method4129(var5, var9, var6 + 128)) { // L: 1531
						return false;
					}

					return true; // L: 1532
				}

				if (var4 == 2) { // L: 1534
					if (var6 < Scene_cameraZ) { // L: 1535
						if (!this.method4129(var5, var7, var6 + 128)) { // L: 1536
							return false;
						}

						if (!this.method4129(var5 + 128, var7, var6 + 128)) { // L: 1537
							return false;
						}
					}

					if (var1 > 0) { // L: 1539
						if (!this.method4129(var5, var8, var6 + 128)) { // L: 1540
							return false;
						}

						if (!this.method4129(var5 + 128, var8, var6 + 128)) { // L: 1541
							return false;
						}
					}

					if (!this.method4129(var5, var9, var6 + 128)) { // L: 1543
						return false;
					}

					if (!this.method4129(var5 + 128, var9, var6 + 128)) { // L: 1544
						return false;
					}

					return true; // L: 1545
				}

				if (var4 == 4) { // L: 1547
					if (var5 < Scene_cameraX) { // L: 1548
						if (!this.method4129(var5 + 128, var7, var6)) { // L: 1549
							return false;
						}

						if (!this.method4129(var5 + 128, var7, var6 + 128)) { // L: 1550
							return false;
						}
					}

					if (var1 > 0) { // L: 1552
						if (!this.method4129(var5 + 128, var8, var6)) { // L: 1553
							return false;
						}

						if (!this.method4129(var5 + 128, var8, var6 + 128)) { // L: 1554
							return false;
						}
					}

					if (!this.method4129(var5 + 128, var9, var6)) { // L: 1556
						return false;
					}

					if (!this.method4129(var5 + 128, var9, var6 + 128)) { // L: 1557
						return false;
					}

					return true; // L: 1558
				}

				if (var4 == 8) { // L: 1560
					if (var6 > Scene_cameraZ) { // L: 1561
						if (!this.method4129(var5, var7, var6)) { // L: 1562
							return false;
						}

						if (!this.method4129(var5 + 128, var7, var6)) { // L: 1563
							return false;
						}
					}

					if (var1 > 0) { // L: 1565
						if (!this.method4129(var5, var8, var6)) { // L: 1566
							return false;
						}

						if (!this.method4129(var5 + 128, var8, var6)) { // L: 1567
							return false;
						}
					}

					if (!this.method4129(var5, var9, var6)) { // L: 1569
						return false;
					}

					if (!this.method4129(var5 + 128, var9, var6)) { // L: 1570
						return false;
					}

					return true; // L: 1571
				}
			}

			if (!this.method4129(var5 + 64, var10, var6 + 64)) { // L: 1574
				return false;
			} else if (var4 == 16) { // L: 1575
				return this.method4129(var5, var9, var6 + 128); // L: 1576
			} else if (var4 == 32) { // L: 1579
				return this.method4129(var5 + 128, var9, var6 + 128); // L: 1580
			} else if (var4 == 64) { // L: 1583
				return this.method4129(var5 + 128, var9, var6); // L: 1584
			} else if (var4 == 128) { // L: 1587
				return this.method4129(var5, var9, var6); // L: 1588
			} else {
				return true; // L: 1591
			}
		}
	}

	@ObfuscatedName("ap")
	boolean method4177(int var1, int var2, int var3, int var4) {
		if (!this.method4175(var1, var2, var3)) { // L: 1595
			return false;
		} else {
			int var5 = var2 << 7; // L: 1596
			int var6 = var3 << 7; // L: 1597
			return this.method4129(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4129(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4129(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4129(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1598
		}
	}

	@ObfuscatedName("ai")
	boolean method4178(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1603
			if (!this.method4175(var1, var2, var4)) { // L: 1604
				return false;
			} else {
				var7 = var2 << 7; // L: 1605
				var8 = var4 << 7; // L: 1606
				return this.method4129(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4129(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4129(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4129(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1607
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1610
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1611
					if (this.field2410[var1][var7][var8] == -Scene_drawnCount) { // L: 1612
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1615
			var8 = (var4 << 7) + 2; // L: 1616
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1617
			if (!this.method4129(var7, var9, var8)) { // L: 1618
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1619
				if (!this.method4129(var10, var9, var8)) { // L: 1620
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1621
					if (!this.method4129(var7, var9, var11)) { // L: 1622
						return false;
					} else if (!this.method4129(var10, var9, var11)) { // L: 1623
						return false;
					} else {
						return true; // L: 1624
					}
				}
			}
		}
	}

	@ObfuscatedName("bk")
	boolean method4129(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1628
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1629
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2453 == 1) { // L: 1630
				var6 = var5.minX - var1; // L: 1631
				if (var6 > 0) { // L: 1632
					var7 = (var6 * var5.field2456 >> 8) + var5.minZ; // L: 1633
					var8 = (var6 * var5.field2460 >> 8) + var5.maxZ; // L: 1634
					var9 = (var6 * var5.field2458 >> 8) + var5.minY; // L: 1635
					var10 = (var6 * var5.field2459 >> 8) + var5.maxY; // L: 1636
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1637
						return true;
					}
				}
			} else if (var5.field2453 == 2) { // L: 1641
				var6 = var1 - var5.minX; // L: 1642
				if (var6 > 0) { // L: 1643
					var7 = (var6 * var5.field2456 >> 8) + var5.minZ; // L: 1644
					var8 = (var6 * var5.field2460 >> 8) + var5.maxZ; // L: 1645
					var9 = (var6 * var5.field2458 >> 8) + var5.minY; // L: 1646
					var10 = (var6 * var5.field2459 >> 8) + var5.maxY; // L: 1647
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1648
						return true;
					}
				}
			} else if (var5.field2453 == 3) { // L: 1652
				var6 = var5.minZ - var3; // L: 1653
				if (var6 > 0) { // L: 1654
					var7 = (var6 * var5.field2454 >> 8) + var5.minX; // L: 1655
					var8 = (var6 * var5.field2455 >> 8) + var5.maxX; // L: 1656
					var9 = (var6 * var5.field2458 >> 8) + var5.minY; // L: 1657
					var10 = (var6 * var5.field2459 >> 8) + var5.maxY; // L: 1658
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1659
						return true;
					}
				}
			} else if (var5.field2453 == 4) { // L: 1663
				var6 = var3 - var5.minZ; // L: 1664
				if (var6 > 0) { // L: 1665
					var7 = (var6 * var5.field2454 >> 8) + var5.minX; // L: 1666
					var8 = (var6 * var5.field2455 >> 8) + var5.maxX; // L: 1667
					var9 = (var6 * var5.field2458 >> 8) + var5.minY; // L: 1668
					var10 = (var6 * var5.field2459 >> 8) + var5.maxY; // L: 1669
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1670
						return true;
					}
				}
			} else if (var5.field2453 == 5) { // L: 1674
				var6 = var2 - var5.minY; // L: 1675
				if (var6 > 0) { // L: 1676
					var7 = (var6 * var5.field2454 >> 8) + var5.minX; // L: 1677
					var8 = (var6 * var5.field2455 >> 8) + var5.maxX; // L: 1678
					var9 = (var6 * var5.field2456 >> 8) + var5.minZ; // L: 1679
					var10 = (var6 * var5.field2460 >> 8) + var5.maxZ; // L: 1680
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1681
						return true;
					}
				}
			}
		}

		return false; // L: 1686
	}

	@ObfuscatedName("g")
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

	@ObfuscatedName("aa")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 674
		Scene_viewportYMin = 0; // L: 675
		Scene_viewportXMax = var3; // L: 676
		Scene_viewportYMax = var4; // L: 677
		Scene_viewportXCenter = var3 / 2; // L: 678
		Scene_viewportYCenter = var4 / 2; // L: 679
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 680

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 681
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 682
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 683
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 684
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 685
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 686
				var8 = (var6 - 128) / 32; // L: 687
				var9 = var7 / 64; // L: 688

				for (int var10 = -26; var10 < 26; ++var10) { // L: 689
					for (var11 = -26; var11 < 26; ++var11) { // L: 690
						var12 = var10 * 128; // L: 691
						int var13 = var11 * 128; // L: 692
						boolean var14 = false; // L: 693

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 694
							if (method4163(var12, var0[var8] + var15, var13)) { // L: 695
								var14 = true; // L: 696
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 700
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 705
			for (var7 = 0; var7 < 32; ++var7) { // L: 706
				for (var8 = -25; var8 < 25; ++var8) { // L: 707
					for (var9 = -25; var9 < 25; ++var9) { // L: 708
						boolean var16 = false; // L: 709

						label82:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 710
							for (var12 = -1; var12 <= 1; ++var12) { // L: 711
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 712
									var16 = true; // L: 713
									break label82;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 716
									var16 = true; // L: 717
									break label82; // L: 718
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 720
									var16 = true; // L: 721
									break label82; // L: 722
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 724
									var16 = true; // L: 725
									break label82; // L: 726
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 730
					}
				}
			}
		}

	} // L: 735

	@ObfuscatedName("ad")
	static boolean method4163(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 738
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 739
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 740
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 741
		if (var5 >= 50 && var5 <= 3500) { // L: 742
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 743
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 744
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 745
		} else {
			return false; // L: 746
		}
	}

	@ObfuscatedName("ao")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 765
	}

	@ObfuscatedName("av")
	public static void method4167() {
		Scene_selectedX = -1; // L: 769
		viewportWalking = false; // L: 770
	} // L: 771

	@ObfuscatedName("al")
	static final int method4205(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1376
		if (var1 < 2) { // L: 1377
			var1 = 2;
		} else if (var1 > 126) { // L: 1378
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1379
	}

	@ObfuscatedName("ak")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1383
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1384
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1385
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1386
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1387
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1388
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1389
			if (var8 == 0) { // L: 1390
				if (var9 != 0) { // L: 1393
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1394
				} else {
					return true; // L: 1396
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1391
			}
		}
	}
}
