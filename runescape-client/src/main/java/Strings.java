import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("br")
	public static String field3011;
	@ObfuscatedName("cp")
	public static String field2877;
	@ObfuscatedName("ji")
	public static String field3053;
	@ObfuscatedName("jn")
	public static String field3054;
	@ObfuscatedName("jp")
	public static String field3055;

	static {
		field3011 = "Please visit the support page for assistance."; // L: 60
		field2877 = "Please visit the support page for assistance."; // L: 99
		field3053 = ""; // L: 275
		field3054 = "Page has opened in a new window."; // L: 276
		field3055 = "(Please check your popup blocker.)"; // L: 277
	} // L: 307

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Llo;",
		garbageValue = "1809126106"
	)
	static IndexedSprite method4158(boolean var0, boolean var1) {
		return var0 ? (var1 ? class204.field2408 : ItemContainer.options_buttons_2Sprite) : (var1 ? AccessFile.field4101 : DirectByteArrayCopier.options_buttons_0Sprite); // L: 183
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-851150981"
	)
	static final void method4157(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7342
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7343
				Client.field854[var4] = true;
			}
		}

	} // L: 7345
}
