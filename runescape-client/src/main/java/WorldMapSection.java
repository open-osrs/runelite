import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "2018229058"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-964071790"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "381612084"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "88"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Lic;",
		garbageValue = "2033247854"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "4"
	)
	@Export("read")
	void read(Buffer var1);
}
