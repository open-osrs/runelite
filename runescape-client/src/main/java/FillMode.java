import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("FillMode")
public enum FillMode implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("GRADIENT")
	GRADIENT(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("GRADIENT_ALPHA")
	GRADIENT_ALPHA(2, 2);

	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1262740687
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1489188623
	)
	@Export("index")
	final int index;

	FillMode(int var3, int var4) {
		this.id = var3; // L: 19
		this.index = var4; // L: 20
	} // L: 21

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.index; // L: 24
	}
}
