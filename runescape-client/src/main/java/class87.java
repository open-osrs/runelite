import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class87 {
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1182301979
	)
	static int field1218;

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1336454088"
	)
	public static void method2222() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-717884109"
	)
	public static int method2224(int var0) {
		return RouteStrategy.method3679(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 72
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	static final void method2220() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7284 7285 7291
			if (var0.hitpoints == -1) { // L: 7286
				var0.delay = 0; // L: 7287
				class296.method5489(var0); // L: 7288
			} else {
				var0.remove(); // L: 7290
			}
		}

	} // L: 7293

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-526331207"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		HitSplatDefinition.method3454(); // L: 8129
		Client.menuActions[0] = "Cancel"; // L: 8130
		Client.menuTargets[0] = ""; // L: 8131
		Client.menuOpcodes[0] = 1006; // L: 8132
		Client.menuShiftClick[0] = false; // L: 8133
		Client.menuOptionsCount = 1; // L: 8134
	} // L: 8135

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-44"
	)
	static final void method2221(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8138
			if (Client.showMouseOverText) { // L: 8139
				int var2 = Client.menuOptionsCount - 1; // L: 8142
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8146
					var4 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8147
					var4 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var4 = class144.method2969(var2); // L: 8148
				}

				if (Client.menuOptionsCount > 2) { // L: 8149
					var4 = var4 + LoginScreenAnimation.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class408.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8150
			}
		}
	} // L: 8151
}
