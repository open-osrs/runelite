import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class186 {
	@ObfuscatedName("s")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("e")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("w")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("v")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1493030738"
	)
	public static int method3692(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "51"
	)
	public static int method3690(int var0) {
		return KeyHandler.method355(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 64
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1541497261"
	)
	static void method3695(int var0, int var1) {
		if (class424.clientPreferences.musicVolume != 0 && var0 != -1) { // L: 3465
			MenuAction.method1894(class252.archive11, var0, 0, class424.clientPreferences.musicVolume, false); // L: 3466
			Client.field744 = true; // L: 3467
		}

	} // L: 3469
}
