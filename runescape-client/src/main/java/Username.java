import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("t")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("z")
	@Export("name")
	String name;
	@ObfuscatedName("k")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmu;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 11
		String var4;
		if (var1 == null) { // L: 15
			var4 = null; // L: 16
		} else {
			int var5 = 0; // L: 19

			int var6;
			boolean var7;
			char var8;
			for (var6 = var1.length(); var5 < var6; ++var5) { // L: 20 23
				var8 = var1.charAt(var5); // L: 25
				var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 27
				if (!var7) { // L: 29
					break;
				}
			}

			while (var6 > var5) { // L: 37
				var8 = var1.charAt(var6 - 1); // L: 39
				var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 41
				if (!var7) { // L: 43
					break;
				}

				--var6; // L: 47
			}

			int var13 = var6 - var5; // L: 49
			if (var13 >= 1 && var13 <= GrandExchangeOfferUnitPriceComparator.method211(var2)) { // L: 50
				StringBuilder var12 = new StringBuilder(var13); // L: 54

				for (int var9 = var5; var9 < var6; ++var9) { // L: 55
					char var10 = var1.charAt(var9); // L: 56
					if (WorldMapSprite.method496(var10)) { // L: 57
						char var11 = class307.method5555(var10); // L: 58
						if (var11 != 0) { // L: 59
							var12.append(var11); // L: 60
						}
					}
				}

				if (var12.length() == 0) { // L: 62
					var4 = null; // L: 63
				} else {
					var4 = var12.toString(); // L: 66
				}
			} else {
				var4 = null; // L: 51
			}
		}

		this.cleanName = var4; // L: 68
	} // L: 69

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2006682850"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 72
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 76
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)I",
		garbageValue = "-354391485"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 100
			return var1.cleanName == null ? 0 : 1; // L: 101 102
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 104 105
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 80
			Username var2 = (Username)var1; // L: 81
			if (this.cleanName == null) { // L: 82
				return var2.cleanName == null;
			} else if (var2.cleanName == null) { // L: 83
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 84 85
			}
		} else {
			return false; // L: 87
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 91 92
	}

	public String toString() {
		return this.getName(); // L: 96
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 109
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llq;IIB)I",
		garbageValue = "29"
	)
	static int method5309(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}
}
