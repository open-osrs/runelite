import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -578473323
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1743960415
	)
	@Export("x")
	public int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1369689255
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lhs;)V"
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

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)Z",
		garbageValue = "902297370"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1856185425"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 55
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 36
		}
	}

	public int hashCode() {
		return this.packed(); // L: 47
	}

	public String toString() {
		return this.toString(","); // L: 51
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-676384531"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition) VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}
}
