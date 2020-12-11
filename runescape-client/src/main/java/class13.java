import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("c")
public final class class13 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V",
		garbageValue = "2"
	)
	public static void method129(AbstractArchive var0) {
		ParamDefinition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "-107"
	)
	static boolean method131(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 54
			try {
				if (!class60.field439.startsWith("win")) { // L: 56
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 57
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 58

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 59
						if (var13.indexOf(var0.charAt(var4)) == -1) { // L: 60
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 62
					return true; // L: 63
				}
			} catch (Throwable var8) { // L: 65
				return false; // L: 66
			}
		} else if (var1 == 1) { // L: 69
			try {
				Applet var7 = class60.applet; // L: 72
				Object[] var5 = new Object[]{(new URL(class60.applet.getCodeBase(), var0)).toString()}; // L: 73
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 76
				return var3 != null; // L: 79
			} catch (Throwable var9) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var10) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				class56.method901(class60.applet, "loggedout"); // L: 96
			} catch (Throwable var12) { // L: 98
			}

			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_top"); // L: 100
				return true; // L: 101
			} catch (Exception var11) { // L: 103
				return false; // L: 104
			}
		} else {
			throw new IllegalArgumentException(); // L: 107
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2039505638"
	)
	static int method132() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1701
			int var0 = 0; // L: 1702

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1703
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1704
			}

			return var0 * 10000 / Client.field666; // L: 1706
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "37077922"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field861 = 0L; // L: 4178
		if (var0 >= 2) { // L: 4179
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4180
		}

		if (SoundSystem.getWindowedMode() == 1) { // L: 4181
			WorldMapIcon_0.client.setMaxCanvasSize(765, 503); // L: 4182
		} else {
			WorldMapIcon_0.client.setMaxCanvasSize(7680, 2160); // L: 4185
		}

		if (Client.gameState >= 25) { // L: 4187
			MouseRecorder.method1264();
		}

	} // L: 4188

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lhe;III)V",
		garbageValue = "912859307"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10406
			if (var0 != null && Player.method1351(var0) != null) { // L: 10407
				Client.clickedWidget = var0; // L: 10408
				Client.clickedWidgetParent = Player.method1351(var0); // L: 10409
				Client.widgetClickX = var1; // L: 10410
				Client.widgetClickY = var2; // L: 10411
				ScriptFrame.widgetDragDuration = 0; // L: 10412
				Client.isDraggingWidget = false; // L: 10413
				int var3 = WorldMapSprite.method463(); // L: 10414
				if (var3 != -1) { // L: 10415
					WorldMapSection1.tempMenuAction = new MenuAction(); // L: 10416
					WorldMapSection1.tempMenuAction.param0 = Client.menuArguments1[var3]; // L: 10417
					WorldMapSection1.tempMenuAction.param1 = Client.menuArguments2[var3]; // L: 10418
					WorldMapSection1.tempMenuAction.opcode = Client.menuOpcodes[var3]; // L: 10419
					WorldMapSection1.tempMenuAction.identifier = Client.menuIdentifiers[var3]; // L: 10420
					WorldMapSection1.tempMenuAction.action = Client.menuActions[var3]; // L: 10421
				}

			}
		}
	} // L: 10423
}
