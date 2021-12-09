import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "190005998"
	)
	static final void method4320(int var0, int var1, boolean var2) {
		if (!var2 || var0 != Messages.field1277 || class4.field9 != var1) { // L: 6236
			Messages.field1277 = var0; // L: 6239
			class4.field9 = var1; // L: 6240
			VertexNormal.updateGameState(25); // L: 6241
			ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", true); // L: 6242
			int var3 = class131.baseX; // L: 6243
			int var4 = TileItem.baseY; // L: 6244
			class131.baseX = (var0 - 6) * 8; // L: 6245
			TileItem.baseY = (var1 - 6) * 8; // L: 6246
			int var5 = class131.baseX - var3; // L: 6247
			int var6 = TileItem.baseY - var4; // L: 6248
			var3 = class131.baseX; // L: 6249
			var4 = TileItem.baseY; // L: 6250

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 6251
				NPC var19 = Client.npcs[var7]; // L: 6252
				if (var19 != null) { // L: 6253
					for (var9 = 0; var9 < 10; ++var9) { // L: 6254
						var10000 = var19.pathX; // L: 6255
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 6256
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 6258
					var19.y -= var6 * 128; // L: 6259
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 6262
				Player var22 = Client.players[var7]; // L: 6263
				if (var22 != null) { // L: 6264
					for (var9 = 0; var9 < 10; ++var9) { // L: 6265
						var10000 = var22.pathX; // L: 6266
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 6267
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 6269
					var22.y -= var6 * 128; // L: 6270
				}
			}

			byte var20 = 0; // L: 6273
			byte var8 = 104; // L: 6274
			byte var21 = 1; // L: 6275
			if (var5 < 0) { // L: 6276
				var20 = 103; // L: 6277
				var8 = -1; // L: 6278
				var21 = -1; // L: 6279
			}

			byte var10 = 0; // L: 6281
			byte var11 = 104; // L: 6282
			byte var12 = 1; // L: 6283
			if (var6 < 0) { // L: 6284
				var10 = 103; // L: 6285
				var11 = -1; // L: 6286
				var12 = -1; // L: 6287
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 6289
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 6290
					int var15 = var13 + var5; // L: 6291
					int var16 = var14 + var6; // L: 6292

					for (int var17 = 0; var17 < 4; ++var17) { // L: 6293
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 6294
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 6295
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6299 6300 6304
				var18.x -= var5; // L: 6301
				var18.y -= var6; // L: 6302
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 6303
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 6306
				Client.destinationX -= var5; // L: 6307
				Client.destinationY -= var6; // L: 6308
			}

			Client.soundEffectCount = 0; // L: 6310
			Client.isCameraLocked = false; // L: 6311
			UserComparator7.cameraX -= var5 << 7; // L: 6312
			UserComparator10.cameraZ -= var6 << 7; // L: 6313
			class7.oculusOrbFocalPointX -= var5 << 7; // L: 6314
			Actor.oculusOrbFocalPointY -= var6 << 7; // L: 6315
			Client.field570 = -1; // L: 6316
			Client.graphicsObjects.clear(); // L: 6317
			Client.projectiles.clear(); // L: 6318

			for (var14 = 0; var14 < 4; ++var14) { // L: 6319
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 6237 6320
}
