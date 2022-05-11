import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1072704917
	)
	@Export("z")
	int z;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1879154845
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -514738537
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 7063129096182387665L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 43519557
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11
}
