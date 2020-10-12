import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public final class class52 {
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1416486083
	)
	static int field396;

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "2097597667"
	)
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field881) { // L: 10259
			Client.field882[var0.rootIndex] = true; // L: 10260
		}

	} // L: 10262
}
