import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("c")
	@Export("name")
	String name;
	@ObfuscatedName("v")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpe;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 16
		this.cleanName = UserComparator5.method2580(var1, var2); // L: 17
	} // L: 18

	public Username(String var1) {
		this.name = var1; // L: 11
		this.cleanName = UserComparator5.method2580(var1, LoginType.oldscape); // L: 12
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1398829508"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1713644314"
	)
	public String method8320() {
		return this.cleanName; // L: 25
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-54"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 29
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)I",
		garbageValue = "113609215"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 56
			return var1.cleanName == null ? 0 : 1; // L: 57 58
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 60 61
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 34
			Username var2 = (Username)var1; // L: 35
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 36
			} else if (var2.cleanName == null) { // L: 37
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 38 39
			}
		} else {
			return false; // L: 41
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 46 47
	}

	public String toString() {
		return this.getName(); // L: 52
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 65
	}
}
