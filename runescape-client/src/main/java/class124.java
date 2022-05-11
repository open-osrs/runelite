import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public enum class124 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1556(3, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1557(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1553(2, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1551(0, 3),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1555(4, 4);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2107670809
	)
	public final int field1552;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -24043459
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1552 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}
}
