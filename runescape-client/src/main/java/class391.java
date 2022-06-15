import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public class class391 implements class396 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	public final class420 field4424;

	@ObfuscatedSignature(
		descriptor = "(Lpl;)V"
	)
	class391(class421 var1) {
		this.field4424 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Loz;)V"
	)
	public class391(class392 var1) {
		this(new class421(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-275089160"
	)
	public int method7055(int var1) {
		return this.field4424.vmethod7440(var1); // L: 18
	}
}
