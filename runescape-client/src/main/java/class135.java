import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class135 extends class128 {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("v")
	boolean field1575;
	@ObfuscatedName("o")
	byte field1573;
	@ObfuscatedName("h")
	byte field1574;
	@ObfuscatedName("g")
	byte field1576;
	@ObfuscatedName("l")
	byte field1572;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class135(class131 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1575 = var1.readUnsignedByte() == 1; // L: 251
		this.field1573 = var1.readByte(); // L: 252
		this.field1574 = var1.readByte(); // L: 253
		this.field1576 = var1.readByte(); // L: 254
		this.field1572 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.allowGuests = this.field1575; // L: 259
		var1.field1602 = this.field1573; // L: 260
		var1.field1603 = this.field1574; // L: 261
		var1.field1604 = this.field1576; // L: 262
		var1.field1613 = this.field1572; // L: 263
	} // L: 264
}
