import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ix")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3149(0, 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3143(1, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3167(2, 0),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3145(3, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3146(9, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3147(4, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3148(5, 1),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3164(6, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3150(7, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3151(8, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3142(12, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3156(13, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3163(14, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3155(15, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3166(16, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3157(17, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3158(18, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3159(19, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3152(20, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3161(21, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3162(10, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3144(11, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3154(22, 3);

	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2083476425
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 38
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "29"
	)
	static int method4833(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 472
			class44.Interpreter_intStackSize -= 3; // L: 473
			var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 474
			var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 475
			int var11 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 476
			if (var4 == 0) { // L: 477
				throw new RuntimeException(); // L: 478
			} else {
				Widget var6 = Frames.getWidget(var9); // L: 480
				if (var6.children == null) { // L: 481
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 482
					Widget[] var7 = new Widget[var11 + 1]; // L: 483

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 484
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 485
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 487
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 488
					var12.type = var4; // L: 489
					var12.parentId = var12.id = var6.id; // L: 490
					var12.childIndex = var11; // L: 491
					var12.isIf3 = true; // L: 492
					var6.children[var11] = var12; // L: 493
					if (var2) { // L: 494
						class13.scriptDotWidget = var12;
					} else {
						Interpreter.scriptActiveWidget = var12; // L: 495
					}

					WorldMapCacheName.invalidateWidget(var6); // L: 496
					return 1; // L: 497
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 499
				var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 500
				Widget var10 = Frames.getWidget(var3.id); // L: 501
				var10.children[var3.childIndex] = null; // L: 502
				WorldMapCacheName.invalidateWidget(var10); // L: 503
				return 1; // L: 504
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 506
				var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 507
				var3.children = null; // L: 508
				WorldMapCacheName.invalidateWidget(var3); // L: 509
				return 1; // L: 510
			} else if (var0 == 103) { // L: 512
				class44.Interpreter_intStackSize -= 3; // L: 513
				return 1; // L: 514
			} else if (var0 == 104) { // L: 516
				--class44.Interpreter_intStackSize; // L: 517
				return 1; // L: 518
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 520
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 533
					var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 534
					if (var3 != null) { // L: 535
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 536
						if (var2) { // L: 537
							class13.scriptDotWidget = var3;
						} else {
							Interpreter.scriptActiveWidget = var3; // L: 538
						}
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 540
					}

					return 1; // L: 541
				} else if (var0 == 202) { // L: 543
					Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] = 0; // L: 544
					return 1; // L: 545
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize + 1] = 0;
					return 1; // L: 549
				} else {
					return 2; // L: 551
				}
			} else {
				class44.Interpreter_intStackSize -= 2; // L: 521
				var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 522
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 523
				Widget var5 = ModeWhere.getWidgetChild(var9, var4); // L: 524
				if (var5 != null && var4 != -1) { // L: 525
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 526
					if (var2) { // L: 527
						class13.scriptDotWidget = var5;
					} else {
						Interpreter.scriptActiveWidget = var5; // L: 528
					}
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 530
				}

				return 1; // L: 531
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-59563077"
	)
	public static void method4834(boolean var0) {
		if (var0 != ItemContainer.ItemDefinition_inMembersWorld) { // L: 546
			SceneTilePaint.method4259(); // L: 547
			ItemContainer.ItemDefinition_inMembersWorld = var0; // L: 548
		}

	} // L: 550
}
