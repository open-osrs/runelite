import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1666950009
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2121076865
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1721468405
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -1483946918703188851L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -895600119
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "296096631"
	)
	static boolean method3799() {
		return (Client.drawPlayerNames & 1) != 0; // L: 4834
	}
}
