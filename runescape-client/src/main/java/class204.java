import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class204 {
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -815040413
	)
	static int field2420;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1826574669
	)
	static int field2422;
	@ObfuscatedName("ae")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;

	static {
		new HashMap();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1343176092"
	)
	public static int method3818(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}
}
