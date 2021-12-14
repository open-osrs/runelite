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
		this.field1535 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		this.field1535 = var1.readUnsignedShort();
		this.field1541 = var1.readByte();
		this.field1536 = var1.readUnsignedShort();
		var1.readLong();
		this.field1538 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1535);
		var2.rank = this.field1541;
		var2.world = this.field1536;
		var2.username = new Username(this.field1538);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "420472721"
	)
	static void method2810() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43;
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72;
			KeyHandler.KeyHandler_keyCodes[47] = 73;
			KeyHandler.KeyHandler_keyCodes[59] = 57;
			KeyHandler.KeyHandler_keyCodes[61] = 27;
			KeyHandler.KeyHandler_keyCodes[91] = 42;
			KeyHandler.KeyHandler_keyCodes[92] = 74;
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58;
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

	}
}
