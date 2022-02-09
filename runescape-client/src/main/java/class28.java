import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class28 {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lex;III)Lag;",
		garbageValue = "1463903450"
	)
	public static final PcmPlayer method405(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class339.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 57
				var3.field296 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (DevicePcmPlayerProvider.field156 > 0 && class415.soundSystem == null) { // L: 63
					class415.soundSystem = new SoundSystem(); // L: 64
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class415.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (class415.soundSystem != null) { // L: 68
					if (class415.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					class415.soundSystem.players[var1] = var3; // L: 70
				}

				return var3; // L: 72
			} catch (Throwable var4) { // L: 74
				return new PcmPlayer(); // L: 75
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I)V",
		garbageValue = "-576832412"
	)
	static final void method406(Widget var0) {
		int var1 = var0.contentType; // L: 11634
		if (var1 == 324) { // L: 11635
			if (Client.field585 == -1) { // L: 11636
				Client.field585 = var0.spriteId2; // L: 11637
				Client.field773 = var0.spriteId; // L: 11638
			}

			if (Client.playerAppearance.isFemale) { // L: 11640
				var0.spriteId2 = Client.field585;
			} else {
				var0.spriteId2 = Client.field773; // L: 11641
			}

		} else if (var1 == 325) { // L: 11644
			if (Client.field585 == -1) { // L: 11645
				Client.field585 = var0.spriteId2; // L: 11646
				Client.field773 = var0.spriteId; // L: 11647
			}

			if (Client.playerAppearance.isFemale) { // L: 11649
				var0.spriteId2 = Client.field773;
			} else {
				var0.spriteId2 = Client.field585; // L: 11650
			}

		} else if (var1 == 327) { // L: 11653
			var0.modelAngleX = 150; // L: 11654
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11655
			var0.modelType = 5; // L: 11656
			var0.modelId = 0; // L: 11657
		} else if (var1 == 328) { // L: 11660
			var0.modelAngleX = 150; // L: 11661
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11662
			var0.modelType = 5; // L: 11663
			var0.modelId = 1; // L: 11664
		}
	} // L: 11642 11651 11658 11665 11667
}
