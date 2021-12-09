import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ea")
public class class148 extends class126 {
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1737427253
	)
	static int field1651;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 1306318514738640099L
	)
	long field1658;
	@ObfuscatedName("b")
	String field1652;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class148(class129 var1) {
		this.this$0 = var1;
		this.field1658 = -1L; // L: 194
		this.field1652 = null; // L: 195
	} // L: 197

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1658 = var1.readLong(); // L: 202
		}

		this.field1652 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2853(this.field1658, this.field1652); // L: 208
	} // L: 209

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "-2041302751"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "498482718"
	)
	static int method3019(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1200
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1201
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class404.Widget_unpackTargetMask(class363.getWidgetFlags(var3)); // L: 1202
			return 1; // L: 1203
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1205
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1212
				if (var3.dataText == null) { // L: 1213
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1214
				}

				return 1; // L: 1215
			} else {
				return 2; // L: 1217
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1206
			--var4; // L: 1207
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1208
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1209
			} else {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1210
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1459552058"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (PacketWriter.pcmPlayer1 != null) { // L: 4298
			PacketWriter.pcmPlayer1.run();
		}

		if (JagexCache.pcmPlayer0 != null) { // L: 4299
			JagexCache.pcmPlayer0.run();
		}

	} // L: 4300

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lcy;IIIIII)V",
		garbageValue = "1260846152"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5592
			if (var0 instanceof NPC) { // L: 5593
				NPCComposition var6 = ((NPC)var0).definition; // L: 5594
				if (var6.transforms != null) { // L: 5595
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5596
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5598
			int[] var7 = Players.Players_indices; // L: 5599
			byte var8 = 0; // L: 5600
			Player var10;
			if (var1 < var75 && var0.playerCycle == Client.cycle) { // L: 5601
				var10 = (Player)var0; // L: 5603
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 5605
					var9 = false; // L: 5606
				} else if (var10 == class340.localPlayer) { // L: 5609
					var9 = class329.method6133(); // L: 5628
				} else {
					boolean var11 = MilliClock.method3121(); // L: 5610
					boolean var12;
					if (!var11) { // L: 5611
						var12 = (Client.drawPlayerNames & 1) != 0; // L: 5614
						var11 = var12 && var10.isFriend(); // L: 5616
					}

					var12 = var11; // L: 5618
					if (!var11) { // L: 5619
						boolean var13 = (Client.drawPlayerNames & 2) != 0; // L: 5622
						var12 = var13 && var10.isFriendsChatMember(); // L: 5624
					}

					var9 = var12; // L: 5626
				}

				if (var9) { // L: 5630
					Player var76 = (Player)var0; // L: 5631
					if (var1 < var75) { // L: 5632
						VarpDefinition.method3167(var0, var0.defaultHeight + 15); // L: 5633
						AbstractFont var77 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5634
						byte var91 = 9; // L: 5635
						var77.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var91, 16777215, 0); // L: 5636
						var8 = 18; // L: 5637
					}
				}
			}

			int var87 = -2; // L: 5641
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method5915()) { // L: 5642
				VarpDefinition.method3167(var0, var0.defaultHeight + 15); // L: 5643

				for (HealthBar var88 = (HealthBar)var0.healthBars.last(); var88 != null; var88 = (HealthBar)var0.healthBars.previous()) { // L: 5644
					HealthBarUpdate var95 = var88.get(Client.cycle); // L: 5645
					if (var95 == null) { // L: 5646
						if (var88.isEmpty()) { // L: 5704
							var88.remove();
						}
					} else {
						HealthBarDefinition var96 = var88.definition; // L: 5647
						SpritePixels var79 = var96.getBackSprite(); // L: 5648
						SpritePixels var81 = var96.getFrontSprite(); // L: 5649
						int var82 = 0; // L: 5651
						if (var79 != null && var81 != null) { // L: 5652
							if (var96.widthPadding * 2 < var81.subWidth) { // L: 5653
								var82 = var96.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 5654
						} else {
							var15 = var96.width; // L: 5656
						}

						int var17 = 255; // L: 5657
						boolean var83 = true; // L: 5658
						int var84 = Client.cycle - var95.cycle; // L: 5659
						int var85 = var15 * var95.health2 / var96.width; // L: 5660
						int var86;
						int var98;
						if (var95.cycleOffset > var84) { // L: 5661
							var86 = var96.field1798 == 0 ? 0 : var96.field1798 * (var84 / var96.field1798); // L: 5662
							var22 = var15 * var95.health / var96.width; // L: 5663
							var98 = var86 * (var85 - var22) / var95.cycleOffset + var22; // L: 5664
						} else {
							var98 = var85; // L: 5667
							var86 = var95.cycleOffset + var96.int5 - var84; // L: 5668
							if (var96.int3 >= 0) { // L: 5669
								var17 = (var86 << 8) / (var96.int5 - var96.int3);
							}
						}

						if (var95.health2 > 0 && var98 < 1) { // L: 5671
							var98 = 1;
						}

						if (var79 != null && var81 != null) { // L: 5672
							if (var98 == var15) { // L: 5673
								var98 += var82 * 2;
							} else {
								var98 += var82; // L: 5674
							}

							var86 = var79.subHeight; // L: 5675
							var87 += var86; // L: 5676
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5677
							var23 = var3 + Client.viewportTempY - var87; // L: 5678
							var22 -= var82; // L: 5679
							if (var17 >= 0 && var17 < 255) { // L: 5680
								var79.drawTransAt(var22, var23, var17); // L: 5681
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var86); // L: 5682
								var81.drawTransAt(var22, var23, var17); // L: 5683
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5686
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var86 + var23); // L: 5687
								var81.drawTransBgAt(var22, var23); // L: 5688
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5690
							var87 += 2; // L: 5691
						} else {
							var87 += 5; // L: 5694
							if (Client.viewportTempX > -1) { // L: 5695
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5696
								var22 = var3 + Client.viewportTempY - var87; // L: 5697
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var98, 5, 65280); // L: 5698
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var86, var22, var15 - var98, 5, 16711680); // L: 5699
							}

							var87 += 2; // L: 5701
						}
					}
				}
			}

			if (var87 == -2) { // L: 5707
				var87 += 7;
			}

			var87 += var8; // L: 5708
			if (var1 < var75) { // L: 5709
				var10 = (Player)var0; // L: 5710
				if (var10.isHidden) { // L: 5711
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 5712
					VarpDefinition.method3167(var0, var0.defaultHeight + 15); // L: 5713
					if (Client.viewportTempX > -1) { // L: 5714
						if (var10.headIconPk != -1) { // L: 5715
							var87 += 25; // L: 5716
							class286.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 5717
						}

						if (var10.headIconPrayer != -1) { // L: 5719
							var87 += 25; // L: 5720
							PlayerComposition.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 5721
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5725
					VarpDefinition.method3167(var0, var0.defaultHeight + 15); // L: 5726
					if (Client.viewportTempX > -1) { // L: 5727
						var87 += class260.headIconHintSprites[1].subHeight; // L: 5728
						class260.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 5729
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 5734
				if (var89.transforms != null) { // L: 5735
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < PlayerComposition.headIconPrayerSprites.length) { // L: 5736
					VarpDefinition.method3167(var0, var0.defaultHeight + 15); // L: 5737
					if (Client.viewportTempX > -1) { // L: 5738
						PlayerComposition.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5739
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5742
					VarpDefinition.method3167(var0, var0.defaultHeight + 15); // L: 5743
					if (Client.viewportTempX > -1) { // L: 5744
						class260.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1114 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5747 5748
				VarpDefinition.method3167(var0, var0.defaultHeight); // L: 5749
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5750
					Client.overheadTextXOffsets[Client.overheadTextCount] = class136.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5751
					Client.overheadTextAscents[Client.overheadTextCount] = class136.fontBold12.ascent; // L: 5752
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5753
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5754
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5755
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5756
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5757
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5758
					++Client.overheadTextCount; // L: 5759
				}
			}

			for (int var78 = 0; var78 < 4; ++var78) { // L: 5763
				int var90 = var0.hitSplatCycles[var78]; // L: 5764
				int var92 = var0.hitSplatTypes[var78]; // L: 5765
				HitSplatDefinition var97 = null; // L: 5766
				int var14 = 0; // L: 5767
				if (var92 >= 0) { // L: 5768
					if (var90 <= Client.cycle) { // L: 5769
						continue;
					}

					var97 = UserComparator6.method2554(var0.hitSplatTypes[var78]); // L: 5770
					var14 = var97.field1934; // L: 5771
					if (var97 != null && var97.transforms != null) { // L: 5772
						var97 = var97.transform(); // L: 5773
						if (var97 == null) { // L: 5774
							var0.hitSplatCycles[var78] = -1; // L: 5775
							continue; // L: 5776
						}
					}
				} else if (var90 < 0) { // L: 5780
					continue;
				}

				var15 = var0.hitSplatTypes2[var78]; // L: 5781
				HitSplatDefinition var16 = null; // L: 5782
				if (var15 >= 0) { // L: 5783
					var16 = UserComparator6.method2554(var15); // L: 5784
					if (var16 != null && var16.transforms != null) { // L: 5785
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 5787
					if (var97 == null) { // L: 5788
						var0.hitSplatCycles[var78] = -1; // L: 5789
					} else {
						VarpDefinition.method3167(var0, var0.defaultHeight / 2); // L: 5792
						if (Client.viewportTempX > -1) { // L: 5793
							boolean var93 = true; // L: 5794
							if (var78 == 1) { // L: 5795
								Client.viewportTempY -= 20; // L: 5796
							}

							if (var78 == 2) { // L: 5798
								Client.viewportTempX -= 15; // L: 5799
								Client.viewportTempY -= 10; // L: 5800
							}

							if (var78 == 3) { // L: 5802
								Client.viewportTempX += 15; // L: 5803
								Client.viewportTempY -= 10; // L: 5804
							}

							SpritePixels var18 = null; // L: 5806
							SpritePixels var19 = null; // L: 5807
							SpritePixels var20 = null; // L: 5808
							SpritePixels var21 = null; // L: 5809
							var22 = 0; // L: 5810
							var23 = 0; // L: 5811
							int var24 = 0; // L: 5812
							int var25 = 0; // L: 5813
							int var26 = 0; // L: 5814
							int var27 = 0; // L: 5815
							int var28 = 0; // L: 5816
							int var29 = 0; // L: 5817
							SpritePixels var30 = null; // L: 5818
							SpritePixels var31 = null; // L: 5819
							SpritePixels var32 = null; // L: 5820
							SpritePixels var33 = null; // L: 5821
							int var34 = 0; // L: 5822
							int var35 = 0; // L: 5823
							int var36 = 0; // L: 5824
							int var37 = 0; // L: 5825
							int var38 = 0; // L: 5826
							int var39 = 0; // L: 5827
							int var40 = 0; // L: 5828
							int var41 = 0; // L: 5829
							int var42 = 0; // L: 5830
							var18 = var97.method3451(); // L: 5831
							int var43;
							if (var18 != null) { // L: 5832
								var22 = var18.subWidth; // L: 5833
								var43 = var18.subHeight; // L: 5834
								if (var43 > var42) { // L: 5835
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5836
							}

							var19 = var97.method3452(); // L: 5838
							if (var19 != null) { // L: 5839
								var23 = var19.subWidth; // L: 5840
								var43 = var19.subHeight; // L: 5841
								if (var43 > var42) { // L: 5842
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5843
							}

							var20 = var97.method3453(); // L: 5845
							if (var20 != null) { // L: 5846
								var24 = var20.subWidth; // L: 5847
								var43 = var20.subHeight; // L: 5848
								if (var43 > var42) { // L: 5849
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5850
							}

							var21 = var97.method3454(); // L: 5852
							if (var21 != null) { // L: 5853
								var25 = var21.subWidth; // L: 5854
								var43 = var21.subHeight; // L: 5855
								if (var43 > var42) { // L: 5856
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5857
							}

							if (var16 != null) { // L: 5859
								var30 = var16.method3451(); // L: 5860
								if (var30 != null) { // L: 5861
									var34 = var30.subWidth; // L: 5862
									var43 = var30.subHeight; // L: 5863
									if (var43 > var42) { // L: 5864
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5865
								}

								var31 = var16.method3452(); // L: 5867
								if (var31 != null) { // L: 5868
									var35 = var31.subWidth; // L: 5869
									var43 = var31.subHeight; // L: 5870
									if (var43 > var42) { // L: 5871
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5872
								}

								var32 = var16.method3453(); // L: 5874
								if (var32 != null) { // L: 5875
									var36 = var32.subWidth; // L: 5876
									var43 = var32.subHeight; // L: 5877
									if (var43 > var42) { // L: 5878
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5879
								}

								var33 = var16.method3454(); // L: 5881
								if (var33 != null) { // L: 5882
									var37 = var33.subWidth; // L: 5883
									var43 = var33.subHeight; // L: 5884
									if (var43 > var42) { // L: 5885
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5886
								}
							}

							Font var80 = var97.getFont(); // L: 5891
							if (var80 == null) { // L: 5892
								var80 = class307.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5893
								var44 = var16.getFont(); // L: 5894
								if (var44 == null) { // L: 5895
									var44 = class307.fontPlain11;
								}
							} else {
								var44 = class307.fontPlain11; // L: 5897
							}

							String var45 = null; // L: 5898
							String var46 = null; // L: 5899
							boolean var47 = false; // L: 5900
							int var48 = 0; // L: 5901
							var45 = var97.getString(var0.hitSplatValues[var78]); // L: 5902
							int var94 = var80.stringWidth(var45); // L: 5903
							if (var16 != null) { // L: 5904
								var46 = var16.getString(var0.hitSplatValues2[var78]); // L: 5905
								var48 = var44.stringWidth(var46); // L: 5906
							}

							int var49 = 0; // L: 5908
							int var50 = 0; // L: 5909
							if (var23 > 0) { // L: 5910
								if (var20 == null && var21 == null) { // L: 5911
									var49 = 1; // L: 5912
								} else {
									var49 = var94 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5914 5915
								if (var32 == null && var33 == null) { // L: 5916
									var50 = 1; // L: 5917
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5920
							int var52 = var51; // L: 5921
							if (var22 > 0) {
								var51 += var22; // L: 5922
							}

							var51 += 2; // L: 5923
							int var53 = var51; // L: 5924
							if (var24 > 0) { // L: 5925
								var51 += var24;
							}

							int var54 = var51; // L: 5926
							int var55 = var51; // L: 5927
							int var56;
							if (var23 > 0) { // L: 5928
								var56 = var49 * var23; // L: 5929
								var51 += var56; // L: 5930
								var55 += (var56 - var94) / 2; // L: 5931
							} else {
								var51 += var94; // L: 5934
							}

							var56 = var51; // L: 5936
							if (var25 > 0) { // L: 5937
								var51 += var25;
							}

							int var57 = 0; // L: 5938
							int var58 = 0; // L: 5939
							int var59 = 0; // L: 5940
							int var60 = 0; // L: 5941
							int var61 = 0; // L: 5942
							int var62;
							if (var16 != null) { // L: 5943
								var51 += 2; // L: 5944
								var57 = var51; // L: 5945
								if (var34 > 0) { // L: 5946
									var51 += var34;
								}

								var51 += 2; // L: 5947
								var58 = var51; // L: 5948
								if (var36 > 0) { // L: 5949
									var51 += var36;
								}

								var59 = var51; // L: 5950
								var61 = var51; // L: 5951
								if (var35 > 0) { // L: 5952
									var62 = var50 * var35; // L: 5953
									var51 += var62; // L: 5954
									var61 += (var62 - var48) / 2; // L: 5955
								} else {
									var51 += var48; // L: 5958
								}

								var60 = var51; // L: 5960
								if (var37 > 0) { // L: 5961
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var78] - Client.cycle; // L: 5963
							int var63 = var97.field1929 - var62 * var97.field1929 / var97.field1934; // L: 5964
							int var64 = var62 * var97.field1940 / var97.field1934 + -var97.field1940; // L: 5965
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5966
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5967
							int var67 = var66; // L: 5968
							int var68 = var66 + var42; // L: 5969
							int var69 = var66 + var97.field1944 + 15; // L: 5970
							int var70 = var69 - var80.maxAscent; // L: 5971
							int var71 = var69 + var80.maxDescent; // L: 5972
							if (var70 < var66) { // L: 5973
								var67 = var70;
							}

							if (var71 > var68) { // L: 5974
								var68 = var71;
							}

							int var72 = 0; // L: 5975
							int var73;
							int var74;
							if (var16 != null) { // L: 5976
								var72 = var66 + var16.field1944 + 15; // L: 5977
								var73 = var72 - var44.maxAscent; // L: 5978
								var74 = var72 + var44.maxDescent; // L: 5979
								if (var73 < var67) { // L: 5980
									;
								}

								if (var74 > var68) { // L: 5981
									;
								}
							}

							var73 = 255; // L: 5983
							if (var97.field1943 >= 0) { // L: 5984
								var73 = (var62 << 8) / (var97.field1934 - var97.field1943);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5985
								if (var18 != null) { // L: 5986
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5987
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5988
									for (var74 = 0; var74 < var49; ++var74) { // L: 5989
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73); // L: 5990
									}
								}

								if (var21 != null) { // L: 5993
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var80.drawAlpha(var45, var65 + var55, var69, var97.textColor, 0, var73); // L: 5994
								if (var16 != null) { // L: 5995
									if (var30 != null) { // L: 5996
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5997
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5998
										for (var74 = 0; var74 < var50; ++var74) { // L: 5999
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73); // L: 6000
										}
									}

									if (var33 != null) { // L: 6003
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 6004
								}
							} else {
								if (var18 != null) { // L: 6008
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 6009
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 6010
									for (var74 = 0; var74 < var49; ++var74) { // L: 6011
										var19.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66); // L: 6012
									}
								}

								if (var21 != null) { // L: 6015
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var80.draw(var45, var65 + var55, var69, var97.textColor | -16777216, 0); // L: 6016
								if (var16 != null) { // L: 6017
									if (var30 != null) { // L: 6018
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 6019
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 6020
										for (var74 = 0; var74 < var50; ++var74) { // L: 6021
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66); // L: 6022
										}
									}

									if (var33 != null) { // L: 6025
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var16.textColor | -16777216, 0); // L: 6026
								}
							}
						}
					}
				}
			}

		}
	} // L: 6031

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		playPcmPlayers(); // L: 12324
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12325
		if (var4 != null) { // L: 12326
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12327
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12328
				int var5 = Client.camAngleY & 2047; // L: 12329
				int var6 = class340.localPlayer.x / 32 + 48; // L: 12330
				int var7 = 464 - class340.localPlayer.y / 32; // L: 12331
				class29.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12332

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12333
					var16 = Client.mapIconXs[var8] * 4 + 2 - class340.localPlayer.x / 32; // L: 12334
					var10 = Client.mapIconYs[var8] * 4 + 2 - class340.localPlayer.y / 32; // L: 12335
					ArchiveDisk.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12336
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12338
					for (var16 = 0; var16 < 104; ++var16) { // L: 12339
						NodeDeque var14 = Client.groundItems[class20.Client_plane][var8][var16]; // L: 12340
						if (var14 != null) { // L: 12341
							var11 = var8 * 4 + 2 - class340.localPlayer.x / 32; // L: 12342
							var12 = var16 * 4 + 2 - class340.localPlayer.y / 32; // L: 12343
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var11, var12, class111.mapDotSprites[0], var4); // L: 12344
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12348
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12349
					if (var9 != null && var9.isVisible()) { // L: 12350
						NPCComposition var18 = var9.definition; // L: 12351
						if (var18 != null && var18.transforms != null) { // L: 12352
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12353
							var11 = var9.x / 32 - class340.localPlayer.x / 32; // L: 12354
							var12 = var9.y / 32 - class340.localPlayer.y / 32; // L: 12355
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var11, var12, class111.mapDotSprites[1], var4); // L: 12356
						}
					}
				}

				var8 = Players.Players_count; // L: 12360
				int[] var17 = Players.Players_indices; // L: 12361

				for (var10 = 0; var10 < var8; ++var10) { // L: 12362
					Player var15 = Client.players[var17[var10]]; // L: 12363
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class340.localPlayer) { // L: 12364
						var12 = var15.x / 32 - class340.localPlayer.x / 32; // L: 12365
						int var13 = var15.y / 32 - class340.localPlayer.y / 32; // L: 12366
						if (var15.isFriend()) { // L: 12367
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[3], var4);
						} else if (class340.localPlayer.team != 0 && var15.team != 0 && var15.team == class340.localPlayer.team) { // L: 12368
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12369
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12370
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[6], var4);
						} else {
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[2], var4); // L: 12371
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12374
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12375
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12376
						if (var19 != null) { // L: 12377
							var11 = var19.x / 32 - class340.localPlayer.x / 32; // L: 12378
							var12 = var19.y / 32 - class340.localPlayer.y / 32; // L: 12379
							class409.worldToMinimap(var1, var2, var11, var12, UserComparator7.mapMarkerSprites[1], var4); // L: 12380
						}
					}

					if (Client.hintArrowType == 2) { // L: 12383
						var10 = Client.hintArrowX * 4 - class131.baseX * 4 + 2 - class340.localPlayer.x / 32; // L: 12384
						var11 = Client.hintArrowY * 4 - TileItem.baseY * 4 + 2 - class340.localPlayer.y / 32; // L: 12385
						class409.worldToMinimap(var1, var2, var10, var11, UserComparator7.mapMarkerSprites[1], var4); // L: 12386
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12388
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12389
						if (var20 != null) { // L: 12390
							var11 = var20.x / 32 - class340.localPlayer.x / 32; // L: 12391
							var12 = var20.y / 32 - class340.localPlayer.y / 32; // L: 12392
							class409.worldToMinimap(var1, var2, var11, var12, UserComparator7.mapMarkerSprites[1], var4); // L: 12393
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12397
					var10 = Client.destinationX * 4 + 2 - class340.localPlayer.x / 32; // L: 12398
					var11 = Client.destinationY * 4 + 2 - class340.localPlayer.y / 32; // L: 12399
					ArchiveDisk.drawSpriteOnMinimap(var1, var2, var10, var11, UserComparator7.mapMarkerSprites[0], var4); // L: 12400
				}

				if (!class340.localPlayer.isHidden) { // L: 12402
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12404
			}

			Client.field686[var3] = true; // L: 12405
		}
	} // L: 12406
}
