import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		longValue = 3393919401906433013L
	)
	static long field2727;
	@ObfuscatedName("b")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1161754740"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64]; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "230861091"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 53
				} catch (Exception var4) { // L: 29
				}
			}

			if (class29.field177.startsWith("win")) { // L: 31
				NPC.method2314(var0, 0, "openjs"); // L: 34
			} else if (class29.field177.startsWith("mac")) { // L: 39
				NPC.method2314(var0, 1, "openjs"); // L: 40
			} else {
				NPC.method2314(var0, 2, "openjs"); // L: 44
			}
		} else {
			NPC.method2314(var0, 3, "openjs"); // L: 49
		}

	}
}
