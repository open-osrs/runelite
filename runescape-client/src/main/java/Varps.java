import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("l")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("q")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("f")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "4"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}
}
