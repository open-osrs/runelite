import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class251 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;III)Lkt;",
		garbageValue = "872502144"
	)
	public static Font method4840(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		return !class290.method5208(var0, var2, var3) ? null : class314.method5680(var1.takeFile(var2, var3));
	}
}
