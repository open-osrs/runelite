import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("q")
	static int[] field2560;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1010419141
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1636543291
	)
	@Export("x")
	public int x;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1486415971
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lhd;)V"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "71745539"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhd;S)Z",
		garbageValue = "144"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "31"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1310695522"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 54
		if (var0 < 0 || var0 >= 65536) { // L: 55
			var0 >>>= 16; // L: 56
			var1 += 16; // L: 57
		}

		if (var0 >= 256) { // L: 59
			var0 >>>= 8; // L: 60
			var1 += 8; // L: 61
		}

		if (var0 >= 16) { // L: 63
			var0 >>>= 4; // L: 64
			var1 += 4; // L: 65
		}

		if (var0 >= 4) { // L: 67
			var0 >>>= 2; // L: 68
			var1 += 2; // L: 69
		}

		if (var0 >= 1) { // L: 71
			var0 >>>= 1; // L: 72
			++var1; // L: 73
		}

		return var0 + var1; // L: 75
	}
}
