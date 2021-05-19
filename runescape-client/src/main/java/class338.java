import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public enum class338 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3927(0, 1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3925(1, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3926(3, 3),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3928(2, 10);

	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1369051619
	)
	final int field3924;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2077999929
	)
	final int field3929;

	class338(int var3, int var4) {
		this.field3924 = var3; // L: 20
		this.field3929 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3929; // L: 25
	}
}
