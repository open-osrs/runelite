import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1603227235
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1514983275
	)
	@Export("x")
	int x;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 110553161
	)
	@Export("y")
	int y;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1594248765
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -539721401
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lej;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("a")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -173130829
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -547792493
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("i")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("x")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("f")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1512202233
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -14103435
	)
	int field1667;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1037835833
	)
	int field1680;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2140292419
	)
	int field1668;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Les;"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method3032() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 82
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 83
	} // L: 84
}
