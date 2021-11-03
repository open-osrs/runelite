import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 136807485
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1011180321
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("s")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("a")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 731
		this.height = var2; // L: 732
		this.xWidths = var3; // L: 733
		this.xStarts = var4; // L: 734
	} // L: 735

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "75"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 738
			int var3 = this.xStarts[var2]; // L: 739
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 740
				return true;
			}
		}

		return false; // L: 742
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-23"
	)
	static String method4998(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1302166518"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 154
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-404139593"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4974
			var2 = 1;
		}

		if (var3 < 1) { // L: 4975
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4976
		int var6;
		if (var5 < 0) { // L: 4978
			var6 = Client.field464;
		} else if (var5 >= 100) { // L: 4979
			var6 = Client.field550;
		} else {
			var6 = (Client.field550 - Client.field464) * var5 / 100 + Client.field464; // L: 4980
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4981
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field729) { // L: 4982
			var15 = Client.field729; // L: 4983
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 4984
			if (var6 > Client.field600) { // L: 4985
				var6 = Client.field600; // L: 4986
				var8 = var3 * var6 * 512 / (var15 * 334); // L: 4987
				var9 = (var2 - var8) / 2; // L: 4988
				if (var4) { // L: 4989
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4990
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4991
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4992
				}

				var0 += var9; // L: 4994
				var2 -= var9 * 2; // L: 4995
			}
		} else if (var7 > Client.field730) { // L: 4998
			var15 = Client.field730; // L: 4999
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 5000
			if (var6 < Client.field727) { // L: 5001
				var6 = Client.field727; // L: 5002
				var8 = var15 * var2 * 334 / (var6 * 512); // L: 5003
				var9 = (var3 - var8) / 2; // L: 5004
				if (var4) { // L: 5005
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5006
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5007
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5008
				}

				var1 += var9; // L: 5010
				var3 -= var9 * 2; // L: 5011
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5014
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5015
			int[] var14 = new int[9]; // L: 5017

			for (var9 = 0; var9 < var14.length; ++var9) { // L: 5018
				int var10 = var9 * 32 + 15 + 128; // L: 5019
				int var11 = var10 * 3 + 600; // L: 5022
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 5025
				int var12 = class150.method2971(var11, var3); // L: 5026
				var14[var9] = var12 * var13 >> 16; // L: 5027
			}

			Scene.Scene_buildVisiblityMap(var14, 500, 800, var2 * 334 / var3, 334); // L: 5029
		}

		Client.viewportOffsetX = var0; // L: 5032
		Client.viewportOffsetY = var1; // L: 5033
		Client.viewportWidth = var2; // L: 5034
		Client.viewportHeight = var3; // L: 5035
	} // L: 5036
}
