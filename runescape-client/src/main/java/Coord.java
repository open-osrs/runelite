import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	static class353 field3013;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1806986797
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -753316605
	)
	@Export("x")
	public int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 380498553
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "14599100"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane;
		int var3 = this.x;
		int var4 = this.y;
		int var1 = var2 << 28 | var3 << 14 | var4;
		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)Z",
		garbageValue = "1532243849"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1257462561"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
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

	public String toString() {
		return this.toString(",");
	}
}
