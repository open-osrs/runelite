import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1077391881
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1797231219
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1767125369
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -640480651195446405L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1116841185
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11
}
