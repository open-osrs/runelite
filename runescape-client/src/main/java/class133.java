import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class133 extends class126 {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -1093073267
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("c")
	boolean field1543;
	@ObfuscatedName("b")
	byte field1547;
	@ObfuscatedName("p")
	byte field1544;
	@ObfuscatedName("m")
	byte field1542;
	@ObfuscatedName("t")
	byte field1546;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class133(class129 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1543 = var1.readUnsignedByte() == 1; // L: 251
		this.field1547 = var1.readByte(); // L: 252
		this.field1544 = var1.readByte(); // L: 253
		this.field1542 = var1.readByte(); // L: 254
		this.field1546 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.allowGuests = this.field1543; // L: 259
		var1.field1567 = this.field1547; // L: 260
		var1.field1568 = this.field1544; // L: 261
		var1.field1569 = this.field1542; // L: 262
		var1.field1570 = this.field1546; // L: 263
	} // L: 264
}
