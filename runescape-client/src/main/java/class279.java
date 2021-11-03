import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class279 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "228808320"
	)
	static final void method5217(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 121
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class397.addGameMessage(30, "", var1); // L: 123
	} // L: 125

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977280908"
	)
	static void method5216() {
		if (ClanSettings.field1440 != null) { // L: 12045
			Client.field742 = Client.cycle; // L: 12046
			ClanSettings.field1440.method5490(); // L: 12047

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12048
				if (Client.players[var0] != null) { // L: 12049
					ClanSettings.field1440.method5498((Client.players[var0].x >> 7) + class19.baseX, (Client.players[var0].y >> 7) + DefaultsGroup.baseY); // L: 12050
				}
			}
		}

	} // L: 12054
}
