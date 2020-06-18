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
		signature = "Lhp;"
	)
	field2756(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2757(1, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2755(2, 0),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2758(3, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2759(9, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2760(4, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2761(5, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2762(6, 1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2776(7, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2764(8, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2765(12, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2763(13, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2769(14, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2768(15, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2766(16, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2770(17, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2771(18, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2772(19, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2767(20, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2774(21, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2775(10, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2778(11, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lhp;"
	)
	field2777(22, 3);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -992967721
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
