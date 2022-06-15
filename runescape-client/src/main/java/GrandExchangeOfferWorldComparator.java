import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;B)I",
		garbageValue = "90"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IIIB)V",
		garbageValue = "7"
	)
	static void method5997(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class19.clientPreferences.method2262() != 0) { // L: 3725
			if (var0.field2172 != null && var0.field2172.containsKey(var1)) { // L: 3726
				int var4 = (Integer)var0.field2172.get(var1); // L: 3727
				if (var4 != 0) { // L: 3731
					int var7 = var4 >> 8; // L: 3732
					int var8 = var4 >> 4 & 7; // L: 3733
					int var9 = var4 & 15; // L: 3734
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3735
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3736
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3737
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3738
					int var10 = (var2 - 64) / 128; // L: 3739
					int var11 = (var3 - 64) / 128; // L: 3740
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3741
					++Client.soundEffectCount; // L: 3742
				}

			}
		}
	} // L: 3744
}
