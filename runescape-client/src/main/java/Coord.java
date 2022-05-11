import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 98471251
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("r")
	public static short[] field3352;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1023382847
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1531148769
	)
	@Export("x")
	public int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -991712687
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lkd;)V"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "60"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane; // L: 31
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)Z",
		garbageValue = "-95969340"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) { // L: 49
			return false;
		} else {
			return this.y == var1.y; // L: 50
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "959391461"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 42
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 43 44
		}
	}

	public String toString() {
		return this.toString(","); // L: 60
	}

	public int hashCode() {
		return this.packed(); // L: 56
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "474672865"
	)
	public static boolean method5370() {
		return class273.musicPlayerStatus != 0 ? true : class273.midiPcmStream.isReady(); // L: 68 69
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1630457870"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 150
	}
}
