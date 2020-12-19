import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field328;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field326;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field327;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	static final WorldMapCacheName field329;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	public static final WorldMapCacheName field325;
	@ObfuscatedName("z")
	public static short[][] field331;
	@ObfuscatedName("j")
	@Export("name")
	public final String name;

	static {
		field328 = new WorldMapCacheName("details"); // L: 4
		field326 = new WorldMapCacheName("compositemap"); // L: 5
		field327 = new WorldMapCacheName("compositetexture"); // L: 6
		field329 = new WorldMapCacheName("area"); // L: 7
		field325 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2075220259"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1345
			if (Client.gameState == 0) { // L: 1346
				WorldMapIcon_0.client.method1050();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1347
				Client.loginState = 0; // L: 1348
				Client.field892 = 0; // L: 1349
				Client.field681 = 0; // L: 1350
				Client.timer.method5033(var0); // L: 1351
				if (var0 != 20) { // L: 1352
					WorldMapDecoration.method380(false);
				}
			}

			if (var0 != 20 && var0 != 40 && InterfaceParent.field562 != null) { // L: 1354 1355
				InterfaceParent.field562.close(); // L: 1356
				InterfaceParent.field562 = null; // L: 1357
			}

			if (Client.gameState == 25) { // L: 1360
				Client.field704 = 0; // L: 1361
				Client.field700 = 0; // L: 1362
				Client.field701 = 1; // L: 1363
				Client.field702 = 0; // L: 1364
				Client.field703 = 1; // L: 1365
			}

			if (var0 != 5 && var0 != 10) { // L: 1367
				if (var0 == 20) { // L: 1370
					Tiles.method1208(class92.archive10, Messages.archive8, true, Client.gameState == 11 ? 4 : 0); // L: 1371
				} else if (var0 == 11) { // L: 1373
					Tiles.method1208(class92.archive10, Messages.archive8, false, 4); // L: 1374
				} else {
					class89.method2122(); // L: 1376
				}
			} else {
				Tiles.method1208(class92.archive10, Messages.archive8, true, 0); // L: 1368
			}

			Client.gameState = var0; // L: 1377
		}
	} // L: 1378

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Lil;",
		garbageValue = "-3"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 2195
		if (JagexCache.JagexCache_dat2File != null) { // L: 2196
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, PlayerAppearance.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class7.masterDisk, var0, var1, var2, var3); // L: 2197
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1105794074"
	)
	static final void method662(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 10672
		Timer.clientPreferences.soundEffectsVolume = var0; // L: 10673
		GrandExchangeOffer.savePreferences(); // L: 10674
	} // L: 10675

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static void method664() {
		if (Client.oculusOrbState == 1) { // L: 11186
			Client.field649 = true; // L: 11187
		}

	} // L: 11189
}
