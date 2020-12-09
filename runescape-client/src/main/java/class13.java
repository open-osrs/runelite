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
		ParamDefinition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "-107"
	)
	static boolean method131(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class60.field439.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class60.applet;
				Object[] var5 = new Object[]{(new URL(class60.applet.getCodeBase(), var0)).toString()};
				Object var3 = null;
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class56.method901(class60.applet, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2039505638"
	)
	static int method132() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field666;
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
		Client.field861 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (SoundSystem.getWindowedMode() == 1) {
			WorldMapIcon_0.client.setMaxCanvasSize(765, 503);
		} else {
			WorldMapIcon_0.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			MouseRecorder.method1264();
		}

	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lhe;III)V",
		garbageValue = "912859307"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && Player.method1351(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = Player.method1351(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				ScriptFrame.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = WorldMapSprite.method463();
				if (var3 != -1) {
					WorldMapSection1.tempMenuAction = new MenuAction();
					WorldMapSection1.tempMenuAction.param0 = Client.menuArguments1[var3];
					WorldMapSection1.tempMenuAction.param1 = Client.menuArguments2[var3];
					WorldMapSection1.tempMenuAction.opcode = Client.menuOpcodes[var3];
					WorldMapSection1.tempMenuAction.identifier = Client.menuIdentifiers[var3];
					WorldMapSection1.tempMenuAction.action = Client.menuActions[var3];
				}

			}
		}
	}
}
