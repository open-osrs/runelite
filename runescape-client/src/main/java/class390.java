import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public enum class390 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4369(0, 1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4366(3, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4367(2, 3),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4368(1, 10);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1064934695
	)
	final int field4370;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1290046755
	)
	final int field4365;

	class390(int var3, int var4) {
		this.field4370 = var3; // L: 16
		this.field4365 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4365; // L: 21
	}
}
