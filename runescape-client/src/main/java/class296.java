import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public enum class296 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3550(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3554(1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3551(2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3552(3),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3553(4);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 228576199
	)
	final int field3549;

	class296(int var3) {
		this.field3549 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3549; // L: 19
	}
}
