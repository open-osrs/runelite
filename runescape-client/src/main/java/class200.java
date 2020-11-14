import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class200 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	static final class200 field2391;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	static final class200 field2390;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	static final class200 field2392;

	static {
		field2391 = new class200(); // L: 4
		field2390 = new class200(); // L: 5
		field2392 = new class200(); // L: 6
	}

	class200() {
	} // L: 8

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	public static void method3803() {
		ItemDefinition.ItemDefinition_cached.clear(); // L: 543
		ItemDefinition.ItemDefinition_cachedModels.clear(); // L: 544
		ItemDefinition.ItemDefinition_cachedSprites.clear(); // L: 545
	} // L: 546

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1508888429"
	)
	static void method3804() {
		if (PlayerType.localPlayer.x >> 7 == Client.destinationX && PlayerType.localPlayer.y >> 7 == Client.destinationY) { // L: 4809
			Client.destinationX = 0; // L: 4810
		}

	} // L: 4812
}
