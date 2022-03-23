import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oa")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("HitSplatDefinition_cached")
	static class426 HitSplatDefinition_cached;
	@ObfuscatedName("d")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public static void method7509() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "35948304"
	)
	static int method7511(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 478
			class295.Interpreter_intStackSize -= 3; // L: 479
			var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 480
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 481
			int var11 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 482
			if (var4 == 0) { // L: 483
				throw new RuntimeException(); // L: 484
			} else {
				Widget var6 = HorizontalAlignment.getWidget(var9); // L: 486
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
						class432.scriptDotWidget = var12;
					} else {
						class341.scriptActiveWidget = var12; // L: 501
					}

					class290.invalidateWidget(var6); // L: 502
					return 1; // L: 503
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 505
				var3 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 506
				Widget var10 = HorizontalAlignment.getWidget(var3.id); // L: 507
				var10.children[var3.childIndex] = null; // L: 508
				class290.invalidateWidget(var10); // L: 509
				return 1; // L: 510
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 512
				var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 513
				var3.children = null; // L: 514
				class290.invalidateWidget(var3); // L: 515
				return 1; // L: 516
			} else if (var0 == 103) { // L: 518
				class295.Interpreter_intStackSize -= 3; // L: 519
				return 1; // L: 520
			} else if (var0 == 104) { // L: 522
				--class295.Interpreter_intStackSize; // L: 523
				return 1; // L: 524
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 526
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 539
					var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 540
					if (var3 != null) { // L: 541
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 542
						if (var2) { // L: 543
							class432.scriptDotWidget = var3;
						} else {
							class341.scriptActiveWidget = var3; // L: 544
						}
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 546
					}

					return 1; // L: 547
				} else if (var0 == 202) { // L: 549
					Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] = 0; // L: 550
					return 1; // L: 551
				} else if (var0 == 203) { // L: 553
					Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize + 1] = 0; // L: 554
					return 1; // L: 555
				} else {
					return 2; // L: 557
				}
			} else {
				class295.Interpreter_intStackSize -= 2; // L: 527
				var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 528
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 529
				Widget var5 = class143.getWidgetChild(var9, var4); // L: 530
				if (var5 != null && var4 != -1) { // L: 531
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 532
					if (var2) { // L: 533
						class432.scriptDotWidget = var5;
					} else {
						class341.scriptActiveWidget = var5; // L: 534
					}
				} else {
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 536
				}

				return 1; // L: 537
			}
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1923637215"
	)
	static void method7510(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 11870
			Client.randomDatData = new byte[24];
		}

		class350.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 11871
	} // L: 11872
}
