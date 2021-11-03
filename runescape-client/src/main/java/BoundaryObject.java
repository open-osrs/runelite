import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("bm")
	static String field2618;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1005985993
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -906574175
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -405320811
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -989748679
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -278128521
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 4551271496275992869L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 709360475
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
