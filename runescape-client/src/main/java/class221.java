import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class221 {
	@ObfuscatedName("g")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "-1930935119"
	)
	static void method4198(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 26
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 27
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 29
					return; // L: 30
				} catch (Exception var5) { // L: 32
				}
			}

			if (class44.field294.startsWith("win") && !var3) { // L: 34 35
				class311.method5605(var0, 0, "openjs");
				return; // L: 39
			}

			if (class44.field294.startsWith("mac")) { // L: 42
				class311.method5605(var0, 1, var2); // L: 43
				return; // L: 44
			}

			class311.method5605(var0, 2, "openjs"); // L: 47
		} else {
			class311.method5605(var0, 3, "openjs"); // L: 52
		}

	} // L: 55

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1932340849"
	)
	public static boolean method4200(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 37
	}
}
