import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kd")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1878402299
	)
	static int field3941;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lld;Lld;I)I",
		garbageValue = "-463570911"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "1171711232"
	)
	static int method5707(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1015
			var0 -= 1000; // L: 1016
			var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1017
		} else {
			var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1019
		}

		String var4 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 1020
		int[] var5 = null; // L: 1021
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1022
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1023
			if (var6 > 0) { // L: 1024
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1025 1026
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1028
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1030

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1031
			if (var4.charAt(var7 - 1) == 's') { // L: 1032
				var8[var7] = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1033
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1035
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
			var3.field3385 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1073
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1074
			var3.field3328 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1075
			var3.field3271 = var8;
		} else if (var0 == 1430) { // L: 1076
			var3.field3374 = var8;
		} else {
			if (var0 != 1431) { // L: 1077
				return 2; // L: 1078
			}

			var3.field3321 = var8;
		}

		var3.hasListener = true; // L: 1079
		return 1; // L: 1080
	}
}
