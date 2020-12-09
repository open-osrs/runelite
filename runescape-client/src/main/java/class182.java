import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gc")
public class class182 {
	@ObfuscatedName("x")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("w")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -611809779
	)
	public static int field2115;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -405492077
	)
	public static int field2121;
	@ObfuscatedName("p")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("l")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -1967646503
	)
	static int field2112;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -652373903
	)
	@Export("menuHeight")
	static int menuHeight;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}
}
