import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class41 {
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("es")
	static int[] field356;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "1083486417"
	)
	static void method846(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class16.field87.startsWith("win") && !var3) {
				ObjectComposition.method3015(var0, 0, "openjs");
				return;
			}

			if (class16.field87.startsWith("mac")) {
				ObjectComposition.method3015(var0, 1, var2);
				return;
			}

			ObjectComposition.method3015(var0, 2, "openjs");
		} else {
			ObjectComposition.method3015(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CLkq;I)I",
		garbageValue = "-856867473"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-12"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1490093410"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field647) {
			DynamicObject.method1727();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Decimator.clientPreferences.musicVolume != 0 && !Client.field647) {
			UserComparator5.method2162(2, class108.archive6, var0, 0, Decimator.clientPreferences.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1413225584"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (Huffman.loadInterface(var0)) {
			UrlRequest.field1224 = null;
			StructComposition.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (UrlRequest.field1224 != null) {
				StructComposition.drawInterface(UrlRequest.field1224, -1412584499, var1, var2, var3, var4, PcmPlayer.field191, MouseRecorder.field976, var7);
				UrlRequest.field1224 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field616[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field616[var8] = true;
				}
			}

		}
	}
}
