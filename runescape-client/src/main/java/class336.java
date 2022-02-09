import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
public class class336 {
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "19073"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class13.loadInterface(var0)) { // L: 11465
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 11466

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11467
				Widget var3 = var1[var2]; // L: 11468
				if (var3 != null) { // L: 11469
					var3.modelFrame = 0; // L: 11470
					var3.modelFrameCycle = 0; // L: 11471
				}
			}

		}
	} // L: 11473
}
