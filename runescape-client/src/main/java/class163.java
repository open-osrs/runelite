import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class163 extends class166 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 741785429
	)
	int field1781;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lef;Ljava/lang/String;I)V"
	)
	class163(class155 var1, String var2, int var3) {
		super(var1, var2); // L: 372
		this.this$0 = var1; // L: 371
		this.field1781 = var3; // L: 373
	} // L: 374

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "695673663"
	)
	public int vmethod3297() {
		return 0; // L: 377
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2036911205"
	)
	public int vmethod3299() {
		return this.field1781; // L: 382
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkz;",
		garbageValue = "-50"
	)
	static class302[] method3283() {
		return new class302[]{class302.field3557, class302.field3555}; // L: 35
	}
}
