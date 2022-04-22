import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class92 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "367687944"
	)
	static final void method2362() {
		int var0 = Players.Players_count; // L: 3908
		int[] var1 = Players.Players_indices; // L: 3909

		for (int var2 = 0; var2 < var0; ++var2) { // L: 3910
			Player var3 = Client.players[var1[var2]]; // L: 3911
			if (var3 != null) { // L: 3912
				class149.updateActorSequence(var3, 1); // L: 3913
			}
		}

	} // L: 3916
}
