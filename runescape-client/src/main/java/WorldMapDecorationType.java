import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3517(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3512(1, 0),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3509(2, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3500(3, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3501(9, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3502(4, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3507(5, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3499(6, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3505(7, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3504(8, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3497(12, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3508(13, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3521(14, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3510(15, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3511(16, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3506(17, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3515(18, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3514(19, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3513(20, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3516(21, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3498(10, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3518(11, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field3519(22, 3);

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1027603677
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 38
	}
}
