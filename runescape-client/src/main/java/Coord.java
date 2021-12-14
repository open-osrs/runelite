import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("q")
	@Export("operatingSystemName")
	public static String operatingSystemName;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	static AbstractSocket field3186;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2028633895
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -115571391
	)
	@Export("x")
	public int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -193761027
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lju;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "844590476"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane;
		int var3 = this.x;
		int var4 = this.y;
		int var1 = var2 << 28 | var3 << 14 | var4;
		return var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lju;B)Z",
		garbageValue = "-21"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1213799253"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public String toString() {
		return this.toString(",");
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public int hashCode() {
		return this.packed();
	}
}
