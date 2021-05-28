import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -114974043
	)
	static int field3847;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -792451577
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)I",
		garbageValue = "-208555214"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)I",
		garbageValue = "539732409"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lcy;IIIIII)V",
		garbageValue = "-82802445"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4450
			if (var0 instanceof NPC) { // L: 4451
				NPCComposition var6 = ((NPC)var0).definition; // L: 4452
				if (var6.transforms != null) { // L: 4453
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4454
					return;
				}
			}

			int var76 = Players.Players_count; // L: 4456
			int[] var7 = Players.Players_indices; // L: 4457
			byte var8 = 0; // L: 4458
			int var10;
			if (var1 < var76 && var0.playerCycle == Client.cycle && WorldMapIcon_1.method3232((Player)var0)) { // L: 4459
				Player var9 = (Player)var0; // L: 4460
				if (var1 < var76) { // L: 4461
					var10 = var0.defaultHeight + 15; // L: 4462
					GrandExchangeEvents.worldToScreen(var0.x, var0.y, var10); // L: 4464
					AbstractFont var11 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4466
					byte var12 = 9; // L: 4467
					var11.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var12, 16777215, 0); // L: 4468
					var8 = 18; // L: 4469
				}
			}

			int var77 = -2; // L: 4472
			int var17;
			int var23;
			int var24;
			if (!var0.healthBars.method5236()) { // L: 4473
				var10 = var0.defaultHeight + 15; // L: 4474
				GrandExchangeEvents.worldToScreen(var0.x, var0.y, var10); // L: 4476

				for (HealthBar var89 = (HealthBar)var0.healthBars.last(); var89 != null; var89 = (HealthBar)var0.healthBars.previous()) { // L: 4478
					HealthBarUpdate var81 = var89.get(Client.cycle); // L: 4479
					if (var81 == null) { // L: 4480
						if (var89.isEmpty()) { // L: 4538
							var89.remove();
						}
					} else {
						HealthBarDefinition var13 = var89.definition; // L: 4481
						SpritePixels var82 = var13.getBackSprite(); // L: 4482
						SpritePixels var83 = var13.getFrontSprite(); // L: 4483
						var17 = 0; // L: 4485
						int var84;
						if (var82 != null && var83 != null) { // L: 4486
							if (var13.widthPadding * 2 < var83.subWidth) { // L: 4487
								var17 = var13.widthPadding;
							}

							var84 = var83.subWidth - var17 * 2; // L: 4488
						} else {
							var84 = var13.width; // L: 4490
						}

						int var18 = 255; // L: 4491
						boolean var85 = true; // L: 4492
						int var86 = Client.cycle - var81.cycle; // L: 4493
						int var87 = var84 * var81.health2 / var13.width; // L: 4494
						int var88;
						int var94;
						if (var81.cycleOffset > var86) { // L: 4495
							var88 = var13.field1608 == 0 ? 0 : var13.field1608 * (var86 / var13.field1608); // L: 4496
							var23 = var84 * var81.health / var13.width; // L: 4497
							var94 = var88 * (var87 - var23) / var81.cycleOffset + var23; // L: 4498
						} else {
							var94 = var87; // L: 4501
							var88 = var13.int5 + var81.cycleOffset - var86; // L: 4502
							if (var13.int3 >= 0) { // L: 4503
								var18 = (var88 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var81.health2 > 0 && var94 < 1) { // L: 4505
							var94 = 1;
						}

						if (var82 != null && var83 != null) { // L: 4506
							if (var94 == var84) { // L: 4507
								var94 += var17 * 2;
							} else {
								var94 += var17; // L: 4508
							}

							var88 = var82.subHeight; // L: 4509
							var77 += var88; // L: 4510
							var23 = var2 + Client.viewportTempX - (var84 >> 1); // L: 4511
							var24 = var3 + Client.viewportTempY - var77; // L: 4512
							var23 -= var17; // L: 4513
							if (var18 >= 0 && var18 < 255) { // L: 4514
								var82.drawTransAt(var23, var24, var18); // L: 4515
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var94 + var23, var24 + var88); // L: 4516
								var83.drawTransAt(var23, var24, var18); // L: 4517
							} else {
								var82.drawTransBgAt(var23, var24); // L: 4520
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var24 + var88); // L: 4521
								var83.drawTransBgAt(var23, var24); // L: 4522
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4524
							var77 += 2; // L: 4525
						} else {
							var77 += 5; // L: 4528
							if (Client.viewportTempX > -1) { // L: 4529
								var88 = var2 + Client.viewportTempX - (var84 >> 1); // L: 4530
								var23 = var3 + Client.viewportTempY - var77; // L: 4531
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var23, var94, 5, 65280); // L: 4532
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var94, var23, var84 - var94, 5, 16711680); // L: 4533
							}

							var77 += 2; // L: 4535
						}
					}
				}
			}

			if (var77 == -2) { // L: 4541
				var77 += 7;
			}

			var77 += var8; // L: 4542
			int var79;
			if (var1 < var76) { // L: 4543
				Player var78 = (Player)var0; // L: 4544
				if (var78.isHidden) { // L: 4545
					return;
				}

				if (var78.headIconPk != -1 || var78.headIconPrayer != -1) { // L: 4546
					var79 = var0.defaultHeight + 15; // L: 4547
					GrandExchangeEvents.worldToScreen(var0.x, var0.y, var79); // L: 4549
					if (Client.viewportTempX > -1) { // L: 4551
						if (var78.headIconPk != -1) { // L: 4552
							var77 += 25; // L: 4553
							class35.headIconPkSprites[var78.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77); // L: 4554
						}

						if (var78.headIconPrayer != -1) { // L: 4556
							var77 += 25; // L: 4557
							TextureProvider.headIconPrayerSprites[var78.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77); // L: 4558
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4562
					var79 = var0.defaultHeight + 15; // L: 4563
					GrandExchangeEvents.worldToScreen(var0.x, var0.y, var79); // L: 4565
					if (Client.viewportTempX > -1) { // L: 4567
						var77 += PacketBufferNode.headIconHintSprites[1].subHeight; // L: 4568
						PacketBufferNode.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77); // L: 4569
					}
				}
			} else {
				NPCComposition var93 = ((NPC)var0).definition; // L: 4574
				if (var93.transforms != null) { // L: 4575
					var93 = var93.transform();
				}

				if (var93.headIconPrayer >= 0 && var93.headIconPrayer < TextureProvider.headIconPrayerSprites.length) { // L: 4576
					var79 = var0.defaultHeight + 15; // L: 4577
					GrandExchangeEvents.worldToScreen(var0.x, var0.y, var79); // L: 4579
					if (Client.viewportTempX > -1) { // L: 4581
						TextureProvider.headIconPrayerSprites[var93.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4582
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4585
					var79 = var0.defaultHeight + 15; // L: 4586
					GrandExchangeEvents.worldToScreen(var0.x, var0.y, var79); // L: 4588
					if (Client.viewportTempX > -1) { // L: 4590
						PacketBufferNode.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field1248 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4593 4594
				var10 = var0.defaultHeight; // L: 4595
				GrandExchangeEvents.worldToScreen(var0.x, var0.y, var10); // L: 4597
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4599
					Client.overheadTextXOffsets[Client.overheadTextCount] = Widget.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4600
					Client.overheadTextAscents[Client.overheadTextCount] = Widget.fontBold12.ascent; // L: 4601
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4602
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4603
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4604
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4605
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4606
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4607
					++Client.overheadTextCount; // L: 4608
				}
			}

			for (var10 = 0; var10 < 4; ++var10) { // L: 4612
				var79 = var0.hitSplatCycles[var10]; // L: 4613
				int var90 = var0.hitSplatTypes[var10]; // L: 4614
				HitSplatDefinition var91 = null; // L: 4615
				int var14 = 0; // L: 4616
				if (var90 >= 0) { // L: 4617
					if (var79 <= Client.cycle) { // L: 4618
						continue;
					}

					var91 = Projectile.method1966(var0.hitSplatTypes[var10]); // L: 4619
					var14 = var91.field1731; // L: 4620
					if (var91 != null && var91.transforms != null) { // L: 4621
						var91 = var91.transform(); // L: 4622
						if (var91 == null) { // L: 4623
							var0.hitSplatCycles[var10] = -1; // L: 4624
							continue; // L: 4625
						}
					}
				} else if (var79 < 0) { // L: 4629
					continue;
				}

				int var15 = var0.hitSplatTypes2[var10]; // L: 4630
				HitSplatDefinition var16 = null; // L: 4631
				if (var15 >= 0) { // L: 4632
					var16 = Projectile.method1966(var15); // L: 4633
					if (var16 != null && var16.transforms != null) { // L: 4634
						var16 = var16.transform();
					}
				}

				if (var79 - var14 <= Client.cycle) { // L: 4636
					if (var91 == null) { // L: 4637
						var0.hitSplatCycles[var10] = -1; // L: 4638
					} else {
						var17 = var0.defaultHeight / 2; // L: 4641
						GrandExchangeEvents.worldToScreen(var0.x, var0.y, var17); // L: 4643
						if (Client.viewportTempX > -1) { // L: 4645
							if (var10 == 1) { // L: 4647
								Client.viewportTempY -= 20; // L: 4648
							}

							if (var10 == 2) { // L: 4650
								Client.viewportTempX -= 15; // L: 4651
								Client.viewportTempY -= 10; // L: 4652
							}

							if (var10 == 3) { // L: 4654
								Client.viewportTempX += 15; // L: 4655
								Client.viewportTempY -= 10; // L: 4656
							}

							SpritePixels var19 = null; // L: 4658
							SpritePixels var20 = null; // L: 4659
							SpritePixels var21 = null; // L: 4660
							SpritePixels var22 = null; // L: 4661
							var23 = 0; // L: 4662
							var24 = 0; // L: 4663
							int var25 = 0; // L: 4664
							int var26 = 0; // L: 4665
							int var27 = 0; // L: 4666
							int var28 = 0; // L: 4667
							int var29 = 0; // L: 4668
							int var30 = 0; // L: 4669
							SpritePixels var31 = null; // L: 4670
							SpritePixels var32 = null; // L: 4671
							SpritePixels var33 = null; // L: 4672
							SpritePixels var34 = null; // L: 4673
							int var35 = 0; // L: 4674
							int var36 = 0; // L: 4675
							int var37 = 0; // L: 4676
							int var38 = 0; // L: 4677
							int var39 = 0; // L: 4678
							int var40 = 0; // L: 4679
							int var41 = 0; // L: 4680
							int var42 = 0; // L: 4681
							int var43 = 0; // L: 4682
							var19 = var91.method2916(); // L: 4683
							int var44;
							if (var19 != null) { // L: 4684
								var23 = var19.subWidth; // L: 4685
								var44 = var19.subHeight; // L: 4686
								if (var44 > var43) { // L: 4687
									var43 = var44;
								}

								var27 = var19.xOffset; // L: 4688
							}

							var20 = var91.method2931(); // L: 4690
							if (var20 != null) { // L: 4691
								var24 = var20.subWidth; // L: 4692
								var44 = var20.subHeight; // L: 4693
								if (var44 > var43) { // L: 4694
									var43 = var44;
								}

								var28 = var20.xOffset; // L: 4695
							}

							var21 = var91.method2951(); // L: 4697
							if (var21 != null) { // L: 4698
								var25 = var21.subWidth; // L: 4699
								var44 = var21.subHeight; // L: 4700
								if (var44 > var43) { // L: 4701
									var43 = var44;
								}

								var29 = var21.xOffset; // L: 4702
							}

							var22 = var91.method2945(); // L: 4704
							if (var22 != null) { // L: 4705
								var26 = var22.subWidth; // L: 4706
								var44 = var22.subHeight; // L: 4707
								if (var44 > var43) { // L: 4708
									var43 = var44;
								}

								var30 = var22.xOffset; // L: 4709
							}

							if (var16 != null) { // L: 4711
								var31 = var16.method2916(); // L: 4712
								if (var31 != null) { // L: 4713
									var35 = var31.subWidth; // L: 4714
									var44 = var31.subHeight; // L: 4715
									if (var44 > var43) { // L: 4716
										var43 = var44;
									}

									var39 = var31.xOffset; // L: 4717
								}

								var32 = var16.method2931(); // L: 4719
								if (var32 != null) { // L: 4720
									var36 = var32.subWidth; // L: 4721
									var44 = var32.subHeight; // L: 4722
									if (var44 > var43) { // L: 4723
										var43 = var44;
									}

									var40 = var32.xOffset; // L: 4724
								}

								var33 = var16.method2951(); // L: 4726
								if (var33 != null) { // L: 4727
									var37 = var33.subWidth; // L: 4728
									var44 = var33.subHeight; // L: 4729
									if (var44 > var43) { // L: 4730
										var43 = var44;
									}

									var41 = var33.xOffset; // L: 4731
								}

								var34 = var16.method2945(); // L: 4733
								if (var34 != null) { // L: 4734
									var38 = var34.subWidth; // L: 4735
									var44 = var34.subHeight; // L: 4736
									if (var44 > var43) { // L: 4737
										var43 = var44;
									}

									var42 = var34.xOffset; // L: 4738
								}
							}

							Font var80 = var91.getFont(); // L: 4743
							if (var80 == null) { // L: 4744
								var80 = Actor.fontPlain11;
							}

							Font var45;
							if (var16 != null) { // L: 4745
								var45 = var16.getFont(); // L: 4746
								if (var45 == null) { // L: 4747
									var45 = Actor.fontPlain11;
								}
							} else {
								var45 = Actor.fontPlain11; // L: 4749
							}

							String var46 = null; // L: 4750
							String var47 = null; // L: 4751
							boolean var48 = false; // L: 4752
							int var49 = 0; // L: 4753
							var46 = var91.getString(var0.hitSplatValues[var10]); // L: 4754
							int var92 = var80.stringWidth(var46); // L: 4755
							if (var16 != null) { // L: 4756
								var47 = var16.getString(var0.hitSplatValues2[var10]); // L: 4757
								var49 = var45.stringWidth(var47); // L: 4758
							}

							int var50 = 0; // L: 4760
							int var51 = 0; // L: 4761
							if (var24 > 0) { // L: 4762
								if (var21 == null && var22 == null) { // L: 4763
									var50 = 1; // L: 4764
								} else {
									var50 = var92 / var24 + 1;
								}
							}

							if (var16 != null && var36 > 0) { // L: 4766 4767
								if (var33 == null && var34 == null) { // L: 4768
									var51 = 1; // L: 4769
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0; // L: 4772
							int var53 = var52; // L: 4773
							if (var23 > 0) { // L: 4774
								var52 += var23;
							}

							var52 += 2; // L: 4775
							int var54 = var52; // L: 4776
							if (var25 > 0) { // L: 4777
								var52 += var25;
							}

							int var55 = var52; // L: 4778
							int var56 = var52; // L: 4779
							int var57;
							if (var24 > 0) { // L: 4780
								var57 = var24 * var50; // L: 4781
								var52 += var57; // L: 4782
								var56 += (var57 - var92) / 2; // L: 4783
							} else {
								var52 += var92; // L: 4786
							}

							var57 = var52; // L: 4788
							if (var26 > 0) { // L: 4789
								var52 += var26;
							}

							int var58 = 0; // L: 4790
							int var59 = 0; // L: 4791
							int var60 = 0; // L: 4792
							int var61 = 0; // L: 4793
							int var62 = 0; // L: 4794
							int var63;
							if (var16 != null) { // L: 4795
								var52 += 2; // L: 4796
								var58 = var52; // L: 4797
								if (var35 > 0) { // L: 4798
									var52 += var35;
								}

								var52 += 2; // L: 4799
								var59 = var52; // L: 4800
								if (var37 > 0) { // L: 4801
									var52 += var37;
								}

								var60 = var52; // L: 4802
								var62 = var52; // L: 4803
								if (var36 > 0) { // L: 4804
									var63 = var36 * var51; // L: 4805
									var52 += var63; // L: 4806
									var62 += (var63 - var49) / 2; // L: 4807
								} else {
									var52 += var49; // L: 4810
								}

								var61 = var52; // L: 4812
								if (var38 > 0) { // L: 4813
									var52 += var38;
								}
							}

							var63 = var0.hitSplatCycles[var10] - Client.cycle; // L: 4815
							int var64 = var91.field1739 - var63 * var91.field1739 / var91.field1731; // L: 4816
							int var65 = var63 * var91.field1740 / var91.field1731 + -var91.field1740; // L: 4817
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1)); // L: 4818
							int var67 = var3 + Client.viewportTempY - 12 + var65; // L: 4819
							int var68 = var67; // L: 4820
							int var69 = var67 + var43; // L: 4821
							int var70 = var67 + var91.field1744 + 15; // L: 4822
							int var71 = var70 - var80.maxAscent; // L: 4823
							int var72 = var70 + var80.maxDescent; // L: 4824
							if (var71 < var67) { // L: 4825
								var68 = var71;
							}

							if (var72 > var69) { // L: 4826
								var69 = var72;
							}

							int var73 = 0; // L: 4827
							int var74;
							int var75;
							if (var16 != null) { // L: 4828
								var73 = var67 + var16.field1744 + 15; // L: 4829
								var74 = var73 - var45.maxAscent; // L: 4830
								var75 = var73 + var45.maxDescent; // L: 4831
								if (var74 < var68) { // L: 4832
									;
								}

								if (var75 > var69) { // L: 4833
									;
								}
							}

							var74 = 255; // L: 4835
							if (var91.field1749 >= 0) { // L: 4836
								var74 = (var63 << 8) / (var91.field1731 - var91.field1749);
							}

							if (var74 >= 0 && var74 < 255) { // L: 4837
								if (var19 != null) { // L: 4838
									var19.drawTransAt(var53 + var66 - var27, var67, var74);
								}

								if (var21 != null) { // L: 4839
									var21.drawTransAt(var66 + var54 - var29, var67, var74);
								}

								if (var20 != null) { // L: 4840
									for (var75 = 0; var75 < var50; ++var75) { // L: 4841
										var20.drawTransAt(var24 * var75 + (var66 + var55 - var28), var67, var74); // L: 4842
									}
								}

								if (var22 != null) { // L: 4845
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var80.drawAlpha(var46, var66 + var56, var70, var91.textColor, 0, var74); // L: 4846
								if (var16 != null) { // L: 4847
									if (var31 != null) { // L: 4848
										var31.drawTransAt(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) { // L: 4849
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) { // L: 4850
										for (var75 = 0; var75 < var51; ++var75) { // L: 4851
											var32.drawTransAt(var36 * var75 + (var60 + var66 - var40), var67, var74); // L: 4852
										}
									}

									if (var34 != null) { // L: 4855
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var62 + var66, var73, var16.textColor, 0, var74); // L: 4856
								}
							} else {
								if (var19 != null) { // L: 4860
									var19.drawTransBgAt(var66 + var53 - var27, var67);
								}

								if (var21 != null) { // L: 4861
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}

								if (var20 != null) { // L: 4862
									for (var75 = 0; var75 < var50; ++var75) { // L: 4863
										var20.drawTransBgAt(var24 * var75 + (var55 + var66 - var28), var67); // L: 4864
									}
								}

								if (var22 != null) { // L: 4867
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var80.draw(var46, var66 + var56, var70, var91.textColor | -16777216, 0); // L: 4868
								if (var16 != null) { // L: 4869
									if (var31 != null) { // L: 4870
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) { // L: 4871
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) { // L: 4872
										for (var75 = 0; var75 < var51; ++var75) { // L: 4873
											var32.drawTransBgAt(var36 * var75 + (var60 + var66 - var40), var67); // L: 4874
										}
									}

									if (var34 != null) { // L: 4877
										var34.drawTransBgAt(var61 + var66 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var16.textColor | -16777216, 0); // L: 4878
								}
							}
						}
					}
				}
			}

		}
	} // L: 4883
}
