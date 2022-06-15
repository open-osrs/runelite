import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 512715127
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1018448231
	)
	@Export("z")
	int z;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 934546239
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 230480863
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -1913872919662932177L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1980232569
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11
}
