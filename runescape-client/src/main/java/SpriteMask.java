import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1279799405
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1973837741
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("f")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("y")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 691
		this.height = var2; // L: 692
		this.xWidths = var3; // L: 693
		this.xStarts = var4; // L: 694
	} // L: 695

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1353633749"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 698
			int var3 = this.xStarts[var2]; // L: 699
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 700
				return true;
			}
		}

		return false; // L: 702
	}
}
