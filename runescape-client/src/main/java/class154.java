import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class154 extends class165 {
	@ObfuscatedName("c")
	String field1720;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class154(class155 var1, String var2, String var3) {
		super(var1, var2); // L: 390
		this.this$0 = var1; // L: 389
		this.field1720 = var3; // L: 391
	} // L: 392

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-118"
	)
	public int vmethod3314() {
		return 1; // L: 395
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "11"
	)
	public String vmethod3320() {
		return this.field1720; // L: 400
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-431729145"
	)
	static final boolean method3163(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "678269677"
	)
	static int method3170(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-54"
	)
	static final int method3169(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 881
		int var4 = var0 & var2 - 1; // L: 882
		int var5 = var1 / var2; // L: 883
		int var6 = var1 & var2 - 1; // L: 884
		int var7 = SoundSystem.method740(var3, var5); // L: 885
		int var8 = SoundSystem.method740(var3 + 1, var5); // L: 886
		int var9 = SoundSystem.method740(var3, var5 + 1); // L: 887
		int var10 = SoundSystem.method740(var3 + 1, var5 + 1); // L: 888
		int var11 = SequenceDefinition.method3827(var7, var8, var4, var2); // L: 889
		int var12 = SequenceDefinition.method3827(var9, var10, var4, var2); // L: 890
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 893
		int var13 = ((65536 - var14) * var11 >> 16) + (var12 * var14 >> 16); // L: 894
		return var13; // L: 896
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIIIII)V",
		garbageValue = "678056346"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4957
			if (var0 instanceof NPC) { // L: 4958
				NPCComposition var6 = ((NPC)var0).definition; // L: 4959
				if (var6.transforms != null) { // L: 4960
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4961
					return;
				}
			}

			int var76 = Players.Players_count; // L: 4963
			int[] var7 = Players.Players_indices; // L: 4964
			byte var8 = 0; // L: 4965
			Player var10;
			int var92;
			if (var1 < var76 && var0.playerCycle == Client.cycle) { // L: 4966
				var10 = (Player)var0; // L: 4968
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 4970
					var9 = false; // L: 4971
				} else if (var10 != class101.localPlayer) { // L: 4974
					boolean var11 = (Client.drawPlayerNames & 4) != 0; // L: 4977
					boolean var12 = var11; // L: 4979
					if (!var11) { // L: 4980
						boolean var13 = (Client.drawPlayerNames & 1) != 0; // L: 4983
						var12 = var13 && var10.isFriend(); // L: 4985
					}

					var9 = var12 || Language.method6070() && var10.isFriendsChatMember(); // L: 4987
				} else {
					var9 = class138.method2944(); // L: 4989
				}

				if (var9) { // L: 4991
					Player var77 = (Player)var0; // L: 4992
					if (var1 < var76) { // L: 4993
						var92 = var0.defaultHeight + 15; // L: 4994
						class220.worldToScreen(var0.x, var0.y, var92); // L: 4996
						AbstractFont var78 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4998
						byte var14 = 9; // L: 4999
						var78.drawCentered(var77.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var14, 16777215, 0); // L: 5000
						var8 = 18; // L: 5001
					}
				}
			}

			int var89 = -2; // L: 5005
			int var17;
			int var23;
			int var24;
			int var79;
			if (!var0.healthBars.method6147()) { // L: 5006
				var79 = var0.defaultHeight + 15; // L: 5007
				class220.worldToScreen(var0.x, var0.y, var79); // L: 5009

				for (HealthBar var96 = (HealthBar)var0.healthBars.last(); var96 != null; var96 = (HealthBar)var0.healthBars.previous()) { // L: 5011
					HealthBarUpdate var81 = var96.get(Client.cycle); // L: 5012
					if (var81 == null) { // L: 5013
						if (var96.isEmpty()) { // L: 5071
							var96.remove();
						}
					} else {
						HealthBarDefinition var97 = var96.definition; // L: 5014
						SpritePixels var82 = var97.getBackSprite(); // L: 5015
						SpritePixels var83 = var97.getFrontSprite(); // L: 5016
						var17 = 0; // L: 5018
						int var84;
						if (var82 != null && var83 != null) { // L: 5019
							if (var97.widthPadding * 2 < var83.subWidth) { // L: 5020
								var17 = var97.widthPadding;
							}

							var84 = var83.subWidth - var17 * 2; // L: 5021
						} else {
							var84 = var97.width; // L: 5023
						}

						int var18 = 255; // L: 5024
						boolean var85 = true; // L: 5025
						int var86 = Client.cycle - var81.cycle; // L: 5026
						int var87 = var84 * var81.health2 / var97.width; // L: 5027
						int var88;
						int var99;
						if (var81.cycleOffset > var86) { // L: 5028
							var88 = var97.field1881 == 0 ? 0 : var97.field1881 * (var86 / var97.field1881); // L: 5029
							var23 = var84 * var81.health / var97.width; // L: 5030
							var99 = var88 * (var87 - var23) / var81.cycleOffset + var23; // L: 5031
						} else {
							var99 = var87; // L: 5034
							var88 = var97.int5 + var81.cycleOffset - var86; // L: 5035
							if (var97.int3 >= 0) { // L: 5036
								var18 = (var88 << 8) / (var97.int5 - var97.int3);
							}
						}

						if (var81.health2 > 0 && var99 < 1) { // L: 5038
							var99 = 1;
						}

						if (var82 != null && var83 != null) { // L: 5039
							if (var84 == var99) { // L: 5040
								var99 += var17 * 2;
							} else {
								var99 += var17; // L: 5041
							}

							var88 = var82.subHeight; // L: 5042
							var89 += var88; // L: 5043
							var23 = var2 + Client.viewportTempX - (var84 >> 1); // L: 5044
							var24 = var3 + Client.viewportTempY - var89; // L: 5045
							var23 -= var17; // L: 5046
							if (var18 >= 0 && var18 < 255) { // L: 5047
								var82.drawTransAt(var23, var24, var18); // L: 5048
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var99 + var23, var24 + var88); // L: 5049
								var83.drawTransAt(var23, var24, var18); // L: 5050
							} else {
								var82.drawTransBgAt(var23, var24); // L: 5053
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var99 + var23, var88 + var24); // L: 5054
								var83.drawTransBgAt(var23, var24); // L: 5055
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5057
							var89 += 2; // L: 5058
						} else {
							var89 += 5; // L: 5061
							if (Client.viewportTempX > -1) { // L: 5062
								var88 = var2 + Client.viewportTempX - (var84 >> 1); // L: 5063
								var23 = var3 + Client.viewportTempY - var89; // L: 5064
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var23, var99, 5, 65280); // L: 5065
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var99, var23, var84 - var99, 5, 16711680); // L: 5066
							}

							var89 += 2; // L: 5068
						}
					}
				}
			}

			if (var89 == -2) { // L: 5074
				var89 += 7;
			}

			var89 += var8; // L: 5075
			int var91;
			if (var1 < var76) { // L: 5076
				var10 = (Player)var0; // L: 5077
				if (var10.isHidden) { // L: 5078
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 5079
					var91 = var0.defaultHeight + 15; // L: 5080
					class220.worldToScreen(var0.x, var0.y, var91); // L: 5082
					if (Client.viewportTempX > -1) { // L: 5084
						if (var10.headIconPk != -1) { // L: 5085
							var89 += 25; // L: 5086
							Message.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5087
						}

						if (var10.headIconPrayer != -1) { // L: 5089
							var89 += 25; // L: 5090
							class28.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5091
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5095
					var91 = var0.defaultHeight + 15; // L: 5096
					class220.worldToScreen(var0.x, var0.y, var91); // L: 5098
					if (Client.viewportTempX > -1) { // L: 5100
						var89 += UserComparator4.headIconHintSprites[1].subHeight; // L: 5101
						UserComparator4.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5102
					}
				}
			} else {
				NPCComposition var90 = ((NPC)var0).definition; // L: 5107
				if (var90.transforms != null) { // L: 5108
					var90 = var90.transform();
				}

				if (var90.headIconPrayer >= 0 && var90.headIconPrayer < class28.headIconPrayerSprites.length) { // L: 5109
					var91 = var0.defaultHeight + 15; // L: 5110
					class220.worldToScreen(var0.x, var0.y, var91); // L: 5112
					if (Client.viewportTempX > -1) { // L: 5114
						class28.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5115
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5118
					var91 = var0.defaultHeight + 15; // L: 5119
					class220.worldToScreen(var0.x, var0.y, var91); // L: 5121
					if (Client.viewportTempX > -1) { // L: 5123
						UserComparator4.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field1152 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5126 5127
				var79 = var0.defaultHeight; // L: 5128
				class220.worldToScreen(var0.x, var0.y, var79); // L: 5130
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5132
					Client.overheadTextXOffsets[Client.overheadTextCount] = TileItem.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5133
					Client.overheadTextAscents[Client.overheadTextCount] = TileItem.fontBold12.ascent; // L: 5134
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5135
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5136
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5137
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5138
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5139
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5140
					++Client.overheadTextCount; // L: 5141
				}
			}

			for (var79 = 0; var79 < 4; ++var79) { // L: 5145
				var91 = var0.hitSplatCycles[var79]; // L: 5146
				var92 = var0.hitSplatTypes[var79]; // L: 5147
				HitSplatDefinition var98 = null; // L: 5148
				int var93 = 0; // L: 5149
				if (var92 >= 0) { // L: 5150
					if (var91 <= Client.cycle) { // L: 5151
						continue;
					}

					var98 = class122.method2800(var0.hitSplatTypes[var79]); // L: 5152
					var93 = var98.field2026; // L: 5153
					if (var98 != null && var98.transforms != null) { // L: 5154
						var98 = var98.transform(); // L: 5155
						if (var98 == null) { // L: 5156
							var0.hitSplatCycles[var79] = -1; // L: 5157
							continue; // L: 5158
						}
					}
				} else if (var91 < 0) { // L: 5162
					continue;
				}

				int var15 = var0.hitSplatTypes2[var79]; // L: 5163
				HitSplatDefinition var16 = null; // L: 5164
				if (var15 >= 0) { // L: 5165
					var16 = class122.method2800(var15); // L: 5166
					if (var16 != null && var16.transforms != null) { // L: 5167
						var16 = var16.transform();
					}
				}

				if (var91 - var93 <= Client.cycle) { // L: 5169
					if (var98 == null) { // L: 5170
						var0.hitSplatCycles[var79] = -1; // L: 5171
					} else {
						var17 = var0.defaultHeight / 2; // L: 5174
						class220.worldToScreen(var0.x, var0.y, var17); // L: 5176
						if (Client.viewportTempX > -1) { // L: 5178
							boolean var94 = true; // L: 5179
							if (var79 == 1) { // L: 5180
								Client.viewportTempY -= 20; // L: 5181
							}

							if (var79 == 2) { // L: 5183
								Client.viewportTempX -= 15; // L: 5184
								Client.viewportTempY -= 10; // L: 5185
							}

							if (var79 == 3) { // L: 5187
								Client.viewportTempX += 15; // L: 5188
								Client.viewportTempY -= 10; // L: 5189
							}

							SpritePixels var19 = null; // L: 5191
							SpritePixels var20 = null; // L: 5192
							SpritePixels var21 = null; // L: 5193
							SpritePixels var22 = null; // L: 5194
							var23 = 0; // L: 5195
							var24 = 0; // L: 5196
							int var25 = 0; // L: 5197
							int var26 = 0; // L: 5198
							int var27 = 0; // L: 5199
							int var28 = 0; // L: 5200
							int var29 = 0; // L: 5201
							int var30 = 0; // L: 5202
							SpritePixels var31 = null; // L: 5203
							SpritePixels var32 = null; // L: 5204
							SpritePixels var33 = null; // L: 5205
							SpritePixels var34 = null; // L: 5206
							int var35 = 0; // L: 5207
							int var36 = 0; // L: 5208
							int var37 = 0; // L: 5209
							int var38 = 0; // L: 5210
							int var39 = 0; // L: 5211
							int var40 = 0; // L: 5212
							int var41 = 0; // L: 5213
							int var42 = 0; // L: 5214
							int var43 = 0; // L: 5215
							var19 = var98.method3623(); // L: 5216
							int var44;
							if (var19 != null) { // L: 5217
								var23 = var19.subWidth; // L: 5218
								var44 = var19.subHeight; // L: 5219
								if (var44 > var43) { // L: 5220
									var43 = var44;
								}

								var27 = var19.xOffset; // L: 5221
							}

							var20 = var98.method3643(); // L: 5223
							if (var20 != null) { // L: 5224
								var24 = var20.subWidth; // L: 5225
								var44 = var20.subHeight; // L: 5226
								if (var44 > var43) { // L: 5227
									var43 = var44;
								}

								var28 = var20.xOffset; // L: 5228
							}

							var21 = var98.method3625(); // L: 5230
							if (var21 != null) { // L: 5231
								var25 = var21.subWidth; // L: 5232
								var44 = var21.subHeight; // L: 5233
								if (var44 > var43) { // L: 5234
									var43 = var44;
								}

								var29 = var21.xOffset; // L: 5235
							}

							var22 = var98.method3626(); // L: 5237
							if (var22 != null) { // L: 5238
								var26 = var22.subWidth; // L: 5239
								var44 = var22.subHeight; // L: 5240
								if (var44 > var43) { // L: 5241
									var43 = var44;
								}

								var30 = var22.xOffset; // L: 5242
							}

							if (var16 != null) { // L: 5244
								var31 = var16.method3623(); // L: 5245
								if (var31 != null) { // L: 5246
									var35 = var31.subWidth; // L: 5247
									var44 = var31.subHeight; // L: 5248
									if (var44 > var43) { // L: 5249
										var43 = var44;
									}

									var39 = var31.xOffset; // L: 5250
								}

								var32 = var16.method3643(); // L: 5252
								if (var32 != null) { // L: 5253
									var36 = var32.subWidth; // L: 5254
									var44 = var32.subHeight; // L: 5255
									if (var44 > var43) { // L: 5256
										var43 = var44;
									}

									var40 = var32.xOffset; // L: 5257
								}

								var33 = var16.method3625(); // L: 5259
								if (var33 != null) { // L: 5260
									var37 = var33.subWidth; // L: 5261
									var44 = var33.subHeight; // L: 5262
									if (var44 > var43) { // L: 5263
										var43 = var44;
									}

									var41 = var33.xOffset; // L: 5264
								}

								var34 = var16.method3626(); // L: 5266
								if (var34 != null) { // L: 5267
									var38 = var34.subWidth; // L: 5268
									var44 = var34.subHeight; // L: 5269
									if (var44 > var43) { // L: 5270
										var43 = var44;
									}

									var42 = var34.xOffset; // L: 5271
								}
							}

							Font var80 = var98.getFont(); // L: 5276
							if (var80 == null) { // L: 5277
								var80 = MouseHandler.fontPlain11;
							}

							Font var45;
							if (var16 != null) { // L: 5278
								var45 = var16.getFont(); // L: 5279
								if (var45 == null) { // L: 5280
									var45 = MouseHandler.fontPlain11;
								}
							} else {
								var45 = MouseHandler.fontPlain11; // L: 5282
							}

							String var46 = null; // L: 5283
							String var47 = null; // L: 5284
							boolean var48 = false; // L: 5285
							int var49 = 0; // L: 5286
							var46 = var98.getString(var0.hitSplatValues[var79]); // L: 5287
							int var95 = var80.stringWidth(var46); // L: 5288
							if (var16 != null) { // L: 5289
								var47 = var16.getString(var0.hitSplatValues2[var79]); // L: 5290
								var49 = var45.stringWidth(var47); // L: 5291
							}

							int var50 = 0; // L: 5293
							int var51 = 0; // L: 5294
							if (var24 > 0) { // L: 5295
								if (var21 == null && var22 == null) { // L: 5296
									var50 = 1; // L: 5297
								} else {
									var50 = var95 / var24 + 1;
								}
							}

							if (var16 != null && var36 > 0) { // L: 5299 5300
								if (var33 == null && var34 == null) { // L: 5301
									var51 = 1; // L: 5302
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0; // L: 5305
							int var53 = var52; // L: 5306
							if (var23 > 0) { // L: 5307
								var52 += var23;
							}

							var52 += 2; // L: 5308
							int var54 = var52; // L: 5309
							if (var25 > 0) { // L: 5310
								var52 += var25;
							}

							int var55 = var52; // L: 5311
							int var56 = var52; // L: 5312
							int var57;
							if (var24 > 0) { // L: 5313
								var57 = var50 * var24; // L: 5314
								var52 += var57; // L: 5315
								var56 += (var57 - var95) / 2; // L: 5316
							} else {
								var52 += var95; // L: 5319
							}

							var57 = var52; // L: 5321
							if (var26 > 0) { // L: 5322
								var52 += var26;
							}

							int var58 = 0; // L: 5323
							int var59 = 0; // L: 5324
							int var60 = 0; // L: 5325
							int var61 = 0; // L: 5326
							int var62 = 0; // L: 5327
							int var63;
							if (var16 != null) { // L: 5328
								var52 += 2; // L: 5329
								var58 = var52; // L: 5330
								if (var35 > 0) { // L: 5331
									var52 += var35;
								}

								var52 += 2; // L: 5332
								var59 = var52; // L: 5333
								if (var37 > 0) { // L: 5334
									var52 += var37;
								}

								var60 = var52; // L: 5335
								var62 = var52; // L: 5336
								if (var36 > 0) { // L: 5337
									var63 = var51 * var36; // L: 5338
									var52 += var63; // L: 5339
									var62 += (var63 - var49) / 2; // L: 5340
								} else {
									var52 += var49; // L: 5343
								}

								var61 = var52; // L: 5345
								if (var38 > 0) { // L: 5346
									var52 += var38;
								}
							}

							var63 = var0.hitSplatCycles[var79] - Client.cycle; // L: 5348
							int var64 = var98.field2031 - var63 * var98.field2031 / var98.field2026; // L: 5349
							int var65 = var63 * var98.field2032 / var98.field2026 + -var98.field2032; // L: 5350
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1)); // L: 5351
							int var67 = var3 + Client.viewportTempY - 12 + var65; // L: 5352
							int var68 = var67; // L: 5353
							int var69 = var43 + var67; // L: 5354
							int var70 = var67 + var98.field2019 + 15; // L: 5355
							int var71 = var70 - var80.maxAscent; // L: 5356
							int var72 = var70 + var80.maxDescent; // L: 5357
							if (var71 < var67) { // L: 5358
								var68 = var71;
							}

							if (var72 > var69) { // L: 5359
								var69 = var72;
							}

							int var73 = 0; // L: 5360
							int var74;
							int var75;
							if (var16 != null) { // L: 5361
								var73 = var67 + var16.field2019 + 15; // L: 5362
								var74 = var73 - var45.maxAscent; // L: 5363
								var75 = var73 + var45.maxDescent; // L: 5364
								if (var74 < var68) { // L: 5365
									;
								}

								if (var75 > var69) { // L: 5366
									;
								}
							}

							var74 = 255; // L: 5368
							if (var98.field2030 >= 0) { // L: 5369
								var74 = (var63 << 8) / (var98.field2026 - var98.field2030);
							}

							if (var74 >= 0 && var74 < 255) { // L: 5370
								if (var19 != null) { // L: 5371
									var19.drawTransAt(var66 + var53 - var27, var67, var74);
								}

								if (var21 != null) { // L: 5372
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) { // L: 5373
									for (var75 = 0; var75 < var50; ++var75) { // L: 5374
										var20.drawTransAt(var24 * var75 + (var55 + var66 - var28), var67, var74); // L: 5375
									}
								}

								if (var22 != null) { // L: 5378
									var22.drawTransAt(var57 + var66 - var30, var67, var74);
								}

								var80.drawAlpha(var46, var66 + var56, var70, var98.textColor, 0, var74); // L: 5379
								if (var16 != null) { // L: 5380
									if (var31 != null) { // L: 5381
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) { // L: 5382
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) { // L: 5383
										for (var75 = 0; var75 < var51; ++var75) { // L: 5384
											var32.drawTransAt(var75 * var36 + (var66 + var60 - var40), var67, var74); // L: 5385
										}
									}

									if (var34 != null) { // L: 5388
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var62 + var66, var73, var16.textColor, 0, var74); // L: 5389
								}
							} else {
								if (var19 != null) { // L: 5393
									var19.drawTransBgAt(var53 + var66 - var27, var67);
								}

								if (var21 != null) { // L: 5394
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}

								if (var20 != null) { // L: 5395
									for (var75 = 0; var75 < var50; ++var75) { // L: 5396
										var20.drawTransBgAt(var24 * var75 + (var55 + var66 - var28), var67); // L: 5397
									}
								}

								if (var22 != null) { // L: 5400
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var80.draw(var46, var56 + var66, var70, var98.textColor | -16777216, 0); // L: 5401
								if (var16 != null) { // L: 5402
									if (var31 != null) { // L: 5403
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) { // L: 5404
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) { // L: 5405
										for (var75 = 0; var75 < var51; ++var75) { // L: 5406
											var32.drawTransBgAt(var36 * var75 + (var60 + var66 - var40), var67); // L: 5407
										}
									}

									if (var34 != null) { // L: 5410
										var34.drawTransBgAt(var61 + var66 - var42, var67);
									}

									var45.draw(var47, var62 + var66, var73, var16.textColor | -16777216, 0); // L: 5411
								}
							}
						}
					}
				}
			}

		}
	} // L: 5416
}
