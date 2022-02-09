import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1945650937
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILgl;I)V",
		garbageValue = "-1216199003"
	)
	final void method2265(int var1, class185 var2) {
		int var3 = super.pathX[0]; // L: 15
		int var4 = super.pathY[0]; // L: 16
		if (var1 == 0) { // L: 17
			--var3; // L: 18
			++var4; // L: 19
		}

		if (var1 == 1) { // L: 21
			++var4;
		}

		if (var1 == 2) { // L: 22
			++var3; // L: 23
			++var4; // L: 24
		}

		if (var1 == 3) { // L: 26
			--var3;
		}

		if (var1 == 4) { // L: 27
			++var3;
		}

		if (var1 == 5) { // L: 28
			--var3; // L: 29
			--var4; // L: 30
		}

		if (var1 == 6) { // L: 32
			--var4;
		}

		if (var1 == 7) { // L: 33
			++var3; // L: 34
			--var4; // L: 35
		}

		if (super.sequence != -1 && class78.SequenceDefinition_get(super.sequence).field2099 == 1) { // L: 37
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 38
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 39
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 40
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 41
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 42
		}

		super.pathX[0] = var3; // L: 44
		super.pathY[0] = var4; // L: 45
		super.pathTraversed[0] = var2; // L: 46
	} // L: 47

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Lgf;",
		garbageValue = "39"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 77
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class78.SequenceDefinition_get(super.sequence) : null; // L: 78
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? class78.SequenceDefinition_get(super.movementSequence) : null; // L: 79
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 80
			if (var3 == null) { // L: 81
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 82
				super.defaultHeight = var3.height; // L: 83
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 84
					Model var4 = Widget.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 85
					if (var4 != null) { // L: 86
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 87
						Model[] var5 = new Model[]{var3, var4}; // L: 88
						var3 = new Model(var5, 2); // L: 89
					}
				}

				if (this.definition.size == 1) { // L: 92
					var3.isSingleTile = true;
				}

				if (super.field1167 != 0 && Client.cycle >= super.field1162 && Client.cycle < super.field1163) { // L: 93
					var3.overrideHue = super.field1164; // L: 94
					var3.overrideSaturation = super.field1155; // L: 95
					var3.overrideLuminance = super.field1166; // L: 96
					var3.overrideAmount = super.field1167; // L: 97
				} else {
					var3.overrideAmount = 0; // L: 100
				}

				return var3; // L: 102
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1453105386"
	)
	final void method2260(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class78.SequenceDefinition_get(super.sequence).field2099 == 1) { // L: 50
			super.sequence = -1;
		}

		if (!var3) { // L: 51
			int var4 = var1 - super.pathX[0]; // L: 52
			int var5 = var2 - super.pathY[0]; // L: 53
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 54
				if (super.pathLength < 9) { // L: 55
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 56
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 57
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 58
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 59
				}

				super.pathX[0] = var1; // L: 61
				super.pathY[0] = var2; // L: 62
				super.pathTraversed[0] = class185.field2135; // L: 63
				return; // L: 64
			}
		}

		super.pathLength = 0; // L: 67
		super.field1176 = 0; // L: 68
		super.field1175 = 0; // L: 69
		super.pathX[0] = var1; // L: 70
		super.pathY[0] = var2; // L: 71
		super.x = super.field1113 * 64 + super.pathX[0] * 128; // L: 72
		super.y = super.field1113 * 64 + super.pathY[0] * 128; // L: 73
	} // L: 74

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1570210948"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 106
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1849978508"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9389
			class11.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9390
		}

		long var4 = -1L; // L: 9393
		long var6 = -1L; // L: 9394

		int var8;
		for (var8 = 0; var8 < WorldMapSection0.method4702(); ++var8) { // L: 9395
			long var23 = class383.method6818(var8); // L: 9396
			if (var23 != var6) { // L: 9397
				var6 = var23; // L: 9398
				long var13 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9402
				int var12 = (int)(var13 >>> 0 & 127L); // L: 9404
				var12 = var12; // L: 9408
				int var26 = class186.method3690(var8); // L: 9409
				int var14 = class87.method2224(var8); // L: 9410
				int var15 = Skeleton.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9413
				int var16 = var15; // L: 9415
				if (var14 == 2 && Decimator.scene.getObjectFlags(SoundSystem.Client_plane, var12, var26, var23) >= 0) { // L: 9416 9417
					ObjectComposition var17 = ParamComposition.getObjectDefinition(var15); // L: 9418
					if (var17.transforms != null) { // L: 9419
						var17 = var17.transform();
					}

					if (var17 == null) { // L: 9420
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9421
						class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(65535) + var17.name, 1, var15, var12, var26); // L: 9422
					} else if (Client.isSpellSelected) { // L: 9425
						if ((RouteStrategy.selectedSpellFlags & 4) == 4) { // L: 9426
							class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(65535) + var17.name, 2, var15, var12, var26); // L: 9427
						}
					} else {
						String[] var18 = var17.actions; // L: 9432
						if (var18 != null) { // L: 9433
							for (int var19 = 4; var19 >= 0; --var19) { // L: 9434
								if (var18[var19] != null) { // L: 9435
									short var20 = 0; // L: 9436
									if (var19 == 0) { // L: 9437
										var20 = 3;
									}

									if (var19 == 1) { // L: 9438
										var20 = 4;
									}

									if (var19 == 2) { // L: 9439
										var20 = 5;
									}

									if (var19 == 3) { // L: 9440
										var20 = 6;
									}

									if (var19 == 4) { // L: 9441
										var20 = 1001;
									}

									class11.insertMenuItemNoShift(var18[var19], LoginScreenAnimation.colorStartTag(65535) + var17.name, var20, var16, var12, var26); // L: 9442
								}
							}
						}

						class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(65535) + var17.name, 1002, var17.id, var12, var26); // L: 9447
					}
				}

				Player var21;
				int var27;
				NPC var28;
				int var35;
				int[] var36;
				if (var14 == 1) { // L: 9452
					NPC var31 = Client.npcs[var16]; // L: 9453
					if (var31 == null) { // L: 9454
						continue;
					}

					if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) { // L: 9455
						for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 9456
							var28 = Client.npcs[Client.npcIndices[var27]]; // L: 9457
							if (var28 != null && var31 != var28 && var28.definition.size == 1 && var28.x == var31.x && var28.y == var31.y) { // L: 9458
								WorldMapAreaData.addNpcToMenu(var28, Client.npcIndices[var27], var12, var26);
							}
						}

						var27 = Players.Players_count; // L: 9460
						var36 = Players.Players_indices; // L: 9461

						for (var35 = 0; var35 < var27; ++var35) { // L: 9462
							var21 = Client.players[var36[var35]]; // L: 9463
							if (var21 != null && var21.x == var31.x && var21.y == var31.y) { // L: 9464
								class14.addPlayerToMenu(var21, var36[var35], var12, var26);
							}
						}
					}

					WorldMapAreaData.addNpcToMenu(var31, var16, var12, var26); // L: 9467
				}

				if (var14 == 0) { // L: 9469
					Player var32 = Client.players[var16]; // L: 9470
					if (var32 == null) { // L: 9471
						continue;
					}

					if ((var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 9472
						for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 9473
							var28 = Client.npcs[Client.npcIndices[var27]]; // L: 9474
							if (var28 != null && var28.definition.size == 1 && var28.x == var32.x && var28.y == var32.y) { // L: 9475
								WorldMapAreaData.addNpcToMenu(var28, Client.npcIndices[var27], var12, var26);
							}
						}

						var27 = Players.Players_count; // L: 9477
						var36 = Players.Players_indices; // L: 9478

						for (var35 = 0; var35 < var27; ++var35) { // L: 9479
							var21 = Client.players[var36[var35]]; // L: 9480
							if (var21 != null && var32 != var21 && var21.x == var32.x && var32.y == var21.y) { // L: 9481
								class14.addPlayerToMenu(var21, var36[var35], var12, var26);
							}
						}
					}

					if (var16 != Client.combatTargetPlayerIndex) { // L: 9484
						class14.addPlayerToMenu(var32, var16, var12, var26);
					} else {
						var4 = var23; // L: 9485
					}
				}

				if (var14 == 3) { // L: 9487
					NodeDeque var34 = Client.groundItems[SoundSystem.Client_plane][var12][var26]; // L: 9488
					if (var34 != null) { // L: 9489
						for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) { // L: 9490 9491 9524
							ItemComposition var37 = Client.ItemDefinition_get(var33.id); // L: 9492
							if (Client.isItemSelected == 1) { // L: 9493
								class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16748608) + var37.name, 16, var33.id, var12, var26); // L: 9494
							} else if (Client.isSpellSelected) { // L: 9497
								if ((RouteStrategy.selectedSpellFlags & 1) == 1) { // L: 9498
									class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16748608) + var37.name, 17, var33.id, var12, var26); // L: 9499
								}
							} else {
								String[] var29 = var37.groundActions; // L: 9504

								for (int var30 = 4; var30 >= 0; --var30) { // L: 9505
									if (var29 != null && var29[var30] != null) { // L: 9506
										byte var22 = 0; // L: 9507
										if (var30 == 0) { // L: 9508
											var22 = 18;
										}

										if (var30 == 1) { // L: 9509
											var22 = 19;
										}

										if (var30 == 2) { // L: 9510
											var22 = 20;
										}

										if (var30 == 3) { // L: 9511
											var22 = 21;
										}

										if (var30 == 4) { // L: 9512
											var22 = 22;
										}

										class11.insertMenuItemNoShift(var29[var30], LoginScreenAnimation.colorStartTag(16748608) + var37.name, var22, var33.id, var12, var26); // L: 9513
									} else if (var30 == 2) { // L: 9516
										class11.insertMenuItemNoShift("Take", LoginScreenAnimation.colorStartTag(16748608) + var37.name, 20, var33.id, var12, var26); // L: 9517
									}
								}

								class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16748608) + var37.name, 1004, var33.id, var12, var26); // L: 9521
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 9529
			var8 = (int)(var4 >>> 0 & 127L); // L: 9532
			int var10 = KeyHandler.method355(var4); // L: 9535
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9536
			class14.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9537
		}

	} // L: 9539
}
