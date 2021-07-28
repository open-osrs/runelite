import net.runelite.mapping.*;

@ObfuscatedName("ou")
@Implements("FillMode")
public enum FillMode implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4255(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4256(2, 2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -839032429
	)
	static int field4259;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 698833695
	)
	public final int field4257;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1768437689
	)
	final int field4258;

	FillMode(int var3, int var4) {
		this.field4257 = var3;
		this.field4258 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4258;
	}
}
