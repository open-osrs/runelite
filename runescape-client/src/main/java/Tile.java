import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -673782605
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1121637331
	)
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 672656763
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2008517881
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1077324961
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("c")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -399382975
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 465941461
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("s")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("b")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("w")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1139331751
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -412230155
	)
	int field2300;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -852311983
	)
	int field2305;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 167595445
	)
	int field2318;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-768783923"
	)
	static void method3992() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.Tiles_underlays = new byte[4][104][104]; // L: 49
		Tiles.Tiles_overlays = new byte[4][104][104]; // L: 50
		Tiles.Tiles_shapes = new byte[4][104][104]; // L: 51
		RunException.field4754 = new byte[4][104][104]; // L: 52
		DirectByteArrayCopier.field3277 = new int[4][105][105]; // L: 53
		GrandExchangeOfferNameComparator.field4010 = new byte[4][105][105]; // L: 54
		Widget.field3495 = new int[105][105]; // L: 55
		class4.Tiles_hue = new int[104]; // L: 56
		Login.Tiles_saturation = new int[104]; // L: 57
		WorldMapSectionType.Tiles_lightness = new int[104]; // L: 58
		class300.Tiles_hueMultiplier = new int[104]; // L: 59
		Tiles.field986 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1788183956"
	)
	static final void method3991(int var0) {
		int[] var1 = MusicPatchNode2.sceneMinimapSprite.pixels; // L: 5467
		int var2 = var1.length; // L: 5468

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5469
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5470
			var4 = (103 - var3) * 2048 + 24628; // L: 5471

			for (var5 = 1; var5 < 103; ++var5) { // L: 5472
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5473
					FriendSystem.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5474
					FriendSystem.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5475
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5478
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5479
		MusicPatchNode2.sceneMinimapSprite.setRaster(); // L: 5480

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5481
			for (var6 = 1; var6 < 103; ++var6) { // L: 5482
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5483
					class11.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5484
					class11.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5487

		for (var5 = 0; var5 < 104; ++var5) { // L: 5488
			for (var6 = 0; var6 < 104; ++var6) { // L: 5489
				long var7 = FriendSystem.scene.getFloorDecorationTag(class160.Client_plane, var5, var6); // L: 5490
				if (0L != var7) { // L: 5491
					int var9 = class121.Entity_unpackID(var7); // L: 5492
					int var10 = class116.getObjectDefinition(var9).mapIconId; // L: 5493
					if (var10 >= 0 && class19.WorldMapElement_get(var10).field1836) { // L: 5494 5495
						Client.mapIcons[Client.mapIconCount] = class19.WorldMapElement_get(var10).getSpriteBool(false); // L: 5498
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5499
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5500
						++Client.mapIconCount; // L: 5501
					}
				}
			}
		}

		SpotAnimationDefinition.rasterProvider.apply(); // L: 5506
	} // L: 5507
}
