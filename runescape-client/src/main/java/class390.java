import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public enum class390 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4370(0, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4369(3, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4368(2, 3),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4371(1, 10);

	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1657165177
	)
	final int field4372;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1977568173
	)
	final int field4373;

	class390(int var3, int var4) {
		this.field4372 = var3; // L: 16
		this.field4373 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4373; // L: 22
	}
}
