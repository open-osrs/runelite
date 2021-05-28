import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oc")
public class class390 {
	@ObfuscatedName("y")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1815237159
	)
	public final int field4219;
	@ObfuscatedName("n")
	public Object field4218;

	public class390(int var1) {
		this.field4219 = var1; // L: 8
	} // L: 9

	public class390(int var1, Object var2) {
		this.field4219 = var1; // L: 12
		this.field4218 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 17
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class390)) { // L: 21
			return false;
		} else {
			class390 var2 = (class390)var1; // L: 22
			if (var2.field4218 == null && this.field4218 != null) { // L: 23
				return false;
			} else if (this.field4218 == null && var2.field4218 != null) { // L: 24
				return false;
			} else {
				return var2.field4219 == this.field4219 && var2.field4218.equals(this.field4218); // L: 25
			}
		}
	}
}
