import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("at")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 344024525
	)
	@Export("id")
	int id;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lks;I)I",
		garbageValue = "-842469150"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored other) {
		return this.id - other.id;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(Ljs;I)I",
		garbageValue = "1627362569"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "-68"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Client.soundEffectVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
