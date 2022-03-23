import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public abstract class class394 implements class249 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	class431 field4378;

	class394(int var1) {
	} // L: 13

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;IB)V",
		garbageValue = "3"
	)
	abstract void vmethod7204(Buffer var1, int var2);

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "1362633882"
	)
	public void method7199(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return;
			}

			class390[] var3 = new class390[]{class390.field4370, class390.field4368, class390.field4369, class390.field4371}; // L: 21
			class390 var4 = (class390)ChatChannel.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4372) { // L: 25
				case 0:
					int var5 = var1.readUnsignedByte(); // L: 27
					int var8 = class429.field4592[var5]; // L: 30
					class431 var6;
					if (var8 == 1) { // L: 31
						var6 = class431.field4598; // L: 32
					} else if (var8 == 2) { // L: 35
						var6 = class431.field4600; // L: 36
					} else if (var8 == 3) { // L: 39
						var6 = class431.field4595;
					} else {
						var6 = null;
					}

					this.field4378 = var6;
					if (this.field4378 != null) { // L: 46
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					var1.readStringCp1252NullCircumfixed(); // L: 58
					break; // L: 59
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 49
				case 3:
					class309[] var7 = new class309[]{class309.field3911, class309.field3910, class309.field3912, class309.field3918}; // L: 53
					ChatChannel.findEnumerated(var7, var1.readUnsignedByte());
				}
			} else {
				this.vmethod7204(var1, var2); // L: 62
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2144539286"
	)
	boolean method7201() {
		return this.field4378 != null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "0"
	)
	Object method7200() {
		if (this.field4378 == class431.field4598) { // L: 73
			return 0;
		} else if (this.field4378 == class431.field4595) { // L: 76
			return -1L; // L: 77
		} else {
			return this.field4378 == class431.field4600 ? "" : null; // L: 79 80 82
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lpa;I)Ljava/lang/String;",
		garbageValue = "-1784818161"
	)
	public static String method7212(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 40
			return null;
		} else {
			int var2 = 0; // L: 41

			int var3;
			for (var3 = var0.length(); var2 < var3 && class291.method5588(var0.charAt(var2)); ++var2) { // L: 42 43
			}

			while (var3 > var2 && class291.method5588(var0.charAt(var3 - 1))) { // L: 44
				--var3;
			}

			int var4 = var3 - var2; // L: 45
			if (var4 >= 1) { // L: 47
				byte var6;
				if (var1 == null) { // L: 51
					var6 = 12; // L: 52
				} else {
					switch(var1.field4560) { // L: 55
					case 3:
						var6 = 20; // L: 60
						break;
					default:
						var6 = 12; // L: 57
					}
				}

				if (var4 <= var6) { // L: 64
					StringBuilder var10 = new StringBuilder(var4); // L: 68

					for (int var11 = var2; var11 < var3; ++var11) { // L: 69
						char var7 = var0.charAt(var11); // L: 70
						if (ViewportMouse.method4463(var7)) { // L: 71
							char var8;
							switch(var7) { // L: 74
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_'; // L: 122
								break; // L: 123
							case '#':
							case '[':
							case ']':
								var8 = var7; // L: 116
								break; // L: 117
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
								var8 = 'a'; // L: 148
								break; // L: 149
							case 'Ç':
							case 'ç':
								var8 = 'c'; // L: 111
								break; // L: 112
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e'; // L: 136
								break; // L: 137
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i'; // L: 81
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n'; // L: 126
								break; // L: 127
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
								var8 = 'o'; // L: 93
								break; // L: 94
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u'; // L: 107
								break; // L: 108
							case 'ß':
								var8 = 'b'; // L: 151
								break; // L: 152
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y'; // L: 97
								break; // L: 98
							default:
								var8 = Character.toLowerCase(var7); // L: 154
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
