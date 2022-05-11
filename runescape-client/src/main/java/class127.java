import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class127 extends class128 {
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static class326 field1570;
	@ObfuscatedName("r")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -115567503
	)
	int field1572;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class127(class131 var1) {
		this.this$0 = var1;
		this.field1572 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1572 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2926(this.field1572); // L: 123
	} // L: 124

	@ObfuscatedName("o")
	public static final int method2805(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (var2 + 1.0D) * var4;
			} else {
				var12 = var2 + var4 - var4 * var2; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var14 + (var12 - var14) * 6.0D * var16;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var14 + (var12 - var14) * 6.0D * var0;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var20 * 6.0D * (var12 - var14) + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = var14 + (var12 - var14) * (0.6666666666666666D - var20) * 6.0D;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15; // L: 39
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILpx;B)Lfn;",
		garbageValue = "105"
	)
	public static class168 method2807(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class168 var5 = new class168(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1847 != null && var7.length == var5.field1847.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1847[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1844 != null && var7.length == var5.field1844.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1844[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}
}
