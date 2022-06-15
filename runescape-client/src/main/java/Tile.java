import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1461576443
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 107736561
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1903824993
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 183262573
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1959220913
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lhb;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("z")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1592606351
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 876783023
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("k")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("h")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("x")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1840099321
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1630683853
	)
	int field2333;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1394148627
	)
	int field2334;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1332026471
	)
	int field2326;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "69"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class140.method3038(var0, 10, var1) : Integer.toString(var0); // L: 115 116
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "29"
	)
	public static int method4019(int var0) {
		if (var0 > 0) { // L: 204
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 205 206
		}
	}
}
