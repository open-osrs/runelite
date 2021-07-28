import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class65 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "127"
	)
	public static void method1796(Applet var0, String var1) {
		class16.applet = var0;
		if (var1 != null) {
			class16.field87 = var1;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "443719012"
	)
	public static boolean method1797(int var0) {
		return var0 >= WorldMapDecorationType.field3150.id && var0 <= WorldMapDecorationType.field3153.id;
	}
}
