import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class280 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;Lmo;I)Ljava/lang/String;",
		garbageValue = "-1896450279"
	)
	public static String method5160(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && DesktopPlatformInfoProvider.method6481(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && DesktopPlatformInfoProvider.method6481(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field4060) {
					case 4:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var4 <= var6) {
					StringBuilder var12 = new StringBuilder(var4);

					for (int var14 = var2; var14 < var3; ++var14) {
						char var7 = var0.charAt(var14);
						boolean var8;
						if (Character.isISOControl(var7)) {
							var8 = false;
						} else if (Varps.isAlphaNumeric(var7)) {
							var8 = true;
						} else {
							char[] var9 = class348.field4065;
							int var10 = 0;

							label79:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class348.field4064;

									for (var10 = 0; var10 < var9.length; ++var10) {
										var11 = var9[var10];
										if (var7 == var11) {
											var8 = true;
											break label79;
										}
									}

									var8 = false;
									break;
								}

								var11 = var9[var10];
								if (var11 == var7) {
									var8 = true;
									break;
								}

								++var10;
							}
						}

						if (var8) {
							char var13 = KitDefinition.method4650(var7);
							if (var13 != 0) {
								var12.append(var13);
							}
						}
					}

					if (var12.length() == 0) {
						return null;
					}

					return var12.toString();
				}
			}

			return null;
		}
	}
}
