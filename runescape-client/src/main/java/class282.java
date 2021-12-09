import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public enum class282 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	field3377(0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	field3376(1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	field3378(2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	field3379(3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	field3380(4);

	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1590225627
	)
	final int field3381;

	class282(int var3) {
		this.field3381 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3381; // L: 19
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Lbw;",
		garbageValue = "-51"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return Canvas.getNextWorldListWorld(); // L: 238
	}
}
