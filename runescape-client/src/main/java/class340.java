import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class340 implements class345 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public final class363 field3919;

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	class340(class364 var1) {
		this.field3919 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	public class340(class341 var1) {
		this(new class364(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1896564158"
	)
	public int method6047(int var1) {
		return this.field3919.vmethod6399(var1); // L: 18
	}
}
