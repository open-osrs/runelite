import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1787326705
	)
	static int field436;
	@ObfuscatedName("ez")
	static int[] field432;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			class27.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Liv;IB)V",
		garbageValue = "-86"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3039 == null) { // L: 996
			throw new RuntimeException(); // L: 997
		} else {
			if (var0.field3105 == null) { // L: 999
				var0.field3105 = new int[var0.field3039.length]; // L: 1000
			}

			var0.field3105[var1] = Integer.MAX_VALUE; // L: 1002
		}
	} // L: 1003
}
