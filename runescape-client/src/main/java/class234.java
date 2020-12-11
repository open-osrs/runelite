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
		return new PlayerType[]{PlayerType.field3124, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal}; // L: 20
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-30"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		UserComparator10.addChatMessage(var0, var1, var2, (String)null); // L: 23
	} // L: 24

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1847408099"
	)
	static final boolean method4159(int var0, int var1) {
		ObjectDefinition var2 = WorldMapDecoration.getObjectDefinition(var0); // L: 892
		if (var1 == 11) { // L: 893
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 894
		}

		return var2.method4614(var1); // L: 895
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lhe;I)Ljava/lang/String;",
		garbageValue = "-1574592106"
	)
	static String method4160(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9424
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9425
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 9427
					if (var3 == -1) { // L: 9428
						break;
					}

					var0 = var0.substring(0, var3) + ModelData0.method3329(HealthBarDefinition.method4512(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 9429
				}
			}
		}

		return var0; // L: 9433
	}
}
