import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public enum class385 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4204(4, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4209(1, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4203(0, 5),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4205(5, 6),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4206(2, 7),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4207(3, 8);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2069080899
	)
	final int field4202;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 800594363
	)
	final int field4208;

	class385(int var3, int var4) {
		this.field4202 = var3; // L: 18
		this.field4208 = var4; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4208; // L: 23
	}
}
