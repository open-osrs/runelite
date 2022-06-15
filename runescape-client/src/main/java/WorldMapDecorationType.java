import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3549(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3543(1, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3533(2, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3534(3, 0),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3535(9, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3536(4, 1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3537(5, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3538(6, 1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3539(7, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3532(8, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3541(12, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3542(13, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3551(14, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3531(15, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3545(16, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3546(17, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3547(18, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3548(19, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3540(20, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3550(21, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3553(10, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3552(11, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	field3544(22, 3);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1096065009
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
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1746098292"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 155
	}
}
