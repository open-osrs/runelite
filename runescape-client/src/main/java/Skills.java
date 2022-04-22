import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("c")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("i")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)Z",
		garbageValue = "1366741641"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10905
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10906
				int var2 = BufferedSource.method6907(var0, var1); // L: 10907
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10908
				if (var0.cs1Comparisons[var1] == 2) { // L: 10909
					if (var2 >= var3) { // L: 10910
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10912
					if (var2 <= var3) { // L: 10913
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10915
					if (var2 == var3) { // L: 10916
						return false;
					}
				} else if (var2 != var3) { // L: 10918
					return false;
				}
			}

			return true; // L: 10920
		}
	}
}
