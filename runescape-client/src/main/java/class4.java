import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public final class class4 {
	@ObfuscatedName("r")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 337025771
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive13")
	static Archive archive13;

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "178536163"
	)
	static long method16() {
		return Client.field608; // L: 2578
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1841271895"
	)
	static void method19() {
		if (class340.field4109 != null) { // L: 11948
			Client.field764 = Client.cycle; // L: 11949
			class340.field4109.method6086(); // L: 11950

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 11951
				if (Client.players[var0] != null) { // L: 11952
					class340.field4109.method6091((Client.players[var0].x >> 7) + ApproximateRouteStrategy.baseX, (Client.players[var0].y >> 7) + class250.baseY); // L: 11953
				}
			}
		}

	} // L: 11957
}
