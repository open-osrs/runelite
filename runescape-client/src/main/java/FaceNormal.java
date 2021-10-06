import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -976866649
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1457506575
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2004790059
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "859115015"
	)
	public static int method4396(int var0, int var1) {
		return (var0 << 8) + var1;
	}
}
