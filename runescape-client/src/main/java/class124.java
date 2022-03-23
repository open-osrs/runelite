import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public enum class124 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1516(1, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1509(0, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1510(2, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1511(3, 3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	field1512(4, 4);

	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2033789897
	)
	static int field1520;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 619577713
	)
	static int field1514;
	@ObfuscatedName("fy")
	static String field1518;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1875124149
	)
	public final int field1513;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 8908341
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1513 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgv;",
		garbageValue = "2062143502"
	)
	public static class193[] method2801() {
		return new class193[]{class193.field2195, class193.field2193, class193.field2192, class193.field2191}; // L: 14
	}
}
