import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qr")
public class class450 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 599765167
	)
	public final int field4765;
	@ObfuscatedName("v")
	public Object field4766;

	public class450(int var1) {
		this.field4765 = var1; // L: 8
	} // L: 9

	public class450(int var1, Object var2) {
		this.field4765 = var1; // L: 12
		this.field4766 = var2; // L: 13
	} // L: 14

	public boolean equals(Object var1) {
		if (!(var1 instanceof class450)) { // L: 23
			return false;
		} else {
			class450 var2 = (class450)var1; // L: 24
			if (var2.field4766 == null && this.field4766 != null) { // L: 25
				return false;
			} else if (this.field4766 == null && var2.field4766 != null) { // L: 26
				return false;
			} else {
				return var2.field4765 == this.field4765 && var2.field4766.equals(this.field4766); // L: 27
			}
		}
	}

	public int hashCode() {
		return super.hashCode(); // L: 18
	}
}
