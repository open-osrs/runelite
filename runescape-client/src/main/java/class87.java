import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class87 {
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("hr")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "1474886022"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (class139.Widget_interfaceComponents[var1] == null || class139.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = class317.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return class139.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "285950247"
	)
	public static int method2183(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 0 & 127L);
		return var1;
	}
}
