import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class219 {
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -437484721
	)
	static int field2547;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	public static Huffman huffman;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1168903600"
	)
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}
}
