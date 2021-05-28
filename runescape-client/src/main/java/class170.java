import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class170 {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1604021821"
	)
	public static boolean method3552(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 21
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method3551() {
		Login.loginIndex = 24; // L: 1648
		class260.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1649
	} // L: 1650

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1716136591"
	)
	static void method3554() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 10798
			int var1 = var0.group; // L: 10799
			if (Clock.loadInterface(var1)) { // L: 10800
				boolean var2 = true; // L: 10801
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 10802

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 10803
					if (var3[var4] != null) { // L: 10804
						var2 = var3[var4].isIf3; // L: 10805
						break;
					}
				}

				if (!var2) { // L: 10809
					var4 = (int)var0.key; // L: 10810
					Widget var5 = Frames.getWidget(var4); // L: 10811
					if (var5 != null) { // L: 10812
						WorldMapCacheName.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 10816
}
