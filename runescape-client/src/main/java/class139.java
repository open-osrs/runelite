import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class139 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 276144893
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -135678653
	)
	static int field1560;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhu;",
		garbageValue = "83"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 188
		int var2 = var0 & 65535; // L: 189
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) { // L: 190
			boolean var3 = class15.loadInterface(var1); // L: 191
			if (!var3) { // L: 192
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2]; // L: 194
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	public static void method2669() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 50
			synchronized(MouseHandler.MouseHandler_instance) { // L: 51
				MouseHandler.MouseHandler_instance = null; // L: 52
			} // L: 53
		}

	} // L: 55
}
