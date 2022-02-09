import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class377 extends class378 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;

	public class377(int var1) {
		super(var1); // L: 7
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1610720083"
	)
	void vmethod6802(Buffer var1, int var2) {
	} // L: 12

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lpg;",
		garbageValue = "1924175991"
	)
	static IndexedSprite method6795(boolean var0, boolean var1) {
		return var0 ? (var1 ? Bounds.field4220 : class1.options_buttons_2Sprite) : (var1 ? class143.field1638 : Script.options_buttons_0Sprite); // L: 241
	}
}
