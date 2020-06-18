import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gv")
public class class182 {
	@ObfuscatedName("q")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("j")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 773651675
	)
	static int field2132;
	@ObfuscatedName("u")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("a")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 525602501
	)
	@Export("baseX")
	static int baseX;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}
}
