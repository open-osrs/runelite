import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public enum class112 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1350(1, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1345(0, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1346(2, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1347(3, 3);

	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 125998715
	)
	public final int field1344;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2047672005
	)
	@Export("id")
	final int id;

	class112(int var3, int var4) {
		this.field1344 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 21
	}

	@ObfuscatedName("i")
	static double method2517(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lew;III)Lak;",
		garbageValue = "430440132"
	)
	public static final PcmPlayer method2522(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) { // L: 46
			if (var2 < 256) { // L: 47
				var2 = 256;
			}

			try {
				PcmPlayer var3 = ItemContainer.pcmPlayerProvider.player(); // L: 49
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 50
				var3.field264 = var2; // L: 51
				var3.init(); // L: 52
				var3.capacity = (var2 & -1024) + 1024; // L: 53
				if (var3.capacity > 16384) { // L: 54
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 55
				if (PcmPlayer.field272 > 0 && class122.soundSystem == null) { // L: 56
					class122.soundSystem = new SoundSystem(); // L: 57
					class381.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 58
					class381.soundSystemExecutor.scheduleAtFixedRate(class122.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 59
				}

				if (class122.soundSystem != null) { // L: 61
					if (class122.soundSystem.players[var1] != null) { // L: 62
						throw new IllegalArgumentException();
					}

					class122.soundSystem.players[var1] = var3; // L: 63
				}

				return var3; // L: 65
			} catch (Throwable var4) { // L: 67
				return new PcmPlayer(); // L: 68
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
