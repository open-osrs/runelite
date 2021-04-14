import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("FillMode")
public enum FillMode implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4229(1, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4230(2, 2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1972567139
	)
	public final int field4232;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1190954597
	)
	final int field4231;

	FillMode(int var3, int var4) {
		this.field4232 = var3; // L: 19
		this.field4231 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4231; // L: 24
	}
}
