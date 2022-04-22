import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive20")
	static Archive archive20;

	ApproximateRouteStrategy() {
	} // L: 12726

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILgv;I)Z",
		garbageValue = "773884525"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12729
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BB)Ljava/lang/String;",
		garbageValue = "79"
	)
	public static String method1125(byte[] var0) {
		return WorldMapData_1.method4226(var0, 0, var0.length); // L: 58
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-227036396"
	)
	static int method1124(int var0, Script var1, boolean var2) {
		Widget var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1312
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1313
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1314
			return 1; // L: 1315
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1317
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1318
			return 1; // L: 1319
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1321
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1322
			return 1; // L: 1323
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1325
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1326
			return 1; // L: 1327
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1329
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1330
			return 1; // L: 1331
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1333
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1334
			return 1; // L: 1335
		} else {
			return 2; // L: 1337
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "-54"
	)
	static int method1123(int var0, Script var1, boolean var2) {
		if (var0 == 7400) { // L: 4670
			--Interpreter.Interpreter_intStackSize; // L: 4671
			--class122.Interpreter_stringStackSize; // L: 4672
			return 1; // L: 4673
		} else if (var0 == 7401) { // L: 4675
			--Interpreter.Interpreter_intStackSize; // L: 4676
			--class122.Interpreter_stringStackSize; // L: 4677
			return 1; // L: 4678
		} else if (var0 == 7402) { // L: 4680
			Interpreter.Interpreter_intStackSize -= 2; // L: 4681
			--class122.Interpreter_stringStackSize; // L: 4682
			return 1; // L: 4683
		} else if (var0 == 7403) { // L: 4685
			Interpreter.Interpreter_intStackSize -= 2; // L: 4686
			--class122.Interpreter_stringStackSize; // L: 4687
			return 1; // L: 4688
		} else if (var0 == 7404) { // L: 4690
			--Interpreter.Interpreter_intStackSize; // L: 4691
			--class122.Interpreter_stringStackSize; // L: 4692
			return 1; // L: 4693
		} else if (var0 == 7405) { // L: 4695
			Interpreter.Interpreter_intStackSize -= 2; // L: 4696
			return 1; // L: 4697
		} else if (var0 == 7406) { // L: 4699
			--Interpreter.Interpreter_intStackSize; // L: 4700
			Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 4701
			return 1; // L: 4702
		} else if (var0 == 7407) { // L: 4704
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4705
			return 1; // L: 4706
		} else if (var0 == 7408) { // L: 4708
			Interpreter.Interpreter_intStackSize -= 2; // L: 4709
			--class122.Interpreter_stringStackSize; // L: 4710
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4711
			return 1; // L: 4712
		} else if (var0 == 7409) { // L: 4714
			--Interpreter.Interpreter_intStackSize; // L: 4715
			return 1; // L: 4716
		} else {
			return 2; // L: 4718
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIZI)V",
		garbageValue = "229748808"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10820
		int var5 = var0.height; // L: 10821
		if (var0.widthAlignment == 0) { // L: 10822
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10823
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10824
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10825
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10826
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10827
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10828
			var0.width = var0.field3352 * var0.height / var0.field3353;
		}

		if (var0.heightAlignment == 4) { // L: 10829
			var0.height = var0.field3353 * var0.width / var0.field3352;
		}

		if (var0.contentType == 1337) { // L: 10830
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10831
			ScriptEvent var6 = new ScriptEvent(); // L: 10832
			var6.widget = var0; // L: 10833
			var6.args = var0.onResize; // L: 10834
			Client.scriptEvents.addFirst(var6); // L: 10835
		}

	} // L: 10837
}
