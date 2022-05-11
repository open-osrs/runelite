import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class357 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;

	@ObfuscatedName("r")
	static int method6392(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 76
	}
}
