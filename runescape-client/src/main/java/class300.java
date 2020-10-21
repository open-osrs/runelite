import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class300 {
	@ObfuscatedName("f")
	static char[] field3686;
	@ObfuscatedName("b")
	static char[] field3682;
	@ObfuscatedName("l")
	static char[] field3684;
	@ObfuscatedName("m")
	static int[] field3685;

	static {
		field3686 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field3686[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field3686[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field3686[var0] = (char)(var0 + 48 - 52);
		}

		field3686[62] = '+'; // L: 11
		field3686[63] = '/'; // L: 12
		field3682 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field3682[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field3682[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field3682[var0] = (char)(var0 + 48 - 52);
		}

		field3682[62] = '*'; // L: 22
		field3682[63] = '-'; // L: 23
		field3684 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field3684[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field3684[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field3684[var0] = (char)(var0 + 48 - 52);
		}

		field3684[62] = '-'; // L: 33
		field3684[63] = '_'; // L: 34
		field3685 = new int[128]; // L: 40

		for (var0 = 0; var0 < field3685.length; ++var0) { // L: 41
			field3685[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field3685[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field3685[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field3685[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3685; // L: 45
		field3685[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field3685; // L: 48
		field3685[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-364565462"
	)
	static final void method5419(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 9800
		int var7 = var3 - var1; // L: 9801
		int var8 = var6 >= 0 ? var6 : -var6; // L: 9802
		int var9 = var7 >= 0 ? var7 : -var7; // L: 9803
		int var10 = var8; // L: 9804
		if (var8 < var9) { // L: 9805
			var10 = var9;
		}

		if (var10 != 0) { // L: 9806
			int var11 = (var6 << 16) / var10; // L: 9807
			int var12 = (var7 << 16) / var10; // L: 9808
			if (var12 <= var11) { // L: 9809
				var11 = -var11;
			} else {
				var12 = -var12; // L: 9810
			}

			int var13 = var5 * var12 >> 17; // L: 9811
			int var14 = var5 * var12 + 1 >> 17; // L: 9812
			int var15 = var5 * var11 >> 17; // L: 9813
			int var16 = var5 * var11 + 1 >> 17; // L: 9814
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 9815
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 9816
			int var17 = var0 + var13; // L: 9817
			int var18 = var0 - var14; // L: 9818
			int var19 = var0 + var6 - var14; // L: 9819
			int var20 = var0 + var13 + var6; // L: 9820
			int var21 = var15 + var1; // L: 9821
			int var22 = var1 - var16; // L: 9822
			int var23 = var7 + var1 - var16; // L: 9823
			int var24 = var7 + var15 + var1; // L: 9824
			Rasterizer3D.method3137(var17, var18, var19); // L: 9825
			Rasterizer3D.method3149(var21, var22, var23, var17, var18, var19, var4); // L: 9826
			Rasterizer3D.method3137(var17, var19, var20); // L: 9827
			Rasterizer3D.method3149(var21, var23, var24, var17, var19, var20, var4); // L: 9828
		}
	} // L: 9829
}
