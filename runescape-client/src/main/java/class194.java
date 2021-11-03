import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class194 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	static final class194 field2177;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	static final class194 field2178;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1031005125
	)
	@Export("value")
	final int value;

	static {
		field2177 = new class194(0); // L: 4
		field2178 = new class194(1); // L: 5
	}

	class194(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1906665444"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 112
	}
}
