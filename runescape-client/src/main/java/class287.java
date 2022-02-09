import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public enum class287 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3422(0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3418(1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3419(2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3420(3),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3417(4);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1599801481
	)
	final int field3421;

	class287(int var3) {
		this.field3421 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3421; // L: 19
	}
}
