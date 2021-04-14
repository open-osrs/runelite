import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("f")
	@Export("name")
	String name;
	@ObfuscatedName("o")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmf;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 11
		this.cleanName = class336.method5978(var1, var2); // L: 12
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-44870609"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 16
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1020088991"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 20
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)I",
		garbageValue = "1145898443"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 44
			return var1.cleanName == null ? 0 : 1; // L: 45 46
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 48 49
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 24
			Username var2 = (Username)var1; // L: 25
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 26
			} else if (var2.cleanName == null) { // L: 27
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 28 29
			}
		} else {
			return false; // L: 31
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 35 36
	}

	public String toString() {
		return this.getName(); // L: 40
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 53
	}
}
