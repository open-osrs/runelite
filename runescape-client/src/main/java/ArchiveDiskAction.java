import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 21153019
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2035889570"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Login.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3082
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3083
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3084
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3085
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3086
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3087
			++Client.soundEffectCount; // L: 3088
		}

	} // L: 3090
}
