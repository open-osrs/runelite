import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class class266 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2081752940"
	)
	public static int method4917(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("w")
	public static int method4916(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}
}
