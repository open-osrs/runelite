import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4552(1, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4553(2, 2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1360847973
	)
	public final int field4554;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -54692009
	)
	final int field4551;

	FillMode(int var3, int var4) {
		this.field4554 = var3; // L: 19
		this.field4551 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4551; // L: 25
	}
}
