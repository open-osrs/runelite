import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4366(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4368(2, 2);

	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 496856367
	)
	public final int field4369;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -603011481
	)
	final int field4367;

	FillMode(int var3, int var4) {
		this.field4369 = var3;
		this.field4367 = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4367;
	}
}
