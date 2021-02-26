import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("FillMode")
public enum FillMode implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	field3896(1, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	field3897(2, 2);

	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 981795357
	)
	public final int field3898;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1459508057
	)
	final int field3895;

	FillMode(int var3, int var4) {
		this.field3898 = var3; // L: 19
		this.field3895 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3895; // L: 24
	}
}
