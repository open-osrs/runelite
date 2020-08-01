import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "[Llz;"
	)
	@Export("crossSprites")
	static Sprite[] crossSprites;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 7552119433294969811L
	)
	long field3613;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 6826365957378108595L
	)
	long field3612;
	@ObfuscatedName("q")
	public boolean field3618;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 3366476848742949295L
	)
	long field3611;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -6463393078579201841L
	)
	long field3617;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 585068566334505215L
	)
	long field3609;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1658064199
	)
	int field3614;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 936590501
	)
	int field3615;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 656692765
	)
	int field3616;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -538696129
	)
	int field3610;

	public Timer() {
		this.field3613 = -1L;
		this.field3612 = -1L;
		this.field3618 = false;
		this.field3611 = 0L;
		this.field3617 = 0L;
		this.field3609 = 0L;
		this.field3614 = 0;
		this.field3615 = 0;
		this.field3616 = 0;
		this.field3610 = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1434550274"
	)
	public void method5162() {
		this.field3613 = MilliClock.currentTimeMillis();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1764633933"
	)
	public void method5161() {
		if (this.field3613 != -1L) {
			this.field3617 = MilliClock.currentTimeMillis() - this.field3613;
			this.field3613 = -1L;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "457646537"
	)
	public void method5184(int var1) {
		this.field3612 = MilliClock.currentTimeMillis();
		this.field3614 = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	public void method5178() {
		if (-1L != this.field3612) {
			this.field3611 = MilliClock.currentTimeMillis() - this.field3612;
			this.field3612 = -1L;
		}

		++this.field3616;
		this.field3618 = true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "535522707"
	)
	public void method5165() {
		this.field3618 = false;
		this.field3615 = 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-932156837"
	)
	public void method5166() {
		this.method5178();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-152968698"
	)
	@Export("write")
	public void write(Buffer var1) {
		NetSocket.method3677(var1, this.field3617);
		NetSocket.method3677(var1, this.field3611);
		NetSocket.method3677(var1, this.field3609);
		var1.writeShort(this.field3614);
		var1.writeShort(this.field3615);
		var1.writeShort(this.field3616);
		var1.writeShort(this.field3610);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2109175482"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class58.pcmPlayer1 != null) {
			class58.pcmPlayer1.run();
		}

		if (class2.pcmPlayer0 != null) {
			class2.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lcc;IIIIIB)V",
		garbageValue = "103"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCDefinition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			byte var8 = 0;
			Player var10;
			int var93;
			if (var1 < var75 && var0.playerCycle == Client.cycle) {
				var10 = (Player)var0;
				boolean var9;
				if (Client.drawPlayerNames == 0) {
					var9 = false;
				} else {
					boolean var78;
					if (var10 == class60.localPlayer) {
						var78 = (Client.drawPlayerNames & 8) != 0;
						var9 = var78;
					} else {
						var78 = class7.method98();
						boolean var12;
						if (!var78) {
							var12 = (Client.drawPlayerNames & 1) != 0;
							var78 = var12 && var10.isFriend();
						}

						var12 = var78;
						if (!var78) {
							boolean var80 = (Client.drawPlayerNames & 2) != 0;
							var12 = var80 && var10.isClanMember();
						}

						var9 = var12;
					}
				}

				if (var9) {
					Player var11 = (Player)var0;
					if (var1 < var75) {
						var93 = var0.defaultHeight + 15;
						HealthBar.worldToScreen(var0.x, var0.y, var93);
						AbstractFont var13 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						byte var14 = 9;
						var13.drawCentered(var11.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var14, 16777215, 0);
						var8 = 18;
					}
				}
			}

			int var89 = -2;
			int var15;
			int var16;
			int var22;
			int var23;
			if (!var0.healthBars.method5014()) {
				DirectByteArrayCopier.method4090(var0, var0.defaultHeight + 15);

				for (HealthBar var90 = (HealthBar)var0.healthBars.last(); var90 != null; var90 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var91 = var90.get(Client.cycle);
					if (var91 == null) {
						if (var90.isEmpty()) {
							var90.remove();
						}
					} else {
						HealthBarDefinition var76 = var90.definition;
						Sprite var94 = var76.getBackSprite();
						Sprite var77 = var76.getFrontSprite();
						var16 = 0;
						if (var94 != null && var77 != null) {
							if (var76.widthPadding * 2 < var77.subWidth) {
								var16 = var76.widthPadding;
							}

							var15 = var77.subWidth - var16 * 2;
						} else {
							var15 = var76.width;
						}

						int var17 = 255;
						boolean var18 = true;
						int var19 = Client.cycle - var91.cycle;
						int var20 = var15 * var91.health2 / var76.width;
						int var21;
						int var97;
						if (var91.cycleOffset > var19) {
							var21 = var76.field3317 == 0 ? 0 : var76.field3317 * (var19 / var76.field3317);
							var22 = var15 * var91.health / var76.width;
							var97 = var21 * (var20 - var22) / var91.cycleOffset + var22;
						} else {
							var97 = var20;
							var21 = var76.int5 + var91.cycleOffset - var19;
							if (var76.int3 >= 0) {
								var17 = (var21 << 8) / (var76.int5 - var76.int3);
							}
						}

						if (var91.health2 > 0 && var97 < 1) {
							var97 = 1;
						}

						if (var94 != null && var77 != null) {
							if (var15 == var97) {
								var97 += var16 * 2;
							} else {
								var97 += var16;
							}

							var21 = var94.subHeight;
							var89 += var21;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var89;
							var22 -= var16;
							if (var17 >= 0 && var17 < 255) {
								var94.drawTransAt(var22, var23, var17);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var97, var23 + var21);
								var77.drawTransAt(var22, var23, var17);
							} else {
								var94.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var97 + var22, var21 + var23);
								var77.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var89 += 2;
						} else {
							var89 += 5;
							if (Client.viewportTempX > -1) {
								var21 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var89;
								Rasterizer2D.Rasterizer2D_fillRectangle(var21, var22, var97, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var21 + var97, var22, var15 - var97, 5, 16711680);
							}

							var89 += 2;
						}
					}
				}
			}

			if (var89 == -2) {
				var89 += 7;
			}

			var89 += var8;
			int var99;
			if (var1 < var75) {
				var10 = (Player)var0;
				if (var10.isHidden) {
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
					DirectByteArrayCopier.method4090(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var10.headIconPk != -1) {
							var89 += 25;
							CollisionMap.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}

						if (var10.headIconPrayer != -1) {
							var89 += 25;
							KeyHandler.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					DirectByteArrayCopier.method4090(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var89 += SoundSystem.headIconHintSprites[1].subHeight;
						SoundSystem.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
					}
				}
			} else {
				NPCDefinition var92 = ((NPC)var0).definition;
				if (var92.transforms != null) {
					var92 = var92.transform();
				}

				if (var92.headIconPrayer >= 0 && var92.headIconPrayer < KeyHandler.headIconPrayerSprites.length) {
					DirectByteArrayCopier.method4090(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						KeyHandler.headIconPrayerSprites[var92.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					var99 = var0.defaultHeight + 15;
					HealthBar.worldToScreen(var0.x, var0.y, var99);
					if (Client.viewportTempX > -1) {
						SoundSystem.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field979 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				DirectByteArrayCopier.method4090(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = GrandExchangeOfferNameComparator.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = GrandExchangeOfferNameComparator.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (int var79 = 0; var79 < 4; ++var79) {
				var99 = var0.hitSplatCycles[var79];
				var93 = var0.hitSplatTypes[var79];
				HitSplatDefinition var95 = null;
				int var96 = 0;
				HitSplatDefinition var81;
				if (var93 >= 0) {
					if (var99 <= Client.cycle) {
						continue;
					}

					var16 = var0.hitSplatTypes[var79];
					var81 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var16);
					HitSplatDefinition var82;
					if (var81 != null) {
						var82 = var81;
					} else {
						byte[] var84 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var16);
						var81 = new HitSplatDefinition();
						if (var84 != null) {
							var81.decode(new Buffer(var84));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var81, (long)var16);
						var82 = var81;
					}

					var95 = var82;
					var96 = var82.field3364;
					if (var82 != null && var82.transforms != null) {
						var95 = var82.transform();
						if (var95 == null) {
							var0.hitSplatCycles[var79] = -1;
							continue;
						}
					}
				} else if (var99 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var79];
				HitSplatDefinition var83 = null;
				HitSplatDefinition var100;
				if (var15 >= 0) {
					var100 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var15);
					if (var100 != null) {
						var81 = var100;
					} else {
						byte[] var85 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var15);
						var100 = new HitSplatDefinition();
						if (var85 != null) {
							var100.decode(new Buffer(var85));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var100, (long)var15);
						var81 = var100;
					}

					var83 = var81;
					if (var81 != null && var81.transforms != null) {
						var83 = var81.transform();
					}
				}

				if (var99 - var96 <= Client.cycle) {
					if (var95 == null) {
						var0.hitSplatCycles[var79] = -1;
					} else {
						DirectByteArrayCopier.method4090(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							if (var79 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var79 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var79 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							var100 = null;
							Sprite var101 = null;
							Sprite var86 = null;
							Sprite var87 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							Sprite var30 = null;
							Sprite var31 = null;
							Sprite var32 = null;
							Sprite var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							Sprite var102 = var95.method4755();
							int var43;
							if (var102 != null) {
								var22 = var102.subWidth;
								var43 = var102.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var102.xOffset;
							}

							var101 = var95.method4756();
							if (var101 != null) {
								var23 = var101.subWidth;
								var43 = var101.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var101.xOffset;
							}

							var86 = var95.method4752();
							if (var86 != null) {
								var24 = var86.subWidth;
								var43 = var86.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var86.xOffset;
							}

							var87 = var95.method4763();
							if (var87 != null) {
								var25 = var87.subWidth;
								var43 = var87.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var87.xOffset;
							}

							if (var83 != null) {
								var30 = var83.method4755();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var83.method4756();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var83.method4752();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var83.method4763();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var88 = var95.getFont();
							if (var88 == null) {
								var88 = WorldMapLabel.fontPlain11;
							}

							Font var44;
							if (var83 != null) {
								var44 = var83.getFont();
								if (var44 == null) {
									var44 = WorldMapLabel.fontPlain11;
								}
							} else {
								var44 = WorldMapLabel.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var95.getString(var0.hitSplatValues[var79]);
							int var98 = var88.stringWidth(var45);
							if (var83 != null) {
								var46 = var83.getString(var0.hitSplatValues2[var79]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var86 == null && var87 == null) {
									var49 = 1;
								} else {
									var49 = var98 / var23 + 1;
								}
							}

							if (var83 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var49 * var23;
								var51 += var56;
								var55 += (var56 - var98) / 2;
							} else {
								var51 += var98;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var83 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var50 * var35;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var79] - Client.cycle;
							int var63 = var95.field3369 - var62 * var95.field3369 / var95.field3364;
							int var64 = var62 * var95.field3370 / var95.field3364 + -var95.field3370;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var3 + Client.viewportTempY - 12 + var64;
							int var67 = var66;
							int var68 = var42 + var66;
							int var69 = var66 + var95.field3374 + 15;
							int var70 = var69 - var88.maxAscent;
							int var71 = var69 + var88.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var83 != null) {
								var72 = var66 + var83.field3374 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var95.field3363 >= 0) {
								var73 = (var62 << 8) / (var95.field3364 - var95.field3363);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var102 != null) {
									var102.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var86 != null) {
									var86.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var101 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var101.drawTransAt(var74 * var23 + (var65 + var54 - var27), var66, var73);
									}
								}

								if (var87 != null) {
									var87.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var88.drawAlpha(var45, var55 + var65, var69, var95.textColor, 0, var73);
								if (var83 != null) {
									if (var30 != null) {
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var83.textColor, 0, var73);
								}
							} else {
								if (var102 != null) {
									var102.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var86 != null) {
									var86.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var101 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var101.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66);
									}
								}

								if (var87 != null) {
									var87.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var88.draw(var45, var65 + var55, var69, var95.textColor | -16777216, 0);
								if (var83 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var83.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
