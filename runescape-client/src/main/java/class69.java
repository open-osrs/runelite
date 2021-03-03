import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class69 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[Liv;",
		garbageValue = "-52"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3132, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_normal, PlayerType.PlayerType_ironman}; // L: 20
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;Lig;Lgg;I)Z",
		garbageValue = "1829730902"
	)
	public static boolean method1256(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class206.musicPatchesArchive = var0; // L: 26
		class206.musicSamplesArchive = var1; // L: 27
		class206.soundEffectsArchive = var2; // L: 28
		VertexNormal.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llg;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1852545433"
	)
	static String method1258(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : (String)var3.obj; // L: 35 36
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;ZII)V",
		garbageValue = "463524240"
	)
	static void method1255(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 128
			if (var3 == 4) { // L: 129
				Login.loginIndex = 4; // L: 130
			}

		} else {
			Login.loginIndex = var3; // L: 134
			Rasterizer2D.Rasterizer2D_clear(); // L: 135
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 136
			Login.leftTitleSprite = WorldMapRectangle.convertJpgToSprite(var4); // L: 137
			Login.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 138
			int var5 = Client.worldProperties; // L: 139
			if ((var5 & 536870912) != 0) { // L: 141
				Login.logoSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 142
			} else if ((var5 & 1073741824) != 0) { // L: 144
				Login.logoSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 145
			} else {
				Login.logoSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 148
			}

			GrandExchangeOfferNameComparator.titleboxSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 151
			InterfaceParent.titlebuttonSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 152
			Login.runesSprite = MilliClock.method3664(var1, "runes", ""); // L: 153
			Login.title_muteSprite = MilliClock.method3664(var1, "title_mute", ""); // L: 154
			options_buttons_0Sprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 155
			UrlRequester.field1956 = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 156
			Login.options_buttons_2Sprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 157
			WorldMapDecoration.field237 = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 158
			WorldMapDecoration.field235 = options_buttons_0Sprite.subWidth; // L: 159
			MouseHandler.field512 = options_buttons_0Sprite.subHeight; // L: 160
			class9.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 161
			if (var2) { // L: 162
				Login.Login_username = ""; // L: 163
				Login.Login_password = ""; // L: 164
			}

			Canvas.field439 = 0; // L: 166
			class1.otp = ""; // L: 167
			Login.field1217 = true; // L: 168
			Login.worldSelectOpen = false; // L: 169
			if (!WorldMapSectionType.clientPreferences.titleMusicDisabled) { // L: 170
				Archive var6 = UrlRequester.archive6; // L: 171
				int var7 = var6.getGroupId("scape main"); // L: 173
				int var8 = var6.getFileId(var7, ""); // L: 174
				GrandExchangeOfferOwnWorldComparator.method1376(2, var6, var7, var8, 255, false); // L: 175
			} else {
				class206.musicPlayerStatus = 1; // L: 179
				class206.musicTrackArchive = null; // L: 180
				class206.musicTrackGroupId = -1; // L: 181
				SoundSystem.musicTrackFileId = -1; // L: 182
				DevicePcmPlayerProvider.musicTrackVolume = 0; // L: 183
				class206.musicTrackBoolean = false; // L: 184
				class7.pcmSampleLength = 2; // L: 185
			}

			Actor.method1867(false); // L: 187
			Login.clearLoginScreen = true; // L: 188
			Login.xPadding = (GrandExchangeOfferTotalQuantityComparator.canvasWidth - 765) / 2; // L: 189
			Login.loginBoxX = Login.xPadding + 202; // L: 190
			GraphicsObject.loginBoxCenter = Login.loginBoxX + 180; // L: 191
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 192
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 193
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 194
		}
	} // L: 132 195

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-912600065"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 147
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "57"
	)
	static final int method1259(int var0, int var1) {
		int var2 = WorldMapSectionType.method320(var0 - 1, var1 - 1) + WorldMapSectionType.method320(var0 + 1, var1 - 1) + WorldMapSectionType.method320(var0 - 1, 1 + var1) + WorldMapSectionType.method320(var0 + 1, 1 + var1); // L: 551
		int var3 = WorldMapSectionType.method320(var0 - 1, var1) + WorldMapSectionType.method320(1 + var0, var1) + WorldMapSectionType.method320(var0, var1 - 1) + WorldMapSectionType.method320(var0, var1 + 1); // L: 552
		int var4 = WorldMapSectionType.method320(var0, var1); // L: 553
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 554
	}
}
