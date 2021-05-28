import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ed")
public class class135 {
	@ObfuscatedName("f")
	public short[] field1537;
	@ObfuscatedName("y")
	public short[] field1538;

	public class135(int var1) {
		ItemComposition var2 = class260.ItemDefinition_get(var1); // L: 12
		if (var2.method3024()) { // L: 13
			this.field1537 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1537, 0, this.field1537.length); // L: 15
		}

		if (var2.method3025()) { // L: 17
			this.field1538 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1538, 0, this.field1538.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "660073374"
	)
	public static void method2601() {
		KitDefinition.KitDefinition_cached.clear(); // L: 136
	} // L: 137

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-54"
	)
	public static final void method2599(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 95
		ViewportMouse.ViewportMouse_y = var1; // L: 96
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 97
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 98
		ViewportMouse.ViewportMouse_false0 = false; // L: 99
	} // L: 100

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1611533259"
	)
	static int method2600(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1007
			var0 -= 1000; // L: 1008
			var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1009
		} else {
			var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1011
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1012
		int[] var5 = null; // L: 1013
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1014
			int var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1015
			if (var6 > 0) { // L: 1016
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]) { // L: 1017 1018
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1020
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1022

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1023
			if (var4.charAt(var7 - 1) == 's') { // L: 1024
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1025
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1027
		if (var7 != -1) { // L: 1028
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1029
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1030
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1031
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1032
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1033
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1034
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1035
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1036
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1037
			var3.onVarTransmit = var8; // L: 1038
			var3.varTransmitTriggers = var5; // L: 1039
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1041
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1042
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1043
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1044
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1045
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1046
			var3.onInvTransmit = var8; // L: 1047
			var3.invTransmitTriggers = var5; // L: 1048
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1050
			var3.onStatTransmit = var8; // L: 1051
			var3.statTransmitTriggers = var5; // L: 1052
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1054
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1055
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1056
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1057
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1058
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1059
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1060
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1061
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1062
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1063
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1064
			var3.field3077 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1065
			var3.onResize = var8;
		} else if (var0 == 1428) { // L: 1066
			var3.field3043 = var8;
		} else {
			if (var0 != 1429) { // L: 1067
				return 2; // L: 1068
			}

			var3.field3071 = var8;
		}

		var3.hasListener = true; // L: 1069
		return 1; // L: 1070
	}
}
