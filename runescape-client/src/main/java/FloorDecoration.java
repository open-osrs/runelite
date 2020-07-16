import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 423292381861362449L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1344836879
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -732713561
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -799217819
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("entity")
	public Entity entity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1173464785
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("o")
	static boolean method2977(long var0) {
		return class171.method3571(var0) == 2;
	}
}
