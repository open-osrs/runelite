import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public enum class309 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3914(-1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3911(0),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3915(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3913(2);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1882933983
	)
	final int field3910;

	class309(int var3) {
		this.field3910 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3910; // L: 23
	}
}
