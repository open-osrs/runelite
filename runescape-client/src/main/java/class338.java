import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public enum class338 implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	field3929(0, 1),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	field3928(1, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	field3933(2, 3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	field3930(3, 10);

	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -26430635
	)
	final int field3931;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 800833819
	)
	final int field3932;

	class338(int var3, int var4) {
		this.field3931 = var3;
		this.field3932 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3932;
	}
}
