import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class313 {
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([Lio;Lio;ZI)V",
		garbageValue = "1078266988"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1489642403 * 1932863499 : var1.width * -1921178137 * 1163271639; // L: 9756
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -1137939101 * 1577090123 : var1.height * 202863387 * -571887853; // L: 9757
		class27.resizeInterface(var0, var1.id, var3, var4, var2); // L: 9758
		if (var1.children != null) { // L: 9759
			class27.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 9760
		if (var5 != null) {
			PlayerType.method4857(var5.group, var3, var4, var2); // L: 9761
		}

		if (var1.contentType == 1337) { // L: 9762
		}

	} // L: 9763

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIIIIII)V",
		garbageValue = "584848260"
	)
	static final void method5617(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field708) { // L: 9821
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 9822
		}

		Client.field708 = false; // L: 9823
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 9824
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 9825
				var0.scrollY -= 4; // L: 9826
				WorldMapCacheName.invalidateWidget(var0); // L: 9827
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 9829
				var0.scrollY += 4; // L: 9830
				WorldMapCacheName.invalidateWidget(var0); // L: 9831
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 9833
				var7 = var3 * (var3 - 32) / var4; // L: 9834
				if (var7 < 8) { // L: 9835
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 9836
				int var9 = var3 - 32 - var7; // L: 9837
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 9838
				WorldMapCacheName.invalidateWidget(var0); // L: 9839
				Client.field708 = true; // L: 9840
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 9843
			var7 = var0.width; // L: 9844
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 9845
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 9846
				WorldMapCacheName.invalidateWidget(var0); // L: 9847
			}
		}

	} // L: 9850
}
