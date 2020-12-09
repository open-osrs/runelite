import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
final class class2 implements class0 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkj;I)V",
		garbageValue = "781194334"
	)
	public void vmethod49(Object var1, Buffer var2) {
		this.method21((Long)var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)Ljava/lang/Object;",
		garbageValue = "12"
	)
	public Object vmethod48(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lkj;I)V",
		garbageValue = "-110177189"
	)
	void method21(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("h")
	public static final int method23(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = (var12 - var14) * 6.0D * var16 + var14;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var16);
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = (var12 - var14) * (0.6666666666666666D - var0) * 6.0D + var14;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}
}
