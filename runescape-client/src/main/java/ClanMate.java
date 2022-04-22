import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "131518086"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1955315992"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) { // L: 16
			this.fillIsFriend(); // L: 17
		}

		return this.friend == TriBool.TriBool_true; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1874980316"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = Decimator.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-23167"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) { // L: 31
			this.fillIsIgnored(); // L: 32
		}

		return this.ignored == TriBool.TriBool_true; // L: 34
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "374210417"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = Decimator.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "1119895393"
	)
	static final void method6700(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7425
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class263.field3012 == var0) { // L: 7426
			var2 = var1.method7742(); // L: 7427
			var3 = (var2 >> 4 & 7) + PlayerComposition.field3307; // L: 7428
			var4 = (var2 & 7) + class29.field181; // L: 7429
			var5 = var1.readUnsignedByte(); // L: 7430
			var6 = var5 >> 2; // L: 7431
			var7 = var5 & 3; // L: 7432
			var8 = Client.field748[var6]; // L: 7433
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7434
				GrandExchangeOfferWorldComparator.updatePendingSpawn(class18.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1); // L: 7435
			}

		} else {
			int var9;
			int var10;
			if (class263.field3006 == var0) { // L: 7439
				var2 = var1.method7742(); // L: 7440
				var3 = var1.method7875(); // L: 7441
				var4 = (var3 >> 4 & 7) + PlayerComposition.field3307; // L: 7442
				var5 = (var3 & 7) + class29.field181; // L: 7443
				var6 = var1.method7742(); // L: 7444
				var7 = var6 >> 4 & 15; // L: 7445
				var8 = var6 & 7; // L: 7446
				var9 = var1.method7713(); // L: 7447
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7448
					var10 = var7 + 1; // L: 7449
					if (GrandExchangeEvents.localPlayer.pathX[0] >= var4 - var10 && GrandExchangeEvents.localPlayer.pathX[0] <= var10 + var4 && GrandExchangeEvents.localPlayer.pathY[0] >= var5 - var10 && GrandExchangeEvents.localPlayer.pathY[0] <= var10 + var5 && class131.clientPreferences.method2270() != 0 && var8 > 0 && Client.soundEffectCount < 50) { // L: 7450 7451
						Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 7452
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 7453
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 7454
						Client.soundEffects[Client.soundEffectCount] = null; // L: 7455
						Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16); // L: 7456
						++Client.soundEffectCount; // L: 7457
					}
				}
			}

			TileItem var31;
			if (class263.field3009 == var0) { // L: 7462
				var2 = var1.method7875(); // L: 7463
				var3 = (var2 >> 4 & 7) + PlayerComposition.field3307; // L: 7464
				var4 = (var2 & 7) + class29.field181; // L: 7465
				var5 = var1.method7714(); // L: 7466
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7467
					NodeDeque var36 = Client.groundItems[class18.Client_plane][var3][var4]; // L: 7468
					if (var36 != null) { // L: 7469
						for (var31 = (TileItem)var36.last(); var31 != null; var31 = (TileItem)var36.previous()) { // L: 7470 7471 7476
							if ((var5 & 32767) == var31.id) { // L: 7472
								var31.remove(); // L: 7473
								break;
							}
						}

						if (var36.last() == null) { // L: 7478
							Client.groundItems[class18.Client_plane][var3][var4] = null;
						}

						UserComparator3.updateItemPile(var3, var4); // L: 7479
					}
				}

			} else {
				int var11;
				int var12;
				int var13;
				int var14;
				if (class263.field3004 == var0) { // L: 7484
					byte var37 = var1.readByte(); // L: 7485
					var3 = var1.readUnsignedShort(); // L: 7486
					byte var38 = var1.method7707(); // L: 7487
					byte var39 = var1.readByte(); // L: 7488
					var6 = var1.method7715(); // L: 7489
					byte var40 = var1.method7707(); // L: 7490
					var8 = var1.method7714(); // L: 7491
					var9 = var1.method7773(); // L: 7492
					var10 = var9 >> 2; // L: 7493
					var11 = var9 & 3; // L: 7494
					var12 = Client.field748[var10]; // L: 7495
					var13 = var1.method7773(); // L: 7496
					var14 = (var13 >> 4 & 7) + PlayerComposition.field3307; // L: 7497
					int var15 = (var13 & 7) + class29.field181; // L: 7498
					int var16 = var1.method7714(); // L: 7499
					Player var17;
					if (var3 == Client.localPlayerIndex) { // L: 7501
						var17 = GrandExchangeEvents.localPlayer;
					} else {
						var17 = Client.players[var3]; // L: 7502
					}

					if (var17 != null) { // L: 7503
						ObjectComposition var18 = class146.getObjectDefinition(var8); // L: 7504
						int var19;
						int var20;
						if (var11 != 1 && var11 != 3) { // L: 7507
							var19 = var18.sizeX; // L: 7512
							var20 = var18.sizeY; // L: 7513
						} else {
							var19 = var18.sizeY; // L: 7508
							var20 = var18.sizeX; // L: 7509
						}

						int var21 = var14 + (var19 >> 1); // L: 7515
						int var22 = var14 + (var19 + 1 >> 1); // L: 7516
						int var23 = var15 + (var20 >> 1); // L: 7517
						int var24 = var15 + (var20 + 1 >> 1); // L: 7518
						int[][] var25 = Tiles.Tiles_heights[class18.Client_plane]; // L: 7519
						int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2; // L: 7520
						int var27 = (var14 << 7) + (var19 << 6); // L: 7521
						int var28 = (var15 << 7) + (var20 << 6); // L: 7522
						Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28); // L: 7523
						if (var29 != null) { // L: 7524
							GrandExchangeOfferWorldComparator.updatePendingSpawn(class18.Client_plane, var14, var15, var12, -1, 0, 0, var16 + 1, var6 + 1); // L: 7525
							var17.animationCycleStart = var16 + Client.cycle; // L: 7526
							var17.animationCycleEnd = var6 + Client.cycle; // L: 7527
							var17.model0 = var29; // L: 7528
							var17.field1080 = var19 * 64 + var14 * 128; // L: 7529
							var17.field1082 = var20 * 64 + var15 * 128; // L: 7530
							var17.tileHeight2 = var26; // L: 7531
							byte var30;
							if (var38 > var40) { // L: 7532
								var30 = var38; // L: 7533
								var38 = var40; // L: 7534
								var40 = var30; // L: 7535
							}

							if (var39 > var37) { // L: 7537
								var30 = var39; // L: 7538
								var39 = var37; // L: 7539
								var37 = var30; // L: 7540
							}

							var17.minX = var38 + var14; // L: 7542
							var17.maxX = var14 + var40; // L: 7543
							var17.minY = var15 + var39; // L: 7544
							var17.maxY = var37 + var15; // L: 7545
						}
					}
				}

				if (class263.field3007 == var0) { // L: 7549
					var2 = var1.readUnsignedShort(); // L: 7550
					var3 = var1.readUnsignedByte(); // L: 7551
					var4 = (var3 >> 4 & 7) + PlayerComposition.field3307; // L: 7552
					var5 = (var3 & 7) + class29.field181; // L: 7553
					var6 = var1.method7713(); // L: 7554
					var7 = var1.method7713(); // L: 7555
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7556
						NodeDeque var46 = Client.groundItems[class18.Client_plane][var4][var5]; // L: 7557
						if (var46 != null) { // L: 7558
							for (TileItem var35 = (TileItem)var46.last(); var35 != null; var35 = (TileItem)var46.previous()) { // L: 7559 7560 7565
								if ((var2 & 32767) == var35.id && var6 == var35.quantity) { // L: 7561
									var35.quantity = var7; // L: 7562
									break;
								}
							}

							UserComparator3.updateItemPile(var4, var5); // L: 7567
						}
					}

				} else if (class263.field3015 == var0) { // L: 7572
					var2 = var1.method7773(); // L: 7573
					var3 = var1.readUnsignedShort(); // L: 7574
					var4 = var1.method7715(); // L: 7575
					var5 = var1.method7875(); // L: 7576
					var6 = (var5 >> 4 & 7) + PlayerComposition.field3307; // L: 7577
					var7 = (var5 & 7) + class29.field181; // L: 7578
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7579
						var6 = var6 * 128 + 64; // L: 7580
						var7 = var7 * 128 + 64; // L: 7581
						GraphicsObject var34 = new GraphicsObject(var3, class18.Client_plane, var6, var7, WorldMapLabel.getTileHeight(var6, var7, class18.Client_plane) - var2, var4, Client.cycle); // L: 7582
						Client.graphicsObjects.addFirst(var34); // L: 7583
					}

				} else if (class263.field3013 == var0) { // L: 7587
					var2 = var1.method7742(); // L: 7588
					var3 = (var2 >> 4 & 7) + PlayerComposition.field3307; // L: 7589
					var4 = (var2 & 7) + class29.field181; // L: 7590
					var5 = var1.method7742(); // L: 7591
					var6 = var5 >> 2; // L: 7592
					var7 = var5 & 3; // L: 7593
					var8 = Client.field748[var6]; // L: 7594
					var9 = var1.method7714(); // L: 7595
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7596
						GrandExchangeOfferWorldComparator.updatePendingSpawn(class18.Client_plane, var3, var4, var8, var9, var6, var7, 0, -1); // L: 7597
					}

				} else if (class263.field3011 == var0) { // L: 7601
					var2 = var1.method7875() * 4; // L: 7602
					var3 = var1.method7714(); // L: 7603
					var4 = var1.method7717(); // L: 7604
					var5 = var1.method7773(); // L: 7605
					var6 = (var5 >> 4 & 7) + PlayerComposition.field3307; // L: 7606
					var7 = (var5 & 7) + class29.field181; // L: 7607
					var8 = var1.method7714(); // L: 7608
					byte var41 = var1.method7708(); // L: 7609
					var10 = var1.method7742(); // L: 7610
					byte var42 = var1.method7885(); // L: 7611
					var12 = var1.readUnsignedByte() * 4; // L: 7612
					var13 = var1.method7773(); // L: 7613
					var14 = var1.method7714(); // L: 7614
					var9 = var41 + var6; // L: 7615
					var11 = var42 + var7; // L: 7616
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 >= 0 && var11 >= 0 && var9 < 104 && var11 < 104 && var14 != 65535) { // L: 7617
						var6 = var6 * 128 + 64; // L: 7618
						var7 = var7 * 128 + 64; // L: 7619
						var9 = var9 * 128 + 64; // L: 7620
						var11 = var11 * 128 + 64; // L: 7621
						Projectile var33 = new Projectile(var14, class18.Client_plane, var6, var7, WorldMapLabel.getTileHeight(var6, var7, class18.Client_plane) - var2, var3 + Client.cycle, var8 + Client.cycle, var10, var13, var4, var12); // L: 7622
						var33.setDestination(var9, var11, WorldMapLabel.getTileHeight(var9, var11, class18.Client_plane) - var12, var3 + Client.cycle); // L: 7623
						Client.projectiles.addFirst(var33); // L: 7624
					}

				} else if (class263.field3005 != var0) { // L: 7628
					if (class263.field3008 == var0) { // L: 7674
						var2 = var1.method7714(); // L: 7675
						var3 = var1.readUnsignedByte(); // L: 7676
						var4 = (var3 >> 4 & 7) + PlayerComposition.field3307; // L: 7677
						var5 = (var3 & 7) + class29.field181; // L: 7678
						var6 = var1.method7714(); // L: 7679
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7680
							var31 = new TileItem(); // L: 7681
							var31.id = var2; // L: 7682
							var31.quantity = var6; // L: 7683
							if (Client.groundItems[class18.Client_plane][var4][var5] == null) { // L: 7684
								Client.groundItems[class18.Client_plane][var4][var5] = new NodeDeque();
							}

							Client.groundItems[class18.Client_plane][var4][var5].addFirst(var31); // L: 7685
							UserComparator3.updateItemPile(var4, var5); // L: 7686
						}

					}
				} else {
					var2 = var1.method7714(); // L: 7629
					var3 = var1.method7773(); // L: 7630
					var4 = var3 >> 2; // L: 7631
					var5 = var3 & 3; // L: 7632
					var6 = Client.field748[var4]; // L: 7633
					var7 = var1.method7875(); // L: 7634
					var8 = (var7 >> 4 & 7) + PlayerComposition.field3307; // L: 7635
					var9 = (var7 & 7) + class29.field181; // L: 7636
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 7637
						if (var6 == 0) { // L: 7638
							BoundaryObject var32 = ArchiveLoader.scene.method4754(class18.Client_plane, var8, var9); // L: 7639
							if (var32 != null) { // L: 7640
								var11 = FileSystem.Entity_unpackID(var32.tag); // L: 7641
								if (var4 == 2) { // L: 7642
									var32.renderable1 = new DynamicObject(var11, 2, var5 + 4, class18.Client_plane, var8, var9, var2, false, var32.renderable1); // L: 7643
									var32.renderable2 = new DynamicObject(var11, 2, var5 + 1 & 3, class18.Client_plane, var8, var9, var2, false, var32.renderable2); // L: 7644
								} else {
									var32.renderable1 = new DynamicObject(var11, var4, var5, class18.Client_plane, var8, var9, var2, false, var32.renderable1); // L: 7646
								}
							}
						}

						if (var6 == 1) { // L: 7649
							WallDecoration var43 = ArchiveLoader.scene.method4860(class18.Client_plane, var8, var9); // L: 7650
							if (var43 != null) { // L: 7651
								var11 = FileSystem.Entity_unpackID(var43.tag); // L: 7652
								if (var4 != 4 && var4 != 5) { // L: 7653
									if (var4 == 6) { // L: 7654
										var43.renderable1 = new DynamicObject(var11, 4, var5 + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable1);
									} else if (var4 == 7) { // L: 7655
										var43.renderable1 = new DynamicObject(var11, 4, (var5 + 2 & 3) + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable1);
									} else if (var4 == 8) { // L: 7656
										var43.renderable1 = new DynamicObject(var11, 4, var5 + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable1); // L: 7657
										var43.renderable2 = new DynamicObject(var11, 4, (var5 + 2 & 3) + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable2); // L: 7658
									}
								} else {
									var43.renderable1 = new DynamicObject(var11, 4, var5, class18.Client_plane, var8, var9, var2, false, var43.renderable1);
								}
							}
						}

						if (var6 == 2) { // L: 7662
							GameObject var44 = ArchiveLoader.scene.getGameObject(class18.Client_plane, var8, var9); // L: 7663
							if (var4 == 11) { // L: 7664
								var4 = 10;
							}

							if (var44 != null) { // L: 7665
								var44.renderable = new DynamicObject(FileSystem.Entity_unpackID(var44.tag), var4, var5, class18.Client_plane, var8, var9, var2, false, var44.renderable);
							}
						}

						if (var6 == 3) { // L: 7667
							FloorDecoration var45 = ArchiveLoader.scene.getFloorDecoration(class18.Client_plane, var8, var9); // L: 7668
							if (var45 != null) { // L: 7669
								var45.renderable = new DynamicObject(FileSystem.Entity_unpackID(var45.tag), 22, var5, class18.Client_plane, var8, var9, var2, false, var45.renderable);
							}
						}
					}

				}
			}
		}
	} // L: 7437 7482 7570 7585 7599 7626 7672 7688 7690

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "83"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9854
			class21.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9855
		}

		long var4 = -1L; // L: 9858
		long var6 = -1L; // L: 9859

		int var8;
		for (var8 = 0; var8 < StructComposition.method3618(); ++var8) { // L: 9860
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9863
			if (var25 != var6) { // L: 9866
				var6 = var25; // L: 9867
				int var13 = World.method1673(var8); // L: 9868
				long var16 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9872
				int var15 = (int)(var16 >>> 7 & 127L); // L: 9874
				var15 = var15; // L: 9878
				int var29 = FloorDecoration.method4592(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9881
				int var18 = Frames.method4934(var8); // L: 9884
				if (var29 == 2 && ArchiveLoader.scene.getObjectFlags(class18.Client_plane, var13, var15, var25) >= 0) { // L: 9885 9886
					ObjectComposition var19 = class146.getObjectDefinition(var18); // L: 9887
					if (var19.transforms != null) { // L: 9888
						var19 = var19.transform();
					}

					if (var19 == null) { // L: 9889
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9890
						class21.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator9.colorStartTag(65535) + var19.name, 1, var18, var13, var15); // L: 9891
					} else if (Client.isSpellSelected) { // L: 9894
						if ((class17.selectedSpellFlags & 4) == 4) { // L: 9895
							class21.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator9.colorStartTag(65535) + var19.name, 2, var18, var13, var15); // L: 9896
						}
					} else {
						String[] var20 = var19.actions; // L: 9901
						if (var20 != null) { // L: 9902
							for (int var21 = 4; var21 >= 0; --var21) { // L: 9903
								if (var20[var21] != null) { // L: 9904
									short var22 = 0; // L: 9905
									if (var21 == 0) { // L: 9906
										var22 = 3;
									}

									if (var21 == 1) { // L: 9907
										var22 = 4;
									}

									if (var21 == 2) { // L: 9908
										var22 = 5;
									}

									if (var21 == 3) { // L: 9909
										var22 = 6;
									}

									if (var21 == 4) { // L: 9910
										var22 = 1001;
									}

									class21.insertMenuItemNoShift(var20[var21], UserComparator9.colorStartTag(65535) + var19.name, var22, var18, var13, var15); // L: 9911
								}
							}
						}

						class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(65535) + var19.name, 1002, var19.id, var13, var15); // L: 9916
					}
				}

				Player var23;
				int var30;
				NPC var31;
				int var38;
				int[] var39;
				if (var29 == 1) { // L: 9921
					NPC var34 = Client.npcs[var18]; // L: 9922
					if (var34 == null) { // L: 9923
						continue;
					}

					if (var34.definition.size == 1 && (var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 9924
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 9925
							var31 = Client.npcs[Client.npcIndices[var30]]; // L: 9926
							if (var31 != null && var31 != var34 && var31.definition.size == 1 && var31.x == var34.x && var31.y == var34.y) { // L: 9927
								class12.addNpcToMenu(var31, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count; // L: 9929
						var39 = Players.Players_indices; // L: 9930

						for (var38 = 0; var38 < var30; ++var38) { // L: 9931
							var23 = Client.players[var39[var38]]; // L: 9932
							if (var23 != null && var23.x == var34.x && var34.y == var23.y) { // L: 9933
								class20.addPlayerToMenu(var23, var39[var38], var13, var15);
							}
						}
					}

					class12.addNpcToMenu(var34, var18, var13, var15); // L: 9936
				}

				if (var29 == 0) { // L: 9938
					Player var35 = Client.players[var18]; // L: 9939
					if (var35 == null) { // L: 9940
						continue;
					}

					if ((var35.x & 127) == 64 && (var35.y & 127) == 64) { // L: 9941
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 9942
							var31 = Client.npcs[Client.npcIndices[var30]]; // L: 9943
							if (var31 != null && var31.definition.size == 1 && var31.x == var35.x && var35.y == var31.y) { // L: 9944
								class12.addNpcToMenu(var31, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count; // L: 9946
						var39 = Players.Players_indices; // L: 9947

						for (var38 = 0; var38 < var30; ++var38) { // L: 9948
							var23 = Client.players[var39[var38]]; // L: 9949
							if (var23 != null && var35 != var23 && var23.x == var35.x && var35.y == var23.y) { // L: 9950
								class20.addPlayerToMenu(var23, var39[var38], var13, var15);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) { // L: 9953
						class20.addPlayerToMenu(var35, var18, var13, var15);
					} else {
						var4 = var25; // L: 9954
					}
				}

				if (var29 == 3) { // L: 9956
					NodeDeque var37 = Client.groundItems[class18.Client_plane][var13][var15]; // L: 9957
					if (var37 != null) { // L: 9958
						for (TileItem var36 = (TileItem)var37.first(); var36 != null; var36 = (TileItem)var37.next()) { // L: 9959 9960 9993
							ItemComposition var40 = class19.ItemDefinition_get(var36.id); // L: 9961
							if (Client.isItemSelected == 1) { // L: 9962
								class21.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator9.colorStartTag(16748608) + var40.name, 16, var36.id, var13, var15); // L: 9963
							} else if (Client.isSpellSelected) { // L: 9966
								if ((class17.selectedSpellFlags & 1) == 1) { // L: 9967
									class21.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator9.colorStartTag(16748608) + var40.name, 17, var36.id, var13, var15); // L: 9968
								}
							} else {
								String[] var32 = var40.groundActions; // L: 9973

								for (int var33 = 4; var33 >= 0; --var33) { // L: 9974
									if (var32 != null && var32[var33] != null) { // L: 9975
										byte var24 = 0; // L: 9976
										if (var33 == 0) { // L: 9977
											var24 = 18;
										}

										if (var33 == 1) { // L: 9978
											var24 = 19;
										}

										if (var33 == 2) { // L: 9979
											var24 = 20;
										}

										if (var33 == 3) { // L: 9980
											var24 = 21;
										}

										if (var33 == 4) { // L: 9981
											var24 = 22;
										}

										class21.insertMenuItemNoShift(var32[var33], UserComparator9.colorStartTag(16748608) + var40.name, var24, var36.id, var13, var15); // L: 9982
									} else if (var33 == 2) { // L: 9985
										class21.insertMenuItemNoShift("Take", UserComparator9.colorStartTag(16748608) + var40.name, 20, var36.id, var13, var15); // L: 9986
									}
								}

								class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16748608) + var40.name, 1004, var36.id, var13, var15); // L: 9990
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 9998
			var8 = (int)(var4 >>> 0 & 127L); // L: 10001
			int var10 = (int)(var4 >>> 7 & 127L); // L: 10006
			Player var12 = Client.players[Client.combatTargetPlayerIndex]; // L: 10009
			class20.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10); // L: 10010
		}

	} // L: 10012
}
