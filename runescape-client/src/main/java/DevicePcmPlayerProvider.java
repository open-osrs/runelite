import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements PlayerProvider {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "65542938"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Liv;",
		garbageValue = "-159166525"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 197
		int var2 = var0 & 65535; // L: 198
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) { // L: 199
			boolean var3 = UserComparator8.loadInterface(var1); // L: 200
			if (!var3) { // L: 201
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2]; // L: 203
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1197541083"
	)
	static int method454(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 555
		Widget var4;
		if (var0 >= 2000) { // L: 557
			var0 -= 1000; // L: 558
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 559
			var4 = getWidget(var3); // L: 560
		} else {
			var4 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 562
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 563
			WorldMapCacheName.Interpreter_intStackSize -= 4; // L: 564
			var4.rawX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 565
			var4.rawY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 566
			var4.xAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 567
			var4.yAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3]; // L: 568
			VerticalAlignment.invalidateWidget(var4); // L: 569
			class303.client.alignWidget(var4); // L: 570
			if (var3 != -1 && var4.type == 0) { // L: 571
				ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 572
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 574
			WorldMapCacheName.Interpreter_intStackSize -= 4; // L: 575
			var4.rawWidth = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 576
			var4.rawHeight = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 577
			var4.widthAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 578
			var4.heightAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3]; // L: 579
			VerticalAlignment.invalidateWidget(var4); // L: 580
			class303.client.alignWidget(var4); // L: 581
			if (var3 != -1 && var4.type == 0) { // L: 582
				ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 583
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 585
			boolean var5 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 586
			if (var5 != var4.isHidden) { // L: 587
				var4.isHidden = var5; // L: 588
				VerticalAlignment.invalidateWidget(var4); // L: 589
			}

			return 1; // L: 591
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 593
			var4.noClickThrough = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 594
			return 1; // L: 595
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 597
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 598
			return 1; // L: 599
		} else {
			return 2; // L: 601
		}
	}
}
