import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("Widget_archive")
	static AbstractArchive Widget_archive;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 176497707
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 829338493
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("q")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = GameShell.method1072(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3; // L: 17
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = (double)var4 / (double)var1 + 6.0D; // L: 23
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28
					double var12 = 3.141592653589793D * ((double)var8 - var6);
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
					var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
				}
			}

		}
	} // L: 37

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-792714030"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1298471977"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 66
		}

		return var1; // L: 67
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1879393337"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "1446464010"
	)
	@Export("getEnum")
	public static EnumDefinition getEnum(int var0) {
		EnumDefinition var1 = (EnumDefinition)EnumDefinition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumDefinition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumDefinition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumDefinition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1079487427"
	)
	static void method2668(int var0) {
		Client.oculusOrbState = var0; // L: 11660
	} // L: 11661
}
