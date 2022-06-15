import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -962043785
	)
	public static int field3971;
	@ObfuscatedName("f")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("j")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3971 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 75
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 76
				} // L: 77

				if (var1 != null) { // L: 78
					if (var1.type == 0) { // L: 79
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 80
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 81
							var1.remove(); // L: 82
						} // L: 83
					} else if (var1.type == 1) { // L: 85
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 86
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 87
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 88
						} // L: 89
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 91
						if (field3971 <= 1) { // L: 92
							field3971 = 0; // L: 93
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 94
							return; // L: 95
						}

						field3971 = 600; // L: 97
					}
				} else {
					DynamicObject.method1991(100L); // L: 101
					synchronized(ArchiveDiskActionHandler_lock) { // L: 102
						if (field3971 <= 1) { // L: 103
							field3971 = 0; // L: 104
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 105
							return; // L: 106
						}

						--field3971; // L: 108
					}
				}
			}
		} catch (Exception var13) { // L: 113
			class249.RunException_sendStackTrace((String)null, var13); // L: 114
		}
	} // L: 116

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1673600098"
	)
	static final void method5793() {
		Script.method1978(false); // L: 5727
		Client.field694 = 0; // L: 5728
		boolean var0 = true; // L: 5729

		int var1;
		for (var1 = 0; var1 < Actor.regionLandArchives.length; ++var1) { // L: 5730
			if (PcmPlayer.regionMapArchiveIds[var1] != -1 && Actor.regionLandArchives[var1] == null) { // L: 5731 5732
				Actor.regionLandArchives[var1] = WorldMapSectionType.archive9.takeFile(PcmPlayer.regionMapArchiveIds[var1], 0); // L: 5733
				if (Actor.regionLandArchives[var1] == null) { // L: 5734
					var0 = false; // L: 5735
					++Client.field694; // L: 5736
				}
			}

			if (ObjectSound.regionLandArchiveIds[var1] != -1 && class145.regionMapArchives[var1] == null) { // L: 5740 5741
				class145.regionMapArchives[var1] = WorldMapSectionType.archive9.takeFileEncrypted(ObjectSound.regionLandArchiveIds[var1], 0, WorldMapRegion.xteaKeys[var1]); // L: 5742
				if (class145.regionMapArchives[var1] == null) { // L: 5743
					var0 = false; // L: 5744
					++Client.field694; // L: 5745
				}
			}
		}

		if (!var0) { // L: 5750
			Client.field549 = 1; // L: 5751
		} else {
			Client.field547 = 0; // L: 5754
			var0 = true; // L: 5755

			int var3;
			int var4;
			for (var1 = 0; var1 < Actor.regionLandArchives.length; ++var1) { // L: 5756
				byte[] var15 = class145.regionMapArchives[var1]; // L: 5757
				if (var15 != null) { // L: 5758
					var3 = (Client.regions[var1] >> 8) * 64 - class28.baseX; // L: 5759
					var4 = (Client.regions[var1] & 255) * 64 - WorldMapLabelSize.baseY; // L: 5760
					if (Client.isInInstance) { // L: 5761
						var3 = 10; // L: 5762
						var4 = 10; // L: 5763
					}

					var0 &= UserComparator10.method2611(var15, var3, var4); // L: 5765
				}
			}

			if (!var0) { // L: 5768
				Client.field549 = 2; // L: 5769
			} else {
				if (Client.field549 != 0) { // L: 5772
					SequenceDefinition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				Renderable.playPcmPlayers(); // L: 5773
				class356.scene.clear(); // L: 5774

				for (var1 = 0; var1 < 4; ++var1) { // L: 5775
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5776
					for (var2 = 0; var2 < 104; ++var2) { // L: 5777
						for (var3 = 0; var3 < 104; ++var3) { // L: 5778
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5779
						}
					}
				}

				Renderable.playPcmPlayers(); // L: 5783
				class259.method5188(); // L: 5784
				var1 = Actor.regionLandArchives.length; // L: 5785
				Decimator.method1018(); // L: 5786
				Script.method1978(true); // L: 5787
				int var5;
				if (!Client.isInInstance) { // L: 5788
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5789
						var3 = (Client.regions[var2] >> 8) * 64 - class28.baseX; // L: 5790
						var4 = (Client.regions[var2] & 255) * 64 - WorldMapLabelSize.baseY; // L: 5791
						var14 = Actor.regionLandArchives[var2]; // L: 5792
						if (var14 != null) { // L: 5793
							Renderable.playPcmPlayers(); // L: 5794
							UserComparator1.method8020(var14, var3, var4, GrandExchangeOffer.field4070 * 8 - 48, ApproximateRouteStrategy.field466 * 8 - 48, Client.collisionMaps); // L: 5795
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5798
						var3 = (Client.regions[var2] >> 8) * 64 - class28.baseX; // L: 5799
						var4 = (Client.regions[var2] & 255) * 64 - WorldMapLabelSize.baseY; // L: 5800
						var14 = Actor.regionLandArchives[var2]; // L: 5801
						if (var14 == null && ApproximateRouteStrategy.field466 < 800) { // L: 5802
							Renderable.playPcmPlayers(); // L: 5803
							class11.method98(var3, var4, 64, 64); // L: 5804
						}
					}

					Script.method1978(true); // L: 5807

					for (var2 = 0; var2 < var1; ++var2) { // L: 5808
						byte[] var13 = class145.regionMapArchives[var2]; // L: 5809
						if (var13 != null) { // L: 5810
							var4 = (Client.regions[var2] >> 8) * 64 - class28.baseX; // L: 5811
							var5 = (Client.regions[var2] & 255) * 64 - WorldMapLabelSize.baseY; // L: 5812
							Renderable.playPcmPlayers(); // L: 5813
							VertexNormal.method4527(var13, var4, var5, class356.scene, Client.collisionMaps); // L: 5814
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5818
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5819
						Renderable.playPcmPlayers(); // L: 5820

						for (var3 = 0; var3 < 13; ++var3) { // L: 5821
							for (var4 = 0; var4 < 13; ++var4) { // L: 5822
								boolean var16 = false; // L: 5823
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5824
								if (var6 != -1) { // L: 5825
									var7 = var6 >> 24 & 3; // L: 5826
									var8 = var6 >> 1 & 3; // L: 5827
									var9 = var6 >> 14 & 1023; // L: 5828
									var10 = var6 >> 3 & 2047; // L: 5829
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5830

									for (int var12 = 0; var12 < Client.regions.length; ++var12) { // L: 5831
										if (Client.regions[var12] == var11 && Actor.regionLandArchives[var12] != null) { // L: 5832
											Canvas.method315(Actor.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5833
											var16 = true; // L: 5834
											break;
										}
									}
								}

								if (!var16) { // L: 5839
									class28.method352(var2, var3 * 8, var4 * 8); // L: 5840
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5845
						for (var3 = 0; var3 < 13; ++var3) { // L: 5846
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5847
							if (var4 == -1) { // L: 5848
								class11.method98(var2 * 8, var3 * 8, 8, 8); // L: 5849
							}
						}
					}

					Script.method1978(true); // L: 5853

					for (var2 = 0; var2 < 4; ++var2) { // L: 5854
						Renderable.playPcmPlayers(); // L: 5855

						for (var3 = 0; var3 < 13; ++var3) { // L: 5856
							for (var4 = 0; var4 < 13; ++var4) { // L: 5857
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5858
								if (var5 != -1) { // L: 5859
									var6 = var5 >> 24 & 3; // L: 5860
									var7 = var5 >> 1 & 3; // L: 5861
									var8 = var5 >> 14 & 1023; // L: 5862
									var9 = var5 >> 3 & 2047; // L: 5863
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5864

									for (var11 = 0; var11 < Client.regions.length; ++var11) { // L: 5865
										if (Client.regions[var11] == var10 && class145.regionMapArchives[var11] != null) { // L: 5866
											Tiles.method2007(class145.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class356.scene, Client.collisionMaps); // L: 5867
											break; // L: 5868
										}
									}
								}
							}
						}
					}
				}

				Script.method1978(true); // L: 5876
				Renderable.playPcmPlayers(); // L: 5877
				class134.method2905(class356.scene, Client.collisionMaps); // L: 5878
				Script.method1978(true); // L: 5879
				var2 = Tiles.Tiles_minPlane; // L: 5880
				if (var2 > PacketWriter.Client_plane) { // L: 5881
					var2 = PacketWriter.Client_plane;
				}

				if (var2 < PacketWriter.Client_plane - 1) { // L: 5882
					var2 = PacketWriter.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5883
					class356.scene.init(Tiles.Tiles_minPlane);
				} else {
					class356.scene.init(0); // L: 5884
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5885
					for (var4 = 0; var4 < 104; ++var4) { // L: 5886
						class133.updateItemPile(var3, var4); // L: 5887
					}
				}

				Renderable.playPcmPlayers(); // L: 5890
				class4.method11(); // L: 5891
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5892
				PacketBufferNode var17;
				if (class353.client.hasFrame()) { // L: 5893
					var17 = EnumComposition.getPacketBufferNode(ClientPacket.field3007, Client.packetWriter.isaacCipher); // L: 5895
					var17.packetBuffer.writeInt(1057001181); // L: 5896
					Client.packetWriter.addNode(var17); // L: 5897
				}

				if (!Client.isInInstance) { // L: 5899
					var3 = (GrandExchangeOffer.field4070 - 6) / 8; // L: 5900
					var4 = (GrandExchangeOffer.field4070 + 6) / 8; // L: 5901
					var5 = (ApproximateRouteStrategy.field466 - 6) / 8; // L: 5902
					var6 = (ApproximateRouteStrategy.field466 + 6) / 8; // L: 5903

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5904
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5905
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5906
								WorldMapSectionType.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 5907
								WorldMapSectionType.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 5908
							}
						}
					}
				}

				HealthBarUpdate.updateGameState(30); // L: 5912
				Renderable.playPcmPlayers(); // L: 5913
				class361.method6552(); // L: 5914
				var17 = EnumComposition.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher); // L: 5915
				Client.packetWriter.addNode(var17); // L: 5916
				Calendar.method5504(); // L: 5917
			}
		}
	} // L: 5752 5770 5918

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232514392"
	)
	static final void method5779() {
		int var0 = UserComparator3.menuX; // L: 8460
		int var1 = ViewportMouse.menuY; // L: 8461
		int var2 = Language.menuWidth; // L: 8462
		int var3 = Player.menuHeight; // L: 8463
		int var4 = 6116423; // L: 8464
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8465
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8466
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8467
		TileItem.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8468
		int var5 = MouseHandler.MouseHandler_x; // L: 8469
		int var6 = MouseHandler.MouseHandler_y; // L: 8470

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8471
			var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 8472
			var9 = 16777215; // L: 8473
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8474
				var9 = 16776960;
			}

			Font var12 = TileItem.fontBold12; // L: 8475
			String var13;
			if (var7 < 0) { // L: 8478
				var13 = ""; // L: 8479
			} else if (Client.menuTargets[var7].length() > 0) { // L: 8482
				var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var13 = Client.menuActions[var7]; // L: 8483
			}

			var12.draw(var13, var0 + 3, var8, var9, 0); // L: 8485
		}

		var7 = UserComparator3.menuX; // L: 8487
		var8 = ViewportMouse.menuY; // L: 8488
		var9 = Language.menuWidth; // L: 8489
		int var10 = Player.menuHeight; // L: 8490

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 8492
			if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 8493
				Client.field704[var11] = true;
			}
		}

	} // L: 8496
}
