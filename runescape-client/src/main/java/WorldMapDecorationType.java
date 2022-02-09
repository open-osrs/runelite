import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3424(0, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3446(1, 0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3425(2, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3426(3, 0),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3429(9, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3428(4, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3423(5, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3430(6, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3431(7, 1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3432(8, 1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3433(12, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3434(13, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3435(14, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3436(15, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3445(16, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3427(17, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3439(18, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3440(19, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3441(20, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3442(21, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3438(10, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3444(11, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3437(22, 3);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 83557059
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}
}
