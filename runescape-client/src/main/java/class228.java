import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class228 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-541975328"
	)
	public static int method4190(CharSequence var0, int var1) {
		return UserComparator7.parseIntCustomRadix(var0, var1, true); // L: 71
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1840634740"
	)
	public static int method4189(String var0) {
		return var0.length() + 2; // L: 130
	}
}
