import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class258 {
	@ObfuscatedName("v")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class305.base37Table[(int)(var6 - 37L * var0)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljn;",
		garbageValue = "1808084531"
	)
	public static class268[] method4835() {
		return new class268[]{class268.field3540, class268.field3537, class268.field3538, class268.field3539}; // L: 15
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "1084146758"
	)
	static final void method4836(Widget var0) {
		int var1 = var0.contentType; // L: 10993
		if (var1 == 324) { // L: 10994
			if (Client.field908 == -1) { // L: 10995
				Client.field908 = var0.spriteId2; // L: 10996
				Client.field752 = var0.spriteId; // L: 10997
			}

			if (Client.playerAppearance.isFemale) { // L: 10999
				var0.spriteId2 = Client.field908;
			} else {
				var0.spriteId2 = Client.field752; // L: 11000
			}

		} else if (var1 == 325) { // L: 11003
			if (Client.field908 == -1) { // L: 11004
				Client.field908 = var0.spriteId2; // L: 11005
				Client.field752 = var0.spriteId; // L: 11006
			}

			if (Client.playerAppearance.isFemale) { // L: 11008
				var0.spriteId2 = Client.field752;
			} else {
				var0.spriteId2 = Client.field908; // L: 11009
			}

		} else if (var1 == 327) { // L: 11012
			var0.modelAngleX = 150; // L: 11013
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11014
			var0.modelType = 5; // L: 11015
			var0.modelId = 0; // L: 11016
		} else if (var1 == 328) { // L: 11019
			var0.modelAngleX = 150; // L: 11020
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11021
			var0.modelType = 5; // L: 11022
			var0.modelId = 1; // L: 11023
		}
	} // L: 11001 11010 11017 11024 11026
}
