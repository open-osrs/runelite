import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("z")
	static int[] Varps_masks;
	@ObfuscatedName("k")
	public static int[] Varps_temp;
	@ObfuscatedName("s")
	public static int[] Varps_main;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1581164719
	)
	static int Interpreter_stringStackSize;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Liw;IIIBZI)V",
		garbageValue = "-1882336793"
	)
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 271
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 272
		if (var8 == null) { // L: 273
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 274
			if (var8 == null) { // L: 275
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 276
				if (var8 != null) { // L: 277
					if (var5) { // L: 278
						var8.removeDual(); // L: 279
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 280
						--NetCache.NetCache_pendingWritesCount; // L: 281
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 282
					}

				} else {
					if (!var5) { // L: 286
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 287
						if (var8 != null) { // L: 288
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 290
					var8.archive = var0; // L: 291
					var8.crc = var3; // L: 292
					var8.padding = var4; // L: 293
					if (var5) { // L: 294
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 295
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 296
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 299
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 300
						++NetCache.NetCache_pendingWritesCount; // L: 301
					}

				}
			}
		}
	} // L: 284 303

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1116846800"
	)
	public static void method4066() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 157
	} // L: 158

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	static final void method4067(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class52.field396 || SpotAnimationDefinition.field3261 != var1) { // L: 5077
			class52.field396 = var0; // L: 5080
			SpotAnimationDefinition.field3261 = var1; // L: 5081
			CollisionMap.updateGameState(25); // L: 5082
			Actor.drawLoadingMessage("Loading - please wait.", true); // L: 5083
			int var3 = WorldMapManager.baseX; // L: 5084
			int var4 = WorldMapLabel.baseY; // L: 5085
			WorldMapManager.baseX = (var0 - 6) * 8; // L: 5086
			WorldMapLabel.baseY = (var1 - 6) * 8; // L: 5087
			int var5 = WorldMapManager.baseX - var3; // L: 5088
			int var6 = WorldMapLabel.baseY - var4; // L: 5089
			var3 = WorldMapManager.baseX; // L: 5090
			var4 = WorldMapLabel.baseY; // L: 5091

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5092
				NPC var19 = Client.npcs[var7]; // L: 5093
				if (var19 != null) { // L: 5094
					for (var9 = 0; var9 < 10; ++var9) { // L: 5095
						var10000 = var19.pathX; // L: 5096
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5097
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5099
					var19.y -= var6 * 128; // L: 5100
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5103
				Player var22 = Client.players[var7]; // L: 5104
				if (var22 != null) { // L: 5105
					for (var9 = 0; var9 < 10; ++var9) { // L: 5106
						var10000 = var22.pathX; // L: 5107
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5108
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5110
					var22.y -= var6 * 128; // L: 5111
				}
			}

			byte var20 = 0; // L: 5114
			byte var8 = 104; // L: 5115
			byte var21 = 1; // L: 5116
			if (var5 < 0) { // L: 5117
				var20 = 103; // L: 5118
				var8 = -1; // L: 5119
				var21 = -1; // L: 5120
			}

			byte var10 = 0; // L: 5122
			byte var11 = 104; // L: 5123
			byte var12 = 1; // L: 5124
			if (var6 < 0) { // L: 5125
				var10 = 103; // L: 5126
				var11 = -1; // L: 5127
				var12 = -1; // L: 5128
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5130
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5131
					int var15 = var5 + var13; // L: 5132
					int var16 = var14 + var6; // L: 5133

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5134
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5135
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5136
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5140 5141 5145
				var18.x -= var5; // L: 5142
				var18.y -= var6; // L: 5143
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5144
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5147
				Client.destinationX -= var5; // L: 5148
				Client.destinationY -= var6; // L: 5149
			}

			Client.soundEffectCount = 0; // L: 5151
			Client.isCameraLocked = false; // L: 5152
			VertexNormal.cameraX -= var5 << 7; // L: 5153
			AbstractWorldMapData.cameraZ -= var6 << 7; // L: 5154
			GrandExchangeOfferWorldComparator.oculusOrbFocalPointX -= var5 << 7; // L: 5155
			MouseHandler.oculusOrbFocalPointY -= var6 << 7; // L: 5156
			Client.field902 = -1; // L: 5157
			Client.graphicsObjects.clear(); // L: 5158
			Client.projectiles.clear(); // L: 5159

			for (var14 = 0; var14 < 4; ++var14) { // L: 5160
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5078 5161
}
