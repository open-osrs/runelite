import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1376484179
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -604518039
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -129447381
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1366610135
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -488074781
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -3701872394330512717L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1201244349
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
