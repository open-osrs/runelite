import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ia")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -360796493
	)
	static int field2664;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1964753239
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 538442569
	)
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 708188277
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8
}
