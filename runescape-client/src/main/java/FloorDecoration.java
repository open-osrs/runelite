import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2081652561
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 744017517
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -381493142240489229L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2079626099
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -321570841
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/String;",
		garbageValue = "1701433854"
	)
	public static String method4029(Buffer var0) {
		return FloorOverlayDefinition.method3263(var0, 32767);
	}
}
