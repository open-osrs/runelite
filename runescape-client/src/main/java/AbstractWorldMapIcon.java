import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSpritePixels;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1559041635
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 314803859
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lhs;Lhs;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-359753179"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lah;",
		garbageValue = "1889474780"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-79"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1082591682"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "8588195"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1161567228"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "762931724"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = UserComparator10.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 1:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) { // L: 54
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 66
					return false;
				}
				break;
			case 1:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 61
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 71
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-373903296"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= var3.height + this.screenY; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljb;",
		garbageValue = "5"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition) StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("n")
	static boolean method657(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 73
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "339234172"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 879
		Login.Login_response2 = "Enter your username/email & password."; // L: 880
		Login.Login_response3 = ""; // L: 881
		Login.loginIndex = 2; // L: 882
		if (var0) { // L: 883
			Login.Login_password = "";
		}

		class219.method4009(); // L: 884
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 886
			Login.currentLoginField = 1; // L: 887
		} else {
			Login.currentLoginField = 0; // L: 890
		}

	} // L: 893

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1273056667"
	)
	static int method656(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3243
			Client.logoutTimer = 250; // L: 3244
			return 1; // L: 3245
		} else if (var0 != 5631 && var0 != 5633) { // L: 3247
			if (var0 == 5632) { // L: 3251
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 26; // L: 3252
				return 1; // L: 3253
			} else {
				return 2; // L: 3255
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2; // L: 3248
			return 1; // L: 3249
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIIIII)V",
		garbageValue = "-970580745"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4819
			if (var0 instanceof NPC) { // L: 4820
				NPCComposition var6 = ((NPC)var0).definition; // L: 4821
				if (var6.transforms != null) { // L: 4822
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4823
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4825
			int[] var7 = Players.Players_indices; // L: 4826
			byte var8 = 0; // L: 4827
			if (var1 < var75 && var0.playerCycle == Client.cycle && class3.method42((Player)var0)) { // L: 4828
				Player var9 = (Player)var0; // L: 4829
				if (var1 < var75) { // L: 4830
					GrandExchangeEvents.method144(var0, var0.defaultHeight + 15); // L: 4831
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4832
					byte var11 = 9; // L: 4833
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 4834
					var8 = 18; // L: 4835
				}
			}

			int var76 = -2; // L: 4838
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method4840()) { // L: 4839
				GrandExchangeEvents.method144(var0, var0.defaultHeight + 15); // L: 4840

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 4841
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 4842
					if (var79 == null) { // L: 4843
						if (var87.isEmpty()) { // L: 4901
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 4844
						SpritePixels var13 = var80.getBackSprite(); // L: 4845
						SpritePixels var81 = var80.getFrontSprite(); // L: 4846
						int var82 = 0; // L: 4848
						if (var13 != null && var81 != null) { // L: 4849
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 4850
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4851
						} else {
							var15 = var80.width; // L: 4853
						}

						int var17 = 255; // L: 4854
						boolean var83 = true; // L: 4855
						int var84 = Client.cycle - var79.cycle; // L: 4856
						int var85 = var15 * var79.health2 / var80.width; // L: 4857
						int var86;
						int var93;
						if (var79.cycleOffset > var84) { // L: 4858
							var86 = var80.field3307 == 0 ? 0 : var80.field3307 * (var84 / var80.field3307); // L: 4859
							var22 = var15 * var79.health / var80.width; // L: 4860
							var93 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 4861
						} else {
							var93 = var85; // L: 4864
							var86 = var79.cycleOffset + var80.int5 - var84; // L: 4865
							if (var80.int3 >= 0) { // L: 4866
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var93 < 1) { // L: 4868
							var93 = 1;
						}

						if (var13 != null && var81 != null) { // L: 4869
							if (var93 == var15) { // L: 4870
								var93 += var82 * 2;
							} else {
								var93 += var82; // L: 4871
							}

							var86 = var13.subHeight; // L: 4872
							var76 += var86; // L: 4873
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4874
							var23 = var3 + Client.viewportTempY - var76; // L: 4875
							var22 -= var82; // L: 4876
							if (var17 >= 0 && var17 < 255) { // L: 4877
								var13.drawTransAt(var22, var23, var17); // L: 4878
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var93 + var22, var23 + var86); // L: 4879
								var81.drawTransAt(var22, var23, var17); // L: 4880
							} else {
								var13.drawTransBgAt(var22, var23); // L: 4883
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var93 + var22, var86 + var23); // L: 4884
								var81.drawTransBgAt(var22, var23); // L: 4885
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4887
							var76 += 2; // L: 4888
						} else {
							var76 += 5; // L: 4891
							if (Client.viewportTempX > -1) { // L: 4892
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4893
								var22 = var3 + Client.viewportTempY - var76; // L: 4894
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var93, 5, 65280); // L: 4895
								Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var93, var22, var15 - var93, 5, 16711680); // L: 4896
							}

							var76 += 2; // L: 4898
						}
					}
				}
			}

			if (var76 == -2) { // L: 4904
				var76 += 7;
			}

			var76 += var8; // L: 4905
			if (var1 < var75) { // L: 4906
				Player var88 = (Player)var0; // L: 4907
				if (var88.isHidden) { // L: 4908
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 4909
					GrandExchangeEvents.method144(var0, var0.defaultHeight + 15); // L: 4910
					if (Client.viewportTempX > -1) { // L: 4911
						if (var88.headIconPk != -1) { // L: 4912
							var76 += 25; // L: 4913
							Message.headIconPkSpritePixels[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4914
						}

						if (var88.headIconPrayer != -1) { // L: 4916
							var76 += 25; // L: 4917
							Client.headIconPrayerSpritePixels[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4918
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4922
					GrandExchangeEvents.method144(var0, var0.defaultHeight + 15); // L: 4923
					if (Client.viewportTempX > -1) { // L: 4924
						var76 += headIconHintSpritePixels[1].subHeight; // L: 4925
						headIconHintSpritePixels[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4926
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 4931
				if (var89.transforms != null) { // L: 4932
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < Client.headIconPrayerSpritePixels.length) { // L: 4933
					GrandExchangeEvents.method144(var0, var0.defaultHeight + 15); // L: 4934
					if (Client.viewportTempX > -1) { // L: 4935
						Client.headIconPrayerSpritePixels[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4936
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4939
					GrandExchangeEvents.method144(var0, var0.defaultHeight + 15); // L: 4940
					if (Client.viewportTempX > -1) { // L: 4941
						headIconHintSpritePixels[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field953 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4944 4945
				GrandExchangeEvents.method144(var0, var0.defaultHeight); // L: 4946
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4947
					Client.overheadTextXOffsets[Client.overheadTextCount] = GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4948
					Client.overheadTextAscents[Client.overheadTextCount] = GrandExchangeOfferTotalQuantityComparator.fontBold12.ascent; // L: 4949
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4950
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4951
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4952
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4953
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4954
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4955
					++Client.overheadTextCount; // L: 4956
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 4960
				int var90 = var0.hitSplatCycles[var77]; // L: 4961
				int var12 = var0.hitSplatTypes[var77]; // L: 4962
				HitSplatDefinition var91 = null; // L: 4963
				int var14 = 0; // L: 4964
				if (var12 >= 0) { // L: 4965
					if (var90 <= Client.cycle) { // L: 4966
						continue;
					}

					var91 = class198.method3697(var0.hitSplatTypes[var77]); // L: 4967
					var14 = var91.field3364; // L: 4968
					if (var91 != null && var91.transforms != null) { // L: 4969
						var91 = var91.transform(); // L: 4970
						if (var91 == null) { // L: 4971
							var0.hitSplatCycles[var77] = -1; // L: 4972
							continue; // L: 4973
						}
					}
				} else if (var90 < 0) { // L: 4977
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 4978
				HitSplatDefinition var16 = null; // L: 4979
				if (var15 >= 0) { // L: 4980
					var16 = class198.method3697(var15); // L: 4981
					if (var16 != null && var16.transforms != null) { // L: 4982
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 4984
					if (var91 == null) { // L: 4985
						var0.hitSplatCycles[var77] = -1; // L: 4986
					} else {
						GrandExchangeEvents.method144(var0, var0.defaultHeight / 2); // L: 4989
						if (Client.viewportTempX > -1) { // L: 4990
							if (var77 == 1) { // L: 4992
								Client.viewportTempY -= 20; // L: 4993
							}

							if (var77 == 2) { // L: 4995
								Client.viewportTempX -= 15; // L: 4996
								Client.viewportTempY -= 10; // L: 4997
							}

							if (var77 == 3) { // L: 4999
								Client.viewportTempX += 15; // L: 5000
								Client.viewportTempY -= 10; // L: 5001
							}

							SpritePixels var18 = null; // L: 5003
							SpritePixels var19 = null; // L: 5004
							SpritePixels var20 = null; // L: 5005
							SpritePixels var21 = null; // L: 5006
							var22 = 0; // L: 5007
							var23 = 0; // L: 5008
							int var24 = 0; // L: 5009
							int var25 = 0; // L: 5010
							int var26 = 0; // L: 5011
							int var27 = 0; // L: 5012
							int var28 = 0; // L: 5013
							int var29 = 0; // L: 5014
							SpritePixels var30 = null; // L: 5015
							SpritePixels var31 = null; // L: 5016
							SpritePixels var32 = null; // L: 5017
							SpritePixels var33 = null; // L: 5018
							int var34 = 0; // L: 5019
							int var35 = 0; // L: 5020
							int var36 = 0; // L: 5021
							int var37 = 0; // L: 5022
							int var38 = 0; // L: 5023
							int var39 = 0; // L: 5024
							int var40 = 0; // L: 5025
							int var41 = 0; // L: 5026
							int var42 = 0; // L: 5027
							var18 = var91.method4583(); // L: 5028
							int var43;
							if (var18 != null) { // L: 5029
								var22 = var18.subWidth; // L: 5030
								var43 = var18.subHeight; // L: 5031
								if (var43 > var42) { // L: 5032
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5033
							}

							var19 = var91.method4578(); // L: 5035
							if (var19 != null) { // L: 5036
								var23 = var19.subWidth; // L: 5037
								var43 = var19.subHeight; // L: 5038
								if (var43 > var42) { // L: 5039
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5040
							}

							var20 = var91.method4587(); // L: 5042
							if (var20 != null) { // L: 5043
								var24 = var20.subWidth; // L: 5044
								var43 = var20.subHeight; // L: 5045
								if (var43 > var42) { // L: 5046
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5047
							}

							var21 = var91.method4585(); // L: 5049
							if (var21 != null) { // L: 5050
								var25 = var21.subWidth; // L: 5051
								var43 = var21.subHeight; // L: 5052
								if (var43 > var42) { // L: 5053
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5054
							}

							if (var16 != null) { // L: 5056
								var30 = var16.method4583(); // L: 5057
								if (var30 != null) { // L: 5058
									var34 = var30.subWidth; // L: 5059
									var43 = var30.subHeight; // L: 5060
									if (var43 > var42) { // L: 5061
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5062
								}

								var31 = var16.method4578(); // L: 5064
								if (var31 != null) { // L: 5065
									var35 = var31.subWidth; // L: 5066
									var43 = var31.subHeight; // L: 5067
									if (var43 > var42) { // L: 5068
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5069
								}

								var32 = var16.method4587(); // L: 5071
								if (var32 != null) { // L: 5072
									var36 = var32.subWidth; // L: 5073
									var43 = var32.subHeight; // L: 5074
									if (var43 > var42) { // L: 5075
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5076
								}

								var33 = var16.method4585(); // L: 5078
								if (var33 != null) { // L: 5079
									var37 = var33.subWidth; // L: 5080
									var43 = var33.subHeight; // L: 5081
									if (var43 > var42) { // L: 5082
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5083
								}
							}

							Font var78 = var91.getFont(); // L: 5088
							if (var78 == null) { // L: 5089
								var78 = class297.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5090
								var44 = var16.getFont(); // L: 5091
								if (var44 == null) { // L: 5092
									var44 = class297.fontPlain11;
								}
							} else {
								var44 = class297.fontPlain11; // L: 5094
							}

							String var45 = null; // L: 5095
							String var46 = null; // L: 5096
							boolean var47 = false; // L: 5097
							int var48 = 0; // L: 5098
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 5099
							int var92 = var78.stringWidth(var45); // L: 5100
							if (var16 != null) { // L: 5101
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 5102
								var48 = var44.stringWidth(var46); // L: 5103
							}

							int var49 = 0; // L: 5105
							int var50 = 0; // L: 5106
							if (var23 > 0) { // L: 5107
								if (var20 == null && var21 == null) { // L: 5108
									var49 = 1; // L: 5109
								} else {
									var49 = var92 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5111 5112
								if (var32 == null && var33 == null) { // L: 5113
									var50 = 1; // L: 5114
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5117
							int var52 = var51; // L: 5118
							if (var22 > 0) { // L: 5119
								var51 += var22;
							}

							var51 += 2; // L: 5120
							int var53 = var51; // L: 5121
							if (var24 > 0) { // L: 5122
								var51 += var24;
							}

							int var54 = var51; // L: 5123
							int var55 = var51; // L: 5124
							int var56;
							if (var23 > 0) { // L: 5125
								var56 = var23 * var49; // L: 5126
								var51 += var56; // L: 5127
								var55 += (var56 - var92) / 2; // L: 5128
							} else {
								var51 += var92; // L: 5131
							}

							var56 = var51; // L: 5133
							if (var25 > 0) { // L: 5134
								var51 += var25;
							}

							int var57 = 0; // L: 5135
							int var58 = 0; // L: 5136
							int var59 = 0; // L: 5137
							int var60 = 0; // L: 5138
							int var61 = 0; // L: 5139
							int var62;
							if (var16 != null) { // L: 5140
								var51 += 2; // L: 5141
								var57 = var51; // L: 5142
								if (var34 > 0) { // L: 5143
									var51 += var34;
								}

								var51 += 2; // L: 5144
								var58 = var51; // L: 5145
								if (var36 > 0) { // L: 5146
									var51 += var36;
								}

								var59 = var51; // L: 5147
								var61 = var51; // L: 5148
								if (var35 > 0) { // L: 5149
									var62 = var50 * var35; // L: 5150
									var51 += var62; // L: 5151
									var61 += (var62 - var48) / 2; // L: 5152
								} else {
									var51 += var48; // L: 5155
								}

								var60 = var51; // L: 5157
								if (var37 > 0) { // L: 5158
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5160
							int var63 = var91.field3377 - var62 * var91.field3377 / var91.field3364; // L: 5161
							int var64 = var62 * var91.field3353 / var91.field3364 + -var91.field3353; // L: 5162
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5163
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5164
							int var67 = var66; // L: 5165
							int var68 = var42 + var66; // L: 5166
							int var69 = var66 + var91.field3374 + 15; // L: 5167
							int var70 = var69 - var78.maxAscent; // L: 5168
							int var71 = var69 + var78.maxDescent; // L: 5169
							if (var70 < var66) { // L: 5170
								var67 = var70;
							}

							if (var71 > var68) { // L: 5171
								var68 = var71;
							}

							int var72 = 0; // L: 5172
							int var73;
							int var74;
							if (var16 != null) { // L: 5173
								var72 = var66 + var16.field3374 + 15; // L: 5174
								var73 = var72 - var44.maxAscent; // L: 5175
								var74 = var72 + var44.maxDescent; // L: 5176
								if (var73 < var67) { // L: 5177
									;
								}

								if (var74 > var68) { // L: 5178
									;
								}
							}

							var73 = 255; // L: 5180
							if (var91.field3378 >= 0) { // L: 5181
								var73 = (var62 << 8) / (var91.field3364 - var91.field3378);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5182
								if (var18 != null) { // L: 5183
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5184
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5185
									for (var74 = 0; var74 < var49; ++var74) { // L: 5186
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5187
									}
								}

								if (var21 != null) { // L: 5190
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var65 + var55, var69, var91.textColor, 0, var73); // L: 5191
								if (var16 != null) { // L: 5192
									if (var30 != null) { // L: 5193
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5194
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5195
										for (var74 = 0; var74 < var50; ++var74) { // L: 5196
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73); // L: 5197
										}
									}

									if (var33 != null) { // L: 5200
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 5201
								}
							} else {
								if (var18 != null) { // L: 5205
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5206
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5207
									for (var74 = 0; var74 < var49; ++var74) { // L: 5208
										var19.drawTransBgAt(var74 * var23 + (var65 + var54 - var27), var66); // L: 5209
									}
								}

								if (var21 != null) { // L: 5212
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var78.draw(var45, var65 + var55, var69, var91.textColor | -16777216, 0); // L: 5213
								if (var16 != null) { // L: 5214
									if (var30 != null) { // L: 5215
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5216
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5217
										for (var74 = 0; var74 < var50; ++var74) { // L: 5218
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66); // L: 5219
										}
									}

									if (var33 != null) { // L: 5222
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var16.textColor | -16777216, 0); // L: 5223
								}
							}
						}
					}
				}
			}

		}
	} // L: 5228

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "11"
	)
	static String method632(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 11071
		if (Client.gameBuild == 1) { // L: 11072
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 11073
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 11074
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 11075
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 11076
			var0 = "local";
		}

		String var3 = ""; // L: 11077
		if (WorldMapSection1.field317 != null) { // L: 11078
			var3 = "/p=" + WorldMapSection1.field317;
		}

		String var4 = "runescape.com"; // L: 11079
		return var2 + var0 + "." + var4 + "/l=" + WorldMapScaleHandler.clientLanguage + "/a=" + MidiPcmStream.field2455 + var3 + "/"; // L: 11080
	}
}
