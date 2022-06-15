import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "1585435431"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-929111713"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-47549823"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-561571792"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "531454030"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "-27"
	)
	@Export("read")
	void read(Buffer var1);
}
