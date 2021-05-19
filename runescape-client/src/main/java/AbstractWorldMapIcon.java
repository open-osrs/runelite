import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1703972791
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 278032625
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lia;Lia;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Lfl;",
		garbageValue = "-7317"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1893915504"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1578289543"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2139268059"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = WorldMapAreaData.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 54
					break;
				}

				return false;
			case 1:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 49
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) { // L: 61
					break;
				}

				return false;
			case 1:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 66
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 71
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1722248862"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "-104"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 83

		for (int var6 = 0; var6 < var5; ++var6) { // L: 84
			char var7 = var0.charAt(var6 + var1); // L: 85
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 86
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 87
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 88
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 89
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 90
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 91
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 92
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 93
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 94
			} else if (var7 == 8240) { // L: 95
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 96
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 97
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 98
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 99
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 100
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 101
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 102
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 103
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 104
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106; // L: 105
			} else if (var7 == 8212) { // L: 106
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 107
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 108
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 109
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 110
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 111
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 112
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 113
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 114
			}
		}

		return var5; // L: 116
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4842
			if (var0 instanceof NPC) { // L: 4843
				NPCComposition var6 = ((NPC)var0).definition; // L: 4844
				if (var6.transforms != null) { // L: 4845
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4846
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4848
			int[] var7 = Players.Players_indices; // L: 4849
			byte var8 = 0; // L: 4850
			Player var10;
			if (var1 < var75 && var0.playerCycle == Client.cycle) { // L: 4851
				var10 = (Player)var0; // L: 4853
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 4855
					var9 = false; // L: 4856
				} else if (var10 == class35.localPlayer) { // L: 4859
					boolean var11 = (Client.drawPlayerNames & 8) != 0; // L: 4865
					var9 = var11; // L: 4867
				} else {
					var9 = Canvas.method469() || FloorDecoration.method3799() && var10.isFriend() || class14.method223() && var10.isClanMember(); // L: 4860
				}

				if (var9) { // L: 4870
					Player var76 = (Player)var0; // L: 4871
					if (var1 < var75) { // L: 4872
						GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15); // L: 4873
						AbstractFont var12 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4874
						byte var13 = 9; // L: 4875
						var12.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var13, 16777215, 0); // L: 4876
						var8 = 18; // L: 4877
					}
				}
			}

			int var89 = -2; // L: 4881
			int var16;
			int var22;
			int var23;
			int var80;
			if (!var0.healthBars.method5149()) { // L: 4882
				GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15); // L: 4883

				for (HealthBar var90 = (HealthBar)var0.healthBars.last(); var90 != null; var90 = (HealthBar)var0.healthBars.previous()) { // L: 4884
					HealthBarUpdate var98 = var90.get(Client.cycle); // L: 4885
					if (var98 == null) { // L: 4886
						if (var90.isEmpty()) { // L: 4944
							var90.remove();
						}
					} else {
						HealthBarDefinition var93 = var90.definition; // L: 4887
						SpritePixels var79 = var93.getBackSprite(); // L: 4888
						SpritePixels var83 = var93.getFrontSprite(); // L: 4889
						var16 = 0; // L: 4891
						if (var79 != null && var83 != null) { // L: 4892
							if (var93.widthPadding * 2 < var83.subWidth) { // L: 4893
								var16 = var93.widthPadding;
							}

							var80 = var83.subWidth - var16 * 2; // L: 4894
						} else {
							var80 = var93.width; // L: 4896
						}

						int var84 = 255; // L: 4897
						boolean var85 = true; // L: 4898
						int var86 = Client.cycle - var98.cycle; // L: 4899
						int var87 = var80 * var98.health2 / var93.width; // L: 4900
						int var88;
						int var100;
						if (var98.cycleOffset > var86) { // L: 4901
							var88 = var93.field1593 == 0 ? 0 : var93.field1593 * (var86 / var93.field1593); // L: 4902
							var22 = var80 * var98.health / var93.width; // L: 4903
							var100 = var88 * (var87 - var22) / var98.cycleOffset + var22; // L: 4904
						} else {
							var100 = var87; // L: 4907
							var88 = var98.cycleOffset + var93.int5 - var86; // L: 4908
							if (var93.int3 >= 0) { // L: 4909
								var84 = (var88 << 8) / (var93.int5 - var93.int3);
							}
						}

						if (var98.health2 > 0 && var100 < 1) { // L: 4911
							var100 = 1;
						}

						if (var79 != null && var83 != null) { // L: 4912
							if (var100 == var80) { // L: 4913
								var100 += var16 * 2;
							} else {
								var100 += var16; // L: 4914
							}

							var88 = var79.subHeight; // L: 4915
							var89 += var88; // L: 4916
							var22 = var2 + Client.viewportTempX - (var80 >> 1); // L: 4917
							var23 = var3 + Client.viewportTempY - var89; // L: 4918
							var22 -= var16; // L: 4919
							if (var84 >= 0 && var84 < 255) { // L: 4920
								var79.drawTransAt(var22, var23, var84); // L: 4921
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var100 + var22, var88 + var23); // L: 4922
								var83.drawTransAt(var22, var23, var84); // L: 4923
							} else {
								var79.drawTransBgAt(var22, var23); // L: 4926
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var100, var23 + var88); // L: 4927
								var83.drawTransBgAt(var22, var23); // L: 4928
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4930
							var89 += 2; // L: 4931
						} else {
							var89 += 5; // L: 4934
							if (Client.viewportTempX > -1) { // L: 4935
								var88 = var2 + Client.viewportTempX - (var80 >> 1); // L: 4936
								var22 = var3 + Client.viewportTempY - var89; // L: 4937
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var100, 5, 65280); // L: 4938
								Rasterizer2D.Rasterizer2D_fillRectangle(var100 + var88, var22, var80 - var100, 5, 16711680); // L: 4939
							}

							var89 += 2; // L: 4941
						}
					}
				}
			}

			if (var89 == -2) { // L: 4947
				var89 += 7;
			}

			var89 += var8; // L: 4948
			if (var1 < var75) { // L: 4949
				var10 = (Player)var0; // L: 4950
				if (var10.isHidden) { // L: 4951
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 4952
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15); // L: 4953
					if (Client.viewportTempX > -1) { // L: 4954
						if (var10.headIconPk != -1) { // L: 4955
							var89 += 25; // L: 4956
							class14.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 4957
						}

						if (var10.headIconPrayer != -1) { // L: 4959
							var89 += 25; // L: 4960
							Varcs.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 4961
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4965
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15); // L: 4966
					if (Client.viewportTempX > -1) { // L: 4967
						var89 += class375.headIconHintSprites[1].subHeight; // L: 4968
						class375.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 4969
					}
				}
			} else {
				NPCComposition var91 = ((NPC)var0).definition; // L: 4974
				if (var91.transforms != null) { // L: 4975
					var91 = var91.transform();
				}

				if (var91.headIconPrayer >= 0 && var91.headIconPrayer < Varcs.headIconPrayerSprites.length) { // L: 4976
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15); // L: 4977
					if (Client.viewportTempX > -1) { // L: 4978
						Varcs.headIconPrayerSprites[var91.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4979
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4982
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15); // L: 4983
					if (Client.viewportTempX > -1) { // L: 4984
						class375.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1223 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4987 4988
				GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight); // L: 4989
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4990
					Client.overheadTextXOffsets[Client.overheadTextCount] = WorldMapArea.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4991
					Client.overheadTextAscents[Client.overheadTextCount] = WorldMapArea.fontBold12.ascent; // L: 4992
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4993
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4994
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4995
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4996
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4997
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4998
					++Client.overheadTextCount; // L: 4999
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 5003
				int var92 = var0.hitSplatCycles[var77]; // L: 5004
				int var78 = var0.hitSplatTypes[var77]; // L: 5005
				HitSplatDefinition var99 = null; // L: 5006
				int var14 = 0; // L: 5007
				HitSplatDefinition var17;
				if (var78 >= 0) { // L: 5008
					if (var92 <= Client.cycle) { // L: 5009
						continue;
					}

					var16 = var0.hitSplatTypes[var77]; // L: 5011
					var17 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var16); // L: 5013
					HitSplatDefinition var15;
					if (var17 != null) { // L: 5014
						var15 = var17; // L: 5015
					} else {
						byte[] var18 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var16); // L: 5018
						var17 = new HitSplatDefinition(); // L: 5019
						if (var18 != null) { // L: 5020
							var17.decode(new Buffer(var18));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var17, (long)var16); // L: 5021
						var15 = var17; // L: 5022
					}

					var99 = var15; // L: 5024
					var14 = var15.field1735; // L: 5025
					if (var15 != null && var15.transforms != null) { // L: 5026
						var99 = var15.transform(); // L: 5027
						if (var99 == null) { // L: 5028
							var0.hitSplatCycles[var77] = -1; // L: 5029
							continue; // L: 5030
						}
					}
				} else if (var92 < 0) { // L: 5034
					continue;
				}

				var80 = var0.hitSplatTypes2[var77]; // L: 5035
				HitSplatDefinition var81 = null; // L: 5036
				HitSplatDefinition var94;
				if (var80 >= 0) { // L: 5037
					var94 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var80); // L: 5040
					if (var94 != null) { // L: 5041
						var17 = var94; // L: 5042
					} else {
						byte[] var19 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var80); // L: 5045
						var94 = new HitSplatDefinition(); // L: 5046
						if (var19 != null) { // L: 5047
							var94.decode(new Buffer(var19));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var94, (long)var80); // L: 5048
						var17 = var94; // L: 5049
					}

					var81 = var17; // L: 5051
					if (var17 != null && var17.transforms != null) { // L: 5052
						var81 = var17.transform();
					}
				}

				if (var92 - var14 <= Client.cycle) { // L: 5054
					if (var99 == null) { // L: 5055
						var0.hitSplatCycles[var77] = -1; // L: 5056
					} else {
						GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight / 2); // L: 5059
						if (Client.viewportTempX > -1) { // L: 5060
							if (var77 == 1) { // L: 5062
								Client.viewportTempY -= 20; // L: 5063
							}

							if (var77 == 2) { // L: 5065
								Client.viewportTempX -= 15; // L: 5066
								Client.viewportTempY -= 10; // L: 5067
							}

							if (var77 == 3) { // L: 5069
								Client.viewportTempX += 15; // L: 5070
								Client.viewportTempY -= 10; // L: 5071
							}

							var94 = null; // L: 5073
							SpritePixels var95 = null; // L: 5074
							SpritePixels var20 = null; // L: 5075
							SpritePixels var21 = null; // L: 5076
							var22 = 0; // L: 5077
							var23 = 0; // L: 5078
							int var24 = 0; // L: 5079
							int var25 = 0; // L: 5080
							int var26 = 0; // L: 5081
							int var27 = 0; // L: 5082
							int var28 = 0; // L: 5083
							int var29 = 0; // L: 5084
							SpritePixels var30 = null; // L: 5085
							SpritePixels var31 = null; // L: 5086
							SpritePixels var32 = null; // L: 5087
							SpritePixels var33 = null; // L: 5088
							int var34 = 0; // L: 5089
							int var35 = 0; // L: 5090
							int var36 = 0; // L: 5091
							int var37 = 0; // L: 5092
							int var38 = 0; // L: 5093
							int var39 = 0; // L: 5094
							int var40 = 0; // L: 5095
							int var41 = 0; // L: 5096
							int var42 = 0; // L: 5097
							SpritePixels var96 = var99.method2890(); // L: 5098
							int var43;
							if (var96 != null) { // L: 5099
								var22 = var96.subWidth; // L: 5100
								var43 = var96.subHeight; // L: 5101
								if (var43 > var42) { // L: 5102
									var42 = var43;
								}

								var26 = var96.xOffset; // L: 5103
							}

							var95 = var99.method2893(); // L: 5105
							if (var95 != null) { // L: 5106
								var23 = var95.subWidth; // L: 5107
								var43 = var95.subHeight; // L: 5108
								if (var43 > var42) { // L: 5109
									var42 = var43;
								}

								var27 = var95.xOffset; // L: 5110
							}

							var20 = var99.method2871(); // L: 5112
							if (var20 != null) { // L: 5113
								var24 = var20.subWidth; // L: 5114
								var43 = var20.subHeight; // L: 5115
								if (var43 > var42) { // L: 5116
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5117
							}

							var21 = var99.method2872(); // L: 5119
							if (var21 != null) { // L: 5120
								var25 = var21.subWidth; // L: 5121
								var43 = var21.subHeight; // L: 5122
								if (var43 > var42) { // L: 5123
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5124
							}

							if (var81 != null) { // L: 5126
								var30 = var81.method2890(); // L: 5127
								if (var30 != null) { // L: 5128
									var34 = var30.subWidth; // L: 5129
									var43 = var30.subHeight; // L: 5130
									if (var43 > var42) { // L: 5131
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5132
								}

								var31 = var81.method2893(); // L: 5134
								if (var31 != null) { // L: 5135
									var35 = var31.subWidth; // L: 5136
									var43 = var31.subHeight; // L: 5137
									if (var43 > var42) { // L: 5138
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5139
								}

								var32 = var81.method2871(); // L: 5141
								if (var32 != null) { // L: 5142
									var36 = var32.subWidth; // L: 5143
									var43 = var32.subHeight; // L: 5144
									if (var43 > var42) { // L: 5145
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5146
								}

								var33 = var81.method2872(); // L: 5148
								if (var33 != null) { // L: 5149
									var37 = var33.subWidth; // L: 5150
									var43 = var33.subHeight; // L: 5151
									if (var43 > var42) { // L: 5152
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5153
								}
							}

							Font var82 = var99.getFont(); // L: 5158
							if (var82 == null) { // L: 5159
								var82 = class11.fontPlain11;
							}

							Font var44;
							if (var81 != null) { // L: 5160
								var44 = var81.getFont(); // L: 5161
								if (var44 == null) { // L: 5162
									var44 = class11.fontPlain11;
								}
							} else {
								var44 = class11.fontPlain11; // L: 5164
							}

							String var45 = null; // L: 5165
							String var46 = null; // L: 5166
							boolean var47 = false; // L: 5167
							int var48 = 0; // L: 5168
							var45 = var99.getString(var0.hitSplatValues[var77]); // L: 5169
							int var97 = var82.stringWidth(var45); // L: 5170
							if (var81 != null) { // L: 5171
								var46 = var81.getString(var0.hitSplatValues2[var77]); // L: 5172
								var48 = var44.stringWidth(var46); // L: 5173
							}

							int var49 = 0; // L: 5175
							int var50 = 0; // L: 5176
							if (var23 > 0) { // L: 5177
								if (var20 == null && var21 == null) { // L: 5178
									var49 = 1; // L: 5179
								} else {
									var49 = var97 / var23 + 1;
								}
							}

							if (var81 != null && var35 > 0) { // L: 5181 5182
								if (var32 == null && var33 == null) { // L: 5183
									var50 = 1; // L: 5184
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5187
							int var52 = var51; // L: 5188
							if (var22 > 0) { // L: 5189
								var51 += var22;
							}

							var51 += 2; // L: 5190
							int var53 = var51; // L: 5191
							if (var24 > 0) { // L: 5192
								var51 += var24;
							}

							int var54 = var51; // L: 5193
							int var55 = var51; // L: 5194
							int var56;
							if (var23 > 0) { // L: 5195
								var56 = var49 * var23; // L: 5196
								var51 += var56; // L: 5197
								var55 += (var56 - var97) / 2; // L: 5198
							} else {
								var51 += var97; // L: 5201
							}

							var56 = var51; // L: 5203
							if (var25 > 0) { // L: 5204
								var51 += var25;
							}

							int var57 = 0; // L: 5205
							int var58 = 0; // L: 5206
							int var59 = 0; // L: 5207
							int var60 = 0; // L: 5208
							int var61 = 0; // L: 5209
							int var62;
							if (var81 != null) { // L: 5210
								var51 += 2; // L: 5211
								var57 = var51; // L: 5212
								if (var34 > 0) { // L: 5213
									var51 += var34;
								}

								var51 += 2; // L: 5214
								var58 = var51; // L: 5215
								if (var36 > 0) { // L: 5216
									var51 += var36;
								}

								var59 = var51; // L: 5217
								var61 = var51; // L: 5218
								if (var35 > 0) { // L: 5219
									var62 = var35 * var50; // L: 5220
									var51 += var62; // L: 5221
									var61 += (var62 - var48) / 2; // L: 5222
								} else {
									var51 += var48; // L: 5225
								}

								var60 = var51; // L: 5227
								if (var37 > 0) { // L: 5228
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5230
							int var63 = var99.field1748 - var62 * var99.field1748 / var99.field1735; // L: 5231
							int var64 = var62 * var99.field1749 / var99.field1735 + -var99.field1749; // L: 5232
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5233
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5234
							int var67 = var66; // L: 5235
							int var68 = var42 + var66; // L: 5236
							int var69 = var66 + var99.field1753 + 15; // L: 5237
							int var70 = var69 - var82.maxAscent; // L: 5238
							int var71 = var69 + var82.maxDescent; // L: 5239
							if (var70 < var66) { // L: 5240
								var67 = var70;
							}

							if (var71 > var68) { // L: 5241
								var68 = var71;
							}

							int var72 = 0; // L: 5242
							int var73;
							int var74;
							if (var81 != null) { // L: 5243
								var72 = var66 + var81.field1753 + 15; // L: 5244
								var73 = var72 - var44.maxAscent; // L: 5245
								var74 = var72 + var44.maxDescent; // L: 5246
								if (var73 < var67) { // L: 5247
									;
								}

								if (var74 > var68) { // L: 5248
									;
								}
							}

							var73 = 255; // L: 5250
							if (var99.field1743 >= 0) { // L: 5251
								var73 = (var62 << 8) / (var99.field1735 - var99.field1743);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5252
								if (var96 != null) { // L: 5253
									var96.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5254
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var95 != null) { // L: 5255
									for (var74 = 0; var74 < var49; ++var74) { // L: 5256
										var95.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5257
									}
								}

								if (var21 != null) { // L: 5260
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var99.textColor, 0, var73); // L: 5261
								if (var81 != null) { // L: 5262
									if (var30 != null) { // L: 5263
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5264
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5265
										for (var74 = 0; var74 < var50; ++var74) { // L: 5266
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5267
										}
									}

									if (var33 != null) { // L: 5270
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var81.textColor, 0, var73); // L: 5271
								}
							} else {
								if (var96 != null) { // L: 5275
									var96.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5276
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var95 != null) { // L: 5277
									for (var74 = 0; var74 < var49; ++var74) { // L: 5278
										var95.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66); // L: 5279
									}
								}

								if (var21 != null) { // L: 5282
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var99.textColor | -16777216, 0); // L: 5283
								if (var81 != null) { // L: 5284
									if (var30 != null) { // L: 5285
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5286
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5287
										for (var74 = 0; var74 < var50; ++var74) { // L: 5288
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66); // L: 5289
										}
									}

									if (var33 != null) { // L: 5292
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var81.textColor | -16777216, 0); // L: 5293
								}
							}
						}
					}
				}
			}

		}
	} // L: 5298
}
