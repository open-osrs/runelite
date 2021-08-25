import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -198278747
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1381503255
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2051093029
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 298359965
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1660964825
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1820881555
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1424936291
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 5051446358328224037L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1181556671
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	public static void method4494() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

	}
}
