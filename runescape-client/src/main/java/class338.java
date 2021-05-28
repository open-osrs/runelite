import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public enum class338 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	field3917(1, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	field3915(0, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	field3916(3, 3),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	field3914(2, 10);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1709225651
	)
	final int field3918;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1076676609
	)
	final int field3919;

	class338(int var3, int var4) {
		this.field3918 = var3; // L: 20
		this.field3919 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3919; // L: 25
	}
}
