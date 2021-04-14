import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nl")
public class class389 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1604550251
	)
	public final int field4215;
	@ObfuscatedName("o")
	public Object field4216;

	public class389(int var1) {
		this.field4215 = var1; // L: 8
	} // L: 9

	public class389(int var1, Object var2) {
		this.field4215 = var1; // L: 12
		this.field4216 = var2; // L: 13
	} // L: 14

	public boolean equals(Object var1) {
		if (!(var1 instanceof class389)) { // L: 21
			return false;
		} else {
			class389 var2 = (class389)var1; // L: 22
			if (var2.field4216 == null && this.field4216 != null) { // L: 23
				return false;
			} else if (this.field4216 == null && var2.field4216 != null) { // L: 24
				return false;
			} else {
				return var2.field4215 == this.field4215 && var2.field4216.equals(this.field4216); // L: 25
			}
		}
	}

	public int hashCode() {
		return super.hashCode(); // L: 17
	}
}
