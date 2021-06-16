import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 833712115
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1197266213
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("v")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("y")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 718
		this.height = var2; // L: 719
		this.xWidths = var3; // L: 720
		this.xStarts = var4; // L: 721
	} // L: 722

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1133848125"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 725
			int var3 = this.xStarts[var2]; // L: 726
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 727
				return true;
			}
		}

		return false; // L: 729
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-99"
	)
	public static final boolean method4777(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 48
	}
}
