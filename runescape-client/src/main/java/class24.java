import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("w")
public class class24 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2105932695
	)
	@Export("idxCount")
	public static int idxCount;

	@ObfuscatedName("y")
	public static boolean method329(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 60
	}
}
