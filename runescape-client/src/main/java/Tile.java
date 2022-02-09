import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1888205811
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1679760745
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1912160653
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 100460827
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1951057499
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lhq;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("h")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2031317209
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 916424921
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("p")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("n")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("m")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -141813919
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1962682993
	)
	int field2233;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 175613087
	)
	int field2252;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -582165867
	)
	int field2243;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
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
}
