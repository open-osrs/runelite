import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("n")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-905018631"
	)
	public static void method371() {
		class135.midiPcmStream.clear();
		class247.musicPlayerStatus = 1;
		class247.musicTrackArchive = null;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljd;III)V",
		garbageValue = "-682005079"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = Message.method1099(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = Message.method1099(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					class125.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var5 = class28.method410();
					if (var5 != -1) {
						ArchiveDiskAction.tempMenuAction = new MenuAction();
						ArchiveDiskAction.tempMenuAction.param0 = Client.menuArguments1[var5];
						ArchiveDiskAction.tempMenuAction.param1 = Client.menuArguments2[var5];
						ArchiveDiskAction.tempMenuAction.opcode = Client.menuOpcodes[var5];
						ArchiveDiskAction.tempMenuAction.identifier = Client.menuIdentifiers[var5];
						ArchiveDiskAction.tempMenuAction.action = Client.menuActions[var5];
					}

					return;
				}
			}

		}
	}
}
