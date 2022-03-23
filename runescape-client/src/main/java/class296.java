import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public enum class296 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3507(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3503(1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3505(2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3502(3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3504(4);

	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -641219841
	)
	final int field3506;

	class296(int var3) {
		this.field3506 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3506; // L: 19
	}
}
