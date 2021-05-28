import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	field1628(1, 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	field1624(2, 2);

	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -161686761
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1344358763
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IIB)Lbd;",
		garbageValue = "1"
	)
	public static final PcmPlayer method2762(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field428 == 0) { // L: 49
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 50
			if (var2 < 256) { // L: 51
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class26.pcmPlayerProvider.player(); // L: 53
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 54
				var3.field425 = var2; // L: 55
				var3.init(); // L: 56
				var3.capacity = (var2 & -1024) + 1024; // L: 57
				if (var3.capacity > 16384) { // L: 58
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 59
				if (PcmPlayer.field418 > 0 && Message.soundSystem == null) { // L: 60
					Message.soundSystem = new SoundSystem(); // L: 61
					Huffman.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 62
					Huffman.soundSystemExecutor.scheduleAtFixedRate(Message.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 63
				}

				if (Message.soundSystem != null) { // L: 65
					if (Message.soundSystem.players[var1] != null) { // L: 66
						throw new IllegalArgumentException();
					}

					Message.soundSystem.players[var1] = var3; // L: 67
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
