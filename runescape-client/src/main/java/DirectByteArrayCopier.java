import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("b")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("c")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1918796592"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1795617978"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lif;B)V",
		garbageValue = "14"
	)
	static final void method5328(class253 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var37;
		int var38;
		int var39;
		int var40;
		if (class253.field2911 == var0) {
			var37 = var1.method7403();
			var38 = var1.method7520();
			var39 = (var38 >> 4 & 7) + class17.field90;
			var40 = (var38 & 7) + class167.field1813;
			var6 = var1.method7394();
			var7 = var6 >> 2;
			var8 = var6 & 3;
			var9 = Client.field537[var7];
			if (var39 >= 0 && var40 >= 0 && var39 < 103 && var40 < 103) {
				if (var9 == 0) {
					BoundaryObject var36 = class7.scene.method4105(class20.Client_plane, var39, var40);
					if (var36 != null) {
						var11 = PacketWriter.Entity_unpackID(var36.tag);
						if (var7 == 2) {
							var36.renderable1 = new DynamicObject(var11, 2, var8 + 4, class20.Client_plane, var39, var40, var37, false, var36.renderable1);
							var36.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class20.Client_plane, var39, var40, var37, false, var36.renderable2);
						} else {
							var36.renderable1 = new DynamicObject(var11, var7, var8, class20.Client_plane, var39, var40, var37, false, var36.renderable1);
						}
					}
				}

				if (var9 == 1) {
					WallDecoration var44 = class7.scene.method3973(class20.Client_plane, var39, var40);
					if (var44 != null) {
						var11 = PacketWriter.Entity_unpackID(var44.tag);
						if (var7 != 4 && var7 != 5) {
							if (var7 == 6) {
								var44.renderable1 = new DynamicObject(var11, 4, var8 + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable1);
							} else if (var7 == 7) {
								var44.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable1);
							} else if (var7 == 8) {
								var44.renderable1 = new DynamicObject(var11, 4, var8 + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable1);
								var44.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable2);
							}
						} else {
							var44.renderable1 = new DynamicObject(var11, 4, var8, class20.Client_plane, var39, var40, var37, false, var44.renderable1);
						}
					}
				}

				if (var9 == 2) {
					GameObject var45 = class7.scene.getGameObject(class20.Client_plane, var39, var40);
					if (var7 == 11) {
						var7 = 10;
					}

					if (var45 != null) {
						var45.renderable = new DynamicObject(PacketWriter.Entity_unpackID(var45.tag), var7, var8, class20.Client_plane, var39, var40, var37, false, var45.renderable);
					}
				}

				if (var9 == 3) {
					FloorDecoration var46 = class7.scene.getFloorDecoration(class20.Client_plane, var39, var40);
					if (var46 != null) {
						var46.renderable = new DynamicObject(PacketWriter.Entity_unpackID(var46.tag), 22, var8, class20.Client_plane, var39, var40, var37, false, var46.renderable);
					}
				}
			}

		} else {
			int var10;
			int var12;
			int var13;
			int var14;
			if (class253.field2913 == var0) {
				byte var2 = var1.method7396();
				byte var3 = var1.readByte();
				byte var4 = var1.method7396();
				byte var5 = var1.readByte();
				var6 = var1.readUnsignedShort();
				var7 = var1.method7499();
				var8 = var1.readUnsignedShort();
				var9 = var1.method7520();
				var10 = (var9 >> 4 & 7) + class17.field90;
				var11 = (var9 & 7) + class167.field1813;
				var12 = var1.method7392();
				var13 = var12 >> 2;
				var14 = var12 & 3;
				int var15 = Client.field537[var13];
				int var16 = var1.method7401();
				Player var17;
				if (var16 == Client.localPlayerIndex) {
					var17 = class340.localPlayer;
				} else {
					var17 = Client.players[var16];
				}

				if (var17 != null) {
					ObjectComposition var18 = class148.getObjectDefinition(var6);
					int var19;
					int var20;
					if (var14 != 1 && var14 != 3) {
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
					int[][] var25 = Tiles.Tiles_heights[class20.Client_plane];
					int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2;
					int var27 = (var10 << 7) + (var19 << 6);
					int var28 = (var11 << 7) + (var20 << 6);
					Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28);
					if (var29 != null) {
						Varcs.updatePendingSpawn(class20.Client_plane, var10, var11, var15, -1, 0, 0, var7 + 1, var8 + 1);
						var17.animationCycleStart = var7 + Client.cycle;
						var17.animationCycleEnd = var8 + Client.cycle;
						var17.model0 = var29;
						var17.field1056 = var19 * 64 + var10 * 128;
						var17.field1058 = var20 * 64 + var11 * 128;
						var17.tileHeight2 = var26;
						byte var30;
						if (var3 > var2) {
							var30 = var3;
							var3 = var2;
							var2 = var30;
						}

						if (var5 > var4) {
							var30 = var5;
							var5 = var4;
							var4 = var30;
						}

						var17.minX = var10 + var3;
						var17.maxX = var10 + var2;
						var17.minY = var11 + var5;
						var17.maxY = var4 + var11;
					}
				}
			}

			if (class253.field2920 == var0) {
				var37 = var1.method7392();
				var38 = (var37 >> 4 & 7) + class17.field90;
				var39 = (var37 & 7) + class167.field1813;
				var40 = var1.method7404();
				byte var41 = var1.method7396();
				var7 = var1.readUnsignedShort();
				var8 = var1.readUnsignedByte();
				var9 = var1.method7401();
				var10 = var1.readUnsignedByte() * 4;
				var11 = var1.method7520();
				var12 = var1.method7403();
				var13 = var1.readUnsignedByte() * 4;
				byte var42 = var1.method7465();
				var6 = var41 + var38;
				var14 = var42 + var39;
				if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var6 >= 0 && var14 >= 0 && var6 < 104 && var14 < 104 && var9 != 65535) {
					var38 = var38 * 128 + 64;
					var39 = var39 * 128 + 64;
					var6 = var6 * 128 + 64;
					var14 = var14 * 128 + 64;
					Projectile var35 = new Projectile(var9, class20.Client_plane, var38, var39, FaceNormal.getTileHeight(var38, var39, class20.Client_plane) - var10, var12 + Client.cycle, var7 + Client.cycle, var11, var8, var40, var13);
					var35.setDestination(var6, var14, FaceNormal.getTileHeight(var6, var14, class20.Client_plane) - var13, var12 + Client.cycle);
					Client.projectiles.addFirst(var35);
				}

			} else if (class253.field2916 == var0) {
				var37 = var1.method7394();
				var38 = var37 >> 2;
				var39 = var37 & 3;
				var40 = Client.field537[var38];
				var6 = var1.method7394();
				var7 = (var6 >> 4 & 7) + class17.field90;
				var8 = (var6 & 7) + class167.field1813;
				var9 = var1.method7403();
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
					Varcs.updatePendingSpawn(class20.Client_plane, var7, var8, var40, var9, var38, var39, 0, -1);
				}

			} else if (class253.field2918 == var0) {
				var37 = var1.readUnsignedByte();
				var38 = var37 >> 2;
				var39 = var37 & 3;
				var40 = Client.field537[var38];
				var6 = var1.method7392();
				var7 = (var6 >> 4 & 7) + class17.field90;
				var8 = (var6 & 7) + class167.field1813;
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
					Varcs.updatePendingSpawn(class20.Client_plane, var7, var8, var40, -1, var38, var39, 0, -1);
				}

			} else {
				TileItem var33;
				if (class253.field2917 == var0) {
					var37 = var1.method7392();
					var38 = (var37 >> 4 & 7) + class17.field90;
					var39 = (var37 & 7) + class167.field1813;
					var40 = var1.method7401();
					if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
						NodeDeque var34 = Client.groundItems[class20.Client_plane][var38][var39];
						if (var34 != null) {
							for (var33 = (TileItem)var34.last(); var33 != null; var33 = (TileItem)var34.previous()) {
								if ((var40 & 32767) == var33.id) {
									var33.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[class20.Client_plane][var38][var39] = null;
							}

							MouseHandler.updateItemPile(var38, var39);
						}
					}

				} else if (class253.field2914 == var0) {
					var37 = var1.readUnsignedShort();
					var38 = var1.method7394();
					var39 = (var38 >> 4 & 7) + class17.field90;
					var40 = (var38 & 7) + class167.field1813;
					var6 = var1.method7401();
					if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
						var33 = new TileItem();
						var33.id = var37;
						var33.quantity = var6;
						if (Client.groundItems[class20.Client_plane][var39][var40] == null) {
							Client.groundItems[class20.Client_plane][var39][var40] = new NodeDeque();
						}

						Client.groundItems[class20.Client_plane][var39][var40].addFirst(var33);
						MouseHandler.updateItemPile(var39, var40);
					}

				} else if (class253.field2912 == var0) {
					var37 = var1.method7392();
					var38 = (var37 >> 4 & 7) + class17.field90;
					var39 = (var37 & 7) + class167.field1813;
					var40 = var1.method7403();
					var6 = var1.method7520();
					var7 = var1.readUnsignedShort();
					if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
						var38 = var38 * 128 + 64;
						var39 = var39 * 128 + 64;
						GraphicsObject var43 = new GraphicsObject(var40, class20.Client_plane, var38, var39, FaceNormal.getTileHeight(var38, var39, class20.Client_plane) - var6, var7, Client.cycle);
						Client.graphicsObjects.addFirst(var43);
					}

				} else {
					if (class253.field2915 == var0) {
						var37 = var1.readUnsignedByte();
						var38 = var37 >> 4 & 15;
						var39 = var37 & 7;
						var40 = var1.method7392();
						var6 = var1.readUnsignedByte();
						var7 = (var6 >> 4 & 7) + class17.field90;
						var8 = (var6 & 7) + class167.field1813;
						var9 = var1.method7499();
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
							var10 = var38 + 1;
							if (class340.localPlayer.pathX[0] >= var7 - var10 && class340.localPlayer.pathX[0] <= var10 + var7 && class340.localPlayer.pathY[0] >= var8 - var10 && class340.localPlayer.pathY[0] <= var10 + var8 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0 && var39 > 0 && Client.soundEffectCount < 50) {
								Client.soundEffectIds[Client.soundEffectCount] = var9;
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var39;
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var40;
								Client.soundEffects[Client.soundEffectCount] = null;
								Client.soundLocations[Client.soundEffectCount] = var38 + (var8 << 8) + (var7 << 16);
								++Client.soundEffectCount;
							}
						}
					}

					if (class253.field2919 == var0) {
						var37 = var1.readUnsignedShort();
						var38 = var1.method7499();
						var39 = var1.method7392();
						var40 = (var39 >> 4 & 7) + class17.field90;
						var6 = (var39 & 7) + class167.field1813;
						var7 = var1.method7401();
						if (var40 >= 0 && var6 >= 0 && var40 < 104 && var6 < 104) {
							NodeDeque var31 = Client.groundItems[class20.Client_plane][var40][var6];
							if (var31 != null) {
								for (TileItem var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
									if ((var7 & 32767) == var32.id && var38 == var32.quantity) {
										var32.quantity = var37;
										break;
									}
								}

								MouseHandler.updateItemPile(var40, var6);
							}
						}

					}
				}
			}
		}
	}
}
