import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public enum class192 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	field2208((byte)-1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	field2209((byte)0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	field2212((byte)1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	field2211((byte)2);

	@ObfuscatedName("ao")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("j")
	public byte field2210;

	class192(byte var3) {
		this.field2210 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2210; // L: 19
	}
}
