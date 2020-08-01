import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Login")
public class Login {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -708549225
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Llh;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("leftTitleSprite")
	static Sprite leftTitleSprite;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -104867267
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -332178951
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -910177377
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("x")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1417433861
	)
	static int field1212;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 641478857
	)
	static int field1213;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1431585767
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ar")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ap")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("al")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("an")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ac")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("av")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ay")
	static boolean field1209;
	@ObfuscatedName("au")
	static boolean field1231;
	@ObfuscatedName("bh")
	static boolean field1223;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 543223437
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bd")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -2023703181
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1751937613
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 212340177
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = -3011856150050162759L
	)
	static long field1204;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = -7097171070724115481L
	)
	static long field1211;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field1212 = -1;
		field1213 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1209 = false;
		field1231 = false;
		field1223 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class171();
		field1204 = -1L;
		field1211 = -1L;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIILga;Lfz;Z[I[IB)I",
		garbageValue = "0"
	)
	public static int method2235(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class182.directions[var8][var9] = 0;
				class182.distances[var8][var9] = 99999999;
			}
		}

		boolean var27;
		if (var2 == 1) {
			var27 = Interpreter.method2112(var0, var1, var3, var4);
		} else if (var2 == 2) {
			var27 = method2234(var0, var1, var3, var4);
		} else {
			var27 = World.method1856(var0, var1, var2, var3, var4);
		}

		var9 = var0 - 64;
		int var10 = var1 - 64;
		int var11 = class182.field2132;
		int var12 = GrandExchangeOfferOwnWorldComparator.field666;
		int var13;
		int var14;
		int var16;
		if (!var27) {
			var13 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var15 = 10;
			var16 = var3.approxDestinationX;
			int var17 = var3.approxDestinationY;
			int var18 = var3.approxDestinationSizeX;
			int var19 = var3.approxDestinationSizeY;

			for (int var20 = var16 - var15; var20 <= var16 + var15; ++var20) {
				for (int var21 = var17 - var15; var21 <= var17 + var15; ++var21) {
					int var22 = var20 - var9;
					int var23 = var21 - var10;
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class182.distances[var22][var23] < 100) {
						int var24 = 0;
						if (var20 < var16) {
							var24 = var16 - var20;
						} else if (var20 > var18 + var16 - 1) {
							var24 = var20 - (var16 + var18 - 1);
						}

						int var25 = 0;
						if (var21 < var17) {
							var25 = var17 - var21;
						} else if (var21 > var19 + var17 - 1) {
							var25 = var21 - (var19 + var17 - 1);
						}

						int var26 = var24 * var24 + var25 * var25;
						if (var26 < var13 || var13 == var26 && class182.distances[var22][var23] < var14) {
							var13 = var26;
							var14 = class182.distances[var22][var23];
							var11 = var20;
							var12 = var21;
						}
					}
				}
			}

			if (var13 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var11 && var12 == var1) {
			return 0;
		} else {
			byte var28 = 0;
			class182.bufferX[var28] = var11;
			var13 = var28 + 1;
			class182.bufferY[var28] = var12;

			int var29;
			for (var14 = var29 = class182.directions[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = class182.directions[var11 - var9][var12 - var10]) {
				if (var14 != var29) {
					var29 = var14;
					class182.bufferX[var13] = var11;
					class182.bufferY[var13++] = var12;
				}

				if ((var14 & 2) != 0) {
					++var11;
				} else if ((var14 & 8) != 0) {
					--var11;
				}

				if ((var14 & 1) != 0) {
					++var12;
				} else if ((var14 & 4) != 0) {
					--var12;
				}
			}

			var16 = 0;

			while (var13-- > 0) {
				var6[var16] = class182.bufferX[var13];
				var7[var16++] = class182.bufferY[var13];
				if (var16 >= var6.length) {
					break;
				}
			}

			return var16;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILga;Lfz;I)Z",
		garbageValue = "783701635"
	)
	static final boolean method2234(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class182.directions[var6][var7] = 99;
		class182.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class182.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class182.bufferX[var11];
			var5 = class182.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				class182.field2132 = var4;
				GrandExchangeOfferOwnWorldComparator.field666 = var5;
				return true;
			}

			int var15 = class182.distances[var16][var17] + 1;
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17] = 2;
				class182.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17] = 8;
				class182.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 - 1] = 1;
				class182.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 + 1] = 4;
				class182.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 - 1] = 3;
				class182.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 - 1] = 9;
				class182.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 + 1] = 6;
				class182.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 + 1] = 12;
				class182.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		class182.field2132 = var4;
		GrandExchangeOfferOwnWorldComparator.field666 = var5;
		return false;
	}
}
