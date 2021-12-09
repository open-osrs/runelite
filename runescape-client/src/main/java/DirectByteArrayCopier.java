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
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1795617978"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lif;B)V",
		garbageValue = "14"
	)
	static final void method5328(class253 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7664
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var37;
		int var38;
		int var39;
		int var40;
		if (class253.field2911 == var0) { // L: 7665
			var37 = var1.method7403(); // L: 7666
			var38 = var1.method7520(); // L: 7667
			var39 = (var38 >> 4 & 7) + class17.field90; // L: 7668
			var40 = (var38 & 7) + class167.field1813; // L: 7669
			var6 = var1.method7394(); // L: 7670
			var7 = var6 >> 2; // L: 7671
			var8 = var6 & 3; // L: 7672
			var9 = Client.field537[var7]; // L: 7673
			if (var39 >= 0 && var40 >= 0 && var39 < 103 && var40 < 103) { // L: 7674
				if (var9 == 0) { // L: 7675
					BoundaryObject var36 = class7.scene.method4105(class20.Client_plane, var39, var40); // L: 7676
					if (var36 != null) { // L: 7677
						var11 = PacketWriter.Entity_unpackID(var36.tag); // L: 7678
						if (var7 == 2) { // L: 7679
							var36.renderable1 = new DynamicObject(var11, 2, var8 + 4, class20.Client_plane, var39, var40, var37, false, var36.renderable1); // L: 7680
							var36.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class20.Client_plane, var39, var40, var37, false, var36.renderable2); // L: 7681
						} else {
							var36.renderable1 = new DynamicObject(var11, var7, var8, class20.Client_plane, var39, var40, var37, false, var36.renderable1); // L: 7683
						}
					}
				}

				if (var9 == 1) { // L: 7686
					WallDecoration var44 = class7.scene.method3973(class20.Client_plane, var39, var40); // L: 7687
					if (var44 != null) { // L: 7688
						var11 = PacketWriter.Entity_unpackID(var44.tag); // L: 7689
						if (var7 != 4 && var7 != 5) { // L: 7690
							if (var7 == 6) { // L: 7691
								var44.renderable1 = new DynamicObject(var11, 4, var8 + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable1);
							} else if (var7 == 7) { // L: 7692
								var44.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable1);
							} else if (var7 == 8) { // L: 7693
								var44.renderable1 = new DynamicObject(var11, 4, var8 + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable1); // L: 7694
								var44.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class20.Client_plane, var39, var40, var37, false, var44.renderable2); // L: 7695
							}
						} else {
							var44.renderable1 = new DynamicObject(var11, 4, var8, class20.Client_plane, var39, var40, var37, false, var44.renderable1);
						}
					}
				}

				if (var9 == 2) { // L: 7699
					GameObject var45 = class7.scene.getGameObject(class20.Client_plane, var39, var40); // L: 7700
					if (var7 == 11) { // L: 7701
						var7 = 10;
					}

					if (var45 != null) { // L: 7702
						var45.renderable = new DynamicObject(PacketWriter.Entity_unpackID(var45.tag), var7, var8, class20.Client_plane, var39, var40, var37, false, var45.renderable);
					}
				}

				if (var9 == 3) { // L: 7704
					FloorDecoration var46 = class7.scene.getFloorDecoration(class20.Client_plane, var39, var40); // L: 7705
					if (var46 != null) { // L: 7706
						var46.renderable = new DynamicObject(PacketWriter.Entity_unpackID(var46.tag), 22, var8, class20.Client_plane, var39, var40, var37, false, var46.renderable);
					}
				}
			}

		} else {
			int var10;
			int var12;
			int var13;
			int var14;
			if (class253.field2913 == var0) { // L: 7711
				byte var2 = var1.method7396(); // L: 7712
				byte var3 = var1.readByte(); // L: 7713
				byte var4 = var1.method7396(); // L: 7714
				byte var5 = var1.readByte(); // L: 7715
				var6 = var1.readUnsignedShort(); // L: 7716
				var7 = var1.method7499(); // L: 7717
				var8 = var1.readUnsignedShort(); // L: 7718
				var9 = var1.method7520(); // L: 7719
				var10 = (var9 >> 4 & 7) + class17.field90; // L: 7720
				var11 = (var9 & 7) + class167.field1813; // L: 7721
				var12 = var1.method7392(); // L: 7722
				var13 = var12 >> 2; // L: 7723
				var14 = var12 & 3; // L: 7724
				int var15 = Client.field537[var13]; // L: 7725
				int var16 = var1.method7401(); // L: 7726
				Player var17;
				if (var16 == Client.localPlayerIndex) { // L: 7728
					var17 = class340.localPlayer;
				} else {
					var17 = Client.players[var16]; // L: 7729
				}

				if (var17 != null) { // L: 7730
					ObjectComposition var18 = class148.getObjectDefinition(var6); // L: 7731
					int var19;
					int var20;
					if (var14 != 1 && var14 != 3) { // L: 7734
						var19 = var18.sizeX; // L: 7739
						var20 = var18.sizeY; // L: 7740
					} else {
						var19 = var18.sizeY; // L: 7735
						var20 = var18.sizeX; // L: 7736
					}

					int var21 = var10 + (var19 >> 1); // L: 7742
					int var22 = var10 + (var19 + 1 >> 1); // L: 7743
					int var23 = var11 + (var20 >> 1); // L: 7744
					int var24 = var11 + (var20 + 1 >> 1); // L: 7745
					int[][] var25 = Tiles.Tiles_heights[class20.Client_plane]; // L: 7746
					int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2; // L: 7747
					int var27 = (var10 << 7) + (var19 << 6); // L: 7748
					int var28 = (var11 << 7) + (var20 << 6); // L: 7749
					Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28); // L: 7750
					if (var29 != null) { // L: 7751
						Varcs.updatePendingSpawn(class20.Client_plane, var10, var11, var15, -1, 0, 0, var7 + 1, var8 + 1); // L: 7752
						var17.animationCycleStart = var7 + Client.cycle; // L: 7753
						var17.animationCycleEnd = var8 + Client.cycle; // L: 7754
						var17.model0 = var29; // L: 7755
						var17.field1056 = var19 * 64 + var10 * 128; // L: 7756
						var17.field1058 = var20 * 64 + var11 * 128; // L: 7757
						var17.tileHeight2 = var26; // L: 7758
						byte var30;
						if (var3 > var2) { // L: 7759
							var30 = var3; // L: 7760
							var3 = var2; // L: 7761
							var2 = var30; // L: 7762
						}

						if (var5 > var4) { // L: 7764
							var30 = var5; // L: 7765
							var5 = var4; // L: 7766
							var4 = var30; // L: 7767
						}

						var17.minX = var10 + var3; // L: 7769
						var17.maxX = var10 + var2; // L: 7770
						var17.minY = var11 + var5; // L: 7771
						var17.maxY = var4 + var11; // L: 7772
					}
				}
			}

			if (class253.field2920 == var0) { // L: 7776
				var37 = var1.method7392(); // L: 7777
				var38 = (var37 >> 4 & 7) + class17.field90; // L: 7778
				var39 = (var37 & 7) + class167.field1813; // L: 7779
				var40 = var1.method7404(); // L: 7780
				byte var41 = var1.method7396(); // L: 7781
				var7 = var1.readUnsignedShort(); // L: 7782
				var8 = var1.readUnsignedByte(); // L: 7783
				var9 = var1.method7401(); // L: 7784
				var10 = var1.readUnsignedByte() * 4; // L: 7785
				var11 = var1.method7520(); // L: 7786
				var12 = var1.method7403(); // L: 7787
				var13 = var1.readUnsignedByte() * 4; // L: 7788
				byte var42 = var1.method7465(); // L: 7789
				var6 = var41 + var38; // L: 7790
				var14 = var42 + var39; // L: 7791
				if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var6 >= 0 && var14 >= 0 && var6 < 104 && var14 < 104 && var9 != 65535) { // L: 7792
					var38 = var38 * 128 + 64; // L: 7793
					var39 = var39 * 128 + 64; // L: 7794
					var6 = var6 * 128 + 64; // L: 7795
					var14 = var14 * 128 + 64; // L: 7796
					Projectile var35 = new Projectile(var9, class20.Client_plane, var38, var39, FaceNormal.getTileHeight(var38, var39, class20.Client_plane) - var10, var12 + Client.cycle, var7 + Client.cycle, var11, var8, var40, var13); // L: 7797
					var35.setDestination(var6, var14, FaceNormal.getTileHeight(var6, var14, class20.Client_plane) - var13, var12 + Client.cycle); // L: 7798
					Client.projectiles.addFirst(var35); // L: 7799
				}

			} else if (class253.field2916 == var0) { // L: 7803
				var37 = var1.method7394(); // L: 7804
				var38 = var37 >> 2; // L: 7805
				var39 = var37 & 3; // L: 7806
				var40 = Client.field537[var38]; // L: 7807
				var6 = var1.method7394(); // L: 7808
				var7 = (var6 >> 4 & 7) + class17.field90; // L: 7809
				var8 = (var6 & 7) + class167.field1813; // L: 7810
				var9 = var1.method7403(); // L: 7811
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7812
					Varcs.updatePendingSpawn(class20.Client_plane, var7, var8, var40, var9, var38, var39, 0, -1); // L: 7813
				}

			} else if (class253.field2918 == var0) { // L: 7817
				var37 = var1.readUnsignedByte(); // L: 7818
				var38 = var37 >> 2; // L: 7819
				var39 = var37 & 3; // L: 7820
				var40 = Client.field537[var38]; // L: 7821
				var6 = var1.method7392(); // L: 7822
				var7 = (var6 >> 4 & 7) + class17.field90; // L: 7823
				var8 = (var6 & 7) + class167.field1813; // L: 7824
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7825
					Varcs.updatePendingSpawn(class20.Client_plane, var7, var8, var40, -1, var38, var39, 0, -1); // L: 7826
				}

			} else {
				TileItem var33;
				if (class253.field2917 == var0) { // L: 7830
					var37 = var1.method7392(); // L: 7831
					var38 = (var37 >> 4 & 7) + class17.field90; // L: 7832
					var39 = (var37 & 7) + class167.field1813; // L: 7833
					var40 = var1.method7401(); // L: 7834
					if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) { // L: 7835
						NodeDeque var34 = Client.groundItems[class20.Client_plane][var38][var39]; // L: 7836
						if (var34 != null) { // L: 7837
							for (var33 = (TileItem)var34.last(); var33 != null; var33 = (TileItem)var34.previous()) { // L: 7838 7839 7844
								if ((var40 & 32767) == var33.id) { // L: 7840
									var33.remove(); // L: 7841
									break;
								}
							}

							if (var34.last() == null) { // L: 7846
								Client.groundItems[class20.Client_plane][var38][var39] = null;
							}

							MouseHandler.updateItemPile(var38, var39); // L: 7847
						}
					}

				} else if (class253.field2914 == var0) { // L: 7852
					var37 = var1.readUnsignedShort(); // L: 7853
					var38 = var1.method7394(); // L: 7854
					var39 = (var38 >> 4 & 7) + class17.field90; // L: 7855
					var40 = (var38 & 7) + class167.field1813; // L: 7856
					var6 = var1.method7401(); // L: 7857
					if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) { // L: 7858
						var33 = new TileItem(); // L: 7859
						var33.id = var37; // L: 7860
						var33.quantity = var6; // L: 7861
						if (Client.groundItems[class20.Client_plane][var39][var40] == null) { // L: 7862
							Client.groundItems[class20.Client_plane][var39][var40] = new NodeDeque();
						}

						Client.groundItems[class20.Client_plane][var39][var40].addFirst(var33); // L: 7863
						MouseHandler.updateItemPile(var39, var40); // L: 7864
					}

				} else if (class253.field2912 == var0) { // L: 7868
					var37 = var1.method7392(); // L: 7869
					var38 = (var37 >> 4 & 7) + class17.field90; // L: 7870
					var39 = (var37 & 7) + class167.field1813; // L: 7871
					var40 = var1.method7403(); // L: 7872
					var6 = var1.method7520(); // L: 7873
					var7 = var1.readUnsignedShort(); // L: 7874
					if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) { // L: 7875
						var38 = var38 * 128 + 64; // L: 7876
						var39 = var39 * 128 + 64; // L: 7877
						GraphicsObject var43 = new GraphicsObject(var40, class20.Client_plane, var38, var39, FaceNormal.getTileHeight(var38, var39, class20.Client_plane) - var6, var7, Client.cycle); // L: 7878
						Client.graphicsObjects.addFirst(var43); // L: 7879
					}

				} else {
					if (class253.field2915 == var0) { // L: 7883
						var37 = var1.readUnsignedByte(); // L: 7884
						var38 = var37 >> 4 & 15; // L: 7885
						var39 = var37 & 7; // L: 7886
						var40 = var1.method7392(); // L: 7887
						var6 = var1.readUnsignedByte(); // L: 7888
						var7 = (var6 >> 4 & 7) + class17.field90; // L: 7889
						var8 = (var6 & 7) + class167.field1813; // L: 7890
						var9 = var1.method7499(); // L: 7891
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7892
							var10 = var38 + 1; // L: 7893
							if (class340.localPlayer.pathX[0] >= var7 - var10 && class340.localPlayer.pathX[0] <= var10 + var7 && class340.localPlayer.pathY[0] >= var8 - var10 && class340.localPlayer.pathY[0] <= var10 + var8 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0 && var39 > 0 && Client.soundEffectCount < 50) { // L: 7894 7895
								Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 7896
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var39; // L: 7897
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var40; // L: 7898
								Client.soundEffects[Client.soundEffectCount] = null; // L: 7899
								Client.soundLocations[Client.soundEffectCount] = var38 + (var8 << 8) + (var7 << 16); // L: 7900
								++Client.soundEffectCount; // L: 7901
							}
						}
					}

					if (class253.field2919 == var0) { // L: 7906
						var37 = var1.readUnsignedShort(); // L: 7907
						var38 = var1.method7499(); // L: 7908
						var39 = var1.method7392(); // L: 7909
						var40 = (var39 >> 4 & 7) + class17.field90; // L: 7910
						var6 = (var39 & 7) + class167.field1813; // L: 7911
						var7 = var1.method7401(); // L: 7912
						if (var40 >= 0 && var6 >= 0 && var40 < 104 && var6 < 104) { // L: 7913
							NodeDeque var31 = Client.groundItems[class20.Client_plane][var40][var6]; // L: 7914
							if (var31 != null) { // L: 7915
								for (TileItem var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7916 7917 7922
									if ((var7 & 32767) == var32.id && var38 == var32.quantity) { // L: 7918
										var32.quantity = var37; // L: 7919
										break;
									}
								}

								MouseHandler.updateItemPile(var40, var6); // L: 7924
							}
						}

					}
				}
			}
		}
	} // L: 7709 7801 7815 7828 7850 7866 7881 7927 7929
}
