import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("clanChat")
	static ClanChat clanChat;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -860783313
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1429223805
	)
	@Export("group")
	int group;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -196451933
	)
	@Export("type")
	int type;
	@ObfuscatedName("u")
	boolean field1136;

	InterfaceParent() {
		this.field1136 = false; // L: 8
	} // L: 10

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "2109711781"
	)
	static int method2095(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1006
			var0 -= 1000; // L: 1007
			var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1008
		} else {
			var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1010
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1011
		int[] var5 = null; // L: 1012
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1013
			int var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1014
			if (var6 > 0) { // L: 1015
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]) { // L: 1016 1017
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1019
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1021

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1022
			if (var4.charAt(var7 - 1) == 's') { // L: 1023
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1024
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1026
		if (var7 != -1) { // L: 1027
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1028
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1029
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1030
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1031
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1032
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1033
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1034
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1035
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1036
			var3.onVarTransmit = var8; // L: 1037
			var3.varTransmitTriggers = var5; // L: 1038
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1040
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1041
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1042
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1043
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1044
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1045
			var3.onInvTransmit = var8; // L: 1046
			var3.invTransmitTriggers = var5; // L: 1047
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1049
			var3.onStatTransmit = var8; // L: 1050
			var3.statTransmitTriggers = var5; // L: 1051
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1053
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1054
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1055
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1056
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1057
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1058
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1059
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1060
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1061
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1062
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1063
			var3.field2743 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1064
			var3.onResize = var8;
		} else if (var0 == 1428) { // L: 1065
			var3.field2736 = var8;
		} else {
			if (var0 != 1429) { // L: 1066
				return 2; // L: 1067
			}

			var3.field2655 = var8;
		}

		var3.hasListener = true; // L: 1068
		return 1; // L: 1069
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1182828534"
	)
	static void method2096(int var0) {
		Login.loginIndex = 12; // L: 1378
		Login.field993 = var0; // L: 1379
	} // L: 1380
}
