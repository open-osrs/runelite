import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class234 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lin;",
		garbageValue = "34"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3124, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-30"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		UserComparator10.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1847408099"
	)
	static final boolean method4159(int var0, int var1) {
		ObjectDefinition var2 = WorldMapDecoration.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method4614(var1);
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lhe;I)Ljava/lang/String;",
		garbageValue = "-1574592106"
	)
	static String method4160(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + ModelData0.method3329(HealthBarDefinition.method4512(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
