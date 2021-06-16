import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("f")
	@Export("name")
	String name;
	@ObfuscatedName("e")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnb;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 11
		String var4;
		if (var1 == null) { // L: 15
			var4 = null; // L: 16
		} else {
			int var5 = 0; // L: 19

			int var6;
			for (var6 = var1.length(); var5 < var6 && SpriteMask.method4777(var1.charAt(var5)); ++var5) { // L: 20 21
			}

			while (var6 > var5 && SpriteMask.method4777(var1.charAt(var6 - 1))) { // L: 22
				--var6;
			}

			int var7 = var6 - var5; // L: 23
			if (var7 >= 1 && var7 <= Friend.method5773(var2)) { // L: 24
				StringBuilder var8 = new StringBuilder(var7); // L: 28

				for (int var9 = var5; var9 < var6; ++var9) { // L: 29
					char var10 = var1.charAt(var9); // L: 30
					if (Client.method1746(var10)) { // L: 31
						char var11 = WorldMapElement.method2732(var10); // L: 32
						if (var11 != 0) { // L: 33
							var8.append(var11); // L: 34
						}
					}
				}

				if (var8.length() == 0) { // L: 36
					var4 = null; // L: 37
				} else {
					var4 = var8.toString(); // L: 40
				}
			} else {
				var4 = null; // L: 25
			}
		}

		this.cleanName = var4; // L: 42
	} // L: 43

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-55"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 46
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 50
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)I",
		garbageValue = "-928498828"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 74
			return var1.cleanName == null ? 0 : 1; // L: 75 76
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 78 79
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 54
			Username var2 = (Username)var1; // L: 55
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 56
			} else if (var2.cleanName == null) { // L: 57
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 58 59
			}
		} else {
			return false; // L: 61
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 65 66
	}

	public String toString() {
		return this.getName(); // L: 70
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 83
	}
}
