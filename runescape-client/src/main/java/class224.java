import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class224 {
	@ObfuscatedName("n")
	public static final short[] field2577;
	@ObfuscatedName("v")
	public static final short[][] field2573;
	@ObfuscatedName("d")
	public static final short[] field2575;
	@ObfuscatedName("c")
	public static final short[][] field2574;
	@ObfuscatedName("x")
	static String[] field2576;

	static {
		field2577 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field2573 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field2575 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field2574 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2091444199"
	)
	static final void method4232(int var0) {
		int[] var1 = GrandExchangeOfferAgeComparator.sceneMinimapSprite.pixels; // L: 5775
		int var2 = var1.length; // L: 5776

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5777
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5778
			var4 = (103 - var3) * 2048 + 24628; // L: 5779

			for (var5 = 1; var5 < 103; ++var5) { // L: 5780
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5781
					MilliClock.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5782
					MilliClock.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5783
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5786
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5787
		GrandExchangeOfferAgeComparator.sceneMinimapSprite.setRaster(); // L: 5788

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5789
			for (var6 = 1; var6 < 103; ++var6) { // L: 5790
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5791
					Username.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5792
					Username.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5795

		for (var5 = 0; var5 < 104; ++var5) { // L: 5796
			for (var6 = 0; var6 < 104; ++var6) { // L: 5797
				long var7 = MilliClock.scene.getFloorDecorationTag(class90.Client_plane, var5, var6); // L: 5798
				if (var7 != 0L) { // L: 5799
					int var9 = class25.Entity_unpackID(var7); // L: 5800
					int var10 = WorldMapAreaData.getObjectDefinition(var9).mapIconId; // L: 5801
					if (var10 >= 0 && InvDefinition.WorldMapElement_get(var10).field3255) { // L: 5802 5803
						Client.mapIcons[Client.mapIconCount] = InvDefinition.WorldMapElement_get(var10).getSpriteBool(false); // L: 5806
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5807
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5808
						++Client.mapIconCount; // L: 5809
					}
				}
			}
		}

		FileSystem.rasterProvider.apply(); // L: 5814
	} // L: 5815
}
