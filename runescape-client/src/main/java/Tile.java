import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1401858365
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1121105615
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -541915111
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 102326407
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("paint")
	TilePaint paint;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("model")
	TileModel model;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("tileItemPile")
	TileItemPile tileItemPile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 436898265
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lel;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("n")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1777238771
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -401318033
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("y")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("s")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 533162945
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1399607657
	)
	int field1690;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1848862367
	)
	int field1691;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 858719123
	)
	int field1671;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0; // L: 19
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 81

		try {
			var0 = WorldMapID.getPreferencesFile("", GrandExchangeOfferWorldComparator.field58.name, true); // L: 83
			Buffer var1 = GrandExchangeOfferAgeComparator.clientPreferences.toBuffer(); // L: 84
			var0.write(var1.array, 0, var1.offset); // L: 85
		} catch (Exception var3) { // L: 87
		}

		try {
			if (var0 != null) { // L: 89
				var0.closeSync(true); // L: 90
			}
		} catch (Exception var2) { // L: 93
		}

	} // L: 94

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Ljava/lang/String;",
		garbageValue = "-968900649"
	)
	public static String method3004(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 29
			if (var2 > 32767) { // L: 30
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 31
			var0.offset += class219.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 32
			String var4 = class52.decodeStringCp1252(var3, 0, var2); // L: 33
			var1 = var4; // L: 34
		} catch (Exception var6) { // L: 36
			var1 = "Cabbage"; // L: 37
		}

		return var1; // L: 40
	}
}
