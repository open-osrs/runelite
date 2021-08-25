import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("aa")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1732554665
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1267116301
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("g")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = BufferedSink.method6167(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = (double)var4 / (double)var1 + 6.0D;
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = ((double)var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
				}
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BS)[B",
		garbageValue = "7233"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-58"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "208366738"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;IIIZI)V",
		garbageValue = "1487110181"
	)
	public static void method1051(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class247.musicPlayerStatus = 1;
		class247.musicTrackArchive = var0;
		class247.musicTrackGroupId = var1;
		GrandExchangeOfferOwnWorldComparator.musicTrackFileId = var2;
		class196.musicTrackVolume = var3;
		class20.musicTrackBoolean = var4;
		class130.pcmSampleLength = 10000;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1629524573"
	)
	public static void method1049(int var0, int var1) {
		VarbitComposition var2 = WorldMapIcon_0.method3741(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "742993017"
	)
	public static boolean method1050(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	static final void method1038() {
		if (Messages.field1275) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2112();
			}

			Messages.field1275 = false;
		}

	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1271900596"
	)
	static final void method1052() {
		Client.field683 = Client.cycleCntr;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ljd;B)I",
		garbageValue = "89"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}
}
