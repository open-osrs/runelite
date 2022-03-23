import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("fm")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1947(2, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1944(1, 2);

	@ObfuscatedName("k")
	public static short[] field1950;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1431612301
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1666832407
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}
}
