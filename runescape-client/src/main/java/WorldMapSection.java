import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "112"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-90"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-5"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-76"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Lhd;",
		garbageValue = "-1841969392"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-489268143"
	)
	@Export("read")
	void read(Buffer var1);
}
