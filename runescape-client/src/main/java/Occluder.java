import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1667496443
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1607339701
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1327290645
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1032573123
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1960990691
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1746160959
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1167261617
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1218503837
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1421337339
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2056353609
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 621909479
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 880103251
	)
	int field2510;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1489264085
	)
	int field2507;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2075749697
	)
	int field2508;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1502323289
	)
	int field2509;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1403810903
	)
	int field2495;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -340736711
	)
	int field2506;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1370877385
	)
	int field2511;

	Occluder() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "0"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100168808"
	)
	public static void method4221() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 107
			if (ArchiveDiskActionHandler.field3998 != 0) { // L: 108
				ArchiveDiskActionHandler.field3998 = 1; // L: 109

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 111
				} catch (InterruptedException var3) { // L: 113
				}
			}

		}
	} // L: 116

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1785001872"
	)
	public static int method4220(int var0) {
		return class402.field4445[var0 & 16383]; // L: 37
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V",
		garbageValue = "791986228"
	)
	static final void method4222(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7547
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class263.field3064 == var0) { // L: 7548
			var2 = var1.readUnsignedShort(); // L: 7549
			var3 = var1.readUnsignedByte(); // L: 7550
			var4 = (var3 >> 4 & 7) + class145.field1690; // L: 7551
			var5 = (var3 & 7) + class321.field4076; // L: 7552
			var6 = var1.method7545(); // L: 7553
			var7 = var6 >> 4 & 15; // L: 7554
			var8 = var6 & 7; // L: 7555
			var9 = var1.method7593(); // L: 7556
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7557
				var10 = var7 + 1; // L: 7558
				if (ModelData0.localPlayer.pathX[0] >= var4 - var10 && ModelData0.localPlayer.pathX[0] <= var10 + var4 && ModelData0.localPlayer.pathY[0] >= var5 - var10 && ModelData0.localPlayer.pathY[0] <= var10 + var5 && class12.clientPreferences.method2239() != 0 && var8 > 0 && Client.soundEffectCount < 50) { // L: 7559 7560
					Client.soundEffectIds[Client.soundEffectCount] = var2; // L: 7561
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 7562
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9; // L: 7563
					Client.soundEffects[Client.soundEffectCount] = null; // L: 7564
					Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16); // L: 7565
					++Client.soundEffectCount; // L: 7566
				}
			}
		}

		TileItem var35;
		if (class263.field3066 == var0) { // L: 7571
			var2 = var1.method7593(); // L: 7572
			var3 = (var2 >> 4 & 7) + class145.field1690; // L: 7573
			var4 = (var2 & 7) + class321.field4076; // L: 7574
			var5 = var1.method7554(); // L: 7575
			var6 = var1.method7716(); // L: 7576
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7577
				var35 = new TileItem(); // L: 7578
				var35.id = var6; // L: 7579
				var35.quantity = var5; // L: 7580
				if (Client.groundItems[class128.Client_plane][var3][var4] == null) { // L: 7581
					Client.groundItems[class128.Client_plane][var3][var4] = new NodeDeque();
				}

				Client.groundItems[class128.Client_plane][var3][var4].addFirst(var35); // L: 7582
				Frames.updateItemPile(var3, var4); // L: 7583
			}

		} else if (class263.field3068 == var0) { // L: 7587
			var2 = var1.readUnsignedShort(); // L: 7588
			var3 = var1.method7593(); // L: 7589
			var4 = var3 >> 2; // L: 7590
			var5 = var3 & 3; // L: 7591
			var6 = Client.field553[var4]; // L: 7592
			var7 = var1.readUnsignedByte(); // L: 7593
			var8 = (var7 >> 4 & 7) + class145.field1690; // L: 7594
			var9 = (var7 & 7) + class321.field4076; // L: 7595
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7596
				class221.updatePendingSpawn(class128.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1); // L: 7597
			}

		} else if (class263.field3058 == var0) { // L: 7601
			var2 = var1.method7545(); // L: 7602
			var3 = (var2 >> 4 & 7) + class145.field1690; // L: 7603
			var4 = (var2 & 7) + class321.field4076; // L: 7604
			var5 = var1.readUnsignedShort(); // L: 7605
			var6 = var1.method7576(); // L: 7606
			var7 = var1.method7576(); // L: 7607
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7608
				NodeDeque var43 = Client.groundItems[class128.Client_plane][var3][var4]; // L: 7609
				if (var43 != null) { // L: 7610
					for (TileItem var36 = (TileItem)var43.last(); var36 != null; var36 = (TileItem)var43.previous()) { // L: 7611 7612 7617
						if ((var7 & 32767) == var36.id && var6 == var36.quantity) { // L: 7613
							var36.quantity = var5; // L: 7614
							break;
						}
					}

					Frames.updateItemPile(var3, var4); // L: 7619
				}
			}

		} else if (class263.field3063 == var0) { // L: 7624
			var2 = var1.method7716(); // L: 7625
			var3 = var1.method7545(); // L: 7626
			var4 = (var3 >> 4 & 7) + class145.field1690; // L: 7627
			var5 = (var3 & 7) + class321.field4076; // L: 7628
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7629
				NodeDeque var34 = Client.groundItems[class128.Client_plane][var4][var5]; // L: 7630
				if (var34 != null) { // L: 7631
					for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 7632 7633 7638
						if ((var2 & 32767) == var35.id) { // L: 7634
							var35.remove(); // L: 7635
							break;
						}
					}

					if (var34.last() == null) { // L: 7640
						Client.groundItems[class128.Client_plane][var4][var5] = null;
					}

					Frames.updateItemPile(var4, var5); // L: 7641
				}
			}

		} else if (class263.field3059 == var0) { // L: 7646
			var2 = var1.method7545(); // L: 7647
			var3 = (var2 >> 4 & 7) + class145.field1690; // L: 7648
			var4 = (var2 & 7) + class321.field4076; // L: 7649
			var5 = var1.method7593(); // L: 7650
			var6 = var5 >> 2; // L: 7651
			var7 = var5 & 3; // L: 7652
			var8 = Client.field553[var6]; // L: 7653
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7654
				class221.updatePendingSpawn(class128.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1); // L: 7655
			}

		} else if (class263.field3071 == var0) { // L: 7659
			var2 = var1.method7546(); // L: 7660
			var3 = (var2 >> 4 & 7) + class145.field1690; // L: 7661
			var4 = (var2 & 7) + class321.field4076; // L: 7662
			var5 = var1.method7545(); // L: 7663
			var6 = var1.method7716(); // L: 7664
			var7 = var1.method7716(); // L: 7665
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7666
				var3 = var3 * 128 + 64; // L: 7667
				var4 = var4 * 128 + 64; // L: 7668
				GraphicsObject var33 = new GraphicsObject(var7, class128.Client_plane, var3, var4, class202.getTileHeight(var3, var4, class128.Client_plane) - var5, var6, Client.cycle); // L: 7669
				Client.graphicsObjects.addFirst(var33); // L: 7670
			}

		} else {
			int var11;
			int var12;
			int var13;
			int var14;
			byte var37;
			if (class263.field3060 == var0) { // L: 7674
				var2 = var1.method7556(); // L: 7675
				var3 = var1.method7716(); // L: 7676
				var37 = var1.method7549(); // L: 7677
				var5 = var1.method7545(); // L: 7678
				var6 = (var5 >> 4 & 7) + class145.field1690; // L: 7679
				var7 = (var5 & 7) + class321.field4076; // L: 7680
				var8 = var1.method7576(); // L: 7681
				var9 = var1.readUnsignedShort(); // L: 7682
				var10 = var1.readUnsignedByte() * 4; // L: 7683
				var11 = var1.method7546(); // L: 7684
				var12 = var1.method7545() * 4; // L: 7685
				var13 = var1.method7546(); // L: 7686
				byte var39 = var1.method7549(); // L: 7687
				var14 = var39 + var6; // L: 7688
				var4 = var37 + var7; // L: 7689
				if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var14 >= 0 && var4 >= 0 && var14 < 104 && var4 < 104 && var3 != 65535) { // L: 7690
					var6 = var6 * 128 + 64; // L: 7691
					var7 = var7 * 128 + 64; // L: 7692
					var14 = var14 * 128 + 64; // L: 7693
					var4 = var4 * 128 + 64; // L: 7694
					Projectile var32 = new Projectile(var3, class128.Client_plane, var6, var7, class202.getTileHeight(var6, var7, class128.Client_plane) - var12, var8 + Client.cycle, var9 + Client.cycle, var13, var11, var2, var10); // L: 7695
					var32.setDestination(var14, var4, class202.getTileHeight(var14, var4, class128.Client_plane) - var10, var8 + Client.cycle); // L: 7696
					Client.projectiles.addFirst(var32); // L: 7697
				}

			} else {
				if (class263.field3062 == var0) { // L: 7701
					var2 = var1.method7554(); // L: 7702
					var3 = var1.method7716(); // L: 7703
					var37 = var1.method7547(); // L: 7704
					var5 = var1.method7546(); // L: 7705
					var6 = (var5 >> 4 & 7) + class145.field1690; // L: 7706
					var7 = (var5 & 7) + class321.field4076; // L: 7707
					var8 = var1.method7554(); // L: 7708
					var9 = var1.readUnsignedShort(); // L: 7709
					byte var38 = var1.method7547(); // L: 7710
					var11 = var1.readUnsignedByte(); // L: 7711
					var12 = var11 >> 2; // L: 7712
					var13 = var11 & 3; // L: 7713
					var14 = Client.field553[var12]; // L: 7714
					byte var15 = var1.method7547(); // L: 7715
					byte var16 = var1.method7547(); // L: 7716
					Player var17;
					if (var2 == Client.localPlayerIndex) { // L: 7718
						var17 = ModelData0.localPlayer;
					} else {
						var17 = Client.players[var2]; // L: 7719
					}

					if (var17 != null) { // L: 7720
						ObjectComposition var18 = class82.getObjectDefinition(var3); // L: 7721
						int var19;
						int var20;
						if (var13 != 1 && var13 != 3) { // L: 7724
							var19 = var18.sizeX; // L: 7729
							var20 = var18.sizeY; // L: 7730
						} else {
							var19 = var18.sizeY; // L: 7725
							var20 = var18.sizeX; // L: 7726
						}

						int var21 = var6 + (var19 >> 1); // L: 7732
						int var22 = var6 + (var19 + 1 >> 1); // L: 7733
						int var23 = var7 + (var20 >> 1); // L: 7734
						int var24 = var7 + (var20 + 1 >> 1); // L: 7735
						int[][] var25 = Tiles.Tiles_heights[class128.Client_plane]; // L: 7736
						int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2; // L: 7737
						int var27 = (var6 << 7) + (var19 << 6); // L: 7738
						int var28 = (var7 << 7) + (var20 << 6); // L: 7739
						Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28); // L: 7740
						if (var29 != null) { // L: 7741
							class221.updatePendingSpawn(class128.Client_plane, var6, var7, var14, -1, 0, 0, var9 + 1, var8 + 1); // L: 7742
							var17.animationCycleStart = var9 + Client.cycle; // L: 7743
							var17.animationCycleEnd = var8 + Client.cycle; // L: 7744
							var17.model0 = var29; // L: 7745
							var17.field1104 = var19 * 64 + var6 * 128; // L: 7746
							var17.field1106 = var20 * 64 + var7 * 128; // L: 7747
							var17.tileHeight2 = var26; // L: 7748
							byte var30;
							if (var38 > var16) { // L: 7749
								var30 = var38; // L: 7750
								var38 = var16; // L: 7751
								var16 = var30; // L: 7752
							}

							if (var37 > var15) { // L: 7754
								var30 = var37; // L: 7755
								var37 = var15; // L: 7756
								var15 = var30; // L: 7757
							}

							var17.minX = var6 + var38; // L: 7759
							var17.maxX = var16 + var6; // L: 7760
							var17.minY = var37 + var7; // L: 7761
							var17.maxY = var7 + var15; // L: 7762
						}
					}
				}

				if (class263.field3067 == var0) { // L: 7766
					var2 = var1.method7593(); // L: 7767
					var3 = var2 >> 2; // L: 7768
					var4 = var2 & 3; // L: 7769
					var5 = Client.field553[var3]; // L: 7770
					var6 = var1.method7546(); // L: 7771
					var7 = (var6 >> 4 & 7) + class145.field1690; // L: 7772
					var8 = (var6 & 7) + class321.field4076; // L: 7773
					var9 = var1.method7554(); // L: 7774
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7775
						if (var5 == 0) { // L: 7776
							BoundaryObject var31 = class175.scene.method4147(class128.Client_plane, var7, var8); // L: 7777
							if (var31 != null) { // L: 7778
								var11 = NetSocket.Entity_unpackID(var31.tag); // L: 7779
								if (var3 == 2) { // L: 7780
									var31.renderable1 = new DynamicObject(var11, 2, var4 + 4, class128.Client_plane, var7, var8, var9, false, var31.renderable1); // L: 7781
									var31.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, class128.Client_plane, var7, var8, var9, false, var31.renderable2); // L: 7782
								} else {
									var31.renderable1 = new DynamicObject(var11, var3, var4, class128.Client_plane, var7, var8, var9, false, var31.renderable1); // L: 7784
								}
							}
						}

						if (var5 == 1) { // L: 7787
							WallDecoration var40 = class175.scene.method4049(class128.Client_plane, var7, var8); // L: 7788
							if (var40 != null) { // L: 7789
								var11 = NetSocket.Entity_unpackID(var40.tag); // L: 7790
								if (var3 != 4 && var3 != 5) { // L: 7791
									if (var3 == 6) { // L: 7792
										var40.renderable1 = new DynamicObject(var11, 4, var4 + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable1);
									} else if (var3 == 7) { // L: 7793
										var40.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable1);
									} else if (var3 == 8) { // L: 7794
										var40.renderable1 = new DynamicObject(var11, 4, var4 + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable1); // L: 7795
										var40.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class128.Client_plane, var7, var8, var9, false, var40.renderable2); // L: 7796
									}
								} else {
									var40.renderable1 = new DynamicObject(var11, 4, var4, class128.Client_plane, var7, var8, var9, false, var40.renderable1);
								}
							}
						}

						if (var5 == 2) { // L: 7800
							GameObject var41 = class175.scene.getGameObject(class128.Client_plane, var7, var8); // L: 7801
							if (var3 == 11) { // L: 7802
								var3 = 10;
							}

							if (var41 != null) { // L: 7803
								var41.renderable = new DynamicObject(NetSocket.Entity_unpackID(var41.tag), var3, var4, class128.Client_plane, var7, var8, var9, false, var41.renderable);
							}
						}

						if (var5 == 3) { // L: 7805
							FloorDecoration var42 = class175.scene.getFloorDecoration(class128.Client_plane, var7, var8); // L: 7806
							if (var42 != null) { // L: 7807
								var42.renderable = new DynamicObject(NetSocket.Entity_unpackID(var42.tag), 22, var4, class128.Client_plane, var7, var8, var9, false, var42.renderable);
							}
						}
					}

				}
			}
		}
	} // L: 7585 7599 7622 7644 7657 7672 7699 7810 7812
}
