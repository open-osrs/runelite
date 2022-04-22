import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("p")
	public static short[][] field2356;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -916427651
	)
	@Export("width")
	int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 34585137
	)
	@Export("height")
	int height;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -504322827
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1729721737
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}
}
