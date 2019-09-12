import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1583830617
	)
	static int field3594;
	@ObfuscatedName("c")
	@Export("name")
	String name;
	@ObfuscatedName("x")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lll;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			int var5 = 0;

			int var6;
			boolean var7;
			char var8;
			for (var6 = var1.length(); var5 < var6; ++var5) {
				var8 = var1.charAt(var5);
				var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
				if (!var7) {
					break;
				}
			}

			while (var6 > var5) {
				var8 = var1.charAt(var6 - 1);
				var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
				if (!var7) {
					break;
				}

				--var6;
			}

			int var17 = var6 - var5;
			if (var17 >= 1 && var17 <= TaskHandler.method3464(var2)) {
				StringBuilder var15 = new StringBuilder(var17);

				for (int var9 = var5; var9 < var6; ++var9) {
					char var10 = var1.charAt(var9);
					boolean var11;
					if (Character.isISOControl(var10)) {
						var11 = false;
					} else if (HealthBar.isAlphaNumeric(var10)) {
						var11 = true;
					} else {
						char[] var16 = class338.field4037;
						int var13 = 0;

						label95:
						while (true) {
							char var14;
							if (var13 >= var16.length) {
								var16 = class338.field4038;

								for (var13 = 0; var13 < var16.length; ++var13) {
									var14 = var16[var13];
									if (var14 == var10) {
										var11 = true;
										break label95;
									}
								}

								var11 = false;
								break;
							}

							var14 = var16[var13];
							if (var10 == var14) {
								var11 = true;
								break;
							}

							++var13;
						}
					}

					if (var11) {
						char var12;
						switch(var10) {
						case ' ':
						case '-':
						case '_':
						case ' ':
							var12 = '_';
							break;
						case '#':
						case '[':
						case ']':
							var12 = var10;
							break;
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
							var12 = 'a';
							break;
						case 'Ç':
						case 'ç':
							var12 = 'c';
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var12 = 'e';
							break;
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var12 = 'i';
							break;
						case 'Ñ':
						case 'ñ':
							var12 = 'n';
							break;
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
							var12 = 'o';
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var12 = 'u';
							break;
						case 'ß':
							var12 = 'b';
							break;
						case 'ÿ':
						case 'Ÿ':
							var12 = 'y';
							break;
						default:
							var12 = Character.toLowerCase(var10);
						}

						if (var12 != 0) {
							var15.append(var12);
						}
					}
				}

				if (var15.length() == 0) {
					var4 = null;
				} else {
					var4 = var15.toString();
				}
			} else {
				var4 = null;
			}
		}

		this.cleanName = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1478069507"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1276407986"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Ljt;I)I",
		garbageValue = "1717930485"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}

	public String toString() {
		return this.getName();
	}

	public String aai() {
		return this.getName();
	}

	public String aan() {
		return this.getName();
	}

	public String aar() {
		return this.getName();
	}
}
