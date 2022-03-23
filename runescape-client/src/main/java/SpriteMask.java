import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 367264807
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1985758175
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("h")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("g")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 950
		this.height = var2; // L: 951
		this.xWidths = var3; // L: 952
		this.xStarts = var4; // L: 953
	} // L: 954

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1554135078"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 957
			int var3 = this.xStarts[var2]; // L: 958
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 959
				return true;
			}
		}

		return false; // L: 961
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-16"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10571
	} // L: 10572
}
