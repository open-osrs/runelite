import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fj")
public class class168 {
	@ObfuscatedName("i")
	public short[] field1791;
	@ObfuscatedName("f")
	public short[] field1790;

	class168(int var1) {
		ItemComposition var2 = class19.ItemDefinition_get(var1); // L: 12
		if (var2.method3722()) { // L: 13
			this.field1791 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1791, 0, this.field1791.length); // L: 15
		}

		if (var2.method3708()) { // L: 17
			this.field1790 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1790, 0, this.field1790.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "-32"
	)
	static int method3353(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 478
			Interpreter.Interpreter_intStackSize -= 3; // L: 479
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 480
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 481
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 482
			if (var4 == 0) { // L: 483
				throw new RuntimeException(); // L: 484
			} else {
				Widget var6 = class127.getWidget(var9); // L: 486
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
						WorldMapID.scriptDotWidget = var12;
					} else {
						Interpreter.scriptActiveWidget = var12; // L: 501
					}

					class346.invalidateWidget(var6); // L: 502
					return 1; // L: 503
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 505
				var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 506
				Widget var10 = class127.getWidget(var3.id); // L: 507
				var10.children[var3.childIndex] = null; // L: 508
				class346.invalidateWidget(var10); // L: 509
				return 1; // L: 510
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 512
				var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 513
				var3.children = null; // L: 514
				class346.invalidateWidget(var3); // L: 515
				return 1; // L: 516
			} else if (var0 == 103) { // L: 518
				Interpreter.Interpreter_intStackSize -= 3; // L: 519
				return 1; // L: 520
			} else if (var0 == 104) { // L: 522
				--Interpreter.Interpreter_intStackSize; // L: 523
				return 1; // L: 524
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 526
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 539
					var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 540
					if (var3 != null) { // L: 541
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 542
						if (var2) { // L: 543
							WorldMapID.scriptDotWidget = var3;
						} else {
							Interpreter.scriptActiveWidget = var3; // L: 544
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 546
					}

					return 1; // L: 547
				} else if (var0 == 202) { // L: 549
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] = 0; // L: 550
					return 1; // L: 551
				} else if (var0 == 203) { // L: 553
					Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize + 1] = 0; // L: 554
					return 1; // L: 555
				} else {
					return 2; // L: 557
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 527
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 528
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 529
				Widget var5 = ItemComposition.getWidgetChild(var9, var4); // L: 530
				if (var5 != null && var4 != -1) { // L: 531
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 532
					if (var2) { // L: 533
						WorldMapID.scriptDotWidget = var5;
					} else {
						Interpreter.scriptActiveWidget = var5; // L: 534
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 536
				}

				return 1; // L: 537
			}
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-127"
	)
	static boolean method3351() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 11179
	}
}
