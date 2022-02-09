import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public enum class300 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3848(-1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3844(0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3845(1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3846(2);

	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2085737049
	)
	final int field3847;

	class300(int var3) {
		this.field3847 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3847; // L: 24
	}
}
