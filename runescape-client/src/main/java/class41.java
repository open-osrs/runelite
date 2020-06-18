import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class41 {
	@ObfuscatedName("gm")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -2009129273
	)
	static int field302;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-1502584802"
	)
	public static void method624(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIIIIILem;Lfz;I)V",
		garbageValue = "-1774275667"
	)
	static final void method623(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectDefinition var8 = Canvas.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = class206.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class195.method3747(var0, var1, var2, var8, var4);
			}

			Object var22;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var22 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var22 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Entity)var22, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var23;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
						}

						var6.method3356(var0, var1, var2, var16, 1, 1, (Entity)var22, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = HealthBarUpdate.field1031[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var22, (Entity)null, Tiles.field527[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								class171.field2036[var0][var1][var2] = 50;
								class171.field2036[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = HealthBarUpdate.field1031[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								class171.field2036[var0][var1][var2 + 1] = 50;
								class171.field2036[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = HealthBarUpdate.field1031[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								class171.field2036[var0][var1 + 1][var2] = 50;
								class171.field2036[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = HealthBarUpdate.field1031[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								class171.field2036[var0][var1][var2] = 50;
								class171.field2036[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = HealthBarUpdate.field1031[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3680(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3208(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var22, (Entity)null, Tiles.field528[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class171.field2036[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class171.field2036[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class171.field2036[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class171.field2036[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3680(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var28;
						if (var5 == 2) {
							var28 = var4 + 1 & 3;
							Object var29;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var30 = var8.getEntity(2, var28, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
								var30 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, true, (Entity)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var29, (Entity)var30, Tiles.field527[var4], Tiles.field527[var28], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = HealthBarUpdate.field1031[var0][var1];
									var10000[var2] |= 585;
									var10000 = HealthBarUpdate.field1031[var0][var1];
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) {
									var10000 = HealthBarUpdate.field1031[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = HealthBarUpdate.field1031[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = HealthBarUpdate.field1031[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = HealthBarUpdate.field1031[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = HealthBarUpdate.field1031[var0][var1];
									var10000[var2] |= 1170;
									var10000 = HealthBarUpdate.field1031[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3680(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method3208(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Entity)var22, (Entity)null, Tiles.field528[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									class171.field2036[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class171.field2036[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class171.field2036[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class171.field2036[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3680(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
							}

							var6.method3356(var0, var1, var2, var16, 1, 1, (Entity)var22, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method3208(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Entity)var22, (Entity)null, Tiles.field527[var4], 0, 0, 0, var19, var21);
						} else {
							long var31;
							Object var33;
							if (var5 == 5) {
								var28 = 16;
								var31 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var31 != 0L) {
									var28 = Canvas.getObjectDefinition(Language.Entity_unpackID(var31)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var33 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var33 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var33, (Entity)null, Tiles.field527[var4], 0, var28 * Tiles.field523[var4], var28 * Tiles.field529[var4], var19, var21);
							} else if (var5 == 6) {
								var28 = 8;
								var31 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var31 != 0L) {
									var28 = Canvas.getObjectDefinition(Language.Entity_unpackID(var31)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var33, (Entity)null, 256, var4, var28 * Tiles.field531[var4], var28 * Tiles.field533[var4], var19, var21);
							} else if (var5 == 7) {
								var23 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var22 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
								} else {
									var22 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var22, (Entity)null, 256, var23, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var28 = 8;
								var31 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var31) {
									var28 = Canvas.getObjectDefinition(Language.Entity_unpackID(var31)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Entity)var33, (Entity)var26, 256, var4, var28 * Tiles.field531[var4], var28 * Tiles.field533[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var22 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var22 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
					}

					if (var22 != null && var6.method3356(var0, var1, var2, var16, var9, var10, (Entity)var22, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var23 = 15;
						if (var22 instanceof Model) {
							var23 = ((Model)var22).method2999() / 4;
							if (var23 > 30) {
								var23 = 30;
							}
						}

						for (int var24 = 0; var24 <= var9; ++var24) {
							for (int var25 = 0; var25 <= var10; ++var25) {
								if (var23 > class171.field2036[var0][var24 + var1][var25 + var2]) {
									class171.field2036[var0][var24 + var1][var25 + var2] = (byte)var23;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1829350132"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[TileItemPile.Client_plane][var0][var1];
		if (var2 == null) {
			UserComparator3.scene.removeGroundItemPile(TileItemPile.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemDefinition var7 = KitDefinition.ItemDefinition_get(var6.id);
				long var8 = (long)var7.price;
				if (var7.isStackable == 1) {
					var8 *= (long)(var6.quantity + 1);
				}

				if (var8 > var3) {
					var3 = var8;
					var5 = var6;
				}
			}

			if (var5 == null) {
				UserComparator3.scene.removeGroundItemPile(TileItemPile.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var12 = null;
				TileItem var11 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var12 == null) {
							var12 = var6;
						}

						if (var6.id != var12.id && var11 == null) {
							var11 = var6;
						}
					}
				}

				long var9 = class206.calculateTag(var0, var1, 3, false, 0);
				UserComparator3.scene.newGroundItemPile(TileItemPile.Client_plane, var0, var1, Language.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, TileItemPile.Client_plane), var5, var9, var12, var11);
			}
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		signature = "(Lbz;ZI)V",
		garbageValue = "1167867750"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			Tiles.method1200(var2);
		}

		PlayerAppearance.method4177(var2);
		Widget var4 = WorldMapSprite.getWidget(var3);
		if (var4 != null) {
			class234.invalidateWidget(var4);
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
			int var7 = Client.menuOpcodes[var5];
			boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
			if (var6) {
				if (var5 < Client.menuOptionsCount - 1) {
					for (int var8 = var5; var8 < Client.menuOptionsCount - 1; ++var8) {
						Client.menuActions[var8] = Client.menuActions[var8 + 1];
						Client.menuTargets[var8] = Client.menuTargets[var8 + 1];
						Client.menuOpcodes[var8] = Client.menuOpcodes[var8 + 1];
						Client.menuIdentifiers[var8] = Client.menuIdentifiers[var8 + 1];
						Client.menuArguments1[var8] = Client.menuArguments1[var8 + 1];
						Client.menuArguments2[var8] = Client.menuArguments2[var8 + 1];
						Client.menuShiftClick[var8] = Client.menuShiftClick[var8 + 1];
					}
				}

				--var5;
				--Client.menuOptionsCount;
			}
		}

		WorldMapEvent.method840(class69.menuWidth / 2 + WorldMapRectangle.menuX, Frames.menuY);
		if (Client.rootInterface != -1) {
			Language.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
