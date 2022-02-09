import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class67 {
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("c")
	static final BigInteger field886;
	@ObfuscatedName("l")
	static final BigInteger field885;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;

	static {
		field886 = new BigInteger("10001", 16); // L: 6
		field885 = new BigInteger("d70d8858c0edfd07dd486b5cf46434768c8e05703b9d1cd7d8770887d68fceecdb9416659533f955d92058203258da4176760842e480b77c0c1c5897d21ad23d731d0142f81304fd2e17ae7d8eb9c6ce0e8c4c9abd84d68bb528bd7051f7e12a3450dd0e0d2accf2b26ba24b1275f5e381d6335514b589efd6b9610c9d15e6b9", 16); // L: 7
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "92"
	)
	public static void method1897() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 182
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 183
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 184
	} // L: 185

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "2138083585"
	)
	static final boolean method1896(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 103
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 104
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 105
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 106
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 107
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 108
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 109
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 110
				}
			}
		}
	}
}
