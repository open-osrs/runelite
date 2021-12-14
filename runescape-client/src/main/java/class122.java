import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class122 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1476(1, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1471(0, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1473(2, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1474(3, 3);

	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1980268263
	)
	public final int field1475;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -83043003
	)
	@Export("id")
	final int id;

	class122(int var3, int var4) {
		this.field1475 = var3;
		this.id = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
