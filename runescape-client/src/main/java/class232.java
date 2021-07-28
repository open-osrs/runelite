import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class232 {
	@ObfuscatedName("s")
	static int[] field2801;

	static {
		new Object();
		field2801 = new int[33];
		field2801[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2801[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-346907916"
	)
	public static void method4453() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
