import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 807593723
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2036199513
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -822005461
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 485184207
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -992962401
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lhz;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("k")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1417290969
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1984915759
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("a")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("e")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("d")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 567739365
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1688773339
	)
	int field2246;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1470704437
	)
	int field2247;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1666464329
	)
	int field2248;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
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

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1743016455"
	)
	static final void method3813(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 4824
			PcmPlayer.worldToScreen((Client.hintArrowX - JagexCache.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - Messages.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4825
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4826
				class375.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 4827
}
