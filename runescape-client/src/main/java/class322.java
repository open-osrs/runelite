import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public enum class322 implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	field3841(1, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	field3842(5, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	field3843(2, 5),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	field3848(4, 6),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	field3845(3, 7),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	field3846(0, 8);

	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -437447657
	)
	final int field3847;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1336869107
	)
	final int field3844;

	class322(int var3, int var4) {
		this.field3847 = var3; // L: 18
		this.field3844 = var4; // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3844; // L: 23
	}
}
