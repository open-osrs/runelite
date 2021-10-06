import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public enum class283 implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	field3649(-1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	field3646(0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	field3647(1),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	field3648(2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1834380199
	)
	final int field3650;

	class283(int var3) {
		this.field3650 = var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3650;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-476402365"
	)
	public static int method5141(int var0) {
		return class361.field4054[var0 & 16383];
	}
}
