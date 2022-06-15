import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dk")
public class class125 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -901358283
	)
	int field1557;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 963189529
	)
	int field1553;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1782830973
	)
	int field1554;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1564673701
	)
	int field1555;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class125(class131 var1) {
		this.this$0 = var1;
		this.field1557 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1557 = var1.readUnsignedShort(); // L: 166
		this.field1553 = var1.readInt(); // L: 167
		this.field1554 = var1.readUnsignedByte(); // L: 168
		this.field1555 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2964(this.field1557, this.field1553, this.field1554, this.field1555); // L: 173
	} // L: 174

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2000471685"
	)
	static String method2829() {
		return class19.clientPreferences.method2247() ? NetCache.method5952(Login.Login_username) : Login.Login_username; // L: 272
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "718423512"
	)
	static void method2830() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-61"
	)
	static int method2821(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 1111
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1112
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.x; // L: 1113
			return 1; // L: 1114
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1116
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.y; // L: 1117
			return 1; // L: 1118
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1120
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.width; // L: 1121
			return 1; // L: 1122
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1124
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.height; // L: 1125
			return 1; // L: 1126
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1128
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1129
			return 1; // L: 1130
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1132
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.parentId; // L: 1133
			return 1; // L: 1134
		} else {
			return 2; // L: 1136
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	static void method2824() {
		Client.menuOptionsCount = 0; // L: 8423
		Client.isMenuOpen = false; // L: 8424
	} // L: 8425
}
