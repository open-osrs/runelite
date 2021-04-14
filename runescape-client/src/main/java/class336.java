import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class336 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lmf;I)Ljava/lang/String;",
		garbageValue = "744512659"
	)
	public static String method5978(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 20
			return null;
		} else {
			int var2 = 0; // L: 21

			int var3;
			for (var3 = var0.length(); var2 < var3 && ServerPacket.method3902(var0.charAt(var2)); ++var2) { // L: 22 23
			}

			while (var3 > var2 && ServerPacket.method3902(var0.charAt(var3 - 1))) { // L: 24
				--var3;
			}

			int var4 = var3 - var2; // L: 25
			if (var4 >= 1) { // L: 27
				byte var6;
				if (var1 == null) { // L: 31
					var6 = 12; // L: 32
				} else {
					switch(var1.field4092) { // L: 35
					case 1:
						var6 = 20; // L: 37
						break; // L: 38
					default:
						var6 = 12; // L: 40
					}
				}

				if (var4 <= var6) { // L: 44
					StringBuilder var12 = new StringBuilder(var4); // L: 48

					for (int var14 = var2; var14 < var3; ++var14) { // L: 49
						char var7 = var0.charAt(var14); // L: 50
						boolean var8;
						if (Character.isISOControl(var7)) { // L: 53
							var8 = false; // L: 54
						} else if (class238.isAlphaNumeric(var7)) { // L: 57
							var8 = true; // L: 58
						} else {
							char[] var9 = class364.field4098; // L: 62
							int var10 = 0;

							label84:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class364.field4096; // L: 72

									for (var10 = 0; var10 < var9.length; ++var10) { // L: 73
										var11 = var9[var10]; // L: 74
										if (var7 == var11) { // L: 75
											var8 = true; // L: 76
											break label84; // L: 77
										}
									}

									var8 = false; // L: 81
									break;
								}

								var11 = var9[var10]; // L: 64
								if (var11 == var7) { // L: 65
									var8 = true; // L: 66
									break; // L: 67
								}

								++var10; // L: 63
							}
						}

						if (var8) { // L: 83
							char var13 = class309.method5602(var7); // L: 84
							if (var13 != 0) { // L: 85
								var12.append(var13); // L: 86
							}
						}
					}

					if (var12.length() == 0) { // L: 88
						return null;
					}

					return var12.toString(); // L: 89
				}
			}

			return null; // L: 46
		}
	}
}
