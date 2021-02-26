import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("b")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("n")
	@Export("text")
	String text;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1144128527
	)
	@Export("width")
	int width;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -467317487
	)
	@Export("height")
	int height;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILay;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-293834504"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method499() {
		if (Login.clearLoginScreen) { // L: 215
			GrandExchangeOfferNameComparator.titleboxSprite = null; // L: 216
			InterfaceParent.titlebuttonSprite = null; // L: 217
			Login.runesSprite = null; // L: 218
			Login.leftTitleSprite = null; // L: 219
			Login.rightTitleSprite = null; // L: 220
			Login.logoSprite = null; // L: 221
			Login.title_muteSprite = null; // L: 222
			class69.options_buttons_0Sprite = null; // L: 223
			Login.options_buttons_2Sprite = null; // L: 224
			WorldMapID.worldSelectBackSprites = null; // L: 225
			WorldMapManager.worldSelectFlagSprites = null; // L: 226
			DevicePcmPlayerProvider.worldSelectArrows = null; // L: 227
			Occluder.worldSelectStars = null; // L: 228
			World.field1039 = null; // L: 229
			class9.loginScreenRunesAnimation.method1926(); // L: 230
			class206.musicPlayerStatus = 1; // L: 232
			class206.musicTrackArchive = null; // L: 233
			class206.musicTrackGroupId = -1; // L: 234
			SoundSystem.musicTrackFileId = -1; // L: 235
			DevicePcmPlayerProvider.musicTrackVolume = 0; // L: 236
			class206.musicTrackBoolean = false; // L: 237
			class7.pcmSampleLength = 2; // L: 238
			Actor.method1867(true); // L: 240
			Login.clearLoginScreen = false; // L: 241
		}
	} // L: 242

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2132008086"
	)
	static void method501(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "25470"
	)
	static final void method502() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3296
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3297
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3298
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3310
				if (var1 == null) { // L: 3311
					Object var10000 = null; // L: 3312
					var1 = SoundEffect.readSoundEffect(WorldMapCacheName.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3313
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3314
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3315
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3321
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3323
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3324
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3325
						int var5 = var4 * 128 + 64 - UserComparator9.localPlayer.x; // L: 3326
						if (var5 < 0) { // L: 3327
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3328
						int var7 = var6 * 128 + 64 - UserComparator9.localPlayer.y; // L: 3329
						if (var7 < 0) { // L: 3330
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3331
						if (var8 > var3) { // L: 3332
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3333
							continue; // L: 3334
						}

						if (var8 < 0) { // L: 3336
							var8 = 0;
						}

						var2 = (var3 - var8) * WorldMapSectionType.clientPreferences.areaSoundEffectsVolume / var3; // L: 3337
					} else {
						var2 = WorldMapSectionType.clientPreferences.soundEffectsVolume; // L: 3339
					}

					if (var2 > 0) { // L: 3340
						RawSound var9 = var1.toRawSound().resample(World.decimator); // L: 3341
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3342
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3343
						VarbitComposition.pcmStreamMixer.addSubStream(var10); // L: 3344
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3346
				}
			} else {
				--Client.soundEffectCount; // L: 3299

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3300
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3301
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3302
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3303
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3304
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3305
				}

				--var0; // L: 3307
			}
		}

		if (Client.field899 && !class4.method56()) { // L: 3349
			if (WorldMapSectionType.clientPreferences.musicVolume != 0 && Client.currentTrackGroupId != -1) { // L: 3350
				ReflectionCheck.method2450(UrlRequester.archive6, Client.currentTrackGroupId, 0, WorldMapSectionType.clientPreferences.musicVolume, false);
			}

			Client.field899 = false; // L: 3351
		}

	} // L: 3353

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "42"
	)
	static String method504(int var0) {
		if (var0 < 0) { // L: 9040
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9041 9042
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1224588099"
	)
	static boolean method503(int var0) {
		for (int var1 = 0; var1 < Client.field885; ++var1) { // L: 10833
			if (Client.field738[var1] == var0) { // L: 10834
				return true;
			}
		}

		return false; // L: 10836
	}
}
