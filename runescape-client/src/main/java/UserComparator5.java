import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lky;Lky;I)I",
		garbageValue = "-159510893"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lld;",
		garbageValue = "25"
	)
	public static PrivateChatMode method3604(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3831, PrivateChatMode.field3829, PrivateChatMode.field3830}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field3832) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-179435824"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (WorldMapDecorationType.pcmPlayer1 != null) { // L: 3291
			WorldMapDecorationType.pcmPlayer1.run();
		}

		if (class197.pcmPlayer0 != null) { // L: 3292
			class197.pcmPlayer0.run();
		}

	} // L: 3293

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcv;IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4426
			if (var0 instanceof NPC) { // L: 4427
				NPCComposition var6 = ((NPC)var0).definition; // L: 4428
				if (var6.transforms != null) { // L: 4429
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4430
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4432
			int[] var7 = Players.Players_indices; // L: 4433
			byte var8 = 0; // L: 4434
			Player var10;
			if (var1 < var75 && var0.playerCycle == Client.cycle) { // L: 4435
				var10 = (Player)var0; // L: 4437
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 4439
					var9 = false; // L: 4440
				} else if (var10 == UserComparator9.localPlayer) { // L: 4443
					var9 = ArchiveDiskAction.method4359(); // L: 4462
				} else {
					boolean var11 = GameBuild.method4350(); // L: 4444
					boolean var12;
					if (!var11) { // L: 4445
						var12 = (Client.drawPlayerNames & 1) != 0; // L: 4448
						var11 = var12 && var10.isFriend(); // L: 4450
					}

					var12 = var11; // L: 4452
					if (!var11) { // L: 4453
						boolean var13 = (Client.drawPlayerNames & 2) != 0; // L: 4456
						var12 = var13 && var10.isClanMember(); // L: 4458
					}

					var9 = var12; // L: 4460
				}

				if (var9) { // L: 4464
					Player var76 = (Player)var0; // L: 4465
					if (var1 < var75) { // L: 4466
						SoundCache.method2689(var0, var0.defaultHeight + 15); // L: 4467
						AbstractFont var77 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4468
						byte var91 = 9; // L: 4469
						var77.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var91, 16777215, 0); // L: 4470
						var8 = 18; // L: 4471
					}
				}
			}

			int var87 = -2; // L: 4475
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method5064()) { // L: 4476
				SoundCache.method2689(var0, var0.defaultHeight + 15); // L: 4477

				for (HealthBar var88 = (HealthBar)var0.healthBars.last(); var88 != null; var88 = (HealthBar)var0.healthBars.previous()) { // L: 4478
					HealthBarUpdate var94 = var88.get(Client.cycle); // L: 4479
					if (var94 == null) { // L: 4480
						if (var88.isEmpty()) { // L: 4538
							var88.remove();
						}
					} else {
						HealthBarDefinition var95 = var88.definition; // L: 4481
						SpritePixels var79 = var95.getBackSprite(); // L: 4482
						SpritePixels var81 = var95.getFrontSprite(); // L: 4483
						int var82 = 0; // L: 4485
						if (var79 != null && var81 != null) { // L: 4486
							if (var95.widthPadding * 2 < var81.subWidth) { // L: 4487
								var82 = var95.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4488
						} else {
							var15 = var95.width; // L: 4490
						}

						int var17 = 255; // L: 4491
						boolean var83 = true; // L: 4492
						int var84 = Client.cycle - var94.cycle; // L: 4493
						int var85 = var15 * var94.health2 / var95.width; // L: 4494
						int var86;
						int var97;
						if (var94.cycleOffset > var84) { // L: 4495
							var86 = var95.field3316 == 0 ? 0 : var95.field3316 * (var84 / var95.field3316); // L: 4496
							var22 = var15 * var94.health / var95.width; // L: 4497
							var97 = var86 * (var85 - var22) / var94.cycleOffset + var22; // L: 4498
						} else {
							var97 = var85; // L: 4501
							var86 = var95.int5 + var94.cycleOffset - var84; // L: 4502
							if (var95.int3 >= 0) { // L: 4503
								var17 = (var86 << 8) / (var95.int5 - var95.int3);
							}
						}

						if (var94.health2 > 0 && var97 < 1) { // L: 4505
							var97 = 1;
						}

						if (var79 != null && var81 != null) { // L: 4506
							if (var15 == var97) { // L: 4507
								var97 += var82 * 2;
							} else {
								var97 += var82; // L: 4508
							}

							var86 = var79.subHeight; // L: 4509
							var87 += var86; // L: 4510
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4511
							var23 = var3 + Client.viewportTempY - var87; // L: 4512
							var22 -= var82; // L: 4513
							if (var17 >= 0 && var17 < 255) { // L: 4514
								var79.drawTransAt(var22, var23, var17); // L: 4515
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var97 + var22, var86 + var23); // L: 4516
								var81.drawTransAt(var22, var23, var17); // L: 4517
							} else {
								var79.drawTransBgAt(var22, var23); // L: 4520
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var97 + var22, var86 + var23); // L: 4521
								var81.drawTransBgAt(var22, var23); // L: 4522
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4524
							var87 += 2; // L: 4525
						} else {
							var87 += 5; // L: 4528
							if (Client.viewportTempX > -1) { // L: 4529
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4530
								var22 = var3 + Client.viewportTempY - var87; // L: 4531
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var97, 5, 65280); // L: 4532
								Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var97, var22, var15 - var97, 5, 16711680); // L: 4533
							}

							var87 += 2; // L: 4535
						}
					}
				}
			}

			if (var87 == -2) { // L: 4541
				var87 += 7;
			}

			var87 += var8; // L: 4542
			if (var1 < var75) { // L: 4543
				var10 = (Player)var0; // L: 4544
				if (var10.isHidden) { // L: 4545
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 4546
					SoundCache.method2689(var0, var0.defaultHeight + 15); // L: 4547
					if (Client.viewportTempX > -1) { // L: 4548
						if (var10.headIconPk != -1) { // L: 4549
							var87 += 25; // L: 4550
							Client.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4551
						}

						if (var10.headIconPrayer != -1) { // L: 4553
							var87 += 25; // L: 4554
							class169.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4555
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4559
					SoundCache.method2689(var0, var0.defaultHeight + 15); // L: 4560
					if (Client.viewportTempX > -1) { // L: 4561
						var87 += class13.headIconHintSprites[1].subHeight; // L: 4562
						class13.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4563
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 4568
				if (var89.transforms != null) { // L: 4569
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < class169.headIconPrayerSprites.length) { // L: 4570
					SoundCache.method2689(var0, var0.defaultHeight + 15); // L: 4571
					if (Client.viewportTempX > -1) { // L: 4572
						class169.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4573
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4576
					SoundCache.method2689(var0, var0.defaultHeight + 15); // L: 4577
					if (Client.viewportTempX > -1) { // L: 4578
						class13.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field968 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4581 4582
				SoundCache.method2689(var0, var0.defaultHeight); // L: 4583
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4584
					Client.overheadTextXOffsets[Client.overheadTextCount] = ScriptEvent.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4585
					Client.overheadTextAscents[Client.overheadTextCount] = ScriptEvent.fontBold12.ascent; // L: 4586
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4587
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4588
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4589
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4590
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4591
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4592
					++Client.overheadTextCount; // L: 4593
				}
			}

			for (int var78 = 0; var78 < 4; ++var78) { // L: 4597
				int var90 = var0.hitSplatCycles[var78]; // L: 4598
				int var92 = var0.hitSplatTypes[var78]; // L: 4599
				HitSplatDefinition var96 = null; // L: 4600
				int var14 = 0; // L: 4601
				if (var92 >= 0) { // L: 4602
					if (var90 <= Client.cycle) { // L: 4603
						continue;
					}

					var96 = ScriptFrame.method1222(var0.hitSplatTypes[var78]); // L: 4604
					var14 = var96.field3364; // L: 4605
					if (var96 != null && var96.transforms != null) { // L: 4606
						var96 = var96.transform(); // L: 4607
						if (var96 == null) { // L: 4608
							var0.hitSplatCycles[var78] = -1; // L: 4609
							continue; // L: 4610
						}
					}
				} else if (var90 < 0) { // L: 4614
					continue;
				}

				var15 = var0.hitSplatTypes2[var78]; // L: 4615
				HitSplatDefinition var16 = null; // L: 4616
				if (var15 >= 0) { // L: 4617
					var16 = ScriptFrame.method1222(var15); // L: 4618
					if (var16 != null && var16.transforms != null) { // L: 4619
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 4621
					if (var96 == null) { // L: 4622
						var0.hitSplatCycles[var78] = -1; // L: 4623
					} else {
						SoundCache.method2689(var0, var0.defaultHeight / 2); // L: 4626
						if (Client.viewportTempX > -1) { // L: 4627
							if (var78 == 1) { // L: 4629
								Client.viewportTempY -= 20; // L: 4630
							}

							if (var78 == 2) { // L: 4632
								Client.viewportTempX -= 15; // L: 4633
								Client.viewportTempY -= 10; // L: 4634
							}

							if (var78 == 3) { // L: 4636
								Client.viewportTempX += 15; // L: 4637
								Client.viewportTempY -= 10; // L: 4638
							}

							SpritePixels var18 = null; // L: 4640
							SpritePixels var19 = null; // L: 4641
							SpritePixels var20 = null; // L: 4642
							SpritePixels var21 = null; // L: 4643
							var22 = 0; // L: 4644
							var23 = 0; // L: 4645
							int var24 = 0; // L: 4646
							int var25 = 0; // L: 4647
							int var26 = 0; // L: 4648
							int var27 = 0; // L: 4649
							int var28 = 0; // L: 4650
							int var29 = 0; // L: 4651
							SpritePixels var30 = null; // L: 4652
							SpritePixels var31 = null; // L: 4653
							SpritePixels var32 = null; // L: 4654
							SpritePixels var33 = null; // L: 4655
							int var34 = 0; // L: 4656
							int var35 = 0; // L: 4657
							int var36 = 0; // L: 4658
							int var37 = 0; // L: 4659
							int var38 = 0; // L: 4660
							int var39 = 0; // L: 4661
							int var40 = 0; // L: 4662
							int var41 = 0; // L: 4663
							int var42 = 0; // L: 4664
							var18 = var96.method4764(); // L: 4665
							int var43;
							if (var18 != null) { // L: 4666
								var22 = var18.subWidth; // L: 4667
								var43 = var18.subHeight; // L: 4668
								if (var43 > var42) { // L: 4669
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 4670
							}

							var19 = var96.method4770(); // L: 4672
							if (var19 != null) { // L: 4673
								var23 = var19.subWidth; // L: 4674
								var43 = var19.subHeight; // L: 4675
								if (var43 > var42) { // L: 4676
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 4677
							}

							var20 = var96.method4769(); // L: 4679
							if (var20 != null) { // L: 4680
								var24 = var20.subWidth; // L: 4681
								var43 = var20.subHeight; // L: 4682
								if (var43 > var42) { // L: 4683
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 4684
							}

							var21 = var96.method4766(); // L: 4686
							if (var21 != null) { // L: 4687
								var25 = var21.subWidth; // L: 4688
								var43 = var21.subHeight; // L: 4689
								if (var43 > var42) { // L: 4690
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 4691
							}

							if (var16 != null) { // L: 4693
								var30 = var16.method4764(); // L: 4694
								if (var30 != null) { // L: 4695
									var34 = var30.subWidth; // L: 4696
									var43 = var30.subHeight; // L: 4697
									if (var43 > var42) { // L: 4698
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 4699
								}

								var31 = var16.method4770(); // L: 4701
								if (var31 != null) { // L: 4702
									var35 = var31.subWidth; // L: 4703
									var43 = var31.subHeight; // L: 4704
									if (var43 > var42) { // L: 4705
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 4706
								}

								var32 = var16.method4769(); // L: 4708
								if (var32 != null) { // L: 4709
									var36 = var32.subWidth; // L: 4710
									var43 = var32.subHeight; // L: 4711
									if (var43 > var42) { // L: 4712
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 4713
								}

								var33 = var16.method4766(); // L: 4715
								if (var33 != null) { // L: 4716
									var37 = var33.subWidth; // L: 4717
									var43 = var33.subHeight; // L: 4718
									if (var43 > var42) { // L: 4719
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 4720
								}
							}

							Font var80 = var96.getFont(); // L: 4725
							if (var80 == null) { // L: 4726
								var80 = SecureRandomCallable.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 4727
								var44 = var16.getFont(); // L: 4728
								if (var44 == null) { // L: 4729
									var44 = SecureRandomCallable.fontPlain11;
								}
							} else {
								var44 = SecureRandomCallable.fontPlain11; // L: 4731
							}

							String var45 = null; // L: 4732
							String var46 = null; // L: 4733
							boolean var47 = false; // L: 4734
							int var48 = 0; // L: 4735
							var45 = var96.getString(var0.hitSplatValues[var78]); // L: 4736
							int var93 = var80.stringWidth(var45); // L: 4737
							if (var16 != null) { // L: 4738
								var46 = var16.getString(var0.hitSplatValues2[var78]); // L: 4739
								var48 = var44.stringWidth(var46); // L: 4740
							}

							int var49 = 0; // L: 4742
							int var50 = 0; // L: 4743
							if (var23 > 0) { // L: 4744
								if (var20 == null && var21 == null) { // L: 4745
									var49 = 1; // L: 4746
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 4748 4749
								if (var32 == null && var33 == null) { // L: 4750
									var50 = 1; // L: 4751
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 4754
							int var52 = var51; // L: 4755
							if (var22 > 0) { // L: 4756
								var51 += var22;
							}

							var51 += 2; // L: 4757
							int var53 = var51; // L: 4758
							if (var24 > 0) { // L: 4759
								var51 += var24;
							}

							int var54 = var51; // L: 4760
							int var55 = var51; // L: 4761
							int var56;
							if (var23 > 0) { // L: 4762
								var56 = var23 * var49; // L: 4763
								var51 += var56; // L: 4764
								var55 += (var56 - var93) / 2; // L: 4765
							} else {
								var51 += var93; // L: 4768
							}

							var56 = var51; // L: 4770
							if (var25 > 0) { // L: 4771
								var51 += var25;
							}

							int var57 = 0; // L: 4772
							int var58 = 0; // L: 4773
							int var59 = 0; // L: 4774
							int var60 = 0; // L: 4775
							int var61 = 0; // L: 4776
							int var62;
							if (var16 != null) { // L: 4777
								var51 += 2; // L: 4778
								var57 = var51; // L: 4779
								if (var34 > 0) { // L: 4780
									var51 += var34;
								}

								var51 += 2; // L: 4781
								var58 = var51; // L: 4782
								if (var36 > 0) { // L: 4783
									var51 += var36;
								}

								var59 = var51; // L: 4784
								var61 = var51; // L: 4785
								if (var35 > 0) { // L: 4786
									var62 = var35 * var50; // L: 4787
									var51 += var62; // L: 4788
									var61 += (var62 - var48) / 2; // L: 4789
								} else {
									var51 += var48; // L: 4792
								}

								var60 = var51; // L: 4794
								if (var37 > 0) { // L: 4795
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var78] - Client.cycle; // L: 4797
							int var63 = var96.field3378 - var62 * var96.field3378 / var96.field3364; // L: 4798
							int var64 = var62 * var96.field3370 / var96.field3364 + -var96.field3370; // L: 4799
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 4800
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 4801
							int var67 = var66; // L: 4802
							int var68 = var66 + var42; // L: 4803
							int var69 = var66 + var96.field3368 + 15; // L: 4804
							int var70 = var69 - var80.maxAscent; // L: 4805
							int var71 = var69 + var80.maxDescent; // L: 4806
							if (var70 < var66) { // L: 4807
								var67 = var70;
							}

							if (var71 > var68) { // L: 4808
								var68 = var71;
							}

							int var72 = 0; // L: 4809
							int var73;
							int var74;
							if (var16 != null) { // L: 4810
								var72 = var66 + var16.field3368 + 15; // L: 4811
								var73 = var72 - var44.maxAscent; // L: 4812
								var74 = var72 + var44.maxDescent; // L: 4813
								if (var73 < var67) { // L: 4814
									;
								}

								if (var74 > var68) { // L: 4815
									;
								}
							}

							var73 = 255; // L: 4817
							if (var96.field3371 >= 0) { // L: 4818
								var73 = (var62 << 8) / (var96.field3364 - var96.field3371);
							}

							if (var73 >= 0 && var73 < 255) { // L: 4819
								if (var18 != null) { // L: 4820
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 4821
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 4822
									for (var74 = 0; var74 < var49; ++var74) { // L: 4823
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 4824
									}
								}

								if (var21 != null) { // L: 4827
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var80.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73); // L: 4828
								if (var16 != null) { // L: 4829
									if (var30 != null) { // L: 4830
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 4831
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 4832
										for (var74 = 0; var74 < var50; ++var74) { // L: 4833
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73); // L: 4834
										}
									}

									if (var33 != null) { // L: 4837
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 4838
								}
							} else {
								if (var18 != null) { // L: 4842
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 4843
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 4844
									for (var74 = 0; var74 < var49; ++var74) { // L: 4845
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 4846
									}
								}

								if (var21 != null) { // L: 4849
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var80.draw(var45, var55 + var65, var69, var96.textColor | -16777216, 0); // L: 4850
								if (var16 != null) { // L: 4851
									if (var30 != null) { // L: 4852
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 4853
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 4854
										for (var74 = 0; var74 < var50; ++var74) { // L: 4855
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66); // L: 4856
										}
									}

									if (var33 != null) { // L: 4859
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 4860
								}
							}
						}
					}
				}
			}

		}
	} // L: 4865
}
