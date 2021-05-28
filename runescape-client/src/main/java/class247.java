import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class247 {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive5")
	static Archive archive5;

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1392845138"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7247
			if (Client.isLowDetail && var0 != class22.Client_plane) { // L: 7248
				return;
			}

			long var7 = 0L; // L: 7249
			boolean var9 = true; // L: 7250
			boolean var10 = false; // L: 7251
			boolean var11 = false; // L: 7252
			if (var1 == 0) { // L: 7253
				var7 = AbstractSocket.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7254
				var7 = AbstractSocket.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7255
				var7 = AbstractSocket.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7256
				var7 = AbstractSocket.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 7257
				var12 = AbstractSocket.scene.getObjectFlags(var0, var2, var3, var7); // L: 7258
				int var14 = class93.Entity_unpackID(var7); // L: 7259
				int var15 = var12 & 31; // L: 7260
				int var16 = var12 >> 6 & 3; // L: 7261
				ObjectComposition var13;
				if (var1 == 0) { // L: 7262
					AbstractSocket.scene.removeBoundaryObject(var0, var2, var3); // L: 7263
					var13 = class23.getObjectDefinition(var14); // L: 7264
					if (var13.interactType != 0) { // L: 7265
						Client.collisionMaps[var0].method3156(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7267
					AbstractSocket.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7268
					AbstractSocket.scene.removeGameObject(var0, var2, var3); // L: 7269
					var13 = class23.getObjectDefinition(var14); // L: 7270
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7271
						return;
					}

					if (var13.interactType != 0) { // L: 7272
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7274
					AbstractSocket.scene.removeFloorDecoration(var0, var2, var3); // L: 7275
					var13 = class23.getObjectDefinition(var14); // L: 7276
					if (var13.interactType == 1) { // L: 7277
						Client.collisionMaps[var0].method3150(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7280
				var12 = var0; // L: 7281
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7282
					var12 = var0 + 1;
				}

				DevicePcmPlayerProvider.method386(var0, var12, var2, var3, var4, var5, var6, AbstractSocket.scene, Client.collisionMaps[var0]); // L: 7283
			}
		}

	} // L: 7286
}
