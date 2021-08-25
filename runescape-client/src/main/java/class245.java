import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class245 {
	@ObfuscatedName("n")
	static int[] field2885;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;

	static {
		new Object();
		field2885 = new int[33];
		field2885[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2885[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1083617881"
	)
	static final void method4590() {
		if (Client.logoutTimer > 0) {
			class16.logOut();
		} else {
			Client.timer.method5822();
			HealthBarUpdate.updateGameState(40);
			NetCache.field3738 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
