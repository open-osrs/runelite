import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class123 extends class116 {
	@ObfuscatedName("l")
	boolean field1433;
	@ObfuscatedName("q")
	byte field1429;
	@ObfuscatedName("f")
	byte field1432;
	@ObfuscatedName("j")
	byte field1431;
	@ObfuscatedName("m")
	byte field1428;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class123(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1433 = var1.readUnsignedByte() == 1;
		this.field1429 = var1.readByte();
		this.field1432 = var1.readByte();
		this.field1431 = var1.readByte();
		this.field1428 = var1.readByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.allowGuests = this.field1433;
		var1.field1450 = this.field1429;
		var1.field1452 = this.field1432;
		var1.field1459 = this.field1431;
		var1.field1466 = this.field1428;
	}
}
