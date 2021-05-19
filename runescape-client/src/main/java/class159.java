import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fn")
public class class159 {
	@ObfuscatedName("o")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("g")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1190800743
	)
	public static int field1920;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -18293283
	)
	public static int field1924;
	@ObfuscatedName("v")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("b")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("gn")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("q")
	static final void method3135(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 96
	} // L: 97
}
