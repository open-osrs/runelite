import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("FillMode")
public enum FillMode implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("GRADIENT")
	GRADIENT(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("GRADIENT_ALPHA")
	GRADIENT_ALPHA(2, 2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -142023791
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2056260395
	)
	@Export("index")
	final int index;

	FillMode(int var3, int var4) {
		this.id = var3; // L: 19
		this.index = var4; // L: 20
	} // L: 21

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.index; // L: 24
	}
}
