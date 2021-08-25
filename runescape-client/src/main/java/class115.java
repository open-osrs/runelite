import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class115 extends class116 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2138422247
	)
	static int field1380;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -456160395
	)
	int field1382;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class115(class119 var1) {
		this.this$0 = var1;
		this.field1382 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1382 = var1.readUnsignedShort();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2560(this.field1382);
	}
}
