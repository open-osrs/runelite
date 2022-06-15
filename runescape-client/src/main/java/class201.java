import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class201 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Ldc;"
	)
	class115[] field2365;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -77062685
	)
	int field2366;

	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V"
	)
	class201(Buffer var1, int var2) {
		this.field2365 = new class115[var2]; // L: 13
		this.field2366 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2365.length; ++var3) { // L: 15
			class115 var4 = new class115(this.field2366, var1, false); // L: 16
			this.field2365[var3] = var4; // L: 17
		}

		this.method4131(); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1005826580"
	)
	void method4131() {
		class115[] var1 = this.field2365; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class115 var3 = var1[var2]; // L: 26
			if (var3.field1448 >= 0) { // L: 28
				var3.field1440 = this.field2365[var3.field1448]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method4130() {
		return this.field2365.length; // L: 37
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldc;",
		garbageValue = "-62"
	)
	class115 method4123(int var1) {
		return this.field2365[var1]; // L: 41
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldc;",
		garbageValue = "1269137329"
	)
	class115[] method4124() {
		return this.field2365; // L: 45
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lda;II)V",
		garbageValue = "-1587521432"
	)
	void method4146(class122 var1, int var2) {
		this.method4126(var1, var2, (boolean[])null, false); // L: 49
	} // L: 50

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lda;I[ZZI)V",
		garbageValue = "-482543177"
	)
	void method4126(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2766(); // L: 53
		int var6 = 0; // L: 54
		class115[] var7 = this.method4124(); // L: 56

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 57
			class115 var9 = var7[var8]; // L: 58
			if (var3 == null || var4 == var3[var6]) { // L: 60
				var1.method2790(var2, var9, var6, var5); // L: 61
			}

			++var6; // L: 63
		}

	} // L: 67

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-102591137"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4718
			var2 = 1;
		}

		if (var3 < 1) { // L: 4719
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4720
		int var6;
		if (var5 < 0) { // L: 4722
			var6 = Client.field748;
		} else if (var5 >= 100) { // L: 4723
			var6 = Client.field749;
		} else {
			var6 = (Client.field749 - Client.field748) * var5 / 100 + Client.field748; // L: 4724
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4725
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field754) { // L: 4726
			var17 = Client.field754; // L: 4727
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 4728
			if (var6 > Client.field753) { // L: 4729
				var6 = Client.field753; // L: 4730
				var8 = var3 * var6 * 512 / (var17 * 334); // L: 4731
				var9 = (var2 - var8) / 2; // L: 4732
				if (var4) { // L: 4733
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4734
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4735
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4736
				}

				var0 += var9; // L: 4738
				var2 -= var9 * 2; // L: 4739
			}
		} else if (var7 > Client.field755) { // L: 4742
			var17 = Client.field755; // L: 4743
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 4744
			if (var6 < Client.field752) { // L: 4745
				var6 = Client.field752; // L: 4746
				var8 = var17 * var2 * 334 / (var6 * 512); // L: 4747
				var9 = (var3 - var8) / 2; // L: 4748
				if (var4) { // L: 4749
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4750
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4751
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4752
				}

				var1 += var9; // L: 4754
				var3 -= var9 * 2; // L: 4755
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4758
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4759
			int[] var16 = new int[9]; // L: 4761

			for (var9 = 0; var9 < var16.length; ++var9) { // L: 4762
				int var10 = var9 * 32 + 15 + 128; // L: 4763
				int var11 = GZipDecompressor.method8314(var10); // L: 4764
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4765
				int var14 = var3 - 334; // L: 4768
				if (var14 < 0) { // L: 4769
					var14 = 0;
				} else if (var14 > 100) { // L: 4770
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight; // L: 4771
				int var13 = var15 * var11 / 256; // L: 4772
				var16[var9] = var13 * var12 >> 16; // L: 4775
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334); // L: 4777
		}

		Client.viewportOffsetX = var0; // L: 4780
		Client.viewportOffsetY = var1; // L: 4781
		Client.viewportWidth = var2; // L: 4782
		Client.viewportHeight = var3; // L: 4783
	} // L: 4784

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "868430801"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class126.scrollBarSprites[0].drawAt(var0, var1); // L: 10751
		class126.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10752
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field556); // L: 10753
		int var5 = var3 * (var3 - 32) / var4; // L: 10754
		if (var5 < 8) { // L: 10755
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10756
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field653); // L: 10757
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field553); // L: 10758
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field553); // L: 10759
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field553); // L: 10760
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field553); // L: 10761
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field558); // L: 10762
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field558); // L: 10763
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field558); // L: 10764
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field558); // L: 10765
	} // L: 10766
}
