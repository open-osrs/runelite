import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public enum VerticalAlignment implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	field3221(1, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	field3225(2, 2);

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static Widget hoveredItemContainer;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1300403611
	)
	public final int value;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -496509631
	)
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 19
	}
}
