import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public final class class300 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1395576392"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return TextureProvider.method4963(var0, 10, true); // L: 34
	}
}
