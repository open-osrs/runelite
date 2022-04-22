import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class290 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;B)V",
		garbageValue = "-14"
	)
	static void method5558(Float var0, Float var1) {
		var1 = 1.0F - var1; // L: 311
		if (var0 < 0.0F) { // L: 312
			var0 = 0.0F;
		}

		if (var1 < 0.0F) { // L: 313
			var1 = 0.0F;
		}

		if (var0 > 1.0F || var1 > 1.0F) { // L: 314
			float var2 = (float)((double)(var0 * (var0 - 2.0F + var1)) + (double)var1 * ((double)var1 - 2.0D) + 1.0D); // L: 315
			if (class114.field1382 + var2 > 0.0F) { // L: 316
				Float var4;
				if (var0 + class114.field1382 < 1.3333334F) { // L: 320
					float var5 = var0 - 2.0F; // L: 321
					float var6 = var0 - 1.0F; // L: 322
					float var7 = (float)Math.sqrt((double)(var5 * var5 - var6 * 4.0F * var6)); // L: 323
					float var8 = (var7 + -var5) * 0.5F; // L: 324
					if (var1 + class114.field1382 > var8) { // L: 325
						var4 = var8 - class114.field1382; // L: 326
					} else {
						var8 = (-var5 - var7) * 0.5F; // L: 329
						if (var1 < var8 + class114.field1382) { // L: 330
							var4 = var8 + class114.field1382; // L: 331
						}
					}
				} else {
					Float var3 = 1.3333334F - class114.field1382; // L: 336
					var4 = 0.33333334F - class114.field1382; // L: 337
				}
			}
		}

		var1 = 1.0F - var1; // L: 342
	} // L: 343
}
