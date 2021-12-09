import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class132 extends class142 {
	@ObfuscatedName("o")
	public static short[] field1540;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1971211247
	)
	int field1535;
	@ObfuscatedName("b")
	byte field1541;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2049940809
	)
	int field1536;
	@ObfuscatedName("m")
	String field1538;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Len;)V"
	)
	class132(class143 var1) {
		this.this$0 = var1;
		this.field1535 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		this.field1535 = var1.readUnsignedShort(); // L: 109
		this.field1541 = var1.readByte(); // L: 110
		this.field1536 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1538 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1535); // L: 117
		var2.rank = this.field1541; // L: 118
		var2.world = this.field1536; // L: 119
		var2.username = new Username(this.field1538); // L: 120
	} // L: 121

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "420472721"
	)
	static void method2810() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 124
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 125
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 126
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 127
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 128
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 129
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 130
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 131
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 132
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 133
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 134
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 135
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 136
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 139
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 140
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 141
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 142
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 143
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 144
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 145
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 147
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 148
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 149
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 150
		}

	} // L: 152
}
