import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class149 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbi;",
		garbageValue = "-90"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var5 = Huffman.method5480(var3, var0); // L: 43
		if (var5 != null) { // L: 44
			return var5; // L: 45
		} else {
			int var6 = (-3 - var2 << 8) + var0; // L: 49
			var5 = Huffman.method5480(var6, var0); // L: 52
			return var5 != null ? var5 : null; // L: 53 56
		}
	}
}
