import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("n")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("v")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("d")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "1823742662"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) { // L: 171
			WorldMapLabelSize.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174
}
