import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class39 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	static final class39 field296;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	static final class39 field293;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -946944109
	)
	@Export("value")
	final int value;

	static {
		field296 = new class39(0);
		field293 = new class39(1);
	}

	class39(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1422185207"
	)
	static boolean method615(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lgl;I)V",
		garbageValue = "-980354844"
	)
	static final void method616(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		byte var14;
		if (class194.field2358 == var0) {
			var2 = var1.method5757();
			byte var3 = var1.method5751();
			var4 = var1.method5755();
			var5 = var1.method5748();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field734[var6];
			var9 = var1.method5936();
			var10 = (var9 >> 4 & 7) + Player.field638;
			var11 = (var9 & 7) + class41.field302;
			byte var12 = var1.method5751();
			var13 = var1.method5757();
			var14 = var1.method5730();
			int var15 = var1.method5867();
			byte var16 = var1.method5750();
			Player var17;
			if (var2 == Client.localPlayerIndex) {
				var17 = class60.localPlayer;
			} else {
				var17 = Client.players[var2];
			}

			if (var17 != null) {
				ObjectDefinition var18 = Canvas.getObjectDefinition(var15);
				int var19;
				int var20;
				if (var7 != 1 && var7 != 3) {
					var19 = var18.sizeX;
					var20 = var18.sizeY;
				} else {
					var19 = var18.sizeY;
					var20 = var18.sizeX;
				}

				int var21 = var10 + (var19 >> 1);
				int var22 = var10 + (var19 + 1 >> 1);
				int var23 = var11 + (var20 >> 1);
				int var24 = var11 + (var20 + 1 >> 1);
				int[][] var25 = Tiles.Tiles_heights[TileItemPile.Client_plane];
				int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2;
				int var27 = (var10 << 7) + (var19 << 6);
				int var28 = (var11 << 7) + (var20 << 6);
				Model var29 = var18.getModel(var6, var7, var25, var27, var26, var28);
				if (var29 != null) {
					TileItem.updatePendingSpawn(TileItemPile.Client_plane, var10, var11, var8, -1, 0, 0, var13 + 1, var4 + 1);
					var17.animationCycleStart = var13 + Client.cycle;
					var17.animationCycleEnd = var4 + Client.cycle;
					var17.model0 = var29;
					var17.field661 = var19 * 64 + var10 * 128;
					var17.field653 = var20 * 64 + var11 * 128;
					var17.tileHeight2 = var26;
					byte var30;
					if (var16 > var3) {
						var30 = var16;
						var16 = var3;
						var3 = var30;
					}

					if (var12 > var14) {
						var30 = var12;
						var12 = var14;
						var14 = var30;
					}

					var17.field648 = var10 + var16;
					var17.field650 = var10 + var3;
					var17.field649 = var12 + var11;
					var17.field651 = var14 + var11;
				}
			}
		}

		int var37;
		if (class194.field2357 == var0) {
			var2 = var1.method5755();
			var37 = var1.method5755();
			var4 = var1.method5936();
			var5 = (var4 >> 4 & 7) + Player.field638;
			var6 = (var4 & 7) + class41.field302;
			var7 = var1.method5746();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				GraphicsObject var41 = new GraphicsObject(var37, TileItemPile.Client_plane, var5, var6, Language.getTileHeight(var5, var6, TileItemPile.Client_plane) - var7, var2, Client.cycle);
				Client.graphicsObjects.addFirst(var41);
			}

		} else if (class194.field2355 == var0) {
			var2 = var1.readUnsignedByte();
			var37 = (var2 >> 4 & 7) + Player.field638;
			var4 = (var2 & 7) + class41.field302;
			var5 = var1.method5867();
			var6 = var1.method5746();
			var7 = var6 >> 2;
			var8 = var6 & 3;
			var9 = Client.field734[var7];
			if (var37 >= 0 && var4 >= 0 && var37 < 104 && var4 < 104) {
				TileItem.updatePendingSpawn(TileItemPile.Client_plane, var37, var4, var9, var5, var7, var8, 0, -1);
			}

		} else if (class194.field2361 == var0) {
			var2 = var1.method5748();
			var37 = (var2 >> 4 & 7) + Player.field638;
			var4 = (var2 & 7) + class41.field302;
			var5 = var1.method5755();
			var6 = var1.readUnsignedByte();
			var7 = var6 >> 2;
			var8 = var6 & 3;
			var9 = Client.field734[var7];
			if (var37 >= 0 && var4 >= 0 && var37 < 103 && var4 < 103) {
				if (var9 == 0) {
					BoundaryObject var32 = UserComparator3.scene.method3213(TileItemPile.Client_plane, var37, var4);
					if (var32 != null) {
						var11 = Language.Entity_unpackID(var32.tag);
						if (var7 == 2) {
							var32.entity1 = new DynamicObject(var11, 2, var8 + 4, TileItemPile.Client_plane, var37, var4, var5, false, var32.entity1);
							var32.entity2 = new DynamicObject(var11, 2, var8 + 1 & 3, TileItemPile.Client_plane, var37, var4, var5, false, var32.entity2);
						} else {
							var32.entity1 = new DynamicObject(var11, var7, var8, TileItemPile.Client_plane, var37, var4, var5, false, var32.entity1);
						}
					}
				}

				if (var9 == 1) {
					WallDecoration var42 = UserComparator3.scene.method3214(TileItemPile.Client_plane, var37, var4);
					if (var42 != null) {
						var11 = Language.Entity_unpackID(var42.tag);
						if (var7 != 4 && var7 != 5) {
							if (var7 == 6) {
								var42.entity1 = new DynamicObject(var11, 4, var8 + 4, TileItemPile.Client_plane, var37, var4, var5, false, var42.entity1);
							} else if (var7 == 7) {
								var42.entity1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, TileItemPile.Client_plane, var37, var4, var5, false, var42.entity1);
							} else if (var7 == 8) {
								var42.entity1 = new DynamicObject(var11, 4, var8 + 4, TileItemPile.Client_plane, var37, var4, var5, false, var42.entity1);
								var42.entity2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, TileItemPile.Client_plane, var37, var4, var5, false, var42.entity2);
							}
						} else {
							var42.entity1 = new DynamicObject(var11, 4, var8, TileItemPile.Client_plane, var37, var4, var5, false, var42.entity1);
						}
					}
				}

				if (var9 == 2) {
					GameObject var43 = UserComparator3.scene.method3215(TileItemPile.Client_plane, var37, var4);
					if (var7 == 11) {
						var7 = 10;
					}

					if (var43 != null) {
						var43.entity = new DynamicObject(Language.Entity_unpackID(var43.tag), var7, var8, TileItemPile.Client_plane, var37, var4, var5, false, var43.entity);
					}
				}

				if (var9 == 3) {
					FloorDecoration var44 = UserComparator3.scene.getFloorDecoration(TileItemPile.Client_plane, var37, var4);
					if (var44 != null) {
						var44.entity = new DynamicObject(Language.Entity_unpackID(var44.tag), 22, var8, TileItemPile.Client_plane, var37, var4, var5, false, var44.entity);
					}
				}
			}

		} else if (class194.field2353 == var0) {
			var2 = var1.method5746();
			var37 = (var2 >> 4 & 7) + Player.field638;
			var4 = (var2 & 7) + class41.field302;
			var5 = var1.method5746();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field734[var6];
			if (var37 >= 0 && var4 >= 0 && var37 < 104 && var4 < 104) {
				TileItem.updatePendingSpawn(TileItemPile.Client_plane, var37, var4, var8, -1, var6, var7, 0, -1);
			}

		} else if (class194.field2354 == var0) {
			var2 = var1.readUnsignedByte();
			var37 = (var2 >> 4 & 7) + Player.field638;
			var4 = (var2 & 7) + class41.field302;
			var5 = var1.readUnsignedShort();
			var6 = var1.method5867();
			var7 = var1.method5867();
			if (var37 >= 0 && var4 >= 0 && var37 < 104 && var4 < 104) {
				NodeDeque var31 = Client.groundItems[TileItemPile.Client_plane][var37][var4];
				if (var31 != null) {
					for (TileItem var33 = (TileItem)var31.last(); var33 != null; var33 = (TileItem)var31.previous()) {
						if ((var7 & 32767) == var33.id && var6 == var33.quantity) {
							var33.quantity = var5;
							break;
						}
					}

					class41.updateItemPile(var37, var4);
				}
			}

		} else {
			TileItem var34;
			if (class194.field2359 == var0) {
				var2 = var1.method5757();
				var37 = var1.readUnsignedByte();
				var4 = (var37 >> 4 & 7) + Player.field638;
				var5 = (var37 & 7) + class41.field302;
				var6 = var1.readUnsignedShort();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var34 = new TileItem();
					var34.id = var6;
					var34.quantity = var2;
					if (Client.groundItems[TileItemPile.Client_plane][var4][var5] == null) {
						Client.groundItems[TileItemPile.Client_plane][var4][var5] = new NodeDeque();
					}

					Client.groundItems[TileItemPile.Client_plane][var4][var5].addFirst(var34);
					class41.updateItemPile(var4, var5);
				}

			} else if (class194.field2360 == var0) {
				var2 = var1.method5746();
				var37 = (var2 >> 4 & 7) + Player.field638;
				var4 = (var2 & 7) + class41.field302;
				byte var38 = var1.method5730();
				var6 = var1.method5746() * 4;
				var7 = var1.method5759();
				var8 = var1.method5755();
				var9 = var1.readUnsignedShort();
				var10 = var1.readUnsignedShort();
				var11 = var1.method5748();
				int var39 = var1.readUnsignedByte() * 4;
				var13 = var1.method5748();
				var14 = var1.readByte();
				int var40 = var14 + var37;
				var5 = var38 + var4;
				if (var37 >= 0 && var4 >= 0 && var37 < 104 && var4 < 104 && var40 >= 0 && var5 >= 0 && var40 < 104 && var5 < 104 && var10 != 65535) {
					var37 = var37 * 128 + 64;
					var4 = var4 * 128 + 64;
					var40 = var40 * 128 + 64;
					var5 = var5 * 128 + 64;
					Projectile var35 = new Projectile(var10, TileItemPile.Client_plane, var37, var4, Language.getTileHeight(var37, var4, TileItemPile.Client_plane) - var39, var9 + Client.cycle, var8 + Client.cycle, var13, var11, var7, var6);
					var35.setDestination(var40, var5, Language.getTileHeight(var40, var5, TileItemPile.Client_plane) - var6, var9 + Client.cycle);
					Client.projectiles.addFirst(var35);
				}

			} else if (class194.field2363 != var0) {
				if (class194.field2362 == var0) {
					var2 = var1.method5746();
					var37 = var2 >> 4 & 15;
					var4 = var2 & 7;
					var5 = var1.method5867();
					var6 = var1.method5748();
					var7 = (var6 >> 4 & 7) + Player.field638;
					var8 = (var6 & 7) + class41.field302;
					var9 = var1.method5746();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var10 = var37 + 1;
						if (class60.localPlayer.pathX[0] >= var7 - var10 && class60.localPlayer.pathX[0] <= var7 + var10 && class60.localPlayer.pathY[0] >= var8 - var10 && class60.localPlayer.pathY[0] <= var10 + var8 && Client.areaSoundEffectVolume != 0 && var4 > 0 && Client.soundEffectCount < 50) {
							Client.soundEffectIds[Client.soundEffectCount] = var5;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.soundLocations[Client.soundEffectCount] = var37 + (var8 << 8) + (var7 << 16);
							++Client.soundEffectCount;
						}
					}
				}

			} else {
				var2 = var1.readUnsignedByte();
				var37 = (var2 >> 4 & 7) + Player.field638;
				var4 = (var2 & 7) + class41.field302;
				var5 = var1.method5755();
				if (var37 >= 0 && var4 >= 0 && var37 < 104 && var4 < 104) {
					NodeDeque var36 = Client.groundItems[TileItemPile.Client_plane][var37][var4];
					if (var36 != null) {
						for (var34 = (TileItem)var36.last(); var34 != null; var34 = (TileItem)var36.previous()) {
							if ((var5 & 32767) == var34.id) {
								var34.remove();
								break;
							}
						}

						if (var36.last() == null) {
							Client.groundItems[TileItemPile.Client_plane][var37][var4] = null;
						}

						class41.updateItemPile(var37, var4);
					}
				}

			}
		}
	}
}
