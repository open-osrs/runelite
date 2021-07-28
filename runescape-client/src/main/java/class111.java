import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class111 extends class119 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -721991731
	)
	int field1348;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	final class120 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	class111(class120 var1) {
		this.this$0 = var1;
		this.field1348 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "1209873443"
	)
	void vmethod2558(Buffer var1) {
		this.field1348 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-7"
	)
	void vmethod2555(ClanChannel var1) {
		var1.removeMember(this.field1348);
	}
}
