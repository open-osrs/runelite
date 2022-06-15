import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class258 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "1865423313"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		AbstractWorldMapData.method4987(var0, var1, "openjs", var2); // L: 22
	} // L: 23
}
