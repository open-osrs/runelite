import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
final class class1 implements class0 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -115998375
	)
	static int field3;
	@ObfuscatedName("x")
	static int[] field1;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive15")
	static Archive archive15;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkb;I)V",
		garbageValue = "192866787"
	)
	public void vmethod69(Object var1, Buffer var2) {
		this.method9((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Ljava/lang/Object;",
		garbageValue = "-1094020977"
	)
	public Object vmethod72(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lkb;B)V",
		garbageValue = "0"
	)
	void method9(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("f")
	static boolean method8(long var0) {
		return KeyHandler.Entity_unpackSceneX(var0) == 2; // L: 44
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "1800966997"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = DefaultsGroup.World_worlds[var6]; // L: 180
			DefaultsGroup.World_worlds[var6] = DefaultsGroup.World_worlds[var1]; // L: 181
			DefaultsGroup.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (WorldMapIcon_1.method395(DefaultsGroup.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = DefaultsGroup.World_worlds[var9]; // L: 185
					DefaultsGroup.World_worlds[var9] = DefaultsGroup.World_worlds[var7]; // L: 186
					DefaultsGroup.World_worlds[var7++] = var10; // L: 187
				}
			}

			DefaultsGroup.World_worlds[var1] = DefaultsGroup.World_worlds[var7]; // L: 191
			DefaultsGroup.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1463898709"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 147
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "6"
	)
	static final int method20(int var0, int var1) {
		if (var0 == -2) { // L: 477
			return 12345678;
		} else if (var0 == -1) { // L: 478
			if (var1 < 2) {
				var1 = 2; // L: 479
			} else if (var1 > 126) { // L: 480
				var1 = 126;
			}

			return var1; // L: 481
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 483
			if (var1 < 2) { // L: 484
				var1 = 2;
			} else if (var1 > 126) { // L: 485
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 486
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIIIII)V",
		garbageValue = "-1076468107"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4930
			if (var0 instanceof NPC) { // L: 4931
				NPCDefinition var6 = ((NPC)var0).definition; // L: 4932
				if (var6.transforms != null) { // L: 4933
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4934
					return;
				}
			}

			int var76 = Players.Players_count; // L: 4936
			int[] var7 = Players.Players_indices; // L: 4937
			byte var8 = 0; // L: 4938
			Player var10;
			int var12;
			if (var1 < var76 && var0.playerCycle == Client.cycle) { // L: 4939
				var10 = (Player)var0; // L: 4941
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 4943
					var9 = false; // L: 4944
				} else if (var10 == PlayerType.localPlayer) { // L: 4947
					var9 = WorldMapAreaData.method786(); // L: 4950
				} else {
					var9 = WorldMapSection1.method681() || class2.method28() && var10.isFriend() || Widget.method4239() && var10.isClanMember(); // L: 4948
				}

				if (var9) { // L: 4952
					Player var11 = (Player)var0; // L: 4953
					if (var1 < var76) { // L: 4954
						var12 = var0.defaultHeight + 15; // L: 4955
						class13.worldToScreen(var0.x, var0.y, var12); // L: 4957
						AbstractFont var13 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4959
						byte var14 = 9; // L: 4960
						var13.drawCentered(var11.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var14, 16777215, 0); // L: 4961
						var8 = 18; // L: 4962
					}
				}
			}

			int var88 = -2; // L: 4966
			int var17;
			int var23;
			int var24;
			int var77;
			if (!var0.healthBars.method4990()) { // L: 4967
				var77 = var0.defaultHeight + 15; // L: 4968
				class13.worldToScreen(var0.x, var0.y, var77); // L: 4970

				for (HealthBar var90 = (HealthBar)var0.healthBars.last(); var90 != null; var90 = (HealthBar)var0.healthBars.previous()) { // L: 4972
					HealthBarUpdate var80 = var90.get(Client.cycle); // L: 4973
					if (var80 == null) { // L: 4974
						if (var90.isEmpty()) { // L: 5032
							var90.remove();
						}
					} else {
						HealthBarDefinition var91 = var90.definition; // L: 4975
						Sprite var81 = var91.getBackSprite(); // L: 4976
						Sprite var82 = var91.getFrontSprite(); // L: 4977
						var17 = 0; // L: 4979
						int var83;
						if (var81 != null && var82 != null) { // L: 4980
							if (var91.widthPadding * 2 < var82.subWidth) { // L: 4981
								var17 = var91.widthPadding;
							}

							var83 = var82.subWidth - var17 * 2; // L: 4982
						} else {
							var83 = var91.width; // L: 4984
						}

						int var18 = 255; // L: 4985
						boolean var84 = true; // L: 4986
						int var85 = Client.cycle - var80.cycle; // L: 4987
						int var86 = var83 * var80.health2 / var91.width; // L: 4988
						int var87;
						int var95;
						if (var80.cycleOffset > var85) { // L: 4989
							var87 = var91.field3314 == 0 ? 0 : var91.field3314 * (var85 / var91.field3314); // L: 4990
							var23 = var83 * var80.health / var91.width; // L: 4991
							var95 = var87 * (var86 - var23) / var80.cycleOffset + var23; // L: 4992
						} else {
							var95 = var86; // L: 4995
							var87 = var91.int5 + var80.cycleOffset - var85; // L: 4996
							if (var91.int3 >= 0) { // L: 4997
								var18 = (var87 << 8) / (var91.int5 - var91.int3);
							}
						}

						if (var80.health2 > 0 && var95 < 1) { // L: 4999
							var95 = 1;
						}

						if (var81 != null && var82 != null) { // L: 5000
							if (var83 == var95) { // L: 5001
								var95 += var17 * 2;
							} else {
								var95 += var17; // L: 5002
							}

							var87 = var81.subHeight; // L: 5003
							var88 += var87; // L: 5004
							var23 = var2 + Client.viewportTempX - (var83 >> 1); // L: 5005
							var24 = var3 + Client.viewportTempY - var88; // L: 5006
							var23 -= var17; // L: 5007
							if (var18 >= 0 && var18 < 255) { // L: 5008
								var81.drawTransAt(var23, var24, var18); // L: 5009
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var95, var87 + var24); // L: 5010
								var82.drawTransAt(var23, var24, var18); // L: 5011
							} else {
								var81.drawTransBgAt(var23, var24); // L: 5014
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var95, var24 + var87); // L: 5015
								var82.drawTransBgAt(var23, var24); // L: 5016
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5018
							var88 += 2; // L: 5019
						} else {
							var88 += 5; // L: 5022
							if (Client.viewportTempX > -1) { // L: 5023
								var87 = var2 + Client.viewportTempX - (var83 >> 1); // L: 5024
								var23 = var3 + Client.viewportTempY - var88; // L: 5025
								Rasterizer2D.Rasterizer2D_fillRectangle(var87, var23, var95, 5, 65280); // L: 5026
								Rasterizer2D.Rasterizer2D_fillRectangle(var87 + var95, var23, var83 - var95, 5, 16711680); // L: 5027
							}

							var88 += 2; // L: 5029
						}
					}
				}
			}

			if (var88 == -2) { // L: 5035
				var88 += 7;
			}

			var88 += var8; // L: 5036
			int var78;
			if (var1 < var76) { // L: 5037
				var10 = (Player)var0; // L: 5038
				if (var10.isHidden) { // L: 5039
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 5040
					var78 = var0.defaultHeight + 15; // L: 5041
					class13.worldToScreen(var0.x, var0.y, var78); // L: 5043
					if (Client.viewportTempX > -1) { // L: 5045
						if (var10.headIconPk != -1) { // L: 5046
							var88 += 25; // L: 5047
							World.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var88); // L: 5048
						}

						if (var10.headIconPrayer != -1) { // L: 5050
							var88 += 25; // L: 5051
							TaskHandler.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var88); // L: 5052
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5056
					var78 = var0.defaultHeight + 15; // L: 5057
					class13.worldToScreen(var0.x, var0.y, var78); // L: 5059
					if (Client.viewportTempX > -1) { // L: 5061
						var88 += class337.headIconHintSprites[1].subHeight; // L: 5062
						class337.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var88); // L: 5063
					}
				}
			} else {
				NPCDefinition var89 = ((NPC)var0).definition; // L: 5068
				if (var89.transforms != null) { // L: 5069
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < TaskHandler.headIconPrayerSprites.length) { // L: 5070
					var78 = var0.defaultHeight + 15; // L: 5071
					class13.worldToScreen(var0.x, var0.y, var78); // L: 5073
					if (Client.viewportTempX > -1) { // L: 5075
						TaskHandler.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5076
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5079
					var78 = var0.defaultHeight + 15; // L: 5080
					class13.worldToScreen(var0.x, var0.y, var78); // L: 5082
					if (Client.viewportTempX > -1) { // L: 5084
						class337.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field974 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5087 5088
				var77 = var0.defaultHeight; // L: 5089
				class13.worldToScreen(var0.x, var0.y, var77); // L: 5091
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5093
					Client.overheadTextXOffsets[Client.overheadTextCount] = ReflectionCheck.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5094
					Client.overheadTextAscents[Client.overheadTextCount] = ReflectionCheck.fontBold12.ascent; // L: 5095
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5096
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5097
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5098
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5099
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5100
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5101
					++Client.overheadTextCount; // L: 5102
				}
			}

			for (var77 = 0; var77 < 4; ++var77) { // L: 5106
				var78 = var0.hitSplatCycles[var77]; // L: 5107
				var12 = var0.hitSplatTypes[var77]; // L: 5108
				HitSplatDefinition var92 = null; // L: 5109
				int var93 = 0; // L: 5110
				if (var12 >= 0) { // L: 5111
					if (var78 <= Client.cycle) { // L: 5112
						continue;
					}

					var92 = class258.method4654(var0.hitSplatTypes[var77]); // L: 5113
					var93 = var92.field3370; // L: 5114
					if (var92 != null && var92.transforms != null) { // L: 5115
						var92 = var92.transform(); // L: 5116
						if (var92 == null) { // L: 5117
							var0.hitSplatCycles[var77] = -1; // L: 5118
							continue; // L: 5119
						}
					}
				} else if (var78 < 0) { // L: 5123
					continue;
				}

				int var15 = var0.hitSplatTypes2[var77]; // L: 5124
				HitSplatDefinition var16 = null; // L: 5125
				if (var15 >= 0) { // L: 5126
					var16 = class258.method4654(var15); // L: 5127
					if (var16 != null && var16.transforms != null) { // L: 5128
						var16 = var16.transform();
					}
				}

				if (var78 - var93 <= Client.cycle) { // L: 5130
					if (var92 == null) { // L: 5131
						var0.hitSplatCycles[var77] = -1; // L: 5132
					} else {
						var17 = var0.defaultHeight / 2; // L: 5135
						class13.worldToScreen(var0.x, var0.y, var17); // L: 5137
						if (Client.viewportTempX > -1) { // L: 5139
							if (var77 == 1) { // L: 5141
								Client.viewportTempY -= 20; // L: 5142
							}

							if (var77 == 2) { // L: 5144
								Client.viewportTempX -= 15; // L: 5145
								Client.viewportTempY -= 10; // L: 5146
							}

							if (var77 == 3) { // L: 5148
								Client.viewportTempX += 15; // L: 5149
								Client.viewportTempY -= 10; // L: 5150
							}

							Sprite var19 = null; // L: 5152
							Sprite var20 = null; // L: 5153
							Sprite var21 = null; // L: 5154
							Sprite var22 = null; // L: 5155
							var23 = 0; // L: 5156
							var24 = 0; // L: 5157
							int var25 = 0; // L: 5158
							int var26 = 0; // L: 5159
							int var27 = 0; // L: 5160
							int var28 = 0; // L: 5161
							int var29 = 0; // L: 5162
							int var30 = 0; // L: 5163
							Sprite var31 = null; // L: 5164
							Sprite var32 = null; // L: 5165
							Sprite var33 = null; // L: 5166
							Sprite var34 = null; // L: 5167
							int var35 = 0; // L: 5168
							int var36 = 0; // L: 5169
							int var37 = 0; // L: 5170
							int var38 = 0; // L: 5171
							int var39 = 0; // L: 5172
							int var40 = 0; // L: 5173
							int var41 = 0; // L: 5174
							int var42 = 0; // L: 5175
							int var43 = 0; // L: 5176
							var19 = var92.method4748(); // L: 5177
							int var44;
							if (var19 != null) { // L: 5178
								var23 = var19.subWidth; // L: 5179
								var44 = var19.subHeight; // L: 5180
								if (var44 > var43) { // L: 5181
									var43 = var44;
								}

								var27 = var19.xOffset; // L: 5182
							}

							var20 = var92.method4733(); // L: 5184
							if (var20 != null) { // L: 5185
								var24 = var20.subWidth; // L: 5186
								var44 = var20.subHeight; // L: 5187
								if (var44 > var43) { // L: 5188
									var43 = var44;
								}

								var28 = var20.xOffset; // L: 5189
							}

							var21 = var92.method4731(); // L: 5191
							if (var21 != null) { // L: 5192
								var25 = var21.subWidth; // L: 5193
								var44 = var21.subHeight; // L: 5194
								if (var44 > var43) { // L: 5195
									var43 = var44;
								}

								var29 = var21.xOffset; // L: 5196
							}

							var22 = var92.method4727(); // L: 5198
							if (var22 != null) { // L: 5199
								var26 = var22.subWidth; // L: 5200
								var44 = var22.subHeight; // L: 5201
								if (var44 > var43) { // L: 5202
									var43 = var44;
								}

								var30 = var22.xOffset; // L: 5203
							}

							if (var16 != null) { // L: 5205
								var31 = var16.method4748(); // L: 5206
								if (var31 != null) { // L: 5207
									var35 = var31.subWidth; // L: 5208
									var44 = var31.subHeight; // L: 5209
									if (var44 > var43) { // L: 5210
										var43 = var44;
									}

									var39 = var31.xOffset; // L: 5211
								}

								var32 = var16.method4733(); // L: 5213
								if (var32 != null) { // L: 5214
									var36 = var32.subWidth; // L: 5215
									var44 = var32.subHeight; // L: 5216
									if (var44 > var43) { // L: 5217
										var43 = var44;
									}

									var40 = var32.xOffset; // L: 5218
								}

								var33 = var16.method4731(); // L: 5220
								if (var33 != null) { // L: 5221
									var37 = var33.subWidth; // L: 5222
									var44 = var33.subHeight; // L: 5223
									if (var44 > var43) { // L: 5224
										var43 = var44;
									}

									var41 = var33.xOffset; // L: 5225
								}

								var34 = var16.method4727(); // L: 5227
								if (var34 != null) { // L: 5228
									var38 = var34.subWidth; // L: 5229
									var44 = var34.subHeight; // L: 5230
									if (var44 > var43) { // L: 5231
										var43 = var44;
									}

									var42 = var34.xOffset; // L: 5232
								}
							}

							Font var79 = var92.getFont(); // L: 5237
							if (var79 == null) { // L: 5238
								var79 = DevicePcmPlayerProvider.fontPlain11;
							}

							Font var45;
							if (var16 != null) { // L: 5239
								var45 = var16.getFont(); // L: 5240
								if (var45 == null) { // L: 5241
									var45 = DevicePcmPlayerProvider.fontPlain11;
								}
							} else {
								var45 = DevicePcmPlayerProvider.fontPlain11; // L: 5243
							}

							String var46 = null; // L: 5244
							String var47 = null; // L: 5245
							boolean var48 = false; // L: 5246
							int var49 = 0; // L: 5247
							var46 = var92.getString(var0.hitSplatValues[var77]); // L: 5248
							int var94 = var79.stringWidth(var46); // L: 5249
							if (var16 != null) { // L: 5250
								var47 = var16.getString(var0.hitSplatValues2[var77]); // L: 5251
								var49 = var45.stringWidth(var47); // L: 5252
							}

							int var50 = 0; // L: 5254
							int var51 = 0; // L: 5255
							if (var24 > 0) { // L: 5256
								if (var21 == null && var22 == null) { // L: 5257
									var50 = 1; // L: 5258
								} else {
									var50 = var94 / var24 + 1;
								}
							}

							if (var16 != null && var36 > 0) { // L: 5260 5261
								if (var33 == null && var34 == null) { // L: 5262
									var51 = 1; // L: 5263
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0; // L: 5266
							int var53 = var52; // L: 5267
							if (var23 > 0) { // L: 5268
								var52 += var23;
							}

							var52 += 2; // L: 5269
							int var54 = var52; // L: 5270
							if (var25 > 0) { // L: 5271
								var52 += var25;
							}

							int var55 = var52; // L: 5272
							int var56 = var52; // L: 5273
							int var57;
							if (var24 > 0) { // L: 5274
								var57 = var24 * var50; // L: 5275
								var52 += var57; // L: 5276
								var56 += (var57 - var94) / 2; // L: 5277
							} else {
								var52 += var94; // L: 5280
							}

							var57 = var52; // L: 5282
							if (var26 > 0) { // L: 5283
								var52 += var26;
							}

							int var58 = 0; // L: 5284
							int var59 = 0; // L: 5285
							int var60 = 0; // L: 5286
							int var61 = 0; // L: 5287
							int var62 = 0; // L: 5288
							int var63;
							if (var16 != null) { // L: 5289
								var52 += 2; // L: 5290
								var58 = var52; // L: 5291
								if (var35 > 0) { // L: 5292
									var52 += var35;
								}

								var52 += 2; // L: 5293
								var59 = var52; // L: 5294
								if (var37 > 0) { // L: 5295
									var52 += var37;
								}

								var60 = var52; // L: 5296
								var62 = var52; // L: 5297
								if (var36 > 0) { // L: 5298
									var63 = var36 * var51; // L: 5299
									var52 += var63; // L: 5300
									var62 += (var63 - var49) / 2; // L: 5301
								} else {
									var52 += var49; // L: 5304
								}

								var61 = var52; // L: 5306
								if (var38 > 0) { // L: 5307
									var52 += var38;
								}
							}

							var63 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5309
							int var64 = var92.field3364 - var63 * var92.field3364 / var92.field3370; // L: 5310
							int var65 = var63 * var92.field3365 / var92.field3370 + -var92.field3365; // L: 5311
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1)); // L: 5312
							int var67 = var65 + (var3 + Client.viewportTempY - 12); // L: 5313
							int var68 = var67; // L: 5314
							int var69 = var43 + var67; // L: 5315
							int var70 = var67 + var92.field3351 + 15; // L: 5316
							int var71 = var70 - var79.maxAscent; // L: 5317
							int var72 = var70 + var79.maxDescent; // L: 5318
							if (var71 < var67) { // L: 5319
								var68 = var71;
							}

							if (var72 > var69) { // L: 5320
								var69 = var72;
							}

							int var73 = 0; // L: 5321
							int var74;
							int var75;
							if (var16 != null) { // L: 5322
								var73 = var67 + var16.field3351 + 15; // L: 5323
								var74 = var73 - var45.maxAscent; // L: 5324
								var75 = var73 + var45.maxDescent; // L: 5325
								if (var74 < var68) { // L: 5326
									;
								}

								if (var75 > var69) { // L: 5327
									;
								}
							}

							var74 = 255; // L: 5329
							if (var92.field3366 >= 0) { // L: 5330
								var74 = (var63 << 8) / (var92.field3370 - var92.field3366);
							}

							if (var74 >= 0 && var74 < 255) { // L: 5331
								if (var19 != null) { // L: 5332
									var19.drawTransAt(var66 + var53 - var27, var67, var74);
								}

								if (var21 != null) { // L: 5333
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) { // L: 5334
									for (var75 = 0; var75 < var50; ++var75) { // L: 5335
										var20.drawTransAt(var24 * var75 + (var66 + var55 - var28), var67, var74); // L: 5336
									}
								}

								if (var22 != null) { // L: 5339
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var79.drawAlpha(var46, var66 + var56, var70, var92.textColor, 0, var74); // L: 5340
								if (var16 != null) { // L: 5341
									if (var31 != null) { // L: 5342
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) { // L: 5343
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) { // L: 5344
										for (var75 = 0; var75 < var51; ++var75) { // L: 5345
											var32.drawTransAt(var75 * var36 + (var60 + var66 - var40), var67, var74); // L: 5346
										}
									}

									if (var34 != null) { // L: 5349
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var62 + var66, var73, var16.textColor, 0, var74); // L: 5350
								}
							} else {
								if (var19 != null) { // L: 5354
									var19.drawTransBgAt(var66 + var53 - var27, var67);
								}

								if (var21 != null) { // L: 5355
									var21.drawTransBgAt(var66 + var54 - var29, var67);
								}

								if (var20 != null) { // L: 5356
									for (var75 = 0; var75 < var50; ++var75) { // L: 5357
										var20.drawTransBgAt(var24 * var75 + (var66 + var55 - var28), var67); // L: 5358
									}
								}

								if (var22 != null) { // L: 5361
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var79.draw(var46, var66 + var56, var70, var92.textColor | -16777216, 0); // L: 5362
								if (var16 != null) { // L: 5363
									if (var31 != null) { // L: 5364
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) { // L: 5365
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) { // L: 5366
										for (var75 = 0; var75 < var51; ++var75) { // L: 5367
											var32.drawTransBgAt(var75 * var36 + (var66 + var60 - var40), var67); // L: 5368
										}
									}

									if (var34 != null) { // L: 5371
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var16.textColor | -16777216, 0); // L: 5372
								}
							}
						}
					}
				}
			}

		}
	} // L: 5377

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2141272771"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class4.getPacketBufferNode(ClientPacket.field2329, Client.packetWriter.isaacCipher); // L: 11512
		var0.packetBuffer.writeByte(0); // L: 11513
		Client.packetWriter.addNode(var0); // L: 11514
	} // L: 11515
}
