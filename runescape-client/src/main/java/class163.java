import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class163 extends class166 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 604155557
	)
	int field1812;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leq;Ljava/lang/String;I)V"
	)
	class163(class155 var1, String var2, int var3) {
		super(var1, var2); // L: 354
		this.this$0 = var1; // L: 353
		this.field1812 = var3; // L: 355
	} // L: 356

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1005057629"
	)
	public int vmethod3227() {
		return 0; // L: 359
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1932276755"
	)
	public int vmethod3228() {
		return this.field1812; // L: 364
	}
}
