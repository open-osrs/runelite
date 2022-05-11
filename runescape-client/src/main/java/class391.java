import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public enum class391 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4422(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4419(2, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4421(0, 3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4424(3, 10);

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2065434727
	)
	final int field4423;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -683331803
	)
	final int field4420;

	class391(int var3, int var4) {
		this.field4423 = var3; // L: 16
		this.field4420 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4420; // L: 22
	}
}
