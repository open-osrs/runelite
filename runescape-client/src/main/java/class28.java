import java.io.File;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class28 {
	@ObfuscatedName("f")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive15")
	static Archive archive15;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1511751941"
	)
	static final void method390() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7719 7720 7726
			if (var0.hitpoints == -1) { // L: 7721
				var0.delay = 0; // L: 7722
				class163.method3315(var0); // L: 7723
			} else {
				var0.remove(); // L: 7725
			}
		}

	} // L: 7728

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "157439460"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9830
			if (Client.menuOptionsCount < 500) { // L: 9831
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9832
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9833
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9834
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9835
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9836
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9837
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9838
				++Client.menuOptionsCount; // L: 9839
			}

		}
	} // L: 9841
}
