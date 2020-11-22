import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("f")
	@Export("name")
	String name;
	@ObfuscatedName("b")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmc;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 11
		this.cleanName = class323.method6048(var1, var2); // L: 12
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1362272434"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 16
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2074107082"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 20
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkm;I)I",
		garbageValue = "1900855669"
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

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 53
	}

	public String toString() {
		return this.getName(); // L: 40
	}
}
