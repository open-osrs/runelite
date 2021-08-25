import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1508031551
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("n")
	@Export("name")
	String name;
	@ObfuscatedName("c")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnf;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			int var5 = 0;

			int var6;
			for (var6 = var1.length(); var5 < var6 && FloorOverlayDefinition.method3277(var1.charAt(var5)); ++var5) {
			}

			while (var6 > var5 && FloorOverlayDefinition.method3277(var1.charAt(var6 - 1))) {
				--var6;
			}

			int var7 = var6 - var5;
			if (var7 >= 1 && var7 <= WorldMapLabel.method3810(var2)) {
				StringBuilder var8 = new StringBuilder(var7);

				for (int var9 = var5; var9 < var6; ++var9) {
					char var10 = var1.charAt(var9);
					boolean var11;
					if (Character.isISOControl(var10)) {
						var11 = false;
					} else if (UserComparator8.isAlphaNumeric(var10)) {
						var11 = true;
					} else {
						char[] var12 = class382.field4209;
						int var13 = 0;

						label68:
						while (true) {
							char var14;
							if (var13 >= var12.length) {
								var12 = class382.field4208;

								for (var13 = 0; var13 < var12.length; ++var13) {
									var14 = var12[var13];
									if (var10 == var14) {
										var11 = true;
										break label68;
									}
								}

								var11 = false;
								break;
							}

							var14 = var12[var13];
							if (var14 == var10) {
								var11 = true;
								break;
							}

							++var13;
						}
					}

					if (var11) {
						char var15 = class131.method2647(var10);
						if (var15 != 0) {
							var8.append(var15);
						}
					}
				}

				if (var8.length() == 0) {
					var4 = null;
				} else {
					var4 = var8.toString();
				}
			} else {
				var4 = null;
			}
		}

		this.cleanName = var4;
	}

	public Username(String var1) {
		this.name = var1;
		LoginType var4 = LoginType.oldscape;
		String var3;
		if (var1 == null) {
			var3 = null;
		} else {
			int var5 = 0;

			int var6;
			for (var6 = var1.length(); var5 < var6 && FloorOverlayDefinition.method3277(var1.charAt(var5)); ++var5) {
			}

			while (var6 > var5 && FloorOverlayDefinition.method3277(var1.charAt(var6 - 1))) {
				--var6;
			}

			int var7 = var6 - var5;
			if (var7 >= 1 && var7 <= WorldMapLabel.method3810(var4)) {
				StringBuilder var8 = new StringBuilder(var7);

				for (int var9 = var5; var9 < var6; ++var9) {
					char var10 = var1.charAt(var9);
					boolean var11;
					if (Character.isISOControl(var10)) {
						var11 = false;
					} else if (UserComparator8.isAlphaNumeric(var10)) {
						var11 = true;
					} else {
						char[] var12 = class382.field4209;
						int var13 = 0;

						label68:
						while (true) {
							char var14;
							if (var13 >= var12.length) {
								var12 = class382.field4208;

								for (var13 = 0; var13 < var12.length; ++var13) {
									var14 = var12[var13];
									if (var10 == var14) {
										var11 = true;
										break label68;
									}
								}

								var11 = false;
								break;
							}

							var14 = var12[var13];
							if (var10 == var14) {
								var11 = true;
								break;
							}

							++var13;
						}
					}

					if (var11) {
						char var15 = class131.method2647(var10);
						if (var15 != 0) {
							var8.append(var15);
						}
					}
				}

				if (var8.length() == 0) {
					var3 = null;
				} else {
					var3 = var8.toString();
				}
			} else {
				var3 = null;
			}
		}

		this.cleanName = var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1256287168"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-30300"
	)
	public String method7399() {
		return this.cleanName;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1374300828"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpp;B)I",
		garbageValue = "-74"
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
}
