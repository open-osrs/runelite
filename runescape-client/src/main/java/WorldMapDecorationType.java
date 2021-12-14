import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3391(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3404(1, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3384(2, 0),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3385(3, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3406(9, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3387(4, 1),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3388(5, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3383(6, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3390(7, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3397(8, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3392(12, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3396(13, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3394(14, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3395(15, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3393(16, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3386(17, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3398(18, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3399(19, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3400(20, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3401(21, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3402(10, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3403(11, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3389(22, 3);

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("mouseWheel")
	static class154 mouseWheel;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 292795951
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
