import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	field3223(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	field3226(2, 2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		longValue = -2374158009127196223L
	)
	static long field3222;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1433173469
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 273023803
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}
}
