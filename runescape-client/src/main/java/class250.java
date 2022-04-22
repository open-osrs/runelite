import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public abstract class class250 implements class252 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 65197793
	)
	protected int field2872;

	@ObfuscatedSignature(
		descriptor = "(Lkt;Llo;I)V"
	)
	protected class250(StudioGame var1, Language var2, int var3) {
		this.field2872 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-86"
	)
	static void method5112(int var0) {
		class356.field4185 = var0; // L: 21
		class387.field4346 = new class387[var0]; // L: 22
		class387.field4347 = 0; // L: 23
	} // L: 24
}
