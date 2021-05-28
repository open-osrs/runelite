import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class249 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("huffman")
	static Huffman huffman;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -288783387
	)
	static int field3118;
	@ObfuscatedName("cs")
	public static char field3116;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Z",
		garbageValue = "0"
	)
	static boolean method4792(String var0, int var1) {
		return Script.method1996(var0, var1, "openjs"); // L: 50
	}
}
