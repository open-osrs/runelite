import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class133 extends class128 {
	@ObfuscatedName("hh")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 432924361
	)
	int field1556;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2115932519
	)
	int field1555;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 117330729
	)
	int field1552;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -850318401
	)
	int field1550;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class133(class131 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1556 = var1.readInt(); // L: 292
		this.field1550 = var1.readInt(); // L: 293
		this.field1555 = var1.readUnsignedByte(); // L: 294
		this.field1552 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2969(this.field1556, this.field1550, this.field1555, this.field1552); // L: 299
	} // L: 300
}
