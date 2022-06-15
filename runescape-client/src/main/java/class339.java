import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public final class class339 {
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "2080916438"
	)
	static long method6244(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}
}
