import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("bh")
	@Export("otp")
	static String otp;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -745325341
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -356491535
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1775559987
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 877483017
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-32383"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;I)V",
		garbageValue = "-281933087"
	)
	public void method5954(Bounds var1, Bounds var2) {
		this.method5955(var1, var2); // L: 33
		this.method5960(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;I)V",
		garbageValue = "-1998327311"
	)
	void method5955(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 38
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) { // L: 40
			var2.highX = (var2.highX * 528588283 - (var1.lowX * 528588283 - this.lowX * 528588283)) * 1775559987; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method5957() > var1.method5957()) { // L: 44
			var2.highX -= var2.method5957() - var1.method5957(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;I)V",
		garbageValue = "-1461929335"
	)
	void method5960(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * 1104968249 - (var1.lowY * 1104968249 - this.lowY * 1104968249)) * 877483017; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method5958() > var1.method5958()) { // L: 57
			var2.highY -= var2.method5958() - var1.method5958(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method5957() {
		return this.lowX + this.highX; // L: 64
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1442149182"
	)
	int method5958() {
		return this.lowY + this.highY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1536625645"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 3852
			var2 = 1;
		}

		if (var3 < 1) { // L: 3853
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 3854
		int var6;
		if (var5 < 0) { // L: 3856
			var6 = Client.field855;
		} else if (var5 >= 100) { // L: 3857
			var6 = Client.field856;
		} else {
			var6 = (Client.field856 - Client.field855) * var5 / 100 + Client.field855; // L: 3858
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 3859
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field707) { // L: 3860
			var17 = Client.field707; // L: 3861
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 3862
			if (var6 > Client.field742) { // L: 3863
				var6 = Client.field742; // L: 3864
				var8 = var3 * var6 * 512 / (var17 * 334); // L: 3865
				var9 = (var2 - var8) / 2; // L: 3866
				if (var4) { // L: 3867
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 3868
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 3869
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 3870
				}

				var0 += var9; // L: 3872
				var2 -= var9 * 2; // L: 3873
			}
		} else if (var7 > Client.field862) { // L: 3876
			var17 = Client.field862; // L: 3877
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 3878
			if (var6 < Client.field859) { // L: 3879
				var6 = Client.field859; // L: 3880
				var8 = var17 * var2 * 334 / (var6 * 512); // L: 3881
				var9 = (var3 - var8) / 2; // L: 3882
				if (var4) { // L: 3883
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 3884
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 3885
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 3886
				}

				var1 += var9; // L: 3888
				var3 -= var9 * 2; // L: 3889
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 3892
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 3893
			int[] var16 = new int[9]; // L: 3895

			for (var9 = 0; var9 < var16.length; ++var9) { // L: 3896
				int var10 = var9 * 32 + 15 + 128; // L: 3897
				int var11 = WorldMapID.method3116(var10); // L: 3898
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 3899
				int var14 = var3 - 334; // L: 3902
				if (var14 < 0) { // L: 3903
					var14 = 0;
				} else if (var14 > 100) { // L: 3904
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight; // L: 3905
				int var13 = var11 * var15 / 256; // L: 3906
				var16[var9] = var12 * var13 >> 16; // L: 3909
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334); // L: 3911
		}

		Client.viewportOffsetX = var0; // L: 3914
		Client.viewportOffsetY = var1; // L: 3915
		Client.viewportWidth = var2; // L: 3916
		Client.viewportHeight = var3; // L: 3917
	} // L: 3918
}
