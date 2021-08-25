import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public enum class269 implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3224(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3221(1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3222(2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3226(3),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3220(4);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -181144539
	)
	final int field3225;

	class269(int var3) {
		this.field3225 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3225;
	}
}
