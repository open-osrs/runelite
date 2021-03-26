import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1552197653
	)
	@Export("width")
	int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 522429537
	)
	@Export("height")
	int height;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1426976537
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1260779731
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BI)Llm;",
		garbageValue = "-1825283733"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var3 * var2]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "1269350728"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 52
				} catch (Exception var4) { // L: 34
				}
			}

			if (class60.field454.startsWith("win")) { // L: 36
				ClientPreferences.method1972(var0, 0); // L: 38
			} else if (class60.field454.startsWith("mac")) { // L: 42
				class204.method3888(var0, 1, "openjs"); // L: 43
			} else {
				ClientPreferences.method1972(var0, 2); // L: 46
			}
		} else {
			ClientPreferences.method1972(var0, 3); // L: 49
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lmc;",
		garbageValue = "59696754"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 221
		if (var3.exists()) { // L: 222
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 224
				return var10; // L: 225
			} catch (IOException var9) { // L: 227
			}
		}

		String var4 = ""; // L: 229
		if (JagexCache.cacheGamebuild == 33) { // L: 230
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 231
			var4 = "_wip";
		}

		File var5 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 232
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 233
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 235
				return var6; // L: 236
			} catch (IOException var8) { // L: 238
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 241
			return var6; // L: 242
		} catch (IOException var7) { // L: 244
			throw new RuntimeException(); // L: 245
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1194982929"
	)
	static final void method354() {
		int var0 = Players.Players_count; // L: 3493
		int[] var1 = Players.Players_indices; // L: 3494

		for (int var2 = 0; var2 < var0; ++var2) { // L: 3495
			Player var3 = Client.players[var1[var2]]; // L: 3496
			if (var3 != null) { // L: 3497
				class171.updateActorSequence(var3, 1); // L: 3498
			}
		}

	} // L: 3501

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1726408780"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 9904

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 9905
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 9906
		}

		if (var1.length() > 9) { // L: 9908
			return " " + FileSystem.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + FileSystem.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + FileSystem.colorStartTag(16776960) + var1 + "</col>"; // L: 9909 9910
		}
	}
}
