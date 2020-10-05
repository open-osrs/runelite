import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1396616335
	)
	static int field2552;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2052975947
	)
	public final int width;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -583477063
	)
	public final int height;
	@ObfuscatedName("s")
	public final int[] xWidths;
	@ObfuscatedName("t")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 712
		this.height = var2; // L: 713
		this.xWidths = var3; // L: 714
		this.xStarts = var4; // L: 715
	} // L: 716

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1864355280"
	)
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 719
			int var3 = this.xStarts[var2]; // L: 720
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 721
				return true;
			}
		}

		return false; // L: 723
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)Ljava/lang/String;",
		garbageValue = "1504596976"
	)
	static String Widget_getSpellActionName(Widget var0) {
		if (GrandExchangeOfferTotalQuantityComparator.Widget_unpackTargetMask(WorldMapIcon_0.getWidgetFlags(var0)) == 0) { // L: 10744
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 10745 10746 10748
		}
	}
}
