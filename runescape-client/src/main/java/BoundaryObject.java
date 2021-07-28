import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -1924657947
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1178102363
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2140931437
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -691288565
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -287218543
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 780112513
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -849579815865927251L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1574259549
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
