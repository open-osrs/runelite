import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -931159053
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 409105765
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("s")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("e")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "877883177"
	)
	public static void method1075() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 43
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 44
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 45
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 46
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 47
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 48
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 49
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 51
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 52
		}
	} // L: 54

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbl;",
		garbageValue = "431757029"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 76
		Buffer var2 = new Buffer(var0); // L: 77
		var2.offset = var2.array.length - 2; // L: 78
		int var3 = var2.readUnsignedShort(); // L: 79
		int var4 = var2.array.length - 2 - var3 - 12; // L: 80
		var2.offset = var4; // L: 81
		int var5 = var2.readInt(); // L: 82
		var1.localIntCount = var2.readUnsignedShort(); // L: 83
		var1.localStringCount = var2.readUnsignedShort(); // L: 84
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 85
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 86
		int var6 = var2.readUnsignedByte(); // L: 87
		int var7;
		int var8;
		if (var6 > 0) { // L: 88
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 89

			for (var7 = 0; var7 < var6; ++var7) { // L: 90
				var8 = var2.readUnsignedShort(); // L: 91
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? GrandExchangeOfferNameComparator.method5702(var8) : 1); // L: 92
				var1.switches[var7] = var9; // L: 93

				while (var8-- > 0) { // L: 94
					int var10 = var2.readInt(); // L: 95
					int var11 = var2.readInt(); // L: 96
					var9.put(new IntegerNode(var11), (long)var10); // L: 97
				}
			}
		}

		var2.offset = 0; // L: 101
		var1.field960 = var2.readStringCp1252NullTerminatedOrNull(); // L: 102
		var1.opcodes = new int[var5]; // L: 103
		var1.intOperands = new int[var5]; // L: 104
		var1.stringOperands = new String[var5]; // L: 105

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 106 107 112
			var8 = var2.readUnsignedShort(); // L: 108
			if (var8 == 3) { // L: 109
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 110
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 111
			}
		}

		return var1; // L: 114
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "1"
	)
	static int method1077(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1084
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1085
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1086
			return 1; // L: 1087
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1089
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1090
			return 1; // L: 1091
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1093
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1094
			return 1; // L: 1095
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1097
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1098
			return 1; // L: 1099
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1101
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1102
			return 1; // L: 1103
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1105
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1106
			return 1; // L: 1107
		} else {
			return 2; // L: 1109
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-679807359"
	)
	static void method1076(int var0) {
		GrandExchangeEvents.tempMenuAction = new MenuAction(); // L: 11421
		GrandExchangeEvents.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11422
		GrandExchangeEvents.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11423
		GrandExchangeEvents.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11424
		GrandExchangeEvents.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11425
		GrandExchangeEvents.tempMenuAction.action = Client.menuActions[var0]; // L: 11426
	} // L: 11427
}
