import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class133 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1372494639
	)
	int field1605;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -923115207
	)
	int field1602;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 81969821
	)
	int field1603;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1344220301
	)
	int field1604;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class133(class131 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1605 = var1.readInt(); // L: 292
		this.field1604 = var1.readInt(); // L: 293
		this.field1602 = var1.readUnsignedByte(); // L: 294
		this.field1603 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2898(this.field1605, this.field1604, this.field1602, this.field1603); // L: 299
	} // L: 300
}
