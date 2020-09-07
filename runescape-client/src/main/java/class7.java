import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public enum class7 implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	field37(0, 0);

	@ObfuscatedName("g")
	static int[] field39;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static IndexedSprite field36;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = 1039444805
	)
	static int field40;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1712649125
	)
	final int field35;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 969088693
	)
	final int field38;

	class7(int var3, int var4) {
		this.field35 = var3;
		this.field38 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field38; // L: 17
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lw;I)Lh;",
		garbageValue = "1469756534"
	)
	public static class12 method102(class7 var0) {
		switch(var0.field35) { // L: 9
		case 0:
			return new class5(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2096801183"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Client.soundEffectVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3277
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3278
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3279
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3280
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3281
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3282
			++Client.soundEffectCount; // L: 3283
		}

	} // L: 3285
}
