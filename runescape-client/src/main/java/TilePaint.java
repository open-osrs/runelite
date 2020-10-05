import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("TilePaint")
public final class TilePaint {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive13;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -533090373
	)
	int swColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -141428387
	)
	int seColor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2027106077
	)
	int neColor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1015841735
	)
	int nwColor;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1352493759
	)
	int texture;
	@ObfuscatedName("o")
	boolean isFlat;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 248691895
	)
	int rgb;

	TilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "-24"
	)
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (AbstractByteArrayCopier.World_worlds != null) { // L: 171
			WorldMapRegion.doWorldSorting(0, AbstractByteArrayCopier.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174
}
