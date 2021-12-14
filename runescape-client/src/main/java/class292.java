import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class292 {
	static {
		int var0 = 0;
		int var1 = 0;
		class288[] var2 = class213.method4355();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class288 var4 = var2[var3];
			if (var4.field3435 > var0) {
				var0 = var4.field3435;
			}

			if (var4.field3437 > var1) {
				var1 = var4.field3437;
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "-862238795"
	)
	public static void method5504(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method5504(var0, var1, var2, var5 - 1);
			method5504(var0, var1, var5 + 1, var3);
		}

	}
}
