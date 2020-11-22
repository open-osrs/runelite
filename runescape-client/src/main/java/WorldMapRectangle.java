import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -822197791
	)
	@Export("width")
	int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2015029351
	)
	@Export("height")
	int height;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -352971205
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1080355853
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lat;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}
}
