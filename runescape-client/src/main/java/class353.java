import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class353 implements class358 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public final class380 field4033;

	@ObfuscatedSignature(
		descriptor = "(Lnx;)V"
	)
	class353(class381 var1) {
		this.field4033 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lml;)V"
	)
	public class353(class354 var1) {
		this(new class381(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "65280"
	)
	public int method6379(int var1) {
		return this.field4033.vmethod6739(var1); // L: 18
	}
}
