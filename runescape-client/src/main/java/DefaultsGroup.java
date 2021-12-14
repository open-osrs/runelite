import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	static final DefaultsGroup field4160;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1835522207
	)
	@Export("group")
	final int group;

	static {
		field4160 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;ZIS)V",
		garbageValue = "9766"
	)
	static void method6568(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (DirectByteArrayCopier.clearLoginScreen) {
			if (var3 == 4) {
				PlayerType.method5521(4);
			}

		} else {
			if (var3 == 0) {
				class185.method3731(var2);
			} else {
				PlayerType.method5521(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			WorldMapCacheName.leftTitleSprite = MouseRecorder.method2161(var4);
			NPC.rightTitleSprite = WorldMapCacheName.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			AbstractByteArrayCopier.titleboxSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class19.titlebuttonSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field894 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field864 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			int var7 = var1.getGroupId("runes");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var9;
			if (!class147.method3009(var1, var7, var8)) {
				var9 = null;
			} else {
				IndexedSprite[] var11 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

				for (int var12 = 0; var12 < class440.SpriteBuffer_spriteCount; ++var12) {
					IndexedSprite var13 = var11[var12] = new IndexedSprite();
					var13.width = class432.SpriteBuffer_spriteWidth;
					var13.height = class432.SpriteBuffer_spriteHeight;
					var13.xOffset = class141.SpriteBuffer_xOffsets[var12];
					var13.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var12];
					var13.subWidth = class432.SpriteBuffer_spriteWidths[var12];
					var13.subHeight = class330.SpriteBuffer_spriteHeights[var12];
					var13.palette = class432.SpriteBuffer_spritePalette;
					var13.pixels = class369.SpriteBuffer_pixels[var12];
				}

				UserComparator3.method2529();
				var9 = var11;
			}

			Login.runesSprite = var9;
			var8 = var1.getGroupId("title_mute");
			int var15 = var1.getFileId(var8, "");
			IndexedSprite[] var10;
			if (!class147.method3009(var1, var8, var15)) {
				var10 = null;
			} else {
				IndexedSprite[] var16 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

				for (int var17 = 0; var17 < class440.SpriteBuffer_spriteCount; ++var17) {
					IndexedSprite var14 = var16[var17] = new IndexedSprite();
					var14.width = class432.SpriteBuffer_spriteWidth;
					var14.height = class432.SpriteBuffer_spriteHeight;
					var14.xOffset = class141.SpriteBuffer_xOffsets[var17];
					var14.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var17];
					var14.subWidth = class432.SpriteBuffer_spriteWidths[var17];
					var14.subHeight = class330.SpriteBuffer_spriteHeights[var17];
					var14.palette = class432.SpriteBuffer_spritePalette;
					var14.pixels = class369.SpriteBuffer_pixels[var17];
				}

				UserComparator3.method2529();
				var10 = var16;
			}

			Login.title_muteSprite = var10;
			KeyHandler.options_buttons_0Sprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			UserComparator9.field1336 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			LoginType.options_buttons_2Sprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			Login.field888 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class315.field3918 = KeyHandler.options_buttons_0Sprite.subWidth;
			Huffman.field3152 = KeyHandler.options_buttons_0Sprite.subHeight;
			Client.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			class148.field1651 = 0;
			BufferedSource.otp = "";
			Login.field882 = true;
			Login.worldSelectOpen = false;
			if (!SecureRandomFuture.clientPreferences.titleMusicDisabled) {
				Script.method2040(2, WorldMapScaleHandler.archive6, "scape main", "", 255, false);
			} else {
				class260.musicPlayerStatus = 1;
				class124.musicTrackArchive = null;
				VarcInt.musicTrackGroupId = -1;
				class260.musicTrackFileId = -1;
				ChatChannel.musicTrackVolume = 0;
				DynamicObject.musicTrackBoolean = false;
				class260.pcmSampleLength = 2;
			}

			ClientPreferences.method2297(false);
			DirectByteArrayCopier.clearLoginScreen = true;
			Login.xPadding = (class186.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class138.loginBoxCenter = Login.loginBoxX + 180;
			WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0);
			NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}
}
