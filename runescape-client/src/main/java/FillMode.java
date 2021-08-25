import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4352(1, 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4354(2, 2);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -477318771
	)
	public final int field4353;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 439183323
	)
	final int field4356;

	FillMode(int var3, int var4) {
		this.field4353 = var3;
		this.field4356 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4356;
	}
}
