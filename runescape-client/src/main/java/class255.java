import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public enum class255 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	field3138(0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	field3137(1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	field3142(2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	field3139(3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	field3136(4);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1119623575
	)
	final int field3141;

	class255(int var3) {
		this.field3141 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3141; // L: 18
	}
}
