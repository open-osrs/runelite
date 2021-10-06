import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public enum class352 implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field4039(0, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field4035(2, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field4036(1, 3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	field4037(3, 10);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 882654827
	)
	final int field4038;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1768873207
	)
	final int field4034;

	class352(int var3, int var4) {
		this.field4038 = var3;
		this.field4034 = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4034;
	}
}
