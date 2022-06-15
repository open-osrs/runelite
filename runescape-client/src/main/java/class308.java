import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public enum class308 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3939(-1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3938(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3940(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3941(2);

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1827131377
	)
	final int field3944;

	class308(int var3) {
		this.field3944 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3944; // L: 20
	}
}
