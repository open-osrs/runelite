import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class358 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-16"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4722
			if (MusicPatchNode2.loadInterface(var0)) { // L: 4723
				Widget[] var1 = EnumComposition.Widget_interfaceComponents[var0]; // L: 4724

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4725
					Widget var3 = var1[var2]; // L: 4726
					if (var3.onLoad != null) { // L: 4727
						ScriptEvent var4 = new ScriptEvent(); // L: 4728
						var4.widget = var3; // L: 4729
						var4.args = var3.onLoad; // L: 4730
						class175.runScript(var4, 5000000, 0); // L: 4731
					}
				}

			}
		}
	} // L: 4734
}
