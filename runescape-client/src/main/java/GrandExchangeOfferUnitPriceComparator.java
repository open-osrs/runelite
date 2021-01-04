import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSpritePixels;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(La;La;I)I",
		garbageValue = "1020581698"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhe;II)V",
		garbageValue = "1825626795"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2649 == null) { // L: 936
			throw new RuntimeException(); // L: 937
		} else {
			if (var0.field2684 == null) { // L: 939
				var0.field2684 = new int[var0.field2649.length]; // L: 940
			}

			var0.field2684[var1] = Integer.MAX_VALUE; // L: 942
		}
	} // L: 943

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-613147121"
	)
	static int method200(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PlayerComposition.field2561 : VarcInt.scriptActiveWidget; // L: 1041
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1042
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1043
			return 1; // L: 1044
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1046
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1047
			return 1; // L: 1048
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1050
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1051
			return 1; // L: 1052
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1054
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1055
			return 1; // L: 1056
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1058
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1059
			return 1; // L: 1060
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1062
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1063
			return 1; // L: 1064
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1066
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1067
			return 1; // L: 1068
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1070
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1071
			return 1; // L: 1072
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1074
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1075
			return 1; // L: 1076
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) { // L: 1078
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1079
			return 1; // L: 1080
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) { // L: 1082
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1083
			return 1; // L: 1084
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1086
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.color; // L: 1087
			return 1; // L: 1088
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1090
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.color2; // L: 1091
			return 1; // L: 1092
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) { // L: 1094
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1095
			return 1; // L: 1096
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1098
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1099
			return 1; // L: 1100
		} else {
			return 2; // L: 1102
		}
	}
}
