import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ft")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -913512681
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1268550147
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1887131347
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -761349413
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2125458223
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lhw;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("g")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1275405715
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 438539079
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("b")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("x")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -885252955
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1714438525
	)
	int field2323;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1462551243
	)
	int field2336;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1356919353
	)
	int field2337;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Lis;",
		garbageValue = "-97"
	)
	public static PacketBufferNode method4117() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2102466503"
	)
	public static int[] method4116() {
		int[] var0 = new int[KeyHandler.field140];

		for (int var1 = 0; var1 < KeyHandler.field140; ++var1) {
			var0[var1] = KeyHandler.field137[var1];
		}

		return var0;
	}
}
