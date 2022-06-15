import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class class229 {
	@ObfuscatedName("v")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (var0 % 37L == 0L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 39 40 49
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var8 = class344.base37Table[(int)(var6 - var0 * 37L)]; // L: 43
					if (var8 == '_') { // L: 44
						int var9 = var5.length() - 1; // L: 45
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 46
						var8 = 160; // L: 47
					}
				}

				var5.reverse(); // L: 51
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 52
				return var5.toString(); // L: 53
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lbk;III)V",
		garbageValue = "444042633"
	)
	static final void method4904(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 8703
			FriendsList.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2); // L: 8704
		}

	} // L: 8706
}
