import java.applet.Applet;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ku")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;I)I",
		garbageValue = "2143976852"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	public static void method5440(Applet var0, String var1) {
		class29.field157 = var0; // L: 22
		if (var1 != null) { // L: 23
			class29.field158 = var1;
		}

	} // L: 24

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-879022560"
	)
	static int method5439(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 1267
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1268
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.x; // L: 1269
			return 1; // L: 1270
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1272
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.y; // L: 1273
			return 1; // L: 1274
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1276
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.width; // L: 1277
			return 1; // L: 1278
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1280
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.height; // L: 1281
			return 1; // L: 1282
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1284
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1285
			return 1; // L: 1286
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1288
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.parentId; // L: 1289
			return 1; // L: 1290
		} else {
			return 2; // L: 1292
		}
	}
}
