import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "206142404"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2136306285"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "634207470"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lij;",
		garbageValue = "43"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "342058266"
	)
	@Export("read")
	void read(Buffer var1);
}
