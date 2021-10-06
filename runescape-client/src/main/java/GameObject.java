import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -293523157
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -643482159
	)
	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -104021669
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1641604505
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1488215561
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1181203843
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1333250787
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1281231503
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1442483421
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -853367381
	)
	int field2637;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1665390773
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -364049555401745921L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -321756317
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
