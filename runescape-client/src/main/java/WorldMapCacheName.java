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
		field328 = new WorldMapCacheName("details");
		field326 = new WorldMapCacheName("compositemap");
		field327 = new WorldMapCacheName("compositetexture");
		field329 = new WorldMapCacheName("area");
		field325 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2075220259"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				WorldMapIcon_0.client.method1050();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field892 = 0;
				Client.field681 = 0;
				Client.timer.method5033(var0);
				if (var0 != 20) {
					WorldMapDecoration.method380(false);
				}
			}

			if (var0 != 20 && var0 != 40 && InterfaceParent.field562 != null) {
				InterfaceParent.field562.close();
				InterfaceParent.field562 = null;
			}

			if (Client.gameState == 25) {
				Client.field704 = 0;
				Client.field700 = 0;
				Client.field701 = 1;
				Client.field702 = 0;
				Client.field703 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					Tiles.method1208(class92.archive10, Messages.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					Tiles.method1208(class92.archive10, Messages.archive8, false, 4);
				} else {
					class89.method2122();
				}
			} else {
				Tiles.method1208(class92.archive10, Messages.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Lil;",
		garbageValue = "-3"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, PlayerAppearance.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class7.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1105794074"
	)
	static final void method662(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Timer.clientPreferences.soundEffectsVolume = var0;
		GrandExchangeOffer.savePreferences();
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static void method664() {
		if (Client.oculusOrbState == 1) {
			Client.field649 = true;
		}

	}
}
