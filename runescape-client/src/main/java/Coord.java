import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1443965225
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 463916309
	)
	@Export("x")
	public int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 759274921
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lia;)V"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1657786881"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y; // L: 30
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lia;S)Z",
		garbageValue = "-559"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "64"
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
}
