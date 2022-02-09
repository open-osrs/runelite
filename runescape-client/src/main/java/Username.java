import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("c")
	@Export("name")
	String name;
	@ObfuscatedName("l")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lok;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 165
		String var4;
		if (var1 == null) { // L: 169
			var4 = null; // L: 170
		} else {
			int var5 = 0; // L: 173

			int var6;
			for (var6 = var1.length(); var5 < var6 && class335.method6159(var1.charAt(var5)); ++var5) { // L: 174 175
			}

			while (var6 > var5 && class335.method6159(var1.charAt(var6 - 1))) { // L: 176
				--var6;
			}

			int var7 = var6 - var5; // L: 177
			if (var7 >= 1 && var7 <= FriendsChat.method6330(var2)) { // L: 178
				StringBuilder var8 = new StringBuilder(var7); // L: 182

				for (int var9 = var5; var9 < var6; ++var9) { // L: 183
					char var10 = var1.charAt(var9); // L: 184
					boolean var11;
					if (Character.isISOControl(var10)) { // L: 187
						var11 = false; // L: 188
					} else if (class124.isAlphaNumeric(var10)) { // L: 191
						var11 = true; // L: 192
					} else {
						char[] var12 = class405.field4460; // L: 196
						int var13 = 0;

						label84:
						while (true) {
							char var14;
							if (var13 >= var12.length) {
								var12 = class405.field4461; // L: 206

								for (var13 = 0; var13 < var12.length; ++var13) { // L: 207
									var14 = var12[var13]; // L: 208
									if (var14 == var10) { // L: 209
										var11 = true; // L: 210
										break label84; // L: 211
									}
								}

								var11 = false; // L: 215
								break;
							}

							var14 = var12[var13]; // L: 198
							if (var10 == var14) { // L: 199
								var11 = true; // L: 200
								break; // L: 201
							}

							++var13; // L: 197
						}
					}

					if (var11) { // L: 217
						char var15;
						switch(var10) { // L: 220
						case ' ':
						case '-':
						case '_':
						case ' ':
							var15 = '_'; // L: 241
							break; // L: 242
						case '#':
						case '[':
						case ']':
							var15 = var10; // L: 279
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
							var15 = 'a'; // L: 253
							break; // L: 254
						case 'Ç':
						case 'ç':
							var15 = 'c'; // L: 274
							break; // L: 275
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var15 = 'e'; // L: 292
							break; // L: 293
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var15 = 'i'; // L: 300
							break;
						case 'Ñ':
						case 'ñ':
							var15 = 'n'; // L: 223
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
							var15 = 'o'; // L: 235
							break; // L: 236
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var15 = 'u'; // L: 263
							break; // L: 264
						case 'ß':
							var15 = 'b'; // L: 282
							break; // L: 283
						case 'ÿ':
						case 'Ÿ':
							var15 = 'y'; // L: 267
							break; // L: 268
						default:
							var15 = Character.toLowerCase(var10); // L: 270
						}

						if (var15 != 0) { // L: 305
							var8.append(var15); // L: 306
						}
					}
				}

				if (var8.length() == 0) { // L: 308
					var4 = null; // L: 309
				} else {
					var4 = var8.toString(); // L: 312
				}
			} else {
				var4 = null; // L: 179
			}
		}

		this.cleanName = var4; // L: 314
	} // L: 315

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			int var5 = 0; // L: 20

			int var6;
			for (var6 = var1.length(); var5 < var6 && class335.method6159(var1.charAt(var5)); ++var5) { // L: 21 22
			}

			while (var6 > var5 && class335.method6159(var1.charAt(var6 - 1))) { // L: 23
				--var6;
			}

			int var7 = var6 - var5; // L: 24
			if (var7 >= 1 && var7 <= FriendsChat.method6330(var4)) { // L: 25
				StringBuilder var8 = new StringBuilder(var7); // L: 29

				for (int var9 = var5; var9 < var6; ++var9) { // L: 30
					char var10 = var1.charAt(var9); // L: 31
					boolean var11;
					if (Character.isISOControl(var10)) { // L: 34
						var11 = false; // L: 35
					} else if (class124.isAlphaNumeric(var10)) { // L: 38
						var11 = true; // L: 39
					} else {
						char[] var12 = class405.field4460; // L: 43
						int var13 = 0;

						label83:
						while (true) {
							char var14;
							if (var13 >= var12.length) {
								var12 = class405.field4461; // L: 53

								for (var13 = 0; var13 < var12.length; ++var13) { // L: 54
									var14 = var12[var13]; // L: 55
									if (var10 == var14) { // L: 56
										var11 = true; // L: 57
										break label83; // L: 58
									}
								}

								var11 = false; // L: 62
								break;
							}

							var14 = var12[var13]; // L: 45
							if (var10 == var14) { // L: 46
								var11 = true; // L: 47
								break; // L: 48
							}

							++var13; // L: 44
						}
					}

					if (var11) { // L: 64
						char var15;
						switch(var10) { // L: 67
						case ' ':
						case '-':
						case '_':
						case ' ':
							var15 = '_'; // L: 113
							break; // L: 114
						case '#':
						case '[':
						case ']':
							var15 = var10; // L: 107
							break; // L: 108
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
							var15 = 'a'; // L: 143
							break; // L: 144
						case 'Ç':
						case 'ç':
							var15 = 'c'; // L: 131
							break; // L: 132
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var15 = 'e'; // L: 102
							break; // L: 103
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var15 = 'i'; // L: 74
							break;
						case 'Ñ':
						case 'ñ':
							var15 = 'n'; // L: 147
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
							var15 = 'o'; // L: 92
							break; // L: 93
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var15 = 'u'; // L: 123
							break; // L: 124
						case 'ß':
							var15 = 'b'; // L: 77
							break; // L: 78
						case 'ÿ':
						case 'Ÿ':
							var15 = 'y'; // L: 127
							break; // L: 128
						default:
							var15 = Character.toLowerCase(var10); // L: 80
						}

						if (var15 != 0) { // L: 152
							var8.append(var15); // L: 153
						}
					}
				}

				if (var8.length() == 0) { // L: 155
					var3 = null; // L: 156
				} else {
					var3 = var8.toString(); // L: 159
				}
			} else {
				var3 = null; // L: 26
			}
		}

		this.cleanName = var3; // L: 161
	} // L: 162

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1210875382"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 318
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "301"
	)
	public String method7949() {
		return this.cleanName; // L: 322
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1707838150"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 326
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)I",
		garbageValue = "1152761803"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 353
			return var1.cleanName == null ? 0 : 1; // L: 354 355
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 357 358
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 331
			Username var2 = (Username)var1; // L: 332
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 333
			} else if (var2.cleanName == null) { // L: 334
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 335 336
			}
		} else {
			return false; // L: 338
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 343 344
	}

	public String toString() {
		return this.getName(); // L: 349
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 362
	}
}
