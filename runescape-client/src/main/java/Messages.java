import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("c")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2048371745
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 46362835
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-472438759"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 60
		if (var0 < 0 || var0 >= 65536) { // L: 61
			var0 >>>= 16; // L: 62
			var1 += 16; // L: 63
		}

		if (var0 >= 256) { // L: 65
			var0 >>>= 8; // L: 66
			var1 += 8; // L: 67
		}

		if (var0 >= 16) { // L: 69
			var0 >>>= 4; // L: 70
			var1 += 4; // L: 71
		}

		if (var0 >= 4) { // L: 73
			var0 >>>= 2; // L: 74
			var1 += 2; // L: 75
		}

		if (var0 >= 1) { // L: 77
			var0 >>>= 1; // L: 78
			++var1; // L: 79
		}

		return var0 + var1; // L: 81
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-587731325"
	)
	static final void method2494() {
		if (Client.field725 != PacketWriter.Client_plane) { // L: 3807
			Client.field725 = PacketWriter.Client_plane; // L: 3808
			int var0 = PacketWriter.Client_plane; // L: 3809
			int[] var1 = FloorUnderlayDefinition.sceneMinimapSprite.pixels; // L: 3811
			int var2 = var1.length; // L: 3812

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 3813
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 3814
				var4 = (103 - var3) * 2048 + 24628; // L: 3815

				for (var5 = 1; var5 < 103; ++var5) { // L: 3816
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 3817
						class356.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						class356.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3); // L: 3818
					}

					var4 += 4; // L: 3819
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3822
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3823
			FloorUnderlayDefinition.sceneMinimapSprite.setRaster(); // L: 3824

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 3825
				for (var6 = 1; var6 < 103; ++var6) { // L: 3826
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 3827
						Decimator.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 3828
						Decimator.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 3831

			for (var5 = 0; var5 < 104; ++var5) { // L: 3832
				for (var6 = 0; var6 < 104; ++var6) { // L: 3833
					long var7 = class356.scene.getFloorDecorationTag(PacketWriter.Client_plane, var5, var6); // L: 3834
					if (0L != var7) { // L: 3835
						int var9 = Decimator.Entity_unpackID(var7); // L: 3836
						int var10 = class162.getObjectDefinition(var9).mapIconId; // L: 3837
						if (var10 >= 0 && class432.WorldMapElement_get(var10).field1837) { // L: 3838 3839
							Client.mapIcons[Client.mapIconCount] = class432.WorldMapElement_get(var10).getSpriteBool(false); // L: 3842
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 3843
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 3844
							++Client.mapIconCount; // L: 3845
						}
					}
				}
			}

			Message.rasterProvider.apply(); // L: 3850
		}

	} // L: 3853
}
