import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 948728571
	)
	static int field1038;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1931274229
	)
	int cycle;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1765683631
	)
	int health;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1932254665
	)
	int health2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -488536303
	)
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1655201695"
	)
	public static boolean method1815() {
		return class206.musicPlayerStatus != 0 ? true : class206.midiPcmStream.isReady(); // L: 59 60
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1341706343"
	)
	static final void method1818() {
		Scene.Scene_isLowDetail = false; // L: 779
		Client.isLowDetail = false; // L: 780
	} // L: 781

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-487929114"
	)
	static final void method1817(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7049
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7050
				Client.field883[var4] = true;
			}
		}

	} // L: 7052
}
