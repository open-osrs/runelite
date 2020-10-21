import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class228 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1970011251"
	)
	public static void method4246(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 51
	} // L: 52

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lht;III)V",
		garbageValue = "-615693889"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10844
			if (var0 != null) { // L: 10846
				Widget var5 = var0; // L: 10850
				int var7 = WorldMapData_0.getWidgetFlags(var0); // L: 10853
				int var6 = var7 >> 17 & 7; // L: 10855
				int var8 = var6; // L: 10857
				Widget var4;
				int var9;
				if (var6 == 0) { // L: 10858
					var4 = null; // L: 10859
				} else {
					var9 = 0;

					while (true) {
						if (var9 >= var8) {
							var4 = var5; // L: 10869
							break;
						}

						var5 = UserComparator4.getWidget(var5.parentId); // L: 10863
						if (var5 == null) { // L: 10864
							var4 = null; // L: 10865
							break; // L: 10866
						}

						++var9; // L: 10862
					}
				}

				Widget var10 = var4; // L: 10871
				if (var4 == null) { // L: 10872
					var10 = var0.parent;
				}

				if (var10 != null) { // L: 10875
					Client.clickedWidget = var0; // L: 10879
					var5 = var0; // L: 10883
					var7 = WorldMapData_0.getWidgetFlags(var0); // L: 10886
					var6 = var7 >> 17 & 7; // L: 10888
					var8 = var6; // L: 10890
					if (var6 == 0) { // L: 10891
						var4 = null; // L: 10892
					} else {
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5; // L: 10902
								break;
							}

							var5 = UserComparator4.getWidget(var5.parentId); // L: 10896
							if (var5 == null) { // L: 10897
								var4 = null; // L: 10898
								break; // L: 10899
							}

							++var9; // L: 10895
						}
					}

					var10 = var4; // L: 10904
					if (var4 == null) { // L: 10905
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10; // L: 10908
					Client.widgetClickX = var1; // L: 10909
					Client.widgetClickY = var2; // L: 10910
					GrandExchangeEvent.widgetDragDuration = 0; // L: 10911
					Client.isDraggingWidget = false; // L: 10912
					int var11 = FileSystem.method3638(); // L: 10913
					if (var11 != -1) { // L: 10914
						AbstractByteArrayCopier.method4087(var11);
					}

					return; // L: 10915
				}
			}

		}
	} // L: 10877
}
