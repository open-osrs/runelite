import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1384072805
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILkd;Lkd;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-2"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		UserComparator7.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-2126153906"
	)
	public static Object method4929(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 16
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)[Lqw;",
		garbageValue = "-27"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4753, FillMode.field4754, FillMode.SOLID}; // L: 15
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1670571059"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class175.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5990
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 5991
			var7 = class175.scene.getObjectFlags(var0, var1, var2, var5); // L: 5992
			var8 = var7 >> 6 & 3; // L: 5993
			var9 = var7 & 31; // L: 5994
			var10 = var3; // L: 5995
			if (LoginPacket.method5022(var5)) { // L: 5996
				var10 = var4;
			}

			int[] var11 = InterfaceParent.sceneMinimapSprite.pixels; // L: 5997
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5998
			var13 = NetSocket.Entity_unpackID(var5); // L: 5999
			ObjectComposition var14 = class82.getObjectDefinition(var13); // L: 6000
			if (var14.mapSceneId != -1) { // L: 6001
				IndexedSprite var15 = class29.mapSceneSprites[var14.mapSceneId]; // L: 6002
				if (var15 != null) { // L: 6003
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6004
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6005
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 6006
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6010
					if (var8 == 0) { // L: 6011
						var11[var12] = var10; // L: 6012
						var11[var12 + 512] = var10; // L: 6013
						var11[var12 + 1024] = var10; // L: 6014
						var11[var12 + 1536] = var10; // L: 6015
					} else if (var8 == 1) { // L: 6017
						var11[var12] = var10; // L: 6018
						var11[var12 + 1] = var10; // L: 6019
						var11[var12 + 2] = var10; // L: 6020
						var11[var12 + 3] = var10; // L: 6021
					} else if (var8 == 2) { // L: 6023
						var11[var12 + 3] = var10; // L: 6024
						var11[var12 + 512 + 3] = var10; // L: 6025
						var11[var12 + 1024 + 3] = var10; // L: 6026
						var11[var12 + 1536 + 3] = var10; // L: 6027
					} else if (var8 == 3) { // L: 6029
						var11[var12 + 1536] = var10; // L: 6030
						var11[var12 + 1536 + 1] = var10; // L: 6031
						var11[var12 + 1536 + 2] = var10; // L: 6032
						var11[var12 + 1536 + 3] = var10; // L: 6033
					}
				}

				if (var9 == 3) { // L: 6036
					if (var8 == 0) { // L: 6037
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6038
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6039
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6040
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6042
					if (var8 == 3) { // L: 6043
						var11[var12] = var10; // L: 6044
						var11[var12 + 512] = var10; // L: 6045
						var11[var12 + 1024] = var10; // L: 6046
						var11[var12 + 1536] = var10; // L: 6047
					} else if (var8 == 0) { // L: 6049
						var11[var12] = var10; // L: 6050
						var11[var12 + 1] = var10; // L: 6051
						var11[var12 + 2] = var10; // L: 6052
						var11[var12 + 3] = var10; // L: 6053
					} else if (var8 == 1) { // L: 6055
						var11[var12 + 3] = var10; // L: 6056
						var11[var12 + 512 + 3] = var10; // L: 6057
						var11[var12 + 1024 + 3] = var10; // L: 6058
						var11[var12 + 1536 + 3] = var10; // L: 6059
					} else if (var8 == 2) { // L: 6061
						var11[var12 + 1536] = var10; // L: 6062
						var11[var12 + 1536 + 1] = var10; // L: 6063
						var11[var12 + 1536 + 2] = var10; // L: 6064
						var11[var12 + 1536 + 3] = var10; // L: 6065
					}
				}
			}
		}

		var5 = class175.scene.getGameObjectTag(var0, var1, var2); // L: 6070
		if (var5 != 0L) { // L: 6071
			var7 = class175.scene.getObjectFlags(var0, var1, var2, var5); // L: 6072
			var8 = var7 >> 6 & 3; // L: 6073
			var9 = var7 & 31; // L: 6074
			var10 = NetSocket.Entity_unpackID(var5); // L: 6075
			ObjectComposition var24 = class82.getObjectDefinition(var10); // L: 6076
			int var19;
			if (var24.mapSceneId != -1) { // L: 6077
				IndexedSprite var20 = class29.mapSceneSprites[var24.mapSceneId]; // L: 6078
				if (var20 != null) { // L: 6079
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6080
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6081
					var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6082
				}
			} else if (var9 == 9) { // L: 6085
				var12 = 15658734; // L: 6086
				if (LoginPacket.method5022(var5)) { // L: 6087
					var12 = 15597568;
				}

				int[] var18 = InterfaceParent.sceneMinimapSprite.pixels; // L: 6088
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6089
				if (var8 != 0 && var8 != 2) { // L: 6090
					var18[var19] = var12; // L: 6097
					var18[var19 + 1 + 512] = var12; // L: 6098
					var18[var19 + 1024 + 2] = var12; // L: 6099
					var18[var19 + 1536 + 3] = var12; // L: 6100
				} else {
					var18[var19 + 1536] = var12; // L: 6091
					var18[var19 + 1 + 1024] = var12; // L: 6092
					var18[var19 + 512 + 2] = var12; // L: 6093
					var18[var19 + 3] = var12; // L: 6094
				}
			}
		}

		var5 = class175.scene.getFloorDecorationTag(var0, var1, var2); // L: 6104
		if (var5 != 0L) { // L: 6105
			var7 = NetSocket.Entity_unpackID(var5); // L: 6106
			ObjectComposition var21 = class82.getObjectDefinition(var7); // L: 6107
			if (var21.mapSceneId != -1) { // L: 6108
				IndexedSprite var22 = class29.mapSceneSprites[var21.mapSceneId]; // L: 6109
				if (var22 != null) { // L: 6110
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6111
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6112
					var22.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6113
				}
			}
		}

	} // L: 6117

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1650699748"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9925
			Projectile.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9926
		}

		long var4 = -1L; // L: 9929
		long var6 = -1L; // L: 9930

		int var8;
		for (var8 = 0; var8 < class114.method2637(); ++var8) { // L: 9931
			long var23 = class132.method2833(var8); // L: 9932
			if (var6 != var23) { // L: 9933
				var6 = var23; // L: 9934
				int var11 = class17.method236(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9937
				int var12 = var11; // L: 9939
				int var13 = ClanChannelMember.method2819(var8); // L: 9940
				int var14 = GrandExchangeOfferNameComparator.method5790(var8); // L: 9941
				int var15 = NetSocket.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9944
				int var16 = var15; // L: 9946
				if (var14 == 2 && class175.scene.getObjectFlags(class128.Client_plane, var11, var13, var23) >= 0) { // L: 9947 9948
					ObjectComposition var17 = class82.getObjectDefinition(var15); // L: 9949
					if (var17.transforms != null) { // L: 9950
						var17 = var17.transform();
					}

					if (var17 == null) { // L: 9951
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9952
						Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(65535) + var17.name, 1, var15, var11, var13); // L: 9953
					} else if (Client.isSpellSelected) { // L: 9956
						if ((class113.selectedSpellFlags & 4) == 4) { // L: 9957
							Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(65535) + var17.name, 2, var15, var11, var13); // L: 9958
						}
					} else {
						String[] var18 = var17.actions; // L: 9963
						if (var18 != null) { // L: 9964
							for (int var19 = 4; var19 >= 0; --var19) { // L: 9965
								if (var18[var19] != null) { // L: 9966
									short var20 = 0; // L: 9967
									if (var19 == 0) { // L: 9968
										var20 = 3;
									}

									if (var19 == 1) { // L: 9969
										var20 = 4;
									}

									if (var19 == 2) { // L: 9970
										var20 = 5;
									}

									if (var19 == 3) { // L: 9971
										var20 = 6;
									}

									if (var19 == 4) { // L: 9972
										var20 = 1001;
									}

									Projectile.insertMenuItemNoShift(var18[var19], class166.colorStartTag(65535) + var17.name, var20, var16, var12, var13); // L: 9973
								}
							}
						}

						Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(65535) + var17.name, 1002, var17.id, var12, var13); // L: 9978
					}
				}

				Player var21;
				int var25;
				NPC var26;
				int var33;
				int[] var34;
				if (var14 == 1) { // L: 9983
					NPC var29 = Client.npcs[var16]; // L: 9984
					if (var29 == null) { // L: 9985
						continue;
					}

					if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) { // L: 9986
						for (var25 = 0; var25 < Client.npcCount; ++var25) { // L: 9987
							var26 = Client.npcs[Client.npcIndices[var25]]; // L: 9988
							if (var26 != null && var26 != var29 && var26.definition.size == 1 && var26.x == var29.x && var26.y == var29.y) { // L: 9989
								WorldMapLabelSize.addNpcToMenu(var26, Client.npcIndices[var25], var12, var13);
							}
						}

						var25 = Players.Players_count; // L: 9991
						var34 = Players.Players_indices; // L: 9992

						for (var33 = 0; var33 < var25; ++var33) { // L: 9993
							var21 = Client.players[var34[var33]]; // L: 9994
							if (var21 != null && var29.x == var21.x && var29.y == var21.y) { // L: 9995
								ApproximateRouteStrategy.addPlayerToMenu(var21, var34[var33], var12, var13);
							}
						}
					}

					WorldMapLabelSize.addNpcToMenu(var29, var16, var12, var13); // L: 9998
				}

				if (var14 == 0) { // L: 10000
					Player var30 = Client.players[var16]; // L: 10001
					if (var30 == null) { // L: 10002
						continue;
					}

					if ((var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 10003
						for (var25 = 0; var25 < Client.npcCount; ++var25) { // L: 10004
							var26 = Client.npcs[Client.npcIndices[var25]]; // L: 10005
							if (var26 != null && var26.definition.size == 1 && var26.x == var30.x && var30.y == var26.y) { // L: 10006
								WorldMapLabelSize.addNpcToMenu(var26, Client.npcIndices[var25], var12, var13);
							}
						}

						var25 = Players.Players_count; // L: 10008
						var34 = Players.Players_indices; // L: 10009

						for (var33 = 0; var33 < var25; ++var33) { // L: 10010
							var21 = Client.players[var34[var33]]; // L: 10011
							if (var21 != null && var21 != var30 && var21.x == var30.x && var30.y == var21.y) { // L: 10012
								ApproximateRouteStrategy.addPlayerToMenu(var21, var34[var33], var12, var13);
							}
						}
					}

					if (var16 != Client.combatTargetPlayerIndex) { // L: 10015
						ApproximateRouteStrategy.addPlayerToMenu(var30, var16, var12, var13);
					} else {
						var4 = var23; // L: 10016
					}
				}

				if (var14 == 3) { // L: 10018
					NodeDeque var32 = Client.groundItems[class128.Client_plane][var12][var13]; // L: 10019
					if (var32 != null) { // L: 10020
						for (TileItem var31 = (TileItem)var32.first(); var31 != null; var31 = (TileItem)var32.next()) { // L: 10021 10022 10055
							ItemComposition var35 = FileSystem.ItemDefinition_get(var31.id); // L: 10023
							if (Client.isItemSelected == 1) { // L: 10024
								Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(16748608) + var35.name, 16, var31.id, var12, var13); // L: 10025
							} else if (Client.isSpellSelected) { // L: 10028
								if ((class113.selectedSpellFlags & 1) == 1) { // L: 10029
									Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(16748608) + var35.name, 17, var31.id, var12, var13); // L: 10030
								}
							} else {
								String[] var27 = var35.groundActions; // L: 10035

								for (int var28 = 4; var28 >= 0; --var28) { // L: 10036
									if (var27 != null && var27[var28] != null) { // L: 10037
										byte var22 = 0; // L: 10038
										if (var28 == 0) { // L: 10039
											var22 = 18;
										}

										if (var28 == 1) { // L: 10040
											var22 = 19;
										}

										if (var28 == 2) { // L: 10041
											var22 = 20;
										}

										if (var28 == 3) { // L: 10042
											var22 = 21;
										}

										if (var28 == 4) { // L: 10043
											var22 = 22;
										}

										Projectile.insertMenuItemNoShift(var27[var28], class166.colorStartTag(16748608) + var35.name, var22, var31.id, var12, var13); // L: 10044
									} else if (var28 == 2) { // L: 10047
										Projectile.insertMenuItemNoShift("Take", class166.colorStartTag(16748608) + var35.name, 20, var31.id, var12, var13); // L: 10048
									}
								}

								Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(16748608) + var35.name, 1004, var31.id, var12, var13); // L: 10052
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 10060
			var8 = class17.method236(var4); // L: 10061
			int var9 = ScriptEvent.method2085(var4); // L: 10062
			Player var10 = Client.players[Client.combatTargetPlayerIndex]; // L: 10063
			ApproximateRouteStrategy.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9); // L: 10064
		}

	} // L: 10066
}
