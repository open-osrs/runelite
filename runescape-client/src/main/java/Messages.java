import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("sb")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("z")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 785090077
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	static void method2288() {
		Tiles.field528 = null; // L: 64
		Tiles.field521 = null; // L: 65
		class297.field3668 = null; // L: 66
		class171.field2049 = null; // L: 67
		class204.field2421 = null; // L: 68
		class22.field122 = null; // L: 69
		class39.field282 = null; // L: 70
		Tiles.Tiles_hue = null; // L: 71
		Tiles.Tiles_saturation = null; // L: 72
		WorldMapRectangle.Tiles_lightness = null; // L: 73
		WorldMapScaleHandler.Tiles_hueMultiplier = null; // L: 74
		class60.field453 = null; // L: 75
	} // L: 76
}
