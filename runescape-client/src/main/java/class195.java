import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class195 {
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("e")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("eg")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Lga;II)Lga;",
		garbageValue = "2137068077"
	)
	@Export("findEnumerated")
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			Enumerated var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "64"
	)
	@Export("Widget_hasContinueOption")
	public static boolean Widget_hasContinueOption(int var0) {
		return (var0 & 1) != 0; // L: 9
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "461882503"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 37
		boolean var3 = false; // L: 38
		int var4 = 0; // L: 39
		int var5 = var0.length(); // L: 40
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 70
				break;
			}

			label84: {
				char var7 = var0.charAt(var6); // L: 42
				if (var6 == 0) { // L: 43
					if (var7 == '-') { // L: 44
						var2 = true; // L: 45
						break label84;
					}

					if (var7 == '+') { // L: 48
						break label84;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 50
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 51
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 52
						var1 = false; // L: 54
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 57
					var1 = false; // L: 58
					break; // L: 59
				}

				if (var2) { // L: 61
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9; // L: 62
				if (var4 != var8 / 10) { // L: 63
					var1 = false; // L: 64
					break; // L: 65
				}

				var4 = var8; // L: 67
				var3 = true; // L: 68
			}

			++var6; // L: 41
		}

		return var1; // L: 72
	}
}
