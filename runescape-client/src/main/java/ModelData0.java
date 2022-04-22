import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-1428405987"
	)
	public static void method5093(Applet var0, String var1) {
		class29.field176 = var0; // L: 22
		if (var1 != null) { // L: 23
			class29.field175 = var1;
		}

	} // L: 24

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1801328016"
	)
	public static int method5091(int var0, int var1, int var2) {
		int var3 = class54.method1078(var2 - var1 + 1); // L: 43
		var3 <<= var1; // L: 44
		var0 |= var3; // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "([Lky;IIIZI)V",
		garbageValue = "1997359276"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10805
			Widget var6 = var0[var5]; // L: 10806
			if (var6 != null && var6.parentId == var1) { // L: 10807 10808
				ApproximateRouteStrategy.alignWidgetSize(var6, var2, var3, var4); // L: 10809
				HealthBarUpdate.alignWidgetPosition(var6, var2, var3); // L: 10810
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10811
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10812
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10813
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10814
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10815
					AbstractByteArrayCopier.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10817
}
