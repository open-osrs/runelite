import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -541304415
	)
	static int field2535;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1788605819
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -4289719
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("x")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("w")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 689
		this.height = var2; // L: 690
		this.xWidths = var3; // L: 691
		this.xStarts = var4; // L: 692
	} // L: 693

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "20494"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 696
			int var3 = this.xStarts[var2]; // L: 697
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 698
				return true;
			}
		}

		return false; // L: 700
	}
}
