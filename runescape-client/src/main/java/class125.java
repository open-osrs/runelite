import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public enum class125 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	field1459(1, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	field1456(0, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	field1458(2, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	field1457(3, 3);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1286472181
	)
	public final int field1460;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1985750631
	)
	@Export("id")
	final int id;

	class125(int var3, int var4) {
		this.field1460 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 21
	}
}
