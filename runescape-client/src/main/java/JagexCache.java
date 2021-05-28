import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lio;B)Ljava/lang/String;",
		garbageValue = "109"
	)
	static String method2540(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9703
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9704
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 9706
					if (var3 == -1) { // L: 9707
						break;
					}

					String var4 = var0.substring(0, var3); // L: 9708
					int var6 = ModeWhere.method5160(var1, var2 - 1); // L: 9710
					String var5;
					if (var6 < 999999999) { // L: 9712
						var5 = Integer.toString(var6); // L: 9713
					} else {
						var5 = "*"; // L: 9716
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 9718
				}
			}
		}

		return var0; // L: 9722
	}
}
