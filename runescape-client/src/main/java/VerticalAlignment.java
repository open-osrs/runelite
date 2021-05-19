import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	field1676(1, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	field1675(2, 2);

	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1077695001
	)
	static int field1680;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 715110919
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1292564375
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 19
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "-1728613752"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field824) { // L: 11077
			Client.field825[var0.rootIndex] = true; // L: 11078
		}

	} // L: 11080
}
