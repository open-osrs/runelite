import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1740090343
	)
	static int field377;
	@ObfuscatedName("gg")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -507222601
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILhw;Lhw;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "3638"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 490
			var1 /= 2;
		}

		if (var2 > 192) { // L: 491
			var1 /= 2;
		}

		if (var2 > 217) { // L: 492
			var1 /= 2;
		}

		if (var2 > 243) { // L: 493
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 494
		return var3; // L: 495
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "-242639541"
	)
	static final void method865(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 6876
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (class194.field2355 == var0) { // L: 6877
			byte var2 = var1.method5837(); // L: 6878
			var3 = var1.method5659(); // L: 6879
			byte var4 = var1.method5837(); // L: 6880
			var5 = var1.method5650(); // L: 6881
			var6 = (var5 >> 4 & 7) + GameShell.field466; // L: 6882
			var7 = (var5 & 7) + GrandExchangeEvents.field64; // L: 6883
			var8 = var1.method5659(); // L: 6884
			var9 = var1.readUnsignedShort(); // L: 6885
			var10 = var1.readUnsignedShort(); // L: 6886
			var11 = var1.method5619(); // L: 6887
			var12 = var11 >> 2; // L: 6888
			var13 = var11 & 3; // L: 6889
			var14 = Client.field954[var12]; // L: 6890
			byte var15 = var1.method5837(); // L: 6891
			byte var16 = var1.method5837(); // L: 6892
			Player var17;
			if (var9 == Client.localPlayerIndex) { // L: 6894
				var17 = PlayerType.localPlayer;
			} else {
				var17 = Client.players[var9]; // L: 6895
			}

			if (var17 != null) { // L: 6896
				ObjectDefinition var18 = ScriptEvent.getObjectDefinition(var10); // L: 6897
				int var19;
				int var20;
				if (var13 != 1 && var13 != 3) { // L: 6900
					var19 = var18.sizeX; // L: 6905
					var20 = var18.sizeY; // L: 6906
				} else {
					var19 = var18.sizeY; // L: 6901
					var20 = var18.sizeX; // L: 6902
				}

				int var21 = var6 + (var19 >> 1); // L: 6908
				int var22 = var6 + (var19 + 1 >> 1); // L: 6909
				int var23 = var7 + (var20 >> 1); // L: 6910
				int var24 = var7 + (var20 + 1 >> 1); // L: 6911
				int[][] var25 = Tiles.Tiles_heights[GrandExchangeOfferUnitPriceComparator.Client_plane]; // L: 6912
				int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2; // L: 6913
				int var27 = (var6 << 7) + (var19 << 6); // L: 6914
				int var28 = (var7 << 7) + (var20 << 6); // L: 6915
				Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28); // L: 6916
				if (var29 != null) { // L: 6917
					GrandExchangeOffer.updatePendingSpawn(GrandExchangeOfferUnitPriceComparator.Client_plane, var6, var7, var14, -1, 0, 0, var8 + 1, var3 + 1); // L: 6918
					var17.animationCycleStart = var8 + Client.cycle; // L: 6919
					var17.animationCycleEnd = var3 + Client.cycle; // L: 6920
					var17.model0 = var29; // L: 6921
					var17.field654 = var19 * 64 + var6 * 128; // L: 6922
					var17.field656 = var20 * 64 + var7 * 128; // L: 6923
					var17.tileHeight2 = var26; // L: 6924
					byte var30;
					if (var2 > var15) { // L: 6925
						var30 = var2; // L: 6926
						var2 = var15; // L: 6927
						var15 = var30; // L: 6928
					}

					if (var4 > var16) { // L: 6930
						var30 = var4; // L: 6931
						var4 = var16; // L: 6932
						var16 = var30; // L: 6933
					}

					var17.field646 = var6 + var2; // L: 6935
					var17.field660 = var6 + var15; // L: 6936
					var17.field669 = var7 + var4; // L: 6937
					var17.field661 = var16 + var7; // L: 6938
				}
			}
		}

		TileItem var33;
		int var37;
		int var38;
		if (class194.field2353 == var0) { // L: 6942
			var37 = var1.readUnsignedByte(); // L: 6943
			var3 = (var37 >> 4 & 7) + GameShell.field466; // L: 6944
			var38 = (var37 & 7) + GrandExchangeEvents.field64; // L: 6945
			var5 = var1.method5659(); // L: 6946
			var6 = var1.method5659(); // L: 6947
			if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) { // L: 6948
				var33 = new TileItem(); // L: 6949
				var33.id = var5; // L: 6950
				var33.quantity = var6; // L: 6951
				if (Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38] == null) { // L: 6952
					Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38] = new NodeDeque();
				}

				Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38].addFirst(var33); // L: 6953
				class41.updateItemPile(var3, var38); // L: 6954
			}

		} else if (class194.field2348 == var0) { // L: 6958
			var37 = var1.method5619(); // L: 6959
			var3 = (var37 >> 4 & 7) + GameShell.field466; // L: 6960
			var38 = (var37 & 7) + GrandExchangeEvents.field64; // L: 6961
			var5 = var1.method5619(); // L: 6962
			var6 = var5 >> 2; // L: 6963
			var7 = var5 & 3; // L: 6964
			var8 = Client.field954[var6]; // L: 6965
			var9 = var1.method5659(); // L: 6966
			if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) { // L: 6967
				GrandExchangeOffer.updatePendingSpawn(GrandExchangeOfferUnitPriceComparator.Client_plane, var3, var38, var8, var9, var6, var7, 0, -1); // L: 6968
			}

		} else if (class194.field2349 == var0) { // L: 6972
			var37 = var1.method5797(); // L: 6973
			var3 = var1.method5675(); // L: 6974
			var38 = var1.readUnsignedByte(); // L: 6975
			var5 = (var38 >> 4 & 7) + GameShell.field466; // L: 6976
			var6 = (var38 & 7) + GrandExchangeEvents.field64; // L: 6977
			var7 = var1.method5650(); // L: 6978
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 6979
				var5 = var5 * 128 + 64; // L: 6980
				var6 = var6 * 128 + 64; // L: 6981
				GraphicsObject var44 = new GraphicsObject(var3, GrandExchangeOfferUnitPriceComparator.Client_plane, var5, var6, GrandExchangeOfferWorldComparator.getTileHeight(var5, var6, GrandExchangeOfferUnitPriceComparator.Client_plane) - var7, var37, Client.cycle); // L: 6982
				Client.graphicsObjects.addFirst(var44); // L: 6983
			}

		} else if (class194.field2352 == var0) { // L: 6987
			var37 = var1.method5668(); // L: 6988
			var3 = var1.readUnsignedShort(); // L: 6989
			var38 = var1.method5668(); // L: 6990
			var5 = (var38 >> 4 & 7) + GameShell.field466; // L: 6991
			var6 = (var38 & 7) + GrandExchangeEvents.field64; // L: 6992
			byte var39 = var1.method5669(); // L: 6993
			byte var40 = var1.method5688(); // L: 6994
			var9 = var1.method5668() * 4; // L: 6995
			var10 = var1.method5650(); // L: 6996
			var11 = var1.readUnsignedShort(); // L: 6997
			var12 = var1.readUnsignedShort(); // L: 6998
			var13 = var1.method5679(); // L: 6999
			var14 = var1.method5619() * 4; // L: 7000
			var8 = var40 + var5; // L: 7001
			var7 = var39 + var6; // L: 7002
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var8 >= 0 && var7 >= 0 && var8 < 104 && var7 < 104 && var12 != 65535) { // L: 7003
				var5 = var5 * 128 + 64; // L: 7004
				var6 = var6 * 128 + 64; // L: 7005
				var8 = var8 * 128 + 64; // L: 7006
				var7 = var7 * 128 + 64; // L: 7007
				Projectile var36 = new Projectile(var12, GrandExchangeOfferUnitPriceComparator.Client_plane, var5, var6, GrandExchangeOfferWorldComparator.getTileHeight(var5, var6, GrandExchangeOfferUnitPriceComparator.Client_plane) - var14, var11 + Client.cycle, var3 + Client.cycle, var37, var10, var13, var9); // L: 7008
				var36.setDestination(var8, var7, GrandExchangeOfferWorldComparator.getTileHeight(var8, var7, GrandExchangeOfferUnitPriceComparator.Client_plane) - var9, var11 + Client.cycle); // L: 7009
				Client.projectiles.addFirst(var36); // L: 7010
			}

		} else if (class194.field2357 == var0) { // L: 7014
			var37 = var1.method5659(); // L: 7015
			var3 = var1.method5659(); // L: 7016
			var38 = var1.method5668(); // L: 7017
			var5 = (var38 >> 4 & 7) + GameShell.field466; // L: 7018
			var6 = (var38 & 7) + GrandExchangeEvents.field64; // L: 7019
			var7 = var1.method5797(); // L: 7020
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7021
				NodeDeque var34 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var5][var6]; // L: 7022
				if (var34 != null) { // L: 7023
					for (TileItem var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 7024 7025 7030
						if ((var37 & 32767) == var35.id && var7 == var35.quantity) { // L: 7026
							var35.quantity = var3; // L: 7027
							break;
						}
					}

					class41.updateItemPile(var5, var6); // L: 7032
				}
			}

		} else {
			if (class194.field2351 == var0) { // L: 7037
				var37 = var1.method5619(); // L: 7038
				var3 = var1.readUnsignedByte(); // L: 7039
				var38 = var3 >> 4 & 15; // L: 7040
				var5 = var3 & 7; // L: 7041
				var6 = var1.method5668(); // L: 7042
				var7 = (var6 >> 4 & 7) + GameShell.field466; // L: 7043
				var8 = (var6 & 7) + GrandExchangeEvents.field64; // L: 7044
				var9 = var1.method5659(); // L: 7045
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7046
					var10 = var38 + 1; // L: 7047
					if (PlayerType.localPlayer.pathX[0] >= var7 - var10 && PlayerType.localPlayer.pathX[0] <= var7 + var10 && PlayerType.localPlayer.pathY[0] >= var8 - var10 && PlayerType.localPlayer.pathY[0] <= var8 + var10 && Client.areaSoundEffectVolume != 0 && var5 > 0 && Client.soundEffectCount < 50) { // L: 7048 7049
						Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 7050
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5; // L: 7051
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var37; // L: 7052
						Client.soundEffects[Client.soundEffectCount] = null; // L: 7053
						Client.soundLocations[Client.soundEffectCount] = var38 + (var8 << 8) + (var7 << 16); // L: 7054
						++Client.soundEffectCount; // L: 7055
					}
				}
			}

			if (class194.field2356 == var0) { // L: 7060
				var37 = var1.method5650(); // L: 7061
				var3 = (var37 >> 4 & 7) + GameShell.field466; // L: 7062
				var38 = (var37 & 7) + GrandExchangeEvents.field64; // L: 7063
				var5 = var1.method5659(); // L: 7064
				if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) { // L: 7065
					NodeDeque var32 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38]; // L: 7066
					if (var32 != null) { // L: 7067
						for (var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) { // L: 7068 7069 7074
							if ((var5 & 32767) == var33.id) { // L: 7070
								var33.remove(); // L: 7071
								break;
							}
						}

						if (var32.last() == null) { // L: 7076
							Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var3][var38] = null;
						}

						class41.updateItemPile(var3, var38); // L: 7077
					}
				}

			} else if (class194.field2354 != var0) { // L: 7082
				if (class194.field2359 == var0) { // L: 7128
					var37 = var1.method5650(); // L: 7129
					var3 = (var37 >> 4 & 7) + GameShell.field466; // L: 7130
					var38 = (var37 & 7) + GrandExchangeEvents.field64; // L: 7131
					var5 = var1.method5650(); // L: 7132
					var6 = var5 >> 2; // L: 7133
					var7 = var5 & 3; // L: 7134
					var8 = Client.field954[var6]; // L: 7135
					if (var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) { // L: 7136
						GrandExchangeOffer.updatePendingSpawn(GrandExchangeOfferUnitPriceComparator.Client_plane, var3, var38, var8, -1, var6, var7, 0, -1); // L: 7137
					}

				}
			} else {
				var37 = var1.method5668(); // L: 7083
				var3 = var37 >> 2; // L: 7084
				var38 = var37 & 3; // L: 7085
				var5 = Client.field954[var3]; // L: 7086
				var6 = var1.method5675(); // L: 7087
				var7 = var1.method5619(); // L: 7088
				var8 = (var7 >> 4 & 7) + GameShell.field466; // L: 7089
				var9 = (var7 & 7) + GrandExchangeEvents.field64; // L: 7090
				if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 7091
					if (var5 == 0) { // L: 7092
						BoundaryObject var31 = ModeWhere.scene.method3277(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9); // L: 7093
						if (var31 != null) { // L: 7094
							var11 = ObjectSound.Entity_unpackID(var31.tag); // L: 7095
							if (var3 == 2) { // L: 7096
								var31.entity1 = new DynamicObject(var11, 2, var38 + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var31.entity1); // L: 7097
								var31.entity2 = new DynamicObject(var11, 2, var38 + 1 & 3, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var31.entity2); // L: 7098
							} else {
								var31.entity1 = new DynamicObject(var11, var3, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var31.entity1); // L: 7100
							}
						}
					}

					if (var5 == 1) { // L: 7103
						WallDecoration var41 = ModeWhere.scene.method3276(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9); // L: 7104
						if (var41 != null) { // L: 7105
							var11 = ObjectSound.Entity_unpackID(var41.tag); // L: 7106
							if (var3 != 4 && var3 != 5) { // L: 7107
								if (var3 == 6) { // L: 7108
									var41.entity1 = new DynamicObject(var11, 4, var38 + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var41.entity1);
								} else if (var3 == 7) { // L: 7109
									var41.entity1 = new DynamicObject(var11, 4, (var38 + 2 & 3) + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var41.entity1);
								} else if (var3 == 8) { // L: 7110
									var41.entity1 = new DynamicObject(var11, 4, var38 + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var41.entity1); // L: 7111
									var41.entity2 = new DynamicObject(var11, 4, (var38 + 2 & 3) + 4, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var41.entity2); // L: 7112
								}
							} else {
								var41.entity1 = new DynamicObject(var11, 4, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var41.entity1);
							}
						}
					}

					if (var5 == 2) { // L: 7116
						GameObject var42 = ModeWhere.scene.method3241(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9); // L: 7117
						if (var3 == 11) { // L: 7118
							var3 = 10;
						}

						if (var42 != null) { // L: 7119
							var42.entity = new DynamicObject(ObjectSound.Entity_unpackID(var42.tag), var3, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var42.entity);
						}
					}

					if (var5 == 3) { // L: 7121
						FloorDecoration var43 = ModeWhere.scene.getFloorDecoration(GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9); // L: 7122
						if (var43 != null) { // L: 7123
							var43.entity = new DynamicObject(ObjectSound.Entity_unpackID(var43.tag), 22, var38, GrandExchangeOfferUnitPriceComparator.Client_plane, var8, var9, var6, false, var43.entity);
						}
					}
				}

			}
		}
	} // L: 6956 6970 6985 7012 7035 7080 7126 7139 7141
}
