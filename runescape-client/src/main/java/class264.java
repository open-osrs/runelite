import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class264 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class264 field3341;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class264 field3340;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class264 field3339;

	static {
		field3341 = new class264(); // L: 4
		field3340 = new class264(); // L: 5
		field3339 = new class264(); // L: 6
	}

	class264() {
	} // L: 8

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)I",
		garbageValue = "-1827294520"
	)
	static int method4680(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 179
		int var2;
		if (var1 == 0) { // L: 181
			var2 = 0;
		} else if (var1 == 1) { // L: 182
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 183
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 184
		}

		return var2; // L: 185
	}
}
