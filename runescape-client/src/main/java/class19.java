import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class19 {
	@ObfuscatedName("v")
	static int[][] field106;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("c")
	Future field108;
	@ObfuscatedName("l")
	String field102;

	class19(Future var1) {
		this.field108 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method270(var1); // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1600070542"
	)
	void method270(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field102 = var1; // L: 19
		if (this.field108 != null) { // L: 20
			this.field108.cancel(true); // L: 21
			this.field108 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-69"
	)
	public final String method272() {
		return this.field102; // L: 27
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "592472773"
	)
	public boolean method273() {
		return this.field102 != null || this.field108 == null; // L: 31
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	public final boolean method283() {
		return this.method273() ? true : this.field108.isDone(); // L: 35 36
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lg;",
		garbageValue = "-68"
	)
	public final class21 method274() {
		if (this.method273()) { // L: 40
			return new class21(this.field102);
		} else if (!this.method283()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field108.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method270(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1676076165"
	)
	static boolean method282() {
		return (Client.drawPlayerNames & 1) != 0; // L: 4729
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lcq;IIIIII)V",
		garbageValue = "1016800677"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4741
			if (var0 instanceof NPC) { // L: 4742
				NPCComposition var6 = ((NPC)var0).definition; // L: 4743
				if (var6.transforms != null) { // L: 4744
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4745
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4747
			int[] var7 = Players.Players_indices; // L: 4748
			byte var8 = 0; // L: 4749
			Player var10;
			if (var1 < var75 && var0.playerCycle == Client.cycle) { // L: 4750
				var10 = (Player)var0; // L: 4752
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 4754
					var9 = false; // L: 4755
				} else if (var10 == WorldMapSprite.localPlayer) { // L: 4758
					var9 = HealthBar.method2250(); // L: 4761
				} else {
					var9 = WorldMapData_1.method4643() || method282() && var10.isFriend() || AttackOption.method2294() && var10.isFriendsChatMember(); // L: 4759
				}

				if (var9) { // L: 4763
					Player var11 = (Player)var0; // L: 4764
					if (var1 < var75) { // L: 4765
						LoginScreenAnimation.method2214(var0, var0.defaultHeight + 15); // L: 4766
						AbstractFont var12 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4767
						byte var13 = 9; // L: 4768
						var12.drawCentered(var11.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var13, 16777215, 0); // L: 4769
						var8 = 18; // L: 4770
					}
				}
			}

			int var87 = -2; // L: 4774
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method5882()) { // L: 4775
				LoginScreenAnimation.method2214(var0, var0.defaultHeight + 15); // L: 4776

				for (HealthBar var88 = (HealthBar)var0.healthBars.last(); var88 != null; var88 = (HealthBar)var0.healthBars.previous()) { // L: 4777
					HealthBarUpdate var89 = var88.get(Client.cycle); // L: 4778
					if (var89 == null) { // L: 4779
						if (var88.isEmpty()) { // L: 4837
							var88.remove();
						}
					} else {
						HealthBarDefinition var91 = var88.definition; // L: 4780
						SpritePixels var79 = var91.getBackSprite(); // L: 4781
						SpritePixels var81 = var91.getFrontSprite(); // L: 4782
						int var82 = 0; // L: 4784
						if (var79 != null && var81 != null) { // L: 4785
							if (var91.widthPadding * 2 < var81.subWidth) { // L: 4786
								var82 = var91.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4787
						} else {
							var15 = var91.width; // L: 4789
						}

						int var17 = 255; // L: 4790
						boolean var83 = true; // L: 4791
						int var84 = Client.cycle - var89.cycle; // L: 4792
						int var85 = var15 * var89.health2 / var91.width; // L: 4793
						int var86;
						int var95;
						if (var89.cycleOffset > var84) { // L: 4794
							var86 = var91.field1814 == 0 ? 0 : var91.field1814 * (var84 / var91.field1814); // L: 4795
							var22 = var15 * var89.health / var91.width; // L: 4796
							var95 = var86 * (var85 - var22) / var89.cycleOffset + var22; // L: 4797
						} else {
							var95 = var85; // L: 4800
							var86 = var89.cycleOffset + var91.int5 - var84; // L: 4801
							if (var91.int3 >= 0) { // L: 4802
								var17 = (var86 << 8) / (var91.int5 - var91.int3);
							}
						}

						if (var89.health2 > 0 && var95 < 1) { // L: 4804
							var95 = 1;
						}

						if (var79 != null && var81 != null) { // L: 4805
							if (var15 == var95) { // L: 4806
								var95 += var82 * 2;
							} else {
								var95 += var82; // L: 4807
							}

							var86 = var79.subHeight; // L: 4808
							var87 += var86; // L: 4809
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4810
							var23 = var3 + Client.viewportTempY - var87; // L: 4811
							var22 -= var82; // L: 4812
							if (var17 >= 0 && var17 < 255) { // L: 4813
								var79.drawTransAt(var22, var23, var17); // L: 4814
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var95 + var22, var23 + var86); // L: 4815
								var81.drawTransAt(var22, var23, var17); // L: 4816
							} else {
								var79.drawTransBgAt(var22, var23); // L: 4819
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var95 + var22, var86 + var23); // L: 4820
								var81.drawTransBgAt(var22, var23); // L: 4821
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4823
							var87 += 2; // L: 4824
						} else {
							var87 += 5; // L: 4827
							if (Client.viewportTempX > -1) { // L: 4828
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4829
								var22 = var3 + Client.viewportTempY - var87; // L: 4830
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var95, 5, 65280); // L: 4831
								Rasterizer2D.Rasterizer2D_fillRectangle(var95 + var86, var22, var15 - var95, 5, 16711680); // L: 4832
							}

							var87 += 2; // L: 4834
						}
					}
				}
			}

			if (var87 == -2) { // L: 4840
				var87 += 7;
			}

			var87 += var8; // L: 4841
			if (var1 < var75) { // L: 4842
				var10 = (Player)var0; // L: 4843
				if (var10.isHidden) { // L: 4844
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 4845
					LoginScreenAnimation.method2214(var0, var0.defaultHeight + 15); // L: 4846
					if (Client.viewportTempX > -1) { // L: 4847
						if (var10.headIconPk != -1) { // L: 4848
							var87 += 25; // L: 4849
							ObjectSound.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4850
						}

						if (var10.headIconPrayer != -1) { // L: 4852
							var87 += 25; // L: 4853
							class4.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4854
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4858
					LoginScreenAnimation.method2214(var0, var0.defaultHeight + 15); // L: 4859
					if (Client.viewportTempX > -1) { // L: 4860
						var87 += SequenceDefinition.headIconHintSprites[1].subHeight; // L: 4861
						SequenceDefinition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4862
					}
				}
			} else {
				NPCComposition var90 = ((NPC)var0).definition; // L: 4867
				if (var90.transforms != null) { // L: 4868
					var90 = var90.transform();
				}

				if (var90.headIconPrayer >= 0 && var90.headIconPrayer < class4.headIconPrayerSprites.length) { // L: 4869
					LoginScreenAnimation.method2214(var0, var0.defaultHeight + 15); // L: 4870
					if (Client.viewportTempX > -1) { // L: 4871
						class4.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4872
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4875
					LoginScreenAnimation.method2214(var0, var0.defaultHeight + 15); // L: 4876
					if (Client.viewportTempX > -1) { // L: 4877
						SequenceDefinition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1125 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4880 4881
				LoginScreenAnimation.method2214(var0, var0.defaultHeight); // L: 4882
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4883
					Client.overheadTextXOffsets[Client.overheadTextCount] = class408.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4884
					Client.overheadTextAscents[Client.overheadTextCount] = class408.fontBold12.ascent; // L: 4885
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4886
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4887
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4888
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4889
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4890
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4891
					++Client.overheadTextCount; // L: 4892
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 4896
				int var77 = var0.hitSplatCycles[var76]; // L: 4897
				int var78 = var0.hitSplatTypes[var76]; // L: 4898
				HitSplatDefinition var94 = null; // L: 4899
				int var14 = 0; // L: 4900
				if (var78 >= 0) { // L: 4901
					if (var77 <= Client.cycle) { // L: 4902
						continue;
					}

					var94 = class293.method5480(var0.hitSplatTypes[var76]); // L: 4903
					var14 = var94.field1944; // L: 4904
					if (var94 != null && var94.transforms != null) { // L: 4905
						var94 = var94.transform(); // L: 4906
						if (var94 == null) { // L: 4907
							var0.hitSplatCycles[var76] = -1; // L: 4908
							continue; // L: 4909
						}
					}
				} else if (var77 < 0) { // L: 4913
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 4914
				HitSplatDefinition var16 = null; // L: 4915
				if (var15 >= 0) { // L: 4916
					var16 = class293.method5480(var15); // L: 4917
					if (var16 != null && var16.transforms != null) { // L: 4918
						var16 = var16.transform();
					}
				}

				if (var77 - var14 <= Client.cycle) { // L: 4920
					if (var94 == null) { // L: 4921
						var0.hitSplatCycles[var76] = -1; // L: 4922
					} else {
						LoginScreenAnimation.method2214(var0, var0.defaultHeight / 2); // L: 4925
						if (Client.viewportTempX > -1) { // L: 4926
							boolean var92 = true; // L: 4927
							if (var76 == 1) { // L: 4928
								Client.viewportTempY -= 20; // L: 4929
							}

							if (var76 == 2) { // L: 4931
								Client.viewportTempX -= 15; // L: 4932
								Client.viewportTempY -= 10; // L: 4933
							}

							if (var76 == 3) { // L: 4935
								Client.viewportTempX += 15; // L: 4936
								Client.viewportTempY -= 10; // L: 4937
							}

							SpritePixels var18 = null; // L: 4939
							SpritePixels var19 = null; // L: 4940
							SpritePixels var20 = null; // L: 4941
							SpritePixels var21 = null; // L: 4942
							var22 = 0; // L: 4943
							var23 = 0; // L: 4944
							int var24 = 0; // L: 4945
							int var25 = 0; // L: 4946
							int var26 = 0; // L: 4947
							int var27 = 0; // L: 4948
							int var28 = 0; // L: 4949
							int var29 = 0; // L: 4950
							SpritePixels var30 = null; // L: 4951
							SpritePixels var31 = null; // L: 4952
							SpritePixels var32 = null; // L: 4953
							SpritePixels var33 = null; // L: 4954
							int var34 = 0; // L: 4955
							int var35 = 0; // L: 4956
							int var36 = 0; // L: 4957
							int var37 = 0; // L: 4958
							int var38 = 0; // L: 4959
							int var39 = 0; // L: 4960
							int var40 = 0; // L: 4961
							int var41 = 0; // L: 4962
							int var42 = 0; // L: 4963
							var18 = var94.method3450(); // L: 4964
							int var43;
							if (var18 != null) { // L: 4965
								var22 = var18.subWidth; // L: 4966
								var43 = var18.subHeight; // L: 4967
								if (var43 > var42) { // L: 4968
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 4969
							}

							var19 = var94.method3411(); // L: 4971
							if (var19 != null) { // L: 4972
								var23 = var19.subWidth; // L: 4973
								var43 = var19.subHeight; // L: 4974
								if (var43 > var42) { // L: 4975
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 4976
							}

							var20 = var94.method3418(); // L: 4978
							if (var20 != null) { // L: 4979
								var24 = var20.subWidth; // L: 4980
								var43 = var20.subHeight; // L: 4981
								if (var43 > var42) { // L: 4982
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 4983
							}

							var21 = var94.method3419(); // L: 4985
							if (var21 != null) { // L: 4986
								var25 = var21.subWidth; // L: 4987
								var43 = var21.subHeight; // L: 4988
								if (var43 > var42) { // L: 4989
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 4990
							}

							if (var16 != null) { // L: 4992
								var30 = var16.method3450(); // L: 4993
								if (var30 != null) { // L: 4994
									var34 = var30.subWidth; // L: 4995
									var43 = var30.subHeight; // L: 4996
									if (var43 > var42) { // L: 4997
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 4998
								}

								var31 = var16.method3411(); // L: 5000
								if (var31 != null) { // L: 5001
									var35 = var31.subWidth; // L: 5002
									var43 = var31.subHeight; // L: 5003
									if (var43 > var42) { // L: 5004
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5005
								}

								var32 = var16.method3418(); // L: 5007
								if (var32 != null) { // L: 5008
									var36 = var32.subWidth; // L: 5009
									var43 = var32.subHeight; // L: 5010
									if (var43 > var42) { // L: 5011
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5012
								}

								var33 = var16.method3419(); // L: 5014
								if (var33 != null) { // L: 5015
									var37 = var33.subWidth; // L: 5016
									var43 = var33.subHeight; // L: 5017
									if (var43 > var42) { // L: 5018
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5019
								}
							}

							Font var80 = var94.getFont(); // L: 5024
							if (var80 == null) { // L: 5025
								var80 = class1.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5026
								var44 = var16.getFont(); // L: 5027
								if (var44 == null) { // L: 5028
									var44 = class1.fontPlain11;
								}
							} else {
								var44 = class1.fontPlain11; // L: 5030
							}

							String var45 = null; // L: 5031
							String var46 = null; // L: 5032
							boolean var47 = false; // L: 5033
							int var48 = 0; // L: 5034
							var45 = var94.getString(var0.hitSplatValues[var76]); // L: 5035
							int var93 = var80.stringWidth(var45); // L: 5036
							if (var16 != null) { // L: 5037
								var46 = var16.getString(var0.hitSplatValues2[var76]); // L: 5038
								var48 = var44.stringWidth(var46); // L: 5039
							}

							int var49 = 0; // L: 5041
							int var50 = 0; // L: 5042
							if (var23 > 0) { // L: 5043
								if (var20 == null && var21 == null) { // L: 5044
									var49 = 1; // L: 5045
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5047 5048
								if (var32 == null && var33 == null) { // L: 5049
									var50 = 1; // L: 5050
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5053
							int var52 = var51; // L: 5054
							if (var22 > 0) { // L: 5055
								var51 += var22;
							}

							var51 += 2; // L: 5056
							int var53 = var51; // L: 5057
							if (var24 > 0) { // L: 5058
								var51 += var24;
							}

							int var54 = var51; // L: 5059
							int var55 = var51; // L: 5060
							int var56;
							if (var23 > 0) { // L: 5061
								var56 = var23 * var49; // L: 5062
								var51 += var56; // L: 5063
								var55 += (var56 - var93) / 2; // L: 5064
							} else {
								var51 += var93; // L: 5067
							}

							var56 = var51; // L: 5069
							if (var25 > 0) { // L: 5070
								var51 += var25;
							}

							int var57 = 0; // L: 5071
							int var58 = 0; // L: 5072
							int var59 = 0; // L: 5073
							int var60 = 0; // L: 5074
							int var61 = 0; // L: 5075
							int var62;
							if (var16 != null) { // L: 5076
								var51 += 2; // L: 5077
								var57 = var51; // L: 5078
								if (var34 > 0) { // L: 5079
									var51 += var34;
								}

								var51 += 2; // L: 5080
								var58 = var51; // L: 5081
								if (var36 > 0) { // L: 5082
									var51 += var36;
								}

								var59 = var51; // L: 5083
								var61 = var51; // L: 5084
								if (var35 > 0) { // L: 5085
									var62 = var35 * var50; // L: 5086
									var51 += var62; // L: 5087
									var61 += (var62 - var48) / 2; // L: 5088
								} else {
									var51 += var48; // L: 5091
								}

								var60 = var51; // L: 5093
								if (var37 > 0) { // L: 5094
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5096
							int var63 = var94.field1957 - var62 * var94.field1957 / var94.field1944; // L: 5097
							int var64 = var62 * var94.field1952 / var94.field1944 + -var94.field1952; // L: 5098
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5099
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5100
							int var67 = var66; // L: 5101
							int var68 = var66 + var42; // L: 5102
							int var69 = var66 + var94.field1958 + 15; // L: 5103
							int var70 = var69 - var80.maxAscent; // L: 5104
							int var71 = var69 + var80.maxDescent; // L: 5105
							if (var70 < var66) { // L: 5106
								var67 = var70;
							}

							if (var71 > var68) { // L: 5107
								var68 = var71;
							}

							int var72 = 0; // L: 5108
							int var73;
							int var74;
							if (var16 != null) { // L: 5109
								var72 = var66 + var16.field1958 + 15; // L: 5110
								var73 = var72 - var44.maxAscent; // L: 5111
								var74 = var72 + var44.maxDescent; // L: 5112
								if (var73 < var67) { // L: 5113
									;
								}

								if (var74 > var68) { // L: 5114
									;
								}
							}

							var73 = 255; // L: 5116
							if (var94.field1959 >= 0) { // L: 5117
								var73 = (var62 << 8) / (var94.field1944 - var94.field1959);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5118
								if (var18 != null) { // L: 5119
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5120
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5121
									for (var74 = 0; var74 < var49; ++var74) { // L: 5122
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5123
									}
								}

								if (var21 != null) { // L: 5126
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var80.drawAlpha(var45, var55 + var65, var69, var94.textColor, 0, var73); // L: 5127
								if (var16 != null) { // L: 5128
									if (var30 != null) { // L: 5129
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5130
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5131
										for (var74 = 0; var74 < var50; ++var74) { // L: 5132
											var31.drawTransAt(var35 * var74 + (var65 + var59 - var39), var66, var73); // L: 5133
										}
									}

									if (var33 != null) { // L: 5136
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 5137
								}
							} else {
								if (var18 != null) { // L: 5141
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5142
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5143
									for (var74 = 0; var74 < var49; ++var74) { // L: 5144
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5145
									}
								}

								if (var21 != null) { // L: 5148
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var80.draw(var45, var65 + var55, var69, var94.textColor | -16777216, 0); // L: 5149
								if (var16 != null) { // L: 5150
									if (var30 != null) { // L: 5151
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5152
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5153
										for (var74 = 0; var74 < var50; ++var74) { // L: 5154
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66); // L: 5155
										}
									}

									if (var33 != null) { // L: 5158
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 5159
								}
							}
						}
					}
				}
			}

		}
	} // L: 5164
}
