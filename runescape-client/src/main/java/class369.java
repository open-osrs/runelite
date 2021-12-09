import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public enum class369 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	field4220(1, 1),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	field4215(2, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	field4216(0, 3),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	field4214(3, 10);

	@ObfuscatedName("n")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 705420457
	)
	final int field4218;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1652306035
	)
	final int field4219;

	class369(int var3, int var4) {
		this.field4218 = var3; // L: 20
		this.field4219 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4219; // L: 26
	}
}
