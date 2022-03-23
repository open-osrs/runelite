import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ki")
public class class305 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-2007325270"
	)
	static int method5787(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 561
		Widget var4;
		if (var0 >= 2000) { // L: 563
			var0 -= 1000; // L: 564
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 565
			var4 = HorizontalAlignment.getWidget(var3); // L: 566
		} else {
			var4 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 568
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 569
			class295.Interpreter_intStackSize -= 4; // L: 570
			var4.rawX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 571
			var4.rawY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 572
			var4.xAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 573
			var4.yAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 574
			class290.invalidateWidget(var4); // L: 575
			UserComparator10.client.alignWidget(var4); // L: 576
			if (var3 != -1 && var4.type == 0) { // L: 577
				GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 578
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 580
			class295.Interpreter_intStackSize -= 4; // L: 581
			var4.rawWidth = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 582
			var4.rawHeight = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 583
			var4.widthAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 584
			var4.heightAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 585
			class290.invalidateWidget(var4); // L: 586
			UserComparator10.client.alignWidget(var4); // L: 587
			if (var3 != -1 && var4.type == 0) { // L: 588
				GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 589
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 591
			boolean var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 592
			if (var5 != var4.isHidden) { // L: 593
				var4.isHidden = var5; // L: 594
				class290.invalidateWidget(var4); // L: 595
			}

			return 1; // L: 597
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 599
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 600
			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 603
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 604
			return 1; // L: 605
		} else {
			return 2; // L: 607
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-177083421"
	)
	static int method5786(int var0, Script var1, boolean var2) {
		Widget var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1449
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1450
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var3)); // L: 1451
			return 1; // L: 1452
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1454
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1461
				if (var3.dataText == null) { // L: 1462
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1463
				}

				return 1; // L: 1464
			} else {
				return 2; // L: 1466
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1455
			--var4; // L: 1456
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1457
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1458
			} else {
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1459
		}
	}
}
