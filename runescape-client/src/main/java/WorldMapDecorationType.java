import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2756(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2757(1, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2755(2, 0),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2758(3, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2759(9, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2760(4, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2761(5, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2762(6, 1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2776(7, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2764(8, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2765(12, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2763(13, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2769(14, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2768(15, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2766(16, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2770(17, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2771(18, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2772(19, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2767(20, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2774(21, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2775(10, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2778(11, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field2777(22, 3);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -992967721
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
