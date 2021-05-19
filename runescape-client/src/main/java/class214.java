import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hi")
public abstract class class214 implements class216 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 923397577
	)
	protected int field2549;

	@ObfuscatedSignature(
		descriptor = "(Ljr;Lkr;I)V"
	)
	protected class214(StudioGame var1, Language var2, int var3) {
		this.field2549 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1473655530"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 159
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1877487505"
	)
	static int method4239(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1172
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1173
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.itemId; // L: 1174
			return 1; // L: 1175
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1177
			if (var3.itemId != -1) { // L: 1178
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1179
			}

			return 1; // L: 1180
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1182
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1183
			return 1; // L: 1184
		} else {
			return 2; // L: 1186
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1848569122"
	)
	static int method4241(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1350
			var5 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1351
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.itemId; // L: 1352
			return 1; // L: 1353
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1355
			var5 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1356
			if (var5.itemId != -1) { // L: 1357
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1358
			}

			return 1; // L: 1359
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1361
			int var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1362
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1363
			if (var4 != null) { // L: 1364
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1365
			}

			return 1; // L: 1366
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1368
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1369
			return 1; // L: 1370
		} else {
			return 2; // L: 1372
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "1304902076"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10977
			if (var0 != null && World.method1731(var0) != null) { // L: 10978
				Client.clickedWidget = var0; // L: 10979
				Client.clickedWidgetParent = World.method1731(var0); // L: 10980
				Client.widgetClickX = var1; // L: 10981
				Client.widgetClickY = var2; // L: 10982
				class288.widgetDragDuration = 0; // L: 10983
				Client.isDraggingWidget = false; // L: 10984
				int var3 = AttackOption.method2285(); // L: 10985
				if (var3 != -1) { // L: 10986
					GrandExchangeOfferAgeComparator.method4989(var3);
				}

			}
		}
	} // L: 10987
}
