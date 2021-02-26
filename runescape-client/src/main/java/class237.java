import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class237 {
	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "361522526"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 195
		int var2 = var0 & 65535; // L: 196
		if (DefaultsGroup.Widget_interfaceComponents[var1] == null || DefaultsGroup.Widget_interfaceComponents[var1][var2] == null) { // L: 197
			boolean var3 = WorldMapCacheName.loadInterface(var1); // L: 198
			if (!var3) { // L: 199
				return null;
			}
		}

		return DefaultsGroup.Widget_interfaceComponents[var1][var2]; // L: 201
	}
}
