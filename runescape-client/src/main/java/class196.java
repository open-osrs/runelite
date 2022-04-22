import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class196 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1925953895
	)
	static int field2204;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lpe;I)Ljava/lang/String;",
		garbageValue = "1101478665"
	)
	public static String method3900(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 48
			return null;
		} else {
			int var2 = 0; // L: 49

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) { // L: 50 53 63
				var5 = var0.charAt(var2); // L: 55
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 57
				if (!var4) { // L: 59
					break;
				}
			}

			while (var3 > var2) { // L: 67
				var5 = var0.charAt(var3 - 1); // L: 69
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 71
				if (!var4) { // L: 73
					break;
				}

				--var3; // L: 77
			}

			int var11 = var3 - var2; // L: 79
			if (var11 >= 1 && var11 <= class204.method4255(var1)) { // L: 80
				StringBuilder var10 = new StringBuilder(var11); // L: 81

				for (int var6 = var2; var6 < var3; ++var6) { // L: 82
					char var7 = var0.charAt(var6); // L: 83
					if (NetSocket.method3309(var7)) { // L: 84
						char var8;
						switch(var7) { // L: 87
						case ' ':
						case '-':
						case '_':
						case ' ':
							var8 = '_'; // L: 97
							break; // L: 98
						case '#':
						case '[':
						case ']':
							var8 = var7; // L: 91
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
							var8 = 'a'; // L: 113
							break; // L: 114
						case 'Ç':
						case 'ç':
							var8 = 'c'; // L: 117
							break; // L: 118
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var8 = 'e'; // L: 135
							break; // L: 136
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var8 = 'i'; // L: 125
							break; // L: 126
						case 'Ñ':
						case 'ñ':
							var8 = 'n'; // L: 167
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
							var8 = 'o'; // L: 147
							break; // L: 148
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var8 = 'u'; // L: 157
							break; // L: 158
						case 'ß':
							var8 = 'b'; // L: 160
							break; // L: 161
						case 'ÿ':
						case 'Ÿ':
							var8 = 'y'; // L: 101
							break; // L: 102
						default:
							var8 = Character.toLowerCase(var7); // L: 163
						}

						if (var8 != 0) { // L: 172
							var10.append(var8); // L: 173
						}
					}
				}

				if (var10.length() == 0) { // L: 175
					return null;
				} else {
					return var10.toString(); // L: 176
				}
			} else {
				return null;
			}
		}
	}
}
