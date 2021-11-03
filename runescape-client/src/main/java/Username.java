import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("i")
	@Export("name")
	String name;
	@ObfuscatedName("w")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lni;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 16
		this.cleanName = GameEngine.method585(var1, var2); // L: 17
	} // L: 18

	public Username(String var1) {
		this.name = var1; // L: 11
		this.cleanName = GameEngine.method585(var1, LoginType.oldscape); // L: 12
	} // L: 13

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "98"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 21
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-74292372"
	)
	public String method7579() {
		return this.cleanName; // L: 25
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "89"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 29
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lpb;B)I",
		garbageValue = "6"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 53
			return var1.cleanName == null ? 0 : 1; // L: 54 55
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 57 58
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 33
			Username var2 = (Username)var1; // L: 34
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 35
			} else if (var2.cleanName == null) { // L: 36
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 37 38
			}
		} else {
			return false; // L: 40
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 44 45
	}

	public String toString() {
		return this.getName(); // L: 49
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 62
	}
}
