import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4378(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4377(2, 2);

	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2036544943
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1855010985
	)
	public final int field4379;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1812864379
	)
	final int field4380;

	FillMode(int var3, int var4) {
		this.field4379 = var3; // L: 19
		this.field4380 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4380; // L: 24
	}
}
