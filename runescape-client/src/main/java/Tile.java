import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1781341961
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 263119953
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 865601687
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -440521021
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 90618831
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lhl;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("d")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1586130785
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -540503095
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("e")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("a")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("u")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 600140409
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -163800571
	)
	int field2246;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 248569123
	)
	int field2247;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1179396961
	)
	int field2236;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-68"
	)
	public static void method3843(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;B)V",
		garbageValue = "-1"
	)
	static void method3844(Float var0, Float var1) {
		var1 = 1.0F - var1; // L: 336
		if (var0 < 0.0F) { // L: 337
			var0 = 0.0F;
		}

		if (var1 < 0.0F) { // L: 338
			var1 = 0.0F;
		}

		if (var0 > 1.0F || var1 > 1.0F) { // L: 339
			float var2 = (float)((double)(var0 * (var0 - 2.0F + var1)) + (double)var1 * ((double)var1 - 2.0D) + 1.0D); // L: 340
			if (class112.field1361 + var2 > 0.0F) { // L: 341
				HorizontalAlignment.method3294(var0, var1); // L: 342
			}
		}

		var1 = 1.0F - var1; // L: 345
	} // L: 346
}
