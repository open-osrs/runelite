import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1583610569
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -737784569
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -330707151
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1574233783
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -909369227
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lhj;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("v")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1933185669
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -615347265
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("h")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("d")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("q")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 935134867
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1741141675
	)
	int field2309;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -739796449
	)
	int field2326;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1783852977
	)
	int field2327;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("n")
	static double method4044(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lz;",
		garbageValue = "-2017412593"
	)
	public static class6[] method4042() {
		return new class6[]{class6.field10};
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1949540523"
	)
	public static int method4043(int var0) {
		return HealthBarDefinition.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
