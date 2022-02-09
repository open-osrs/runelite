import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class147 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1654320103
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "19"
	)
	public static int method2997(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ldt;[F[FI)V",
		garbageValue = "-994348672"
	)
	static void method2998(class115 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 271
			var0.field1423 = var1[0]; // L: 274
			float var3 = var1[3] - var1[0]; // L: 275
			float var4 = var2[3] - var2[0]; // L: 276
			float var5 = var1[1] - var1[0]; // L: 277
			float var6 = 0.0F; // L: 278
			float var7 = 0.0F; // L: 279
			if (0.0D != (double)var5) { // L: 280
				var6 = (var2[1] - var2[0]) / var5; // L: 281
			}

			var5 = var1[3] - var1[2]; // L: 283
			if (0.0D != (double)var5) { // L: 284
				var7 = (var2[3] - var2[2]) / var5; // L: 285
			}

			float var8 = 1.0F / (var3 * var3); // L: 287
			float var9 = var3 * var6; // L: 288
			float var10 = var3 * var7; // L: 289
			var0.field1425[0] = (var9 + var10 - var4 - var4) * var8 / var3; // L: 290
			var0.field1425[1] = var8 * (var4 + var4 + var4 - var9 - var9 - var10); // L: 291
			var0.field1425[2] = var6; // L: 292
			var0.field1425[3] = var2[0]; // L: 293
		}
	} // L: 272 294
}
