import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class311 {
	@ObfuscatedName("t")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "27746923"
	)
	static boolean method5605(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 58
			try {
				if (!class44.field294.startsWith("win")) { // L: 60
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 61
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 62

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 63
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 64
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 66
					return true; // L: 67
				}
			} catch (Throwable var5) { // L: 69
				return false; // L: 70
			}
		} else if (var1 == 1) { // L: 73
			try {
				Object var3 = class42.method511(class44.applet, var2, new Object[]{(new URL(class44.applet.getCodeBase(), var0)).toString()}); // L: 75
				return var3 != null; // L: 76
			} catch (Throwable var6) { // L: 78
				return false; // L: 79
			}
		} else if (var1 == 2) { // L: 82
			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_blank"); // L: 84
				return true; // L: 85
			} catch (Exception var7) { // L: 87
				return false; // L: 88
			}
		} else if (var1 == 3) { // L: 91
			try {
				class42.method509(class44.applet, "loggedout"); // L: 93
			} catch (Throwable var9) { // L: 95
			}

			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_top"); // L: 97
				return true; // L: 98
			} catch (Exception var8) { // L: 100
				return false; // L: 101
			}
		} else {
			throw new IllegalArgumentException(); // L: 104
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lcd;IIIIIB)V",
		garbageValue = "66"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4066
			if (var0 instanceof NPC) { // L: 4067
				NPCComposition var6 = ((NPC)var0).definition; // L: 4068
				if (var6.transforms != null) { // L: 4069
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4070
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4072
			int[] var7 = Players.Players_indices; // L: 4073
			byte var8 = 0; // L: 4074
			Player var10;
			if (var1 < var75 && var0.playerCycle == Client.cycle) { // L: 4075
				var10 = (Player)var0; // L: 4077
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 4079
					var9 = false; // L: 4080
				} else if (var10 != Varcs.localPlayer) { // L: 4083
					boolean var11 = (Client.drawPlayerNames & 4) != 0; // L: 4086
					boolean var12 = var11; // L: 4088
					if (!var11) { // L: 4089
						boolean var13 = (Client.drawPlayerNames & 1) != 0; // L: 4092
						var12 = var13 && var10.isFriend(); // L: 4094
					}

					var9 = var12 || ApproximateRouteStrategy.method1206() && var10.isClanMember(); // L: 4096
				} else {
					var9 = PcmPlayer.method855(); // L: 4098
				}

				if (var9) { // L: 4100
					Player var76 = (Player)var0; // L: 4101
					if (var1 < var75) { // L: 4102
						ScriptFrame.method1173(var0, var0.defaultHeight + 15); // L: 4103
						AbstractFont var77 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4104
						byte var92 = 9; // L: 4105
						var77.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var92, 16777215, 0); // L: 4106
						var8 = 18; // L: 4107
					}
				}
			}

			int var87 = -2; // L: 4111
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method4787()) { // L: 4112
				ScriptFrame.method1173(var0, var0.defaultHeight + 15); // L: 4113

				for (HealthBar var88 = (HealthBar)var0.healthBars.last(); var88 != null; var88 = (HealthBar)var0.healthBars.previous()) { // L: 4114
					HealthBarUpdate var94 = var88.get(Client.cycle); // L: 4115
					if (var94 == null) { // L: 4116
						if (var88.isEmpty()) { // L: 4174
							var88.remove();
						}
					} else {
						HealthBarDefinition var95 = var88.definition; // L: 4117
						SpritePixels var79 = var95.getBackSprite(); // L: 4118
						SpritePixels var81 = var95.getFrontSprite(); // L: 4119
						int var82 = 0; // L: 4121
						if (var79 != null && var81 != null) { // L: 4122
							if (var95.widthPadding * 2 < var81.subWidth) { // L: 4123
								var82 = var95.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4124
						} else {
							var15 = var95.width; // L: 4126
						}

						int var17 = 255; // L: 4127
						boolean var83 = true; // L: 4128
						int var84 = Client.cycle - var94.cycle; // L: 4129
						int var85 = var15 * var94.health2 / var95.width; // L: 4130
						int var86;
						int var97;
						if (var94.cycleOffset > var84) { // L: 4131
							var86 = var95.field3449 == 0 ? 0 : var95.field3449 * (var84 / var95.field3449); // L: 4132
							var22 = var15 * var94.health / var95.width; // L: 4133
							var97 = var86 * (var85 - var22) / var94.cycleOffset + var22; // L: 4134
						} else {
							var97 = var85; // L: 4137
							var86 = var94.cycleOffset + var95.int5 - var84; // L: 4138
							if (var95.int3 >= 0) { // L: 4139
								var17 = (var86 << 8) / (var95.int5 - var95.int3);
							}
						}

						if (var94.health2 > 0 && var97 < 1) { // L: 4141
							var97 = 1;
						}

						if (var79 != null && var81 != null) { // L: 4142
							if (var97 == var15) { // L: 4143
								var97 += var82 * 2;
							} else {
								var97 += var82; // L: 4144
							}

							var86 = var79.subHeight; // L: 4145
							var87 += var86; // L: 4146
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4147
							var23 = var3 + Client.viewportTempY - var87; // L: 4148
							var22 -= var82; // L: 4149
							if (var17 >= 0 && var17 < 255) { // L: 4150
								var79.drawTransAt(var22, var23, var17); // L: 4151
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var97, var23 + var86); // L: 4152
								var81.drawTransAt(var22, var23, var17); // L: 4153
							} else {
								var79.drawTransBgAt(var22, var23); // L: 4156
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var97, var86 + var23); // L: 4157
								var81.drawTransBgAt(var22, var23); // L: 4158
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4160
							var87 += 2; // L: 4161
						} else {
							var87 += 5; // L: 4164
							if (Client.viewportTempX > -1) { // L: 4165
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4166
								var22 = var3 + Client.viewportTempY - var87; // L: 4167
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var97, 5, 65280); // L: 4168
								Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var97, var22, var15 - var97, 5, 16711680); // L: 4169
							}

							var87 += 2; // L: 4171
						}
					}
				}
			}

			if (var87 == -2) { // L: 4177
				var87 += 7;
			}

			var87 += var8; // L: 4178
			if (var1 < var75) { // L: 4179
				var10 = (Player)var0; // L: 4180
				if (var10.isHidden) { // L: 4181
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 4182
					ScriptFrame.method1173(var0, var0.defaultHeight + 15); // L: 4183
					if (Client.viewportTempX > -1) { // L: 4184
						if (var10.headIconPk != -1) { // L: 4185
							var87 += 25; // L: 4186
							ItemContainer.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4187
						}

						if (var10.headIconPrayer != -1) { // L: 4189
							var87 += 25; // L: 4190
							ArchiveDiskActionHandler.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4191
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4195
					ScriptFrame.method1173(var0, var0.defaultHeight + 15); // L: 4196
					if (Client.viewportTempX > -1) { // L: 4197
						var87 += Script.headIconHintSprites[1].subHeight; // L: 4198
						Script.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87); // L: 4199
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 4204
				if (var89.transforms != null) { // L: 4205
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < ArchiveDiskActionHandler.headIconPrayerSprites.length) { // L: 4206
					ScriptFrame.method1173(var0, var0.defaultHeight + 15); // L: 4207
					if (Client.viewportTempX > -1) { // L: 4208
						ArchiveDiskActionHandler.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4209
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4212
					ScriptFrame.method1173(var0, var0.defaultHeight + 15); // L: 4213
					if (Client.viewportTempX > -1) { // L: 4214
						Script.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1208 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4217 4218
				ScriptFrame.method1173(var0, var0.defaultHeight); // L: 4219
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4220
					Client.overheadTextXOffsets[Client.overheadTextCount] = class368.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4221
					Client.overheadTextAscents[Client.overheadTextCount] = class368.fontBold12.ascent; // L: 4222
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4223
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4224
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4225
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4226
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4227
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4228
					++Client.overheadTextCount; // L: 4229
				}
			}

			for (int var78 = 0; var78 < 4; ++var78) { // L: 4233
				int var90 = var0.hitSplatCycles[var78]; // L: 4234
				int var91 = var0.hitSplatTypes[var78]; // L: 4235
				HitSplatDefinition var96 = null; // L: 4236
				int var14 = 0; // L: 4237
				if (var91 >= 0) { // L: 4238
					if (var90 <= Client.cycle) { // L: 4239
						continue;
					}

					var96 = StudioGame.method4391(var0.hitSplatTypes[var78]); // L: 4240
					var14 = var96.field3581; // L: 4241
					if (var96 != null && var96.transforms != null) { // L: 4242
						var96 = var96.transform(); // L: 4243
						if (var96 == null) { // L: 4244
							var0.hitSplatCycles[var78] = -1; // L: 4245
							continue; // L: 4246
						}
					}
				} else if (var90 < 0) { // L: 4250
					continue;
				}

				var15 = var0.hitSplatTypes2[var78]; // L: 4251
				HitSplatDefinition var16 = null; // L: 4252
				if (var15 >= 0) { // L: 4253
					var16 = StudioGame.method4391(var15); // L: 4254
					if (var16 != null && var16.transforms != null) { // L: 4255
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 4257
					if (var96 == null) { // L: 4258
						var0.hitSplatCycles[var78] = -1; // L: 4259
					} else {
						ScriptFrame.method1173(var0, var0.defaultHeight / 2); // L: 4262
						if (Client.viewportTempX > -1) { // L: 4263
							if (var78 == 1) { // L: 4265
								Client.viewportTempY -= 20; // L: 4266
							}

							if (var78 == 2) { // L: 4268
								Client.viewportTempX -= 15; // L: 4269
								Client.viewportTempY -= 10; // L: 4270
							}

							if (var78 == 3) { // L: 4272
								Client.viewportTempX += 15; // L: 4273
								Client.viewportTempY -= 10; // L: 4274
							}

							SpritePixels var18 = null; // L: 4276
							SpritePixels var19 = null; // L: 4277
							SpritePixels var20 = null; // L: 4278
							SpritePixels var21 = null; // L: 4279
							var22 = 0; // L: 4280
							var23 = 0; // L: 4281
							int var24 = 0; // L: 4282
							int var25 = 0; // L: 4283
							int var26 = 0; // L: 4284
							int var27 = 0; // L: 4285
							int var28 = 0; // L: 4286
							int var29 = 0; // L: 4287
							SpritePixels var30 = null; // L: 4288
							SpritePixels var31 = null; // L: 4289
							SpritePixels var32 = null; // L: 4290
							SpritePixels var33 = null; // L: 4291
							int var34 = 0; // L: 4292
							int var35 = 0; // L: 4293
							int var36 = 0; // L: 4294
							int var37 = 0; // L: 4295
							int var38 = 0; // L: 4296
							int var39 = 0; // L: 4297
							int var40 = 0; // L: 4298
							int var41 = 0; // L: 4299
							int var42 = 0; // L: 4300
							var18 = var96.method5166(); // L: 4301
							int var43;
							if (var18 != null) { // L: 4302
								var22 = var18.subWidth; // L: 4303
								var43 = var18.subHeight; // L: 4304
								if (var43 > var42) { // L: 4305
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 4306
							}

							var19 = var96.method5137(); // L: 4308
							if (var19 != null) { // L: 4309
								var23 = var19.subWidth; // L: 4310
								var43 = var19.subHeight; // L: 4311
								if (var43 > var42) { // L: 4312
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 4313
							}

							var20 = var96.method5138(); // L: 4315
							if (var20 != null) { // L: 4316
								var24 = var20.subWidth; // L: 4317
								var43 = var20.subHeight; // L: 4318
								if (var43 > var42) { // L: 4319
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 4320
							}

							var21 = var96.method5157(); // L: 4322
							if (var21 != null) { // L: 4323
								var25 = var21.subWidth; // L: 4324
								var43 = var21.subHeight; // L: 4325
								if (var43 > var42) { // L: 4326
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 4327
							}

							if (var16 != null) { // L: 4329
								var30 = var16.method5166(); // L: 4330
								if (var30 != null) { // L: 4331
									var34 = var30.subWidth; // L: 4332
									var43 = var30.subHeight; // L: 4333
									if (var43 > var42) { // L: 4334
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 4335
								}

								var31 = var16.method5137(); // L: 4337
								if (var31 != null) { // L: 4338
									var35 = var31.subWidth; // L: 4339
									var43 = var31.subHeight; // L: 4340
									if (var43 > var42) { // L: 4341
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 4342
								}

								var32 = var16.method5138(); // L: 4344
								if (var32 != null) { // L: 4345
									var36 = var32.subWidth; // L: 4346
									var43 = var32.subHeight; // L: 4347
									if (var43 > var42) { // L: 4348
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 4349
								}

								var33 = var16.method5157(); // L: 4351
								if (var33 != null) { // L: 4352
									var37 = var33.subWidth; // L: 4353
									var43 = var33.subHeight; // L: 4354
									if (var43 > var42) { // L: 4355
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 4356
								}
							}

							Font var80 = var96.getFont(); // L: 4361
							if (var80 == null) { // L: 4362
								var80 = class0.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 4363
								var44 = var16.getFont(); // L: 4364
								if (var44 == null) { // L: 4365
									var44 = class0.fontPlain11;
								}
							} else {
								var44 = class0.fontPlain11; // L: 4367
							}

							String var45 = null; // L: 4368
							String var46 = null; // L: 4369
							boolean var47 = false; // L: 4370
							int var48 = 0; // L: 4371
							var45 = var96.getString(var0.hitSplatValues[var78]); // L: 4372
							int var93 = var80.stringWidth(var45); // L: 4373
							if (var16 != null) { // L: 4374
								var46 = var16.getString(var0.hitSplatValues2[var78]); // L: 4375
								var48 = var44.stringWidth(var46); // L: 4376
							}

							int var49 = 0; // L: 4378
							int var50 = 0; // L: 4379
							if (var23 > 0) { // L: 4380
								if (var20 == null && var21 == null) { // L: 4381
									var49 = 1; // L: 4382
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 4384 4385
								if (var32 == null && var33 == null) { // L: 4386
									var50 = 1; // L: 4387
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 4390
							int var52 = var51; // L: 4391
							if (var22 > 0) { // L: 4392
								var51 += var22;
							}

							var51 += 2; // L: 4393
							int var53 = var51; // L: 4394
							if (var24 > 0) { // L: 4395
								var51 += var24;
							}

							int var54 = var51; // L: 4396
							int var55 = var51; // L: 4397
							int var56;
							if (var23 > 0) { // L: 4398
								var56 = var23 * var49; // L: 4399
								var51 += var56; // L: 4400
								var55 += (var56 - var93) / 2; // L: 4401
							} else {
								var51 += var93; // L: 4404
							}

							var56 = var51; // L: 4406
							if (var25 > 0) { // L: 4407
								var51 += var25;
							}

							int var57 = 0; // L: 4408
							int var58 = 0; // L: 4409
							int var59 = 0; // L: 4410
							int var60 = 0; // L: 4411
							int var61 = 0; // L: 4412
							int var62;
							if (var16 != null) { // L: 4413
								var51 += 2; // L: 4414
								var57 = var51; // L: 4415
								if (var34 > 0) { // L: 4416
									var51 += var34;
								}

								var51 += 2; // L: 4417
								var58 = var51; // L: 4418
								if (var36 > 0) { // L: 4419
									var51 += var36;
								}

								var59 = var51; // L: 4420
								var61 = var51; // L: 4421
								if (var35 > 0) { // L: 4422
									var62 = var50 * var35; // L: 4423
									var51 += var62; // L: 4424
									var61 += (var62 - var48) / 2; // L: 4425
								} else {
									var51 += var48; // L: 4428
								}

								var60 = var51; // L: 4430
								if (var37 > 0) { // L: 4431
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var78] - Client.cycle; // L: 4433
							int var63 = var96.field3572 - var62 * var96.field3572 / var96.field3581; // L: 4434
							int var64 = var62 * var96.field3584 / var96.field3581 + -var96.field3584; // L: 4435
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 4436
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 4437
							int var67 = var66; // L: 4438
							int var68 = var42 + var66; // L: 4439
							int var69 = var66 + var96.field3582 + 15; // L: 4440
							int var70 = var69 - var80.maxAscent; // L: 4441
							int var71 = var69 + var80.maxDescent; // L: 4442
							if (var70 < var66) { // L: 4443
								var67 = var70;
							}

							if (var71 > var68) { // L: 4444
								var68 = var71;
							}

							int var72 = 0; // L: 4445
							int var73;
							int var74;
							if (var16 != null) { // L: 4446
								var72 = var66 + var16.field3582 + 15; // L: 4447
								var73 = var72 - var44.maxAscent; // L: 4448
								var74 = var72 + var44.maxDescent; // L: 4449
								if (var73 < var67) { // L: 4450
									;
								}

								if (var74 > var68) { // L: 4451
									;
								}
							}

							var73 = 255; // L: 4453
							if (var96.field3579 >= 0) { // L: 4454
								var73 = (var62 << 8) / (var96.field3581 - var96.field3579);
							}

							if (var73 >= 0 && var73 < 255) { // L: 4455
								if (var18 != null) { // L: 4456
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 4457
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 4458
									for (var74 = 0; var74 < var49; ++var74) { // L: 4459
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 4460
									}
								}

								if (var21 != null) { // L: 4463
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var80.drawAlpha(var45, var55 + var65, var69, var96.textColor, 0, var73); // L: 4464
								if (var16 != null) { // L: 4465
									if (var30 != null) { // L: 4466
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 4467
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 4468
										for (var74 = 0; var74 < var50; ++var74) { // L: 4469
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 4470
										}
									}

									if (var33 != null) { // L: 4473
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var16.textColor, 0, var73); // L: 4474
								}
							} else {
								if (var18 != null) { // L: 4478
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 4479
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 4480
									for (var74 = 0; var74 < var49; ++var74) { // L: 4481
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66); // L: 4482
									}
								}

								if (var21 != null) { // L: 4485
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var80.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0); // L: 4486
								if (var16 != null) { // L: 4487
									if (var30 != null) { // L: 4488
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 4489
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 4490
										for (var74 = 0; var74 < var50; ++var74) { // L: 4491
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66); // L: 4492
										}
									}

									if (var33 != null) { // L: 4495
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 4496
								}
							}
						}
					}
				}
			}

		}
	} // L: 4501
}
