import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("f")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("j")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("r")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("q")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("t")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("v")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("x")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("z")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("i")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("a")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("w")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("s")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("y")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("ac")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("ay")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("am")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("ag")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("at")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("aj")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("aw")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("ap")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("ax")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("as")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("ad")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("ai")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("av")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[Lfd;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("au")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lfd;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("al")
	static final int[] field1977;
	@ObfuscatedName("ar")
	static final int[] field1978;
	@ObfuscatedName("ak")
	static final int[] field1979;
	@ObfuscatedName("an")
	static final int[] field1980;
	@ObfuscatedName("ah")
	static final int[] field1981;
	@ObfuscatedName("ae")
	static final int[] field1982;
	@ObfuscatedName("bh")
	static final int[] field1931;
	@ObfuscatedName("ba")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("be")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("bo")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("bp")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("bj")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("bw")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("by")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("bq")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("o")
	@Export("planes")
	int planes;
	@ObfuscatedName("u")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("p")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("b")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[[Lfx;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("k")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("g")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("n")
	int[][][] field1940;
	@ObfuscatedName("bk")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("bt")
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
		field1977 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field1978 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field1979 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field1980 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field1981 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field1982 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field1931 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
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
		this.field1940 = new int[var1][var2 + 1][var3 + 1]; // L: 100
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

	@ObfuscatedName("u")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2]; // L: 132

		for (int var4 = 0; var4 < 3; ++var4) { // L: 133
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2]; // L: 134
			if (var5 != null) { // L: 135
				--var5.plane; // L: 136

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) { // L: 137
					GameObject var7 = var5.gameObjects[var6]; // L: 138
					if (class23.method341(var7.tag) && var7.startX == var1 && var2 == var7.startY) { // L: 139
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) { // L: 143
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3; // L: 144
		this.tiles[3][var1][var2] = null; // L: 145
	} // L: 146

	@ObfuscatedName("b")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 165
		if (var5 != null) { // L: 166
			this.tiles[var1][var2][var3].minPlane = var4; // L: 167
		}
	} // L: 168

	@ObfuscatedName("e")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) { // L: 171
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false); // L: 172

			for (var22 = var1; var22 >= 0; --var22) { // L: 173
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 174
		} else if (var4 != 1) { // L: 177
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 183

			for (var22 = var1; var22 >= 0; --var22) { // L: 184
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23; // L: 185
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 178

			for (var22 = var1; var22 >= 0; --var22) { // L: 179
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 180
		}
	} // L: 175 181 186

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIILfm;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 189
			FloorDecoration var9 = new FloorDecoration(); // L: 190
			var9.renderable = var5; // L: 191
			var9.x = var2 * 128 + 64; // L: 192
			var9.y = var3 * 128 + 64; // L: 193
			var9.tileHeight = var4; // L: 194
			var9.tag = var6; // L: 195
			var9.flags = var8; // L: 196
			if (this.tiles[var1][var2][var3] == null) { // L: 197
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9; // L: 198
		}
	} // L: 199

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIILfm;JLfm;Lfm;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 202
		var10.first = var5; // L: 203
		var10.x = var2 * 128 + 64; // L: 204
		var10.y = var3 * 128 + 64; // L: 205
		var10.tileHeight = var4; // L: 206
		var10.tag = var6; // L: 207
		var10.second = var8; // L: 208
		var10.third = var9; // L: 209
		int var11 = 0; // L: 210
		Tile var12 = this.tiles[var1][var2][var3]; // L: 211
		if (var12 != null) { // L: 212
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) { // L: 213
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) { // L: 214
					Model var14 = (Model)var12.gameObjects[var13].renderable; // L: 215
					var14.calculateBoundsCylinder(); // L: 216
					if (var14.height > var11) { // L: 217
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11; // L: 221
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3); // L: 222
		}

		this.tiles[var1][var2][var3].itemLayer = var10; // L: 223
	} // L: 224

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIILfm;Lfm;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 227
			BoundaryObject var12 = new BoundaryObject(); // L: 228
			var12.tag = var9; // L: 229
			var12.flags = var11; // L: 230
			var12.x = var2 * 128 + 64; // L: 231
			var12.y = var3 * 128 + 64; // L: 232
			var12.tileHeight = var4; // L: 233
			var12.renderable1 = var5; // L: 234
			var12.renderable2 = var6; // L: 235
			var12.orientationA = var7; // L: 236
			var12.orientationB = var8; // L: 237

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3); // L: 238
				}
			}

			this.tiles[var1][var2][var3].boundaryObject = var12; // L: 239
		}
	} // L: 240

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIILfm;Lfm;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 243
			WallDecoration var14 = new WallDecoration(); // L: 244
			var14.tag = var11; // L: 245
			var14.flags = var13; // L: 246
			var14.x = var2 * 128 + 64; // L: 247
			var14.y = var3 * 128 + 64; // L: 248
			var14.tileHeight = var4; // L: 249
			var14.renderable1 = var5; // L: 250
			var14.renderable2 = var6; // L: 251
			var14.orientation = var7; // L: 252
			var14.orientation2 = var8; // L: 253
			var14.xOffset = var9; // L: 254
			var14.yOffset = var10; // L: 255

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3); // L: 256
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14; // L: 257
		}
	} // L: 258

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILfm;IJI)Z"
	)
	public boolean method3445(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 261
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 262
			int var13 = var6 * 64 + var3 * 128; // L: 263
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 264
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIIILfm;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) { // L: 268
			return true;
		} else {
			int var11 = var2 - var5; // L: 269
			int var12 = var3 - var5; // L: 270
			int var13 = var5 + var2; // L: 271
			int var14 = var3 + var5; // L: 272
			if (var10) { // L: 273
				if (var7 > 640 && var7 < 1408) { // L: 274
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) { // L: 275
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) { // L: 276
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) { // L: 277
					var11 -= 128;
				}
			}

			var11 /= 128; // L: 279
			var12 /= 128; // L: 280
			var13 /= 128; // L: 281
			var14 /= 128; // L: 282
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 283
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIILfm;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 287 288
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILfm;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) { // L: 292
			for (var16 = var3; var16 < var3 + var5; ++var16) { // L: 293
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) { // L: 294
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16]; // L: 295
				if (var23 != null && var23.gameObjectsCount >= 5) { // L: 296
					return false;
				}
			}
		}

		GameObject var21 = new GameObject(); // L: 299
		var21.tag = var12; // L: 300
		var21.flags = var14; // L: 301
		var21.plane = var1; // L: 302
		var21.centerX = var6; // L: 303
		var21.centerY = var7; // L: 304
		var21.height = var8; // L: 305
		var21.renderable = var9; // L: 306
		var21.orientation = var10; // L: 307
		var21.startX = var2; // L: 308
		var21.startY = var3; // L: 309
		var21.endX = var2 + var4 - 1; // L: 310
		var21.endY = var3 + var5 - 1; // L: 311

		for (var16 = var2; var16 < var2 + var4; ++var16) { // L: 312
			for (int var17 = var3; var17 < var3 + var5; ++var17) { // L: 313
				int var18 = 0; // L: 314
				if (var16 > var2) { // L: 315
					++var18;
				}

				if (var16 < var2 + var4 - 1) { // L: 316
					var18 += 4;
				}

				if (var17 > var3) { // L: 317
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) { // L: 318
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17); // L: 319
					}
				}

				Tile var22 = this.tiles[var1][var16][var17]; // L: 320
				var22.gameObjects[var22.gameObjectsCount] = var21; // L: 321
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18; // L: 322
				var22.gameObjectsEdgeMask |= var18; // L: 324
				++var22.gameObjectsCount; // L: 325
			}
		}

		if (var11) { // L: 328
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true; // L: 329
	}

	@ObfuscatedName("j")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 333
			GameObject var2 = this.tempGameObjects[var1]; // L: 334
			this.removeGameObject(var2); // L: 335
			this.tempGameObjects[var1] = null; // L: 336
		}

		this.tempGameObjectsCount = 0; // L: 338
	} // L: 339

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgb;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) { // L: 342
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) { // L: 343
				Tile var4 = this.tiles[var1.plane][var2][var3]; // L: 344
				if (var4 != null) { // L: 345
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 346
						if (var4.gameObjects[var5] == var1) { // L: 347
							--var4.gameObjectsCount; // L: 348

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) { // L: 349
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1]; // L: 350
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1]; // L: 351
							}

							var4.gameObjects[var4.gameObjectsCount] = null; // L: 353
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0; // L: 357

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 358
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5]; // L: 360
					}
				}
			}
		}

	} // L: 365

	@ObfuscatedName("q")
	public void method3538(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 368
		if (var5 != null) { // L: 369
			WallDecoration var6 = var5.wallDecoration; // L: 370
			if (var6 != null) { // L: 371
				var6.xOffset = var4 * var6.xOffset / 16; // L: 372
				var6.yOffset = var4 * var6.yOffset / 16; // L: 373
			}
		}
	} // L: 374

	@ObfuscatedName("t")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 377
		if (var4 != null) {
			var4.boundaryObject = null; // L: 379
		}
	} // L: 378 380

	@ObfuscatedName("v")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 383
		if (var4 != null) {
			var4.wallDecoration = null; // L: 385
		}
	} // L: 384 386

	@ObfuscatedName("x")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 389
		if (var4 != null) { // L: 390
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 391
				GameObject var6 = var4.gameObjects[var5]; // L: 392
				if (class23.method341(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 393
					this.removeGameObject(var6); // L: 394
					return; // L: 395
				}
			}

		}
	} // L: 398

	@ObfuscatedName("z")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 401
		if (var4 != null) {
			var4.floorDecoration = null; // L: 403
		}
	} // L: 402 404

	@ObfuscatedName("i")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 407
		if (var4 != null) {
			var4.itemLayer = null; // L: 409
		}
	} // L: 408 410

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Lgs;"
	)
	public BoundaryObject method3457(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 413
		return var4 == null ? null : var4.boundaryObject; // L: 414 415
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Lgh;"
	)
	public WallDecoration method3458(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 419
		return var4 == null ? null : var4.wallDecoration; // L: 420 421
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Lgb;"
	)
	public GameObject method3459(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 425
		if (var4 == null) { // L: 426
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 427
				GameObject var6 = var4.gameObjects[var5]; // L: 428
				if (class23.method341(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 429
					return var6;
				}
			}

			return null; // L: 431
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Lfz;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 435
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null; // L: 436 437
	}

	@ObfuscatedName("ac")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 441
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L; // L: 442 443
	}

	@ObfuscatedName("ay")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 447
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L; // L: 448 449
	}

	@ObfuscatedName("am")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 453
		if (var4 == null) { // L: 454
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 455
				GameObject var6 = var4.gameObjects[var5]; // L: 456
				if (class23.method341(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 457
					return var6.tag;
				}
			}

			return 0L; // L: 459
		}
	}

	@ObfuscatedName("ag")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 463
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L; // L: 464 465
	}

	@ObfuscatedName("aq")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 469
		if (var6 == null) { // L: 470
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) { // L: 471
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) { // L: 472
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) { // L: 473
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 474
				if (var6.gameObjects[var7].tag == var4) { // L: 475
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 477
		}
	}

	@ObfuscatedName("at")
	public void method3466(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 481
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 482
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 483
					Tile var7 = this.tiles[var4][var5][var6]; // L: 484
					if (var7 != null) { // L: 485
						BoundaryObject var8 = var7.boundaryObject; // L: 486
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 487
							ModelData var9 = (ModelData)var8.renderable1; // L: 488
							this.method3468(var9, var4, var5, var6, 1, 1); // L: 489
							if (var8.renderable2 instanceof ModelData) { // L: 490
								var10 = (ModelData)var8.renderable2; // L: 491
								this.method3468(var10, var4, var5, var6, 1, 1); // L: 492
								ModelData.method3343(var9, var10, 0, 0, 0, false); // L: 493
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 494
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 496
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 498
							GameObject var14 = var7.gameObjects[var12]; // L: 499
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 500
								ModelData var11 = (ModelData)var14.renderable; // L: 501
								this.method3468(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 502
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 503
							}
						}

						FloorDecoration var13 = var7.floorDecoration; // L: 506
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 507
							var10 = (ModelData)var13.renderable; // L: 508
							this.method3467(var10, var4, var5, var6); // L: 509
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 510
						}
					}
				}
			}
		}

	} // L: 516

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfs;III)V"
	)
	void method3467(ModelData var1, int var2, int var3, int var4) {
		Tile var5;
		ModelData var6;
		if (var3 < this.xSize) { // L: 519
			var5 = this.tiles[var2][var3 + 1][var4]; // L: 520
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 521
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 522
				ModelData.method3343(var1, var6, 128, 0, 0, true); // L: 523
			}
		}

		if (var4 < this.xSize) { // L: 526
			var5 = this.tiles[var2][var3][var4 + 1]; // L: 527
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 528
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 529
				ModelData.method3343(var1, var6, 0, 0, 128, true); // L: 530
			}
		}

		if (var3 < this.xSize && var4 < this.ySize) { // L: 533
			var5 = this.tiles[var2][var3 + 1][var4 + 1]; // L: 534
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 535
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 536
				ModelData.method3343(var1, var6, 128, 0, 128, true); // L: 537
			}
		}

		if (var3 < this.xSize && var4 > 0) { // L: 540
			var5 = this.tiles[var2][var3 + 1][var4 - 1]; // L: 541
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) { // L: 542
				var6 = (ModelData)var5.floorDecoration.renderable; // L: 543
				ModelData.method3343(var1, var6, 128, 0, -128, true); // L: 544
			}
		}

	} // L: 547

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfs;IIIII)V"
	)
	void method3468(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 550
		int var8 = var3; // L: 551
		int var9 = var3 + var5; // L: 552
		int var10 = var4 - 1; // L: 553
		int var11 = var4 + var6; // L: 554

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 555
			if (var12 != this.planes) { // L: 556
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 557
					if (var13 >= 0 && var13 < this.xSize) { // L: 558
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 559
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 560 561
								Tile var15 = this.tiles[var12][var13][var14]; // L: 562
								if (var15 != null) { // L: 563
									int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4; // L: 564
									BoundaryObject var17 = var15.boundaryObject; // L: 565
									if (var17 != null) { // L: 566
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 567
											var18 = (ModelData)var17.renderable1; // L: 568
											ModelData.method3343(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 569
										}

										if (var17.renderable2 instanceof ModelData) { // L: 571
											var18 = (ModelData)var17.renderable2; // L: 572
											ModelData.method3343(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 573
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 576
										GameObject var19 = var15.gameObjects[var23]; // L: 577
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 578
											ModelData var20 = (ModelData)var19.renderable; // L: 579
											int var21 = var19.endX - var19.startX + 1; // L: 580
											int var22 = var19.endY - var19.startY + 1; // L: 581
											ModelData.method3343(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 582
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 587
				var7 = false; // L: 588
			}
		}

	} // L: 590

	@ObfuscatedName("ap")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 593
		if (var7 != null) { // L: 594
			SceneTilePaint var8 = var7.paint; // L: 595
			int var10;
			if (var8 != null) { // L: 596
				int var18 = var8.rgb; // L: 597
				if (var18 != 0) { // L: 598
					for (var10 = 0; var10 < 4; ++var10) { // L: 599
						var1[var2] = var18; // L: 600
						var1[var2 + 1] = var18; // L: 601
						var1[var2 + 2] = var18; // L: 602
						var1[var2 + 3] = var18; // L: 603
						var2 += var3; // L: 604
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 608
				if (var9 != null) { // L: 609
					var10 = var9.shape; // L: 610
					int var11 = var9.rotation; // L: 611
					int var12 = var9.underlayRgb; // L: 612
					int var13 = var9.overlayRgb; // L: 613
					int[] var14 = this.tileShape2D[var10]; // L: 614
					int[] var15 = this.tileRotation2D[var11]; // L: 615
					int var16 = 0; // L: 616
					int var17;
					if (var12 != 0) { // L: 617
						for (var17 = 0; var17 < 4; ++var17) { // L: 618
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 619
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 620
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 621
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 622
							var2 += var3; // L: 623
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 627
							if (var14[var15[var16++]] != 0) { // L: 628
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 629
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 630
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 631
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 632
						}
					}

				}
			}
		}
	} // L: 606 635

	@ObfuscatedName("ad")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 714
			checkClick = true; // L: 715
			viewportWalking = var4; // L: 716
			Scene_selectedPlane = var1; // L: 717
			Scene_selectedScreenX = var2; // L: 718
			Scene_selectedScreenY = var3; // L: 719
			Scene_selectedX = -1; // L: 720
			Scene_selectedY = -1; // L: 721
		}
	} // L: 722

	@ObfuscatedName("af")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 725
	} // L: 726

	@ObfuscatedName("av")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 738
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 739
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 740
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 741
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 742
			var4 = 128;
		} else if (var4 > 383) { // L: 743
			var4 = 383;
		}

		++Scene_drawnCount; // L: 744
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 745
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 746
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 747
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 748
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 749
		Scene_cameraX = var1; // L: 750
		Scene_cameraY = var2; // L: 751
		Scene_cameraZ = var3; // L: 752
		Scene_cameraXTile = var1 / 128; // L: 753
		Scene_cameraYTile = var3 / 128; // L: 754
		Scene_plane = var6; // L: 755
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 756
		if (Scene_cameraXTileMin < 0) { // L: 757
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 758
		if (Scene_cameraYTileMin < 0) { // L: 759
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 760
		if (Scene_cameraXTileMax > this.xSize) { // L: 761
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 762
		if (Scene_cameraYTileMax > this.ySize) { // L: 763
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 764
		tileUpdateCount = 0; // L: 765

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 766
			var8 = this.tiles[var7]; // L: 767

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 768
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 769
					Tile var16 = var8[var9][var10]; // L: 770
					if (var16 != null) { // L: 771
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 772
							var16.drawPrimary = true; // L: 778
							var16.drawSecondary = true; // L: 779
							if (var16.gameObjectsCount > 0) { // L: 780
								var16.drawGameObjects = true;
							} else {
								var16.drawGameObjects = false; // L: 781
							}

							++tileUpdateCount; // L: 782
						} else {
							var16.drawPrimary = false; // L: 773
							var16.drawSecondary = false; // L: 774
							var16.drawGameObjectEdges = 0; // L: 775
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
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 788
			var8 = this.tiles[var7]; // L: 789

			for (var9 = -25; var9 <= 0; ++var9) { // L: 790
				var10 = var9 + Scene_cameraXTile; // L: 791
				var11 = Scene_cameraXTile - var9; // L: 792
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 793
					for (var12 = -25; var12 <= 0; ++var12) { // L: 794
						var13 = var12 + Scene_cameraYTile; // L: 795
						var14 = Scene_cameraYTile - var12; // L: 796
						if (var10 >= Scene_cameraXTileMin) { // L: 797
							if (var13 >= Scene_cameraYTileMin) { // L: 798
								var15 = var8[var10][var13]; // L: 799
								if (var15 != null && var15.drawPrimary) { // L: 800
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 802
								var15 = var8[var10][var14]; // L: 803
								if (var15 != null && var15.drawPrimary) { // L: 804
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 807
							if (var13 >= Scene_cameraYTileMin) { // L: 808
								var15 = var8[var11][var13]; // L: 809
								if (var15 != null && var15.drawPrimary) { // L: 810
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 812
								var15 = var8[var11][var14]; // L: 813
								if (var15 != null && var15.drawPrimary) { // L: 814
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 817
							checkClick = false; // L: 818
							return; // L: 819
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 825
			var8 = this.tiles[var7]; // L: 826

			for (var9 = -25; var9 <= 0; ++var9) { // L: 827
				var10 = var9 + Scene_cameraXTile; // L: 828
				var11 = Scene_cameraXTile - var9; // L: 829
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 830
					for (var12 = -25; var12 <= 0; ++var12) { // L: 831
						var13 = var12 + Scene_cameraYTile; // L: 832
						var14 = Scene_cameraYTile - var12; // L: 833
						if (var10 >= Scene_cameraXTileMin) { // L: 834
							if (var13 >= Scene_cameraYTileMin) { // L: 835
								var15 = var8[var10][var13]; // L: 836
								if (var15 != null && var15.drawPrimary) { // L: 837
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 839
								var15 = var8[var10][var14]; // L: 840
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false); // L: 841
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 844
							if (var13 >= Scene_cameraYTileMin) { // L: 845
								var15 = var8[var11][var13]; // L: 846
								if (var15 != null && var15.drawPrimary) { // L: 847
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 849
								var15 = var8[var11][var14]; // L: 850
								if (var15 != null && var15.drawPrimary) { // L: 851
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 854
							checkClick = false; // L: 855
							return; // L: 856
						}
					}
				}
			}
		}

		checkClick = false; // L: 862
	} // L: 863

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfx;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 866

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
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 868
												if (var3 == null) { // L: 869
													return;
												}
											} while(!var3.drawSecondary); // L: 870

											var4 = var3.x; // L: 871
											var5 = var3.y; // L: 872
											var6 = var3.plane; // L: 873
											var7 = var3.originalPlane; // L: 874
											var8 = this.tiles[var6]; // L: 875
											if (!var3.drawPrimary) { // L: 876
												break;
											}

											if (var2) { // L: 877
												if (var6 > 0) { // L: 878
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 879
													if (var9 != null && var9.drawSecondary) { // L: 880
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 882
													var9 = var8[var4 - 1][var5]; // L: 883
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 884
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 886
													var9 = var8[var4 + 1][var5]; // L: 887
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 888
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 890
													var9 = var8[var4][var5 - 1]; // L: 891
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 892
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 894
													var9 = var8[var4][var5 + 1]; // L: 895
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 896
														continue;
													}
												}
											} else {
												var2 = true; // L: 899
											}

											var3.drawPrimary = false; // L: 900
											if (var3.linkedBelowTile != null) { // L: 901
												var9 = var3.linkedBelowTile; // L: 902
												if (var9.paint != null) { // L: 903
													if (!this.method3483(0, var4, var5)) { // L: 904
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method3483(0, var4, var5)) { // L: 906 907
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.boundaryObject; // L: 909
												if (var10 != null) { // L: 910
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.tileHeight - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 911
													var12 = var9.gameObjects[var11]; // L: 912
													if (var12 != null) { // L: 913
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.height - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 916
											if (var3.paint != null) { // L: 917
												if (!this.method3483(var7, var4, var5)) { // L: 918
													var20 = true; // L: 919
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 920
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method3483(var7, var4, var5)) { // L: 923 924
												var20 = true; // L: 925
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 926
											}

											var21 = 0; // L: 929
											var11 = 0; // L: 930
											BoundaryObject var31 = var3.boundaryObject; // L: 931
											WallDecoration var13 = var3.wallDecoration; // L: 932
											if (var31 != null || var13 != null) { // L: 933
												if (var4 == Scene_cameraXTile) { // L: 934
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 935
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 936
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 937
													var21 += 6;
												}

												var11 = field1977[var21]; // L: 938
												var3.field1882 = field1979[var21]; // L: 939
											}

											if (var31 != null) { // L: 941
												if ((var31.orientationA & field1978[var21]) != 0) { // L: 942
													if (var31.orientationA == 16) { // L: 943
														var3.drawGameObjectEdges = 3; // L: 944
														var3.field1889 = field1980[var21]; // L: 945
														var3.field1890 = 3 - var3.field1889; // L: 946
													} else if (var31.orientationA == 32) { // L: 948
														var3.drawGameObjectEdges = 6; // L: 949
														var3.field1889 = field1981[var21]; // L: 950
														var3.field1890 = 6 - var3.field1889; // L: 951
													} else if (var31.orientationA == 64) { // L: 953
														var3.drawGameObjectEdges = 12; // L: 954
														var3.field1889 = field1982[var21]; // L: 955
														var3.field1890 = 12 - var3.field1889; // L: 956
													} else {
														var3.drawGameObjectEdges = 9; // L: 959
														var3.field1889 = field1931[var21]; // L: 960
														var3.field1890 = 9 - var3.field1889; // L: 961
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 964
												}

												if ((var31.orientationA & var11) != 0 && !this.method3484(var7, var4, var5, var31.orientationA)) { // L: 965
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method3484(var7, var4, var5, var31.orientationB)) { // L: 966
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method3485(var7, var4, var5, var13.renderable1.height)) { // L: 968
												if ((var13.orientation & var11) != 0) { // L: 969
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.x - Scene_cameraX + var13.xOffset, var13.tileHeight - Scene_cameraY, var13.y - Scene_cameraZ + var13.yOffset, var13.tag); // L: 970
												} else if (var13.orientation == 256) { // L: 972
													var14 = var13.x - Scene_cameraX; // L: 973
													var15 = var13.tileHeight - Scene_cameraY; // L: 974
													var16 = var13.y - Scene_cameraZ; // L: 975
													var17 = var13.orientation2; // L: 976
													if (var17 != 1 && var17 != 2) { // L: 978
														var18 = var14; // L: 979
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 981
														var19 = var16; // L: 982
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 983
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 984
													} else if (var13.renderable2 != null) { // L: 986
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 987
													}
												}
											}

											if (var20) { // L: 991
												FloorDecoration var22 = var3.floorDecoration; // L: 992
												if (var22 != null) { // L: 993
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x - Scene_cameraX, var22.tileHeight - Scene_cameraY, var22.y - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 994
												if (var23 != null && var23.height == 0) { // L: 995
													if (var23.second != null) { // L: 996
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 997
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 998
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1001
											if (var14 != 0) { // L: 1002
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1003
													var36 = var8[var4 + 1][var5]; // L: 1004
													if (var36 != null && var36.drawSecondary) { // L: 1005
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1007
													var36 = var8[var4][var5 + 1]; // L: 1008
													if (var36 != null && var36.drawSecondary) { // L: 1009
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1011
													var36 = var8[var4 - 1][var5]; // L: 1012
													if (var36 != null && var36.drawSecondary) { // L: 1013
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1015
													var36 = var8[var4][var5 - 1]; // L: 1016
													if (var36 != null && var36.drawSecondary) { // L: 1017
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1021
											var20 = true; // L: 1022

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1023
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field1889) { // L: 1024
													var20 = false; // L: 1025
													break; // L: 1026
												}
											}

											if (var20) { // L: 1029
												var10 = var3.boundaryObject; // L: 1030
												if (!this.method3484(var7, var4, var5, var10.orientationA)) { // L: 1031
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x - Scene_cameraX, var10.tileHeight - Scene_cameraY, var10.y - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1032
											}
										}

										if (!var3.drawGameObjects) { // L: 1035
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1037
											var3.drawGameObjects = false; // L: 1038
											var21 = 0; // L: 1039

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1040
												var12 = var3.gameObjects[var11]; // L: 1041
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1042
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1043
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1044
															var36 = var8[var24][var14]; // L: 1045
															if (var36.drawPrimary) { // L: 1046
																var3.drawGameObjects = true; // L: 1047
																continue label563; // L: 1048
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1050
																var16 = 0; // L: 1051
																if (var24 > var12.startX) { // L: 1052
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1053
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1054
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1055
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field1890) { // L: 1056
																	var3.drawGameObjects = true; // L: 1057
																	continue label563; // L: 1058
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1063
													var24 = Scene_cameraXTile - var12.startX; // L: 1064
													var14 = var12.endX - Scene_cameraXTile; // L: 1065
													if (var14 > var24) { // L: 1066
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1067
													var16 = var12.endY - Scene_cameraYTile; // L: 1068
													if (var16 > var15) { // L: 1069
														var12.field2191 = var24 + var16;
													} else {
														var12.field2191 = var24 + var15; // L: 1070
													}
												}
											}

											while (var21 > 0) { // L: 1073
												var11 = -50; // L: 1074
												var25 = -1; // L: 1075

												for (var24 = 0; var24 < var21; ++var24) { // L: 1076
													GameObject var35 = gameObjects[var24]; // L: 1077
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1078
														if (var35.field2191 > var11) { // L: 1079
															var11 = var35.field2191; // L: 1080
															var25 = var24; // L: 1081
														} else if (var11 == var35.field2191) { // L: 1083
															var15 = var35.centerX - Scene_cameraX; // L: 1084
															var16 = var35.centerY - Scene_cameraZ; // L: 1085
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1086
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1087
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1088
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1092
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1093
												var33.lastDrawn = Scene_drawnCount; // L: 1094
												if (!this.method3486(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1095
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.height - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1096
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1098
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1099
														Tile var26 = var8[var14][var15]; // L: 1100
														if (var26.drawGameObjectEdges != 0) { // L: 1101
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1102
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1106
												break;
											}
										} catch (Exception var28) { // L: 1108
											var3.drawGameObjects = false; // L: 1109
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1112
							} while(var3.drawGameObjectEdges != 0); // L: 1113

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1114
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1115
						} while(var9 != null && var9.drawSecondary); // L: 1116

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1118
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1119
					} while(var9 != null && var9.drawSecondary); // L: 1120

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1122
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1123
				} while(var9 != null && var9.drawSecondary); // L: 1124

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1126
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1127
			} while(var9 != null && var9.drawSecondary); // L: 1128

			var3.drawSecondary = false; // L: 1130
			--tileUpdateCount; // L: 1131
			ItemLayer var32 = var3.itemLayer; // L: 1132
			if (var32 != null && var32.height != 0) { // L: 1133
				if (var32.second != null) { // L: 1134
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1135
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1136
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x - Scene_cameraX, var32.tileHeight - Scene_cameraY - var32.height, var32.y - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field1882 != 0) { // L: 1138
				WallDecoration var29 = var3.wallDecoration; // L: 1139
				if (var29 != null && !this.method3485(var7, var4, var5, var29.renderable1.height)) { // L: 1140
					if ((var29.orientation & var3.field1882) != 0) { // L: 1141
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x - Scene_cameraX + var29.xOffset, var29.tileHeight - Scene_cameraY, var29.y - Scene_cameraZ + var29.yOffset, var29.tag); // L: 1142
					} else if (var29.orientation == 256) { // L: 1144
						var11 = var29.x - Scene_cameraX; // L: 1145
						var25 = var29.tileHeight - Scene_cameraY; // L: 1146
						var24 = var29.y - Scene_cameraZ; // L: 1147
						var14 = var29.orientation2; // L: 1148
						if (var14 != 1 && var14 != 2) { // L: 1150
							var15 = var11; // L: 1151
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1153
							var16 = var24; // L: 1154
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1155
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1156
						} else if (var29.renderable2 != null) { // L: 1158
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1159
						}
					}
				}

				BoundaryObject var27 = var3.boundaryObject; // L: 1163
				if (var27 != null) { // L: 1164
					if ((var27.orientationB & var3.field1882) != 0 && !this.method3484(var7, var4, var5, var27.orientationB)) { // L: 1165
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.tileHeight - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field1882) != 0 && !this.method3484(var7, var4, var5, var27.orientationA)) { // L: 1166
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x - Scene_cameraX, var27.tileHeight - Scene_cameraY, var27.y - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1169
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1170
				if (var30 != null && var30.drawSecondary) { // L: 1171
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1173
				var30 = var8[var4 + 1][var5]; // L: 1174
				if (var30 != null && var30.drawSecondary) { // L: 1175
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1177
				var30 = var8[var4][var5 + 1]; // L: 1178
				if (var30 != null && var30.drawSecondary) { // L: 1179
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1181
				var30 = var8[var4 - 1][var5]; // L: 1182
				if (var30 != null && var30.drawSecondary) { // L: 1183
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1185
				var30 = var8[var4][var5 - 1]; // L: 1186
				if (var30 != null && var30.drawSecondary) { // L: 1187
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgr;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1195
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1197
		int var13;
		int var14 = var13 = var10 + 128; // L: 1199
		int var15;
		int var16 = var15 = var12 + 128; // L: 1201
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1202
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1203
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1204
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1205
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1206
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1207
		var10 = var21; // L: 1208
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1209
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1210
		var17 = var21; // L: 1211
		if (var12 >= 50) { // L: 1212
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1213
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1214
			var14 = var21; // L: 1215
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1216
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1217
			var18 = var21; // L: 1218
			if (var11 >= 50) { // L: 1219
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1220
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1221
				var13 = var21; // L: 1222
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1223
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1224
				var19 = var21; // L: 1225
				if (var16 >= 50) { // L: 1226
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1227
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1228
					var9 = var21; // L: 1229
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1230
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1231
					if (var15 >= 50) { // L: 1233
						int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1234
						int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1235
						int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1236
						int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1237
						int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1238
						int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1239
						int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1240
						int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1241
						Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1242
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1243
							Rasterizer3D.field1899 = false; // L: 1244
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1245
								Rasterizer3D.field1899 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1246
								Scene_selectedX = var7; // L: 1247
								Scene_selectedY = var8; // L: 1248
							}

							if (var1.texture == -1) { // L: 1250
								if (var1.neColor != 12345678) { // L: 1251
									Rasterizer3D.method3383(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1253
								if (var1.isFlat) { // L: 1254
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1255
								}
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1258
								Rasterizer3D.method3383(var27, var29, var25, var26, var28, var24, method3619(var30, var1.neColor), method3619(var30, var1.nwColor), method3619(var30, var1.seColor)); // L: 1259
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1262
							Rasterizer3D.field1899 = false; // L: 1263
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1264
								Rasterizer3D.field1899 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1265
								Scene_selectedX = var7; // L: 1266
								Scene_selectedY = var8; // L: 1267
							}

							if (var1.texture == -1) { // L: 1269
								if (var1.swColor != 12345678) { // L: 1270
									Rasterizer3D.method3383(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1272
								Rasterizer3D.drawTexturedTile(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1273
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1276
								Rasterizer3D.method3383(var23, var25, var29, var22, var24, var28, method3619(var30, var1.swColor), method3619(var30, var1.seColor), method3619(var30, var1.nwColor)); // L: 1277
							}
						}

					}
				}
			}
		}
	} // L: 1280

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfj;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1283

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1284
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1285
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1286
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1287
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1288
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1289
			var10 = var13; // L: 1290
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1291
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1292
			if (var12 < 50) { // L: 1294
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1295
				SceneTileModel.field2060[var9] = var10; // L: 1296
				SceneTileModel.field2057[var9] = var13; // L: 1297
				SceneTileModel.field2058[var9] = var12; // L: 1298
			}

			SceneTileModel.field2054[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1300
			SceneTileModel.field2042[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1301
		}

		Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1303
		var8 = var1.faceX.length; // L: 1304

		for (var9 = 0; var9 < var8; ++var9) { // L: 1305
			var10 = var1.faceX[var9]; // L: 1306
			var11 = var1.faceY[var9]; // L: 1307
			var12 = var1.faceZ[var9]; // L: 1308
			var13 = SceneTileModel.field2054[var10]; // L: 1309
			int var14 = SceneTileModel.field2054[var11]; // L: 1310
			int var15 = SceneTileModel.field2054[var12]; // L: 1311
			int var16 = SceneTileModel.field2042[var10]; // L: 1312
			int var17 = SceneTileModel.field2042[var11]; // L: 1313
			int var18 = SceneTileModel.field2042[var12]; // L: 1314
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1315
				Rasterizer3D.field1899 = false; // L: 1316
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1317
					Rasterizer3D.field1899 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1318
					Scene_selectedX = var6; // L: 1319
					Scene_selectedY = var7; // L: 1320
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1322
					if (!Scene_isLowDetail) { // L: 1326
						if (var1.isFlat) { // L: 1327
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2060[0], SceneTileModel.field2060[1], SceneTileModel.field2060[3], SceneTileModel.field2057[0], SceneTileModel.field2057[1], SceneTileModel.field2057[3], SceneTileModel.field2058[0], SceneTileModel.field2058[1], SceneTileModel.field2058[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2060[var10], SceneTileModel.field2060[var11], SceneTileModel.field2060[var12], SceneTileModel.field2057[var10], SceneTileModel.field2057[var11], SceneTileModel.field2057[var12], SceneTileModel.field2058[var10], SceneTileModel.field2058[var11], SceneTileModel.field2058[var12], var1.triangleTextureId[var9]); // L: 1328
						}
					} else {
						int var19 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1331
						Rasterizer3D.method3383(var16, var17, var18, var13, var14, var15, method3619(var19, var1.triangleColorA[var9]), method3619(var19, var1.triangleColorB[var9]), method3619(var19, var1.triangleColorC[var9])); // L: 1332
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1323
					Rasterizer3D.method3383(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1337

	@ObfuscatedName("ar")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1364
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1365
		Scene_currentOccludersCount = 0; // L: 1366

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1367
			Occluder var4 = var2[var3]; // L: 1368
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1369
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1370
				if (var5 >= 0 && var5 <= 50) { // L: 1371
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1372
					if (var6 < 0) { // L: 1373
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1374
					if (var7 > 50) { // L: 1375
						var7 = 50;
					}

					var13 = false; // L: 1376

					while (var6 <= var7) { // L: 1377
						if (visibleTiles[var5][var6++]) { // L: 1378
							var13 = true; // L: 1379
							break;
						}
					}

					if (var13) { // L: 1383
						var9 = Scene_cameraX - var4.minX; // L: 1384
						if (var9 > 32) { // L: 1385
							var4.field2021 = 1;
						} else {
							if (var9 >= -32) { // L: 1386
								continue;
							}

							var4.field2021 = 2; // L: 1387
							var9 = -var9; // L: 1388
						}

						var4.field2024 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1391
						var4.field2016 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1392
						var4.field2012 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1393
						var4.field2026 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1394
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1395
					}
				}
			} else if (var4.type == 2) { // L: 1398
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1399
				if (var5 >= 0 && var5 <= 50) { // L: 1400
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1401
					if (var6 < 0) { // L: 1402
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1403
					if (var7 > 50) { // L: 1404
						var7 = 50;
					}

					var13 = false; // L: 1405

					while (var6 <= var7) { // L: 1406
						if (visibleTiles[var6++][var5]) { // L: 1407
							var13 = true; // L: 1408
							break;
						}
					}

					if (var13) { // L: 1412
						var9 = Scene_cameraZ - var4.minZ; // L: 1413
						if (var9 > 32) { // L: 1414
							var4.field2021 = 3;
						} else {
							if (var9 >= -32) { // L: 1415
								continue;
							}

							var4.field2021 = 4; // L: 1416
							var9 = -var9; // L: 1417
						}

						var4.field2019 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1420
						var4.field2023 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1421
						var4.field2012 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1422
						var4.field2026 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1423
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1424
					}
				}
			} else if (var4.type == 4) { // L: 1427
				var5 = var4.minY - Scene_cameraY; // L: 1428
				if (var5 > 128) { // L: 1429
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1430
					if (var6 < 0) { // L: 1431
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1432
					if (var7 > 50) { // L: 1433
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1434
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1435
						if (var8 < 0) { // L: 1436
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1437
						if (var9 > 50) { // L: 1438
							var9 = 50;
						}

						boolean var10 = false; // L: 1439

						label148:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1440
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1441
								if (visibleTiles[var11][var12]) { // L: 1442
									var10 = true; // L: 1443
									break label148;
								}
							}
						}

						if (var10) { // L: 1448
							var4.field2021 = 5; // L: 1449
							var4.field2019 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1450
							var4.field2023 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1451
							var4.field2024 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1452
							var4.field2016 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1453
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1454
						}
					}
				}
			}
		}

	} // L: 1458

	@ObfuscatedName("ak")
	boolean method3483(int var1, int var2, int var3) {
		int var4 = this.field1940[var1][var2][var3]; // L: 1461
		if (var4 == -Scene_drawnCount) { // L: 1462
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1463
			return true;
		} else {
			int var5 = var2 << 7; // L: 1464
			int var6 = var3 << 7; // L: 1465
			if (this.method3440(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method3440(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method3440(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3440(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1466
				this.field1940[var1][var2][var3] = Scene_drawnCount; // L: 1467
				return true; // L: 1468
			} else {
				this.field1940[var1][var2][var3] = -Scene_drawnCount; // L: 1471
				return false; // L: 1472
			}
		}
	}

	@ObfuscatedName("an")
	boolean method3484(int var1, int var2, int var3, int var4) {
		if (!this.method3483(var1, var2, var3)) { // L: 1477
			return false;
		} else {
			int var5 = var2 << 7; // L: 1478
			int var6 = var3 << 7; // L: 1479
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1480
			int var8 = var7 - 120; // L: 1481
			int var9 = var7 - 230; // L: 1482
			int var10 = var7 - 238; // L: 1483
			if (var4 < 16) { // L: 1484
				if (var4 == 1) { // L: 1485
					if (var5 > Scene_cameraX) { // L: 1486
						if (!this.method3440(var5, var7, var6)) { // L: 1487
							return false;
						}

						if (!this.method3440(var5, var7, var6 + 128)) { // L: 1488
							return false;
						}
					}

					if (var1 > 0) { // L: 1490
						if (!this.method3440(var5, var8, var6)) { // L: 1491
							return false;
						}

						if (!this.method3440(var5, var8, var6 + 128)) { // L: 1492
							return false;
						}
					}

					if (!this.method3440(var5, var9, var6)) { // L: 1494
						return false;
					}

					if (!this.method3440(var5, var9, var6 + 128)) { // L: 1495
						return false;
					}

					return true; // L: 1496
				}

				if (var4 == 2) { // L: 1498
					if (var6 < Scene_cameraZ) { // L: 1499
						if (!this.method3440(var5, var7, var6 + 128)) { // L: 1500
							return false;
						}

						if (!this.method3440(var5 + 128, var7, var6 + 128)) { // L: 1501
							return false;
						}
					}

					if (var1 > 0) { // L: 1503
						if (!this.method3440(var5, var8, var6 + 128)) { // L: 1504
							return false;
						}

						if (!this.method3440(var5 + 128, var8, var6 + 128)) { // L: 1505
							return false;
						}
					}

					if (!this.method3440(var5, var9, var6 + 128)) { // L: 1507
						return false;
					}

					if (!this.method3440(var5 + 128, var9, var6 + 128)) { // L: 1508
						return false;
					}

					return true; // L: 1509
				}

				if (var4 == 4) { // L: 1511
					if (var5 < Scene_cameraX) { // L: 1512
						if (!this.method3440(var5 + 128, var7, var6)) { // L: 1513
							return false;
						}

						if (!this.method3440(var5 + 128, var7, var6 + 128)) { // L: 1514
							return false;
						}
					}

					if (var1 > 0) { // L: 1516
						if (!this.method3440(var5 + 128, var8, var6)) { // L: 1517
							return false;
						}

						if (!this.method3440(var5 + 128, var8, var6 + 128)) { // L: 1518
							return false;
						}
					}

					if (!this.method3440(var5 + 128, var9, var6)) { // L: 1520
						return false;
					}

					if (!this.method3440(var5 + 128, var9, var6 + 128)) { // L: 1521
						return false;
					}

					return true; // L: 1522
				}

				if (var4 == 8) { // L: 1524
					if (var6 > Scene_cameraZ) { // L: 1525
						if (!this.method3440(var5, var7, var6)) { // L: 1526
							return false;
						}

						if (!this.method3440(var5 + 128, var7, var6)) { // L: 1527
							return false;
						}
					}

					if (var1 > 0) { // L: 1529
						if (!this.method3440(var5, var8, var6)) { // L: 1530
							return false;
						}

						if (!this.method3440(var5 + 128, var8, var6)) { // L: 1531
							return false;
						}
					}

					if (!this.method3440(var5, var9, var6)) { // L: 1533
						return false;
					}

					if (!this.method3440(var5 + 128, var9, var6)) { // L: 1534
						return false;
					}

					return true; // L: 1535
				}
			}

			if (!this.method3440(var5 + 64, var10, var6 + 64)) { // L: 1538
				return false;
			} else if (var4 == 16) { // L: 1539
				return this.method3440(var5, var9, var6 + 128); // L: 1540
			} else if (var4 == 32) { // L: 1543
				return this.method3440(var5 + 128, var9, var6 + 128); // L: 1544
			} else if (var4 == 64) { // L: 1547
				return this.method3440(var5 + 128, var9, var6); // L: 1548
			} else if (var4 == 128) { // L: 1551
				return this.method3440(var5, var9, var6); // L: 1552
			} else {
				return true; // L: 1555
			}
		}
	}

	@ObfuscatedName("ah")
	boolean method3485(int var1, int var2, int var3, int var4) {
		if (!this.method3483(var1, var2, var3)) { // L: 1559
			return false;
		} else {
			int var5 = var2 << 7; // L: 1560
			int var6 = var3 << 7; // L: 1561
			return this.method3440(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method3440(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3440(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3440(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1562
		}
	}

	@ObfuscatedName("ae")
	boolean method3486(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1567
			if (!this.method3483(var1, var2, var4)) { // L: 1568
				return false;
			} else {
				var7 = var2 << 7; // L: 1569
				var8 = var4 << 7; // L: 1570
				return this.method3440(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method3440(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3440(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3440(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1571
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1574
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1575
					if (this.field1940[var1][var7][var8] == -Scene_drawnCount) { // L: 1576
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1579
			var8 = (var4 << 7) + 2; // L: 1580
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1581
			if (!this.method3440(var7, var9, var8)) { // L: 1582
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1583
				if (!this.method3440(var10, var9, var8)) { // L: 1584
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1585
					if (!this.method3440(var7, var9, var11)) { // L: 1586
						return false;
					} else if (!this.method3440(var10, var9, var11)) { // L: 1587
						return false;
					} else {
						return true; // L: 1588
					}
				}
			}
		}
	}

	@ObfuscatedName("bh")
	boolean method3440(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1592
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1593
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2021 == 1) { // L: 1594
				var6 = var5.minX - var1; // L: 1595
				if (var6 > 0) { // L: 1596
					var7 = (var6 * var5.field2024 >> 8) + var5.minZ; // L: 1597
					var8 = (var6 * var5.field2016 >> 8) + var5.maxZ; // L: 1598
					var9 = (var6 * var5.field2012 >> 8) + var5.minY; // L: 1599
					var10 = (var6 * var5.field2026 >> 8) + var5.maxY; // L: 1600
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1601
						return true;
					}
				}
			} else if (var5.field2021 == 2) { // L: 1605
				var6 = var1 - var5.minX; // L: 1606
				if (var6 > 0) { // L: 1607
					var7 = (var6 * var5.field2024 >> 8) + var5.minZ; // L: 1608
					var8 = (var6 * var5.field2016 >> 8) + var5.maxZ; // L: 1609
					var9 = (var6 * var5.field2012 >> 8) + var5.minY; // L: 1610
					var10 = (var6 * var5.field2026 >> 8) + var5.maxY; // L: 1611
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1612
						return true;
					}
				}
			} else if (var5.field2021 == 3) { // L: 1616
				var6 = var5.minZ - var3; // L: 1617
				if (var6 > 0) { // L: 1618
					var7 = (var6 * var5.field2019 >> 8) + var5.minX; // L: 1619
					var8 = (var6 * var5.field2023 >> 8) + var5.maxX; // L: 1620
					var9 = (var6 * var5.field2012 >> 8) + var5.minY; // L: 1621
					var10 = (var6 * var5.field2026 >> 8) + var5.maxY; // L: 1622
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1623
						return true;
					}
				}
			} else if (var5.field2021 == 4) { // L: 1627
				var6 = var3 - var5.minZ; // L: 1628
				if (var6 > 0) { // L: 1629
					var7 = (var6 * var5.field2019 >> 8) + var5.minX; // L: 1630
					var8 = (var6 * var5.field2023 >> 8) + var5.maxX; // L: 1631
					var9 = (var6 * var5.field2012 >> 8) + var5.minY; // L: 1632
					var10 = (var6 * var5.field2026 >> 8) + var5.maxY; // L: 1633
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1634
						return true;
					}
				}
			} else if (var5.field2021 == 5) { // L: 1638
				var6 = var2 - var5.minY; // L: 1639
				if (var6 > 0) { // L: 1640
					var7 = (var6 * var5.field2019 >> 8) + var5.minX; // L: 1641
					var8 = (var6 * var5.field2023 >> 8) + var5.maxX; // L: 1642
					var9 = (var6 * var5.field2024 >> 8) + var5.minZ; // L: 1643
					var10 = (var6 * var5.field2016 >> 8) + var5.maxZ; // L: 1644
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1645
						return true;
					}
				}
			}
		}

		return false; // L: 1650
	}

	@ObfuscatedName("p")
	@Export("Scene_addOccluder")
	public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder var8 = new Occluder(); // L: 149
		var8.minTileX = var2 / 128; // L: 150
		var8.maxTileX = var3 / 128; // L: 151
		var8.minTileY = var4 / 128; // L: 152
		var8.maxTileY = var5 / 128; // L: 153
		var8.type = var1; // L: 154
		var8.minX = var2; // L: 155
		var8.maxX = var3; // L: 156
		var8.minZ = var4; // L: 157
		var8.maxZ = var5; // L: 158
		var8.minY = var6; // L: 159
		var8.maxY = var7; // L: 160
		Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8; // L: 161
	} // L: 162

	@ObfuscatedName("ax")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 638
		Scene_viewportYMin = 0; // L: 639
		Scene_viewportXMax = var3; // L: 640
		Scene_viewportYMax = var4; // L: 641
		Scene_viewportXCenter = var3 / 2; // L: 642
		Scene_viewportYCenter = var4 / 2; // L: 643
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 644

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 645
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 646
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 647
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 648
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 649
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 650
				var8 = (var6 - 128) / 32; // L: 651
				var9 = var7 / 64; // L: 652

				for (int var10 = -26; var10 < 26; ++var10) { // L: 653
					for (var11 = -26; var11 < 26; ++var11) { // L: 654
						var12 = var10 * 128; // L: 655
						int var13 = var11 * 128; // L: 656
						boolean var14 = false; // L: 657

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 658
							if (method3471(var12, var0[var8] + var15, var13)) { // L: 659
								var14 = true; // L: 660
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 664
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 669
			for (var7 = 0; var7 < 32; ++var7) { // L: 670
				for (var8 = -25; var8 < 25; ++var8) { // L: 671
					for (var9 = -25; var9 < 25; ++var9) { // L: 672
						boolean var16 = false; // L: 673

						label85:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 674
							for (var12 = -1; var12 <= 1; ++var12) { // L: 675
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 676
									var16 = true; // L: 677
									break label85;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 680
									var16 = true; // L: 681
									break label85; // L: 682
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 684
									var16 = true; // L: 685
									break label85; // L: 686
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 688
									var16 = true; // L: 689
									break label85; // L: 690
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 694
					}
				}
			}
		}

	} // L: 699

	@ObfuscatedName("as")
	static boolean method3471(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 702
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 703
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 704
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 705
		if (var5 >= 50 && var5 <= 3500) { // L: 706
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 707
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 708
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 709
		} else {
			return false; // L: 710
		}
	}

	@ObfuscatedName("ao")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 729
	}

	@ObfuscatedName("ai")
	public static void method3476() {
		Scene_selectedX = -1; // L: 733
		viewportWalking = false; // L: 734
	} // L: 735

	@ObfuscatedName("aa")
	static final int method3619(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1340
		if (var1 < 2) { // L: 1341
			var1 = 2;
		} else if (var1 > 126) { // L: 1342
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1343
	}

	@ObfuscatedName("al")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1347
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1348
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1349
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1350
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1351
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1352
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1353
			if (var8 == 0) { // L: 1354
				if (var9 != 0) { // L: 1357
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1358
				} else {
					return true; // L: 1360
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1355
			}
		}
	}
}
