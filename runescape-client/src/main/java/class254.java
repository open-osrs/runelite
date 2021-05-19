import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum class254 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3140(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3137(1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3139(2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3144(3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field3141(4);

	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -166646721
	)
	final int field3142;

	class254(int var3) {
		this.field3142 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3142; // L: 18
	}
}
