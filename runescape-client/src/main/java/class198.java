import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class198 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)I",
		garbageValue = "832734688"
	)
	static int method3851(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 181
		int var2;
		if (var1 == 0) { // L: 183
			var2 = 0;
		} else if (var1 == 1) { // L: 184
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 185
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 186
		}

		return var2; // L: 187
	}
}
