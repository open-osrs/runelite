import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field1839;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -440159509
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("mouseWheel")
	static class158 mouseWheel;

	Clock() {
	} // L: 4

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1993169750"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1389334721"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "43"
	)
	public static int method3249(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lki;I)Ljava/lang/String;",
		garbageValue = "2108423281"
	)
	static String method3248(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10716
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10717
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10719
					if (var3 == -1) { // L: 10720
						break;
					}

					var0 = var0.substring(0, var3) + class14.method165(Players.method2413(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 10721
				}
			}
		}

		return var0; // L: 10725
	}
}
