import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "[Lhq;"
	)
	static Widget[] field115;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static Bounds field112;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1454055259
	)
	static int field114;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lf;Lf;I)I",
		garbageValue = "-1190870183"
	)
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljp;",
		garbageValue = "-615080564"
	)
	public static EnumDefinition getEnum(int var0) {
		EnumDefinition var1 = (EnumDefinition)EnumDefinition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumDefinition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumDefinition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumDefinition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "1335089944"
	)
	static int method231(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1259
			var5 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1260
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemId; // L: 1261
			return 1; // L: 1262
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1264
			var5 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1265
			if (var5.itemId != -1) { // L: 1266
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1267
			}

			return 1; // L: 1268
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1270
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1271
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1272
			if (var4 != null) { // L: 1273
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1274
			}

			return 1; // L: 1275
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1277
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1278
			return 1; // L: 1279
		} else {
			return 2; // L: 1281
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lbf;IIB)V",
		garbageValue = "2"
	)
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 3839
			int var3 = WorldMapRegion.SequenceDefinition_get(var1).field3535; // L: 3840
			if (var3 == 1) { // L: 3841
				var0.sequenceFrame = 0; // L: 3842
				var0.sequenceFrameCycle = 0; // L: 3843
				var0.sequenceDelay = var2; // L: 3844
				var0.field1009 = 0; // L: 3845
			}

			if (var3 == 2) { // L: 3847
				var0.field1009 = 0; // L: 3848
			}
		} else if (var1 == -1 || var0.sequence == -1 || WorldMapRegion.SequenceDefinition_get(var1).field3537 >= WorldMapRegion.SequenceDefinition_get(var0.sequence).field3537) { // L: 3851
			var0.sequence = var1; // L: 3852
			var0.sequenceFrame = 0; // L: 3853
			var0.sequenceFrameCycle = 0; // L: 3854
			var0.sequenceDelay = var2; // L: 3855
			var0.field1009 = 0; // L: 3856
			var0.field973 = var0.pathLength; // L: 3857
		}

	} // L: 3859

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IIIIII)V",
		garbageValue = "930508889"
	)
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4429
			if (var0 instanceof NPC) { // L: 4430
				NPCDefinition var6 = ((NPC)var0).definition; // L: 4431
				if (var6.transforms != null) { // L: 4432
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4433
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4435
			int[] var7 = Players.Players_indices; // L: 4436
			byte var8 = 0; // L: 4437
			if (var1 < var75 && var0.playerCycle == Client.cycle && PrivateChatMode.method6022((Player)var0)) { // L: 4438
				Player var9 = (Player)var0; // L: 4439
				if (var1 < var75) { // L: 4440
					Coord.method4086(var0, var0.defaultHeight + 15); // L: 4441
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4442
					byte var11 = 9; // L: 4443
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 4444
					var8 = 18; // L: 4445
				}
			}

			int var76 = -2; // L: 4448
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method4945()) { // L: 4449
				Coord.method4086(var0, var0.defaultHeight + 15); // L: 4450

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 4451
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 4452
					if (var79 == null) { // L: 4453
						if (var87.isEmpty()) { // L: 4511
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 4454
						Sprite var13 = var80.getBackSprite(); // L: 4455
						Sprite var81 = var80.getFrontSprite(); // L: 4456
						int var82 = 0; // L: 4458
						if (var13 != null && var81 != null) { // L: 4459
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 4460
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4461
						} else {
							var15 = var80.width; // L: 4463
						}

						int var17 = 255; // L: 4464
						boolean var83 = true; // L: 4465
						int var84 = Client.cycle - var79.cycle; // L: 4466
						int var85 = var15 * var79.health2 / var80.width; // L: 4467
						int var86;
						int var93;
						if (var79.cycleOffset > var84) { // L: 4468
							var86 = var80.field3310 == 0 ? 0 : var80.field3310 * (var84 / var80.field3310); // L: 4469
							var22 = var15 * var79.health / var80.width; // L: 4470
							var93 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 4471
						} else {
							var93 = var85; // L: 4474
							var86 = var79.cycleOffset + var80.int5 - var84; // L: 4475
							if (var80.int3 >= 0) { // L: 4476
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var93 < 1) { // L: 4478
							var93 = 1;
						}

						if (var13 != null && var81 != null) { // L: 4479
							if (var93 == var15) { // L: 4480
								var93 += var82 * 2;
							} else {
								var93 += var82; // L: 4481
							}

							var86 = var13.subHeight; // L: 4482
							var76 += var86; // L: 4483
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4484
							var23 = var3 + Client.viewportTempY - var76; // L: 4485
							var22 -= var82; // L: 4486
							if (var17 >= 0 && var17 < 255) { // L: 4487
								var13.drawTransAt(var22, var23, var17); // L: 4488
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var93, var86 + var23); // L: 4489
								var81.drawTransAt(var22, var23, var17); // L: 4490
							} else {
								var13.drawTransBgAt(var22, var23); // L: 4493
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var93 + var22, var23 + var86); // L: 4494
								var81.drawTransBgAt(var22, var23); // L: 4495
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4497
							var76 += 2; // L: 4498
						} else {
							var76 += 5; // L: 4501
							if (Client.viewportTempX > -1) { // L: 4502
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4503
								var22 = var3 + Client.viewportTempY - var76; // L: 4504
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var93, 5, 65280); // L: 4505
								Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var93, var22, var15 - var93, 5, 16711680); // L: 4506
							}

							var76 += 2; // L: 4508
						}
					}
				}
			}

			if (var76 == -2) { // L: 4514
				var76 += 7;
			}

			var76 += var8; // L: 4515
			if (var1 < var75) { // L: 4516
				Player var88 = (Player)var0; // L: 4517
				if (var88.isHidden) { // L: 4518
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 4519
					Coord.method4086(var0, var0.defaultHeight + 15); // L: 4520
					if (Client.viewportTempX > -1) { // L: 4521
						if (var88.headIconPk != -1) { // L: 4522
							var76 += 25; // L: 4523
							class279.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4524
						}

						if (var88.headIconPrayer != -1) { // L: 4526
							var76 += 25; // L: 4527
							Client.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4528
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4532
					Coord.method4086(var0, var0.defaultHeight + 15); // L: 4533
					if (Client.viewportTempX > -1) { // L: 4534
						var76 += Varcs.headIconHintSprites[1].subHeight; // L: 4535
						Varcs.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4536
					}
				}
			} else {
				NPCDefinition var89 = ((NPC)var0).definition; // L: 4541
				if (var89.transforms != null) { // L: 4542
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < Client.headIconPrayerSprites.length) { // L: 4543
					Coord.method4086(var0, var0.defaultHeight + 15); // L: 4544
					if (Client.viewportTempX > -1) { // L: 4545
						Client.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4546
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4549
					Coord.method4086(var0, var0.defaultHeight + 15); // L: 4550
					if (Client.viewportTempX > -1) { // L: 4551
						Varcs.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field986 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4554 4555
				Coord.method4086(var0, var0.defaultHeight); // L: 4556
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4557
					Client.overheadTextXOffsets[Client.overheadTextCount] = class4.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4558
					Client.overheadTextAscents[Client.overheadTextCount] = class4.fontBold12.ascent; // L: 4559
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4560
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4561
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4562
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4563
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4564
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4565
					++Client.overheadTextCount; // L: 4566
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 4570
				int var90 = var0.hitSplatCycles[var77]; // L: 4571
				int var12 = var0.hitSplatTypes[var77]; // L: 4572
				HitSplatDefinition var91 = null; // L: 4573
				int var14 = 0; // L: 4574
				if (var12 >= 0) { // L: 4575
					if (var90 <= Client.cycle) { // L: 4576
						continue;
					}

					var91 = MusicPatchNode.method3929(var0.hitSplatTypes[var77]); // L: 4577
					var14 = var91.field3356; // L: 4578
					if (var91 != null && var91.transforms != null) { // L: 4579
						var91 = var91.transform(); // L: 4580
						if (var91 == null) { // L: 4581
							var0.hitSplatCycles[var77] = -1; // L: 4582
							continue; // L: 4583
						}
					}
				} else if (var90 < 0) { // L: 4587
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 4588
				HitSplatDefinition var16 = null; // L: 4589
				if (var15 >= 0) { // L: 4590
					var16 = MusicPatchNode.method3929(var15); // L: 4591
					if (var16 != null && var16.transforms != null) { // L: 4592
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 4594
					if (var91 == null) { // L: 4595
						var0.hitSplatCycles[var77] = -1; // L: 4596
					} else {
						Coord.method4086(var0, var0.defaultHeight / 2); // L: 4599
						if (Client.viewportTempX > -1) { // L: 4600
							if (var77 == 1) { // L: 4602
								Client.viewportTempY -= 20; // L: 4603
							}

							if (var77 == 2) { // L: 4605
								Client.viewportTempX -= 15; // L: 4606
								Client.viewportTempY -= 10; // L: 4607
							}

							if (var77 == 3) { // L: 4609
								Client.viewportTempX += 15; // L: 4610
								Client.viewportTempY -= 10; // L: 4611
							}

							Sprite var18 = null; // L: 4613
							Sprite var19 = null; // L: 4614
							Sprite var20 = null; // L: 4615
							Sprite var21 = null; // L: 4616
							var22 = 0; // L: 4617
							var23 = 0; // L: 4618
							int var24 = 0; // L: 4619
							int var25 = 0; // L: 4620
							int var26 = 0; // L: 4621
							int var27 = 0; // L: 4622
							int var28 = 0; // L: 4623
							int var29 = 0; // L: 4624
							Sprite var30 = null; // L: 4625
							Sprite var31 = null; // L: 4626
							Sprite var32 = null; // L: 4627
							Sprite var33 = null; // L: 4628
							int var34 = 0; // L: 4629
							int var35 = 0; // L: 4630
							int var36 = 0; // L: 4631
							int var37 = 0; // L: 4632
							int var38 = 0; // L: 4633
							int var39 = 0; // L: 4634
							int var40 = 0; // L: 4635
							int var41 = 0; // L: 4636
							int var42 = 0; // L: 4637
							var18 = var91.method4668(); // L: 4638
							int var43;
							if (var18 != null) { // L: 4639
								var22 = var18.subWidth; // L: 4640
								var43 = var18.subHeight; // L: 4641
								if (var43 > var42) { // L: 4642
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 4643
							}

							var19 = var91.method4681(); // L: 4645
							if (var19 != null) { // L: 4646
								var23 = var19.subWidth; // L: 4647
								var43 = var19.subHeight; // L: 4648
								if (var43 > var42) { // L: 4649
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 4650
							}

							var20 = var91.method4670(); // L: 4652
							if (var20 != null) { // L: 4653
								var24 = var20.subWidth; // L: 4654
								var43 = var20.subHeight; // L: 4655
								if (var43 > var42) { // L: 4656
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 4657
							}

							var21 = var91.method4678(); // L: 4659
							if (var21 != null) { // L: 4660
								var25 = var21.subWidth; // L: 4661
								var43 = var21.subHeight; // L: 4662
								if (var43 > var42) { // L: 4663
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 4664
							}

							if (var16 != null) { // L: 4666
								var30 = var16.method4668(); // L: 4667
								if (var30 != null) { // L: 4668
									var34 = var30.subWidth; // L: 4669
									var43 = var30.subHeight; // L: 4670
									if (var43 > var42) { // L: 4671
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 4672
								}

								var31 = var16.method4681(); // L: 4674
								if (var31 != null) { // L: 4675
									var35 = var31.subWidth; // L: 4676
									var43 = var31.subHeight; // L: 4677
									if (var43 > var42) { // L: 4678
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 4679
								}

								var32 = var16.method4670(); // L: 4681
								if (var32 != null) { // L: 4682
									var36 = var32.subWidth; // L: 4683
									var43 = var32.subHeight; // L: 4684
									if (var43 > var42) { // L: 4685
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 4686
								}

								var33 = var16.method4678(); // L: 4688
								if (var33 != null) { // L: 4689
									var37 = var33.subWidth; // L: 4690
									var43 = var33.subHeight; // L: 4691
									if (var43 > var42) { // L: 4692
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 4693
								}
							}

							Font var78 = var91.getFont(); // L: 4698
							if (var78 == null) { // L: 4699
								var78 = DynamicObject.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 4700
								var44 = var16.getFont(); // L: 4701
								if (var44 == null) { // L: 4702
									var44 = DynamicObject.fontPlain11;
								}
							} else {
								var44 = DynamicObject.fontPlain11; // L: 4704
							}

							String var45 = null; // L: 4705
							String var46 = null; // L: 4706
							boolean var47 = false; // L: 4707
							int var48 = 0; // L: 4708
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 4709
							int var92 = var78.stringWidth(var45); // L: 4710
							if (var16 != null) { // L: 4711
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 4712
								var48 = var44.stringWidth(var46); // L: 4713
							}

							int var49 = 0; // L: 4715
							int var50 = 0; // L: 4716
							if (var23 > 0) { // L: 4717
								if (var20 == null && var21 == null) { // L: 4718
									var49 = 1; // L: 4719
								} else {
									var49 = var92 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 4721 4722
								if (var32 == null && var33 == null) { // L: 4723
									var50 = 1; // L: 4724
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 4727
							int var52 = var51; // L: 4728
							if (var22 > 0) { // L: 4729
								var51 += var22;
							}

							var51 += 2; // L: 4730
							int var53 = var51; // L: 4731
							if (var24 > 0) { // L: 4732
								var51 += var24;
							}

							int var54 = var51; // L: 4733
							int var55 = var51; // L: 4734
							int var56;
							if (var23 > 0) { // L: 4735
								var56 = var49 * var23; // L: 4736
								var51 += var56; // L: 4737
								var55 += (var56 - var92) / 2; // L: 4738
							} else {
								var51 += var92; // L: 4741
							}

							var56 = var51; // L: 4743
							if (var25 > 0) { // L: 4744
								var51 += var25;
							}

							int var57 = 0; // L: 4745
							int var58 = 0; // L: 4746
							int var59 = 0; // L: 4747
							int var60 = 0; // L: 4748
							int var61 = 0; // L: 4749
							int var62;
							if (var16 != null) { // L: 4750
								var51 += 2; // L: 4751
								var57 = var51; // L: 4752
								if (var34 > 0) {
									var51 += var34; // L: 4753
								}

								var51 += 2; // L: 4754
								var58 = var51; // L: 4755
								if (var36 > 0) { // L: 4756
									var51 += var36;
								}

								var59 = var51; // L: 4757
								var61 = var51; // L: 4758
								if (var35 > 0) { // L: 4759
									var62 = var35 * var50; // L: 4760
									var51 += var62; // L: 4761
									var61 += (var62 - var48) / 2; // L: 4762
								} else {
									var51 += var48; // L: 4765
								}

								var60 = var51; // L: 4767
								if (var37 > 0) { // L: 4768
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 4770
							int var63 = var91.field3368 - var62 * var91.field3368 / var91.field3356; // L: 4771
							int var64 = var62 * var91.field3362 / var91.field3356 + -var91.field3362; // L: 4772
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 4773
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 4774
							int var67 = var66; // L: 4775
							int var68 = var66 + var42; // L: 4776
							int var69 = var66 + var91.field3366 + 15; // L: 4777
							int var70 = var69 - var78.maxAscent; // L: 4778
							int var71 = var69 + var78.maxDescent; // L: 4779
							if (var70 < var66) { // L: 4780
								var67 = var70;
							}

							if (var71 > var68) { // L: 4781
								var68 = var71;
							}

							int var72 = 0; // L: 4782
							int var73;
							int var74;
							if (var16 != null) { // L: 4783
								var72 = var66 + var16.field3366 + 15; // L: 4784
								var73 = var72 - var44.maxAscent; // L: 4785
								var74 = var72 + var44.maxDescent; // L: 4786
								if (var73 < var67) { // L: 4787
									;
								}

								if (var74 > var68) { // L: 4788
									;
								}
							}

							var73 = 255; // L: 4790
							if (var91.field3355 >= 0) { // L: 4791
								var73 = (var62 << 8) / (var91.field3356 - var91.field3355);
							}

							if (var73 >= 0 && var73 < 255) { // L: 4792
								if (var18 != null) { // L: 4793
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 4794
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 4795
									for (var74 = 0; var74 < var49; ++var74) { // L: 4796
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 4797
									}
								}

								if (var21 != null) { // L: 4800
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var65 + var55, var69, var91.textColor, 0, var73); // L: 4801
								if (var16 != null) { // L: 4802
									if (var30 != null) { // L: 4803
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 4804
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 4805
										for (var74 = 0; var74 < var50; ++var74) { // L: 4806
											var31.drawTransAt(var35 * var74 + (var65 + var59 - var39), var66, var73); // L: 4807
										}
									}

									if (var33 != null) { // L: 4810
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 4811
								}
							} else {
								if (var18 != null) { // L: 4815
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 4816
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 4817
									for (var74 = 0; var74 < var49; ++var74) { // L: 4818
										var19.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66); // L: 4819
									}
								}

								if (var21 != null) { // L: 4822
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var78.draw(var45, var55 + var65, var69, var91.textColor | -16777216, 0); // L: 4823
								if (var16 != null) { // L: 4824
									if (var30 != null) { // L: 4825
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 4826
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 4827
										for (var74 = 0; var74 < var50; ++var74) { // L: 4828
											var31.drawTransBgAt(var74 * var35 + (var59 + var65 - var39), var66); // L: 4829
										}
									}

									if (var33 != null) { // L: 4832
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 4833
								}
							}
						}
					}
				}
			}

		}
	} // L: 4838

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lhq;II)I",
		garbageValue = "1175033265"
	)
	static final int method230(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 9351
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 9353
				int var3 = 0; // L: 9354
				int var4 = 0; // L: 9355
				byte var5 = 0; // L: 9356

				while (true) {
					int var6 = var2[var4++]; // L: 9358
					int var7 = 0; // L: 9359
					byte var8 = 0; // L: 9360
					if (var6 == 0) { // L: 9361
						return var3;
					}

					if (var6 == 1) { // L: 9362
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 9363
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 9364
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 9365
						var9 = var2[var4++] << 16; // L: 9366
						var9 += var2[var4++]; // L: 9367
						var10 = TileItem.getWidget(var9); // L: 9368
						var11 = var2[var4++]; // L: 9369
						if (var11 != -1 && (!GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 9370
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 9371
								if (var11 + 1 == var10.itemIds[var12]) { // L: 9372
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 9376
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 9377
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 9378
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 9379
						var7 = WorldMapLabelSize.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 9380
						for (var9 = 0; var9 < 25; ++var9) { // L: 9381
							if (Skills.Skills_enabled[var9]) { // L: 9382
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 9385
						var9 = var2[var4++] << 16; // L: 9386
						var9 += var2[var4++]; // L: 9387
						var10 = TileItem.getWidget(var9); // L: 9388
						var11 = var2[var4++]; // L: 9389
						if (var11 != -1 && (!GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 9390
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 9391
								if (var11 + 1 == var10.itemIds[var12]) { // L: 9392
									var7 = 999999999; // L: 9393
									break; // L: 9394
								}
							}
						}
					}

					if (var6 == 11) { // L: 9399
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 9400
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 9401
						var9 = Varps.Varps_main[var2[var4++]]; // L: 9402
						int var13 = var2[var4++]; // L: 9403
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 9404
					}

					if (var6 == 14) { // L: 9406
						var9 = var2[var4++]; // L: 9407
						var7 = WorldMapSection1.getVarbit(var9); // L: 9408
					}

					if (var6 == 15) { // L: 9410
						var8 = 1;
					}

					if (var6 == 16) { // L: 9411
						var8 = 2;
					}

					if (var6 == 17) { // L: 9412
						var8 = 3;
					}

					if (var6 == 18) { // L: 9413
						var7 = (WorldMapLabelSize.localPlayer.x >> 7) + WorldMapManager.baseX;
					}

					if (var6 == 19) { // L: 9414
						var7 = (WorldMapLabelSize.localPlayer.y >> 7) + WorldMapLabel.baseY;
					}

					if (var6 == 20) { // L: 9415
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 9416
						if (var5 == 0) { // L: 9417
							var3 += var7;
						}

						if (var5 == 1) { // L: 9418
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 9419
							var3 /= var7;
						}

						if (var5 == 3) { // L: 9420
							var3 *= var7;
						}

						var5 = 0; // L: 9421
					} else {
						var5 = var8; // L: 9423
					}
				}
			} catch (Exception var14) { // L: 9426
				return -1; // L: 9427
			}
		} else {
			return -2;
		}
	}
}
