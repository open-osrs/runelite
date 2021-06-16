import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("FillMode")
public enum FillMode implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4241(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	field4239(2, 2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2014293349
	)
	static int field4244;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1583860177
	)
	public final int field4242;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -76883829
	)
	final int field4243;

	FillMode(int var3, int var4) {
		this.field4242 = var3; // L: 19
		this.field4243 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4243; // L: 24
	}
}
