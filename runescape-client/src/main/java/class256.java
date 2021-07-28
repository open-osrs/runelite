import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public enum class256 implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field3136(0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field3132(1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field3133(2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field3131(3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field3135(4);

	@ObfuscatedName("p")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -104835219
	)
	final int field3134;

	class256(int var3) {
		this.field3134 = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3134;
	}
}
