import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("v")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("c")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("i")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lff;III)Lay;",
		garbageValue = "-1753293698"
	)
	public static final PcmPlayer method5523(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class384.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 57
				var3.field289 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (PcmPlayer.field295 > 0 && class6.soundSystem == null) { // L: 63
					class6.soundSystem = new SoundSystem(); // L: 64
					WorldMapSection1.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					WorldMapSection1.soundSystemExecutor.scheduleAtFixedRate(class6.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (class6.soundSystem != null) { // L: 68
					if (class6.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					class6.soundSystem.players[var1] = var3; // L: 70
				}

				return var3; // L: 72
			} catch (Throwable var4) { // L: 74
				return new PcmPlayer(); // L: 75
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
