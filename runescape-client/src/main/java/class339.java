import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class339 implements class344 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public final class362 field3930;

	@ObfuscatedSignature(
		descriptor = "(Lmk;)V"
	)
	class339(class363 var1) {
		this.field3930 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lmp;)V"
	)
	public class339(class340 var1) {
		this(new class363(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "82"
	)
	public int method5861(int var1) {
		return this.field3930.vmethod6222(var1); // L: 18
	}
}
