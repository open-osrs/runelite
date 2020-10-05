import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("z")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljc;Ljc;B)I",
		garbageValue = "57"
	)
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1); // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((User)var1, (User)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;ZII)V",
		garbageValue = "1091425537"
	)
	static void method6041(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 124
			if (var3 == 4) { // L: 125
				Login.loginIndex = 4; // L: 126
			}

		} else {
			Login.loginIndex = var3; // L: 130
			Rasterizer2D.Rasterizer2D_clear(); // L: 131
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 132
			UserComparator2.leftTitleSprite = MouseHandler.convertJpgToSprite(var4); // L: 133
			Login.rightTitleSprite = UserComparator2.leftTitleSprite.mirrorHorizontally(); // L: 134
			if ((Client.worldProperties & 536870912) != 0) { // L: 135
				AbstractByteArrayCopier.logoSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((Client.worldProperties & 1073741824) != 0) { // L: 136
				AbstractByteArrayCopier.logoSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				AbstractByteArrayCopier.logoSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 137
			}

			class296.titleboxSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 138
			ModelData0.titlebuttonSprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 139
			int var6 = var1.getGroupId("runes"); // L: 142
			int var7 = var1.getFileId(var6, ""); // L: 143
			IndexedSprite[] var5 = UserComparator5.method3515(var1, var6, var7); // L: 144
			GrandExchangeOfferTotalQuantityComparator.runesSprite = var5; // L: 146
			var7 = var1.getGroupId("title_mute"); // L: 149
			int var8 = var1.getFileId(var7, ""); // L: 150
			IndexedSprite[] var10 = UserComparator5.method3515(var1, var7, var8); // L: 151
			ClientPreferences.title_muteSprite = var10; // L: 153
			class227.options_buttons_0Sprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 154
			PlayerType.field3134 = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 155
			MusicPatchNode2.options_buttons_2Sprite = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 156
			Login.field1221 = class234.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 157
			GrandExchangeOfferNameComparator.field114 = class227.options_buttons_0Sprite.subWidth; // L: 158
			ReflectionCheck.field1364 = class227.options_buttons_0Sprite.subHeight; // L: 159
			Varcs.loginScreenRunesAnimation = new LoginScreenAnimation(GrandExchangeOfferTotalQuantityComparator.runesSprite); // L: 160
			if (var2) { // L: 161
				Login.Login_username = ""; // L: 162
				Login.Login_password = ""; // L: 163
			}

			LoginScreenAnimation.field1070 = 0; // L: 165
			WorldMapLabelSize.otp = ""; // L: 166
			Login.field1223 = true; // L: 167
			Login.worldSelectOpen = false; // L: 168
			if (!Tile.clientPreferences.titleMusicDisabled) { // L: 169
				Archive var11 = CollisionMap.archive6; // L: 170
				var8 = var11.getGroupId("scape main"); // L: 172
				int var9 = var11.getFileId(var8, ""); // L: 173
				class206.musicPlayerStatus = 1; // L: 175
				class204.musicTrackArchive = var11; // L: 176
				BuddyRankComparator.musicTrackGroupId = var8; // L: 177
				class206.musicTrackFileId = var9; // L: 178
				Tiles.musicTrackVolume = 255; // L: 179
				class206.musicTrackBoolean = false; // L: 180
				FaceNormal.pcmSampleLength = 2; // L: 181
			} else {
				class58.method915(2); // L: 185
			}

			if (NetCache.NetCache_socket != null) { // L: 187
				try {
					Buffer var15 = new Buffer(4); // L: 189
					var15.writeByte(3); // L: 190
					var15.writeMedium(0); // L: 191
					NetCache.NetCache_socket.write(var15.array, 0, 4); // L: 192
				} catch (IOException var14) {
					try {
						NetCache.NetCache_socket.close(); // L: 196
					} catch (Exception var13) { // L: 198
					}

					++NetCache.NetCache_ioExceptions; // L: 199
					NetCache.NetCache_socket = null; // L: 200
				}
			}

			Login.clearLoginScreen = true; // L: 203
			Login.xPadding = (FloorDecoration.canvasWidth - 765) / 2; // L: 204
			Login.loginBoxX = Login.xPadding + 202; // L: 205
			IsaacCipher.loginBoxCenter = Login.loginBoxX + 180; // L: 206
			UserComparator2.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 207
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 208
			AbstractByteArrayCopier.logoSprite.drawAt(Login.xPadding + 382 - AbstractByteArrayCopier.logoSprite.subWidth / 2, 18); // L: 209
		}
	} // L: 128 210

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-660550270"
	)
	static final void method6040() {
		int var0 = ChatChannel.menuX; // L: 7018
		int var1 = Client.menuY; // L: 7019
		int var2 = DevicePcmPlayerProvider.menuWidth; // L: 7020
		int var3 = WorldMapManager.menuHeight; // L: 7021
		int var4 = 6116423; // L: 7022
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 7023
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 7024
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 7025
		class4.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 7026
		int var5 = MouseHandler.MouseHandler_x; // L: 7027
		int var6 = MouseHandler.MouseHandler_y; // L: 7028

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 7029
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 7030
			int var9 = 16777215; // L: 7031
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 7032
				var9 = 16776960;
			}

			Font var10 = class4.fontBold12; // L: 7033
			String var11;
			if (var7 < 0) { // L: 7036
				var11 = ""; // L: 7037
			} else if (Client.menuTargets[var7].length() > 0) { // L: 7040
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7]; // L: 7041
			}

			var10.draw(var11, var0 + 3, var8, var9, 0); // L: 7043
		}

		HealthBarUpdate.method1817(ChatChannel.menuX, Client.menuY, DevicePcmPlayerProvider.menuWidth, WorldMapManager.menuHeight); // L: 7045
	} // L: 7046
}
