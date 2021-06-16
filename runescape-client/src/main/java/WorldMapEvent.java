import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		longValue = 74587707976866895L
	)
	static long field2150;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -861680435
	)
	static int field2146;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = -1550671291
	)
	static int field2152;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -733594899
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILiw;Liw;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1811227158"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7400
			if (Client.isLowDetail && var0 != SoundSystem.Client_plane) { // L: 7401
				return;
			}

			long var7 = 0L; // L: 7402
			boolean var9 = true; // L: 7403
			boolean var10 = false; // L: 7404
			boolean var11 = false; // L: 7405
			if (var1 == 0) { // L: 7406
				var7 = DevicePcmPlayerProvider.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7407
				var7 = DevicePcmPlayerProvider.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7408
				var7 = DevicePcmPlayerProvider.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7409
				var7 = DevicePcmPlayerProvider.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 7410
				var12 = DevicePcmPlayerProvider.scene.getObjectFlags(var0, var2, var3, var7); // L: 7411
				int var14 = Message.Entity_unpackID(var7); // L: 7412
				int var15 = var12 & 31; // L: 7413
				int var16 = var12 >> 6 & 3; // L: 7414
				ObjectComposition var13;
				if (var1 == 0) { // L: 7415
					DevicePcmPlayerProvider.scene.removeBoundaryObject(var0, var2, var3); // L: 7416
					var13 = Tiles.getObjectDefinition(var14); // L: 7417
					if (var13.interactType != 0) { // L: 7418
						Client.collisionMaps[var0].method3217(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7420
					DevicePcmPlayerProvider.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7421
					DevicePcmPlayerProvider.scene.removeGameObject(var0, var2, var3); // L: 7422
					var13 = Tiles.getObjectDefinition(var14); // L: 7423
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7424
						return;
					}

					if (var13.interactType != 0) { // L: 7425
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7427
					DevicePcmPlayerProvider.scene.removeFloorDecoration(var0, var2, var3); // L: 7428
					var13 = Tiles.getObjectDefinition(var14); // L: 7429
					if (var13.interactType == 1) { // L: 7430
						Client.collisionMaps[var0].method3206(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7433
				var12 = var0; // L: 7434
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7435
					var12 = var0 + 1;
				}

				Decimator.method1167(var0, var12, var2, var3, var4, var5, var6, DevicePcmPlayerProvider.scene, Client.collisionMaps[var0]); // L: 7436
			}
		}

	} // L: 7439
}
