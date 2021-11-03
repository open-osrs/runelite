import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class140 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1541912545
	)
	int field1536;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -8264772663538436025L
	)
	long field1531;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class140(class119 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1536 = var1.readInt(); // L: 310
		this.field1531 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2666(this.field1536, this.field1531); // L: 315
	} // L: 316
}
