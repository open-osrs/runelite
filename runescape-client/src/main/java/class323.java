import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public enum class323 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	field3849(4, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	field3848(2, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	field3855(5, 5),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	field3850(1, 6),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	field3851(0, 7),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	field3852(3, 8);

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1864683271
	)
	final int field3853;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -475570997
	)
	final int field3847;

	class323(int var3, int var4) {
		this.field3853 = var3; // L: 18
		this.field3847 = var4; // L: 19
	} // L: 20

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3847; // L: 23
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lmc;I)Ljava/lang/String;",
		garbageValue = "586268379"
	)
	public static String method6048(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 40
			return null;
		} else {
			int var2 = 0; // L: 41

			int var3;
			for (var3 = var0.length(); var2 < var3 && Tiles.method1223(var0.charAt(var2)); ++var2) { // L: 42 43
			}

			while (var3 > var2 && Tiles.method1223(var0.charAt(var3 - 1))) { // L: 44
				--var3;
			}

			int var4 = var3 - var2; // L: 45
			if (var4 >= 1) { // L: 47
				byte var6;
				if (var1 == null) { // L: 51
					var6 = 12; // L: 52
				} else {
					switch(var1.field4070) { // L: 55
					case 6:
						var6 = 20; // L: 57
						break; // L: 58
					default:
						var6 = 12; // L: 60
					}
				}

				if (var4 <= var6) { // L: 64
					StringBuilder var10 = new StringBuilder(var4); // L: 68

					for (int var11 = var2; var11 < var3; ++var11) { // L: 69
						char var7 = var0.charAt(var11); // L: 70
						if (class9.method124(var7)) { // L: 71
							char var8;
							switch(var7) { // L: 74
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_'; // L: 105
								break; // L: 106
							case '#':
							case '[':
							case ']':
								var8 = var7; // L: 88
								break; // L: 89
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
								var8 = 'a'; // L: 117
								break; // L: 118
							case 'Ç':
							case 'ç':
								var8 = 'c'; // L: 96
								break; // L: 97
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e'; // L: 83
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i'; // L: 147
								break; // L: 148
							case 'Ñ':
							case 'ñ':
								var8 = 'n'; // L: 92
								break; // L: 93
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
								var8 = 'o'; // L: 129
								break; // L: 130
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u'; // L: 139
								break; // L: 140
							case 'ß':
								var8 = 'b'; // L: 154
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y'; // L: 151
								break; // L: 152
							default:
								var8 = Character.toLowerCase(var7); // L: 99
							}

							if (var8 != 0) { // L: 159
								var10.append(var8); // L: 160
							}
						}
					}

					if (var10.length() == 0) { // L: 162
						return null;
					}

					return var10.toString(); // L: 163
				}
			}

			return null; // L: 66
		}
	}
}
