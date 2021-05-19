import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -57345859
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1034631213
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("o")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("g")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 752
		this.height = var2; // L: 753
		this.xWidths = var3; // L: 754
		this.xStarts = var4; // L: 755
	} // L: 756

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1887065714"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 759
			int var3 = this.xStarts[var2]; // L: 760
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 761
				return true;
			}
		}

		return false; // L: 763
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIIIII)V",
		garbageValue = "-565200159"
	)
	static final void method4580(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field683) { // L: 10106
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10107
		}

		Client.field683 = false; // L: 10108
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10109
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10110
				var0.scrollY -= 4; // L: 10111
				VerticalAlignment.invalidateWidget(var0); // L: 10112
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10114
				var0.scrollY += 4; // L: 10115
				VerticalAlignment.invalidateWidget(var0); // L: 10116
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10118
				var7 = var3 * (var3 - 32) / var4; // L: 10119
				if (var7 < 8) { // L: 10120
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10121
				int var9 = var3 - 32 - var7; // L: 10122
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10123
				VerticalAlignment.invalidateWidget(var0); // L: 10124
				Client.field683 = true; // L: 10125
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10128
			var7 = var0.width; // L: 10129
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10130
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10131
				VerticalAlignment.invalidateWidget(var0); // L: 10132
			}
		}

	} // L: 10135
}
