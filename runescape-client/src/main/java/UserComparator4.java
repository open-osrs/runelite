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
		this.reversed = var1; // L: 10
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
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;IZI)Lep;",
		garbageValue = "1436051671"
	)
	public static Frames method3470(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lil;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	static void method3469(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1695
		Client.archiveLoaders.add(var2); // L: 1696
		Client.field666 += var2.groupCount; // L: 1697
	} // L: 1698

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "-1705259576"
	)
	static final void method3465(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 6648
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class194.field2342 == var0) { // L: 6649
			var2 = var1.method5582(); // L: 6650
			var3 = var1.method5571(); // L: 6651
			var4 = (var3 >> 4 & 7) + PacketWriter.field1331; // L: 6652
			var5 = (var3 & 7) + class248.field3222; // L: 6653
			var6 = var1.method5571(); // L: 6654
			var7 = var6 >> 4 & 15; // L: 6655
			var8 = var6 & 7; // L: 6656
			var9 = var1.method5572(); // L: 6657
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 6658
				var10 = var7 + 1; // L: 6659
				if (PlayerAppearance.localPlayer.pathX[0] >= var4 - var10 && PlayerAppearance.localPlayer.pathX[0] <= var10 + var4 && PlayerAppearance.localPlayer.pathY[0] >= var5 - var10 && PlayerAppearance.localPlayer.pathY[0] <= var5 + var10 && Timer.clientPreferences.areaSoundEffectsVolume != 0 && var8 > 0 && Client.soundEffectCount < 50) { // L: 6660 6661
					Client.soundEffectIds[Client.soundEffectCount] = var2; // L: 6662
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 6663
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9; // L: 6664
					Client.soundEffects[Client.soundEffectCount] = null; // L: 6665
					Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16); // L: 6666
					++Client.soundEffectCount; // L: 6667
				}
			}
		}

		if (class194.field2349 == var0) { // L: 6672
			var2 = var1.method5571(); // L: 6673
			var3 = (var2 >> 4 & 7) + PacketWriter.field1331; // L: 6674
			var4 = (var2 & 7) + class248.field3222; // L: 6675
			var5 = var1.method5582(); // L: 6676
			var6 = var1.readUnsignedShort(); // L: 6677
			var7 = var1.readUnsignedByte(); // L: 6678
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 6679
				var3 = var3 * 128 + 64; // L: 6680
				var4 = var4 * 128 + 64; // L: 6681
				GraphicsObject var45 = new GraphicsObject(var5, GameObject.Client_plane, var3, var4, SecureRandomFuture.getTileHeight(var3, var4, GameObject.Client_plane) - var7, var6, Client.cycle); // L: 6682
				Client.graphicsObjects.addFirst(var45); // L: 6683
			}

		} else {
			int var11;
			int var13;
			int var14;
			if (class194.field2346 == var0) { // L: 6687
				var2 = var1.method5573() * 4; // L: 6688
				byte var38 = var1.readByte(); // L: 6689
				byte var39 = var1.readByte(); // L: 6690
				var5 = var1.readUnsignedByte(); // L: 6691
				var6 = var1.method5580(); // L: 6692
				var7 = var1.method5584(); // L: 6693
				var8 = var1.method5571(); // L: 6694
				var9 = (var8 >> 4 & 7) + PacketWriter.field1331; // L: 6695
				var10 = (var8 & 7) + class248.field3222; // L: 6696
				var11 = var1.readUnsignedShort(); // L: 6697
				int var41 = var1.method5582(); // L: 6698
				var13 = var1.method5571(); // L: 6699
				var14 = var1.method5573() * 4; // L: 6700
				var3 = var38 + var9; // L: 6701
				var4 = var39 + var10; // L: 6702
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var41 != 65535) { // L: 6703
					var9 = var9 * 128 + 64; // L: 6704
					var10 = var10 * 128 + 64; // L: 6705
					var3 = var3 * 128 + 64; // L: 6706
					var4 = var4 * 128 + 64; // L: 6707
					Projectile var36 = new Projectile(var41, GameObject.Client_plane, var9, var10, SecureRandomFuture.getTileHeight(var9, var10, GameObject.Client_plane) - var2, var6 + Client.cycle, var11 + Client.cycle, var13, var5, var7, var14); // L: 6708
					var36.setDestination(var3, var4, SecureRandomFuture.getTileHeight(var3, var4, GameObject.Client_plane) - var14, var6 + Client.cycle); // L: 6709
					Client.projectiles.addFirst(var36); // L: 6710
				}

			} else if (class194.field2343 == var0) { // L: 6714
				var2 = var1.readUnsignedShort(); // L: 6715
				var3 = var1.method5573(); // L: 6716
				var4 = var3 >> 2; // L: 6717
				var5 = var3 & 3; // L: 6718
				var6 = Client.field708[var4]; // L: 6719
				var7 = var1.readUnsignedByte(); // L: 6720
				var8 = (var7 >> 4 & 7) + PacketWriter.field1331; // L: 6721
				var9 = (var7 & 7) + class248.field3222; // L: 6722
				if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 6723
					ArchiveLoader.updatePendingSpawn(GameObject.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1); // L: 6724
				}

			} else {
				TileItem var33;
				if (class194.field2345 == var0) { // L: 6728
					var2 = var1.method5582(); // L: 6729
					var3 = var1.method5572(); // L: 6730
					var4 = (var3 >> 4 & 7) + PacketWriter.field1331; // L: 6731
					var5 = (var3 & 7) + class248.field3222; // L: 6732
					var6 = var1.method5582(); // L: 6733
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 6734
						var33 = new TileItem(); // L: 6735
						var33.id = var6; // L: 6736
						var33.quantity = var2; // L: 6737
						if (Client.groundItems[GameObject.Client_plane][var4][var5] == null) { // L: 6738
							Client.groundItems[GameObject.Client_plane][var4][var5] = new NodeDeque();
						}

						Client.groundItems[GameObject.Client_plane][var4][var5].addFirst(var33); // L: 6739
						MouseRecorder.updateItemPile(var4, var5); // L: 6740
					}

				} else if (class194.field2350 == var0) { // L: 6744
					var2 = var1.method5580(); // L: 6745
					var3 = var1.method5572(); // L: 6746
					var4 = (var3 >> 4 & 7) + PacketWriter.field1331; // L: 6747
					var5 = (var3 & 7) + class248.field3222; // L: 6748
					var6 = var1.method5580(); // L: 6749
					var7 = var1.method5580(); // L: 6750
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 6751
						NodeDeque var34 = Client.groundItems[GameObject.Client_plane][var4][var5]; // L: 6752
						if (var34 != null) { // L: 6753
							for (TileItem var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 6754 6755 6760
								if ((var2 & 32767) == var35.id && var7 == var35.quantity) { // L: 6756
									var35.quantity = var6; // L: 6757
									break;
								}
							}

							MouseRecorder.updateItemPile(var4, var5); // L: 6762
						}
					}

				} else if (class194.field2348 == var0) { // L: 6767
					var2 = var1.method5580(); // L: 6768
					var3 = var1.method5572(); // L: 6769
					var4 = (var3 >> 4 & 7) + PacketWriter.field1331; // L: 6770
					var5 = (var3 & 7) + class248.field3222; // L: 6771
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 6772
						NodeDeque var32 = Client.groundItems[GameObject.Client_plane][var4][var5]; // L: 6773
						if (var32 != null) { // L: 6774
							for (var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) { // L: 6775 6776 6781
								if ((var2 & 32767) == var33.id) { // L: 6777
									var33.remove(); // L: 6778
									break;
								}
							}

							if (var32.last() == null) { // L: 6783
								Client.groundItems[GameObject.Client_plane][var4][var5] = null;
							}

							MouseRecorder.updateItemPile(var4, var5); // L: 6784
						}
					}

				} else if (class194.field2351 == var0) { // L: 6789
					var2 = var1.method5572(); // L: 6790
					var3 = var2 >> 2; // L: 6791
					var4 = var2 & 3; // L: 6792
					var5 = Client.field708[var3]; // L: 6793
					var6 = var1.readUnsignedShort(); // L: 6794
					var7 = var1.method5572(); // L: 6795
					var8 = (var7 >> 4 & 7) + PacketWriter.field1331; // L: 6796
					var9 = (var7 & 7) + class248.field3222; // L: 6797
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 6798
						if (var5 == 0) { // L: 6799
							BoundaryObject var31 = ArchiveLoader.scene.method3197(GameObject.Client_plane, var8, var9); // L: 6800
							if (var31 != null) { // L: 6801
								var11 = Occluder.Entity_unpackID(var31.tag); // L: 6802
								if (var3 == 2) { // L: 6803
									var31.renderable1 = new DynamicObject(var11, 2, var4 + 4, GameObject.Client_plane, var8, var9, var6, false, var31.renderable1); // L: 6804
									var31.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, GameObject.Client_plane, var8, var9, var6, false, var31.renderable2); // L: 6805
								} else {
									var31.renderable1 = new DynamicObject(var11, var3, var4, GameObject.Client_plane, var8, var9, var6, false, var31.renderable1); // L: 6807
								}
							}
						}

						if (var5 == 1) { // L: 6810
							WallDecoration var42 = ArchiveLoader.scene.method3234(GameObject.Client_plane, var8, var9); // L: 6811
							if (var42 != null) { // L: 6812
								var11 = Occluder.Entity_unpackID(var42.tag); // L: 6813
								if (var3 != 4 && var3 != 5) { // L: 6814
									if (var3 == 6) { // L: 6815
										var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, GameObject.Client_plane, var8, var9, var6, false, var42.renderable1);
									} else if (var3 == 7) { // L: 6816
										var42.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, GameObject.Client_plane, var8, var9, var6, false, var42.renderable1);
									} else if (var3 == 8) { // L: 6817
										var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, GameObject.Client_plane, var8, var9, var6, false, var42.renderable1); // L: 6818
										var42.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, GameObject.Client_plane, var8, var9, var6, false, var42.renderable2); // L: 6819
									}
								} else {
									var42.renderable1 = new DynamicObject(var11, 4, var4, GameObject.Client_plane, var8, var9, var6, false, var42.renderable1);
								}
							}
						}

						if (var5 == 2) { // L: 6823
							GameObject var43 = ArchiveLoader.scene.method3183(GameObject.Client_plane, var8, var9); // L: 6824
							if (var3 == 11) { // L: 6825
								var3 = 10;
							}

							if (var43 != null) { // L: 6826
								var43.renderable = new DynamicObject(Occluder.Entity_unpackID(var43.tag), var3, var4, GameObject.Client_plane, var8, var9, var6, false, var43.renderable);
							}
						}

						if (var5 == 3) { // L: 6828
							FloorDecoration var44 = ArchiveLoader.scene.getFloorDecoration(GameObject.Client_plane, var8, var9); // L: 6829
							if (var44 != null) { // L: 6830
								var44.renderable = new DynamicObject(Occluder.Entity_unpackID(var44.tag), 22, var4, GameObject.Client_plane, var8, var9, var6, false, var44.renderable);
							}
						}
					}

				} else {
					if (class194.field2344 == var0) { // L: 6835
						byte var37 = var1.method5645(); // L: 6836
						var3 = var1.method5571(); // L: 6837
						var4 = var3 >> 2; // L: 6838
						var5 = var3 & 3; // L: 6839
						var6 = Client.field708[var4]; // L: 6840
						byte var40 = var1.method5645(); // L: 6841
						var8 = var1.readUnsignedShort(); // L: 6842
						var9 = var1.method5572(); // L: 6843
						var10 = (var9 >> 4 & 7) + PacketWriter.field1331; // L: 6844
						var11 = (var9 & 7) + class248.field3222; // L: 6845
						byte var12 = var1.readByte(); // L: 6846
						var13 = var1.readUnsignedShort(); // L: 6847
						var14 = var1.method5539(); // L: 6848
						int var15 = var1.readUnsignedShort(); // L: 6849
						byte var16 = var1.readByte(); // L: 6850
						Player var17;
						if (var13 == Client.localPlayerIndex) { // L: 6852
							var17 = PlayerAppearance.localPlayer;
						} else {
							var17 = Client.players[var13]; // L: 6853
						}

						if (var17 != null) { // L: 6854
							ObjectComposition var18 = WorldMapDecoration.getObjectDefinition(var14); // L: 6855
							int var19;
							int var20;
							if (var5 != 1 && var5 != 3) { // L: 6858
								var19 = var18.sizeX; // L: 6863
								var20 = var18.sizeY; // L: 6864
							} else {
								var19 = var18.sizeY; // L: 6859
								var20 = var18.sizeX; // L: 6860
							}

							int var21 = var10 + (var19 >> 1); // L: 6866
							int var22 = var10 + (var19 + 1 >> 1); // L: 6867
							int var23 = var11 + (var20 >> 1); // L: 6868
							int var24 = var11 + (var20 + 1 >> 1); // L: 6869
							int[][] var25 = Tiles.Tiles_heights[GameObject.Client_plane]; // L: 6870
							int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 6871
							int var27 = (var10 << 7) + (var19 << 6); // L: 6872
							int var28 = (var11 << 7) + (var20 << 6); // L: 6873
							Model var29 = var18.getModel(var4, var5, var25, var27, var26, var28); // L: 6874
							if (var29 != null) { // L: 6875
								ArchiveLoader.updatePendingSpawn(GameObject.Client_plane, var10, var11, var6, -1, 0, 0, var15 + 1, var8 + 1); // L: 6876
								var17.animationCycleStart = var15 + Client.cycle; // L: 6877
								var17.animationCycleEnd = var8 + Client.cycle; // L: 6878
								var17.model0 = var29; // L: 6879
								var17.field634 = var19 * 64 + var10 * 128; // L: 6880
								var17.field626 = var20 * 64 + var11 * 128; // L: 6881
								var17.tileHeight2 = var26; // L: 6882
								byte var30;
								if (var12 > var40) { // L: 6883
									var30 = var12; // L: 6884
									var12 = var40; // L: 6885
									var40 = var30; // L: 6886
								}

								if (var37 > var16) { // L: 6888
									var30 = var37; // L: 6889
									var37 = var16; // L: 6890
									var16 = var30; // L: 6891
								}

								var17.field620 = var10 + var12; // L: 6893
								var17.field622 = var40 + var10; // L: 6894
								var17.field606 = var11 + var37; // L: 6895
								var17.field623 = var11 + var16; // L: 6896
							}
						}
					}

					if (class194.field2347 == var0) { // L: 6900
						var2 = var1.method5572(); // L: 6901
						var3 = (var2 >> 4 & 7) + PacketWriter.field1331; // L: 6902
						var4 = (var2 & 7) + class248.field3222; // L: 6903
						var5 = var1.method5571(); // L: 6904
						var6 = var5 >> 2; // L: 6905
						var7 = var5 & 3; // L: 6906
						var8 = Client.field708[var6]; // L: 6907
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 6908
							ArchiveLoader.updatePendingSpawn(GameObject.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1); // L: 6909
						}

					}
				}
			}
		}
	} // L: 6685 6712 6726 6742 6765 6787 6833 6911 6913
}
