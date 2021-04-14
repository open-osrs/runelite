import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class148 {
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -2100278607
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "366368994"
	)
	static final int method3015(int var0, int var1) {
		int var2 = GrandExchangeOfferWorldComparator.method4609(var0 + 45365, 91923 + var1, 4) - 128 + (GrandExchangeOfferWorldComparator.method4609(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (GrandExchangeOfferWorldComparator.method4609(var0, var1, 1) - 128 >> 2); // L: 940
		var2 = (int)(0.3D * (double)var2) + 35; // L: 941
		if (var2 < 10) { // L: 942
			var2 = 10;
		} else if (var2 > 60) { // L: 943
			var2 = 60;
		}

		return var2; // L: 944
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lbu;S)V",
		garbageValue = "-13863"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1350
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1351
			Actor.method2173(var0.isMembersOnly()); // L: 1352
		}

		if (var0.properties != Client.worldProperties) { // L: 1354
			Archive var1 = SoundSystem.archive8; // L: 1355
			int var2 = var0.properties; // L: 1356
			if ((var2 & 536870912) != 0) { // L: 1358
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 1359
			} else if ((var2 & 1073741824) != 0) { // L: 1361
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 1362
			} else {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 1365
			}
		}

		MusicPatch.worldHost = var0.host; // L: 1369
		Client.worldId = var0.id; // L: 1370
		Client.worldProperties = var0.properties; // L: 1371
		AttackOption.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1372
		Calendar.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1373
		class5.currentPort = AttackOption.worldPort; // L: 1374
	} // L: 1375
}
