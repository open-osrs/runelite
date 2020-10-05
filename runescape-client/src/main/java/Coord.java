import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -877871317
	)
	public int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1594066417
	)
	public int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1889586591
	)
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y; // L: 30
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)Z",
		garbageValue = "24386397"
	)
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 40
			return false;
		} else if (this.x != var1.x) { // L: 41
			return false;
		} else {
			return this.y == var1.y; // L: 42
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-34"
	)
	static final int method4083(int var0, int var1) {
		if (var0 == -2) { // L: 871
			return 12345678;
		} else if (var0 == -1) { // L: 872
			if (var1 < 2) { // L: 873
				var1 = 2;
			} else if (var1 > 126) { // L: 874
				var1 = 126;
			}

			return var1; // L: 875
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 877
			if (var1 < 2) { // L: 878
				var1 = 2;
			} else if (var1 > 126) { // L: 879
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 880
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lcg;B)V",
		garbageValue = "115"
	)
	static final void method4084(Actor var0) {
		int var1 = Math.max(1, var0.field1026 - Client.cycle); // L: 3829
		int var2 = var0.field1014 * 64 + var0.field997 * 128; // L: 3830
		int var3 = var0.field1014 * 64 + var0.field1016 * 128; // L: 3831
		var0.x += (var2 - var0.x) / var1; // L: 3832
		var0.y += (var3 - var0.y) / var1; // L: 3833
		var0.field1032 = 0; // L: 3834
		var0.orientation = var0.field1027; // L: 3835
	} // L: 3836

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IB)V",
		garbageValue = "-77"
	)
	static final void method4086(Actor var0, int var1) {
		class89.worldToScreen(var0.x, var0.y, var1); // L: 4941
	} // L: 4942

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIIILlp;Lhz;I)V",
		garbageValue = "-334370993"
	)
	static final void worldToMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 10644
		if (var6 > 4225 && var6 < 90000) { // L: 10645
			int var7 = Client.camAngleY & 2047; // L: 10646
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 10647
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 10648
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 10649
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 10650
			double var12 = Math.atan2((double)var10, (double)var11); // L: 10651
			int var14 = var5.width / 2 - 25; // L: 10652
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 10653
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 10654
			byte var17 = 20; // L: 10655
			FontName.redHintArrowSprite.method6264(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 10656
		} else {
			HealthBar.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 10658
		}

	} // L: 10659
}
