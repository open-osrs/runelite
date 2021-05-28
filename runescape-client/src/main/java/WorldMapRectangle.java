import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1091176811
	)
	@Export("width")
	int width;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 946840675
	)
	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1906627729
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1404335247
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 305
	}
}
