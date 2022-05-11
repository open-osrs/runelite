import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	field4754(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	field4753(2, 2);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1271749217
	)
	public final int field4756;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1401042551
	)
	final int field4757;

	FillMode(int var3, int var4) {
		this.field4756 = var3; // L: 19
		this.field4757 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4757; // L: 25
	}
}
