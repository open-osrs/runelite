import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("v")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("c")
	@Export("lock")
	Object lock;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1040654815
	)
	@Export("index")
	int index;
	@ObfuscatedName("f")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("b")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("n")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	}

	public void run() {
		for (; this.isRunning; class93.method2384(50L)) { // L: 26
			synchronized(this.lock) { // L: 18
				if (this.index < 500) { // L: 19
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 20
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 21
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 22
					++this.index; // L: 23
				}
			}
		}

	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1730658434"
	)
	static int method2093(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2109167375"
	)
	public static void method2098() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 82
	} // L: 83

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1423538345"
	)
	static int method2094(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4547
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4551
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4555
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4559
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4563
							if (var0 != 7031 && var0 != 7032) { // L: 4567
								if (var0 == 7033) { // L: 4572
									--class122.Interpreter_stringStackSize; // L: 4573
									return 1; // L: 4574
								} else if (var0 != 7036 && var0 != 7037) { // L: 4576
									if (var0 == 7038) { // L: 4580
										--Interpreter.Interpreter_intStackSize; // L: 4581
										return 1; // L: 4582
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4584
										return 2; // L: 4588
									} else {
										--Interpreter.Interpreter_intStackSize; // L: 4585
										return 1; // L: 4586
									}
								} else {
									Interpreter.Interpreter_intStackSize -= 2; // L: 4577
									return 1; // L: 4578
								}
							} else {
								--class122.Interpreter_stringStackSize; // L: 4568
								--Interpreter.Interpreter_intStackSize; // L: 4569
								return 1; // L: 4570
							}
						} else {
							--Interpreter.Interpreter_intStackSize; // L: 4564
							return 1; // L: 4565
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 4560
						return 1; // L: 4561
					}
				} else {
					Interpreter.Interpreter_intStackSize -= 2; // L: 4556
					return 1; // L: 4557
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 3; // L: 4552
				return 1; // L: 4553
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 5; // L: 4548
			return 1; // L: 4549
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1147144850"
	)
	static final void method2096(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 5289
		boolean var4 = false; // L: 5290
		int var5 = -1; // L: 5291
		int var6 = -1; // L: 5292
		int var7 = Players.Players_count; // L: 5293
		int[] var8 = Players.Players_indices; // L: 5294

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5295
			Object var20;
			if (var9 < var7) { // L: 5297
				var20 = Client.players[var8[var9]]; // L: 5298
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5299
					var4 = true; // L: 5300
					var5 = var9; // L: 5301
					continue;
				}

				if (var20 == GrandExchangeEvents.localPlayer) { // L: 5304
					var6 = var9; // L: 5305
					continue; // L: 5306
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5309
			}

			ScriptFrame.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 5310
		}

		if (Client.renderSelf && var6 != -1) { // L: 5312
			ScriptFrame.drawActor2d(GrandExchangeEvents.localPlayer, var6, var0, var1, var2, var3); // L: 5313
		}

		if (var4) { // L: 5315
			ScriptFrame.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5316
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 5318
			int var10 = Client.overheadTextXs[var9]; // L: 5319
			int var11 = Client.overheadTextYs[var9]; // L: 5320
			int var12 = Client.overheadTextXOffsets[var9]; // L: 5321
			int var13 = Client.overheadTextAscents[var9]; // L: 5322
			boolean var14 = true; // L: 5323

			while (var14) {
				var14 = false; // L: 5325

				for (int var19 = 0; var19 < var9; ++var19) { // L: 5326
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var10 + var12 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 5327 5328
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 5329
						var14 = true; // L: 5330
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 5335
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 5336
			String var15 = Client.overheadText[var9]; // L: 5337
			if (Client.chatEffects == 0) { // L: 5338
				int var16 = 16776960; // L: 5339
				if (Client.overheadTextColors[var9] < 6) { // L: 5340
					var16 = Client.field725[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 5341
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 5342
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 5343
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 5344
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5345
					if (var17 < 50) { // L: 5346
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5347
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5348
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 5350
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5351
					if (var17 < 50) { // L: 5352
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5353
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5354
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 5356
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5357
					if (var17 < 50) { // L: 5358
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5359
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5360
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 5362
					RouteStrategy.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 5363
					RouteStrategy.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 5364
					RouteStrategy.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 5365
					RouteStrategy.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 5366
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (RouteStrategy.fontBold12.stringWidth(var15) + 100) / 150; // L: 5367
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5368
					RouteStrategy.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 5369
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5370
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 5372
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5373
					int var18 = 0; // L: 5374
					if (var17 < 25) { // L: 5375
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5376
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - RouteStrategy.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5377
					RouteStrategy.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 5378
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5379
				}
			} else {
				RouteStrategy.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5383
			}
		}

	} // L: 5386

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "551926222"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class155.loadInterface(var0)) { // L: 11718
			class155.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1); // L: 11719
		}
	} // L: 11720
}
