import java.awt.Image;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class class54 {
	@ObfuscatedName("s")
	static final BigInteger field792;
	@ObfuscatedName("t")
	static final BigInteger field791;
	@ObfuscatedName("au")
	static Image field794;

	static {
		field792 = new BigInteger("10001", 16);
		field791 = new BigInteger("ab6110302672864008d0185e6afc9b62db423bb9e2814f3eed533d23426d27ca6fdb3a8144af5f336e3260ca6aa42c96a9a97e061b7a041e85d823fb34738b4fd8aa5469a67e898774221bf6cf5ccc1b79c53154299bdafd8ced827edbc9278035bb1c538bbd08676651fe07c901650e509497289e174d6162d7b3b68acf4d0d", 16);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1009670840"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}
}
