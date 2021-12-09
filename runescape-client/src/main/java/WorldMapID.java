import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static final WorldMapID field2739;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static final WorldMapID field2741;
	@ObfuscatedName("hr")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2061213835
	)
	@Export("value")
	final int value;

	static {
		field2739 = new WorldMapID(0); // L: 4
		field2741 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	static void method4805() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 339
			Login.currentLoginField = 1; // L: 340
		} else {
			Login.currentLoginField = 0; // L: 343
		}

	} // L: 345

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "112852327"
	)
	static int method4804(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1015
			var0 -= 1000; // L: 1016
			var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1017
		} else {
			var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1019
		}

		String var4 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1020
		int[] var5 = null; // L: 1021
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1022
			int var6 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1023
			if (var6 > 0) { // L: 1024
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]) { // L: 1025 1026
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1028
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1030

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1031
			if (var4.charAt(var7 - 1) == 's') { // L: 1032
				var8[var7] = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1033
			}
		}

		var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1035
		if (var7 != -1) { // L: 1036
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1037
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1038
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1039
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1040
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1041
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1042
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1043
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1044
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1045
			var3.onVarTransmit = var8; // L: 1046
			var3.varTransmitTriggers = var5; // L: 1047
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1049
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1050
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1051
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1052
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1053
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1054
			var3.onInvTransmit = var8; // L: 1055
			var3.invTransmitTriggers = var5; // L: 1056
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1058
			var3.onStatTransmit = var8; // L: 1059
			var3.statTransmitTriggers = var5; // L: 1060
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1062
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1063
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1064
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1065
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1066
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1067
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1068
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1069
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1070
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1071
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1072
			var3.field3294 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1073
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1074
			var3.field3217 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1075
			var3.field3340 = var8;
		} else if (var0 == 1430) {
			var3.field3335 = var8; // L: 1076
		} else {
			if (var0 != 1431) { // L: 1077
				return 2; // L: 1078
			}

			var3.field3336 = var8;
		}

		var3.hasListener = true; // L: 1079
		return 1; // L: 1080
	}
}
