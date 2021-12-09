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
		field4160 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;ZIS)V",
		garbageValue = "9766"
	)
	static void method6568(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (DirectByteArrayCopier.clearLoginScreen) { // L: 167
			if (var3 == 4) { // L: 168
				PlayerType.method5521(4); // L: 169
			}

		} else {
			if (var3 == 0) { // L: 173
				class185.method3731(var2); // L: 174
			} else {
				PlayerType.method5521(var3); // L: 177
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 179
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 180
			WorldMapCacheName.leftTitleSprite = MouseRecorder.method2161(var4); // L: 181
			NPC.rightTitleSprite = WorldMapCacheName.leftTitleSprite.mirrorHorizontally(); // L: 182
			int var5 = Client.worldProperties; // L: 183
			if ((var5 & 536870912) != 0) { // L: 185
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 186
			} else if ((var5 & 1073741824) != 0) { // L: 188
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 189
			} else {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 192
			}

			AbstractByteArrayCopier.titleboxSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 195
			class19.titlebuttonSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 196
			Login.field894 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 197
			Login.field864 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 198
			ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 199
			int var7 = var1.getGroupId("runes"); // L: 202
			int var8 = var1.getFileId(var7, ""); // L: 203
			IndexedSprite[] var9;
			if (!class147.method3009(var1, var7, var8)) { // L: 206
				var9 = null; // L: 207
			} else {
				IndexedSprite[] var11 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 212

				for (int var12 = 0; var12 < class440.SpriteBuffer_spriteCount; ++var12) { // L: 213
					IndexedSprite var13 = var11[var12] = new IndexedSprite(); // L: 214
					var13.width = class432.SpriteBuffer_spriteWidth; // L: 215
					var13.height = class432.SpriteBuffer_spriteHeight; // L: 216
					var13.xOffset = class141.SpriteBuffer_xOffsets[var12]; // L: 217
					var13.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var12]; // L: 218
					var13.subWidth = class432.SpriteBuffer_spriteWidths[var12]; // L: 219
					var13.subHeight = class330.SpriteBuffer_spriteHeights[var12]; // L: 220
					var13.palette = class432.SpriteBuffer_spritePalette; // L: 221
					var13.pixels = class369.SpriteBuffer_pixels[var12]; // L: 222
				}

				UserComparator3.method2529(); // L: 224
				var9 = var11; // L: 227
			}

			Login.runesSprite = var9; // L: 231
			var8 = var1.getGroupId("title_mute"); // L: 234
			int var15 = var1.getFileId(var8, ""); // L: 235
			IndexedSprite[] var10;
			if (!class147.method3009(var1, var8, var15)) { // L: 238
				var10 = null; // L: 239
			} else {
				IndexedSprite[] var16 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 244

				for (int var17 = 0; var17 < class440.SpriteBuffer_spriteCount; ++var17) { // L: 245
					IndexedSprite var14 = var16[var17] = new IndexedSprite(); // L: 246
					var14.width = class432.SpriteBuffer_spriteWidth; // L: 247
					var14.height = class432.SpriteBuffer_spriteHeight; // L: 248
					var14.xOffset = class141.SpriteBuffer_xOffsets[var17]; // L: 249
					var14.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var17]; // L: 250
					var14.subWidth = class432.SpriteBuffer_spriteWidths[var17]; // L: 251
					var14.subHeight = class330.SpriteBuffer_spriteHeights[var17]; // L: 252
					var14.palette = class432.SpriteBuffer_spritePalette; // L: 253
					var14.pixels = class369.SpriteBuffer_pixels[var17]; // L: 254
				}

				UserComparator3.method2529(); // L: 256
				var10 = var16; // L: 259
			}

			Login.title_muteSprite = var10; // L: 263
			KeyHandler.options_buttons_0Sprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 264
			UserComparator9.field1336 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 265
			LoginType.options_buttons_2Sprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 266
			Login.field888 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 267
			class315.field3918 = KeyHandler.options_buttons_0Sprite.subWidth; // L: 268
			Huffman.field3152 = KeyHandler.options_buttons_0Sprite.subHeight; // L: 269
			Client.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 270
			if (var2) { // L: 271
				Login.Login_username = ""; // L: 272
				Login.Login_password = ""; // L: 273
			}

			class148.field1651 = 0; // L: 275
			BufferedSource.otp = ""; // L: 276
			Login.field882 = true; // L: 277
			Login.worldSelectOpen = false; // L: 278
			if (!SecureRandomFuture.clientPreferences.titleMusicDisabled) { // L: 279
				Script.method2040(2, WorldMapScaleHandler.archive6, "scape main", "", 255, false);
			} else {
				class260.musicPlayerStatus = 1; // L: 281
				class124.musicTrackArchive = null; // L: 282
				VarcInt.musicTrackGroupId = -1; // L: 283
				class260.musicTrackFileId = -1; // L: 284
				ChatChannel.musicTrackVolume = 0; // L: 285
				DynamicObject.musicTrackBoolean = false; // L: 286
				class260.pcmSampleLength = 2; // L: 287
			}

			ClientPreferences.method2297(false); // L: 289
			DirectByteArrayCopier.clearLoginScreen = true; // L: 290
			Login.xPadding = (class186.canvasWidth - 765) / 2; // L: 291
			Login.loginBoxX = Login.xPadding + 202; // L: 292
			class138.loginBoxCenter = Login.loginBoxX + 180; // L: 293
			WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 294
			NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 295
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 296
		}
	} // L: 171 297
}
