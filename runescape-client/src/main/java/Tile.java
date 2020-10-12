import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public final class Tile extends Node {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static ClientPreferences clientPreferences;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -400770483
	)
	int originalPlane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1404568893
	)
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -378034661
	)
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -266768933
	)
	int y;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	TilePaint paint;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	TileModel model;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	BoundaryObject boundaryObject;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	WallDecoration wallDecoration;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	FloorDecoration floorDecoration;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	TileItemPile tileItemPile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 240084109
	)
	int gameObjectsCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Led;"
	)
	GameObject[] gameObjects;
	@ObfuscatedName("h")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -640534231
	)
	int gameObjectsEdgeMask;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1686983663
	)
	int minPlane;
	@ObfuscatedName("c")
	boolean drawPrimary;
	@ObfuscatedName("f")
	boolean drawSecondary;
	@ObfuscatedName("y")
	boolean drawGameObjects;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 913733009
	)
	int drawGameObjectEdges;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -870351799
	)
	int field1678;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1246325149
	)
	int field1687;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 465843851
	)
	int field1689;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
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
