import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3245(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3234(1, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3227(2, 0),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3228(3, 0),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3250(9, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3230(4, 1),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3249(5, 1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3247(6, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3233(7, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3239(8, 1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3235(12, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3236(13, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3237(14, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3238(15, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3225(16, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3240(17, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3241(18, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3242(19, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3243(20, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3231(21, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3232(10, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3246(11, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	field3229(22, 3);

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1201425423
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
