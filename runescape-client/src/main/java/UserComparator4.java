import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("m")
	public static boolean field1988;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;I)I",
		garbageValue = "1051999362"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;IZI)Lep;",
		garbageValue = "1436051671"
	)
	public static Frames method3470(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lil;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	static void method3469(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field666 += var2.groupCount;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "-1705259576"
	)
	static final void method3465(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class194.field2342 == var0) {
			var2 = var1.method5582();
			var3 = var1.method5571();
			var4 = (var3 >> 4 & 7) + PacketWriter.field1331;
			var5 = (var3 & 7) + class248.field3222;
			var6 = var1.method5571();
			var7 = var6 >> 4 & 15;
			var8 = var6 & 7;
			var9 = var1.method5572();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var10 = var7 + 1;
				if (PlayerAppearance.localPlayer.pathX[0] >= var4 - var10 && PlayerAppearance.localPlayer.pathX[0] <= var10 + var4 && PlayerAppearance.localPlayer.pathY[0] >= var5 - var10 && PlayerAppearance.localPlayer.pathY[0] <= var5 + var10 && Timer.clientPreferences.areaSoundEffectsVolume != 0 && var8 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var2;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16);
					++Client.soundEffectCount;
				}
			}
		}

		if (class194.field2349 == var0) {
			var2 = var1.method5571();
			var3 = (var2 >> 4 & 7) + PacketWriter.field1331;
			var4 = (var2 & 7) + class248.field3222;
			var5 = var1.method5582();
			var6 = var1.readUnsignedShort();
			var7 = var1.readUnsignedByte();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var3 = var3 * 128 + 64;
				var4 = var4 * 128 + 64;
				GraphicsObject var45 = new GraphicsObject(var5, GameObject.Client_plane, var3, var4, SecureRandomFuture.getTileHeight(var3, var4, GameObject.Client_plane) - var7, var6, Client.cycle);
				Client.graphicsObjects.addFirst(var45);
			}

		} else {
			int var11;
			int var13;
			int var14;
			if (class194.field2346 == var0) {
				var2 = var1.method5573() * 4;
				byte var38 = var1.readByte();
				byte var39 = var1.readByte();
				var5 = var1.readUnsignedByte();
				var6 = var1.method5580();
				var7 = var1.method5584();
				var8 = var1.method5571();
				var9 = (var8 >> 4 & 7) + PacketWriter.field1331;
				var10 = (var8 & 7) + class248.field3222;
				var11 = var1.readUnsignedShort();
				int var41 = var1.method5582();
				var13 = var1.method5571();
				var14 = var1.method5573() * 4;
				var3 = var38 + var9;
				var4 = var39 + var10;
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var41 != 65535) {
					var9 = var9 * 128 + 64;
					var10 = var10 * 128 + 64;
					var3 = var3 * 128 + 64;
					var4 = var4 * 128 + 64;
					Projectile var36 = new Projectile(var41, GameObject.Client_plane, var9, var10, SecureRandomFuture.getTileHeight(var9, var10, GameObject.Client_plane) - var2, var6 + Client.cycle, var11 + Client.cycle, var13, var5, var7, var14);
					var36.setDestination(var3, var4, SecureRandomFuture.getTileHeight(var3, var4, GameObject.Client_plane) - var14, var6 + Client.cycle);
					Client.projectiles.addFirst(var36);
				}

			} else if (class194.field2343 == var0) {
				var2 = var1.readUnsignedShort();
				var3 = var1.method5573();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = Client.field708[var4];
				var7 = var1.readUnsignedByte();
				var8 = (var7 >> 4 & 7) + PacketWriter.field1331;
				var9 = (var7 & 7) + class248.field3222;
				if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
					ArchiveLoader.updatePendingSpawn(GameObject.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1);
				}

			} else {
				TileItem var33;
				if (class194.field2345 == var0) {
					var2 = var1.method5582();
					var3 = var1.method5572();
					var4 = (var3 >> 4 & 7) + PacketWriter.field1331;
					var5 = (var3 & 7) + class248.field3222;
					var6 = var1.method5582();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var33 = new TileItem();
						var33.id = var6;
						var33.quantity = var2;
						if (Client.groundItems[GameObject.Client_plane][var4][var5] == null) {
							Client.groundItems[GameObject.Client_plane][var4][var5] = new NodeDeque();
						}

						Client.groundItems[GameObject.Client_plane][var4][var5].addFirst(var33);
						MouseRecorder.updateItemPile(var4, var5);
					}

				} else if (class194.field2350 == var0) {
					var2 = var1.method5580();
					var3 = var1.method5572();
					var4 = (var3 >> 4 & 7) + PacketWriter.field1331;
					var5 = (var3 & 7) + class248.field3222;
					var6 = var1.method5580();
					var7 = var1.method5580();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						NodeDeque var34 = Client.groundItems[GameObject.Client_plane][var4][var5];
						if (var34 != null) {
							for (TileItem var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
								if ((var2 & 32767) == var35.id && var7 == var35.quantity) {
									var35.quantity = var6;
									break;
								}
							}

							MouseRecorder.updateItemPile(var4, var5);
						}
					}

				} else if (class194.field2348 == var0) {
					var2 = var1.method5580();
					var3 = var1.method5572();
					var4 = (var3 >> 4 & 7) + PacketWriter.field1331;
					var5 = (var3 & 7) + class248.field3222;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						NodeDeque var32 = Client.groundItems[GameObject.Client_plane][var4][var5];
						if (var32 != null) {
							for (var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) {
								if ((var2 & 32767) == var33.id) {
									var33.remove();
									break;
								}
							}

							if (var32.last() == null) {
								Client.groundItems[GameObject.Client_plane][var4][var5] = null;
							}

							MouseRecorder.updateItemPile(var4, var5);
						}
					}

				} else if (class194.field2351 == var0) {
					var2 = var1.method5572();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field708[var3];
					var6 = var1.readUnsignedShort();
					var7 = var1.method5572();
					var8 = (var7 >> 4 & 7) + PacketWriter.field1331;
					var9 = (var7 & 7) + class248.field3222;
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
						if (var5 == 0) {
							BoundaryObject var31 = ArchiveLoader.scene.method3197(GameObject.Client_plane, var8, var9);
							if (var31 != null) {
								var11 = Occluder.Entity_unpackID(var31.tag);
								if (var3 == 2) {
									var31.entity1 = new DynamicObject(var11, 2, var4 + 4, GameObject.Client_plane, var8, var9, var6, false, var31.entity1);
									var31.entity2 = new DynamicObject(var11, 2, var4 + 1 & 3, GameObject.Client_plane, var8, var9, var6, false, var31.entity2);
								} else {
									var31.entity1 = new DynamicObject(var11, var3, var4, GameObject.Client_plane, var8, var9, var6, false, var31.entity1);
								}
							}
						}

						if (var5 == 1) {
							WallDecoration var42 = ArchiveLoader.scene.method3234(GameObject.Client_plane, var8, var9);
							if (var42 != null) {
								var11 = Occluder.Entity_unpackID(var42.tag);
								if (var3 != 4 && var3 != 5) {
									if (var3 == 6) {
										var42.entity1 = new DynamicObject(var11, 4, var4 + 4, GameObject.Client_plane, var8, var9, var6, false, var42.entity1);
									} else if (var3 == 7) {
										var42.entity1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, GameObject.Client_plane, var8, var9, var6, false, var42.entity1);
									} else if (var3 == 8) {
										var42.entity1 = new DynamicObject(var11, 4, var4 + 4, GameObject.Client_plane, var8, var9, var6, false, var42.entity1);
										var42.entity2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, GameObject.Client_plane, var8, var9, var6, false, var42.entity2);
									}
								} else {
									var42.entity1 = new DynamicObject(var11, 4, var4, GameObject.Client_plane, var8, var9, var6, false, var42.entity1);
								}
							}
						}

						if (var5 == 2) {
							GameObject var43 = ArchiveLoader.scene.method3183(GameObject.Client_plane, var8, var9);
							if (var3 == 11) {
								var3 = 10;
							}

							if (var43 != null) {
								var43.entity = new DynamicObject(Occluder.Entity_unpackID(var43.tag), var3, var4, GameObject.Client_plane, var8, var9, var6, false, var43.entity);
							}
						}

						if (var5 == 3) {
							FloorDecoration var44 = ArchiveLoader.scene.getFloorDecoration(GameObject.Client_plane, var8, var9);
							if (var44 != null) {
								var44.entity = new DynamicObject(Occluder.Entity_unpackID(var44.tag), 22, var4, GameObject.Client_plane, var8, var9, var6, false, var44.entity);
							}
						}
					}

				} else {
					if (class194.field2344 == var0) {
						byte var37 = var1.method5645();
						var3 = var1.method5571();
						var4 = var3 >> 2;
						var5 = var3 & 3;
						var6 = Client.field708[var4];
						byte var40 = var1.method5645();
						var8 = var1.readUnsignedShort();
						var9 = var1.method5572();
						var10 = (var9 >> 4 & 7) + PacketWriter.field1331;
						var11 = (var9 & 7) + class248.field3222;
						byte var12 = var1.readByte();
						var13 = var1.readUnsignedShort();
						var14 = var1.method5539();
						int var15 = var1.readUnsignedShort();
						byte var16 = var1.readByte();
						Player var17;
						if (var13 == Client.localPlayerIndex) {
							var17 = PlayerAppearance.localPlayer;
						} else {
							var17 = Client.players[var13];
						}

						if (var17 != null) {
							ObjectDefinition var18 = WorldMapDecoration.getObjectDefinition(var14);
							int var19;
							int var20;
							if (var5 != 1 && var5 != 3) {
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
							int[][] var25 = Tiles.Tiles_heights[GameObject.Client_plane];
							int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
							int var27 = (var10 << 7) + (var19 << 6);
							int var28 = (var11 << 7) + (var20 << 6);
							Model var29 = var18.getModel(var4, var5, var25, var27, var26, var28);
							if (var29 != null) {
								ArchiveLoader.updatePendingSpawn(GameObject.Client_plane, var10, var11, var6, -1, 0, 0, var15 + 1, var8 + 1);
								var17.animationCycleStart = var15 + Client.cycle;
								var17.animationCycleEnd = var8 + Client.cycle;
								var17.model0 = var29;
								var17.field634 = var10 * 128 + var19 * 64;
								var17.field626 = var11 * 128 + var20 * 64;
								var17.tileHeight2 = var26;
								byte var30;
								if (var12 > var40) {
									var30 = var12;
									var12 = var40;
									var40 = var30;
								}

								if (var37 > var16) {
									var30 = var37;
									var37 = var16;
									var16 = var30;
								}

								var17.field620 = var10 + var12;
								var17.field622 = var40 + var10;
								var17.field606 = var11 + var37;
								var17.field623 = var11 + var16;
							}
						}
					}

					if (class194.field2347 == var0) {
						var2 = var1.method5572();
						var3 = (var2 >> 4 & 7) + PacketWriter.field1331;
						var4 = (var2 & 7) + class248.field3222;
						var5 = var1.method5571();
						var6 = var5 >> 2;
						var7 = var5 & 3;
						var8 = Client.field708[var6];
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
							ArchiveLoader.updatePendingSpawn(GameObject.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1);
						}

					}
				}
			}
		}
	}
}
