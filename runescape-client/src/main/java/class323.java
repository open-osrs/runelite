import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public enum class323 implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	field3852(1, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	field3851(0, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	field3849(2, 5),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	field3856(3, 6),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	field3853(4, 7),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	field3854(5, 8);

	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 397636239
	)
	final int field3855;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 961427767
	)
	final int field3850;

	class323(int var3, int var4) {
		this.field3855 = var3; // L: 18
		this.field3850 = var4; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3850; // L: 23
	}
}
