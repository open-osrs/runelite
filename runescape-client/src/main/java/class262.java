import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class262 {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1378458919"
	)
	static void method5136() {
		class392.method6871(ObjectComposition.menuWidth / 2 + SecureRandomCallable.menuX, Frames.menuY); // L: 8227
	} // L: 8228

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "292857439"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9134
			Widget var0 = ItemContainer.getWidgetChild(FontName.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9135
			if (var0 != null && var0.onTargetLeave != null) { // L: 9136
				ScriptEvent var1 = new ScriptEvent(); // L: 9137
				var1.widget = var0; // L: 9138
				var1.args = var0.onTargetLeave; // L: 9139
				Tile.runScriptEvent(var1); // L: 9140
			}

			Client.field627 = -1; // L: 9142
			Client.isSpellSelected = false; // L: 9143
			class184.invalidateWidget(var0); // L: 9144
		}
	} // L: 9145
}
