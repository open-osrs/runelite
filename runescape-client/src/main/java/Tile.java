import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 518292921
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -213521769
	)
	@Export("x")
	int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 438104541
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 772520193
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("paint")
	TilePaint paint;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("model")
	TileModel model;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("tileItemPile")
	TileItemPile tileItemPile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 418075799
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lel;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("m")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -306747105
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1679914955
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("f")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("a")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("b")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1147032241
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -14070267
	)
	int field1680;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1565392729
	)
	int field1677;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1370229161
	)
	int field1679;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0; // L: 19
		this.originalPlane = this.plane = var1; // L: 31
		this.x = var2; // L: 32
		this.y = var3; // L: 33
	} // L: 34

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1819420058"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 61
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 62
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 65
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 66
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 69
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 70
		} else {
			if (class23.ByteArrayPool_arrays != null) { // L: 73
				for (int var1 = 0; var1 < SoundCache.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 74
					if (var0.length == SoundCache.ByteArrayPool_alternativeSizes[var1] && JagexCache.ByteArrayPool_altSizeArrayCounts[var1] < class23.ByteArrayPool_arrays[var1].length) { // L: 75
						class23.ByteArrayPool_arrays[var1][JagexCache.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 76
						return; // L: 77
					}
				}
			}

		}
	} // L: 63 67 71 81

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "123"
	)
	static final int method2946(int var0, int var1) {
		if (var0 == -1) { // L: 862
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 863
			if (var1 < 2) { // L: 864
				var1 = 2;
			} else if (var1 > 126) { // L: 865
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 866
		}
	}
}
