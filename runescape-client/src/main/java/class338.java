import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class338 implements class343 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public final class361 field3926;

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	class338(class362 var1) {
		this.field3926 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lms;)V"
	)
	public class338(class339 var1) {
		this(new class362(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-527387396"
	)
	public int method5988(int var1) {
		return this.field3926.vmethod6335(var1); // L: 18
	}
}
