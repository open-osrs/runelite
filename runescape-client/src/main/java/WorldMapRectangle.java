import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1169726605
	)
	@Export("width")
	int width;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1795160043
	)
	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 65148741
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1075815641
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgd;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}
}
