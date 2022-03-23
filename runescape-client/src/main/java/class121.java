import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class121 {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		longValue = -2735509699185230757L
	)
	static long field1479;

	@ObfuscatedName("u")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 81
	}
}
