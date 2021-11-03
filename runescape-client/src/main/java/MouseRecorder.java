import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ci")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("t")
	static int[] field1039;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("i")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("w")
	@Export("lock")
	Object lock;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1216994745
	)
	@Export("index")
	int index;
	@ObfuscatedName("a")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("o")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("g")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; FloorUnderlayDefinition.method3190(50L)) { // L: 17 26
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;B)V",
		garbageValue = "-12"
	)
	public static void method2093(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 15
	} // L: 16

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "355383775"
	)
	static int method2089(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1365
			var5 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 1366
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.itemId; // L: 1367
			return 1; // L: 1368
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1370
			var5 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 1371
			if (var5.itemId != -1) { // L: 1372
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1373
			}

			return 1; // L: 1374
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1376
			int var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1377
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1378
			if (var4 != null) { // L: 1379
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1380
			}

			return 1; // L: 1381
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1383
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1384
			return 1; // L: 1385
		} else {
			return 2; // L: 1387
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "([Ljf;Ljf;ZB)V",
		garbageValue = "0"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1040080419 * -992722549 : var1.width * -1492995549 * 1571065227; // L: 10229
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -1297742855 * -1412739511 : var1.height * 380936511 * 1623576255; // L: 10230
		WorldMapLabelSize.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10231
		if (var1.children != null) { // L: 10232
			WorldMapLabelSize.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10233
		if (var5 != null) {
			SecureRandomCallable.method2051(var5.group, var3, var4, var2); // L: 10234
		}

		if (var1.contentType == 1337) { // L: 10235
		}

	} // L: 10236
}
