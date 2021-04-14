import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-609192354"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2146205978"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-916390789"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1101045563"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lhk;",
		garbageValue = "1643926479"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-576756767"
	)
	@Export("read")
	void read(Buffer var1);
}
