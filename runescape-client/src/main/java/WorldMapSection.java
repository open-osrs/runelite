import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "806489369"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1721879281"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "898039462"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "499785766"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljd;",
		garbageValue = "90"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-121"
	)
	@Export("read")
	void read(Buffer var1);
}
