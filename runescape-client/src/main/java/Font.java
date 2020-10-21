import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kq")
@Implements("Font")
public final class Font extends AbstractFont {
	public Font(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7); // L: 7
	} // L: 8

	public Font(byte[] var1) {
		super(var1); // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@Export("drawGlyph")
	final void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var3 * Rasterizer2D.Rasterizer2D_width + var2; // L: 15
		int var8 = Rasterizer2D.Rasterizer2D_width - var4; // L: 16
		int var9 = 0; // L: 17
		int var10 = 0; // L: 18
		int var11;
		if (var3 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 19
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var3; // L: 20
			var5 -= var11; // L: 21
			var3 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 22
			var10 += var11 * var4; // L: 23
			var7 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 24
		}

		if (var3 + var5 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 26
			var5 -= var3 + var5 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var2 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 27
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var2; // L: 28
			var4 -= var11; // L: 29
			var2 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 30
			var10 += var11; // L: 31
			var7 += var11; // L: 32
			var9 += var11; // L: 33
			var8 += var11; // L: 34
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 36
			var11 = var2 + var4 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 37
			var4 -= var11; // L: 38
			var9 += var11; // L: 39
			var8 += var11; // L: 40
		}

		if (var4 > 0 && var5 > 0) { // L: 42
			AbstractFont.AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var1, var6, var10, var7, var4, var5, var8, var9); // L: 43
		}
	} // L: 44

	@ObfuscatedName("b")
	@Export("drawGlyphAlpha")
	final void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var3 * Rasterizer2D.Rasterizer2D_width + var2; // L: 47
		int var9 = Rasterizer2D.Rasterizer2D_width - var4; // L: 48
		int var10 = 0; // L: 49
		int var11 = 0; // L: 50
		int var12;
		if (var3 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 51
			var12 = Rasterizer2D.Rasterizer2D_yClipStart - var3; // L: 52
			var5 -= var12; // L: 53
			var3 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 54
			var11 += var12 * var4; // L: 55
			var8 += var12 * Rasterizer2D.Rasterizer2D_width; // L: 56
		}

		if (var3 + var5 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 58
			var5 -= var3 + var5 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var2 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 59
			var12 = Rasterizer2D.Rasterizer2D_xClipStart - var2; // L: 60
			var4 -= var12; // L: 61
			var2 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 62
			var11 += var12; // L: 63
			var8 += var12; // L: 64
			var10 += var12; // L: 65
			var9 += var12; // L: 66
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 68
			var12 = var2 + var4 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 69
			var4 -= var12; // L: 70
			var10 += var12; // L: 71
			var9 += var12; // L: 72
		}

		if (var4 > 0 && var5 > 0) { // L: 74
			AbstractFont.AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, var11, var8, var4, var5, var9, var10, var7); // L: 75
		}
	} // L: 76
}
