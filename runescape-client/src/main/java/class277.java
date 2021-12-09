import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class277 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "4096"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 148
	}
}
