import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class225 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("clock")
	protected static Clock clock;

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IIIB)V",
		garbageValue = "26"
	)
	static void method4075(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Timer.clientPreferences.areaSoundEffectsVolume != 0) { // L: 3679
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3680
				int var4 = var0.soundEffects[var1]; // L: 3681
				if (var4 != 0) { // L: 3682
					int var5 = var4 >> 8; // L: 3683
					int var6 = var4 >> 4 & 7; // L: 3684
					int var7 = var4 & 15; // L: 3685
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 3686
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 3687
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3688
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3689
					int var8 = (var2 - 64) / 128; // L: 3690
					int var9 = (var3 - 64) / 128; // L: 3691
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 3692
					++Client.soundEffectCount; // L: 3693
				}
			}
		}
	} // L: 3694
}
