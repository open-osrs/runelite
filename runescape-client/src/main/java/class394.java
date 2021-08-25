import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class394 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1028780537"
	)
	static final void method6737() {
		int var0 = WorldMapRegion.menuX;
		int var1 = ApproximateRouteStrategy.menuY;
		int var2 = VarcInt.menuWidth;
		int var3 = WorldMapLabelSize.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		class11.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31;
			var9 = 16777215;
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}

			Font var12 = class11.fontBold12;
			String var13;
			if (var7 < 0) {
				var13 = "";
			} else if (Client.menuTargets[var7].length() > 0) {
				var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var13 = Client.menuActions[var7];
			}

			var12.draw(var13, var0 + 3, var8, var9, 0);
		}

		var7 = WorldMapRegion.menuX;
		var8 = ApproximateRouteStrategy.menuY;
		var9 = VarcInt.menuWidth;
		int var10 = WorldMapLabelSize.menuHeight;

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
			if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
				Client.field766[var11] = true;
			}
		}

	}
}
