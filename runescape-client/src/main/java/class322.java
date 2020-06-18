import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
public enum class322 implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Llx;"
	)
	field3841(4, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Llx;"
	)
	field3836(2, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Llx;"
	)
	field3837(5, 5),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Llx;"
	)
	field3838(0, 6),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Llx;"
	)
	field3839(1, 7),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Llx;"
	)
	field3840(3, 8);

	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -970737945
	)
	final int field3835;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -900565137
	)
	final int field3842;

	class322(int var3, int var4) {
		this.field3835 = var3;
		this.field3842 = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3842;
	}
}
