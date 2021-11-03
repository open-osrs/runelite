import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-320838712"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9298
			if (Client.menuOptionsCount < 500) { // L: 9299
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9300
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9301
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9302
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9303
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9304
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9305
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9306
				++Client.menuOptionsCount; // L: 9307
			}

		}
	} // L: 9309
}
