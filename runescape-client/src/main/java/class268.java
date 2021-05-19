import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public enum class268 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	field3550(-1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	field3544(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	field3545(1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	field3543(2);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("soundCache")
	static SoundCache soundCache;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 163548653
	)
	final int field3547;

	class268(int var3) {
		this.field3547 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3547; // L: 19
	}
}
