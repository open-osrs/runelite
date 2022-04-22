import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("w")
	public static boolean field3289;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1984638055
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1078309335
	)
	@Export("x")
	public int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -585894477
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lks;)V"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	@Export("packed")
	public int packed() {
		return class341.method6280(this.plane, this.x, this.y); // L: 30
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lks;B)Z",
		garbageValue = "53"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 44
			return false;
		} else if (this.x != var1.x) { // L: 45
			return false;
		} else {
			return this.y == var1.y; // L: 46
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "74"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 59
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 38
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 39 40
		}
	}

	public int hashCode() {
		return this.packed(); // L: 51
	}

	public String toString() {
		return this.toString(","); // L: 55
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method5531() {
		int var0 = class138.menuX; // L: 8630
		int var1 = class1.menuY; // L: 8631
		int var2 = ItemComposition.menuWidth; // L: 8632
		int var3 = ByteArrayPool.menuHeight; // L: 8633
		int var4 = 6116423; // L: 8634
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8635
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8636
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8637
		RouteStrategy.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8638
		int var5 = MouseHandler.MouseHandler_x; // L: 8639
		int var6 = MouseHandler.MouseHandler_y; // L: 8640

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8641
			int var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31; // L: 8642
			int var9 = 16777215; // L: 8643
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8644
				var9 = 16776960;
			}

			RouteStrategy.fontBold12.draw(AbstractUserComparator.method6736(var7), var0 + 3, var8, var9, 0); // L: 8645
		}

		ScriptEvent.method2092(class138.menuX, class1.menuY, ItemComposition.menuWidth, ByteArrayPool.menuHeight); // L: 8647
	} // L: 8648
}
