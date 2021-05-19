import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 617912879
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 88457761
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1378992651
	)
	@Export("z")
	int z;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1412306783
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lix;I)V",
		garbageValue = "-2141628231"
	)
	public static void method4219(Huffman var0) {
		class377.huffman = var0; // L: 14
	} // L: 15
}
