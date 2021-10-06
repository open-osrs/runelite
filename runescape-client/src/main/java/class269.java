import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public enum class269 implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	field3217(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	field3220(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	field3216(2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	field3219(3),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	field3224(4);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 659223025
	)
	final int field3218;

	class269(int var3) {
		this.field3218 = var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3218;
	}
}
