import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("k")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -579877889
	)
	@Export("port1")
	static int port1;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 604273715
	)
	@Export("port2")
	static int port2;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1585489899
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 252017765
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -865171177
	)
	@Export("x")
	public int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1194018723
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-330056145"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y; // L: 30
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)Z",
		garbageValue = "824045461"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 40
			return false;
		} else if (this.x != var1.x) { // L: 41
			return false;
		} else {
			return this.y == var1.y; // L: 42
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-40"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 55
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 34
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 35 36
		}
	}

	public int hashCode() {
		return this.packed(); // L: 47
	}

	public String toString() {
		return this.toString(","); // L: 51
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1944404"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4748
			var2 = 1;
		}

		if (var3 < 1) { // L: 4749
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4750
		int var6;
		if (var5 < 0) { // L: 4752
			var6 = Client.field873;
		} else if (var5 >= 100) { // L: 4753
			var6 = Client.field932;
		} else {
			var6 = (Client.field932 - Client.field873) * var5 / 100 + Client.field873; // L: 4754
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4755
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field937) { // L: 4756
			var14 = Client.field937; // L: 4757
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4758
			if (var6 > Client.field753) { // L: 4759
				var6 = Client.field753; // L: 4760
				var8 = var3 * var6 * 512 / (var14 * 334); // L: 4761
				var9 = (var2 - var8) / 2; // L: 4762
				if (var4) { // L: 4763
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4764
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4765
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4766
				}

				var0 += var9; // L: 4768
				var2 -= var9 * 2; // L: 4769
			}
		} else if (var7 > Client.field935) { // L: 4772
			var14 = Client.field935; // L: 4773
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4774
			if (var6 < Client.field865) { // L: 4775
				var6 = Client.field865; // L: 4776
				var8 = var14 * var2 * 334 / (var6 * 512); // L: 4777
				var9 = (var3 - var8) / 2; // L: 4778
				if (var4) { // L: 4779
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4780
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4781
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4782
				}

				var1 += var9; // L: 4784
				var3 -= var9 * 2; // L: 4785
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4788
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4789
			int[] var13 = new int[9]; // L: 4791

			for (var9 = 0; var9 < var13.length; ++var9) { // L: 4792
				int var10 = var9 * 32 + 15 + 128; // L: 4793
				int var11 = MilliClock.method3587(var10); // L: 4794
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4795
				var11 = HorizontalAlignment.method4876(var11, var3); // L: 4796
				var13[var9] = var11 * var12 >> 16; // L: 4797
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334); // L: 4799
		}

		Client.viewportOffsetX = var0; // L: 4802
		Client.viewportOffsetY = var1; // L: 4803
		Client.viewportWidth = var2; // L: 4804
		Client.viewportHeight = var3; // L: 4805
	} // L: 4806
}
