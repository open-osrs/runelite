import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1910(1, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1905(0, 2);

	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -571312605
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -279458597
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "20"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11040
	}
}
