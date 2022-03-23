import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public enum class309 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3918(-1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3910(0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3912(1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3911(2);

	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2019650593
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 608041089
	)
	final int field3914;

	class309(int var3) {
		this.field3914 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3914; // L: 20
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	public static void method5804() {
		if (NetCache.NetCache_socket != null) { // L: 264
			NetCache.NetCache_socket.close();
		}

	} // L: 265
}
