import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1585144359
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 615772211
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -961076053
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 697476863
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1786552595
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 570291309614965945L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1509654997
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
