import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qd")
public class class445 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -994672853
	)
	public final int field4683;
	@ObfuscatedName("c")
	public Object field4681;

	public class445(int var1) {
		this.field4683 = var1; // L: 8
	} // L: 9

	public class445(int var1, Object var2) {
		this.field4683 = var1; // L: 12
		this.field4681 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 17
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class445)) { // L: 21
			return false;
		} else {
			class445 var2 = (class445)var1; // L: 22
			if (var2.field4681 == null && this.field4681 != null) { // L: 23
				return false;
			} else if (this.field4681 == null && var2.field4681 != null) { // L: 24
				return false;
			} else {
				return this.field4683 == var2.field4683 && var2.field4681.equals(this.field4681); // L: 25
			}
		}
	}
}
