import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2750(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2747(1, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2748(2, 0),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2754(3, 0),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2751(9, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2746(4, 1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2752(5, 1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2753(6, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2749(7, 1),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2769(8, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2756(12, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2757(13, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2758(14, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2759(15, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2760(16, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2761(17, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2762(18, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2755(19, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2764(20, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2765(21, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2766(10, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2767(11, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	field2768(22, 3);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1136720449
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 38
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgd;",
		garbageValue = "-518638866"
	)
	static LoginPacket[] method4257() {
		return new LoginPacket[]{LoginPacket.field2342, LoginPacket.field2341, LoginPacket.field2338, LoginPacket.field2346, LoginPacket.field2339, LoginPacket.field2340}; // L: 22
	}
}
