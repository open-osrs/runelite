import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class115 extends class119 {
	@ObfuscatedName("s")
	String field1388;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -534205427
	)
	int field1389;
	@ObfuscatedName("v")
	byte field1390;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	final class120 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	class115(class120 var1) {
		this.this$0 = var1;
		this.field1388 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "1209873443"
	)
	void vmethod2558(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1388 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1389 = var1.readUnsignedShort();
		this.field1390 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-7"
	)
	void vmethod2555(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1388);
		var2.world = this.field1389;
		var2.rank = this.field1390;
		var1.addMember(var2);
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-618186627"
	)
	static void method2431() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
