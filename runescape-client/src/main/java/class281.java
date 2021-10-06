import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class281 {
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -1543804789
	)
	static int field3324;
	@ObfuscatedName("a")
	static byte[][][] field3323;

	static {
		int var0 = 0;
		int var1 = 0;
		class276[] var2 = new class276[]{class276.field3288, class276.field3289};
		class276[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class276 var5 = var3[var4];
			if (var5.field3287 > var0) {
				var0 = var5.field3287;
			}

			if (var5.field3290 > var1) {
				var1 = var5.field3290;
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "-97"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}
}
