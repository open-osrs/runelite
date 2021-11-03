import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-1844012640"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1501827396"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-356013678"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-79"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;",
		garbageValue = "494177498"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-682362313"
	)
	@Export("read")
	void read(Buffer var1);
}
