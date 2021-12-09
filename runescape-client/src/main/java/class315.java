import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class class315 {
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1285712925
	)
	static int field3918;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2066183341"
	)
	static void method5816(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 4315
			int var3 = var0 >> 8; // L: 4316
			int var4 = var0 >> 4 & 7; // L: 4317
			int var5 = var0 & 15; // L: 4318
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 4319
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 4320
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 4321
			Client.soundEffects[Client.soundEffectCount] = null; // L: 4322
			int var6 = (var1 - 64) / 128; // L: 4323
			int var7 = (var2 - 64) / 128; // L: 4324
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 4325
			++Client.soundEffectCount; // L: 4326
		}
	} // L: 4327

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1161739111"
	)
	static void method5822(int var0, int var1) {
		if (SecureRandomFuture.clientPreferences.musicVolume != 0 && var0 != -1) { // L: 4361
			NetSocket.method3118(Players.archive11, var0, 0, SecureRandomFuture.clientPreferences.musicVolume, false); // L: 4362
			Client.field743 = true; // L: 4363
		}

	} // L: 4365
}
