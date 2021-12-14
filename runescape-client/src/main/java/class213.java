import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class213 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkt;",
		garbageValue = "1655670329"
	)
	static class288[] method4355() {
		return new class288[]{class288.field3436, class288.field3438};
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ldn;FZI)F",
		garbageValue = "244172504"
	)
	static float method4354(class115 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2637() != 0) {
			float var4 = (float)var0.field1393[0].field1359;
			float var5 = (float)var0.field1393[var0.method2637() - 1].field1359;
			float var6 = var5 - var4;
			if (0.0D == (double)var6) {
				return var0.field1393[0].field1349;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var10 * var6;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1410 == class114.field1386) {
						if ((double)var10 != 0.0D) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1410 != class114.field1384 && var0.field1410 != class114.field1391) {
						if (var0.field1410 == class114.field1383) {
							var11 = var4 - var1;
							var16 = var0.field1393[0].field1350;
							var17 = var0.field1393[0].field1351;
							var3 = var0.field1393[0].field1349;
							if (0.0D != (double)var16) {
								var3 -= var11 * var17 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1396 == class114.field1386) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1396 != class114.field1384 && var0.field1396 != class114.field1391) {
					if (var0.field1396 == class114.field1383) {
						var11 = var1 - var5;
						var16 = var0.field1393[var0.method2637() - 1].field1352;
						var17 = var0.field1393[var0.method2637() - 1].field1357;
						var3 = var0.field1393[var0.method2637() - 1].field1349;
						if (0.0D != (double)var16) {
							var3 += var17 * var11 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = class14.method210(var0, var11);
				float var18;
				if (var2 && var0.field1410 == class114.field1391) {
					var18 = var0.field1393[var0.method2637() - 1].field1349 - var0.field1393[0].field1349;
					var3 = (float)((double)var3 - var8 * (double)var18);
				} else if (!var2 && var0.field1396 == class114.field1391) {
					var18 = var0.field1393[var0.method2637() - 1].field1349 - var0.field1393[0].field1349;
					var3 = (float)((double)var3 + (double)var18 * var8);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1639930062"
	)
	public static void method4356() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3815 != 0) {
				ArchiveDiskActionHandler.field3815 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}
}
