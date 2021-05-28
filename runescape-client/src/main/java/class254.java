import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public enum class254 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	field3138(0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	field3134(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	field3135(2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	field3136(3),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	field3137(4);

	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -709027953
	)
	final int field3133;

	class254(int var3) {
		this.field3133 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3133; // L: 18
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "120"
	)
	public static boolean method4823(int var0) {
		return var0 >= WorldMapDecorationType.field3149.id && var0 <= WorldMapDecorationType.field3145.id || var0 == WorldMapDecorationType.field3146.id; // L: 42
	}
}
