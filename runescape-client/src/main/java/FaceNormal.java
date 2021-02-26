import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -687013303
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1872981457
	)
	@Export("y")
	int y;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -522101521
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1093535932"
	)
	public static boolean method3421(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class298.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}
}
