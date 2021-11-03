import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1187368655
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1125314613
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1288343165
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2016823625
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2026350351
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lhv;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("k")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1565672135
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 871362815
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("u")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("n")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("z")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 46156027
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1657117369
	)
	int field2328;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1842034825
	)
	int field2340;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 72830829
	)
	int field2334;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lck;B)V",
		garbageValue = "63"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		SoundSystem.runScript(var0, 500000, 475000); // L: 110
	} // L: 111

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-839277763"
	)
	public static int method4199(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 39
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 40
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 41
		var0 += var0 >>> 8; // L: 42
		var0 += var0 >>> 16; // L: 43
		return var0 & 255; // L: 44
	}
}
