import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1487980993
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2109183059
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 184751419
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1907463847
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 334995477
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 4648548109869818167L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 512629061
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class43.pcmPlayer1 != null) { // L: 3059
			class43.pcmPlayer1.run();
		}

		if (ApproximateRouteStrategy.pcmPlayer0 != null) { // L: 3060
			ApproximateRouteStrategy.pcmPlayer0.run();
		}

	} // L: 3061

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-230387884"
	)
	static boolean method3787(int var0) {
		for (int var1 = 0; var1 < Client.field827; ++var1) { // L: 10872
			if (Client.field792[var1] == var0) { // L: 10873
				return true;
			}
		}

		return false; // L: 10875
	}
}
