import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ui")
	static Iterator field312;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static Widget field313;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lar;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			class249.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lky;",
		garbageValue = "-236959023"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman, PlayerType.field3959, PlayerType.PlayerType_jagexModerator, PlayerType.field3949, PlayerType.PlayerType_ultimateIronman, PlayerType.field3952, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3958, PlayerType.field3951, PlayerType.field3954, PlayerType.field3957, PlayerType.field3956, PlayerType.PlayerType_normal, PlayerType.field3960, PlayerType.field3945}; // L: 29
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Llh;II)V",
		garbageValue = "1978245093"
	)
	static void method739(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 286
			Login.logoSprite = class421.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 287
		} else if ((var1 & 1073741824) != 0) { // L: 289
			Login.logoSprite = class421.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 290
		} else {
			Login.logoSprite = class421.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 293
		}

	} // L: 295

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "939387682"
	)
	static final int method740(int var0, int var1) {
		int var2 = WorldMapIcon_1.method4594(var0 - 1, var1 - 1) + WorldMapIcon_1.method4594(1 + var0, var1 - 1) + WorldMapIcon_1.method4594(var0 - 1, var1 + 1) + WorldMapIcon_1.method4594(var0 + 1, 1 + var1); // L: 905
		int var3 = WorldMapIcon_1.method4594(var0 - 1, var1) + WorldMapIcon_1.method4594(1 + var0, var1) + WorldMapIcon_1.method4594(var0, var1 - 1) + WorldMapIcon_1.method4594(var0, 1 + var1); // L: 906
		int var4 = WorldMapIcon_1.method4594(var0, var1); // L: 907
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 908
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-44"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 382
		int var2 = var1.readUnsignedByte(); // L: 383
		int var3 = var1.readInt(); // L: 384
		if (var3 < 0 || AbstractArchive.field4012 != 0 && var3 > AbstractArchive.field4012) { // L: 385
			throw new RuntimeException(); // L: 386
		} else if (var2 == 0) { // L: 388
			byte[] var6 = new byte[var3]; // L: 389
			var1.readBytes(var6, 0, var3); // L: 390
			return var6; // L: 391
		} else {
			int var4 = var1.readInt(); // L: 394
			if (var4 >= 0 && (AbstractArchive.field4012 == 0 || var4 <= AbstractArchive.field4012)) { // L: 395
				byte[] var5 = new byte[var4]; // L: 398
				if (var2 == 1) { // L: 399
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 400
				}

				return var5; // L: 401
			} else {
				throw new RuntimeException(); // L: 396
			}
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2037281423"
	)
	static void method736() {
		Client.packetWriter.clearBuffer(); // L: 2758
		Client.packetWriter.packetBuffer.offset = 0; // L: 2759
		Client.packetWriter.serverPacket = null; // L: 2760
		Client.packetWriter.field1350 = null; // L: 2761
		Client.packetWriter.field1347 = null; // L: 2762
		Client.packetWriter.field1352 = null; // L: 2763
		Client.packetWriter.serverPacketLength = 0; // L: 2764
		Client.packetWriter.field1342 = 0; // L: 2765
		Client.rebootTimer = 0; // L: 2766
		class125.method2824(); // L: 2767
		Client.minimapState = 0; // L: 2768
		Client.destinationX = 0; // L: 2769

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2770
			Client.players[var0] = null;
		}

		class101.localPlayer = null; // L: 2771

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2772
			NPC var1 = Client.npcs[var0]; // L: 2773
			if (var1 != null) { // L: 2774
				var1.targetIndex = -1; // L: 2775
				var1.false0 = false; // L: 2776
			}
		}

		class125.method2830(); // L: 2779
		HealthBarUpdate.updateGameState(30); // L: 2780

		for (var0 = 0; var0 < 100; ++var0) { // L: 2781
			Client.field703[var0] = true;
		}

		SpriteMask.method5522(); // L: 2782
	} // L: 2783

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-73"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class19.clientPreferences.method2241() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3747
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3748
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3749
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3750
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3751
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3752
			++Client.soundEffectCount; // L: 3753
		}

	} // L: 3755

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-735322936"
	)
	static final void method743() {
		if (Projectile.ClanChat_inClanChat) { // L: 3785
			if (Huffman.friendsChat != null) { // L: 3786
				Huffman.friendsChat.sort(); // L: 3787
			}

			class161.method3287(); // L: 3789
			Projectile.ClanChat_inClanChat = false; // L: 3790
		}

	} // L: 3792
}
