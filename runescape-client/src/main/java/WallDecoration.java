import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1273290179
	)
	@Export("z")
	int z;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1499164855
	)
	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2128198353
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1183896313
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 632137083
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -35989305
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 322472367
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 2319004435936735131L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1666426439
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16
}
