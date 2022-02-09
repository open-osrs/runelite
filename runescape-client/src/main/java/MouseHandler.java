import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1073893907
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1694985193
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -830820655
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 668120751
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -3728044565388520941L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1322576095
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 3778330924173868733L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 977348605
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 674458539
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -18952791
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -158816913
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1161470035
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2923617770856931813L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -907131657
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1454234719
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 771902181
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 2709122788855989661L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 700693617
	)
	static int field240;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "992968755"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 65
		if (!var1.isAltDown() && var2 != 2) { // L: 66
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 67 68
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 113
			MouseHandler_idleCycles = 0; // L: 114
			MouseHandler_xVolatile = var1.getX(); // L: 115
			MouseHandler_yVolatile = var1.getY(); // L: 116
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 117
		}

	} // L: 119

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 96
	} // L: 97

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 72
			MouseHandler_idleCycles = 0; // L: 73
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 74
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 75
			MouseHandler_lastPressedTimeMillisVolatile = DirectByteArrayCopier.method5318(); // L: 76
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 77
			if (MouseHandler_lastButtonVolatile != 0) { // L: 78
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 80
			var1.consume();
		}

	} // L: 81

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 84
			MouseHandler_idleCycles = 0; // L: 85
			MouseHandler_currentButtonVolatile = 0; // L: 86
		}

		if (var1.isPopupTrigger()) { // L: 88
			var1.consume();
		}

	} // L: 89

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 100
			MouseHandler_idleCycles = 0; // L: 101
			MouseHandler_xVolatile = -1; // L: 102
			MouseHandler_yVolatile = -1; // L: 103
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 104
		}

	} // L: 106

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 109
	} // L: 110

	public final void focusGained(FocusEvent var1) {
	} // L: 121

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 124
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 125

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 92
			var1.consume();
		}

	} // L: 93

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgu;",
		garbageValue = "-1943913678"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 322
		if (var1 != null) { // L: 323
			return var1;
		} else {
			AbstractArchive var3 = WorldMapData_0.SequenceDefinition_animationsArchive; // L: 325
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 326
			boolean var5 = true; // L: 328
			int[] var6 = var3.getGroupFileIds(var0); // L: 329

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 330
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 331
				if (var8 == null) { // L: 332
					var5 = false; // L: 333
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 336
					byte[] var10 = var4.getFile(var9, 0); // L: 339
					if (var10 == null) { // L: 340
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 342
				var2 = null; // L: 343
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 347
				} catch (Exception var12) { // L: 349
					var2 = null; // L: 350
				}
			}

			if (var2 != null) { // L: 354
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 355
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-753950525"
	)
	static final void method615() {
		HorizontalAlignment.method3279(false); // L: 5473
		Client.field498 = 0; // L: 5474
		boolean var0 = true; // L: 5475

		int var1;
		for (var1 = 0; var1 < Friend.regionLandArchives.length; ++var1) { // L: 5476
			if (Varcs.regionMapArchiveIds[var1] != -1 && Friend.regionLandArchives[var1] == null) { // L: 5477 5478
				Friend.regionLandArchives[var1] = Client.archive5.takeFile(Varcs.regionMapArchiveIds[var1], 0); // L: 5479
				if (Friend.regionLandArchives[var1] == null) { // L: 5480
					var0 = false; // L: 5481
					++Client.field498; // L: 5482
				}
			}

			if (WorldMapData_0.regionLandArchiveIds[var1] != -1 && ReflectionCheck.regionMapArchives[var1] == null) { // L: 5486 5487
				ReflectionCheck.regionMapArchives[var1] = Client.archive5.takeFileEncrypted(WorldMapData_0.regionLandArchiveIds[var1], 0, UserComparator8.xteaKeys[var1]); // L: 5488
				if (ReflectionCheck.regionMapArchives[var1] == null) { // L: 5489
					var0 = false; // L: 5490
					++Client.field498; // L: 5491
				}
			}
		}

		if (!var0) { // L: 5496
			Client.field621 = 1; // L: 5497
		} else {
			Client.field559 = 0; // L: 5500
			var0 = true; // L: 5501

			int var3;
			int var4;
			for (var1 = 0; var1 < Friend.regionLandArchives.length; ++var1) { // L: 5502
				byte[] var15 = ReflectionCheck.regionMapArchives[var1]; // L: 5503
				if (var15 != null) { // L: 5504
					var3 = (WorldMapLabel.regions[var1] >> 8) * 64 - Canvas.baseX; // L: 5505
					var4 = (WorldMapLabel.regions[var1] & 255) * 64 - class118.baseY; // L: 5506
					if (Client.isInInstance) { // L: 5507
						var3 = 10; // L: 5508
						var4 = 10; // L: 5509
					}

					var0 &= FriendSystem.method1689(var15, var3, var4); // L: 5511
				}
			}

			if (!var0) { // L: 5514
				Client.field621 = 2; // L: 5515
			} else {
				if (Client.field621 != 0) { // L: 5518
					Calendar.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class122.playPcmPlayers(); // L: 5519
				Decimator.scene.clear(); // L: 5520

				for (var1 = 0; var1 < 4; ++var1) { // L: 5521
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5522
					for (var2 = 0; var2 < 104; ++var2) { // L: 5523
						for (var3 = 0; var3 < 104; ++var3) { // L: 5524
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5525
						}
					}
				}

				class122.playPcmPlayers(); // L: 5529
				UserComparator5.method2475(); // L: 5530
				var1 = Friend.regionLandArchives.length; // L: 5531
				SequenceDefinition.method3623(); // L: 5532
				HorizontalAlignment.method3279(true); // L: 5533
				int var5;
				if (!Client.isInInstance) { // L: 5534
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5535
						var3 = (WorldMapLabel.regions[var2] >> 8) * 64 - Canvas.baseX; // L: 5536
						var4 = (WorldMapLabel.regions[var2] & 255) * 64 - class118.baseY; // L: 5537
						var14 = Friend.regionLandArchives[var2]; // L: 5538
						if (var14 != null) { // L: 5539
							class122.playPcmPlayers(); // L: 5540
							Varps.method5333(var14, var3, var4, field240 * 8 - 48, UserComparator7.field1352 * 8 - 48, Client.collisionMaps); // L: 5541
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5544
						var3 = (WorldMapLabel.regions[var2] >> 8) * 64 - Canvas.baseX; // L: 5545
						var4 = (WorldMapLabel.regions[var2] & 255) * 64 - class118.baseY; // L: 5546
						var14 = Friend.regionLandArchives[var2]; // L: 5547
						if (var14 == null && UserComparator7.field1352 < 800) { // L: 5548
							class122.playPcmPlayers(); // L: 5549
							class7.method51(var3, var4, 64, 64); // L: 5550
						}
					}

					HorizontalAlignment.method3279(true); // L: 5553

					for (var2 = 0; var2 < var1; ++var2) { // L: 5554
						byte[] var13 = ReflectionCheck.regionMapArchives[var2]; // L: 5555
						if (var13 != null) { // L: 5556
							var4 = (WorldMapLabel.regions[var2] >> 8) * 64 - Canvas.baseX; // L: 5557
							var5 = (WorldMapLabel.regions[var2] & 255) * 64 - class118.baseY; // L: 5558
							class122.playPcmPlayers(); // L: 5559
							class78.method2083(var13, var4, var5, Decimator.scene, Client.collisionMaps); // L: 5560
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5564
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5565
						class122.playPcmPlayers(); // L: 5566

						for (var3 = 0; var3 < 13; ++var3) { // L: 5567
							for (var4 = 0; var4 < 13; ++var4) { // L: 5568
								boolean var16 = false; // L: 5569
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5570
								if (var6 != -1) { // L: 5571
									var7 = var6 >> 24 & 3; // L: 5572
									var8 = var6 >> 1 & 3; // L: 5573
									var9 = var6 >> 14 & 1023; // L: 5574
									var10 = var6 >> 3 & 2047; // L: 5575
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5576

									for (int var12 = 0; var12 < WorldMapLabel.regions.length; ++var12) { // L: 5577
										if (WorldMapLabel.regions[var12] == var11 && Friend.regionLandArchives[var12] != null) { // L: 5578
											ViewportMouse.method4264(Friend.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5579
											var16 = true; // L: 5580
											break;
										}
									}
								}

								if (!var16) { // L: 5585
									Canvas.method370(var2, var3 * 8, var4 * 8); // L: 5586
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5591
						for (var3 = 0; var3 < 13; ++var3) { // L: 5592
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5593
							if (var4 == -1) { // L: 5594
								class7.method51(var2 * 8, var3 * 8, 8, 8); // L: 5595
							}
						}
					}

					HorizontalAlignment.method3279(true); // L: 5599

					for (var2 = 0; var2 < 4; ++var2) { // L: 5600
						class122.playPcmPlayers(); // L: 5601

						for (var3 = 0; var3 < 13; ++var3) { // L: 5602
							for (var4 = 0; var4 < 13; ++var4) { // L: 5603
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5604
								if (var5 != -1) { // L: 5605
									var6 = var5 >> 24 & 3; // L: 5606
									var7 = var5 >> 1 & 3; // L: 5607
									var8 = var5 >> 14 & 1023; // L: 5608
									var9 = var5 >> 3 & 2047; // L: 5609
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5610

									for (var11 = 0; var11 < WorldMapLabel.regions.length; ++var11) { // L: 5611
										if (WorldMapLabel.regions[var11] == var10 && ReflectionCheck.regionMapArchives[var11] != null) { // L: 5612
											Tiles.method2031(ReflectionCheck.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, Decimator.scene, Client.collisionMaps); // L: 5613
											break; // L: 5614
										}
									}
								}
							}
						}
					}
				}

				HorizontalAlignment.method3279(true); // L: 5622
				class122.playPcmPlayers(); // L: 5623
				class145.method2976(Decimator.scene, Client.collisionMaps); // L: 5624
				HorizontalAlignment.method3279(true); // L: 5625
				var2 = Tiles.Tiles_minPlane; // L: 5626
				if (var2 > SoundSystem.Client_plane) { // L: 5627
					var2 = SoundSystem.Client_plane;
				}

				if (var2 < SoundSystem.Client_plane - 1) { // L: 5628
					var2 = SoundSystem.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5629
					Decimator.scene.init(Tiles.Tiles_minPlane);
				} else {
					Decimator.scene.init(0); // L: 5630
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5631
					for (var4 = 0; var4 < 104; ++var4) { // L: 5632
						StudioGame.updateItemPile(var3, var4); // L: 5633
					}
				}

				class122.playPcmPlayers(); // L: 5636
				class87.method2220(); // L: 5637
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5638
				PacketBufferNode var17;
				if (class414.client.hasFrame()) { // L: 5639
					var17 = class135.getPacketBufferNode(ClientPacket.field2897, Client.packetWriter.isaacCipher); // L: 5641
					var17.packetBuffer.writeInt(1057001181); // L: 5642
					Client.packetWriter.addNode(var17); // L: 5643
				}

				if (!Client.isInInstance) { // L: 5645
					var3 = (field240 - 6) / 8; // L: 5646
					var4 = (field240 + 6) / 8; // L: 5647
					var5 = (UserComparator7.field1352 - 6) / 8; // L: 5648
					var6 = (UserComparator7.field1352 + 6) / 8; // L: 5649

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5650
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5651
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5652
								Client.archive5.loadRegionFromName("m" + var7 + "_" + var8); // L: 5653
								Client.archive5.loadRegionFromName("l" + var7 + "_" + var8); // L: 5654
							}
						}
					}
				}

				class111.updateGameState(30); // L: 5658
				class122.playPcmPlayers(); // L: 5659
				class111.method2525(); // L: 5660
				var17 = class135.getPacketBufferNode(ClientPacket.field2883, Client.packetWriter.isaacCipher); // L: 5661
				Client.packetWriter.addNode(var17); // L: 5662
				GrandExchangeOfferOwnWorldComparator.method1121(); // L: 5663
			}
		}
	} // L: 5498 5516 5664

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1548132966"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11557
		class424.clientPreferences.soundEffectsVolume = var0; // L: 11558
		GameEngine.savePreferences(); // L: 11559
	} // L: 11560
}
