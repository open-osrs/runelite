import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public enum class352 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4027(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4029(3, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4032(1, 3),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4030(2, 10);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1892879833
	)
	final int field4031;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1388944807
	)
	final int field4028;

	class352(int var3, int var4) {
		this.field4031 = var3; // L: 16
		this.field4028 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4028; // L: 21
	}
}
