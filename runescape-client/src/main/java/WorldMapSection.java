import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)V",
		garbageValue = "-1521793701"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2091891709"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-59"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-604533765"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lko;",
		garbageValue = "-41254697"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "119"
	)
	@Export("read")
	void read(Buffer var1);
}
