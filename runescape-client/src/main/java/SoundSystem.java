import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -2095633831
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lal;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lqr;",
		garbageValue = "19"
	)
	static SpritePixels method774(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1284020216"
	)
	static int method777(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 478
			class12.Interpreter_intStackSize -= 3; // L: 479
			var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 480
			var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 481
			int var11 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 482
			if (var4 == 0) { // L: 483
				throw new RuntimeException(); // L: 484
			} else {
				Widget var6 = class92.getWidget(var9); // L: 486
				if (var6.children == null) { // L: 487
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 488
					Widget[] var7 = new Widget[var11 + 1]; // L: 489

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 490
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 491
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 493
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 494
					var12.type = var4; // L: 495
					var12.parentId = var12.id = var6.id; // L: 496
					var12.childIndex = var11; // L: 497
					var12.isIf3 = true; // L: 498
					var6.children[var11] = var12; // L: 499
					if (var2) { // L: 500
						Interpreter.scriptDotWidget = var12;
					} else {
						KeyHandler.scriptActiveWidget = var12; // L: 501
					}

					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var6); // L: 502
					return 1; // L: 503
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 505
				var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 506
				Widget var10 = class92.getWidget(var3.id); // L: 507
				var10.children[var3.childIndex] = null; // L: 508
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10); // L: 509
				return 1; // L: 510
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 512
				var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 513
				var3.children = null; // L: 514
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 515
				return 1; // L: 516
			} else if (var0 == 103) { // L: 518
				class12.Interpreter_intStackSize -= 3; // L: 519
				return 1; // L: 520
			} else if (var0 == 104) { // L: 522
				--class12.Interpreter_intStackSize; // L: 523
				return 1; // L: 524
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 526
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 539
					var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 540
					if (var3 != null) { // L: 541
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 542
						if (var2) { // L: 543
							Interpreter.scriptDotWidget = var3;
						} else {
							KeyHandler.scriptActiveWidget = var3; // L: 544
						}
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 546
					}

					return 1; // L: 547
				} else if (var0 == 202) { // L: 549
					Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] = 0; // L: 550
					return 1; // L: 551
				} else if (var0 == 203) { // L: 553
					Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize + 1] = 0; // L: 554
					return 1; // L: 555
				} else {
					return 2; // L: 557
				}
			} else {
				class12.Interpreter_intStackSize -= 2; // L: 527
				var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 528
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 529
				Widget var5 = ApproximateRouteStrategy.getWidgetChild(var9, var4); // L: 530
				if (var5 != null && var4 != -1) { // L: 531
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 532
					if (var2) { // L: 533
						Interpreter.scriptDotWidget = var5;
					} else {
						KeyHandler.scriptActiveWidget = var5; // L: 534
					}
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 536
				}

				return 1; // L: 537
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-583915205"
	)
	public static void method780() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 177
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 178
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 179
	} // L: 180

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static boolean method779() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5008
	}
}
