import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 10914297
	)
	@Export("width")
	int width;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1439555673
	)
	@Export("height")
	int height;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -959506253
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1518441747
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhp;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 305
	}
}
