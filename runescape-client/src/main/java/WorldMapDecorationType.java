import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3246(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3230(1, 0),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3231(2, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3232(3, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3233(9, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3248(4, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3235(5, 1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3236(6, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3234(7, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3238(8, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3239(12, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3240(13, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3241(14, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3237(15, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3243(16, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3244(17, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3245(18, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3229(19, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3247(20, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3242(21, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3249(10, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3250(11, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field3251(22, 3);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1903748651
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method5062(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		VarbitComposition.clientPreferences.areaSoundEffectsVolume = var0;
		DevicePcmPlayerProvider.savePreferences();
	}
}
