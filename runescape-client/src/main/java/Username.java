import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("v")
	@Export("name")
	String name;
	@ObfuscatedName("n")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnc;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 11
		String var4;
		if (var1 == null) { // L: 15
			var4 = null; // L: 16
		} else {
			label115: {
				int var5 = 0; // L: 19

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) { // L: 20 23 33
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

				int var14 = var6 - var5; // L: 49
				if (var14 >= 1) { // L: 51
					byte var9;
					if (var2 == null) { // L: 55
						var9 = 12; // L: 56
					} else {
						switch(var2.field4092) { // L: 59
						case 8:
							var9 = 20;
							break;
						default:
							var9 = 12; // L: 64
						}
					}

					if (var14 <= var9) { // L: 68
						StringBuilder var13 = new StringBuilder(var14); // L: 73

						for (int var15 = var5; var15 < var6; ++var15) { // L: 74
							char var10 = var1.charAt(var15); // L: 75
							if (class14.method188(var10)) { // L: 76
								char var11;
								switch(var10) { // L: 79
								case ' ':
								case '-':
								case '_':
								case ' ':
									var11 = '_'; // L: 106
									break; // L: 107
								case '#':
								case '[':
								case ']':
									var11 = var10; // L: 97
									break; // L: 98
								case 'À':
								case 'Á':
								case 'Â':
								case 'Ã':
								case 'Ä':
								case 'à':
								case 'á':
								case 'â':
								case 'ã':
								case 'ä':
									var11 = 'a'; // L: 118
									break; // L: 119
								case 'Ç':
								case 'ç':
									var11 = 'c'; // L: 126
									break; // L: 127
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var11 = 'e'; // L: 88
									break;
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var11 = 'i'; // L: 137
									break; // L: 138
								case 'Ñ':
								case 'ñ':
									var11 = 'n'; // L: 122
									break; // L: 123
								case 'Ò':
								case 'Ó':
								case 'Ô':
								case 'Õ':
								case 'Ö':
								case 'ò':
								case 'ó':
								case 'ô':
								case 'õ':
								case 'ö':
									var11 = 'o'; // L: 149
									break; // L: 150
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var11 = 'u'; // L: 159
									break;
								case 'ß':
									var11 = 'b'; // L: 129
									break; // L: 130
								case 'ÿ':
								case 'Ÿ':
									var11 = 'y'; // L: 92
									break; // L: 93
								default:
									var11 = Character.toLowerCase(var10); // L: 100
								}

								if (var11 != 0) { // L: 164
									var13.append(var11); // L: 165
								}
							}
						}

						if (var13.length() == 0) { // L: 167
							var4 = null; // L: 168
						} else {
							var4 = var13.toString(); // L: 171
						}
						break label115;
					}
				}

				var4 = null; // L: 70
			}
		}

		this.cleanName = var4; // L: 173
	} // L: 174

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2072568808"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 177
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 181
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)I",
		garbageValue = "831558423"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 205
			return var1.cleanName == null ? 0 : 1; // L: 206 207
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 209 210
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 185
			Username var2 = (Username)var1; // L: 186
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 187
			} else if (var2.cleanName == null) { // L: 188
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 189 190
			}
		} else {
			return false; // L: 192
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 196 197
	}

	public String toString() {
		return this.getName(); // L: 201
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 214
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "717003887"
	)
	static char method5877(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 61 62
	}
}
