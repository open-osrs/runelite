import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class193 {
	@ObfuscatedName("q")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("f")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1258310083
	)
	public static int field2219;
	@ObfuscatedName("w")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("y")
	@Export("bufferY")
	public static int[] bufferY;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "628542116"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapSection2.loadInterface(var0)) { // L: 10078
			class12.field62 = null; // L: 10085
			class14.drawInterface(SoundCache.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10086
			if (class12.field62 != null) { // L: 10087
				class14.drawInterface(class12.field62, -1412584499, var1, var2, var3, var4, UserComparator5.field1389, SecureRandomFuture.field960, var7); // L: 10088
				class12.field62 = null; // L: 10089
			}

		} else {
			if (var7 != -1) { // L: 10079
				Client.field703[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10081
					Client.field703[var8] = true;
				}
			}

		}
	} // L: 10083 10091

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "98"
	)
	static final int method3919() {
		float var0 = 200.0F * ((float)class19.clientPreferences.method2254() - 0.5F); // L: 11835
		return 100 - Math.round(var0); // L: 11836
	}
}
