import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class126 extends class116 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 633150417
	)
	int field1442;
	@ObfuscatedName("c")
	String field1446;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class126(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1442 = var1.readInt();
		this.field1446 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2571(this.field1442, this.field1446);
	}
}
