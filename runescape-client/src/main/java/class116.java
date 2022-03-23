import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public enum class116 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1420(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1419(1, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1425(2, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1421(3, 3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1423(4, 4);

	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -1986748855
	)
	static int field1418;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -810900463
	)
	final int field1422;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1964880943
	)
	final int field1424;

	class116(int var3, int var4) {
		this.field1422 = var3; // L: 121
		this.field1424 = var4; // L: 122
	} // L: 123

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1424; // L: 126
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgx;",
		garbageValue = "-48"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lco;IIIIII)V",
		garbageValue = "-151071027"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4464
			if (var0 instanceof NPC) { // L: 4465
				NPCComposition var6 = ((NPC)var0).definition; // L: 4466
				if (var6.transforms != null) { // L: 4467
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4468
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4470
			int[] var7 = Players.Players_indices; // L: 4471
			byte var8 = 0; // L: 4472
			if (var1 < var75 && var0.playerCycle == Client.cycle && ItemComposition.method3706((Player)var0)) { // L: 4473
				Player var9 = (Player)var0; // L: 4474
				if (var1 < var75) { // L: 4475
					WorldMapLabelSize.method4533(var0, var0.defaultHeight + 15); // L: 4476
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4477
					byte var11 = 9; // L: 4478
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 4479
					var8 = 18; // L: 4480
				}
			}

			int var76 = -2; // L: 4483
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6269()) { // L: 4484
				WorldMapLabelSize.method4533(var0, var0.defaultHeight + 15); // L: 4485

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 4486
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 4487
					if (var79 == null) { // L: 4488
						if (var87.isEmpty()) { // L: 4546
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 4489
						SpritePixels var13 = var80.getBackSprite(); // L: 4490
						SpritePixels var81 = var80.getFrontSprite(); // L: 4491
						int var82 = 0; // L: 4493
						if (var13 != null && var81 != null) { // L: 4494
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 4495
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4496
						} else {
							var15 = var80.width; // L: 4498
						}

						int var17 = 255; // L: 4499
						boolean var83 = true; // L: 4500
						int var84 = Client.cycle - var79.cycle; // L: 4501
						int var85 = var15 * var79.health2 / var80.width; // L: 4502
						int var86;
						int var94;
						if (var79.cycleOffset > var84) { // L: 4503
							var86 = var80.field1876 == 0 ? 0 : var80.field1876 * (var84 / var80.field1876); // L: 4504
							var22 = var15 * var79.health / var80.width; // L: 4505
							var94 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 4506
						} else {
							var94 = var85; // L: 4509
							var86 = var80.int5 + var79.cycleOffset - var84; // L: 4510
							if (var80.int3 >= 0) { // L: 4511
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var94 < 1) { // L: 4513
							var94 = 1;
						}

						if (var13 != null && var81 != null) { // L: 4514
							if (var94 == var15) { // L: 4515
								var94 += var82 * 2;
							} else {
								var94 += var82; // L: 4516
							}

							var86 = var13.subHeight; // L: 4517
							var76 += var86; // L: 4518
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4519
							var23 = var3 + Client.viewportTempY - var76; // L: 4520
							var22 -= var82; // L: 4521
							if (var17 >= 0 && var17 < 255) { // L: 4522
								var13.drawTransAt(var22, var23, var17); // L: 4523
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var94 + var22, var23 + var86); // L: 4524
								var81.drawTransAt(var22, var23, var17); // L: 4525
							} else {
								var13.drawTransBgAt(var22, var23); // L: 4528
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var94 + var22, var23 + var86); // L: 4529
								var81.drawTransBgAt(var22, var23); // L: 4530
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4532
							var76 += 2; // L: 4533
						} else {
							var76 += 5; // L: 4536
							if (Client.viewportTempX > -1) { // L: 4537
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4538
								var22 = var3 + Client.viewportTempY - var76; // L: 4539
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var94, 5, 65280); // L: 4540
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var86, var22, var15 - var94, 5, 16711680); // L: 4541
							}

							var76 += 2; // L: 4543
						}
					}
				}
			}

			if (var76 == -2) { // L: 4549
				var76 += 7;
			}

			var76 += var8; // L: 4550
			if (var1 < var75) { // L: 4551
				Player var88 = (Player)var0; // L: 4552
				if (var88.isHidden) { // L: 4553
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 4554
					WorldMapLabelSize.method4533(var0, var0.defaultHeight + 15); // L: 4555
					if (Client.viewportTempX > -1) { // L: 4556
						if (var88.headIconPk != -1) { // L: 4557
							var76 += 25; // L: 4558
							Bounds.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4559
						}

						if (var88.headIconPrayer != -1) { // L: 4561
							var76 += 25; // L: 4562
							DynamicObject.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4563
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4567
					WorldMapLabelSize.method4533(var0, var0.defaultHeight + 15); // L: 4568
					if (Client.viewportTempX > -1) { // L: 4569
						var76 += VarpDefinition.headIconHintSprites[1].subHeight; // L: 4570
						VarpDefinition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4571
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 4576
				if (var89.transforms != null) { // L: 4577
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < DynamicObject.headIconPrayerSprites.length) { // L: 4578
					WorldMapLabelSize.method4533(var0, var0.defaultHeight + 15); // L: 4579
					if (Client.viewportTempX > -1) { // L: 4580
						DynamicObject.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4581
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4584
					WorldMapLabelSize.method4533(var0, var0.defaultHeight + 15); // L: 4585
					if (Client.viewportTempX > -1) { // L: 4586
						VarpDefinition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1152 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4589 4590
				WorldMapLabelSize.method4533(var0, var0.defaultHeight); // L: 4591
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4592
					Client.overheadTextXOffsets[Client.overheadTextCount] = FloorOverlayDefinition.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4593
					Client.overheadTextAscents[Client.overheadTextCount] = FloorOverlayDefinition.fontBold12.ascent; // L: 4594
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4595
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4596
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4597
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4598
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4599
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4600
					++Client.overheadTextCount; // L: 4601
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 4605
				int var90 = var0.hitSplatCycles[var77]; // L: 4606
				int var12 = var0.hitSplatTypes[var77]; // L: 4607
				HitSplatDefinition var91 = null; // L: 4608
				int var14 = 0; // L: 4609
				if (var12 >= 0) { // L: 4610
					if (var90 <= Client.cycle) { // L: 4611
						continue;
					}

					var91 = GameEngine.method589(var0.hitSplatTypes[var77]); // L: 4612
					var14 = var91.field2025; // L: 4613
					if (var91 != null && var91.transforms != null) { // L: 4614
						var91 = var91.transform(); // L: 4615
						if (var91 == null) { // L: 4616
							var0.hitSplatCycles[var77] = -1; // L: 4617
							continue; // L: 4618
						}
					}
				} else if (var90 < 0) { // L: 4622
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 4623
				HitSplatDefinition var16 = null; // L: 4624
				if (var15 >= 0) { // L: 4625
					var16 = GameEngine.method589(var15); // L: 4626
					if (var16 != null && var16.transforms != null) { // L: 4627
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 4629
					if (var91 == null) { // L: 4630
						var0.hitSplatCycles[var77] = -1; // L: 4631
					} else {
						WorldMapLabelSize.method4533(var0, var0.defaultHeight / 2); // L: 4634
						if (Client.viewportTempX > -1) { // L: 4635
							boolean var92 = true; // L: 4636
							if (var77 == 1) { // L: 4637
								Client.viewportTempY -= 20; // L: 4638
							}

							if (var77 == 2) { // L: 4640
								Client.viewportTempX -= 15; // L: 4641
								Client.viewportTempY -= 10; // L: 4642
							}

							if (var77 == 3) { // L: 4644
								Client.viewportTempX += 15; // L: 4645
								Client.viewportTempY -= 10; // L: 4646
							}

							SpritePixels var18 = null; // L: 4648
							SpritePixels var19 = null; // L: 4649
							SpritePixels var20 = null; // L: 4650
							SpritePixels var21 = null; // L: 4651
							var22 = 0; // L: 4652
							var23 = 0; // L: 4653
							int var24 = 0; // L: 4654
							int var25 = 0; // L: 4655
							int var26 = 0; // L: 4656
							int var27 = 0; // L: 4657
							int var28 = 0; // L: 4658
							int var29 = 0; // L: 4659
							SpritePixels var30 = null; // L: 4660
							SpritePixels var31 = null; // L: 4661
							SpritePixels var32 = null; // L: 4662
							SpritePixels var33 = null; // L: 4663
							int var34 = 0; // L: 4664
							int var35 = 0; // L: 4665
							int var36 = 0; // L: 4666
							int var37 = 0; // L: 4667
							int var38 = 0; // L: 4668
							int var39 = 0; // L: 4669
							int var40 = 0; // L: 4670
							int var41 = 0; // L: 4671
							int var42 = 0; // L: 4672
							var18 = var91.method3611(); // L: 4673
							int var43;
							if (var18 != null) { // L: 4674
								var22 = var18.subWidth; // L: 4675
								var43 = var18.subHeight; // L: 4676
								if (var43 > var42) { // L: 4677
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 4678
							}

							var19 = var91.method3620(); // L: 4680
							if (var19 != null) { // L: 4681
								var23 = var19.subWidth; // L: 4682
								var43 = var19.subHeight; // L: 4683
								if (var43 > var42) { // L: 4684
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 4685
							}

							var20 = var91.method3613(); // L: 4687
							if (var20 != null) { // L: 4688
								var24 = var20.subWidth; // L: 4689
								var43 = var20.subHeight; // L: 4690
								if (var43 > var42) { // L: 4691
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 4692
							}

							var21 = var91.method3614(); // L: 4694
							if (var21 != null) { // L: 4695
								var25 = var21.subWidth; // L: 4696
								var43 = var21.subHeight; // L: 4697
								if (var43 > var42) { // L: 4698
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 4699
							}

							if (var16 != null) { // L: 4701
								var30 = var16.method3611(); // L: 4702
								if (var30 != null) { // L: 4703
									var34 = var30.subWidth; // L: 4704
									var43 = var30.subHeight; // L: 4705
									if (var43 > var42) { // L: 4706
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 4707
								}

								var31 = var16.method3620(); // L: 4709
								if (var31 != null) { // L: 4710
									var35 = var31.subWidth; // L: 4711
									var43 = var31.subHeight; // L: 4712
									if (var43 > var42) { // L: 4713
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 4714
								}

								var32 = var16.method3613(); // L: 4716
								if (var32 != null) { // L: 4717
									var36 = var32.subWidth; // L: 4718
									var43 = var32.subHeight; // L: 4719
									if (var43 > var42) { // L: 4720
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 4721
								}

								var33 = var16.method3614(); // L: 4723
								if (var33 != null) { // L: 4724
									var37 = var33.subWidth; // L: 4725
									var43 = var33.subHeight; // L: 4726
									if (var43 > var42) { // L: 4727
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 4728
								}
							}

							Font var78 = var91.getFont(); // L: 4733
							if (var78 == null) { // L: 4734
								var78 = TextureProvider.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 4735
								var44 = var16.getFont(); // L: 4736
								if (var44 == null) { // L: 4737
									var44 = TextureProvider.fontPlain11;
								}
							} else {
								var44 = TextureProvider.fontPlain11; // L: 4739
							}

							String var45 = null; // L: 4740
							String var46 = null; // L: 4741
							boolean var47 = false; // L: 4742
							int var48 = 0; // L: 4743
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 4744
							int var93 = var78.stringWidth(var45); // L: 4745
							if (var16 != null) { // L: 4746
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 4747
								var48 = var44.stringWidth(var46); // L: 4748
							}

							int var49 = 0; // L: 4750
							int var50 = 0; // L: 4751
							if (var23 > 0) { // L: 4752
								if (var20 == null && var21 == null) { // L: 4753
									var49 = 1; // L: 4754
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 4756 4757
								if (var32 == null && var33 == null) { // L: 4758
									var50 = 1; // L: 4759
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 4762
							int var52 = var51; // L: 4763
							if (var22 > 0) { // L: 4764
								var51 += var22;
							}

							var51 += 2; // L: 4765
							int var53 = var51; // L: 4766
							if (var24 > 0) { // L: 4767
								var51 += var24;
							}

							int var54 = var51; // L: 4768
							int var55 = var51; // L: 4769
							int var56;
							if (var23 > 0) { // L: 4770
								var56 = var49 * var23; // L: 4771
								var51 += var56; // L: 4772
								var55 += (var56 - var93) / 2; // L: 4773
							} else {
								var51 += var93; // L: 4776
							}

							var56 = var51; // L: 4778
							if (var25 > 0) { // L: 4779
								var51 += var25;
							}

							int var57 = 0; // L: 4780
							int var58 = 0; // L: 4781
							int var59 = 0; // L: 4782
							int var60 = 0; // L: 4783
							int var61 = 0; // L: 4784
							int var62;
							if (var16 != null) { // L: 4785
								var51 += 2; // L: 4786
								var57 = var51; // L: 4787
								if (var34 > 0) {
									var51 += var34; // L: 4788
								}

								var51 += 2; // L: 4789
								var58 = var51; // L: 4790
								if (var36 > 0) { // L: 4791
									var51 += var36;
								}

								var59 = var51; // L: 4792
								var61 = var51; // L: 4793
								if (var35 > 0) { // L: 4794
									var62 = var50 * var35; // L: 4795
									var51 += var62; // L: 4796
									var61 += (var62 - var48) / 2; // L: 4797
								} else {
									var51 += var48; // L: 4800
								}

								var60 = var51; // L: 4802
								if (var37 > 0) { // L: 4803
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 4805
							int var63 = var91.field2016 - var62 * var91.field2016 / var91.field2025; // L: 4806
							int var64 = var62 * var91.field2017 / var91.field2025 + -var91.field2017; // L: 4807
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 4808
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 4809
							int var67 = var66; // L: 4810
							int var68 = var66 + var42; // L: 4811
							int var69 = var66 + var91.field2021 + 15; // L: 4812
							int var70 = var69 - var78.maxAscent; // L: 4813
							int var71 = var69 + var78.maxDescent; // L: 4814
							if (var70 < var66) { // L: 4815
								var67 = var70;
							}

							if (var71 > var68) { // L: 4816
								var68 = var71;
							}

							int var72 = 0; // L: 4817
							int var73;
							int var74;
							if (var16 != null) { // L: 4818
								var72 = var66 + var16.field2021 + 15; // L: 4819
								var73 = var72 - var44.maxAscent; // L: 4820
								var74 = var72 + var44.maxDescent; // L: 4821
								if (var73 < var67) { // L: 4822
									;
								}

								if (var74 > var68) { // L: 4823
									;
								}
							}

							var73 = 255; // L: 4825
							if (var91.field2005 >= 0) { // L: 4826
								var73 = (var62 << 8) / (var91.field2025 - var91.field2005);
							}

							if (var73 >= 0 && var73 < 255) { // L: 4827
								if (var18 != null) { // L: 4828
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 4829
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) { // L: 4830
									for (var74 = 0; var74 < var49; ++var74) { // L: 4831
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 4832
									}
								}

								if (var21 != null) { // L: 4835
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var55 + var65, var69, var91.textColor, 0, var73); // L: 4836
								if (var16 != null) { // L: 4837
									if (var30 != null) { // L: 4838
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 4839
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 4840
										for (var74 = 0; var74 < var50; ++var74) { // L: 4841
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 4842
										}
									}

									if (var33 != null) { // L: 4845
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 4846
								}
							} else {
								if (var18 != null) { // L: 4850
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 4851
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 4852
									for (var74 = 0; var74 < var49; ++var74) { // L: 4853
										var19.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66); // L: 4854
									}
								}

								if (var21 != null) { // L: 4857
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var78.draw(var45, var55 + var65, var69, var91.textColor | -16777216, 0); // L: 4858
								if (var16 != null) { // L: 4859
									if (var30 != null) { // L: 4860
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 4861
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 4862
										for (var74 = 0; var74 < var50; ++var74) { // L: 4863
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 4864
										}
									}

									if (var33 != null) { // L: 4867
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var16.textColor | -16777216, 0); // L: 4868
								}
							}
						}
					}
				}
			}

		}
	} // L: 4873

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIZB)V",
		garbageValue = "24"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10185
		int var5 = var0.height; // L: 10186
		if (var0.widthAlignment == 0) { // L: 10187
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10188
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10189
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10190
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10191
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10192
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10193
			var0.width = var0.height * var0.field3359 / var0.field3360;
		}

		if (var0.heightAlignment == 4) { // L: 10194
			var0.height = var0.width * var0.field3360 / var0.field3359;
		}

		if (var0.contentType == 1337) { // L: 10195
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10196
			ScriptEvent var6 = new ScriptEvent(); // L: 10197
			var6.widget = var0; // L: 10198
			var6.args = var0.onResize; // L: 10199
			Client.scriptEvents.addFirst(var6); // L: 10200
		}

	} // L: 10202
}
