import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class17 extends class14 {
	@ObfuscatedName("f")
	boolean field136;
	@ObfuscatedName("o")
	byte field133;
	@ObfuscatedName("u")
	byte field134;
	@ObfuscatedName("p")
	byte field132;
	@ObfuscatedName("b")
	byte field135;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class17(class2 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field136 = var1.readUnsignedByte() == 1; // L: 251
		this.field133 = var1.readByte(); // L: 252
		this.field134 = var1.readByte(); // L: 253
		this.field132 = var1.readByte(); // L: 254
		this.field135 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.field90 = this.field136; // L: 259
		var1.field84 = this.field133; // L: 260
		var1.field83 = this.field134; // L: 261
		var1.field86 = this.field132; // L: 262
		var1.field87 = this.field135; // L: 263
	} // L: 264
}
