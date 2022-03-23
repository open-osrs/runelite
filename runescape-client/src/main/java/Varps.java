import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		longValue = 7968788616048025071L
	)
	static long field3287;
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("v")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("o")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("h")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("al")
	@Export("hasFocus")
	protected static boolean hasFocus;

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
}
