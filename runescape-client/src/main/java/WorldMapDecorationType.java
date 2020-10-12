import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2760(0, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2759(1, 0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2763(2, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2757(3, 0),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2761(9, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2767(4, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2769(5, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2764(6, 1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2765(7, 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2758(8, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2771(12, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2768(13, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2762(14, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2770(15, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2766(16, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2772(17, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2773(18, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2774(19, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2780(20, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2776(21, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2777(10, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2778(11, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2779(22, 3);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 212530535
	)
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 38
	}
}
