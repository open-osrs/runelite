import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 7067627
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1147939477
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -646787087
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -250018079
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("paint")
	TilePaint paint;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lej;"
	)
	@Export("model")
	TileModel model;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lez;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lep;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Leu;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Ldj;"
	)
	@Export("tileItemPile")
	TileItemPile tileItemPile;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -149176885
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "[Lev;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("c")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1097023535
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 432677957
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("s")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("v")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1728513867
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1085148465
	)
	int field1690;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1172057717
	)
	int field1691;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -881770719
	)
	int field1692;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lea;"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)Lgj;",
		garbageValue = "3"
	)
	public static PacketBufferNode method2990() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}
}
