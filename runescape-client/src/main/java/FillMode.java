import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("FillMode")
@ObfuscatedName("oq")
public enum FillMode implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4234(1, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	field4235(2, 2);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1063564995
	)
	public final int field4236;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 198879841
	)
	final int field4237;

	FillMode(int var3, int var4) {
		this.field4236 = var3; // L: 19
		this.field4237 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4237; // L: 24
	}
}
