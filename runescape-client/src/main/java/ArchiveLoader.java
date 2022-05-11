import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -404162061
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1950157047
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lle;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1365376212"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5634(var1) || this.archive.method5633(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-59"
	)
	static int method2041(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1248
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1249
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var3)); // L: 1250
			return 1; // L: 1251
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1253
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1260
				if (var3.dataText == null) { // L: 1261
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1262
				}

				return 1; // L: 1263
			} else {
				return 2; // L: 1265
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1254
			--var4; // L: 1255
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1256
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1257
			} else {
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1258
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "664108386"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 990
			var1 /= 2;
		}

		if (var2 > 192) { // L: 991
			var1 /= 2;
		}

		if (var2 > 217) { // L: 992
			var1 /= 2;
		}

		if (var2 > 243) { // L: 993
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 994
		return var3; // L: 995
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-74"
	)
	static int method2045(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2322
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2323
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = UserComparator8.method2581(var3) ? 1 : 0; // L: 2324
			return 1; // L: 2325
		} else if (var0 == 3501) { // L: 2327
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2328
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WorldMapAreaData.method4880(var3) ? 1 : 0; // L: 2329
			return 1; // L: 2330
		} else if (var0 == 3502) { // L: 2332
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2333
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class19.method257(var3) ? 1 : 0; // L: 2334
			return 1; // L: 2335
		} else {
			return 2; // L: 2337
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1781905177"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (Fonts.pcmPlayer1 != null) { // L: 3757
			Fonts.pcmPlayer1.run();
		}

		if (SecureRandomCallable.pcmPlayer0 != null) { // L: 3758
			SecureRandomCallable.pcmPlayer0.run();
		}

	} // L: 3759

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-440186297"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4584
		if (ModelData0.localPlayer.x >> 7 == Client.destinationX && ModelData0.localPlayer.y >> 7 == Client.destinationY) { // L: 4586
			Client.destinationX = 0; // L: 4587
		}

		CollisionMap.method3778(); // L: 4590
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4592
			class263.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4593
		}

		class137.addNpcsToScene(true); // L: 4596
		int var4 = Players.Players_count; // L: 4598
		int[] var5 = Players.Players_indices; // L: 4599

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4600
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4601
				class263.addPlayerToScene(Client.players[var5[var6]], true); // L: 4602
			}
		}

		class137.addNpcsToScene(false); // L: 4605

		for (Projectile var30 = (Projectile)Client.projectiles.last(); var30 != null; var30 = (Projectile)Client.projectiles.previous()) { // L: 4607 4608 4625
			if (var30.plane == class128.Client_plane && Client.cycle <= var30.cycleEnd) { // L: 4609
				if (Client.cycle >= var30.cycleStart) { // L: 4610
					if (var30.targetIndex > 0) { // L: 4611
						NPC var34 = Client.npcs[var30.targetIndex - 1]; // L: 4612
						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) { // L: 4613
							var30.setDestination(var34.x, var34.y, class202.getTileHeight(var34.x, var34.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					if (var30.targetIndex < 0) { // L: 4615
						var6 = -var30.targetIndex - 1; // L: 4617
						Player var35;
						if (var6 == Client.localPlayerIndex) { // L: 4618
							var35 = ModelData0.localPlayer;
						} else {
							var35 = Client.players[var6]; // L: 4619
						}

						if (var35 != null && var35.x >= 0 && var35.x < 13312 && var35.y >= 0 && var35.y < 13312) { // L: 4620
							var30.setDestination(var35.x, var35.y, class202.getTileHeight(var35.x, var35.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					var30.advance(Client.field727); // L: 4622
					class175.scene.drawEntity(class128.Client_plane, (int)var30.x, (int)var30.y, (int)var30.z, 60, var30, var30.yaw, -1L, false); // L: 4623
				}
			} else {
				var30.remove();
			}
		}

		for (GraphicsObject var37 = (GraphicsObject)Client.graphicsObjects.last(); var37 != null; var37 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4629 4630 4637
			if (var37.plane == class128.Client_plane && !var37.isFinished) { // L: 4631
				if (Client.cycle >= var37.cycleStart) { // L: 4632
					var37.advance(Client.field727); // L: 4633
					if (var37.isFinished) { // L: 4634
						var37.remove();
					} else {
						class175.scene.drawEntity(var37.plane, var37.x, var37.y, var37.z, 60, var37, 0, -1L, false); // L: 4635
					}
				}
			} else {
				var37.remove();
			}
		}

		GrandExchangeOfferOwnWorldComparator.setViewportShape(var0, var1, var2, var3, true); // L: 4640
		var0 = Client.viewportOffsetX; // L: 4641
		var1 = Client.viewportOffsetY; // L: 4642
		var2 = Client.viewportWidth; // L: 4643
		var3 = Client.viewportHeight; // L: 4644
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4645
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4646
		var4 = Client.camAngleX; // L: 4647
		if (Client.field578 / 256 > var4) { // L: 4648
			var4 = Client.field578 / 256;
		}

		if (Client.field743[4] && Client.field745[4] + 128 > var4) { // L: 4649
			var4 = Client.field745[4] + 128;
		}

		int var31 = Client.camAngleY & 2047; // L: 4650
		User.method6523(HorizontalAlignment.oculusOrbFocalPointX, class140.field1666, class28.oculusOrbFocalPointY, var4, var31, class10.method94(var4), var3); // L: 4651
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var16;
		if (!Client.isCameraLocked) { // L: 4653
			if (class12.clientPreferences.method2222()) { // L: 4656
				var7 = class128.Client_plane; // L: 4657
			} else {
				label630: {
					var8 = 3; // L: 4660
					if (GameEngine.cameraPitch < 310) { // L: 4661
						label622: {
							if (Client.oculusOrbState == 1) { // L: 4664
								var9 = HorizontalAlignment.oculusOrbFocalPointX >> 7; // L: 4665
								var10 = class28.oculusOrbFocalPointY >> 7; // L: 4666
							} else {
								var9 = ModelData0.localPlayer.x >> 7; // L: 4669
								var10 = ModelData0.localPlayer.y >> 7; // L: 4670
							}

							var11 = class343.cameraX >> 7; // L: 4672
							var12 = FaceNormal.cameraZ >> 7; // L: 4673
							if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) { // L: 4674
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 4678
									if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) { // L: 4682
										var8 = class128.Client_plane;
									}

									if (var9 > var11) { // L: 4684
										var13 = var9 - var11;
									} else {
										var13 = var11 - var9; // L: 4685
									}

									if (var10 > var12) { // L: 4687
										var14 = var10 - var12;
									} else {
										var14 = var12 - var10; // L: 4688
									}

									int var15;
									if (var13 > var14) { // L: 4689
										var15 = var14 * 65536 / var13; // L: 4690
										var16 = 32768; // L: 4691

										while (true) {
											if (var9 == var11) { // L: 4692
												break label622;
											}

											if (var11 < var9) { // L: 4693
												++var11;
											} else if (var11 > var9) { // L: 4694
												--var11;
											}

											if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) { // L: 4695
												var8 = class128.Client_plane;
											}

											var16 += var15; // L: 4696
											if (var16 >= 65536) { // L: 4697
												var16 -= 65536; // L: 4698
												if (var12 < var10) { // L: 4699
													++var12;
												} else if (var12 > var10) { // L: 4700
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) { // L: 4701
													var8 = class128.Client_plane;
												}
											}
										}
									} else {
										if (var14 > 0) { // L: 4705
											var15 = var13 * 65536 / var14; // L: 4706
											var16 = 32768; // L: 4707

											while (var12 != var10) { // L: 4708
												if (var12 < var10) { // L: 4709
													++var12;
												} else if (var12 > var10) { // L: 4710
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) { // L: 4711
													var8 = class128.Client_plane;
												}

												var16 += var15; // L: 4712
												if (var16 >= 65536) { // L: 4713
													var16 -= 65536; // L: 4714
													if (var11 < var9) { // L: 4715
														++var11;
													} else if (var11 > var9) { // L: 4716
														--var11;
													}

													if ((Tiles.Tiles_renderFlags[class128.Client_plane][var11][var12] & 4) != 0) { // L: 4717
														var8 = class128.Client_plane;
													}
												}
											}
										}
										break label622;
									}
								}

								var7 = class128.Client_plane; // L: 4679
								break label630; // L: 4680
							}

							var7 = class128.Client_plane; // L: 4675
							break label630; // L: 4676
						}
					}

					if (ModelData0.localPlayer.x >= 0 && ModelData0.localPlayer.y >= 0 && ModelData0.localPlayer.x < 13312 && ModelData0.localPlayer.y < 13312) { // L: 4722
						if ((Tiles.Tiles_renderFlags[class128.Client_plane][ModelData0.localPlayer.x >> 7][ModelData0.localPlayer.y >> 7] & 4) != 0) { // L: 4726
							var8 = class128.Client_plane;
						}

						var7 = var8; // L: 4727
					} else {
						var7 = class128.Client_plane; // L: 4723
					}
				}
			}

			var6 = var7; // L: 4729
		} else {
			var6 = class101.method2551(); // L: 4731
		}

		var7 = class343.cameraX; // L: 4732
		var8 = class295.cameraY; // L: 4733
		var9 = FaceNormal.cameraZ; // L: 4734
		var10 = GameEngine.cameraPitch; // L: 4735
		var11 = StudioGame.cameraYaw; // L: 4736

		for (var12 = 0; var12 < 5; ++var12) { // L: 4737
			if (Client.field743[var12]) { // L: 4738
				var13 = (int)(Math.random() * (double)(Client.field744[var12] * 2 + 1) - (double)Client.field744[var12] + Math.sin((double)Client.field714[var12] / 100.0D * (double)Client.field677[var12]) * (double)Client.field745[var12]); // L: 4739
				if (var12 == 0) { // L: 4740
					class343.cameraX += var13;
				}

				if (var12 == 1) { // L: 4741
					class295.cameraY += var13;
				}

				if (var12 == 2) { // L: 4742
					FaceNormal.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4743
					StudioGame.cameraYaw = var13 + StudioGame.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4744
					GameEngine.cameraPitch += var13; // L: 4745
					if (GameEngine.cameraPitch < 128) { // L: 4746
						GameEngine.cameraPitch = 128;
					}

					if (GameEngine.cameraPitch > 383) { // L: 4747
						GameEngine.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4751
		var13 = MouseHandler.MouseHandler_y; // L: 4752
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4753
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4754
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 4755
		}

		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 4757
			class136.method2865(var12 - var0, var13 - var1); // L: 4758
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4762
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4763
		}

		playPcmPlayers(); // L: 4766
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4767
		playPcmPlayers(); // L: 4768
		var14 = Rasterizer3D.Rasterizer3D_zoom; // L: 4769
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4770
		class175.scene.draw(class343.cameraX, class295.cameraY, FaceNormal.cameraZ, GameEngine.cameraPitch, StudioGame.cameraYaw, var6); // L: 4771
		Rasterizer3D.Rasterizer3D_zoom = var14; // L: 4772
		playPcmPlayers(); // L: 4773
		class175.scene.clearTempGameObjects(); // L: 4774
		Client.overheadTextCount = 0; // L: 4776
		boolean var36 = false; // L: 4777
		var16 = -1; // L: 4778
		int var17 = -1; // L: 4779
		int var18 = Players.Players_count; // L: 4780
		int[] var19 = Players.Players_indices; // L: 4781

		int var20;
		for (var20 = 0; var20 < var18 + Client.npcCount; ++var20) { // L: 4782
			Object var33;
			if (var20 < var18) { // L: 4784
				var33 = Client.players[var19[var20]]; // L: 4785
				if (var19[var20] == Client.combatTargetPlayerIndex) { // L: 4786
					var36 = true; // L: 4787
					var16 = var20; // L: 4788
					continue;
				}

				if (var33 == ModelData0.localPlayer) { // L: 4791
					var17 = var20; // L: 4792
					continue; // L: 4793
				}
			} else {
				var33 = Client.npcs[Client.npcIndices[var20 - var18]]; // L: 4796
			}

			Client.drawActor2d((Actor)var33, var20, var0, var1, var2, var3); // L: 4797
		}

		if (Client.renderSelf && var17 != -1) { // L: 4799
			Client.drawActor2d(ModelData0.localPlayer, var17, var0, var1, var2, var3); // L: 4800
		}

		if (var36) { // L: 4802
			Client.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var16, var0, var1, var2, var3); // L: 4803
		}

		for (var20 = 0; var20 < Client.overheadTextCount; ++var20) { // L: 4805
			int var21 = Client.overheadTextXs[var20]; // L: 4806
			int var22 = Client.overheadTextYs[var20]; // L: 4807
			int var23 = Client.overheadTextXOffsets[var20]; // L: 4808
			int var24 = Client.overheadTextAscents[var20]; // L: 4809
			boolean var25 = true; // L: 4810

			while (var25) {
				var25 = false; // L: 4812

				for (int var32 = 0; var32 < var20; ++var32) { // L: 4813
					if (var22 + 2 > Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] && var22 - var24 < Client.overheadTextYs[var32] + 2 && var21 - var23 < Client.overheadTextXOffsets[var32] + Client.overheadTextXs[var32] && var21 + var23 > Client.overheadTextXs[var32] - Client.overheadTextXOffsets[var32] && Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] < var22) { // L: 4814 4815
						var22 = Client.overheadTextYs[var32] - Client.overheadTextAscents[var32]; // L: 4816
						var25 = true; // L: 4817
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var20]; // L: 4822
			Client.viewportTempY = Client.overheadTextYs[var20] = var22; // L: 4823
			String var26 = Client.overheadText[var20]; // L: 4824
			if (Client.chatEffects == 0) { // L: 4825
				int var27 = 16776960; // L: 4826
				if (Client.overheadTextColors[var20] < 6) { // L: 4827
					var27 = Client.field769[Client.overheadTextColors[var20]];
				}

				if (Client.overheadTextColors[var20] == 6) { // L: 4828
					var27 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var20] == 7) { // L: 4829
					var27 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var20] == 8) { // L: 4830
					var27 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var28;
				if (Client.overheadTextColors[var20] == 9) { // L: 4831
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4832
					if (var28 < 50) { // L: 4833
						var27 = var28 * 1280 + 16711680;
					} else if (var28 < 100) { // L: 4834
						var27 = 16776960 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 4835
						var27 = (var28 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var20] == 10) { // L: 4837
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4838
					if (var28 < 50) { // L: 4839
						var27 = var28 * 5 + 16711680;
					} else if (var28 < 100) { // L: 4840
						var27 = 16711935 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 4841
						var27 = (var28 - 100) * 327680 + 255 - (var28 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var20] == 11) { // L: 4843
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4844
					if (var28 < 50) { // L: 4845
						var27 = 16777215 - var28 * 327685;
					} else if (var28 < 100) { // L: 4846
						var27 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) {
						var27 = 16777215 - (var28 - 100) * 327680; // L: 4847
					}
				}

				if (Client.overheadTextEffects[var20] == 0) { // L: 4849
					ChatChannel.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0);
				}

				if (Client.overheadTextEffects[var20] == 1) { // L: 4850
					ChatChannel.fontBold12.drawCenteredWave(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 2) { // L: 4851
					ChatChannel.fontBold12.drawCenteredWave2(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 3) { // L: 4852
					ChatChannel.fontBold12.drawCenteredShake(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var20]);
				}

				if (Client.overheadTextEffects[var20] == 4) { // L: 4853
					var28 = (150 - Client.overheadTextCyclesRemaining[var20]) * (ChatChannel.fontBold12.stringWidth(var26) + 100) / 150; // L: 4854
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4855
					ChatChannel.fontBold12.draw(var26, var0 + Client.viewportTempX + 50 - var28, Client.viewportTempY + var1, var27, 0); // L: 4856
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4857
				}

				if (Client.overheadTextEffects[var20] == 5) { // L: 4859
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4860
					int var29 = 0; // L: 4861
					if (var28 < 25) { // L: 4862
						var29 = var28 - 25;
					} else if (var28 > 125) { // L: 4863
						var29 = var28 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - ChatChannel.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4864
					ChatChannel.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, var29 + Client.viewportTempY + var1, var27, 0); // L: 4865
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4866
				}
			} else {
				ChatChannel.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4870
			}
		}

		if (Client.hintArrowType == 2) { // L: 4875
			AbstractWorldMapIcon.worldToScreen((Client.hintArrowX - SecureRandomCallable.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - GrandExchangeOfferOwnWorldComparator.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4876
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4877
				class21.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field727); // L: 4879
		class360.method6393(); // L: 4881
		class343.cameraX = var7; // L: 4883
		class295.cameraY = var8; // L: 4884
		FaceNormal.cameraZ = var9; // L: 4885
		GameEngine.cameraPitch = var10; // L: 4886
		StudioGame.cameraYaw = var11; // L: 4887
		if (Client.isLoading && HealthBarUpdate.method2181(true, false) == 0) { // L: 4888
			Client.isLoading = false;
		}

		if (Client.isLoading) { // L: 4889
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4890
			class259.drawLoadingMessage("Loading - please wait.", false); // L: 4891
		}

	} // L: 4893
}
