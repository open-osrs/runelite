import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 41501185
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 969764679
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1466324567
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 1931928399249517797L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1857453107
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11
}
