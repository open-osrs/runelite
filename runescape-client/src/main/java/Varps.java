import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("c")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("v")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("q")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "74"
	)
	public static byte[] method5530(Object var0, boolean var1) {
		if (var0 == null) { // L: 21
			return null;
		} else if (var0 instanceof byte[]) { // L: 22
			byte[] var3 = (byte[])((byte[])var0); // L: 23
			return var1 ? MusicPatch.method5432(var3) : var3; // L: 24
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 27
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 28
			return var2.get(); // L: 29
		} else {
			throw new IllegalArgumentException(); // L: 31
		}
	}
}
