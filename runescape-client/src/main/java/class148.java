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
		this.field1658 = -1L;
		this.field1652 = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1658 = var1.readLong();
		}

		this.field1652 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2853(this.field1658, this.field1652);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "-2041302751"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "498482718"
	)
	static int method3019(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class404.Widget_unpackTargetMask(class363.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1459552058"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (PacketWriter.pcmPlayer1 != null) {
			PacketWriter.pcmPlayer1.run();
		}

		if (JagexCache.pcmPlayer0 != null) {
			JagexCache.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lcy;IIIIII)V",
		garbageValue = "1260846152"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
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
			if (var1 < var75 && var0.playerCycle == Client.cycle) {
				var10 = (Player)var0;
				boolean var9;
				if (Client.drawPlayerNames == 0) {
					var9 = false;
				} else if (var10 == class340.localPlayer) {
					var9 = class329.method6133();
				} else {
					boolean var11 = MilliClock.method3121();
					boolean var12;
					if (!var11) {
						var12 = (Client.drawPlayerNames & 1) != 0;
						var11 = var12 && var10.isFriend();
					}

					var12 = var11;
					if (!var11) {
						boolean var13 = (Client.drawPlayerNames & 2) != 0;
						var12 = var13 && var10.isFriendsChatMember();
					}

					var9 = var12;
				}

				if (var9) {
					Player var76 = (Player)var0;
					if (var1 < var75) {
						VarpDefinition.method3167(var0, var0.defaultHeight + 15);
						AbstractFont var77 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						byte var91 = 9;
						var77.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var91, 16777215, 0);
						var8 = 18;
					}
				}
			}

			int var87 = -2;
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method5915()) {
				VarpDefinition.method3167(var0, var0.defaultHeight + 15);

				for (HealthBar var88 = (HealthBar)var0.healthBars.last(); var88 != null; var88 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var95 = var88.get(Client.cycle);
					if (var95 == null) {
						if (var88.isEmpty()) {
							var88.remove();
						}
					} else {
						HealthBarDefinition var96 = var88.definition;
						SpritePixels var79 = var96.getBackSprite();
						SpritePixels var81 = var96.getFrontSprite();
						int var82 = 0;
						if (var79 != null && var81 != null) {
							if (var96.widthPadding * 2 < var81.subWidth) {
								var82 = var96.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2;
						} else {
							var15 = var96.width;
						}

						int var17 = 255;
						boolean var83 = true;
						int var84 = Client.cycle - var95.cycle;
						int var85 = var15 * var95.health2 / var96.width;
						int var86;
						int var98;
						if (var95.cycleOffset > var84) {
							var86 = var96.field1798 == 0 ? 0 : var96.field1798 * (var84 / var96.field1798);
							var22 = var15 * var95.health / var96.width;
							var98 = var86 * (var85 - var22) / var95.cycleOffset + var22;
						} else {
							var98 = var85;
							var86 = var95.cycleOffset + var96.int5 - var84;
							if (var96.int3 >= 0) {
								var17 = (var86 << 8) / (var96.int5 - var96.int3);
							}
						}

						if (var95.health2 > 0 && var98 < 1) {
							var98 = 1;
						}

						if (var79 != null && var81 != null) {
							if (var98 == var15) {
								var98 += var82 * 2;
							} else {
								var98 += var82;
							}

							var86 = var79.subHeight;
							var87 += var86;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var87;
							var22 -= var82;
							if (var17 >= 0 && var17 < 255) {
								var79.drawTransAt(var22, var23, var17);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var86);
								var81.drawTransAt(var22, var23, var17);
							} else {
								var79.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var86 + var23);
								var81.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var87 += 2;
						} else {
							var87 += 5;
							if (Client.viewportTempX > -1) {
								var86 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var87;
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var98, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var86, var22, var15 - var98, 5, 16711680);
							}

							var87 += 2;
						}
					}
				}
			}

			if (var87 == -2) {
				var87 += 7;
			}

			var87 += var8;
			if (var1 < var75) {
				var10 = (Player)var0;
				if (var10.isHidden) {
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
					VarpDefinition.method3167(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var10.headIconPk != -1) {
							var87 += 25;
							class286.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
						}

						if (var10.headIconPrayer != -1) {
							var87 += 25;
							PlayerComposition.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					VarpDefinition.method3167(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var87 += class260.headIconHintSprites[1].subHeight;
						class260.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition;
				if (var89.transforms != null) {
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < PlayerComposition.headIconPrayerSprites.length) {
					VarpDefinition.method3167(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						PlayerComposition.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					VarpDefinition.method3167(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						class260.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1114 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				VarpDefinition.method3167(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class136.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class136.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (int var78 = 0; var78 < 4; ++var78) {
				int var90 = var0.hitSplatCycles[var78];
				int var92 = var0.hitSplatTypes[var78];
				HitSplatDefinition var97 = null;
				int var14 = 0;
				if (var92 >= 0) {
					if (var90 <= Client.cycle) {
						continue;
					}

					var97 = UserComparator6.method2554(var0.hitSplatTypes[var78]);
					var14 = var97.field1934;
					if (var97 != null && var97.transforms != null) {
						var97 = var97.transform();
						if (var97 == null) {
							var0.hitSplatCycles[var78] = -1;
							continue;
						}
					}
				} else if (var90 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var78];
				HitSplatDefinition var16 = null;
				if (var15 >= 0) {
					var16 = UserComparator6.method2554(var15);
					if (var16 != null && var16.transforms != null) {
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) {
					if (var97 == null) {
						var0.hitSplatCycles[var78] = -1;
					} else {
						VarpDefinition.method3167(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							boolean var93 = true;
							if (var78 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var78 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var78 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var97.method3451();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var97.method3452();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var97.method3453();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var97.method3454();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var16 != null) {
								var30 = var16.method3451();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var16.method3452();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var16.method3453();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var16.method3454();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var80 = var97.getFont();
							if (var80 == null) {
								var80 = class307.fontPlain11;
							}

							Font var44;
							if (var16 != null) {
								var44 = var16.getFont();
								if (var44 == null) {
									var44 = class307.fontPlain11;
								}
							} else {
								var44 = class307.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var97.getString(var0.hitSplatValues[var78]);
							int var94 = var80.stringWidth(var45);
							if (var16 != null) {
								var46 = var16.getString(var0.hitSplatValues2[var78]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var94 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) {
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
								var55 += (var56 - var94) / 2;
							} else {
								var51 += var94;
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
							if (var16 != null) {
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

							var62 = var0.hitSplatCycles[var78] - Client.cycle;
							int var63 = var97.field1929 - var62 * var97.field1929 / var97.field1934;
							int var64 = var62 * var97.field1940 / var97.field1934 + -var97.field1940;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var64 + (var3 + Client.viewportTempY - 12);
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var66 + var97.field1944 + 15;
							int var70 = var69 - var80.maxAscent;
							int var71 = var69 + var80.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var16 != null) {
								var72 = var66 + var16.field1944 + 15;
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
							if (var97.field1943 >= 0) {
								var73 = (var62 << 8) / (var97.field1934 - var97.field1943);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var80.drawAlpha(var45, var65 + var55, var69, var97.textColor, 0, var73);
								if (var16 != null) {
									if (var30 != null) {
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var80.draw(var45, var65 + var55, var69, var97.textColor | -16777216, 0);
								if (var16 != null) {
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
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var16.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class340.localPlayer.x / 32 + 48;
				int var7 = 464 - class340.localPlayer.y / 32;
				class29.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class340.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class340.localPlayer.y / 32;
					ArchiveDisk.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class20.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class340.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class340.localPlayer.y / 32;
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var11, var12, class111.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - class340.localPlayer.x / 32;
							var12 = var9.y / 32 - class340.localPlayer.y / 32;
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var11, var12, class111.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class340.localPlayer) {
						var12 = var15.x / 32 - class340.localPlayer.x / 32;
						int var13 = var15.y / 32 - class340.localPlayer.y / 32;
						if (var15.isFriend()) {
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[3], var4);
						} else if (class340.localPlayer.team != 0 && var15.team != 0 && var15.team == class340.localPlayer.team) {
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[6], var4);
						} else {
							ArchiveDisk.drawSpriteOnMinimap(var1, var2, var12, var13, class111.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class340.localPlayer.x / 32;
							var12 = var19.y / 32 - class340.localPlayer.y / 32;
							class409.worldToMinimap(var1, var2, var11, var12, UserComparator7.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class131.baseX * 4 + 2 - class340.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - TileItem.baseY * 4 + 2 - class340.localPlayer.y / 32;
						class409.worldToMinimap(var1, var2, var10, var11, UserComparator7.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class340.localPlayer.x / 32;
							var12 = var20.y / 32 - class340.localPlayer.y / 32;
							class409.worldToMinimap(var1, var2, var11, var12, UserComparator7.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class340.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class340.localPlayer.y / 32;
					ArchiveDisk.drawSpriteOnMinimap(var1, var2, var10, var11, UserComparator7.mapMarkerSprites[0], var4);
				}

				if (!class340.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field686[var3] = true;
		}
	}
}
