import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1692601205
	)
	static int field2013;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;I)I",
		garbageValue = "1927447948"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIB)Ldp;",
		garbageValue = "7"
	)
	public static final PcmPlayer method3526(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field1443 == 0) { // L: 56
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 57
			if (var2 < 256) { // L: 58
				var2 = 256;
			}

			try {
				PcmPlayer var3 = Varps.pcmPlayerProvider.player(); // L: 60
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 61
				var3.field1431 = var2; // L: 62
				var3.init(); // L: 63
				var3.capacity = (var2 & -1024) + 1024; // L: 64
				if (var3.capacity > 16384) { // L: 65
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 66
				if (PcmPlayer.field1424 > 0 && PcmPlayer.soundSystem == null) { // L: 67
					PcmPlayer.soundSystem = new SoundSystem(); // L: 68
					InterfaceParent.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 69
					InterfaceParent.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 70
				}

				if (PcmPlayer.soundSystem != null) { // L: 72
					if (PcmPlayer.soundSystem.players[var1] != null) { // L: 73
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3; // L: 74
				}

				return var3; // L: 76
			} catch (Throwable var4) { // L: 78
				return new PcmPlayer(); // L: 79
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
