import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class311 {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "17"
	)
	static void method5486(int var0, int var1) {
		if (class12.clientPreferences.musicVolume != 0 && var0 != -1) { // L: 3795
			World.method1684(KeyHandler.archive11, var0, 0, class12.clientPreferences.musicVolume, false); // L: 3796
			Client.field866 = true; // L: 3797
		}

	} // L: 3799

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "2108216334"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9087
			if (Client.menuOptionsCount < 500) { // L: 9088
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9089
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9090
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9091
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9092
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9093
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9094
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9095
				++Client.menuOptionsCount; // L: 9096
			}

		}
	} // L: 9098
}
