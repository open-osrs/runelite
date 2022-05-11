import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class271 {
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -2079311097
	)
	static int field3221;
	@ObfuscatedName("o")
	static int[] field3220;

	static {
		new Object();
		field3220 = new int[33]; // L: 8
		field3220[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3220[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lfs;IIB)Lal;",
		garbageValue = "-29"
	)
	public static final PcmPlayer method5045(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field300 == 0) { // L: 52
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = PcmPlayer.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[(ArchiveDiskAction.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 57
				var3.field287 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (class29.field172 > 0 && MusicPatchPcmStream.soundSystem == null) { // L: 63
					MusicPatchPcmStream.soundSystem = new SoundSystem(); // L: 64
					InterfaceParent.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					InterfaceParent.soundSystemExecutor.scheduleAtFixedRate(MusicPatchPcmStream.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (MusicPatchPcmStream.soundSystem != null) { // L: 68
					if (MusicPatchPcmStream.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					MusicPatchPcmStream.soundSystem.players[var1] = var3; // L: 70
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
