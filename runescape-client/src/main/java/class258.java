import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class258 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljx;",
		garbageValue = "1729073016"
	)
	public static HitSplatDefinition method4654(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIZB)Ljava/lang/String;",
		garbageValue = "72"
	)
	static String method4655(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 115
			if (var2 && var0 >= 0) { // L: 116
				int var3 = 2; // L: 117

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 118 119 121
					var4 /= var1; // L: 120
				}

				char[] var5 = new char[var3]; // L: 123
				var5[0] = '+'; // L: 124

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 125
					int var7 = var0; // L: 126
					var0 /= var1; // L: 127
					int var8 = var7 - var0 * var1; // L: 128
					if (var8 >= 10) { // L: 129
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 130
					}
				}

				return new String(var5); // L: 132
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
