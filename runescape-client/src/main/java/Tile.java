import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 596909537
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 312017335
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 247666913
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 48725311
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -344003939
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lhh;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("h")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1707697089
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1025357845
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("u")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("e")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1961608803
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1843365543
	)
	int field2222;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -541714505
	)
	int field2227;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 232353849
	)
	int field2243;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILij;ZI)V",
		garbageValue = "-1834076518"
	)
	static void method3889(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = AbstractWorldMapIcon.getWorldMap().getMapArea(var0);
		int var4 = MouseHandler.localPlayer.plane;
		int var5 = (MouseHandler.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX;
		int var6 = (MouseHandler.localPlayer.y >> 7) + NPC.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		AbstractWorldMapIcon.getWorldMap().method6173(var3, var7, var1, var2);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-30"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShort(var1);
		var2.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var2);
	}
}
