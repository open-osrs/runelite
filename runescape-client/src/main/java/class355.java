import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class355 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-56"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 92
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-538784934"
	)
	public static boolean method6620(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 29
	}
}
