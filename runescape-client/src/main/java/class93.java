import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class93 {
	@ObfuscatedName("f")
	public static final int method2186(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var14 + var16 * 6.0D * (var12 - var14);
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) { // L: 24
				var6 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var16);
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + (var12 - var14) * 6.0D * var0;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var14 + (var12 - var14) * 6.0D * var20;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lda;III)Lbq;",
		garbageValue = "225550567"
	)
	public static final PcmPlayer method2187(TaskHandler var0, int var1, int var2) {
		if (class341.field3921 == 0) { // L: 49
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 50
			if (var2 < 256) { // L: 51
				var2 = 256;
			}

			try {
				PcmPlayer var3 = FontName.pcmPlayerProvider.player(); // L: 53
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 54
				var3.field403 = var2; // L: 55
				var3.init(); // L: 56
				var3.capacity = (var2 & -1024) + 1024; // L: 57
				if (var3.capacity > 16384) { // L: 58
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 59
				if (UserComparator1.field4220 > 0 && Login.soundSystem == null) { // L: 60
					Login.soundSystem = new SoundSystem(); // L: 61
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 62
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(Login.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 63
				}

				if (Login.soundSystem != null) { // L: 65
					if (Login.soundSystem.players[var1] != null) { // L: 66
						throw new IllegalArgumentException();
					}

					Login.soundSystem.players[var1] = var3; // L: 67
				}

				return var3; // L: 69
			} catch (Throwable var4) { // L: 71
				return new PcmPlayer(); // L: 72
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
