import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -608522313
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -616715047
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1378240875
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 219645789
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 660578381
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lhf;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("i")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1421591103
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -551165813
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("t")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("x")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("u")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -153088239
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2075522037
	)
	int field2247;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -403680437
	)
	int field2255;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1737009435
	)
	int field2256;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIB)Loa;",
		garbageValue = "-63"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !Message.method1263(var0, var1, var2) ? null : AbstractSocket.method5940(); // L: 23 24
	}
}
