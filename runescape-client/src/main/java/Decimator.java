import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1220605689
	)
	static int field397;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1215193119
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -871732017
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("n")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D)); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = 3.141592653589793D * ((double)var11 - var9); // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9)); // L: 49
					var8[var11] = (int)Math.floor(0.5D + 65536.0D * var17); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-84367819"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "25"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1943827297"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1075
			if (Client.gameState == 0) { // L: 1076
				class127.client.method520();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1077
				ModeWhere.method6099(0); // L: 1078
				Client.field528 = 0; // L: 1079
				Client.field661 = 0; // L: 1080
				Client.timer.method6563(var0); // L: 1081
				if (var0 != 20) { // L: 1082
					class302.method5766(false);
				}
			}

			if (var0 != 20 && var0 != 40 && ModeWhere.field4073 != null) { // L: 1084 1085
				ModeWhere.field4073.close(); // L: 1086
				ModeWhere.field4073 = null; // L: 1087
			}

			if (Client.gameState == 25) { // L: 1090
				Client.field560 = 0; // L: 1091
				Client.field747 = 0; // L: 1092
				Client.field608 = 1; // L: 1093
				Client.field558 = 0; // L: 1094
				Client.field758 = 1; // L: 1095
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1097
				if (var0 == 20) { // L: 1101
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1102
					class144.method3080(JagexCache.archive10, class145.archive8, false, var1); // L: 1103
				} else if (var0 == 11) { // L: 1105
					class144.method3080(JagexCache.archive10, class145.archive8, false, 4); // L: 1106
				} else if (var0 == 50) { // L: 1108
					class4.setLoginResponseString("", "Updating date of birth...", ""); // L: 1109
					class144.method3080(JagexCache.archive10, class145.archive8, false, 7); // L: 1110
				} else {
					WorldMapSprite.method4351(); // L: 1112
				}
			} else {
				var1 = BufferedSource.method6889() ? 0 : 12; // L: 1098
				class144.method3080(JagexCache.archive10, class145.archive8, true, var1); // L: 1099
			}

			Client.gameState = var0; // L: 1113
		}
	} // L: 1114
}
