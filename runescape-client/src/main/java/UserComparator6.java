import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ec")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "313468169"
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

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Ljg;IIIB)V",
		garbageValue = "100"
	)
	@Export("addSequenceSoundEffect")
	static void addSequenceSoundEffect(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Client.areaSoundEffectVolume != 0) { // L: 3556
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3557
				int var4 = var0.soundEffects[var1]; // L: 3558
				if (var4 != 0) { // L: 3559
					int var5 = var4 >> 8; // L: 3560
					int var6 = var4 >> 4 & 7; // L: 3561
					int var7 = var4 & 15; // L: 3562
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 3563
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 3564
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3565
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3566
					int var8 = (var2 - 64) / 128; // L: 3567
					int var9 = (var3 - 64) / 128; // L: 3568
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 3569
					++Client.soundEffectCount; // L: 3570
				}
			}
		}
	} // L: 3571

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-131099529"
	)
	static void method3565(Buffer var0, int var1) {
		class22.method246(var0.array, var1); // L: 11628
		UserComparator9.method3513(var0, var1); // L: 11629
	} // L: 11630
}
