import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "964088357"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1337137401"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1769831605"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1941144122"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lks;",
		garbageValue = "-670243838"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-860121653"
	)
	@Export("read")
	void read(Buffer var1);
}
