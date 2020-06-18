import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lad;I)V",
		garbageValue = "411670415"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "48"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "459340529"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(III)Lhg;",
		garbageValue = "1240901536"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lkn;B)V",
		garbageValue = "0"
	)
	@Export("read")
	void read(Buffer var1);
}
