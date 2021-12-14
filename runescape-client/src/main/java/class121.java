import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public enum class121 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1465(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1461(1, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1459(2, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1462(3, 3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1463(4, 4),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1464(5, 5),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1469(6, 6),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1466(7, 7),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1467(8, 8);

	@ObfuscatedName("rf")
	static boolean field1470;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1751927131
	)
	final int field1460;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -85516245
	)
	final int field1468;

	class121(int var3, int var4) {
		this.field1460 = var3;
		this.field1468 = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1468;
	}
}
