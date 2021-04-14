import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class379 {
	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1966944763"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class15.loadInterface(var0)) { // L: 10879
			Clock.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1); // L: 10880
		}
	} // L: 10881
}
