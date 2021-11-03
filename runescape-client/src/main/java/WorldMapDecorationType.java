import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3238(0, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3223(1, 0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3224(2, 0),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3230(3, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3231(9, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3227(4, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3228(5, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3240(6, 1),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3234(7, 1),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3229(8, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3232(12, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3225(13, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3222(14, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3235(15, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3236(16, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3237(17, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3226(18, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3239(19, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3233(20, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3241(21, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3242(10, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3243(11, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field3244(22, 3);

	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1784539249
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 38
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	static int method5193() {
		return ++Messages.Messages_count - 1; // L: 19
	}
}
