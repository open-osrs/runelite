import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
public enum class193 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	field2192((byte)-1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	field2195((byte)0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	field2193((byte)1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	field2191((byte)2);

	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = 1576162761
	)
	static int field2197;
	@ObfuscatedName("l")
	public byte field2194;

	class193(byte var3) {
		this.field2194 = var3; // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2194; // L: 23
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "247092715"
	)
	public static void method3880(String[] var0, short[] var1) {
		ServerPacket.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1325671888"
	)
	static int method3879(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1031
			var0 -= 1000; // L: 1032
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1033
		} else {
			var3 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 1035
		}

		String var4 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1036
		int[] var5 = null; // L: 1037
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1038
			int var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1039
			if (var6 > 0) { // L: 1040
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]) { // L: 1041 1042
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1044
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1046

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1047
			if (var4.charAt(var7 - 1) == 's') { // L: 1048
				var8[var7] = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1049
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1051
		if (var7 != -1) { // L: 1052
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1053
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1054
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1055
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1056
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1057
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1058
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1059
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1060
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1061
			var3.onVarTransmit = var8; // L: 1062
			var3.varTransmitTriggers = var5; // L: 1063
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1065
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1066
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1067
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1068
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1069
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1070
			var3.onInvTransmit = var8; // L: 1071
			var3.invTransmitTriggers = var5; // L: 1072
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1074
			var3.onStatTransmit = var8; // L: 1075
			var3.statTransmitTriggers = var5; // L: 1076
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8; // L: 1078
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1079
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1080
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1081
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1082
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1083
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1084
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1085
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1086
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1087
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1088
			var3.field3468 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1089
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1090
			var3.field3395 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1091
			var3.field3461 = var8;
		} else if (var0 == 1430) { // L: 1092
			var3.field3457 = var8;
		} else if (var0 == 1431) { // L: 1093
			var3.field3458 = var8;
		} else {
			if (var0 != 1434) { // L: 1094
				return 2; // L: 1095
			}

			var3.field3408 = var8;
		}

		var3.hasListener = true; // L: 1096
		return 1; // L: 1097
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-251675528"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class268.scrollBarSprites[0].drawAt(var0, var1); // L: 10252
		class268.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10253
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field619); // L: 10254
		int var5 = var3 * (var3 - 32) / var4; // L: 10255
		if (var5 < 8) { // L: 10256
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10257
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field684); // L: 10258
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field514); // L: 10259
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field514); // L: 10260
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field514); // L: 10261
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field514); // L: 10262
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field554); // L: 10263
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field554); // L: 10264
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field554); // L: 10265
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field554); // L: 10266
	} // L: 10267
}
