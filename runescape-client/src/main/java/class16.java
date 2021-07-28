import java.applet.Applet;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class16 {
	@ObfuscatedName("s")
	@Export("applet")
	static Applet applet;
	@ObfuscatedName("t")
	static String field87;

	static {
		applet = null;
		field87 = "";
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "309186678"
	)
	public static String method176(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				Script.client.method224();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field438 = 0;
				Client.field439 = 0;
				Client.timer.method5662(var0);
				if (var0 != 20) {
					Interpreter.method1579(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Client.field644 != null) {
				Client.field644.close();
				Client.field644 = null;
			}

			if (Client.gameState == 25) {
				Client.field463 = 0;
				Client.field459 = 0;
				Client.field460 = 1;
				Client.field461 = 0;
				Client.field549 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					MusicPatch.method4636(ClanChannelMember.archive10, class270.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					MusicPatch.method4636(ClanChannelMember.archive10, class270.archive8, false, 4);
				} else if (Login.clearLoginScreen) {
					class304.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					Login.leftTitleSprite = null;
					Login.rightTitleSprite = null;
					UserComparator4.logoSprite = null;
					FileSystem.title_muteSprite = null;
					GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite = null;
					class172.options_buttons_2Sprite = null;
					WorldMapAreaData.worldSelectBackSprites = null;
					GraphicsObject.worldSelectFlagSprites = null;
					ApproximateRouteStrategy.worldSelectArrows = null;
					ChatChannel.worldSelectStars = null;
					MidiPcmStream.field2846 = null;
					class6.loginScreenRunesAnimation.method1917();
					class234.musicPlayerStatus = 1;
					class234.musicTrackArchive = null;
					class234.musicTrackGroupId = -1;
					UserComparator6.musicTrackFileId = -1;
					HorizontalAlignment.musicTrackVolume = 0;
					EnumComposition.musicTrackBoolean = false;
					ClanChannel.pcmSampleLength = 2;
					if (NetCache.NetCache_socket != null) {
						try {
							Buffer var1 = new Buffer(4);
							var1.writeByte(2);
							var1.writeMedium(0);
							NetCache.NetCache_socket.write(var1.array, 0, 4);
						} catch (IOException var4) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var3) {
							}

							++NetCache.NetCache_ioExceptions;
							NetCache.NetCache_socket = null;
						}
					}

					Login.clearLoginScreen = false;
				}
			} else {
				MusicPatch.method4636(ClanChannelMember.archive10, class270.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "362170374"
	)
	static boolean method173() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lbx;IB)V",
		garbageValue = "-49"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1073 >= Client.cycle) {
			World.method1426(var0);
		} else if (var0.field1067 >= Client.cycle) {
			Message.method878(var0);
		} else {
			ObjectComposition.method3013(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1073 = 0;
			var0.field1067 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1023 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1023 * 64;
			var0.method1872();
		}

		if (MouseHandler.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1073 = 0;
			var0.field1067 = 0;
			var0.x = var0.field1023 * 64 + var0.pathX[0] * 128;
			var0.y = var0.field1023 * 64 + var0.pathY[0] * 128;
			var0.method1872();
		}

		ReflectionCheck.method848(var0);
		class109.method2313(var0);
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "976649995"
	)
	static final void method175(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Decimator.clientPreferences.areaSoundEffectsVolume = var0;
		MilliClock.savePreferences();
	}
}
