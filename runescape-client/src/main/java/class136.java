import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ei")
public class class136 extends class144 {
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -1282904603
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1060413805
	)
	int field1581;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1581 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;S)V",
		garbageValue = "3239"
	)
	void vmethod3096(Buffer var1) {
		this.field1581 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ley;B)V",
		garbageValue = "26"
	)
	void vmethod3093(ClanChannel var1) {
		var1.removeMember(this.field1581); // L: 96
	} // L: 97

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-2073039041"
	)
	static int method2896(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 1248
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1249
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var3)); // L: 1250
			return 1; // L: 1251
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1253
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1260
				if (var3.dataText == null) { // L: 1261
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1262
				}

				return 1; // L: 1263
			} else {
				return 2; // L: 1265
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1254
			--var4; // L: 1255
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1256
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1257
			} else {
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1258
		}
	}
}
