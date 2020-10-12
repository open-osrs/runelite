import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class235 {
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	static Sprite[] mapDotSprites;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 3836
			if (WorldMapSprite.loadInterface(var0)) { // L: 3837
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 3838

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 3839
					Widget var3 = var1[var2]; // L: 3840
					if (var3.onLoad != null) { // L: 3841
						ScriptEvent var4 = new ScriptEvent(); // L: 3842
						var4.widget = var3; // L: 3843
						var4.args = var3.onLoad; // L: 3844
						class280.runScript(var4, 5000000); // L: 3845
					}
				}

			}
		}
	} // L: 3848
}
