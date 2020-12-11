import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public enum class333 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field3897(1, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field3898(2, 2);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1992705459
	)
	public final int field3902;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1944525395
	)
	final int field3900;

	class333(int var3, int var4) {
		this.field3902 = var3; // L: 19
		this.field3900 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3900; // L: 24
	}
}
