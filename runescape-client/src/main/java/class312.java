import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class312 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-92832695"
	)
	static final int method5606(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 984
		var2 ^= var2 << 13; // L: 985
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 986
		return var3 >> 19 & 255; // L: 987
	}
}
