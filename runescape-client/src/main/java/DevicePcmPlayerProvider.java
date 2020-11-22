import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements PlayerProvider {
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("clanChat")
	static ClanChat clanChat;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static IndexedSprite field439;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ldh;",
		garbageValue = "1306134642"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lgb;I)I",
		garbageValue = "-1791433879"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = VarbitDefinition.method4663(var9); // L: 33
			var8 = VarbitDefinition.method4663(var10); // L: 34
			var9 = class182.standardizeChar(var9, var2); // L: 35
			var10 = class182.standardizeChar(var10, var2); // L: 36
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var10 != var9) { // L: 40
					return AbstractWorldMapIcon.lowercaseChar(var9, var2) - AbstractWorldMapIcon.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var11 != var12) {
					return AbstractWorldMapIcon.lowercaseChar(var11, var2) - AbstractWorldMapIcon.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var13 != var12) { // L: 63
					return AbstractWorldMapIcon.lowercaseChar(var12, var2) - AbstractWorldMapIcon.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-243383079"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class3.addChatMessage(var0, var1, var2, (String)null); // L: 23
	} // L: 24

	@ObfuscatedName("b")
	public static boolean method941(long var0) {
		return var0 != 0L && !WorldMapCacheName.method725(var0); // L: 48
	}
}
