import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1988235731
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1511932377
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 750074813
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1760283661
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1111812521
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2026318183
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1292762417
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 3146556658035252985L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -740686461
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16
}
