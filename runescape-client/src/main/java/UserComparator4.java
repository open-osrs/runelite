import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("ga")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)I",
		garbageValue = "1741486756"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "61"
	)
	static int method2529(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4261
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 4262
			return 1; // L: 4263
		} else if (var0 == 6950) { // L: 4265
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4266
			return 1; // L: 4267
		} else {
			return 2; // L: 4269
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIIII)V",
		garbageValue = "-1284495098"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4886
			if (var0 instanceof NPC) { // L: 4887
				NPCComposition var6 = ((NPC)var0).definition; // L: 4888
				if (var6.transforms != null) { // L: 4889
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4890
					return;
				}
			}

			int var76 = Players.Players_count; // L: 4892
			int[] var7 = Players.Players_indices; // L: 4893
			byte var8 = 0; // L: 4894
			int var10;
			if (var1 < var76 && var0.playerCycle == Client.cycle && Canvas.method492((Player)var0)) { // L: 4895
				Player var9 = (Player)var0; // L: 4896
				if (var1 < var76) { // L: 4897
					var10 = var0.defaultHeight + 15; // L: 4898
					ClanChannel.worldToScreen(var0.x, var0.y, var10); // L: 4900
					AbstractFont var11 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4902
					byte var12 = 9; // L: 4903
					var11.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var12, 16777215, 0); // L: 4904
					var8 = 18; // L: 4905
				}
			}

			int var77 = -2; // L: 4908
			int var17;
			int var23;
			int var24;
			if (!var0.healthBars.method5364()) { // L: 4909
				var10 = var0.defaultHeight + 15; // L: 4910
				ClanChannel.worldToScreen(var0.x, var0.y, var10); // L: 4912

				for (HealthBar var89 = (HealthBar)var0.healthBars.last(); var89 != null; var89 = (HealthBar)var0.healthBars.previous()) { // L: 4914
					HealthBarUpdate var81 = var89.get(Client.cycle); // L: 4915
					if (var81 == null) { // L: 4916
						if (var89.isEmpty()) { // L: 4974
							var89.remove();
						}
					} else {
						HealthBarDefinition var13 = var89.definition; // L: 4917
						SpritePixels var82 = var13.getBackSprite(); // L: 4918
						SpritePixels var83 = var13.getFrontSprite(); // L: 4919
						var17 = 0; // L: 4921
						int var84;
						if (var82 != null && var83 != null) { // L: 4922
							if (var13.widthPadding * 2 < var83.subWidth) { // L: 4923
								var17 = var13.widthPadding;
							}

							var84 = var83.subWidth - var17 * 2; // L: 4924
						} else {
							var84 = var13.width; // L: 4926
						}

						int var18 = 255; // L: 4927
						boolean var85 = true; // L: 4928
						int var86 = Client.cycle - var81.cycle; // L: 4929
						int var87 = var84 * var81.health2 / var13.width; // L: 4930
						int var88;
						int var94;
						if (var81.cycleOffset > var86) { // L: 4931
							var88 = var13.field1607 == 0 ? 0 : var13.field1607 * (var86 / var13.field1607); // L: 4932
							var23 = var84 * var81.health / var13.width; // L: 4933
							var94 = var88 * (var87 - var23) / var81.cycleOffset + var23; // L: 4934
						} else {
							var94 = var87; // L: 4937
							var88 = var81.cycleOffset + var13.int5 - var86; // L: 4938
							if (var13.int3 >= 0) { // L: 4939
								var18 = (var88 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var81.health2 > 0 && var94 < 1) { // L: 4941
							var94 = 1;
						}

						if (var82 != null && var83 != null) { // L: 4942
							if (var84 == var94) { // L: 4943
								var94 += var17 * 2;
							} else {
								var94 += var17; // L: 4944
							}

							var88 = var82.subHeight; // L: 4945
							var77 += var88; // L: 4946
							var23 = var2 + Client.viewportTempX - (var84 >> 1); // L: 4947
							var24 = var3 + Client.viewportTempY - var77; // L: 4948
							var23 -= var17; // L: 4949
							if (var18 >= 0 && var18 < 255) { // L: 4950
								var82.drawTransAt(var23, var24, var18); // L: 4951
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var94 + var23, var88 + var24); // L: 4952
								var83.drawTransAt(var23, var24, var18); // L: 4953
							} else {
								var82.drawTransBgAt(var23, var24); // L: 4956
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var24 + var88); // L: 4957
								var83.drawTransBgAt(var23, var24); // L: 4958
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4960
							var77 += 2; // L: 4961
						} else {
							var77 += 5; // L: 4964
							if (Client.viewportTempX > -1) { // L: 4965
								var88 = var2 + Client.viewportTempX - (var84 >> 1); // L: 4966
								var23 = var3 + Client.viewportTempY - var77; // L: 4967
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var23, var94, 5, 65280); // L: 4968
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var88, var23, var84 - var94, 5, 16711680); // L: 4969
							}

							var77 += 2; // L: 4971
						}
					}
				}
			}

			if (var77 == -2) { // L: 4977
				var77 += 7;
			}

			var77 += var8; // L: 4978
			int var79;
			if (var1 < var76) { // L: 4979
				Player var78 = (Player)var0; // L: 4980
				if (var78.isHidden) { // L: 4981
					return;
				}

				if (var78.headIconPk != -1 || var78.headIconPrayer != -1) { // L: 4982
					var79 = var0.defaultHeight + 15; // L: 4983
					ClanChannel.worldToScreen(var0.x, var0.y, var79); // L: 4985
					if (Client.viewportTempX > -1) { // L: 4987
						if (var78.headIconPk != -1) { // L: 4988
							var77 += 25; // L: 4989
							ScriptFrame.headIconPkSprites[var78.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77); // L: 4990
						}

						if (var78.headIconPrayer != -1) { // L: 4992
							var77 += 25; // L: 4993
							class20.headIconPrayerSprites[var78.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77); // L: 4994
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4998
					var79 = var0.defaultHeight + 15; // L: 4999
					ClanChannel.worldToScreen(var0.x, var0.y, var79); // L: 5001
					if (Client.viewportTempX > -1) { // L: 5003
						var77 += Skills.headIconHintSprites[1].subHeight; // L: 5004
						Skills.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77); // L: 5005
					}
				}
			} else {
				NPCComposition var93 = ((NPC)var0).definition; // L: 5010
				if (var93.transforms != null) { // L: 5011
					var93 = var93.transform();
				}

				if (var93.headIconPrayer >= 0 && var93.headIconPrayer < class20.headIconPrayerSprites.length) { // L: 5012
					var79 = var0.defaultHeight + 15; // L: 5013
					ClanChannel.worldToScreen(var0.x, var0.y, var79); // L: 5015
					if (Client.viewportTempX > -1) { // L: 5017
						class20.headIconPrayerSprites[var93.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5018
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5021
					var79 = var0.defaultHeight + 15; // L: 5022
					ClanChannel.worldToScreen(var0.x, var0.y, var79); // L: 5024
					if (Client.viewportTempX > -1) { // L: 5026
						Skills.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field1253 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5029 5030
				var10 = var0.defaultHeight; // L: 5031
				ClanChannel.worldToScreen(var0.x, var0.y, var10); // L: 5033
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5035
					Client.overheadTextXOffsets[Client.overheadTextCount] = class309.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5036
					Client.overheadTextAscents[Client.overheadTextCount] = class309.fontBold12.ascent; // L: 5037
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5038
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5039
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5040
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5041
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5042
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5043
					++Client.overheadTextCount; // L: 5044
				}
			}

			for (var10 = 0; var10 < 4; ++var10) { // L: 5048
				var79 = var0.hitSplatCycles[var10]; // L: 5049
				int var90 = var0.hitSplatTypes[var10]; // L: 5050
				HitSplatDefinition var91 = null; // L: 5051
				int var14 = 0; // L: 5052
				if (var90 >= 0) { // L: 5053
					if (var79 <= Client.cycle) { // L: 5054
						continue;
					}

					var91 = Decimator.method1171(var0.hitSplatTypes[var10]); // L: 5055
					var14 = var91.field1738; // L: 5056
					if (var91 != null && var91.transforms != null) { // L: 5057
						var91 = var91.transform(); // L: 5058
						if (var91 == null) { // L: 5059
							var0.hitSplatCycles[var10] = -1; // L: 5060
							continue; // L: 5061
						}
					}
				} else if (var79 < 0) { // L: 5065
					continue;
				}

				int var15 = var0.hitSplatTypes2[var10]; // L: 5066
				HitSplatDefinition var16 = null; // L: 5067
				if (var15 >= 0) { // L: 5068
					var16 = Decimator.method1171(var15); // L: 5069
					if (var16 != null && var16.transforms != null) { // L: 5070
						var16 = var16.transform();
					}
				}

				if (var79 - var14 <= Client.cycle) { // L: 5072
					if (var91 == null) { // L: 5073
						var0.hitSplatCycles[var10] = -1; // L: 5074
					} else {
						var17 = var0.defaultHeight / 2; // L: 5077
						ClanChannel.worldToScreen(var0.x, var0.y, var17); // L: 5079
						if (Client.viewportTempX > -1) { // L: 5081
							if (var10 == 1) { // L: 5083
								Client.viewportTempY -= 20; // L: 5084
							}

							if (var10 == 2) { // L: 5086
								Client.viewportTempX -= 15; // L: 5087
								Client.viewportTempY -= 10; // L: 5088
							}

							if (var10 == 3) { // L: 5090
								Client.viewportTempX += 15; // L: 5091
								Client.viewportTempY -= 10; // L: 5092
							}

							SpritePixels var19 = null; // L: 5094
							SpritePixels var20 = null; // L: 5095
							SpritePixels var21 = null; // L: 5096
							SpritePixels var22 = null; // L: 5097
							var23 = 0; // L: 5098
							var24 = 0; // L: 5099
							int var25 = 0; // L: 5100
							int var26 = 0; // L: 5101
							int var27 = 0; // L: 5102
							int var28 = 0; // L: 5103
							int var29 = 0; // L: 5104
							int var30 = 0; // L: 5105
							SpritePixels var31 = null; // L: 5106
							SpritePixels var32 = null; // L: 5107
							SpritePixels var33 = null; // L: 5108
							SpritePixels var34 = null; // L: 5109
							int var35 = 0; // L: 5110
							int var36 = 0; // L: 5111
							int var37 = 0; // L: 5112
							int var38 = 0; // L: 5113
							int var39 = 0; // L: 5114
							int var40 = 0; // L: 5115
							int var41 = 0; // L: 5116
							int var42 = 0; // L: 5117
							int var43 = 0; // L: 5118
							var19 = var91.method2978(); // L: 5119
							int var44;
							if (var19 != null) { // L: 5120
								var23 = var19.subWidth; // L: 5121
								var44 = var19.subHeight; // L: 5122
								if (var44 > var43) { // L: 5123
									var43 = var44;
								}

								var27 = var19.xOffset; // L: 5124
							}

							var20 = var91.method3005(); // L: 5126
							if (var20 != null) { // L: 5127
								var24 = var20.subWidth; // L: 5128
								var44 = var20.subHeight; // L: 5129
								if (var44 > var43) { // L: 5130
									var43 = var44;
								}

								var28 = var20.xOffset; // L: 5131
							}

							var21 = var91.method2980(); // L: 5133
							if (var21 != null) { // L: 5134
								var25 = var21.subWidth; // L: 5135
								var44 = var21.subHeight; // L: 5136
								if (var44 > var43) { // L: 5137
									var43 = var44;
								}

								var29 = var21.xOffset; // L: 5138
							}

							var22 = var91.method2981(); // L: 5140
							if (var22 != null) { // L: 5141
								var26 = var22.subWidth; // L: 5142
								var44 = var22.subHeight; // L: 5143
								if (var44 > var43) { // L: 5144
									var43 = var44;
								}

								var30 = var22.xOffset; // L: 5145
							}

							if (var16 != null) { // L: 5147
								var31 = var16.method2978(); // L: 5148
								if (var31 != null) { // L: 5149
									var35 = var31.subWidth; // L: 5150
									var44 = var31.subHeight; // L: 5151
									if (var44 > var43) { // L: 5152
										var43 = var44;
									}

									var39 = var31.xOffset; // L: 5153
								}

								var32 = var16.method3005(); // L: 5155
								if (var32 != null) { // L: 5156
									var36 = var32.subWidth; // L: 5157
									var44 = var32.subHeight; // L: 5158
									if (var44 > var43) { // L: 5159
										var43 = var44;
									}

									var40 = var32.xOffset; // L: 5160
								}

								var33 = var16.method2980(); // L: 5162
								if (var33 != null) { // L: 5163
									var37 = var33.subWidth; // L: 5164
									var44 = var33.subHeight; // L: 5165
									if (var44 > var43) { // L: 5166
										var43 = var44;
									}

									var41 = var33.xOffset; // L: 5167
								}

								var34 = var16.method2981(); // L: 5169
								if (var34 != null) { // L: 5170
									var38 = var34.subWidth; // L: 5171
									var44 = var34.subHeight; // L: 5172
									if (var44 > var43) { // L: 5173
										var43 = var44;
									}

									var42 = var34.xOffset; // L: 5174
								}
							}

							Font var80 = var91.getFont(); // L: 5179
							if (var80 == null) { // L: 5180
								var80 = UserComparator10.fontPlain11;
							}

							Font var45;
							if (var16 != null) { // L: 5181
								var45 = var16.getFont(); // L: 5182
								if (var45 == null) { // L: 5183
									var45 = UserComparator10.fontPlain11;
								}
							} else {
								var45 = UserComparator10.fontPlain11; // L: 5185
							}

							String var46 = null; // L: 5186
							String var47 = null; // L: 5187
							boolean var48 = false; // L: 5188
							int var49 = 0; // L: 5189
							var46 = var91.getString(var0.hitSplatValues[var10]); // L: 5190
							int var92 = var80.stringWidth(var46); // L: 5191
							if (var16 != null) { // L: 5192
								var47 = var16.getString(var0.hitSplatValues2[var10]); // L: 5193
								var49 = var45.stringWidth(var47); // L: 5194
							}

							int var50 = 0; // L: 5196
							int var51 = 0; // L: 5197
							if (var24 > 0) { // L: 5198
								if (var21 == null && var22 == null) { // L: 5199
									var50 = 1; // L: 5200
								} else {
									var50 = var92 / var24 + 1;
								}
							}

							if (var16 != null && var36 > 0) { // L: 5202 5203
								if (var33 == null && var34 == null) { // L: 5204
									var51 = 1; // L: 5205
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0; // L: 5208
							int var53 = var52; // L: 5209
							if (var23 > 0) { // L: 5210
								var52 += var23;
							}

							var52 += 2; // L: 5211
							int var54 = var52; // L: 5212
							if (var25 > 0) { // L: 5213
								var52 += var25;
							}

							int var55 = var52; // L: 5214
							int var56 = var52; // L: 5215
							int var57;
							if (var24 > 0) { // L: 5216
								var57 = var24 * var50; // L: 5217
								var52 += var57; // L: 5218
								var56 += (var57 - var92) / 2; // L: 5219
							} else {
								var52 += var92; // L: 5222
							}

							var57 = var52; // L: 5224
							if (var26 > 0) { // L: 5225
								var52 += var26;
							}

							int var58 = 0; // L: 5226
							int var59 = 0; // L: 5227
							int var60 = 0; // L: 5228
							int var61 = 0; // L: 5229
							int var62 = 0; // L: 5230
							int var63;
							if (var16 != null) { // L: 5231
								var52 += 2; // L: 5232
								var58 = var52; // L: 5233
								if (var35 > 0) { // L: 5234
									var52 += var35;
								}

								var52 += 2; // L: 5235
								var59 = var52; // L: 5236
								if (var37 > 0) { // L: 5237
									var52 += var37;
								}

								var60 = var52; // L: 5238
								var62 = var52; // L: 5239
								if (var36 > 0) { // L: 5240
									var63 = var51 * var36; // L: 5241
									var52 += var63; // L: 5242
									var62 += (var63 - var49) / 2; // L: 5243
								} else {
									var52 += var49; // L: 5246
								}

								var61 = var52; // L: 5248
								if (var38 > 0) { // L: 5249
									var52 += var38;
								}
							}

							var63 = var0.hitSplatCycles[var10] - Client.cycle; // L: 5251
							int var64 = var91.field1733 - var63 * var91.field1733 / var91.field1738; // L: 5252
							int var65 = var63 * var91.field1744 / var91.field1738 + -var91.field1744; // L: 5253
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1)); // L: 5254
							int var67 = var65 + (var3 + Client.viewportTempY - 12); // L: 5255
							int var68 = var67; // L: 5256
							int var69 = var67 + var43; // L: 5257
							int var70 = var67 + var91.field1748 + 15; // L: 5258
							int var71 = var70 - var80.maxAscent; // L: 5259
							int var72 = var70 + var80.maxDescent; // L: 5260
							if (var71 < var67) { // L: 5261
								var68 = var71;
							}

							if (var72 > var69) { // L: 5262
								var69 = var72;
							}

							int var73 = 0; // L: 5263
							int var74;
							int var75;
							if (var16 != null) { // L: 5264
								var73 = var67 + var16.field1748 + 15; // L: 5265
								var74 = var73 - var45.maxAscent; // L: 5266
								var75 = var73 + var45.maxDescent; // L: 5267
								if (var74 < var68) { // L: 5268
									;
								}

								if (var75 > var69) { // L: 5269
									;
								}
							}

							var74 = 255; // L: 5271
							if (var91.field1745 >= 0) { // L: 5272
								var74 = (var63 << 8) / (var91.field1738 - var91.field1745);
							}

							if (var74 >= 0 && var74 < 255) { // L: 5273
								if (var19 != null) { // L: 5274
									var19.drawTransAt(var66 + var53 - var27, var67, var74);
								}

								if (var21 != null) { // L: 5275
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) { // L: 5276
									for (var75 = 0; var75 < var50; ++var75) { // L: 5277
										var20.drawTransAt(var75 * var24 + (var55 + var66 - var28), var67, var74); // L: 5278
									}
								}

								if (var22 != null) { // L: 5281
									var22.drawTransAt(var57 + var66 - var30, var67, var74);
								}

								var80.drawAlpha(var46, var56 + var66, var70, var91.textColor, 0, var74); // L: 5282
								if (var16 != null) { // L: 5283
									if (var31 != null) { // L: 5284
										var31.drawTransAt(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) { // L: 5285
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) { // L: 5286
										for (var75 = 0; var75 < var51; ++var75) { // L: 5287
											var32.drawTransAt(var75 * var36 + (var66 + var60 - var40), var67, var74); // L: 5288
										}
									}

									if (var34 != null) { // L: 5291
										var34.drawTransAt(var61 + var66 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var16.textColor, 0, var74); // L: 5292
								}
							} else {
								if (var19 != null) { // L: 5296
									var19.drawTransBgAt(var53 + var66 - var27, var67);
								}

								if (var21 != null) { // L: 5297
									var21.drawTransBgAt(var66 + var54 - var29, var67);
								}

								if (var20 != null) { // L: 5298
									for (var75 = 0; var75 < var50; ++var75) { // L: 5299
										var20.drawTransBgAt(var75 * var24 + (var66 + var55 - var28), var67); // L: 5300
									}
								}

								if (var22 != null) { // L: 5303
									var22.drawTransBgAt(var66 + var57 - var30, var67);
								}

								var80.draw(var46, var66 + var56, var70, var91.textColor | -16777216, 0); // L: 5304
								if (var16 != null) { // L: 5305
									if (var31 != null) { // L: 5306
										var31.drawTransBgAt(var66 + var58 - var39, var67);
									}

									if (var33 != null) { // L: 5307
										var33.drawTransBgAt(var66 + var59 - var41, var67);
									}

									if (var32 != null) { // L: 5308
										for (var75 = 0; var75 < var51; ++var75) { // L: 5309
											var32.drawTransBgAt(var75 * var36 + (var66 + var60 - var40), var67); // L: 5310
										}
									}

									if (var34 != null) { // L: 5313
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var16.textColor | -16777216, 0); // L: 5314
								}
							}
						}
					}
				}
			}

		}
	} // L: 5319
}
